package X;

import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.dynamic.card.data.MessageSubmitResponse;
import com.ss.android.ugc.aweme.im.message.template.card.DynamicCardTemplate;
import com.ss.android.ugc.aweme.im.message.template.card.dynamic.DynamicInfoComponent;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS123S1100000_9;
import njp.a;

/* JADX INFO: renamed from: X.0Nit, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.dynamic.card.jsb.RequestServerMsgDataMethodIDL$handle$2", f = "RequestServerMsgDataMethodIDL.kt", l = {43}, m = "invokeSuspend")
public final class C601730Nit extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ InterfaceC601760Niw LLILLJJLI;
    public final /* synthetic */ CompletionBlock<InterfaceC601770Nix> LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ C601490NiV LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C601730Nit(InterfaceC601760Niw interfaceC601760Niw, CompletionBlock<InterfaceC601770Nix> completionBlock, String str, C601490NiV c601490NiV, InterfaceC1364105Vn<? super C601730Nit> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = interfaceC601760Niw;
        this.LLILLL = completionBlock;
        this.LLILZ = str;
        this.LLILZIL = c601490NiV;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C601730Nit(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object c098200Yq;
        long jLongValue;
        C1C7U.LIZ("RequestServerMsgDataMethodIDL@b6a3.handle$2");
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
                Map<String, ? extends Object> requestParams = this.LLILLJJLI.getRequestParams();
                this.LL = 1;
                obj = ((InterfaceC324690Co7) ((C1566106Bf) C0I0B.LJFF.LIZLLL()).LIZJ(InterfaceC324690Co7.class, "tiktok/v1/")).LIZ(requestParams, this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("RequestServerMsgDataMethodIDL@b6a3.handle$2");
                    return objLJFF;
                }
            }
            final MessageSubmitResponse messageSubmitResponse = (MessageSubmitResponse) obj;
            String clientMsgId = this.LLILLJJLI.getClientMsgId();
            try {
                c098200Yq = C2286608xc.LJFF(CastLongProtector.parseLong(this.LLILLJJLI.getServerMsgId()));
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
            final C869590Y9l c869590Y9lLIZ = C601720Nis.LIZ(jLongValue, clientMsgId);
            if (c869590Y9lLIZ == null) {
                CompletionBlock<InterfaceC601770Nix> completionBlock = this.LLILLL;
                XBaseResultModel xBaseResultModel = (XBaseResultModel) C1909107dp.LIZJ(InterfaceC601770Nix.class, this.LLILZ);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("error - ");
                sbLIZ.append("msg doesn't exist in db");
                C2188811AlT.LIZIZ(sbLIZ);
                completionBlock.onFailure(0, "msg doesn't exist in db", xBaseResultModel);
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("RequestServerMsgDataMethodIDL@b6a3.handle$2");
                return unit;
            }
            c869590Y9lLIZ.setContentPB(messageSubmitResponse.contentPb);
            InterfaceC874680YTa interfaceC874680YTaLIZ = C0YNY.LIZ(InterfaceC874680YTa.LIZ);
            C0Y3I c0y3i = new C0Y3I(String.valueOf(C13LE.LIZ(this.LLILZIL.getClass()).LJI()));
            final CompletionBlock<InterfaceC601770Nix> completionBlock2 = this.LLILLL;
            final String str = this.LLILZ;
            interfaceC874680YTaLIZ.LJJIIZ(c0y3i, c869590Y9lLIZ, new InterfaceC863600XuI<C869590Y9l>() { // from class: X.0Niu
                @Override // X.InterfaceC863600XuI
                public final void LIZIZ(C0YMW c0ymw) {
                    String statusMsg;
                    CompletionBlock<InterfaceC601770Nix> completionBlock3 = completionBlock2;
                    String str2 = str;
                    if (c0ymw != null) {
                        statusMsg = c0ymw.getStatusMsg();
                    } else {
                        statusMsg = null;
                    }
                    XBaseResultModel xBaseResultModel2 = (XBaseResultModel) C1909107dp.LIZJ(InterfaceC601770Nix.class, str2);
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("error - ");
                    sbLIZ2.append(statusMsg);
                    C2188811AlT.LIZIZ(sbLIZ2);
                    if (statusMsg == null) {
                        statusMsg = "";
                    }
                    completionBlock3.onFailure(0, statusMsg, xBaseResultModel2);
                }

                @Override // X.InterfaceC863600XuI
                public final void onSuccess(C869590Y9l c869590Y9l) {
                    String str2;
                    DynamicInfoComponent dynamicInfoComponent;
                    try {
                        DynamicCardTemplate dynamicCardTemplate = (DynamicCardTemplate) C2241931Cox.LIZJ(c869590Y9lLIZ, DynamicCardTemplate.class);
                        if (dynamicCardTemplate != null && (dynamicInfoComponent = dynamicCardTemplate.dynamicInfo) != null) {
                            str2 = dynamicInfoComponent.rawData;
                        } else {
                            str2 = null;
                        }
                        CompletionBlock<InterfaceC601770Nix> completionBlock3 = completionBlock2;
                        String str3 = str;
                        AwS123S1100000_9 awS123S1100000_9 = new AwS123S1100000_9(str2, messageSubmitResponse, 15);
                        XBaseResultModel xBaseResultModel2 = (XBaseResultModel) C1909107dp.LIZJ(InterfaceC601770Nix.class, str3);
                        awS123S1100000_9.invoke(xBaseResultModel2);
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("success - ");
                        sbLIZ2.append((String) null);
                        C2188811AlT.LIZIZ(sbLIZ2);
                        completionBlock3.onSuccess(xBaseResultModel2, "");
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        CompletionBlock<InterfaceC601770Nix> completionBlock4 = completionBlock2;
                        XBaseResultModel xBaseResultModel3 = (XBaseResultModel) C1909107dp.LIZJ(InterfaceC601770Nix.class, str);
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append("error - ");
                        sbLIZ3.append("msg parse error");
                        C2188811AlT.LIZIZ(sbLIZ3);
                        completionBlock4.onFailure(0, "msg parse error", xBaseResultModel3);
                    }
                }
            });
            Unit unit2 = Unit.LIZ;
            C1C7U.LIZIZ("RequestServerMsgDataMethodIDL@b6a3.handle$2");
            return unit2;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            CompletionBlock<InterfaceC601770Nix> completionBlock3 = this.LLILLL;
            String str2 = this.LLILZ;
            String message = e.getMessage();
            XBaseResultModel xBaseResultModel2 = (XBaseResultModel) C1909107dp.LIZJ(InterfaceC601770Nix.class, str2);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("error - ");
            sbLIZ2.append(message);
            C2188811AlT.LIZIZ(sbLIZ2);
            if (message == null) {
                message = "";
            }
            completionBlock3.onFailure(0, message, xBaseResultModel2);
            Unit unit3 = Unit.LIZ;
            C1C7U.LIZIZ("RequestServerMsgDataMethodIDL@b6a3.handle$2");
            return unit3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
