package X;

import com.bytedance.speech.speechengine.SpeechEngineDefines;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0wTB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1781870wTB extends AbstractC1781930wTH implements InterfaceC1785270wYf {
    public final String LL;
    public final String LLILLJJLI;
    public final String LLILLL;
    public final String LLILZ;
    public final List<String> LLILZIL;
    public final EnumC1785280wYg LLILZLL;
    public final String LLIZ;
    public final Integer LLIZLLLIL;
    public final String LLJ;
    public final long LLJI;
    public final InterfaceC1785270wYf LLJIJIL;
    public final boolean LLJILJIL;

    public C1781870wTB() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1781870wTB)) {
            return false;
        }
        C1781870wTB c1781870wTB = (C1781870wTB) obj;
        return Intrinsics.LJFF(this.LL, c1781870wTB.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1781870wTB.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c1781870wTB.LLILLL) && Intrinsics.LJFF(this.LLILZ, c1781870wTB.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c1781870wTB.LLILZIL) && this.LLILZLL == c1781870wTB.LLILZLL && Intrinsics.LJFF(this.LLIZ, c1781870wTB.LLIZ) && Intrinsics.LJFF(this.LLIZLLLIL, c1781870wTB.LLIZLLLIL) && Intrinsics.LJFF(this.LLJ, c1781870wTB.LLJ) && this.LLJI == c1781870wTB.LLJI && Intrinsics.LJFF(this.LLJIJIL, c1781870wTB.LLJIJIL) && this.LLJILJIL == c1781870wTB.LLJILJIL;
    }

    public final int hashCode() {
        int iHashCode = this.LL.hashCode() * 31;
        String str = this.LLILLJJLI;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.LLILLL;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.LLILZ;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List<String> list = this.LLILZIL;
        int iHashCode5 = (((((iHashCode4 + (list == null ? 0 : list.hashCode())) * 31) + this.LLILZLL.hashCode()) * 31) + this.LLIZ.hashCode()) * 31;
        Integer num = this.LLIZLLLIL;
        int iHashCode6 = (iHashCode5 + (num == null ? 0 : num.hashCode())) * 31;
        String str4 = this.LLJ;
        int iHashCode7 = (((iHashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31) + C786410Ut5.Y2(this.LLJI)) * 31;
        InterfaceC1785270wYf interfaceC1785270wYf = this.LLJIJIL;
        return ((iHashCode7 + (interfaceC1785270wYf != null ? interfaceC1785270wYf.hashCode() : 0)) * 31) + C786410Ut5.Z2(this.LLJILJIL);
    }

    public final String toString() {
        return "SingleSkuGenericActionItem(title=" + this.LL + ", subtitle=" + this.LLILLJJLI + ", iconGeckoRes=" + this.LLILLL + ", iconSingleUrl=" + this.LLILZ + ", iconUrl=" + this.LLILZIL + ", itemType=" + this.LLILZLL + ", schema=" + this.LLIZ + ", submitButtonRes=" + this.LLIZLLLIL + ", submitButtonText=" + this.LLJ + ", skuID=" + this.LLJI + ", itemData=" + this.LLJIJIL + ", useMockIllustrator=" + this.LLJILJIL + ')';
    }

    @Override // X.InterfaceC1785270wYf
    public final long LIZ() {
        return this.LLJI;
    }

    @Override // X.InterfaceC1785270wYf
    public final Integer LIZLLL() {
        return this.LLIZLLLIL;
    }

    @Override // X.InterfaceC1785270wYf
    public final String LJ() {
        return this.LLJ;
    }

    @Override // X.InterfaceC1785270wYf
    public final EnumC1785280wYg getItemType() {
        return this.LLILZLL;
    }

    public C1781870wTB(String str, String str2, String str3, String str4, List list, EnumC1785280wYg enumC1785280wYg, String str5, Integer num, String str6, long j, InterfaceC1785270wYf interfaceC1785270wYf, boolean z, int i) {
        boolean z2 = z;
        str4 = (i & 8) != 0 ? null : str4;
        str6 = (i & 256) != 0 ? null : str6;
        InterfaceC1785270wYf interfaceC1785270wYf2 = (i & 1024) == 0 ? interfaceC1785270wYf : null;
        z2 = (i & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0 ? false : z2;
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = str3;
        this.LLILZ = str4;
        this.LLILZIL = list;
        this.LLILZLL = enumC1785280wYg;
        this.LLIZ = str5;
        this.LLIZLLLIL = num;
        this.LLJ = str6;
        this.LLJI = j;
        this.LLJIJIL = interfaceC1785270wYf2;
        this.LLJILJIL = z2;
    }
}
