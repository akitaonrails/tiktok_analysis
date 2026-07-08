package X;

import com.ss.android.ugc.aweme.socialavatar.mixstudio.datasource.ManifestAndImageCachingElementsRepository;

/* JADX INFO: renamed from: X.08e0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.socialavatar.mixstudio.datasource.ManifestAndImageCachingElementsRepository", f = "ManifestAndImageCachingElementsRepository.kt", l = {35}, m = "initialLoad")
public final class C2165008e0 extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ ManifestAndImageCachingElementsRepository LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2165008e0(ManifestAndImageCachingElementsRepository manifestAndImageCachingElementsRepository, InterfaceC1364105Vn<? super C2165008e0> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = manifestAndImageCachingElementsRepository;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ManifestAndImageCachingElementsRepository@cf7b.initialLoad$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLIZIZ = this.LLILLJJLI.LIZIZ(this);
        C1C7U.LIZIZ("ManifestAndImageCachingElementsRepository@cf7b.initialLoad$1");
        return objLIZIZ;
    }
}
