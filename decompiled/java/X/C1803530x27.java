package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;

/* JADX INFO: renamed from: X.0x27, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1803530x27 {
    public static C1797200wru LIZIZ(Throwable th) {
        if (th instanceof C1803880x2g) {
            return LIZIZ(((C1803880x2g) th).getError());
        }
        if (th instanceof C1797200wru) {
            C1797200wru c1797200wru = (C1797200wru) th;
            return LIZ(c1797200wru.getErrorCode(), c1797200wru.getDetailCode(), c1797200wru.getInternalCode(), c1797200wru.getMappedErrorCode(), c1797200wru.getMappedErrorMessage(), c1797200wru.getException());
        }
        if (th instanceof Exception) {
            return LIZ(0, 0, 0, CardStruct.IStatusCode.DEFAULT, String.valueOf(th.getMessage()), (Exception) th);
        }
        String strValueOf = String.valueOf(th.getMessage());
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("unknown ");
        sbLIZ.append(th.getMessage());
        return LIZ(0, 0, 0, CardStruct.IStatusCode.DEFAULT, strValueOf, new C1149180g0i(C2188811AlT.LIZIZ(sbLIZ)));
    }

    public static C1797200wru LIZ(int i, int i2, int i3, String str, String str2, Exception exc) {
        return new C1797200wru(1, i, i2, str, str2, "ttlive_query_pipo_purchase", exc, null, null, 0, i3, null, 2944, null);
    }
}
