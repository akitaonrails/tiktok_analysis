package X;

/* JADX INFO: renamed from: X.12xq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19926412xq implements InterfaceC19930212yS<C19926412xq> {
    public final InterfaceC19922212xA<?> LL;
    public final int LLILLJJLI;
    public final AnonymousClass1334 LLILLL;
    public final boolean LLILZ;
    public final boolean LLILZIL;

    @Override // X.InterfaceC19930212yS
    public final AnonymousClass1332 LJJJIL() {
        return this.LLILLL.getJavaType();
    }

    @Override // X.InterfaceC19930212yS
    public final AnonymousClass1334 LJJIJL() {
        return this.LLILLL;
    }

    @Override // X.InterfaceC19930212yS
    public final boolean LJJLJ() {
        return this.LLILZ;
    }

    @Override // X.InterfaceC19930212yS
    public final int getNumber() {
        return this.LLILLJJLI;
    }

    @Override // X.InterfaceC19930212yS
    public final boolean isPacked() {
        return this.LLILZIL;
    }

    @Override // X.InterfaceC19930212yS
    public final boolean LJJJJLI(Object obj) {
        return obj instanceof InterfaceC19925612xi;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.LLILLJJLI - ((C19926412xq) obj).LLILLJJLI;
    }

    @Override // X.InterfaceC19930212yS
    public final void LJJIFFI(Object obj, Object obj2) {
        ((AbstractC19924612xY) obj).mergeFrom((AbstractC19924712xZ) obj2);
    }

    public C19926412xq(InterfaceC19922212xA<?> interfaceC19922212xA, int i, AnonymousClass1334 anonymousClass1334, boolean z, boolean z2) {
        this.LL = interfaceC19922212xA;
        this.LLILLJJLI = i;
        this.LLILLL = anonymousClass1334;
        this.LLILZ = z;
        this.LLILZIL = z2;
    }
}
