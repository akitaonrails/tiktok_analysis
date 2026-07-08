package X;

import com.bytedance.pipo.stellar.base.model.BackgroundDO;
import com.bytedance.pipo.stellar.base.model.MarginDO;
import com.bytedance.pipo.stellar.base.model.prop.StellarActionDO;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0usF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1720530usF implements InterfaceC1720550usH {
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
    public final EnumC1720670usT LLJIJIL;
    public final C1720510usD LLJILJIL;
    public final String LLJILJILJ;
    public final String LLJILLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1720530usF)) {
            return false;
        }
        C1720530usF c1720530usF = (C1720530usF) obj;
        return Intrinsics.LJFF(this.LL, c1720530usF.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1720530usF.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c1720530usF.LLILLL) && Intrinsics.LJFF(this.LLILZ, c1720530usF.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c1720530usF.LLILZIL) && Intrinsics.LJFF(this.LLILZLL, c1720530usF.LLILZLL) && Intrinsics.LJFF(this.LLIZ, c1720530usF.LLIZ) && Intrinsics.LJFF(this.LLIZLLLIL, c1720530usF.LLIZLLLIL) && Intrinsics.LJFF(this.LLJ, c1720530usF.LLJ) && Intrinsics.LJFF(this.LLJI, c1720530usF.LLJI) && this.LLJIJIL == c1720530usF.LLJIJIL && Intrinsics.LJFF(this.LLJILJIL, c1720530usF.LLJILJIL) && Intrinsics.LJFF(this.LLJILJILJ, c1720530usF.LLJILJILJ) && Intrinsics.LJFF(this.LLJILLL, c1720530usF.LLJILLL);
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        int iHashCode = this.LL.hashCode() * 31;
        String str = this.LLILLJJLI;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Map<String, Object> map = this.LLILLL;
        int iHashCode3 = (((((((iHashCode2 + (map == null ? 0 : map.hashCode())) * 31) + this.LLILZ.hashCode()) * 31) + this.LLILZIL.hashCode()) * 31) + this.LLILZLL.hashCode()) * 31;
        MarginDO marginDO = this.LLIZ;
        int iHashCode4 = (iHashCode3 + (marginDO == null ? 0 : marginDO.hashCode())) * 31;
        MarginDO marginDO2 = this.LLIZLLLIL;
        int iHashCode5 = (iHashCode4 + (marginDO2 == null ? 0 : marginDO2.hashCode())) * 31;
        StellarActionDO stellarActionDO = this.LLJ;
        int iHashCode6 = (iHashCode5 + (stellarActionDO == null ? 0 : stellarActionDO.hashCode())) * 31;
        BackgroundDO backgroundDO = this.LLJI;
        int iHashCode7 = (((((iHashCode6 + (backgroundDO == null ? 0 : backgroundDO.hashCode())) * 31) + this.LLJIJIL.hashCode()) * 31) + this.LLJILJIL.hashCode()) * 31;
        String str2 = this.LLJILJILJ;
        int iHashCode8 = (iHashCode7 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.LLJILLL;
        return iHashCode8 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        return "StellarWebViewWidget(id=" + this.LL + ", sectionId=" + this.LLILLJJLI + ", sectionTrackingParams=" + this.LLILLL + ", type=" + this.LLILZ + ", height=" + this.LLILZIL + ", width=" + this.LLILZLL + ", margin=" + this.LLIZ + ", padding=" + this.LLIZLLLIL + ", action=" + this.LLJ + ", background=" + this.LLJI + ", theme=" + this.LLJIJIL + ", trackingConfig=" + this.LLJILJIL + ", layoutGravity=" + this.LLJILJILJ + ", url=" + this.LLJILLL + ')';
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
        return this.LLJILJIL;
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
        return this.LLJIJIL;
    }

    @Override // X.InterfaceC1720550usH
    public final String getType() {
        return this.LLILZ;
    }

    @Override // X.InterfaceC1720550usH
    public final String getWidth() {
        return this.LLILZLL;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return C1720540usG.LIZ(this, interfaceC1891350zJl);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return C1720540usG.LIZIZ(this, interfaceC1891350zJl);
    }

    public C1720530usF(String str, String str2, Map<String, ? extends Object> map, String str3, String str4, String str5, MarginDO marginDO, MarginDO marginDO2, StellarActionDO stellarActionDO, BackgroundDO backgroundDO, EnumC1720670usT enumC1720670usT, C1720510usD c1720510usD, String str6, String str7) {
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
        this.LLJIJIL = enumC1720670usT;
        this.LLJILJIL = c1720510usD;
        this.LLJILJILJ = str6;
        this.LLJILLL = str7;
    }
}
