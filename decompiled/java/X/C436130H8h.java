package X;

import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchAwemeInfo;
import java.util.Iterator;

/* JADX INFO: renamed from: X.0H8h, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C436130H8h {
    public static EnumC436120H8g LIZ(int i) {
        EnumC436120H8g next;
        Iterator<EnumC436120H8g> it2 = EnumC436120H8g.getEntries().iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (next.getValue() == i) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        EnumC436120H8g enumC436120H8g = next;
        if (enumC436120H8g == null) {
            return EnumC436120H8g.DEFAULT;
        }
        return enumC436120H8g;
    }

    public static boolean LIZIZ(SearchAwemeInfo searchAwemeInfo) {
        int value;
        Integer num;
        if (searchAwemeInfo != null && (num = searchAwemeInfo.intentType) != null) {
            value = num.intValue();
        } else {
            value = EnumC436120H8g.DEFAULT.getValue();
        }
        if (value > EnumC436120H8g.DEFAULT.getValue()) {
            return true;
        }
        return false;
    }

    public static boolean LIZJ(EnumC436120H8g enumC436120H8g) {
        if (enumC436120H8g != null && enumC436120H8g.getValue() > EnumC436120H8g.DEFAULT.getValue()) {
            return true;
        }
        return false;
    }
}
