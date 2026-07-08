package X;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0OIz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C617270OIz implements InterfaceC1891350zJl {
    public final Integer LL;
    public final String LLILLJJLI;
    public final Integer LLILLL;
    public final String LLILZ;
    public final Function0<String> LLILZIL;
    public final C0OJ0 LLILZLL;

    public C617270OIz() {
        this(null, null, null, null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C617270OIz)) {
            return false;
        }
        C617270OIz c617270OIz = (C617270OIz) obj;
        return Intrinsics.LJFF(this.LL, c617270OIz.LL) && Intrinsics.LJFF(this.LLILLJJLI, c617270OIz.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c617270OIz.LLILLL) && Intrinsics.LJFF(this.LLILZ, c617270OIz.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c617270OIz.LLILZIL) && Intrinsics.LJFF(this.LLILZLL, c617270OIz.LLILZLL);
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        Integer num = this.LL;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.LLILLJJLI;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num2 = this.LLILLL;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str2 = this.LLILZ;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Function0<String> function0 = this.LLILZIL;
        int iHashCode5 = (iHashCode4 + (function0 == null ? 0 : function0.hashCode())) * 31;
        C0OJ0 c0oj0 = this.LLILZLL;
        return iHashCode5 + (c0oj0 != null ? c0oj0.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BulletinFunctionSettingsParentItem(entranceId=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", entranceKey=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", type=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", title=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", getSchemaUrl=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", uiConfig=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(this, interfaceC1891350zJl);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        C617270OIz c617270OIz;
        if ((interfaceC1891350zJl instanceof C617270OIz) && (c617270OIz = (C617270OIz) interfaceC1891350zJl) != null) {
            return Intrinsics.LJFF(this.LLILLL, c617270OIz.LLILLL);
        }
        return false;
    }

    public C617270OIz(Integer num, String str, Integer num2, String str2, Function0<String> function0, C0OJ0 c0oj0) {
        this.LL = num;
        this.LLILLJJLI = str;
        this.LLILLL = num2;
        this.LLILZ = str2;
        this.LLILZIL = function0;
        this.LLILZLL = c0oj0;
    }
}
