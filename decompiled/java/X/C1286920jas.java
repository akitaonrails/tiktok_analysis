package X;

import android.app.Activity;
import androidx.fragment.app.Fragment;
import java.text.SimpleDateFormat;

/* JADX INFO: renamed from: X.0jas, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1286920jas {
    public static SimpleDateFormat LIZLLL;
    public final Activity LIZ;
    public final Fragment LIZIZ;
    public final InterfaceC1327180kdo LIZJ;

    public static boolean LIZ(String str, String[] strArr) {
        for (String str2 : strArr) {
            if (str2.equals(str)) {
                return true;
            }
        }
        return false;
    }

    public C1286920jas(C19EG c19eg, Fragment fragment, C1286910jar c1286910jar) {
        this.LIZ = c19eg;
        this.LIZIZ = fragment;
        this.LIZJ = c1286910jar;
        if (c19eg == null) {
            this.LIZ = fragment.getActivity();
        }
    }
}
