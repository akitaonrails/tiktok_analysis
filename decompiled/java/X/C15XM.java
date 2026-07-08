package X;

import com.ss.android.ugc.aweme.compliance.protection.timelock.ui.activity.TimeUnlockActivity;

/* JADX INFO: renamed from: X.15XM, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C15XM {
    public static C204683157h<Boolean> LIZ() {
        C204683157h<Boolean> c204683157h;
        C20335014hY c20335014hYLIZ = C20335014hY.LIZ();
        String str = TimeUnlockActivity._pnsPageId;
        synchronized (c20335014hYLIZ) {
            c204683157h = c20335014hYLIZ.LIZ.get("UNLOCK");
        }
        return c204683157h;
    }

    public static C204683157h<Boolean> LIZIZ() {
        C204683157h<Boolean> c204683157h;
        if (LIZ() != null) {
            return LIZ();
        }
        C20335014hY c20335014hYLIZ = C20335014hY.LIZ();
        String str = TimeUnlockActivity._pnsPageId;
        synchronized (c20335014hYLIZ) {
            if (!c20335014hYLIZ.LIZ.containsKey("UNLOCK")) {
                c20335014hYLIZ.LIZ.put("UNLOCK", new C204683157h());
            }
            c204683157h = c20335014hYLIZ.LIZ.get("UNLOCK");
        }
        return c204683157h;
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x021f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZJ(X.C204684157i r14, java.lang.String r15) {
        /*
            Method dump skipped, instruction units count: 839
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C15XM.LIZJ(X.157i, java.lang.String):void");
    }
}
