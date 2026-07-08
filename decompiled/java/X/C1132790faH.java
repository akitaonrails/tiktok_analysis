package X;

/* JADX INFO: renamed from: X.0faH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
@C09DV(c = "com.bytedance.android.livesdk.gallery.repo.GiftGalleryRepository", f = "GiftGalleryRepository.kt", l = {25}, m = "getGiftGallery")
public final class C1132790faH extends AbstractC23140094w {
    public long LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C1132780faG LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1132790faH(C1132780faG c1132780faG, InterfaceC1364105Vn<? super C1132790faH> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = c1132780faG;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("GiftGalleryRepository@c24a.getGiftGallery$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLIZ = this.LLILLL.LIZ(0L, null, 0L, 0L, 0L, this);
        C1C7U.LIZIZ("GiftGalleryRepository@c24a.getGiftGallery$1");
        return objLIZ;
    }
}
