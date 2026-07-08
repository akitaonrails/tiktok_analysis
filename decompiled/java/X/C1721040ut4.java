package X;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.pipo.stellar.base.model.BackgroundDO;
import com.bytedance.pipo.stellar.base.model.StellarEmptyDO;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0ut4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1721040ut4 extends AbstractC1720840usk<StellarEmptyDO> {
    @Override // X.AbstractC1720840usk
    public final int LJ() {
        return R.layout.ado;
    }

    @Override // X.AbstractC1720840usk
    public final void LJFF(View view, StellarEmptyDO stellarEmptyDO, EnumC1720670usT enumC1720670usT) {
        StellarEmptyDO stellarEmptyDO2 = stellarEmptyDO;
        super.LJFF(view, stellarEmptyDO2, enumC1720670usT);
        View viewFindViewById = view.findViewById(R.id.view_foreground);
        C1721300utU c1721300utU = C1721300utU.LIZ;
        String width = stellarEmptyDO2.getWidth();
        Context context = viewFindViewById.getContext();
        c1721300utU.getClass();
        C786410Ut5.W5(viewFindViewById, new FrameLayout.LayoutParams(C1721300utU.LJJIII(context, width), C1721300utU.LJIILLIIL(viewFindViewById.getContext(), stellarEmptyDO2.getHeight())));
        BackgroundDO foreground = stellarEmptyDO2.getForeground();
        c1721300utU.getClass();
        C1721300utU.LIZ(viewFindViewById, foreground, null);
    }
}
