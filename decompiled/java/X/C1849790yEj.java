package X;

import android.appwidget.AppWidgetManager;
import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import com.bytedance.touchpoint.core.appwidget.ReferralWidget;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0yEj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1849790yEj extends C09AY implements Function0<Unit> {
    public C1849790yEj() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        Context contextLJIIJJI;
        AbstractC1896090zRP abstractC1896090zRP = (AbstractC1896090zRP) C1619720sFe.LIZ.LIZ(0);
        if (abstractC1896090zRP != null && (contextLJIIJJI = abstractC1896090zRP.LJIIJJI()) != null && Build.VERSION.SDK_INT >= 26 && AppWidgetManager.getInstance(contextLJIIJJI).isRequestPinAppWidgetSupported()) {
            AppWidgetManager.getInstance(contextLJIIJJI).requestPinAppWidget(new ComponentName(contextLJIIJJI, (Class<?>) ReferralWidget.class), null, null);
        }
        return Unit.LIZ;
    }
}
