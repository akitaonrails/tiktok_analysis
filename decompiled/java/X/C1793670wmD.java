package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;

/* JADX INFO: renamed from: X.0wmD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1793670wmD extends AbstractC1793660wmC {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        int iLIZIZ;
        long jLongValue;
        InterfaceC1793680wmE interfaceC1793680wmE = (InterfaceC1793680wmE) xBaseParamModel;
        Number width = interfaceC1793680wmE.getWidth();
        if (width != null) {
            iLIZIZ = width.intValue();
        } else {
            iLIZIZ = (int) C497740JfY.LIZIZ(100.0f);
        }
        Number duration = interfaceC1793680wmE.getDuration();
        if (duration != null) {
            jLongValue = duration.longValue();
        } else {
            jLongValue = 200;
        }
        C500260Jjc.LJJLIIIJILLIZJL(new C1085690eMJ(iLIZIZ, jLongValue));
        completionBlock.onSuccess((XBaseResultModel) C1909107dp.LIZJ(InterfaceC1793690wmF.class, null), "");
    }
}
