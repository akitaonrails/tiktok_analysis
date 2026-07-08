package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import kotlin.jvm.internal.AwS176S1100000_27;

/* JADX INFO: renamed from: X.0wyh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1801410wyh extends AbstractC1799010wup {
    @Override // X.AbstractC1549150qPp
    public final boolean shouldUseOriginalData(InterfaceC634840OvC interfaceC634840OvC) {
        EnumC1063300dmC enumC1063300dmC;
        C1543410qGZ c1543410qGZLIZJ;
        C1543190qGD c1543190qGD;
        if (interfaceC634840OvC != null && (c1543410qGZLIZJ = interfaceC634840OvC.LIZJ()) != null && (c1543190qGD = c1543410qGZLIZJ.LIZ.LIZ) != null) {
            enumC1063300dmC = c1543190qGD.LJIILJJIL;
        } else {
            enumC1063300dmC = null;
        }
        if (enumC1063300dmC == EnumC1063300dmC.WEB) {
            return true;
        }
        return false;
    }

    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        boolean z;
        String schema = ((InterfaceC1799020wuq) xBaseParamModel).getSchema();
        if (schema != null && schema.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            C2382909Vj.LIZ(completionBlock, 0, "schema is empty", null, 4);
        } else {
            C500260Jjc.LJJLIIIJILLIZJL(new AwS176S1100000_27(schema, this, 3));
            completionBlock.onSuccess((XBaseResultModel) C1909107dp.LIZJ(InterfaceC1799030wur.class, null), "");
        }
    }
}
