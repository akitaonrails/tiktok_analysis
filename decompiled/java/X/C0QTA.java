package X;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0QTA, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0QTA {
    public static final String LIZ(int i) {
        if (i < 0) {
            return "";
        }
        if (i == C669740QOu.LJ()) {
            return "shop";
        }
        List<EnumC669620QOi> list = C669740QOu.LIZIZ;
        if (i == ((ArrayList) list).indexOf(EnumC669620QOi.STORE)) {
            return "store";
        }
        if (i == ((ArrayList) list).indexOf(EnumC669620QOi.ECOM_LIVE)) {
            return "ecom_live";
        }
        if (i != ((ArrayList) list).indexOf(EnumC669620QOi.ORDER)) {
            return "";
        }
        return "order";
    }

    public static final String LIZIZ(int i) {
        if (i < 0) {
            return null;
        }
        if (i == C669740QOu.LJ()) {
            return "shop";
        }
        List<EnumC669620QOi> list = C669740QOu.LIZIZ;
        if (i == ((ArrayList) list).indexOf(EnumC669620QOi.STORE)) {
            return "store";
        }
        if (i != ((ArrayList) list).indexOf(EnumC669620QOi.ECOM_LIVE)) {
            return null;
        }
        return "ecom_live";
    }

    public static final String LIZJ(int i) {
        if (i < 0) {
            return null;
        }
        if (i == C669740QOu.LJ()) {
            return "shop";
        }
        List<EnumC669620QOi> list = C669740QOu.LIZIZ;
        if (i == ((ArrayList) list).indexOf(EnumC669620QOi.STORE)) {
            return "store";
        }
        if (i != ((ArrayList) list).indexOf(EnumC669620QOi.ECOM_LIVE)) {
            return null;
        }
        return "ecom_live";
    }
}
