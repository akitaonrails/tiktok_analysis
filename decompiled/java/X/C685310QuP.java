package X;

import com.ss.android.ugc.aweme.nimblecard.model.NimbleJson;
import com.ss.android.ugc.aweme.nimblecard.model.Template;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0QuP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C685310QuP {
    public static final List<Integer> LIZ(NimbleJson nimbleJson) {
        List<Template> list;
        if (nimbleJson != null && (list = nimbleJson.templates) != null) {
            ArrayList arrayList = new ArrayList();
            Iterator<Template> it2 = list.iterator();
            while (it2.hasNext()) {
                Iterable iterable = it2.next().types;
                if (iterable == null) {
                    iterable = C13BV.INSTANCE;
                }
                C19719612Di.LJJI(iterable, arrayList);
            }
            return arrayList;
        }
        return C13BV.INSTANCE;
    }

    public static final Template LIZIZ(NimbleJson nimbleJson, int i) {
        List<Template> list;
        if (nimbleJson != null && (list = nimbleJson.templates) != null) {
            for (Template template : list) {
                List<Integer> list2 = template.types;
                if (list2 != null && list2.contains(Integer.valueOf(i))) {
                    return template;
                }
            }
            return null;
        }
        return null;
    }
}
