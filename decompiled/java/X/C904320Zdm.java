package X;

import android.app.Activity;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.im.sdk.chatdetail.refactor.viewmodel.BaseActionViewModel;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0Zdm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C904320Zdm extends C09AY implements Function2<BaseActionViewModel<?>, Activity, Unit> {
    public final /* synthetic */ AtomicReference<IMUser> LL;
    public final /* synthetic */ String LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C904320Zdm(AtomicReference<IMUser> atomicReference, String str) {
        super(2);
        this.LL = atomicReference;
        this.LLILLJJLI = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0032 A[PHI: r3
      0x0032: PHI (r3v3 java.lang.String) = (r3v0 java.lang.String), (r3v4 java.lang.String) binds: [B:13:0x0030, B:11:0x002d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0038 A[PHI: r3
      0x0038: PHI (r3v2 java.lang.String) = (r3v0 java.lang.String), (r3v3 java.lang.String) binds: [B:13:0x0030, B:15:0x0036] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // kotlin.jvm.functions.Function2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final kotlin.Unit invoke(com.ss.android.ugc.aweme.im.sdk.chatdetail.refactor.viewmodel.BaseActionViewModel<?> r10, android.app.Activity r11) {
        /*
            r9 = this;
            android.app.Activity r11 = (android.app.Activity) r11
            java.util.concurrent.atomic.AtomicReference<com.ss.android.ugc.aweme.im.contacts.api.model.IMUser> r0 = r9.LL
            java.lang.Object r8 = r0.get()
            com.ss.android.ugc.aweme.im.contacts.api.model.IMUser r8 = (com.ss.android.ugc.aweme.im.contacts.api.model.IMUser) r8
            java.lang.String r7 = r9.LLILLJJLI
            boolean r0 = r11 instanceof X.C19EG
            if (r0 == 0) goto L5b
            X.19EG r11 = (X.C19EG) r11
            if (r11 == 0) goto L5b
            X.0Zdo r0 = com.ss.android.ugc.aweme.im.saas.host.api.favorite.IMFavoriteBridgeApi.LIZ
            r0.getClass()
            X.01GW<com.ss.android.ugc.aweme.im.saas.host.api.favorite.IMFavoriteBridgeApi> r0 = X.C904340Zdo.LIZIZ
            java.lang.Object r6 = r0.getValue()
            com.ss.android.ugc.aweme.im.saas.host.api.favorite.IMFavoriteBridgeApi r6 = (com.ss.android.ugc.aweme.im.saas.host.api.favorite.IMFavoriteBridgeApi) r6
            if (r6 == 0) goto L5b
            com.ss.android.ugc.aweme.favorites.business.collaboration.CollaborativeUserInfo r5 = new com.ss.android.ugc.aweme.favorites.business.collaboration.CollaborativeUserInfo
            java.lang.String r4 = ""
            if (r8 == 0) goto L2f
            java.lang.String r3 = r8.getUid()
            if (r3 != 0) goto L32
        L2f:
            r3 = r4
            if (r8 == 0) goto L38
        L32:
            java.lang.String r2 = r8.getNickName()
            if (r2 != 0) goto L39
        L38:
            r2 = r4
        L39:
            r1 = 0
            if (r8 == 0) goto L55
            com.ss.android.ugc.aweme.base.model.UrlModel r0 = r8.getAvatarThumb()
            if (r0 == 0) goto L51
            java.util.List r0 = r0.getUrlList()
            if (r0 == 0) goto L51
            java.lang.Object r0 = X.C13LP.LJJJLZIJ(r1, r0)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L51
            r4 = r0
        L51:
            int r1 = r8.getFollowStatus()
        L55:
            r5.<init>(r3, r2, r4, r1)
            r6.LIZJ(r11, r5, r7)
        L5b:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C904320Zdm.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
