package X;

import android.app.Activity;
import android.content.Context;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0F3y, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C384040F3y {
    public static final C384040F3y LIZ = new C384040F3y();

    public static String LIZ(Context context, C377760ErW c377760ErW) {
        int i = c377760ErW.LIZIZ;
        if (i != -47364) {
            if (i != 501) {
                if (i != 30008 && i != 3019014) {
                    if (i != 4) {
                        if (i != 5) {
                            switch (i) {
                                case -7:
                                    return context.getString(2131829702);
                                case -6:
                                    return context.getString(2131829694);
                                case -5:
                                    return context.getString(2131825398, Integer.valueOf(c377760ErW.LIZLLL));
                                case -4:
                                    return context.getString(2131825397);
                                case -3:
                                    return context.getString(2131825406);
                                case -2:
                                    return context.getString(2131825396);
                                case -1:
                                    return context.getString(2131825348);
                                default:
                                    return context.getString(2131825348);
                            }
                        }
                        return context.getString(2131825402, Integer.valueOf(c377760ErW.LIZLLL));
                    }
                    return context.getString(2131825348);
                }
                return context.getString(2131825403);
            }
            return u.LJJIFFI(context.getString(2131834195), "{num}", String.valueOf(c377760ErW.LIZLLL), false);
        }
        return context.getString(2131857244);
    }

    public static C1397510mTF LIZIZ(Activity activity, CharSequence charSequence, String str, String str2, boolean z, int i, int i2, Function1 function1, Function0 function0, boolean z2) {
        C384030F3x c384030F3x;
        C1361400lX0 c1361400lX0LIZ = C1385040m98.LIZ(activity, true);
        C1397580mTM c1397580mTM = new C1397580mTM(c1361400lX0LIZ);
        if (z2) {
            c1397580mTM.LJIIJ = new C1397550mTJ(c1361400lX0LIZ, "", charSequence);
        } else {
            c1397580mTM.LJI("");
            c1397580mTM.LIZIZ(charSequence);
        }
        if (z) {
            c384030F3x = new C384030F3x(c1361400lX0LIZ);
        } else {
            c384030F3x = null;
        }
        if (c384030F3x != null) {
            C384000F3u.LIZ(c1397580mTM, c384030F3x);
        }
        C985403tE.LIZ(c1397580mTM, new C384020F3w(i, str, i2, str2, function1, c384030F3x, function0));
        C1397510mTF c1397510mTF = new C1397510mTF(c1397580mTM);
        c1397510mTF.LIZLLL();
        return c1397510mTF;
    }
}
