package X;

import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: X.13m1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20107913m1 implements InterfaceC20108813mA {
    public C20108713m9 LIZ;
    public final WeakReference<InterfaceC20108113m3> LIZIZ;
    public final InterfaceC20108013m2 LIZJ;

    @Override // X.InterfaceC20108813mA
    public final void LIZ(C20109213mE c20109213mE) {
        EnumC20108613m8 enumC20108613m8;
        C20108713m9 c20108713m9 = this.LIZ;
        if (c20108713m9 == null || (enumC20108613m8 = c20108713m9.LIZJ) == null) {
            enumC20108613m8 = EnumC20108613m8.FALLBACK;
        }
        c20109213mE.LJFF = enumC20108613m8.ordinal();
        InterfaceC20108113m3 interfaceC20108113m3 = this.LIZIZ.get();
        if (interfaceC20108113m3 != null) {
            if (interfaceC20108113m3 instanceof C20108313m5) {
                ((C20108313m5) interfaceC20108113m3).LIZ(c20109213mE.LIZIZ());
            } else {
                interfaceC20108113m3.LIZ(c20109213mE.LIZIZ());
            }
        }
    }

    @Override // X.InterfaceC20108813mA
    public final void onFailed(Throwable th) {
        InterfaceC20108113m3 interfaceC20108113m3 = this.LIZIZ.get();
        if (interfaceC20108113m3 != null) {
            interfaceC20108113m3.onFailed(th);
        }
    }

    public C20107913m1(InterfaceC20108013m2 interfaceC20108013m2, InterfaceC20108113m3 interfaceC20108113m3) {
        this.LIZJ = interfaceC20108013m2;
        this.LIZIZ = new WeakReference<>(interfaceC20108113m3);
    }
}
