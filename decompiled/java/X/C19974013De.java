package X;

import java.util.List;

/* JADX INFO: renamed from: X.13De, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19974013De<E> extends AbstractC19974313Dh<E> implements C13D5<E> {
    public final C13D5<E> LLILLJJLI;
    public final int LLILLL;
    public final int LLILZ;

    @Override // X.AbstractC2253808sK
    public final int LIZJ() {
        return this.LLILZ;
    }

    @Override // X.AbstractC19974313Dh, java.util.List
    public final E get(int i) {
        C19973813Dc.LIZ(i, this.LLILZ);
        return this.LLILLJJLI.get(this.LLILLL + i);
    }

    @Override // X.AbstractC19974313Dh, java.util.List
    public final List subList(int i, int i2) {
        C19973813Dc.LIZJ(i, i2, this.LLILZ);
        C13D5<E> c13d5 = this.LLILLJJLI;
        int i3 = this.LLILLL;
        return new C19974013De(c13d5, i + i3, i3 + i2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C19974013De(C13D5<? extends E> c13d5, int i, int i2) {
        this.LLILLJJLI = c13d5;
        this.LLILLL = i;
        C19973813Dc.LIZJ(i, i2, c13d5.size());
        this.LLILZ = i2 - i;
    }
}
