package X;

import com.ss.android.ugc.aweme.outreach.dispersion.save.OutreachRecordData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0119, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class AnonymousClass0119 {
    public static final String LIZ(CopyOnWriteArrayList<OutreachRecordData> copyOnWriteArrayList, Function1<? super OutreachRecordData, String> function1) {
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(copyOnWriteArrayList, 10));
        Iterator<OutreachRecordData> it2 = copyOnWriteArrayList.iterator();
        while (it2.hasNext()) {
            String strInvoke = function1.invoke(it2.next());
            if (strInvoke == null) {
                strInvoke = "";
            }
            arrayList.add(strInvoke);
        }
        return C13LP.LJJLIIIJ(C13LP.LJJJJI(arrayList), ",", null, null, 0, null, null, 62);
    }
}
