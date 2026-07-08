package X;

import android.app.Activity;
import android.content.Intent;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import kotlin.jvm.internal.AwS414S0200000_13;

/* JADX INFO: renamed from: X.0XSi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C849020XSi extends AbstractC849030XSj {
    public static void LIZJ(Activity activity, Intent intent) {
        RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(activity, intent, "Context_startActivity_1");
        C1701330uNH.LIZ(intent, activity);
        C2204961BRm.LJIILLIIL(activity, intent, new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yefFGJAl6Thf/N/ILzSAUv4UmvRvfF6qbZrPV/QrE8H7TrGJR7dkZ0p4pFBpptHsjA4h5pmsZSuCxKOp5fv/laIsmjjAA0QUEA6wgCQ=", null));
    }

    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        C500260Jjc.LJJLIIIJILLIZJL(new AwS414S0200000_13((InterfaceC849040XSk) xBaseParamModel, this, 4));
        completionBlock.onSuccess((XBaseResultModel) C1909107dp.LIZJ(InterfaceC849050XSl.class, null), "");
    }
}
