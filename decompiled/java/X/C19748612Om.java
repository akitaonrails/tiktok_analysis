package X;

import android.view.ViewGroup;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: X.12Om, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19748612Om {
    public static final C1149000g0Q LIZ = new C1149000g0Q();
    public static final ThreadLocal<WeakReference<C830490Whz<ViewGroup, ArrayList<AbstractC21463118z7>>>> LIZIZ = new ThreadLocal<>();
    public static final ArrayList<ViewGroup> LIZJ = new ArrayList<>();

    public static C830490Whz<ViewGroup, ArrayList<AbstractC21463118z7>> LIZJ() {
        C830490Whz<ViewGroup, ArrayList<AbstractC21463118z7>> c830490Whz;
        ThreadLocal<WeakReference<C830490Whz<ViewGroup, ArrayList<AbstractC21463118z7>>>> threadLocal = LIZIZ;
        WeakReference<C830490Whz<ViewGroup, ArrayList<AbstractC21463118z7>>> weakReference = threadLocal.get();
        if (weakReference != null && (c830490Whz = weakReference.get()) != null) {
            return c830490Whz;
        }
        C830490Whz<ViewGroup, ArrayList<AbstractC21463118z7>> c830490Whz2 = new C830490Whz<>();
        threadLocal.set(new WeakReference<>(c830490Whz2));
        return c830490Whz2;
    }

    public static void LIZIZ(ViewGroup viewGroup) {
        LIZJ.remove(viewGroup);
        ArrayList<AbstractC21463118z7> arrayList = LIZJ().get(viewGroup);
        if (arrayList != null && !arrayList.isEmpty()) {
            ArrayList arrayList2 = new ArrayList(arrayList);
            int size = arrayList2.size();
            while (true) {
                size--;
                if (size >= 0) {
                    ((AbstractC21463118z7) ListProtector.get(arrayList2, size)).LJIILL(viewGroup);
                } else {
                    return;
                }
            }
        }
    }

    public static void LIZ(ViewGroup viewGroup, AbstractC21463118z7 abstractC21463118z7) {
        ArrayList<ViewGroup> arrayList = LIZJ;
        if (!arrayList.contains(viewGroup) && viewGroup.isLaidOut()) {
            arrayList.add(viewGroup);
            if (abstractC21463118z7 == null) {
                abstractC21463118z7 = LIZ;
            }
            AbstractC21463118z7 abstractC21463118z7Clone = abstractC21463118z7.clone();
            ArrayList<AbstractC21463118z7> arrayList2 = LIZJ().get(viewGroup);
            if (arrayList2 != null && arrayList2.size() > 0) {
                Iterator<AbstractC21463118z7> it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    it2.next().LJJIFFI(viewGroup);
                }
            }
            if (abstractC21463118z7Clone != null) {
                abstractC21463118z7Clone.LJII(viewGroup, true);
            }
            if (viewGroup.getTag(R.id.yhx) == null) {
                viewGroup.setTag(R.id.yhx, null);
                if (abstractC21463118z7Clone != null) {
                    ViewTreeObserverOnPreDrawListenerC21463218z8 viewTreeObserverOnPreDrawListenerC21463218z8 = new ViewTreeObserverOnPreDrawListenerC21463218z8(viewGroup, abstractC21463118z7Clone);
                    viewGroup.addOnAttachStateChangeListener(viewTreeObserverOnPreDrawListenerC21463218z8);
                    C786410Ut5.y3(viewGroup.getViewTreeObserver(), viewTreeObserverOnPreDrawListenerC21463218z8);
                    return;
                }
                return;
            }
            throw null;
        }
    }
}
