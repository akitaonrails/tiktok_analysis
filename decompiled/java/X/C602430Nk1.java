package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.ss.android.ugc.aweme.ecommerce.search.page.mix.IMixVSearchAbility;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Nk1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.search.lynx.spark.core.communicate.jsb.EcSearchFetchInsertCardMethod$handle$1", f = "EcSearchFetchInsertCardMethod.kt", l = {}, m = "invokeSuspend")
public final class C602430Nk1 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ IMixVSearchAbility LL;
    public final /* synthetic */ Map<String, String> LLILLJJLI;
    public final /* synthetic */ C602450Nk3 LLILLL;
    public final /* synthetic */ CompletionBlock<InterfaceC602420Nk0> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C602430Nk1(IMixVSearchAbility iMixVSearchAbility, Map<String, String> map, C602450Nk3 c602450Nk3, CompletionBlock<InterfaceC602420Nk0> completionBlock, InterfaceC1364105Vn<? super C602430Nk1> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = iMixVSearchAbility;
        this.LLILLJJLI = map;
        this.LLILLL = c602450Nk3;
        this.LLILZ = completionBlock;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C602430Nk1(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("EcSearchFetchInsertCardMethod@52be.handle$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Map<String, ? extends Object> mapSu = this.LL.Su(this.LLILLJJLI);
        String containerID = null;
        if (mapSu != null) {
            InterfaceC634840OvC interfaceC634840OvC = this.LLILLL.IBridgeSdkContext;
            if (interfaceC634840OvC != null) {
                containerID = interfaceC634840OvC.getContainerID();
            }
            InterfaceC602420Nk0 interfaceC602420Nk0 = (InterfaceC602420Nk0) C1909107dp.LIZJ(InterfaceC602420Nk0.class, containerID);
            interfaceC602420Nk0.setRawData(mapSu);
            this.LLILZ.onSuccess(interfaceC602420Nk0, "");
        } else {
            C2382909Vj.LIZ(this.LLILZ, -1, "data is empty!", null, 4);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("EcSearchFetchInsertCardMethod@52be.handle$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
