package X;

import com.bytedance.android.livesdk.chatroom.model.GlipBannerInfo;
import com.bytedance.android.livesdk.chatroom.model.PlaylistReminderInfo;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0xou, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1833780xou implements InterfaceC636340Oxc<C1833780xou, C1833770xot> {
    public final AbstractC1623806Xk<Boolean> LL;
    public final AbstractC1623806Xk<Boolean> LLILLJJLI;
    public final AbstractC1623806Xk<Boolean> LLILLL;
    public final AbstractC1623806Xk<Integer> LLILZ;
    public final AbstractC1623806Xk<Integer> LLILZIL;
    public final AbstractC1623806Xk<Boolean> LLILZLL;
    public final AbstractC1623806Xk<Boolean> LLIZ;
    public final AbstractC1623806Xk<GlipBannerInfo> LLIZLLLIL;
    public final AbstractC1623806Xk<PlaylistReminderInfo> LLJ;
    public final AbstractC1623806Xk<Unit> LLJI;
    public final C627660Ojc<C1833770xot> LLJIJIL;
    public final AbstractC1623806Xk<C626160OhC> LLJILJIL;
    public final AbstractC1623806Xk<C626160OhC> LLJILJILJ;

    public C1833780xou() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1833780xou)) {
            return false;
        }
        C1833780xou c1833780xou = (C1833780xou) obj;
        return Intrinsics.LJFF(this.LL, c1833780xou.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1833780xou.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c1833780xou.LLILLL) && Intrinsics.LJFF(this.LLILZ, c1833780xou.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c1833780xou.LLILZIL) && Intrinsics.LJFF(this.LLILZLL, c1833780xou.LLILZLL) && Intrinsics.LJFF(this.LLIZ, c1833780xou.LLIZ) && Intrinsics.LJFF(this.LLIZLLLIL, c1833780xou.LLIZLLLIL) && Intrinsics.LJFF(this.LLJ, c1833780xou.LLJ) && Intrinsics.LJFF(this.LLJI, c1833780xou.LLJI) && Intrinsics.LJFF(this.LLJIJIL, c1833780xou.LLJIJIL) && Intrinsics.LJFF(this.LLJILJIL, c1833780xou.LLJILJIL) && Intrinsics.LJFF(this.LLJILJILJ, c1833780xou.LLJILJILJ);
    }

    public final int hashCode() {
        return (((((((((((((((((((((((this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode()) * 31) + this.LLILLL.hashCode()) * 31) + this.LLILZ.hashCode()) * 31) + this.LLILZIL.hashCode()) * 31) + this.LLILZLL.hashCode()) * 31) + this.LLIZ.hashCode()) * 31) + this.LLIZLLLIL.hashCode()) * 31) + this.LLJ.hashCode()) * 31) + this.LLJI.hashCode()) * 31) + this.LLJIJIL.hashCode()) * 31) + this.LLJILJIL.hashCode()) * 31) + this.LLJILJILJ.hashCode();
    }

    public final String toString() {
        return "LiveReplayListState(loadCacheState=" + this.LL + ", showEmptyView=" + this.LLILLJJLI + ", listRefreshState=" + this.LLILLL + ", replayInfoStyle=" + this.LLILZ + ", amplifyStatus=" + this.LLILZIL + ", showInboxSubPopUp=" + this.LLILZLL + ", subResult=" + this.LLIZ + ", glipInfo=" + this.LLIZLLLIL + ", playlistInfo=" + this.LLJ + ", guideCheckDone=" + this.LLJI + ", listState=" + this.LLJIJIL + ", refreshState=" + this.LLJILJIL + ", loadMoreState=" + this.LLJILJILJ + ')';
    }

    @Override // X.InterfaceC636270OxV
    public final List<C1833770xot> getListItemState() {
        return C627260Oiy.LIZ(this);
    }

    @Override // X.InterfaceC636270OxV
    public final AbstractC1623806Xk<C626160OhC> getLoadLatestState() {
        return C627260Oiy.LIZIZ(this);
    }

    @Override // X.InterfaceC627270Oiz
    public final C627660Ojc<C1833770xot> getListState() {
        return this.LLJIJIL;
    }

    @Override // X.InterfaceC636270OxV
    public final AbstractC1623806Xk<C626160OhC> getLoadMoreState() {
        return this.LLJILJILJ;
    }

    @Override // X.InterfaceC636270OxV
    public final AbstractC1623806Xk<C626160OhC> getRefreshState() {
        return this.LLJILJIL;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C1833780xou(int i) {
        C491101vh c491101vh = C491101vh.LIZ;
        this(c491101vh, c491101vh, c491101vh, c491101vh, c491101vh, c491101vh, c491101vh, c491101vh, c491101vh, c491101vh, new C627660Ojc(null, null, null, null, 15), c491101vh, c491101vh);
    }

    public C1833780xou(AbstractC1623806Xk<Boolean> abstractC1623806Xk, AbstractC1623806Xk<Boolean> abstractC1623806Xk2, AbstractC1623806Xk<Boolean> abstractC1623806Xk3, AbstractC1623806Xk<Integer> abstractC1623806Xk4, AbstractC1623806Xk<Integer> abstractC1623806Xk5, AbstractC1623806Xk<Boolean> abstractC1623806Xk6, AbstractC1623806Xk<Boolean> abstractC1623806Xk7, AbstractC1623806Xk<GlipBannerInfo> abstractC1623806Xk8, AbstractC1623806Xk<PlaylistReminderInfo> abstractC1623806Xk9, AbstractC1623806Xk<Unit> abstractC1623806Xk10, C627660Ojc<C1833770xot> c627660Ojc, AbstractC1623806Xk<C626160OhC> abstractC1623806Xk11, AbstractC1623806Xk<C626160OhC> abstractC1623806Xk12) {
        this.LL = abstractC1623806Xk;
        this.LLILLJJLI = abstractC1623806Xk2;
        this.LLILLL = abstractC1623806Xk3;
        this.LLILZ = abstractC1623806Xk4;
        this.LLILZIL = abstractC1623806Xk5;
        this.LLILZLL = abstractC1623806Xk6;
        this.LLIZ = abstractC1623806Xk7;
        this.LLIZLLLIL = abstractC1623806Xk8;
        this.LLJ = abstractC1623806Xk9;
        this.LLJI = abstractC1623806Xk10;
        this.LLJIJIL = c627660Ojc;
        this.LLJILJIL = abstractC1623806Xk11;
        this.LLJILJILJ = abstractC1623806Xk12;
    }

    public static C1833780xou LIZ(C1833780xou c1833780xou, AbstractC1623806Xk abstractC1623806Xk, C1623606Xi c1623606Xi, AbstractC1623806Xk abstractC1623806Xk2, C1623606Xi c1623606Xi2, C1623606Xi c1623606Xi3, C1623606Xi c1623606Xi4, C1623606Xi c1623606Xi5, C1623606Xi c1623606Xi6, C1623606Xi c1623606Xi7, C1623606Xi c1623606Xi8, C627660Ojc c627660Ojc, C1623606Xi c1623606Xi9, int i) {
        AbstractC1623806Xk<C626160OhC> abstractC1623806Xk3;
        AbstractC1623806Xk<C626160OhC> abstractC1623806Xk4 = c1623606Xi9;
        C627660Ojc c627660Ojc2 = c627660Ojc;
        AbstractC1623806Xk<Unit> abstractC1623806Xk5 = c1623606Xi8;
        AbstractC1623806Xk<PlaylistReminderInfo> abstractC1623806Xk6 = c1623606Xi7;
        AbstractC1623806Xk<GlipBannerInfo> abstractC1623806Xk7 = c1623606Xi6;
        AbstractC1623806Xk<Boolean> abstractC1623806Xk8 = c1623606Xi5;
        AbstractC1623806Xk<Boolean> abstractC1623806Xk9 = c1623606Xi4;
        AbstractC1623806Xk<Integer> abstractC1623806Xk10 = c1623606Xi3;
        AbstractC1623806Xk<Integer> abstractC1623806Xk11 = c1623606Xi2;
        AbstractC1623806Xk abstractC1623806Xk12 = abstractC1623806Xk2;
        AbstractC1623806Xk<Boolean> abstractC1623806Xk13 = c1623606Xi;
        AbstractC1623806Xk abstractC1623806Xk14 = abstractC1623806Xk;
        if ((i & 1) != 0) {
            abstractC1623806Xk14 = c1833780xou.LL;
        }
        if ((i & 2) != 0) {
            abstractC1623806Xk13 = c1833780xou.LLILLJJLI;
        }
        if ((i & 4) != 0) {
            abstractC1623806Xk12 = c1833780xou.LLILLL;
        }
        if ((i & 8) != 0) {
            abstractC1623806Xk11 = c1833780xou.LLILZ;
        }
        if ((i & 16) != 0) {
            abstractC1623806Xk10 = c1833780xou.LLILZIL;
        }
        if ((i & 32) != 0) {
            abstractC1623806Xk9 = c1833780xou.LLILZLL;
        }
        if ((i & 64) != 0) {
            abstractC1623806Xk8 = c1833780xou.LLIZ;
        }
        if ((i & 128) != 0) {
            abstractC1623806Xk7 = c1833780xou.LLIZLLLIL;
        }
        if ((i & 256) != 0) {
            abstractC1623806Xk6 = c1833780xou.LLJ;
        }
        if ((i & 512) != 0) {
            abstractC1623806Xk5 = c1833780xou.LLJI;
        }
        if ((i & 1024) != 0) {
            c627660Ojc2 = c1833780xou.LLJIJIL;
        }
        if ((i & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            abstractC1623806Xk4 = c1833780xou.LLJILJIL;
        }
        if ((i & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0) {
            abstractC1623806Xk3 = c1833780xou.LLJILJILJ;
        } else {
            abstractC1623806Xk3 = null;
        }
        c1833780xou.getClass();
        return new C1833780xou(abstractC1623806Xk14, abstractC1623806Xk13, abstractC1623806Xk12, abstractC1623806Xk11, abstractC1623806Xk10, abstractC1623806Xk9, abstractC1623806Xk8, abstractC1623806Xk7, abstractC1623806Xk6, abstractC1623806Xk5, c627660Ojc2, abstractC1623806Xk4, abstractC1623806Xk3);
    }
}
