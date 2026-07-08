package X;

import android.app.Application;
import com.bytedance.forest.Forest;
import com.ss.android.common.applog.AppLog;
import com.ss.android.ugc.aweme.legoImp.task.btm.BCMForestLoader;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0pva, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1530400pva extends C09AY implements Function0<Forest> {
    public final /* synthetic */ BCMForestLoader LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1530400pva(BCMForestLoader bCMForestLoader) {
        super(0);
        this.LL = bCMForestLoader;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Forest invoke() {
        C844470XAv.LIZ.getClass();
        Application application = (Application) C844470XAv.LIZ();
        C1553670qX7.LIZ.getClass();
        C1533560q0g c1533560q0g = new C1533560q0g(C1553670qX7.LIZIZ(), new C1533570q0h((String) this.LL.LIZLLL.getValue(), "offlineX", Long.valueOf(C844470XAv.LJIIJ), C844470XAv.LIZJ(), AppLog.com_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getServerDeviceId(), C2222691Bz1.LIZIZ(), false, 192), 4);
        c1533560q0g.LJFF = "BCMForest";
        return new Forest(application, c1533560q0g);
    }
}
