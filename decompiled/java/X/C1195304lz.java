package X;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.04lz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1195304lz implements InterfaceC1282004zy {
    public final String LL;
    public final String LLILLJJLI;

    @Override // X.InterfaceC1282004zy
    public final boolean checkExtraParamKey() {
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1195304lz)) {
            return false;
        }
        C1195304lz c1195304lz = (C1195304lz) obj;
        return Intrinsics.LJFF(this.LL, c1195304lz.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1195304lz.LLILLJJLI);
    }

    public final int hashCode() {
        return (this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode();
    }

    @Override // X.InterfaceC1282004zy
    public final Map<String, Object> keyParams() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("mobile_num", this.LL);
        linkedHashMap.put("sms_country_code", this.LLILLJJLI);
        return linkedHashMap;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SmsCodeParamGroup(mobileNum=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", smsCountryCode=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1282004zy
    public final Map<String, Object> filteredParams() {
        return keyParams();
    }

    @Override // X.InterfaceC1282004zy
    public final Map<String, Object> getExtraParam() {
        return C2097608Jq.LJ();
    }

    public C1195304lz(String str, String str2) {
        this.LL = str;
        this.LLILLJJLI = str2;
    }
}
