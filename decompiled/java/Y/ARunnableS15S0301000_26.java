package Y;

import X.AbstractC1842530y31;
import X.C049K;
import X.C1528180ps0;
import X.C1704130uRn;
import X.C1743240vSs;
import X.C1744410vUl;
import X.C1747620vZw;
import X.C1748720vbi;
import X.C1753660vjg;
import X.C1761470vwH;
import X.C1761490vwJ;
import X.C1C7U;
import X.C23271099x;
import X.C450740Hlw;
import X.C497740JfY;
import X.C817803Hk;
import X.C948003nC;
import X.C948503nH;
import X.InterfaceC1704110uRl;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditFragment;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.BundleInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.BundleProduct;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.bundledeal.PdpBundleDealVH;
import com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.fragment.DistrictPage;
import com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.fragment.DistrictVm;
import com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.model.District;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS18S0401000_26;

/* JADX INFO: loaded from: classes27.dex */
public class ARunnableS15S0301000_26 implements Runnable {
    public final int $t;
    public int i3;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                break;
            case 1:
                run$1(this);
                break;
            case 2:
                run$2(this);
                break;
            case 3:
                run$3(this);
                break;
            case 4:
                run$4(this);
                break;
            case 5:
                run$5(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$0() {
        C1528180ps0 contentFromXml = ((C1761470vwH) this.l0).getContentFromXml();
        Function1 function1 = (Function1) this.l1;
        CharSequence charSequence = (CharSequence) this.l2;
        if (charSequence == null) {
            charSequence = "";
        }
        contentFromXml.setText((CharSequence) function1.invoke(SpannableString.valueOf(charSequence)));
        C1761490vwJ c1761490vwJ = new C1761490vwJ(((C1761470vwH) this.l0).getContentFromXml(), (((C1761470vwH) this.l0).getWidth() - ((C1761470vwH) this.l0).getPaddingStart()) - ((C1761470vwH) this.l0).getPaddingEnd(), "", this.i3, -1.0f);
        CharSequence charSequence2 = (CharSequence) this.l2;
        SpannableString spannableStringLIZ = c1761490vwJ.LIZ(SpannableString.valueOf(charSequence2 != null ? charSequence2 : ""));
        if (c1761490vwJ.LIZLLL) {
            C1528180ps0 contentFromXml2 = ((C1761470vwH) this.l0).getContentFromXml();
            Function1 function12 = (Function1) this.l1;
            contentFromXml2.setText((CharSequence) function12.invoke(function12.invoke(new SpannableStringBuilder(spannableStringLIZ).append((CharSequence) "..."))));
        } else {
            C1528180ps0 contentFromXml3 = ((C1761470vwH) this.l0).getContentFromXml();
            Function1 function13 = (Function1) this.l1;
            contentFromXml3.setText((CharSequence) function13.invoke(function13.invoke(spannableStringLIZ)));
        }
    }

    public final void LIZ$1() {
        int i;
        if (this.i3 > ((DistrictPage) this.l0).LLIZLLLIL.length() - 1 || (i = this.i3) <= 0) {
            return;
        }
        if (((District) ListProtector.get(((C1744410vUl) this.l1).LL.LJFF, i)).showIndex) {
            i++;
        }
        View viewFindViewByPosition = ((RecyclerView.LayoutManager) this.l2).findViewByPosition(i);
        if (viewFindViewByPosition != null) {
            viewFindViewByPosition.performAccessibilityAction(64, null);
        }
    }

    public final void LIZ$3() {
        C1753660vjg c1753660vjgC6 = ((PdpBundleDealVH) this.l0).c6();
        PdpBundleDealVH pdpBundleDealVH = (PdpBundleDealVH) this.l0;
        BundleInfo bundleInfo = (BundleInfo) this.l1;
        BundleProduct bundleProduct = (BundleProduct) this.l2;
        int i = this.i3;
        Map<String, Object> mapLIZJ = pdpBundleDealVH.e6().LLILZIL.LIZJ(new C817803Hk("c1720.d87776", Integer.valueOf(this.i3)));
        c1753660vjgC6.getClass();
        C1748720vbi.LIZIZ(pdpBundleDealVH, new C049K(), new AwS18S0401000_26(c1753660vjgC6, (C1753660vjg) bundleInfo, (BundleInfo) bundleProduct, (BundleProduct) i, (int) mapLIZJ, (Map<String, ? extends Object>) 3));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LIZ$4() {
        View childAt;
        int i = this.i3;
        if (i == Integer.MAX_VALUE) {
            ((C450740Hlw) this.l0).scrollToPosition(((AddressEditFragment) this.l1).aS().getItemCount() - 1);
            return;
        }
        if (i < 0 || i >= ((AddressEditFragment) this.l1).aS().getItemCount()) {
            return;
        }
        if (!((C1747620vZw) ((C948003nC) this.l2).LIZ).LIZIZ || (childAt = ((C450740Hlw) this.l0).getChildAt(this.i3)) == null || Integer.valueOf(childAt.getTop()) == null) {
            ((C450740Hlw) this.l0).scrollToPosition(this.i3);
        } else {
            View childAt2 = ((C450740Hlw) this.l0).getChildAt(this.i3);
            ((C450740Hlw) this.l0).smoothScrollBy(0, childAt2 != null ? childAt2.getTop() : 0);
        }
    }

    public final void LIZ$2() {
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(((TextView) this.l1).getScrollX(), C497740JfY.LJJ() ? ((AbstractC1842530y31) this.l0).LJIILIIL.getScrollX() - this.i3 : ((AbstractC1842530y31) this.l0).LJIILIIL.getScrollX() + this.i3);
        final int i = this.i3;
        final AbstractC1842530y31 abstractC1842530y31 = (AbstractC1842530y31) this.l0;
        TextView textView = (TextView) this.l1;
        final InterfaceC1704110uRl interfaceC1704110uRl = (InterfaceC1704110uRl) this.l2;
        valueAnimatorOfInt.setDuration((long) (((i * 1.0f) / abstractC1842530y31.LIZIZ.LJII) * 1000));
        valueAnimatorOfInt.setStartDelay(100L);
        valueAnimatorOfInt.setInterpolator(new LinearInterpolator());
        valueAnimatorOfInt.addUpdateListener(new AUListenerS274S0100000_26(textView, 9));
        valueAnimatorOfInt.addListener(new C1704130uRn() { // from class: X.0ugR
            @Override // X.C1704130uRn, android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                InterfaceC1704110uRl interfaceC1704110uRl2 = interfaceC1704110uRl;
                if (interfaceC1704110uRl2 != null) {
                    interfaceC1704110uRl2.LIZ(i);
                }
                abstractC1842530y31.LIZIZ();
            }
        });
        valueAnimatorOfInt.start();
    }

    public static final void run$0(ARunnableS15S0301000_26 aRunnableS15S0301000_26) {
        boolean zLIZ;
        C1C7U.LIZ("ViewMoreText@262b.setText$2");
        try {
            aRunnableS15S0301000_26.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ViewMoreText@262b.setText$2");
    }

    public static final void run$1(ARunnableS15S0301000_26 aRunnableS15S0301000_26) {
        boolean zLIZ;
        C1C7U.LIZ("DistrictPage@aef9.onViewCreated$2$onScrolled$3");
        try {
            aRunnableS15S0301000_26.LIZ$1();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("DistrictPage@aef9.onViewCreated$2$onScrolled$3");
    }

    public static final void run$2(ARunnableS15S0301000_26 aRunnableS15S0301000_26) {
        boolean zLIZ;
        C1C7U.LIZ("DistrictVm@6492.onResume$1$3");
        try {
            DistrictVm districtVm = (DistrictVm) aRunnableS15S0301000_26.l0;
            C948503nH.LJFF(districtVm, C23271099x.INSTANCE, new C1743240vSs((Fragment) aRunnableS15S0301000_26.l1, districtVm, aRunnableS15S0301000_26.i3, (FragmentManager) aRunnableS15S0301000_26.l2, null));
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("DistrictVm@6492.onResume$1$3");
    }

    public static final void run$3(ARunnableS15S0301000_26 aRunnableS15S0301000_26) {
        boolean zLIZ;
        C1C7U.LIZ("IAnimationProcessor@b62a.startMarqueeForUnifiedEntrance$2$1");
        try {
            aRunnableS15S0301000_26.LIZ$2();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("IAnimationProcessor@b62a.startMarqueeForUnifiedEntrance$2$1");
    }

    public static final void run$4(ARunnableS15S0301000_26 aRunnableS15S0301000_26) {
        boolean zLIZ;
        C1C7U.LIZ("PdpBundleDealVH@7dd9.initView$1$2$2");
        try {
            aRunnableS15S0301000_26.LIZ$3();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("PdpBundleDealVH@7dd9.initView$1$2$2");
    }

    public static final void run$5(ARunnableS15S0301000_26 aRunnableS15S0301000_26) {
        boolean zLIZ;
        C1C7U.LIZ("AddressEditFragment@d406.initSubscribe$12$1");
        try {
            aRunnableS15S0301000_26.LIZ$4();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("AddressEditFragment@d406.initSubscribe$12$1");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ARunnableS15S0301000_26(int i, int i2, C450740Hlw c450740Hlw, AddressEditFragment addressEditFragment, C948003nC<C1747620vZw> c948003nC) {
        this.$t = c948003nC;
        this.i3 = i;
        this.l0 = i2;
        this.l1 = c450740Hlw;
        this.l2 = addressEditFragment;
    }
}
