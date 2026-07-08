package X;

import android.app.Activity;
import com.ss.android.ugc.aweme.shortvideo.ScreenUtils;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS213S0300000_4;

/* JADX INFO: renamed from: X.0DZf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C341210DZf extends C09AY implements Function0<Unit> {
    public final /* synthetic */ Activity LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ Function0<Unit> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C341210DZf(Activity activity, String str, boolean z, C877370YbP c877370YbP) {
        super(0);
        this.LL = activity;
        this.LLILLJJLI = str;
        this.LLILLL = z;
        this.LLILZ = c877370YbP;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(this.LL instanceof InterfaceC1603190roz ? 61 : 12)));
        C1389910mGz c1389910mGz = new C1389910mGz(this.LL);
        c1389910mGz.LJI(R.style.y0);
        c1389910mGz.LJIIJ(this.LLILLJJLI);
        c1389910mGz.LIZIZ(iLIZIZ + ScreenUtils.com_ss_android_ugc_aweme_shortvideo_ScreenUtils_com_ss_android_ugc_tiktok_tools_performance_lancet_SearchPreloadLancet_getNavigationBarHeight(this.LL));
        C1360890lWB c1360890lWB = c1389910mGz.LIZ;
        c1360890lWB.LIZIZ = 0;
        c1360890lWB.LIZLLL = 3;
        if (this.LLILLL) {
            c1389910mGz.LIZ.LJ = new AwS213S0300000_4(this.LL, (Activity) c1389910mGz, (C1389910mGz) this.LLILZ, (Function0<Unit>) 18);
        }
        c1389910mGz.LJIIJJI();
        return Unit.LIZ;
    }
}
