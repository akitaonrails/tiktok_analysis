package X;

import com.ss.android.ugc.aweme.socialavatar.mixstudio.datasource.MixStudioStatusRepoImpl;

/* JADX INFO: renamed from: X.0HSm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.socialavatar.mixstudio.datasource.MixStudioStatusRepoImpl", f = "MixStudioStatusRepoImpl.kt", l = {324, 336}, m = "startAliveTask")
public final class C441380HSm extends AbstractC23140094w {
    public Object LL;
    public Object LLILLJJLI;
    public C441470HSv LLILLL;
    public C440830HQj LLILZ;
    public int LLILZIL;
    public int LLILZLL;
    public /* synthetic */ Object LLIZ;
    public final /* synthetic */ MixStudioStatusRepoImpl LLIZLLLIL;
    public int LLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C441380HSm(MixStudioStatusRepoImpl mixStudioStatusRepoImpl, InterfaceC1364105Vn<? super C441380HSm> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLIZLLLIL = mixStudioStatusRepoImpl;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MixStudioStatusRepoImpl@50f0.startAliveTask$1");
        this.LLIZ = obj;
        this.LLJ |= Integer.MIN_VALUE;
        Object objLIZIZ = this.LLIZLLLIL.LIZIZ(null, null, 0, null, null, 0, this);
        C1C7U.LIZIZ("MixStudioStatusRepoImpl@50f0.startAliveTask$1");
        return objLIZIZ;
    }
}
