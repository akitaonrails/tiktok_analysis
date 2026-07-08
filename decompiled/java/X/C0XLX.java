package X;

import okhttp3.Request;

/* JADX INFO: renamed from: X.0XLX, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public class C0XLX {
    public Request LIZ;
    public EnumC847200XLi LIZIZ;
    public int LIZJ;
    public String LIZLLL;
    public C1495740p1g LJ;
    public C0X1U LJFF;
    public AbstractC842510X3h LJI;
    public C0XLY LJII;
    public C0XLY LJIIIIZZ;
    public C0XLY LJIIIZ;
    public long LJIIJ;
    public long LJIIJJI;

    public final C0XLY LIZ() {
        if (this.LIZ == null) {
            throw new IllegalStateException("request == null");
        }
        if (this.LIZIZ == null) {
            throw new IllegalStateException("protocol == null");
        }
        if (this.LIZJ >= 0) {
            if (this.LIZLLL != null) {
                return new C0XLY(this);
            }
            throw new IllegalStateException("message == null");
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("code < 0: ");
        sbLIZ.append(this.LIZJ);
        throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ));
    }

    public C0XLX() {
        this.LIZJ = -1;
        this.LJFF = new C0X1U();
    }

    public C0XLX(C0XLY c0xly) {
        this.LIZJ = -1;
        this.LIZ = c0xly.LL;
        this.LIZIZ = c0xly.LLILLJJLI;
        this.LIZJ = c0xly.LLILLL;
        this.LIZLLL = c0xly.LLILZ;
        this.LJ = c0xly.LLILZIL;
        this.LJFF = c0xly.LLILZLL.LJI();
        this.LJI = c0xly.LLIZ;
        this.LJII = c0xly.LLIZLLLIL;
        this.LJIIIIZZ = c0xly.LLJ;
        this.LJIIIZ = c0xly.LLJI;
        this.LJIIJ = c0xly.LLJIJIL;
        this.LJIIJJI = c0xly.LLJILJIL;
    }

    public static void LIZIZ(String str, C0XLY c0xly) {
        if (c0xly.LLIZ == null) {
            if (c0xly.LLIZLLLIL == null) {
                if (c0xly.LLJ == null) {
                    if (c0xly.LLJI == null) {
                        return;
                    }
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(str);
                    sbLIZ.append(".priorResponse != null");
                    throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
                }
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append(str);
                sbLIZ2.append(".cacheResponse != null");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ2));
            }
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append(str);
            sbLIZ3.append(".networkResponse != null");
            throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ3));
        }
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append(str);
        sbLIZ4.append(".body != null");
        throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ4));
    }
}
