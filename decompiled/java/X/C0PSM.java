package X;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0PSM, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0PSM {
    public static void LIZ(Aweme aweme) {
        ViewGroup viewGroup;
        if (aweme == null) {
            return;
        }
        HashSet<C661850Pxf> value = C661850Pxf.LLLIZZ.getValue();
        ArrayList<View> arrayList = new ArrayList();
        Iterator<C661850Pxf> it2 = value.iterator();
        while (true) {
            String aid = null;
            if (!it2.hasNext()) {
                break;
            }
            C661850Pxf next = it2.next();
            Aweme mAweme = next.getMAweme();
            if (mAweme != null) {
                aid = mAweme.getAid();
            }
            if (Intrinsics.LJFF(aid, aweme.getAid())) {
                arrayList.add(next);
            }
        }
        for (View view : arrayList) {
            if (view.isAttachedToWindow() && view.getParent() != null) {
                ViewParent parent = view.getParent();
                if ((parent instanceof ViewGroup) && (viewGroup = (ViewGroup) parent) != null) {
                    int iIndexOfChild = viewGroup.indexOfChild(view);
                    C786410Ut5.LJJLIL(iIndexOfChild, viewGroup);
                    viewGroup.addView(view, iIndexOfChild);
                }
            }
        }
    }
}
