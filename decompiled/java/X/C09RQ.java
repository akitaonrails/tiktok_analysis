package X;

import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import android.util.Base64;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: renamed from: X.09RQ, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C09RQ {
    public final String LIZ;
    public final Set<String> LIZIZ;
    public final String LIZJ;
    public final Boolean LIZLLL;

    public final int hashCode() {
        int iHashCode = (((this.LIZ.hashCode() * 92821) + this.LIZJ.hashCode()) * 92821) + (this.LIZLLL.booleanValue() ? 1 : 0);
        Iterator<String> it2 = this.LIZIZ.iterator();
        while (it2.hasNext()) {
            iHashCode = (iHashCode * 92821) + it2.next().hashCode();
        }
        return iHashCode;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C09RQ)) {
            return false;
        }
        C09RQ c09rq = (C09RQ) obj;
        if (this.LIZ.equals(c09rq.LIZ) && this.LIZJ.equals(c09rq.LIZJ) && this.LIZLLL == c09rq.LIZLLL && this.LIZIZ.equals(c09rq.LIZIZ)) {
            return true;
        }
        return false;
    }

    public C09RQ(PackageInfo packageInfo, boolean z) {
        String str = packageInfo.packageName;
        Signature[] signatureArr = packageInfo.signatures;
        HashSet hashSet = new HashSet();
        for (Signature signature : signatureArr) {
            try {
                hashSet.add(Base64.encodeToString(MessageDigest.getInstance("SHA-512").digest(signature.toByteArray()), 10));
            } catch (NoSuchAlgorithmException e) {
                TryCatchGuardChecker.doCheck(e);
                throw new IllegalStateException("Platform does not supportSHA-512 hashing");
            }
        }
        String str2 = packageInfo.versionName;
        this.LIZ = str;
        this.LIZIZ = hashSet;
        this.LIZJ = str2;
        this.LIZLLL = Boolean.valueOf(z);
    }
}
