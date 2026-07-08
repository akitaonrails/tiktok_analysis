package X;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import com.ss.android.ugc.aweme.IMultiAccountService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.Map;
import kotlin.jvm.internal.AwS394S0200000_28;

/* JADX INFO: renamed from: X.0yrK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1873720yrK extends AbstractC1873690yrH {
    public final IMultiAccountService LLILLL = (IMultiAccountService) ServiceManager.get().getService(IMultiAccountService.class);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [X.0yrG] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, final CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        Context context;
        String str;
        String str2;
        InterfaceC1873700yrI interfaceC1873700yrI = (InterfaceC1873700yrI) xBaseParamModel;
        AwS394S0200000_28 awS394S0200000_28 = new AwS394S0200000_28(completionBlock, this, 113);
        InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
        if (interfaceC634840OvC != null) {
            context = interfaceC634840OvC.getContext();
        } else {
            context = null;
        }
        Activity activityLIZ = C0XS4.LIZ(context);
        if (activityLIZ != null && (activityLIZ instanceof C19EG)) {
            if (C10EU.LJIILIIL()) {
                awS394S0200000_28.invoke("This JS Bridge cannot be triggered under the kids mode.");
                return;
            }
            if (this.LLILLL.LIZLLL()) {
                awS394S0200000_28.invoke("Cannot login due to logged in account count reaches max limit.");
                return;
            }
            C627150Oin c627150Oin = new C627150Oin();
            c627150Oin.LIZ.putBoolean("should_launch_web_url", true);
            C786410Ut5.LJJJI("after_login_schema", interfaceC1873700yrI.getCallbackUrl(), c627150Oin.LIZ);
            c627150Oin.LIZ.putBoolean("js_bridge_initiated", true);
            Bundle bundle = c627150Oin.LIZ;
            for (Map.Entry<String, Object> entry : interfaceC1873700yrI.getLoginContext().entrySet()) {
                String key = entry.getKey();
                Object value = entry.getValue();
                if (value instanceof Integer) {
                    bundle.putInt(key, ((Number) value).intValue());
                } else if (value instanceof Boolean) {
                    bundle.putBoolean(key, ((Boolean) value).booleanValue());
                } else if (value instanceof String) {
                    C786410Ut5.LJJJI(key, (String) value, bundle);
                }
            }
            ?? r10 = new C0XW2() { // from class: X.0yrG
                @Override // X.C0XW2
                public final void LIZ() {
                    CompletionBlock<InterfaceC1873670yrF> completionBlock2 = completionBlock;
                    XBaseModel xBaseModelLIZ = C1549500qQO.LIZ(InterfaceC1873670yrF.class);
                    ((InterfaceC1873670yrF) xBaseModelLIZ).setErrorCode(0);
                    completionBlock2.onSuccess((XBaseResultModel) xBaseModelLIZ, "Login flow has been successfully completed.");
                }

                @Override // X.C0XW2
                public final void LIZIZ() {
                    C1873720yrK c1873720yrK = this;
                    CompletionBlock<InterfaceC1873670yrF> completionBlock2 = completionBlock;
                    c1873720yrK.getClass();
                    XBaseModel xBaseModelLIZJ = C1909107dp.LIZJ(InterfaceC1873670yrF.class, null);
                    ((InterfaceC1873670yrF) xBaseModelLIZJ).setErrorCode(4);
                    completionBlock2.onSuccess((XBaseResultModel) xBaseModelLIZJ, "Login flow cannot be completed.");
                }
            };
            Object obj = interfaceC1873700yrI.getLoginContext().get("enter_from");
            if (obj != null && (obj instanceof String)) {
                str = (String) obj;
            } else {
                str = "jsbridge";
            }
            Object obj2 = interfaceC1873700yrI.getLoginContext().get("enter_method");
            if (obj2 != null && (obj2 instanceof String)) {
                str2 = (String) obj2;
            } else {
                str2 = "loginOrRegister";
            }
            C1909107dp.LIZJ(InterfaceC1873670yrF.class, null);
            this.LLILLL.LIZJ((C19EG) activityLIZ, str, str2, bundle, r10);
            return;
        }
        awS394S0200000_28.invoke("Current Activity should be a non-null FragmentActivity.");
    }
}
