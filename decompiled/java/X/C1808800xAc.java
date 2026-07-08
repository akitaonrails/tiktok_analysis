package X;

/* JADX INFO: renamed from: X.0xAc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.sticker.api.provider.StickerApiProviders$delegatedPhoto2StickerUploadService$2$1", f = "StickerDFApiProviders.kt", l = {175}, m = "uploadVideoSticker-eH_QyT8")
public final class C1808800xAc extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C1808790xAb LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1808800xAc(C1808790xAb c1808790xAb, InterfaceC1364105Vn<? super C1808800xAc> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = c1808790xAb;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("StickerApiProviders@6103.delegatedPhoto2StickerUploadService$2$1$uploadVideoSticker$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objMo71uploadVideoStickereH_QyT8 = this.LLILLJJLI.mo71uploadVideoStickereH_QyT8(false, null, 0, 0, null, null, null, this);
        if (objMo71uploadVideoStickereH_QyT8 == C099R.LJFF()) {
            C1C7U.LIZIZ("StickerApiProviders@6103.delegatedPhoto2StickerUploadService$2$1$uploadVideoSticker$1");
            return objMo71uploadVideoStickereH_QyT8;
        }
        C189200o6 c189200o6M1boximpl = C189200o6.m1boximpl(objMo71uploadVideoStickereH_QyT8);
        C1C7U.LIZIZ("StickerApiProviders@6103.delegatedPhoto2StickerUploadService$2$1$uploadVideoSticker$1");
        return c189200o6M1boximpl;
    }
}
