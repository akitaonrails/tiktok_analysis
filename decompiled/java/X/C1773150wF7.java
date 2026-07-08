package X;

import android.content.Context;
import android.os.SystemClock;
import android.util.DisplayMetrics;
import android.view.View;
import androidx.lifecycle.ViewModelKt;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.ss.android.ugc.aweme.ecommerce.dependency.log.LogDependencyService;
import com.ss.android.ugc.aweme.ecommerce.mixmall.container.layoutmanager.ECMMKLayoutManager;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.event.ILogDependencyService;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS605S0100000_26;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0wF7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1773150wF7 extends AbstractC1771860wD2 implements InterfaceC1771900wD6 {
    public static boolean LLIZLLLIL;
    public static boolean LLJ;
    public static long LLJI = -1;
    public int LLILLL;
    public int LLILZ;
    public int LLILZIL;
    public final CopyOnWriteArrayList<C1773860wGG> LLILZLL = new CopyOnWriteArrayList<>();
    public InterfaceC1774150wGj LLIZ;

    @Override // X.InterfaceC1771900wD6
    public final Pair<Integer, Integer> LJ() {
        return new Pair<>(Integer.valueOf(this.LLILZ), Integer.valueOf(this.LLILZIL));
    }

    @Override // X.AbstractC1771860wD2
    public final void LIZLLL() {
        LIZIZ().getEventCenter().LJFF("ecMixMallScrollTo", new InterfaceC1775150wIL() { // from class: X.0wG0
            @Override // X.InterfaceC1775150wIL
            public final void LIZ(Map map, Map map2, C21175917tt c21175917tt) {
                String str;
                int iIntValue;
                Integer num;
                C1773150wF7 c1773150wF7 = this.LIZ;
                Object obj = map.get("position");
                if (obj instanceof String) {
                    str = (String) obj;
                } else {
                    str = null;
                }
                Object obj2 = map.get("animation");
                if ((obj2 instanceof Integer) && (num = (Integer) obj2) != null) {
                    iIntValue = num.intValue();
                } else {
                    iIntValue = 0;
                }
                c1773150wF7.LJIILJJIL(iIntValue, str);
                c21175917tt.LIZ(1, "success", null);
            }
        });
        LIZIZ().getEventCenter().LJFF("ecMixMallAddScrollThresholdObserver", new InterfaceC1775150wIL() { // from class: X.0wFJ
            /* JADX WARN: Removed duplicated region for block: B:11:0x0030  */
            /* JADX WARN: Removed duplicated region for block: B:14:0x0036  */
            /* JADX WARN: Removed duplicated region for block: B:18:0x0040  */
            @Override // X.InterfaceC1775150wIL
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void LIZ(java.util.Map r9, java.util.Map r10, X.C21175917tt r11) {
                /*
                    r8 = this;
                    java.lang.String r0 = "offset_threshold"
                    java.lang.Object r1 = r9.get(r0)
                    boolean r0 = r1 instanceof java.lang.Number
                    r4 = 0
                    if (r0 == 0) goto L3d
                    java.lang.Number r1 = (java.lang.Number) r1
                    if (r1 == 0) goto L3d
                    float r0 = r1.floatValue()
                    java.lang.Float r7 = java.lang.Float.valueOf(r0)
                    if (r7 == 0) goto L3e
                    float r0 = r7.floatValue()
                    double r0 = (double) r0
                    int r0 = X.C0H9I.LIZ(r0)
                    java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
                L26:
                    java.lang.String r0 = "callback_event"
                    java.lang.Object r1 = r9.get(r0)
                    boolean r0 = r1 instanceof java.lang.String
                    if (r0 == 0) goto L33
                    r4 = r1
                    java.lang.String r4 = (java.lang.String) r4
                L33:
                    r6 = 0
                    if (r2 != 0) goto L40
                    java.lang.String r1 = "Invalid params: offset_threshold"
                    r0 = 0
                    r11.LIZ(r6, r1, r0)
                    return
                L3d:
                    r7 = r4
                L3e:
                    r2 = r4
                    goto L26
                L40:
                    r3 = 1
                    if (r4 == 0) goto La7
                    int r0 = r4.length()
                    if (r0 == 0) goto La7
                    X.0wGG r5 = new X.0wGG
                    float r1 = r7.floatValue()
                    int r0 = r2.intValue()
                    r5.<init>(r1, r0, r4)
                    X.0wF7 r0 = r8.LIZ
                    java.util.concurrent.CopyOnWriteArrayList<X.0wGG> r0 = r0.LLILZLL
                    r0.add(r5)
                    r0 = 3
                    kotlin.Pair[] r4 = new kotlin.Pair[r0]
                    X.0wF7 r0 = r8.LIZ
                    int r1 = r0.LLILLL
                    int r0 = r5.LIZIZ
                    if (r1 < r0) goto La5
                    r0 = 1
                L69:
                    java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
                    kotlin.Pair r1 = new kotlin.Pair
                    java.lang.String r0 = "reach_threshold"
                    r1.<init>(r0, r2)
                    r4[r6] = r1
                    X.0wF7 r0 = r8.LIZ
                    int r0 = r0.LLILLL
                    java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                    int r0 = X.C679280Qkg.LIZIZ(r0)
                    java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
                    kotlin.Pair r1 = new kotlin.Pair
                    java.lang.String r0 = "offset"
                    r1.<init>(r0, r2)
                    r4[r3] = r1
                    java.lang.String r2 = r5.LIZLLL
                    kotlin.Pair r1 = new kotlin.Pair
                    java.lang.String r0 = "observer_id"
                    r1.<init>(r0, r2)
                    r0 = 2
                    r4[r0] = r1
                    java.util.Map r1 = X.C2097608Jq.LJIIJ(r4)
                    java.lang.String r0 = "success"
                    r11.LIZ(r3, r0, r1)
                    return
                La5:
                    r0 = 0
                    goto L69
                La7:
                    java.lang.String r1 = "Invalid params: callback_event"
                    r0 = 0
                    r11.LIZ(r6, r1, r0)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C1773270wFJ.LIZ(java.util.Map, java.util.Map, X.17tt):void");
            }
        });
        LIZIZ().getEventCenter().LJFF("ecMixMallRemoveScrollThresholdObserver", new InterfaceC1775150wIL() { // from class: X.0wFM
            @Override // X.InterfaceC1775150wIL
            public final void LIZ(Map map, Map map2, C21175917tt c21175917tt) {
                Object obj = map.get("observer_id");
                if (obj instanceof String) {
                    String str = (String) obj;
                    int i = 0;
                    if (str != null && str.length() != 0) {
                        Iterator<C1773860wGG> it2 = this.LIZ.LLILZLL.iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                if (Intrinsics.LJFF(it2.next().LIZLLL, str)) {
                                    break;
                                } else {
                                    i++;
                                }
                            } else {
                                i = -1;
                                break;
                            }
                        }
                        if (i == -1) {
                            c21175917tt.LIZ(1, "success", null);
                            return;
                        } else {
                            c21175917tt.LIZ(1, "success", C2097908Jt.LIZJ(new Pair("offset_threshold", Float.valueOf(this.LIZ.LLILZLL.remove(i).LIZ))));
                            return;
                        }
                    }
                }
                c21175917tt.LIZ(0, "Invalid params: observer_id", null);
            }
        });
        LIZIZ().LIZLLL().LJ.getBodyList().LJ(new AwS605S0100000_26(this, 721));
        LIZIZ().LIZJ().LIZ(InterfaceC1771900wD6.class, this);
        C23250099c.LIZLLL(ViewModelKt.getViewModelScope(LIZIZ().LJIIIIZZ()), null, null, new C1772850wEd(this, null), 3);
        this.LLIZ = (InterfaceC1774150wGj) LIZIZ().LIZJ().getService(InterfaceC1774150wGj.class);
    }

    @Override // X.InterfaceC1771900wD6
    public final int LIZJ() {
        return this.LLILLL;
    }

    @Override // X.InterfaceC1771900wD6
    public final void LJIILL(C1768090w6x c1768090w6x) {
        this.LLIZ = c1768090w6x;
    }

    @Override // X.InterfaceC1771900wD6
    public final void LJIIIIZZ(C1773640wFu c1773640wFu, int i) {
        int i2;
        int i3;
        int i4 = this.LLILLL;
        C18Z6 bodyList = LIZIZ().LIZLLL().LJ.getBodyList();
        int iComputeVerticalScrollOffset = bodyList.computeVerticalScrollOffset() + c1773640wFu.computeVerticalScrollOffset();
        if (i > 0) {
            this.LLILLL = Math.max(iComputeVerticalScrollOffset, this.LLILLL);
        } else if (i < 0) {
            this.LLILLL = Math.min(iComputeVerticalScrollOffset, this.LLILLL);
        } else {
            this.LLILLL = iComputeVerticalScrollOffset;
        }
        int iComputeVerticalScrollOffset2 = bodyList.computeVerticalScrollOffset();
        this.LLILZ = iComputeVerticalScrollOffset2;
        this.LLILZIL = this.LLILLL - iComputeVerticalScrollOffset2;
        for (C1773860wGG c1773860wGG : this.LLILZLL) {
            int i5 = c1773860wGG.LIZIZ;
            if ((i4 >= i5 && this.LLILLL < i5) || (i4 < i5 && this.LLILLL >= i5)) {
                C599820Nfo c599820Nfo = C599820Nfo.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("REACH_THRESHOLD = ");
                if (this.LLILLL >= c1773860wGG.LIZIZ) {
                    i2 = 1;
                } else {
                    i2 = 0;
                }
                sbLIZ.append(i2);
                sbLIZ.append("  ");
                sbLIZ.append(c1773860wGG.LIZIZ);
                sbLIZ.append(" - ");
                sbLIZ.append(this.LLILLL);
                sbLIZ.append(" - ");
                sbLIZ.append(i4);
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                c599820Nfo.getClass();
                C599820Nfo.LIZ("ECMMKScrollLogicSlice", strLIZIZ);
                InterfaceC606320NqI eventCenter = LIZIZ().getEventCenter();
                String str = c1773860wGG.LIZJ;
                Pair[] pairArr = new Pair[3];
                if (this.LLILLL >= c1773860wGG.LIZIZ) {
                    i3 = 1;
                } else {
                    i3 = 0;
                }
                pairArr[0] = new Pair("reach_threshold", Integer.valueOf(i3));
                pairArr[1] = new Pair("offset", Integer.valueOf(C679280Qkg.LIZIZ(Integer.valueOf(this.LLILLL))));
                pairArr[2] = new Pair("offset_threshold", Float.valueOf(c1773860wGG.LIZ));
                eventCenter.LIZLLL(str, C2097608Jq.LJIIIIZZ(pairArr), null, false);
            }
        }
    }

    @Override // X.InterfaceC1771900wD6
    public final void LJIILJJIL(int i, String str) {
        AnonymousClass0317 anonymousClass0317CreateILogDependencyServicebyMonsterPlugin;
        C1772690wEN c1772690wEN;
        List<? extends AbstractC1773210wFD> list;
        int i2;
        boolean z;
        String name;
        C1772630wEH c1772630wEHC82;
        C1772690wEN c1772690wEN2;
        List<? extends AbstractC1773210wFD> list2;
        if (!Intrinsics.LJFF(str, "top") && !Intrinsics.LJFF(str, "stick")) {
            return;
        }
        if (i != 0 && i != 1) {
            return;
        }
        if (i == 0) {
            C1773020wEu.LIZ.getClass();
            Integer num = C1773020wEu.LIZIZ().enableFeedDynamicHeight;
            if (num != null && num.intValue() == 2 && (c1772630wEHC82 = LIZIZ().LJIIIZ().c82()) != null && (c1772690wEN2 = c1772630wEHC82.LIZLLL) != null && (list2 = c1772690wEN2.LIZJ) != null && list2.size() - 1 >= 0) {
                LIZIZ().LJIIIZ().bK0();
            }
        }
        Object obj = null;
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            anonymousClass0317CreateILogDependencyServicebyMonsterPlugin = LogDependencyService.createILogDependencyServicebyMonsterPlugin(false);
            if (anonymousClass0317CreateILogDependencyServicebyMonsterPlugin != null) {
                z = true;
            } else {
                z = false;
            }
            String name2 = ILogDependencyService.class.getName();
            if (anonymousClass0317CreateILogDependencyServicebyMonsterPlugin != null) {
                name = anonymousClass0317CreateILogDependencyServicebyMonsterPlugin.getClass().getName();
            } else {
                name = null;
            }
            C1AQS.LIZJ(jElapsedRealtime, 1, name2, name, z);
        } else {
            C1120604Zw.LIZ.LIZ();
            anonymousClass0317CreateILogDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(ILogDependencyService.class);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ECMMKScrollLogicSlice-scrollTo: target: ");
        sbLIZ.append(str);
        sbLIZ.append(", animation: ");
        sbLIZ.append(i);
        ((ILogDependencyService) anonymousClass0317CreateILogDependencyServicebyMonsterPlugin).crashlyticsWrapperLog(4, "ECMMKLogger", C2188811AlT.LIZIZ(sbLIZ));
        C18Z6 bodyList = LIZIZ().LIZLLL().LJ.getBodyList();
        if (Intrinsics.LJFF(str, "top")) {
            LJIILIIL(bodyList, 0, i);
        } else {
            C1772630wEH c1772630wEHC822 = LIZIZ().LJIIIZ().c82();
            if (c1772630wEHC822 != null && (c1772690wEN = c1772630wEHC822.LIZLLL) != null && (list = c1772690wEN.LIZJ) != null) {
                Iterator<? extends AbstractC1773210wFD> it2 = list.iterator();
                int i3 = 0;
                while (true) {
                    if (it2.hasNext()) {
                        if (it2.next() instanceof C1774040wGY) {
                            break;
                        } else {
                            i3++;
                        }
                    } else {
                        i3 = -1;
                        break;
                    }
                }
                Integer numValueOf = Integer.valueOf(i3);
                if (numValueOf != null && numValueOf.intValue() != -1) {
                    LJIILIIL(bodyList, numValueOf.intValue(), i);
                    LLIZLLLIL = true;
                    if (LLJI == -1) {
                        LLJI = System.currentTimeMillis();
                    }
                } else {
                    return;
                }
            } else {
                return;
            }
        }
        C18Z6 bodyList2 = LIZIZ().LIZLLL().LJ.getBodyList();
        AbstractC1772270wDh abstractC1772270wDh = LIZIZ().LIZLLL().LJ;
        Collection<WeakReference<RecyclerView>> collectionValues = bodyList2.getChildRecyclerViews().values();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it3 = collectionValues.iterator();
        while (it3.hasNext()) {
            Object obj2 = ((Reference) it3.next()).get();
            if (obj2 != null) {
                arrayList.add(obj2);
            }
        }
        Iterator it4 = arrayList.iterator();
        while (true) {
            if (!it4.hasNext()) {
                break;
            }
            Object next = it4.next();
            View view = (View) next;
            if (abstractC1772270wDh.getRight() >= view.getRight() && abstractC1772270wDh.getLeft() <= view.getLeft() && view.getWidth() != 0) {
                obj = next;
                break;
            }
        }
        Iterator<Map.Entry<String, WeakReference<RecyclerView>>> it5 = bodyList.getChildRecyclerViews().entrySet().iterator();
        while (it5.hasNext()) {
            RecyclerView recyclerView = it5.next().getValue().get();
            if (!Intrinsics.LJFF(str, "top") && Intrinsics.LJFF(recyclerView, obj)) {
                i2 = i;
            } else {
                i2 = 0;
            }
            LJIILIIL(recyclerView, 0, i2);
        }
        if (i == 0) {
            Iterator<T> it6 = LIZIZ().LIZLLL().LJ.getBodyList().getScrollListeners().iterator();
            while (it6.hasNext()) {
                ((Function1) it6.next()).invoke(0);
            }
            InterfaceC1774150wGj interfaceC1774150wGj = this.LLIZ;
            if (interfaceC1774150wGj != null) {
                interfaceC1774150wGj.LJIIZILJ();
            }
        }
    }

    public static void LJIILIIL(RecyclerView recyclerView, int i, int i2) {
        StaggeredGridLayoutManager staggeredGridLayoutManager;
        ECMMKLayoutManager eCMMKLayoutManager;
        if (recyclerView == null) {
            return;
        }
        final int i3 = 0;
        if (i2 == 1) {
            RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
            if ((layoutManager instanceof ECMMKLayoutManager) && (eCMMKLayoutManager = (ECMMKLayoutManager) layoutManager) != null) {
                final float f = eCMMKLayoutManager.LLJJL;
                final Context context = recyclerView.getContext();
                C21674119s3 c21674119s3 = new C21674119s3(context) { // from class: X.0wHj
                    @Override // X.C21674119s3
                    public final int LJIILL() {
                        return -1;
                    }

                    @Override // X.C21674119s3
                    public final float LJIIJJI(DisplayMetrics displayMetrics) {
                        return f / displayMetrics.densityDpi;
                    }

                    @Override // X.C21674119s3
                    public final int LJIIJ(int i4, View view) {
                        return super.LJIIJ(i4, view) + i3;
                    }
                };
                c21674119s3.LIZ = i;
                eCMMKLayoutManager.startSmoothScroll(c21674119s3);
                return;
            }
            return;
        }
        RecyclerView.LayoutManager layoutManager2 = recyclerView.getLayoutManager();
        if (!(layoutManager2 instanceof ECMMKLayoutManager) || (staggeredGridLayoutManager = (StaggeredGridLayoutManager) layoutManager2) == null) {
            return;
        }
        staggeredGridLayoutManager.scrollToPositionWithOffset(i, 0);
    }
}
