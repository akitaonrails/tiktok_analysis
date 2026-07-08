package X;

import Y.ACallableS419S0100000_12;
import Y.AObserverS236S0100000_34;
import android.database.DataSetObserver;
import android.util.SparseArray;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.PagerAdapter;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ability.IPhotoSlidesEventDispatchAbility;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageInfo;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageUrlModel;
import com.ss.android.ugc.feed.platform.panel.RootPanelComponent;
import com.ss.android.ugc.feed.platform.panel.base.EventCenter;
import com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerComponentAbility;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AFwS217S0000000_28;
import kotlin.jvm.internal.AFwS225S0000000_34;
import kotlin.jvm.internal.AwS280S0000000_34;
import kotlin.jvm.internal.AwS578S0100000_34;
import kotlin.jvm.internal.AwS84S1000000_34;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.1ClP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2239731ClP implements InterfaceC1499080p74 {
    public C1499070p73 LIZ;
    public IViewPagerComponentAbility LIZIZ;
    public C0SR4 LIZJ;
    public C2239761ClS LIZLLL;
    public C1D17 LJ;
    public final C01GW LJFF = C452501pT.LIZIZ(new AwS578S0100000_34(this, 58));
    public final C01GW LJI = C452501pT.LIZIZ(new AwS578S0100000_34(this, 57));
    public final C01GW LJII;
    public final C01GW LJIIIIZZ;
    public int LJIIIZ;
    public long LJIIJ;
    public final int LJIIJJI;
    public final C01GW LJIIL;
    public String LJIILIIL;
    public boolean LJIILJJIL;
    public final Set<String> LJIILL;
    public C0SZ8 LJIILLIIL;
    public final Map<Integer, IPhotoSlidesEventDispatchAbility> LJIIZILJ;
    public final C2239751ClR LJIJ;
    public int LJIJI;

    public final SparseArray<C2239741ClQ> LJI() {
        return (SparseArray) this.LJII.getValue();
    }

    public final LinkedList<C2239801ClW> LJIIIIZZ() {
        return (LinkedList) this.LJIIIIZZ.getValue();
    }

    public C2239731ClP() {
        EnumC452301pR enumC452301pR = EnumC452301pR.NONE;
        this.LJII = C452501pT.LIZ(enumC452301pR, AFwS225S0000000_34.get$arr$(102));
        this.LJIIIIZZ = C452501pT.LIZ(enumC452301pR, AFwS225S0000000_34.get$arr$(103));
        this.LJIIJJI = 2;
        this.LJIIL = C452501pT.LIZIZ(AFwS217S0000000_28.get$arr$(331));
        this.LJIILJJIL = true;
        this.LJIILL = new LinkedHashSet();
        this.LJIIZILJ = new LinkedHashMap();
        this.LJIJ = new C2239751ClR(this);
    }

    @Override // X.InterfaceC1499080p74
    public final void LIZ() {
        if (C2239941Clk.LIZ().taskTriggerType != 0) {
            C622680Oba.LIZLLL(this);
        }
        if (C280160AyU.LIZ()) {
            C2239761ClS c2239761ClS = this.LIZLLL;
            if (c2239761ClS != null) {
                try {
                    C0SR4 c0sr4LJ = LJ();
                    if (c0sr4LJ != null) {
                        c0sr4LJ.LJJIJIIJIL(c2239761ClS);
                    }
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("unregisterDataSetObserver error: ");
                    sbLIZ.append(e.getMessage());
                    C2188811AlT.LIZIZ(sbLIZ);
                }
            }
            C1D17 c1d17 = this.LJ;
            if (c1d17 != null) {
                try {
                    IViewPagerComponentAbility iViewPagerComponentAbilityLJFF = LJFF();
                    if (iViewPagerComponentAbilityLJFF != null) {
                        iViewPagerComponentAbilityLJFF.Xl0(c1d17);
                    }
                } catch (Exception e2) {
                    TryCatchGuardChecker.doCheck(e2);
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("removeOnComponentChangeListener error: ");
                    sbLIZ2.append(e2.getMessage());
                    C2188811AlT.LIZIZ(sbLIZ2);
                }
            }
            this.LJIJ.LL = null;
            this.LJIILLIIL = null;
            this.LIZLLL = null;
            this.LJ = null;
            this.LIZ = null;
        }
        this.LIZIZ = null;
        this.LIZJ = null;
        ((LinkedHashMap) this.LJIIZILJ).clear();
        LJIIIIZZ().clear();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LIZLLL() {
        List<Aweme> listFg;
        Aweme item;
        String aid;
        PhotoModeImageInfo photoModeImageInfo;
        List<PhotoModeImageUrlModel> imageList;
        C0SR4 c0sr4LJ = LJ();
        List<Aweme> listFg2 = c0sr4LJ != null ? c0sr4LJ.Fg() : null;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        SparseArray<C2239741ClQ> sparseArrayLJI = LJI();
        int size = sparseArrayLJI.size();
        for (int i = 0; i < size; i++) {
            sparseArrayLJI.keyAt(i);
            C2239741ClQ c2239741ClQValueAt = sparseArrayLJI.valueAt(i);
            linkedHashMap.put(c2239741ClQValueAt.LIZ.getAid(), c2239741ClQValueAt);
        }
        LJI().clear();
        if (listFg2 != null) {
            int i2 = 0;
            for (Aweme aweme : listFg2) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    C1697810uHb.LJIJI();
                    throw null;
                }
                Aweme aweme2 = aweme;
                if (aweme2 != null && AwemeExtKt.isPhotoMode(aweme2) && aweme2.getPhotoModeImageInfo() != null && i2 > this.LJIIIZ && aweme2.getPhotoModeImageInfo() != null) {
                    if (linkedHashMap.get(aweme2.getAid()) != null) {
                        LJI().put(i2, linkedHashMap.get(aweme2.getAid()));
                        linkedHashMap.remove(aweme2.getAid());
                    } else {
                        LJI().put(i2, new C2239741ClQ(aweme2, i2));
                    }
                }
                i2 = i3;
            }
        }
        Iterator it2 = linkedHashMap.keySet().iterator();
        while (it2.hasNext()) {
            C19719612Di.LJJIIJ(LJIIIIZZ(), new AwS84S1000000_34((String) it2.next(), 1), true);
        }
        SparseArray<C2239741ClQ> sparseArrayLJI2 = LJI();
        int size2 = sparseArrayLJI2.size();
        for (int i4 = 0; i4 < size2; i4++) {
            sparseArrayLJI2.keyAt(i4);
            C2239741ClQ c2239741ClQValueAt2 = sparseArrayLJI2.valueAt(i4);
            if (!c2239741ClQValueAt2.LIZJ && (photoModeImageInfo = c2239741ClQValueAt2.LIZ.getPhotoModeImageInfo()) != null && (imageList = photoModeImageInfo.getImageList()) != null) {
                int iMin = Math.min(C2239941Clk.LIZ().verticalLoadHorizontalCount, imageList.size());
                for (int i5 = 0; i5 < iMin; i5++) {
                    LinkedList<C2239801ClW> linkedListLJIIIIZZ = LJIIIIZZ();
                    C2239801ClW c2239801ClW = new C2239801ClW(c2239741ClQValueAt2, i5, LJIIIIZZ());
                    c2239801ClW.LL = LJII(c2239741ClQValueAt2.LIZIZ, i5, false);
                    linkedListLJIIIIZZ.add(c2239801ClW);
                    c2239741ClQValueAt2.LIZJ = true;
                }
            }
        }
        C08XD.LJJ(LJIIIIZZ(), C0TG7.LL);
        IViewPagerComponentAbility iViewPagerComponentAbilityLJFF = LJFF();
        if (iViewPagerComponentAbilityLJFF != null) {
            int iLJIL = iViewPagerComponentAbilityLJFF.LJIL();
            C0SR4 c0sr4LJ2 = LJ();
            if (c0sr4LJ2 != null && (listFg = c0sr4LJ2.Fg()) != null) {
                int size3 = listFg.size();
                for (int i6 = iLJIL; i6 < size3; i6++) {
                    C0SR4 c0sr4LJ3 = LJ();
                    if (c0sr4LJ3 != null && (item = c0sr4LJ3.getItem(i6)) != null && AwemeExtKt.isPhotoMode(item) && (aid = item.getAid()) != null && aid.length() != 0 && !this.LJIILL.contains(item.getAid())) {
                        this.LJIILL.add(item.getAid());
                        int i7 = i6 - iLJIL;
                        C2344009Gk c2344009Gk = new C2344009Gk();
                        C1499070p73 c1499070p73 = this.LIZ;
                        c2344009Gk.LJIIIIZZ("enter_from", c1499070p73 != null ? c1499070p73.LIZIZ : null);
                        c2344009Gk.LIZJ(i7, "delta");
                        C20684815ws.LJIILLIIL("photo_mode_preload_info", c2344009Gk.LIZ);
                    }
                }
            }
        }
        this.LJIILJJIL = true;
    }

    public final C0SR4 LJ() {
        return C280160AyU.LIZ() ? this.LIZJ : (C0SR4) this.LJI.getValue();
    }

    public final IViewPagerComponentAbility LJFF() {
        return C280160AyU.LIZ() ? this.LIZIZ : (IViewPagerComponentAbility) this.LJFF.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v22, types: [X.1ClS] */
    @Override // X.InterfaceC1499080p74
    public final void LIZIZ(C1499070p73 c1499070p73) {
        RootPanelComponent rootPanelComponentLIZJ;
        EventCenter eventCenter;
        IViewPagerComponentAbility iViewPagerComponentAbility;
        PagerAdapter pagerAdapterLJJLIIIJL;
        IViewPagerComponentAbility iViewPagerComponentAbilityLJFF;
        C0SR4 c0sr4LJ;
        InterfaceC665370Q7z interfaceC665370Q7zLJ;
        this.LIZ = c1499070p73;
        if (C280160AyU.LIZ()) {
            Fragment fragment = c1499070p73.LIZ;
            C0SR4 c0sr4 = null;
            if (fragment != null && (interfaceC665370Q7zLJ = C1578630rBN.LJ(fragment)) != null) {
                iViewPagerComponentAbility = (IViewPagerComponentAbility) C1558520qew.LIZ(interfaceC665370Q7zLJ, IViewPagerComponentAbility.class, null);
            } else {
                iViewPagerComponentAbility = null;
            }
            this.LIZIZ = iViewPagerComponentAbility;
            if (iViewPagerComponentAbility != null) {
                pagerAdapterLJJLIIIJL = iViewPagerComponentAbility.LJJLIIIJL();
            } else {
                pagerAdapterLJJLIIIJL = null;
            }
            if (pagerAdapterLJJLIIIJL instanceof C0SR4) {
                c0sr4 = (C0SR4) pagerAdapterLJJLIIIJL;
            }
            this.LIZJ = c0sr4;
            if (this.LIZLLL == null) {
                this.LIZLLL = new DataSetObserver() { // from class: X.1ClS
                    @Override // android.database.DataSetObserver
                    public final void onInvalidated() {
                    }

                    @Override // android.database.DataSetObserver
                    public final void onChanged() {
                        this.LIZ.LIZLLL();
                    }
                };
            }
            if (this.LJ == null) {
                this.LJ = new C1D17(this, 3);
            }
            C2239761ClS c2239761ClS = this.LIZLLL;
            if (c2239761ClS != null && (c0sr4LJ = LJ()) != null) {
                c0sr4LJ.LJJII(c2239761ClS);
            }
            C1D17 c1d17 = this.LJ;
            if (c1d17 != null && (iViewPagerComponentAbilityLJFF = LJFF()) != null) {
                iViewPagerComponentAbilityLJFF.Bv0(c1d17);
            }
        } else {
            C0SR4 c0sr4LJ2 = LJ();
            if (c0sr4LJ2 != null) {
                c0sr4LJ2.LJJII(new DataSetObserver() { // from class: X.1ClT
                    @Override // android.database.DataSetObserver
                    public final void onInvalidated() {
                    }

                    @Override // android.database.DataSetObserver
                    public final void onChanged() {
                        this.LIZ.LIZLLL();
                    }
                });
            }
            IViewPagerComponentAbility iViewPagerComponentAbilityLJFF2 = LJFF();
            if (iViewPagerComponentAbilityLJFF2 != null) {
                iViewPagerComponentAbilityLJFF2.Bv0(new C1D17(this, 4));
            }
        }
        LIZLLL();
        if (C2239941Clk.LIZ().taskTriggerType == 0) {
            Fragment fragment2 = c1499070p73.LIZ;
            if (fragment2 != null && (rootPanelComponentLIZJ = C1578630rBN.LIZJ(fragment2)) != null && (eventCenter = rootPanelComponentLIZJ.getEventCenter()) != null) {
                eventCenter.yQ2("event_on_render_first_frame", new AObserverS236S0100000_34(this, 9), false);
            }
        } else {
            C622680Oba.LIZJ(this);
        }
        if (Intrinsics.LJFF(C0BS6.LIZ.getValue(), "play_time_collect_by_cep")) {
            C1306930k79.LIZ.LIZ(new AwS280S0000000_34(this, 0));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:86:0x0198  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIIZ(int r13) {
        /*
            Method dump skipped, instruction units count: 463
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2239731ClP.LJIIIZ(int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [java.util.AbstractCollection, java.util.LinkedList] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.ArrayList, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Iterable, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r3v4, types: [X.13BV] */
    public final void LJIIJ(int i) {
        ?? arrayList;
        if (LJIIIIZZ().isEmpty()) {
            arrayList = C13BV.INSTANCE;
        } else {
            if (i > -1) {
                LinkedList<C2239801ClW> linkedListLJIIIIZZ = LJIIIIZZ();
                arrayList = new ArrayList();
                for (C2239801ClW c2239801ClW : linkedListLJIIIIZZ) {
                    C2239801ClW c2239801ClW2 = c2239801ClW;
                    if ((c2239801ClW2 instanceof C2239801ClW) && i == c2239801ClW2.LLILLL.LIZIZ) {
                        arrayList.add(c2239801ClW);
                    }
                }
                if (!arrayList.isEmpty()) {
                    for (C2239801ClW c2239801ClW3 : arrayList) {
                        if ((c2239801ClW3 instanceof C2239801ClW) && c2239801ClW3 != null) {
                            c2239801ClW3.LLILZLL = C2239941Clk.LIZ().preloadToBitmap;
                        }
                    }
                    LJIIIIZZ().removeAll(arrayList);
                }
            } else {
                int iMin = Math.min(LJIIIIZZ().size(), this.LJIJI);
                arrayList = new ArrayList();
                for (int i2 = 0; i2 < iMin; i2++) {
                    try {
                        Object objLJJIIZI = C19719612Di.LJJIIZI(LJIIIIZZ());
                        if (objLJJIIZI != null) {
                            arrayList.add(objLJJIIZI);
                        }
                    } catch (IndexOutOfBoundsException e) {
                        TryCatchGuardChecker.doCheck(e);
                        C1AF0.LJ(e);
                    }
                }
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        for (AbstractRunnableC2239851Clb abstractRunnableC2239851Clb : arrayList) {
            C11NZ.LJJJJI(new ACallableS419S0100000_12(abstractRunnableC2239851Clb, 2)).LJIILIIL(new C0TA6(abstractRunnableC2239851Clb)).LJL(C11S5.LIZ()).LJJJLZIJ(C11S5.LIZ()).LIZIZ(new C11N2<Boolean>() { // from class: X.0TJF
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

    /* JADX WARN: Removed duplicated region for block: B:55:0x00f2 A[Catch: Exception -> 0x0167, TryCatch #2 {Exception -> 0x0167, blocks: (B:53:0x00e7, B:55:0x00f2, B:57:0x00f8, B:58:0x0103, B:60:0x0127, B:61:0x012d, B:63:0x0135), top: B:94:0x00b3 }] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @X.C14EU
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onVideoProgressEvent(X.C586420MzI r22) {
        /*
            Method dump skipped, instruction units count: 489
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2239731ClP.onVideoProgressEvent(X.0MzI):void");
    }

    public final void LIZJ(C2239741ClQ c2239741ClQ, int i) {
        int size;
        C2239801ClW next;
        List<PhotoModeImageUrlModel> imageList;
        int i2 = i + C2239941Clk.LIZ().horizontalLoadCount;
        PhotoModeImageInfo photoModeImageInfo = c2239741ClQ.LIZ.getPhotoModeImageInfo();
        if (photoModeImageInfo != null && (imageList = photoModeImageInfo.getImageList()) != null) {
            size = imageList.size();
        } else {
            size = 0;
        }
        int iMin = Math.min(i2, size);
        boolean z = false;
        for (int i3 = i + 2; i3 < iMin; i3++) {
            if (!c2239741ClQ.LJI.contains(Integer.valueOf(i3))) {
                Iterator<C2239801ClW> it2 = LJIIIIZZ().iterator();
                while (true) {
                    if (it2.hasNext()) {
                        next = it2.next();
                        C2239801ClW c2239801ClW = next;
                        if ((c2239801ClW instanceof C2239801ClW) && Intrinsics.LJFF(c2239801ClW.LLILLL, c2239741ClQ) && c2239801ClW.LLILZ == i3) {
                            break;
                        }
                    } else {
                        next = null;
                        break;
                    }
                }
                C2239801ClW c2239801ClW2 = next;
                if (c2239801ClW2 != null) {
                    c2239801ClW2.LL = LJII(c2239741ClQ.LIZIZ, i3, true);
                } else {
                    LinkedList<C2239801ClW> linkedListLJIIIIZZ = LJIIIIZZ();
                    C2239801ClW c2239801ClW3 = new C2239801ClW(c2239741ClQ, i3, LJIIIIZZ());
                    c2239801ClW3.LL = LJII(c2239741ClQ.LIZIZ, i3, true);
                    linkedListLJIIIIZZ.add(c2239801ClW3);
                }
                z = true;
            }
        }
        if (z) {
            C08XD.LJJ(LJIIIIZZ(), C0TG7.LL);
            LJIIJ(this.LJIIIZ);
        }
    }

    public final int LJII(int i, int i2, boolean z) {
        if (z) {
            return 99000100 - i2;
        }
        return ((100 - i2) * 10000) + (10000 - Math.abs(this.LJIIIZ - i));
    }
}
