package X;

import com.tiktok.strategycenterengineimpl.storagecenter.model.TTMPackageModel;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1Bkj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2213831Bkj extends AbstractC2213721BkY {
    public JSONObject LJFF;

    @Override // X.AbstractC2213721BkY
    public final void LIZLLL(long j) {
    }

    @Override // X.AbstractC2213721BkY
    public final EnumC2213841Bkk LIZIZ() {
        return EnumC2213841Bkk.TTM_TARS_PACKAGE;
    }

    @Override // X.AbstractC2213721BkY
    public final boolean LIZ(TTMPackageModel tTMPackageModel, C2213881Bko c2213881Bko) {
        if (tTMPackageModel.getContent() != null) {
            this.LJFF = new JSONObject((String) tTMPackageModel.getContent());
            tTMPackageModel.setContentNativeAddress(1L);
        }
        return super.LIZ(tTMPackageModel, c2213881Bko);
    }
}
