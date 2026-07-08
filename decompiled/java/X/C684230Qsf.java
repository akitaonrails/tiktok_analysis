package X;

import android.app.Activity;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;

/* JADX INFO: renamed from: X.0Qsf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C684230Qsf extends AbstractC684200Qsc {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        Activity activityLIZIZ;
        InterfaceC684220Qse interfaceC684220Qse = (InterfaceC684220Qse) xBaseParamModel;
        AbstractC1387200mCc abstractC1387200mCcLIZIZ = C1906580ziK.LIZIZ();
        if (abstractC1387200mCcLIZIZ != null && (activityLIZIZ = abstractC1387200mCcLIZIZ.LIZIZ()) != null) {
            C1047660dMy.LIZIZ.h3(activityLIZIZ, interfaceC684220Qse.getReportFrom(), interfaceC684220Qse.getReportObjectID(), interfaceC684220Qse.getItemId(), interfaceC684220Qse.getRoomId(), interfaceC684220Qse.getOwnerId(), interfaceC684220Qse.getCid(), interfaceC684220Qse.getLogExtra(), interfaceC684220Qse.getExtraParams(), null);
        }
    }
}
