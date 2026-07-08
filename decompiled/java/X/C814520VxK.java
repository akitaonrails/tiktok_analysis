package X;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity;

/* JADX INFO: renamed from: X.0VxK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C814520VxK {
    public static final void LIZ(Context context, String str, String str2) {
        if (context == null) {
            return;
        }
        Intent intent = new Intent(context, (Class<?>) CrossPlatformActivity.class);
        Bundle bundle = new Bundle();
        if (TextUtils.isEmpty(str)) {
            str = "https://api.tiktokv.com/magic/runtime/?id=1079";
        }
        intent.setData(UriProtector.parse(str));
        String string = context.getResources().getString(2131845535);
        if (C2222691Bz1.LJIIIIZZ()) {
            string = context.getResources().getString(2131845539);
        }
        if (TextUtils.isEmpty(str2)) {
            str2 = string;
        }
        intent.putExtra("title", str2);
        intent.putExtra("aweme_model", bundle);
        RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(context, intent, "Context_startActivity_1");
        C1701330uNH.LIZ(intent, context);
        C2204961BRm.LJJJJJL(context, intent, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPq6bJLByDdrbA/Iwmex71F46W1Bg90G5oAstduzbmY=", null));
    }
}
