package X;

import android.animation.ObjectAnimator;
import android.view.View;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.LongPressConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS415S0200000_14;
import kotlin.jvm.internal.AwS593S0100000_14;

/* JADX INFO: renamed from: X.0ZLP, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0ZLP extends C0ZLB {
    public final Function1<View, Unit> LJFF;

    public C0ZLP(AwS593S0100000_14 awS593S0100000_14) {
        this.LJFF = awS593S0100000_14;
    }

    @Override // X.C0ZLB
    public final void LIZIZ(C0ZL0 c0zl0) {
        C893640Z3y c893640Z3y;
        View view = this.LJ;
        if ((view instanceof C912760ZrO) && (c893640Z3y = (C893640Z3y) view) != null) {
            c893640Z3y.LIZ(c0zl0);
        }
    }

    @Override // X.C0ZLB
    public final void LIZJ(LongPressConfig longPressConfig) {
        C912760ZrO c912760ZrO;
        View view = longPressConfig.longPressPopup;
        View view2 = longPressConfig.itemView;
        if (view == null) {
            return;
        }
        List<Integer> list = longPressConfig.movingLongPressPanelConfig.toHideMessageComponents;
        ArrayList arrayList = new ArrayList();
        Iterator<Integer> it2 = list.iterator();
        while (it2.hasNext()) {
            View viewFindViewById = view2.findViewById(it2.next().intValue());
            if (viewFindViewById != null) {
                arrayList.add(viewFindViewById);
            }
        }
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(it3.next(), "alpha", 1.0f, 0.0f);
            objectAnimatorOfFloat.setStartDelay(200L);
            objectAnimatorOfFloat.setDuration(200L);
            C786410Ut5.Pd(objectAnimatorOfFloat);
        }
        this.LJ = view;
        C786410Ut5.ed(view2, 0.0f);
        if ((view instanceof C912760ZrO) && (c912760ZrO = (C912760ZrO) view) != null) {
            c912760ZrO.LJIIJ(this.LIZJ, new C0ZLQ(this, longPressConfig, view2), new AwS415S0200000_14(this, view2, 124), longPressConfig);
        }
        C0ZLO c0zlo = longPressConfig.onLongPressPopupProvider;
        if (c0zlo != null) {
            c0zlo.LIZ(C0ZLB.LIZ(this));
        }
    }
}
