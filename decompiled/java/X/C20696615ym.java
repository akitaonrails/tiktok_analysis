package X;

import com.bytedance.bpea.cert.token.TokenCert;
import com.ss.android.ugc.aweme.qrcode.QRCodeFragment;

/* JADX INFO: renamed from: X.15ym, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20696615ym {
    public InterfaceC20696715yn LIZ;
    public C19EG LIZIZ;
    public String LIZJ = "";

    public final void LIZ() {
        C19514711Wn.LIZLLL(this.LIZIZ, TokenCert.with("bpea-qrcode_save_image")).LIZIZ("android.permission.WRITE_EXTERNAL_STORAGE").LIZJ(new C20748716Hd(this, 0));
    }

    public C20696615ym(QRCodeFragment qRCodeFragment, C19EG c19eg) {
        this.LIZ = qRCodeFragment;
        this.LIZIZ = c19eg;
    }
}
