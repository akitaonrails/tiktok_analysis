package X;

import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestOptGuestDistributeStateSetting;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0xMM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1816080xMM implements InterfaceC0148002o {
    public final C1778130wN9 LL;
    public final int LLILLJJLI;
    public final int LLILLL;
    public final C1816090xMN LLILZ;
    public final C1816100xMO LLILZIL;
    public final AbstractC1623806Xk<C1618380sDU> LLILZLL;
    public final AbstractC1623806Xk<C1618380sDU> LLIZ;

    public C1816080xMM() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1816080xMM)) {
            return false;
        }
        C1816080xMM c1816080xMM = (C1816080xMM) obj;
        return Intrinsics.LJFF(this.LL, c1816080xMM.LL) && this.LLILLJJLI == c1816080xMM.LLILLJJLI && this.LLILLL == c1816080xMM.LLILLL && Intrinsics.LJFF(this.LLILZ, c1816080xMM.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c1816080xMM.LLILZIL) && Intrinsics.LJFF(this.LLILZLL, c1816080xMM.LLILZLL) && Intrinsics.LJFF(this.LLIZ, c1816080xMM.LLIZ);
    }

    public final int hashCode() {
        return (((((((((((this.LL.hashCode() * 31) + this.LLILLJJLI) * 31) + this.LLILLL) * 31) + this.LLILZ.hashCode()) * 31) + this.LLILZIL.hashCode()) * 31) + this.LLILZLL.hashCode()) * 31) + this.LLIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DistributeStatus(dialogType=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", liveStatus=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", source=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", closePage=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", clickOuterView=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", requestStatus=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(", stateChangeStatus=");
        sbLIZ.append(this.LLIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C1816080xMM(int i) {
        C1778130wN9 c1778130wN9 = new C1778130wN9(EnumC1778380wNY.NONE, false);
        int i2 = !MultiGuestOptGuestDistributeStateSetting.INSTANCE.isEnable() ? 1 : 0;
        C1816090xMN c1816090xMN = new C1816090xMN(false);
        C1816100xMO c1816100xMO = new C1816100xMO();
        C491101vh c491101vh = C491101vh.LIZ;
        this(c1778130wN9, i2, 0, c1816090xMN, c1816100xMO, c491101vh, c491101vh);
    }

    public C1816080xMM(C1778130wN9 c1778130wN9, int i, int i2, C1816090xMN c1816090xMN, C1816100xMO c1816100xMO, AbstractC1623806Xk<C1618380sDU> abstractC1623806Xk, AbstractC1623806Xk<C1618380sDU> abstractC1623806Xk2) {
        this.LL = c1778130wN9;
        this.LLILLJJLI = i;
        this.LLILLL = i2;
        this.LLILZ = c1816090xMN;
        this.LLILZIL = c1816100xMO;
        this.LLILZLL = abstractC1623806Xk;
        this.LLIZ = abstractC1623806Xk2;
    }

    public static C1816080xMM LIZ(C1816080xMM c1816080xMM, C1778130wN9 c1778130wN9, int i, int i2, C1816090xMN c1816090xMN, C1816100xMO c1816100xMO, AbstractC1623806Xk abstractC1623806Xk, AbstractC1623806Xk abstractC1623806Xk2, int i3) {
        AbstractC1623806Xk abstractC1623806Xk3 = abstractC1623806Xk2;
        AbstractC1623806Xk abstractC1623806Xk4 = abstractC1623806Xk;
        C1816100xMO c1816100xMO2 = c1816100xMO;
        C1816090xMN c1816090xMN2 = c1816090xMN;
        int i4 = i2;
        int i5 = i;
        C1778130wN9 c1778130wN92 = c1778130wN9;
        if ((i3 & 1) != 0) {
            c1778130wN92 = c1816080xMM.LL;
        }
        if ((i3 & 2) != 0) {
            i5 = c1816080xMM.LLILLJJLI;
        }
        if ((i3 & 4) != 0) {
            i4 = c1816080xMM.LLILLL;
        }
        if ((i3 & 8) != 0) {
            c1816090xMN2 = c1816080xMM.LLILZ;
        }
        if ((i3 & 16) != 0) {
            c1816100xMO2 = c1816080xMM.LLILZIL;
        }
        if ((i3 & 32) != 0) {
            abstractC1623806Xk4 = c1816080xMM.LLILZLL;
        }
        if ((i3 & 64) != 0) {
            abstractC1623806Xk3 = c1816080xMM.LLIZ;
        }
        c1816080xMM.getClass();
        return new C1816080xMM(c1778130wN92, i5, i4, c1816090xMN2, c1816100xMO2, abstractC1623806Xk4, abstractC1623806Xk3);
    }
}
