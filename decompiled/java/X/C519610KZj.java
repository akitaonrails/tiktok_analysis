package X;

import android.app.Activity;
import androidx.activity.ComponentActivity;
import androidx.cardview.widget.CardView;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0KZj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommercelive.audience.common.business.hybrid.jsb.impl.EndLiveFloatWindowMethod$handle$1$1", f = "EndLiveFloatWindowMethod.kt", l = {}, m = "invokeSuspend")
public final class C519610KZj extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C519630KZl LLILLJJLI;
    public final /* synthetic */ InterfaceC519640KZm LLILLL;
    public final /* synthetic */ CompletionBlock<InterfaceC519650KZn> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C519610KZj(C519630KZl c519630KZl, InterfaceC519640KZm interfaceC519640KZm, CompletionBlock<InterfaceC519650KZn> completionBlock, InterfaceC1364105Vn<? super C519610KZj> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c519630KZl;
        this.LLILLL = interfaceC519640KZm;
        this.LLILZ = completionBlock;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C519610KZj c519610KZj = new C519610KZj(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
        c519610KZj.LL = obj;
        return c519610KZj;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Activity activityLIZLLL;
        ComponentActivity componentActivity;
        C519740KZw c519740KZw;
        InterfaceC519660KZo delegate;
        C1C7U.LIZ("EndLiveFloatWindowMethod@2784.handle$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        InterfaceC634840OvC interfaceC634840OvC = this.LLILLJJLI.IBridgeSdkContext;
        if (interfaceC634840OvC != null) {
            activityLIZLLL = interfaceC634840OvC.LIZLLL();
        } else {
            activityLIZLLL = null;
        }
        if (activityLIZLLL instanceof ComponentActivity) {
            componentActivity = (ComponentActivity) activityLIZLLL;
        } else {
            componentActivity = null;
        }
        if (componentActivity != null) {
            InterfaceC519640KZm interfaceC519640KZm = this.LLILLL;
            CompletionBlock<InterfaceC519650KZn> completionBlock = this.LLILZ;
            if (C123100dR.LIZ(interfaceC519640KZm.getId()) && !Intrinsics.LJFF(String.valueOf(componentActivity.hashCode()), interfaceC519640KZm.getId())) {
                C2382909Vj.LIZ(completionBlock, 0, "id invalid!!", null, 4);
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("EndLiveFloatWindowMethod@2784.handle$1$1");
                return unit;
            }
            C473630Ihl c473630IhlLJJJJJL = ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).k4().LJJJJJL();
            if (c473630IhlLJJJJJL != null && c473630IhlLJJJJJL.LIZ(componentActivity, null, null) && Intrinsics.LJFF(interfaceC519640KZm.getSmallWindowType(), C2286608xc.LJ(1))) {
                c473630IhlLJJJJJL.LIZJ();
                Boolean boolIsMute = interfaceC519640KZm.isMute();
                if (boolIsMute != null) {
                    c473630IhlLJJJJJL.LIZLLL(boolIsMute.booleanValue());
                }
            }
            Boolean onlyHide = interfaceC519640KZm.getOnlyHide();
            Boolean boolIsMute2 = interfaceC519640KZm.isMute();
            CardView cardView = (CardView) C786410Ut5.oe(componentActivity, R.id.gi8);
            if ((cardView instanceof C519740KZw) && (c519740KZw = (C519740KZw) cardView) != null && (delegate = c519740KZw.getDelegate()) != null) {
                Boolean bool = Boolean.TRUE;
                if (Intrinsics.LJFF(onlyHide, bool)) {
                    delegate.LIZIZ(false);
                } else {
                    delegate.LIZ();
                }
                if (Intrinsics.LJFF(boolIsMute2, bool)) {
                    delegate.m0(true);
                }
            }
            XBaseModel xBaseModelLIZJ = C1909107dp.LIZJ(InterfaceC519650KZn.class, null);
            ((InterfaceC519650KZn) xBaseModelLIZJ).setCode(C2286608xc.LJ(1));
            completionBlock.onSuccess((XBaseResultModel) xBaseModelLIZJ, "success");
        } else {
            C2382909Vj.LIZ(this.LLILZ, 0, "context is null!!", null, 4);
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("EndLiveFloatWindowMethod@2784.handle$1$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
