package X;

import android.app.Activity;
import android.graphics.Rect;
import android.view.View;
import android.view.Window;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0kwZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1338810kwZ extends C09AY implements Function0<Integer> {
    public final /* synthetic */ Map<String, String> LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1338810kwZ(Map<String, String> map) {
        super(0);
        this.LL = map;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Integer invoke() {
        int iLIZLLL;
        View decorView;
        Intrinsics.LJFF(this.LL.get("trans_navigation_bar"), "1");
        Activity activityLIZ = C01CR.LIZ();
        if (activityLIZ == null) {
            iLIZLLL = C1338790kwX.LIZLLL(null);
        } else {
            Window window = activityLIZ.getWindow();
            Rect rect = new Rect();
            if (window != null && (decorView = window.getDecorView()) != null) {
                decorView.getWindowVisibleDisplayFrame(rect);
            }
            iLIZLLL = rect.bottom - rect.top;
        }
        return Integer.valueOf(iLIZLLL);
    }
}
