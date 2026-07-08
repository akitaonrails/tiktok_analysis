package X;

import android.app.Application;
import java.util.List;

/* JADX INFO: renamed from: X.0XVe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C849760XVe {
    public static final String LIZ(C0XGA c0xga) {
        Integer numValueOf;
        String str = null;
        if (c0xga != null) {
            numValueOf = Integer.valueOf(c0xga.LIZLLL);
            str = c0xga.LJFF;
        } else {
            numValueOf = null;
        }
        return LIZIZ(numValueOf, str);
    }

    public static final String LIZIZ(Integer num, String str) {
        if (num != null && num.intValue() >= 0) {
            if (str == null) {
                return "";
            }
            return str;
        }
        List<InterfaceC586170Myt> list = C0XQ5.LIZ;
        Application application = C0XPY.LIZIZ;
        if (application == null) {
            return "Sorry, error occurred";
        }
        return application.getString(2131837962);
    }
}
