package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.reflect.TypeToken;
import com.ss.android.ugc.aweme.publicgroup.data.model.InvitationListTabInfo;
import java.lang.reflect.Type;
import java.util.List;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0NZN, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0NZN {
    public static final C0NZN LIZ = new C0NZN();
    public static final Type LIZIZ = new TypeToken<List<? extends InvitationListTabInfo>>() { // from class: X.0NZL
    }.getType();

    public static List LIZIZ(String str) {
        boolean z;
        Object c098200Yq;
        String strLJFF = C0YNP.LJFF(str, "invite_list_tabs");
        boolean z2 = true;
        if (strLJFF != null && !a0.LJJJIL(strLJFF)) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            return null;
        }
        try {
            c098200Yq = (List) C051M.LIZJ(strLJFF, LIZIZ);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        List list = (List) c098200Yq;
        if (list != null && !list.isEmpty()) {
            z2 = false;
        }
        if (z2) {
            return null;
        }
        return list;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(X.C0Y8T r11, X.InterfaceC1364105Vn<? super java.util.List<com.ss.android.ugc.aweme.publicgroup.data.model.InvitationListTabInfo>> r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof X.C0NZM
            if (r0 == 0) goto L23
            r9 = r12
            X.0NZM r9 = (X.C0NZM) r9
            int r2 = r9.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L23
            int r2 = r2 - r1
            r9.LLILZ = r2
        L12:
            java.lang.Object r1 = r9.LLILLJJLI
            java.lang.Object r8 = X.C099R.LJFF()
            int r0 = r9.LLILZ
            r7 = 1
            r6 = 0
            if (r0 == 0) goto L31
            if (r0 != r7) goto L29
            X.0Y8T r11 = r9.LL
            goto L51
        L23:
            X.0NZM r9 = new X.0NZM
            r9.<init>(r10, r12)
            goto L12
        L29:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L31:
            X.C155000ia.LIZIZ(r1)
            long r2 = r11.getConversationShortId()
            r4 = 0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 > 0) goto L3f
            return r6
        L3f:
            X.0i7I r1 = X.C1230140i7I.LIZ     // Catch: java.lang.Exception -> L83
            com.ss.android.ugc.aweme.publicgroup.data.model.GroupInviteListTabsRequest r0 = new com.ss.android.ugc.aweme.publicgroup.data.model.GroupInviteListTabsRequest     // Catch: java.lang.Exception -> L83
            r0.<init>(r2)     // Catch: java.lang.Exception -> L83
            r9.LL = r11     // Catch: java.lang.Exception -> L83
            r9.LLILZ = r7     // Catch: java.lang.Exception -> L83
            java.lang.Object r1 = r1.LJFF(r0, r9)     // Catch: java.lang.Exception -> L83
            if (r1 != r8) goto L54
            return r8
        L51:
            X.C155000ia.LIZIZ(r1)     // Catch: java.lang.Exception -> L83
        L54:
            com.ss.android.ugc.aweme.publicgroup.data.model.GroupInviteListTabsResponse r1 = (com.ss.android.ugc.aweme.publicgroup.data.model.GroupInviteListTabsResponse) r1     // Catch: java.lang.Exception -> L83
            int r0 = r1.status_code     // Catch: java.lang.Exception -> L83
            if (r0 == 0) goto L5b
            return r6
        L5b:
            java.util.List<com.ss.android.ugc.aweme.publicgroup.data.model.InvitationListTabInfo> r3 = r1.availableInviteListTabs     // Catch: java.lang.Exception -> L83
            r1 = 0
            if (r3 == 0) goto L67
            boolean r0 = r3.isEmpty()     // Catch: java.lang.Exception -> L83
            if (r0 != 0) goto L67
            goto L69
        L67:
            r0 = 1
            goto L6a
        L69:
            r0 = 0
        L6a:
            if (r0 == 0) goto L6d
            return r6
        L6d:
            java.lang.String r2 = X.C051M.LJ(r3, r1)     // Catch: java.lang.Exception -> L83
            boolean r0 = kotlin.text.a0.LJJJIL(r2)     // Catch: java.lang.Exception -> L83
            r0 = r0 ^ 1
            if (r0 == 0) goto L82
            java.lang.String r1 = r11.getConversationId()     // Catch: java.lang.Exception -> L83
            java.lang.String r0 = "invite_list_tabs"
            X.C0YNP.LJIIIIZZ(r1, r0, r2)     // Catch: java.lang.Exception -> L83
        L82:
            return r3
        L83:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0NZN.LIZ(X.0Y8T, X.05Vn):java.lang.Object");
    }
}
