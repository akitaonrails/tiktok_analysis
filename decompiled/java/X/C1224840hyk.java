package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0hyk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1224840hyk extends AbstractC1223800hx4 {
    public final C1224850hyl LL;
    public final EnumC1224830hyj LLILLJJLI;
    public final String LLILLL;
    public final String LLILZ;
    public final UrlModel LLILZIL;
    public final String LLILZLL;
    public final String LLIZ;
    public final boolean LLIZLLLIL;
    public final boolean LLJ;
    public final Map<String, Object> LLJI;
    public final String LLJIJIL;
    public final boolean LLJILJIL;
    public final boolean LLJILJILJ;
    public final boolean LLJILLL;
    public final boolean LLJJ;
    public final boolean LLJJI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1224840hyk)) {
            return false;
        }
        C1224840hyk c1224840hyk = (C1224840hyk) obj;
        return Intrinsics.LJFF(this.LL, c1224840hyk.LL) && this.LLILLJJLI == c1224840hyk.LLILLJJLI && Intrinsics.LJFF(this.LLILLL, c1224840hyk.LLILLL) && Intrinsics.LJFF(this.LLILZ, c1224840hyk.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c1224840hyk.LLILZIL) && Intrinsics.LJFF(this.LLILZLL, c1224840hyk.LLILZLL) && Intrinsics.LJFF(this.LLIZ, c1224840hyk.LLIZ) && this.LLIZLLLIL == c1224840hyk.LLIZLLLIL && this.LLJ == c1224840hyk.LLJ && Intrinsics.LJFF(this.LLJI, c1224840hyk.LLJI) && Intrinsics.LJFF(this.LLJIJIL, c1224840hyk.LLJIJIL) && this.LLJILJIL == c1224840hyk.LLJILJIL && this.LLJILJILJ == c1224840hyk.LLJILJILJ && this.LLJILLL == c1224840hyk.LLJILLL && this.LLJJ == c1224840hyk.LLJJ && this.LLJJI == c1224840hyk.LLJJI;
    }

    public final int hashCode() {
        int iHashCode = ((((((this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode()) * 31) + this.LLILLL.hashCode()) * 31) + this.LLILZ.hashCode()) * 31;
        UrlModel urlModel = this.LLILZIL;
        int iHashCode2 = (((iHashCode + (urlModel == null ? 0 : urlModel.hashCode())) * 31) + this.LLILZLL.hashCode()) * 31;
        String str = this.LLIZ;
        return ((((((((((((((((((iHashCode2 + (str != null ? str.hashCode() : 0)) * 31) + C786410Ut5.Z2(this.LLIZLLLIL)) * 31) + C786410Ut5.Z2(this.LLJ)) * 31) + this.LLJI.hashCode()) * 31) + this.LLJIJIL.hashCode()) * 31) + C786410Ut5.Z2(this.LLJILJIL)) * 31) + C786410Ut5.Z2(this.LLJILJILJ)) * 31) + C786410Ut5.Z2(this.LLJILLL)) * 31) + C786410Ut5.Z2(this.LLJJ)) * 31) + C786410Ut5.Z2(this.LLJJI);
    }

    public final String LIZIZ() {
        return "SelectorContactItem(pageInfo=" + this.LL + ", variant=" + this.LLILLJJLI + ", contactType=" + this.LLILLL + ", id=" + this.LLILZ + ", name=" + this.LLILZLL + ", desc=" + this.LLIZ + ", isClickable=" + this.LLIZLLLIL + ", hasSelectBox=" + this.LLJ + ", keyword=" + this.LLJIJIL + ", isCurrentSelected=" + this.LLJILJIL + ", isCurrentDisable=" + this.LLJILJILJ + ", isAlwaysDisable=" + this.LLJILLL + ", isAlwaysHideSelectBox=" + this.LLJJ + ", showVerify=" + this.LLJJI + ')';
    }

    public final String toString() {
        SettingsManager.LIZLLL().getClass();
        if (SettingsManager.LJ("im_contact_selector_log_info_config", 0) != 0) {
            return LIZIZ();
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SelectorContactItem(name=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(", isCurrentSelected=");
        sbLIZ.append(this.LLJILJIL);
        sbLIZ.append(", isCurrentDisable=");
        sbLIZ.append(this.LLJILJILJ);
        sbLIZ.append(", isAlwaysDisable=");
        sbLIZ.append(this.LLJILLL);
        sbLIZ.append(", )");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.AbstractC1223800hx4, X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (!(interfaceC1891350zJl instanceof C1224840hyk)) {
            return false;
        }
        C1224840hyk c1224840hyk = (C1224840hyk) interfaceC1891350zJl;
        if (!Intrinsics.LJFF(c1224840hyk.LLILZ, this.LLILZ) || !Intrinsics.LJFF(c1224840hyk.LLILZIL, this.LLILZIL) || !Intrinsics.LJFF(c1224840hyk.LLILZLL, this.LLILZLL) || !Intrinsics.LJFF(c1224840hyk.LLIZ, this.LLIZ) || !Intrinsics.LJFF(c1224840hyk.LLJIJIL, this.LLJIJIL) || c1224840hyk.LLJILJIL != this.LLJILJIL || c1224840hyk.LLJILJILJ != this.LLJILJILJ || c1224840hyk.LLJ != this.LLJ || c1224840hyk.LLILLJJLI != this.LLILLJJLI) {
            return false;
        }
        return true;
    }

    @Override // X.AbstractC1223800hx4, X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (!(interfaceC1891350zJl instanceof C1224840hyk)) {
            return false;
        }
        return Intrinsics.LJFF(((C1224840hyk) interfaceC1891350zJl).LLILZ, this.LLILZ);
    }

    @Override // X.AbstractC1223800hx4, X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        if (!(interfaceC1891350zJl instanceof C1224840hyk)) {
            return null;
        }
        C1224840hyk c1224840hyk = (C1224840hyk) interfaceC1891350zJl;
        boolean z5 = !Intrinsics.LJFF(c1224840hyk.LLILZIL, this.LLILZIL);
        boolean z6 = !Intrinsics.LJFF(c1224840hyk.LLILZLL, this.LLILZLL);
        boolean z7 = !Intrinsics.LJFF(c1224840hyk.LLIZ, this.LLIZ);
        boolean z8 = !Intrinsics.LJFF(c1224840hyk.LLJIJIL, this.LLJIJIL);
        if (c1224840hyk.LLJILJIL != this.LLJILJIL) {
            z = true;
        } else {
            z = false;
        }
        if (c1224840hyk.LLJILJILJ != this.LLJILJILJ) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (c1224840hyk.LLJ != this.LLJ) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (c1224840hyk.LLILLJJLI != this.LLILLJJLI) {
            z4 = true;
        } else {
            z4 = false;
        }
        return new C1224810hyh(z5, z6, z7, z8, z, z2, z3, z4);
    }

    public static C1224840hyk LIZ(C1224840hyk c1224840hyk, C1224850hyl c1224850hyl, EnumC1224830hyj enumC1224830hyj, boolean z, Map map, String str, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, int i) {
        String str2;
        String str3;
        UrlModel urlModel;
        String str4;
        boolean z7;
        boolean z8 = z5;
        boolean z9 = z4;
        boolean z10 = z3;
        boolean z11 = z2;
        String str5 = str;
        Map map2 = map;
        boolean z12 = z6;
        EnumC1224830hyj enumC1224830hyj2 = enumC1224830hyj;
        boolean z13 = z;
        C1224850hyl c1224850hyl2 = c1224850hyl;
        if ((i & 1) != 0) {
            c1224850hyl2 = c1224840hyk.LL;
        }
        if ((i & 2) != 0) {
            enumC1224830hyj2 = c1224840hyk.LLILLJJLI;
        }
        String str6 = null;
        if ((i & 4) != 0) {
            str2 = c1224840hyk.LLILLL;
        } else {
            str2 = null;
        }
        if ((i & 8) != 0) {
            str3 = c1224840hyk.LLILZ;
        } else {
            str3 = null;
        }
        if ((i & 16) != 0) {
            urlModel = c1224840hyk.LLILZIL;
        } else {
            urlModel = null;
        }
        if ((i & 32) != 0) {
            str4 = c1224840hyk.LLILZLL;
        } else {
            str4 = null;
        }
        if ((i & 64) != 0) {
            str6 = c1224840hyk.LLIZ;
        }
        if ((i & 128) != 0) {
            z7 = c1224840hyk.LLIZLLLIL;
        } else {
            z7 = false;
        }
        if ((i & 256) != 0) {
            z13 = c1224840hyk.LLJ;
        }
        if ((i & 512) != 0) {
            map2 = c1224840hyk.LLJI;
        }
        if ((i & 1024) != 0) {
            str5 = c1224840hyk.LLJIJIL;
        }
        if ((i & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            z11 = c1224840hyk.LLJILJIL;
        }
        if ((i & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0) {
            z10 = c1224840hyk.LLJILJILJ;
        }
        if ((i & 8192) != 0) {
            z9 = c1224840hyk.LLJILLL;
        }
        if ((i & 16384) != 0) {
            z8 = c1224840hyk.LLJJ;
        }
        if ((i & 32768) != 0) {
            z12 = c1224840hyk.LLJJI;
        }
        c1224840hyk.getClass();
        return new C1224840hyk(c1224850hyl2, enumC1224830hyj2, str2, str3, urlModel, str4, str6, z7, z13, (Map<String, ? extends Object>) map2, str5, z11, z10, z9, z8, z12);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C1224840hyk(C1224850hyl c1224850hyl, EnumC1224830hyj enumC1224830hyj, String str, String str2, UrlModel urlModel, String str3, String str4, boolean z, boolean z2, Map map, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, int i) {
        String str5;
        boolean z8 = z7;
        boolean z9 = z6;
        boolean z10 = z5;
        boolean z11 = z4;
        boolean z12 = z3;
        if ((i & 1024) != 0) {
            str5 = "";
        } else {
            str5 = null;
        }
        this(c1224850hyl, enumC1224830hyj, str, str2, urlModel, str3, str4, z, z2, (Map<String, ? extends Object>) map, str5, (i & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0 ? false : z12, (i & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0 ? false : z11, (i & 8192) != 0 ? false : z10, (i & 16384) != 0 ? false : z9, (i & 32768) != 0 ? false : z8);
    }

    public C1224840hyk(C1224850hyl c1224850hyl, EnumC1224830hyj enumC1224830hyj, String str, String str2, UrlModel urlModel, String str3, String str4, boolean z, boolean z2, Map<String, ? extends Object> map, String str5, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        this.LL = c1224850hyl;
        this.LLILLJJLI = enumC1224830hyj;
        this.LLILLL = str;
        this.LLILZ = str2;
        this.LLILZIL = urlModel;
        this.LLILZLL = str3;
        this.LLIZ = str4;
        this.LLIZLLLIL = z;
        this.LLJ = z2;
        this.LLJI = map;
        this.LLJIJIL = str5;
        this.LLJILJIL = z3;
        this.LLJILJILJ = z4;
        this.LLJILLL = z5;
        this.LLJJ = z6;
        this.LLJJI = z7;
    }
}
