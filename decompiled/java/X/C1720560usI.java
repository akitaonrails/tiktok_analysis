package X;

import com.bytedance.pipo.stellar.base.adapter.internal.GuideDO;
import com.bytedance.pipo.stellar.base.model.BackgroundDO;
import com.bytedance.pipo.stellar.base.model.MarginDO;
import com.bytedance.pipo.stellar.base.model.prop.StellarActionDO;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0usI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1720560usI implements InterfaceC1720550usH {
    public final String LL;
    public final String LLILLJJLI;
    public final Map<String, Object> LLILLL;
    public final String LLILZ;
    public final String LLILZIL;
    public final String LLILZLL;
    public final MarginDO LLIZ;
    public final MarginDO LLIZLLLIL;
    public final StellarActionDO LLJ;
    public final BackgroundDO LLJI;
    public final C1720510usD LLJIJIL;
    public final EnumC1720670usT LLJILJIL;
    public final String LLJILJILJ;
    public final GuideDO LLJILLL;
    public final int LLJJ;

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final String toString() {
        return "GuideWidget(id=" + this.LL + ", sectionId=" + this.LLILLJJLI + ", sectionTrackingParams=" + this.LLILLL + ", type=" + this.LLILZ + ", height=" + this.LLILZIL + ", width=" + this.LLILZLL + ", margin=" + this.LLIZ + ", padding=" + this.LLIZLLLIL + ", action=" + this.LLJ + ", background=" + this.LLJI + ", trackingConfig=" + this.LLJIJIL + ", theme=" + this.LLJILJIL + ", layoutGravity=" + this.LLJILJILJ + ", guideDO=" + this.LLJILLL + ", index=" + this.LLJJ + ')';
    }

    public final int hashCode() {
        int iHashCode = ((((((this.LL.hashCode() * 31) + this.LLILZ.hashCode()) * 31) + this.LLILZIL.hashCode()) * 31) + this.LLILZLL.hashCode()) * 31;
        MarginDO marginDO = this.LLIZ;
        int iHashCode2 = (iHashCode + (marginDO != null ? marginDO.hashCode() : 0)) * 31;
        StellarActionDO stellarActionDO = this.LLJ;
        int iHashCode3 = (iHashCode2 + (stellarActionDO != null ? stellarActionDO.hashCode() : 0)) * 31;
        BackgroundDO backgroundDO = this.LLJI;
        int iHashCode4 = (((((iHashCode3 + (backgroundDO != null ? backgroundDO.hashCode() : 0)) * 31) + this.LLJIJIL.hashCode()) * 31) + this.LLJILJIL.hashCode()) * 31;
        GuideDO guideDO = this.LLJILLL;
        return iHashCode4 + (guideDO != null ? guideDO.hashCode() : 0);
    }

    @Override // X.InterfaceC1720550usH
    public final BackgroundDO LJFF() {
        return this.LLJI;
    }

    @Override // X.InterfaceC1720550usH
    public final MarginDO LJIJJ() {
        return this.LLIZ;
    }

    @Override // X.InterfaceC1720550usH
    public final MarginDO LJJI() {
        return this.LLIZLLLIL;
    }

    @Override // X.InterfaceC1720550usH
    public final String LLIIIZ() {
        return this.LLJILJILJ;
    }

    @Override // X.InterfaceC1720550usH
    public final C1720510usD LLILZLL() {
        return this.LLJIJIL;
    }

    @Override // X.InterfaceC1720550usH
    public final String LLJJIJIL() {
        return this.LLILLJJLI;
    }

    @Override // X.InterfaceC1720550usH
    public final Map<String, Object> LLL() {
        return this.LLILLL;
    }

    @Override // X.InterfaceC1720550usH
    public final StellarActionDO getAction() {
        return this.LLJ;
    }

    @Override // X.InterfaceC1720550usH
    public final String getHeight() {
        return this.LLILZIL;
    }

    @Override // X.InterfaceC1720550usH
    public final String getId() {
        return this.LL;
    }

    @Override // X.InterfaceC1720550usH
    public final EnumC1720670usT getTheme() {
        return this.LLJILJIL;
    }

    @Override // X.InterfaceC1720550usH
    public final String getType() {
        return this.LLILZ;
    }

    @Override // X.InterfaceC1720550usH
    public final String getWidth() {
        return this.LLILZLL;
    }

    public static C1720560usI LIZ(C1720560usI c1720560usI) {
        String str = c1720560usI.LL;
        String str2 = c1720560usI.LLILLJJLI;
        Map<String, Object> map = c1720560usI.LLILLL;
        String str3 = c1720560usI.LLILZ;
        String str4 = c1720560usI.LLILZIL;
        String str5 = c1720560usI.LLILZLL;
        MarginDO marginDO = c1720560usI.LLIZ;
        MarginDO marginDO2 = c1720560usI.LLIZLLLIL;
        StellarActionDO stellarActionDO = c1720560usI.LLJ;
        BackgroundDO backgroundDO = c1720560usI.LLJI;
        C1720510usD c1720510usD = c1720560usI.LLJIJIL;
        EnumC1720670usT enumC1720670usT = c1720560usI.LLJILJIL;
        String str6 = c1720560usI.LLJILJILJ;
        GuideDO guideDO = c1720560usI.LLJILLL;
        c1720560usI.getClass();
        return new C1720560usI(str, str2, map, str3, str4, str5, marginDO, marginDO2, stellarActionDO, backgroundDO, c1720510usD, enumC1720670usT, str6, guideDO, 0);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (!(interfaceC1891350zJl instanceof C1720560usI)) {
            return false;
        }
        return Intrinsics.LJFF(LIZ(this), LIZ((C1720560usI) interfaceC1891350zJl));
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return C1720540usG.LIZIZ(this, interfaceC1891350zJl);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1720560usI)) {
            return false;
        }
        C1720560usI c1720560usI = (C1720560usI) obj;
        if (!Intrinsics.LJFF(this.LL, c1720560usI.LL) || !Intrinsics.LJFF(this.LLILZ, c1720560usI.LLILZ) || !Intrinsics.LJFF(this.LLILZIL, c1720560usI.LLILZIL) || !Intrinsics.LJFF(this.LLILZLL, c1720560usI.LLILZLL) || !Intrinsics.LJFF(this.LLIZ, c1720560usI.LLIZ) || !Intrinsics.LJFF(this.LLJ, c1720560usI.LLJ) || !Intrinsics.LJFF(this.LLJI, c1720560usI.LLJI) || !Intrinsics.LJFF(this.LLJIJIL, c1720560usI.LLJIJIL) || this.LLJILJIL != c1720560usI.LLJILJIL || !Intrinsics.LJFF(this.LLJILLL, c1720560usI.LLJILLL)) {
            return false;
        }
        return true;
    }

    public C1720560usI(String str, String str2, Map<String, ? extends Object> map, String str3, String str4, String str5, MarginDO marginDO, MarginDO marginDO2, StellarActionDO stellarActionDO, BackgroundDO backgroundDO, C1720510usD c1720510usD, EnumC1720670usT enumC1720670usT, String str6, GuideDO guideDO, int i) {
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = map;
        this.LLILZ = str3;
        this.LLILZIL = str4;
        this.LLILZLL = str5;
        this.LLIZ = marginDO;
        this.LLIZLLLIL = marginDO2;
        this.LLJ = stellarActionDO;
        this.LLJI = backgroundDO;
        this.LLJIJIL = c1720510usD;
        this.LLJILJIL = enumC1720670usT;
        this.LLJILJILJ = str6;
        this.LLJILLL = guideDO;
        this.LLJJ = i;
    }
}
