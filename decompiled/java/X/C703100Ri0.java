package X;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0Ri0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C703100Ri0 {
    public static final /* synthetic */ int LIZ = 0;

    public static C703140Ri4 LIZ(String str, C703070Rhx c703070Rhx, Map map) {
        EnumC699470Rc9 enumC699470Rc9;
        EnumC699470Rc9 enumC699470Rc92;
        if (c703070Rhx != null) {
            enumC699470Rc9 = c703070Rhx.LIZ;
        } else {
            enumC699470Rc9 = null;
        }
        if (enumC699470Rc9 != null) {
            return new C703140Ri4(enumC699470Rc9, false);
        }
        List list = (List) map.get(str);
        if (list == null) {
            list = C13BV.INSTANCE;
        }
        if ((list instanceof Collection) && list.isEmpty()) {
            enumC699470Rc92 = EnumC699470Rc9.AVAILABLE;
        } else {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                if (((C703160Ri6) it2.next()).LIZIZ == EnumC703190Ri9.ADD) {
                    enumC699470Rc92 = EnumC699470Rc9.UNAVAILABLE;
                    break;
                }
            }
            enumC699470Rc92 = EnumC699470Rc9.AVAILABLE;
        }
        return new C703140Ri4(enumC699470Rc92, true);
    }
}
