package X;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0O26, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0O26 {
    public static final List LIZ(Function1 function1, Object obj) {
        String str;
        List listSingletonList;
        if (obj == null || (str = (String) function1.invoke(obj)) == null || (listSingletonList = Collections.singletonList(new C595710NYb(str))) == null) {
            return C13BV.INSTANCE;
        }
        return listSingletonList;
    }

    public static final <T> List<AbstractC595720NYc> LIZIZ(List<? extends T> list, Function1<? super T, String> function1) {
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            Iterator<? extends T> it2 = list.iterator();
            while (it2.hasNext()) {
                String strInvoke = function1.invoke(it2.next());
                if (strInvoke != null) {
                    arrayList.add(new C595710NYb(strInvoke));
                }
            }
            return arrayList;
        }
        return C13BV.INSTANCE;
    }

    public static final C595710NYb LIZJ(Function1 function1, Object obj) {
        String str;
        if (obj != null && (str = (String) function1.invoke(obj)) != null) {
            return new C595710NYb(str);
        }
        return null;
    }
}
