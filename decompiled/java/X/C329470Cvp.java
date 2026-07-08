package X;

import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Cvp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C329470Cvp implements Serializable, InterfaceC111300bX {
    public static final int $stable = 8;
    public final String LL;
    public final String LLILLJJLI;
    public final Long LLILLL;
    public final Long LLILZ;
    public final List<String> LLILZIL;
    public final InterfaceC665370Q7z LLILZLL;
    public final String LLIZ;

    public C329470Cvp() {
        this(null, null, null, null, null, null, null);
    }

    public final C329470Cvp copy(String str, String str2, Long l, Long l2, List<String> list, InterfaceC665370Q7z interfaceC665370Q7z, String str3) {
        return new C329470Cvp(str, str2, l, l2, list, interfaceC665370Q7z, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C329470Cvp)) {
            return false;
        }
        C329470Cvp c329470Cvp = (C329470Cvp) obj;
        return Intrinsics.LJFF(this.LL, c329470Cvp.LL) && Intrinsics.LJFF(this.LLILLJJLI, c329470Cvp.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c329470Cvp.LLILLL) && Intrinsics.LJFF(this.LLILZ, c329470Cvp.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c329470Cvp.LLILZIL) && Intrinsics.LJFF(this.LLILZLL, c329470Cvp.LLILZLL) && Intrinsics.LJFF(this.LLIZ, c329470Cvp.LLIZ);
    }

    public int hashCode() {
        String str = this.LL;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.LLILLJJLI;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l = this.LLILLL;
        int iHashCode3 = (iHashCode2 + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.LLILZ;
        int iHashCode4 = (iHashCode3 + (l2 == null ? 0 : l2.hashCode())) * 31;
        List<String> list = this.LLILZIL;
        int iHashCode5 = (iHashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        InterfaceC665370Q7z interfaceC665370Q7z = this.LLILZLL;
        int iHashCode6 = (iHashCode5 + (interfaceC665370Q7z == null ? 0 : interfaceC665370Q7z.hashCode())) * 31;
        String str3 = this.LLIZ;
        return iHashCode6 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DoubleColumnVideoListCarryData(msgId=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", uuid=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", msgServerSeq=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", botId=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", aids=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", vscope=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(", versionId=");
        sbLIZ.append(this.LLIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final List<String> getAids() {
        return this.LLILZIL;
    }

    public final Long getBotId() {
        return this.LLILZ;
    }

    public final String getMsgId() {
        return this.LL;
    }

    public final Long getMsgServerSeq() {
        return this.LLILLL;
    }

    public final String getUuid() {
        return this.LLILLJJLI;
    }

    public final String getVersionId() {
        return this.LLIZ;
    }

    public final InterfaceC665370Q7z getVscope() {
        return this.LLILZLL;
    }

    public C329470Cvp(String str, String str2, Long l, Long l2, List<String> list, InterfaceC665370Q7z interfaceC665370Q7z, String str3) {
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = l;
        this.LLILZ = l2;
        this.LLILZIL = list;
        this.LLILZLL = interfaceC665370Q7z;
        this.LLIZ = str3;
    }
}
