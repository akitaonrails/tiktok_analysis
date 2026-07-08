package X;

import android.content.Context;
import android.content.Intent;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.monitor.RouterPageMonitor;

/* JADX INFO: renamed from: X.0djv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1061890djv {
    public static final void LIZ(Context context, String str, String str2, String[] strArr) {
        Intent intent = new Intent("android.intent.action.SENDTO");
        intent.setData(UriProtector.parse("mailto:"));
        C2429209fW.LIZ().appendDataFlowId(intent, 1207964163);
        intent.putExtra("android.intent.extra.EMAIL", strArr);
        intent.putExtra("android.intent.extra.SUBJECT", str);
        intent.putExtra("android.intent.extra.TEXT", str2);
        if (intent.resolveActivity(context.getPackageManager()) != null) {
            RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(context, intent, "Context_startActivity_1");
            C1701330uNH.LIZ(intent, context);
            C2204961BRm.LJJJJJL(context, intent, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOOmZZPb2TzaSm6ItPsk1vIiKahyiP6OhAurIPQT2gRDgJJdA9fyH6fWzoFUxaIqwmbazF+9yGm0TckzwZPWtA==", null));
        }
    }
}
