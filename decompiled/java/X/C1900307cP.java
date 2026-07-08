package X;

import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: X.07cP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1900307cP {
    public static final C1900307cP LIZ = new C1900307cP();
    public static final List<InterfaceC1530330pvT> LIZIZ = Collections.singletonList(new AbstractC1530320pvS() { // from class: X.07cO
        @Override // X.InterfaceC1530330pvT
        public final void LIZ() {
        }

        @Override // X.InterfaceC1530330pvT
        public final boolean LIZJ(List<Integer> list) {
            Character chValueOf;
            Integer num = (Integer) C13LP.LJJJLL(list);
            if (num != null && (chValueOf = Character.valueOf((char) num.intValue())) != null) {
                if (chValueOf.charValue() != '{' && chValueOf.charValue() != ']') {
                    return true;
                }
                return false;
            }
            return true;
        }
    });
}
