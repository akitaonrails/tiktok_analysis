package com.aweme.storage.m2;

import X.C01GW;
import X.C2276591E8z;
import X.C452501pT;
import X.C823050WQl;
import X.InterfaceC20596015iY;
import Y.ARunnableS7S1201000_31;
import android.content.Context;
import com.bytedance.keva.Keva;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.base.storage.M2StorageCleanInterface;
import com.ss.android.ugc.aweme.performanceopt.api.IStorageApi;
import kotlin.jvm.internal.AFwS221S0000000_31;

/* JADX INFO: loaded from: classes32.dex */
public final class M2StorageCleanImpl implements M2StorageCleanInterface {
    public final C01GW LIZ = C452501pT.LIZIZ(AFwS221S0000000_31.get$arr$(57));
    public final C01GW LIZIZ = C452501pT.LIZIZ(AFwS221S0000000_31.get$arr$(58));
    public volatile InterfaceC20596015iY LIZJ;

    public final Keva LJ() {
        return (Keva) this.LIZ.getValue();
    }

    public final IStorageApi LJFF() {
        return (IStorageApi) this.LIZIZ.getValue();
    }

    @Override // com.ss.android.ugc.aweme.base.storage.M2StorageCleanInterface
    public final void LIZ(C2276591E8z c2276591E8z) {
        this.LIZJ = c2276591E8z;
    }

    @Override // com.ss.android.ugc.aweme.base.storage.M2StorageCleanInterface
    public final void LIZIZ(Context context, String str) {
        SmartRouter.buildRoute(context, str).open();
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x014d  */
    @Override // com.ss.android.ugc.aweme.base.storage.M2StorageCleanInterface
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LIZJ(android.content.Context r18, int r19, java.lang.String r20) {
        /*
            Method dump skipped, instruction units count: 355
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.aweme.storage.m2.M2StorageCleanImpl.LIZJ(android.content.Context, int, java.lang.String):boolean");
    }

    public final void LIZLLL(Context context, int i, String str) {
        C823050WQl.LIZLLL().execute(new ARunnableS7S1201000_31(this, i, str, context, 0));
    }
}
