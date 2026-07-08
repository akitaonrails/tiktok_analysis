package X;

import Y.ATListenerS441S0100000_7;
import android.app.Activity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0J30, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0J30 {
    public static final /* synthetic */ int LJII = 0;
    public int LIZJ;
    public int LIZLLL;
    public boolean LJ;
    public final int LJFF;
    public final HashMap<Integer, List<Pair<View, C0J31>>> LIZ = new HashMap<>();
    public final List<Function2<MotionEvent, Boolean, Boolean>> LIZIZ = new ArrayList();
    public final ATListenerS441S0100000_7 LJI = new ATListenerS441S0100000_7(this, 12);

    static {
        new Object() { // from class: X.0J2z
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r5v0 */
            /* JADX WARN: Type inference failed for: r5v1, types: [T, X.0J30] */
            /* JADX WARN: Type inference failed for: r5v3 */
            public static void LIZ(final C19EG c19eg, final int i, final View view, final C0J31 c0j31, C0J30 c0j30, boolean z, int i2) {
                ?? c0j302;
                final boolean z2 = z;
                final C0J30 c0j303 = c0j30;
                if ((i2 & 16) != 0) {
                    c0j303 = null;
                }
                if ((i2 & 32) != 0) {
                    z2 = false;
                }
                if (Intrinsics.LJFF(view.getContext(), c19eg) && c19eg.findViewById(R.id.due) != null) {
                    final C259800zU c259800zU = new C259800zU();
                    if (c0j303 == null) {
                        c0j302 = new C0J30(c19eg);
                    } else {
                        c0j302 = c0j303;
                    }
                    HashMap<Integer, List<Pair<View, C0J31>>> map = c0j302.LIZ;
                    Integer numValueOf = Integer.valueOf(i);
                    List<Pair<View, C0J31>> arrayList = c0j302.LIZ.get(Integer.valueOf(i));
                    if (arrayList == null) {
                        arrayList = new ArrayList<>();
                    }
                    ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
                    Iterator<Pair<View, C0J31>> it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        arrayList2.add(it2.next().getFirst());
                    }
                    if (arrayList2.contains(view)) {
                        ListProtector.remove(arrayList, arrayList2.indexOf(view));
                    }
                    arrayList.add(new Pair<>(view, c0j31));
                    map.put(numValueOf, arrayList);
                    c259800zU.element = c0j302;
                    c0j31.onBind();
                    view.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: X.0J2y
                        /* JADX WARN: Multi-variable type inference failed */
                        /* JADX WARN: Type inference failed for: r2v0, types: [X.13BV] */
                        /* JADX WARN: Type inference failed for: r2v1, types: [java.util.List] */
                        /* JADX WARN: Type inference failed for: r2v3, types: [java.util.ArrayList] */
                        /* JADX WARN: Type inference failed for: r6v1, types: [T, X.0J30] */
                        /* JADX WARN: Type inference failed for: r6v3 */
                        /* JADX WARN: Type inference failed for: r6v4 */
                        @Override // android.view.View.OnAttachStateChangeListener
                        public final void onViewAttachedToWindow(View view2) {
                            ?? arrayList3;
                            C259800zU<C0J30> c259800zU2 = c259800zU;
                            C0J30 c0j304 = c0j303;
                            ?? c0j305 = c0j304;
                            if (c0j304 == null) {
                                c0j305 = new C0J30(c19eg);
                            }
                            int i3 = i;
                            View view3 = view;
                            C0J31 c0j312 = c0j31;
                            List<Pair<View, C0J31>> list = c0j305.LIZ.get(Integer.valueOf(i3));
                            if (list != null) {
                                arrayList3 = new ArrayList(C15438062q.LJIJJ(list, 10));
                                Iterator<Pair<View, C0J31>> it3 = list.iterator();
                                while (it3.hasNext()) {
                                    arrayList3.add(it3.next().getFirst());
                                }
                            } else {
                                arrayList3 = C13BV.INSTANCE;
                            }
                            if (!arrayList3.contains(view3)) {
                                HashMap<Integer, List<Pair<View, C0J31>>> map2 = c0j305.LIZ;
                                Integer numValueOf2 = Integer.valueOf(i3);
                                List<Pair<View, C0J31>> arrayList4 = c0j305.LIZ.get(Integer.valueOf(i3));
                                if (arrayList4 == null) {
                                    arrayList4 = new ArrayList<>();
                                }
                                arrayList4.add(new Pair<>(view3, c0j312));
                                map2.put(numValueOf2, arrayList4);
                            }
                            c259800zU2.element = c0j305;
                        }

                        @Override // android.view.View.OnAttachStateChangeListener
                        public final void onViewDetachedFromWindow(View view2) {
                            C485690J2x c485690J2x;
                            Activity activity = c19eg;
                            C0J30 c0j304 = c259800zU.element;
                            int i3 = i;
                            View view3 = view;
                            C0J31 c0j312 = c0j31;
                            boolean z3 = z2;
                            List<Pair<View, C0J31>> list = c0j304.LIZ.get(Integer.valueOf(i3));
                            if (list != null) {
                                ArrayList<Pair> arrayList3 = new ArrayList();
                                arrayList3.addAll(list);
                                for (Pair pair : arrayList3) {
                                    if (Intrinsics.LJFF(pair.getFirst(), view3) || Intrinsics.LJFF(pair.getSecond(), c0j312)) {
                                        list.remove(pair);
                                        if (list.isEmpty()) {
                                            c0j304.LIZ.remove(Integer.valueOf(i3));
                                        }
                                        if (c0j304.LIZ.isEmpty() && z3 && (c485690J2x = (C485690J2x) activity.findViewById(R.id.due)) != null) {
                                            ((ArrayList) c485690J2x.LL).remove(c0j304.LJI);
                                        }
                                        ((C0J31) pair.getSecond()).onUnbind();
                                    }
                                }
                            }
                        }
                    });
                    C485690J2x c485690J2x = (C485690J2x) c19eg.findViewById(R.id.due);
                    if (c485690J2x != null) {
                        ((ArrayList) c485690J2x.LL).remove(((C0J30) c259800zU.element).LJI);
                    }
                    C485690J2x c485690J2x2 = (C485690J2x) c19eg.findViewById(R.id.due);
                    if (c485690J2x2 != null) {
                        ((ArrayList) c485690J2x2.LL).add(((C0J30) c259800zU.element).LJI);
                    }
                }
            }
        };
    }

    public C0J30(Activity activity) {
        this.LJFF = ViewConfiguration.get(activity).getScaledTouchSlop();
    }
}
