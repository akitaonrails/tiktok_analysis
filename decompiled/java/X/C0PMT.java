package X;

import android.app.Activity;
import android.os.SystemClock;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeSaaSExtKt;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.dislike.core.db.SearchDislikeDataBase;
import com.ss.android.ugc.aweme.search.source.neo.ISearchContextAbility;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0PMT, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0PMT extends AbstractC1216410hl9<C0PN8, C643600PMg> implements InterfaceC1603420rpM, C0PMX, InterfaceC666730QDf {
    public boolean LL;

    @Override // X.InterfaceC666730QDf
    public final void LJI(int i, float f, int i2, Aweme aweme) {
    }

    @Override // X.AbstractC1216410hl9, X.InterfaceC1603360rpG
    public final int getPageType(int i) {
        return 9;
    }

    @Override // X.InterfaceC666730QDf
    public final void onPageScrollStateChanged(int i) {
    }

    @Override // X.AbstractC1216410hl9, X.InterfaceC1603360rpG
    public final void unInit() {
        super.unInit();
    }

    public C0PMT(AbstractC1255880imo<?, ?> abstractC1255880imo) {
        this.mModel = abstractC1255880imo instanceof C0PN8 ? abstractC1255880imo : new C0PN8();
        this.mPresenter = new C643600PMg();
    }

    @Override // X.InterfaceC666730QDf
    public final void LIZIZ(Aweme aweme) {
        C0PN8 c0pn8 = this.mModel;
        if (c0pn8 != null && aweme != null) {
            C0PHR c0phr = C0PHR.LIZ;
            C0PHT c0phtLJJIIZ = c0pn8.LJJIIZ();
            String aid = aweme.getAid();
            c0phr.getClass();
            C0PHR.LIZ(c0phtLJJIIZ, aid);
        }
    }

    @Override // X.InterfaceC1603420rpM
    public final void bindPreLoadView(InterfaceC666290QBn interfaceC666290QBn) {
        ((AbstractC666280QBm) this.mPresenter).LLILZIL = interfaceC666290QBn;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:38:0x007d  */
    @Override // X.AbstractC1216410hl9, X.InterfaceC1603360rpG
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void bindView(X.InterfaceC1209780haS r5) {
        /*
            r4 = this;
            super.bindView(r5)
            X.01GW r0 = X.C304760Bx4.LIZIZ
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L45
            androidx.fragment.app.Fragment r1 = r5.getFragment()
            boolean r0 = X.C294700Bgq.LIZ()
            r3 = 0
            if (r0 == 0) goto L7d
            X.0ru7 r0 = X.C1606370ru7.LIZ
            r0.getClass()
            boolean r0 = X.C1606370ru7.LIZLLL(r1)
            if (r0 == 0) goto L7d
            r0 = 1
        L28:
            r1 = 0
            if (r0 == 0) goto L56
            androidx.fragment.app.Fragment r2 = r5.getFragment()
            android.content.Context r0 = r2.getContext()
            if (r0 == 0) goto L39
            android.app.Activity r1 = com.ss.android.ugc.aweme.SAFExtensionKt.LJFF(r0)
        L39:
            boolean r0 = X.C294780Bgy.LIZ()
            if (r0 == 0) goto L49
            boolean r0 = r1 instanceof X.InterfaceC214897198d
            if (r0 != 0) goto L67
        L43:
            r4.LL = r3
        L45:
            X.C443030HYv.LIZJ(r5)
            return
        L49:
            boolean r0 = r1 instanceof X.InterfaceC214897198d
            if (r0 == 0) goto L43
            X.198d r1 = (X.InterfaceC214897198d) r1
            boolean r0 = r1.getEnableSAF()
            if (r0 != 0) goto L67
            goto L43
        L56:
            androidx.fragment.app.Fragment r0 = r5.getFragment()
            X.19EG r0 = r0.getActivity()
            if (r0 == 0) goto L43
            X.198i r2 = com.ss.android.ugc.aweme.SAFExtensionKt.LJIILLIIL(r0)
            goto L6d
        L65:
            if (r2 == 0) goto L43
        L67:
            boolean r0 = r2 instanceof X.InterfaceC214902198i
            if (r0 == 0) goto L78
            X.198i r2 = (X.InterfaceC214902198i) r2
        L6d:
            if (r2 == 0) goto L43
            com.ss.android.ugc.aweme.SAFFragmentRootScene r0 = r2.ib()
            if (r0 == 0) goto L43
            boolean r3 = r0.LLJJIJIL
            goto L43
        L78:
            androidx.fragment.app.Fragment r2 = r2.getParentFragment()
            goto L65
        L7d:
            r0 = 0
            goto L28
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0PMT.bindView(X.0haS):void");
    }

    @Override // X.AbstractC1216410hl9, X.InterfaceC1603360rpG
    public final boolean deleteItem(String str) {
        List items;
        Object next;
        String aid;
        Activity topActivity;
        List items2;
        Object next2;
        Aweme aweme;
        String aid2;
        String aid3;
        Aweme awemeLIZLLL;
        C0PHW c0phw = this.mModel.LJJIIZ().LJII;
        Aweme aweme2 = null;
        if (c0phw != null) {
            Aweme awemeLIZLLL2 = c0phw.LIZLLL();
            if (awemeLIZLLL2 != null) {
                aid3 = awemeLIZLLL2.getAid();
            } else {
                aid3 = null;
            }
            if (Intrinsics.LJFF(aid3, str)) {
                if (C07BF.LIZ() && (awemeLIZLLL = c0phw.LIZLLL()) != null && !AwemeSaaSExtKt.isLive(awemeLIZLLL)) {
                    C0PHX c0phx = c0phw.LIZJ;
                    C643580PMe c643580PMe = C643580PMe.LIZ;
                    C0P7A c0p7a = c0phx.LIZ.LJIIIZ;
                    c0phx.LJ();
                    String str2 = c0phx.LJIIIZ;
                    C640970PCd c640970PCd = c0p7a.LIZ.get(C13LE.LIZ(C643580PMe.class));
                    if (c640970PCd == null) {
                        c640970PCd = new C640970PCd();
                        c0p7a.LIZ.put(C13LE.LIZ(C643580PMe.class), c640970PCd);
                    }
                    HashMap<String, Object> map = c640970PCd.LIZ;
                    if (map != null) {
                        map.put(str2, c643580PMe);
                    }
                    Aweme awemeLIZLLL3 = c0phw.LIZLLL();
                    if (awemeLIZLLL3 != null && awemeLIZLLL3.isAd()) {
                        C0PHX c0phx2 = c0phw.LIZJ;
                        C643570PMd c643570PMd = C643570PMd.LIZ;
                        C0P7A c0p7a2 = c0phx2.LIZ.LJIIIZ;
                        c0phx2.LJ();
                        String str3 = c0phx2.LJIIIZ;
                        C640970PCd c640970PCd2 = c0p7a2.LIZ.get(C13LE.LIZ(C643570PMd.class));
                        if (c640970PCd2 == null) {
                            c640970PCd2 = new C640970PCd();
                            c0p7a2.LIZ.put(C13LE.LIZ(C643570PMd.class), c640970PCd2);
                        }
                        HashMap<String, Object> map2 = c640970PCd2.LIZ;
                        if (map2 != null) {
                            map2.put(str3, c643570PMd);
                        }
                    }
                } else {
                    C0PHX c0phx3 = c0phw.LIZJ;
                    C643580PMe c643580PMe2 = C643580PMe.LIZ;
                    C0P7A c0p7a3 = c0phx3.LIZ.LJIIIZ;
                    c0phx3.LJ();
                    String str4 = c0phx3.LJIIIZ;
                    C640970PCd c640970PCd3 = c0p7a3.LIZ.get(C13LE.LIZ(C643580PMe.class));
                    if (c640970PCd3 == null) {
                        c640970PCd3 = new C640970PCd();
                        c0p7a3.LIZ.put(C13LE.LIZ(C643580PMe.class), c640970PCd3);
                    }
                    HashMap<String, Object> map3 = c640970PCd3.LIZ;
                    if (map3 != null) {
                        map3.put(str4, c643580PMe2);
                    }
                    Aweme awemeLIZLLL4 = c0phw.LIZLLL();
                    if (awemeLIZLLL4 != null && awemeLIZLLL4.isAd()) {
                        C0PHX c0phx4 = c0phw.LIZJ;
                        C643570PMd c643570PMd2 = C643570PMd.LIZ;
                        C0P7A c0p7a4 = c0phx4.LIZ.LJIIIZ;
                        c0phx4.LJ();
                        String str5 = c0phx4.LJIIIZ;
                        C640970PCd c640970PCd4 = c0p7a4.LIZ.get(C13LE.LIZ(C643570PMd.class));
                        if (c640970PCd4 == null) {
                            c640970PCd4 = new C640970PCd();
                            c0p7a4.LIZ.put(C13LE.LIZ(C643570PMd.class), c640970PCd4);
                        }
                        HashMap<String, Object> map4 = c640970PCd4.LIZ;
                        if (map4 != null) {
                            map4.put(str5, c643570PMd2);
                        }
                    }
                }
            }
        }
        if (C07BF.LIZ()) {
            MODEL model = this.mModel;
            if (model != 0 && (items2 = model.getItems()) != null) {
                Iterator it2 = items2.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        next2 = it2.next();
                        Aweme aweme3 = ((C0PLT) next2).getAweme();
                        if (aweme3 != null) {
                            aid2 = aweme3.getAid();
                        } else {
                            aid2 = null;
                        }
                        if (Intrinsics.LJFF(aid2, str)) {
                            break;
                        }
                    } else {
                        next2 = null;
                        break;
                    }
                }
                C0PLT c0plt = (C0PLT) next2;
                if (c0plt != null && (aweme = c0plt.getAweme()) != null && !AwemeSaaSExtKt.isLive(aweme)) {
                    C0NMN.LIZ().getClass();
                    SearchDislikeDataBase.LIZ(aweme, str);
                }
            }
        } else {
            SearchDislikeDataBase searchDislikeDataBaseLIZ = C0NMN.LIZ();
            MODEL model2 = this.mModel;
            if (model2 != 0 && (items = model2.getItems()) != null) {
                Iterator it3 = items.iterator();
                while (true) {
                    if (it3.hasNext()) {
                        next = it3.next();
                        Aweme aweme4 = ((C0PLT) next).getAweme();
                        if (aweme4 != null) {
                            aid = aweme4.getAid();
                        } else {
                            aid = null;
                        }
                        if (Intrinsics.LJFF(aid, str)) {
                            break;
                        }
                    } else {
                        next = null;
                        break;
                    }
                }
                C0PLT c0plt2 = (C0PLT) next;
                if (c0plt2 != null) {
                    aweme2 = c0plt2.getAweme();
                }
            }
            searchDislikeDataBaseLIZ.getClass();
            SearchDislikeDataBase.LIZ(aweme2, str);
        }
        if (!this.mModel.isLoading() && this.mModel.getItems().size() <= 1 && (topActivity = ActivityStack.getTopActivity()) != null) {
            topActivity.finish();
        }
        C643600PMg c643600PMg = (C643600PMg) this.mPresenter;
        Iterator it4 = ((ArrayList) c643600PMg.LJIJJ()).iterator();
        int i = 0;
        while (true) {
            if (it4.hasNext()) {
                if (Intrinsics.LJFF(((Aweme) it4.next()).getAid(), str)) {
                    break;
                }
                i++;
            } else {
                i = -1;
                break;
            }
        }
        Integer numValueOf = Integer.valueOf(i);
        if (numValueOf.intValue() >= 0) {
            c643600PMg.Y1(numValueOf.intValue());
        }
        c643600PMg.LLIZLLLIL.add(str);
        return true;
    }

    @Override // X.InterfaceC1603420rpM
    public final void setPreLoad(boolean z) {
        ((AbstractC666280QBm) this.mPresenter).LLILZLL = true;
    }

    @Override // X.C0PMX
    public final void LIZJ(C0PN1<Aweme> c0pn1, List<? extends Aweme> list) {
        T t;
        PRESENTER presenter = this.mPresenter;
        if (presenter != 0 && (t = presenter.LL) != 0) {
            int i = c0pn1.LIZIZ;
            List<Aweme> list2 = c0pn1.LIZ;
            if (C086I.LIZIZ(list)) {
                list = new ArrayList<>();
            }
            if (i >= 0 && i <= list.size()) {
                list.addAll(i, list2);
                C0PN0 c0pn0 = new C0PN0(c0pn1, list);
                List<InterfaceC1526205yG> list3 = t.mNotifyListeners;
                if (list3 != null && list3.size() != 0) {
                    for (InterfaceC1526205yG interfaceC1526205yG : t.mNotifyListeners) {
                        if (interfaceC1526205yG instanceof InterfaceC1255940imu) {
                            InterfaceC1255940imu interfaceC1255940imu = (InterfaceC1255940imu) interfaceC1526205yG;
                            if (!interfaceC1255940imu.B1(c0pn0)) {
                                interfaceC1255940imu.w(c0pn0.LIZIZ, c0pn0.LJFF);
                            }
                        }
                    }
                }
                C644490PPr.LIZ.getClass();
                C644490PPr.LJ = true;
                return;
            }
            throw new C646010PVn(i, list.size());
        }
    }

    @Override // X.AbstractC1216410hl9, X.InterfaceC1603360rpG
    public final void request(int i, C2189821An6 c2189821An6, int i2, boolean z) {
        ISearchContextAbility iSearchContextAbilityLJJIIJZLJL;
        C0PCY<C0PRC> c0pcyPh1;
        C0PRC c0prc;
        Integer num;
        if (i == 1) {
            if (((Boolean) C304760Bx4.LIZIZ.getValue()).booleanValue() && this.LL) {
                PRESENTER presenter = this.mPresenter;
                String searchId = c2189821An6.getSearchId();
                T t = presenter.LL;
                if (t != 0) {
                    ((C0PN2) t).LLJJIII = searchId;
                }
                T t2 = this.mPresenter.LL;
                if (t2 != 0) {
                    ((C0PN2) t2).LLJILLL = "inner_flow";
                }
                boolean z2 = this.LL;
                if (t2 != 0) {
                    ((C0PN2) t2).LLJJ = z2;
                }
            }
            this.mPresenter.LIZJ(Integer.valueOf(i), c2189821An6.getSearchKeyword());
            return;
        }
        if (this.mModel.LJJIIZ().LJ() && (iSearchContextAbilityLJJIIJZLJL = this.mModel.LJJIIJZLJL()) != null && (c0pcyPh1 = iSearchContextAbilityLJJIIJZLJL.Ph1()) != null && (c0prc = (C0PRC) c0pcyPh1.LIZJ()) != null && (num = c0prc.LLJLLL) != null) {
            int iIntValue = num.intValue();
            C642860PJk.LIZ.getClass();
            Map<Integer, C642890PJn> map = C642860PJk.LIZIZ;
            Integer numValueOf = Integer.valueOf(iIntValue);
            LinkedHashMap linkedHashMap = (LinkedHashMap) map;
            Object obj = linkedHashMap.get(numValueOf);
            if (obj == null) {
                obj = new AbstractC642900PJo() { // from class: X.0PJn
                    public C0N2O LJ;

                    @Override // X.AbstractC642900PJo
                    public final void LIZIZ() {
                        super.LIZIZ();
                        if (this.LJ == C0N2O.REQUEST_START) {
                            C642910PJp c642910PJp = new C642910PJp();
                            c642910PJp.LIZ(C2097608Jq.LJIIIIZZ(new Pair("inflow_loadmore_time", Integer.valueOf(LIZ())), new Pair("is_request_error", this.LIZJ)));
                            c642910PJp.LJIILJJIL();
                            LIZJ();
                        }
                        this.LJ = C0N2O.REQUEST_END;
                    }

                    @Override // X.AbstractC642900PJo
                    public final void LIZJ() {
                        super.LIZJ();
                        this.LJ = null;
                    }

                    public final void LIZLLL() {
                        LIZJ();
                        this.LIZ = Long.valueOf(SystemClock.elapsedRealtime());
                        this.LJ = C0N2O.REQUEST_START;
                    }
                };
                linkedHashMap.put(numValueOf, obj);
            }
            ((C642890PJn) obj).LIZLLL();
        }
        if (((Boolean) C304760Bx4.LIZJ.getValue()).booleanValue() && this.LL) {
            this.mPresenter.LIZJ(Integer.valueOf(i), c2189821An6.getSearchKeyword());
        } else {
            this.mPresenter.LIZJ(Integer.valueOf(i));
        }
    }
}
