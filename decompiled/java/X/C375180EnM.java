package X;

/* JADX INFO: renamed from: X.0EnM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C375180EnM {
    public final float LIZ;
    public final float LIZIZ;
    public final float LIZJ;
    public final float LIZLLL;
    public final float LJ;
    public final C375240EnS LJFF;
    public C375230EnR LJI;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MaterialRect(width=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", height=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", centerX=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", centerY=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", rotate=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", shortcutsConfig=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", fixRect=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C375180EnM(float f, float f2, float f3, float f4, float f5, C375240EnS c375240EnS, C375230EnR c375230EnR) {
        this.LIZ = f;
        this.LIZIZ = f2;
        this.LIZJ = f3;
        this.LIZLLL = f4;
        this.LJ = f5;
        this.LJFF = c375240EnS;
        this.LJI = c375230EnR;
    }

    public static C375180EnM LIZ(C375180EnM c375180EnM, float f, float f2, float f3, float f4, float f5, int i) {
        C375240EnS c375240EnS;
        float f6 = f5;
        float f7 = f4;
        float f8 = f3;
        float f9 = f2;
        float f10 = f;
        if ((i & 1) != 0) {
            f10 = c375180EnM.LIZ;
        }
        if ((i & 2) != 0) {
            f9 = c375180EnM.LIZIZ;
        }
        if ((i & 4) != 0) {
            f8 = c375180EnM.LIZJ;
        }
        if ((i & 8) != 0) {
            f7 = c375180EnM.LIZLLL;
        }
        if ((i & 16) != 0) {
            f6 = c375180EnM.LJ;
        }
        C375230EnR c375230EnR = null;
        if ((i & 32) != 0) {
            c375240EnS = c375180EnM.LJFF;
        } else {
            c375240EnS = null;
        }
        if ((i & 64) != 0) {
            c375230EnR = c375180EnM.LJI;
        }
        return new C375180EnM(f10, f9, f8, f7, f6, c375240EnS, c375230EnR);
    }
}
