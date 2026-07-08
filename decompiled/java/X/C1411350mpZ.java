package X;

import com.bytedance.android.livesdk.chatroom.api.SMBOptInStep;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import webcast.api.sub.SMBOptInQualificationResponse;
import webcast.api.sub.SupportedServiceInfo;

/* JADX INFO: renamed from: X.0mpZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1411350mpZ implements InterfaceC0148002o {
    public final AbstractC1411370mpb LL;
    public final SMBOptInQualificationResponse.ResponseData LLILLJJLI;
    public final List<SupportedServiceInfo> LLILLL;
    public final boolean LLILZ;
    public final List<SMBOptInStep> LLILZIL;
    public final Boolean LLILZLL;
    public final Boolean LLIZ;
    public final Boolean LLIZLLLIL;
    public final Throwable LLJ;
    public final Function0<Unit> LLJI;

    public C1411350mpZ() {
        this(0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PcsOnboardingVMState(loadStatus=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", qualification=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", supportedServices=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", canEveryoneSendDm=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", optInSteps=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", optInQualificationIsFromCache=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(", serviceSwitchInfoIsFromCache=");
        sbLIZ.append(this.LLIZ);
        sbLIZ.append(", optInProgressIsFromCache=");
        sbLIZ.append(this.LLIZLLLIL);
        sbLIZ.append(", pageError=");
        sbLIZ.append(this.LLJ);
        sbLIZ.append(", retryAction=");
        sbLIZ.append(this.LLJI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final int hashCode() {
        int iHashCode = this.LL.hashCode() * 31;
        SMBOptInQualificationResponse.ResponseData responseData = this.LLILLJJLI;
        int iHashCode2 = (((((((iHashCode + (responseData != null ? responseData.hashCode() : 0)) * 31) + this.LLILLL.hashCode()) * 31) + C786410Ut5.Z2(this.LLILZ)) * 31) + this.LLILZIL.hashCode()) * 31;
        Boolean bool = this.LLILZLL;
        int iHashCode3 = (iHashCode2 + (bool != null ? bool.hashCode() : 0)) * 31;
        Boolean bool2 = this.LLIZ;
        int iHashCode4 = (iHashCode3 + (bool2 != null ? bool2.hashCode() : 0)) * 31;
        Boolean bool3 = this.LLIZLLLIL;
        return iHashCode4 + (bool3 != null ? bool3.hashCode() : 0);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C1411350mpZ(int i) {
        C1411360mpa c1411360mpa = C1411360mpa.LIZ;
        C13BV c13bv = C13BV.INSTANCE;
        this(c1411360mpa, null, c13bv, false, c13bv, null, null, null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1411350mpZ)) {
            return false;
        }
        C1411350mpZ c1411350mpZ = (C1411350mpZ) obj;
        if (Intrinsics.LJFF(this.LL, c1411350mpZ.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1411350mpZ.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c1411350mpZ.LLILLL) && this.LLILZ == c1411350mpZ.LLILZ && Intrinsics.LJFF(this.LLILZIL, c1411350mpZ.LLILZIL) && Intrinsics.LJFF(this.LLILZLL, c1411350mpZ.LLILZLL) && Intrinsics.LJFF(this.LLIZ, c1411350mpZ.LLIZ) && Intrinsics.LJFF(this.LLIZLLLIL, c1411350mpZ.LLIZLLLIL)) {
            return true;
        }
        return false;
    }

    public C1411350mpZ(AbstractC1411370mpb abstractC1411370mpb, SMBOptInQualificationResponse.ResponseData responseData, List<SupportedServiceInfo> list, boolean z, List<SMBOptInStep> list2, Boolean bool, Boolean bool2, Boolean bool3, Throwable th, Function0<Unit> function0) {
        this.LL = abstractC1411370mpb;
        this.LLILLJJLI = responseData;
        this.LLILLL = list;
        this.LLILZ = z;
        this.LLILZIL = list2;
        this.LLILZLL = bool;
        this.LLIZ = bool2;
        this.LLIZLLLIL = bool3;
        this.LLJ = th;
        this.LLJI = function0;
    }

    public static C1411350mpZ LIZ(C1411350mpZ c1411350mpZ, AbstractC1411370mpb abstractC1411370mpb, SMBOptInQualificationResponse.ResponseData responseData, List list, boolean z, List list2, Boolean bool, Boolean bool2, Boolean bool3, Throwable th, Function0 function0, int i) {
        Function0 function02 = function0;
        Throwable th2 = th;
        Boolean bool4 = bool3;
        Boolean bool5 = bool2;
        Boolean bool6 = bool;
        List list3 = list2;
        boolean z2 = z;
        List list4 = list;
        SMBOptInQualificationResponse.ResponseData responseData2 = responseData;
        AbstractC1411370mpb abstractC1411370mpb2 = abstractC1411370mpb;
        if ((i & 1) != 0) {
            abstractC1411370mpb2 = c1411350mpZ.LL;
        }
        if ((i & 2) != 0) {
            responseData2 = c1411350mpZ.LLILLJJLI;
        }
        if ((i & 4) != 0) {
            list4 = c1411350mpZ.LLILLL;
        }
        if ((i & 8) != 0) {
            z2 = c1411350mpZ.LLILZ;
        }
        if ((i & 16) != 0) {
            list3 = c1411350mpZ.LLILZIL;
        }
        if ((i & 32) != 0) {
            bool6 = c1411350mpZ.LLILZLL;
        }
        if ((i & 64) != 0) {
            bool5 = c1411350mpZ.LLIZ;
        }
        if ((i & 128) != 0) {
            bool4 = c1411350mpZ.LLIZLLLIL;
        }
        if ((i & 256) != 0) {
            th2 = c1411350mpZ.LLJ;
        }
        if ((i & 512) != 0) {
            function02 = c1411350mpZ.LLJI;
        }
        c1411350mpZ.getClass();
        return new C1411350mpZ(abstractC1411370mpb2, responseData2, list4, z2, list3, bool6, bool5, bool4, th2, function02);
    }
}
