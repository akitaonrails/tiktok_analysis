package X;

import java.lang.reflect.Method;
import njp.a;

/* JADX INFO: renamed from: X.09DW, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C09DW {
    public static final C09DW LIZ = new C09DW();
    public static final C09DX LIZIZ = new C09DX(null, null, null);
    public static C09DX LIZJ;

    private static final C09DX LIZ(a aVar) {
        try {
            C09DX c09dx = new C09DX(Class.class.getDeclaredMethod("getModule", new Class[0]), aVar.getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", new Class[0]), aVar.getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", new Class[0]));
            LIZJ = c09dx;
            return c09dx;
        } catch (Exception unused) {
            C09DX c09dx2 = LIZIZ;
            LIZJ = c09dx2;
            return c09dx2;
        }
    }

    public final String LIZIZ(a aVar) {
        Method method;
        Object objInvoke;
        Method method2;
        Object objInvoke2;
        Object objInvoke3;
        C09DX c09dxLIZ = LIZJ;
        if (c09dxLIZ == null) {
            c09dxLIZ = LIZ(aVar);
        }
        if (c09dxLIZ == LIZIZ || (method = c09dxLIZ.LIZ) == null || (objInvoke = method.invoke(aVar.getClass(), new Object[0])) == null || (method2 = c09dxLIZ.LIZIZ) == null || (objInvoke2 = method2.invoke(objInvoke, new Object[0])) == null) {
            return null;
        }
        Method method3 = c09dxLIZ.LIZJ;
        if (method3 != null) {
            objInvoke3 = method3.invoke(objInvoke2, new Object[0]);
        } else {
            objInvoke3 = null;
        }
        if (!(objInvoke3 instanceof String)) {
            return null;
        }
        return (String) objInvoke3;
    }
}
