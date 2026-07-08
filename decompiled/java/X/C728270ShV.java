package X;

import Y.ARunnableS80S0200000_11;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.keva.Keva;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ShV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C728270ShV implements InterfaceC694390RLp {
    public static final C728270ShV LIZ = new C728270ShV();
    public static boolean LIZIZ;
    public static C0P0T LIZJ;

    @Override // X.InterfaceC694390RLp
    public final void LIZ() {
        Keva keva = C728290ShX.LIZ;
        C728290ShX.LIZ.storeInt("tooltip_displayed_count", 3);
    }

    @Override // X.InterfaceC694390RLp
    public final void LIZJ() {
        C0P0T c0p0t = LIZJ;
        if (c0p0t != null) {
            c0p0t.dismiss();
        }
    }

    @Override // X.InterfaceC694390RLp
    public final void LIZIZ(Aweme aweme, TuxIconView tuxIconView, String str) {
        if (tuxIconView != null && tuxIconView.getVisibility() != 8 && C737430SwH.LIZ.LJI(aweme)) {
            C449260HjY.LIZ.getClass();
            Keva keva = C449260HjY.LIZIZ;
            if (keva.contains(C449260HjY.LIZ()) && !keva.getBoolean(C449260HjY.LIZ(), false) && !Intrinsics.LJFF(str, "STORY_ENTRANCE_HIGHLIGHTS")) {
                Keva keva2 = C728290ShX.LIZ;
                if (keva2.getInt("tooltip_displayed_count", 0) < 3 && (System.currentTimeMillis() / ((long) LSPassThroughRecordSizeConfig.DEFAULT)) - keva2.getLong("tooltip_displayed_timestamp", 0L) > 86400) {
                    HandlerHook.viewPost(tuxIconView, new ARunnableS80S0200000_11(tuxIconView, aweme, 54));
                    return;
                }
                return;
            }
        }
        LIZJ();
    }
}
