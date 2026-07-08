package X;

import com.ss.android.ugc.aweme.socialavatar.mixstudio.datasource.NetworkBackedBatchSocialAvatarService;

/* JADX INFO: renamed from: X.05IR, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.socialavatar.mixstudio.datasource.NetworkBackedBatchSocialAvatarService", f = "NetworkBackedBatchSocialAvatarService.kt", l = {113}, m = "getState")
public final class C05IR extends AbstractC23140094w {
    public Object LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ NetworkBackedBatchSocialAvatarService LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C05IR(NetworkBackedBatchSocialAvatarService networkBackedBatchSocialAvatarService, InterfaceC1364105Vn<? super C05IR> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = networkBackedBatchSocialAvatarService;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("NetworkBackedBatchSocialAvatarService@61a8.getState$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLIZ = this.LLILLL.LIZ(null, this);
        C1C7U.LIZIZ("NetworkBackedBatchSocialAvatarService@61a8.getState$1");
        return objLIZ;
    }
}
