package X;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS203S0000000_15;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0an0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public class C948480an0 {
    public final C01GW LIZ = C452501pT.LIZIZ(AFwS203S0000000_15.get$arr$(388));

    public final HashMap<String, Object> LIZIZ() {
        return (HashMap) this.LIZ.getValue();
    }

    public int LJII() {
        return LIZIZ().size();
    }

    public static String LJ(int i) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(EnumC1303240k1C.BIZ.getValue());
        sbLIZ.append("_Injector_");
        sbLIZ.append(i);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public void LIZJ(Object obj) {
        boolean zNullable;
        String strName;
        ArrayList arrayList = new ArrayList();
        for (Class<?> superclass = obj.getClass(); superclass != null && !Intrinsics.LJFF(superclass, Object.class); superclass = superclass.getSuperclass()) {
            C19719612Di.LJJII(arrayList, superclass.getDeclaredFields());
        }
        ArrayList<Field> arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            if (((Field) obj2).getAnnotation(InterfaceC948490an1.class) != null) {
                arrayList2.add(obj2);
            }
        }
        ArrayList<Pair> arrayList3 = new ArrayList(C15438062q.LJIJJ(arrayList2, 10));
        for (Field field : arrayList2) {
            InterfaceC948490an1 interfaceC948490an1 = (InterfaceC948490an1) field.getAnnotation(InterfaceC948490an1.class);
            if (interfaceC948490an1 != null) {
                strName = interfaceC948490an1.name();
            } else {
                strName = null;
            }
            arrayList3.add(new Pair(field, strName));
        }
        for (Pair pair : arrayList3) {
            Object obj3 = LIZIZ().get(pair.getSecond());
            InterfaceC948490an1 interfaceC948490an12 = (InterfaceC948490an1) ((Field) pair.getFirst()).getAnnotation(InterfaceC948490an1.class);
            if (interfaceC948490an12 != null) {
                zNullable = interfaceC948490an12.nullable();
            } else {
                zNullable = false;
            }
            if (obj3 == null) {
                if (!zNullable) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append((String) pair.getSecond());
                    sbLIZ.append(" has not provided, please check it's provider. Provider size is:");
                    sbLIZ.append(LJII());
                    sbLIZ.append(",provider's key is: ");
                    sbLIZ.append(LIZIZ().keySet());
                    throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ));
                }
            } else {
                ((AccessibleObject) pair.getFirst()).setAccessible(true);
                ((Field) pair.getFirst()).set(obj, LIZIZ().get(pair.getSecond()));
            }
        }
    }

    public void LIZLLL(Object obj) throws IllegalAccessException {
        ArrayList arrayList = new ArrayList();
        for (Class<?> superclass = obj.getClass(); superclass != null && !Intrinsics.LJFF(superclass, Object.class); superclass = superclass.getSuperclass()) {
            C19719612Di.LJJII(arrayList, superclass.getDeclaredFields());
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            if (((Field) obj2).getAnnotation(InterfaceC947260al2.class) != null) {
                arrayList2.add(obj2);
            }
        }
        ArrayList<Pair> arrayList3 = new ArrayList(C15438062q.LJIJJ(arrayList2, 10));
        Iterator it2 = arrayList2.iterator();
        while (true) {
            String strName = null;
            if (!it2.hasNext()) {
                break;
            }
            Field field = (Field) it2.next();
            InterfaceC947260al2 interfaceC947260al2 = (InterfaceC947260al2) field.getAnnotation(InterfaceC947260al2.class);
            if (interfaceC947260al2 != null) {
                strName = interfaceC947260al2.name();
            }
            arrayList3.add(new Pair(field, strName));
        }
        for (Pair pair : arrayList3) {
            if (LIZIZ().get(pair.getSecond()) == null) {
                String strLJ = LJ(69);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append((String) pair.getSecond());
                sbLIZ.append(" has not provided, please check it's provider. Provider size is:");
                sbLIZ.append(LJII());
                sbLIZ.append(",provider's key is: ");
                sbLIZ.append(LIZIZ().keySet());
                C1AZW.LJFF(strLJ, C2188811AlT.LIZIZ(sbLIZ), null, null);
            } else {
                ((AccessibleObject) pair.getFirst()).setAccessible(true);
                ((Field) pair.getFirst()).set(obj, LIZIZ().get(pair.getSecond()));
            }
        }
    }

    public void LJI(String str) {
        LIZIZ().remove(str);
        String strLJ = LJ(89);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("label:");
        sbLIZ.append(str);
        sbLIZ.append(" has been removed");
        C1AZW.LJIIJ(12, strLJ, C2188811AlT.LIZIZ(sbLIZ), null, null);
    }

    public void LIZ(Long l, String str) {
        LIZIZ().clear();
        String strLJ = LJ(103);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("all providers has been cleaned, source:");
        sbLIZ.append(str);
        C1AZW.LJIIJ(12, strLJ, C2188811AlT.LIZIZ(sbLIZ), null, null);
    }

    public void LJFF(Object obj, String str) {
        String strName;
        InterfaceC948500an2 interfaceC948500an2 = (InterfaceC948500an2) obj.getClass().getAnnotation(InterfaceC948500an2.class);
        if (interfaceC948500an2 != null && (strName = interfaceC948500an2.name()) != null) {
            str = strName;
        } else if (str == null) {
            String strLJ = LJ(22);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("providerName of ");
            sbLIZ.append(obj.getClass().getName());
            sbLIZ.append(" is null, so return, provide failed");
            C1AZW.LJFF(strLJ, C2188811AlT.LIZIZ(sbLIZ), null, null);
            return;
        }
        if (LIZIZ().get(str) != null) {
            String strLJ2 = LJ(24);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("warning: ");
            sbLIZ2.append(str);
            sbLIZ2.append(" already provided and updated");
            C1AZW.LJFF(strLJ2, C2188811AlT.LIZIZ(sbLIZ2), null, null);
        }
        LIZIZ().put(str, obj);
        String strLJ3 = LJ(29);
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append(str);
        sbLIZ3.append("  provided success");
        C1AZW.LJIIJ(12, strLJ3, C2188811AlT.LIZIZ(sbLIZ3), null, null);
    }
}
