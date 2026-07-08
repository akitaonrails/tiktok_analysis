package X;

import Y.ARunnableS63S0300000_30;
import android.content.Context;
import com.ss.android.ugc.bytex.pthread.base.proxy.PThreadPoolExecutor;

/* JADX INFO: renamed from: X.09oe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C2485809oe implements InterfaceC20139113r3 {
    public final Context LIZ;

    public C2485809oe(Context context) {
        this.LIZ = C786410Ut5.N3(context);
    }

    @Override // X.InterfaceC20139113r3
    public final void LIZ(AbstractC20139013r2 abstractC20139013r2) {
        PThreadPoolExecutor pThreadPoolExecutorLIZ = C0WP7.LIZ("EmojiCompatInitializer");
        pThreadPoolExecutorLIZ.execute(new ARunnableS63S0300000_30(this, abstractC20139013r2, pThreadPoolExecutorLIZ, 0));
    }
}
