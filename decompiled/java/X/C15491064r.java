package X;

import android.app.Activity;
import com.ss.android.ugc.aweme.im.chatroom.api.model.EnterChatParams;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* JADX INFO: renamed from: X.064r, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C15491064r {
    public static final C15491064r LIZIZ;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LIZJ;
    public static final C054G LIZLLL;
    public volatile C1598406Nq LIZ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C15491064r.class, "ttDispatchers", "getTtDispatchers()Lcom/ss/android/ugc/aweme/im/saas/host/api/utils/IMDispatchers;", 0);
        C13LE.LIZ.getClass();
        LIZJ = new InterfaceC2217461Bqa[]{c2217381BqS};
        C15491064r c15491064r = new C15491064r();
        LIZIZ = c15491064r;
        C1598406Nq c1598406Nq = c15491064r.LIZ;
        if (c1598406Nq == null) {
            synchronized (c15491064r) {
                c1598406Nq = c15491064r.LIZ;
                if (c1598406Nq == null) {
                    c1598406Nq = (C1598406Nq) C1807670x8n.LLLLLJIL();
                    c15491064r.LIZ = c1598406Nq;
                }
            }
        }
        LIZLLL = C2296808zG.LIZ(c1598406Nq.LIZIZ.plus(C2296908zH.LIZ()).plus(new C1770006wU(CoroutineExceptionHandler.LJJLIL, 11)));
    }

    public static void LIZIZ(String str) {
        Activity activityLIZIZ;
        AbstractC1387200mCc abstractC1387200mCcLJ = C1906580ziK.LJ();
        if (abstractC1387200mCcLJ != null) {
            activityLIZIZ = abstractC1387200mCcLJ.LIZIZ();
        } else {
            activityLIZIZ = null;
        }
        if (!(activityLIZIZ instanceof Activity)) {
            activityLIZIZ = null;
        }
        String strLJ = C0YNP.LJ(str);
        if (strLJ.length() == 0) {
            return;
        }
        EnterChatParams enterChatParams = new EnterChatParams(activityLIZIZ, -1, strLJ);
        enterChatParams.setEnterFromForMob("streak_invite_flow");
        enterChatParams.setEnterMethodForMob("click_to_chat_page");
        enterChatParams.setReturnPage("inbox");
        C1DFH c1dfh = C0PEM.LIZ;
        C23250099c.LIZLLL(C2296808zG.LIZ(C2107308Nj.LIZ), null, null, new C15487064n(enterChatParams, null), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0065  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(java.lang.String r6, java.lang.String r7, X.InterfaceC1364105Vn<? super kotlin.Unit> r8) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r8 instanceof X.C15490064q
            if (r0 == 0) goto L65
            r4 = r8
            X.064q r4 = (X.C15490064q) r4
            int r2 = r4.LLILZIL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L65
            int r2 = r2 - r1
            r4.LLILZIL = r2
        L12:
            java.lang.Object r3 = r4.LLILLL
            java.lang.Object r2 = X.C099R.LJFF()
            int r1 = r4.LLILZIL
            r0 = 1
            if (r1 == 0) goto L55
            if (r1 != r0) goto L6b
            java.lang.Object r7 = r4.LLILLJJLI
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r6 = r4.LL
            java.lang.String r6 = (java.lang.String) r6
            X.C155000ia.LIZIZ(r3)
        L2a:
            kotlin.Pair r3 = (kotlin.Pair) r3
            X.05u9 r1 = X.C1500705u9.LIZIZ
            java.lang.String r0 = "inbox_follow_request_invite"
            X.C1500705u9.LIZIZ(r1, r0)
            java.lang.Object r0 = r3.getFirst()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L4b
            java.lang.Object r0 = r3.getSecond()
            java.lang.String r0 = (java.lang.String) r0
            LIZIZ(r0)
        L48:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L4b:
            X.05wV r1 = new X.05wV
            r0 = 0
            r1.<init>(r6, r7, r3, r0)
            X.C23250099c.LJFF(r1)
            goto L48
        L55:
            X.C155000ia.LIZIZ(r3)
            r4.LL = r6
            r4.LLILLJJLI = r7
            r4.LLILZIL = r0
            java.lang.Object r3 = r5.LIZJ(r6, r7, r4)
            if (r3 != r2) goto L2a
            return r2
        L65:
            X.064q r4 = new X.064q
            r4.<init>(r5, r8)
            goto L12
        L6b:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C15491064r.LIZ(java.lang.String, java.lang.String, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZJ(java.lang.String r8, java.lang.String r9, X.InterfaceC1364105Vn<? super kotlin.Pair<java.lang.Boolean, java.lang.String>> r10) {
        /*
            Method dump skipped, instruction units count: 207
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C15491064r.LIZJ(java.lang.String, java.lang.String, X.05Vn):java.lang.Object");
    }
}
