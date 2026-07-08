package X;

import com.bytedance.ropa.encrypt.RopaEncrypt;

/* JADX INFO: renamed from: X.0WxF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C839950WxF implements C08GW {
    public static final C839950WxF LIZ = new C839950WxF();

    @Override // X.C08GW
    public final String decrypt(String str) {
        if (str != null && str.length() != 0) {
            return RopaEncrypt.getDecryptSeq(str).getData();
        }
        return null;
    }

    @Override // X.C08GW
    public final String LIZ(String str, boolean z) {
        if (str != null && str.length() != 0) {
            return RopaEncrypt.getEncryptSeq(str, true).getData();
        }
        return null;
    }
}
