package X;

import android.content.Context;
import com.ss.android.ugc.aweme.feed.model.CardStruct;

/* JADX INFO: renamed from: X.0T83, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0T83 {
    public static final /* synthetic */ int LIZ = 0;

    public static String LIZIZ(long j) {
        StringBuilder sb = new StringBuilder();
        if (0 <= j && j < 10) {
            sb.append(CardStruct.IStatusCode.DEFAULT);
            sb.append(j);
        } else {
            sb.append(j);
        }
        return sb.toString();
    }

    public static float LIZ(float f, Context context) {
        return context.getResources().getDisplayMetrics().density * f;
    }
}
