package X;

import android.content.Intent;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.ss.android.ugc.aweme.ailivephoto.AILivePhotoMiddleActivity;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.09e0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2419809e0 {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(AILivePhotoMiddleActivity aILivePhotoMiddleActivity, Function0 function0) {
        function0.invoke();
        if (C1906580ziK.LIZIZ() == null && C1906580ziK.LJFF() == null) {
            Intent intentLIZIZ = C2421209eE.LIZIZ(aILivePhotoMiddleActivity);
            RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(aILivePhotoMiddleActivity, intentLIZIZ, "Context_startActivity_1");
            C1701330uNH.LIZ(intentLIZIZ, aILivePhotoMiddleActivity);
            C2204961BRm.LJJJJJL(aILivePhotoMiddleActivity, intentLIZIZ, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF384cWghZ6S6ZpzBzjZpGDlHrqJcl8/bMCE7OXqfKqgqGGcljUr6iYcXEjo/eK2xBNGx", null));
        }
    }
}
