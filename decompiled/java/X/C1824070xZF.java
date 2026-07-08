package X;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;

/* JADX INFO: renamed from: X.0xZF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1824070xZF {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LIZ(Context context) {
        Resources resources;
        Configuration configuration;
        Integer numValueOf;
        int i = C19GT.LLILLJJLI;
        if (i != -1) {
            if (i != 1 && i == 2) {
                return true;
            }
        } else if (context != null && (resources = context.getResources()) != null && (configuration = resources.getConfiguration()) != null && (numValueOf = Integer.valueOf(configuration.uiMode & 48)) != null && numValueOf.intValue() == 32) {
            return true;
        }
        return false;
    }
}
