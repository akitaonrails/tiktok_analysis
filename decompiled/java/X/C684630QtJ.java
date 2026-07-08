package X;

import com.bytedance.ies.powerlist.PowerCell;

/* JADX INFO: renamed from: X.0QtJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C684630QtJ<T, V> implements InterfaceC1731706qJ {
    public final /* synthetic */ PowerCell LL;

    public C684630QtJ(PowerCell powerCell) {
        this.LL = powerCell;
    }

    @Override // X.InterfaceC1731706qJ
    public final Object getValue(Object obj, InterfaceC2217461Bqa interfaceC2217461Bqa) {
        InterfaceC1906710ziX stub = this.LL.getStub();
        if (stub != null) {
            return stub.LJ(InterfaceC684640QtK.class);
        }
        return null;
    }
}
