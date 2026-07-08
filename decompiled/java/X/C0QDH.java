package X;

import com.ss.android.ugc.aweme.search.common.communicate.AbsSearchService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0QDH, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0QDH extends C09AY implements Function0<List<? extends String>> {
    public C0QDH() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final List<? extends String> invoke() {
        ArrayList arrayList = new ArrayList();
        if (C1835007Gq.LIZ()) {
            Iterator<String> it2 = AbsSearchService.LJJ.iterator();
            while (it2.hasNext()) {
                Object obj = C0N6R.LIZ().get(it2.next());
                if (obj != null) {
                    arrayList.add(obj);
                }
            }
        } else {
            Iterator<String> it3 = AbsSearchService.LJIL.iterator();
            while (it3.hasNext()) {
                Object obj2 = C0N6R.LIZ().get(it3.next());
                if (obj2 != null) {
                    arrayList.add(obj2);
                }
            }
        }
        return C13LP.LLIIII(arrayList);
    }
}
