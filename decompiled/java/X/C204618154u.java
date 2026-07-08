package X;

import Y.ARunnableS42S0101000_31;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.OnThisDayData;
import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.music.service.IMusicService;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.shortvideo.model.VideoMusicModel;
import com.ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AFwS189S0000000_3;
import kotlin.jvm.internal.AFwS221S0000000_31;
import kotlin.jvm.internal.AwS575S0100000_31;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.154u, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C204618154u extends C204623154z implements InterfaceC204629155f {
    public final Context LJ;
    public RecyclerView LJFF;
    public C1630570sX9 LJI;
    public FrameLayout LJII;
    public C03BJ LJIIIIZZ;
    public int LJIIIZ;
    public C129G LJIIJ;
    public final C01GW LJIIJJI = C452501pT.LIZIZ(new AwS575S0100000_31(this, 1594));
    public final C01GW LJIIL = C452501pT.LIZIZ(new AwS575S0100000_31(this, 1595));
    public final C01GW LJIILIIL = C452501pT.LIZIZ(AFwS189S0000000_3.get$arr$(1709));
    public final C01GW LJIILJJIL = C452501pT.LIZIZ(AFwS221S0000000_31.get$arr$(543));
    public boolean LJIILL = true;
    public final C01GW LJIILLIIL = C452501pT.LIZIZ(new AwS575S0100000_31(this, 1592));
    public boolean LJIIZILJ;

    /* JADX WARN: Removed duplicated region for block: B:31:0x006c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJII() {
        /*
            r4 = this;
            X.129G r0 = r4.LJIIJ
            r3 = 0
            if (r0 == 0) goto L69
            int r1 = r0.getItemCount()
            r0 = 2
            if (r1 <= r0) goto L69
            X.154x r0 = r4.LJI()
            boolean r0 = r0.LJJIIZI()
            if (r0 == 0) goto L69
            X.155H r0 = r4.LIZJ()
            X.0tA9 r1 = r0.LJJIJL
            X.0tA9 r0 = X.EnumC1654750tA9.TAB_AI
            if (r1 != r0) goto L69
            X.155H r0 = r4.LIZJ()
            java.util.List<com.ss.android.ugc.aweme.shortvideo.model.MusicModel> r0 = r0.LJIJJ
            if (r0 == 0) goto L70
            int r2 = r0.size()
        L2c:
            X.155H r0 = r4.LIZJ()
            X.155G r0 = r0.LJJII
            com.ss.android.ugc.aweme.shortvideo.model.MusicModel r0 = r0.LIZJ
            if (r0 == 0) goto L37
            r2 = 0
        L37:
            boolean r0 = X.C298090BmJ.LIZ()
            if (r0 == 0) goto L6c
            X.155H r0 = r4.LIZJ()
            java.lang.String r1 = r0.LJJIIJ
            X.129G r0 = r4.LJIIJ
            if (r0 == 0) goto L6a
            java.util.List r0 = r0.getData()
            if (r0 == 0) goto L6a
            java.lang.Object r0 = X.C13LP.LJJJLL(r0)
            com.ss.android.ugc.aweme.shortvideo.model.MusicModel r0 = (com.ss.android.ugc.aweme.shortvideo.model.MusicModel) r0
            if (r0 == 0) goto L6a
            java.lang.String r0 = r0.getMusicId()
        L59:
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L6c
            r0 = 1
            r4.LJIIJJI(r3, r0)
        L63:
            X.155H r0 = r4.LIZJ()
            r0.LJIIIZ = r3
        L69:
            return
        L6a:
            r0 = 0
            goto L59
        L6c:
            r4.LJIIJJI(r2, r3)
            goto L63
        L70:
            r2 = 0
            goto L2c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C204618154u.LJII():void");
    }

    public final boolean LJIIIIZZ() {
        return ((Boolean) this.LJIILIIL.getValue()).booleanValue();
    }

    public final List<MusicModel> LJIIIZ() {
        C129G c129g = this.LJIIJ;
        if (c129g != null) {
            return c129g.getData();
        }
        return null;
    }

    public final AnonymousClass1553 LJIIJ() {
        return (AnonymousClass1553) this.LJIIL.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:90:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01e5  */
    @Override // X.AbstractC204610154m, X.InterfaceC204626155c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LLZ() {
        /*
            Method dump skipped, instruction units count: 512
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C204618154u.LLZ():void");
    }

    @Override // X.InterfaceC204629155f
    public final List<MusicModel> getMusicList() {
        List<MusicModel> data;
        List<MusicModel> listLLIIII;
        C129G c129g = this.LJIIJ;
        return (c129g == null || (data = c129g.getData()) == null || (listLLIIII = C13LP.LLIIII(data)) == null) ? C13BV.INSTANCE : listLLIIII;
    }

    @Override // X.InterfaceC204626155c
    public final View getView() {
        return (View) this.LJIILLIIL.getValue();
    }

    @Override // X.InterfaceC204626155c
    public final void z3() {
        LIZJ().LJIILIIL.z3();
        C1630570sX9 c1630570sX9 = this.LJI;
        if (c1630570sX9 == null) {
            c1630570sX9 = null;
        }
        if (!(c1630570sX9 instanceof C1630570sX9) || c1630570sX9 == null) {
            return;
        }
        c1630570sX9.LIZLLL();
    }

    @Override // X.InterfaceC204626155c
    public final AbstractC21673619ry<?> LJJLIIIJL() {
        return this.LJIIJ;
    }

    public C204618154u(C1361400lX0 c1361400lX0) {
        this.LJ = c1361400lX0;
    }

    public static void LJIILJJIL(MusicModel musicModel) {
        musicModel.setMusicStart(0);
        musicModel.setMusicStartFromCut(0);
        musicModel.setMusicBeginTime(0);
        musicModel.setMusicEndTime(0);
        musicModel.setMusicEndFromCut(0);
        musicModel.setTrimPointRecommended(false);
    }

    @Override // X.InterfaceC204629155f
    public final void LIZ(String str) {
        List<MusicModel> data;
        List<MusicModel> listLJIIIZ = LJIIIZ();
        if (listLJIIIZ != null) {
            Iterator<MusicModel> it2 = listLJIIIZ.iterator();
            int i = 0;
            while (it2.hasNext()) {
                if (Intrinsics.LJFF(it2.next().getMusicId(), str)) {
                    if (i >= 0) {
                        C129G c129g = this.LJIIJ;
                        if (c129g != null && (data = c129g.getData()) != null) {
                            ListProtector.remove(data, i);
                        }
                        C129G c129g2 = this.LJIIJ;
                        if (c129g2 != null) {
                            c129g2.notifyItemRemoved(i);
                            return;
                        }
                        return;
                    }
                    return;
                }
                i++;
            }
        }
    }

    public final void LJIILIIL(List<MusicModel> list) {
        boolean z;
        if (list != null && !list.isEmpty()) {
            z = false;
        } else {
            z = true;
        }
        RecyclerView recyclerView = null;
        if (z) {
            if (this.LJIIZILJ) {
                this.LJIIZILJ = false;
                C1630570sX9 c1630570sX9 = this.LJI;
                if (c1630570sX9 == null) {
                    c1630570sX9 = null;
                }
                C1627000sRO.LIZIZ(c1630570sX9.getContext(), true);
            }
            C03BJ c03bj = this.LJIIIIZZ;
            if (c03bj != null) {
                C786410Ut5.h1(c03bj, 8);
            }
            C1630570sX9 c1630570sX92 = this.LJI;
            if (c1630570sX92 == null) {
                c1630570sX92 = null;
            }
            C786410Ut5.LJLLLLLL(0, c1630570sX92);
            C1630570sX9 c1630570sX93 = this.LJI;
            if (c1630570sX93 == null) {
                c1630570sX93 = null;
            }
            if ((c1630570sX93 instanceof AbstractC1643790ssT) && c1630570sX93 != null) {
                c1630570sX93.LIZ();
                return;
            }
            return;
        }
        C129G c129g = this.LJIIJ;
        if (c129g == null) {
            final C155K c155k = new C155K(LIZJ(), EnumC1654750tA9.TAB_AI, LJI(), (C155W) this.LJIIJJI.getValue());
            C129G c129g2 = new C129G(LJFF(), new AnonymousClass1297() { // from class: X.155I
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
                public final boolean LIZIZ() {
                    return c155k.LIZ();
                }

                @Override // X.AnonymousClass1297
                public final boolean LIZJ() {
                    return c155k.LIZ.LJIIL.LIZJ();
                }

                @Override // X.AnonymousClass1297
                public final boolean LJ() {
                    return this.LIZ.LIZJ().LJIIL.LJIILIIL();
                }

                @Override // X.AnonymousClass1297
                public final void LJIILL(int i) {
                    List<MusicModel> listLJIIIZ;
                    MusicModel musicModel;
                    MusicModel musicModelLJIL;
                    if (i >= 0 && (listLJIIIZ = this.LIZ.LJIIIZ()) != null && (musicModel = (MusicModel) C13LP.LJJJLZIJ(i, listLJIIIZ)) != null) {
                        musicModel.setSmartExtended(!musicModel.isSmartExtended());
                        C129G c129g3 = this.LIZ.LJIIJ;
                        if (c129g3 != null) {
                            c129g3.LLLIILIL(i);
                        }
                        AbstractC204621154x abstractC204621154x = this.LIZ.LIZLLL;
                        if (abstractC204621154x != null) {
                            abstractC204621154x.LJJIJIIJIL(i, musicModel, EnumC1654750tA9.TAB_AI, false, null, false, null, null);
                        }
                        AbstractC204621154x abstractC204621154x2 = this.LIZ.LIZLLL;
                        if (abstractC204621154x2 != null && (musicModelLJIL = abstractC204621154x2.LJIL()) != null) {
                            C204618154u c204618154u = this.LIZ;
                            C155P c155p = c204618154u.LIZJ().LJIILIIL;
                            EnumC1654750tA9 enumC1654750tA9 = EnumC1654750tA9.TAB_AI;
                            c155p.LJ(musicModelLJIL, enumC1654750tA9.getStringValue(), "smart_extend_click", musicModel.isSmartExtended());
                            c204618154u.LIZJ().LJIILIIL.LJ(musicModelLJIL, enumC1654750tA9.getStringValue(), "smart_extend_show", musicModel.isSmartExtended());
                        }
                    }
                }

                @Override // X.AnonymousClass1297
                public final int LJIILLIIL(MusicModel musicModel) {
                    return ((C155W) this.LIZ.LJIIJJI.getValue()).Gt(musicModel);
                }

                @Override // X.AnonymousClass1297
                public final void LIZ(int i, View view) {
                    List<MusicModel> listLJIIIZ;
                    MusicModel musicModel;
                    boolean z2;
                    C129G c129g3;
                    if (i >= 0 && (listLJIIIZ = this.LIZ.LJIIIZ()) != null && (musicModel = (MusicModel) C13LP.LJJJLZIJ(i, listLJIIIZ)) != null) {
                        C129G c129g4 = this.LIZ.LJIIJ;
                        if (c129g4 != null && c129g4.LLLI(musicModel)) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        String strLIZ = null;
                        if (z2) {
                            if (!this.LIZ.LIZJ().LJIL.invoke().booleanValue()) {
                                return;
                            }
                            if (C1399580mWa.LIZ()) {
                                List<MusicModel> mergedMusicList = musicModel.getMergedMusicList();
                                C204618154u c204618154u = this.LIZ;
                                for (MusicModel musicModel2 : mergedMusicList) {
                                    if (!C1459090o4Z.LIZIZ(musicModel)) {
                                        c204618154u.getClass();
                                        C204618154u.LJIILJJIL(musicModel2);
                                    }
                                }
                            } else {
                                List<MusicModel> mergedMusicList2 = musicModel.getMergedMusicList();
                                C204618154u c204618154u2 = this.LIZ;
                                for (MusicModel musicModel3 : mergedMusicList2) {
                                    c204618154u2.getClass();
                                    C204618154u.LJIILJJIL(musicModel3);
                                }
                            }
                            this.LIZ.LIZJ().LJIILIIL.LIZJ(musicModel, EnumC1654750tA9.TAB_AI.getStringValue(), i, null);
                            C204618154u c204618154u3 = this.LIZ;
                            AbstractC204621154x abstractC204621154x = c204618154u3.LIZLLL;
                            if (abstractC204621154x != null) {
                                abstractC204621154x.LJIIL(c204618154u3.LJIIJ, false, true, musicModel, true);
                                return;
                            }
                            return;
                        }
                        if (C1399580mWa.LIZ()) {
                            List<MusicModel> mergedMusicList3 = musicModel.getMergedMusicList();
                            C204618154u c204618154u4 = this.LIZ;
                            for (MusicModel musicModel4 : mergedMusicList3) {
                                if (!C1459090o4Z.LIZIZ(musicModel)) {
                                    c204618154u4.getClass();
                                    C204618154u.LJIILJJIL(musicModel4);
                                }
                            }
                        } else {
                            List<MusicModel> mergedMusicList4 = musicModel.getMergedMusicList();
                            C204618154u c204618154u5 = this.LIZ;
                            for (MusicModel musicModel5 : mergedMusicList4) {
                                c204618154u5.getClass();
                                C204618154u.LJIILJJIL(musicModel5);
                            }
                        }
                        if (C0BOF.LIZ()) {
                            musicModel.setMusicSelectedFromNonRecommendedTab(false);
                        }
                        IMusicService iMusicService = (IMusicService) this.LIZ.LJIILJJIL.getValue();
                        if (iMusicService != null) {
                            strLIZ = iMusicService.LIZ(musicModel);
                        }
                        boolean zLIZJ = C2286708xd.LIZJ(strLIZ);
                        if (!zLIZJ && (c129g3 = this.LIZ.LJIIJ) != null) {
                            c129g3.LLLIILIL(i);
                        }
                        C155D c155dH5 = ((C155W) this.LIZ.LJIIJJI.getValue()).H5();
                        if (c155dH5 != null) {
                            c155dH5.LIZJ(zLIZJ);
                        }
                        AbstractC204621154x abstractC204621154x2 = this.LIZ.LIZLLL;
                        if (abstractC204621154x2 != null) {
                            abstractC204621154x2.LJJIJIIJIL(i, musicModel, EnumC1654750tA9.TAB_AI, true, null, false, null, null);
                        }
                        List<MusicModel> smartExtendMusicList = musicModel.getSmartExtendMusicList();
                        if (smartExtendMusicList != null && !smartExtendMusicList.isEmpty()) {
                            this.LIZ.LIZJ().LJIILIIL.LJ(musicModel, EnumC1654750tA9.TAB_AI.getStringValue(), "smart_extend_show", musicModel.isSmartExtended());
                        }
                    }
                }

                @Override // X.AnonymousClass1297
                public final void LIZLLL(MusicModel musicModel, boolean z2) {
                    this.LIZ.LIZIZ(musicModel, z2);
                }

                @Override // X.AnonymousClass1297
                public final void LJFF(MusicModel musicModel, int i) {
                    EnumC1654750tA9 enumC1654750tA9LJIILL;
                    AbstractC204621154x abstractC204621154x;
                    EnumC1654750tA9 enumC1654750tA9 = this.LIZ.LIZJ().LJJIJIL;
                    EnumC1654750tA9 enumC1654750tA92 = EnumC1654750tA9.TAB_AI;
                    if (enumC1654750tA9 != enumC1654750tA92) {
                        AbstractC204621154x abstractC204621154x2 = this.LIZ.LIZLLL;
                        if (abstractC204621154x2 != null) {
                            enumC1654750tA9LJIILL = abstractC204621154x2.LJIILL();
                        } else {
                            enumC1654750tA9LJIILL = null;
                        }
                        if (enumC1654750tA9LJIILL == enumC1654750tA92 && (abstractC204621154x = this.LIZ.LIZLLL) != null) {
                            abstractC204621154x.LJJIIJ(musicModel, enumC1654750tA92, i, null, null, null, null);
                            return;
                        }
                        return;
                    }
                    AbstractC204621154x abstractC204621154x3 = this.LIZ.LIZLLL;
                    if (abstractC204621154x3 == null) {
                        return;
                    }
                    abstractC204621154x3.LJJIIJ(musicModel, enumC1654750tA92, i, null, null, null, null);
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
            }, ((C155W) this.LJIIJJI.getValue()).zt(), LIZJ().LIZ, false, LJIIIIZZ(), 16);
            this.LJIIJ = c129g2;
            c155k.LJFF = c129g2;
            c129g2.LLJI = LIZJ().LJIJ.invoke().booleanValue();
            WrapLinearLayoutManager wrapLinearLayoutManager = new WrapLinearLayoutManager(LIZJ().LJJIIJZLJL, 1);
            RecyclerView recyclerView2 = this.LJFF;
            if (recyclerView2 == null) {
                recyclerView2 = null;
            }
            recyclerView2.setLayoutManager(wrapLinearLayoutManager);
            RecyclerView recyclerView3 = this.LJFF;
            if (recyclerView3 == null) {
                recyclerView3 = null;
            }
            C786410Ut5.LLIZLLLIL(recyclerView3, 0);
            RecyclerView recyclerView4 = this.LJFF;
            if (recyclerView4 == null) {
                recyclerView4 = null;
            }
            recyclerView4.setAdapter(this.LJIIJ);
            if (!LJIIJ().LLILLJJLI.LIZLLL) {
                C129G c129g3 = this.LJIIJ;
                if (c129g3 != null) {
                    c129g3.setLoadEmptyText((CharSequence) null);
                }
                C129G c129g4 = this.LJIIJ;
                if (c129g4 != null) {
                    c129g4.showLoadMoreEmpty();
                }
            }
            C03BJ c03bj2 = this.LJIIIIZZ;
            if (c03bj2 != null) {
                C786410Ut5.h1(c03bj2, 8);
            }
            C129G c129g5 = this.LJIIJ;
            if (c129g5 != null) {
                c129g5.LLLIL(new InterfaceC19413110xF() { // from class: X.154y
                    @Override // X.InterfaceC19413110xF
                    public final void LJJIFFI() {
                        if (this.LIZ.LJIIJ().LLILLJJLI.LIZLLL) {
                            C129G c129g6 = this.LIZ.LJIIJ;
                            if (c129g6 != null) {
                                c129g6.showLoadMoreLoading();
                            }
                            LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope(this.LIZ.LIZJ().LJI);
                            C1DFH c1dfh = C0PEM.LIZ;
                            C23250099c.LIZLLL(lifecycleScope, C2107308Nj.LIZ, null, new C204620154w(this.LIZ, null), 2);
                        }
                    }
                });
            }
            C129G c129g6 = this.LJIIJ;
            if (c129g6 != null) {
                c129g6.setData(list);
            }
            LJII();
            return;
        }
        c129g.setDataAfterLoadMore(list);
        C03BJ c03bj3 = this.LJIIIIZZ;
        if (c03bj3 != null) {
            C786410Ut5.h1(c03bj3, 8);
        }
        C1458370o3P c1458370o3P = C1458370o3P.LIZ;
        boolean z2 = LIZJ().LJIIJ;
        Context context = this.LJ;
        c1458370o3P.getClass();
        int iLJIILJJIL = C1458370o3P.LJIILJJIL(context, z2);
        RecyclerView recyclerView5 = this.LJFF;
        if (recyclerView5 != null) {
            recyclerView = recyclerView5;
        }
        HandlerHook.viewPost(recyclerView, new ARunnableS42S0101000_31(iLJIILJJIL, this, 17));
    }

    @Override // X.InterfaceC204626155c
    public final void LLZILL(boolean z) {
        CreativeModel creativeModel;
        OnThisDayData onThisDayData;
        Boolean bool;
        AVMusic aVMusicLLLFZ;
        LinearLayoutManager linearLayoutManager;
        int iFindFirstVisibleItemPosition;
        int iFindLastVisibleItemPosition;
        List<MusicModel> data;
        MusicModel musicModel;
        LIZJ().LIZ.LIZJ = true;
        C155P c155p = LIZJ().LJIILIIL;
        EnumC1654750tA9 enumC1654750tA9 = EnumC1654750tA9.TAB_AI;
        c155p.LIZLLL(enumC1654750tA9.getStringValue(), z, LJ());
        RecyclerView recyclerView = null;
        if (LIZJ().LJJIJIL != enumC1654750tA9 && this.LJIILL) {
            this.LJIILL = false;
            RecyclerView recyclerView2 = this.LJFF;
            if (recyclerView2 == null) {
                recyclerView2 = null;
            }
            RecyclerView.LayoutManager layoutManager = recyclerView2.getLayoutManager();
            if ((layoutManager instanceof LinearLayoutManager) && (linearLayoutManager = (LinearLayoutManager) layoutManager) != null && (iFindFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition()) <= (iFindLastVisibleItemPosition = linearLayoutManager.findLastVisibleItemPosition())) {
                while (true) {
                    C129G c129g = this.LJIIJ;
                    if (c129g != null && (data = c129g.getData()) != null && (musicModel = (MusicModel) C13LP.LJJJLZIJ(iFindFirstVisibleItemPosition, data)) != null) {
                        LJI().LJJIIJ(musicModel, EnumC1654750tA9.TAB_AI, iFindFirstVisibleItemPosition, null, null, null, null);
                    }
                    if (iFindFirstVisibleItemPosition == iFindLastVisibleItemPosition) {
                        break;
                    } else {
                        iFindFirstVisibleItemPosition++;
                    }
                }
            }
        }
        List<MusicModel> listLJIIIZ = LJIIIZ();
        if (listLJIIIZ != null && !listLJIIIZ.isEmpty() && LJI().LJIILL() != EnumC1654750tA9.TAB_AI && (bool = LJIIJ().LLILLJJLI.LJI) != null && bool.booleanValue()) {
            AnonymousClass1553 anonymousClass1553LJIIJ = LJIIJ();
            AnonymousClass1556 anonymousClass1556 = anonymousClass1553LJIIJ.LLILLL;
            List<MusicModel> listLIZIZ = anonymousClass1553LJIIJ.LIZIZ(C13BV.INSTANCE);
            ArrayList<MusicModel> arrayList = anonymousClass1553LJIIJ.LLILLJJLI.LIZ;
            anonymousClass1556.getClass();
            List<MusicModel> listLIZ = AnonymousClass1556.LIZ(listLIZIZ, arrayList);
            anonymousClass1553LJIIJ.LIZ(listLIZ);
            if (LJIIIIZZ()) {
                C129I.LIZ(this.LJIIJ, listLIZ);
            } else {
                C129G c129g2 = this.LJIIJ;
                if (c129g2 != null) {
                    c129g2.setData(listLIZ);
                }
            }
            C129G c129g3 = this.LJIIJ;
            if (c129g3 != null) {
                c129g3.LLLILZ();
            }
            C129G c129g4 = this.LJIIJ;
            if (c129g4 != null && (aVMusicLLLFZ = c129g4.LLLFZ()) != null) {
                List listLL = C13LP.LL(listLIZ, 2);
                if (!(listLL instanceof Collection) || !listLL.isEmpty()) {
                    Iterator it2 = listLL.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        MusicModel musicModel2 = (MusicModel) it2.next();
                        if (this.LJIIJ != null && C129G.LLLII(musicModel2, aVMusicLLLFZ)) {
                            RecyclerView recyclerView3 = this.LJFF;
                            if (recyclerView3 != null) {
                                recyclerView = recyclerView3;
                            }
                            recyclerView.scrollToPosition(0);
                        }
                    }
                }
            }
        }
        VideoPublishEditModel videoPublishEditModel = this.LIZJ;
        if (videoPublishEditModel != null && (creativeModel = videoPublishEditModel.creativeModel) != null && (onThisDayData = creativeModel.onThisDayData) != null && onThisDayData.isInOnThisDayPreviewPage()) {
            onThisDayData.setMusicSelectedFromV2("on_this_day_page_recommend");
        }
    }

    public final void LJIIJJI(int i, boolean z) {
        MusicModel musicModel;
        C129G c129g = this.LJIIJ;
        if (c129g != null) {
            c129g.LLLIILIL(i);
        }
        List<MusicModel> listLJIIIZ = LJIIIZ();
        if (listLJIIIZ != null && (musicModel = (MusicModel) C13LP.LJJJLZIJ(i, listLJIIIZ)) != null) {
            LJI().LJJIJLIJ(musicModel.getMusicId());
            musicModel.shouldUseMDPDownloader = z;
            LJI().LJJIZ(i, musicModel, EnumC1654750tA9.TAB_AI.getStringValue(), true, false);
        }
    }

    public final void LJIIL(boolean z, boolean z2) {
        boolean zBooleanValue;
        C129G c129g;
        Boolean bool = LJIIJ().LLILLJJLI.LJI;
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        } else {
            zBooleanValue = false;
        }
        boolean z3 = true;
        this.LJIIZILJ = !zBooleanValue;
        if (z2 && (c129g = this.LJIIJ) != null) {
            c129g.setData(null);
        }
        List<MusicModel> listLIZIZ = LJIIJ().LIZIZ(C13BV.INSTANCE);
        ArrayList arrayList = (ArrayList) listLIZIZ;
        if (!arrayList.isEmpty()) {
            LJIILIIL(listLIZIZ);
            if ((!LIZJ().LJJII.LIZ || !LIZJ().LJIIIZ) && LIZJ().LJJII.LIZ) {
                z3 = false;
            }
            if (LIZJ().LJIILJJIL == C00IV.REPLACEMUSICPAGE && z3) {
                LJIIJJI(0, false);
            }
            C03BJ c03bj = this.LJIIIIZZ;
            if (c03bj != null) {
                c03bj.setBeginningChildViewsInvisible(arrayList.size());
                C786410Ut5.h1(c03bj, 0);
            }
        } else {
            C03BJ c03bj2 = this.LJIIIIZZ;
            if (c03bj2 != null) {
                c03bj2.setBeginningChildViewsInvisible(0);
                C786410Ut5.h1(c03bj2, 0);
            }
        }
        LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope(LIZJ().LJI);
        C1DFH c1dfh = C0PEM.LIZ;
        C23250099c.LIZLLL(lifecycleScope, C2107308Nj.LIZ, null, new C204619154v(this, z, z2, null), 2);
    }

    @Override // X.AbstractC204610154m, X.InterfaceC204626155c
    public final void LLZIL(String str, boolean z) {
        MusicModel.CollectionType collectionType;
        LJI().LJJIJ(str, z);
        List<MusicModel> listLJIIIZ = LJIIIZ();
        if (listLJIIIZ != null) {
            int i = 0;
            for (MusicModel musicModel : listLJIIIZ) {
                int i2 = i + 1;
                if (i >= 0) {
                    MusicModel musicModel2 = musicModel;
                    if (Intrinsics.LJFF(musicModel2.getMusicId(), str)) {
                        if (z) {
                            collectionType = MusicModel.CollectionType.COLLECTED;
                        } else {
                            collectionType = MusicModel.CollectionType.NOT_COLLECTED;
                        }
                        if (musicModel2.getCollectionType() != collectionType) {
                            musicModel2.setCollectionType(collectionType);
                            C129G c129g = this.LJIIJ;
                            if (c129g != null) {
                                c129g.notifyItemChanged(i);
                            }
                        }
                    }
                    i = i2;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
        }
    }

    @Override // X.AbstractC204610154m, X.InterfaceC204626155c
    public final void LLZLI(MusicModel musicModel, MusicModel.CollectionType collectionType) {
        String musicId = musicModel.getMusicId();
        List<MusicModel> listLJIIIZ = LJIIIZ();
        if (listLJIIIZ != null) {
            for (MusicModel musicModel2 : listLJIIIZ) {
                if (Intrinsics.LJFF(musicModel2.getMusicId(), musicId)) {
                    Iterator<MusicModel> it2 = musicModel2.getMergedMusicList().iterator();
                    while (it2.hasNext()) {
                        it2.next().setCollectionType(collectionType);
                    }
                }
            }
        }
    }
}
