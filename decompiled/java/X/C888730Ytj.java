package X;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Ytj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C888730Ytj extends C09AY implements Function0<C888740Ytk> {
    public C888730Ytj() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final C888740Ytk invoke() {
        return new InterfaceC890500Ywa() { // from class: X.0Ytk
            @Override // X.InterfaceC890500Ywa
            public final boolean LIZ(Object obj, String str, String str2) {
                if (obj instanceof C0Z8M) {
                    return Intrinsics.LJFF(((C0Z8M) obj).getSessionId(), str2);
                }
                if (obj instanceof C0Z8L) {
                    C0Z8L c0z8l = (C0Z8L) obj;
                    if (Intrinsics.LJFF(c0z8l.getUid(), str) || Intrinsics.LJFF(c0z8l.getSessionId(), str2)) {
                        return true;
                    }
                    return false;
                }
                if (obj instanceof C0Z3S) {
                    return Intrinsics.LJFF(((C0Z3S) obj).getSessionId(), str2);
                }
                return false;
            }
        };
    }
}
