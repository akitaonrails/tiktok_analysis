package X;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ss.android.ugc.aweme.IMandatoryLoginService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.journey.INUJRevampService;
import com.ss.android.ugc.aweme.journey.step.push.PushPermissionBackgroundFragment;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS572S0100000_28;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0zrW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
@C09DV(c = "com.ss.android.ugc.aweme.journey.step.push.PushPermissionBackgroundFragment$checkAndCompletePageWithExitTransition$1", f = "PushPermissionBackgroundFragment.kt", l = {333}, m = "invokeSuspend")
public final class C1912280zrW extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ PushPermissionBackgroundFragment LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1912280zrW(PushPermissionBackgroundFragment pushPermissionBackgroundFragment, InterfaceC1364105Vn<? super C1912280zrW> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = pushPermissionBackgroundFragment;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1912280zrW(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C19EG activity;
        Boolean boolValueOf;
        C1C7U.LIZ("PushPermissionBackgroundFragment@3adb.checkAndCompletePageWithExitTransition$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            INUJRevampService iNUJRevampService = (INUJRevampService) PluggableExtentionKt.pluggableSpi$default(INUJRevampService.class, false, false, false, 14, null);
            if (iNUJRevampService != null && iNUJRevampService.LIZ(false) && (activity = this.LLILLJJLI.getActivity()) != null) {
                IMandatoryLoginService iMandatoryLoginService = (IMandatoryLoginService) PluggableExtentionKt.pluggableSpi$default(IMandatoryLoginService.class, false, false, false, 14, null);
                if (iMandatoryLoginService != null) {
                    boolValueOf = Boolean.valueOf(iMandatoryLoginService.reorderToFront(activity));
                } else {
                    boolValueOf = null;
                }
                if (Intrinsics.LJFF(boolValueOf, true)) {
                    this.LL = 1;
                    if (AnonymousClass0958.LIZIZ(2000L, this) == objLJFF) {
                        C1C7U.LIZIZ("PushPermissionBackgroundFragment@3adb.checkAndCompletePageWithExitTransition$1");
                        return objLJFF;
                    }
                }
            }
        }
        this.LLILLJJLI.getClass();
        C19233810Mm.LIZ.getClass();
        if (Intrinsics.LJFF(((C19233310Mh) C19233810Mm.LIZ(C19233310Mh.class)).LJFF(), "revamp_skip")) {
            PushPermissionBackgroundFragment pushPermissionBackgroundFragment = this.LLILLJJLI;
            pushPermissionBackgroundFragment.LLJJIJIL = true;
            pushPermissionBackgroundFragment.NR(null);
        } else {
            PushPermissionBackgroundFragment pushPermissionBackgroundFragment2 = this.LLILLJJLI;
            View viewFindViewById = pushPermissionBackgroundFragment2.LLJI;
            if (viewFindViewById == null) {
                View view = pushPermissionBackgroundFragment2.getView();
                if (view != null) {
                    viewFindViewById = view.findViewById(R.id.tqy);
                } else {
                    viewFindViewById = null;
                }
                pushPermissionBackgroundFragment2.LLJI = (ConstraintLayout) viewFindViewById;
            }
            C420060GdY.LIZ((ConstraintLayout) viewFindViewById, null, false, new AwS572S0100000_28(this.LLILLJJLI, 278), 26);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PushPermissionBackgroundFragment@3adb.checkAndCompletePageWithExitTransition$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
