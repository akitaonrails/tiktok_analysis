package X;

import Y.ARunnableS34S0400000_26;
import android.view.View;
import android.widget.HorizontalScrollView;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.pipo.stellar.base.model.ContainerCardDO;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0uss, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1720920uss extends AbstractC1720840usk<ContainerCardDO> {
    @Override // X.AbstractC1720840usk
    public final int LJ() {
        return R.layout.adu;
    }

    @Override // X.AbstractC1720840usk
    public final void LJFF(View view, ContainerCardDO containerCardDO, EnumC1720670usT enumC1720670usT) {
        ContainerCardDO containerCardDO2 = containerCardDO;
        super.LJFF(view, containerCardDO2, enumC1720670usT);
        HorizontalScrollView horizontalScrollView = (HorizontalScrollView) view.findViewById(R.id.u3e);
        if (horizontalScrollView != null) {
            HandlerHook.viewPost(horizontalScrollView, new ARunnableS34S0400000_26(horizontalScrollView, view, containerCardDO2, this, 1));
        }
    }
}
