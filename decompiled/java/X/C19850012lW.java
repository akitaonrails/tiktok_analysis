package X;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: X.12lW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19850012lW {
    public static final void LIZ(Appendable appendable, Iterator it2, C19850212lY c19850212lY) {
        if (it2.hasNext()) {
            Map.Entry entry = (Map.Entry) it2.next();
            StringBuilder sb = (StringBuilder) appendable;
            sb.append(C19850212lY.LIZ(entry.getKey()));
            sb.append((CharSequence) " : ");
            sb.append(C19850212lY.LIZ(entry.getValue()));
            while (it2.hasNext()) {
                sb.append((CharSequence) ",\n  ");
                Map.Entry entry2 = (Map.Entry) it2.next();
                sb.append(C19850212lY.LIZ(entry2.getKey()));
                sb.append((CharSequence) " : ");
                sb.append(C19850212lY.LIZ(entry2.getValue()));
            }
        }
    }
}
