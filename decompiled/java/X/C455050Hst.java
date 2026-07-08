package X;

import java.util.Map;

/* JADX INFO: renamed from: X.0Hst, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C455050Hst {
    public static final C455050Hst LIZ = new C455050Hst();

    public static boolean LIZIZ(Integer num, Map map) {
        String str;
        if (num != null && num.intValue() == 7) {
            if (map != null) {
                str = (String) map.get("html_link");
            } else {
                str = null;
            }
            return C866950Xzh.LIZ(str);
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(X.C869590Y9l r6, X.InterfaceC1364105Vn<? super kotlin.Unit> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof X.C455060Hsu
            if (r0 == 0) goto L20
            r4 = r7
            X.0Hsu r4 = (X.C455060Hsu) r4
            int r2 = r4.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L20
            int r2 = r2 - r1
            r4.LLILLL = r2
        L12:
            java.lang.Object r1 = r4.LL
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r4.LLILLL
            r2 = 1
            if (r0 == 0) goto L2e
            if (r0 != r2) goto L26
            goto L62
        L20:
            X.0Hsu r4 = new X.0Hsu
            r4.<init>(r5, r7)
            goto L12
        L26:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L2e:
            X.C155000ia.LIZIZ(r1)
            int r0 = r6.getMsgType()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.util.Map r0 = r6.getLocalExt()
            boolean r0 = LIZIZ(r1, r0)
            if (r0 != 0) goto L46
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L46:
            X.0Hrr r0 = com.ss.android.ugc.aweme.im.chatroom.api.IMChatRoomApi.LIZ     // Catch: java.lang.Exception -> L68
            r0.getClass()     // Catch: java.lang.Exception -> L68
            com.ss.android.ugc.aweme.im.chatroom.api.IMChatRoomApi r0 = X.C454410Hrr.LIZ()     // Catch: java.lang.Exception -> L68
            if (r0 == 0) goto L56
            X.0ZrA r0 = r0.LIZ()     // Catch: java.lang.Exception -> L68
            goto L57
        L56:
            r0 = 0
        L57:
            if (r0 == 0) goto L6f
            r4.LLILLL = r2     // Catch: java.lang.Exception -> L68
            java.lang.Object r1 = r0.LIZLLL(r6, r4)     // Catch: java.lang.Exception -> L68
            if (r1 != r3) goto L65
            return r3
        L62:
            X.C155000ia.LIZIZ(r1)     // Catch: java.lang.Exception -> L68
        L65:
            X.0Y9l r1 = (X.C869590Y9l) r1     // Catch: java.lang.Exception -> L68
            goto L6f
        L68:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            r0.toString()
        L6f:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C455050Hst.LIZ(X.0Y9l, X.05Vn):java.lang.Object");
    }
}
