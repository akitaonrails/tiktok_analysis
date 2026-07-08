package X;

import android.content.Context;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0rdC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public class C1595880rdC implements InterfaceC1595900rdE {
    public static List LIZIZ(int i, List list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof C1596360rdy) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            C1596360rdy c1596360rdy = (C1596360rdy) obj2;
            if (!c1596360rdy.LL && C729510SjV.LJJJJLI(AwemeExtKt.getAuthorUid(c1596360rdy.LLILLJJLI)) && C1595840rd8.LIZJ(i, c1596360rdy)) {
                arrayList2.add(obj2);
            }
        }
        return C13LP.LL(arrayList2, 1);
    }

    @Override // X.InterfaceC1595900rdE
    public List<C1595600rck> LIZ(Context context, List<? extends InterfaceC1891350zJl> list, int i, EnumC1582650rHr enumC1582650rHr) {
        List listLIZIZ = LIZIZ(i, list);
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listLIZIZ, 10));
        Iterator it2 = listLIZIZ.iterator();
        while (it2.hasNext()) {
            arrayList.add(C1595920rdG.LIZIZ(context, (C1596360rdy) it2.next(), C1595840rd8.LIZIZ(i)));
        }
        return arrayList;
    }
}
