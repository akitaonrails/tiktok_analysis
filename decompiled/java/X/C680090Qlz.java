package X;

import android.app.Activity;
import android.content.Context;
import android.graphics.Insets;
import android.os.Build;
import android.view.View;
import android.view.Window;
import android.view.WindowInsets;
import com.ss.android.ugc.aweme.search.pages.middlepage.takoentrance.ui.BaseTakoFloatingButtonAssem;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0Qlz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C680090Qlz extends C09AY implements Function0<Integer> {
    public final /* synthetic */ BaseTakoFloatingButtonAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C680090Qlz(BaseTakoFloatingButtonAssem baseTakoFloatingButtonAssem) {
        super(0);
        this.LL = baseTakoFloatingButtonAssem;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Integer invoke() {
        AbstractC1387200mCc abstractC1387200mCcLIZLLL;
        Activity activityLIZIZ;
        Activity activityLIZ;
        Window window;
        View decorView;
        WindowInsets rootWindowInsets;
        Insets insets;
        Activity activityLIZ2;
        Window window2;
        int iLIZLLL = 0;
        if (!((Boolean) C078G.LIZ.getValue()).booleanValue() || Build.VERSION.SDK_INT < 30) {
            iLIZLLL = C14KQ.LIZLLL(this.LL.getContext());
        } else {
            Context context = this.LL.getContext();
            if (((context != null && (activityLIZ2 = C1388190mED.LIZ(context)) != null && (window2 = activityLIZ2.getWindow()) != null && (decorView = window2.getDecorView()) != null && decorView.isAttachedToWindow()) || ((abstractC1387200mCcLIZLLL = C1906580ziK.LIZLLL()) != null && (activityLIZIZ = abstractC1387200mCcLIZLLL.LIZIZ()) != null && (activityLIZ = C1388190mED.LIZ(activityLIZIZ)) != null && (window = activityLIZ.getWindow()) != null && (decorView = window.getDecorView()) != null)) && decorView.isAttachedToWindow() && (rootWindowInsets = decorView.getRootWindowInsets()) != null && (insets = rootWindowInsets.getInsets(WindowInsets.Type.navigationBars())) != null) {
                iLIZLLL = insets.bottom;
            }
        }
        return Integer.valueOf(iLIZLLL);
    }
}
