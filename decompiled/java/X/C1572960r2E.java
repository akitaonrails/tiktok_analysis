package X;

import android.content.Intent;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import kotlin.jvm.internal.AFwS207S0000000_19;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0r2E, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1572960r2E implements InterfaceC2753014t, InterfaceC111300bX {
    public final long LL;
    public final int LLILLJJLI;
    public final String LLILLL;
    public final String LLILZ;
    public final Intent LLILZIL;
    public final boolean LLILZLL;
    public final boolean LLIZ;
    public final int LLIZLLLIL;
    public final boolean LLJ;
    public final String LLJI;
    public final String LLJIJIL;
    public final String LLJILJIL;
    public final C01GW LLJILJILJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1572960r2E)) {
            return false;
        }
        C1572960r2E c1572960r2E = (C1572960r2E) obj;
        return this.LL == c1572960r2E.LL && this.LLILLJJLI == c1572960r2E.LLILLJJLI && Intrinsics.LJFF(this.LLILLL, c1572960r2E.LLILLL) && Intrinsics.LJFF(this.LLILZ, c1572960r2E.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c1572960r2E.LLILZIL) && this.LLILZLL == c1572960r2E.LLILZLL && this.LLIZ == c1572960r2E.LLIZ && this.LLIZLLLIL == c1572960r2E.LLIZLLLIL && this.LLJ == c1572960r2E.LLJ && Intrinsics.LJFF(this.LLJI, c1572960r2E.LLJI) && Intrinsics.LJFF(this.LLJIJIL, c1572960r2E.LLJIJIL) && Intrinsics.LJFF(this.LLJILJIL, c1572960r2E.LLJILJIL);
    }

    public final int hashCode() {
        int iY2 = ((((((C786410Ut5.Y2(this.LL) * 31) + this.LLILLJJLI) * 31) + this.LLILLL.hashCode()) * 31) + this.LLILZ.hashCode()) * 31;
        Intent intent = this.LLILZIL;
        int iHashCode = (((((((((((iY2 + (intent == null ? 0 : intent.hashCode())) * 31) + C786410Ut5.Z2(this.LLILZLL)) * 31) + C786410Ut5.Z2(this.LLIZ)) * 31) + this.LLIZLLLIL) * 31) + C786410Ut5.Z2(this.LLJ)) * 31) + this.LLJI.hashCode()) * 31;
        String str = this.LLJIJIL;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.LLJILJIL;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return "SeriesListHierarchyData(creatorUid=" + this.LL + ", listSource=" + this.LLILLJJLI + ", enterFrom=" + this.LLILLL + ", sessionId=" + this.LLILZ + ", intent=" + this.LLILZIL + ", isFromAnchorFlow=" + this.LLILZLL + ", isPromoteFlow=" + this.LLIZ + ", anchorType=" + this.LLIZLLLIL + ", isAd=" + this.LLJ + ", rootScene=" + this.LLJI + ", navTitleLabel=" + this.LLJIJIL + ", seriesEnterEntrance=" + this.LLJILJIL + ')';
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C1572960r2E(long j, int i, String str, String str2, Intent intent, boolean z, String str3, int i2) {
        String str4;
        boolean z2 = (i2 & 64) != 0 ? false : z;
        if ((i2 & 512) != 0) {
            str4 = "1";
        } else {
            str4 = null;
        }
        this(j, i, str, str2, intent, false, z2, 0, false, str4, null, (i2 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) == 0 ? str3 : null);
    }

    public C1572960r2E(long j, int i, String str, String str2, Intent intent, boolean z, boolean z2, int i2, boolean z3, String str3, String str4, String str5) {
        this.LL = j;
        this.LLILLJJLI = i;
        this.LLILLL = str;
        this.LLILZ = str2;
        this.LLILZIL = intent;
        this.LLILZLL = z;
        this.LLIZ = z2;
        this.LLIZLLLIL = i2;
        this.LLJ = z3;
        this.LLJI = str3;
        this.LLJIJIL = str4;
        this.LLJILJIL = str5;
        this.LLJILJILJ = C452501pT.LIZIZ(AFwS207S0000000_19.get$arr$(742));
    }
}
