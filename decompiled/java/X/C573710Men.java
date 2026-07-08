package X;

import android.appwidget.AppWidgetManager;
import android.content.ComponentName;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.appwidget.CameraWidgetProvider;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0Men, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C573710Men extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C19EG LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ String LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C573710Men(C19EG c19eg, String str, String str2, String str3, String str4) {
        super(0);
        this.LL = c19eg;
        this.LLILLJJLI = str;
        this.LLILLL = str2;
        this.LLILZ = str3;
        this.LLILZIL = str4;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        ComponentName componentName = new ComponentName(this.LL, (Class<?>) CameraWidgetProvider.class);
        try {
            AppWidgetManager appWidgetManager = AppWidgetManager.getInstance(this.LL);
            if (appWidgetManager != null) {
                appWidgetManager.requestPinAppWidget(componentName, null, C573740Meq.LIZIZ(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL));
            }
        } catch (IllegalStateException e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("days since registration: ");
            sbLIZ.append(e);
            C201955140j.LIZIZ("show_camera_widget", C2188811AlT.LIZIZ(sbLIZ));
        }
        C573740Meq.LIZ().storeInt("show_guide_cnt", C573740Meq.LIZ().getInt("show_guide_cnt", 0) + 1);
        C573740Meq.LIZ().storeLong("last_show_time", System.currentTimeMillis());
        return Unit.LIZ;
    }
}
