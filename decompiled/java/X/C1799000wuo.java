package X;

import android.content.Context;
import android.view.View;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AFwS216S0000000_27;
import kotlin.jvm.internal.AwS393S0200000_27;

/* JADX INFO: renamed from: X.0wuo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1799000wuo extends AbstractC1798960wuk {
    public final C01GW LLILLL = C452501pT.LIZIZ(AFwS216S0000000_27.get$arr$(61));
    public final List<String> LLILZ = new ArrayList();

    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) throws Throwable {
        boolean z;
        Context context;
        InterfaceC634840OvC interfaceC634840OvC;
        InterfaceC1798980wum interfaceC1798980wum = (InterfaceC1798980wum) xBaseParamModel;
        try {
            InterfaceC634840OvC interfaceC634840OvC2 = this.IBridgeSdkContext;
            if (interfaceC634840OvC2 != null && (context = interfaceC634840OvC2.getContext()) != null && (interfaceC634840OvC = this.IBridgeSdkContext) != null) {
                View view = interfaceC634840OvC.getView();
                if (view != null) {
                    try {
                        if (((ArrayList) this.LLILZ).contains(interfaceC1798980wum.getUrl())) {
                            C1389890mGx c1389890mGx = new C1389890mGx(view);
                            c1389890mGx.LJFF(R.raw.icon_exclamation_mark_circle_fill);
                            c1389890mGx.LJII(R.attr.ee);
                            c1389890mGx.LJIIIZ(2131839183);
                            c1389890mGx.LIZLLL(500L);
                            c1389890mGx.LJIIJJI();
                        } else {
                            ((C2414209d6) this.LLILLL.getValue()).LIZ(context, view, interfaceC1798980wum.getUrl(), new AwS393S0200000_27(this, interfaceC1798980wum, 20));
                        }
                        completionBlock.onSuccess((XBaseResultModel) C1909107dp.LIZJ(InterfaceC1798970wul.class, null), "");
                        return;
                    } catch (Throwable th) {
                        th = th;
                        z = true;
                        while (true) {
                            try {
                                TryCatchGuardChecker.doCheck(th);
                                break;
                            } catch (Throwable th2) {
                                th = th2;
                            }
                        }
                        if (z) {
                            completionBlock.onSuccess((XBaseResultModel) C1909107dp.LIZJ(InterfaceC1798970wul.class, null), "");
                            throw th;
                        }
                        C2382909Vj.LIZ(completionBlock, 0, "jsb state error", null, 4);
                        throw th;
                    }
                }
            }
            C2382909Vj.LIZ(completionBlock, 0, "jsb state error", null, 4);
        } catch (Throwable th3) {
            th = th3;
            z = false;
        }
    }
}
