package X;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.reflect.Field;
import kotlin.jvm.internal.AFwS189S0000000_3;

/* JADX INFO: renamed from: X.0gph, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1180790gph {
    public static final C1180790gph LIZ = new C1180790gph();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS189S0000000_3.get$arr$(1184));
    public static final C01GW LIZJ = C452501pT.LIZIZ(AFwS189S0000000_3.get$arr$(1183));
    public static final C01GW LIZLLL = C452501pT.LIZIZ(AFwS189S0000000_3.get$arr$(1185));

    public static Object LIZ(ViewGroup viewGroup) {
        Object objLIZ;
        Object obj;
        Field field = (Field) LIZIZ.getValue();
        if (field == null || (obj = field.get(viewGroup)) == null) {
            C531650Kt9 it2 = C13LZ.LJIILJJIL(0, viewGroup.getChildCount()).iterator();
            while (it2.LLILLL) {
                View childAt = viewGroup.getChildAt(it2.nextInt());
                if (childAt != null && (childAt instanceof ViewGroup) && (objLIZ = LIZ((ViewGroup) childAt)) != null) {
                    return objLIZ;
                }
            }
            return null;
        }
        return obj;
    }

    public static View LIZIZ(ViewGroup viewGroup) {
        View viewLIZIZ;
        if (viewGroup == null) {
            return null;
        }
        if (viewGroup.getTag(-916066015) != null) {
            return viewGroup;
        }
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt.getTag(-916066015) != null) {
                return childAt;
            }
            if ((childAt instanceof ViewGroup) && (viewLIZIZ = LIZIZ((ViewGroup) childAt)) != null) {
                return viewLIZIZ;
            }
        }
        return null;
    }

    public static String LIZLLL(View view) {
        String str;
        View view2 = null;
        if (view == null) {
            return null;
        }
        InterfaceC1173960geg interfaceC1173960geg = C1180170goh.LIZ;
        Object tag = view.getTag(-916066015);
        if (!(tag instanceof String) || (str = (String) tag) == null) {
            Object parent = view.getParent();
            if (parent instanceof View) {
                view2 = (View) parent;
            }
            return LIZLLL(view2);
        }
        return str;
    }

    public static View LJ(Object obj) throws IllegalAccessException {
        Object obj2;
        View view;
        while (obj != null) {
            Field field = (Field) LIZJ.getValue();
            if (field != null) {
                obj2 = field.get(obj);
            } else {
                obj2 = null;
            }
            if ((obj2 instanceof View) && (view = (View) obj2) != null) {
                if (view instanceof ViewGroup) {
                    LIZ.getClass();
                    if (!(view instanceof SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB) && !(view instanceof C1179570gnj)) {
                        View viewLJ = LJ(LIZ((ViewGroup) view));
                        if (viewLJ != null) {
                            return viewLJ;
                        }
                        return view;
                    }
                }
                LIZ.getClass();
                LIZLLL(view);
                return view;
            }
            Field field2 = (Field) LIZLLL.getValue();
            if (field2 != null) {
                obj = field2.get(obj);
            } else {
                obj = null;
            }
        }
        return null;
    }

    public static View LIZJ(MotionEvent motionEvent, ViewGroup viewGroup) throws IllegalAccessException {
        View viewLJ;
        Object objLIZ = LIZ(viewGroup);
        if (objLIZ != null) {
            LIZ.getClass();
            viewLJ = LJ(objLIZ);
        } else {
            viewLJ = null;
        }
        if (viewLJ instanceof C18Z9) {
            return LIZIZ((ViewGroup) ((RecyclerView) viewLJ).findChildViewUnder(motionEvent.getX() - r3.getLeft(), motionEvent.getY() - r3.getTop()));
        }
        return viewLJ;
    }
}
