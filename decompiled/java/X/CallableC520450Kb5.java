package X;

import android.appwidget.AppWidgetManager;
import android.content.Context;
import android.widget.RemoteViews;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.zhiliaoapp.musically.R;
import java.util.concurrent.Callable;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0Kb5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class CallableC520450Kb5<V> implements Callable {
    public final /* synthetic */ Context LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ int[] LLILLL;
    public final /* synthetic */ String LLILZ;

    public CallableC520450Kb5(int i, Context context, String str, int[] iArr) {
        this.LL = context;
        this.LLILLJJLI = i;
        this.LLILLL = iArr;
        this.LLILZ = str;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        Object c098200Yq;
        C1C7U.LIZ("ReferralWidgetManager@fe14.showNotAvailable$1");
        Context context = this.LL;
        int i = this.LLILLJJLI;
        int[] iArr = this.LLILLL;
        String str = this.LLILZ;
        try {
            RemoteViews remoteViews = new RemoteViews(context.getPackageName(), i);
            remoteViews.setViewVisibility(R.id.vbk, 8);
            remoteViews.setViewVisibility(R.id.msr, 8);
            remoteViews.setViewVisibility(R.id.fj1, 8);
            remoteViews.setViewVisibility(R.id.pc3, 0);
            C1849780yEi c1849780yEi = (C1849780yEi) C1619720sFe.LIZ.LIZ(LSPassThroughRecordSizeConfig.DEFAULT);
            remoteViews.setOnClickPendingIntent(R.id.pc3, c1849780yEi != null ? c1849780yEi.LIZIZ(context, str) : null);
            AppWidgetManager.getInstance(context).updateAppWidget(iArr, remoteViews);
            c098200Yq = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        C189200o6 c189200o6M1boximpl = C189200o6.m1boximpl(c098200Yq);
        C1C7U.LIZIZ("ReferralWidgetManager@fe14.showNotAvailable$1");
        return c189200o6M1boximpl;
    }
}
