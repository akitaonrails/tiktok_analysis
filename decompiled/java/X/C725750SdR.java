package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AFwS198S0000000_11;
import kotlin.jvm.internal.AwS377S0200000_11;

/* JADX INFO: renamed from: X.0SdR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C725750SdR {
    public static final C01GW LIZ = C452501pT.LIZIZ(AFwS198S0000000_11.get$arr$(519));

    public static void LIZ(C2189821An6 c2189821An6) {
        Object next;
        List list = (List) LIZ.getValue();
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((InterfaceC725760SdS) obj).S3(c2189821An6)) {
                arrayList.add(obj);
            }
        }
        Iterator it2 = arrayList.iterator();
        if (!it2.hasNext()) {
            next = null;
        } else {
            next = it2.next();
            if (it2.hasNext()) {
                int priority = ((InterfaceC725760SdS) next).getPriority().getPriority();
                do {
                    Object next2 = it2.next();
                    int priority2 = ((InterfaceC725760SdS) next2).getPriority().getPriority();
                    if (priority > priority2) {
                        next = next2;
                        priority = priority2;
                    }
                } while (it2.hasNext());
            }
        }
        InterfaceC725760SdS interfaceC725760SdS = (InterfaceC725760SdS) next;
        if (interfaceC725760SdS != null) {
            interfaceC725760SdS.k5();
        }
    }

    public static C725770SdT LIZIZ(Aweme aweme, C2189821An6 c2189821An6) {
        if (c2189821An6 != null && aweme != null) {
            return new C725770SdT(new AwS377S0200000_11(aweme, c2189821An6, 170), new AwS377S0200000_11(aweme, c2189821An6, 171));
        }
        return null;
    }
}
