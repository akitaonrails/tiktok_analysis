package X;

import kotlin.jvm.internal.AFwS195S0000000_9;

/* JADX INFO: renamed from: X.0NQS, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0NQS implements InterfaceC736910SvR<InterfaceC1165180gQW> {
    public final C01GW LL = C452501pT.LIZIZ(AFwS195S0000000_9.get$arr$(576));
    public final C0NQR LLILLJJLI = new InterfaceC1165180gQW() { // from class: X.0NQR
        @Override // X.InterfaceC1165180gQW
        public final C095D LLJJIJIL(String str, String str2) {
            return new C095D(new C0NQP(this.LL, str, str2, null));
        }

        @Override // X.InterfaceC1165180gQW
        public final C095D LJJII(String str, String str2, String str3) {
            return new C095D(new C0NQQ(this.LL, str, str2, str3, null));
        }
    };

    @Override // X.InterfaceC736910SvR
    public final void release() {
    }

    @Override // X.InterfaceC736910SvR
    public final /* bridge */ /* synthetic */ InterfaceC149400hg getOperator() {
        return this.LLILLJJLI;
    }
}
