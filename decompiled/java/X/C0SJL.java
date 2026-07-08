package X;

import java.util.List;

/* JADX INFO: renamed from: X.0SJL, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public abstract class C0SJL<METADATA> implements C0SFJ, Cloneable {
    public final int LL;
    public final int LLILLJJLI;
    public int LLILLL;
    public int LLILZ;
    public boolean LLILZIL;
    public String LLILZLL;
    public METADATA LLIZ;
    public final List<Object> LLIZLLLIL = C1697810uHb.LJIILJJIL(LIZJ());

    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public abstract C0SJL<METADATA> clone();

    public abstract String LIZLLL();

    public C13BV LIZJ() {
        return C13BV.INSTANCE;
    }

    public C0SJL(int i, int i2) {
        this.LL = i;
        this.LLILLJJLI = i2;
        this.LLILLL = i;
        this.LLILZ = i2;
    }
}
