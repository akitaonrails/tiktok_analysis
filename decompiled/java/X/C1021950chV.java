package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import java.util.HashMap;

/* JADX INFO: renamed from: X.0chV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1021950chV extends AbstractC1021960chW {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        String containerID;
        Context context;
        Aweme aweme;
        AwemeRawAd awemeRawAd;
        Activity activityLIZ;
        AwemeRawAd awemeRawAd2;
        C1051660dTQ c1051660dTQ;
        InterfaceC1021970chX interfaceC1021970chX = (InterfaceC1021970chX) xBaseParamModel;
        String phoneNumber = interfaceC1021970chX.getPhoneNumber();
        String enterFrom = interfaceC1021970chX.getEnterFrom();
        if (enterFrom == null) {
            enterFrom = "landing_page";
        }
        C1529880puk c1529880puk = SparkContext.Companion;
        InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
        String containerID2 = null;
        if (interfaceC634840OvC != null) {
            containerID = interfaceC634840OvC.getContainerID();
        } else {
            containerID = null;
        }
        c1529880puk.getClass();
        C1537480q70 c1537480q70LIZIZ = C1529880puk.LIZIZ(containerID);
        if (c1537480q70LIZIZ != null && (c1051660dTQ = (C1051660dTQ) c1537480q70LIZIZ.LJFF(C1051660dTQ.class)) != null) {
            context = (Context) c1051660dTQ.LIZIZ(Context.class);
        } else {
            context = null;
        }
        HashMap<String, Integer> map = C988840bq6.LIZ;
        Integer num = map.get(phoneNumber);
        C1019830ce5 c1019830ce5LIZ = C988850bq7.LIZ();
        if (c1019830ce5LIZ != null) {
            aweme = c1019830ce5LIZ.LJIIL;
        } else {
            aweme = null;
        }
        if (num != null && num.intValue() >= C2540909xX.LIZ()) {
            if (context != null && (activityLIZ = C1388190mED.LIZ(context)) != null) {
                C1389890mGx c1389890mGx = new C1389890mGx(activityLIZ);
                c1389890mGx.LJIIIZ(2131828230);
                c1389890mGx.LJIIJJI();
                if (aweme != null) {
                    awemeRawAd2 = aweme.getAwemeRawAd();
                } else {
                    awemeRawAd2 = null;
                }
                C1022820ciu c1022820ciuLIZLLL = C2184171Adz.LIZLLL(enterFrom, "othershow", awemeRawAd2);
                c1022820ciuLIZLLL.LIZJ("tooltip", "refer");
                c1022820ciuLIZLLL.LJII();
                C2382909Vj.LIZ(completionBlock, 0, "frequency control", null, 4);
                return;
            }
            return;
        }
        int iIntValue = 1;
        if (num != null) {
            iIntValue = 1 + num.intValue();
        }
        map.put(phoneNumber, Integer.valueOf(iIntValue));
        Intent intent = new Intent("android.intent.action.DIAL", Uri.fromParts("tel", phoneNumber, null));
        C2429209fW.LIZ().appendDataFlowId(intent, 1207964164);
        if (context == null) {
            C2382909Vj.LIZ(completionBlock, 0, "Context not provided in host", null, 4);
            return;
        }
        C988840bq6.LIZIZ = System.currentTimeMillis();
        C988840bq6.LIZJ = enterFrom;
        RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(context, intent, "Context_startActivity_1");
        C1701330uNH.LIZ(intent, context);
        C2204961BRm.LJJJJJL(context, intent, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOi9b5PLyHwDdlrQqGjrmHF8HX357hVVT5oQSHeiIqZ0aYdgYnF/k2ru", null));
        if (aweme != null) {
            awemeRawAd = aweme.getAwemeRawAd();
        } else {
            awemeRawAd = null;
        }
        C2184171Adz.LIZLLL(enterFrom, "leave_tt", awemeRawAd).LJII();
        InterfaceC634840OvC interfaceC634840OvC2 = this.IBridgeSdkContext;
        if (interfaceC634840OvC2 != null) {
            containerID2 = interfaceC634840OvC2.getContainerID();
        }
        completionBlock.onSuccess((XBaseResultModel) C1909107dp.LIZJ(InterfaceC1021980chY.class, containerID2), "");
    }
}
