package X;

import android.security.identity.IdentityCredential;
import java.security.Signature;
import javax.crypto.Cipher;
import javax.crypto.Mac;

/* JADX INFO: renamed from: X.14BY, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public class C14BY {
    public final Signature LIZ;
    public final Cipher LIZIZ;
    public final Mac LIZJ;
    public final IdentityCredential LIZLLL;

    public C14BY(IdentityCredential identityCredential) {
        this.LIZLLL = identityCredential;
    }

    public C14BY(Signature signature) {
        this.LIZ = signature;
    }

    public C14BY(Cipher cipher) {
        this.LIZIZ = cipher;
    }

    public C14BY(Mac mac) {
        this.LIZJ = mac;
    }
}
