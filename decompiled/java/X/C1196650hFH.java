package X;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.Window;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0hFH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1196650hFH {
    public static final Field LJIJJ;
    public static final Field LJIJJLI;
    public static final Class<?> LJIL;
    public static final Field LJJ;
    public static final Field LJJI;
    public static final Field LJJIFFI;
    public static final Field LJJII;
    public static final Class<?> LJJIII;
    public boolean LIZ;
    public boolean LIZIZ;
    public Integer LIZJ;
    public Float LIZLLL;
    public Float LJ;
    public long LJFF;
    public Function0<Boolean> LJIIJJI;
    public Function1<? super String, Unit> LJIIL;
    public List<Integer> LJIILJJIL;
    public List<Integer> LJIILL;
    public Boolean LJIILLIIL;
    public final Boolean LJIIZILJ;
    public Boolean LJIJ;
    public final boolean LJIJI;
    public final HashMap<String, String> LJI = new HashMap<>();
    public int LJII = 3;
    public String LJIIIIZZ = "";
    public String LJIIIZ = "operation_on_poi_detail";
    public final String LJIIJ = "click_on_poi_detail";
    public String LJIILIIL = "other";

    static {
        Object c098200Yq;
        Object c098200Yq2;
        Object c098200Yq3;
        Object declaredField;
        Object c098200Yq4;
        Object c098200Yq5;
        Object c098200Yq6;
        Object c098200Yq7;
        try {
            c098200Yq = ViewGroup.class.getDeclaredField("mFirstTouchTarget");
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m5exceptionOrNullimpl(c098200Yq) != null) {
            c098200Yq = null;
        }
        LJIJJ = (Field) c098200Yq;
        try {
            c098200Yq2 = View.class.getDeclaredField("mListenerInfo");
            C189200o6.m2constructorimpl(c098200Yq2);
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            c098200Yq2 = new C098200Yq(th2);
            C189200o6.m2constructorimpl(c098200Yq2);
        }
        if (C189200o6.m5exceptionOrNullimpl(c098200Yq2) != null) {
            c098200Yq2 = null;
        }
        LJIJJLI = (Field) c098200Yq2;
        try {
            c098200Yq3 = Class.forName("android.view.View$ListenerInfo");
            C189200o6.m2constructorimpl(c098200Yq3);
        } catch (Throwable th3) {
            TryCatchGuardChecker.doCheck(th3);
            c098200Yq3 = new C098200Yq(th3);
            C189200o6.m2constructorimpl(c098200Yq3);
        }
        if (C189200o6.m5exceptionOrNullimpl(c098200Yq3) != null) {
            c098200Yq3 = null;
        }
        Class<?> cls = (Class) c098200Yq3;
        LJIL = cls;
        if (cls != null) {
            try {
                declaredField = cls.getDeclaredField("mOnTouchListener");
            } catch (Throwable th4) {
                TryCatchGuardChecker.doCheck(th4);
                declaredField = new C098200Yq(th4);
                C189200o6.m2constructorimpl(declaredField);
            }
        } else {
            declaredField = null;
        }
        C189200o6.m2constructorimpl(declaredField);
        if (C189200o6.m5exceptionOrNullimpl(declaredField) != null) {
            declaredField = null;
        }
        LJJ = (Field) declaredField;
        try {
            Class<?> cls2 = LJIL;
            c098200Yq4 = cls2 != null ? cls2.getDeclaredField("mOnClickListener") : null;
            C189200o6.m2constructorimpl(c098200Yq4);
        } catch (Throwable th5) {
            TryCatchGuardChecker.doCheck(th5);
            c098200Yq4 = new C098200Yq(th5);
            C189200o6.m2constructorimpl(c098200Yq4);
        }
        if (C189200o6.m5exceptionOrNullimpl(c098200Yq4) != null) {
            c098200Yq4 = null;
        }
        LJJI = (Field) c098200Yq4;
        try {
            Class<?> cls3 = LJIL;
            c098200Yq5 = cls3 != null ? cls3.getDeclaredField("mOnLongClickListener") : null;
            C189200o6.m2constructorimpl(c098200Yq5);
        } catch (Throwable th6) {
            TryCatchGuardChecker.doCheck(th6);
            c098200Yq5 = new C098200Yq(th6);
            C189200o6.m2constructorimpl(c098200Yq5);
        }
        if (C189200o6.m5exceptionOrNullimpl(c098200Yq5) != null) {
            c098200Yq5 = null;
        }
        LJJIFFI = (Field) c098200Yq5;
        try {
            c098200Yq6 = Class.forName("android.view.ViewGroup$TouchTarget").getDeclaredField("child");
            C189200o6.m2constructorimpl(c098200Yq6);
        } catch (Throwable th7) {
            TryCatchGuardChecker.doCheck(th7);
            c098200Yq6 = new C098200Yq(th7);
            C189200o6.m2constructorimpl(c098200Yq6);
        }
        if (C189200o6.m5exceptionOrNullimpl(c098200Yq6) != null) {
            c098200Yq6 = null;
        }
        LJJII = (Field) c098200Yq6;
        try {
            c098200Yq7 = Class.forName("com.lynx.tasm.LynxView");
            C189200o6.m2constructorimpl(c098200Yq7);
        } catch (Throwable th8) {
            TryCatchGuardChecker.doCheck(th8);
            c098200Yq7 = new C098200Yq(th8);
            C189200o6.m2constructorimpl(c098200Yq7);
        }
        LJJIII = (Class) (C189200o6.m5exceptionOrNullimpl(c098200Yq7) == null ? c098200Yq7 : null);
    }

    public final void LIZLLL() {
        if (this.LIZIZ || this.LJI.isEmpty()) {
            return;
        }
        if (!this.LJIJI) {
            this.LIZIZ = true;
        }
        HashMap map = new HashMap(this.LJI);
        if (map.containsKey("operation_type")) {
            map.remove("operation_type");
        }
        C1185040gwY c1185040gwY = C1185040gwY.LIZ;
        String str = this.LJIIJ;
        c1185040gwY.getClass();
        C1185040gwY.LIZIZ(str, map, null);
    }

    public C1196650hFH() {
        C13BV c13bv = C13BV.INSTANCE;
        this.LJIILJJIL = c13bv;
        this.LJIILL = c13bv;
        Boolean bool = Boolean.FALSE;
        this.LJIILLIIL = bool;
        this.LJIIZILJ = bool;
        this.LJIJ = bool;
        this.LJIJI = C0C64.LJIILLIIL().LJIJ(31744, 0, "poi_operation_et_logic_opt", true) == 1;
    }

    public static Object LIZIZ(Object obj) {
        Object obj2;
        Object obj3;
        Field field;
        try {
            Field field2 = LJJII;
            if (field2 != null) {
                field2.setAccessible(true);
            }
            if (field2 == null) {
                obj2 = null;
            } else {
                obj2 = field2.get(obj);
            }
            if (obj2 instanceof ViewGroup) {
                try {
                    field = LJIJJ;
                    if (field != null) {
                        field.setAccessible(true);
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                }
                if (field != null) {
                    obj3 = field.get(obj2);
                } else {
                    obj3 = null;
                }
                if (obj3 != null && !(obj2 instanceof SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB) && !(obj2 instanceof C1179570gnj)) {
                    return LIZIZ(obj3);
                }
                return obj2;
            }
            return obj2;
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            return null;
        }
    }

    public final void LJ(String str) {
        String str2;
        if (this.LJIIIIZZ.length() == 0 && !this.LJIJI) {
            this.LJIIIIZZ = str;
        }
        try {
            Function0<Boolean> function0 = this.LJIIJJI;
            if ((function0 == null || function0.invoke().booleanValue()) && !this.LIZ && ((this.LJIIIIZZ.length() != 0 || this.LJIJI) && !this.LJI.isEmpty())) {
                boolean z = this.LJIJI;
                if (!z) {
                    this.LIZ = true;
                }
                HashMap<String, String> map = this.LJI;
                if (z) {
                    str2 = str;
                } else {
                    str2 = this.LJIIIIZZ;
                }
                map.put("operation_type", str2);
                C1185040gwY c1185040gwY = C1185040gwY.LIZ;
                String str3 = this.LJIIIZ;
                HashMap<String, String> map2 = this.LJI;
                c1185040gwY.getClass();
                C1185040gwY.LIZIZ(str3, map2, null);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("mob operation ");
                sbLIZ.append(this.LJI.get("operation_type"));
                C2188811AlT.LIZIZ(sbLIZ);
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        Function1<? super String, Unit> function1 = this.LJIIL;
        if (function1 != null) {
            function1.invoke(str);
        }
    }

    public final void LIZ(Window window, MotionEvent motionEvent) {
        boolean z;
        boolean z2;
        Field field;
        Field field2;
        Field field3;
        C1179570gnj c1179570gnj;
        C1203350hQ5 c1203350hQ5;
        C1203360hQ6 c1203360hQ6;
        Class<?> cls;
        boolean z3;
        Float f;
        boolean z4;
        try {
            int action = motionEvent.getAction();
            if (action != 0) {
                boolean z5 = false;
                if (action != 1) {
                    if (action == 2 && !this.LJIJI && (f = this.LIZLLL) != null) {
                        float fFloatValue = f.floatValue();
                        Float f2 = this.LJ;
                        if (f2 != null) {
                            float fFloatValue2 = f2.floatValue();
                            Integer num = this.LIZJ;
                            if (num != null) {
                                int iIntValue = num.intValue();
                                int i = this.LJII;
                                if (i != 1) {
                                    if (i != 2) {
                                        if (i == 3) {
                                            float f3 = iIntValue;
                                            if (Math.abs(motionEvent.getRawY() - fFloatValue) >= f3 || Math.abs(motionEvent.getRawX() - fFloatValue2) >= f3) {
                                                Boolean bool = this.LJIILLIIL;
                                                Boolean bool2 = Boolean.TRUE;
                                                if (Intrinsics.LJFF(bool, bool2) && Intrinsics.LJFF(this.LJIIZILJ, Boolean.FALSE)) {
                                                    z4 = true;
                                                } else {
                                                    z4 = false;
                                                }
                                                if (Intrinsics.LJFF(this.LJIILLIIL, bool2) && Intrinsics.LJFF(this.LJIIZILJ, bool2) && motionEvent.getRawY() - fFloatValue > 0.0f) {
                                                    z5 = true;
                                                }
                                                if (Intrinsics.LJFF(this.LJIJ, Boolean.FALSE) && (z4 || z5)) {
                                                    return;
                                                }
                                                LJ("scroll");
                                                return;
                                            }
                                            return;
                                        }
                                        return;
                                    }
                                    float f4 = iIntValue;
                                    if (motionEvent.getRawY() - fFloatValue >= f4 || motionEvent.getRawX() - fFloatValue2 >= f4) {
                                        LJ("scroll");
                                        return;
                                    }
                                    return;
                                }
                                float f5 = -iIntValue;
                                if (motionEvent.getRawY() - fFloatValue <= f5 || motionEvent.getRawX() - fFloatValue2 <= f5) {
                                    LJ("scroll");
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    return;
                }
                Float f6 = this.LIZLLL;
                if (f6 != null && this.LJ != null) {
                    float fFloatValue3 = f6.floatValue();
                    Float f7 = this.LJ;
                    View view = null;
                    if (f7 != null) {
                        float fFloatValue4 = f7.floatValue();
                        Integer num2 = this.LIZJ;
                        if (num2 != null) {
                            float fIntValue = num2.intValue();
                            if (Math.abs(motionEvent.getRawY() - fFloatValue3) >= fIntValue || Math.abs(motionEvent.getRawX() - fFloatValue4) >= fIntValue) {
                                if (this.LJIJI) {
                                    Boolean bool3 = this.LJIILLIIL;
                                    Boolean bool4 = Boolean.TRUE;
                                    if (Intrinsics.LJFF(bool3, bool4) && Intrinsics.LJFF(this.LJIIZILJ, Boolean.FALSE)) {
                                        z3 = true;
                                    } else {
                                        z3 = false;
                                    }
                                    if (Intrinsics.LJFF(this.LJIILLIIL, bool4) && Intrinsics.LJFF(this.LJIIZILJ, bool4) && motionEvent.getRawY() - fFloatValue3 > 0.0f) {
                                        z5 = true;
                                    }
                                    if (Intrinsics.LJFF(this.LJIJ, Boolean.FALSE) && (z3 || z5)) {
                                        return;
                                    } else {
                                        LJ("scroll");
                                    }
                                }
                                this.LIZLLL = null;
                                this.LJ = null;
                                this.LJFF = 0L;
                                return;
                            }
                        }
                    }
                    View decorView = window.getDecorView();
                    try {
                        Field field4 = LJIJJ;
                        if (field4 != null) {
                            field4.setAccessible(true);
                            Object obj = field4.get(decorView);
                            if (obj != null) {
                                Object objLIZIZ = LIZIZ(obj);
                                if (objLIZIZ instanceof View) {
                                    view = (View) objLIZIZ;
                                }
                                String str = "other";
                                if (view != null) {
                                    Iterator<Integer> it2 = this.LJIILJJIL.iterator();
                                    while (it2.hasNext()) {
                                        if (view.getId() == it2.next().intValue()) {
                                            return;
                                        }
                                    }
                                    Iterator<Integer> it3 = this.LJIILL.iterator();
                                    while (it3.hasNext()) {
                                        if (view.getId() == it3.next().intValue()) {
                                            String str2 = this.LJIILIIL;
                                            if (str2 != null) {
                                                str = str2;
                                            }
                                            LJ(str);
                                            if (!C0A1S.LIZ()) {
                                                LIZLLL();
                                                return;
                                            }
                                            return;
                                        }
                                    }
                                }
                                if (objLIZIZ != null) {
                                    if (((objLIZIZ instanceof ViewGroup) && (cls = LJJIII) != null && !cls.isInstance(objLIZIZ)) || (objLIZIZ instanceof View)) {
                                        if (System.currentTimeMillis() - this.LJFF >= 500) {
                                            z = true;
                                        } else {
                                            z = false;
                                        }
                                        if ((objLIZIZ instanceof C1845930y8V) && ((C1845930y8V) objLIZIZ) != null) {
                                            z2 = true;
                                        } else {
                                            z2 = false;
                                        }
                                        if (z2) {
                                            LIZLLL();
                                            LJ("click");
                                            return;
                                        }
                                        if ((!(objLIZIZ instanceof C1203360hQ6) || (c1203360hQ6 = (C1203360hQ6) objLIZIZ) == null || c1203360hQ6.getOnValueSelectedListener() == null) && (!(objLIZIZ instanceof C1203350hQ5) || (c1203350hQ5 = (C1203350hQ5) objLIZIZ) == null || c1203350hQ5.getOnValueSelectedListener() == null)) {
                                            if ((objLIZIZ instanceof C1179570gnj) && (c1179570gnj = (C1179570gnj) objLIZIZ) != null && c1179570gnj.LLILZLL != null) {
                                                LIZLLL();
                                                LJ("click");
                                                return;
                                            }
                                            try {
                                                Field field5 = LJIJJLI;
                                                if (field5 != null) {
                                                    field5.setAccessible(true);
                                                    Object obj2 = field5.get(objLIZIZ);
                                                    if (obj2 != null && (field3 = LJJ) != null) {
                                                        field3.setAccessible(true);
                                                        if (field3.get(obj2) != null) {
                                                            LIZLLL();
                                                            LJ("click");
                                                            return;
                                                        }
                                                    }
                                                }
                                            } catch (Throwable th) {
                                                TryCatchGuardChecker.doCheck(th);
                                            }
                                            if (z) {
                                                try {
                                                    Field field6 = LJIJJLI;
                                                    if (field6 != null) {
                                                        field6.setAccessible(true);
                                                        Object obj3 = field6.get(objLIZIZ);
                                                        if (obj3 != null && (field2 = LJJIFFI) != null) {
                                                            field2.setAccessible(true);
                                                            if (field2.get(obj3) != null) {
                                                                LIZLLL();
                                                                LJ("click");
                                                                return;
                                                            }
                                                        }
                                                    }
                                                } catch (Throwable th2) {
                                                    TryCatchGuardChecker.doCheck(th2);
                                                }
                                            } else {
                                                try {
                                                    Field field7 = LJIJJLI;
                                                    if (field7 != null) {
                                                        field7.setAccessible(true);
                                                        Object obj4 = field7.get(objLIZIZ);
                                                        if (obj4 != null && (field = LJJI) != null) {
                                                            field.setAccessible(true);
                                                            if (field.get(obj4) != null) {
                                                                LIZLLL();
                                                                LJ("click");
                                                                return;
                                                            }
                                                        }
                                                    }
                                                } catch (Throwable th3) {
                                                    TryCatchGuardChecker.doCheck(th3);
                                                }
                                            }
                                            if (objLIZIZ instanceof SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB) {
                                                LIZLLL();
                                                LJ("click");
                                                return;
                                            }
                                            String str3 = this.LJIILIIL;
                                            if (str3 != null) {
                                                str = str3;
                                            }
                                            LJ(str);
                                            if (!C0A1S.LIZ()) {
                                                LIZLLL();
                                                return;
                                            }
                                            return;
                                        }
                                        LIZLLL();
                                        LJ("click");
                                        return;
                                    }
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        return;
                    } catch (Throwable th4) {
                        TryCatchGuardChecker.doCheck(th4);
                        return;
                    }
                }
                return;
            }
            this.LIZLLL = Float.valueOf(motionEvent.getRawY());
            this.LJ = Float.valueOf(motionEvent.getRawX());
            this.LJFF = System.currentTimeMillis();
        } catch (Throwable th5) {
            TryCatchGuardChecker.doCheck(th5);
        }
    }

    public static void LIZJ(C1196650hFH c1196650hFH, Context context, String str, Function0 function0, Function1 function1, Boolean bool, Boolean bool2) {
        c1196650hFH.getClass();
        c1196650hFH.LIZJ = Integer.valueOf(ViewConfiguration.get(context).getScaledTouchSlop());
        c1196650hFH.LJII = 3;
        c1196650hFH.LJIIIZ = str;
        c1196650hFH.LJIIJJI = function0;
        c1196650hFH.LJIIL = function1;
        c1196650hFH.LJIILIIL = "other";
        c1196650hFH.LJIILLIIL = bool;
        c1196650hFH.LJIJ = bool2;
    }
}
