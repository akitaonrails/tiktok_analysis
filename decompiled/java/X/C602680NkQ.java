package X;

import android.view.View;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.search.page.mix.IMixVSearchAbility;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0NkQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.search.lynx.spark.core.communicate.jsb.EcSearchMixPromotionCloseMethod$handle$1", f = "EcSearchMixPromotionCloseMethod.kt", l = {27}, m = "invokeSuspend")
public final class C602680NkQ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C602670NkP LLILLJJLI;
    public final /* synthetic */ IMixVSearchAbility LLILLL;
    public final /* synthetic */ InterfaceC602730NkV LLILZ;
    public final /* synthetic */ CompletionBlock<InterfaceC602710NkT> LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C602680NkQ(C602670NkP c602670NkP, IMixVSearchAbility iMixVSearchAbility, InterfaceC602730NkV interfaceC602730NkV, CompletionBlock<InterfaceC602710NkT> completionBlock, InterfaceC1364105Vn<? super C602680NkQ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c602670NkP;
        this.LLILLL = iMixVSearchAbility;
        this.LLILZ = interfaceC602730NkV;
        this.LLILZIL = completionBlock;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C602680NkQ(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        View view;
        String itemId;
        Integer numLJ;
        Number bizType;
        String containerID;
        C1C7U.LIZ("EcSearchMixPromotionCloseMethod@72c.handle$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        String containerID2 = null;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(obj);
            } else {
                C155000ia.LIZIZ(obj);
                InterfaceC634840OvC interfaceC634840OvC = this.LLILLJJLI.IBridgeSdkContext;
                if (interfaceC634840OvC != null) {
                    view = interfaceC634840OvC.getView();
                } else {
                    view = null;
                }
                IMixVSearchAbility iMixVSearchAbility = this.LLILLL;
                String type = this.LLILZ.getType();
                InterfaceC602700NkS extraParams = this.LLILZ.getExtraParams();
                if (extraParams != null) {
                    itemId = extraParams.getItemId();
                } else {
                    itemId = null;
                }
                InterfaceC602700NkS extraParams2 = this.LLILZ.getExtraParams();
                if (extraParams2 != null && (bizType = extraParams2.getBizType()) != null) {
                    numLJ = C2286608xc.LJ(bizType.intValue());
                } else {
                    numLJ = null;
                }
                this.LL = 1;
                if (iMixVSearchAbility.XW(view, type, itemId, numLJ, this) == objLJFF) {
                    C1C7U.LIZIZ("EcSearchMixPromotionCloseMethod@72c.handle$1");
                    return objLJFF;
                }
            }
            InterfaceC634840OvC interfaceC634840OvC2 = this.LLILLJJLI.IBridgeSdkContext;
            if (interfaceC634840OvC2 != null) {
                containerID = interfaceC634840OvC2.getContainerID();
            } else {
                containerID = null;
            }
            XBaseModel xBaseModelLIZJ = C1909107dp.LIZJ(InterfaceC602710NkT.class, containerID);
            ((InterfaceC602710NkT) xBaseModelLIZJ).setSuccess(true);
            this.LLILZIL.onSuccess((InterfaceC602710NkT) xBaseModelLIZJ, "");
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            InterfaceC634840OvC interfaceC634840OvC3 = this.LLILLJJLI.IBridgeSdkContext;
            if (interfaceC634840OvC3 != null) {
                containerID2 = interfaceC634840OvC3.getContainerID();
            }
            InterfaceC602710NkT interfaceC602710NkT = (InterfaceC602710NkT) C1909107dp.LIZJ(InterfaceC602710NkT.class, containerID2);
            interfaceC602710NkT.setSuccess(false);
            this.LLILZIL.onSuccess(interfaceC602710NkT, "");
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("EcSearchMixPromotionCloseMethod@72c.handle$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
