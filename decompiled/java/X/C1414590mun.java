package X;

import com.bytedance.speech.speechengine.SpeechEngineDefines;

/* JADX INFO: renamed from: X.0mun, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1414590mun {
    public final String LIZ;
    public final String LIZIZ;
    public final long LIZJ;
    public final int LIZLLL;
    public final boolean LJ;
    public final boolean LJFF;
    public final Long LJI;
    public final Long LJII;
    public final boolean LJIIIIZZ;
    public final Long LJIIIZ;
    public final Long LJIIJ;
    public final EnumC1412690mrj LJIIJJI;

    public static C1414590mun LIZ(C1414590mun c1414590mun, boolean z, Long l, Long l2, boolean z2, Long l3, Long l4, EnumC1412690mrj enumC1412690mrj, int i) {
        String str;
        long j;
        int i2;
        boolean z3;
        EnumC1412690mrj enumC1412690mrj2 = enumC1412690mrj;
        Long l5 = l4;
        Long l6 = l3;
        boolean z4 = z2;
        Long l7 = l2;
        Long l8 = l;
        boolean z5 = z;
        String str2 = null;
        if ((i & 1) != 0) {
            str = c1414590mun.LIZ;
        } else {
            str = null;
        }
        if ((i & 2) != 0) {
            str2 = c1414590mun.LIZIZ;
        }
        if ((i & 4) != 0) {
            j = c1414590mun.LIZJ;
        } else {
            j = 0;
        }
        if ((i & 8) != 0) {
            i2 = c1414590mun.LIZLLL;
        } else {
            i2 = 0;
        }
        if ((i & 16) != 0) {
            z3 = c1414590mun.LJ;
        } else {
            z3 = false;
        }
        if ((i & 32) != 0) {
            z5 = c1414590mun.LJFF;
        }
        if ((i & 64) != 0) {
            l8 = c1414590mun.LJI;
        }
        if ((i & 128) != 0) {
            l7 = c1414590mun.LJII;
        }
        if ((i & 256) != 0) {
            z4 = c1414590mun.LJIIIIZZ;
        }
        if ((i & 512) != 0) {
            l6 = c1414590mun.LJIIIZ;
        }
        if ((i & 1024) != 0) {
            l5 = c1414590mun.LJIIJ;
        }
        if ((i & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            enumC1412690mrj2 = c1414590mun.LJIIJJI;
        }
        return new C1414590mun(str, str2, j, i2, z3, z5, l8, l7, z4, l6, l5, enumC1412690mrj2);
    }

    public C1414590mun(String str, String str2, long j, int i, boolean z, boolean z2, Long l, Long l2, boolean z3, Long l3, Long l4, EnumC1412690mrj enumC1412690mrj) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = j;
        this.LIZLLL = i;
        this.LJ = z;
        this.LJFF = z2;
        this.LJI = l;
        this.LJII = l2;
        this.LJIIIIZZ = z3;
        this.LJIIIZ = l3;
        this.LJIIJ = l4;
        this.LJIIJJI = enumC1412690mrj;
    }
}
