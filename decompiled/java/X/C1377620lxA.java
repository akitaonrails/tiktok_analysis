package X;

import android.os.Bundle;
import com.bytedance.pipo.ttpay.recharge.share.QrCodeShareModel;
import com.ss.android.ugc.aweme.share.base.model.ShareContentType;
import com.ss.android.ugc.aweme.share.base.model.ShareModel;

/* JADX INFO: renamed from: X.0lxA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1377620lxA extends AbstractC1377630lxB {
    public final QrCodeShareModel LIZ;

    @Override // X.AbstractC1377630lxB
    public final String LIZ() {
        throw null;
    }

    @Override // X.AbstractC1377630lxB
    public final String LIZJ() {
        throw null;
    }

    @Override // X.AbstractC1377630lxB
    public final ShareContentType[] LIZLLL() {
        return new ShareContentType[]{ShareContentType.PHOTO};
    }

    @Override // X.AbstractC1377630lxB
    public final ShareModel LJ() {
        throw null;
    }

    @Override // X.AbstractC1377630lxB
    public final String LJI() {
        throw null;
    }

    @Override // X.AbstractC1377630lxB
    public final String LJII() {
        throw null;
    }

    @Override // X.AbstractC1377630lxB
    public final String LIZIZ() {
        return this.LIZ.qrCodeData.qrCodePath;
    }

    @Override // X.AbstractC1377630lxB
    public final Bundle LJFF() {
        Bundle bundle = new Bundle();
        C786410Ut5.LJJJI("extra_qr_code_path", this.LIZ.qrCodeData.qrCodePath, bundle);
        return bundle;
    }

    public C1377620lxA(QrCodeShareModel qrCodeShareModel) {
        this.LIZ = qrCodeShareModel;
    }
}
