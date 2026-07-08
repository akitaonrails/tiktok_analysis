package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.childhook.MajorComponentsAllowList;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.08Ih, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2094108Ih {
    public static void LIZIZ() {
        Field field;
        try {
            Class<?> cls = Class.forName("android.app.ActivityThread");
            Method method = cls.getMethod("currentActivityThread", new Class[0]);
            method.setAccessible(true);
            Object objInvoke = method.invoke(cls, new Object[0]);
            Field declaredField = objInvoke.getClass().getDeclaredField("mBoundApplication");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(objInvoke);
            Field declaredField2 = obj.getClass().getDeclaredField("providers");
            declaredField2.setAccessible(true);
            List list = (List) declaredField2.get(obj);
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : list) {
                Object obj3 = null;
                if (obj2 != null && (field = obj2.getClass().getField("name")) != null) {
                    obj3 = field.get(obj2);
                }
                String str = (String) obj3;
                if (str == null) {
                    str = "";
                }
                if (LIZ(str) && obj2 != null) {
                    arrayList.add(obj2);
                }
            }
            declaredField2.set(obj, arrayList);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1AF0.LJFF(e, "ChildContentProviderHook.startHook");
        }
    }

    public static boolean LIZ(String str) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new InterfaceC2094208Ii() { // from class: X.08Ig
            @Override // X.InterfaceC2094208Ii
            public final boolean isInit() {
                return true;
            }

            @Override // X.InterfaceC2094208Ii
            public final boolean LIZ(String str2) {
                List list;
                C2093808Ie.LIZ.getClass();
                MajorComponentsAllowList majorComponentsAllowList = C2093808Ie.LIZIZ;
                if (majorComponentsAllowList == null || (list = majorComponentsAllowList.contentProviders) == null) {
                    list = C13BV.INSTANCE;
                }
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    if (C2093608Ic.LIZJ((String) it2.next(), str2)) {
                        return true;
                    }
                }
                return false;
            }
        });
        arrayList.add(new InterfaceC2094208Ii() { // from class: X.08Ij
            @Override // X.InterfaceC2094208Ii
            public final boolean LIZ(String str2) {
                return true;
            }

            @Override // X.InterfaceC2094208Ii
            public final boolean isInit() {
                return false;
            }
        });
        if (arrayList.size() > 0) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (((InterfaceC2094208Ii) ListProtector.get(arrayList, i)).LIZ(str)) {
                    return ((InterfaceC2094208Ii) ListProtector.get(arrayList, i)).isInit();
                }
            }
            return true;
        }
        return true;
    }
}
