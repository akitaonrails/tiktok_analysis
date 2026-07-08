package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import defpackage.f;

/* JADX INFO: renamed from: X.0ysV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1874450ysV extends f {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        XBaseModel xBaseModelLIZJ = C1909107dp.LIZJ(f.c.class, null);
        f.c cVar = (f.c) xBaseModelLIZJ;
        String strLIZJ = C1767800w6U.LIZJ();
        if (strLIZJ == null) {
            strLIZJ = "unknown";
        }
        cVar.setPreviousPage(strLIZJ);
        completionBlock.onSuccess((XBaseResultModel) xBaseModelLIZJ, "");
    }
}
