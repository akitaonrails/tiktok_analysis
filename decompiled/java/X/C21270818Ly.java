package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;

/* JADX INFO: renamed from: X.18Ly, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.photo.ECDynamicPhotoStickerManager", f = "ECDynamicPhotoStickerManager.kt", l = {67}, m = "fetchDynamicPhotoStickerList")
public final class C21270818Ly extends AbstractC23140094w {
    public Aweme LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C21270718Lx LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21270818Ly(C21270718Lx c21270718Lx, InterfaceC1364105Vn<? super C21270818Ly> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = c21270718Lx;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ECDynamicPhotoStickerManager@bdef.fetchDynamicPhotoStickerList$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLJ = this.LLILLL.LJ(null, this);
        C1C7U.LIZIZ("ECDynamicPhotoStickerManager@bdef.fetchDynamicPhotoStickerList$1");
        return objLJ;
    }
}
