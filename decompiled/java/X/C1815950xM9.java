package X;

import com.bytedance.speech.speechengine.SpeechEngineDefines;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0xM9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1815950xM9 implements InterfaceC636340Oxc<C1815950xM9, InterfaceC1891350zJl> {
    public final C627660Ojc<InterfaceC1891350zJl> LL;
    public final int LLILLJJLI;
    public final int LLILLL;
    public final int LLILZ;
    public final int LLILZIL;
    public final int LLILZLL;
    public final EnumC1815680xLi LLIZ;
    public final C291001Au<Boolean> LLIZLLLIL;
    public final C291001Au<Pair<AbstractC1814790xKH, Integer>> LLJ;
    public final C291001Au<Boolean> LLJI;
    public final C291001Au<Boolean> LLJIJIL;
    public final C291001Au<Boolean> LLJILJIL;
    public final C291001Au<Boolean> LLJILJILJ;

    public C1815950xM9() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1815950xM9)) {
            return false;
        }
        C1815950xM9 c1815950xM9 = (C1815950xM9) obj;
        return Intrinsics.LJFF(this.LL, c1815950xM9.LL) && this.LLILLJJLI == c1815950xM9.LLILLJJLI && this.LLILLL == c1815950xM9.LLILLL && this.LLILZ == c1815950xM9.LLILZ && this.LLILZIL == c1815950xM9.LLILZIL && this.LLILZLL == c1815950xM9.LLILZLL && this.LLIZ == c1815950xM9.LLIZ && Intrinsics.LJFF(this.LLIZLLLIL, c1815950xM9.LLIZLLLIL) && Intrinsics.LJFF(this.LLJ, c1815950xM9.LLJ) && Intrinsics.LJFF(this.LLJI, c1815950xM9.LLJI) && Intrinsics.LJFF(this.LLJIJIL, c1815950xM9.LLJIJIL) && Intrinsics.LJFF(this.LLJILJIL, c1815950xM9.LLJILJIL) && Intrinsics.LJFF(this.LLJILJILJ, c1815950xM9.LLJILJILJ);
    }

    public final int hashCode() {
        return (((((((((((((((((((((((this.LL.hashCode() * 31) + this.LLILLJJLI) * 31) + this.LLILLL) * 31) + this.LLILZ) * 31) + this.LLILZIL) * 31) + this.LLILZLL) * 31) + this.LLIZ.hashCode()) * 31) + this.LLIZLLLIL.hashCode()) * 31) + this.LLJ.hashCode()) * 31) + this.LLJI.hashCode()) * 31) + this.LLJIJIL.hashCode()) * 31) + this.LLJILJIL.hashCode()) * 31) + this.LLJILJILJ.hashCode();
    }

    public final String toString() {
        return "LiveBoardsPageState(listState=" + this.LL + ", barAddStatus=" + this.LLILLJJLI + ", totalCount=" + this.LLILLL + ", maxLimitCount=" + this.LLILZ + ", boardSetsApprovedCnt=" + this.LLILZIL + ", boardSetsRejectedCnt=" + this.LLILZLL + ", selectedTab=" + this.LLIZ + ", createAction=" + this.LLIZLLLIL + ", bcAction=" + this.LLJ + ", deleteAction=" + this.LLJI + ", dismissAction=" + this.LLJIJIL + ", visibilityAction=" + this.LLJILJIL + ", isDisplayed=" + this.LLJILJILJ + ')';
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

    public /* synthetic */ C1815950xM9(int i) {
        C627660Ojc c627660Ojc = new C627660Ojc(null, null, null, null, 15);
        EnumC1815680xLi enumC1815680xLi = EnumC1815680xLi.GENERAL;
        Boolean bool = Boolean.FALSE;
        this(c627660Ojc, 0, 0, 0, 0, 0, enumC1815680xLi, new C291001Au(bool), new C291001Au(new Pair(null, 0)), new C291001Au(bool), new C291001Au(bool), new C291001Au(Boolean.TRUE), new C291001Au(bool));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1815950xM9(C627660Ojc<InterfaceC1891350zJl> c627660Ojc, int i, int i2, int i3, int i4, int i5, EnumC1815680xLi enumC1815680xLi, C291001Au<Boolean> c291001Au, C291001Au<? extends Pair<? extends AbstractC1814790xKH, Integer>> c291001Au2, C291001Au<Boolean> c291001Au3, C291001Au<Boolean> c291001Au4, C291001Au<Boolean> c291001Au5, C291001Au<Boolean> c291001Au6) {
        this.LL = c627660Ojc;
        this.LLILLJJLI = i;
        this.LLILLL = i2;
        this.LLILZ = i3;
        this.LLILZIL = i4;
        this.LLILZLL = i5;
        this.LLIZ = enumC1815680xLi;
        this.LLIZLLLIL = c291001Au;
        this.LLJ = c291001Au2;
        this.LLJI = c291001Au3;
        this.LLJIJIL = c291001Au4;
        this.LLJILJIL = c291001Au5;
        this.LLJILJILJ = c291001Au6;
    }

    public static C1815950xM9 LIZ(C1815950xM9 c1815950xM9, C627660Ojc c627660Ojc, int i, int i2, int i3, int i4, int i5, EnumC1815680xLi enumC1815680xLi, C291001Au c291001Au, C291001Au c291001Au2, C291001Au c291001Au3, C291001Au c291001Au4, C291001Au c291001Au5, C291001Au c291001Au6, int i6) {
        C291001Au c291001Au7 = c291001Au6;
        C291001Au c291001Au8 = c291001Au5;
        C291001Au c291001Au9 = c291001Au4;
        C291001Au c291001Au10 = c291001Au3;
        C291001Au c291001Au11 = c291001Au2;
        C291001Au c291001Au12 = c291001Au;
        EnumC1815680xLi enumC1815680xLi2 = enumC1815680xLi;
        int i7 = i5;
        int i8 = i4;
        int i9 = i3;
        int i10 = i2;
        int i11 = i;
        C627660Ojc c627660Ojc2 = c627660Ojc;
        if ((i6 & 1) != 0) {
            c627660Ojc2 = c1815950xM9.LL;
        }
        if ((i6 & 2) != 0) {
            i11 = c1815950xM9.LLILLJJLI;
        }
        if ((i6 & 4) != 0) {
            i10 = c1815950xM9.LLILLL;
        }
        if ((i6 & 8) != 0) {
            i9 = c1815950xM9.LLILZ;
        }
        if ((i6 & 16) != 0) {
            i8 = c1815950xM9.LLILZIL;
        }
        if ((i6 & 32) != 0) {
            i7 = c1815950xM9.LLILZLL;
        }
        if ((i6 & 64) != 0) {
            enumC1815680xLi2 = c1815950xM9.LLIZ;
        }
        if ((i6 & 128) != 0) {
            c291001Au12 = c1815950xM9.LLIZLLLIL;
        }
        if ((i6 & 256) != 0) {
            c291001Au11 = c1815950xM9.LLJ;
        }
        if ((i6 & 512) != 0) {
            c291001Au10 = c1815950xM9.LLJI;
        }
        if ((i6 & 1024) != 0) {
            c291001Au9 = c1815950xM9.LLJIJIL;
        }
        if ((i6 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            c291001Au8 = c1815950xM9.LLJILJIL;
        }
        if ((i6 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0) {
            c291001Au7 = c1815950xM9.LLJILJILJ;
        }
        c1815950xM9.getClass();
        return new C1815950xM9(c627660Ojc2, i11, i10, i9, i8, i7, enumC1815680xLi2, c291001Au12, c291001Au11, c291001Au10, c291001Au9, c291001Au8, c291001Au7);
    }
}
