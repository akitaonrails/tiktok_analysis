package X;

import com.ss.android.ugc.aweme.socialavatar.mixstudio.datasource.NetworkBackedBatchSocialAvatarService;

/* JADX INFO: renamed from: X.05Ms, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.socialavatar.mixstudio.datasource.NetworkBackedBatchSocialAvatarService", f = "NetworkBackedBatchSocialAvatarService.kt", l = {145, 167}, m = "queryState")
public final class C1341205Ms extends AbstractC23140094w {
    public Object LL;
    public Object LLILLJJLI;
    public Object LLILLL;
    public Object LLILZ;
    public Object LLILZIL;
    public Object LLILZLL;
    public Object LLIZ;
    public Object LLIZLLLIL;
    public Object LLJ;
    public Object LLJI;
    public Object LLJIJIL;
    public /* synthetic */ Object LLJILJIL;
    public final /* synthetic */ NetworkBackedBatchSocialAvatarService LLJILJILJ;
    public int LLJILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1341205Ms(NetworkBackedBatchSocialAvatarService networkBackedBatchSocialAvatarService, InterfaceC1364105Vn<? super C1341205Ms> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLJILJILJ = networkBackedBatchSocialAvatarService;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("NetworkBackedBatchSocialAvatarService@61a8.queryState$3");
        this.LLJILJIL = obj;
        this.LLJILLL |= Integer.MIN_VALUE;
        Object objLIZLLL = this.LLJILJILJ.LIZLLL(null, this);
        C1C7U.LIZIZ("NetworkBackedBatchSocialAvatarService@61a8.queryState$3");
        return objLIZLLL;
    }
}
