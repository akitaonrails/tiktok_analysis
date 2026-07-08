package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;

/* JADX INFO: renamed from: X.09Vj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2382909Vj {
    public static /* synthetic */ void LIZ(CompletionBlock completionBlock, int i, String str, XBaseResultModel xBaseResultModel, int i2) {
        if ((i2 & 2) != 0) {
            str = "";
        }
        if ((i2 & 4) != 0) {
            xBaseResultModel = null;
        }
        completionBlock.onFailure(i, str, xBaseResultModel);
    }
}
