package X;

import android.app.Activity;
import com.bytedance.hybrid.spark.page.SparkFragment;
import com.ss.android.ugc.aweme.commercialize.hybrid.impl.web.AdWebSparkService;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0d5r, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1037050d5r implements InterfaceC1037120d5y {
    public SparkFragment LIZ;
    public final /* synthetic */ C1037070d5t LIZIZ;

    @Override // X.InterfaceC1037120d5y
    public final String getTag() {
        return "IABPreWarm_createFragment";
    }

    @Override // X.InterfaceC1037120d5y
    public final C0CFU getType() {
        return C0CFU.COMMON;
    }

    public C1037050d5r(C1037070d5t c1037070d5t) {
        this.LIZIZ = c1037070d5t;
    }

    @Override // X.InterfaceC1037120d5y
    public final EnumC1002230cBh LIZ(C1037110d5x c1037110d5x) {
        if (this.LIZ != null) {
            return EnumC1002230cBh.DONE;
        }
        return EnumC1002230cBh.READY;
    }

    @Override // X.InterfaceC1037120d5y
    public final String LIZIZ(C1037110d5x c1037110d5x) {
        this.LIZ = AdWebSparkService.LIZJ().LIZIZ();
        this.LIZIZ.getClass();
        Activity activityLIZLLL = C1037070d5t.LIZLLL();
        C20673215v0.LJI(R.layout.lv, activityLIZLLL);
        C20673215v0.LJI(R.layout.lu, activityLIZLLL);
        C20673215v0.LJI(R.layout.f_e, activityLIZLLL);
        C20673215v0.LJI(R.layout.li, activityLIZLLL);
        return "IABPreWarm_createFragment";
    }
}
