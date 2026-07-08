package X;

import android.app.Activity;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import kotlin.jvm.internal.AwS211S0300000_2;

/* JADX INFO: renamed from: X.06SJ, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C06SJ extends C06SH {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        Activity activityLIZIZ;
        C06SI c06si = (C06SI) xBaseParamModel;
        AbstractC1387200mCc abstractC1387200mCcLJ = C1906580ziK.LJ();
        if (abstractC1387200mCcLJ != null && (activityLIZIZ = abstractC1387200mCcLJ.LIZIZ()) != null) {
            DialogInterfaceOnDismissListenerC1225420hzg dialogInterfaceOnDismissListenerC1225420hzg = new DialogInterfaceOnDismissListenerC1225420hzg(c06si.getMaxSelectCount().intValue(), activityLIZIZ, c06si.getSessionId(), new AwS211S0300000_2(new C013C(), (C013C) this, (C06SJ) completionBlock, (CompletionBlock<C06SG>) 18), c06si.getIncludeGroupChat());
            C1227130i2R.LIZ.getClass();
            C1227130i2R.LJ(activityLIZIZ, dialogInterfaceOnDismissListenerC1225420hzg);
            return;
        }
        C2382909Vj.LIZ(completionBlock, 0, "context is null", null, 4);
    }
}
