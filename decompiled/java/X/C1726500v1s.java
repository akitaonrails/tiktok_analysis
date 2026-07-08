package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.pipo.security.ab.SignatureCertConfig;
import com.bytedance.pipo.security.certificate.interceptor.SignatureVerificationInterceptor;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS215S0000000_26;
import kotlin.jvm.internal.AwS570S0100000_26;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0v1s, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1726500v1s implements InterfaceC2174508fX {
    public final String LIZ;
    public final String LIZIZ;
    public final InterfaceC1726640v26 LIZJ;
    public final InterfaceC1726700v2C LIZLLL;
    public final SignatureCertConfig LJ;
    public final C01GW LJFF;
    public final C01GW LJI;
    public final C01GW LJII;

    public final Map<String, String> LIZLLL() {
        return C2097608Jq.LJIIIIZZ(new Pair("sign_source", this.LIZJ.LIZJ()), new Pair("sign_mode", "1"));
    }

    public final C099G LJ() {
        return C23250099c.LIZIZ(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C1726480v1q(this, null), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x009f  */
    @Override // X.InterfaceC2174508fX
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.Map LIZJ(java.lang.String r18) {
        /*
            Method dump skipped, instruction units count: 318
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1726500v1s.LIZJ(java.lang.String):java.util.Map");
    }

    @Override // X.InterfaceC2174508fX
    public final boolean LIZ(String str, String str2) {
        if (Intrinsics.LJFF(this.LIZ, str) && Intrinsics.LJFF(this.LIZIZ, str2)) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC2174508fX
    public final SignatureVerificationInterceptor LIZIZ(String str, InterfaceC1726580v20 interfaceC1726580v20, InterfaceC1726770v2J interfaceC1726770v2J) {
        return new SignatureVerificationInterceptor(str, (C1726520v1u) this.LJFF.getValue(), (C1726600v22) this.LJI.getValue(), (C1726570v1z) this.LJII.getValue(), interfaceC1726580v20, this.LJ, C0PEM.LIZJ, interfaceC1726770v2J, this.LIZJ.LIZJ());
    }

    public C1726500v1s(String str, String str2, InterfaceC1726640v26 interfaceC1726640v26, InterfaceC1726700v2C interfaceC1726700v2C) {
        SignatureCertConfig signatureCertConfig = C1726560v1y.LIZ;
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        SignatureCertConfig signatureCertConfig2 = C1726560v1y.LIZ;
        SignatureCertConfig signatureCertConfig3 = (SignatureCertConfig) settingsManagerLIZLLL.LJIIIIZZ("pipo_security_sdk_config", SignatureCertConfig.class, signatureCertConfig2);
        signatureCertConfig2 = signatureCertConfig3 != null ? signatureCertConfig3 : signatureCertConfig2;
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = interfaceC1726640v26;
        this.LIZLLL = interfaceC1726700v2C;
        this.LJ = signatureCertConfig2;
        this.LJFF = C452501pT.LIZIZ(new AwS570S0100000_26(this, 1181));
        this.LJI = C452501pT.LIZIZ(AFwS215S0000000_26.get$arr$(281));
        this.LJII = C452501pT.LIZIZ(AFwS215S0000000_26.get$arr$(282));
    }
}
