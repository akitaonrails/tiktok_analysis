package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ogccampaign.OgcLynxCache;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05o7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ogccampaign.jsb.OgcLynxInitialDataStoreMethodIDL$handle$1", f = "OgcLynxInitialDataStoreMethodIDL.kt", l = {}, m = "invokeSuspend")
public final class C1463305o7 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ int LLILZ;
    public final /* synthetic */ CompletionBlock<InterfaceC1464105oF> LLILZIL;
    public final /* synthetic */ C1463405o8 LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1463305o7(String str, String str2, int i, CompletionBlock<InterfaceC1464105oF> completionBlock, C1463405o8 c1463405o8, InterfaceC1364105Vn<? super C1463305o7> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = str;
        this.LLILLL = str2;
        this.LLILZ = i;
        this.LLILZIL = completionBlock;
        this.LLILZLL = c1463405o8;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1463305o7 c1463305o7 = new C1463305o7(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
        c1463305o7.LL = obj;
        return c1463305o7;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object c098200Yq;
        C1C7U.LIZ("OgcLynxInitialDataStoreMethodIDL@cf1d.handle$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        String str = this.LLILLJJLI;
        String str2 = this.LLILLL;
        try {
            OgcLynxCache.LIZ.LJI(this.LLILZ, str, str2, "jsb");
            c098200Yq = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        CompletionBlock<InterfaceC1464105oF> completionBlock = this.LLILZIL;
        C1463405o8 c1463405o8 = this.LLILZLL;
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        String containerID = null;
        if (thM5exceptionOrNullimpl == null) {
            InterfaceC634840OvC interfaceC634840OvC = c1463405o8.IBridgeSdkContext;
            if (interfaceC634840OvC != null) {
                containerID = interfaceC634840OvC.getContainerID();
            }
            completionBlock.onSuccess((XBaseResultModel) C1909107dp.LIZJ(InterfaceC1464105oF.class, containerID), "");
        } else {
            String message = thM5exceptionOrNullimpl.getMessage();
            if (message == null) {
                message = "cache put failed";
            }
            C2382909Vj.LIZ(completionBlock, 0, message, null, 4);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("OgcLynxInitialDataStoreMethodIDL@cf1d.handle$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
