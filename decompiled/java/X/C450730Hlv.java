package X;

import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.im.common.model.StickerBase;
import com.ss.android.ugc.aweme.im.common.model.StickerImage;
import com.ss.android.ugc.aweme.im.common.model.StickerItem;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Hlv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C450730Hlv extends C451030HmP {
    public final StickerItem LJIIIZ;

    @Override // X.C451030HmP
    public final String LIZ() {
        return C453560HqU.LIZIZ(this.LJIIIZ);
    }

    @Override // X.C451030HmP
    public final Integer LIZIZ() {
        StickerBase stickerBase = this.LJIIIZ.stickerBase;
        if (stickerBase != null) {
            return stickerBase.stickerType;
        }
        return null;
    }

    @Override // X.C451030HmP
    public final UrlModel LIZJ() {
        StickerImage stickerImage;
        StickerBase stickerBase = this.LJIIIZ.stickerBase;
        List<String> list = (stickerBase == null || (stickerImage = stickerBase.image) == null) ? null : stickerImage.urlList;
        UrlModel urlModel = new UrlModel();
        urlModel.setUrlList(list);
        return urlModel;
    }

    @Override // X.C451030HmP
    public final int hashCode() {
        return (super.hashCode() * 31) + this.LJIIIZ.hashCode();
    }

    public C450730Hlv(StickerItem stickerItem) {
        this.LJIIIZ = stickerItem;
    }

    @Override // X.C451030HmP
    public final boolean equals(Object obj) {
        if (!(obj instanceof C450730Hlv)) {
            return false;
        }
        return Intrinsics.LJFF(((C450730Hlv) obj).LJIIIZ, this.LJIIIZ);
    }
}
