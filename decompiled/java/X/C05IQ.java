package X;

import com.ss.android.ugc.aweme.socialavatar.mixstudio.datasource.NetworkBackedBatchSocialAvatarService;

/* JADX INFO: renamed from: X.05IQ, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.socialavatar.mixstudio.datasource.NetworkBackedBatchSocialAvatarService", f = "NetworkBackedBatchSocialAvatarService.kt", l = {55}, m = "queryState")
public final class C05IQ extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ NetworkBackedBatchSocialAvatarService LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C05IQ(NetworkBackedBatchSocialAvatarService networkBackedBatchSocialAvatarService, InterfaceC1364105Vn<? super C05IQ> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = networkBackedBatchSocialAvatarService;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("NetworkBackedBatchSocialAvatarService@61a8.queryState$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLIZJ = this.LLILLJJLI.LIZJ(null, this);
        C1C7U.LIZIZ("NetworkBackedBatchSocialAvatarService@61a8.queryState$1");
        return objLIZJ;
    }
}
