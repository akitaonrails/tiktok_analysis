package X;

import android.content.Context;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05oW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.bullet.bridge.ad.GetAdDeviceIdentifierMethodIDL$handle$1", f = "GetAdDeviceIdentifierMethodIDL.kt", l = {46}, m = "invokeSuspend")
public final class C1465805oW extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C1466305ob LLILLJJLI;
    public final /* synthetic */ CompletionBlock<InterfaceC1465905oX> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1465805oW(C1466305ob c1466305ob, CompletionBlock<InterfaceC1465905oX> completionBlock, InterfaceC1364105Vn<? super C1465805oW> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1466305ob;
        this.LLILLL = completionBlock;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1465805oW(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object c098200Yq;
        String containerID;
        Context contextLIZ;
        C1C7U.LIZ("GetAdDeviceIdentifierMethodIDL@4dc5.handle$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(obj);
            } else {
                C155000ia.LIZIZ(obj);
                InterfaceC634840OvC interfaceC634840OvC = this.LLILLJJLI.IBridgeSdkContext;
                if (interfaceC634840OvC == null || (contextLIZ = interfaceC634840OvC.getContext()) == null) {
                    C844470XAv.LIZ.getClass();
                    contextLIZ = C844470XAv.LIZ();
                }
                this.LL = 1;
                obj = C23250099c.LJI(this, C0PEM.LIZJ, new C15443062v(contextLIZ, null));
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("GetAdDeviceIdentifierMethodIDL@4dc5.handle$1");
                    return objLJFF;
                }
            }
            c098200Yq = (String) obj;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        CompletionBlock<InterfaceC1465905oX> completionBlock = this.LLILLL;
        C1466305ob c1466305ob = this.LLILLJJLI;
        if (C189200o6.m8isSuccessimpl(c098200Yq)) {
            String str = (String) c098200Yq;
            if (str == null) {
                C2382909Vj.LIZ(completionBlock, 0, "gaid return null", null, 4);
            } else {
                InterfaceC634840OvC interfaceC634840OvC2 = c1466305ob.IBridgeSdkContext;
                if (interfaceC634840OvC2 != null) {
                    containerID = interfaceC634840OvC2.getContainerID();
                } else {
                    containerID = null;
                }
                XBaseModel xBaseModelLIZJ = C1909107dp.LIZJ(InterfaceC1465905oX.class, containerID);
                ((InterfaceC1465905oX) xBaseModelLIZJ).setIdentifier(str);
                completionBlock.onSuccess((XBaseResultModel) xBaseModelLIZJ, "");
            }
        }
        CompletionBlock<InterfaceC1465905oX> completionBlock2 = this.LLILLL;
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            String message = thM5exceptionOrNullimpl.getMessage();
            if (message == null) {
                message = "";
            }
            C2382909Vj.LIZ(completionBlock2, 0, message, null, 4);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("GetAdDeviceIdentifierMethodIDL@4dc5.handle$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
