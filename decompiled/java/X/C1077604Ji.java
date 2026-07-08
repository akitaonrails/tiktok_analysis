package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.android.btm.api.model.PageFinder;
import com.ss.android.ugc.aweme.ecommerce.api.model.ExceptionUX;
import com.ss.android.ugc.aweme.ecommerce.base.osp.bottom.MiniOspBottomWidget;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.ui.SeaPdpFragment;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.vm.SeaPdpViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.PdpFragment;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.vm.PdpViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.sku.sea.widget.SkuPanelBaseWidget;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.AwS12S0401000_1;
import kotlin.jvm.internal.AwS367S0200000_1;

/* JADX INFO: renamed from: X.04Ji, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class C1077604Ji extends C09AY implements InterfaceC1631630sYr {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // X.InterfaceC1631630sYr
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2, obj3, obj4);
            case 1:
                return invoke$1(this, obj, obj2, obj3, obj4);
            case 2:
                return invoke$2(this, obj, obj2, obj3, obj4);
            case 3:
                return invoke$3(this, obj, obj2, obj3, obj4);
            case 4:
                return invoke$4(this, obj, obj2, obj3, obj4);
            case 5:
                return invoke$5(this, obj, obj2, obj3, obj4);
            case 6:
                return invoke$6(this, obj, obj2, obj3, obj4);
            case 7:
                return invoke$7(this, obj, obj2, obj3, obj4);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1077604Ji(C817903Hl c817903Hl, C013C c013c, int i) {
        super(4);
        this.$t = i;
        this.l0 = c817903Hl;
        this.l1 = c013c;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1077604Ji(View view, C04H5 c04h5, int i) {
        super(4);
        this.$t = i;
        this.l0 = view;
        this.l1 = c04h5;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1077604Ji(View view, SeaPdpFragment seaPdpFragment, int i) {
        super(4);
        this.$t = i;
        this.l0 = view;
        this.l1 = seaPdpFragment;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1077604Ji(View view, PdpFragment pdpFragment, int i) {
        super(4);
        this.$t = i;
        this.l0 = view;
        this.l1 = pdpFragment;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1077604Ji(ViewGroup viewGroup, C04CY c04cy, int i) {
        super(4);
        this.$t = i;
        this.l0 = viewGroup;
        this.l1 = c04cy;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1077604Ji(ViewGroup viewGroup, C04CZ c04cz, int i) {
        super(4);
        this.$t = i;
        this.l0 = viewGroup;
        this.l1 = c04cz;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1077604Ji(MiniOspBottomWidget miniOspBottomWidget, View view, int i) {
        super(4);
        this.$t = i;
        this.l0 = miniOspBottomWidget;
        this.l1 = view;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1077604Ji(SkuPanelBaseWidget skuPanelBaseWidget, SkuPanelBaseWidget skuPanelBaseWidget2, List<String> list) {
        super(4);
        this.$t = list;
        this.l0 = skuPanelBaseWidget;
        this.l1 = skuPanelBaseWidget2;
    }

    public static final Object invoke$0(C1077604Ji c1077604Ji, Object obj, Object obj2, Object obj3, Object obj4) {
        ((Boolean) obj3).booleanValue();
        MiniOspBottomWidget miniOspBottomWidget = (MiniOspBottomWidget) c1077604Ji.l0;
        miniOspBottomWidget.withState(miniOspBottomWidget.kp(), new AwS367S0200000_1(miniOspBottomWidget, (View) c1077604Ji.l1, 255));
        return Unit.LIZ;
    }

    public static final Object invoke$1(C1077604Ji c1077604Ji, Object obj, Object obj2, Object obj3, Object obj4) {
        int iIntValue = ((Number) obj2).intValue();
        SkuPanelBaseWidget skuPanelBaseWidget = (SkuPanelBaseWidget) c1077604Ji.l0;
        skuPanelBaseWidget.withState(skuPanelBaseWidget.LJII(), new AwS12S0401000_1(iIntValue, (int) c1077604Ji.l1, (List<String>) obj, (View) obj4, (PageFinder) c1077604Ji.l0, (SkuPanelBaseWidget) 1));
        return Unit.LIZ;
    }

    public static final Object invoke$2(C1077604Ji c1077604Ji, Object obj, Object obj2, Object obj3, Object obj4) {
        View viewLIZ;
        String str = (String) obj2;
        ExceptionUX exceptionUX = (ExceptionUX) obj4;
        if (!((Boolean) obj).booleanValue()) {
            C1750820vf6 c1750820vf6 = C1750820vf6.LIZ;
            View view = (View) c1077604Ji.l0;
            c1750820vf6.getClass();
            C1750820vf6.LIZLLL(view, str);
        } else {
            SeaPdpViewModel seaPdpViewModelFS = ((SeaPdpFragment) c1077604Ji.l1).FS();
            Context context = ((View) c1077604Ji.l0).getContext();
            C1058404By c1058404By = ((SeaPdpFragment) c1077604Ji.l1).FS().LLZZ;
            if (c1058404By != null) {
                viewLIZ = c1058404By.LIZ();
            } else {
                viewLIZ = null;
            }
            seaPdpViewModelFS.xR2(context, viewLIZ, str, obj3, LifecycleOwnerKt.getLifecycleScope((SeaPdpFragment) c1077604Ji.l1), exceptionUX);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$3(C1077604Ji c1077604Ji, Object obj, Object obj2, Object obj3, Object obj4) {
        LifecycleCoroutineScope lifecycleScope;
        String str = (String) obj2;
        if (!((Boolean) obj).booleanValue()) {
            C1750820vf6 c1750820vf6 = C1750820vf6.LIZ;
            View view = (View) c1077604Ji.l0;
            c1750820vf6.getClass();
            C1750820vf6.LIZLLL(view, str);
        } else {
            PdpViewModel pdpViewModelJS = ((PdpFragment) c1077604Ji.l1).JS();
            Context context = ((View) c1077604Ji.l0).getContext();
            View view2 = (View) c1077604Ji.l0;
            LifecycleOwner lifecycleOwnerLIZ = C948503nH.LIZ(view2);
            if (lifecycleOwnerLIZ != null) {
                lifecycleScope = LifecycleOwnerKt.getLifecycleScope(lifecycleOwnerLIZ);
            } else {
                lifecycleScope = null;
            }
            pdpViewModelJS.tR2(context, view2, str, obj3, lifecycleScope, null);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$4(C1077604Ji c1077604Ji, Object obj, Object obj2, Object obj3, Object obj4) {
        View viewLIZ;
        String str = (String) obj2;
        if (!((Boolean) obj).booleanValue()) {
            C1750820vf6 c1750820vf6 = C1750820vf6.LIZ;
            View view = (View) c1077604Ji.l0;
            c1750820vf6.getClass();
            C1750820vf6.LIZLLL(view, str);
        } else {
            PdpViewModel pdpViewModel = ((C04H5) c1077604Ji.l1).LIZ;
            Context context = ((View) c1077604Ji.l0).getContext();
            C04GX c04gx = ((C04H5) c1077604Ji.l1).LIZ.l;
            if (c04gx != null) {
                viewLIZ = c04gx.LIZ();
            } else {
                viewLIZ = null;
            }
            pdpViewModel.tR2(context, viewLIZ, str, obj3, null, null);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$5(C1077604Ji c1077604Ji, Object obj, Object obj2, Object obj3, Object obj4) {
        View viewLIZ;
        LifecycleCoroutineScope lifecycleScope;
        String str = (String) obj2;
        if (!((Boolean) obj).booleanValue()) {
            C1750820vf6 c1750820vf6 = C1750820vf6.LIZ;
            ViewGroup viewGroup = (ViewGroup) c1077604Ji.l0;
            c1750820vf6.getClass();
            C1750820vf6.LIZLLL(viewGroup, str);
        } else {
            PdpViewModel pdpViewModel = ((C04CY) c1077604Ji.l1).LIZ;
            Context context = ((ViewGroup) c1077604Ji.l0).getContext();
            C04GX c04gx = ((C04CY) c1077604Ji.l1).LIZ.l;
            if (c04gx != null) {
                viewLIZ = c04gx.LIZ();
            } else {
                viewLIZ = null;
            }
            LifecycleOwner lifecycleOwnerLIZ = C948503nH.LIZ((ViewGroup) c1077604Ji.l0);
            if (lifecycleOwnerLIZ != null) {
                lifecycleScope = LifecycleOwnerKt.getLifecycleScope(lifecycleOwnerLIZ);
            } else {
                lifecycleScope = null;
            }
            pdpViewModel.tR2(context, viewLIZ, str, obj3, lifecycleScope, null);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$6(C1077604Ji c1077604Ji, Object obj, Object obj2, Object obj3, Object obj4) {
        View viewLIZ;
        LifecycleCoroutineScope lifecycleScope;
        String str = (String) obj2;
        if (!((Boolean) obj).booleanValue()) {
            C1750820vf6 c1750820vf6 = C1750820vf6.LIZ;
            ViewGroup viewGroup = (ViewGroup) c1077604Ji.l0;
            c1750820vf6.getClass();
            C1750820vf6.LIZLLL(viewGroup, str);
        } else {
            SeaPdpViewModel seaPdpViewModel = ((C04CZ) c1077604Ji.l1).LIZ;
            Context context = ((ViewGroup) c1077604Ji.l0).getContext();
            C1058404By c1058404By = ((C04CZ) c1077604Ji.l1).LIZ.LLZZ;
            if (c1058404By != null) {
                viewLIZ = c1058404By.LIZ();
            } else {
                viewLIZ = null;
            }
            LifecycleOwner lifecycleOwnerLIZ = C948503nH.LIZ((ViewGroup) c1077604Ji.l0);
            if (lifecycleOwnerLIZ != null) {
                lifecycleScope = LifecycleOwnerKt.getLifecycleScope(lifecycleOwnerLIZ);
            } else {
                lifecycleScope = null;
            }
            seaPdpViewModel.xR2(context, viewLIZ, str, obj3, lifecycleScope, null);
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00c4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$7(X.C1077604Ji r13, java.lang.Object r14, java.lang.Object r15, java.lang.Object r16, java.lang.Object r17) {
        /*
            Method dump skipped, instruction units count: 224
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1077604Ji.invoke$7(X.04Ji, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
