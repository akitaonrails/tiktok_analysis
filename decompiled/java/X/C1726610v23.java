package X;

import com.bytedance.pipo.piposecuritysdk.Signature;

/* JADX INFO: renamed from: X.0v23, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1726610v23 implements InterfaceC1726620v24 {
    @Override // X.InterfaceC1726620v24
    public final C1726680v2A LIZ(String str, String str2) {
        String[] strArr = new String[1];
        String[] strArr2 = new String[1];
        String[] strArr3 = new String[1];
        if (new Signature().nativeGenerateKeyPairAndCSR(str, str2, strArr, strArr2, strArr3) == 0) {
            String str3 = strArr[0];
            String str4 = strArr2[0];
            String str5 = strArr3[0];
            if (str3 != null && str3.length() != 0 && str4 != null && str4.length() != 0 && str5 != null && str5.length() != 0) {
                C1726630v25 c1726630v25 = new C1726630v25(str3, str4, str5);
                return new C1726680v2A(c1726630v25.LIZIZ, c1726630v25.LIZ);
            }
        }
        throw new RuntimeException(EnumC1726510v1t.GENERATE_KEYPAIR_CSR_ERROR.getMessage());
    }

    @Override // X.InterfaceC1726620v24
    public final String LIZIZ(String str, byte[] bArr) {
        String str2;
        String[] strArr = new String[1];
        if (new Signature().nativeGenerateSignature(str, bArr, strArr) == 0 && (str2 = strArr[0]) != null) {
            return str2;
        }
        throw new RuntimeException(EnumC1726510v1t.GENERATE_SIGNATURE_ERROR.getMessage());
    }

    @Override // X.InterfaceC1726620v24
    public final boolean LIZJ(String str, String str2, byte[] bArr) {
        if (new Signature().nativeVerifySignature(str2, str, bArr) != 0) {
            return false;
        }
        return true;
    }
}
