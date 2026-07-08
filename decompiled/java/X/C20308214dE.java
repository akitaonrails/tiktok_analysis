package X;

import android.view.View;

/* JADX INFO: renamed from: X.14dE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public class C20308214dE implements InterfaceC2211931Bhf {
    public final int $t;
    public Object l0;

    @Override // X.InterfaceC2211931Bhf
    public final void LIZ(View view, String str) {
        switch (this.$t) {
            case 0:
                LIZ$0(this, view, str);
                break;
            case 1:
                LIZ$1(this, view, str);
                break;
            case 2:
                LIZ$2(this, view, str);
                break;
        }
    }

    public C20308214dE(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0022 A[PHI: r6
      0x0022: PHI (r6v3 java.lang.String) = (r6v0 java.lang.String), (r6v4 java.lang.String) binds: [B:12:0x0020, B:10:0x001d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0026 A[PHI: r6
      0x0026: PHI (r6v2 java.lang.String) = (r6v0 java.lang.String), (r6v3 java.lang.String) binds: [B:12:0x0020, B:14:0x0024] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZ$0(X.C20308214dE r10, android.view.View r11, java.lang.String r12) {
        /*
            java.lang.Object r0 = r10.l0
            com.ss.android.ugc.aweme.tako.botpage.components.botcenter.BotCenterCell r0 = (com.ss.android.ugc.aweme.tako.botpage.components.botcenter.BotCenterCell) r0
            X.0zJl r2 = r0.getItem()
            X.14Gl r2 = (X.C20237314Gl) r2
            if (r2 == 0) goto L43
            X.0yYx r3 = X.C1862330yYx.LIZ
            X.14Gm r0 = r2.LLILLL
            r5 = 0
            if (r0 == 0) goto L44
            java.lang.String r4 = r0.LL
            java.lang.String r5 = r0.LLILLJJLI
        L17:
            java.lang.String r12 = ""
            if (r0 == 0) goto L1f
            java.lang.String r6 = r0.LLILLL
            if (r6 != 0) goto L22
        L1f:
            r6 = r12
            if (r0 == 0) goto L26
        L22:
            java.lang.String r11 = r0.LLILZ
            if (r11 != 0) goto L27
        L26:
            r11 = r12
        L27:
            com.ss.android.ugc.aweme.tako.ccl.model.api.TakoBotInfo r0 = r2.LLILLJJLI
            long r0 = r0.botId
            java.lang.String r7 = java.lang.String.valueOf(r0)
            com.ss.android.ugc.aweme.tako.ccl.model.api.TakoBotInfo r0 = r2.LLILLJJLI
            java.lang.String r8 = r0.botName
            java.lang.String r10 = r2.LL
            X.14Gm r0 = r2.LLILLL
            if (r0 == 0) goto L3e
            java.lang.String r0 = r0.LLILZIL
            if (r0 == 0) goto L3e
            r12 = r0
        L3e:
            java.lang.String r9 = "tab_page"
            X.C1862330yYx.LJZ(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
        L43:
            return
        L44:
            r4 = r5
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20308214dE.LIZ$0(X.14dE, android.view.View, java.lang.String):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0022 A[PHI: r6
      0x0022: PHI (r6v2 java.lang.String) = (r6v0 java.lang.String), (r6v3 java.lang.String) binds: [B:12:0x0020, B:10:0x001d] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZ$1(X.C20308214dE r10, android.view.View r11, java.lang.String r12) {
        /*
            java.lang.Object r0 = r10.l0
            com.ss.android.ugc.aweme.tako.botpage.components.botcenter.RecentlyAddCell r0 = (com.ss.android.ugc.aweme.tako.botpage.components.botcenter.RecentlyAddCell) r0
            X.0zJl r2 = r0.getItem()
            X.14Gk r2 = (X.C20237214Gk) r2
            if (r2 == 0) goto L40
            X.0yYx r3 = X.C1862330yYx.LIZ
            X.14Gm r0 = r2.LLILLJJLI
            r12 = 0
            if (r0 == 0) goto L41
            java.lang.String r4 = r0.LL
            java.lang.String r5 = r0.LLILLJJLI
        L17:
            java.lang.String r11 = ""
            if (r0 == 0) goto L1f
            java.lang.String r6 = r0.LLILLL
            if (r6 != 0) goto L22
        L1f:
            r6 = r11
            if (r0 == 0) goto L27
        L22:
            java.lang.String r0 = r0.LLILZ
            if (r0 == 0) goto L27
            r11 = r0
        L27:
            com.ss.android.ugc.aweme.tako.ccl.model.api.TakoBotInfo r0 = r2.LL
            long r0 = r0.botId
            java.lang.String r7 = java.lang.String.valueOf(r0)
            com.ss.android.ugc.aweme.tako.ccl.model.api.TakoBotInfo r0 = r2.LL
            java.lang.String r8 = r0.botName
            X.14Gm r0 = r2.LLILLJJLI
            if (r0 == 0) goto L39
            java.lang.String r12 = r0.LLILZIL
        L39:
            java.lang.String r9 = "top_cell"
            java.lang.String r10 = ""
            X.C1862330yYx.LJZ(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
        L40:
            return
        L41:
            r4 = r12
            r5 = r12
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20308214dE.LIZ$1(X.14dE, android.view.View, java.lang.String):void");
    }

    public static final void LIZ$2(C20308214dE c20308214dE, View view, String str) {
        ((InterfaceC20300314bx) c20308214dE.l0).LIZ(true);
    }
}
