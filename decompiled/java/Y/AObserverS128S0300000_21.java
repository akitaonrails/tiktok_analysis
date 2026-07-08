package Y;

import X.AbstractC1368500liS;
import X.AbstractC1368540liW;
import X.AbstractC1368600lic;
import X.AbstractC1368630lif;
import X.C1368580lia;
import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMContact;

/* JADX INFO: loaded from: classes22.dex */
public class AObserverS128S0300000_21 implements Observer {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        switch (this.$t) {
            case 0:
                onChanged$0(this, obj);
                break;
            case 1:
                onChanged$1(this, obj);
                break;
        }
    }

    public static final void onChanged$0(AObserverS128S0300000_21 aObserverS128S0300000_21, Object obj) {
        ((Boolean) obj).booleanValue();
        AbstractC1368540liW abstractC1368540liW = (AbstractC1368540liW) ((RecyclerView.ViewHolder) aObserverS128S0300000_21.l0);
        abstractC1368540liW.LLJI = ((AbstractC1368630lif) aObserverS128S0300000_21.l1).LLLJL(aObserverS128S0300000_21.l2);
        abstractC1368540liW.N5();
    }

    public static final void onChanged$1(AObserverS128S0300000_21 aObserverS128S0300000_21, Object obj) {
        ((Boolean) obj).booleanValue();
        AbstractC1368500liS abstractC1368500liS = (AbstractC1368500liS) ((RecyclerView.ViewHolder) aObserverS128S0300000_21.l0);
        AbstractC1368600lic abstractC1368600lic = (AbstractC1368600lic) aObserverS128S0300000_21.l1;
        Object obj2 = aObserverS128S0300000_21.l2;
        C1368580lia c1368580lia = (C1368580lia) abstractC1368600lic;
        c1368580lia.getClass();
        abstractC1368500liS.LLJ = c1368580lia.LLLJ((IMContact) obj2);
        abstractC1368500liS.N5();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AObserverS128S0300000_21(Object obj, RecyclerView.ViewHolder viewHolder, AbstractC1368630lif<T> abstractC1368630lif, T t) {
        this.$t = t;
        this.l0 = obj;
        this.l1 = viewHolder;
        this.l2 = abstractC1368630lif;
    }
}
