package X;

import android.app.Activity;
import android.content.Context;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.LinkedList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.08AJ, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C08AJ {
    public static final LinkedList<WeakReference<Activity>> LIZ = new LinkedList<>();

    public static final int LIZ(Context context) {
        Object obj;
        Activity activityLIZ;
        if (context != null && (activityLIZ = C1388190mED.LIZ(context)) != null) {
            context = activityLIZ;
        }
        if (!(context instanceof Activity)) {
            return 1;
        }
        Reference reference = (Reference) C13LP.LJJJLL(LIZ);
        if (reference != null) {
            obj = reference.get();
        } else {
            obj = null;
        }
        if (!Intrinsics.LJFF(obj, context)) {
            return 2;
        }
        return 3;
    }
}
