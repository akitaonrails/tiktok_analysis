package X;

/* JADX INFO: renamed from: X.0nMm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
@C09DV(c = "com.ss.android.ugc.tools.infosticker.repository.internal.repository.InfoStickerRepositoryExt", f = "InfoStickerCollectRepository.kt", l = {158}, m = "getCustomStickerUploadToken-gIAlu-s")
public final class C1431940nMm extends AbstractC23140094w {
    public Object LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C1431920nMk LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1431940nMm(C1431920nMk c1431920nMk, InterfaceC1364105Vn<? super C1431940nMm> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = c1431920nMk;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("InfoStickerRepositoryExt@4b12.getCustomStickerUploadToken$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLIZJ = this.LLILLL.LIZJ(null, this);
        if (objLIZJ == C099R.LJFF()) {
            C1C7U.LIZIZ("InfoStickerRepositoryExt@4b12.getCustomStickerUploadToken$1");
            return objLIZJ;
        }
        C189200o6 c189200o6M1boximpl = C189200o6.m1boximpl(objLIZJ);
        C1C7U.LIZIZ("InfoStickerRepositoryExt@4b12.getCustomStickerUploadToken$1");
        return c189200o6M1boximpl;
    }
}
