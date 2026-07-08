package X;

import android.text.TextUtils;

/* JADX INFO: renamed from: X.0woO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1795020woO {
    public static C1792840wks LIZ(C19885612rG c19885612rG) {
        C1792840wks c1792840wks = new C1792840wks();
        String str = "Unknown.";
        int i = Integer.MIN_VALUE;
        if (c19885612rG == null) {
            c1792840wks.LIZ = Integer.MIN_VALUE;
            "0:OK/1:User Canceled/2:Unknown/3:Billing Unavailable/4:Item is unavailable/5:Developer Error/6:Error/7:Item Is Already Owned/8:Item is not owned".split("/");
            c1792840wks.LJ = "Unknown.";
            return c1792840wks;
        }
        int i2 = c19885612rG.LIZ;
        if (i2 != Integer.MIN_VALUE) {
            if (i2 != 12) {
                switch (i2) {
                    case -3:
                        i = -3;
                        break;
                    case -2:
                        i = -2;
                        break;
                    case -1:
                        i = -1;
                        break;
                    case 0:
                        i = 0;
                        break;
                    case 1:
                        i = 1;
                        break;
                    case 2:
                        i = 2;
                        break;
                    case 3:
                        i = 3;
                        break;
                    case 4:
                        i = 4;
                        break;
                    case 5:
                        i = 5;
                        break;
                    case 6:
                        i = 6;
                        break;
                    case 7:
                        i = 7;
                        break;
                    case 8:
                        i = 8;
                        break;
                }
            } else {
                i = 12;
            }
        } else {
            i = -4;
        }
        c1792840wks.LIZ = i;
        c1792840wks.LIZJ = c19885612rG.LIZIZ;
        if (TextUtils.isEmpty(c19885612rG.LIZJ)) {
            String[] strArrSplit = "0:OK/1:User Canceled/2:Unknown/3:Billing Unavailable/4:Item is unavailable/5:Developer Error/6:Error/7:Item Is Already Owned/8:Item is not owned".split("/");
            if (i >= 0 && i <= strArrSplit.length - 1) {
                str = strArrSplit[i];
            }
        } else {
            str = c19885612rG.LIZJ;
        }
        c1792840wks.LJ = str;
        return c1792840wks;
    }

    public static C1792840wks LIZIZ(int i, int i2, String str) {
        C1792840wks c1792840wks = new C1792840wks();
        c1792840wks.LIZ = i;
        c1792840wks.LIZIZ = i2;
        c1792840wks.LJ = str;
        return c1792840wks;
    }
}
