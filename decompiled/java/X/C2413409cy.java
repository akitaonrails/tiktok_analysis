package X;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.09cy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2413409cy {
    public static final void LIZ(Context context, View view, String str) {
        Intent intent = new Intent();
        intent.setAction("android.intent.action.DIAL");
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("tel:");
        sbLIZ.append(str);
        intent.setData(UriProtector.parse(C2188811AlT.LIZIZ(sbLIZ)));
        intent.addFlags(268435456);
        if (context != null) {
            try {
                RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(context, intent, "Context_startActivity_1");
                C1701330uNH.LIZ(intent, context);
                C2204961BRm.LJJJJJL(context, intent, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOOlLYzK13yjN1rdG7GANrqhPBdJ0hLRXhP6/IIdUMI+xjw1x+ZvmWKx5G0=", null));
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C1389890mGx c1389890mGx = new C1389890mGx(view);
                c1389890mGx.LIZ(true);
                c1389890mGx.LJIIIZ(2131835816);
                c1389890mGx.LJIIJJI();
            }
        }
    }
}
