package X;

import Y.AObserverS216S0100000_12;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeStatus;
import com.ss.android.ugc.aweme.im.saas.host.api.foundation.IMCrossAppFeatureDiffApi;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AFwS207S0000000_19;
import kotlin.jvm.internal.AFwS213S0000000_24;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0rwi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1607980rwi implements InterfaceC1603360rpG, InterfaceC1603420rpM, InterfaceC1216440hlC, C0PDP {
    public final InterfaceC1608000rwk LL;
    public final String LLILLJJLI;
    public boolean LLILZ;
    public long LLILZIL;
    public long LLILZLL;
    public long LLIZ;
    public int LLJ;
    public InterfaceC1209780haS LLJILLL;
    public final List<Aweme> LLJJ;
    public final C1607990rwj LLJJI;
    public final C1210820hc8 LLJJIII;
    public AObserverS216S0100000_12 LLJJIJI;
    public C19EG LLJJIJIIJIL;
    public int LLJJIJIL;
    public int LLILLL = 1;
    public boolean LLIZLLLIL = true;
    public final C01GW LLJI = C452501pT.LIZIZ(AFwS207S0000000_19.get$arr$(92));
    public final C01GW LLJIJIL = C452501pT.LIZIZ(AFwS207S0000000_19.get$arr$(91));
    public final C01GW LLJILJIL = C452501pT.LIZIZ(new AwS568S0100000_24(this, 256));
    public final C01GW LLJILJILJ = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(93));

    @Override // X.InterfaceC1603420rpM
    public final void bindPreLoadView(InterfaceC666290QBn interfaceC666290QBn) {
    }

    @Override // X.InterfaceC1603360rpG
    public final /* synthetic */ boolean cannotLoadLatest() {
        return false;
    }

    @Override // X.InterfaceC1603360rpG
    public final /* synthetic */ boolean cannotLoadMore() {
        return false;
    }

    @Override // X.InterfaceC1603360rpG
    public final int getPageType(int i) {
        return 7000;
    }

    @Override // X.InterfaceC1603360rpG
    public final void unInit() {
        AObserverS216S0100000_12 aObserverS216S0100000_12;
        this.LLJILLL = null;
        this.LLJJ.clear();
        LIZIZ().LIZ();
        LIZIZ().LJIILJJIL();
        this.LL.LJI();
        if (C289540BWm.LIZ()) {
            if (C1603960rqE.LIZLLL == this.LL) {
                C1603960rqE.LIZLLL = null;
            }
        }
        C19EG c19eg = this.LLJJIJIIJIL;
        if (c19eg == null || (aObserverS216S0100000_12 = this.LLJJIJI) == null) {
            return;
        }
        C740740T3w.LJIIIZ(c19eg, aObserverS216S0100000_12);
        this.LLJJIJI = null;
        this.LLJJIJIL = 2;
    }

    public static Aweme LIZJ() {
        Aweme aweme = new Aweme();
        AwemeStatus awemeStatus = new AwemeStatus();
        aweme.setCanPlay(false);
        awemeStatus.setDelete(true);
        aweme.setStatus(awemeStatus);
        User user = new User();
        user.setAdFake(false);
        aweme.setAuthor(user);
        return aweme;
    }

    public final C666120QAw LIZIZ() {
        return (C666120QAw) this.LLJILJILJ.getValue();
    }

    public final int LIZLLL() {
        return ((Number) this.LLJI.getValue()).intValue();
    }

    public final boolean LJI() {
        if (((Number) C300800Bqg.LIZ.getValue()).intValue() == 2) {
            if (System.currentTimeMillis() - ((Keva) this.LLJIJIL.getValue()).getLong("last_scroll_time", 0L) >= TimeUnit.DAYS.toMillis(1L)) {
                return false;
            }
        }
        return true;
    }

    @Override // X.InterfaceC1216440hlC
    public final boolean aH0() {
        return this.LL.LIZLLL();
    }

    @Override // X.InterfaceC1603360rpG
    public final Object getViewModel() {
        return this.LLJILJIL.getValue();
    }

    @Override // X.InterfaceC1603360rpG
    public final boolean isDataEmpty() {
        return this.LL.LJIIIIZZ() == null;
    }

    @Override // X.InterfaceC1603360rpG
    public final boolean isLoading() {
        return this.LLJJI.LIZIZ || LIZIZ().LJIIL();
    }

    @Override // X.C0PDP
    public final List<Aweme> getAwemeList() {
        return this.LLJJ;
    }

    public static boolean LIZ(C597250Nbf c597250Nbf) {
        List<C912500Zqy> list = c597250Nbf.LIZ;
        boolean z = false;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<C912500Zqy> it2 = list.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                if (it2.next().LIZ == null) {
                    z = true;
                    break;
                }
            }
        }
        return !z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.util.Collection] */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public final void LJ(List<? extends Aweme> list) {
        List list2;
        List<C912500Zqy> list3;
        C13BV arrayList;
        Aweme awemeLIZJ;
        Aweme aweme;
        long startIndex;
        long startIndex2;
        boolean z;
        InterfaceC1209780haS interfaceC1209780haS = this.LLJILLL;
        if (interfaceC1209780haS != null) {
            interfaceC1209780haS.Uh(this.LLILZ);
        }
        this.LLILZ = false;
        C597250Nbf c597250Nbf = this.LLJJI.LIZ;
        if (c597250Nbf == null || (list2 = c597250Nbf.LIZ) == null) {
            list2 = C13BV.INSTANCE;
        }
        if (list == null) {
            list = C13BV.INSTANCE;
        }
        if (c597250Nbf == null || (list3 = c597250Nbf.LIZ) == null) {
            list3 = C13BV.INSTANCE;
        }
        if (list3.isEmpty()) {
            arrayList = C13BV.INSTANCE;
        } else {
            int iLIZIZ = C2097908Jt.LIZIZ(C15438062q.LJIJJ(list, 10));
            if (iLIZIZ < 16) {
                iLIZIZ = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(iLIZIZ);
            for (Aweme aweme2 : list) {
                linkedHashMap.put(aweme2.getAid(), aweme2);
            }
            arrayList = new ArrayList(C15438062q.LJIJJ(list3, 10));
            for (C912500Zqy c912500Zqy : list3) {
                C06P7 c06p7 = C06P7.LIZ;
                String str = c912500Zqy.LIZIZ;
                c06p7.getClass();
                if (C06P7.LIZ(str)) {
                    awemeLIZJ = LIZJ();
                    awemeLIZJ.setAid(c912500Zqy.LIZIZ);
                } else {
                    awemeLIZJ = c912500Zqy.LIZ;
                    if (awemeLIZJ == null && ((aweme = (Aweme) linkedHashMap.get(c912500Zqy.LIZIZ)) == null || (awemeLIZJ = aweme.m199clone()) == null)) {
                        awemeLIZJ = LIZJ();
                        awemeLIZJ.setAid(c912500Zqy.LIZIZ);
                    }
                }
                arrayList.add(LJII(awemeLIZJ, c912500Zqy.LIZJ));
            }
        }
        int i = this.LLILLL;
        boolean z2 = true;
        if (i != 1) {
            if (i != 2) {
                this.LLJJ.addAll((Collection<? extends Aweme>) arrayList);
                C912500Zqy c912500Zqy2 = (C912500Zqy) C13LP.LJJLIIIJL(list2);
                if (c912500Zqy2 != null) {
                    startIndex2 = c912500Zqy2.LIZJ;
                } else {
                    startIndex2 = this.LL.getStartIndex();
                }
                this.LLILZLL = startIndex2;
                InterfaceC1209780haS interfaceC1209780haS2 = this.LLJILLL;
                if (interfaceC1209780haS2 != null) {
                    List<Aweme> list4 = this.LLJJ;
                    C597250Nbf c597250Nbf2 = this.LLJJI.LIZ;
                    if (c597250Nbf2 != null) {
                        z = c597250Nbf2.LIZIZ;
                    } else {
                        z = true;
                    }
                    interfaceC1209780haS2.Pj(list4, z);
                }
                if (this.LL.LJFF() && C300800Bqg.LIZ() && this.LLIZLLLIL && LJI()) {
                    this.LLIZLLLIL = false;
                    this.LLILZ = true;
                    this.LLILLL = 2;
                    this.LL.LIZIZ(this.LLIZ, true);
                }
            } else {
                this.LLJJ.addAll(0, (Collection<? extends Aweme>) arrayList);
                C912500Zqy c912500Zqy3 = (C912500Zqy) C13LP.LJJJLL(list2);
                if (c912500Zqy3 != null) {
                    startIndex = c912500Zqy3.LIZJ;
                } else {
                    startIndex = this.LL.getStartIndex();
                }
                this.LLIZ = startIndex;
                InterfaceC1209780haS interfaceC1209780haS3 = this.LLJILLL;
                if (interfaceC1209780haS3 != null) {
                    List<Aweme> list5 = this.LLJJ;
                    C597250Nbf c597250Nbf3 = this.LLJJI.LIZ;
                    if (c597250Nbf3 != null) {
                        z2 = c597250Nbf3.LIZIZ;
                    }
                    interfaceC1209780haS3.mE(list5, z2);
                }
            }
        } else {
            this.LLJJ.clear();
            this.LLJJ.addAll((Collection<? extends Aweme>) arrayList);
            if (list2.isEmpty()) {
                this.LLIZ = this.LL.getStartIndex();
                this.LLILZLL = this.LL.getStartIndex();
            } else {
                this.LLIZ = ((C912500Zqy) C13LP.LJJJJZI(list2)).LIZJ;
                this.LLILZLL = ((C912500Zqy) C13LP.LJJLIIIJJI(list2)).LIZJ;
            }
            InterfaceC1209780haS interfaceC1209780haS4 = this.LLJILLL;
            if (interfaceC1209780haS4 != null) {
                List<Aweme> list6 = this.LLJJ;
                C597250Nbf c597250Nbf4 = this.LLJJI.LIZ;
                if (c597250Nbf4 != null) {
                    z2 = c597250Nbf4.LIZIZ;
                }
                interfaceC1209780haS4.LLJJJIL(list6, z2);
            }
        }
        this.LLJJI.LIZIZ = false;
    }

    public final void LJFF(int i) {
        if (isLoading() || System.currentTimeMillis() - this.LLILZIL < 500) {
            return;
        }
        InterfaceC1209780haS interfaceC1209780haS = this.LLJILLL;
        if (interfaceC1209780haS != null) {
            interfaceC1209780haS.Uh(this.LLILZ);
        }
        this.LLILLL = i;
        this.LLJJI.LIZIZ = true;
        if (i != 1) {
            if (i != 2) {
                this.LL.LIZJ(this.LLILZLL);
                return;
            } else {
                this.LL.LIZIZ(this.LLIZ, false);
                return;
            }
        }
        this.LL.refresh();
    }

    @Override // X.InterfaceC1603360rpG
    public final void bindView(InterfaceC1209780haS interfaceC1209780haS) {
        this.LLJILLL = interfaceC1209780haS;
        LIZIZ().LLILLJJLI = this.LLJJIII;
        LIZIZ().LJIIJ((AbstractC666100QAu) this.LLJILJIL.getValue());
        this.LL.LJ(this.LLJJI);
        if (this.LL.LJIIIIZZ() != null) {
            InterfaceC1209780haS interfaceC1209780haS2 = this.LLJILLL;
            if (interfaceC1209780haS2 != null) {
                interfaceC1209780haS2.LLJJJIL(this.LLJJ, true);
            }
            this.LLILZ = true;
            LJFF(4);
            return;
        }
        IMCrossAppFeatureDiffApi.LIZ.getClass();
        IMCrossAppFeatureDiffApi iMCrossAppFeatureDiffApiLIZIZ = C898670ZNh.LIZIZ();
        if (iMCrossAppFeatureDiffApiLIZIZ == null || !iMCrossAppFeatureDiffApiLIZIZ.LIZLLL()) {
            return;
        }
        LJFF(1);
    }

    @Override // X.InterfaceC1603360rpG
    public final boolean deleteItem(String str) {
        String aid;
        C2276411E8h c2276411E8h = C2276411E8h.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("deleteItem: ");
        sbLIZ.append(str);
        c2276411E8h.LIZJ("detail_feed", 4, "ExtDetailChatOperator2", C2188811AlT.LIZIZ(sbLIZ));
        this.LL.deleteItem(str);
        int size = this.LLJJ.size();
        for (int i = 0; i < size; i++) {
            Aweme aweme = (Aweme) ListProtector.get(this.LLJJ, i);
            boolean zLJFF = Intrinsics.LJFF(aweme.getAid(), str);
            Aweme forwardItem = aweme.getForwardItem();
            if (forwardItem != null) {
                aid = forwardItem.getAid();
            } else {
                aid = null;
            }
            boolean zLJFF2 = Intrinsics.LJFF(aid, str);
            if (zLJFF || zLJFF2) {
                if (i >= 0) {
                    ListProtector.remove(this.LLJJ, i);
                    this.LLILZIL = System.currentTimeMillis();
                    InterfaceC1209780haS interfaceC1209780haS = this.LLJILLL;
                    if (interfaceC1209780haS != null) {
                        interfaceC1209780haS.Y1(i);
                    }
                    int size2 = this.LLJJ.size() - 1;
                    if (size2 < 0) {
                        return true;
                    }
                    while (true) {
                        int i2 = size2 - 1;
                        ListProtector.remove(this.LLJJ, size2);
                        InterfaceC1209780haS interfaceC1209780haS2 = this.LLJILLL;
                        if (interfaceC1209780haS2 != null) {
                            interfaceC1209780haS2.Y1(size2);
                        }
                        if (i2 >= 0) {
                            size2 = i2;
                        } else {
                            return true;
                        }
                    }
                }
                return false;
            }
        }
        return false;
    }

    @Override // X.InterfaceC1603360rpG
    public final boolean init(Fragment fragment) {
        C19EG activity;
        Object c098200Yq;
        if (LIZLLL() > 0 && (activity = fragment.getActivity()) != null) {
            this.LLJJIJIIJIL = activity;
            try {
                c098200Yq = fragment.getViewLifecycleOwner();
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            if (C189200o6.m7isFailureimpl(c098200Yq)) {
                c098200Yq = fragment;
            }
            this.LLJJIJI = C740740T3w.LIZLLL(fragment, (LifecycleOwner) c098200Yq, new C0T2Y() { // from class: X.0rwl
                @Override // X.C0T2Y
                public final void Y3(Aweme aweme) {
                    C1607980rwi c1607980rwi = this.LL;
                    c1607980rwi.LLJ = 0;
                    int i = c1607980rwi.LLJJIJIL;
                    if (i > 0) {
                        c1607980rwi.LLJJIJIL = i - 1;
                    } else {
                        ((Keva) c1607980rwi.LLJIJIL.getValue()).storeLong("last_scroll_time", System.currentTimeMillis());
                    }
                }
            });
            return true;
        }
        return true;
    }

    @Override // X.InterfaceC1603420rpM
    public final void setPreLoad(boolean z) {
        this.LLILZ = true;
    }

    /* JADX WARN: Type inference failed for: r0v16, types: [X.0hc8] */
    public C1607980rwi(InterfaceC1608000rwk interfaceC1608000rwk, String str) {
        List<Aweme> arrayList;
        this.LL = interfaceC1608000rwk;
        this.LLILLJJLI = str;
        this.LLILZLL = interfaceC1608000rwk.getStartIndex();
        this.LLIZ = interfaceC1608000rwk.getStartIndex();
        Aweme awemeLJIIIIZZ = interfaceC1608000rwk.LJIIIIZZ();
        if (awemeLJIIIIZZ != null) {
            C06P7 c06p7 = C06P7.LIZ;
            String aid = awemeLJIIIIZZ.getAid();
            c06p7.getClass();
            if (C06P7.LIZ(aid)) {
                Aweme awemeLIZJ = LIZJ();
                awemeLIZJ.setAid(awemeLJIIIIZZ.getAid());
                awemeLJIIIIZZ = awemeLIZJ;
            }
            arrayList = C1697810uHb.LJIILJJIL(LJII(awemeLJIIIIZZ, interfaceC1608000rwk.getStartIndex()));
        } else {
            arrayList = new ArrayList<>();
        }
        this.LLJJ = arrayList;
        this.LLJJI = new C1607990rwj(this);
        this.LLJJIII = new InterfaceC653820Pki() { // from class: X.0hc8
            @Override // X.InterfaceC653820Pki
            public final void Pc2(List<Aweme> list) {
                Integer numValueOf;
                C2276411E8h c2276411E8h = C2276411E8h.LIZIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("onBatchDetailSuccess: ");
                if (list != null) {
                    numValueOf = Integer.valueOf(list.size());
                } else {
                    numValueOf = null;
                }
                sbLIZ.append(numValueOf);
                c2276411E8h.LIZJ("detail_feed", 4, "ExtDetailChatOperator2", C2188811AlT.LIZIZ(sbLIZ));
                this.LL.LJ(list);
            }

            /* JADX WARN: Removed duplicated region for block: B:34:0x0079  */
            @Override // X.InterfaceC653820Pki
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void YB1(java.lang.Exception r11) {
                /*
                    r10 = this;
                    X.1E8h r4 = X.C2276411E8h.LIZIZ
                    java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
                    java.lang.String r0 = "onBatchDetailFailed: "
                    r1.append(r0)
                    r1.append(r11)
                    java.lang.String r3 = X.C2188811AlT.LIZIZ(r1)
                    r2 = 6
                    java.lang.String r1 = "ExtDetailChatOperator2"
                    java.lang.String r0 = "detail_feed"
                    r4.LIZJ(r0, r2, r1, r3)
                    boolean r0 = r11 instanceof X.C23112093u
                    r3 = 1
                    r5 = 0
                    if (r0 == 0) goto L79
                    r2 = r11
                    X.093u r2 = (X.C23112093u) r2
                    int r1 = r2.getErrorCode()
                    r0 = 2053(0x805, float:2.877E-42)
                    if (r1 == r0) goto L32
                    int r1 = r2.getErrorCode()
                    r0 = 5
                    if (r1 != r0) goto L79
                L32:
                    r1 = 1
                L33:
                    java.lang.Class<com.ss.android.ugc.aweme.detail.spi.IExtDetailChatOperator2Diff> r4 = com.ss.android.ugc.aweme.detail.spi.IExtDetailChatOperator2Diff.class
                    r8 = 14
                    r9 = 0
                    r6 = r5
                    r7 = r5
                    java.lang.Object r0 = com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt.pluggableSpi$default(r4, r5, r6, r7, r8, r9)
                    com.ss.android.ugc.aweme.detail.spi.IExtDetailChatOperator2Diff r0 = (com.ss.android.ugc.aweme.detail.spi.IExtDetailChatOperator2Diff) r0
                    if (r0 == 0) goto L45
                    r0.LIZ()
                L45:
                    if (r1 != 0) goto L7b
                    X.0rwi r0 = r10.LL
                    X.0haS r1 = r0.LLJILLL
                    if (r1 == 0) goto L52
                    boolean r0 = r0.LLILZ
                    r1.Uh(r0)
                L52:
                    X.0rwi r2 = r10.LL
                    boolean r0 = r2.LLILZ
                    r2.LLILZ = r5
                    if (r0 != 0) goto L68
                    int r1 = r2.LLILLL
                    if (r1 == r3) goto L71
                    r0 = 2
                    if (r1 == r0) goto L69
                    X.0haS r0 = r2.LLJILLL
                    if (r0 == 0) goto L68
                    r0.Wi(r11)
                L68:
                    return
                L69:
                    X.0haS r0 = r2.LLJILLL
                    if (r0 == 0) goto L68
                    r0.bD1(r11)
                    return
                L71:
                    X.0haS r0 = r2.LLJILLL
                    if (r0 == 0) goto L68
                    r0.Uq2(r11)
                    return
                L79:
                    r1 = 0
                    goto L33
                L7b:
                    r10.Pc2(r9)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C1210820hc8.YB1(java.lang.Exception):void");
            }
        };
        this.LLJJIJIL = 2;
    }

    public static Aweme LJII(Aweme aweme, long j) {
        Aweme aweme2 = new Aweme();
        if (j > 0) {
            aweme2.setAid(String.valueOf(j));
        } else {
            aweme2.setAid(aweme.getAid());
        }
        aweme2.setAwemeType(13);
        aweme2.setForwardItem(aweme);
        AwemeBizExtKt.setImItemId(aweme, aweme2.getAid());
        return aweme2;
    }

    @Override // X.InterfaceC1603360rpG
    public final void request(int i, C2189821An6 c2189821An6, int i2, boolean z) {
        if (LIZLLL() > 0 && this.LLILZ) {
            int iLIZLLL = LIZLLL();
            int i3 = this.LLJ;
            if (iLIZLLL <= i3) {
                C2276411E8h c2276411E8h = C2276411E8h.LIZIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("reach request maximum ");
                sbLIZ.append(LIZLLL());
                c2276411E8h.LIZJ("detail_feed", 4, "ExtDetailChatOperator2", C2188811AlT.LIZIZ(sbLIZ));
                this.LLILZ = false;
                return;
            }
            this.LLJ = i3 + 1;
        }
        LJFF(i);
    }
}
