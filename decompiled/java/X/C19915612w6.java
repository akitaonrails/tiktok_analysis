package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: X.12w6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19915612w6 {
    public static final InterfaceC19930412yU LIZ;
    public static final C19914912vz LIZIZ;

    /* JADX WARN: Type inference failed for: r0v4, types: [X.12vz] */
    static {
        InterfaceC19930412yU interfaceC19930412yU;
        Class<?> cls = C19915512w5.LIZ;
        try {
            interfaceC19930412yU = (InterfaceC19930412yU) Class.forName("com.google.protobuf.k1").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            interfaceC19930412yU = null;
        }
        LIZ = interfaceC19930412yU;
        LIZIZ = new InterfaceC19930412yU() { // from class: X.12vz
            @Override // X.InterfaceC19930412yU
            public final Object LIZIZ(Object obj) {
                return C19914812vy.emptyMapField().mutableCopy();
            }

            @Override // X.InterfaceC19930412yU
            public final boolean LIZLLL(Object obj) {
                return !((C19914812vy) obj).isMutable();
            }

            @Override // X.InterfaceC19930412yU
            public final void LJ(Object obj) {
                obj.getClass();
            }

            @Override // X.InterfaceC19930412yU
            public final Object LJFF(Object obj) {
                ((C19914812vy) obj).makeImmutable();
                return obj;
            }

            @Override // X.InterfaceC19930412yU
            public final Map<?, ?> LJI(Object obj) {
                return (C19914812vy) obj;
            }

            @Override // X.InterfaceC19930412yU
            public final Map<?, ?> LJII(Object obj) {
                return (C19914812vy) obj;
            }

            @Override // X.InterfaceC19930412yU
            public final Object LIZ(Object obj, Object obj2) {
                C19914812vy c19914812vyMutableCopy = (C19914812vy) obj;
                C19914812vy c19914812vy = (C19914812vy) obj2;
                if (!c19914812vy.isEmpty()) {
                    if (!c19914812vyMutableCopy.isMutable()) {
                        c19914812vyMutableCopy = c19914812vyMutableCopy.mutableCopy();
                    }
                    c19914812vyMutableCopy.mergeFrom(c19914812vy);
                }
                return c19914812vyMutableCopy;
            }

            @Override // X.InterfaceC19930412yU
            public final void LIZJ(int i, Object obj, Object obj2) {
                C19914812vy c19914812vy = (C19914812vy) obj;
                if (!c19914812vy.isEmpty()) {
                    Iterator it2 = c19914812vy.entrySet().iterator();
                    if (it2.hasNext()) {
                        Map.Entry entry = (Map.Entry) it2.next();
                        entry.getKey();
                        entry.getValue();
                        obj2.getClass();
                        AbstractC19928912yF.LJIIL(i);
                        throw null;
                    }
                }
            }
        };
    }
}
