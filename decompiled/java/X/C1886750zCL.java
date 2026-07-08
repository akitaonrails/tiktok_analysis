package X;

import com.ss.android.ugc.aweme.social.sticker.repo.StoryCelebrationPosterJsonDataProperties;

/* JADX INFO: renamed from: X.0zCL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
@C09DV(c = "com.ss.android.ugc.aweme.social.sticker.repo.StoryCelebrationPosterJsonRepo", f = "StoryCelebrationPosterJsonRepo.kt", l = {52}, m = "getJsonFromDiskOrRequest")
public final class C1886750zCL extends AbstractC23140094w {
    public int LL;
    public Object LLILLJJLI;
    public Object LLILLL;
    public Object LLILZ;
    public StoryCelebrationPosterJsonDataProperties LLILZIL;
    public /* synthetic */ Object LLILZLL;
    public final /* synthetic */ C1886740zCK LLIZ;
    public int LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1886750zCL(C1886740zCK c1886740zCK, InterfaceC1364105Vn<? super C1886750zCL> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLIZ = c1886740zCK;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("StoryCelebrationPosterJsonRepo@92be.getJsonFromDiskOrRequest$1");
        this.LLILZLL = obj;
        this.LLIZLLLIL |= Integer.MIN_VALUE;
        Object objLIZ = this.LLIZ.LIZ(0, null, null, null, this);
        C1C7U.LIZIZ("StoryCelebrationPosterJsonRepo@92be.getJsonFromDiskOrRequest$1");
        return objLIZ;
    }
}
