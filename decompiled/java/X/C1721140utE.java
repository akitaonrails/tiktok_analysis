package X;

import Y.ARunnableS16S0500000_26;
import android.view.View;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.pipo.stellar.base.card.carousel.CarouselFragment;
import com.bytedance.pipo.stellar.base.model.CarouselDO;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0utE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1721140utE extends AbstractC1720840usk<CarouselDO> {
    public int LLILZ;
    public int LLILZIL;
    public int LLILZLL;
    public final List<Boolean> LLIZ = new ArrayList();

    @Override // X.AbstractC1720840usk
    public final int LJ() {
        return R.layout.adj;
    }

    @Override // X.AbstractC1720840usk
    public final void LJFF(View view, CarouselDO carouselDO, EnumC1720670usT enumC1720670usT) {
        CarouselDO carouselDO2 = carouselDO;
        super.LJFF(view, carouselDO2, enumC1720670usT);
        CarouselFragment.LLILLL = this.LL;
        C1721220utM c1721220utM = (C1721220utM) view.findViewById(R.id.wx3);
        C118300cf c118300cf = new C118300cf();
        c118300cf.element = -1;
        if (c1721220utM.getParent() != null) {
            HandlerHook.viewPost(c1721220utM, new ARunnableS16S0500000_26(view, carouselDO2, c1721220utM, this, c118300cf, 2));
        }
    }
}
