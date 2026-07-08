package X;

/* JADX INFO: renamed from: X.0TQo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C746640TQo {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LIZ(Throwable th, C19EG c19eg, boolean z) {
        C23112093u c23112093u;
        String quantityString;
        if (th instanceof C0XIR) {
            c23112093u = (C23112093u) th;
        } else {
            c23112093u = null;
        }
        if (c23112093u == null || c19eg == null) {
            return false;
        }
        switch (c23112093u.getErrorCode()) {
            case 3002559:
                quantityString = c19eg.getString(2131847925);
                break;
            case 3002560:
                quantityString = c19eg.getString(2131847926);
                break;
            case 3002561:
                quantityString = c19eg.getResources().getQuantityString(2131755706, 1);
                break;
            case 3002562:
            default:
                return false;
            case 3002563:
                quantityString = c19eg.getResources().getQuantityString(2131755706, 2);
                break;
        }
        if (quantityString != null) {
            if (z) {
                C1440005kM.LIZ(new C7827033x(quantityString));
                return true;
            }
            C1389880mGw c1389880mGw = new C1389880mGw(c19eg);
            c1389880mGw.LJIIIZ(quantityString);
            c1389880mGw.LJIIJ();
            return true;
        }
        return false;
    }
}
