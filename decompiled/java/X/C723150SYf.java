package X;

import android.app.Activity;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import java.util.concurrent.ExecutionException;

/* JADX INFO: renamed from: X.0SYf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C723150SYf extends AbstractC728570Shz {
    public Aweme LLILZ;
    public int LLILZIL;
    public final Activity LLILZLL;

    /* JADX WARN: Removed duplicated region for block: B:13:0x003d  */
    @Override // X.C1260870iur, X.InterfaceC1526205yG
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onSuccess() {
        /*
            r4 = this;
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r4.LLILZ
            if (r0 == 0) goto L3c
            com.ss.android.ugc.aweme.feed.model.AwemeStatus r1 = com.ss.android.ugc.aweme.feed.model.AwemeExtKt.getStatusSafety(r0)
            int r0 = r4.LLILZIL
            r1.setPrivateStatus(r0)
            int r1 = r4.LLILZIL
            if (r1 == 0) goto L3d
            r3 = 1
            if (r1 == r3) goto L19
            r0 = 2
            if (r1 != r0) goto L3d
            r3 = 11
        L19:
            com.ss.android.ugc.aweme.framework.services.ServiceManager r1 = com.ss.android.ugc.aweme.framework.services.ServiceManager.get()
            java.lang.Class<com.ss.android.ugc.aweme.awemeservice.api.IAwemeService> r0 = com.ss.android.ugc.aweme.awemeservice.api.IAwemeService.class
            java.lang.Object r1 = r1.getService(r0)
            com.ss.android.ugc.aweme.awemeservice.api.IAwemeService r1 = (com.ss.android.ugc.aweme.awemeservice.api.IAwemeService) r1
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r4.LLILZ
            r1.LLILLL(r0)
            X.0RWb r2 = new X.0RWb
            T extends X.0QAu r0 = r4.LL
            java.lang.Object r1 = r0.getData()
            com.ss.android.ugc.aweme.feed.model.PrivateUrlModel r1 = (com.ss.android.ugc.aweme.feed.model.PrivateUrlModel) r1
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r4.LLILZ
            r2.<init>(r3, r0, r1)
            X.C1440005kM.LIZ(r2)
        L3c:
            return
        L3d:
            r3 = 0
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C723150SYf.onSuccess():void");
    }

    public C723150SYf(Activity activity) {
        this.LLILZLL = activity;
    }

    public final void LJIILL(Aweme aweme) {
        this.LLILZ = aweme;
        if (AwemeExtKt.getStatusSafety(aweme) == null) {
            return;
        }
        AwemeExtKt.getStatusSafety(this.LLILZ).getPrivateStatus();
        this.LLILZIL = 0;
    }

    @Override // X.C1260870iur, X.InterfaceC1526205yG
    public final void onFailed(Exception exc) {
        boolean z = exc instanceof ExecutionException;
        Exception cause = exc;
        if (z) {
            cause = exc.getCause();
        }
        if (cause instanceof C0XIR) {
            C0XIR c0xir = (C0XIR) cause;
            if (!TextUtils.isEmpty(c0xir.getErrorMsg())) {
                C1389890mGx c1389890mGx = new C1389890mGx(this.LLILZLL);
                c1389890mGx.LJIIJ(c0xir.getErrorMsg());
                c1389890mGx.LJIIJJI();
            }
        }
    }
}
