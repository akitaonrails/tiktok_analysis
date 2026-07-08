package X;

/* JADX INFO: renamed from: X.1Cxj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2247371Cxj {
    public static void LIZIZ(C2247381Cxk c2247381Cxk) {
        float f = c2247381Cxk.LIZ - 0.5f;
        float f2 = c2247381Cxk.LIZIZ - 0.5f;
        float f3 = c2247381Cxk.LIZJ - 0.5f;
        float f4 = c2247381Cxk.LIZLLL - 0.5f;
        c2247381Cxk.LIZ = f * 2.0f;
        c2247381Cxk.LIZJ = f3 * 2.0f;
        c2247381Cxk.LIZIZ = -(f2 * 2.0f);
        c2247381Cxk.LIZLLL = -(f4 * 2.0f);
    }

    public static void LIZ(C2247381Cxk c2247381Cxk, C2247401Cxm c2247401Cxm) {
        float f = c2247401Cxm.LIZ;
        if (f != 0.0f && c2247401Cxm.LIZIZ != 0.0f && c2247401Cxm.LIZJ != 0.0f && c2247401Cxm.LIZLLL != 0.0f) {
            return;
        }
        float f2 = 1.0f - (f + c2247401Cxm.LIZJ);
        float f3 = 1.0f - (c2247401Cxm.LIZIZ + c2247401Cxm.LIZLLL);
        if (f2 != 1.0f) {
            c2247381Cxk.LIZ *= f2;
            c2247381Cxk.LIZJ *= f2;
        } else {
            c2247381Cxk.getClass();
        }
        if (f3 != 1.0f) {
            c2247381Cxk.LIZIZ *= f3;
            c2247381Cxk.LIZLLL *= f3;
        }
        float f4 = c2247401Cxm.LIZ;
        float f5 = c2247401Cxm.LIZIZ;
        c2247381Cxk.LIZ += f4;
        c2247381Cxk.LIZIZ += f5;
        c2247381Cxk.LIZJ += f4;
        c2247381Cxk.LIZLLL += f5;
    }

    public static void LIZJ(float[] fArr, float f, float f2, float f3, float f4) {
        if (fArr != null && fArr.length >= 8) {
            fArr[0] = f;
            fArr[1] = f4;
            fArr[2] = f3;
            fArr[3] = f4;
            fArr[4] = f;
            fArr[5] = f2;
            fArr[6] = f3;
            fArr[7] = f2;
            return;
        }
        throw new RuntimeException("data is invalid");
    }
}
