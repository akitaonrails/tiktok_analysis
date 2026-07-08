package X;

import android.security.keystore.KeyGenParameterSpec;
import android.util.Base64;
import java.io.IOException;
import java.nio.charset.Charset;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.UnrecoverableKeyException;
import java.security.cert.CertificateException;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.GCMParameterSpec;

/* JADX INFO: renamed from: X.14BT, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C14BT implements InterfaceC1726700v2C {
    @Override // X.InterfaceC1726700v2C
    public final String decrypt(String str) throws Exception {
        byte[] bArrDecode = Base64.decode(str, 0);
        byte[] bArr = new byte[12];
        int length = bArrDecode.length - 12;
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArrDecode, 0, bArr, 0, 12);
        System.arraycopy(bArrDecode, 12, bArr2, 0, length);
        Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
        GCMParameterSpec gCMParameterSpec = new GCMParameterSpec(128, bArr);
        KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
        keyStore.load(null);
        Key key = keyStore.getKey("pipo_key23", null);
        if (key != null) {
            cipher.init(2, key, gCMParameterSpec);
            return new String(cipher.doFinal(bArr2), Charset.forName("UTF-8"));
        }
        throw new Exception() { // from class: X.0v2D
        };
    }

    @Override // X.InterfaceC1726700v2C
    public final String encrypt(String str) throws BadPaddingException, NoSuchPaddingException, IllegalBlockSizeException, NoSuchAlgorithmException, UnrecoverableKeyException, IOException, InvalidKeyException, KeyStoreException, CertificateException, NoSuchProviderException, InvalidAlgorithmParameterException {
        Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
        KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
        keyStore.load(null);
        Key key = keyStore.getKey("pipo_key23", null);
        if (key == null) {
            KeyGenerator keyGenerator = KeyGenerator.getInstance("AES", "AndroidKeyStore");
            keyGenerator.init(new KeyGenParameterSpec.Builder("pipo_key23", 3).setBlockModes("GCM").setEncryptionPaddings("NoPadding").setKeySize(256).build());
            key = keyGenerator.generateKey();
        }
        cipher.init(1, key);
        byte[] iv = cipher.getIV();
        byte[] bArrDoFinal = cipher.doFinal(str.getBytes(Charset.forName("UTF-8")));
        byte[] bArr = new byte[iv.length + bArrDoFinal.length];
        System.arraycopy(iv, 0, bArr, 0, iv.length);
        System.arraycopy(bArrDoFinal, 0, bArr, iv.length, bArrDoFinal.length);
        return Base64.encodeToString(bArr, 0);
    }
}
