package X;

import com.bytedance.speech.speechengine.SpeechEngineDefines;

/* JADX INFO: renamed from: X.0Pl8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C654080Pl8 {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final EnumC654060Pl6 LIZLLL;
    public final int LJ;
    public final int LJFF;
    public final String LJI;
    public final Integer LJII;
    public final Integer LJIIIIZZ;
    public final String LJIIIZ;
    public final Integer LJIIJ;
    public final Integer LJIIJJI;

    public /* synthetic */ C654080Pl8(String str, String str2, String str3, EnumC654060Pl6 enumC654060Pl6, int i, int i2, String str4) {
        this(str, str2, str3, enumC654060Pl6, i, i2, str4, null, null, null, null, null);
    }

    public static C654080Pl8 LIZ(C654080Pl8 c654080Pl8, Integer num, Integer num2, String str, Integer num3, Integer num4, int i) {
        String str2;
        String str3;
        String str4;
        EnumC654060Pl6 enumC654060Pl6;
        int i2;
        int i3;
        Integer num5 = num4;
        Integer num6 = num3;
        String str5 = str;
        Integer num7 = num2;
        Integer num8 = num;
        String str6 = null;
        if ((i & 1) != 0) {
            str2 = c654080Pl8.LIZ;
        } else {
            str2 = null;
        }
        if ((i & 2) != 0) {
            str3 = c654080Pl8.LIZIZ;
        } else {
            str3 = null;
        }
        if ((i & 4) != 0) {
            str4 = c654080Pl8.LIZJ;
        } else {
            str4 = null;
        }
        if ((i & 8) != 0) {
            enumC654060Pl6 = c654080Pl8.LIZLLL;
        } else {
            enumC654060Pl6 = null;
        }
        if ((i & 16) != 0) {
            i2 = c654080Pl8.LJ;
        } else {
            i2 = 0;
        }
        if ((i & 32) != 0) {
            i3 = c654080Pl8.LJFF;
        } else {
            i3 = 0;
        }
        if ((i & 64) != 0) {
            str6 = c654080Pl8.LJI;
        }
        if ((i & 128) != 0) {
            num8 = c654080Pl8.LJII;
        }
        if ((i & 256) != 0) {
            num7 = c654080Pl8.LJIIIIZZ;
        }
        if ((i & 512) != 0) {
            str5 = c654080Pl8.LJIIIZ;
        }
        if ((i & 1024) != 0) {
            num6 = c654080Pl8.LJIIJ;
        }
        if ((i & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            num5 = c654080Pl8.LJIIJJI;
        }
        return new C654080Pl8(str2, str3, str4, enumC654060Pl6, i2, i3, str6, num8, num7, str5, num6, num5);
    }

    public C654080Pl8(String str, String str2, String str3, EnumC654060Pl6 enumC654060Pl6, int i, int i2, String str4, Integer num, Integer num2, String str5, Integer num3, Integer num4) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
        this.LIZLLL = enumC654060Pl6;
        this.LJ = i;
        this.LJFF = i2;
        this.LJI = str4;
        this.LJII = num;
        this.LJIIIIZZ = num2;
        this.LJIIIZ = str5;
        this.LJIIJ = num3;
        this.LJIIJJI = num4;
    }
}
