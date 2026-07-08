package X;

/* JADX INFO: renamed from: X.06hQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1676606hQ {
    public final C1676806hS<InterfaceC1675606hG> LIZ = new C1676806hS<>();
    public final C1676806hS<EnumC1641806bo> LIZIZ = new C1676806hS<>();
    public final C1676806hS<EnumC1670906gV> LIZJ = new C1676806hS<>();
    public final C1676806hS<EnumC1674506h5> LIZLLL = new C1676806hS<>();

    public final void LIZ(InterfaceC1677406hY interfaceC1677406hY) {
        if (interfaceC1677406hY instanceof InterfaceC1675606hG) {
            this.LIZ.LIZ(interfaceC1677406hY);
            return;
        }
        if (interfaceC1677406hY instanceof EnumC1641806bo) {
            this.LIZIZ.LIZ(interfaceC1677406hY);
        } else if (interfaceC1677406hY instanceof EnumC1670906gV) {
            this.LIZJ.LIZ(interfaceC1677406hY);
        } else {
            if (interfaceC1677406hY instanceof EnumC1674506h5) {
                this.LIZLLL.LIZ(interfaceC1677406hY);
                return;
            }
            throw new C1954807lC();
        }
    }
}
