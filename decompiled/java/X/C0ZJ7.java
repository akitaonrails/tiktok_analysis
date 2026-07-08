package X;

import android.view.View;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ZJ7, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0ZJ7 {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(View view) {
        view.setTag(R.id.kag, null);
    }

    public static void LIZIZ(View view, String str, Boolean bool) {
        if (str != null) {
            view.setTag(R.id.kag, new C0ZJ8(null, str, Intrinsics.LJFF(bool, Boolean.TRUE)));
        }
    }
}
