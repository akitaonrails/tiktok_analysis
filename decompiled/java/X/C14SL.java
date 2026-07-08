package X;

import com.ss.android.ugc.aweme.compliance.api.model.TermsConsentInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.14SL, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C14SL implements InterfaceC111300bX {
    public final TermsConsentInfo LL;
    public final Function1<Boolean, Unit> LLILLJJLI;
    public final Function1<Boolean, Unit> LLILLL;
    public final Function1<Boolean, Unit> LLILZ;
    public final Function1<Boolean, Unit> LLILZIL;
    public final Function0<Unit> LLILZLL;
    public final boolean LLIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C14SL)) {
            return false;
        }
        C14SL c14sl = (C14SL) obj;
        return Intrinsics.LJFF(this.LL, c14sl.LL) && Intrinsics.LJFF(this.LLILLJJLI, c14sl.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c14sl.LLILLL) && Intrinsics.LJFF(this.LLILZ, c14sl.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c14sl.LLILZIL) && Intrinsics.LJFF(this.LLILZLL, c14sl.LLILZLL) && this.LLIZ == c14sl.LLIZ;
    }

    public final int hashCode() {
        TermsConsentInfo termsConsentInfo = this.LL;
        return ((((((((((((termsConsentInfo == null ? 0 : termsConsentInfo.hashCode()) * 31) + this.LLILLJJLI.hashCode()) * 31) + this.LLILLL.hashCode()) * 31) + this.LLILZ.hashCode()) * 31) + this.LLILZIL.hashCode()) * 31) + this.LLILZLL.hashCode()) * 31) + C786410Ut5.Z2(this.LLIZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TermsConditionsUIData(info=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", onCheckAllAction=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", onCheckTermsAction=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", onCheckPrivacyPolicyAction=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", onCheckNotificationAction=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", onNextAction=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(", fromSignupLogin=");
        sbLIZ.append(this.LLIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C14SL(TermsConsentInfo termsConsentInfo, Function1<? super Boolean, Unit> function1, Function1<? super Boolean, Unit> function12, Function1<? super Boolean, Unit> function13, Function1<? super Boolean, Unit> function14, Function0<Unit> function0, boolean z) {
        this.LL = termsConsentInfo;
        this.LLILLJJLI = function1;
        this.LLILLL = function12;
        this.LLILZ = function13;
        this.LLILZIL = function14;
        this.LLILZLL = function0;
        this.LLIZ = z;
    }
}
