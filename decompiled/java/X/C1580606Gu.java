package X;

import android.app.Activity;
import android.content.Context;
import com.ss.android.ugc.aweme.im.streak.impl.pet.assem.StreakWheeDriveTrafficAssem;
import java.lang.ref.WeakReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.06Gu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1580606Gu extends C09AY implements Function0<Unit> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ WeakReference<StreakWheeDriveTrafficAssem> LLILLL;
    public final /* synthetic */ String LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1580606Gu(String str, String str2, WeakReference<StreakWheeDriveTrafficAssem> weakReference, String str3) {
        super(0);
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = weakReference;
        this.LLILZ = str3;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        Context context;
        Activity activityLIZ;
        C1590906Kt.LIZ("StreakWheeDriveTrafficAssem onGetBtnClick");
        C1580806Gw.LIZIZ().storeBoolean(C1580806Gw.LIZ(this.LL, this.LLILLJJLI, "user_clicked_card_or_widget_with_text_bubble"), true);
        StreakWheeDriveTrafficAssem streakWheeDriveTrafficAssem = this.LLILLL.get();
        if (streakWheeDriveTrafficAssem != null && (context = streakWheeDriveTrafficAssem.getContext()) != null && (activityLIZ = C1388190mED.LIZ(context)) != null) {
            String str = this.LLILZ;
            String str2 = this.LL;
            C1576506Ff c1576506Ff = C1576506Ff.LIZIZ;
            C06G9 c06g9 = C06G9.CARD_BANNER;
            C06ET c06et = C06ET.LJFF;
            C1576706Fh c1576706Fh = new C1576706Fh(null, C06GA.CARD_BANNER.getValue(), C06H2.CHAT, null, null, null, str2, null, 761);
            c1576506Ff.getClass();
            C1576506Ff.LIZ(activityLIZ, c06g9, str, c06et, c1576706Fh);
        }
        return Unit.LIZ;
    }
}
