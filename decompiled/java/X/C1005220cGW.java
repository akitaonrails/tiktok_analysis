package X;

/* JADX INFO: renamed from: X.0cGW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1005220cGW {
    public static final void LIZ(C197039127h c197039127h) {
        C1005210cGV c1005210cGV;
        C1005210cGV c1005210cGV2;
        Object tag = c197039127h.getTag();
        if (!(tag instanceof C1005210cGV) || (c1005210cGV2 = (C1005210cGV) tag) == null || (c1005210cGV = c1005210cGV2.copy(c1005210cGV2.data, c1005210cGV2.btnIconType, c1005210cGV2.isAdjustDone, true)) == null) {
            c1005210cGV = new C1005210cGV(null, null, false, true);
        }
        c197039127h.setTag(c1005210cGV);
    }
}
