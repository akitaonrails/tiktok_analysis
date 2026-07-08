package X;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.ss.android.ugc.aweme.im.sharepanel.impl.relations.ui.activity.RelationSelectActivity;

/* JADX INFO: renamed from: X.0D8l, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C334250D8l {
    public static void LIZ(Context context, Bundle bundle) {
        Intent intent = new Intent(context, (Class<?>) RelationSelectActivity.class);
        intent.putExtras(bundle);
        RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(context, intent, "Context_startActivity_1");
        C1701330uNH.LIZ(intent, context);
        C2204961BRm.LJJJJJL(context, intent, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOOlLYzG3SDhT2DsSx9m1G5IYHvEV65AWt9aa4QI9Kz1f/FVMycEycbP1ImeM445beKLGl05DLkb5LDM8wHANQ==", null));
    }
}
