package X;

import android.app.Activity;
import android.content.Context;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.ss.android.ugc.aweme.api.auto.IAutoService;
import com.ss.android.ugc.aweme.commercialize.api.auto.IAutoServiceImpl;
import com.ss.android.ugc.aweme.commercialize.model.AutoData;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0cWi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1015260cWi extends AbstractC1015250cWh {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        C19EG c19egLIZIZ;
        Aweme awemeLJFF;
        Activity activityLIZ;
        InterfaceC1015270cWj interfaceC1015270cWj = (InterfaceC1015270cWj) xBaseParamModel;
        AutoData autoData = new AutoData(interfaceC1015270cWj.getText(), null, interfaceC1015270cWj.getImageUrl(), interfaceC1015270cWj.getWebUrl(), interfaceC1015270cWj.getOpenUrl());
        AbstractC1387200mCc[] abstractC1387200mCcArrLJII = C1906580ziK.LJII();
        if (abstractC1387200mCcArrLJII.length != 0 && (!false)) {
            for (int length = abstractC1387200mCcArrLJII.length - 1; -1 < length; length--) {
                Activity activityLIZIZ = abstractC1387200mCcArrLJII[length].LIZIZ();
                if (activityLIZIZ != null && (c19egLIZIZ = C1388190mED.LIZIZ(activityLIZIZ)) != null && (awemeLJFF = C740740T3w.LJFF(c19egLIZIZ)) != null) {
                    Activity activityLIZIZ2 = ((AbstractC1387200mCc) C13LQ.LJJJIL(abstractC1387200mCcArrLJII)).LIZIZ();
                    if (activityLIZIZ2 != null && (activityLIZ = C1388190mED.LIZ(activityLIZIZ2)) != null) {
                        Pair pair = new Pair(activityLIZ, awemeLJFF);
                        Context context = (Context) pair.getFirst();
                        Aweme aweme = (Aweme) pair.getSecond();
                        C1003330cDT c1003330cDT = new C1003330cDT(interfaceC1015270cWj.getPid(), interfaceC1015270cWj.getDisclaimerType().intValue(), autoData, 2);
                        IAutoService iAutoServiceLIZIZ = IAutoServiceImpl.LIZIZ();
                        if (iAutoServiceLIZIZ != null) {
                            iAutoServiceLIZIZ.LIZ(context, aweme, c1003330cDT);
                            return;
                        }
                        return;
                    }
                    return;
                }
            }
        }
    }
}
