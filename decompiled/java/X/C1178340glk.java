package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0glk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1178340glk implements InterfaceC0148002o {
    public final EnumC1182690gsl LL;
    public final EnumC1182750gsr LLILLJJLI;
    public final boolean LLILLL;
    public final String LLILZ;
    public final C1175020ggO LLILZIL;

    public C1178340glk() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1178340glk)) {
            return false;
        }
        C1178340glk c1178340glk = (C1178340glk) obj;
        return this.LL == c1178340glk.LL && this.LLILLJJLI == c1178340glk.LLILLJJLI && this.LLILLL == c1178340glk.LLILLL && Intrinsics.LJFF(this.LLILZ, c1178340glk.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c1178340glk.LLILZIL);
    }

    public final int hashCode() {
        EnumC1182690gsl enumC1182690gsl = this.LL;
        int iHashCode = (enumC1182690gsl == null ? 0 : enumC1182690gsl.hashCode()) * 31;
        EnumC1182750gsr enumC1182750gsr = this.LLILLJJLI;
        int iHashCode2 = (((iHashCode + (enumC1182750gsr == null ? 0 : enumC1182750gsr.hashCode())) * 31) + C786410Ut5.Z2(this.LLILLL)) * 31;
        String str = this.LLILZ;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        C1175020ggO c1175020ggO = this.LLILZIL;
        return iHashCode3 + (c1175020ggO != null ? c1175020ggO.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PoiQuizPageState(newUIState=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", newDataState=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", isFinishTask=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", finishPoiId=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", targetPoiData=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C1178340glk(int i) {
        this(null, null, false, null, null);
    }

    public C1178340glk(EnumC1182690gsl enumC1182690gsl, EnumC1182750gsr enumC1182750gsr, boolean z, String str, C1175020ggO c1175020ggO) {
        this.LL = enumC1182690gsl;
        this.LLILLJJLI = enumC1182750gsr;
        this.LLILLL = z;
        this.LLILZ = str;
        this.LLILZIL = c1175020ggO;
    }
}
