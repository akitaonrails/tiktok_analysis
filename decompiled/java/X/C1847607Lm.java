package X;

import android.content.Context;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.07Lm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1847607Lm {
    public static final /* synthetic */ int LIZ = 0;

    public static Integer LIZ() {
        int iLIZ = C1838007Hu.LIZ();
        if (iLIZ != 1) {
            return iLIZ != 2 ? null : 2131822521;
        }
        return 2131825043;
    }

    public static String LIZIZ(Context context, Function0 function0) {
        String string;
        String string2;
        int iLIZ = C1838007Hu.LIZ();
        if (iLIZ != 1) {
            if (iLIZ != 2) {
                return (String) function0.invoke();
            }
            if (context != null && (string2 = context.getString(2131822511)) != null) {
                return string2;
            }
            return "";
        }
        if (context != null && (string = context.getString(2131848535)) != null) {
            return string;
        }
        return "";
    }
}
