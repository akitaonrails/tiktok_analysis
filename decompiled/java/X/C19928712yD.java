package X;

import X.C19928812yE;
import X.InterfaceC19930212yS;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.12yD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19928712yD<T extends InterfaceC19930212yS<T>> {
    public boolean LIZIZ;
    public boolean LIZLLL;
    public C19928812yE<T, Object> LIZ = new C19929712yN();
    public boolean LIZJ = true;

    public final void LIZLLL() {
        if (this.LIZJ) {
            return;
        }
        this.LIZ = C19928612yC.LIZJ(this.LIZ, true, false);
        this.LIZJ = true;
    }

    public final Map<T, Object> LJ() {
        if (!this.LIZIZ) {
            C19928812yE<T, Object> c19928812yE = this.LIZ;
            return !c19928812yE.LLILZ ? Collections.unmodifiableMap(c19928812yE) : c19928812yE;
        }
        C19929712yN c19929712yNLIZJ = C19928612yC.LIZJ(this.LIZ, false, true);
        if (this.LIZ.LLILZ) {
            c19929712yNLIZJ.LJFF();
            return c19929712yNLIZJ;
        }
        LJIIL(c19929712yNLIZJ, true);
        return c19929712yNLIZJ;
    }

    public final boolean LJII() {
        int i = this.LIZ.LLILLJJLI;
        for (int i2 = 0; i2 < i; i2++) {
            if (!C19928612yC.LJIIZILJ(this.LIZ.LIZJ(i2))) {
                return false;
            }
        }
        Iterator it2 = this.LIZ.LIZLLL().iterator();
        while (it2.hasNext()) {
            if (!C19928612yC.LJIIZILJ((Map.Entry) it2.next())) {
                return false;
            }
        }
        return true;
    }

    public C19928712yD(int i) {
    }

    public final C19928612yC<T> LIZIZ(boolean z) {
        if (this.LIZ.isEmpty()) {
            return (C19928612yC<T>) C19928612yC.LIZLLL;
        }
        this.LIZJ = false;
        C19928812yE c19928812yELIZJ = this.LIZ;
        if (this.LIZLLL) {
            c19928812yELIZJ = C19928612yC.LIZJ(c19928812yELIZJ, false, false);
            LJIIL(c19928812yELIZJ, z);
        }
        C19928612yC<T> c19928612yC = new C19928612yC<>(c19928812yELIZJ);
        c19928612yC.LIZJ = this.LIZIZ;
        return c19928612yC;
    }

    public final void LIZJ(T t) {
        LIZLLL();
        this.LIZ.remove(t);
        if (this.LIZ.isEmpty()) {
            this.LIZIZ = false;
        }
    }

    public final Object LJFF(T t) {
        Object obj = this.LIZ.get(t);
        if (obj instanceof C19926112xn) {
            return ((C19926112xn) obj).LIZLLL();
        }
        return obj;
    }

    public final boolean LJI(T t) {
        if (!t.LJJLJ()) {
            if (this.LIZ.get(t) != null) {
                return true;
            }
            return false;
        }
        throw new IllegalArgumentException("hasField() can only be called on non-repeated fields.");
    }

    public final void LJIIIIZZ(C19928612yC<T> c19928612yC) {
        LIZLLL();
        int i = c19928612yC.LIZ.LLILLJJLI;
        for (int i2 = 0; i2 < i; i2++) {
            LJIIIZ(c19928612yC.LIZ.LIZJ(i2));
        }
        Iterator it2 = c19928612yC.LIZ.LIZLLL().iterator();
        while (it2.hasNext()) {
            LJIIIZ((Map.Entry) it2.next());
        }
    }

    public final void LJIIIZ(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        Object value = entry.getValue();
        boolean z = value instanceof C19926112xn;
        if (key.LJJLJ()) {
            if (!z) {
                List arrayList = (List) LJFF(key);
                List list = (List) value;
                int size = list.size();
                if (arrayList == null) {
                    arrayList = new ArrayList(size);
                    this.LIZ.put(key, arrayList);
                }
                for (int i = 0; i < size; i++) {
                    arrayList.add(C19928612yC.LJ(ListProtector.get(list, i)));
                }
                return;
            }
            throw new IllegalStateException("Lazy fields can not be repeated");
        }
        if (key.LJJJIL() == AnonymousClass1332.MESSAGE) {
            Object objLJFF = LJFF(key);
            if (objLJFF == null) {
                this.LIZ.put(key, C19928612yC.LJ(value));
                if (z) {
                    this.LIZIZ = true;
                    return;
                }
                return;
            }
            if (z) {
                value = ((C19926112xn) value).LIZLLL();
            }
            if (key.LJJJJLI(objLJFF)) {
                InterfaceC19928112y7 builder = ((InterfaceC19925612xi) objLJFF).toBuilder();
                key.LJJIFFI(builder, value);
                this.LIZ.put(key, builder.build());
                return;
            }
            key.LJJIFFI(objLJFF, value);
            return;
        }
        if (!z) {
            this.LIZ.put(key, C19928612yC.LJ(value));
            return;
        }
        throw new IllegalStateException("Lazy fields must be message-valued");
    }

    public static Object LJIIJ(Object obj, boolean z) {
        if (!(obj instanceof InterfaceC19928112y7)) {
            return obj;
        }
        InterfaceC19928112y7 interfaceC19928112y7 = (InterfaceC19928112y7) obj;
        if (z) {
            return interfaceC19928112y7.buildPartial();
        }
        return interfaceC19928112y7.build();
    }

    public static <T extends InterfaceC19930212yS<T>> void LJIIL(C19928812yE<T, Object> c19928812yE, boolean z) {
        int i = c19928812yE.LLILLJJLI;
        for (int i2 = 0; i2 < i; i2++) {
            C19928812yE.c cVarLIZJ = c19928812yE.LIZJ(i2);
            cVarLIZJ.setValue(LJIIJJI((InterfaceC19930212yS) cVarLIZJ.getKey(), cVarLIZJ.getValue(), z));
        }
        Iterator it2 = c19928812yE.LIZLLL().iterator();
        while (it2.hasNext()) {
            Map.Entry entry = (Map.Entry) it2.next();
            entry.setValue(LJIIJJI((InterfaceC19930212yS) entry.getKey(), entry.getValue(), z));
        }
    }

    public static void LJIILJJIL(InterfaceC19930212yS interfaceC19930212yS, Object obj) {
        if (!C19928612yC.LJIJ(interfaceC19930212yS.LJJIJL(), obj)) {
            if (interfaceC19930212yS.LJJIJL().getJavaType() == AnonymousClass1332.MESSAGE && (obj instanceof InterfaceC19928112y7)) {
            } else {
                throw new IllegalArgumentException(C786410Ut5.j4("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{Integer.valueOf(interfaceC19930212yS.getNumber()), interfaceC19930212yS.LJJIJL().getJavaType(), obj.getClass().getName()}));
            }
        }
    }

    public final void LIZ(T t, Object obj) {
        boolean z;
        List arrayList;
        LIZLLL();
        if (t.LJJLJ()) {
            if (!this.LIZLLL && !(obj instanceof InterfaceC19928112y7)) {
                z = false;
            } else {
                z = true;
            }
            this.LIZLLL = z;
            LJIILJJIL(t, obj);
            Object objLJFF = LJFF(t);
            if (objLJFF == null) {
                arrayList = new ArrayList();
                this.LIZ.put(t, arrayList);
            } else {
                arrayList = (List) objLJFF;
            }
            arrayList.add(obj);
            return;
        }
        throw new IllegalArgumentException("addRepeatedField() can only be called on repeated fields.");
    }

    public final void LJIILIIL(T t, Object obj) {
        boolean z;
        LIZLLL();
        boolean z2 = false;
        if (t.LJJLJ()) {
            if (obj instanceof List) {
                ArrayList arrayList = new ArrayList((Collection) obj);
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    Object obj2 = ListProtector.get(arrayList, i);
                    LJIILJJIL(t, obj2);
                    if (!this.LIZLLL && !(obj2 instanceof InterfaceC19928112y7)) {
                        z = false;
                    } else {
                        z = true;
                    }
                    this.LIZLLL = z;
                }
                obj = arrayList;
            } else {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
        } else {
            LJIILJJIL(t, obj);
        }
        if (obj instanceof C19926112xn) {
            this.LIZIZ = true;
        }
        if (this.LIZLLL || (obj instanceof InterfaceC19928112y7)) {
            z2 = true;
        }
        this.LIZLLL = z2;
        this.LIZ.put(t, obj);
    }

    public static <T extends InterfaceC19930212yS<T>> Object LJIIJJI(T t, Object obj, boolean z) {
        if (obj != null && t.LJJJIL() == AnonymousClass1332.MESSAGE) {
            if (t.LJJLJ()) {
                if (obj instanceof List) {
                    List arrayList = (List) obj;
                    for (int i = 0; i < arrayList.size(); i++) {
                        Object obj2 = ListProtector.get(arrayList, i);
                        Object objLJIIJ = LJIIJ(obj2, z);
                        if (objLJIIJ != obj2) {
                            if (arrayList == obj) {
                                arrayList = new ArrayList(arrayList);
                            }
                            ListProtector.set(arrayList, i, objLJIIJ);
                        }
                    }
                    return arrayList;
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Repeated field should contains a List but actually contains type: ");
                sbLIZ.append(obj.getClass());
                throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ));
            }
            return LJIIJ(obj, z);
        }
        return obj;
    }
}
