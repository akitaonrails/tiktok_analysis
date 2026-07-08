package X;

import android.content.Context;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0rdA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public class C1595860rdA implements InterfaceC1595900rdE {
    @Override // X.InterfaceC1595900rdE
    public List<C1595600rck> LIZ(Context context, List<? extends InterfaceC1891350zJl> list, int i, EnumC1582650rHr enumC1582650rHr) {
        ArrayList arrayList = new ArrayList();
        for (InterfaceC1891350zJl interfaceC1891350zJl : list) {
            if (interfaceC1891350zJl instanceof C1596360rdy) {
                arrayList.add(interfaceC1891350zJl);
            }
        }
        int iLIZIZ = C1595840rd8.LIZIZ(i);
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            C1596360rdy c1596360rdy = (C1596360rdy) obj;
            if (!c1596360rdy.LL && C729510SjV.LJJJJLI(AwemeExtKt.getAuthorUid(c1596360rdy.LLILLJJLI)) && C1595840rd8.LIZJ(i, c1596360rdy)) {
                arrayList2.add(obj);
            }
        }
        List listLL = C13LP.LL(arrayList2, 2);
        if (!listLL.isEmpty()) {
            ArrayList arrayList3 = new ArrayList(C15438062q.LJIJJ(listLL, 10));
            Iterator it2 = listLL.iterator();
            while (it2.hasNext()) {
                arrayList3.add(C1595920rdG.LIZIZ(context, (C1596360rdy) it2.next(), iLIZIZ));
            }
            return arrayList3;
        }
        if (arrayList.size() > 1) {
            Object obj2 = null;
            if (1 != 0) {
                Iterator it3 = arrayList.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        break;
                    }
                    Object next = it3.next();
                    C1596360rdy c1596360rdy2 = (C1596360rdy) next;
                    if (!c1596360rdy2.LL && C1595840rd8.LIZJ(i, c1596360rdy2)) {
                        obj2 = next;
                        break;
                    }
                }
                C1596360rdy c1596360rdy3 = (C1596360rdy) obj2;
                if (c1596360rdy3 != null) {
                    return Collections.singletonList(C1595920rdG.LIZIZ(context, c1596360rdy3, iLIZIZ));
                }
            }
        }
        return C13BV.INSTANCE;
    }
}
