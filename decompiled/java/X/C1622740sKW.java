package X;

import com.bytedance.bpea.basics.Cert;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0sKW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1622740sKW {
    public static final Cert LIZ(AbstractC1622690sKR abstractC1622690sKR) {
        if (Intrinsics.LJFF(abstractC1622690sKR, C1622530sKB.LIZ)) {
            C1DI4 c1di4 = C1DI4.LIZ;
            return C1DI6.LIZ.LIZIZ(C1DI5.STOP_AUDIO_USING_SOUND_EFFECT, EnumC1641610sox.USER_OPERATION);
        }
        if (Intrinsics.LJFF(abstractC1622690sKR, C1622720sKU.LIZ)) {
            C1DI4 c1di42 = C1DI4.LIZ;
            return C1DI6.LIZ.LIZIZ(C1DI5.STOP_AUDIO_CANCEL_SOUND_EFFECT, EnumC1641610sox.USER_OPERATION);
        }
        if (Intrinsics.LJFF(abstractC1622690sKR, C1622760sKY.LIZ)) {
            C1DI4 c1di43 = C1DI4.LIZ;
            return C1DI6.LIZ.LIZIZ(C1DI5.STOP_AUDIO_SOUND_EFFECT_STOP, EnumC1641610sox.PAGE_INVISIBLE);
        }
        if (Intrinsics.LJFF(abstractC1622690sKR, C1622780sKa.LIZ)) {
            C1DI4 c1di44 = C1DI4.LIZ;
            return C1DI6.LIZ.LIZ(C1DI7.AUDIO_START_RECORD_USE_EFFECT, null);
        }
        if (Intrinsics.LJFF(abstractC1622690sKR, C1622550sKD.LIZ)) {
            return C1DPV.LIZIZ.LIZIZ(C1DPW.AUDIO_START_SWITCH_TO_VOICE_TAB, null);
        }
        if (Intrinsics.LJFF(abstractC1622690sKR, C1622540sKC.LIZ)) {
            return C1DPV.LIZIZ.LIZJ(C1DPX.STOP_AUDIO_SWITCH_TO_NO_VOICE_TAB, EnumC1641610sox.USER_OPERATION);
        }
        if (!(abstractC1622690sKR instanceof C1622730sKV)) {
            return null;
        }
        return ((C1622730sKV) abstractC1622690sKR).LIZ;
    }
}
