package X;

/* JADX INFO: renamed from: X.0NbA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C596940NbA<T> implements InterfaceC608270NtR<Object, T> {
    public final String LL;
    public final boolean LLILLJJLI;
    public T LLILLL;

    @Override // X.InterfaceC608270NtR, X.InterfaceC1731706qJ
    public final T getValue(Object obj, InterfaceC2217461Bqa<?> interfaceC2217461Bqa) {
        return this.LLILLL;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C596940NbA(Object obj, String str, boolean z) {
        this.LL = str;
        this.LLILLJJLI = z;
        this.LLILLL = obj;
    }

    @Override // X.InterfaceC608270NtR
    public final void setValue(Object obj, InterfaceC2217461Bqa<?> interfaceC2217461Bqa, T t) {
        this.LLILLL = t;
    }
}
