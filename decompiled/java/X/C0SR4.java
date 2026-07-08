package X;

import Y.AComparatorS24S0000000_5;
import Y.ARunnableS6S0301000_7;
import Y.ARunnableS8S0301000_11;
import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.experiment.LiveOptFluencyRecoExp;
import com.ss.android.ugc.aweme.feed.adapter.FullFeedVideoViewHolder;
import com.ss.android.ugc.aweme.feed.adapter.playerview.BaseFeedPlayerView;
import com.ss.android.ugc.aweme.feed.controller.PlayerController;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeBizOptExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeSaaSExtKt;
import com.ss.android.ugc.aweme.feed.model.BaseFeedPageParams;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.performanceopt.api.IPerformanceOptAppDiffService;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS243S0000000_11;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0SR4, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public abstract class C0SR4 extends AbstractC714000Rza implements InterfaceC692440REc {
    public static int LLJJL;
    public final Context LLILZIL;
    public final LayoutInflater LLILZLL;
    public final C0HTT<C737030Svd> LLIZ;
    public final Fragment LLIZLLLIL;
    public final View.OnTouchListener LLJ;
    public final BaseFeedPageParams LLJI;
    public final C0R9L LLJIJIL;
    public C0SR6 LLJILJIL;
    public InterfaceC713360RyY LLJILJILJ;
    public boolean LLJILLL;
    public boolean LLJJ;
    public long LLJJI;
    public final InterfaceC690460R6m LLJJIII;
    public final C03ID LLJJIJI;
    public final C692910RFx LLJJIJIIJIL;
    public final C01GW LLJJIJIL;
    public final C01GW LLJJJ;
    public final C01GW LLJJJIL;
    public final Map<Integer, C711420RvQ> LLJJJJ;
    public int LLJJJJJIL;
    public String LLJJJJLIIL;

    public Collection<C711420RvQ> LJJJJJ() {
        return null;
    }

    public abstract String LJJJLIIL();

    public List<Aweme> Fg() {
        return this.LLJILJIL.LJ();
    }

    @Override // X.AbstractC714000Rza
    public final String LJJIJL() {
        return this.LLJI.eventType;
    }

    public List<C711420RvQ> LJJJJIZL() {
        return (List) C711750Rvx.LIZJ.getValue();
    }

    public final List<Aweme> LJJJLZIJ() {
        return this.LLJILJIL.LJ();
    }

    public final C691540RAq LJJL() {
        return (C691540RAq) this.LLJJIJIL.getValue();
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int getCount() {
        return this.LLJILJIL.LIZJ();
    }

    public C711420RvQ LJJLI() {
        return new C711360RvK() { // from class: X.0S0F
            {
                C714300S0e c714300S0e = C711750Rvx.LIZ;
                AFwS243S0000000_11.get$arr$(723);
            }
        };
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final void notifyDataSetChanged() {
        super.notifyDataSetChanged();
    }

    public static C0SZ8 LJJLIIIIJ(View view) {
        Object tag;
        if (view != null) {
            tag = view.getTag(R.id.hu_);
        } else {
            tag = null;
        }
        return (C0SZ8) tag;
    }

    public int LJIILJJIL(String str) {
        Iterator<Aweme> it2 = Fg().iterator();
        int i = 0;
        while (it2.hasNext()) {
            if (!Intrinsics.LJFF(C0SP9.LIZIZ(it2.next()), str)) {
                i++;
            } else {
                return i;
            }
        }
        return -1;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public int LJIJJ(Object obj) {
        C0SZ8 c0sz8LJJLIIIIJ = LJJLIIIIJ((View) obj);
        int count = getCount();
        for (int i = 0; i < count; i++) {
            Aweme aweme = (Aweme) ListProtector.get(Fg(), i);
            if (c0sz8LJJLIIIIJ != null) {
                if (c0sz8LJJLIIIIJ.getAweme() == null) {
                    if (c0sz8LJJLIIIIJ.getAwemeType() == 21 && c0sz8LJJLIIIIJ.getAwemeType() == aweme.getAwemeType()) {
                        return i;
                    }
                } else if (C2093608Ic.LIZJ(aweme.getAid(), c0sz8LJJLIIIIJ.getAweme().getAid())) {
                    if (C274210Aot.LIZ && !C729510SjV.LJJIIZ(c0sz8LJJLIIIIJ.getAweme()) && (c0sz8LJJLIIIIJ.getAweme() != aweme || !c0sz8LJJLIIIIJ.getAweme().equals(aweme))) {
                        c0sz8LJJLIIIIJ.L0(i, aweme);
                    }
                    return i;
                }
            }
        }
        return -2;
    }

    @Override // X.AbstractC714000Rza
    public final Fragment LJJIJLIJ(View view) {
        Object tag;
        if (view != null) {
            tag = view.getTag(R.id.en4);
        } else {
            tag = null;
        }
        if (tag instanceof Fragment) {
            return (Fragment) tag;
        }
        C2276411E8h c2276411E8h = C2276411E8h.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("expect tag is fragment int,but no:");
        sbLIZ.append(tag);
        c2276411E8h.LIZIZ("common_feed", new RuntimeException(C2188811AlT.LIZIZ(sbLIZ)));
        return null;
    }

    @Override // X.AbstractC714000Rza
    public int LJJIL(int i) {
        Aweme item = getItem(i);
        if (item != null) {
            for (Map.Entry<Integer, C711420RvQ> entry : this.LLJJJJ.entrySet()) {
                int iIntValue = entry.getKey().intValue();
                Function1<C711340RvI, Boolean> function1 = entry.getValue().LIZIZ;
                BaseFeedPageParams baseFeedPageParams = this.LLJI;
                String str = baseFeedPageParams.eventType;
                String str2 = "";
                if (str == null) {
                    str = "";
                }
                int i2 = baseFeedPageParams.awemeFromPage;
                int i3 = baseFeedPageParams.pageType;
                String from = baseFeedPageParams.param.getFrom();
                if (from != null) {
                    str2 = from;
                }
                if (function1.invoke(new C711340RvI(item, i, str, i2, i3, str2, this.LLJI.param.getLiveCardType())).booleanValue()) {
                    return iIntValue;
                }
            }
            return 0;
        }
        return 0;
    }

    @Override // X.AbstractC714000Rza
    public final int LJJIZ(View view) {
        Object tag;
        if (view != null) {
            tag = view.getTag(R.id.hub);
        } else {
            tag = null;
        }
        if (tag instanceof Integer) {
            return ((Number) tag).intValue();
        }
        C2276411E8h c2276411E8h = C2276411E8h.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("expect tag is type int,but no:");
        sbLIZ.append(tag);
        c2276411E8h.LIZIZ("common_feed", new RuntimeException(C2188811AlT.LIZIZ(sbLIZ)));
        return 0;
    }

    @Override // X.AbstractC714000Rza
    public final int LJJJ(int i) {
        return LJJIL(i);
    }

    @Override // X.AbstractC714000Rza
    public void LJJJJI(View view) {
        C0SZ8 c0sz8;
        Object tag = null;
        if (view != null) {
            tag = view.getTag(R.id.hu_);
        }
        if ((tag instanceof C0SZ8) && (c0sz8 = (C0SZ8) tag) != null) {
            c0sz8.unBind();
        }
    }

    @InterfaceC1294060jmO
    public final void LJJJJL(int i) {
        LJJJJLL(i, null);
        super.notifyDataSetChanged();
    }

    @InterfaceC1294060jmO
    public final void LJJJJZ(Map<Integer, ? extends Aweme> map) {
        Aweme item;
        HashMap map2 = (HashMap) map;
        if (map2.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it2 = map2.keySet().iterator();
        while (it2.hasNext()) {
            int iIntValue = ((Number) it2.next()).intValue();
            Aweme item2 = getItem(iIntValue);
            Aweme aweme = (Aweme) map2.get(Integer.valueOf(iIntValue));
            if (item2 != null && aweme != null && TextUtils.equals(AwemeSaaSExtKt.getUniqueId(item2), AwemeSaaSExtKt.getUniqueId(aweme))) {
                arrayList.add(Integer.valueOf(iIntValue));
            }
        }
        Iterator it3 = C13LP.LJLLLL(new AComparatorS24S0000000_5(11), arrayList).iterator();
        while (it3.hasNext()) {
            int iIntValue2 = ((Number) it3.next()).intValue();
            LJJJJLL(iIntValue2, null);
            if (getItem(iIntValue2) != null && (item = getItem(iIntValue2)) != null && AwemeBizExtKt.getSubAweme(item) != null) {
                LJJJJLL(iIntValue2, null);
            }
        }
        super.notifyDataSetChanged();
    }

    public Aweme LJJJZ(int i) {
        return getItem(i);
    }

    public int LJJLIIIJ(Aweme aweme) {
        for (Aweme aweme2 : LJJJLZIJ()) {
            if (TextUtils.equals(aweme.getAid(), aweme2.getAid())) {
                return LJJJLZIJ().indexOf(aweme2);
            }
        }
        return -1;
    }

    public final void LJJLIIIJJIZ(int i) {
        Aweme item = getItem(i);
        if (item == null) {
            return;
        }
        if (i == this.LLJJJJJIL && Intrinsics.LJFF(item.getAid(), this.LLJJJJLIIL)) {
            return;
        }
        this.LLJJJJJIL = i;
        this.LLJJJJLIIL = item.getAid();
        User author = item.getAuthor();
        if (author == null || !author.isLive() || !C1492170ovv.LIZ()) {
            return;
        }
        if (TextUtils.equals(this.LLJI.eventType, "homepage_hot")) {
            C486660J6q.LJIIIZ(0, author.getUid(), author.roomId, C486660J6q.LJFF("homepage_hot", "video", author.getRequestId()));
        } else if (TextUtils.equals(this.LLJI.eventType, "homepage_follow")) {
            C486660J6q.LJIIIZ(0, author.getUid(), author.roomId, C486660J6q.LJFF("homepage_follow", "video", author.getRequestId()));
        } else {
            String str = this.LLJI.eventType;
            String requestId = author.getRequestId();
            String uid = author.getUid();
            long j = author.roomId;
            boolean z = C486660J6q.LIZ;
            boolean zLJI = MethodIDManager.LJI(202416);
            C486660J6q.LJIIIZ(0, uid, j, C486660J6q.LJFF(str, "head", requestId));
            if (zLJI) {
                MethodIDManager.LJ();
            }
        }
        if (LiveOptFluencyRecoExp.isEnable()) {
            C823050WQl.LIZJ().submit(new ARunnableS6S0301000_7(i, this, item, author, 2));
        } else {
            LJJLIIIJL(i, item, author);
        }
    }

    @InterfaceC1294060jmO
    public void LJJLIIIJLJLI(List<? extends Aweme> list) {
        setData(list);
    }

    @InterfaceC1294060jmO
    public final boolean LJJLIIIJLLLLLLLZ(String str) {
        List<Aweme> listLJJJLZIJ = LJJJLZIJ();
        int size = listLJJJLZIJ.size() - 1;
        boolean z = false;
        if (size >= 0) {
            while (true) {
                int i = size - 1;
                if (TextUtils.equals(str, AwemeExtKt.getAuthorUid((Aweme) ListProtector.get(listLJJJLZIJ, size)))) {
                    LJJJJLL(size, null);
                    z = true;
                }
                if (i < 0) {
                    break;
                }
                size = i;
            }
            if (z) {
                super.notifyDataSetChanged();
            }
        }
        return z;
    }

    public Aweme getItem(int i) {
        return this.LLJILJIL.LIZLLL(i);
    }

    public void setData(List<? extends Aweme> list) {
        boolean zLJI = MethodIDManager.LJI(202348);
        this.LLJILJIL.LJI(list);
        LJJL().LIZJ(list);
        Iterator it2 = ((Collection) this.LLJJJ.getValue()).iterator();
        while (it2.hasNext()) {
            ((C0SR9) it2.next()).LIZJ(list);
        }
        super.notifyDataSetChanged();
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    @Override // X.AbstractC714000Rza
    public final boolean LJJJIL(int i, View view) {
        Object tag;
        C0SZ8 c0sz8;
        String str;
        Aweme aweme;
        if (!Intrinsics.LJFF(this.LLJI.eventType, "homepage_hot")) {
            return false;
        }
        String aid = null;
        if (view != null) {
            tag = view.getTag(R.id.hu_);
        } else {
            tag = null;
        }
        if (tag instanceof C0SZ8) {
            c0sz8 = (C0SZ8) tag;
        } else {
            c0sz8 = null;
        }
        C710970Ruh c710970Ruh = C710970Ruh.LJ;
        if (c0sz8 != null && (aweme = c0sz8.getAweme()) != null) {
            aid = aweme.getAid();
        }
        c710970Ruh.getClass();
        if (C710970Ruh.LJII && aid != null && (str = C710970Ruh.LJI) != null && Intrinsics.LJFF(aid, str)) {
            C710970Ruh.LJII = true;
            return true;
        }
        if (!((Boolean) C259180ADs.LIZ.getValue()).booleanValue()) {
            return false;
        }
        return ((Map) C123000dQ.LIZJ.getValue()).containsKey(Integer.valueOf(i));
    }

    @Override // X.AbstractC714000Rza
    public void LJJJJ(int i, View view) {
        if (i == 2) {
            C0SZ8 c0sz8LJJLIIIIJ = LJJLIIIIJ(view);
            if (c0sz8LJJLIIIIJ != null) {
                c0sz8LJJLIIIIJ.e1();
                return;
            }
            return;
        }
        if (view instanceof C0SZ8) {
            LJJLIIIIJ(view).e1();
        }
    }

    @InterfaceC1294060jmO
    public final void LJJJJLI(int i, Aweme aweme) {
        LJJJJLL(i, aweme);
        if (aweme != null && AwemeBizExtKt.getSubAweme(aweme) != null) {
            LJJJJLL(i, aweme);
        }
        super.notifyDataSetChanged();
    }

    @InterfaceC1294060jmO
    public void LJJJJLL(int i, Aweme aweme) {
        Aweme awemeLIZIZ;
        if (i < 0 || i >= getCount() || (awemeLIZIZ = this.LLJILJIL.LIZIZ(i)) == null) {
            return;
        }
        LJJL().LIZ(awemeLIZIZ);
        Iterator it2 = ((Collection) this.LLJJJ.getValue()).iterator();
        while (it2.hasNext()) {
            ((C0SR9) it2.next()).LIZ(awemeLIZIZ);
        }
    }

    @InterfaceC1294060jmO
    public void LJJLIIIJJI(int i, Aweme aweme) {
        if (aweme != null && i >= 0 && i <= getCount()) {
            this.LLJILJIL.LJFF(i, aweme);
            super.notifyDataSetChanged();
            return;
        }
        throw new IllegalArgumentException("position out of range");
    }

    @InterfaceC1294060jmO
    public void LJJLIIJ(int i, Aweme aweme) {
        if (aweme != null && i >= 0 && i <= getCount()) {
            if (TextUtils.equals(aweme.getAid(), ((Aweme) ListProtector.get(LJJJLZIJ(), i)).getAid())) {
                return;
            }
            this.LLJILJIL.LJII(i, aweme);
            super.notifyDataSetChanged();
        }
    }

    @InterfaceC1294060jmO
    public final void LJJLJ(int i, Aweme aweme) {
        if (aweme != null && i >= 0 && i <= getCount()) {
            if (TextUtils.equals(aweme.getAid(), ((Aweme) ListProtector.get(LJJJLZIJ(), i)).getAid())) {
                return;
            }
            LJJJJLL(i, null);
            LJJLIIIJJI(i, aweme);
        }
    }

    public void LJJLJLI(List<? extends Aweme> list, boolean z) {
        boolean zLJI = MethodIDManager.LJI(202348);
        if (z) {
            LJJL().LJFF();
            Iterator it2 = ((Collection) this.LLJJJ.getValue()).iterator();
            while (it2.hasNext()) {
                ((C0SR9) it2.next()).LJFF();
            }
        }
        setData(list);
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [T, android.view.View] */
    @Override // X.AbstractC714000Rza
    public View LJJJI(final int i, View view, ViewGroup viewGroup) {
        int width;
        int height;
        BaseFeedPlayerView baseFeedPlayerViewE;
        final C259800zU c259800zU = new C259800zU();
        c259800zU.element = view;
        int iLJJIL = LJJIL(i);
        Aweme awemeLJJJZ = LJJJZ(i);
        if (awemeLJJJZ != null && awemeLJJJZ.getVideo() != null && awemeLJJJZ.getVideo().getWidth() > 0 && awemeLJJJZ.getVideo().getHeight() > 0) {
            width = awemeLJJJZ.getVideo().getWidth();
            height = awemeLJJJZ.getVideo().getHeight();
        } else {
            width = 0;
            height = 0;
        }
        Object objPluggableSpi$default = PluggableExtentionKt.pluggableSpi$default(ILiveOuterService.class, false, false, false, 14, null);
        if (objPluggableSpi$default != null) {
            ((ILiveOuterService) objPluggableSpi$default).q4().p5().LIZJ(i, awemeLJJJZ);
            View view2 = (View) c259800zU.element;
            if (view2 == null || !Objects.equals(view2.getTag(R.id.hub), Integer.valueOf(iLJJIL))) {
                c259800zU.element = LJJJJJL(iLJJIL, viewGroup, width, height, Integer.valueOf(i));
            }
            final C0SZ8 c0sz8LJJLIIIIJ = LJJLIIIIJ((View) c259800zU.element);
            if (C722660SWi.LIZIZ()) {
                c0sz8LJJLIIIIJ.h0(LJJJZ(i));
                c0sz8LJJLIIIIJ.LLLIIII();
            }
            if (C285700BHs.LIZ && C0X35.LJIIL("optimize_commit_judge_opt_3910") && ((!((Boolean) C285090BFj.LJIIZILJ.getValue()).booleanValue() || ((baseFeedPlayerViewE = c0sz8LJJLIIIIJ.E()) != null && !baseFeedPlayerViewE.Mg())) && ((C1150504el.LIZ().LJII || C1831707Fj.LIZIZ()) && C1150504el.LIZ().LJIIJJI == 0))) {
                InterfaceC1603190roz.LJJIJIIJI.getClass();
                if (!C0SPD.LIZ()) {
                    IPerformanceOptAppDiffService iPerformanceOptAppDiffService = (IPerformanceOptAppDiffService) PluggableExtentionKt.pluggableSpi$default(IPerformanceOptAppDiffService.class, false, false, false, 14, null);
                    if (iPerformanceOptAppDiffService != null) {
                        iPerformanceOptAppDiffService.LIZ();
                    }
                } else if ((c0sz8LJJLIIIIJ instanceof FullFeedVideoViewHolder) && (!((Boolean) C285090BFj.LJIILLIIL.getValue()).booleanValue() || (awemeLJJJZ != null && AwemeBizOptExtKt.getAwemeCacheType(awemeLJJJZ) == 1))) {
                    C089T.LIZJ = true;
                }
            }
            if (((Boolean) C285090BFj.LJIJ.getValue()).booleanValue() && C0X35.LJIIL("optimize_downgrade_get_view_3740") && C089T.LIZJ && (C089T.LIZ() || C1831707Fj.LIZIZ())) {
                if (C590900NFo.LIZ) {
                    C089T.LIZIZ = true;
                }
                PlayerController.LLJI(new InterfaceC582410Msp() { // from class: X.0Rwt
                    @Override // X.InterfaceC582410Msp
                    public final void LJII() {
                        this.LIZ.LJJJJZI(c259800zU.element, c0sz8LJJLIIIIJ, i);
                    }
                });
                PlayerController.LLLLZ();
            } else if (C1514060pVE.LIZIZ()) {
                C722660SWi.LIZJ(new Runnable() { // from class: X.0Rx1
                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean zLIZ;
                        C1C7U.LIZ("AbstractFeedAdapter@eb3.getView$2");
                        try {
                            C0CN8.LIZ(new ARunnableS8S0301000_11(this.LL, c259800zU, c0sz8LJJLIIIIJ, i, 0));
                        } finally {
                            if (!zLIZ) {
                            }
                        }
                        C1C7U.LIZIZ("AbstractFeedAdapter@eb3.getView$2");
                    }
                });
            } else {
                C722660SWi.LIZJ(new ARunnableS8S0301000_11(this, c259800zU, c0sz8LJJLIIIIJ, i, 1));
            }
            return (View) c259800zU.element;
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    public final void LJJJJZI(View view, C0SZ8 c0sz8, int i) {
        C0X35.LIZ("tryplay_adapter_getview", true);
        if (view != null) {
            int i2 = LLJJL;
            LLJJL = i2 + 1;
            view.setTag(R.id.hua, Integer.valueOf(i2));
        }
        System.currentTimeMillis();
        c0sz8.LJJJJ(i, LJJJZ(i));
        c0sz8.LLJJIJIIJIL(LJJJLIIL());
        System.currentTimeMillis();
        try {
            getItem(i);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        C0X35.LJIIJJI("tryplay_adapter_getview", true);
    }

    @InterfaceC1294060jmO
    public void LJJLIIIJILLIZJL(int i, int i2, List list) {
        if (list != null && !list.isEmpty() && i >= 0 && i < list.size() && i <= getCount()) {
            List<Aweme> listLJJJLZIJ = LJJJLZIJ();
            for (int i3 = 0; i3 < i2; i3++) {
                Object obj = ListProtector.get(list, i + i3);
                if (obj != null) {
                    ListProtector.add(listLJJJLZIJ, i, obj);
                }
            }
            C0SR6 c0sr6 = this.LLJILJIL;
            HashSet hashSet = new HashSet();
            ArrayList arrayList = new ArrayList();
            for (Aweme aweme : listLJJJLZIJ) {
                if (hashSet.add(aweme.getAid())) {
                    arrayList.add(aweme);
                }
            }
            c0sr6.LJI(arrayList);
            super.notifyDataSetChanged();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0210 A[PHI: r11
      0x0210: PHI (r11v3 com.bytedance.android.livesdkapi.depend.model.live.SlimRoom$LinkMic) = 
      (r11v1 com.bytedance.android.livesdkapi.depend.model.live.SlimRoom$LinkMic)
      (r11v2 com.bytedance.android.livesdkapi.depend.model.live.SlimRoom$LinkMic)
      (r11v5 com.bytedance.android.livesdkapi.depend.model.live.SlimRoom$LinkMic)
      (r11v5 com.bytedance.android.livesdkapi.depend.model.live.SlimRoom$LinkMic)
     binds: [B:115:0x020d, B:38:0x0087, B:40:0x008b, B:42:0x0091] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0073 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006c A[PHI: r16
      0x006c: PHI (r16v1 java.lang.String) = (r16v0 java.lang.String), (r16v2 java.lang.String) binds: [B:20:0x0047, B:25:0x0067] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0089 A[PHI: r11
      0x0089: PHI (r11v5 com.bytedance.android.livesdkapi.depend.model.live.SlimRoom$LinkMic) = 
      (r11v1 com.bytedance.android.livesdkapi.depend.model.live.SlimRoom$LinkMic)
      (r11v2 com.bytedance.android.livesdkapi.depend.model.live.SlimRoom$LinkMic)
     binds: [B:26:0x0069, B:38:0x0087] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01d9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJLIIIJL(int r18, com.ss.android.ugc.aweme.feed.model.Aweme r19, com.ss.android.ugc.aweme.profile.model.User r20) {
        /*
            Method dump skipped, instruction units count: 531
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0SR4.LJJLIIIJL(int, com.ss.android.ugc.aweme.feed.model.Aweme, com.ss.android.ugc.aweme.profile.model.User):void");
    }

    public final View LJJJJJL(int i, ViewGroup viewGroup, int i2, int i3, Integer num) {
        boolean z;
        C0R53.LIZ.getClass();
        if (C0R53.LIZIZ) {
            int i4 = C0R53.LIZJ;
            if (i4 == 0) {
                C0X35.LIZ("feed_ui_duration_first_videoviewcell_init", false);
            } else if (i4 == 1) {
                C1150504el.LIZ().LIZLLL("feed_ui_duration_second_videoviewcell_init", false);
            }
        }
        C711420RvQ c711420RvQLJJLI = this.LLJJJJ.get(Integer.valueOf(i));
        if (c711420RvQLJJLI == null) {
            c711420RvQLJJLI = LJJLI();
        }
        View viewInvoke = c711420RvQLJJLI.LIZJ.invoke(new C711590Rvh(viewGroup, this.LLILZIL, this.LLILZLL, this.LLJI, this.LLIZLLLIL));
        viewInvoke.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
        viewInvoke.setTag(R.id.hub, Integer.valueOf(i));
        BaseFeedPageParams baseFeedPageParams = this.LLJI;
        baseFeedPageParams.videoWidth = i2;
        baseFeedPageParams.videoHeight = i3;
        C0SZ8 c0sz8Invoke = c711420RvQLJJLI.LIZLLL.invoke(new C0RF0(viewInvoke, this.LLIZ, this.LLIZLLLIL, this.LLJ, baseFeedPageParams, this.LLJIJIL, this.LLJJIJIIJIL, this.LLJJIJI, this.LLJJIII, baseFeedPageParams.eventType, baseFeedPageParams.pageType, this.LLJJI, this.LLJILJILJ, baseFeedPageParams.challengeId, i, LJJL(), (Map) this.LLJJJIL.getValue(), num));
        viewInvoke.setTag(R.id.hu_, c0sz8Invoke);
        if (!C0R53.LIZIZ) {
            z = false;
        } else {
            int i5 = C0R53.LIZJ;
            if (i5 == 0) {
                z = false;
                C0X35.LJIIJJI("feed_ui_duration_first_videoviewcell_init", false);
            } else {
                z = false;
                if (i5 == 1) {
                    C1150504el.LIZ().LJI("feed_ui_duration_second_videoviewcell_init", false);
                }
            }
        }
        if (C0R53.LIZIZ) {
            int i6 = C0R53.LIZJ;
            if (i6 == 0) {
                C0X35.LIZ("feed_ui_duration_first_videoviewcell_oncreate", z);
            } else if (i6 == 1) {
                C1150504el.LIZ().LIZLLL("feed_ui_duration_second_videoviewcell_oncreate", z);
            }
        }
        try {
            c0sz8Invoke.LLZZJLIL(viewInvoke);
            if (C0R53.LIZIZ) {
                int i7 = C0R53.LIZJ;
                if (i7 == 0) {
                    C0X35.LJIIJJI("feed_ui_duration_first_videoviewcell_oncreate", z);
                } else if (i7 == 1) {
                    C1150504el.LIZ().LJI("feed_ui_duration_second_videoviewcell_oncreate", z);
                    return viewInvoke;
                }
            }
            return viewInvoke;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            String strLIZLLL = C13LE.LIZ(c711420RvQLJJLI.getClass()).LIZLLL();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("hold is null in AbstractFeedAdapter, typeConfigName = ");
            sbLIZ.append(strLIZLLL);
            sbLIZ.append(", type = ");
            sbLIZ.append(i);
            throw new RuntimeException(C2188811AlT.LIZIZ(sbLIZ), th);
        }
    }

    public C0SR4(Context context, LayoutInflater layoutInflater, C0HTT<C737030Svd> c0htt, Fragment fragment, View.OnTouchListener onTouchListener, final BaseFeedPageParams baseFeedPageParams, C0R9L c0r9l) {
        InterfaceC690460R6m interfaceC690460R6m;
        super(context, 88);
        this.LLILZIL = context;
        this.LLILZLL = layoutInflater;
        this.LLIZ = c0htt;
        this.LLIZLLLIL = fragment;
        this.LLJ = onTouchListener;
        this.LLJI = baseFeedPageParams;
        this.LLJIJIL = c0r9l;
        this.LLJILJIL = new C0SR6();
        this.LLJJ = true;
        C0RDS c0rds = C0RDR.LJJIFFI;
        Context context2 = this.LLILLL;
        c0rds.getClass();
        final int iHashCode = context2.hashCode();
        if (baseFeedPageParams != null && !baseFeedPageParams.param.isFromDuetMode() && !baseFeedPageParams.param.isFromEffectDiscover()) {
            interfaceC690460R6m = new InterfaceC690460R6m() { // from class: X.0R62
                @Override // X.InterfaceC690460R6m
                public final void LIZ(float f, float f2) {
                    if (baseFeedPageParams.isPlayListCleanMode()) {
                        return;
                    }
                    String str = baseFeedPageParams.eventType;
                    if (str == null) {
                        str = "";
                    }
                    if (C305580ByO.LIZ(str)) {
                        C1440005kM.LIZ(new C1372310lob(f, baseFeedPageParams.awemeFromPage, f2, iHashCode));
                    }
                }
            };
        } else {
            interfaceC690460R6m = new InterfaceC690460R6m() { // from class: X.0SRB
                @Override // X.InterfaceC690460R6m
                public final void LIZ(float f, float f2) {
                }
            };
        }
        this.LLJJIII = interfaceC690460R6m;
        this.LLJJIJI = new C03ID();
        C692910RFx c692910RFx = new C692910RFx();
        C692910RFx.LJI(this.LLILLL);
        this.LLJJIJIIJIL = c692910RFx;
        this.LLJJIJIL = C452501pT.LIZIZ(new C691590RAv(this));
        this.LLJJJ = C452501pT.LIZIZ(new C706800Rny(this));
        this.LLJJJIL = C452501pT.LIZIZ(new C706790Rnx(this));
        List<C711420RvQ> listLJJJJIZL = LJJJJIZL();
        Collection<C711420RvQ> collectionLJJJJJ = LJJJJJ();
        if (collectionLJJJJJ != null) {
            listLJJJJIZL.addAll(collectionLJJJJJ);
        }
        ArrayList<C711420RvQ> arrayList = new ArrayList(C13LP.LJLLLL(new Comparator() { // from class: X.0Rvc
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return C20085613iQ.LIZIZ(Integer.valueOf(((C711420RvQ) t).LIZ), Integer.valueOf(((C711420RvQ) t2).LIZ));
            }
        }, listLJJJJIZL));
        arrayList.add(LJJLI());
        ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
        for (C711420RvQ c711420RvQ : arrayList) {
            arrayList2.add(new Pair(Integer.valueOf(c711420RvQ.LIZ), c711420RvQ));
        }
        this.LLJJJJ = C2097608Jq.LJIILLIIL(arrayList2);
        this.LLJJJJJIL = -1;
        this.LLJJJJLIIL = "";
    }
}
