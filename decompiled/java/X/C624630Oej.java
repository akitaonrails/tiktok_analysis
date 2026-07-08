package X;

import android.app.Activity;
import android.content.res.Resources;
import java.util.Arrays;

/* JADX INFO: renamed from: X.0Oej, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C624630Oej {
    public static String LIZ(int i, Activity activity) {
        String string;
        String strJ4;
        Resources resources;
        String quantityString;
        String strJ42;
        Resources resources2;
        String quantityString2;
        String strJ43;
        for (EnumC624640Oek enumC624640Oek : EnumC624640Oek.values()) {
            if (enumC624640Oek.getCount() == i) {
                if (C624670Oen.LIZLLL()) {
                    if (activity != null && (resources2 = activity.getResources()) != null && (quantityString2 = resources2.getQuantityString(2131755446, enumC624640Oek.getMinutes())) != null && (strJ43 = C786410Ut5.j4(quantityString2, Arrays.copyOf(new Object[]{Integer.valueOf(enumC624640Oek.getMinutes())}, 1))) != null) {
                        return strJ43;
                    }
                } else if (C624670Oen.LIZJ()) {
                    if (activity != null && (resources = activity.getResources()) != null && (quantityString = resources.getQuantityString(2131755444, enumC624640Oek.getCount())) != null && (strJ42 = C786410Ut5.j4(quantityString, Arrays.copyOf(new Object[]{Integer.valueOf(enumC624640Oek.getCount())}, 1))) != null) {
                        return strJ42;
                    }
                } else {
                    if (activity == null || (string = activity.getString(2131838559)) == null || (strJ4 = C786410Ut5.j4(string, Arrays.copyOf(new Object[]{Integer.valueOf(enumC624640Oek.getCount())}, 1))) == null) {
                        return "";
                    }
                    return strJ4;
                }
                return "";
            }
        }
        return "";
    }
}
