package X;

import android.security.keystore.KeyGenParameterSpec;
import android.util.Base64;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.SecureRandom;
import java.security.UnrecoverableKeyException;
import java.security.cert.CertificateException;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.GCMParameterSpec;
import kotlin.Unit;
import kotlin.text.Charsets;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.14BR, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C14BR {
    public static void LIZLLL() {
        try {
            KeyGenerator keyGenerator = KeyGenerator.getInstance("AES", "AndroidKeyStore");
            keyGenerator.init(new KeyGenParameterSpec.Builder("pns_sym_key", 3).setBlockModes("GCM").setEncryptionPaddings("NoPadding").setRandomizedEncryptionRequired(false).build());
            keyGenerator.generateKey();
        } catch (InvalidAlgorithmParameterException e) {
            TryCatchGuardChecker.doCheck(e);
        } catch (NoSuchAlgorithmException e2) {
            TryCatchGuardChecker.doCheck(e2);
        } catch (NoSuchProviderException e3) {
            TryCatchGuardChecker.doCheck(e3);
        }
    }

    public C14BR() throws NoSuchAlgorithmException, IOException, KeyStoreException, CertificateException {
        KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
        keyStore.load(null);
        if (!keyStore.containsAlias("pns_sym_key")) {
            LIZLLL();
            return;
        }
        try {
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        if (keyStore.getEntry("pns_sym_key", null) instanceof KeyStore.SecretKeyEntry) {
            return;
        }
        keyStore.deleteEntry("pns_sym_key");
        LIZLLL();
    }

    public static final String LIZ(String str) {
        try {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(Base64.decode(str, 2));
            byte[] bArr = new byte[byteBufferWrap.getInt()];
            byteBufferWrap.get(bArr);
            byte[] bArr2 = new byte[byteBufferWrap.remaining()];
            byteBufferWrap.get(bArr2);
            Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
            KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
            keyStore.load(null);
            Key key = keyStore.getKey("pns_sym_key", null);
            if (key == null) {
                LIZLLL();
                key = keyStore.getKey("pns_sym_key", null);
            }
            cipher.init(2, key, new GCMParameterSpec(128, bArr));
            byte[] bArrDoFinal = cipher.doFinal(bArr2);
            if (bArrDoFinal == null) {
                return null;
            }
            return new String(bArrDoFinal, Charsets.UTF_8);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("error", Unit.LIZ);
                jSONObject.put("type", "decryptString");
            } catch (JSONException e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
            C793770VBv.LJII("tt_hybrid_commerce_autofill_modification", jSONObject, null, null);
            return null;
        }
    }

    public static byte[] LIZIZ(byte[] bArr) throws BadPaddingException, NoSuchPaddingException, IllegalBlockSizeException, NoSuchAlgorithmException, UnrecoverableKeyException, IOException, InvalidKeyException, KeyStoreException, CertificateException, InvalidAlgorithmParameterException {
        Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
        byte[] bArr2 = new byte[12];
        SecureRandom.getInstance("SHA1PRNG").nextBytes(bArr2);
        KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
        keyStore.load(null);
        Key key = keyStore.getKey("pns_sym_key", null);
        if (key == null) {
            LIZLLL();
            key = keyStore.getKey("pns_sym_key", null);
        }
        cipher.init(1, key, new GCMParameterSpec(128, bArr2));
        byte[] bArrDoFinal = cipher.doFinal(bArr);
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(bArrDoFinal.length + 16);
        byteBufferAllocate.putInt(12);
        byteBufferAllocate.put(bArr2);
        byteBufferAllocate.put(bArrDoFinal);
        return byteBufferAllocate.array();
    }

    public static final String LIZJ(String str) {
        try {
            return Base64.encodeToString(LIZIZ(str.getBytes(Charsets.UTF_8)), 0);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("error", Unit.LIZ);
                jSONObject.put("type", "encryptString");
            } catch (JSONException e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
            C793770VBv.LJII("tt_hybrid_commerce_autofill_modification", jSONObject, null, null);
            return null;
        }
    }
}
