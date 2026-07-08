package X;

import android.app.Activity;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.tako.model.AIBotInfo;
import defpackage.a;
import java.net.URLDecoder;
import java.util.Map;

/* JADX INFO: renamed from: X.14E6, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C14E6 extends a {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        long jCurrentTimeMillis;
        Activity activityLIZLLL;
        long jLongValue;
        String botName;
        String startMsg;
        String query;
        Object obj;
        String string;
        Long lLJIILIIL;
        a.InterfaceC0001a interfaceC0001a = (a.InterfaceC0001a) xBaseParamModel;
        Map<String, Object> extraInfo = interfaceC0001a.getExtraInfo();
        if (extraInfo != null && (obj = extraInfo.get("enter_start_time")) != null && (string = obj.toString()) != null && (lLJIILIIL = C2095008Iq.LJIILIIL(string)) != null) {
            jCurrentTimeMillis = lLJIILIIL.longValue();
        } else {
            jCurrentTimeMillis = System.currentTimeMillis();
        }
        InterfaceC1864030ybh interfaceC1864030ybhLJJLJ = C14TF.LIZIZ.LJJLJ();
        InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
        if (interfaceC634840OvC != null) {
            activityLIZLLL = interfaceC634840OvC.LIZLLL();
        } else {
            activityLIZLLL = null;
        }
        String enterFrom = interfaceC0001a.getEnterFrom();
        String enterMethod = interfaceC0001a.getEnterMethod();
        Long lLJIILIIL2 = C2095008Iq.LJIILIIL(interfaceC0001a.getBotInfo().getBotId());
        if (lLJIILIIL2 != null) {
            jLongValue = lLJIILIIL2.longValue();
        } else {
            jLongValue = 0;
        }
        try {
            botName = URLDecoder.decode(interfaceC0001a.getBotInfo().getBotName(), "UTF-8");
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            botName = interfaceC0001a.getBotInfo().getBotName();
        }
        String botImage = interfaceC0001a.getBotInfo().getBotImage();
        try {
            startMsg = URLDecoder.decode(interfaceC0001a.getBotInfo().getStartMsg(), "UTF-8");
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            startMsg = interfaceC0001a.getBotInfo().getStartMsg();
        }
        AIBotInfo aIBotInfo = new AIBotInfo(jLongValue, botName, botImage, 2, 2, 2, startMsg, interfaceC0001a.getBotInfo().getStartSug(), false, false, true, interfaceC0001a.getBotInfo().getExtraInfo(), null, null, null, null, null, null, false, null, null, null, null, 8384768, null);
        String searchId = interfaceC0001a.getSearchId();
        try {
            query = URLDecoder.decode(interfaceC0001a.getBotInfo().getQuery(), "UTF-8");
        } catch (Exception e3) {
            TryCatchGuardChecker.doCheck(e3);
            query = interfaceC0001a.getBotInfo().getQuery();
        }
        interfaceC1864030ybhLJJLJ.LIZ(activityLIZLLL, enterFrom, enterMethod, jCurrentTimeMillis, aIBotInfo, searchId, query, "text", interfaceC0001a.getExtraInfo(), "click_search_bot_card", null, true);
    }
}
