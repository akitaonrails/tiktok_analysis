package X;

import com.ss.android.ugc.aweme.services.uikit.CreativeToast;
import com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder;

/* JADX INFO: renamed from: X.0mHm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1390400mHm implements CreativeToast.OnShowListener {
    public final /* synthetic */ CreativeToastBuilder LIZ;
    public final /* synthetic */ int LIZIZ;
    public final /* synthetic */ C1390360mHi LIZJ;

    /* JADX WARN: Removed duplicated region for block: B:19:0x004e  */
    @Override // com.ss.android.ugc.aweme.services.uikit.CreativeToast.OnShowListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onShow(com.ss.android.ugc.aweme.services.uikit.CreativeToast r9) {
        /*
            r8 = this;
            com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder r0 = r8.LIZ
            com.ss.android.ugc.aweme.services.uikit.CreativeToastConfig r0 = r0.getConfig()
            com.ss.android.ugc.aweme.services.uikit.CreativeToast$OnShowListener r0 = r0.showListener
            if (r0 == 0) goto Ld
            r0.onShow(r9)
        Ld:
            X.111z r7 = X.C194353111z.LIZ
            int r6 = r8.LIZIZ
            X.0MVY r5 = X.C0MVY.SHOW
            com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder r0 = r8.LIZ
            com.ss.android.ugc.aweme.services.uikit.CreativeToastConfig r0 = r0.getConfig()
            java.lang.Long r0 = r0.duration
            if (r0 == 0) goto L50
            long r3 = r0.longValue()
        L21:
            com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder r0 = r8.LIZ
            com.ss.android.ugc.aweme.services.uikit.CreativeToastConfig r0 = r0.getConfig()
            java.lang.String r0 = r0.message
            if (r0 != 0) goto L47
            com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder r0 = r8.LIZ
            com.ss.android.ugc.aweme.services.uikit.CreativeToastConfig r0 = r0.getConfig()
            java.lang.Integer r0 = r0.messageRes
            if (r0 == 0) goto L4e
            X.0mHi r2 = r8.LIZJ
            int r1 = r0.intValue()
            android.content.Context r0 = r2.LJ
            if (r0 != 0) goto L43
            android.content.Context r0 = r2.LIZLLL
            if (r0 == 0) goto L4e
        L43:
            java.lang.String r0 = r0.getString(r1)
        L47:
            r7.getClass()
            X.C194353111z.LJFF(r6, r5, r3, r0)
            return
        L4e:
            r0 = 0
            goto L47
        L50:
            r3 = 3000(0xbb8, double:1.482E-320)
            goto L21
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1390400mHm.onShow(com.ss.android.ugc.aweme.services.uikit.CreativeToast):void");
    }

    public C1390400mHm(int i, CreativeToastBuilder creativeToastBuilder, C1390360mHi c1390360mHi) {
        this.LIZ = creativeToastBuilder;
        this.LIZIZ = i;
        this.LIZJ = c1390360mHi;
    }
}
