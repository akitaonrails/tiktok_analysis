package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0yam, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1863460yam implements InterfaceC1891350zJl {
    public final String LL;
    public final EnumC429110Gs9 LLILLJJLI;
    public final boolean LLILLL;
    public final Function2<EnumC429110Gs9, Boolean, Unit> LLILZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1863460yam)) {
            return false;
        }
        C1863460yam c1863460yam = (C1863460yam) obj;
        return Intrinsics.LJFF(this.LL, c1863460yam.LL) && this.LLILLJJLI == c1863460yam.LLILLJJLI && this.LLILLL == c1863460yam.LLILLL && Intrinsics.LJFF(this.LLILZ, c1863460yam.LLILZ);
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        int iHashCode = ((((this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode()) * 31) + C786410Ut5.Z2(this.LLILLL)) * 31;
        Function2<EnumC429110Gs9, Boolean, Unit> function2 = this.LLILZ;
        return iHashCode + (function2 == null ? 0 : function2.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TakoSubConversationGroupItem(title=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", groupType=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", isExpand=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", onClick=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        C1863460yam c1863460yam;
        if (!areItemTheSame(interfaceC1891350zJl) || !(interfaceC1891350zJl instanceof C1863460yam) || (c1863460yam = (C1863460yam) interfaceC1891350zJl) == null || this.LLILLL != c1863460yam.LLILLL) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        String str;
        C1863460yam c1863460yam;
        C1863460yam c1863460yam2;
        String str2 = this.LL;
        boolean z = interfaceC1891350zJl instanceof C1863460yam;
        EnumC429110Gs9 enumC429110Gs9 = null;
        if (z && (c1863460yam2 = (C1863460yam) interfaceC1891350zJl) != null) {
            str = c1863460yam2.LL;
        } else {
            str = null;
        }
        if (Intrinsics.LJFF(str2, str)) {
            EnumC429110Gs9 enumC429110Gs92 = this.LLILLJJLI;
            if (z && (c1863460yam = (C1863460yam) interfaceC1891350zJl) != null) {
                enumC429110Gs9 = c1863460yam.LLILLJJLI;
            }
            if (enumC429110Gs92 == enumC429110Gs9) {
                return true;
            }
            return false;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1863460yam(String str, EnumC429110Gs9 enumC429110Gs9, boolean z, Function2<? super EnumC429110Gs9, ? super Boolean, Unit> function2) {
        this.LL = str;
        this.LLILLJJLI = enumC429110Gs9;
        this.LLILLL = z;
        this.LLILZ = function2;
    }
}
