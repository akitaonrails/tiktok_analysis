package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import com.bytedance.ies.ugc.aweme.commercialize.splash.show.NormalSplashAdActivity;
import com.bytedance.router.monitor.RouterPageMonitor;

/* JADX INFO: renamed from: X.0cwD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public class C1031070cwD {
    public View LIZ;
    public C1030990cw5 LIZIZ;

    public final boolean LIZ(Context context, C2212931BjH c2212931BjH, C1030990cw5 c1030990cw5) {
        this.LIZ = c2212931BjH;
        this.LIZIZ = c1030990cw5;
        if (c2212931BjH == null) {
            this.LIZ = null;
            this.LIZIZ = null;
            return false;
        }
        C1031100cwG.LIZ().LJIJI();
        Intent intent = new Intent(context, (Class<?>) NormalSplashAdActivity.class);
        if (context instanceof Activity) {
            intent.putExtra("from", context.getClass().getName());
        } else {
            intent.addFlags(268435456);
        }
        RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(context, intent, "Context_startActivity_1");
        C1701330uNH.LIZ(intent, context);
        C2204961BRm.LJJJJJL(context, intent, new C0WZX("dzBzEgAjS8/YVFkiQFyNY/5YsGxLrjrnefn6WusZG+tByEQn5Gk7b5KDEqEOHEj7wSUuEuxE6XgLFpoPxnyIAkp+7iOvRsE9YPHU3Q==", null));
        return true;
    }
}
