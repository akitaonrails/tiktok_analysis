package X;

import android.content.Context;
import android.content.res.Resources;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0kst, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1336530kst {
    public static final /* synthetic */ int LIZ = 0;

    public static String LIZ(Context context, String str) {
        Resources resources;
        String string;
        if (Intrinsics.LJFF(str, "All") && context != null && (resources = context.getResources()) != null && (string = resources.getString(2131826395)) != null) {
            return string;
        }
        return str;
    }
}
