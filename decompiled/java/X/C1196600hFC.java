package X;

import android.view.View;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: renamed from: X.0hFC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1196600hFC {
    public static final Field LJIIJJI;
    public static final Class<?> LJIIL;
    public static final Field LJIILIIL;
    public static final Field LJIILJJIL;
    public static final Field LJIILL;
    public Integer LIZ;
    public Float LIZIZ;
    public Float LIZJ;
    public long LIZLLL;
    public String LJI;
    public String LJII;
    public String LJIIIIZZ;
    public PageFinder LJIIJ;
    public final HashMap<String, String> LJ = new HashMap<>();
    public String LJFF = "ttls_operation_on_poi";
    public List<Integer> LJIIIZ = C13BV.INSTANCE;

    static {
        Object c098200Yq;
        Object c098200Yq2;
        Object declaredField;
        Object c098200Yq3;
        Object c098200Yq4;
        try {
            c098200Yq = View.class.getDeclaredField("mListenerInfo");
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m5exceptionOrNullimpl(c098200Yq) != null) {
            c098200Yq = null;
        }
        LJIIJJI = (Field) c098200Yq;
        try {
            c098200Yq2 = Class.forName("android.view.View$ListenerInfo");
            C189200o6.m2constructorimpl(c098200Yq2);
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            c098200Yq2 = new C098200Yq(th2);
            C189200o6.m2constructorimpl(c098200Yq2);
        }
        if (C189200o6.m5exceptionOrNullimpl(c098200Yq2) != null) {
            c098200Yq2 = null;
        }
        Class<?> cls = (Class) c098200Yq2;
        LJIIL = cls;
        if (cls != null) {
            try {
                declaredField = cls.getDeclaredField("mOnTouchListener");
            } catch (Throwable th3) {
                TryCatchGuardChecker.doCheck(th3);
                declaredField = new C098200Yq(th3);
                C189200o6.m2constructorimpl(declaredField);
            }
        } else {
            declaredField = null;
        }
        C189200o6.m2constructorimpl(declaredField);
        if (C189200o6.m5exceptionOrNullimpl(declaredField) != null) {
            declaredField = null;
        }
        LJIILIIL = (Field) declaredField;
        try {
            Class<?> cls2 = LJIIL;
            c098200Yq3 = cls2 != null ? cls2.getDeclaredField("mOnClickListener") : null;
            C189200o6.m2constructorimpl(c098200Yq3);
        } catch (Throwable th4) {
            TryCatchGuardChecker.doCheck(th4);
            c098200Yq3 = new C098200Yq(th4);
            C189200o6.m2constructorimpl(c098200Yq3);
        }
        if (C189200o6.m5exceptionOrNullimpl(c098200Yq3) != null) {
            c098200Yq3 = null;
        }
        LJIILJJIL = (Field) c098200Yq3;
        try {
            Class<?> cls3 = LJIIL;
            c098200Yq4 = cls3 != null ? cls3.getDeclaredField("mOnLongClickListener") : null;
            C189200o6.m2constructorimpl(c098200Yq4);
        } catch (Throwable th5) {
            TryCatchGuardChecker.doCheck(th5);
            c098200Yq4 = new C098200Yq(th5);
            C189200o6.m2constructorimpl(c098200Yq4);
        }
        LJIILL = (Field) (C189200o6.m5exceptionOrNullimpl(c098200Yq4) == null ? c098200Yq4 : null);
    }

    public static String LIZ(View view) {
        String str;
        View view2 = null;
        if (view == null) {
            return null;
        }
        InterfaceC1173960geg interfaceC1173960geg = C1180170goh.LIZ;
        Object tag = view.getTag(-1990768404);
        if (!(tag instanceof String) || (str = (String) tag) == null) {
            Object parent = view.getParent();
            if (parent instanceof View) {
                view2 = (View) parent;
            }
            return LIZ(view2);
        }
        return str;
    }

    public static String LIZIZ(View view) {
        String str;
        View view2 = null;
        if (view == null) {
            return null;
        }
        Object tag = view.getTag(1706771800);
        if (!(tag instanceof String) || (str = (String) tag) == null) {
            Object parent = view.getParent();
            if (parent instanceof View) {
                view2 = (View) parent;
            }
            return LIZIZ(view2);
        }
        return str;
    }

    public static String LIZJ(View view) {
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
            return LIZJ(view2);
        }
        return str;
    }

    public final void LIZLLL(String str, String str2, String str3, boolean z) {
        String str4;
        try {
            if (!this.LJ.isEmpty()) {
                this.LJ.put("operation_type", str);
                HashMap<String, String> map = this.LJ;
                String str5 = "";
                if (!z) {
                    str4 = "";
                } else {
                    str4 = "1";
                }
                map.put("is_longpress_operation", str4);
                HashMap<String, String> map2 = this.LJ;
                if (str2 == null) {
                    str2 = "";
                }
                map2.put("ttls_module_name", str2);
                HashMap<String, String> map3 = this.LJ;
                if (str3 == null) {
                    str3 = "";
                }
                map3.put("ttls_component_name", str3);
                HashMap<String, String> map4 = this.LJ;
                String str6 = this.LJIIIIZZ;
                if (str6 != null) {
                    str5 = str6;
                }
                map4.put("instance_id", str5);
                C1185040gwY c1185040gwY = C1185040gwY.LIZ;
                String str7 = this.LJFF;
                HashMap<String, String> map5 = this.LJ;
                C1185050gwZ c1185050gwZ = new C1185050gwZ(this.LJIIJ);
                c1185040gwY.getClass();
                C1185040gwY.LIZIZ(str7, map5, c1185050gwZ);
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        this.LJII = null;
        this.LJI = null;
    }
}
