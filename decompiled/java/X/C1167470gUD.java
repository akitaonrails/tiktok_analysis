package X;

import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0gUD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1167470gUD implements InterfaceC636340Oxc<C1167470gUD, InterfaceC1891350zJl> {
    public final C627660Ojc<InterfaceC1891350zJl> LL;
    public final UrlModel LLILLJJLI;
    public final String LLILLL;
    public final long LLILZ;
    public final int LLILZIL;
    public final int LLILZLL;
    public final boolean LLIZ;
    public final C291001Au<Boolean> LLIZLLLIL;
    public final AbstractC1623806Xk<Integer> LLJ;
    public final int LLJI;
    public final Set<String> LLJIJIL;
    public final C291001Au<Map<String, Integer>> LLJILJIL;
    public final Set<String> LLJILJILJ;
    public final C291001Au<List<Aweme>> LLJILLL;
    public final List<Aweme> LLJJ;

    public C1167470gUD() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1167470gUD)) {
            return false;
        }
        C1167470gUD c1167470gUD = (C1167470gUD) obj;
        return Intrinsics.LJFF(this.LL, c1167470gUD.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1167470gUD.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c1167470gUD.LLILLL) && this.LLILZ == c1167470gUD.LLILZ && this.LLILZIL == c1167470gUD.LLILZIL && this.LLILZLL == c1167470gUD.LLILZLL && this.LLIZ == c1167470gUD.LLIZ && Intrinsics.LJFF(this.LLIZLLLIL, c1167470gUD.LLIZLLLIL) && Intrinsics.LJFF(this.LLJ, c1167470gUD.LLJ) && this.LLJI == c1167470gUD.LLJI && Intrinsics.LJFF(this.LLJIJIL, c1167470gUD.LLJIJIL) && Intrinsics.LJFF(this.LLJILJIL, c1167470gUD.LLJILJIL) && Intrinsics.LJFF(this.LLJILJILJ, c1167470gUD.LLJILJILJ) && Intrinsics.LJFF(this.LLJILLL, c1167470gUD.LLJILLL) && Intrinsics.LJFF(this.LLJJ, c1167470gUD.LLJJ);
    }

    public final int hashCode() {
        int iHashCode = this.LL.hashCode() * 31;
        UrlModel urlModel = this.LLILLJJLI;
        int iHashCode2 = (iHashCode + (urlModel == null ? 0 : urlModel.hashCode())) * 31;
        String str = this.LLILLL;
        int iHashCode3 = (((((((((iHashCode2 + (str == null ? 0 : str.hashCode())) * 31) + C786410Ut5.Y2(this.LLILZ)) * 31) + this.LLILZIL) * 31) + this.LLILZLL) * 31) + C786410Ut5.Z2(this.LLIZ)) * 31;
        C291001Au<Boolean> c291001Au = this.LLIZLLLIL;
        int iHashCode4 = (((((((iHashCode3 + (c291001Au == null ? 0 : c291001Au.hashCode())) * 31) + this.LLJ.hashCode()) * 31) + this.LLJI) * 31) + this.LLJIJIL.hashCode()) * 31;
        C291001Au<Map<String, Integer>> c291001Au2 = this.LLJILJIL;
        int iHashCode5 = (((iHashCode4 + (c291001Au2 == null ? 0 : c291001Au2.hashCode())) * 31) + this.LLJILJILJ.hashCode()) * 31;
        C291001Au<List<Aweme>> c291001Au3 = this.LLJILLL;
        return ((iHashCode5 + (c291001Au3 != null ? c291001Au3.hashCode() : 0)) * 31) + this.LLJJ.hashCode();
    }

    public final String toString() {
        return "EditPlaylistState(listState=" + this.LL + ", cover=" + this.LLILLJJLI + ", playlistName=" + this.LLILLL + ", partCount=" + this.LLILZ + ", mixLabel=" + this.LLILZIL + ", subOnlyItemCount=" + this.LLILZLL + ", isSubOnlyItemCountAccurate=" + this.LLIZ + ", playlistDeleteAction=" + this.LLIZLLLIL + ", commitPlaylistChangeAction=" + this.LLJ + ", headerAttachCount=" + this.LLJI + ", removeCandidates=" + this.LLJIJIL + ", exitedFromRemovePage=" + this.LLJILJIL + ", feedsToRemove=" + this.LLJILJILJ + ", addCandidates=" + this.LLJILLL + ", feedsToAdd=" + this.LLJJ + ')';
    }

    @Override // X.InterfaceC636270OxV
    public final List<InterfaceC1891350zJl> getListItemState() {
        return C627260Oiy.LIZ(this);
    }

    @Override // X.InterfaceC636270OxV
    public final AbstractC1623806Xk<C626160OhC> getLoadLatestState() {
        return C627260Oiy.LIZIZ(this);
    }

    @Override // X.InterfaceC636270OxV
    public final AbstractC1623806Xk<C626160OhC> getLoadMoreState() {
        return C627260Oiy.LIZJ(this);
    }

    @Override // X.InterfaceC636270OxV
    public final AbstractC1623806Xk<C626160OhC> getRefreshState() {
        return C627260Oiy.LIZLLL(this);
    }

    @Override // X.InterfaceC627270Oiz
    public final C627660Ojc<InterfaceC1891350zJl> getListState() {
        return this.LL;
    }

    public C1167470gUD(int i) {
        C627660Ojc c627660Ojc = new C627660Ojc(null, null, null, null, 15);
        C491101vh c491101vh = C491101vh.LIZ;
        C08CX c08cx = C08CX.INSTANCE;
        this(c627660Ojc, null, null, 0L, 0, 0, false, null, c491101vh, 0, c08cx, null, c08cx, null, C13BV.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1167470gUD(C627660Ojc<InterfaceC1891350zJl> c627660Ojc, UrlModel urlModel, String str, long j, int i, int i2, boolean z, C291001Au<Boolean> c291001Au, AbstractC1623806Xk<Integer> abstractC1623806Xk, int i3, Set<String> set, C291001Au<? extends Map<String, Integer>> c291001Au2, Set<String> set2, C291001Au<? extends List<? extends Aweme>> c291001Au3, List<? extends Aweme> list) {
        this.LL = c627660Ojc;
        this.LLILLJJLI = urlModel;
        this.LLILLL = str;
        this.LLILZ = j;
        this.LLILZIL = i;
        this.LLILZLL = i2;
        this.LLIZ = z;
        this.LLIZLLLIL = c291001Au;
        this.LLJ = abstractC1623806Xk;
        this.LLJI = i3;
        this.LLJIJIL = set;
        this.LLJILJIL = c291001Au2;
        this.LLJILJILJ = set2;
        this.LLJILLL = c291001Au3;
        this.LLJJ = list;
    }

    public static C1167470gUD LIZ(C1167470gUD c1167470gUD, C627660Ojc c627660Ojc, UrlModel urlModel, String str, long j, int i, int i2, boolean z, C291001Au c291001Au, AbstractC1623806Xk abstractC1623806Xk, int i3, Set set, C291001Au c291001Au2, Set set2, C291001Au c291001Au3, List list, int i4) {
        List list2 = list;
        C291001Au c291001Au4 = c291001Au3;
        Set set3 = set2;
        C291001Au c291001Au5 = c291001Au2;
        int i5 = i3;
        AbstractC1623806Xk abstractC1623806Xk2 = abstractC1623806Xk;
        C291001Au c291001Au6 = c291001Au;
        boolean z2 = z;
        int i6 = i2;
        long j2 = j;
        String str2 = str;
        UrlModel urlModel2 = urlModel;
        int i7 = i;
        Set set4 = set;
        C627660Ojc c627660Ojc2 = c627660Ojc;
        if ((i4 & 1) != 0) {
            c627660Ojc2 = c1167470gUD.LL;
        }
        if ((i4 & 2) != 0) {
            urlModel2 = c1167470gUD.LLILLJJLI;
        }
        if ((i4 & 4) != 0) {
            str2 = c1167470gUD.LLILLL;
        }
        if ((i4 & 8) != 0) {
            j2 = c1167470gUD.LLILZ;
        }
        if ((i4 & 16) != 0) {
            i7 = c1167470gUD.LLILZIL;
        }
        if ((i4 & 32) != 0) {
            i6 = c1167470gUD.LLILZLL;
        }
        if ((i4 & 64) != 0) {
            z2 = c1167470gUD.LLIZ;
        }
        if ((i4 & 128) != 0) {
            c291001Au6 = c1167470gUD.LLIZLLLIL;
        }
        if ((i4 & 256) != 0) {
            abstractC1623806Xk2 = c1167470gUD.LLJ;
        }
        if ((i4 & 512) != 0) {
            i5 = c1167470gUD.LLJI;
        }
        if ((i4 & 1024) != 0) {
            set4 = c1167470gUD.LLJIJIL;
        }
        if ((i4 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            c291001Au5 = c1167470gUD.LLJILJIL;
        }
        if ((i4 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0) {
            set3 = c1167470gUD.LLJILJILJ;
        }
        if ((i4 & 8192) != 0) {
            c291001Au4 = c1167470gUD.LLJILLL;
        }
        if ((i4 & 16384) != 0) {
            list2 = c1167470gUD.LLJJ;
        }
        c1167470gUD.getClass();
        return new C1167470gUD(c627660Ojc2, urlModel2, str2, j2, i7, i6, z2, c291001Au6, abstractC1623806Xk2, i5, set4, c291001Au5, set3, c291001Au4, list2);
    }
}
