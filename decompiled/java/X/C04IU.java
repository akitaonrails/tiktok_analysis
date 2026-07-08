package X;

import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.BrickStyle;
import com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.GalleryReview;

/* JADX INFO: renamed from: X.04IU, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C04IU implements InterfaceC997603vC {
    public final GalleryReview LL;
    public final int LLILLJJLI = EnumC1752690vi7.REVIEW.getValue();

    @Override // X.InterfaceC997603vC
    public final BrickStyle getBrickStyle() {
        return null;
    }

    @Override // X.InterfaceC997603vC
    public final int getBrickName() {
        return this.LLILLJJLI;
    }

    public C04IU(GalleryReview galleryReview) {
        this.LL = galleryReview;
    }
}
