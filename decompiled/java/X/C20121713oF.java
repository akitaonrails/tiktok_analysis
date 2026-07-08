package X;

import android.security.keystore.KeyGenParameterSpec;
import android.security.keystore.KeyPermanentlyInvalidatedException;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.agilelogger.ALog;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.Signature;
import java.security.UnrecoverableKeyException;
import java.security.cert.Certificate;
import java.security.spec.ECGenParameterSpec;
import java.util.UUID;
import kotlin.jvm.internal.AFwS212S0000000_23;

/* JADX INFO: renamed from: X.13oF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20121713oF {
    public static final Object LIZJ = new Object();
    public final String LIZ;
    public final C01GW LIZIZ = C452501pT.LIZIZ(AFwS212S0000000_23.get$arr$(138));

    public final KeyPair LJ() {
        KeyStore keyStore;
        Certificate certificate;
        Key key;
        try {
            KeyStore keyStore2 = (KeyStore) this.LIZIZ.getValue();
            key = keyStore2 != null ? keyStore2.getKey(this.LIZ, null) : null;
        } catch (KeyStoreException e) {
            TryCatchGuardChecker.doCheck(e);
        } catch (NoSuchAlgorithmException e2) {
            TryCatchGuardChecker.doCheck(e2);
        } catch (UnrecoverableKeyException e3) {
            TryCatchGuardChecker.doCheck(e3);
        }
        PrivateKey privateKey = key instanceof PrivateKey ? (PrivateKey) key : null;
        try {
            keyStore = (KeyStore) this.LIZIZ.getValue();
        } catch (KeyStoreException e4) {
            TryCatchGuardChecker.doCheck(e4);
        }
        PublicKey publicKey = (keyStore == null || (certificate = keyStore.getCertificate(this.LIZ)) == null) ? null : certificate.getPublicKey();
        if (privateKey == null || publicKey == null) {
            return null;
        }
        return new KeyPair(publicKey, privateKey);
    }

    public final KeyPair LIZ() {
        KeyPair keyPairLJ;
        synchronized (LIZJ) {
            try {
                keyPairLJ = LJ();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return keyPairLJ;
    }

    public final void LIZIZ() {
        synchronized (LIZJ) {
            try {
                try {
                    KeyStore keyStore = (KeyStore) this.LIZIZ.getValue();
                    if (keyStore != null) {
                        keyStore.deleteEntry(this.LIZ);
                    }
                } catch (KeyStoreException e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final KeyPair LIZJ() {
        KeyPair keyPairGenerateKeyPair = null;
        try {
            KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("EC", "AndroidKeyStore");
            try {
                keyPairGenerator.initialize(new KeyGenParameterSpec.Builder(this.LIZ, 4).setAlgorithmParameterSpec(new ECGenParameterSpec("secp256r1")).setDigests("SHA-256").setUserAuthenticationRequired(true).setInvalidatedByBiometricEnrollment(true).build());
                try {
                    keyPairGenerateKeyPair = keyPairGenerator.generateKeyPair();
                    return keyPairGenerateKeyPair;
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("kpg generateKeyPair ");
                    sbLIZ.append(e);
                    ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogD("BiometricDataStore", C2188811AlT.LIZIZ(sbLIZ));
                    return keyPairGenerateKeyPair;
                }
            } catch (Exception e2) {
                TryCatchGuardChecker.doCheck(e2);
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("kpg initialize ");
                sbLIZ2.append(e2);
                ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogD("BiometricDataStore", C2188811AlT.LIZIZ(sbLIZ2));
                return null;
            }
        } catch (NoSuchAlgorithmException e3) {
            TryCatchGuardChecker.doCheck(e3);
            return null;
        } catch (NoSuchProviderException e4) {
            TryCatchGuardChecker.doCheck(e4);
            return null;
        }
    }

    public final String LIZLLL() {
        String strLIZ;
        synchronized (LIZJ) {
            try {
                KeyPair keyPairLJ = LJ();
                if (keyPairLJ != null) {
                    try {
                        Signature.getInstance("SHA256withECDSA").initSign(keyPairLJ.getPrivate());
                        return C1715790ukb.LIZ(keyPairLJ);
                    } catch (KeyPermanentlyInvalidatedException e) {
                        TryCatchGuardChecker.doCheck(e);
                        ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogD("BiometricDataStore", "getBiometricDataTag KeyPermanentlyInvalidatedException");
                    } catch (InvalidKeyException e2) {
                        TryCatchGuardChecker.doCheck(e2);
                        ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogD("BiometricDataStore", "getBiometricDataTag InvalidKeyException");
                    } catch (NoSuchAlgorithmException e3) {
                        TryCatchGuardChecker.doCheck(e3);
                        ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogD("BiometricDataStore", "getBiometricDataTag NoSuchAlgorithmException");
                    }
                }
                KeyPair keyPairLIZJ = LIZJ();
                if (keyPairLIZJ == null) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(UUID.randomUUID());
                    sbLIZ.append('-');
                    sbLIZ.append(System.currentTimeMillis());
                    strLIZ = C13LN.LJZL(64, C2188811AlT.LIZIZ(sbLIZ));
                } else {
                    strLIZ = C1715790ukb.LIZ(keyPairLIZJ);
                }
                return strLIZ;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public C20121713oF(String str) {
        this.LIZ = str;
    }
}
