package X;

import Y.ARunnableS131S0100000_31;
import Y.ARunnableS28S0210000_31;
import android.content.Context;
import android.os.Handler;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.commercialize.media.api.service.ICommerceMediaService;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.OnThisDayData;
import com.ss.android.ugc.aweme.creative.model.music.MusicBuzModel;
import com.ss.android.ugc.aweme.creative.model.music.MusicObject;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.music.model.MusicBeanUtilKt;
import com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.shortvideo.model.VideoMusicModel;
import com.ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.AwS575S0100000_31;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.154h, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C204605154h extends C204611154n {
    public final Context LJ;
    public FrameLayout LJI;
    public LinearLayout LJII;
    public C1749280vcc LJIIIIZZ;
    public C1630570sX9 LJIIIZ;
    public C425240Glu LJIIJ;
    public C129L LJIIJJI;
    public boolean LJIILIIL;
    public final C204657156h LJFF = new C204657156h();
    public final C154J LJIIL = new C154J();
    public final C01GW LJIILJJIL = C452501pT.LIZIZ(new AwS575S0100000_31(this, 1533));
    public final C01GW LJIILL = C452501pT.LIZIZ(new AwS575S0100000_31(this, 1532));
    public final C01GW LJIILLIIL = C452501pT.LIZIZ(new AwS575S0100000_31(this, 1530));

    public final void LJII() {
        LinearLayout linearLayout = this.LJII;
        if (linearLayout != null) {
            C786410Ut5.LJZL(0, linearLayout);
        }
        C1749280vcc c1749280vcc = this.LJIIIIZZ;
        if (c1749280vcc == null) {
            c1749280vcc = null;
        }
        if (c1749280vcc.getVisibility() == 0) {
            C1749280vcc c1749280vcc2 = this.LJIIIIZZ;
            if (c1749280vcc2 == null) {
                c1749280vcc2 = null;
            }
            C786410Ut5.LLLZLZ(c1749280vcc2, 8);
        }
        C154J c154j = this.LJIIL;
        c154j.LJFF = true;
        c154j.LJI = null;
        C20440014yU c20440014yU = C20440014yU.LJIIJ;
        C20440014yU c20440014yU2 = C20440014yU.LJIIJ;
        c20440014yU2.LIZ = new InterfaceC20439814yS() { // from class: X.154i
            @Override // X.InterfaceC20439814yS
            public final void LIZLLL() {
            }

            @Override // X.InterfaceC20439814yS
            public final void LIZIZ() {
                ((Handler) this.LIZ.LJIILJJIL.getValue()).post(new ARunnableS131S0100000_31(this.LIZ, 175));
                C2281251EQx.LIZ.LJII("edit_music", EnumC1654750tA9.TAB_COLLECT.getStringValue(), "", false);
            }

            @Override // X.InterfaceC20439814yS
            public final void LIZJ() {
                ((Handler) this.LIZ.LJIILJJIL.getValue()).post(new ARunnableS131S0100000_31(this.LIZ, 176));
                C2281251EQx.LIZ.LJII("edit_music", EnumC1654750tA9.TAB_COLLECT.getStringValue(), "", false);
            }

            @Override // X.InterfaceC20439814yS
            public final void LIZ(List<? extends MusicModel> list) {
                ((C155W) this.LIZ.LJIILL.getValue()).It(list);
            }

            @Override // X.InterfaceC20439814yS
            public final void LLJJJIL(List<? extends MusicModel> list, boolean z) {
                C204605154h c204605154h = this.LIZ;
                Iterator<? extends MusicModel> it2 = list.iterator();
                while (it2.hasNext()) {
                    ((C155W) c204605154h.LJIILL.getValue()).I5(it2.next());
                }
                ((Handler) this.LIZ.LJIILJJIL.getValue()).post(new ARunnableS28S0210000_31(this.LIZ, z, list, 3));
                C2281251EQx.LIZ.LJII("edit_music", EnumC1654750tA9.TAB_COLLECT.getStringValue(), "", true);
            }
        };
        c20440014yU2.LJII(LIZLLL().getSoundPageScene(), LJ());
    }

    @Override // X.AbstractC204610154m, X.InterfaceC204626155c
    public final void LLZ() {
        C1630570sX9 c1630570sX9;
        this.LJIILLIIL.getValue();
        C1630570sX9 c1630570sX92 = this.LJIIIZ;
        if (c1630570sX92 != null && c1630570sX92.getVisibility() == 0 && (c1630570sX9 = this.LJIIIZ) != null) {
            c1630570sX9.LIZJ();
        }
        C425240Glu c425240Glu = this.LJIIJ;
        if (c425240Glu == null) {
            c425240Glu = null;
        }
        c425240Glu.scrollToPosition(0);
    }

    @Override // X.InterfaceC204626155c
    public final View getView() {
        return (View) this.LJIILLIIL.getValue();
    }

    @Override // X.C204611154n, X.InterfaceC204626155c
    public final void z3() {
        C1630570sX9 c1630570sX9 = this.LJIIIZ;
        if (c1630570sX9 != null) {
            c1630570sX9.LIZLLL();
        }
    }

    @Override // X.InterfaceC204626155c
    public final AbstractC21673619ry<?> LJJLIIIJL() {
        return this.LJIIJJI;
    }

    public C204605154h(C1361400lX0 c1361400lX0) {
        this.LJ = c1361400lX0;
    }

    @Override // X.InterfaceC204626155c
    public final void LLZILL(boolean z) {
        Fragment fragmentLIZLLL;
        CreativeModel creativeModel;
        OnThisDayData onThisDayData;
        C129L c129l;
        LIZJ().LIZ.LIZJ = false;
        LIZJ().LJIILIIL.LIZLLL(EnumC1654750tA9.TAB_COLLECT.getStringValue(), z, LJ());
        C20440014yU c20440014yU = C20440014yU.LJIIJ;
        ArrayList<MusicModel> arrayList = this.LJIIL.LIZ;
        boolean zLJ = LJ();
        c20440014yU.getClass();
        boolean zLIZJ = C20440014yU.LIZJ(arrayList, zLJ);
        if (this.LJIIL.LJFF && c20440014yU.LIZ != null && !zLIZJ && LJI().LJJII() == LJ()) {
            if ((!this.LJIIL.LIZ.isEmpty()) && (c129l = this.LJIIJJI) != null) {
                c129l.notifyDataSetChanged();
            }
            if (LJI().LJIJI()) {
                LJI().LJJJI();
                this.LJIILIIL = true;
                c20440014yU.LJII(LIZLLL().getSoundPageScene(), LJ());
            }
        } else {
            if (!this.LJIIL.LIZ.isEmpty()) {
                C154J c154j = this.LJIIL;
                if (c154j.LJFF && c20440014yU.LIZ == null) {
                    c154j.LIZ.clear();
                    C129L c129l2 = this.LJIIJJI;
                    if (c129l2 != null) {
                        c129l2.notifyDataSetChanged();
                    }
                }
            }
            if (!this.LJIIL.LIZ.isEmpty()) {
                C154J c154j2 = this.LJIIL;
                if (c154j2.LJFF && zLIZJ) {
                    c154j2.LIZ.clear();
                    C129L c129l3 = this.LJIIJJI;
                    if (c129l3 != null) {
                        c129l3.notifyDataSetChanged();
                    }
                }
            }
            if (LJI().LJJII() != LJ()) {
                this.LJIIL.LIZ.clear();
                C129L c129l4 = this.LJIIJJI;
                if (c129l4 != null) {
                    c129l4.notifyDataSetChanged();
                }
                LJI().LJJIL(LJ());
            }
            LJI().LJJJI();
            this.LJIILIIL = true;
            if (!C0CHQ.LIZ().getAccountService().isLogin()) {
                AbstractC1387200mCc abstractC1387200mCcLJ = C1906580ziK.LJ();
                if (abstractC1387200mCcLJ != null) {
                    fragmentLIZLLL = abstractC1387200mCcLJ.LIZLLL();
                } else {
                    fragmentLIZLLL = null;
                }
                C0XPD.LIZJ(fragmentLIZLLL, "video_edit_page", "edit_xpage_recommend_favourite", null, new C20749416Hk(this, 1));
            } else {
                LJII();
            }
        }
        VideoPublishEditModel videoPublishEditModel = this.LIZJ;
        if (videoPublishEditModel != null && (creativeModel = videoPublishEditModel.creativeModel) != null && (onThisDayData = creativeModel.onThisDayData) != null && onThisDayData.isInOnThisDayPreviewPage()) {
            onThisDayData.setMusicSelectedFromV2("on_this_day_page_recommend_favourite");
        }
        LJI().LJJIII();
        LJI().LJJIFFI();
    }

    public final void LJIIIIZZ(boolean z, boolean z2) {
        C1749280vcc c1749280vcc = null;
        if (z2) {
            C1749280vcc c1749280vcc2 = this.LJIIIIZZ;
            if (c1749280vcc2 != null) {
                c1749280vcc = c1749280vcc2;
            }
            C786410Ut5.LLLZLZ(c1749280vcc, 8);
            C1630570sX9 c1630570sX9 = this.LJIIIZ;
            if (c1630570sX9 != null) {
                C786410Ut5.X1(c1630570sX9, 8);
                return;
            }
            return;
        }
        if (!z) {
            this.LJIIL.LIZ.clear();
            C129L c129l = this.LJIIJJI;
            if (c129l != null) {
                c129l.notifyDataSetChanged();
            }
            LinearLayout linearLayout = this.LJII;
            if (linearLayout != null) {
                C786410Ut5.LJZL(8, linearLayout);
            }
            C1630570sX9 c1630570sX92 = this.LJIIIZ;
            if (c1630570sX92 == null) {
                return;
            }
            C786410Ut5.X1(c1630570sX92, 0);
            c1630570sX92.LIZ();
            return;
        }
        this.LJIIL.LIZ.clear();
        C129L c129l2 = this.LJIIJJI;
        if (c129l2 != null) {
            c129l2.notifyDataSetChanged();
        }
        LinearLayout linearLayout2 = this.LJII;
        if (linearLayout2 != null) {
            C786410Ut5.LJZL(8, linearLayout2);
        }
        C1749280vcc c1749280vcc3 = this.LJIIIIZZ;
        if (c1749280vcc3 == null) {
            c1749280vcc3 = null;
        }
        C786410Ut5.LLLZLZ(c1749280vcc3, 0);
        if (LJ()) {
            C1749280vcc c1749280vcc4 = this.LJIIIIZZ;
            if (c1749280vcc4 == null) {
                c1749280vcc4 = null;
            }
            C1722300uv6 c1722300uv6 = new C1722300uv6();
            C419910GdJ c419910GdJ = new C419910GdJ();
            c419910GdJ.LIZ = R.raw.icon_large_empty_box;
            c419910GdJ.LJ = Integer.valueOf(R.attr.a1k);
            c419910GdJ.LIZLLL = Integer.valueOf(R.attr.a1k);
            c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(72));
            c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(72));
            c1722300uv6.LIZJ = 0;
            c1722300uv6.LIZIZ = c419910GdJ;
            c1722300uv6.LJI = LIZJ().LJJIIJZLJL.getString(2131837621);
            c1722300uv6.LJIIIIZZ = LIZJ().LJJIIJZLJL.getString(2131837620);
            c1749280vcc4.setStatus(c1722300uv6);
            C1749280vcc c1749280vcc5 = this.LJIIIIZZ;
            if (c1749280vcc5 != null) {
                c1749280vcc = c1749280vcc5;
            }
            c1749280vcc.setTopMargin(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(64)));
            return;
        }
        C1749280vcc c1749280vcc6 = this.LJIIIIZZ;
        if (c1749280vcc6 != null) {
            c1749280vcc = c1749280vcc6;
        }
        C1722300uv6 c1722300uv62 = new C1722300uv6();
        c1722300uv62.LJI = LIZJ().LJJIIJZLJL.getString(2131838196);
        c1722300uv62.LJIIIIZZ = LIZJ().LJJIIJZLJL.getString(2131838195);
        c1749280vcc.setStatus(c1722300uv62);
    }

    @Override // X.AbstractC204610154m, X.InterfaceC204626155c
    public final void LLZLI(MusicModel musicModel, MusicModel.CollectionType collectionType) {
        boolean z;
        int i = 0;
        if (LJI().LJIILL() == EnumC1654750tA9.TAB_COLLECT) {
            z = true;
        } else {
            z = false;
        }
        ArrayList<MusicModel> arrayList = this.LJIIL.LIZ;
        if (musicModel != null) {
            int i2 = 0;
            for (MusicModel musicModel2 : arrayList) {
                int i3 = i2 + 1;
                if (i2 >= 0) {
                    if (Intrinsics.LJFF(musicModel2.getMusicId(), musicModel.getMusicId())) {
                        if (collectionType == MusicModel.CollectionType.NOT_COLLECTED) {
                            if (!z) {
                                ListProtector.remove(this.LJIIL.LIZ, i2);
                                return;
                            } else {
                                ((MusicModel) ListProtector.get(this.LJIIL.LIZ, i2)).setCollectionType(collectionType);
                                return;
                            }
                        }
                        return;
                    }
                    i2 = i3;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
        }
        if (collectionType != MusicModel.CollectionType.COLLECTED) {
            return;
        }
        if (this.LJIIL.LIZ.size() > 0 && LJ()) {
            i = 1;
        }
        ArrayList<MusicModel> arrayList2 = this.LJIIL.LIZ;
        musicModel.setCollectionType(collectionType);
        ListProtector.add(arrayList2, i, musicModel);
    }

    public final void LJIIIZ(C154J c154j, C204607154j c204607154j, boolean z) {
        List listLIZ;
        int size;
        if (z) {
            c154j.LIZ.clear();
        }
        if (c154j.LIZ.isEmpty() && LIZLLL().getUnlimitedOnly()) {
            ListProtector.add(c154j.LIZ, 0, new C129P(LIZJ().LJJIIJZLJL.getString(2131837619), false));
        }
        if (((Boolean) C264890AZr.LIZ.getValue()).booleanValue()) {
            C20440014yU c20440014yU = C20440014yU.LJIIJ;
            ArrayList<MusicModel> arrayList = c154j.LIZ;
            List<? extends MusicModel> list = c204607154j.LIZ;
            if (list == null) {
                list = C13BV.INSTANCE;
            }
            listLIZ = c20440014yU.LIZ(arrayList, list, true);
        } else {
            listLIZ = c204607154j.LIZ;
        }
        ArrayList<MusicModel> arrayList2 = c154j.LIZ;
        if (listLIZ != null) {
            arrayList2.addAll(listLIZ);
        }
        c154j.LIZJ = c204607154j.LIZLLL;
        c154j.LIZLLL = c204607154j.LJ;
        if (listLIZ != null) {
            size = listLIZ.size();
        } else {
            size = 0;
        }
        c154j.LJ = size;
        C129L c129l = this.LJIIJJI;
        if (c129l != null && !z) {
            c129l.setDataAfterLoadMore(this.LJIIL.LIZ);
            C204657156h c204657156h = this.LJFF;
            if (c204657156h.LIZIZ) {
                c204657156h.LJI();
            } else {
                c204657156h.LJII();
            }
            ((Handler) this.LJIILJJIL.getValue()).post(new ARunnableS131S0100000_31(this, 177));
            return;
        }
        C129L c129l2 = new C129L(LJFF(), new AnonymousClass1297() { // from class: X.155M
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
                MusicObject musicObject;
                String musicId;
                List<String> list2;
                MusicBuzModel musicBuzModelLIZIZ = ((C155W) this.LIZ.LJIILL.getValue()).zt().LIZIZ();
                if (musicBuzModelLIZIZ == null || (musicObject = musicBuzModelLIZIZ.music) == null || (musicId = MusicBeanUtilKt.getMusicId(musicObject)) == null || (list2 = this.LIZ.LIZJ().LIZIZ) == null || !list2.contains(musicId)) {
                    return this.LIZ.LIZJ().LJIIL.LIZIZ();
                }
                return false;
            }

            @Override // X.AnonymousClass1297
            public final boolean LIZJ() {
                return this.LIZ.LIZJ().LJIIL.LIZJ();
            }

            @Override // X.AnonymousClass1297
            public final boolean LJ() {
                return this.LIZ.LIZJ().LJIIL.LJIILIIL();
            }

            @Override // X.AnonymousClass1297
            public final void LJIIL(int i) {
                MusicModel musicModel;
                List<MusicModel> similarMusicList;
                if (i >= 0 && this.LIZ.LJIIL.LIZ.size() > i && (similarMusicList = (musicModel = (MusicModel) ListProtector.get(this.LIZ.LJIIL.LIZ, i)).getSimilarMusicList()) != null && !similarMusicList.isEmpty()) {
                    Iterator<MusicModel> it2 = similarMusicList.iterator();
                    while (it2.hasNext()) {
                        it2.next().setSimilarMusic(true);
                    }
                    MusicModel musicModel2 = (MusicModel) C13LP.LJJLIIIJJI(similarMusicList);
                    if (musicModel2 != null) {
                        musicModel2.setLastSimilarMusic(true);
                    }
                    if (musicModel.isUnfold()) {
                        this.LIZ.LJIIL.LIZ.removeAll(similarMusicList);
                        C129L c129l3 = this.LIZ.LJIIJJI;
                        if (c129l3 != null) {
                            c129l3.notifyItemRangeRemoved(i + 1, similarMusicList.size());
                        }
                        C20440014yU.LJIIJ.LJIIIZ(false, similarMusicList, null);
                    } else {
                        int i2 = i + 1;
                        this.LIZ.LJIIL.LIZ.addAll(i2, similarMusicList);
                        C129L c129l4 = this.LIZ.LJIIJJI;
                        if (c129l4 != null) {
                            c129l4.notifyItemRangeInserted(i2, similarMusicList.size());
                        }
                        C20440014yU.LJIIJ.LJIIIZ(true, similarMusicList, musicModel);
                    }
                    musicModel.setUnfold(!musicModel.isUnfold());
                    C155P c155p = this.LIZ.LIZJ().LJIILIIL;
                    EnumC1654750tA9 enumC1654750tA9 = EnumC1654750tA9.TAB_COLLECT;
                    c155p.LJFF(musicModel, enumC1654750tA9.getStringValue(), null);
                    this.LIZ.LIZJ().LJIILIIL.LJII(musicModel, i, enumC1654750tA9.getStringValue(), false, false, null, new C1458260o3E(null, this.LIZ.LIZJ().LJIIL.LJIILIIL(), null, null, 7), null);
                }
            }

            @Override // X.AnonymousClass1297
            public final int LJIILLIIL(MusicModel musicModel) {
                return musicModel.getPresenterDuration();
            }

            @Override // X.AnonymousClass1297
            public final void LIZ(int i, View view) {
                MusicModel musicModel;
                Music music;
                if (i < 0 || (music = (musicModel = (MusicModel) ListProtector.get(this.LIZ.LJIIL.LIZ, i)).getMusic()) == null) {
                    return;
                }
                if (music.isCanNotReuse()) {
                    CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
                    creativeToastBuilder.messageRes(2131830669);
                    C1390380mHk.LIZLLL(view, 3068, creativeToastBuilder);
                    C2344009Gk c2344009Gk = new C2344009Gk();
                    c2344009Gk.LJIIIIZZ("enter_from", "change_music_page");
                    C20684815ws.LJIILLIIL("add_private_music", c2344009Gk.LIZ);
                    return;
                }
                C129L c129l3 = this.LIZ.LJIIJJI;
                if (c129l3 != null && c129l3.LLLI(musicModel)) {
                    if (!this.LIZ.LIZJ().LJIL.invoke().booleanValue()) {
                        return;
                    }
                    this.LIZ.LIZJ().LJIILIIL.LIZJ(musicModel, EnumC1654750tA9.TAB_COLLECT.getStringValue(), i, null);
                    this.LIZ.LJI().LJIIL(this.LIZ.LJIIJJI, false, true, musicModel, true);
                    return;
                }
                ICommerceMediaService iCommerceMediaService = (ICommerceMediaService) PluggableExtentionKt.pluggableSpi$default(ICommerceMediaService.class, false, false, false, 14, null);
                if (iCommerceMediaService != null && iCommerceMediaService.LIZJ(musicModel.getMusic())) {
                    CreativeToastBuilder creativeToastBuilder2 = new CreativeToastBuilder();
                    creativeToastBuilder2.messageRes(2131837781);
                    creativeToastBuilder2.isTuxToast(true);
                    C1390380mHk.LIZLLL(view, 3008, creativeToastBuilder2);
                    C204605154h c204605154h = this.LIZ;
                    AbstractC204621154x abstractC204621154x = c204605154h.LIZLLL;
                    if (abstractC204621154x != null) {
                        abstractC204621154x.LJIIL(c204605154h.LJIIJJI, false, true, musicModel, true);
                        return;
                    }
                    return;
                }
                C129L c129l4 = this.LIZ.LJIIJJI;
                if (c129l4 != null) {
                    c129l4.LLLIILIL(i);
                }
                AbstractC204621154x abstractC204621154x2 = this.LIZ.LIZLLL;
                if (abstractC204621154x2 != null) {
                    abstractC204621154x2.LJJIJIIJIL(i, musicModel, EnumC1654750tA9.TAB_COLLECT, true, null, false, null, null);
                }
            }

            @Override // X.AnonymousClass1297
            public final void LIZLLL(MusicModel musicModel, boolean z2) {
                this.LIZ.LIZIZ(musicModel, z2);
            }

            @Override // X.AnonymousClass1297
            public final void LJFF(MusicModel musicModel, int i) {
                AbstractC204621154x abstractC204621154x = this.LIZ.LIZLLL;
                if (abstractC204621154x != null) {
                    abstractC204621154x.LJJIIJ(musicModel, EnumC1654750tA9.TAB_COLLECT, i, null, null, null, null);
                }
            }

            @Override // X.AnonymousClass1297
            public final void LJII(int i, View view) {
                if (i < 0) {
                    return;
                }
                MusicModel musicModel = (MusicModel) ListProtector.get(this.LIZ.LJIIL.LIZ, i);
                C204605154h c204605154h = this.LIZ;
                AbstractC204621154x abstractC204621154x = c204605154h.LIZLLL;
                if (abstractC204621154x != null) {
                    abstractC204621154x.LJJIJIIJI(c204605154h.LJIIJJI, musicModel, null);
                }
            }

            @Override // X.AnonymousClass1297
            public final void LJIIIIZZ(int i, View view) {
                if (i < 0) {
                    return;
                }
                this.LIZ.LJI().LL.LJIIJ(Unit.LIZ);
                C155Z c155z = this.LIZ.LIZJ().LJIIL;
                EnumC1654750tA9 enumC1654750tA9 = EnumC1654750tA9.TAB_COLLECT;
                c155z.LIZ(enumC1654750tA9.getStringValue());
                this.LIZ.LIZJ().LJIILIIL.LJI(this.LIZ.LJI().LJIL(), enumC1654750tA9.getStringValue(), null);
            }

            @Override // X.AnonymousClass1297
            public final void LJIIJ(int i, View view) {
                if (i < 0) {
                    return;
                }
                this.LIZ.LIZJ().LJIIL.LJFF();
            }
        }, ((C155W) this.LJIILL.getValue()).zt(), LIZJ().LIZ, new AwS575S0100000_31(this, 1528));
        this.LJIIJJI = c129l2;
        c129l2.setData(this.LJIIL.LIZ);
        C204657156h c204657156h2 = this.LJFF;
        if (c204657156h2.LIZIZ) {
            c204657156h2.LJI();
        } else {
            c204657156h2.LJII();
        }
        WrapLinearLayoutManager wrapLinearLayoutManager = new WrapLinearLayoutManager(LIZJ().LJJIIJZLJL, 1);
        C425240Glu c425240Glu = this.LJIIJ;
        if (c425240Glu == null) {
            c425240Glu = null;
        }
        c425240Glu.setLayoutManager(wrapLinearLayoutManager);
        C425240Glu c425240Glu2 = this.LJIIJ;
        if (c425240Glu2 == null) {
            c425240Glu2 = null;
        }
        c425240Glu2.setAdapter(this.LJIIJJI);
        C204657156h c204657156h3 = this.LJFF;
        C425240Glu c425240Glu3 = this.LJIIJ;
        if (c425240Glu3 == null) {
            c425240Glu3 = null;
        }
        C129L c129l3 = this.LJIIJJI;
        if (c129l3 != null) {
            c204657156h3.LIZ(c425240Glu3, c129l3, new AwS575S0100000_31(this, 1529), false);
            C204614154q c204614154q = (C204614154q) LJFF().LJIIL(null, C204614154q.class);
            if (c204614154q != null) {
                c204614154q.LIZ.put(EnumC1654750tA9.TAB_COLLECT, this.LJFF);
            }
            if (!this.LJIIL.LIZLLL) {
                C01TT.LIZLLL(new AwS575S0100000_31(this, 1531));
            }
            LinearLayout linearLayout = this.LJII;
            if (linearLayout != null) {
                C786410Ut5.LJZL(8, linearLayout);
            }
            C129L c129l4 = this.LJIIJJI;
            if (c129l4 == null) {
                return;
            }
            c129l4.LLLIL(new InterfaceC19413110xF() { // from class: X.154A
                @Override // X.InterfaceC19413110xF
                public final void LJJIFFI() {
                    C129L c129l5 = this.LIZ.LJIIJJI;
                    if (c129l5 != null) {
                        c129l5.showLoadMoreLoading();
                    }
                    C204605154h c204605154h = this.LIZ;
                    if (c204605154h.LJIIL.LIZLLL) {
                        C20440014yU c20440014yU2 = C20440014yU.LJIIJ;
                        int soundPageScene = c204605154h.LIZLLL().getSoundPageScene();
                        boolean zLJ = this.LIZ.LJ();
                        c20440014yU2.getClass();
                        if (zLJ) {
                            C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C20439214yM(c20440014yU2, true, null), 3);
                        } else {
                            C23250099c.LIZLLL(C817503Hh.LL, null, null, new C20439414yO(c20440014yU2, soundPageScene, null, true, null), 3);
                        }
                    }
                }
            });
            return;
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }
}
