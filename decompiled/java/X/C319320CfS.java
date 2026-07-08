package X;

import android.content.Context;
import com.ss.android.common.applog.AppLog;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0CfS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.videoquality.VQScoreModelFetcher$startDownloadModel$2", f = "VQScoreModelFetcher.kt", l = {}, m = "invokeSuspend")
public final class C319320CfS extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C259800zU<InterfaceC319330CfT> LL;
    public final /* synthetic */ CountDownLatch LLILLJJLI;
    public final /* synthetic */ Map<String, String> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C319320CfS(C259800zU<InterfaceC319330CfT> c259800zU, CountDownLatch countDownLatch, Map<String, String> map, InterfaceC1364105Vn<? super C319320CfS> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c259800zU;
        this.LLILLJJLI = countDownLatch;
        this.LLILLL = map;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C319320CfS(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws InterruptedException {
        C1C7U.LIZ("VQScoreModelFetcher@5bee.startDownloadModel$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        InterfaceC319330CfT interfaceC319330CfT = this.LL.element;
        Context contextM3 = C786410Ut5.M3(C1BWL.LIZ());
        Pair[] pairArr = new Pair[3];
        C0CHQ.LIZ().getApplicationService();
        pairArr[0] = new Pair("appID", String.valueOf(C19221910Hx.LIZ()));
        C0CHQ.LIZ().getApplicationService();
        String strLIZIZ = C19221910Hx.LIZIZ();
        strLIZIZ.toString();
        pairArr[1] = new Pair("appVersion", strLIZIZ);
        String strCom_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getServerDeviceId = AppLog.com_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getServerDeviceId();
        if (strCom_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getServerDeviceId == null) {
            strCom_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getServerDeviceId = "";
        }
        pairArr[2] = new Pair("deviceId", strCom_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getServerDeviceId);
        Map<String, String> mapLJIIJ = C2097608Jq.LJIIJ(pairArr);
        mapLJIIJ.putAll(this.LLILLL);
        interfaceC319330CfT.DownloadModel(contextM3, mapLJIIJ);
        this.LLILLJJLI.await();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("VQScoreModelFetcher@5bee.startDownloadModel$2");
        return unit;
    }
}
