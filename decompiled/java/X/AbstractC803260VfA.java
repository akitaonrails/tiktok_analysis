package X;

/* JADX INFO: renamed from: X.0VfA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public abstract class AbstractC803260VfA<A> {
    public abstract void LIZIZ(A a, int i, char[] cArr, int i2, int i3);

    public abstract int LIZJ(A a);

    public final void LIZ(C803250Vf9 c803250Vf9, A a) {
        int i;
        int iLIZJ = LIZJ(a);
        char[] cArr = c803250Vf9.LIZIZ;
        int i2 = c803250Vf9.LIZJ;
        int i3 = 0;
        while (true) {
            i = iLIZJ + i2;
            if (i < cArr.length) {
                break;
            }
            int length = cArr.length - i2;
            LIZIZ(a, i3, cArr, i2, length);
            InterfaceC803370VfL interfaceC803370VfL = c803250Vf9.LIZ;
            char[] cArr2 = c803250Vf9.LIZIZ;
            interfaceC803370VfL.LIZLLL(cArr2, cArr2.length);
            if (i2 != 0) {
                c803250Vf9.LIZJ = 0;
                i2 = 0;
            }
            i3 += length;
            iLIZJ -= length;
        }
        if (iLIZJ > 0) {
            LIZIZ(a, i3, cArr, i2, iLIZJ);
            c803250Vf9.LIZJ = i;
        }
    }
}
