package X;

import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.im.message.template.card.DynamicCardTemplate;
import com.ss.android.ugc.aweme.im.message.template.card.dynamic.DynamicInfoComponent;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Niq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.dynamic.card.jsb.RewriteMsgDataMethod$handle$2", f = "RewriteMsgDataMethod.kt", l = {}, m = "invokeSuspend")
public final class C601700Niq extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ InterfaceC601610Nih LL;
    public final /* synthetic */ CompletionBlock<InterfaceC601460NiS> LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ C601450NiR LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C601700Niq(InterfaceC601610Nih interfaceC601610Nih, CompletionBlock<InterfaceC601460NiS> completionBlock, String str, C601450NiR c601450NiR, InterfaceC1364105Vn<? super C601700Niq> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = interfaceC601610Nih;
        this.LLILLJJLI = completionBlock;
        this.LLILLL = str;
        this.LLILZ = c601450NiR;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C601700Niq(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object c098200Yq;
        long jLongValue;
        C1C7U.LIZ("RewriteMsgDataMethod@8313.handle$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        String clientMsgId = this.LL.getClientMsgId();
        try {
            c098200Yq = C2286608xc.LJFF(CastLongProtector.parseLong(this.LL.getServerMsgId()));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        Long l = (Long) c098200Yq;
        if (l != null) {
            jLongValue = l.longValue();
        } else {
            jLongValue = -1;
        }
        C869590Y9l c869590Y9lLIZ = C601720Nis.LIZ(jLongValue, clientMsgId);
        if (c869590Y9lLIZ == null) {
            CompletionBlock<InterfaceC601460NiS> completionBlock = this.LLILLJJLI;
            XBaseResultModel xBaseResultModel = (XBaseResultModel) C1909107dp.LIZJ(InterfaceC601460NiS.class, this.LLILLL);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("error - ");
            sbLIZ.append("msg doesn't exist in db");
            C2188811AlT.LIZIZ(sbLIZ);
            completionBlock.onFailure(0, "msg doesn't exist in db", xBaseResultModel);
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("RewriteMsgDataMethod@8313.handle$2");
            return unit;
        }
        DynamicCardTemplate dynamicCardTemplate = (DynamicCardTemplate) C2241931Cox.LIZJ(c869590Y9lLIZ, DynamicCardTemplate.class);
        if (dynamicCardTemplate == null) {
            CompletionBlock<InterfaceC601460NiS> completionBlock2 = this.LLILLJJLI;
            XBaseResultModel xBaseResultModel2 = (XBaseResultModel) C1909107dp.LIZJ(InterfaceC601460NiS.class, this.LLILLL);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("error - ");
            sbLIZ2.append("msg parse error");
            C2188811AlT.LIZIZ(sbLIZ2);
            completionBlock2.onFailure(0, "msg parse error", xBaseResultModel2);
            Unit unit2 = Unit.LIZ;
            C1C7U.LIZIZ("RewriteMsgDataMethod@8313.handle$2");
            return unit2;
        }
        DynamicInfoComponent dynamicInfoComponent = dynamicCardTemplate.dynamicInfo;
        if (dynamicInfoComponent != null) {
            dynamicInfoComponent.rawData = this.LL.getRawData();
        }
        c869590Y9lLIZ.setContentPB(dynamicCardTemplate.encode());
        InterfaceC874680YTa interfaceC874680YTaLIZ = C0YNY.LIZ(InterfaceC874680YTa.LIZ);
        C0Y3I c0y3i = new C0Y3I(String.valueOf(C13LE.LIZ(this.LLILZ.getClass()).LJI()));
        final CompletionBlock<InterfaceC601460NiS> completionBlock3 = this.LLILLJJLI;
        final String str = this.LLILLL;
        interfaceC874680YTaLIZ.LJJIIZ(c0y3i, c869590Y9lLIZ, new InterfaceC863600XuI<C869590Y9l>() { // from class: X.0Nir
            @Override // X.InterfaceC863600XuI
            public final void LIZIZ(C0YMW c0ymw) {
                String statusMsg;
                CompletionBlock<InterfaceC601460NiS> completionBlock4 = completionBlock3;
                String str2 = str;
                if (c0ymw != null) {
                    statusMsg = c0ymw.getStatusMsg();
                } else {
                    statusMsg = null;
                }
                XBaseResultModel xBaseResultModel3 = (XBaseResultModel) C1909107dp.LIZJ(InterfaceC601460NiS.class, str2);
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("error - ");
                sbLIZ3.append(statusMsg);
                C2188811AlT.LIZIZ(sbLIZ3);
                if (statusMsg == null) {
                    statusMsg = "";
                }
                completionBlock4.onFailure(0, statusMsg, xBaseResultModel3);
            }

            @Override // X.InterfaceC863600XuI
            public final void onSuccess(C869590Y9l c869590Y9l) {
                CompletionBlock<InterfaceC601460NiS> completionBlock4 = completionBlock3;
                XBaseResultModel xBaseResultModel3 = (XBaseResultModel) C1909107dp.LIZJ(InterfaceC601460NiS.class, str);
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("success - ");
                sbLIZ3.append((String) null);
                C2188811AlT.LIZIZ(sbLIZ3);
                completionBlock4.onSuccess(xBaseResultModel3, "");
            }
        });
        Unit unit3 = Unit.LIZ;
        C1C7U.LIZIZ("RewriteMsgDataMethod@8313.handle$2");
        return unit3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
