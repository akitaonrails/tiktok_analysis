package X;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.music.model.MusicThemeTag;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.shortvideo.model.VideoSectionModel;
import com.ss.android.ugc.aweme.tools.music.music.vertical.player.VideoPlayerComponent;
import com.ss.android.ugc.aweme.widgetcompat.WrapGridLayoutManager;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AwS575S0100000_31;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.154Q, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C154Q extends C154N {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIJIL;
    public final MusicThemeTag LLJJI;
    public final C154W LLJJIII;
    public final C1664740tQG LLJJIJI;
    public final List<MusicModel> LLJJIJIIJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C154Q.class, "videoPlayerComponent", "getVideoPlayerComponent()Lcom/ss/android/ugc/aweme/tools/music/music/vertical/player/VideoPlayerComponent;", 0);
        C13LE.LIZ.getClass();
        LLJJIJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // X.C154N, X.InterfaceC1867560yhO
    public final void LJFF(MusicModel musicModel, boolean z) {
    }

    @Override // X.C154N
    public final boolean LJIIZILJ() {
        return false;
    }

    @Override // X.C154N
    public final void LJJII(MusicModel musicModel, MusicModel.CollectionType collectionType, boolean z) {
    }

    @Override // X.C154N
    public final void LJIJJ() {
        C154M.LIZ = "-1";
        C154M.LIZIZ = 0;
        AbstractC204621154x abstractC204621154xLJIILJJIL = LJIILJJIL();
        if (abstractC204621154xLJIILJJIL != null) {
            abstractC204621154xLJIILJJIL.LJIILJJIL();
        }
        C129L c129l = this.LLJI;
        if (c129l != null) {
            c129l.LLLIILIL(-1);
        }
    }

    public final void LJJIII() {
        C129L c129l;
        ((ArrayList) this.LLJJIJIIJIL).clear();
        VideoSectionModel videoSectionModel = new VideoSectionModel(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)));
        videoSectionModel.setId(-298021087);
        ((ArrayList) this.LLJJIJIIJIL).add(videoSectionModel);
        ((ArrayList) this.LLJJIJIIJIL).addAll(this.LLJJIII.LIZ);
        C129L c129l2 = this.LLJI;
        if (c129l2 != null) {
            c129l2.setData(this.LLJJIJIIJIL);
        }
        if (this.LLJJIII.LIZJ || (c129l = this.LLJI) == null) {
            return;
        }
        c129l.setShowFooter(false);
    }

    @Override // X.C154N
    public final void LJIILL() {
        C155H c155hLJIIJJI;
        AbstractC204621154x abstractC204621154xLJIILJJIL;
        VideoPlayerComponent videoPlayerComponent;
        C155W c155wLJIIL = LJIIL();
        if (c155wLJIIL == null || (c155hLJIIJJI = LJIIJJI()) == null || (abstractC204621154xLJIILJJIL = LJIILJJIL()) == null || (videoPlayerComponent = (VideoPlayerComponent) this.LLJJIJI.getValue(this, LLJJIJIL[0])) == null) {
            return;
        }
        final WrapGridLayoutManager wrapGridLayoutManager = new WrapGridLayoutManager(2, this.LLILLJJLI);
        C155O c155o = new C155O(c155hLJIIJJI, EnumC1654750tA9.TAB_COLLECT, abstractC204621154xLJIILJJIL, c155wLJIIL, videoPlayerComponent, null, this.LLJJI);
        C129L c129l = new C129L(this.LL, c155o, c155wLJIIL.zt(), c155hLJIIJJI.LIZ, new AwS575S0100000_31(c155hLJIIJJI, 1315));
        c129l.LLLIL(new InterfaceC19413110xF() { // from class: X.154U
            @Override // X.InterfaceC19413110xF
            public final void LJJIFFI() {
                AbstractC204621154x abstractC204621154xLJIILJJIL2;
                LifecycleCoroutineScope lifecycleCoroutineScopeLJJ;
                C154Q c154q = this.LIZ;
                if (!c154q.LLJJIII.LIZJ || (abstractC204621154xLJIILJJIL2 = c154q.LJIILJJIL()) == null || (lifecycleCoroutineScopeLJJ = abstractC204621154xLJIILJJIL2.LJJ()) == null) {
                    return;
                }
                C23250099c.LIZLLL(lifecycleCoroutineScopeLJJ, null, null, new C154T(c154q, null), 3);
            }
        });
        c129l.spanSizeLookup2 = new AbstractC683540QrY() { // from class: X.154Y
            @Override // X.AbstractC683540QrY
            public final int LJII(int i) {
                if (i == 11) {
                    return 1;
                }
                return wrapGridLayoutManager.LLILLJJLI;
            }
        };
        this.LLJI = c129l;
        C425240Glu c425240Glu = this.LLJ;
        if (c425240Glu != null) {
            c425240Glu.setLayoutManager(wrapGridLayoutManager);
        }
        C425240Glu c425240Glu2 = this.LLJ;
        if (c425240Glu2 != null) {
            c425240Glu2.setAdapter(c129l);
        }
        C425240Glu c425240Glu3 = this.LLJ;
        if (c425240Glu3 != null) {
            c425240Glu3.addItemDecoration(new C0DXR() { // from class: X.0H5H
                public int LL = -1;

                @Override // X.C0DXR
                public final void LIZIZ(Rect rect, View view, RecyclerView recyclerView, C21673919s1 c21673919s1) {
                    AbstractC21673619ry adapter;
                    Integer numValueOf;
                    int i;
                    AbstractC21673619ry adapter2 = recyclerView.getAdapter();
                    if (adapter2 != null) {
                        int itemCount = adapter2.getItemCount();
                        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
                        if (childAdapterPosition >= 0 && childAdapterPosition < itemCount && (adapter = recyclerView.getAdapter()) != null && (numValueOf = Integer.valueOf(adapter.getItemViewType(childAdapterPosition))) != null) {
                            if (numValueOf.intValue() == 12) {
                                this.LL = childAdapterPosition;
                            }
                            if (numValueOf.intValue() == 11 && (i = this.LL) != -1) {
                                int i2 = (childAdapterPosition - i) % 2;
                                if (i2 != 0) {
                                    if (i2 == 1) {
                                        rect.left = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10));
                                        return;
                                    }
                                    return;
                                }
                                rect.right = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10));
                            }
                        }
                    }
                }
            });
        }
        c155o.LJI = c129l;
    }

    @Override // X.C154N
    public final void LJIJI() {
        LifecycleCoroutineScope lifecycleCoroutineScopeLJJ;
        C155P c155p;
        C155H c155hLJIIJJI = LJIIJJI();
        if (c155hLJIIJJI != null && (c155p = c155hLJIIJJI.LJIILIIL) != null) {
            String str = this.LLJJI.key;
            if (str == null) {
                str = "";
            }
            c155p.LJIIJJI(str);
        }
        if (this.LLJILJIL) {
            C129L c129l = this.LLJI;
            if (c129l != null) {
                c129l.notifyDataSetChanged();
                return;
            }
            return;
        }
        C154W c154w = this.LLJJIII;
        if (!c154w.LIZLLL) {
            AbstractC204621154x abstractC204621154xLJIILJJIL = LJIILJJIL();
            if (abstractC204621154xLJIILJJIL == null || (lifecycleCoroutineScopeLJJ = abstractC204621154xLJIILJJIL.LJJ()) == null) {
                return;
            }
            C23250099c.LIZLLL(lifecycleCoroutineScopeLJJ, null, null, new C154R(this, null), 3);
            return;
        }
        if (!Intrinsics.LJFF(c154w.LJ, Boolean.TRUE)) {
            LJJI();
        } else if (((ArrayList) this.LLJJIII.LIZ).isEmpty()) {
            LJJ();
        } else {
            LJJIII();
            LJIL();
        }
        this.LLJILJIL = true;
    }

    @Override // X.C154N
    public final void LJIJJLI() {
        LifecycleCoroutineScope lifecycleCoroutineScopeLJJ;
        AbstractC204621154x abstractC204621154xLJIILJJIL = LJIILJJIL();
        if (abstractC204621154xLJIILJJIL == null || (lifecycleCoroutineScopeLJJ = abstractC204621154xLJIILJJIL.LJJ()) == null) {
            return;
        }
        C23250099c.LIZLLL(lifecycleCoroutineScopeLJJ, null, null, new C154R(this, null), 3);
    }

    @Override // X.C154N
    public final void LJIIJ(View view) {
        ViewGroup viewGroup;
        final Context context = this.LLILLJJLI;
        LinearLayout linearLayout = new LinearLayout(context) { // from class: X.01w8
            {
                super(context, null, 0);
                int i = 0;
                do {
                    addView(C786410Ut5.Td(C786410Ut5.ne(context), R.layout.i7x, this, false));
                    i++;
                } while (i < 6);
            }
        };
        linearLayout.setOrientation(1);
        this.LLILZLL = linearLayout;
        if (linearLayout.getParent() == null && (view instanceof FrameLayout) && (viewGroup = (ViewGroup) view) != null) {
            viewGroup.addView(linearLayout, 0, new FrameLayout.LayoutParams(-1, -1));
        }
    }

    @Override // X.C154N
    public final void LJIJ(boolean z) {
        if (z) {
            VideoPlayerComponent videoPlayerComponent = (VideoPlayerComponent) this.LLJJIJI.getValue(this, LLJJIJIL[0]);
            if (videoPlayerComponent != null) {
                videoPlayerComponent.LIZ();
            }
        } else {
            VideoPlayerComponent videoPlayerComponent2 = (VideoPlayerComponent) this.LLJJIJI.getValue(this, LLJJIJIL[0]);
            if (videoPlayerComponent2 != null) {
                VideoPlayerComponent.LJFF(videoPlayerComponent2, null);
            }
        }
        C129L c129l = this.LLJI;
        if (c129l != null) {
            c129l.LLLIILIL(-1);
        }
    }

    public C154Q(C1DRG c1drg, Context context, MusicThemeTag musicThemeTag, C154W c154w) {
        super(context, c1drg);
        this.LLJJI = musicThemeTag;
        this.LLJJIII = c154w;
        this.LLJJIJI = C1664770tQJ.LIZIZ(c1drg, VideoPlayerComponent.class, null);
        this.LLJJIJIIJIL = new ArrayList();
    }
}
