package X;

import androidx.lifecycle.Lifecycle;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.feed.adapter.VideoEventDispatchViewModel;
import com.ss.android.ugc.aweme.feed.adapter.VideoPlayViewModel;
import com.ss.android.ugc.aweme.feed.adapter.VideoViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.music.model.TT2DSPSongInfo;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AFwS187S0000000_2;
import kotlin.jvm.internal.AwS553S0100000_9;
import kotlin.jvm.internal.AwS623S0100000_9;

/* JADX INFO: renamed from: X.0NtS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C608280NtS extends AbstractC616030OEf<VideoItemParams> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJILJIL;
    public final Lifecycle LLILZIL;
    public final C638900P4e LLILZLL;
    public final C638900P4e LLIZ;
    public final C638900P4e LLIZLLLIL;
    public final C01GW LLJ;
    public boolean LLJI;
    public C600040NgA LLJIJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C608280NtS.class, "videoPlayVM", "getVideoPlayVM()Lcom/ss/android/ugc/aweme/feed/adapter/VideoPlayViewModel;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C608280NtS.class, "videoVM", "getVideoVM()Lcom/ss/android/ugc/aweme/feed/adapter/VideoViewModel;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(C608280NtS.class, "eventDispatchVM", "getEventDispatchVM()Lcom/ss/android/ugc/aweme/feed/adapter/VideoEventDispatchViewModel;", 0);
        c09r3.getClass();
        LLJILJIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3};
    }

    @Override // X.AbstractC616030OEf
    public final void LIZJ() {
        C638900P4e c638900P4e = this.LLILZLL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJILJIL;
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) c638900P4e.getValue(this, interfaceC2217461BqaArr[0]), new C2217381BqS() { // from class: X.0Nus
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0RFV) obj).LLJJIII;
            }
        }, null, new AwS623S0100000_9(this, 210), 6);
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLILZLL.getValue(this, interfaceC2217461BqaArr[0]), new C2217381BqS() { // from class: X.0Nut
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0RFV) obj).LLJI;
            }
        }, C736820SvI.LIZLLL(), new AwS623S0100000_9(this, 211), 4);
        C736680Sv4.LJIIIIZZ(this, LJI(), new C2217381BqS() { // from class: X.0Ntb
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C709790Rsn) obj).LLILLL;
            }
        }, C736820SvI.LJ(), new AwS623S0100000_9(this, 212), 4);
        C736680Sv4.LJIIIIZZ(this, LJI(), new C2217381BqS() { // from class: X.0NgS
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C709790Rsn) obj).LLILZ;
            }
        }, C736820SvI.LJ(), new AwS623S0100000_9(this, 213), 4);
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLIZLLLIL.getValue(this, interfaceC2217461BqaArr[2]), new C2217381BqS() { // from class: X.0NtY
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1ELP) obj).LLJLILLLLZIIL;
            }
        }, null, new AwS623S0100000_9(this, 207), 6);
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLIZLLLIL.getValue(this, interfaceC2217461BqaArr[2]), new C2217381BqS() { // from class: X.0NtW
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1ELP) obj).LLJLL;
            }
        }, null, new AwS623S0100000_9(this, 208), 6);
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLIZLLLIL.getValue(this, interfaceC2217461BqaArr[2]), new C2217381BqS() { // from class: X.0NtU
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1ELP) obj).LLJLLIL;
            }
        }, null, new AwS623S0100000_9(this, 209), 6);
    }

    public final VideoViewModel LJI() {
        return (VideoViewModel) this.LLIZ.getValue(this, LLJILJIL[1]);
    }

    @Override // X.AbstractC616030OEf, X.InterfaceC702500Rh2
    public final void LJJJJZ() {
        C2296808zG.LIZJ((InterfaceC497601wk) this.LLJ.getValue(), null);
        this.LLJIJIL = null;
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public final Lifecycle getLifecycle() {
        return this.LLILZIL;
    }

    public C608280NtS(Lifecycle lifecycle) {
        super("bottom_button_add_to_music_app");
        this.LLILZIL = lifecycle;
        this.LLILZLL = new C638900P4e(this, C13LE.LIZ(VideoPlayViewModel.class), 11);
        this.LLIZ = new C638900P4e(this, C13LE.LIZ(VideoViewModel.class), 12);
        this.LLIZLLLIL = new C638900P4e(this, C13LE.LIZ(VideoEventDispatchViewModel.class), 13);
        this.LLJ = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(1139));
    }

    @Override // X.AbstractC616030OEf, X.InterfaceC702500Rh2
    public final void rr(Object obj) {
        List<TT2DSPSongInfo> tT2DSPSongInfos;
        long duration;
        long jMin;
        EnumC600030Ng9 enumC600030Ng9;
        VideoItemParams videoItemParams = (VideoItemParams) obj;
        if (videoItemParams == null) {
            LJ(false);
            return;
        }
        Aweme aweme = videoItemParams.getAweme();
        Music musicLIZ = C631280OpS.LIZ(aweme);
        C631140OpE.LIZ.getClass();
        EnumC631120OpC enumC631120OpCLIZ = C631140OpE.LIZ(videoItemParams);
        C633020OsG c633020OsG = C633020OsG.LIZIZ;
        if (c633020OsG.LIZLLL(aweme, enumC631120OpCLIZ, musicLIZ)) {
            int iIntValue = ((Number) C0ANR.LIZ.getValue()).intValue();
            if (AwemeExtKt.isPhotoMode(aweme)) {
                jMin = ((long) iIntValue) * 1000;
            } else {
                long j = ((long) iIntValue) * 1000;
                Video video = videoItemParams.getAweme().getVideo();
                if (video != null) {
                    duration = video.getDuration();
                } else {
                    duration = 0;
                }
                jMin = Math.min(j, duration);
            }
            if (jMin > 0) {
                if (AwemeExtKt.isPhotoMode(aweme)) {
                    enumC600030Ng9 = EnumC600030Ng9.VIDEO_SHOW;
                } else {
                    enumC600030Ng9 = EnumC600030Ng9.PLAY_VIDEO;
                }
                this.LLJIJIL = new C600040NgA(enumC600030Ng9, aweme.getAid(), jMin, new AwS553S0100000_9(this, 1786));
            } else {
                LJ(true);
            }
            c633020OsG.LJJLIIIJL(enumC631120OpCLIZ, aweme.getAid(), C0P0X.BIG);
            return;
        }
        LJ(false);
        if (musicLIZ == null || (tT2DSPSongInfos = musicLIZ.getTT2DSPSongInfos()) == null || tT2DSPSongInfos.isEmpty()) {
            return;
        }
        Iterator<TT2DSPSongInfo> it2 = tT2DSPSongInfos.iterator();
        while (it2.hasNext()) {
            if (it2.next().buttonType == C0P0X.BIG.getValue()) {
                C631270OpR.LIZLLL(videoItemParams, false, false);
                return;
            }
        }
    }
}
