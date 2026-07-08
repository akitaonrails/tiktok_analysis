package X;

import java.io.Closeable;
import java.io.Flushable;

/* JADX INFO: renamed from: X.0jr8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public abstract class AbstractC1297000jr8 implements Closeable, Flushable {
    public int LL;
    public final int[] LLILLJJLI = new int[32];
    public final String[] LLILLL = new String[32];
    public final int[] LLILZ = new int[32];
    public boolean LLILZIL;
    public boolean LLILZLL;
    public boolean LLIZ;

    public abstract C1297030jrB LIZ(String str);

    public abstract C1297030jrB LIZIZ();

    public abstract C1297030jrB LJI(long j);

    public abstract C1297030jrB LJII(String str);

    public final int LIZLLL() {
        int i = this.LL;
        if (i != 0) {
            return this.LLILLJJLI[i - 1];
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    public final void LJFF(int i) {
        int i2 = this.LL;
        int[] iArr = this.LLILLJJLI;
        if (i2 != iArr.length) {
            this.LL = i2 + 1;
            iArr[i2] = i;
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Nesting too deep at ");
        sbLIZ.append(C1888307aT.LIZ(this.LL, this.LLILLJJLI, this.LLILZ, this.LLILLL));
        sbLIZ.append(": circular reference?");
        throw new C1296420jqC(C2188811AlT.LIZIZ(sbLIZ));
    }
}
