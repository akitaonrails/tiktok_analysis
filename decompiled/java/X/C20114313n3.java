package X;

import kotlin.jvm.internal.AwS574S0100000_30;

/* JADX INFO: renamed from: X.13n3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public class C20114313n3 implements InterfaceC20114113n1, InterfaceC20115013nA {
    public String LIZ = "default_bid";
    public final C01GW LIZIZ = C452501pT.LIZIZ(new AwS574S0100000_30(this, 379));

    @Override // X.InterfaceC20114113n1
    public final void onUnRegister() {
    }

    @Override // X.InterfaceC20115013nA
    public final C20114513n5 getLoggerWrapper() {
        return (C20114513n5) this.LIZIZ.getValue();
    }

    @Override // X.InterfaceC20115013nA
    public final void printLog(String str, EnumC20115313nD enumC20115313nD, String str2) {
        C20115113nB.LIZ(this, str, enumC20115313nD, str2);
    }
}
