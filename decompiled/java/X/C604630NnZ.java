package X;

import android.app.Activity;
import androidx.lifecycle.LifecycleKt;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0NnZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C604630NnZ extends AbstractC604610NnX {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r9v2, types: [java.util.HashMap, java.util.LinkedHashMap] */
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        Activity activityLIZLLL;
        C19EG c19eg;
        long jLongValue;
        User user;
        ?? LJ;
        InterfaceC604620NnY interfaceC604620NnY = (InterfaceC604620NnY) xBaseParamModel;
        InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
        if (interfaceC634840OvC != null) {
            activityLIZLLL = interfaceC634840OvC.LIZLLL();
        } else {
            activityLIZLLL = null;
        }
        if ((activityLIZLLL instanceof C19EG) && (c19eg = (C19EG) activityLIZLLL) != null) {
            Long lLJFF = C617100OIi.LJFF(interfaceC604620NnY.getBbid());
            if (lLJFF != null) {
                jLongValue = lLJFF.longValue();
            } else {
                jLongValue = 0;
            }
            String uid = interfaceC604620NnY.getUid();
            boolean noNeedFollow = interfaceC604620NnY.getNoNeedFollow();
            String conversationId = interfaceC604620NnY.getConversationId();
            String messageId = interfaceC604620NnY.getMessageId();
            String channelUser = interfaceC604620NnY.getChannelUser();
            if (channelUser != null) {
                try {
                    C1227904rF.LIZ.getClass();
                    user = (User) C1227904rF.LIZIZ(channelUser, User.class);
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    user = null;
                }
            } else {
                user = null;
            }
            Map<String, Object> eventMap = interfaceC604620NnY.getEventMap();
            if (eventMap != null) {
                LJ = new LinkedHashMap(C2097908Jt.LIZIZ(eventMap.size()));
                Iterator it2 = eventMap.entrySet().iterator();
                while (it2.hasNext()) {
                    Map.Entry entry = (Map.Entry) it2.next();
                    LJ.put(entry.getKey(), entry.getValue().toString());
                }
            } else {
                LJ = C2097608Jq.LJ();
            }
            C23250099c.LIZLLL(LifecycleKt.androidx_lifecycle_LifecycleKt_com_ss_android_ugc_aweme_main_lancet_SAFTikTokLancet_getCoroutineScope(c19eg.getLifecycle()), C0PEM.LIZJ, null, new C604590NnV(c19eg, jLongValue, uid, noNeedFollow, LJ, conversationId, messageId, user, completionBlock, this, null), 2);
            return;
        }
        C2382909Vj.LIZ(completionBlock, 1, "activity is null", null, 4);
    }
}
