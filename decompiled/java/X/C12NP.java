package X;

import Y.ARunnableS129S0100000_29;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.music.service.IMusicService;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.shortvideo.model.VideoMusicModel;
import com.ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AFwS218S0000000_29;
import kotlin.jvm.internal.AwS575S0100000_31;
import kotlin.jvm.internal.AwS608S0100000_29;

/* JADX INFO: renamed from: X.12NP, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C12NP implements InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJI;
    public final String LL;
    public final C1DRG LLILLJJLI;
    public final C1664750tQH LLILLL;
    public final C1664750tQH LLILZ;
    public RecyclerView LLILZIL;
    public C03BJ LLILZLL;
    public C1630570sX9 LLIZ;
    public C129G LLIZLLLIL;
    public AwS575S0100000_31 LLJ;
    public int LLJI;
    public boolean LLJIJIL;
    public boolean LLJILJIL;
    public final C01GW LLJILJILJ;
    public boolean LLJILLL;
    public final View LLJJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C12NP.class, "initParams", "getInitParams()Lcom/ss/android/ugc/aweme/port/in/music/InitParams;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C12NP.class, "verticalMusicView", "getVerticalMusicView()Lcom/ss/android/ugc/aweme/tools/music/music/vertical/VerticalMusicView;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(C12NP.class, "musicLogicPresenter", "getMusicLogicPresenter()Lcom/ss/android/ugc/aweme/port/in/IAnotherMusicService$IMusicLogicPresenter;", 0);
        c09r3.getClass();
        LLJJI = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3};
    }

    public final C155H LIZIZ() {
        return (C155H) this.LLILLL.getValue(this, LLJJI[0]);
    }

    public final AbstractC204621154x LIZJ() {
        return (AbstractC204621154x) this.LLILZ.getValue(this, LLJJI[1]);
    }

    public final void LIZLLL() {
        if (this.LLJILJIL) {
            return;
        }
        C129G c129g = this.LLIZLLLIL;
        List<MusicModel> data = c129g != null ? c129g.getData() : null;
        if (data == null || data.isEmpty()) {
            C03BJ c03bj = this.LLILZLL;
            if (c03bj != null) {
                C786410Ut5.h1(c03bj, 0);
            }
            LJ(false);
            C817503Hh c817503Hh = C817503Hh.LL;
            C1DFH c1dfh = C0PEM.LIZ;
            C23250099c.LIZLLL(c817503Hh, C2107308Nj.LIZ, null, new C12NL(this, null, true), 2);
        }
    }

    public final void LIZ() {
        C129G c129g;
        List<MusicModel> data;
        List<MusicModel> data2;
        MusicModel musicModel;
        if (!LIZJ().LJJIIZI() || (c129g = this.LLIZLLLIL) == null || (data = c129g.getData()) == null || data.isEmpty()) {
            return;
        }
        C129G c129g2 = this.LLIZLLLIL;
        if (c129g2 != null) {
            c129g2.LLLIILIL(0);
        }
        C129G c129g3 = this.LLIZLLLIL;
        if (c129g3 != null && (data2 = c129g3.getData()) != null && (musicModel = (MusicModel) C13LP.LJJJLZIJ(0, data2)) != null) {
            AbstractC204621154x abstractC204621154xLIZJ = LIZJ();
            String musicId = musicModel.getMusicId();
            if (musicId == null) {
                musicId = "";
            }
            abstractC204621154xLIZJ.LJJIJLIJ(musicId);
            LIZJ().LJJIZ(0, musicModel, EnumC1654750tA9.TAB_HOT.getStringValue(), true, false);
        }
        this.LLJILLL = false;
        LIZIZ().LJIIIZ = false;
    }

    @Override // X.InterfaceC379610EuV
    public final C1DRG getDiContainer() {
        return this.LLILLJJLI;
    }

    public final void LJ(boolean z) {
        if (z) {
            C129G c129g = this.LLIZLLLIL;
            if (c129g != null) {
                c129g.clearData();
            }
            C1630570sX9 c1630570sX9 = this.LLIZ;
            if (c1630570sX9 != null) {
                C786410Ut5.X1(c1630570sX9, 0);
                c1630570sX9.LIZ();
                return;
            }
            return;
        }
        C1630570sX9 c1630570sX92 = this.LLIZ;
        if (c1630570sX92 == null) {
            return;
        }
        C786410Ut5.X1(c1630570sX92, 8);
    }

    public C12NP(String str, Context context, C1DRG c1drg) {
        FrameLayout frameLayout;
        this.LL = str;
        this.LLILLJJLI = c1drg;
        this.LLILLL = C1664770tQJ.LIZ(c1drg, C155H.class, null);
        this.LLILZ = C1664770tQJ.LIZ(c1drg, AbstractC204621154x.class, null);
        C1664750tQH c1664750tQHLIZ = C1664770tQJ.LIZ(c1drg, C155W.class, null);
        this.LLJIJIL = true;
        this.LLJILJILJ = C452501pT.LIZIZ(AFwS218S0000000_29.get$arr$(450));
        View viewSd = C786410Ut5.Sd(R.layout.i_h, C786410Ut5.ne(context), null);
        RecyclerView recyclerView = (RecyclerView) viewSd.findViewById(R.id.tw4);
        if (recyclerView != null) {
            recyclerView.setItemAnimator(null);
        } else {
            recyclerView = null;
        }
        this.LLILZIL = recyclerView;
        this.LLILZLL = (C03BJ) viewSd.findViewById(R.id.vey);
        if ((viewSd instanceof FrameLayout) && (frameLayout = (FrameLayout) viewSd) != null) {
            this.LLIZ = LIZJ().LJIIJJI(frameLayout, new AwS608S0100000_29(this, 854));
        }
        C155H c155hLIZIZ = LIZIZ();
        EnumC1654750tA9 enumC1654750tA9 = EnumC1654750tA9.TAB_HOT;
        AbstractC204621154x abstractC204621154xLIZJ = LIZJ();
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJI;
        final C155K c155k = new C155K(c155hLIZIZ, enumC1654750tA9, abstractC204621154xLIZJ, (C155W) c1664750tQHLIZ.getValue(this, interfaceC2217461BqaArr[2]));
        C129G c129g = new C129G(c1drg, new AnonymousClass1297() { // from class: X.155J
            @Override // X.AnonymousClass1297
            public final void LJI(VideoMusicModel videoMusicModel, int i) {
            }

            @Override // X.AnonymousClass1297
            public final void LJIIIZ(int i, Aweme aweme) {
            }

            @Override // X.AnonymousClass1297
            public final void LJIIJJI(VideoMusicModel videoMusicModel, int i) {
            }

            @Override // X.AnonymousClass1297
            public final void LJIIL(int i) {
            }

            @Override // X.AnonymousClass1297
            public final void LJIILIIL(int i, View view) {
            }

            @Override // X.AnonymousClass1297
            public final void LJIILJJIL(VideoMusicModel videoMusicModel) {
            }

            @Override // X.AnonymousClass1297
            public final void LJIILL(int i) {
            }

            @Override // X.AnonymousClass1297
            public final boolean LIZIZ() {
                return c155k.LIZ();
            }

            @Override // X.AnonymousClass1297
            public final boolean LIZJ() {
                return c155k.LIZ.LJIIL.LIZJ();
            }

            @Override // X.AnonymousClass1297
            public final boolean LJ() {
                return this.LIZIZ().LJIIL.LJIILIIL();
            }

            @Override // X.AnonymousClass1297
            public final int LJIILLIIL(MusicModel musicModel) {
                return musicModel.getPresenterDuration();
            }

            @Override // X.AnonymousClass1297
            public final void LIZ(int i, View view) {
                List<MusicModel> data;
                MusicModel musicModel;
                C129G c129g2;
                C155K c155k2 = c155k;
                String str2 = this.LL;
                C129G c129g3 = c155k2.LJFF;
                if (c129g3 != null && (data = c129g3.getData()) != null && (musicModel = (MusicModel) C13LP.LJJJLZIJ(i, data)) != null) {
                    C129G c129g4 = c155k2.LJFF;
                    if (c129g4 != null && c129g4.LLLI(musicModel)) {
                        if (c155k2.LIZ.LJIL.invoke().booleanValue()) {
                            c155k2.LIZ.LJIILIIL.LIZJ(musicModel, c155k2.LIZIZ.getStringValue(), i, null);
                            c155k2.LIZJ.LJIIL(c155k2.LJFF, false, true, null, true);
                            return;
                        }
                        return;
                    }
                    boolean zLIZJ = C2286708xd.LIZJ(((IMusicService) c155k2.LJ.getValue()).LIZ(musicModel));
                    if (!zLIZJ && (c129g2 = c155k2.LJFF) != null) {
                        c129g2.LLLIILIL(i);
                    }
                    C155D c155dH5 = c155k2.LIZLLL.H5();
                    if (c155dH5 != null) {
                        c155dH5.LIZJ(zLIZJ);
                    }
                    c155k2.LIZJ.LJJIJIIJIL(i, musicModel, c155k2.LIZIZ, true, str2, false, null, null);
                }
            }

            @Override // X.AnonymousClass1297
            public final void LIZLLL(MusicModel musicModel, boolean z) {
                this.LIZIZ().LJIIL.LJIIJ(musicModel, z);
            }

            @Override // X.AnonymousClass1297
            public final void LJFF(MusicModel musicModel, int i) {
                this.LIZJ().LJJIIJ(musicModel, EnumC1654750tA9.TAB_HOT, i, null, null, this.LL, null);
            }

            @Override // X.AnonymousClass1297
            public final void LJII(int i, View view) {
                c155k.LIZIZ(i);
            }

            @Override // X.AnonymousClass1297
            public final void LJIIIIZZ(int i, View view) {
                c155k.LIZJ(i);
            }

            @Override // X.AnonymousClass1297
            public final void LJIIJ(int i, View view) {
                C155K c155k2 = c155k;
                if (i < 0) {
                    c155k2.getClass();
                } else {
                    c155k2.LIZ.LJIIL.LJFF();
                }
            }
        }, ((C155W) c1664750tQHLIZ.getValue(this, interfaceC2217461BqaArr[2])).zt(), LIZIZ().LIZ, false, false, 48);
        this.LLIZLLLIL = c129g;
        c129g.LLLIL(new InterfaceC19413110xF() { // from class: X.12NN
            @Override // X.InterfaceC19413110xF
            public final void LJJIFFI() {
                C12NP c12np = this.LIZ;
                if (!c12np.LLJIJIL) {
                    RecyclerView recyclerView2 = c12np.LLILZIL;
                    if (recyclerView2 != null) {
                        HandlerHook.viewPost(recyclerView2, new ARunnableS129S0100000_29(c12np, 220));
                        return;
                    }
                    return;
                }
                C129G c129g2 = c12np.LLIZLLLIL;
                if (c129g2 != null) {
                    c129g2.showLoadMoreLoading();
                }
                C12NP c12np2 = this.LIZ;
                c12np2.getClass();
                C817503Hh c817503Hh = C817503Hh.LL;
                C1DFH c1dfh = C0PEM.LIZ;
                C23250099c.LIZLLL(c817503Hh, C2107308Nj.LIZ, null, new C12NL(c12np2, null, false), 2);
            }
        });
        c155k.LJFF = this.LLIZLLLIL;
        RecyclerView recyclerView2 = this.LLILZIL;
        if (recyclerView2 != null) {
            recyclerView2.addItemDecoration(new C115Z(recyclerView2.getContext(), 0));
            recyclerView2.setLayoutManager(new WrapLinearLayoutManager(recyclerView2.getContext(), 1));
            recyclerView2.setAdapter(this.LLIZLLLIL);
        }
        this.LLJJ = viewSd;
    }
}
