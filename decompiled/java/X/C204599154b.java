package X;

import Y.AObjectS248S0100000_31;
import android.content.Context;
import android.widget.FrameLayout;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.music.model.CollectedMusicList;
import com.ss.android.ugc.aweme.music.model.IMusicRequestParam;
import com.ss.android.ugc.aweme.music.model.MusicThemeTag;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.shortvideo.model.VideoMusicModel;
import com.ss.android.ugc.aweme.tools.music.music.collect.video.CollectVideoResponse;
import com.ss.android.ugc.aweme.tools.music.music.vertical.player.VideoPlayerComponent;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS575S0100000_31;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;

/* JADX INFO: renamed from: X.154b, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C204599154b implements InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJJLIIL;
    public final C1DRG LL;
    public final Context LLILLJJLI;
    public final boolean LLILLL;
    public int LLILZIL;
    public C1749280vcc LLILZLL;
    public FrameLayout LLIZ;
    public C1630570sX9 LLIZLLLIL;
    public InterfaceC204601154d LLJ;
    public boolean LLJI;
    public final C1664740tQG LLJIJIL;
    public final C1664740tQG LLJILJIL;
    public final C1664740tQG LLJILJILJ;
    public boolean LLJJI;
    public VideoMusicModel LLJJIII;
    public final C1664740tQG LLJJIJI;
    public final C1664740tQG LLJJIJIIJIL;
    public final C1664740tQG LLJJIJIL;
    public final C01GW LLILZ = C452501pT.LIZIZ(new AwS575S0100000_31(this, 1308));
    public final C154J LLJILLL = new C154J();
    public final C154W LLJJ = new C154W();
    public List<MusicThemeTag> LLJJJ = C13BV.INSTANCE;
    public final C01GW LLJJJIL = C452501pT.LIZIZ(new AwS575S0100000_31(this, 1307));
    public final C01GW LLJJJJ = C452501pT.LIZIZ(new AwS575S0100000_31(this, 1306));
    public final C01GW LLJJJJJIL = C452501pT.LIZIZ(new AwS575S0100000_31(this, 1305));

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C204599154b.class, "musicLogicPresenter", "getMusicLogicPresenter()Lcom/ss/android/ugc/aweme/port/in/IAnotherMusicService$IMusicLogicPresenter;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C204599154b.class, "verticalMusicView", "getVerticalMusicView()Lcom/ss/android/ugc/aweme/tools/music/music/vertical/VerticalMusicView;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(C204599154b.class, "initParams", "getInitParams()Lcom/ss/android/ugc/aweme/port/in/music/InitParams;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS4 = new C2217381BqS(C204599154b.class, "seceneLifecycleOwner", "getSeceneLifecycleOwner()Landroidx/lifecycle/LifecycleOwner;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS5 = new C2217381BqS(C204599154b.class, "videoPlayerComponent", "getVideoPlayerComponent()Lcom/ss/android/ugc/aweme/tools/music/music/vertical/player/VideoPlayerComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS6 = new C2217381BqS(C204599154b.class, "recordMusicCutApi", "getRecordMusicCutApi()Lcom/ss/android/ugc/gamora/recorder/musiccut/MusicCutApiComponent;", 0);
        c09r3.getClass();
        LLJJJJLIIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3, c2217381BqS4, c2217381BqS5, c2217381BqS6};
    }

    public final LifecycleOwner LIZ() {
        return (LifecycleOwner) this.LLJJIJI.getValue(this, LLJJJJLIIL[3]);
    }

    public final AbstractC204621154x LIZJ() {
        return (AbstractC204621154x) this.LLJILJIL.getValue(this, LLJJJJLIIL[1]);
    }

    public final VideoPlayerComponent LIZLLL() {
        return (VideoPlayerComponent) this.LLJJIJIIJIL.getValue(this, LLJJJJLIIL[4]);
    }

    public final void LJFF() {
        C560530Lyd<Unit> c560530Lyd;
        C1749280vcc c1749280vcc = this.LLILZLL;
        if (c1749280vcc != null) {
            C337180DJs.LIZ(c1749280vcc);
        }
        C1630570sX9 c1630570sX9 = this.LLIZLLLIL;
        if (c1630570sX9 != null) {
            C337180DJs.LIZ(c1630570sX9);
        }
        FrameLayout frameLayout = this.LLIZ;
        if (frameLayout != null) {
            C337180DJs.LIZJ(frameLayout);
        }
        if (this.LLILLL && !this.LLJJI && LIZ() != null) {
            InterfaceC1652770t6x interfaceC1652770t6x = (InterfaceC1652770t6x) this.LLJJIJIL.getValue(this, LLJJJJLIIL[5]);
            if (interfaceC1652770t6x != null) {
                interfaceC1652770t6x.Lt0().LIZ(LIZ(), (AObjectS248S0100000_31) this.LLJJJIL.getValue());
                interfaceC1652770t6x.dk1().LIZ(LIZ(), (AObjectS248S0100000_31) this.LLJJJJ.getValue());
            }
            AbstractC204621154x abstractC204621154xLIZJ = LIZJ();
            if (abstractC204621154xLIZJ != null && (c560530Lyd = abstractC204621154xLIZJ.LL) != null) {
                c560530Lyd.LIZ(LIZ(), (AObjectS248S0100000_31) this.LLJJJJJIL.getValue());
            }
            this.LLJJI = true;
        }
        InterfaceC204601154d interfaceC204601154d = this.LLJ;
        C154J c154j = this.LLJILLL;
        List<MusicThemeTag> listLIZIZ = LIZIZ(c154j.LJII, c154j.LJIIIIZZ, this.LLJJ);
        this.LLJJJ = listLIZIZ;
        InterfaceC204601154d c154p = listLIZIZ.isEmpty() ? new C154P(this.LL, this.LLILLJJLI, this.LLJILLL, this.LLJJ) : (this.LLJJJ.size() == 1 && Intrinsics.LJFF(((MusicThemeTag) C13LP.LJJJJZI(this.LLJJJ)).key, EnumC1458240o3C.ALL.getValue())) ? new C154G(this.LL, this.LLILLJJLI, null, this.LLJILLL) : this.LLJJJ.size() > 1 ? new C20449314zz(this.LL, this.LLILLJJLI, this.LLJJJ, this.LLJILLL, this.LLJJ) : null;
        this.LLJ = c154p;
        if (c154p != null) {
            if (interfaceC204601154d != null) {
                interfaceC204601154d.LIZ();
            }
            FrameLayout frameLayout2 = this.LLIZ;
            if (frameLayout2 != null) {
                C786410Ut5.LJJJJIZL(frameLayout2);
            }
            FrameLayout frameLayout3 = this.LLIZ;
            if (frameLayout3 != null) {
                frameLayout3.addView(c154p.LJIIIIZZ());
            }
            c154p.LIZLLL();
        }
        C2281251EQx.LIZ.LJII("edit_music", EnumC1654750tA9.TAB_COLLECT.getStringValue(), "", true);
    }

    @Override // X.InterfaceC379610EuV
    public final C1DRG getDiContainer() {
        return this.LL;
    }

    public final void LJ(boolean z) {
        Function0<IMusicRequestParam> function0;
        IMusicRequestParam iMusicRequestParamInvoke;
        LifecycleCoroutineScope lifecycleCoroutineScopeLJJ;
        C155H c155h = (C155H) this.LLJILJILJ.getValue(this, LLJJJJLIIL[2]);
        if (c155h != null && (function0 = c155h.LIZJ) != null && (iMusicRequestParamInvoke = function0.invoke()) != null) {
            int soundPageScene = iMusicRequestParamInvoke.getSoundPageScene();
            AbstractC204621154x abstractC204621154xLIZJ = LIZJ();
            if (abstractC204621154xLIZJ != null && (lifecycleCoroutineScopeLJJ = abstractC204621154xLIZJ.LJJ()) != null) {
                C23250099c.LIZLLL(lifecycleCoroutineScopeLJJ, null, null, new C204600154c(this, z, soundPageScene, null), 3);
            }
        }
    }

    public final void LJI(CollectedMusicList collectedMusicList, List list) {
        int cursor;
        boolean zIsHasMore;
        Integer numValueOf;
        C154J c154j = this.LLJILLL;
        c154j.LJFF = true;
        c154j.LIZ.clear();
        if (collectedMusicList == null) {
            C154J c154j2 = this.LLJILLL;
            c154j2.LJI = Boolean.FALSE;
            c154j2.LJ = 0;
        } else {
            C154J c154j3 = this.LLJILLL;
            c154j3.LJI = Boolean.TRUE;
            c154j3.LIZ.addAll(list);
            this.LLJILLL.LJ = list.size();
        }
        C154J c154j4 = this.LLJILLL;
        if (collectedMusicList != null) {
            cursor = collectedMusicList.getCursor();
        } else {
            cursor = 0;
        }
        c154j4.LIZJ = cursor;
        C154J c154j5 = this.LLJILLL;
        if (collectedMusicList != null) {
            zIsHasMore = collectedMusicList.isHasMore();
        } else {
            zIsHasMore = false;
        }
        c154j5.LIZLLL = zIsHasMore;
        C154J c154j6 = this.LLJILLL;
        List<MusicThemeTag> themeTags = null;
        if (collectedMusicList != null) {
            numValueOf = Integer.valueOf(collectedMusicList.getTotalCount());
        } else {
            numValueOf = null;
        }
        c154j6.LJII = numValueOf;
        C154J c154j7 = this.LLJILLL;
        if (collectedMusicList != null) {
            themeTags = collectedMusicList.getThemeTags();
        }
        c154j7.LJIIIIZZ = themeTags;
        Boolean bool = this.LLJILLL.LJI;
        Boolean bool2 = Boolean.TRUE;
        if (Intrinsics.LJFF(bool, bool2)) {
            if (this.LLJILLL.LIZ.isEmpty()) {
                if (Intrinsics.LJFF(this.LLJJ.LJ, bool2) && (!((ArrayList) this.LLJJ.LIZ).isEmpty())) {
                    LJFF();
                    return;
                }
                C1630570sX9 c1630570sX9 = this.LLIZLLLIL;
                if (c1630570sX9 != null) {
                    C337180DJs.LIZ(c1630570sX9);
                }
                FrameLayout frameLayout = this.LLIZ;
                if (frameLayout != null) {
                    C337180DJs.LIZ(frameLayout);
                }
                C1749280vcc c1749280vcc = this.LLILZLL;
                if (c1749280vcc != null) {
                    C1722300uv6 c1722300uv6 = new C1722300uv6();
                    c1722300uv6.LJFF = 2131838196;
                    c1722300uv6.LJII = 2131838195;
                    c1749280vcc.setStatus(c1722300uv6);
                }
                C1749280vcc c1749280vcc2 = this.LLILZLL;
                if (c1749280vcc2 != null) {
                    C337180DJs.LIZJ(c1749280vcc2);
                }
                C2281251EQx.LIZ.LJII("edit_music", EnumC1654750tA9.TAB_COLLECT.getStringValue(), "", false);
                return;
            }
            LJFF();
            return;
        }
        FrameLayout frameLayout2 = this.LLIZ;
        if (frameLayout2 != null) {
            C337180DJs.LIZ(frameLayout2);
        }
        C1749280vcc c1749280vcc3 = this.LLILZLL;
        if (c1749280vcc3 != null) {
            C337180DJs.LIZ(c1749280vcc3);
        }
        C1630570sX9 c1630570sX92 = this.LLIZLLLIL;
        if (c1630570sX92 != null) {
            C337180DJs.LIZJ(c1630570sX92);
        }
        C2281251EQx.LIZ.LJII("edit_music", EnumC1654750tA9.TAB_COLLECT.getStringValue(), "", false);
    }

    public final void LJII(List<? extends MusicModel> list, CollectVideoResponse collectVideoResponse) {
        Integer nextCursor;
        boolean zBooleanValue;
        Boolean hasMore;
        C154W c154w = this.LLJJ;
        c154w.LIZLLL = true;
        ((ArrayList) c154w.LIZ).clear();
        if (collectVideoResponse != null) {
            ((ArrayList) this.LLJJ.LIZ).addAll(list);
            C154W c154w2 = this.LLJJ;
            list.size();
            c154w2.getClass();
            this.LLJJ.LJ = Boolean.TRUE;
        } else {
            this.LLJJ.getClass();
            this.LLJJ.LJ = Boolean.FALSE;
        }
        C154W c154w3 = this.LLJJ;
        if (collectVideoResponse != null) {
            nextCursor = collectVideoResponse.getNextCursor();
        } else {
            nextCursor = null;
        }
        c154w3.LIZIZ = nextCursor;
        C154W c154w4 = this.LLJJ;
        if (collectVideoResponse != null && (hasMore = collectVideoResponse.getHasMore()) != null) {
            zBooleanValue = hasMore.booleanValue();
        } else {
            zBooleanValue = false;
        }
        c154w4.LIZJ = zBooleanValue;
    }

    public C204599154b(C1DRG c1drg, Context context, boolean z) {
        this.LL = c1drg;
        this.LLILLJJLI = context;
        this.LLILLL = z;
        this.LLJIJIL = C1664770tQJ.LIZIZ(c1drg, C155W.class, null);
        this.LLJILJIL = C1664770tQJ.LIZIZ(c1drg, AbstractC204621154x.class, null);
        this.LLJILJILJ = C1664770tQJ.LIZIZ(c1drg, C155H.class, null);
        this.LLJJIJI = C1664770tQJ.LIZIZ(c1drg, LifecycleOwner.class, null);
        this.LLJJIJIIJIL = C1664770tQJ.LIZIZ(c1drg, VideoPlayerComponent.class, null);
        this.LLJJIJIL = C1664770tQJ.LIZIZ(c1drg, InterfaceC1652770t6x.class, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.util.ArrayList] */
    public final List<MusicThemeTag> LIZIZ(Integer num, List<MusicThemeTag> list, C154W c154w) {
        ?? arrayList;
        if (num != null && num.intValue() > 0 && !new IntRange(1, 5).LJLJL(num.intValue())) {
            if (new IntRange(6, 30).LJLJL(num.intValue())) {
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(new MusicThemeTag(EnumC1458240o3C.ALL.getValue(), this.LLILLJJLI.getString(2131848625)));
                if (this.LLILLL && (!Intrinsics.LJFF(c154w.LJ, Boolean.TRUE) || (!c154w.LIZ.isEmpty()))) {
                    arrayList2.add(new MusicThemeTag(EnumC1458240o3C.POST.getValue(), this.LLILLJJLI.getString(2131848627)));
                }
                return arrayList2;
            }
            ArrayList arrayList3 = new ArrayList();
            arrayList3.add(new MusicThemeTag(EnumC1458240o3C.ALL.getValue(), this.LLILLJJLI.getString(2131848625)));
            if (this.LLILLL && (!Intrinsics.LJFF(c154w.LJ, Boolean.TRUE) || (!c154w.LIZ.isEmpty()))) {
                arrayList3.add(new MusicThemeTag(EnumC1458240o3C.POST.getValue(), this.LLILLJJLI.getString(2131848627)));
            }
            if (list != null) {
                arrayList = new ArrayList();
                for (MusicThemeTag musicThemeTag : list) {
                    MusicThemeTag musicThemeTag2 = musicThemeTag;
                    if (C123100dR.LIZ(musicThemeTag2.key) && C123100dR.LIZ(musicThemeTag2.name)) {
                        arrayList.add(musicThemeTag);
                    }
                }
            } else {
                arrayList = C13BV.INSTANCE;
            }
            arrayList3.addAll(arrayList);
            return arrayList3;
        }
        return C13BV.INSTANCE;
    }
}
