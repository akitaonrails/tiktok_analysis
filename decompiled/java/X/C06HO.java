package X;

import com.ss.android.ugc.aweme.im.streak.api.exp.FrequencyControlSettings;
import com.ss.android.ugc.aweme.im.streak.impl.pet.assem.StreakWheeDriveTrafficAssem;
import java.lang.ref.WeakReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.06HO, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C06HO extends C09AY implements Function0<Unit> {
    public final /* synthetic */ WeakReference<StreakWheeDriveTrafficAssem> LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ String LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C06HO(WeakReference<StreakWheeDriveTrafficAssem> weakReference, String str, String str2) {
        super(0);
        this.LL = weakReference;
        this.LLILLJJLI = str;
        this.LLILLL = str2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        C1590906Kt.LIZ("StreakWheeDriveTrafficAssem onCardBannerShow in chat page");
        StreakWheeDriveTrafficAssem streakWheeDriveTrafficAssem = this.LL.get();
        if (streakWheeDriveTrafficAssem != null) {
            streakWheeDriveTrafficAssem.LLILZ = true;
        }
        String str = this.LLILLJJLI;
        String str2 = this.LLILLL;
        long jCurrentTimeMillis = System.currentTimeMillis();
        C1580806Gw.LIZIZ().storeLong(C1580806Gw.LIZ(str, str2, "last_display_time"), jCurrentTimeMillis);
        String strLIZ = C1580806Gw.LIZ(str, str2, "consecutive_ignored_count");
        int i = C1580806Gw.LIZIZ().getInt(strLIZ, 0) + 1;
        C1580806Gw.LIZIZ().storeInt(strLIZ, i);
        if (i >= ((FrequencyControlSettings) C06HU.LIZIZ.getValue()).cardMaxConsecutiveIgnored) {
            C1580806Gw.LIZIZ().storeLong(C1580806Gw.LIZ(str, str2, "cooldown_start_time"), jCurrentTimeMillis);
            String strLIZ2 = C1580806Gw.LIZ(str, str2, "cooldown_trigger_count");
            C1580806Gw.LIZIZ().storeInt(strLIZ2, C1580806Gw.LIZIZ().getInt(strLIZ2, 0) + 1);
            C1580806Gw.LIZIZ().storeInt(strLIZ, 0);
        }
        return Unit.LIZ;
    }
}
