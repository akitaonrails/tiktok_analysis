package X;

import com.bytedance.speech.speechengine.SpeechEngineDefines;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0PYb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C646670PYb implements InterfaceC1618170sD9<C646670PYb> {
    public final int LL;
    public final String LLILLJJLI;
    public final String LLILLL;
    public final boolean LLILZ;
    public final String LLILZIL;
    public final String LLILZLL;
    public final int LLIZ;
    public final boolean LLIZLLLIL;
    public final boolean LLJ;
    public final int LLJI;
    public final C0PSG LLJIJIL;
    public final int LLJILJIL;
    public final boolean LLJILJILJ;
    public final long LLJILLL;
    public final String LLJJ;
    public final Exception LLJJI;

    public C646670PYb() {
        this(0);
    }

    @Override // X.InterfaceC1282004zy
    public final boolean checkExtraParamKey() {
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C646670PYb)) {
            return false;
        }
        C646670PYb c646670PYb = (C646670PYb) obj;
        return this.LL == c646670PYb.LL && Intrinsics.LJFF(this.LLILLJJLI, c646670PYb.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c646670PYb.LLILLL) && this.LLILZ == c646670PYb.LLILZ && Intrinsics.LJFF(this.LLILZIL, c646670PYb.LLILZIL) && Intrinsics.LJFF(this.LLILZLL, c646670PYb.LLILZLL) && this.LLIZ == c646670PYb.LLIZ && this.LLIZLLLIL == c646670PYb.LLIZLLLIL && this.LLJ == c646670PYb.LLJ && this.LLJI == c646670PYb.LLJI && Intrinsics.LJFF(this.LLJIJIL, c646670PYb.LLJIJIL) && this.LLJILJIL == c646670PYb.LLJILJIL && this.LLJILJILJ == c646670PYb.LLJILJILJ && this.LLJILLL == c646670PYb.LLJILLL && Intrinsics.LJFF(this.LLJJ, c646670PYb.LLJJ) && Intrinsics.LJFF(this.LLJJI, c646670PYb.LLJJI);
    }

    public final int hashCode() {
        int iHashCode = ((((((((((((((((((this.LL * 31) + this.LLILLJJLI.hashCode()) * 31) + this.LLILLL.hashCode()) * 31) + C786410Ut5.Z2(this.LLILZ)) * 31) + this.LLILZIL.hashCode()) * 31) + this.LLILZLL.hashCode()) * 31) + this.LLIZ) * 31) + C786410Ut5.Z2(this.LLIZLLLIL)) * 31) + C786410Ut5.Z2(this.LLJ)) * 31) + this.LLJI) * 31;
        C0PSG c0psg = this.LLJIJIL;
        int iHashCode2 = (((((((((iHashCode + (c0psg == null ? 0 : c0psg.hashCode())) * 31) + this.LLJILJIL) * 31) + C786410Ut5.Z2(this.LLJILJILJ)) * 31) + C786410Ut5.Y2(this.LLJILLL)) * 31) + this.LLJJ.hashCode()) * 31;
        Exception exc = this.LLJJI;
        return iHashCode2 + (exc != null ? exc.hashCode() : 0);
    }

    public final String toString() {
        return "SearchTabFragmentState(curTabIndex=" + this.LL + ", enterFrom=" + this.LLILLJJLI + ", sugHint=" + this.LLILLL + ", needRefreshData=" + this.LLILZ + ", originKeyword=" + this.LLILZIL + ", searchFrom=" + this.LLILZLL + ", searchCorrectType=" + this.LLIZ + ", shouldShowCenterLoadingView=" + this.LLIZLLLIL + ", isEcoSearchChannel=" + this.LLJ + ", lastRefreshType=" + this.LLJI + ", lastFromFilterOption=" + this.LLJIJIL + ", registeredLynxDataKey=" + this.LLJILJIL + ", hasMore=" + this.LLJILJILJ + ", cursor=" + this.LLJILLL + ", tabSearchId=" + this.LLJJ + ", networkException=" + this.LLJJI + ')';
    }

    @Override // X.InterfaceC1282004zy
    public final Map<String, Object> filteredParams() {
        return keyParams();
    }

    @Override // X.InterfaceC1282004zy
    public final Map<String, Object> getExtraParam() {
        return C2097608Jq.LJ();
    }

    @Override // X.InterfaceC1282004zy
    public final Map<String, Object> keyParams() {
        return C2097608Jq.LJ();
    }

    public /* synthetic */ C646670PYb(int i) {
        this(0, "", "", true, "", "", 1, true, false, 0, null, -1, true, 0L, "", null);
    }

    public C646670PYb(int i, String str, String str2, boolean z, String str3, String str4, int i2, boolean z2, boolean z3, int i3, C0PSG c0psg, int i4, boolean z4, long j, String str5, Exception exc) {
        this.LL = i;
        this.LLILLJJLI = str;
        this.LLILLL = str2;
        this.LLILZ = z;
        this.LLILZIL = str3;
        this.LLILZLL = str4;
        this.LLIZ = i2;
        this.LLIZLLLIL = z2;
        this.LLJ = z3;
        this.LLJI = i3;
        this.LLJIJIL = c0psg;
        this.LLJILJIL = i4;
        this.LLJILJILJ = z4;
        this.LLJILLL = j;
        this.LLJJ = str5;
        this.LLJJI = exc;
        C0P8T.LIZ();
    }

    public static C646670PYb LIZ(C646670PYb c646670PYb, int i, String str, String str2, boolean z, String str3, String str4, int i2, boolean z2, boolean z3, int i3, C0PSG c0psg, int i4, boolean z4, long j, String str5, Exception exc, int i5) {
        Exception exc2 = exc;
        String str6 = str5;
        boolean z5 = z4;
        int i6 = i4;
        C0PSG c0psg2 = c0psg;
        int i7 = i3;
        boolean z6 = z3;
        boolean z7 = z2;
        int i8 = i2;
        String str7 = str4;
        String str8 = str3;
        boolean z8 = z;
        String str9 = str2;
        String str10 = str;
        long j2 = j;
        int i9 = i;
        if ((i5 & 1) != 0) {
            i9 = c646670PYb.LL;
        }
        if ((i5 & 2) != 0) {
            str10 = c646670PYb.LLILLJJLI;
        }
        if ((i5 & 4) != 0) {
            str9 = c646670PYb.LLILLL;
        }
        if ((i5 & 8) != 0) {
            z8 = c646670PYb.LLILZ;
        }
        if ((i5 & 16) != 0) {
            str8 = c646670PYb.LLILZIL;
        }
        if ((i5 & 32) != 0) {
            str7 = c646670PYb.LLILZLL;
        }
        if ((i5 & 64) != 0) {
            i8 = c646670PYb.LLIZ;
        }
        if ((i5 & 128) != 0) {
            z7 = c646670PYb.LLIZLLLIL;
        }
        if ((i5 & 256) != 0) {
            z6 = c646670PYb.LLJ;
        }
        if ((i5 & 512) != 0) {
            i7 = c646670PYb.LLJI;
        }
        if ((i5 & 1024) != 0) {
            c0psg2 = c646670PYb.LLJIJIL;
        }
        if ((i5 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            i6 = c646670PYb.LLJILJIL;
        }
        if ((i5 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0) {
            z5 = c646670PYb.LLJILJILJ;
        }
        if ((i5 & 8192) != 0) {
            j2 = c646670PYb.LLJILLL;
        }
        if ((i5 & 16384) != 0) {
            str6 = c646670PYb.LLJJ;
        }
        if ((i5 & 32768) != 0) {
            exc2 = c646670PYb.LLJJI;
        }
        c646670PYb.getClass();
        return new C646670PYb(i9, str10, str9, z8, str8, str7, i8, z7, z6, i7, c0psg2, i6, z5, j2, str6, exc2);
    }
}
