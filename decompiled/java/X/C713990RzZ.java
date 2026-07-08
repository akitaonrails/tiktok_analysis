package X;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0RzZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C713990RzZ extends C09AY implements Function1<C711590Rvh, View> {
    public C713990RzZ() {
        super(1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v7, types: [android.view.View] */
    @Override // kotlin.jvm.functions.Function1
    public final View invoke(C711590Rvh c711590Rvh) {
        ?? Td;
        LinkedList linkedList;
        Object next;
        Integer num;
        LinkedList<View> linkedList2;
        C711590Rvh c711590Rvh2 = c711590Rvh;
        C0X35.LIZ("live_feed_view_create_duration", true);
        C512350K7l c512350K7l = C512350K7l.LIZ;
        LayoutInflater layoutInflater = c711590Rvh2.LIZJ;
        ViewGroup viewGroup = c711590Rvh2.LIZ;
        String str = c711590Rvh2.LIZLLL.eventType;
        if (str == null) {
            str = "";
        }
        Fragment fragment = c711590Rvh2.LJ;
        c512350K7l.getClass();
        C1ACY.LIZ.getClass();
        Object objRemoveFirst = null;
        if (C1ACY.LJI.get() && C1ACY.LJJI != null) {
            HashMap<String, View> map = C1ACY.LJJI;
            if (map != null) {
                Td = map.get(str);
            } else {
                Td = 0;
            }
            if (Td != 0) {
                HashMap<String, View> map2 = C1ACY.LJJI;
                if (map2 != null) {
                    map2.clear();
                }
                C1ACY.LJJI = null;
            }
        } else {
            Td = 0;
        }
        if (Td == 0) {
            if (C293750BfJ.LIZ() && (linkedList2 = C1ACY.LJJIFFI) != null && !linkedList2.isEmpty()) {
                try {
                    Td = linkedList2.removeLast();
                } catch (NoSuchElementException e) {
                    TryCatchGuardChecker.doCheck(e);
                    Td = 0;
                }
            } else {
                Td = 0;
            }
        }
        if (Td == 0) {
            C755980Tl6 c755980Tl6LIZ = C755980Tl6.LIZ();
            c755980Tl6LIZ.getClass();
            if (C293750BfJ.LIZ() && !TextUtils.isEmpty(str) && c755980Tl6LIZ.LJIIIIZZ != null && (num = (Integer) ((ConcurrentHashMap) c755980Tl6LIZ.LJIIIIZZ).get(str)) != null && num.intValue() > 0) {
                ((ConcurrentHashMap) c755980Tl6LIZ.LJIIIIZZ).put(str, Integer.valueOf(num.intValue() - 1));
            }
            if (C07IN.LIZ() && c755980Tl6LIZ.LJII != null && !((ConcurrentHashMap) c755980Tl6LIZ.LJII).isEmpty()) {
                Set setKeySet = ((ConcurrentHashMap) c755980Tl6LIZ.LJII).keySet();
                if (setKeySet.contains(fragment)) {
                    linkedList = (LinkedList) ((ConcurrentHashMap) c755980Tl6LIZ.LJII).get(fragment);
                } else {
                    linkedList = null;
                }
                if (linkedList == null || linkedList.isEmpty()) {
                    Iterator it2 = setKeySet.iterator();
                    while (it2.hasNext() && ((next = it2.next()) == fragment || (linkedList = (LinkedList) ((ConcurrentHashMap) c755980Tl6LIZ.LJII).get(next)) == null || linkedList.isEmpty())) {
                    }
                }
                if (linkedList != null && !linkedList.isEmpty()) {
                    objRemoveFirst = linkedList.removeFirst();
                }
            }
            if (objRemoveFirst == null) {
                Td = C786410Ut5.Td(layoutInflater, R.layout.dbz, viewGroup, false);
            } else {
                Td = objRemoveFirst;
            }
        }
        C0X35.LJIIJJI("live_feed_view_create_duration", true);
        return Td;
    }
}
