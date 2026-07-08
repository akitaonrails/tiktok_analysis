package X;

import java.util.Map;
import kotlin.Pair;

/* JADX INFO: renamed from: X.092K, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C092K {
    public static final Map<Integer, String> LIZ = C2097608Jq.LJIIIIZZ(new Pair(0, "Success"), new Pair(1, "Cache is valid"), new Pair(-100, "No response"), new Pair(-101, "Parse eAppKey failed"), new Pair(-102, "Base64 failed"), new Pair(-103, "Verify signature failed"), new Pair(-104, "Invalid response"), new Pair(-105, "Keystore failed"), new Pair(-106, "RequestContext failed"), new Pair(-107, "Initialization failed"));
    public static final Map<Integer, String> LIZIZ = C2097608Jq.LJIIIIZZ(new Pair(0, "Success"), new Pair(-100, "Key validation failed"), new Pair(-101, "No response"));
    public static final Map<Integer, String> LIZJ = C2097608Jq.LJIIIIZZ(new Pair(1, "RSA"), new Pair(2, "DE"), new Pair(3, "PERSIST"), new Pair(-1, "Encryption failed"));
    public static final Map<Integer, String> LIZLLL = C2097608Jq.LJIIIIZZ(new Pair(0, "DE decrypt success"), new Pair(1, "RSA decrypt success"), new Pair(2, "DE and Fallback mismatch"), new Pair(3, "RSA and Fallback mismatch"), new Pair(-1, "Ciphertext format error"), new Pair(-2, "Decryption failed"));
    public static final Map<Integer, String> LJ = C2097608Jq.LJIIIIZZ(new Pair(0, "SymmetricEncryptor success"), new Pair(1, "AsymmetricEncryptorKey success"), new Pair(-1, "SymmetricEncryptor failed"), new Pair(-2, "AsymmetricEncryptorKey failed"));
}
