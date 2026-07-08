package X;

import com.bytedance.speech.speechengine.SpeechEngineDefines;

/* JADX INFO: renamed from: X.0Huu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C456300Huu {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(EnumC2172611A1b enumC2172611A1b, EnumC913000Zrm enumC913000Zrm, C0ZH1 c0zh1, C0S2U c0s2u, EnumC913010Zrn enumC913010Zrn, C0S2R c0s2r, EnumC456520HvG enumC456520HvG, String str) {
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZ), null, null, new C2172641A1e(C0I0B.LJFF.LIZIZ(), enumC2172611A1b, enumC913000Zrm, c0zh1, enumC456520HvG, c0s2u, enumC913010Zrn, c0s2r, str, null), 3);
    }

    public static void LIZIZ(EnumC2172611A1b enumC2172611A1b, EnumC913000Zrm enumC913000Zrm, C0ZH1 c0zh1, C0S2U c0s2u, EnumC913010Zrn enumC913010Zrn, C0S2R c0s2r, Integer num, EnumC456270Hur enumC456270Hur, EnumC456270Hur enumC456270Hur2, EnumC456270Hur enumC456270Hur3, String str, boolean z, int i) {
        InterfaceC1493505sz interfaceC1493505szLIZIZ;
        boolean z2 = z;
        String str2 = str;
        if ((i & 1024) != 0) {
            str2 = "";
        }
        if ((i & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            z2 = false;
        }
        if ((i & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0) {
            interfaceC1493505szLIZIZ = C0I0B.LJFF.LIZIZ();
        } else {
            interfaceC1493505szLIZIZ = null;
        }
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZ), null, null, new C2172651A1f(interfaceC1493505szLIZIZ, enumC2172611A1b, enumC913000Zrm, c0zh1, enumC456270Hur, enumC456270Hur2, enumC456270Hur3, c0s2u, enumC913010Zrn, c0s2r, str2, num, z2, null), 3);
    }
}
