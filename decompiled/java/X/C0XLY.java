package X;

import java.io.Closeable;
import okhttp3.Request;

/* JADX INFO: renamed from: X.0XLY, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0XLY implements Closeable {
    public final Request LL;
    public final EnumC847200XLi LLILLJJLI;
    public final int LLILLL;
    public final String LLILZ;
    public final C1495740p1g LLILZIL;
    public final C0X1V LLILZLL;
    public final AbstractC842510X3h LLIZ;
    public final C0XLY LLIZLLLIL;
    public final C0XLY LLJ;
    public final C0XLY LLJI;
    public final long LLJIJIL;
    public final long LLJILJIL;

    public final boolean LIZIZ() {
        int i = this.LLILLL;
        return i >= 200 && i < 300;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        AbstractC842510X3h abstractC842510X3h = this.LLIZ;
        if (abstractC842510X3h == null) {
            throw new IllegalStateException("response is not eligible for a body and must not be closed");
        }
        abstractC842510X3h.close();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Response{protocol=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", code=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", message=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", url=");
        sbLIZ.append(this.LL.url());
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0XLY(C0XLX c0xlx) {
        this.LL = c0xlx.LIZ;
        this.LLILLJJLI = c0xlx.LIZIZ;
        this.LLILLL = c0xlx.LIZJ;
        this.LLILZ = c0xlx.LIZLLL;
        this.LLILZIL = c0xlx.LJ;
        C0X1U c0x1u = c0xlx.LJFF;
        c0x1u.getClass();
        this.LLILZLL = new C0X1V(c0x1u);
        this.LLIZ = c0xlx.LJI;
        this.LLIZLLLIL = c0xlx.LJII;
        this.LLJ = c0xlx.LJIIIIZZ;
        this.LLJI = c0xlx.LJIIIZ;
        this.LLJIJIL = c0xlx.LJIIJ;
        this.LLJILJIL = c0xlx.LJIIJJI;
    }

    public final String LIZ(String str, String str2) {
        String strLIZLLL = this.LLILZLL.LIZLLL(str);
        if (strLIZLLL != null) {
            return strLIZLLL;
        }
        return str2;
    }
}
