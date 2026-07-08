package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0OIy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C617260OIy implements InterfaceC1891350zJl {
    public final String LL;
    public final String LLILLJJLI;
    public final String LLILLL;
    public final boolean LLILZ;
    public final Function0<Unit> LLILZIL;
    public final boolean LLILZLL;
    public final Function0<Unit> LLIZ;
    public final C0OJ0 LLIZLLLIL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C617260OIy)) {
            return false;
        }
        C617260OIy c617260OIy = (C617260OIy) obj;
        return Intrinsics.LJFF(this.LL, c617260OIy.LL) && Intrinsics.LJFF(this.LLILLJJLI, c617260OIy.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c617260OIy.LLILLL) && this.LLILZ == c617260OIy.LLILZ && Intrinsics.LJFF(this.LLILZIL, c617260OIy.LLILZIL) && this.LLILZLL == c617260OIy.LLILZLL && Intrinsics.LJFF(this.LLIZ, c617260OIy.LLIZ) && Intrinsics.LJFF(this.LLIZLLLIL, c617260OIy.LLIZLLLIL);
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        int iHashCode = ((((((((((this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode()) * 31) + this.LLILLL.hashCode()) * 31) + C786410Ut5.Z2(this.LLILZ)) * 31) + this.LLILZIL.hashCode()) * 31) + C786410Ut5.Z2(this.LLILZLL)) * 31;
        Function0<Unit> function0 = this.LLIZ;
        int iHashCode2 = (iHashCode + (function0 == null ? 0 : function0.hashCode())) * 31;
        C0OJ0 c0oj0 = this.LLIZLLLIL;
        return iHashCode2 + (c0oj0 != null ? c0oj0.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BulletinSettingNewEntryItem(entranceKey=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", title=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", jumpSchema=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", needShowNewTag=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", onTagConsumed=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", clickEnabled=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(", onClickTrack=");
        sbLIZ.append(this.LLIZ);
        sbLIZ.append(", uiConfig=");
        sbLIZ.append(this.LLIZLLLIL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(this, interfaceC1891350zJl);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if ((interfaceC1891350zJl instanceof C617260OIy) && Intrinsics.LJFF(((C617260OIy) interfaceC1891350zJl).LL, this.LL)) {
            return true;
        }
        return false;
    }

    public C617260OIy(String str, String str2, String str3, boolean z, Function0<Unit> function0, boolean z2, Function0<Unit> function02, C0OJ0 c0oj0) {
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = str3;
        this.LLILZ = z;
        this.LLILZIL = function0;
        this.LLILZLL = z2;
        this.LLIZ = function02;
        this.LLIZLLLIL = c0oj0;
    }
}
