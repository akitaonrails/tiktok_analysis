package X;

import android.os.Bundle;
import com.ss.android.ugc.aweme.minis.page.main.morepanel.model.MinisSharePackageModel;
import com.ss.android.ugc.aweme.share.base.model.ShareContentType;
import com.ss.android.ugc.aweme.share.base.model.ShareModel;

/* JADX INFO: renamed from: X.0lyj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1378590lyj extends AbstractC1377610lx9 {
    public final MinisSharePackageModel LIZ;

    @Override // X.AbstractC1377630lxB
    public final String LIZJ() {
        return "minis";
    }

    @Override // X.AbstractC1377630lxB
    public final ShareContentType[] LIZLLL() {
        return new ShareContentType[]{ShareContentType.LINK};
    }

    @Override // X.AbstractC1377630lxB
    public final String LIZ() {
        return this.LIZ.shareDesc;
    }

    @Override // X.AbstractC1377630lxB
    public final String LIZIZ() {
        return this.LIZ.clientKey;
    }

    @Override // X.AbstractC1377630lxB
    public final Bundle LJFF() {
        return this.LIZ.extras;
    }

    @Override // X.AbstractC1377630lxB
    public final String LJI() {
        return this.LIZ.shareTitle;
    }

    @Override // X.AbstractC1377630lxB
    public final String LJII() {
        return this.LIZ.shareUrl;
    }

    @Override // X.AbstractC1377630lxB
    public final ShareModel LJ() {
        return this.LIZ;
    }

    public C1378590lyj(MinisSharePackageModel minisSharePackageModel) {
        this.LIZ = minisSharePackageModel;
    }
}
