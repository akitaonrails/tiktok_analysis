package X;

import android.view.View;
import com.bytedance.pipo.stellar.base.model.BaseWidgetDO;
import com.bytedance.pipo.stellar.base.model.prop.StellarActionDO;
import wh6.AbS191S0400000_26;

/* JADX INFO: renamed from: X.0usk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public abstract class AbstractC1720840usk<D> implements InterfaceC1720770usd {
    public C1720760usc LL;
    public View LLILLJJLI;
    public D LLILLL;

    @Override // X.InterfaceC1720770usd
    public void LIZJ() {
    }

    public abstract int LJ();

    @Override // X.InterfaceC1720770usd
    public final View LIZIZ() {
        return this.LLILLJJLI;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void LJFF(View view, D d, EnumC1720670usT enumC1720670usT) {
        BaseWidgetDO baseWidgetDO;
        StellarActionDO action;
        this.LLILLJJLI = view;
        this.LLILLL = d;
        if ((d instanceof BaseWidgetDO) && (baseWidgetDO = (BaseWidgetDO) d) != null && (action = baseWidgetDO.getAction()) != null) {
            C786410Ut5.I7(new AbS191S0400000_26(d, baseWidgetDO, this, action, 1), view);
        }
    }
}
