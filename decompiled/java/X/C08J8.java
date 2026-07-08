package X;

import android.view.View;
import android.view.ViewGroup;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: renamed from: X.08J8, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C08J8 {
    public static final List<View> LIZ(View view) {
        LinkedList linkedList = new LinkedList();
        LinkedList linkedList2 = new LinkedList();
        linkedList2.addLast(view);
        while (!linkedList2.isEmpty()) {
            View view2 = (View) linkedList2.removeFirst();
            if (view2 instanceof ViewGroup) {
                C19719612Di.LJJIFFI(linkedList2, new C09RD((ViewGroup) view2));
            }
            linkedList.add(view2);
        }
        return linkedList;
    }
}
