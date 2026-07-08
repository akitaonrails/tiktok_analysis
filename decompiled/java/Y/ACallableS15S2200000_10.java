package Y;

import X.C1388190mED;
import X.C1603960rqE;
import X.C19724912Fj;
import X.C1C7U;
import X.C686150Qvl;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.ss.android.ugc.aweme.bullet.bridge.framework.OpenAwemeDetailMethod;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public class ACallableS15S2200000_10 implements Callable {
    public final int $t;
    public Object l2;
    public Object l3;
    public String s0;
    public String s1;

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.$t) {
            case 0:
                return call$0(this);
            case 1:
                return call$1(this);
            default:
                return null;
        }
    }

    public static final Object call$0(ACallableS15S2200000_10 aCallableS15S2200000_10) {
        Activity activityLIZ;
        boolean zLJI;
        C1C7U.LIZ("OpenAwemeDetailMethod@8cd7.handle$2$7");
        C1603960rqE.LIZ = ((OpenAwemeDetailMethod) aCallableS15S2200000_10.l2).possibleModel(aCallableS15S2200000_10.s0);
        Context context = ((OpenAwemeDetailMethod) aCallableS15S2200000_10.l2).getContext();
        Boolean boolValueOf = null;
        if (context != null && (activityLIZ = C1388190mED.LIZ(context)) != null) {
            String str = aCallableS15S2200000_10.s1;
            C686150Qvl c686150Qvl = (C686150Qvl) aCallableS15S2200000_10.l3;
            if (Intrinsics.LJFF(str, "recently_deleted_page")) {
                C19724912Fj c19724912FjLIZLLL = C19724912Fj.LIZLLL();
                String strLIZJ = c686150Qvl.LIZJ();
                Bundle bundle = new Bundle();
                bundle.putBoolean("is_clean_mode", true);
                bundle.putBoolean("support_scroll_in_clean_mode", true);
                bundle.putBoolean("allow_deleted_aweme", true);
                zLJI = c19724912FjLIZLLL.LJIIIZ(activityLIZ, strLIZJ, bundle, null);
            } else {
                zLJI = C19724912Fj.LIZLLL().LJI(activityLIZ, c686150Qvl.LIZJ());
            }
            boolValueOf = Boolean.valueOf(zLJI);
        }
        C1C7U.LIZIZ("OpenAwemeDetailMethod@8cd7.handle$2$7");
        return boolValueOf;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0095  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object call$1(Y.ACallableS15S2200000_10 r8) {
        /*
            java.lang.String r7 = "OpenAwemeDetailMethod@f94.handle$2$19"
            X.C1C7U.LIZ(r7)
            java.lang.Object r0 = r8.l2
            com.ss.android.ugc.aweme.fe.method.OpenAwemeDetailMethod r0 = (com.ss.android.ugc.aweme.fe.method.OpenAwemeDetailMethod) r0
            java.lang.ref.WeakReference<android.content.Context> r0 = r0.mContextRef
            java.lang.Object r0 = r0.get()
            android.content.Context r0 = (android.content.Context) r0
            r6 = 0
            if (r0 == 0) goto L7d
            android.app.Activity r5 = X.C1388190mED.LIZ(r0)
            if (r5 == 0) goto L7d
            java.lang.Object r0 = r8.l2
            com.ss.android.ugc.aweme.fe.method.OpenAwemeDetailMethod r0 = (com.ss.android.ugc.aweme.fe.method.OpenAwemeDetailMethod) r0
            java.lang.String r4 = r8.s0
            java.lang.String r3 = r8.s1
            java.lang.Object r2 = r8.l3
            X.0Qvl r2 = (X.C686150Qvl) r2
            android.content.Context r1 = r0.getActContext()
            android.app.Activity r1 = (android.app.Activity) r1
            if (r1 == 0) goto L95
            r0 = 16908290(0x1020002, float:2.3877235E-38)
            android.view.View r1 = r1.findViewById(r0)
            r0 = 2131365462(0x7f0a0e56, float:1.835079E38)
            java.lang.Object r1 = r1.getTag(r0)
            boolean r0 = X.C19719512Dh.LJII(r1)
            if (r0 == 0) goto L8e
            java.util.Map r1 = (java.util.Map) r1
            java.lang.Object r1 = r1.get(r4)
            boolean r0 = r1 instanceof X.C1065720dq6
            if (r0 == 0) goto L95
            X.0imo r1 = (X.AbstractC1255880imo) r1
        L4e:
            X.C1603960rqE.LIZ = r1
            java.lang.String r0 = "recently_deleted_page"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r3, r0)
            if (r0 == 0) goto L81
            X.12Fj r4 = X.C19724912Fj.LIZLLL()
            java.lang.String r3 = r2.LIZJ()
            android.os.Bundle r2 = new android.os.Bundle
            r2.<init>()
            java.lang.String r0 = "is_clean_mode"
            r1 = 1
            r2.putBoolean(r0, r1)
            java.lang.String r0 = "support_scroll_in_clean_mode"
            r2.putBoolean(r0, r1)
            java.lang.String r0 = "allow_deleted_aweme"
            r2.putBoolean(r0, r1)
            boolean r0 = r4.LJIIIZ(r5, r3, r2, r6)
        L79:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r0)
        L7d:
            X.C1C7U.LIZIZ(r7)
            return r6
        L81:
            X.12Fj r1 = X.C19724912Fj.LIZLLL()
            java.lang.String r0 = r2.LIZJ()
            boolean r0 = r1.LJI(r5, r0)
            goto L79
        L8e:
            boolean r0 = r1 instanceof X.C1065720dq6
            if (r0 == 0) goto L95
            X.0imo r1 = (X.AbstractC1255880imo) r1
            goto L4e
        L95:
            r1 = r6
            goto L4e
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ACallableS15S2200000_10.call$1(Y.ACallableS15S2200000_10):java.lang.Object");
    }

    public ACallableS15S2200000_10(Object obj, String str, String str2, Object obj2, int i) {
        this.$t = i;
        this.l2 = obj;
        this.s0 = str;
        this.s1 = str2;
        this.l3 = obj2;
    }
}
