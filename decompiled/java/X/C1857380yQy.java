package X;

import com.ss.android.ugc.aweme.nimblecard.model.Ability;
import com.ss.android.ugc.aweme.nimblecard.model.Component;
import com.ss.android.ugc.aweme.nimblecard.model.Template;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0yQy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1857380yQy {
    public static boolean LIZIZ(Template template) {
        List<Component> list;
        if (template != null) {
            list = template.components;
        } else {
            list = null;
        }
        if (list == null || list.isEmpty()) {
            return false;
        }
        Iterator<Component> it2 = list.iterator();
        while (it2.hasNext()) {
            if (LIZ(EnumC1857370yQx.COPY.getTag(), it2.next().abilities)) {
                return true;
            }
        }
        return false;
    }

    public static boolean LIZJ(Template template) {
        List<Component> list;
        if (template != null) {
            list = template.components;
        } else {
            list = null;
        }
        if (list == null || list.isEmpty()) {
            return false;
        }
        Iterator<Component> it2 = list.iterator();
        while (it2.hasNext()) {
            if (LIZ(EnumC1857370yQx.SHARE.getTag(), it2.next().abilities)) {
                return true;
            }
        }
        return false;
    }

    public static boolean LIZ(String str, List list) {
        if (list == null || list.isEmpty()) {
            return false;
        }
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            if (((Ability) it2.next()).value.contains(str)) {
                return true;
            }
        }
        return false;
    }
}
