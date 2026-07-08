package X;

import Y.AObserverS236S0100000_34;
import Y.ARunnableS103S0200000_34;
import Y.ARunnableS134S0100000_34;
import android.database.DataSetObserver;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.ability.IPhotoSlidesEventDispatchAbility;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageInfo;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageUrlModel;
import com.ss.android.ugc.aweme.preload.experiment.PhotoModePreloadConfig;
import com.ss.android.ugc.aweme.service.IPhotosViewHolderType;
import com.ss.android.ugc.feed.platform.panel.RootPanelComponent;
import com.ss.android.ugc.feed.platform.panel.base.EventCenter;
import com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerAbility;
import com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerComponentAbility;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AFwS225S0000000_34;
import kotlin.jvm.internal.AwS578S0100000_34;
import kotlin.jvm.internal.AwS84S1000000_34;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.1Clc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public class C2239861Clc implements InterfaceC1499080p74 {
    public C1499070p73 LIZ;
    public int LJIIIIZZ;
    public boolean LJIIIZ;
    public Runnable LJIIJ;
    public C0SZ8 LJIIL;
    public final C01GW LIZIZ = C452501pT.LIZIZ(AFwS225S0000000_34.get$arr$(105));
    public final int LIZJ = Math.max(1, C2239941Clk.LIZ().preloadPoolSize);
    public final C01GW LIZLLL = C452501pT.LIZIZ(AFwS225S0000000_34.get$arr$(106));
    public final C01GW LJ = C452501pT.LIZIZ(AFwS225S0000000_34.get$arr$(104));
    public final C01GW LJFF = C452501pT.LIZIZ(AFwS225S0000000_34.get$arr$(107));
    public final C01GW LJI = C452501pT.LIZIZ(new AwS578S0100000_34(this, 60));
    public final C01GW LJII = C452501pT.LIZIZ(new AwS578S0100000_34(this, 59));
    public final Set<String> LJIIJJI = new LinkedHashSet();
    public final Map<Integer, IPhotoSlidesEventDispatchAbility> LJIILIIL = new LinkedHashMap();
    public final C2239921Cli LJIILJJIL = new C2239921Cli(this);

    public int LJIIJJI(int i) {
        return i;
    }

    @Override // X.InterfaceC1499080p74
    public final void LIZ() {
        ((LinkedHashMap) this.LJIILIIL).clear();
        LJIIJ().clear();
    }

    public final LinkedList<AbstractRunnableC2239851Clb> LJI() {
        return (LinkedList) this.LJ.getValue();
    }

    public final C0SR4 LJII() {
        return (C0SR4) this.LJII.getValue();
    }

    public final LinkedHashMap<String, C2239911Clh> LJIIIIZZ() {
        return (LinkedHashMap) this.LIZIZ.getValue();
    }

    public final LinkedList<AbstractRunnableC2239851Clb> LJIIJ() {
        return (LinkedList) this.LIZLLL.getValue();
    }

    public final LinkedList<AbstractRunnableC2239851Clb> LJIIL() {
        return (LinkedList) this.LJFF.getValue();
    }

    public List<Aweme> LIZJ() {
        C0SR4 c0sr4LJII = LJII();
        if (c0sr4LJII != null) {
            return c0sr4LJII.Fg();
        }
        return null;
    }

    public void LJ() {
        List<Aweme> listFg;
        Aweme item;
        String aid;
        LJFF();
        IViewPagerAbility iViewPagerAbility = (IViewPagerAbility) this.LJI.getValue();
        if (iViewPagerAbility != null) {
            int iLJIL = iViewPagerAbility.LJIL();
            C0SR4 c0sr4LJII = LJII();
            if (c0sr4LJII == null || (listFg = c0sr4LJII.Fg()) == null) {
                return;
            }
            int size = listFg.size();
            for (int i = iLJIL; i < size; i++) {
                C0SR4 c0sr4LJII2 = LJII();
                if (c0sr4LJII2 != null && (item = c0sr4LJII2.getItem(i)) != null && AwemeExtKt.isPhotoMode(item) && (aid = item.getAid()) != null && aid.length() != 0 && !this.LJIIJJI.contains(item.getAid())) {
                    this.LJIIJJI.add(item.getAid());
                    int i2 = i - iLJIL;
                    C2344009Gk c2344009Gk = new C2344009Gk();
                    C1499070p73 c1499070p73 = this.LIZ;
                    if (c1499070p73 == null) {
                        c1499070p73 = null;
                    }
                    c2344009Gk.LJIIIIZZ("enter_from", c1499070p73.LIZIZ);
                    c2344009Gk.LIZJ(i2, "delta");
                    C20684815ws.LJIILLIIL("photo_mode_preload_info", c2344009Gk.LIZ);
                }
            }
        }
    }

    public final void LJFF() {
        final ArrayList arrayList;
        List<Aweme> listLIZJ = LIZJ();
        if (listLIZJ != null) {
            arrayList = new ArrayList(C15438062q.LJIJJ(listLIZJ, 10));
            Iterator<Aweme> it2 = listLIZJ.iterator();
            while (it2.hasNext()) {
                arrayList.add(it2.next());
            }
        } else {
            arrayList = null;
        }
        C1498600p6I.LIZIZ(new Runnable() { // from class: X.1Cld
            public final void LIZ() {
                PhotoModeImageInfo photoModeImageInfo;
                List<PhotoModeImageUrlModel> imageList;
                int iLJIIJJI;
                C2239911Clh c2239911Clh;
                C2239861Clc c2239861Clc = this.LL;
                List<Aweme> list = arrayList;
                c2239861Clc.getClass();
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                if (list != null) {
                    int i = 0;
                    for (Aweme aweme : list) {
                        int i2 = i + 1;
                        if (i < 0) {
                            C1697810uHb.LJIJI();
                            throw null;
                        }
                        Aweme aweme2 = aweme;
                        if (aweme2 != null && AwemeExtKt.isPhotoMode(aweme2) && aweme2.getPhotoModeImageInfo() != null && (iLJIIJJI = c2239861Clc.LJIIJJI(i)) > c2239861Clc.LJIIIIZZ) {
                            linkedHashSet.add(aweme2.getAid());
                            if (aweme2.getPhotoModeImageInfo() != null) {
                                if (!c2239861Clc.LJIIIIZZ().containsKey(aweme2.getAid())) {
                                    c2239861Clc.LJIIIIZZ().put(aweme2.getAid(), new C2239911Clh(aweme2, iLJIIJJI));
                                } else if (c2239861Clc.LJIIIIZZ().get(aweme2.getAid()) != null && (c2239911Clh = c2239861Clc.LJIIIIZZ().get(aweme2.getAid())) != null) {
                                    c2239911Clh.LIZIZ = iLJIIJJI;
                                }
                            }
                        }
                        i = i2;
                    }
                }
                Set<String> setKeySet = c2239861Clc.LJIIIIZZ().keySet();
                ArrayList<String> arrayList2 = new ArrayList();
                for (Object obj : setKeySet) {
                    if (true ^ linkedHashSet.contains(obj)) {
                        arrayList2.add(obj);
                    }
                }
                for (String str : arrayList2) {
                    if (c2239861Clc.LJIIIIZZ().remove(str) != null) {
                        C19719612Di.LJJIIJ(c2239861Clc.LJIIJ(), new AwS84S1000000_34(str, 2), true);
                    }
                }
                C2239861Clc c2239861Clc2 = this.LL;
                Iterator<Map.Entry<String, C2239911Clh>> it3 = c2239861Clc2.LJIIIIZZ().entrySet().iterator();
                while (it3.hasNext()) {
                    C2239911Clh value = it3.next().getValue();
                    if (!value.LIZLLL && (photoModeImageInfo = value.LIZ.getPhotoModeImageInfo()) != null && (imageList = photoModeImageInfo.getImageList()) != null) {
                        int iMin = Math.min(c2239861Clc2.LJIILLIIL(C2239941Clk.LIZ()), imageList.size());
                        for (int i3 = 0; i3 < iMin; i3++) {
                            if (Math.abs(c2239861Clc2.LJIIIIZZ - value.LIZIZ) > 1 || i3 > 1) {
                                LinkedList<AbstractRunnableC2239851Clb> linkedListLJIIJ = c2239861Clc2.LJIIJ();
                                C2239891Clf c2239891Clf = new C2239891Clf(c2239861Clc2, value, i3);
                                c2239891Clf.LL = c2239861Clc2.LJIIIZ(value.LIZIZ, i3, false);
                                linkedListLJIIJ.add(c2239891Clf);
                            } else {
                                value.LJI.add(Integer.valueOf(i3));
                            }
                            value.LIZLLL = true;
                        }
                    }
                }
                C08XD.LJJ(c2239861Clc2.LJIIJ(), C0TG8.LL);
                c2239861Clc2.LJIIJ = null;
                c2239861Clc2.LJIIIZ = false;
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("PhotoStrategy@221a.collectPreloadTask$1");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("PhotoStrategy@221a.collectPreloadTask$1");
            }
        });
    }

    public int LJIILIIL() {
        return C2239941Clk.LIZ().horizontalLoadCount;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x004b  */
    /* JADX WARN: Type inference failed for: r3v0, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Iterable, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIILL() {
        /*
            r4 = this;
            java.util.LinkedList r0 = r4.LJIIJ()
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L4b
            java.util.LinkedList r0 = r4.LJIIL()
            int r0 = r0.size()
            int r1 = r4.LIZJ
            if (r0 == r1) goto L4b
            java.util.LinkedList r0 = r4.LJIIL()
            int r0 = r0.size()
            int r1 = r1 - r0
            java.util.LinkedList r0 = r4.LJIIJ()
            int r0 = r0.size()
            int r2 = java.lang.Math.min(r0, r1)
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r1 = 0
        L31:
            if (r1 >= r2) goto L4d
            java.util.LinkedList r0 = r4.LJIIJ()     // Catch: java.lang.IndexOutOfBoundsException -> L41
            java.lang.Object r0 = X.C19719612Di.LJJIIZI(r0)     // Catch: java.lang.IndexOutOfBoundsException -> L41
            if (r0 == 0) goto L48
            r3.add(r0)     // Catch: java.lang.IndexOutOfBoundsException -> L41
            goto L48
        L41:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            X.C1AF0.LJ(r0)
        L48:
            int r1 = r1 + 1
            goto L31
        L4b:
            X.13BV r3 = X.C13BV.INSTANCE
        L4d:
            boolean r0 = r3.isEmpty()
            if (r0 == 0) goto L54
            return
        L54:
            java.util.Iterator r3 = r3.iterator()
        L58:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L87
            java.lang.Object r2 = r3.next()
            X.1Clb r2 = (X.AbstractRunnableC2239851Clb) r2
            java.util.LinkedList r0 = r4.LJIIL()
            r0.add(r2)
            Y.ACallableS419S0100000_12 r1 = new Y.ACallableS419S0100000_12
            r0 = 3
            r1.<init>(r2, r0)
            X.11K6 r1 = X.C11NZ.LJJJJI(r1)
            X.0TA6 r0 = new X.0TA6
            r0.<init>(r2)
            X.11NZ r1 = r1.LJIILIIL(r0)
            X.0TJH r0 = new X.0TJH
            r0.<init>()
            r1.LIZIZ(r0)
            goto L58
        L87:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2239861Clc.LJIILL():void");
    }

    public int LJIIZILJ() {
        return C2239941Clk.LIZ().verticalTriggerDelta;
    }

    @Override // X.InterfaceC1499080p74
    public final void LIZIZ(C1499070p73 c1499070p73) {
        RootPanelComponent rootPanelComponentLIZJ;
        EventCenter eventCenter;
        this.LIZ = c1499070p73;
        Fragment fragment = c1499070p73.LIZ;
        if (fragment != null && (rootPanelComponentLIZJ = C1578630rBN.LIZJ(fragment)) != null && (eventCenter = rootPanelComponentLIZJ.getEventCenter()) != null) {
            eventCenter.yQ2("event_on_render_first_frame", new AObserverS236S0100000_34(this, 10), false);
        }
        C0SR4 c0sr4LJII = LJII();
        if (c0sr4LJII != null) {
            c0sr4LJII.LJJII(new DataSetObserver() { // from class: X.1Clj
                @Override // android.database.DataSetObserver
                public final void onInvalidated() {
                }

                @Override // android.database.DataSetObserver
                public final void onChanged() {
                    this.LIZ.LJ();
                }
            });
        }
        IViewPagerComponentAbility iViewPagerComponentAbility = (IViewPagerComponentAbility) this.LJI.getValue();
        if (iViewPagerComponentAbility != null) {
            iViewPagerComponentAbility.Bv0(new C1D17(this, 5));
        }
        LJ();
    }

    public void LJIILJJIL(int i) {
        C0SZ8 c0sz8LJLIL;
        C0SR4 c0sr4LJII;
        List<Aweme> listFg;
        Aweme aweme;
        String aid;
        C2239911Clh c2239911Clh;
        C0SZ8 c0sz8LJLIL2;
        InterfaceC665370Q7z interfaceC665370Q7zLIZIZ;
        IPhotoSlidesEventDispatchAbility iPhotoSlidesEventDispatchAbility;
        C0SZ8 c0sz8;
        InterfaceC665370Q7z interfaceC665370Q7zLIZIZ2;
        this.LJIIIIZZ = i;
        C0SZ8 c0sz82 = this.LJIIL;
        if (c0sz82 != null) {
            IPhotoSlidesEventDispatchAbility iPhotoSlidesEventDispatchAbility2 = (IPhotoSlidesEventDispatchAbility) ((LinkedHashMap) this.LJIILIIL).get(Integer.valueOf(System.identityHashCode(c0sz82)));
            if (iPhotoSlidesEventDispatchAbility2 != null || ((c0sz8 = this.LJIIL) != null && (interfaceC665370Q7zLIZIZ2 = C0T0K.LIZIZ(c0sz8)) != null && (iPhotoSlidesEventDispatchAbility2 = (IPhotoSlidesEventDispatchAbility) C1558520qew.LIZ(interfaceC665370Q7zLIZIZ2, IPhotoSlidesEventDispatchAbility.class, null)) != null)) {
                iPhotoSlidesEventDispatchAbility2.b3(this.LJIILJJIL);
            }
            this.LJIILJJIL.LL = null;
            this.LJIIL = null;
        }
        IViewPagerComponentAbility iViewPagerComponentAbility = (IViewPagerComponentAbility) this.LJI.getValue();
        if (iViewPagerComponentAbility != null) {
            c0sz8LJLIL = iViewPagerComponentAbility.LJLIL();
        } else {
            c0sz8LJLIL = null;
        }
        if ((c0sz8LJLIL instanceof IPhotosViewHolderType) && (c0sr4LJII = LJII()) != null && (listFg = c0sr4LJII.Fg()) != null && (aweme = (Aweme) C13LP.LJJJLZIJ(this.LJIIIIZZ, listFg)) != null && (aid = aweme.getAid()) != null && (c2239911Clh = LJIIIIZZ().get(aid)) != null) {
            this.LJIILJJIL.LL = c2239911Clh;
            IViewPagerComponentAbility iViewPagerComponentAbility2 = (IViewPagerComponentAbility) this.LJI.getValue();
            if (iViewPagerComponentAbility2 != null) {
                c0sz8LJLIL2 = iViewPagerComponentAbility2.LJLIL();
            } else {
                c0sz8LJLIL2 = null;
            }
            this.LJIIL = c0sz8LJLIL2;
            IPhotoSlidesEventDispatchAbility iPhotoSlidesEventDispatchAbility3 = (IPhotoSlidesEventDispatchAbility) ((LinkedHashMap) this.LJIILIIL).get(Integer.valueOf(System.identityHashCode(c0sz8LJLIL2)));
            if (iPhotoSlidesEventDispatchAbility3 != null) {
                iPhotoSlidesEventDispatchAbility3.LLJJI(this.LJIILJJIL);
            } else {
                C0SZ8 c0sz83 = this.LJIIL;
                if (c0sz83 != null && (interfaceC665370Q7zLIZIZ = C0T0K.LIZIZ(c0sz83)) != null && (iPhotoSlidesEventDispatchAbility = (IPhotoSlidesEventDispatchAbility) C1558520qew.LIZ(interfaceC665370Q7zLIZIZ, IPhotoSlidesEventDispatchAbility.class, null)) != null) {
                    iPhotoSlidesEventDispatchAbility.LLJJI(this.LJIILJJIL);
                    this.LJIILIIL.put(Integer.valueOf(System.identityHashCode(this.LJIIL)), iPhotoSlidesEventDispatchAbility);
                }
            }
            C1498600p6I.LIZIZ(new ARunnableS103S0200000_34(this, c2239911Clh, 9));
        }
        C1498600p6I.LIZIZ(new ARunnableS134S0100000_34(this, 28));
    }

    public int LJIILLIIL(PhotoModePreloadConfig photoModePreloadConfig) {
        return photoModePreloadConfig.verticalLoadHorizontalCount;
    }

    public final void LIZLLL(C2239911Clh c2239911Clh, int i) {
        int size;
        AbstractRunnableC2239851Clb next;
        List<PhotoModeImageUrlModel> imageList;
        int iLJIILIIL = i + LJIILIIL();
        PhotoModeImageInfo photoModeImageInfo = c2239911Clh.LIZ.getPhotoModeImageInfo();
        if (photoModeImageInfo != null && (imageList = photoModeImageInfo.getImageList()) != null) {
            size = imageList.size();
        } else {
            size = 0;
        }
        int iMin = Math.min(iLJIILIIL, size);
        boolean z = false;
        for (int i2 = i + 2; i2 < iMin; i2++) {
            if (!c2239911Clh.LJI.contains(Integer.valueOf(i2))) {
                Iterator<AbstractRunnableC2239851Clb> it2 = LJIIJ().iterator();
                while (true) {
                    if (it2.hasNext()) {
                        next = it2.next();
                        AbstractRunnableC2239851Clb abstractRunnableC2239851Clb = next;
                        if (abstractRunnableC2239851Clb instanceof C2239891Clf) {
                            C2239891Clf c2239891Clf = (C2239891Clf) abstractRunnableC2239851Clb;
                            if (Intrinsics.LJFF(c2239891Clf.LLILLL, c2239911Clh) && c2239891Clf.LLILZ == i2) {
                                break;
                            }
                        }
                    } else {
                        next = null;
                        break;
                    }
                }
                AbstractRunnableC2239851Clb abstractRunnableC2239851Clb2 = next;
                if (abstractRunnableC2239851Clb2 != null) {
                    abstractRunnableC2239851Clb2.LL = LJIIIZ(c2239911Clh.LIZIZ, i2, true);
                } else {
                    LinkedList<AbstractRunnableC2239851Clb> linkedListLJIIJ = LJIIJ();
                    C2239891Clf c2239891Clf2 = new C2239891Clf(this, c2239911Clh, i2);
                    c2239891Clf2.LL = LJIIIZ(c2239911Clh.LIZIZ, i2, true);
                    linkedListLJIIJ.add(c2239891Clf2);
                }
                z = true;
            }
        }
        if (z) {
            C08XD.LJJ(LJIIJ(), C0TG8.LL);
            LJIILL();
        }
    }

    public final int LJIIIZ(int i, int i2, boolean z) {
        if (z) {
            return 99000100 - i2;
        }
        return ((100 - i2) * 10000) + (10000 - Math.abs(this.LJIIIIZZ - i));
    }
}
