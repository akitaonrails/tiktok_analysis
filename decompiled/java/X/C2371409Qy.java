package X;

import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.reflect.KTypeProjection;
import kotlin.sequences.Sequence;
import kotlin.text.u;

/* JADX INFO: renamed from: X.09Qy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2371409Qy {
    /* JADX WARN: Multi-variable type inference failed */
    public static final Type LIZJ(C13JW c13jw) {
        Type typeLJ;
        if ((c13jw instanceof InterfaceC2371509Qz) && (typeLJ = ((InterfaceC2371509Qz) c13jw).LJ()) != null) {
            return typeLJ;
        }
        return LIZ(c13jw, false);
    }

    public static final Type LIZLLL(KTypeProjection kTypeProjection) {
        EnumC19989213Ja enumC19989213Ja = kTypeProjection.LIZ;
        if (enumC19989213Ja == null) {
            C2371209Qw.LLILLL.getClass();
            return C2371209Qw.LLILZ;
        }
        C09RO c09ro = kTypeProjection.LIZIZ;
        int i = C19989413Jc.LIZ[enumC19989213Ja.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    return new C2371209Qw(LIZ(c09ro, true), null);
                }
                throw new C1954807lC();
            }
            return LIZ(c09ro, true);
        }
        return new C2371209Qw(null, LIZ(c09ro, true));
    }

    public static final String LJ(Type type) {
        if (type instanceof Class) {
            Class cls = (Class) type;
            if (cls.isArray()) {
                Sequence sequenceLJ = C09R4.LJ(C2371109Qv.LL, type);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(((Class) C09RB.LJIIZILJ(sequenceLJ)).getName());
                sbLIZ.append(u.LJJ(C09RB.LJFF(sequenceLJ), "[]"));
                return C2188811AlT.LIZIZ(sbLIZ);
            }
            return cls.getName();
        }
        return type.toString();
    }

    public static final Type LIZ(C09RO c09ro, boolean z) {
        Class clsLIZ;
        int i;
        C09R0 c09r0LJFF = c09ro.LJFF();
        if (c09r0LJFF instanceof C09R2) {
            return new C09R1((C09R2) c09r0LJFF);
        }
        if (c09r0LJFF instanceof C13IQ) {
            C13IQ c13iq = (C13IQ) c09r0LJFF;
            if (z) {
                clsLIZ = C09R7.LIZIZ(c13iq);
            } else {
                clsLIZ = C09R7.LIZ(c13iq);
            }
            List<KTypeProjection> listLJII = c09ro.LJII();
            if (listLJII.isEmpty()) {
                return clsLIZ;
            }
            if (clsLIZ.isArray()) {
                if (clsLIZ.getComponentType().isPrimitive()) {
                    return clsLIZ;
                }
                KTypeProjection kTypeProjection = (KTypeProjection) C13LP.LJLL(listLJII);
                if (kTypeProjection != null) {
                    EnumC19989213Ja enumC19989213Ja = kTypeProjection.LIZ;
                    C09RO c09ro2 = kTypeProjection.LIZIZ;
                    if (enumC19989213Ja != null && (i = C19989413Jc.LIZ[enumC19989213Ja.ordinal()]) != -1 && i != 1) {
                        if (i != 2 && i != 3) {
                            throw new C1954807lC();
                        }
                        Type typeLIZ = LIZ(c09ro2, false);
                        if (!(typeLIZ instanceof Class)) {
                            return new C2371009Qu(typeLIZ);
                        }
                        return clsLIZ;
                    }
                    return clsLIZ;
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("kotlin.Array must have exactly one type argument: ");
                sbLIZ.append(c09ro);
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
            return LIZIZ(clsLIZ, listLJII);
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("Unsupported type classifier: ");
        sbLIZ2.append(c09ro);
        throw new UnsupportedOperationException(C2188811AlT.LIZIZ(sbLIZ2));
    }

    public static final C2370809Qs LIZIZ(Class cls, List list) {
        Class<?> declaringClass = cls.getDeclaringClass();
        if (declaringClass == null) {
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList.add(LIZLLL((KTypeProjection) it2.next()));
            }
            return new C2370809Qs(cls, null, arrayList);
        }
        if (Modifier.isStatic(cls.getModifiers())) {
            ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(list, 10));
            Iterator it3 = list.iterator();
            while (it3.hasNext()) {
                arrayList2.add(LIZLLL((KTypeProjection) it3.next()));
            }
            return new C2370809Qs(cls, declaringClass, arrayList2);
        }
        int length = C786410Ut5.V2(cls).length;
        C2370809Qs c2370809QsLIZIZ = LIZIZ(declaringClass, list.subList(length, list.size()));
        List listSubList = list.subList(0, length);
        ArrayList arrayList3 = new ArrayList(C15438062q.LJIJJ(listSubList, 10));
        Iterator it4 = listSubList.iterator();
        while (it4.hasNext()) {
            arrayList3.add(LIZLLL((KTypeProjection) it4.next()));
        }
        return new C2370809Qs(cls, c2370809QsLIZIZ, arrayList3);
    }
}
