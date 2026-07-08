package X;

import com.bytedance.bpea.basics.Cert;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Waf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C825950Waf {
    public static final Map<C825960Wag, InterfaceC838140WuK[]> LIZ = new LinkedHashMap();

    public static InterfaceC838140WuK[] LIZ(C825940Wae c825940Wae) {
        final String strCertType;
        Map<C825960Wag, InterfaceC838140WuK[]> map = LIZ;
        final String str = c825940Wae.LJ;
        Cert cert = c825940Wae.LIZ;
        final String str2 = null;
        if (cert != null) {
            strCertType = cert.certType();
        } else {
            strCertType = null;
        }
        LinkedHashMap linkedHashMap = (LinkedHashMap) map;
        InterfaceC838140WuK[] interfaceC838140WuKArr = (InterfaceC838140WuK[]) linkedHashMap.get(new Object(str, strCertType) { // from class: X.0Wag
            public final String LIZ;
            public final String LIZIZ;

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C825960Wag)) {
                    return false;
                }
                C825960Wag c825960Wag = (C825960Wag) obj;
                return Intrinsics.LJFF(this.LIZ, c825960Wag.LIZ) && Intrinsics.LJFF(this.LIZIZ, c825960Wag.LIZIZ);
            }

            public final int hashCode() {
                int iHashCode = this.LIZ.hashCode() * 31;
                String str3 = this.LIZIZ;
                return iHashCode + (str3 == null ? 0 : str3.hashCode());
            }

            {
                this.LIZ = str;
                this.LIZIZ = strCertType;
            }
        });
        if (interfaceC838140WuKArr == null) {
            final String str3 = c825940Wae.LJ;
            return (InterfaceC838140WuK[]) linkedHashMap.get(new Object(str3, str2) { // from class: X.0Wag
                public final String LIZ;
                public final String LIZIZ;

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof C825960Wag)) {
                        return false;
                    }
                    C825960Wag c825960Wag = (C825960Wag) obj;
                    return Intrinsics.LJFF(this.LIZ, c825960Wag.LIZ) && Intrinsics.LJFF(this.LIZIZ, c825960Wag.LIZIZ);
                }

                public final int hashCode() {
                    int iHashCode = this.LIZ.hashCode() * 31;
                    String str32 = this.LIZIZ;
                    return iHashCode + (str32 == null ? 0 : str32.hashCode());
                }

                {
                    this.LIZ = str3;
                    this.LIZIZ = str2;
                }
            });
        }
        return interfaceC838140WuKArr;
    }
}
