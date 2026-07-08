package X;

import com.ss.android.ugc.aweme.ecommerce.search.vision.record.model.EcPhotoSearchAlbumVM;

/* JADX INFO: renamed from: X.0kBG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.search.vision.record.model.EcPhotoSearchAlbumVM", f = "EcPhotoSearchAlbumVM.kt", l = {87}, m = "fetchAlbum")
public final class C1309480kBG extends AbstractC23140094w {
    public Object LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ EcPhotoSearchAlbumVM LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1309480kBG(EcPhotoSearchAlbumVM ecPhotoSearchAlbumVM, InterfaceC1364105Vn<? super C1309480kBG> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = ecPhotoSearchAlbumVM;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("EcPhotoSearchAlbumVM@fd2.fetchAlbum$2");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objVQ2 = this.LLILLL.vQ2(null, this);
        C1C7U.LIZIZ("EcPhotoSearchAlbumVM@fd2.fetchAlbum$2");
        return objVQ2;
    }
}
