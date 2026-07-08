package X;

import android.content.Context;
import android.os.Bundle;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwnerKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0e7w, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1076780e7w {
    public static final C1076780e7w LIZ = new C1076780e7w();

    public static final void LIZ(Context context, final Function0<Unit> function0) {
        Bundle bundle = new Bundle();
        bundle.putInt("phone_number_source", 13);
        C191819102n.LIZ.getClass();
        C191819102n.LJ().LJII().bindMobile(C1388190mED.LIZ(context), "suggest_contacts", bundle, new C0XTR() { // from class: X.0e7x
            @Override // X.C0XTR
            public final void onResult(int i, int i2, Object obj) {
                if (i == 7 && i2 == 1) {
                    function0.invoke();
                }
            }
        });
        C1076800e7y.LIZ.getClass();
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("account_type", "contact");
        c2344009Gk.LIZJ(0, "is_permit");
        C20684815ws.LJIILLIIL("account_auth_platform_click", c2344009Gk.LIZ);
    }

    public static final void LIZIZ(Context context, Function0<Unit> function0) {
        LifecycleCoroutineScope lifecycleScope;
        C19EG c19egLIZIZ = C1388190mED.LIZIZ(context);
        if (c19egLIZIZ != null && (lifecycleScope = LifecycleOwnerKt.getLifecycleScope(c19egLIZIZ)) != null) {
            C23250099c.LIZLLL(lifecycleScope, null, null, new C1071100dym(context, function0, null), 3);
        }
        C1076800e7y.LIZ.getClass();
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("account_type", "contact");
        c2344009Gk.LIZJ(1, "is_permit");
        C20684815ws.LJIILLIIL("account_auth_platform_click", c2344009Gk.LIZ);
    }
}
