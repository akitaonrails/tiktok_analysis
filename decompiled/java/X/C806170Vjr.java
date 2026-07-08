package X;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0Vjr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C806170Vjr {
    public static boolean LIZIZ(AbstractC806220Vjw abstractC806220Vjw) {
        if (!(abstractC806220Vjw instanceof C806190Vjt)) {
            if (abstractC806220Vjw instanceof C806200Vju) {
                List<AbstractC806220Vjw> list = ((C806200Vju) abstractC806220Vjw).LIZIZ;
                if ((list instanceof Collection) && list.isEmpty()) {
                    return false;
                }
                Iterator<AbstractC806220Vjw> it2 = list.iterator();
                while (it2.hasNext()) {
                    if (LIZIZ(it2.next())) {
                        return true;
                    }
                }
                return false;
            }
            if (abstractC806220Vjw instanceof C806210Vjv) {
                List<AbstractC806220Vjw> list2 = ((C806210Vjv) abstractC806220Vjw).LIZIZ;
                if ((list2 instanceof Collection) && list2.isEmpty()) {
                    return false;
                }
                Iterator<AbstractC806220Vjw> it3 = list2.iterator();
                while (it3.hasNext()) {
                    if (LIZIZ(it3.next())) {
                        return true;
                    }
                }
                return false;
            }
            throw new C1954807lC();
        }
        return true;
    }

    public static boolean LIZ(AbstractC806220Vjw abstractC806220Vjw, C806050Vjf c806050Vjf) {
        if (abstractC806220Vjw instanceof C806190Vjt) {
            return ((C806190Vjt) abstractC806220Vjw).LIZIZ.LIZ(c806050Vjf);
        }
        if (abstractC806220Vjw instanceof C806200Vju) {
            List<AbstractC806220Vjw> list = ((C806200Vju) abstractC806220Vjw).LIZIZ;
            if (!list.isEmpty()) {
                Iterator<AbstractC806220Vjw> it2 = list.iterator();
                while (it2.hasNext()) {
                    if (!LIZ(it2.next(), c806050Vjf)) {
                        return false;
                    }
                }
                return true;
            }
            return true;
        }
        if (abstractC806220Vjw instanceof C806210Vjv) {
            List<AbstractC806220Vjw> list2 = ((C806210Vjv) abstractC806220Vjw).LIZIZ;
            if (!list2.isEmpty()) {
                Iterator<AbstractC806220Vjw> it3 = list2.iterator();
                while (it3.hasNext()) {
                    if (LIZ(it3.next(), c806050Vjf)) {
                        return true;
                    }
                }
                return false;
            }
            return false;
        }
        throw new C1954807lC();
    }
}
