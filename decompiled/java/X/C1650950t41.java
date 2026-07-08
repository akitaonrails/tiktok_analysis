package X;

import Y.AObjectS306S0200000_25;
import androidx.lifecycle.LifecycleOwner;

/* JADX INFO: renamed from: X.0t41, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1650950t41<T> implements InterfaceC1441305kZ {
    public final /* synthetic */ C1651010t47 LL;
    public final /* synthetic */ C1650560t3O LLILLJJLI;
    public final /* synthetic */ C1DRG LLILLL;
    public final /* synthetic */ InterfaceC1651180t4O LLILZ;
    public final /* synthetic */ LifecycleOwner LLILZIL;

    public C1650950t41(C1651010t47 c1651010t47, C1650560t3O c1650560t3O, C1DRG c1drg, InterfaceC1651180t4O interfaceC1651180t4O, LifecycleOwner lifecycleOwner) {
        this.LL = c1651010t47;
        this.LLILLJJLI = c1650560t3O;
        this.LLILLL = c1drg;
        this.LLILZ = interfaceC1651180t4O;
        this.LLILZIL = lifecycleOwner;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        Boolean bool = (Boolean) obj;
        this.LL.LJFF = !bool.booleanValue();
        C1650980t44 c1650980t44LJI = this.LLILLJJLI.LJI();
        if (bool.booleanValue()) {
            ((InterfaceC1651080t4E) this.LLILLL.LJII(InterfaceC1651080t4E.class, null)).XI0().LJFF(c1650980t44LJI, true);
        } else {
            this.LLILZ.Kd1().LIZ(this.LLILZIL, new AObjectS306S0200000_25((Object) this.LLILLL, (Object) c1650980t44LJI, (InterfaceC1648570t0B) 8));
        }
    }
}
