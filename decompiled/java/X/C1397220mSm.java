package X;

import Y.ARunnableS121S0100000_21;
import android.app.Activity;
import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;

/* JADX INFO: renamed from: X.0mSm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1397220mSm extends AbstractC1397230mSn {
    public static final BPEAHandler LLILLL = new BPEAHandler(Looper.getMainLooper());

    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        Activity activityLIZIZ;
        Activity activityLIZ;
        C508401yU c508401yU = C508401yU.LJIIJJI;
        if (c508401yU == null) {
            int i = C2187451AjH.LIZ;
            C1720106oR.LIZ("minis-ReportSubmitFinishIDL", "No active ReportSession");
            C2382909Vj.LIZ(completionBlock, -1, "No active report session", null, 4);
            return;
        }
        AbstractC1387200mCc abstractC1387200mCcLIZIZ = C1906580ziK.LIZIZ();
        if (abstractC1387200mCcLIZIZ != null && (activityLIZIZ = abstractC1387200mCcLIZIZ.LIZIZ()) != null && (activityLIZ = C06MM.LIZ(activityLIZIZ)) != null) {
            c508401yU.LJI(activityLIZ);
        }
        int i2 = C2187451AjH.LIZ;
        C786410Ut5.LJJZZIII(LLILLL, new ARunnableS121S0100000_21(c508401yU, 107));
        completionBlock.onSuccess((XBaseResultModel) C1909107dp.LIZJ(InterfaceC1397250mSp.class, null), "");
    }
}
