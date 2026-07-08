package X;

import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackType;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0DpF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C350870DpF {
    public static final NLETrack LIZLLL(NLEModel nLEModel) {
        for (NLETrack nLETrack : nLEModel.getTracks()) {
            if (nLETrack.hasMainTrack()) {
                return nLETrack;
            }
        }
        return null;
    }

    public static final long LJ(C0E48 c0e48) {
        return c0e48.getPlayer().Jh();
    }

    public static final NLEEditor LJFF(C0E48 c0e48) {
        return c0e48.LLFII().LJI();
    }

    public static final NLEModel LJI(C0E48 c0e48) {
        NLEModel nLEModelLLZ = c0e48.LLFII().LLZ();
        if (!Intrinsics.LJFF("true", nLEModelLLZ.getExtra("DisableGlobalEffect"))) {
            nLEModelLLZ.setExtra("DisableGlobalEffect", "true");
        }
        return nLEModelLLZ;
    }

    public static final long LJII(C0E48 c0e48) {
        return c0e48.LLFII().LLZ().getMaxTargetEnd() / ((long) LSPassThroughRecordSizeConfig.DEFAULT);
    }

    public static final NLETrackType LJIIIIZZ(NLETrack nLETrack) {
        if (nLETrack == null) {
            return NLETrackType.NONE;
        }
        NLETrackType trackType = nLETrack.getTrackType();
        NLETrackType extraTrackType = nLETrack.getExtraTrackType();
        NLETrackType nLETrackType = NLETrackType.NONE;
        if (trackType != nLETrackType && trackType != NLETrackType.FILTER) {
            return trackType;
        }
        if (extraTrackType != nLETrackType) {
            return extraTrackType;
        }
        return nLETrackType;
    }

    public static final void LIZ(C0E48 c0e48, boolean z) {
        if (z) {
            c0e48.getPlayer().skipNextSeek(true);
        }
        c0e48.LLFII().LJI().commit();
        if (z) {
            c0e48.getPlayer().skipNextSeek(false);
        }
    }

    public static final void LIZIZ(C0E48 c0e48, boolean z) {
        C350410DoV.LIZ(c0e48.LLFII().LJI(), true, z);
    }

    public static final void LIZJ(C0E48 c0e48, String str) {
        C350410DoV.LIZLLL(c0e48.LLFII().LJI(), true, str, false, true);
    }

    @InterfaceC1294060jmO
    public static final <T> void LJIIIZ(C0E48 c0e48, String str, T t) {
        c0e48.S7().LIZIZ(t, str, false);
    }

    @InterfaceC1294060jmO
    public static final void LJIIJ(C0E48 c0e48, String str, Object obj) {
        c0e48.S7().LIZIZ(obj, str, true);
    }
}
