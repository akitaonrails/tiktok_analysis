package X;

import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.ss.android.ugc.aweme.compliance.api.model.SleepHourConfigSettings;
import com.ss.android.ugc.aweme.compliance.protection.timelock.api.SleepHourReminder;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import kotlin.jvm.internal.AwS575S0100000_31;
import kotlin.jvm.internal.AwS610S0100000_31;

/* JADX INFO: renamed from: X.00xT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C247300xT {
    public static final C247300xT LIZ = new C247300xT();
    public static final InterfaceC247400xU LIZIZ = (InterfaceC247400xU) ((IRetrofitFactory) ServiceManager.get().getService(IRetrofitFactory.class)).LIZ(C0CQT.LIZJ).create(InterfaceC247400xU.class);

    public static void LIZ(SleepHourConfigSettings sleepHourConfigSettings, AwS610S0100000_31 awS610S0100000_31, AwS575S0100000_31 awS575S0100000_31) {
        C632140Oqq.LIZLLL(LIZIZ.LIZ(new SleepHourReminder(sleepHourConfigSettings, Integer.valueOf((int) (System.currentTimeMillis() / ((long) LSPassThroughRecordSizeConfig.DEFAULT))))), "/tiktok/v1/night_screen_time/settings/", null).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new C515801zg(awS575S0100000_31, awS610S0100000_31, 20), new C516201zk(awS575S0100000_31, 93));
    }
}
