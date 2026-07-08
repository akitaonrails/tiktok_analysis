package X;

/* JADX INFO: renamed from: X.0jeO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public class C1289100jeO implements Comparable<C1289100jeO> {
    public final InterfaceC1289150jeT LL;
    public final EnumC1289080jeM LLILLJJLI;

    @Override // java.lang.Comparable
    public final int compareTo(C1289100jeO c1289100jeO) {
        return Integer.compare(this.LLILLJJLI.getValue(), c1289100jeO.LLILLJJLI.getValue());
    }

    public C1289100jeO(InterfaceC1289150jeT interfaceC1289150jeT, EnumC1289080jeM enumC1289080jeM) {
        this.LL = interfaceC1289150jeT;
        this.LLILLJJLI = enumC1289080jeM;
    }
}
