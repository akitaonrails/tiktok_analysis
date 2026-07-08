package X;

import com.bytedance.pipo.security.ab.SignatureCertConfig;
import com.bytedance.pipo.security.certificate.api.CertApi;
import com.bytedance.pipo.security.certificate.api.CertificateRequest;
import com.bytedance.pipo.security.certificate.api.CertificateResponse;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0v1u, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1726520v1u implements InterfaceC1726670v29 {
    public final InterfaceC1726620v24 LIZ;
    public final InterfaceC1726650v27 LIZIZ;
    public final InterfaceC1726640v26 LIZJ;
    public final CertApi LIZLLL;
    public final String LJ;
    public final String LJFF;
    public final SignatureCertConfig LJI;
    public final InterfaceC1726660v28 LJII;

    public final synchronized void LIZIZ() {
        this.LIZIZ.LIZIZ(this.LJ, this.LJFF);
    }

    public final C1726590v21 LIZLLL() throws Exception {
        C1726590v21 c1726590v21LIZ = this.LIZIZ.LIZ(this.LJ, this.LJFF);
        if (c1726590v21LIZ == null) {
            throw new Exception(EnumC1726510v1t.GET_CERT_FROM_CACHE_ERROR.getMessage());
        }
        if (c1726590v21LIZ.LJ <= System.currentTimeMillis()) {
            throw new Exception(EnumC1726510v1t.GET_CERT_FROM_CACHE_ERROR.getMessage());
        }
        return c1726590v21LIZ;
    }

    public final C1726590v21 LJ() {
        Object c098200Yq;
        C1726590v21 c1726590v21LIZ = this.LIZIZ.LIZ(this.LJ, this.LJFF);
        if (c1726590v21LIZ != null && c1726590v21LIZ.LJ > System.currentTimeMillis() + ((long) (this.LJI.expireOptTime * 24 * 60 * 60 * LSPassThroughRecordSizeConfig.DEFAULT))) {
            return c1726590v21LIZ;
        }
        C1726450v1n.LIZIZ.putAll(C2097908Jt.LIZJ(new Pair("sign_source", this.LIZJ.LIZJ())));
        this.LJII.LIZ();
        C238400w2 c238400w2 = new C238400w2();
        c238400w2.element = -1L;
        try {
            long jCurrentTimeMillis = System.currentTimeMillis();
            c098200Yq = LIZJ(0);
            c238400w2.element = System.currentTimeMillis() - jCurrentTimeMillis;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m8isSuccessimpl(c098200Yq)) {
            this.LJII.LIZIZ(c238400w2.element);
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            this.LJII.LIZJ(thM5exceptionOrNullimpl);
        }
        C155000ia.LIZIZ(c098200Yq);
        return (C1726590v21) c098200Yq;
    }

    public final C1726590v21 LIZJ(int i) throws Exception {
        String strLIZJ;
        CertificateResponse certificateResponse;
        C1726680v2A c1726680v2ALIZ = this.LIZ.LIZ(this.LJ, this.LJFF);
        String strLIZLLL = this.LIZJ.LIZLLL();
        String strLIZIZ = this.LIZJ.LIZIZ();
        if (this.LJI.enableSignFailureFallbackHeader) {
            strLIZJ = this.LIZJ.LIZJ();
        } else {
            strLIZJ = null;
        }
        String strLIZ = C1716300ulQ.LIZ();
        if (strLIZLLL == null) {
            if (strLIZIZ != null) {
                certificateResponse = this.LIZLLL.requestCertificate(strLIZJ, strLIZIZ, strLIZ, new CertificateRequest(c1726680v2ALIZ.LIZIZ, null, this.LJFF, this.LJ)).execute().LIZIZ;
            } else {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(EnumC1726510v1t.INIT_CERT_ERROR.getMessage());
                sbLIZ.append(": Both nonce & session id are null");
                throw new Exception(C2188811AlT.LIZIZ(sbLIZ));
            }
        } else {
            certificateResponse = this.LIZLLL.requestCertificate(strLIZJ, null, strLIZ, new CertificateRequest(c1726680v2ALIZ.LIZIZ, strLIZLLL, this.LJFF, this.LJ)).execute().LIZIZ;
        }
        if (Intrinsics.LJFF(certificateResponse.errorCode, CardStruct.IStatusCode.DEFAULT)) {
            C1726590v21 c1726590v21 = new C1726590v21(this.LJ, this.LJFF, c1726680v2ALIZ.LIZ, certificateResponse.certPem, certificateResponse.expiryTime);
            this.LIZIZ.LIZJ(c1726590v21);
            return c1726590v21;
        }
        int i2 = i + 1;
        if (i2 <= this.LJI.retryConfig.retryTimes) {
            Thread.sleep(r1.retryInterval);
            return LIZJ(i2);
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(EnumC1726510v1t.INIT_CERT_ERROR.getMessage());
        sbLIZ2.append(":err_code=");
        sbLIZ2.append(certificateResponse.errorCode);
        sbLIZ2.append(",retry_cnt=");
        sbLIZ2.append(i);
        throw new Exception(C2188811AlT.LIZIZ(sbLIZ2));
    }

    @Override // X.InterfaceC1726670v29
    public final synchronized C1726590v21 LIZ(boolean z, boolean z2) {
        if (z2) {
            LIZIZ();
        }
        if (!z && !z2) {
            return LIZLLL();
        }
        return LJ();
    }

    public C1726520v1u(C1726610v23 c1726610v23, C1726550v1x c1726550v1x, InterfaceC1726640v26 interfaceC1726640v26, CertApi certApi, String str, String str2, SignatureCertConfig signatureCertConfig) {
        InterfaceC1726660v28 interfaceC1726660v28 = new InterfaceC1726660v28() { // from class: X.0v1o
            @Override // X.InterfaceC1726660v28
            public final void LIZ() {
                C1726450v1n.LIZ.LIZ();
            }

            @Override // X.InterfaceC1726660v28
            public final void LIZIZ(long j) {
                C1726450v1n.LIZ.LIZIZ(j);
            }

            @Override // X.InterfaceC1726660v28
            public final void LIZJ(Throwable th) {
                C1726450v1n.LIZ.LIZJ(th);
            }
        };
        this.LIZ = c1726610v23;
        this.LIZIZ = c1726550v1x;
        this.LIZJ = interfaceC1726640v26;
        this.LIZLLL = certApi;
        this.LJ = str;
        this.LJFF = str2;
        this.LJI = signatureCertConfig;
        this.LJII = interfaceC1726660v28;
    }
}
