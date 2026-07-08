package X;

/* JADX INFO: renamed from: X.0Dg5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C345190Dg5 extends RuntimeException {
    public static final int $stable = 8;
    public final String LL;
    public final InterfaceC345200Dg6 LLILLJJLI;

    public final InterfaceC345200Dg6 getCauser() {
        return this.LLILLJJLI;
    }

    public final String getReason() {
        return this.LL;
    }

    public C345190Dg5(String str, InterfaceC345200Dg6 interfaceC345200Dg6) {
        super(str);
        this.LL = str;
        this.LLILLJJLI = interfaceC345200Dg6;
    }
}
