package X;

import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: X.13k9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public class C20096313k9 {
    public static final ArrayList<WeakReference<View>> LIZLLL = new ArrayList<>();
    public WeakHashMap<View, Boolean> LIZ;
    public SparseArray<WeakReference<View>> LIZIZ;
    public WeakReference<KeyEvent> LIZJ;

    public static boolean LIZIZ(View view, KeyEvent keyEvent) {
        ArrayList arrayList = (ArrayList) view.getTag(R.id.x2i);
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                if (((InterfaceC20096113k7) ListProtector.get(arrayList, size)).LIZ()) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public final View LIZ(View view, KeyEvent keyEvent) {
        View viewLIZ;
        WeakHashMap<View, Boolean> weakHashMap = this.LIZ;
        if (weakHashMap != null && weakHashMap.containsKey(view)) {
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                do {
                    childCount--;
                    if (childCount >= 0) {
                        viewLIZ = LIZ(viewGroup.getChildAt(childCount), keyEvent);
                    }
                } while (viewLIZ == null);
                return viewLIZ;
            }
            if (LIZIZ(view, keyEvent)) {
                return view;
            }
            return null;
        }
        return null;
    }
}
