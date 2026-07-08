package X;

import java.util.List;

/* JADX INFO: renamed from: X.0YL8, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0YL8 {
    public static C0YL9 LIZ(C0Y8T c0y8t, List list, boolean z, EnumC873090YMx enumC873090YMx, int i) {
        EnumC873090YMx enumC873090YMx2 = enumC873090YMx;
        boolean z2 = z;
        boolean z3 = false;
        if ((i & 4) != 0) {
            z2 = false;
        }
        if ((i & 8) != 0) {
            enumC873090YMx2 = EnumC873090YMx.FROM_NEW_TO_OLD;
        }
        if ((i & 16) != 0) {
            z3 = true;
        }
        return new C0YL9(c0y8t.getConversationId(), c0y8t.getInboxType(), list, enumC873090YMx2, z2, z3);
    }
}
