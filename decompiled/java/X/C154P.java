package X;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.music.model.IMusicRequestParam;
import com.ss.android.ugc.aweme.music.model.MusicThemeTag;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.shortvideo.model.VideoMusicModel;
import com.ss.android.ugc.aweme.shortvideo.model.VideoSectionModel;
import com.ss.android.ugc.aweme.tools.music.music.vertical.player.VideoPlayerComponent;
import com.ss.android.ugc.aweme.widgetcompat.WrapGridLayoutManager;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AwS575S0100000_31;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.154P, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C154P extends C154N implements InterfaceC204601154d {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJJ;
    public final MusicThemeTag LLJJI;
    public final C154J LLJJIII;
    public final C154W LLJJIJI;
    public final List<MusicModel> LLJJIJIIJIL;
    public boolean LLJJIJIL;
    public Integer LLJJJ;
    public final C1664740tQG LLJJJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C154P.class, "videoPlayerComponent", "getVideoPlayerComponent()Lcom/ss/android/ugc/aweme/tools/music/music/vertical/player/VideoPlayerComponent;", 0);
        C13LE.LIZ.getClass();
        LLJJJJ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // X.InterfaceC204601154d
    public final void LIZ() {
    }

    @Override // X.C154N
    public final void LJIIJ(View view) {
    }

    @Override // X.InterfaceC204601154d
    public final void LIZLLL() {
        C129L c129l;
        List<MusicModel> data;
        C129L c129l2;
        if (this.LLJILJIL) {
            C129L c129l3 = this.LLJI;
            if (c129l3 == null || (data = c129l3.getData()) == null || data.isEmpty() || (c129l2 = this.LLJI) == null) {
                return;
            }
            c129l2.notifyDataSetChanged();
            return;
        }
        this.LLJILJILJ.clear();
        this.LLJILJILJ.addAll(this.LLJJIII.LIZ);
        ((ArrayList) this.LLJJIJIIJIL).clear();
        ((ArrayList) this.LLJJIJIIJIL).addAll(this.LLJJIII.LIZ);
        if (!((ArrayList) this.LLJJIJI.LIZ).isEmpty()) {
            VideoSectionModel videoSectionModel = new VideoSectionModel(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20)));
            videoSectionModel.setId(612470090);
            ((ArrayList) this.LLJJIJIIJIL).add(videoSectionModel);
            ((ArrayList) this.LLJJIJIIJIL).addAll(this.LLJJIJI.LIZ);
        }
        C154W c154w = this.LLJJIJI;
        this.LLJJJ = c154w.LIZIZ;
        this.LLJJIJIL = c154w.LIZJ;
        C129L c129l4 = this.LLJI;
        if (c129l4 != null) {
            c129l4.setData(this.LLJJIJIIJIL);
        }
        if (!this.LLJJIJIL && (c129l = this.LLJI) != null) {
            c129l.setShowFooter(false);
        }
        this.LLJILJIL = true;
    }

    @Override // X.InterfaceC204601154d
    public final View LJIIIIZZ() {
        return (View) this.LLJILLL.getValue();
    }

    @Override // X.C154N
    public final void LJIILL() {
        C155H c155hLJIIJJI;
        AbstractC204621154x abstractC204621154xLJIILJJIL;
        VideoPlayerComponent videoPlayerComponent;
        C155W c155wLJIIL = LJIIL();
        if (c155wLJIIL == null || (c155hLJIIJJI = LJIIJJI()) == null || (abstractC204621154xLJIILJJIL = LJIILJJIL()) == null || (videoPlayerComponent = (VideoPlayerComponent) this.LLJJJIL.getValue(this, LLJJJJ[0])) == null) {
            return;
        }
        final WrapGridLayoutManager wrapGridLayoutManager = new WrapGridLayoutManager(2, this.LLILLJJLI);
        C155O c155o = new C155O(c155hLJIIJJI, EnumC1654750tA9.TAB_COLLECT, abstractC204621154xLJIILJJIL, c155wLJIIL, videoPlayerComponent, this, this.LLJJI);
        C129L c129l = new C129L(this.LL, c155o, c155wLJIIL.zt(), c155hLJIIJJI.LIZ, new AwS575S0100000_31(c155hLJIIJJI, 1310));
        c129l.spanSizeLookup2 = new AbstractC683540QrY() { // from class: X.154X
            @Override // X.AbstractC683540QrY
            public final int LJII(int i) {
                if (i == 11) {
                    return 1;
                }
                return wrapGridLayoutManager.LLILLJJLI;
            }
        };
        c129l.LLLIL(new InterfaceC19413110xF() { // from class: X.154V
            @Override // X.InterfaceC19413110xF
            public final void LJJIFFI() {
                AbstractC204621154x abstractC204621154xLJIILJJIL2;
                LifecycleCoroutineScope lifecycleCoroutineScopeLJJ;
                C154P c154p = this.LIZ;
                if (!c154p.LLJJIJIL || (abstractC204621154xLJIILJJIL2 = c154p.LJIILJJIL()) == null || (lifecycleCoroutineScopeLJJ = abstractC204621154xLJIILJJIL2.LJJ()) == null) {
                    return;
                }
                C23250099c.LIZLLL(lifecycleCoroutineScopeLJJ, null, null, new C154S(c154p, null), 3);
            }
        });
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
            final Context context = this.LLILLJJLI;
            c425240Glu3.addItemDecoration(new C115Z(context) { // from class: X.10wy
                public int LLIZLLLIL = -1;

                @Override // X.C115Z, X.C0DXR
                public final void LIZIZ(Rect rect, View view, RecyclerView recyclerView, C21673919s1 c21673919s1) {
                    Integer numValueOf;
                    int i;
                    int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
                    AbstractC21673619ry adapter = recyclerView.getAdapter();
                    if (adapter != null) {
                        int itemCount = adapter.getItemCount();
                        if (childAdapterPosition >= 0 && childAdapterPosition < itemCount) {
                            AbstractC21673619ry adapter2 = recyclerView.getAdapter();
                            if (adapter2 != null) {
                                numValueOf = Integer.valueOf(adapter2.getItemViewType(childAdapterPosition));
                            } else {
                                numValueOf = null;
                            }
                            if (numValueOf != null && numValueOf.intValue() == 12) {
                                this.LLIZLLLIL = childAdapterPosition;
                            }
                            if (numValueOf != null && numValueOf.intValue() == 11 && (i = this.LLIZLLLIL) != -1) {
                                int i2 = (childAdapterPosition - i) % 2;
                                if (i2 != 0) {
                                    if (i2 == 1) {
                                        rect.left = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10));
                                    }
                                } else {
                                    rect.right = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10));
                                }
                            }
                            if (childAdapterPosition == 0 && (numValueOf == null || numValueOf.intValue() != 12)) {
                                rect.top = this.LL;
                            }
                            if (childAdapterPosition + 1 == itemCount) {
                                if (numValueOf == null || numValueOf.intValue() != 11) {
                                    rect.bottom = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10));
                                }
                            }
                        }
                    }
                }
            });
        }
        c155o.LJI = c129l;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.ArrayList] */
    @Override // X.C154N
    public final boolean LJIIZILJ() {
        ?? arrayList;
        List<MusicModel> data;
        C129L c129l = this.LLJI;
        if (c129l == null || (data = c129l.getData()) == null) {
            arrayList = C13BV.INSTANCE;
        } else {
            arrayList = new ArrayList();
            for (MusicModel musicModel : data) {
                if (!(musicModel instanceof VideoMusicModel) && !(musicModel instanceof VideoSectionModel)) {
                    arrayList.add(musicModel);
                }
            }
        }
        if (this.LLJILJILJ.size() != arrayList.size()) {
            return true;
        }
        int size = this.LLJILJILJ.size();
        for (int i = 0; i < size; i++) {
            if (!Intrinsics.LJFF(this.LLJILJILJ.get(i).getMusicId(), ((MusicModel) ListProtector.get(arrayList, i)).getMusicId())) {
                return true;
            }
        }
        return false;
    }

    @Override // X.InterfaceC204601154d
    public final void LJJLIIIIJ() {
        C129L c129l;
        if (Intrinsics.LJFF(this.LLJJIJI.LJ, Boolean.TRUE) && (!((ArrayList) this.LLJJIJI.LIZ).isEmpty()) && (c129l = this.LLJI) != null) {
            c129l.notifyDataSetChanged();
        }
    }

    @Override // X.InterfaceC204601154d
    public final boolean LJII() {
        return LJIIZILJ();
    }

    @Override // X.InterfaceC204601154d
    public final C129G LJ() {
        return this.LLJI;
    }

    @Override // X.InterfaceC204601154d
    public final boolean LIZIZ(String str) {
        return LJIILLIIL(str);
    }

    @Override // X.InterfaceC204601154d
    public final void LJI(boolean z) {
        LJIJ(z);
    }

    @Override // X.C154N
    public final void LJIJ(boolean z) {
        if (z) {
            VideoPlayerComponent videoPlayerComponent = (VideoPlayerComponent) this.LLJJJIL.getValue(this, LLJJJJ[0]);
            if (videoPlayerComponent != null) {
                videoPlayerComponent.LIZ();
            }
        } else {
            VideoPlayerComponent videoPlayerComponent2 = (VideoPlayerComponent) this.LLJJJIL.getValue(this, LLJJJJ[0]);
            if (videoPlayerComponent2 != null) {
                VideoPlayerComponent.LJFF(videoPlayerComponent2, null);
            }
        }
        C129L c129l = this.LLJI;
        if (c129l != null) {
            c129l.LLLIILIL(-1);
        }
    }

    @Override // X.InterfaceC204601154d
    public final void LIZJ(MusicModel musicModel, MusicModel.CollectionType collectionType, boolean z) {
        LJJII(musicModel, collectionType, z);
    }

    @Override // X.C154N
    public final void LJJII(MusicModel musicModel, MusicModel.CollectionType collectionType, boolean z) {
        List<MusicModel> data;
        IMusicRequestParam iMusicRequestParamLJIILIIL;
        C129L c129l = this.LLJI;
        if (c129l != null && (data = c129l.getData()) != null) {
            int i = 0;
            int i2 = -1;
            int i3 = 0;
            for (MusicModel musicModel2 : data) {
                int i4 = i3 + 1;
                if (i3 >= 0) {
                    MusicModel musicModel3 = musicModel2;
                    if (!(musicModel3 instanceof VideoMusicModel) && !(musicModel3 instanceof VideoSectionModel) && Intrinsics.LJFF(musicModel.getMusicId(), musicModel3.getMusicId())) {
                        i2 = i3;
                    }
                    i3 = i4;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
            if (i2 == -1) {
                if (collectionType == MusicModel.CollectionType.COLLECTED) {
                    if (data.size() > 0 && (iMusicRequestParamLJIILIIL = LJIILIIL()) != null && iMusicRequestParamLJIILIIL.getUnlimitedOnly()) {
                        i = 1;
                    }
                    musicModel.setCollectionType(collectionType);
                    ListProtector.add(data, i, musicModel);
                }
            } else if (collectionType == MusicModel.CollectionType.NOT_COLLECTED) {
                if (!z) {
                    ListProtector.remove(data, i2);
                } else {
                    ((MusicModel) ListProtector.get(data, i2)).setCollectionType(collectionType);
                }
            }
            C129L c129l2 = this.LLJI;
            if (c129l2 != null) {
                c129l2.notifyDataSetChanged();
            }
        }
    }

    public C154P(C1DRG c1drg, Context context, C154J c154j, C154W c154w) {
        super(context, c1drg);
        this.LLJJI = null;
        this.LLJJIII = c154j;
        this.LLJJIJI = c154w;
        this.LLJJIJIIJIL = new ArrayList();
        this.LLJJJIL = C1664770tQJ.LIZIZ(c1drg, VideoPlayerComponent.class, null);
    }
}
