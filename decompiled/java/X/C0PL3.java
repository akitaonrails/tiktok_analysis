package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.reflect.TypeToken;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.model.SearchMixFeedBase;
import java.lang.ref.WeakReference;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS196S0000000_10;

/* JADX INFO: renamed from: X.0PL3, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0PL3 {
    public final WeakReference<AbstractC683590Qrd<SearchMixFeedBase>> LIZIZ;
    public final WeakReference<Function0<Boolean>> LIZJ;
    public WeakReference<InterfaceC692440REc> LJ;
    public final String LJFF;
    public Integer LJI;
    public Aweme LJIIIIZZ;
    public final C01GW LIZ = C452501pT.LIZIZ(AFwS196S0000000_10.get$arr$(697));
    public final List<Aweme> LIZLLL = new ArrayList();
    public final Set<Integer> LJII = new LinkedHashSet();
    public final Set<String> LJIIIZ = new LinkedHashSet();
    public final C0PA6 LJIIJ = new C0PA6();
    public final ReentrantLock LJIIJJI = new ReentrantLock();

    public final List<SearchMixFeedBase> LIZIZ() {
        List<SearchMixFeedBase> data;
        AbstractC683590Qrd<SearchMixFeedBase> abstractC683590Qrd = this.LIZIZ.get();
        if (abstractC683590Qrd == null || (data = abstractC683590Qrd.getData()) == null) {
            return C13BV.INSTANCE;
        }
        ArrayList arrayList = new ArrayList();
        for (SearchMixFeedBase searchMixFeedBase : data) {
            if (!searchMixFeedBase.isCustomContent()) {
                arrayList.add(searchMixFeedBase);
            }
        }
        return arrayList;
    }

    public C0PL3(C0P6L c0p6l) {
        this.LJFF = c0p6l.LIZIZ;
        this.LIZIZ = new WeakReference<>(c0p6l.LIZ);
        this.LIZJ = new WeakReference<>(c0p6l.LIZJ);
    }

    public final C643530PLz LIZ(C0PL5 c0pl5) {
        List arrayList;
        C643530PLz c643530PLz;
        InterfaceC692440REc interfaceC692440REc;
        Collection arrayList2;
        InterfaceC692440REc interfaceC692440REc2;
        ReentrantLock reentrantLock = this.LJIIJJI;
        reentrantLock.lock();
        try {
            String strLJJLIIIJ = C13LP.LJJLIIIJ(this.LJIIJ.LIZ, ",", null, null, 0, null, null, 62);
            int i = C0PL4.LIZ[c0pl5.ordinal()];
            if (i != 1) {
                if (i == 2) {
                    List<SearchMixFeedBase> listLIZIZ = LIZIZ();
                    int iLJFF = C594510NTl.LJFF(listLIZIZ);
                    if (C594510NTl.LJII()) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("getOutflowAdGap(items), result: ");
                        sbLIZ.append(iLJFF);
                        C2188811AlT.LIZIZ(sbLIZ);
                    }
                    WeakReference<InterfaceC692440REc> weakReference = this.LJ;
                    if (weakReference != null && (interfaceC692440REc2 = weakReference.get()) != null) {
                        arrayList2 = new ArrayList(interfaceC692440REc2.Fg());
                    } else {
                        arrayList2 = this.LIZLLL;
                    }
                    ArrayList arrayList3 = new ArrayList();
                    for (Object obj : (ArrayList) arrayList2) {
                        if (this.LJIIIZ.contains(((Aweme) obj).getAid())) {
                            arrayList3.add(obj);
                        }
                    }
                    c643530PLz = new C643530PLz(strLJJLIIIJ, C594510NTl.LJ(listLIZIZ, arrayList3, iLJFF, this.LJI, this.LJIIIIZZ), iLJFF);
                } else {
                    throw new C1954807lC();
                }
            } else {
                WeakReference<InterfaceC692440REc> weakReference2 = this.LJ;
                if (weakReference2 != null && (interfaceC692440REc = weakReference2.get()) != null) {
                    arrayList = new ArrayList(interfaceC692440REc.Fg());
                } else {
                    arrayList = this.LIZLLL;
                }
                int iLIZJ = C594510NTl.LIZJ(arrayList);
                List<SearchMixFeedBase> listLIZIZ2 = LIZIZ();
                ArrayList arrayList4 = new ArrayList();
                for (SearchMixFeedBase searchMixFeedBase : listLIZIZ2) {
                    if (this.LJII.contains(Integer.valueOf(searchMixFeedBase.retrieveIncrementalId()))) {
                        arrayList4.add(searchMixFeedBase);
                    }
                }
                c643530PLz = new C643530PLz(strLJJLIIIJ, C594510NTl.LIZLLL(this.LJI, arrayList4, arrayList, iLIZJ), iLIZJ);
            }
            reentrantLock.unlock();
            return c643530PLz;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            reentrantLock.unlock();
            throw th;
        }
    }

    public final void LIZJ(Aweme aweme) {
        HashMap<String, String> searchExtraParams;
        String str;
        if (aweme == null) {
            return;
        }
        this.LJIIIIZZ = aweme;
        if (!this.LJIIIZ.contains(aweme.getAid())) {
            this.LJIIIZ.add(aweme.getAid());
            if (C594510NTl.LJI(aweme)) {
                String strLIZ = C587350N1x.LIZ(aweme);
                if (strLIZ != null && strLIZ.length() != 0) {
                    C0PA6 c0pa6 = this.LJIIJ;
                    int iIndexOf = ((ArrayList) c0pa6.LIZ).indexOf(strLIZ);
                    if (iIndexOf >= 0) {
                        ListProtector.remove(c0pa6.LIZ, iIndexOf);
                    }
                    ListProtector.add(c0pa6.LIZ, 0, strLIZ);
                    c0pa6.LIZ();
                }
                AwemeRawAd awemeRawAdLJJIJLIJ = C1017070cZd.LJJIJLIJ(aweme);
                if (awemeRawAdLJJIJLIJ != null && C1017180cZo.LJIJI(awemeRawAdLJJIJLIJ) && (searchExtraParams = AwemeBizExtKt.getSearchExtraParams(aweme)) != null && (str = searchExtraParams.get("search_inflow_aweme_cid_list")) != null && str.length() != 0) {
                    C1227904rF c1227904rF = C1227904rF.LIZ;
                    try {
                        Type type = new TypeToken<List<? extends String>>() { // from class: X.04XS
                        }.getType();
                        c1227904rF.getClass();
                        List list = (List) C1227904rF.LIZJ(str, type);
                        if (list != null && !list.isEmpty()) {
                            C0PA6 c0pa62 = this.LJIIJ;
                            c0pa62.getClass();
                            for (Object obj : list) {
                                int iIndexOf2 = ((ArrayList) c0pa62.LIZ).indexOf(obj);
                                if (iIndexOf2 >= 0) {
                                    ListProtector.remove(c0pa62.LIZ, iIndexOf2);
                                }
                                ListProtector.add(c0pa62.LIZ, 0, obj);
                            }
                            c0pa62.LIZ();
                        }
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                    }
                }
            }
        }
    }

    public final void LIZLLL(Object obj, AbstractC21673619ry<?> abstractC21673619ry) {
        Function0<Boolean> function0;
        SearchMixFeedBase searchMixFeedBase;
        ReentrantLock reentrantLock = this.LJIIJJI;
        reentrantLock.lock();
        try {
            if (abstractC21673619ry != this.LIZIZ.get()) {
                reentrantLock.unlock();
                return;
            }
            WeakReference<Function0<Boolean>> weakReference = this.LIZJ;
            if (weakReference != null && (function0 = weakReference.get()) != null && function0.invoke().booleanValue()) {
                if (((Boolean) this.LIZ.getValue()).booleanValue() && !(obj instanceof SearchMixFeedBase)) {
                    "Failed requirement.".toString();
                    throw new IllegalArgumentException("Failed requirement.");
                }
                if ((obj instanceof SearchMixFeedBase) && (searchMixFeedBase = (SearchMixFeedBase) obj) != null) {
                    if (!this.LJII.contains(Integer.valueOf(searchMixFeedBase.retrieveIncrementalId()))) {
                        this.LJII.add(Integer.valueOf(searchMixFeedBase.retrieveIncrementalId()));
                        Set<String> adCidList = searchMixFeedBase.getAdCidList();
                        if (adCidList != null) {
                            C0PA6 c0pa6 = this.LJIIJ;
                            c0pa6.getClass();
                            for (String str : adCidList) {
                                int iIndexOf = ((ArrayList) c0pa6.LIZ).indexOf(str);
                                if (iIndexOf >= 0) {
                                    ListProtector.remove(c0pa6.LIZ, iIndexOf);
                                }
                                ListProtector.add(c0pa6.LIZ, 0, str);
                            }
                            c0pa6.LIZ();
                        }
                    }
                    reentrantLock.unlock();
                    return;
                }
                reentrantLock.unlock();
                return;
            }
            reentrantLock.unlock();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            reentrantLock.unlock();
            throw th;
        }
    }
}
