package X;

/* JADX INFO: renamed from: X.12oX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19868712oX extends AbstractC19853312m3<Object> {
    public final AbstractC19853312m3 LL;
    public AbstractC19853312m3 LLILLJJLI = C19864912nv.LLILZIL;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.LLILLJJLI.hasNext() || this.LL.hasNext();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Iterator
    public final Object next() {
        if (!this.LLILLJJLI.hasNext()) {
            this.LLILLJJLI = ((AbstractC19875812pg) this.LL.next()).iterator();
        }
        return this.LLILLJJLI.next();
    }

    public C19868712oX(AbstractC19872712pB abstractC19872712pB) {
        this.LL = abstractC19872712pB.LLILZLL.values().iterator();
    }
}
