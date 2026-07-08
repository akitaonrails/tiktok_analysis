package X;

import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0D9H, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0D9H {
    public static final Map<String, String> LIZ = C2097908Jt.LIZJ(new Pair("merchandise_not_enough_stock", ""));

    public static C334550D9p LIZ(long j, List list) {
        String strLIZJ = C0DBE.LIZJ(C0DBD.LIZ, C0D9Q.LIZ(), list);
        if (strLIZJ == null) {
            strLIZJ = C0D9Q.LIZ();
        }
        return LIZLLL(j, strLIZJ, C0D9J.USER_ACTION_BLOCKED);
    }

    public static C334550D9p LIZIZ(long j, Throwable th, final C0D9M c0d9m) {
        C0D77 c0d77;
        C0D7F c0d7f;
        String strLIZ;
        C0D9K c0d9k = new C0D9K(c0d9m) { // from class: X.0D9I
            public final C0D9M LIZJ;

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C0D9I) && Intrinsics.LJFF(this.LIZJ, ((C0D9I) obj).LIZJ);
            }

            public final int hashCode() {
                return this.LIZJ.hashCode();
            }

            public final String toString() {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("RetryAndCancel(retry=");
                sbLIZ.append(this.LIZJ);
                sbLIZ.append(')');
                return C2188811AlT.LIZIZ(sbLIZ);
            }

            {
                super(c0d9m, C0D9L.LIZ(2131857591), C0D9L.LIZ(2131857474));
                this.LIZJ = c0d9m;
            }
        };
        if (th instanceof C0D77) {
            c0d77 = (C0D77) th;
        } else {
            c0d77 = null;
        }
        if (c0d77 == null) {
            c0d7f = C0D7F.LL;
        } else {
            int i = C334030D7p.LIZ[c0d77.getKind().ordinal()];
            if (i != 1) {
                if (i != 2 && i != 3) {
                    if (i == 4) {
                        c0d7f = C0D7F.LL;
                    } else {
                        throw new C1954807lC();
                    }
                } else {
                    c0d7f = C0D7F.LLILLL;
                }
            } else {
                c0d7f = C0D7F.LLILLJJLI;
            }
        }
        int iOrdinal = c0d7f.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal != 1) {
                if (iOrdinal == 2) {
                    strLIZ = C0D9L.LIZ(2131857529);
                } else {
                    throw new C1954807lC();
                }
            } else {
                strLIZ = C0D9L.LIZ(2131857505);
            }
        } else {
            strLIZ = C0D9L.LIZ(2131857496);
        }
        return new C334550D9p(j, strLIZ, C0D9L.LIZ(2131857586), C0D9J.REQUEST_FAILED, C0D93.DIALOG, c0d9m, c0d9k.LIZ, c0d9k.LIZIZ);
    }

    public static C334550D9p LIZJ(long j, C0D7D c0d7d, List list) {
        String strLIZ;
        C0DBD c0dbd = C0DBD.LIZ;
        int[] iArr = C0D7E.LIZ;
        int i = iArr[c0d7d.ordinal()];
        String strLIZ2 = "Checkout failed";
        if (i == 1 || i == 2) {
            strLIZ = "Checkout failed";
        } else if (i == 3 || i == 4) {
            strLIZ = C0D9L.LIZ(2131857509);
        } else {
            throw new C1954807lC();
        }
        int i2 = iArr[c0d7d.ordinal()];
        if (i2 != 1 && i2 != 2) {
            if (i2 == 3 || i2 == 4) {
                strLIZ2 = C0D9L.LIZ(2131857509);
            } else {
                throw new C1954807lC();
            }
        }
        String strLIZJ = C0DBE.LIZJ(c0dbd, strLIZ2, list);
        if (strLIZJ != null) {
            strLIZ2 = strLIZJ;
        }
        return new C334550D9p(j, strLIZ, strLIZ2, C0D9J.REQUEST_FAILED, C0D93.DIALOG, C0D9N.LIZ, C0D9L.LIZ(2131857499), null);
    }

    public static C334550D9p LIZLLL(long j, String str, C0D9J c0d9j) {
        return new C334550D9p(j, null, str, c0d9j, C0D93.TOAST, C0D9N.LIZ, null, null);
    }
}
