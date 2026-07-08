package X;

import com.ss.android.ugc.aweme.notice.repo.list.bean.SubscribeInfoResponse;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AFwS195S0000000_9;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0Owa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C635700Owa {
    public static final C635700Owa LIZ = new C635700Owa();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS195S0000000_9.get$arr$(282));
    public static final C603820NmG<String, SubscribeInfoResponse> LIZJ = new C603820NmG<>(10);
    public static final ConcurrentHashMap<String, AnonymousClass0957<SubscribeInfoResponse>> LIZLLL = new ConcurrentHashMap<>();

    public static void LIZJ(int i) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(i);
        sbLIZ.append('_');
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        Set setKeySet = ((LinkedHashMap) LIZJ.LJIIIIZZ()).keySet();
        ArrayList arrayList = new ArrayList();
        for (Object obj : setKeySet) {
            if (u.LJJIIJZLJL((String) obj, strLIZIZ, false)) {
                arrayList.add(obj);
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            LIZJ.LJ((String) it2.next());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(int r19, java.util.List<java.lang.Integer> r20, X.C635690OwZ r21, X.InterfaceC1364105Vn<? super com.ss.android.ugc.aweme.notice.repo.list.bean.SubscribeInfoResponse> r22) {
        /*
            Method dump skipped, instruction units count: 237
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C635700Owa.LIZ(int, java.util.List, X.0OwZ, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(int r10, java.util.List<com.ss.android.ugc.aweme.notice.repo.list.bean.SubscribeCategoryLabels> r11, java.lang.Boolean r12, X.InterfaceC1364105Vn<? super com.ss.android.ugc.aweme.notice.repo.list.bean.SubmitSubscribeResponse> r13) {
        /*
            r9 = this;
            boolean r0 = r13 instanceof X.C635720Owc
            if (r0 == 0) goto L21
            r7 = r13
            X.0Owc r7 = (X.C635720Owc) r7
            int r2 = r7.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L21
            int r2 = r2 - r1
            r7.LLILLL = r2
        L12:
            java.lang.Object r1 = r7.LL
            java.lang.Object r8 = X.C099R.LJFF()
            int r0 = r7.LLILLL
            r6 = 0
            r5 = 1
            if (r0 == 0) goto L2f
            if (r0 != r5) goto L27
            goto L6c
        L21:
            X.0Owc r7 = new X.0Owc
            r7.<init>(r9, r13)
            goto L12
        L27:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L2f:
            X.C155000ia.LIZIZ(r1)
            r4 = 0
            if (r12 == 0) goto L3f
            boolean r0 = r12.booleanValue()     // Catch: java.lang.Exception -> L76
            if (r0 == 0) goto L3d
            r0 = 1
            goto L41
        L3d:
            r0 = 0
            goto L41
        L3f:
            r3 = r6
            goto L45
        L41:
            java.lang.Integer r3 = X.C2286608xc.LJ(r0)     // Catch: java.lang.Exception -> L76
        L45:
            com.ss.android.ugc.aweme.notification.api.NotificationApi$Api r2 = com.ss.android.ugc.aweme.notification.api.NotificationApi.LIZ()     // Catch: java.lang.Exception -> L76
            java.lang.String r1 = java.lang.String.valueOf(r10)     // Catch: java.lang.Exception -> L76
            if (r11 == 0) goto L55
            boolean r0 = r11.isEmpty()     // Catch: java.lang.Exception -> L76
            if (r0 == 0) goto L56
        L55:
            r4 = 1
        L56:
            if (r4 == 0) goto L5a
            r0 = r6
            goto L63
        L5a:
            X.04rF r0 = X.C1227904rF.LIZ     // Catch: java.lang.Exception -> L76
            r0.getClass()     // Catch: java.lang.Exception -> L76
            java.lang.String r0 = X.C1227904rF.LJI(r11)     // Catch: java.lang.Exception -> L76
        L63:
            r7.LLILLL = r5     // Catch: java.lang.Exception -> L76
            java.lang.Object r1 = r2.submitSubscribeSelection(r1, r0, r3, r7)     // Catch: java.lang.Exception -> L76
            if (r1 != r8) goto L6f
            return r8
        L6c:
            X.C155000ia.LIZIZ(r1)     // Catch: java.lang.Exception -> L76
        L6f:
            com.ss.android.ugc.aweme.notice.repo.list.bean.SubmitSubscribeResponse r1 = (com.ss.android.ugc.aweme.notice.repo.list.bean.SubmitSubscribeResponse) r1     // Catch: java.lang.Exception -> L76
            int r0 = r1.status_code     // Catch: java.lang.Exception -> L76
            if (r0 != 0) goto L7a
            return r1
        L76:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L7a:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C635700Owa.LIZIZ(int, java.util.List, java.lang.Boolean, X.05Vn):java.lang.Object");
    }
}
