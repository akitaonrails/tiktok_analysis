package X;

import com.bytedance.android.livesdk.chatroom.model.RoomReplay;
import com.bytedance.android.livesdk.livesetting.highlight.LiveHighlightMusicDefaultVolumeSetting;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.aweme.live.livehostimpl.livereply.quickpost.data.PostConfigModel;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0xqW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1834780xqW implements InterfaceC0148002o {
    public final AbstractC1623806Xk<Integer> LL;
    public final AbstractC1623806Xk<RoomReplay> LLILLJJLI;
    public final C291001Au<List<C1833730xop>> LLILLL;
    public final AbstractC1623806Xk<C1834580xqC> LLILZ;
    public final AbstractC1623806Xk<C1834580xqC> LLILZIL;
    public final AbstractC1623806Xk<PostConfigModel> LLILZLL;
    public final C291001Au<C1834580xqC> LLIZ;
    public final C291001Au<Boolean> LLIZLLLIL;
    public final C291001Au<Boolean> LLJ;
    public final AbstractC1623806Xk<Integer> LLJI;
    public final C291001Au<Pair<Long, EnumC1834800xqY>> LLJIJIL;
    public final C291001Au<List<Long>> LLJILJIL;
    public final AbstractC1623806Xk<Pair<Long, Long>> LLJILJILJ;
    public final C291001Au<C344050DeF> LLJILLL;
    public final C291001Au<C1834790xqX> LLJJ;
    public final C291001Au<Boolean> LLJJI;
    public final C291001Au<Integer> LLJJIII;
    public final C291001Au<Integer> LLJJIJI;
    public final C291001Au<C044700Eb> LLJJIJIIJIL;

    public C1834780xqW() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1834780xqW)) {
            return false;
        }
        C1834780xqW c1834780xqW = (C1834780xqW) obj;
        return Intrinsics.LJFF(this.LL, c1834780xqW.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1834780xqW.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c1834780xqW.LLILLL) && Intrinsics.LJFF(this.LLILZ, c1834780xqW.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c1834780xqW.LLILZIL) && Intrinsics.LJFF(this.LLILZLL, c1834780xqW.LLILZLL) && Intrinsics.LJFF(this.LLIZ, c1834780xqW.LLIZ) && Intrinsics.LJFF(this.LLIZLLLIL, c1834780xqW.LLIZLLLIL) && Intrinsics.LJFF(this.LLJ, c1834780xqW.LLJ) && Intrinsics.LJFF(this.LLJI, c1834780xqW.LLJI) && Intrinsics.LJFF(this.LLJIJIL, c1834780xqW.LLJIJIL) && Intrinsics.LJFF(this.LLJILJIL, c1834780xqW.LLJILJIL) && Intrinsics.LJFF(this.LLJILJILJ, c1834780xqW.LLJILJILJ) && Intrinsics.LJFF(this.LLJILLL, c1834780xqW.LLJILLL) && Intrinsics.LJFF(this.LLJJ, c1834780xqW.LLJJ) && Intrinsics.LJFF(this.LLJJI, c1834780xqW.LLJJI) && Intrinsics.LJFF(this.LLJJIII, c1834780xqW.LLJJIII) && Intrinsics.LJFF(this.LLJJIJI, c1834780xqW.LLJJIJI) && Intrinsics.LJFF(this.LLJJIJIIJIL, c1834780xqW.LLJJIJIIJIL);
    }

    public final int hashCode() {
        return (((((((((((((((((((((((((((((((((((this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode()) * 31) + this.LLILLL.hashCode()) * 31) + this.LLILZ.hashCode()) * 31) + this.LLILZIL.hashCode()) * 31) + this.LLILZLL.hashCode()) * 31) + this.LLIZ.hashCode()) * 31) + this.LLIZLLLIL.hashCode()) * 31) + this.LLJ.hashCode()) * 31) + this.LLJI.hashCode()) * 31) + this.LLJIJIL.hashCode()) * 31) + this.LLJILJIL.hashCode()) * 31) + this.LLJILJILJ.hashCode()) * 31) + this.LLJILLL.hashCode()) * 31) + this.LLJJ.hashCode()) * 31) + this.LLJJI.hashCode()) * 31) + this.LLJJIII.hashCode()) * 31) + this.LLJJIJI.hashCode()) * 31) + this.LLJJIJIIJIL.hashCode();
    }

    public final String toString() {
        return "LiveHighlightState(dataRequestStatus=" + this.LL + ", anchorReplayInfoData=" + this.LLILLJJLI + ", liveHighlightPagerList=" + this.LLILLL + ", targetVideoItem=" + this.LLILZ + ", clickCoverEvent=" + this.LLILZIL + ", postConfigModel=" + this.LLILZLL + ", reportPlayDurationEvent=" + this.LLIZ + ", isPublishButtonEnable=" + this.LLIZLLLIL + ", removePublishProgress=" + this.LLJ + ", userRevertSwitch=" + this.LLJI + ", captionSwitchStatus=" + this.LLJIJIL + ", loadHighlightInfo=" + this.LLJILJIL + ", liveHighlightTargetMusicStatus=" + this.LLJILJILJ + ", liveHighlightMusicItemStatus=" + this.LLJILLL + ", liveHighlightTextStickerItemStatus=" + this.LLJJ + ", liveHighlightOriginalSoundEnable=" + this.LLJJI + ", liveHighlightOriginalSoundVolume=" + this.LLJJIII + ", liveHighlightMusicSoundVolume=" + this.LLJJIJI + ", captionsStatus=" + this.LLJJIJIIJIL + ')';
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C1834780xqW(int i) {
        C491101vh c491101vh = C491101vh.LIZ;
        C13BV c13bv = C13BV.INSTANCE;
        this(c491101vh, c491101vh, new C291001Au(c13bv), c491101vh, c491101vh, c491101vh, new C291001Au(null), new C291001Au(null), new C291001Au(null), c491101vh, new C291001Au(null), new C291001Au(c13bv), c491101vh, new C291001Au(null), new C291001Au(null), new C291001Au(Boolean.TRUE), new C291001Au(50), new C291001Au(Integer.valueOf(LiveHighlightMusicDefaultVolumeSetting.volume())), new C291001Au(null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1834780xqW(AbstractC1623806Xk<Integer> abstractC1623806Xk, AbstractC1623806Xk<RoomReplay> abstractC1623806Xk2, C291001Au<? extends List<C1833730xop>> c291001Au, AbstractC1623806Xk<C1834580xqC> abstractC1623806Xk3, AbstractC1623806Xk<C1834580xqC> abstractC1623806Xk4, AbstractC1623806Xk<PostConfigModel> abstractC1623806Xk5, C291001Au<C1834580xqC> c291001Au2, C291001Au<Boolean> c291001Au3, C291001Au<Boolean> c291001Au4, AbstractC1623806Xk<Integer> abstractC1623806Xk6, C291001Au<? extends Pair<Long, ? extends EnumC1834800xqY>> c291001Au5, C291001Au<? extends List<Long>> c291001Au6, AbstractC1623806Xk<Pair<Long, Long>> abstractC1623806Xk7, C291001Au<C344050DeF> c291001Au7, C291001Au<C1834790xqX> c291001Au8, C291001Au<Boolean> c291001Au9, C291001Au<Integer> c291001Au10, C291001Au<Integer> c291001Au11, C291001Au<C044700Eb> c291001Au12) {
        this.LL = abstractC1623806Xk;
        this.LLILLJJLI = abstractC1623806Xk2;
        this.LLILLL = c291001Au;
        this.LLILZ = abstractC1623806Xk3;
        this.LLILZIL = abstractC1623806Xk4;
        this.LLILZLL = abstractC1623806Xk5;
        this.LLIZ = c291001Au2;
        this.LLIZLLLIL = c291001Au3;
        this.LLJ = c291001Au4;
        this.LLJI = abstractC1623806Xk6;
        this.LLJIJIL = c291001Au5;
        this.LLJILJIL = c291001Au6;
        this.LLJILJILJ = abstractC1623806Xk7;
        this.LLJILLL = c291001Au7;
        this.LLJJ = c291001Au8;
        this.LLJJI = c291001Au9;
        this.LLJJIII = c291001Au10;
        this.LLJJIJI = c291001Au11;
        this.LLJJIJIIJIL = c291001Au12;
    }

    public static C1834780xqW LIZ(C1834780xqW c1834780xqW, C1623606Xi c1623606Xi, C1623606Xi c1623606Xi2, C291001Au c291001Au, C1623606Xi c1623606Xi3, C1623606Xi c1623606Xi4, C1623606Xi c1623606Xi5, C291001Au c291001Au2, C291001Au c291001Au3, C291001Au c291001Au4, C1623606Xi c1623606Xi6, C291001Au c291001Au5, C291001Au c291001Au6, AbstractC1623806Xk abstractC1623806Xk, C291001Au c291001Au7, C291001Au c291001Au8, C291001Au c291001Au9, C291001Au c291001Au10, C291001Au c291001Au11, C291001Au c291001Au12, int i) {
        C291001Au c291001Au13 = c291001Au12;
        C291001Au c291001Au14 = c291001Au11;
        C291001Au c291001Au15 = c291001Au10;
        AbstractC1623806Xk abstractC1623806Xk2 = abstractC1623806Xk;
        C291001Au c291001Au16 = c291001Au6;
        C291001Au c291001Au17 = c291001Au5;
        AbstractC1623806Xk<Integer> abstractC1623806Xk3 = c1623606Xi6;
        C291001Au c291001Au18 = c291001Au9;
        C291001Au c291001Au19 = c291001Au4;
        C291001Au c291001Au20 = c291001Au3;
        C291001Au c291001Au21 = c291001Au2;
        AbstractC1623806Xk<PostConfigModel> abstractC1623806Xk4 = c1623606Xi5;
        C291001Au c291001Au22 = c291001Au8;
        AbstractC1623806Xk<C1834580xqC> abstractC1623806Xk5 = c1623606Xi4;
        AbstractC1623806Xk<C1834580xqC> abstractC1623806Xk6 = c1623606Xi3;
        C291001Au c291001Au23 = c291001Au;
        C291001Au c291001Au24 = c291001Au7;
        AbstractC1623806Xk<RoomReplay> abstractC1623806Xk7 = c1623606Xi2;
        AbstractC1623806Xk<Integer> abstractC1623806Xk8 = c1623606Xi;
        if ((i & 1) != 0) {
            abstractC1623806Xk8 = c1834780xqW.LL;
        }
        if ((i & 2) != 0) {
            abstractC1623806Xk7 = c1834780xqW.LLILLJJLI;
        }
        if ((i & 4) != 0) {
            c291001Au23 = c1834780xqW.LLILLL;
        }
        if ((i & 8) != 0) {
            abstractC1623806Xk6 = c1834780xqW.LLILZ;
        }
        if ((i & 16) != 0) {
            abstractC1623806Xk5 = c1834780xqW.LLILZIL;
        }
        if ((i & 32) != 0) {
            abstractC1623806Xk4 = c1834780xqW.LLILZLL;
        }
        if ((i & 64) != 0) {
            c291001Au21 = c1834780xqW.LLIZ;
        }
        if ((i & 128) != 0) {
            c291001Au20 = c1834780xqW.LLIZLLLIL;
        }
        if ((i & 256) != 0) {
            c291001Au19 = c1834780xqW.LLJ;
        }
        if ((i & 512) != 0) {
            abstractC1623806Xk3 = c1834780xqW.LLJI;
        }
        if ((i & 1024) != 0) {
            c291001Au17 = c1834780xqW.LLJIJIL;
        }
        if ((i & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            c291001Au16 = c1834780xqW.LLJILJIL;
        }
        if ((i & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0) {
            abstractC1623806Xk2 = c1834780xqW.LLJILJILJ;
        }
        if ((i & 8192) != 0) {
            c291001Au24 = c1834780xqW.LLJILLL;
        }
        if ((i & 16384) != 0) {
            c291001Au22 = c1834780xqW.LLJJ;
        }
        if ((32768 & i) != 0) {
            c291001Au18 = c1834780xqW.LLJJI;
        }
        if ((65536 & i) != 0) {
            c291001Au15 = c1834780xqW.LLJJIII;
        }
        if ((131072 & i) != 0) {
            c291001Au14 = c1834780xqW.LLJJIJI;
        }
        if ((i & 262144) != 0) {
            c291001Au13 = c1834780xqW.LLJJIJIIJIL;
        }
        c1834780xqW.getClass();
        AbstractC1623806Xk<PostConfigModel> abstractC1623806Xk9 = abstractC1623806Xk4;
        return new C1834780xqW(abstractC1623806Xk8, abstractC1623806Xk7, c291001Au23, abstractC1623806Xk6, abstractC1623806Xk5, abstractC1623806Xk9, c291001Au21, c291001Au20, c291001Au19, abstractC1623806Xk3, c291001Au17, c291001Au16, abstractC1623806Xk2, c291001Au24, c291001Au22, c291001Au18, c291001Au15, c291001Au14, c291001Au13);
    }
}
