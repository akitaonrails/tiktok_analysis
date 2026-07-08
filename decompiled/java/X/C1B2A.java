package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: X.1B2A, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1B2A extends C1B28 {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        C1B29 c1b29 = (C1B29) xBaseParamModel;
        C433080GyY c433080GyY = new C433080GyY(c1b29.getTriggerId(), c1b29.getNotifyCode().intValue());
        Iterator it2 = ((ArrayList) C440150HNt.LIZ).iterator();
        while (it2.hasNext()) {
            ((C1B2C) it2.next()).D1(c433080GyY);
        }
        completionBlock.onSuccess((XBaseResultModel) C1549500qQO.LIZLLL(C13LE.LIZ(C1B2B.class)), "");
    }
}
