package X;

import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLESegmentEffect;
import com.bytedance.ies.nle.editor_jni.NLEStyCanvas;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0DlB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C348350DlB {
    public static final String LIZ(NLETrack nLETrack) {
        Object c098200Yq;
        Object obj = null;
        if (!nLETrack.hasExtra("AudioTrackType")) {
            return null;
        }
        try {
            c098200Yq = nLETrack.getExtra("AudioTrackType");
            if (c098200Yq == null) {
                c098200Yq = null;
            }
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (!C189200o6.m7isFailureimpl(c098200Yq)) {
            obj = c098200Yq;
        }
        return (String) obj;
    }

    public static final String LIZIZ(NLETrackSlot nLETrackSlot) {
        Object c098200Yq;
        Object obj = null;
        if (!nLETrackSlot.hasExtra("AudioTrackType")) {
            return null;
        }
        try {
            c098200Yq = nLETrackSlot.getExtra("AudioTrackType");
            if (c098200Yq == null) {
                c098200Yq = null;
            }
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (!C189200o6.m7isFailureimpl(c098200Yq)) {
            obj = c098200Yq;
        }
        return (String) obj;
    }

    public static final String LIZJ(NLETrackSlot nLETrackSlot) {
        Object c098200Yq;
        Object obj = null;
        if (!nLETrackSlot.hasExtra("d_bgmId")) {
            return null;
        }
        try {
            c098200Yq = nLETrackSlot.getExtra("d_bgmId");
            if (c098200Yq == null) {
                c098200Yq = null;
            }
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (!C189200o6.m7isFailureimpl(c098200Yq)) {
            obj = c098200Yq;
        }
        return (String) obj;
    }

    public static final String LIZLLL(NLETrack nLETrack) {
        Object c098200Yq;
        Object obj = null;
        if (!nLETrack.hasExtra("business")) {
            return null;
        }
        try {
            c098200Yq = nLETrack.getExtra("business");
            if (c098200Yq == null) {
                c098200Yq = null;
            }
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (!C189200o6.m7isFailureimpl(c098200Yq)) {
            obj = c098200Yq;
        }
        return (String) obj;
    }

    public static final Integer LJ(NLEModel nLEModel) {
        Object c098200Yq;
        Object obj = null;
        if (!nLEModel.hasExtra("Canvas_Width")) {
            return null;
        }
        try {
            String extra = nLEModel.getExtra("Canvas_Width");
            if (extra != null) {
                c098200Yq = Integer.valueOf(CastIntegerProtector.parseInt(extra));
            } else {
                c098200Yq = null;
            }
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (!C189200o6.m7isFailureimpl(c098200Yq)) {
            obj = c098200Yq;
        }
        return (Integer) obj;
    }

    public static final String LJFF(NLESegmentEffect nLESegmentEffect) {
        Object c098200Yq;
        Object obj = null;
        if (!nLESegmentEffect.hasExtra("nleExtraEffectCategory")) {
            return null;
        }
        try {
            c098200Yq = nLESegmentEffect.getExtra("nleExtraEffectCategory");
            if (c098200Yq == null) {
                c098200Yq = null;
            }
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (!C189200o6.m7isFailureimpl(c098200Yq)) {
            obj = c098200Yq;
        }
        return (String) obj;
    }

    public static final String LJI(NLETrack nLETrack) {
        Object c098200Yq;
        Object obj = null;
        if (!nLETrack.hasExtra("EffectTrackType")) {
            return null;
        }
        try {
            c098200Yq = nLETrack.getExtra("EffectTrackType");
            if (c098200Yq == null) {
                c098200Yq = null;
            }
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (!C189200o6.m7isFailureimpl(c098200Yq)) {
            obj = c098200Yq;
        }
        return (String) obj;
    }

    public static final String LJII(NLETrack nLETrack) {
        Object c098200Yq;
        Object obj = null;
        if (!nLETrack.hasExtra("FilterTrackType")) {
            return null;
        }
        try {
            c098200Yq = nLETrack.getExtra("FilterTrackType");
            if (c098200Yq == null) {
                c098200Yq = null;
            }
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (!C189200o6.m7isFailureimpl(c098200Yq)) {
            obj = c098200Yq;
        }
        return (String) obj;
    }

    public static final String LJIIIIZZ(NLETrack nLETrack) {
        Object c098200Yq;
        Object obj = null;
        if (!nLETrack.hasExtra("RewindTrackType")) {
            return null;
        }
        try {
            c098200Yq = nLETrack.getExtra("RewindTrackType");
            if (c098200Yq == null) {
                c098200Yq = null;
            }
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (!C189200o6.m7isFailureimpl(c098200Yq)) {
            obj = c098200Yq;
        }
        return (String) obj;
    }

    public static final String LJIIIZ(NLETrackSlot nLETrackSlot) {
        Object c098200Yq;
        Object obj = null;
        if (!nLETrackSlot.hasExtra("d_stickerId")) {
            return null;
        }
        try {
            c098200Yq = nLETrackSlot.getExtra("d_stickerId");
            if (c098200Yq == null) {
                c098200Yq = null;
            }
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (!C189200o6.m7isFailureimpl(c098200Yq)) {
            obj = c098200Yq;
        }
        return (String) obj;
    }

    public static final String LJIIJ(NLETrack nLETrack) {
        Object c098200Yq;
        Object obj = null;
        if (!nLETrack.hasExtra("StickerTrackType")) {
            return null;
        }
        try {
            c098200Yq = nLETrack.getExtra("StickerTrackType");
            if (c098200Yq == null) {
                c098200Yq = null;
            }
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (!C189200o6.m7isFailureimpl(c098200Yq)) {
            obj = c098200Yq;
        }
        return (String) obj;
    }

    public static final void LJIIL(NLETrackSlot nLETrackSlot) {
        nLETrackSlot.setExtra("canvas_type", String.valueOf(true));
    }

    public static final void LJIIJJI(NLEModel nLEModel, int i) {
        nLEModel.setExtra("Canvas_Width", String.valueOf(i));
    }

    public static final void LJIILIIL(NLEStyCanvas nLEStyCanvas, boolean z) {
        nLEStyCanvas.setExtra("IS_SCENE_CANVAS_DMT", String.valueOf(z));
    }
}
