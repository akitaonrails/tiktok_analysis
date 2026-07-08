package X;

import com.bytedance.speech.speechengine.SpeechEngineDefines;

/* JADX INFO: renamed from: X.09Yq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2391409Yq {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public final String LJFF;
    public final String LJI;
    public InterfaceC2391809Yu LJII;
    public final String LJIIIIZZ;
    public final String LJIIIZ;
    public final boolean LJIIJ;

    public C2391409Yq(String str, String str2, String str3, String str4, String str5, String str6, String str7, InterfaceC2391809Yu interfaceC2391809Yu, String str8, String str9, boolean z, int i) {
        str = (i & 1) != 0 ? "" : str;
        str2 = (i & 2) != 0 ? "" : str2;
        str3 = (i & 4) != 0 ? "" : str3;
        str4 = (i & 8) != 0 ? "" : str4;
        str5 = (i & 16) != 0 ? "" : str5;
        str6 = (i & 32) != 0 ? "" : str6;
        str7 = (i & 64) != 0 ? "" : str7;
        interfaceC2391809Yu = (i & 128) != 0 ? null : interfaceC2391809Yu;
        str9 = (i & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0 ? "" : str9;
        z = (i & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0 ? false : z;
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
        this.LIZLLL = str4;
        this.LJ = str5;
        this.LJFF = str6;
        this.LJI = str7;
        this.LJII = interfaceC2391809Yu;
        this.LJIIIIZZ = str8;
        this.LJIIIZ = str9;
        this.LJIIJ = z;
    }
}
