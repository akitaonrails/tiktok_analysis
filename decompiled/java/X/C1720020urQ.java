package X;

import com.bytedance.pipo.stellar.base.model.CardDO;
import com.bytedance.pipo.stellar.base.model.prop.StellarActionDO;
import com.bytedance.pipo.stellar.base.resourceloader.StellarStyle;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0urQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1720020urQ implements InterfaceC1721200utK {
    public final EnumC488160JCk LL;
    public final String LLILLJJLI;
    public final boolean LLILLL;
    public final StellarStyle LLILZ;
    public final List<CardDO> LLILZIL;
    public final List<CardDO> LLILZLL;
    public final List<CardDO> LLIZ;
    public final List<CardDO> LLIZLLLIL;
    public final StellarActionDO LLJ;

    public C1720020urQ() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1720020urQ)) {
            return false;
        }
        C1720020urQ c1720020urQ = (C1720020urQ) obj;
        return this.LL == c1720020urQ.LL && Intrinsics.LJFF(this.LLILLJJLI, c1720020urQ.LLILLJJLI) && this.LLILLL == c1720020urQ.LLILLL && Intrinsics.LJFF(this.LLILZ, c1720020urQ.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c1720020urQ.LLILZIL) && Intrinsics.LJFF(this.LLILZLL, c1720020urQ.LLILZLL) && Intrinsics.LJFF(this.LLIZ, c1720020urQ.LLIZ) && Intrinsics.LJFF(this.LLIZLLLIL, c1720020urQ.LLIZLLLIL) && Intrinsics.LJFF(this.LLJ, c1720020urQ.LLJ);
    }

    public final int hashCode() {
        EnumC488160JCk enumC488160JCk = this.LL;
        int iHashCode = (enumC488160JCk == null ? 0 : enumC488160JCk.hashCode()) * 31;
        String str = this.LLILLJJLI;
        int iHashCode2 = (((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + C786410Ut5.Z2(this.LLILLL)) * 31;
        StellarStyle stellarStyle = this.LLILZ;
        int iHashCode3 = (iHashCode2 + (stellarStyle == null ? 0 : stellarStyle.hashCode())) * 31;
        List<CardDO> list = this.LLILZIL;
        int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        List<CardDO> list2 = this.LLILZLL;
        int iHashCode5 = (iHashCode4 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<CardDO> list3 = this.LLIZ;
        int iHashCode6 = (iHashCode5 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List<CardDO> list4 = this.LLIZLLLIL;
        int iHashCode7 = (iHashCode6 + (list4 == null ? 0 : list4.hashCode())) * 31;
        StellarActionDO stellarActionDO = this.LLJ;
        return iHashCode7 + (stellarActionDO != null ? stellarActionDO.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("WelcomePageState(loadingStatus=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", errorContent=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", isPollingUpdate=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", mainStyle=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", header=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", body=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(", footer=");
        sbLIZ.append(this.LLIZ);
        sbLIZ.append(", background=");
        sbLIZ.append(this.LLIZLLLIL);
        sbLIZ.append(", stellarAction=");
        sbLIZ.append(this.LLJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1721200utK
    public final List<CardDO> LJFF() {
        return this.LLIZLLLIL;
    }

    @Override // X.InterfaceC1721200utK
    public final boolean LJII() {
        return this.LLILLL;
    }

    @Override // X.InterfaceC1721200utK
    public final StellarStyle LJIIL() {
        return this.LLILZ;
    }

    @Override // X.InterfaceC1721200utK
    public final StellarActionDO LJIILJJIL() {
        return this.LLJ;
    }

    @Override // X.InterfaceC1721200utK
    public final List<CardDO> getBody() {
        return this.LLILZLL;
    }

    @Override // X.InterfaceC1721200utK
    public final List<CardDO> getFooter() {
        return this.LLIZ;
    }

    @Override // X.InterfaceC1721200utK
    public final List<CardDO> getHeader() {
        return this.LLILZIL;
    }

    public /* synthetic */ C1720020urQ(int i) {
        this(null, null, false, null, null, null, null, null, null);
    }

    public C1720020urQ(EnumC488160JCk enumC488160JCk, String str, boolean z, StellarStyle stellarStyle, List<CardDO> list, List<CardDO> list2, List<CardDO> list3, List<CardDO> list4, StellarActionDO stellarActionDO) {
        this.LL = enumC488160JCk;
        this.LLILLJJLI = str;
        this.LLILLL = z;
        this.LLILZ = stellarStyle;
        this.LLILZIL = list;
        this.LLILZLL = list2;
        this.LLIZ = list3;
        this.LLIZLLLIL = list4;
        this.LLJ = stellarActionDO;
    }

    public static C1720020urQ LIZ(C1720020urQ c1720020urQ, EnumC488160JCk enumC488160JCk, String str, StellarStyle stellarStyle, List list, List list2, List list3, List list4, StellarActionDO stellarActionDO, int i) {
        boolean z;
        StellarActionDO stellarActionDO2 = stellarActionDO;
        List list5 = list4;
        List list6 = list3;
        List list7 = list2;
        List list8 = list;
        StellarStyle stellarStyle2 = stellarStyle;
        String str2 = str;
        EnumC488160JCk enumC488160JCk2 = enumC488160JCk;
        if ((i & 1) != 0) {
            enumC488160JCk2 = c1720020urQ.LL;
        }
        if ((i & 2) != 0) {
            str2 = c1720020urQ.LLILLJJLI;
        }
        if ((i & 4) != 0) {
            z = c1720020urQ.LLILLL;
        } else {
            z = false;
        }
        if ((i & 8) != 0) {
            stellarStyle2 = c1720020urQ.LLILZ;
        }
        if ((i & 16) != 0) {
            list8 = c1720020urQ.LLILZIL;
        }
        if ((i & 32) != 0) {
            list7 = c1720020urQ.LLILZLL;
        }
        if ((i & 64) != 0) {
            list6 = c1720020urQ.LLIZ;
        }
        if ((i & 128) != 0) {
            list5 = c1720020urQ.LLIZLLLIL;
        }
        if ((i & 256) != 0) {
            stellarActionDO2 = c1720020urQ.LLJ;
        }
        c1720020urQ.getClass();
        return new C1720020urQ(enumC488160JCk2, str2, z, stellarStyle2, list8, list7, list6, list5, stellarActionDO2);
    }
}
