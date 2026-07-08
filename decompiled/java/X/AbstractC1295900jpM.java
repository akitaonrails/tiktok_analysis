package X;

import java.io.Closeable;
import java.util.Arrays;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.0jpM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public abstract class AbstractC1295900jpM implements Closeable {
    public static final String[] LLILZIL = new String[128];
    public int LL;
    public int[] LLILLJJLI = new int[32];
    public String[] LLILLL = new String[32];
    public int[] LLILZ = new int[32];

    public abstract void LIZ();

    public abstract void LIZIZ();

    public abstract void LIZLLL();

    public abstract void LJFF();

    public abstract boolean LJII();

    public abstract boolean LJIILL();

    public abstract double LJIILLIIL();

    public abstract int LJIIZILJ();

    public abstract String LJIJJ();

    public abstract EnumC1295540jom LJIJJLI();

    public abstract int LJJIL(C1296750jqj c1296750jqj);

    public abstract void LJJIZ();

    public abstract void LJJJ();

    static {
        int i = 0;
        do {
            LLILZIL[i] = C786410Ut5.j4("\\u%04x", new Object[]{Integer.valueOf(i)});
            i++;
        } while (i <= 31);
        String[] strArr = LLILZIL;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
    }

    public final String LJI() {
        int i = this.LL;
        int[] iArr = this.LLILLJJLI;
        String[] strArr = this.LLILLL;
        int[] iArr2 = this.LLILZ;
        StringBuilder sb = new StringBuilder(e3.c);
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = iArr[i2];
            if (i3 == 1 || i3 == 2) {
                sb.append('[');
                sb.append(iArr2[i2]);
                sb.append(']');
            } else if (i3 == 3 || i3 == 4 || i3 == 5) {
                sb.append('.');
                String str = strArr[i2];
                if (str != null) {
                    sb.append(str);
                }
            }
        }
        return sb.toString();
    }

    public final void LJJ(int i) {
        int i2 = this.LL;
        int[] iArr = this.LLILLJJLI;
        if (i2 == iArr.length) {
            if (i2 != 256) {
                this.LLILLJJLI = Arrays.copyOf(iArr, iArr.length * 2);
                String[] strArr = this.LLILLL;
                this.LLILLL = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
                int[] iArr2 = this.LLILZ;
                this.LLILZ = Arrays.copyOf(iArr2, iArr2.length * 2);
            } else {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Nesting too deep at ");
                sbLIZ.append(LJI());
                throw new C1295910jpN(C2188811AlT.LIZIZ(sbLIZ));
            }
        }
        int[] iArr3 = this.LLILLJJLI;
        int i3 = this.LL;
        this.LL = i3 + 1;
        iArr3[i3] = i;
    }

    public final void LJJJJ(String str) throws C1295920jpO {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append(" at path ");
        sbLIZ.append(LJI());
        throw new C1295920jpO(C2188811AlT.LIZIZ(sbLIZ));
    }
}
