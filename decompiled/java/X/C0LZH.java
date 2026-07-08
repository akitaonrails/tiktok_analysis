package X;

import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.ss.android.ugc.aweme.creative.model.AIGCOfflineModel;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.gamora.recorder.sticker.aigc.AIGCGenerationDraftCompatActivity;

/* JADX INFO: renamed from: X.0LZH, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0LZH {
    public static void LIZ(Context context, String str, String str2, String str3, long j, int i, String str4, String str5, CreativeInfo creativeInfo, AIGCOfflineModel aIGCOfflineModel, boolean z) {
        Intent intent = new Intent(context, (Class<?>) AIGCGenerationDraftCompatActivity.class);
        intent.putExtra("task_id", str);
        intent.putExtra("task_status", str2);
        intent.putExtra("image_uri", str3);
        intent.putExtra("elapsed_waiting_time", j);
        intent.putExtra("estimated_waiting_time", i);
        intent.putExtra("req_key", str4);
        intent.putExtra("req_json", str5);
        intent.putExtra("creative_info", (Parcelable) creativeInfo);
        intent.putExtra("aigc_offline_model", aIGCOfflineModel);
        intent.putExtra("is_new_framework", z);
        RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(context, intent, "Context_startActivity_1");
        C1701330uNH.LIZ(intent, context);
        C2204961BRm.LJJJJJL(context, intent, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF384cWghZ6S6ZpzBzjZpGDlHrqJcl8/bMCE7OXqfKqgqGG8mhUPhhpY7BT0PQu6cWMDHR76f7jA7cNjfpM3O", null));
    }
}
