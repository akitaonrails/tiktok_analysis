package X;

/* JADX INFO: renamed from: X.0pu2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public class C1529440pu2 implements InterfaceC1075470e5p {
    public String LIZ = "hybridkit_default_bid";

    @Override // X.InterfaceC1075470e5p
    public final void onUnRegister() {
    }

    public final String getBid() {
        return this.LIZ;
    }

    @Override // X.InterfaceC1075470e5p
    public final void onRegister(String str) {
        this.LIZ = str;
    }
}
