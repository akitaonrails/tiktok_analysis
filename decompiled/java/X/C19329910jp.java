package X;

import android.view.View;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.utils.JsonParseUtils;

/* JADX INFO: renamed from: X.10jp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C19329910jp {
    public static final C19329910jp LIZ = new C19329910jp();
    public static volatile boolean LIZIZ;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x004b A[PHI: r4
      0x004b: PHI (r4v2 X.15ms) = (r4v4 X.15ms), (r4v5 X.15ms) binds: [B:32:0x0060, B:22:0x0049] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0053 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean LIZ() {
        /*
            android.app.Activity r4 = X.C2214201BlK.LJFF()
            r5 = 0
            if (r4 == 0) goto L63
            java.lang.String r1 = r4.getLocalClassName()
            java.lang.String r0 = "com.ss.android.ugc.aweme.live.LivePlayActivity"
            boolean r0 = android.text.TextUtils.equals(r1, r0)
            r3 = 1
            if (r0 != 0) goto L24
            boolean r0 = r4 instanceof X.InterfaceC19330010jq
            r2 = 0
            if (r0 == 0) goto L25
            r0 = r4
            X.10jq r0 = (X.InterfaceC19330010jq) r0
            if (r0 == 0) goto L25
            boolean r0 = r0.LIZ()
            if (r0 != r3) goto L25
        L24:
            return r3
        L25:
            java.lang.String r1 = r4.getLocalClassName()
            java.lang.String r0 = "com.ss.android.ugc.aweme.live.LiveBroadcastActivity"
            boolean r0 = android.text.TextUtils.equals(r1, r0)
            if (r0 != 0) goto L24
            java.lang.String r1 = r4.getLocalClassName()
            java.lang.String r0 = "com.ss.android.ugc.aweme.live.LiveBroadcastSceneWrapperActivity"
            boolean r0 = android.text.TextUtils.equals(r1, r0)
            if (r0 != 0) goto L24
            boolean r0 = X.C294780Bgy.LIZ()
            if (r0 == 0) goto L54
            boolean r0 = r4 instanceof X.InterfaceC214897198d
            if (r0 == 0) goto L4f
            X.15ms r4 = (X.InterfaceC20622815ms) r4
            if (r4 == 0) goto L4f
        L4b:
            X.198i r2 = X.C20629915o1.LIZJ(r4)
        L4f:
            boolean r0 = r2 instanceof X.InterfaceC20596815ig
            if (r0 == 0) goto L63
            return r3
        L54:
            boolean r0 = r4 instanceof X.InterfaceC214897198d
            if (r0 == 0) goto L4f
            X.198d r4 = (X.InterfaceC214897198d) r4
            if (r4 == 0) goto L4f
            boolean r0 = r4.getEnableSAF()
            if (r0 == 0) goto L4f
            goto L4b
        L63:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19329910jp.LIZ():boolean");
    }

    public static void LIZIZ(View... viewArr) {
        if (viewArr.length != 0) {
            for (View view : viewArr) {
                if (view != null) {
                    C786410Ut5.LJLLLLLL(8, view);
                }
            }
        }
    }

    public static String LIZJ(Object obj) {
        try {
            return JsonParseUtils.LJ(obj);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C098200Yq c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
            Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
            if (thM5exceptionOrNullimpl != null) {
                C19331210k2 c19331210k2 = C19331210k2.LIZ;
                EnumC19355710nz enumC19355710nz = EnumC19355710nz.OBJECT_TO_JSON;
                String message = thM5exceptionOrNullimpl.getMessage();
                c19331210k2.getClass();
                C19331210k2.LJIIIZ(null, enumC19355710nz, message);
            }
            return null;
        }
    }
}
