package X;

import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwnerKt;
import com.ss.android.ugc.aweme.ecommerce.api.model.ExceptionUX;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.sku.assem.dropdown.PdpSkuPropDropdownViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.vm.PdpViewModel;
import com.ss.android.ugc.aweme.pipo.cashier.cashier.CashierKey;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.json.JSONException;

/* JADX INFO: renamed from: X.0wK0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public class C1776180wK0 extends C09AY implements InterfaceC1631630sYr {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // X.InterfaceC1631630sYr
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2, obj3, obj4);
            case 1:
                return invoke$1(this, obj, obj2, obj3, obj4);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1776180wK0(View view, PdpSkuPropDropdownViewModel pdpSkuPropDropdownViewModel, Fragment fragment, int i) {
        super(4);
        this.$t = i;
        this.l0 = view;
        this.l1 = pdpSkuPropDropdownViewModel;
        this.l2 = fragment;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1776180wK0(Function1 function1, Function1<? super C1164500gPQ, Unit> function12, C1709430uaL c1709430uaL, C1709570uaZ c1709570uaZ) {
        super(4);
        this.$t = c1709570uaZ;
        this.l0 = function1;
        this.l1 = function12;
        this.l2 = c1709430uaL;
    }

    public static final Object invoke$0(C1776180wK0 c1776180wK0, Object obj, Object obj2, Object obj3, Object obj4) throws JSONException {
        int i;
        EnumC336190DFx enumC336190DFx = (EnumC336190DFx) obj;
        String str = (String) obj3;
        String str2 = (String) obj4;
        if (obj2 != null) {
            C1227904rF.LIZ.getClass();
            String strLJI = C1227904rF.LJI(obj2);
            if (strLJI != null) {
                ((C1709570uaZ) c1776180wK0.l2).LJJJI(strLJI);
            }
            ((Function1) c1776180wK0.l0).invoke(new C1164500gPQ(enumC336190DFx, strLJI, null, 4));
            C1708030uY5.LIZ.LIZ(new C1708070uY9(((C1709430uaL) c1776180wK0.l1).LLILLJJLI.toString())).LIZJ("create_order", null);
        } else {
            CashierKey cashierKey = ((C1709430uaL) c1776180wK0.l1).LLILLJJLI;
            EnumC1707350uWz enumC1707350uWz = EnumC1707350uWz.PAY_RESULT_CLIENT_ERROR_PARAM_ERROR;
            C1707910uXt.LJIIIIZZ(cashierKey, 1, Integer.valueOf(enumC1707350uWz.getErrorCode()), enumC1707350uWz.getErrorMessage(), null, str2);
            ((Function1) c1776180wK0.l0).invoke(new C1164500gPQ(enumC336190DFx, null, str, 2));
        }
        InterfaceC1708000uY2 interfaceC1708000uY2LIZ = C1708030uY5.LIZ.LIZ(new C1708070uY9(((C1709430uaL) c1776180wK0.l1).LLILLJJLI.toString()));
        if (enumC336190DFx == EnumC336190DFx.SUCCESS) {
            i = 1;
        } else {
            i = 0;
        }
        interfaceC1708000uY2LIZ.LIZIZ("generate_payment_info", null, null, i);
        return Unit.LIZ;
    }

    public static final Object invoke$1(C1776180wK0 c1776180wK0, Object obj, Object obj2, Object obj3, Object obj4) {
        View view;
        String str = (String) obj2;
        ExceptionUX exceptionUX = (ExceptionUX) obj4;
        if (!((Boolean) obj).booleanValue()) {
            C1750820vf6 c1750820vf6 = C1750820vf6.LIZ;
            View view2 = (View) c1776180wK0.l0;
            c1750820vf6.getClass();
            C1750820vf6.LIZLLL(view2, str);
        } else {
            PdpViewModel pdpViewModelLX = ((PdpSkuPropDropdownViewModel) c1776180wK0.l1).LLILZ.lX();
            Context context = ((View) c1776180wK0.l0).getContext();
            Fragment fragment = (Fragment) c1776180wK0.l2;
            LifecycleCoroutineScope lifecycleScope = null;
            if (fragment != null) {
                view = fragment.getView();
            } else {
                view = null;
            }
            Fragment fragment2 = (Fragment) c1776180wK0.l2;
            if (fragment2 != null) {
                lifecycleScope = LifecycleOwnerKt.getLifecycleScope(fragment2);
            }
            pdpViewModelLX.tR2(context, view, str, obj3, lifecycleScope, exceptionUX);
        }
        return Unit.LIZ;
    }
}
