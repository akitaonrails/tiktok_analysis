package X;

/* JADX INFO: renamed from: X.12qD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19879112qD {
    public static boolean LIZ(InterfaceC19879212qE<?> interfaceC19879212qE, Object obj) {
        if (obj == interfaceC19879212qE) {
            return true;
        }
        if (obj instanceof InterfaceC19879212qE) {
            InterfaceC19879212qE interfaceC19879212qE2 = (InterfaceC19879212qE) obj;
            if (interfaceC19879212qE.size() == interfaceC19879212qE2.size() && interfaceC19879212qE.entrySet().size() == interfaceC19879212qE2.entrySet().size()) {
                for (InterfaceC19878012q2 interfaceC19878012q2 : interfaceC19879212qE2.entrySet()) {
                    if (interfaceC19879212qE.count(interfaceC19878012q2.getElement()) != interfaceC19878012q2.getCount()) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }
}
