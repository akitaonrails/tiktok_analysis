package X;

import Y.ARunnableS92S0200000_23;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0qQK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1549460qQK {
    public final Map<Class<? extends InterfaceC1063710dmr>, String> LIZ = new ConcurrentHashMap();
    public final ConcurrentHashMap<Class<? extends InterfaceC1063710dmr>, C1549180qPs> LIZIZ = new ConcurrentHashMap<>();
    public final ConcurrentHashMap<Class<?>, Class<?>> LIZJ = new ConcurrentHashMap<>();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v7, types: [java.lang.Object] */
    public final String LIZ(Class<? extends InterfaceC1063710dmr> cls) {
        boolean z;
        ?? name;
        ?? r5;
        String str;
        Field field;
        InterfaceC1549730qQl interfaceC1549730qQl;
        String strName;
        boolean z2;
        try {
            ?? r6 = ((ConcurrentHashMap) this.LIZ).get(cls);
            boolean z3 = true;
            if (r6 == 0) {
                ARunnableS92S0200000_23 aRunnableS92S0200000_23 = new ARunnableS92S0200000_23(this, cls, 68);
                if (C1549530qQR.LIZ == null) {
                    int iAvailableProcessors = Runtime.getRuntime().availableProcessors() / 2;
                    if (iAvailableProcessors == 0) {
                        iAvailableProcessors = 1;
                    }
                    C1549530qQR.LIZ = C786410Ut5.d4(iAvailableProcessors);
                }
                C1549530qQR.LIZ.submit(aRunnableS92S0200000_23);
                if (!C1544000qHW.LIZJ) {
                    r6 = ((ConcurrentHashMap) this.LIZ).get(cls);
                } else {
                    Field[] declaredFields = cls.getSuperclass().getDeclaredFields();
                    int length = declaredFields.length;
                    int i = 0;
                    while (true) {
                        if (i < length) {
                            field = declaredFields[i];
                            if (field.getAnnotation(InterfaceC1549730qQl.class) == null) {
                                z2 = false;
                            } else {
                                z2 = true;
                            }
                            if (z2) {
                                break;
                            }
                            i++;
                        } else {
                            field = null;
                            break;
                        }
                    }
                    if (field != null && (interfaceC1549730qQl = (InterfaceC1549730qQl) field.getAnnotation(InterfaceC1549730qQl.class)) != null && (strName = interfaceC1549730qQl.name()) != null) {
                        ((ConcurrentHashMap) this.LIZ).put(cls, strName);
                        r6 = ((ConcurrentHashMap) this.LIZ).get(cls);
                    }
                }
            }
            CharSequence charSequence = (CharSequence) r6;
            if (charSequence != null && charSequence.length() != 0) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                try {
                    name = cls.newInstance().getName();
                    if (name != 0 && name.length() != 0) {
                        z3 = false;
                    }
                } catch (Throwable th) {
                    th = th;
                    name = r6;
                }
                if (!z3) {
                    ((ConcurrentHashMap) this.LIZ).put(cls, name);
                    try {
                        C1543330qGR c1543330qGR = C1544000qHW.LJIILLIIL;
                        ?? LIZ = C2188811AlT.LIZ();
                        LIZ.append("reg_fb_ok:");
                        LIZ.append(cls.getName());
                        LIZ.append(':');
                        LIZ.append(name);
                        c1543330qGR.LIZ(C2188811AlT.LIZIZ(LIZ));
                        r5 = name;
                    } catch (Throwable th2) {
                        th = th2;
                        TryCatchGuardChecker.doCheck(th);
                        C1543330qGR c1543330qGR2 = C1544000qHW.LJIILLIIL;
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("reg_fb_err:");
                        sbLIZ.append(cls.getName());
                        sbLIZ.append(':');
                        sbLIZ.append(th.getClass().getName());
                        c1543330qGR2.LIZ(C2188811AlT.LIZIZ(sbLIZ));
                        r5 = name;
                    }
                    r6 = r5;
                } else {
                    C1543330qGR c1543330qGR3 = C1544000qHW.LJIILLIIL;
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("reg_empty:");
                    sbLIZ2.append(cls.getName());
                    c1543330qGR3.LIZ(C2188811AlT.LIZIZ(sbLIZ2));
                }
            }
            str = (String) r6;
        } catch (Throwable th3) {
            TryCatchGuardChecker.doCheck(th3);
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("IDLXBridgeRegistryCache.find failed,clazz == ");
            sbLIZ3.append(cls.getName());
            sbLIZ3.append(", e == ");
            sbLIZ3.append(th3.getMessage());
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ3);
            int i2 = C2187451AjH.LIZ;
            InterfaceC1297560js2 interfaceC1297560js2 = C1543410qGZ.LJIIIZ;
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("register_error_");
            sbLIZ4.append(cls.getName());
            C1063910dnB.LIZ(strLIZIZ, C2188811AlT.LIZIZ(sbLIZ4));
            C1543330qGR c1543330qGR4 = C1544000qHW.LJIILLIIL;
            StringBuilder sbLIZ5 = C2188811AlT.LIZ();
            sbLIZ5.append("reg_err:");
            sbLIZ5.append(cls.getName());
            sbLIZ5.append(':');
            sbLIZ5.append(th3.getClass().getName());
            c1543330qGR4.LIZ(C2188811AlT.LIZIZ(sbLIZ5));
        }
        if (str == null) {
            return "";
        }
        return str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0021, code lost:
    
        if (r1 >= r2) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0023, code lost:
    
        r4 = r3[r1];
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0029, code lost:
    
        if (r4.getAnnotation(r7) != null) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
    
        r3 = r6.getDeclaredClasses();
        r2 = r3.length;
        r1 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001f, code lost:
    
        r1 = r1 + 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Class LIZIZ(java.lang.Class r6, java.lang.Class r7) {
        /*
            r5 = 0
            java.lang.Class r0 = r6.getSuperclass()     // Catch: java.lang.Throwable -> L2d
            java.lang.Class[] r3 = r0.getDeclaredClasses()     // Catch: java.lang.Throwable -> L2d
            int r2 = r3.length     // Catch: java.lang.Throwable -> L2d
            r1 = 0
        Lb:
            if (r1 >= r2) goto L18
            r4 = r3[r1]     // Catch: java.lang.Throwable -> L2d
            java.lang.annotation.Annotation r0 = r4.getAnnotation(r7)     // Catch: java.lang.Throwable -> L2d
            if (r0 != 0) goto L2c
            int r1 = r1 + 1
            goto Lb
        L18:
            java.lang.Class[] r3 = r6.getDeclaredClasses()     // Catch: java.lang.Throwable -> L2d
            int r2 = r3.length     // Catch: java.lang.Throwable -> L2d
            r1 = 0
            goto L21
        L1f:
            int r1 = r1 + 1
        L21:
            if (r1 >= r2) goto L54
            r4 = r3[r1]     // Catch: java.lang.Throwable -> L2d
            java.lang.annotation.Annotation r0 = r4.getAnnotation(r7)     // Catch: java.lang.Throwable -> L2d
            if (r0 != 0) goto L2c
            goto L1f
        L2c:
            return r4
        L2d:
            r2 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r2)
            int r0 = X.C2187451AjH.LIZ
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "findModelClassByAnnotation failed, class == "
            r1.append(r0)
            java.lang.String r0 = r6.getName()
            r1.append(r0)
            java.lang.String r0 = ", e == "
            r1.append(r0)
            java.lang.String r0 = r2.getMessage()
            r1.append(r0)
            X.C2188811AlT.LIZIZ(r1)
            X.0js2 r0 = X.C1543410qGZ.LJIIIZ
        L54:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1549460qQK.LIZIZ(java.lang.Class, java.lang.Class):java.lang.Class");
    }

    public static C1549520qQQ LIZJ(Class cls, HashMap map) {
        List listLJJLL;
        List listLJJLJ;
        int[] iArrOption;
        String[] strArrOption;
        Method[] declaredMethods = cls.getDeclaredMethods();
        C1549520qQQ c1549520qQQ = new C1549520qQQ(null);
        for (Method method : declaredMethods) {
            InterfaceC1549470qQL interfaceC1549470qQL = (InterfaceC1549470qQL) method.getAnnotation(InterfaceC1549470qQL.class);
            if (interfaceC1549470qQL != null) {
                InterfaceC1549510qQP interfaceC1549510qQPDefaultValue = interfaceC1549470qQL.defaultValue();
                InterfaceC1909307dr interfaceC1909307dr = (InterfaceC1909307dr) method.getAnnotation(InterfaceC1909307dr.class);
                InterfaceC1909207dq interfaceC1909207dq = (InterfaceC1909207dq) method.getAnnotation(InterfaceC1909207dq.class);
                C19719912Dl c19719912DlLIZ = C13LE.LIZ(interfaceC1549470qQL.nestedClassType());
                String strKeyPath = interfaceC1549470qQL.keyPath();
                if (!Intrinsics.LJFF(c19719912DlLIZ, C13LE.LIZ(C1467105oj.class)) && !map.containsKey(C09R7.LIZ(c19719912DlLIZ)) && !c1549520qQQ.LIZIZ.containsKey(strKeyPath)) {
                    map.put(C09R7.LIZ(c19719912DlLIZ), LIZJ(C09R7.LIZ(c19719912DlLIZ), map));
                }
                boolean zRequired = interfaceC1549470qQL.required();
                C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(interfaceC1549470qQL.primitiveClassType());
                boolean zIsEnum = interfaceC1549470qQL.isEnum();
                boolean zIsGetter = interfaceC1549470qQL.isGetter();
                C1549680qQg c1549680qQg = new C1549680qQg(interfaceC1549510qQPDefaultValue.type(), interfaceC1549510qQPDefaultValue.doubleValue(), interfaceC1549510qQPDefaultValue.stringValue(), interfaceC1549510qQPDefaultValue.intValue(), interfaceC1549510qQPDefaultValue.boolValue(), interfaceC1549510qQPDefaultValue.longValue());
                Class<?> returnType = method.getReturnType();
                if (interfaceC1909307dr == null || (strArrOption = interfaceC1909307dr.option()) == null || (listLJJLL = C13LQ.LJJLL(strArrOption)) == null) {
                    listLJJLL = C13BV.INSTANCE;
                }
                if (interfaceC1909207dq == null || (iArrOption = interfaceC1909207dq.option()) == null || (listLJJLJ = C13LQ.LJJLJ(iArrOption)) == null) {
                    listLJJLJ = C13BV.INSTANCE;
                }
                C1549490qQN c1549490qQN = new C1549490qQN(zRequired, strKeyPath, c19719912DlLIZ, c19719912DlLIZ2, zIsEnum, zIsGetter, c1549680qQg, returnType, listLJJLL, listLJJLJ);
                c1549520qQQ.LIZ.put(method, c1549490qQN);
                if (interfaceC1549470qQL.isGetter()) {
                    c1549520qQQ.LIZIZ.put(strKeyPath, c1549490qQN);
                }
            }
        }
        return c1549520qQQ;
    }
}
