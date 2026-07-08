package X;

import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS275S0300000_31;
import kotlin.jvm.internal.AwS397S0200000_31;
import kotlin.jvm.internal.AwS575S0100000_31;
import kotlin.jvm.internal.AwS610S0100000_31;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.11Ty, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19508011Ty implements InterfaceC111300bX {
    public final String LL;
    public final Function0<Unit> LLILLJJLI;
    public final Function1<Boolean, Unit> LLILLL;
    public final Function0<Unit> LLILZ;
    public final Function0<Unit> LLILZIL;
    public final Function0<Unit> LLILZLL;
    public final Function1<Map<String, String>, Unit> LLIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C19508011Ty)) {
            return false;
        }
        C19508011Ty c19508011Ty = (C19508011Ty) obj;
        return Intrinsics.LJFF(this.LL, c19508011Ty.LL) && Intrinsics.LJFF(this.LLILLJJLI, c19508011Ty.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c19508011Ty.LLILLL) && Intrinsics.LJFF(this.LLILZ, c19508011Ty.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c19508011Ty.LLILZIL) && Intrinsics.LJFF(this.LLILZLL, c19508011Ty.LLILZLL) && Intrinsics.LJFF(this.LLIZ, c19508011Ty.LLIZ);
    }

    public final int hashCode() {
        String str = this.LL;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Function0<Unit> function0 = this.LLILLJJLI;
        int iHashCode2 = (iHashCode + (function0 == null ? 0 : function0.hashCode())) * 31;
        Function1<Boolean, Unit> function1 = this.LLILLL;
        int iHashCode3 = (iHashCode2 + (function1 == null ? 0 : function1.hashCode())) * 31;
        Function0<Unit> function02 = this.LLILZ;
        int iHashCode4 = (iHashCode3 + (function02 == null ? 0 : function02.hashCode())) * 31;
        Function0<Unit> function03 = this.LLILZIL;
        int iHashCode5 = (iHashCode4 + (function03 == null ? 0 : function03.hashCode())) * 31;
        Function0<Unit> function04 = this.LLILZLL;
        int iHashCode6 = (iHashCode5 + (function04 == null ? 0 : function04.hashCode())) * 31;
        Function1<Map<String, String>, Unit> function12 = this.LLIZ;
        return iHashCode6 + (function12 != null ? function12.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("EditShareActions(flowId=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", onClickSaveLocal=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", onClickQuickPost=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", relaunchAsSearch=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", onClickTypeOptionsPanel=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", onSaveLocalBtnShow=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(", onClickPanelParams=");
        sbLIZ.append(this.LLIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C19508011Ty(String str, AwS575S0100000_31 awS575S0100000_31, AwS397S0200000_31 awS397S0200000_31, C20619015mG c20619015mG, AwS275S0300000_31 awS275S0300000_31, AwS575S0100000_31 awS575S0100000_312, AwS610S0100000_31 awS610S0100000_31) {
        this.LL = str;
        this.LLILLJJLI = awS575S0100000_31;
        this.LLILLL = awS397S0200000_31;
        this.LLILZ = c20619015mG;
        this.LLILZIL = awS275S0300000_31;
        this.LLILZLL = awS575S0100000_312;
        this.LLIZ = awS610S0100000_31;
    }
}
