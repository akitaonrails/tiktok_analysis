package X;

import com.bytedance.speech.speechengine.SpeechEngineDefines;

/* JADX INFO: renamed from: X.06Ne, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1597206Ne {
    public static final C054G LIZ = C2296808zG.LIZ(C0PEM.LIZJ.plus(C2296908zH.LIZ()));

    public static void LIZ(String str, EnumC905990ZgT enumC905990ZgT, long j, long j2, int i, int i2, long j3, String str2, String str3, Integer num, String str4, Integer num2, int i3) {
        InterfaceC1493505sz interfaceC1493505szLIZIZ;
        if ((i3 & 256) != 0) {
            str3 = null;
        }
        if ((i3 & 512) != 0) {
            num = null;
        }
        if ((i3 & 1024) != 0) {
            str4 = null;
        }
        if ((i3 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            num2 = null;
        }
        if ((i3 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0) {
            interfaceC1493505szLIZIZ = C0I0B.LJFF.LIZIZ();
        } else {
            interfaceC1493505szLIZIZ = null;
        }
        C23250099c.LIZLLL(LIZ, null, null, new C1597106Nd(interfaceC1493505szLIZIZ, str, enumC905990ZgT, j, j2, i, i2, j3, str2, str3, num, str4, num2, null), 3);
    }
}
