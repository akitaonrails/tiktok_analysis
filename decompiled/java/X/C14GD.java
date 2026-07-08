package X;

import java.util.Map;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.14GD, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C14GD implements InterfaceC1618180sDA<C14GD> {
    public final String LL;
    public final String LLILLJJLI;
    public final String LLILLL;
    public final String LLILZ;
    public final String LLILZIL;
    public final Long LLILZLL;
    public final Integer LLIZ;
    public final String LLIZLLLIL;

    public C14GD() {
        this(0);
    }

    @Override // X.InterfaceC1282004zy
    public final boolean checkExtraParamKey() {
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C14GD)) {
            return false;
        }
        C14GD c14gd = (C14GD) obj;
        return Intrinsics.LJFF(this.LL, c14gd.LL) && Intrinsics.LJFF(this.LLILLJJLI, c14gd.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c14gd.LLILLL) && Intrinsics.LJFF(this.LLILZ, c14gd.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c14gd.LLILZIL) && Intrinsics.LJFF(this.LLILZLL, c14gd.LLILZLL) && Intrinsics.LJFF(this.LLIZ, c14gd.LLIZ) && Intrinsics.LJFF(this.LLIZLLLIL, c14gd.LLIZLLLIL);
    }

    public final int hashCode() {
        String str = this.LL;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.LLILLJJLI;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.LLILLL;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.LLILZ;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.LLILZIL;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Long l = this.LLILZLL;
        int iHashCode6 = (iHashCode5 + (l == null ? 0 : l.hashCode())) * 31;
        Integer num = this.LLIZ;
        return ((iHashCode6 + (num != null ? num.hashCode() : 0)) * 31) + this.LLIZLLLIL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TakoShareSessionState(enterFrom=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", enterMethod=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", processId=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", shareId=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", nickName=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", botId=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(", botSource=");
        sbLIZ.append(this.LLIZ);
        sbLIZ.append(", sourceId=");
        sbLIZ.append(this.LLIZLLLIL);
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

    @Override // X.InterfaceC1282004zy
    public final Map<String, Object> keyParams() {
        return C2097608Jq.LJ();
    }

    public /* synthetic */ C14GD(int i) {
        this("", "", "", "", "", 0L, 0, UUID.randomUUID().toString());
    }

    public C14GD(String str, String str2, String str3, String str4, String str5, Long l, Integer num, String str6) {
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = str3;
        this.LLILZ = str4;
        this.LLILZIL = str5;
        this.LLILZLL = l;
        this.LLIZ = num;
        this.LLIZLLLIL = str6;
    }
}
