package X;

import Y.ACallableS419S0100000_12;
import Y.AObserverS216S0100000_12;
import Y.ARunnableS103S0200000_34;
import Y.ARunnableS112S0100000_12;
import Y.ARunnableS134S0100000_34;
import Y.ARunnableS81S0200000_12;
import android.database.DataSetObserver;
import android.os.SystemClock;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.PagerAdapter;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ability.IPhotoSlidesEventDispatchAbility;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageInfo;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageUrlModel;
import com.ss.android.ugc.aweme.feed.panel.IBaseListFragmentPanel;
import com.ss.android.ugc.aweme.service.IPhotosViewHolderType;
import com.ss.android.ugc.feed.platform.panel.RootPanelComponent;
import com.ss.android.ugc.feed.platform.panel.base.EventCenter;
import com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerComponentAbility;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AFwS225S0000000_34;
import kotlin.jvm.internal.AwS84S1000000_34;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.1ClU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2239781ClU implements InterfaceC1499080p74 {
    public C1499070p73 LJIIIIZZ;
    public IViewPagerComponentAbility LJIIIZ;
    public C0SR4 LJIIJ;
    public C0SZ8 LJIILIIL;
    public boolean LJIL;
    public Runnable LJJ;
    public long LJJIFFI;
    public C2239841Cla LJJII;
    public C1D17 LJJIII;
    public final EnumC1153810g8B LIZ = EnumC1153810g8B.RENDER_FIRST_FRAME;
    public final int LIZIZ = 8;
    public final int LIZJ = 8;
    public final int LIZLLL = 8;
    public final int LJ = 8;
    public final long LJFF = 1000;
    public final int LJI = 1;
    public final int LJII = 1;
    public final C2239821ClY LJIIJJI = new C2239821ClY(this);
    public final Map<Integer, IPhotoSlidesEventDispatchAbility> LJIIL = new LinkedHashMap();
    public int LJIILJJIL = -1;
    public int LJIILL = -1;
    public int LJIILLIIL = -1;
    public final C01GW LJIIZILJ = C452501pT.LIZIZ(AFwS225S0000000_34.get$arr$(99));
    public final List<Aweme> LJIJ = new ArrayList();
    public final C01GW LJIJI = C452501pT.LIZIZ(AFwS225S0000000_34.get$arr$(100));
    public final C01GW LJIJJ = C452501pT.LIZIZ(AFwS225S0000000_34.get$arr$(98));
    public final C01GW LJIJJLI = C452501pT.LIZIZ(AFwS225S0000000_34.get$arr$(101));
    public boolean LJJI = true;

    @Override // X.InterfaceC1499080p74
    public final void LIZ() {
        C2344809Gs.LIZLLL(6, "DetailBufferPreload", "PhotoStrategy->detachContext remove all task");
        C622680Oba.LIZLLL(this);
        this.LJIIIIZZ = null;
        if (C289550BWn.LIZ() || C280160AyU.LIZ()) {
            this.LJIIIZ = null;
            this.LJIIJ = null;
        }
        if (C280160AyU.LIZ()) {
            C2239841Cla c2239841Cla = this.LJJII;
            if (c2239841Cla != null) {
                try {
                    C0SR4 c0sr4 = this.LJIIJ;
                    if (c0sr4 != null) {
                        c0sr4.LJJIJIIJIL(c2239841Cla);
                    }
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("unregisterDataSetObserver error: ");
                    sbLIZ.append(e.getMessage());
                    C2188811AlT.LIZIZ(sbLIZ);
                }
            }
            C1D17 c1d17 = this.LJJIII;
            if (c1d17 != null) {
                try {
                    IViewPagerComponentAbility iViewPagerComponentAbility = this.LJIIIZ;
                    if (iViewPagerComponentAbility != null) {
                        iViewPagerComponentAbility.Xl0(c1d17);
                    }
                } catch (Exception e2) {
                    TryCatchGuardChecker.doCheck(e2);
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("removeOnComponentChangeListener error: ");
                    sbLIZ2.append(e2.getMessage());
                    C2188811AlT.LIZIZ(sbLIZ2);
                }
            }
            this.LJIIJJI.LL = null;
            this.LJIILIIL = null;
            this.LJJII = null;
            this.LJJIII = null;
            this.LJIIIIZZ = null;
        }
        ((LinkedHashMap) this.LJIIL).clear();
        this.LJIILIIL = null;
        LJIIIZ().clear();
        ((ArrayList) this.LJIJ).clear();
        LJIIJJI().clear();
        LJIIIIZZ().clear();
        LJIIL().clear();
        this.LJIILJJIL = -1;
        this.LJIILL = -1;
        this.LJIILLIIL = -1;
        this.LJJ = null;
    }

    public final void LJ() {
        C1498600p6I.LIZIZ(new ARunnableS112S0100000_12(this, 211));
        try {
            LJII();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1AF0.LJ(e);
        }
    }

    public final void LJII() {
        int i = this.LJIILJJIL;
        if (i >= this.LJIILL || i >= ((ArrayList) this.LJIJ).size() || ((ArrayList) this.LJIJ).isEmpty()) {
            return;
        }
        ArrayList arrayList = (ArrayList) this.LJIJ;
        List listSubList = arrayList.subList(this.LJIILJJIL, Math.min(this.LJIILL, arrayList.size()));
        ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(listSubList, 10));
        Iterator it2 = listSubList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(it2.next());
        }
        C1498600p6I.LIZIZ(new ARunnableS81S0200000_12(arrayList2, this, 58));
    }

    public final LinkedList<AbstractRunnableC2239851Clb> LJIIIIZZ() {
        return (LinkedList) this.LJIJJ.getValue();
    }

    public final LinkedHashMap<String, C2239811ClX> LJIIIZ() {
        return (LinkedHashMap) this.LJIIZILJ.getValue();
    }

    public final LinkedList<AbstractRunnableC2239851Clb> LJIIJJI() {
        return (LinkedList) this.LJIJI.getValue();
    }

    public final LinkedList<AbstractRunnableC2239851Clb> LJIIL() {
        return (LinkedList) this.LJIJJLI.getValue();
    }

    public final void LIZLLL() {
        if (LJIIJJI().isEmpty() || this.LJIL || this.LJJ != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("PhotoStrategy->checkNeedTriggerPreload return, priorityTask.isEmpty() ");
            sbLIZ.append(LJIIJJI().isEmpty());
            sbLIZ.append(", taskCommited: ");
            sbLIZ.append(this.LJIL);
            sbLIZ.append(", FirstTask: ");
            sbLIZ.append(this.LJJ);
            C2344809Gs.LIZLLL(4, "DetailBufferPreload", C2188811AlT.LIZIZ(sbLIZ));
            return;
        }
        LinkedList<AbstractRunnableC2239851Clb> linkedListLJIIJJI = LJIIJJI();
        ArrayList arrayList = new ArrayList();
        for (AbstractRunnableC2239851Clb abstractRunnableC2239851Clb : linkedListLJIIJJI) {
            AbstractRunnableC2239851Clb abstractRunnableC2239851Clb2 = abstractRunnableC2239851Clb;
            if ((abstractRunnableC2239851Clb2 instanceof C2239791ClV) && ((C2239791ClV) abstractRunnableC2239851Clb2).LLILLL.LIZIZ < this.LJIILLIIL) {
                arrayList.add(abstractRunnableC2239851Clb);
            }
        }
        if (!arrayList.isEmpty()) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("remove dontNeedPreloadTask ");
            sbLIZ2.append(arrayList.size());
            C2344809Gs.LIZLLL(4, "DetailBufferPreload", C2188811AlT.LIZIZ(sbLIZ2));
            LJIIJJI().removeAll(arrayList);
        }
        for (Map.Entry<String, C2239811ClX> entry : LJIIIZ().entrySet()) {
            C2239811ClX value = entry.getValue();
            int i = value.LIZIZ - this.LJIILLIIL;
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("check vertical preload delta:");
            sbLIZ3.append(i);
            sbLIZ3.append(", curPos:");
            sbLIZ3.append(this.LJIILLIIL);
            sbLIZ3.append(", dataPos:");
            sbLIZ3.append(value.LIZIZ);
            C2344809Gs.LIZLLL(4, "DetailBufferPreload", C2188811AlT.LIZIZ(sbLIZ3));
            if (!value.LJ && Math.abs(i) <= this.LIZLLL) {
                if (this.LJJ == null) {
                    this.LJJ = new ARunnableS103S0200000_34(this, entry, 7);
                }
                entry.getValue().LJ = true;
            }
        }
    }

    public final void LJI() {
        PhotoModeImageInfo photoModeImageInfo;
        List<PhotoModeImageUrlModel> imageList;
        Iterator<Map.Entry<String, C2239811ClX>> it2 = LJIIIZ().entrySet().iterator();
        while (it2.hasNext()) {
            C2239811ClX value = it2.next().getValue();
            if (!value.LIZLLL && (photoModeImageInfo = value.LIZ.getPhotoModeImageInfo()) != null && (imageList = photoModeImageInfo.getImageList()) != null) {
                int iMin = Math.min(this.LIZJ, imageList.size());
                int i = 0;
                while (i < iMin) {
                    boolean z = Math.abs(this.LJIILLIIL - value.LIZIZ) <= this.LJI && i <= this.LJII;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("collectNeedPreloadTask >>> imageWillAutoLoadByViewPager ");
                    sbLIZ.append(z);
                    sbLIZ.append(", preloadInfo ");
                    sbLIZ.append(value.LIZ.getAid());
                    C2344809Gs.LIZLLL(4, "DetailBufferPreload", C2188811AlT.LIZIZ(sbLIZ));
                    if (z) {
                        value.LJI.add(Integer.valueOf(i));
                    } else {
                        LinkedList<AbstractRunnableC2239851Clb> linkedListLJIIJJI = LJIIJJI();
                        C2239791ClV c2239791ClV = new C2239791ClV(this, value, i);
                        c2239791ClV.LL = LJIIJ(value.LIZIZ, i, false);
                        linkedListLJIIJJI.add(c2239791ClV);
                    }
                    value.LIZLLL = true;
                    i++;
                }
            }
        }
        try {
            if (!LJIIJJI().isEmpty()) {
                C08XD.LJJ(LJIIJJI(), C0TG6.LL);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1AF0.LJ(e);
        }
        this.LJJ = null;
        this.LJIL = false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Iterable, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.util.ArrayList] */
    public final void LJIILJJIL() {
        ?? arrayList;
        if (LJIIJJI().isEmpty() || LJIIL().size() == 6) {
            arrayList = C13BV.INSTANCE;
        } else {
            int iMin = Math.min(LJIIJJI().size(), 6 - LJIIL().size());
            arrayList = new ArrayList();
            for (int i = 0; i < iMin; i++) {
                try {
                    Object objLJJIIZI = C19719612Di.LJJIIZI(LJIIJJI());
                    if (objLJJIIZI != null) {
                        arrayList.add(objLJJIIZI);
                    }
                } catch (IndexOutOfBoundsException e) {
                    TryCatchGuardChecker.doCheck(e);
                    C1AF0.LJ(e);
                } catch (NullPointerException e2) {
                    TryCatchGuardChecker.doCheck(e2);
                    C1AF0.LJ(e2);
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("PhotoPreloadTask npe exception ");
                    sbLIZ.append(e2);
                    sbLIZ.append(", enterFrom => ");
                    C1499070p73 c1499070p73 = this.LJIIIIZZ;
                    sbLIZ.append(c1499070p73 != null ? c1499070p73.LIZIZ : null);
                    C2344809Gs.LIZLLL(6, "DetailBufferPreload", C2188811AlT.LIZIZ(sbLIZ));
                }
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        for (AbstractRunnableC2239851Clb abstractRunnableC2239851Clb : arrayList) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("start preload task ");
            sbLIZ2.append(abstractRunnableC2239851Clb);
            C2344809Gs.LIZLLL(4, "DetailBufferPreload", C2188811AlT.LIZIZ(sbLIZ2));
            LJIIL().add(abstractRunnableC2239851Clb);
            C11NZ.LJJJJI(new ACallableS419S0100000_12(abstractRunnableC2239851Clb, 1)).LJIILIIL(new C0TA6(abstractRunnableC2239851Clb)).LIZIZ(new C11N2<Boolean>() { // from class: X.0TJG
                @Override // X.InterfaceC626120Oh8
                public final void onError(Throwable th) {
                }

                @Override // X.InterfaceC626120Oh8
                public final void onComplete() {
                    dispose();
                }

                @Override // X.InterfaceC626120Oh8
                public final /* bridge */ /* synthetic */ void onNext(Object obj) {
                    ((Boolean) obj).booleanValue();
                }
            });
        }
    }

    /* JADX WARN: Type inference failed for: r0v22, types: [X.1Cla] */
    @Override // X.InterfaceC1499080p74
    public final void LIZIZ(C1499070p73 c1499070p73) {
        IViewPagerComponentAbility iViewPagerComponentAbility;
        PagerAdapter pagerAdapterLJJLIIIJL;
        C1499070p73 c1499070p732;
        Fragment fragment;
        RootPanelComponent rootPanelComponentLIZJ;
        EventCenter eventCenter;
        IViewPagerComponentAbility iViewPagerComponentAbility2;
        IViewPagerComponentAbility iViewPagerComponentAbility3;
        C0SR4 c0sr4;
        InterfaceC665370Q7z interfaceC665370Q7zLJ;
        this.LJIIIIZZ = c1499070p73;
        Fragment fragment2 = c1499070p73.LIZ;
        C0SR4 c0sr42 = null;
        if (fragment2 != null && (interfaceC665370Q7zLJ = C1578630rBN.LJ(fragment2)) != null) {
            iViewPagerComponentAbility = (IViewPagerComponentAbility) C1558520qew.LIZ(interfaceC665370Q7zLJ, IViewPagerComponentAbility.class, null);
        } else {
            iViewPagerComponentAbility = null;
        }
        this.LJIIIZ = iViewPagerComponentAbility;
        if (iViewPagerComponentAbility != null) {
            pagerAdapterLJJLIIIJL = iViewPagerComponentAbility.LJJLIIIJL();
        } else {
            pagerAdapterLJJLIIIJL = null;
        }
        if (pagerAdapterLJJLIIIJL instanceof C0SR4) {
            c0sr42 = (C0SR4) pagerAdapterLJJLIIIJL;
        }
        this.LJIIJ = c0sr42;
        if (C280160AyU.LIZ()) {
            if (this.LJJII == null) {
                this.LJJII = new DataSetObserver() { // from class: X.1Cla
                    @Override // android.database.DataSetObserver
                    public final void onInvalidated() {
                    }

                    @Override // android.database.DataSetObserver
                    public final void onChanged() {
                        this.LIZ.LJ();
                    }
                };
            }
            if (this.LJJIII == null) {
                this.LJJIII = new C1D17(this, 0);
            }
            C2239841Cla c2239841Cla = this.LJJII;
            if (c2239841Cla != null && (c0sr4 = this.LJIIJ) != null) {
                c0sr4.LJJII(c2239841Cla);
            }
            C1D17 c1d17 = this.LJJIII;
            if (c1d17 != null && (iViewPagerComponentAbility3 = this.LJIIIZ) != null) {
                iViewPagerComponentAbility3.Bv0(c1d17);
            }
        } else {
            C0SR4 c0sr43 = this.LJIIJ;
            if (c0sr43 != null) {
                c0sr43.LJJII(new DataSetObserver() { // from class: X.1ClZ
                    @Override // android.database.DataSetObserver
                    public final void onChanged() {
                        this.LIZ.LJ();
                    }

                    @Override // android.database.DataSetObserver
                    public final void onInvalidated() {
                        C2344809Gs.LIZLLL(3, "DetailBufferPreload", "onInvalidated");
                    }
                });
            }
            IViewPagerComponentAbility iViewPagerComponentAbility4 = this.LJIIIZ;
            if (iViewPagerComponentAbility4 != null) {
                iViewPagerComponentAbility4.Bv0(new C1D17(this, 1));
            }
        }
        LJ();
        if (this.LJIILLIIL == -1 && (iViewPagerComponentAbility2 = this.LJIIIZ) != null) {
            try {
                LJIILIIL(iViewPagerComponentAbility2.LJIL());
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C1AF0.LJ(e);
            }
        }
        C622680Oba.LIZJ(this);
        EnumC1153810g8B enumC1153810g8B = this.LIZ;
        EnumC1153810g8B enumC1153810g8B2 = EnumC1153810g8B.RENDER_FIRST_FRAME;
        if (enumC1153810g8B == enumC1153810g8B2 && enumC1153810g8B == enumC1153810g8B2 && (c1499070p732 = this.LJIIIIZZ) != null && (fragment = c1499070p732.LIZ) != null && (rootPanelComponentLIZJ = C1578630rBN.LIZJ(fragment)) != null && (eventCenter = rootPanelComponentLIZJ.getEventCenter()) != null) {
            eventCenter.yQ2("event_on_render_first_frame", new AObserverS216S0100000_12(this, 53), false);
        }
    }

    public final void LJFF(List<? extends Aweme> list) {
        int i;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (list != null) {
            int i2 = 0;
            for (Aweme aweme : list) {
                int i3 = i2 + 1;
                if (i2 >= 0) {
                    Aweme aweme2 = aweme;
                    if (aweme2 != null && AwemeExtKt.isPhotoMode(aweme2) && aweme2.getPhotoModeImageInfo() != null && (i = i2 + this.LJIILJJIL) > this.LJIILLIIL) {
                        linkedHashSet.add(aweme2.getAid());
                        if (aweme2.getPhotoModeImageInfo() != null) {
                            if (LJIIIZ().containsKey(aweme2.getAid())) {
                                C2239811ClX c2239811ClX = LJIIIZ().get(aweme2.getAid());
                                if (c2239811ClX != null) {
                                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                                    sbLIZ.append("collectData>>> aid:");
                                    sbLIZ.append(aweme2.getAid());
                                    sbLIZ.append(", oldPos:");
                                    sbLIZ.append(c2239811ClX.LIZIZ);
                                    sbLIZ.append(", newPos:");
                                    sbLIZ.append(i);
                                    C2344809Gs.LIZLLL(4, "DetailBufferPreload", C2188811AlT.LIZIZ(sbLIZ));
                                    C2239811ClX c2239811ClX2 = LJIIIZ().get(aweme2.getAid());
                                    if (c2239811ClX2 != null) {
                                        c2239811ClX2.LIZIZ = i;
                                    }
                                }
                            } else {
                                LinkedHashMap<String, C2239811ClX> linkedHashMapLJIIIZ = LJIIIZ();
                                String aid = aweme2.getAid();
                                C2239811ClX c2239811ClX3 = new C2239811ClX(aweme2, i);
                                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                sbLIZ2.append("collectData>>> aid:");
                                sbLIZ2.append(aweme2.getAid());
                                sbLIZ2.append(", pos:");
                                sbLIZ2.append(i);
                                C2344809Gs.LIZLLL(4, "DetailBufferPreload", C2188811AlT.LIZIZ(sbLIZ2));
                                linkedHashMapLJIIIZ.put(aid, c2239811ClX3);
                            }
                        }
                    }
                    i2 = i3;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
        }
        Set<String> setKeySet = LJIIIZ().keySet();
        ArrayList<String> arrayList = new ArrayList();
        for (Object obj : setKeySet) {
            if (true ^ linkedHashSet.contains(obj)) {
                arrayList.add(obj);
            }
        }
        for (String str : arrayList) {
            if (LJIIIZ().remove(str) != null) {
                C19719612Di.LJJIIJ(LJIIJJI(), new AwS84S1000000_34(str, 0), true);
            }
        }
    }

    public final void LJIILIIL(int i) {
        C0SZ8 c0sz8LJLIL;
        C0SR4 c0sr4;
        List<Aweme> listFg;
        Aweme aweme;
        String aid;
        C2239811ClX c2239811ClX;
        C0SZ8 c0sz8LJLIL2;
        InterfaceC665370Q7z interfaceC665370Q7zLIZIZ;
        IPhotoSlidesEventDispatchAbility iPhotoSlidesEventDispatchAbility;
        C0SZ8 c0sz8;
        InterfaceC665370Q7z interfaceC665370Q7zLIZIZ2;
        this.LJIILLIIL = i;
        int iMin = Math.min(this.LIZIZ + i, ((ArrayList) this.LJIJ).size());
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DetailBufferPhotoStrategy->onVerticalPageSelected ");
        sbLIZ.append(i);
        sbLIZ.append(", start: ");
        sbLIZ.append(i);
        sbLIZ.append(", end: ");
        sbLIZ.append(iMin);
        sbLIZ.append(", range ");
        sbLIZ.append(this.LJIILJJIL);
        sbLIZ.append(", ");
        sbLIZ.append(this.LJIILL);
        C2344809Gs.LIZLLL(6, "DetailBufferPreload", C2188811AlT.LIZIZ(sbLIZ));
        int i2 = this.LJIILJJIL;
        if (i2 != -1) {
            i = Math.min(i, i2);
        }
        int i3 = this.LJIILL;
        if (i3 != -1) {
            iMin = Math.max(i3, iMin);
        }
        if (i != this.LJIILJJIL || iMin != this.LJIILL) {
            this.LJIILJJIL = i;
            this.LJIILL = iMin;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("DetailBufferPhotoStrategy->onVerticalPageSelected range: ");
            sbLIZ2.append(this.LJIILJJIL);
            sbLIZ2.append(" - ");
            sbLIZ2.append(this.LJIILL);
            C2344809Gs.LIZLLL(6, "DetailBufferPreload", C2188811AlT.LIZIZ(sbLIZ2));
            try {
                LJII();
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C1AF0.LJ(e);
            }
        }
        C0SZ8 c0sz82 = this.LJIILIIL;
        if (c0sz82 != null) {
            IPhotoSlidesEventDispatchAbility iPhotoSlidesEventDispatchAbility2 = (IPhotoSlidesEventDispatchAbility) ((LinkedHashMap) this.LJIIL).get(Integer.valueOf(System.identityHashCode(c0sz82)));
            if (iPhotoSlidesEventDispatchAbility2 != null || ((c0sz8 = this.LJIILIIL) != null && (interfaceC665370Q7zLIZIZ2 = C0T0K.LIZIZ(c0sz8)) != null && (iPhotoSlidesEventDispatchAbility2 = (IPhotoSlidesEventDispatchAbility) C1558520qew.LIZ(interfaceC665370Q7zLIZIZ2, IPhotoSlidesEventDispatchAbility.class, null)) != null)) {
                iPhotoSlidesEventDispatchAbility2.b3(this.LJIIJJI);
            }
            this.LJIIJJI.LL = null;
            this.LJIILIIL = null;
        }
        IViewPagerComponentAbility iViewPagerComponentAbility = this.LJIIIZ;
        if (iViewPagerComponentAbility != null) {
            c0sz8LJLIL = iViewPagerComponentAbility.LJLIL();
        } else {
            c0sz8LJLIL = null;
        }
        if ((c0sz8LJLIL instanceof IPhotosViewHolderType) && (c0sr4 = this.LJIIJ) != null && (listFg = c0sr4.Fg()) != null && (aweme = (Aweme) C13LP.LJJJLZIJ(this.LJIILLIIL, listFg)) != null && (aid = aweme.getAid()) != null && (c2239811ClX = LJIIIZ().get(aid)) != null) {
            this.LJIIJJI.LL = c2239811ClX;
            IViewPagerComponentAbility iViewPagerComponentAbility2 = this.LJIIIZ;
            if (iViewPagerComponentAbility2 != null) {
                c0sz8LJLIL2 = iViewPagerComponentAbility2.LJLIL();
            } else {
                c0sz8LJLIL2 = null;
            }
            this.LJIILIIL = c0sz8LJLIL2;
            IPhotoSlidesEventDispatchAbility iPhotoSlidesEventDispatchAbility3 = (IPhotoSlidesEventDispatchAbility) ((LinkedHashMap) this.LJIIL).get(Integer.valueOf(System.identityHashCode(c0sz8LJLIL2)));
            if (iPhotoSlidesEventDispatchAbility3 != null) {
                iPhotoSlidesEventDispatchAbility3.LLJJI(this.LJIIJJI);
            } else {
                C0SZ8 c0sz83 = this.LJIILIIL;
                if (c0sz83 != null && (interfaceC665370Q7zLIZIZ = C0T0K.LIZIZ(c0sz83)) != null && (iPhotoSlidesEventDispatchAbility = (IPhotoSlidesEventDispatchAbility) C1558520qew.LIZ(interfaceC665370Q7zLIZIZ, IPhotoSlidesEventDispatchAbility.class, null)) != null) {
                    iPhotoSlidesEventDispatchAbility.LLJJI(this.LJIIJJI);
                    this.LJIIL.put(Integer.valueOf(System.identityHashCode(this.LJIILIIL)), iPhotoSlidesEventDispatchAbility);
                }
            }
            C1498600p6I.LIZIZ(new ARunnableS103S0200000_34(this, c2239811ClX, 8));
        }
        C1498600p6I.LIZIZ(new ARunnableS134S0100000_34(this, 24));
        C2239821ClY c2239821ClY = this.LJIIJJI;
        if (c2239821ClY.LL != null) {
            c2239821ClY.onPageSelected(0);
        }
    }

    @C14EU
    public final void onVideoProgressEvent(C586420MzI c586420MzI) {
        C0N0Y playerManager;
        WeakReference<IBaseListFragmentPanel> weakReference;
        if (this.LIZ != EnumC1153810g8B.BUFFER) {
            return;
        }
        C1499070p73 c1499070p73 = this.LJIIIIZZ;
        String str = null;
        if (c1499070p73 != null) {
            str = c1499070p73.LIZIZ;
        }
        if (!Intrinsics.LJFF(str, c586420MzI.LIZIZ)) {
            return;
        }
        if (LJIIJJI().isEmpty()) {
            C2344809Gs.LIZLLL(4, "DetailBufferPreload", "onVideoProgressEvent task empty");
            return;
        }
        IBaseListFragmentPanel iBaseListFragmentPanel = c586420MzI.LJ;
        if ((iBaseListFragmentPanel != null || ((weakReference = c586420MzI.LJFF) != null && (iBaseListFragmentPanel = weakReference.get()) != null)) && (playerManager = iBaseListFragmentPanel.getPlayerManager()) != null) {
            long currentPosition = playerManager.getCurrentPosition();
            long j = c586420MzI.LIZLLL;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onVideoProgressEvent currentPosition: ");
            sbLIZ.append(currentPosition);
            sbLIZ.append(", bufferedPosition: ");
            sbLIZ.append(j);
            sbLIZ.append(", dis: ");
            long j2 = j - currentPosition;
            sbLIZ.append(j2);
            C2344809Gs.LIZLLL(4, "DetailBufferPreload", C2188811AlT.LIZIZ(sbLIZ));
            if (j2 < ((Number) C18028074g.LIZ.getValue()).longValue()) {
                return;
            }
            if (this.LJJI) {
                this.LJJI = false;
                LJIILJJIL();
                C2344809Gs.LIZLLL(4, "DetailBufferPreload", "onVideoProgressEvent isFirstBufferEvent triggerPreload");
                return;
            }
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            long j3 = this.LJJIFFI;
            if (j3 != 0 && jElapsedRealtime - j3 < ((Number) C18029074h.LIZ.getValue()).longValue()) {
                return;
            }
            this.LJJIFFI = jElapsedRealtime;
            LJIILJJIL();
            C2344809Gs.LIZLLL(4, "DetailBufferPreload", "onVideoProgressEvent buffer safe triggerPreload");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0098  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZJ(X.C2239811ClX r11, int r12) {
        /*
            Method dump skipped, instruction units count: 236
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2239781ClU.LIZJ(X.1ClX, int):void");
    }

    public final int LJIIJ(int i, int i2, boolean z) {
        if (z) {
            return 99000100 - i2;
        }
        return (10000 - Math.abs(this.LJIILLIIL - i)) + ((100 - i2) * 10000);
    }
}
