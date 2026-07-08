package X;

import android.app.Activity;
import android.view.View;
import com.bytedance.hox.Hox;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AwS162S0101000_24;

/* JADX INFO: renamed from: X.0rkr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1600630rkr {
    public static final boolean LIZJ() {
        C19EG c19eg;
        Activity activityLJFF = C2214201BlK.LJFF();
        if (!(activityLJFF instanceof C19EG) || (c19eg = (C19EG) activityLJFF) == null) {
            return false;
        }
        return Hox.LLJILJIL.LIZ(c19eg).KQ2("NOTIFICATION");
    }

    public static final View LIZ(int i, Activity activity) {
        if (((Boolean) C1904430zer.LIZJ.getValue()).booleanValue() && LIZJ()) {
            ((LinkedHashMap) C1904430zer.LJI).get(Integer.valueOf(i));
            AwS162S0101000_24 awS162S0101000_24 = new AwS162S0101000_24(activity, i, 3);
            C20673215v0.LIZ(i, activity);
            System.currentTimeMillis();
            View view = (View) awS162S0101000_24.invoke();
            System.currentTimeMillis();
            return view;
        }
        return C20673215v0.LIZJ(i, activity);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0051  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZIZ(X.C1331670kl3 r2, X.InterfaceC427850Gq7 r3, java.lang.String r4) {
        /*
            int r0 = r4.hashCode()
            r1 = 0
            switch(r0) {
                case -1629886283: goto L48;
                case 18890236: goto L3f;
                case 91686929: goto L29;
                case 848381647: goto L1c;
                default: goto L8;
            }
        L8:
            boolean r0 = X.C0BV8.LIZ()
            if (r0 == 0) goto L14
            boolean r0 = X.C0BV7.LIZ()
            if (r0 != 0) goto L62
        L14:
            if (r1 == 0) goto L62
            if (r3 == 0) goto L5e
            r2.LJIIL(r3)
            return
        L1c:
            java.lang.String r0 = "EntranceNormalVH"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L8
            boolean r1 = X.C0CJI.LIZIZ()
            goto L8
        L29:
            java.lang.String r0 = "RelationImgDisplayMonImpl"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L8
            boolean r0 = X.C0CJI.LIZIZ()
            if (r0 == 0) goto L8
            boolean r0 = LIZJ()
            if (r0 == 0) goto L8
            r1 = 1
            goto L8
        L3f:
            java.lang.String r0 = "InboxDMAvatarLoadHelper"
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L51
            goto L8
        L48:
            java.lang.String r0 = "Skylight"
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L51
            goto L8
        L51:
            X.01GW r0 = X.C1904430zer.LIZLLL
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r1 = r0.booleanValue()
            goto L8
        L5e:
            r2.LJIIJJI()
            return
        L62:
            if (r3 == 0) goto L68
            r2.LJIIJ(r3)
            return
        L68:
            X.C786410Ut5.h3(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1600630rkr.LIZIZ(X.0kl3, X.0Gq7, java.lang.String):void");
    }
}
