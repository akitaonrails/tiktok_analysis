package X;

import android.app.Activity;
import android.content.Intent;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.view.PaymentTransitionActivity;

/* JADX INFO: renamed from: X.03lA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C935403lA {
    public static void LIZ(Activity activity, String str, InterfaceC935503lB interfaceC935503lB) {
        PaymentTransitionActivity.LLILZIL = interfaceC935503lB;
        Intent intent = new Intent(activity, (Class<?>) PaymentTransitionActivity.class);
        intent.putExtra("url", str);
        RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(activity, intent, "Context_startActivity_1");
        C1701330uNH.LIZ(intent, activity);
        C2204961BRm.LJIILLIIL(activity, intent, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KO+rbJLD2SDodnumb/RY5KwLk70s3LAv+ax35YxxIKudyooBYdQ6sKhQ0hk4MAS6dTKEgVwXoGKsOw==", null));
        C786410Ut5.ae(0, activity, 0);
    }
}
