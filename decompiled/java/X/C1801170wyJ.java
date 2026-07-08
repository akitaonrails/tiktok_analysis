package X;

import android.app.Activity;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.notice.api.services.INoticeService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AwS393S0200000_27;

/* JADX INFO: renamed from: X.0wyJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1801170wyJ extends AbstractC1801160wyI {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [com.ss.android.ugc.aweme.notice.api.services.INoticeService] */
    /* JADX WARN: Type inference failed for: r4v0, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.ArrayList] */
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        Activity activityLIZLLL;
        C19EG c19eg;
        ?? arrayList;
        InterfaceC1801180wyK interfaceC1801180wyK = (InterfaceC1801180wyK) xBaseParamModel;
        Number channelId = interfaceC1801180wyK.getChannelId();
        if (channelId != null) {
            int iIntValue = channelId.intValue();
            InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
            String enterFrom = null;
            if (interfaceC634840OvC != null) {
                activityLIZLLL = interfaceC634840OvC.LIZLLL();
            } else {
                activityLIZLLL = null;
            }
            if ((activityLIZLLL instanceof C19EG) && (c19eg = (C19EG) activityLIZLLL) != null) {
                List<Number> categoryIds = interfaceC1801180wyK.getCategoryIds();
                if (categoryIds != null) {
                    arrayList = new ArrayList(C15438062q.LJIJJ(categoryIds, 10));
                    Iterator<Number> it2 = categoryIds.iterator();
                    while (it2.hasNext()) {
                        arrayList.add(Integer.valueOf(it2.next().intValue()));
                    }
                } else {
                    arrayList = C13BV.INSTANCE;
                }
                InterfaceC1801190wyL trackingParams = interfaceC1801180wyK.getTrackingParams();
                if (trackingParams != null) {
                    enterFrom = trackingParams.getEnterFrom();
                }
                ?? r1 = (INoticeService) PluggableExtentionKt.pluggableSpi$default(INoticeService.class, false, false, false, 14, null);
                if (r1 != 0) {
                    r1.LJJJJIZL(c19eg, iIntValue, arrayList, enterFrom, null, null, new AwS393S0200000_27(completionBlock, (CompletionBlock<InterfaceC1801140wyG>) this, (C1801170wyJ) 5));
                    return;
                }
                return;
            }
            C2382909Vj.LIZ(completionBlock, 10003, "other error", null, 4);
        }
    }
}
