package X;

import com.bytedance.speech.speechengine.SpeechEngineDefines;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Q2t, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C664010Q2t implements C0PWT {
    public final String LL;
    public final String LLILLJJLI;
    public final boolean LLILLL;
    public final boolean LLILZ;
    public final String LLILZIL;
    public final String LLILZLL;
    public final String LLIZ;
    public final int LLIZLLLIL;
    public final int LLJ;
    public final boolean LLJI;
    public final String LLJIJIL;
    public final String LLJILJIL;

    public C664010Q2t() {
        this(null, 4095);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C664010Q2t)) {
            return false;
        }
        C664010Q2t c664010Q2t = (C664010Q2t) obj;
        return Intrinsics.LJFF(this.LL, c664010Q2t.LL) && Intrinsics.LJFF(this.LLILLJJLI, c664010Q2t.LLILLJJLI) && this.LLILLL == c664010Q2t.LLILLL && this.LLILZ == c664010Q2t.LLILZ && Intrinsics.LJFF(this.LLILZIL, c664010Q2t.LLILZIL) && Intrinsics.LJFF(this.LLILZLL, c664010Q2t.LLILZLL) && Intrinsics.LJFF(this.LLIZ, c664010Q2t.LLIZ) && this.LLIZLLLIL == c664010Q2t.LLIZLLLIL && this.LLJ == c664010Q2t.LLJ && this.LLJI == c664010Q2t.LLJI && Intrinsics.LJFF(this.LLJIJIL, c664010Q2t.LLJIJIL) && Intrinsics.LJFF(this.LLJILJIL, c664010Q2t.LLJILJIL);
    }

    public final int hashCode() {
        int iHashCode = ((((((((((((((((((this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode()) * 31) + C786410Ut5.Z2(this.LLILLL)) * 31) + C786410Ut5.Z2(this.LLILZ)) * 31) + this.LLILZIL.hashCode()) * 31) + this.LLILZLL.hashCode()) * 31) + this.LLIZ.hashCode()) * 31) + this.LLIZLLLIL) * 31) + this.LLJ) * 31) + C786410Ut5.Z2(this.LLJI)) * 31;
        String str = this.LLJIJIL;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.LLJILJIL;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return "SearchEntranceCommonAction(searchEntrance=" + this.LL + ", previousPage=" + this.LLILLJJLI + ", shouldShowScanView=" + this.LLILLL + ", shouldShowSug=" + this.LLILZ + ", isFromComment=" + this.LLILZIL + ", isFromVideo=" + this.LLILZLL + ", isFromVideoOld=" + this.LLIZ + ", backPressFlag=" + this.LLIZLLLIL + ", feedSearchBarFlag=" + this.LLJ + ", keepTabPosition=" + this.LLJI + ", takoProcessId=" + this.LLJIJIL + ", takoMessageId=" + this.LLJILJIL + ')';
    }

    static {
        C0Q3E.LJFF().Ww1().LIZIZ(C13LE.LIZ(C664010Q2t.class), new C664040Q2w());
    }

    @Override // X.C0PWT
    public final boolean isLog() {
        return C0P9U.LIZ();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C664010Q2t(String str, int i) {
        String str2;
        boolean z;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7 = (i & 1) != 0 ? "discovery" : str;
        if ((i & 2) != 0) {
            str2 = "";
        } else {
            str2 = null;
        }
        if ((i & 4) != 0) {
            z = true;
        } else {
            z = false;
        }
        boolean z2 = (i & 8) != 0;
        if ((i & 16) != 0) {
            str3 = "";
        } else {
            str3 = null;
        }
        if ((i & 32) != 0) {
            str4 = "";
        } else {
            str4 = null;
        }
        if ((i & 64) != 0) {
            str5 = "";
        } else {
            str5 = null;
        }
        if ((i & 1024) != 0) {
            str6 = "";
        } else {
            str6 = null;
        }
        this(str7, str2, z, z2, str3, str4, 0, 0, false, str5, str6, (i & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) == 0 ? null : "");
    }

    public C664010Q2t(String str, String str2, boolean z, boolean z2, String str3, String str4, int i, int i2, boolean z3, String str5, String str6, String str7) {
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = z;
        this.LLILZ = z2;
        this.LLILZIL = str3;
        this.LLILZLL = str4;
        this.LLIZ = str5;
        this.LLIZLLLIL = i;
        this.LLJ = i2;
        this.LLJI = z3;
        this.LLJIJIL = str6;
        this.LLJILJIL = str7;
    }
}
