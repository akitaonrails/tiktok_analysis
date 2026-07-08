package X;

import java.util.Iterator;

/* JADX INFO: renamed from: X.18Ty, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21291618Ty {
    public static EnumC21291418Tw LIZ(int i) {
        EnumC21291418Tw next;
        Iterator<EnumC21291418Tw> it2 = EnumC21291418Tw.getEntries().iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (next.getResId() == i) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        EnumC21291418Tw enumC21291418Tw = next;
        if (enumC21291418Tw == null) {
            EnumC21291418Tw enumC21291418Tw2 = EnumC21291418Tw.NONSUPPORT_DYNAMIC_STRING;
            enumC21291418Tw2.setResId(i);
            return enumC21291418Tw2;
        }
        return enumC21291418Tw;
    }
}
