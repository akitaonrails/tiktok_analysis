package X;

import com.ss.android.ugc.aweme.main.replace.ReplaceMusicWithMovieHelper;

/* JADX INFO: renamed from: X.14D8, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
@C09DV(c = "com.ss.android.ugc.aweme.main.replace.ReplaceMusicWithMovieHelper", f = "ReplaceMusicWithMovieHelper.kt", l = {415}, m = "strippingLoadingProgress")
public final class C14D8 extends AbstractC23140094w {
    public int LL;
    public long LLILLJJLI;
    public C12DN LLILLL;
    public /* synthetic */ Object LLILZ;
    public final /* synthetic */ ReplaceMusicWithMovieHelper LLILZIL;
    public int LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14D8(ReplaceMusicWithMovieHelper replaceMusicWithMovieHelper, InterfaceC1364105Vn<? super C14D8> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZIL = replaceMusicWithMovieHelper;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ReplaceMusicWithMovieHelper@8c47.strippingLoadingProgress$1");
        this.LLILZ = obj;
        this.LLILZLL |= Integer.MIN_VALUE;
        Object objLJ = this.LLILZIL.LJ(this);
        C1C7U.LIZIZ("ReplaceMusicWithMovieHelper@8c47.strippingLoadingProgress$1");
        return objLJ;
    }
}
