package X;

import java.nio.ByteBuffer;

/* JADX INFO: renamed from: X.18pY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21403818pY {
    public static final ThreadLocal<C21404718ph> LIZLLL = new ThreadLocal<>();
    public final int LIZ;
    public final C21403618pW LIZIZ;
    public volatile int LIZJ;

    /* JADX WARN: Multi-variable type inference failed */
    public final C21404718ph LIZJ() {
        ThreadLocal<C21404718ph> threadLocal = LIZLLL;
        C21404718ph c21404718ph = threadLocal.get();
        C21404718ph c21404718ph2 = c21404718ph;
        if (c21404718ph == null) {
            C21404218pc c21404218pc = new C21404218pc() { // from class: X.18ph
            };
            threadLocal.set((C21404718ph) c21404218pc);
            c21404718ph2 = c21404218pc;
        }
        C20139713r9 c20139713r9 = this.LIZIZ.LIZ;
        int i = this.LIZ;
        int iLIZ = c20139713r9.LIZ(6);
        if (iLIZ != 0) {
            int i2 = iLIZ + c20139713r9.LIZ;
            int i3 = i2 + c20139713r9.LIZIZ.getInt(i2) + 4 + (i * 4);
            c21404718ph2.LIZIZ(i3 + c20139713r9.LIZIZ.getInt(i3), c20139713r9.LIZIZ);
        }
        return c21404718ph2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(", id:");
        C21404718ph c21404718phLIZJ = LIZJ();
        int iLIZ = c21404718phLIZJ.LIZ(4);
        sb.append(Integer.toHexString(iLIZ != 0 ? c21404718phLIZJ.LIZIZ.getInt(iLIZ + c21404718phLIZJ.LIZ) : 0));
        sb.append(", codepoints:");
        int iLIZIZ = LIZIZ();
        for (int i = 0; i < iLIZIZ; i++) {
            sb.append(Integer.toHexString(LIZ(i)));
            sb.append(" ");
        }
        return sb.toString();
    }

    public final int LIZIZ() {
        C21404718ph c21404718phLIZJ = LIZJ();
        int iLIZ = c21404718phLIZJ.LIZ(16);
        if (iLIZ == 0) {
            return 0;
        }
        int i = iLIZ + c21404718phLIZJ.LIZ;
        return c21404718phLIZJ.LIZIZ.getInt(i + c21404718phLIZJ.LIZIZ.getInt(i));
    }

    public final int LIZ(int i) {
        C21404718ph c21404718phLIZJ = LIZJ();
        int iLIZ = c21404718phLIZJ.LIZ(16);
        if (iLIZ != 0) {
            ByteBuffer byteBuffer = c21404718phLIZJ.LIZIZ;
            int i2 = iLIZ + c21404718phLIZJ.LIZ;
            return byteBuffer.getInt(i2 + byteBuffer.getInt(i2) + 4 + (i * 4));
        }
        return 0;
    }

    public C21403818pY(C21403618pW c21403618pW, int i) {
        this.LIZIZ = c21403618pW;
        this.LIZ = i;
    }
}
