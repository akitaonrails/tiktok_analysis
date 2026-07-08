package X;

import android.app.Activity;
import com.ss.android.ugc.aweme.shortvideo.ScreenUtils;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS4S1310000_14;

/* JADX INFO: renamed from: X.0Yyt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C891930Yyt extends C09AY implements Function0<Unit> {
    public final /* synthetic */ List<String> LL;
    public final /* synthetic */ Activity LLILLJJLI;
    public final /* synthetic */ C885760Yow LLILLL;
    public final /* synthetic */ boolean LLILZ;
    public final /* synthetic */ String LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C891930Yyt(List<String> list, Activity activity, C885760Yow c885760Yow, boolean z, String str) {
        super(0);
        this.LL = list;
        this.LLILLJJLI = activity;
        this.LLILLL = c885760Yow;
        this.LLILZ = z;
        this.LLILZIL = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        String strLJ = C20642515q3.LJ(2131755200, this.LL.size(), Integer.valueOf(this.LL.size()));
        C1389910mGz c1389910mGz = new C1389910mGz(this.LLILLJJLI);
        c1389910mGz.LJI(R.style.y0);
        c1389910mGz.LJIIJ(strLJ);
        c1389910mGz.LIZIZ(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)) + ScreenUtils.com_ss_android_ugc_aweme_shortvideo_ScreenUtils_com_ss_android_ugc_tiktok_tools_performance_lancet_SearchPreloadLancet_getNavigationBarHeight(this.LLILLJJLI));
        C1360890lWB c1360890lWB = c1389910mGz.LIZ;
        c1360890lWB.LIZIZ = 1;
        c1360890lWB.LIZLLL = 3;
        c1389910mGz.LIZ.LJ = new AwS4S1310000_14(c1389910mGz, (C1389910mGz) this.LLILLL, (C885760Yow) this.LLILZ, (boolean) this.LL, (List<String>) this.LLILZIL, (String) 0);
        c1389910mGz.LJIIJJI();
        return Unit.LIZ;
    }
}
