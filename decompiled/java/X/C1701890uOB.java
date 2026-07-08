package X;

/* JADX INFO: renamed from: X.0uOB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1701890uOB {
    public static final C1721450utj LIZ = new InterfaceC1627390sS1<Object, Object>() { // from class: X.0utj
        @Override // X.InterfaceC1627390sS1
        public final boolean test(Object obj, Object obj2) {
            if (obj != obj2) {
                if (obj != null && obj.equals(obj2)) {
                    return true;
                }
                return false;
            }
            return true;
        }
    };

    public static void LIZ(Object obj, String str) {
        if (obj != null) {
        } else {
            throw new NullPointerException(str);
        }
    }

    public static void LIZIZ(int i, String str) {
        if (i > 0) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append(" > 0 required but it was ");
        sbLIZ.append(i);
        throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
    }
}
