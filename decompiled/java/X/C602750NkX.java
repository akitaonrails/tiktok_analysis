package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.ss.android.ugc.aweme.ecommerce.search.page.mix.IMixVSearchAbility;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0NkX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.search.lynx.spark.core.communicate.jsb.EcSearchPromotionInterfaceMethod$handle$1", f = "EcSearchPromotionInterfaceMethod.kt", l = {}, m = "invokeSuspend")
public final class C602750NkX extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ IMixVSearchAbility LL;
    public final /* synthetic */ InterfaceC602770NkZ LLILLJJLI;
    public final /* synthetic */ C602740NkW LLILLL;
    public final /* synthetic */ CompletionBlock<InterfaceC602780Nka> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C602750NkX(IMixVSearchAbility iMixVSearchAbility, InterfaceC602770NkZ interfaceC602770NkZ, C602740NkW c602740NkW, CompletionBlock<InterfaceC602780Nka> completionBlock, InterfaceC1364105Vn<? super C602750NkX> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = iMixVSearchAbility;
        this.LLILLJJLI = interfaceC602770NkZ;
        this.LLILLL = c602740NkW;
        this.LLILZ = completionBlock;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C602750NkX(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        boolean z;
        C1C7U.LIZ("EcSearchPromotionInterfaceMethod@56bb.handle$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Map<String, ? extends Object> mapX22 = this.LL.X22(this.LLILLJJLI.getPath(), this.LLILLJJLI.getMethod(), this.LLILLJJLI.getParams(), this.LLILLJJLI.getHeader());
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("handle: handleSearchPromotionInterface result = ");
        if (mapX22 != null) {
            z = true;
        } else {
            z = false;
        }
        sbLIZ.append(z);
        C2188811AlT.LIZIZ(sbLIZ);
        String containerID = null;
        if (mapX22 != null) {
            InterfaceC634840OvC interfaceC634840OvC = this.LLILLL.IBridgeSdkContext;
            if (interfaceC634840OvC != null) {
                containerID = interfaceC634840OvC.getContainerID();
            }
            InterfaceC602780Nka interfaceC602780Nka = (InterfaceC602780Nka) C1909107dp.LIZJ(InterfaceC602780Nka.class, containerID);
            interfaceC602780Nka.setRes(mapX22);
            this.LLILZ.onSuccess(interfaceC602780Nka, "");
        } else {
            C2382909Vj.LIZ(this.LLILZ, 0, "data is empty!", null, 4);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("EcSearchPromotionInterfaceMethod@56bb.handle$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
