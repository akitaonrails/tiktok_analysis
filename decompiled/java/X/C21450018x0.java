package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Map;

/* JADX INFO: renamed from: X.18x0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21450018x0 implements Map.Entry<String, String>, Cloneable {
    public final String LL;
    public String LLILLJJLI;
    public final C21449918wz LLILLL;

    @Override // java.util.Map.Entry
    public final int hashCode() {
        String str = this.LL;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.LLILLJJLI;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            TryCatchGuardChecker.doCheck(e);
            throw new RuntimeException(e);
        }
    }

    @Override // java.util.Map.Entry
    public final /* bridge */ /* synthetic */ String getKey() {
        return this.LL;
    }

    @Override // java.util.Map.Entry
    public final /* bridge */ /* synthetic */ String getValue() {
        return this.LLILLJJLI;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C21450018x0.class != obj.getClass()) {
            return false;
        }
        C21450018x0 c21450018x0 = (C21450018x0) obj;
        String str = this.LL;
        if (str != null) {
            if (!str.equals(c21450018x0.LL)) {
                return false;
            }
        } else if (c21450018x0.LL != null) {
            return false;
        }
        String str2 = this.LLILLJJLI;
        String str3 = c21450018x0.LLILLJJLI;
        if (str2 != null) {
            return str2.equals(str3);
        }
        if (str3 == null) {
            return true;
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final String setValue(String str) {
        String str2;
        int iLIZJ;
        String str3 = str;
        C21449918wz c21449918wz = this.LLILLL;
        int iLIZJ2 = c21449918wz.LIZJ(this.LL);
        if (iLIZJ2 == -1 || (str2 = c21449918wz.LLILLL[iLIZJ2]) == null) {
            str2 = "";
        }
        C21449918wz c21449918wz2 = this.LLILLL;
        if (c21449918wz2 != null && (iLIZJ = c21449918wz2.LIZJ(this.LL)) != -1) {
            this.LLILLL.LLILLL[iLIZJ] = str3;
        }
        this.LLILLJJLI = str3;
        return str2;
    }

    public C21450018x0(String str, String str2, C21449918wz c21449918wz) {
        if (str != null) {
            this.LL = str.trim();
            if (str.length() != 0) {
                this.LLILLJJLI = str2;
                this.LLILLL = c21449918wz;
                return;
            }
            throw new IllegalArgumentException("String must not be empty");
        }
        throw new IllegalArgumentException("Object must not be null");
    }
}
