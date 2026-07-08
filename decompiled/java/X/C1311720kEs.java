package X;

import Y.AComparatorS39S0000000_20;
import Y.ARunnableS120S0100000_20;
import android.os.Build;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.lynx.base.log.LynxLog;
import com.lynx.react.bridge.JavaOnlyArray;
import com.lynx.react.bridge.JavaOnlyMap;
import com.lynx.tasm.LynxEnv;
import com.lynx.tasm.NativeFacade;
import com.lynx.tasm.base.TraceController;
import com.lynx.tasm.base.TraceEvent;
import com.lynx.tasm.behavior.ui.LynxBaseUI;
import com.lynx.tasm.behavior.ui.LynxFlattenUI;
import com.lynx.tasm.behavior.ui.LynxUI;
import com.lynx.tasm.behavior.ui.UIBody;
import com.lynx.tasm.behavior.ui.UIGroup;
import com.lynx.tasm.behavior.ui.UIShadowProxy;
import com.lynx.tasm.behavior.ui.swiper.XSwiperUI;
import com.lynx.tasm.behavior.ui.view.UIComponent;
import com.lynx.tasm.eventreport.LynxEventReporter;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import j27.s;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.FutureTask;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.0kEs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1311720kEs {
    public static final AComparatorS39S0000000_20 LJIJJLI = new AComparatorS39S0000000_20(13);
    public int LIZ;
    public final UIBody LIZIZ;
    public s LIZJ;
    public final Set<String> LIZLLL;
    public final HashSet<LynxBaseUI> LJ;
    public final List<InterfaceC1310460kCq> LJFF;
    public final HashMap<Integer, LynxBaseUI> LJI;
    public final HashSet<LynxBaseUI> LJII;
    public final HashMap<String, Integer> LJIIIIZZ;
    public final C1289430jev LJIIIZ;
    public boolean LJIIJ;
    public boolean LJIIJJI;
    public boolean LJIIL;
    public WeakReference<NativeFacade> LJIILIIL;
    public C1311400kEM LJIILJJIL;
    public final boolean LJIILL;
    public final ConcurrentLinkedQueue<FutureTask<Runnable>> LJIILLIIL = new ConcurrentLinkedQueue<>();
    public final HashMap<String, Boolean> LJIIZILJ;
    public InterfaceC1310500kCu LJIJ;
    public boolean LJIJI;
    public final C1316700kMu LJIJJ;

    public final void LJIIIZ() {
        if (this.LJII.isEmpty()) {
            return;
        }
        HashSet hashSet = new HashSet(this.LJII);
        this.LJII.clear();
        Iterator it2 = hashSet.iterator();
        while (it2.hasNext()) {
            ((LynxBaseUI) it2.next()).uiOwnerDidPerformLayout();
        }
        LJIIIZ();
    }

    public final void LJJII() {
        List<InterfaceC1311800kF0> list = this.LIZJ.LLJJJJJIL;
        if (list != null) {
            Iterator it2 = ((ArrayList) list).iterator();
            while (it2.hasNext()) {
                ((InterfaceC1311800kF0) it2.next()).onPatchFinish();
            }
        }
        C1310660kDA c1310660kDA = this.LIZIZ.LL;
        if (c1310660kDA == null || !c1310660kDA.mHasPendingRequestLayout) {
            return;
        }
        LynxLog.i("LynxUIOwner", "onTasmFinish do force RequestLayout after UpdateData in PreLoad Mode!");
        this.LIZIZ.LL.requestLayout();
    }

    public final void LJJIII() {
        this.LIZIZ.layoutChildren();
        C1298720jtu c1298720jtu = this.LIZIZ.mContext.LLIZ;
        if (c1298720jtu != null) {
            c1298720jtu.LJI();
        }
        LJIIIZ();
    }

    public static boolean LJIJ(C1311730kEt c1311730kEt) {
        if (!c1311730kEt.LJIIIIZZ("box-shadow") && !c1311730kEt.LJIIIIZZ("outline-color") && !c1311730kEt.LJIIIIZZ("outline-style") && !c1311730kEt.LJIIIIZZ("outline-width")) {
            return false;
        }
        return true;
    }

    public static void LJIJJLI(LynxBaseUI lynxBaseUI) {
        int i = 0;
        for (LynxBaseUI lynxBaseUI2 : lynxBaseUI.getChildren()) {
            int i2 = i + 1;
            LJIL(lynxBaseUI, lynxBaseUI2, i);
            if (lynxBaseUI2.isFlatten()) {
                LJIJJLI(lynxBaseUI2);
            }
            i = i2;
        }
    }

    public static void LJJIFFI(LynxBaseUI lynxBaseUI) {
        LynxBaseUI lynxBaseUI2;
        boolean z = lynxBaseUI instanceof UIShadowProxy;
        if (z) {
            lynxBaseUI2 = ((UIShadowProxy) lynxBaseUI).LL;
        } else {
            lynxBaseUI2 = lynxBaseUI;
        }
        lynxBaseUI2.onNodeRemoved();
        if (!z) {
            Iterator<LynxBaseUI> it2 = lynxBaseUI.getChildren().iterator();
            while (it2.hasNext()) {
                LJJIFFI(it2.next());
            }
        }
    }

    public static void LJJIIJZLJL(LynxBaseUI lynxBaseUI) {
        UIGroup uIGroup = (UIGroup) lynxBaseUI.getDrawParent();
        LynxBaseUI parentBaseUI = lynxBaseUI.getParentBaseUI();
        if (uIGroup != null && parentBaseUI != null) {
            if (!lynxBaseUI.isFlatten()) {
                LynxBaseUI lynxBaseUI2 = lynxBaseUI.mPreviousDrawUI;
                LynxBaseUI lynxBaseUI3 = lynxBaseUI.mNextDrawUI;
                if (lynxBaseUI2 != null) {
                    lynxBaseUI2.mNextDrawUI = lynxBaseUI3;
                    if (lynxBaseUI3 != null) {
                        lynxBaseUI3.mPreviousDrawUI = lynxBaseUI2;
                    }
                } else {
                    uIGroup.mDrawHead = lynxBaseUI3;
                    if (lynxBaseUI3 != null) {
                        lynxBaseUI3.mPreviousDrawUI = null;
                    }
                }
                if (parentBaseUI.isFlatten()) {
                    uIGroup.removeView(lynxBaseUI);
                }
                lynxBaseUI.mNextDrawUI = null;
                lynxBaseUI.mPreviousDrawUI = null;
                lynxBaseUI.mDrawParent = null;
                return;
            }
            LynxBaseUI childAt = lynxBaseUI;
            while (childAt.isFlatten() && !childAt.getChildren().isEmpty()) {
                childAt = childAt.getChildAt(childAt.getChildren().size() - 1);
            }
            LynxBaseUI lynxBaseUI4 = lynxBaseUI.mPreviousDrawUI;
            if (lynxBaseUI4 != null) {
                lynxBaseUI4.mNextDrawUI = childAt.mNextDrawUI;
                LynxBaseUI lynxBaseUI5 = childAt.mNextDrawUI;
                if (lynxBaseUI5 != null) {
                    lynxBaseUI5.mPreviousDrawUI = lynxBaseUI4;
                }
            } else {
                LynxBaseUI lynxBaseUI6 = childAt.mNextDrawUI;
                uIGroup.mDrawHead = lynxBaseUI6;
                if (lynxBaseUI6 != null) {
                    lynxBaseUI6.mPreviousDrawUI = null;
                }
            }
            lynxBaseUI.mPreviousDrawUI = null;
            for (LynxBaseUI lynxBaseUI7 = lynxBaseUI.mNextDrawUI; lynxBaseUI7 != childAt.mNextDrawUI; lynxBaseUI7 = lynxBaseUI7.mNextDrawUI) {
                lynxBaseUI7.mPreviousDrawUI.mNextDrawUI = null;
                lynxBaseUI7.mPreviousDrawUI = null;
                uIGroup.removeView(lynxBaseUI7);
                lynxBaseUI7.mDrawParent = null;
            }
            childAt.mNextDrawUI = null;
            lynxBaseUI.mDrawParent = null;
            parentBaseUI.invalidate();
        }
    }

    public final void LIZIZ(final C1310660kDA c1310660kDA) {
        final UIBody uIBody = this.LIZIZ;
        final s sVar = this.LIZJ;
        synchronized (uIBody) {
            C092S<Void> c092s = new C092S<>(new Callable<Void>() { // from class: X.0kDD
                /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
                @Override // java.util.concurrent.Callable
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Void call() {
                    /*
                        r4 = this;
                        java.lang.String r3 = "UIBody@5f9f.attachUIBodyView$1"
                        X.C1C7U.LIZ(r3)
                        com.lynx.tasm.behavior.ui.UIBody r2 = r1
                        j27.s r0 = r2.mContext
                        boolean r0 = r0.LLLIILIL
                        if (r0 == 0) goto L18
                        X.0kDA r1 = r2.LL
                        X.0kDA r0 = r2
                        if (r1 == r0) goto L34
                        if (r1 == 0) goto L18
                        r2.LJJIIZI()
                    L18:
                        com.lynx.tasm.behavior.ui.UIBody r1 = r1
                        X.0kDA r0 = r2
                        r1.LL = r0
                        r1.initialize()
                        com.lynx.tasm.behavior.ui.UIBody r2 = r1
                        j27.s r0 = r2.mContext
                        boolean r0 = r0.LLLIILIL
                        if (r0 == 0) goto L34
                        X.0kDA r1 = r2.LL
                        if (r1 != 0) goto L39
                        java.lang.String r1 = "UIBody"
                        java.lang.String r0 = "attachUIBodyView failed since mBodyView is null."
                        com.lynx.base.log.LynxLog.e(r1, r0)
                    L34:
                        X.C1C7U.LIZIZ(r3)
                        r0 = 0
                        return r0
                    L39:
                        j27.s r0 = r3
                        r2.mContext = r0
                        r1.mLynxContext = r0
                        j27.s r1 = r2.mContext
                        X.0kDA r0 = r2.LL
                        r1.LJJIIJ(r0)
                        java.lang.String r2 = "UIBody.attachUIBodyView"
                        com.lynx.tasm.base.TraceEvent.LIZIZ(r2)
                        com.lynx.tasm.behavior.ui.UIBody r0 = r1
                        j27.s r1 = r0.mContext
                        X.0kDA r0 = r0.LL
                        r1.LJJIIJ(r0)
                        com.lynx.tasm.behavior.ui.UIBody r1 = r1
                        java.util.ArrayList r0 = new java.util.ArrayList
                        r0.<init>()
                        r1.LLILZ = r0
                        com.lynx.tasm.behavior.ui.UIBody r1 = r1
                        j27.s r0 = r3
                        r1.attachToView(r0)
                        com.lynx.tasm.behavior.ui.UIBody r0 = r1
                        X.0kDA r0 = r0.LL
                        r0.markNeedRemoveExistingViews()
                        com.lynx.tasm.base.TraceEvent.LJII(r2)
                        goto L34
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.CallableC1310690kDD.call():java.lang.Object");
                }
            }, uIBody.LLIZLLLIL);
            uIBody.LLIZ = c092s;
            if (uIBody.LLILZLL == null) {
                c092s.run();
            }
        }
        if (this.LJIIL) {
            while (!this.LJIILLIIL.isEmpty()) {
                FutureTask<Runnable> futureTaskPoll = this.LJIILLIIL.poll();
                if (futureTaskPoll != null) {
                    LynxEnv.runJavaTaskOnConcurrentLoop(new ARunnableS120S0100000_20(futureTaskPoll, 218), 0);
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00a4, code lost:
    
        if (r2 == null) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.lynx.tasm.behavior.ui.LynxBaseUI LJI(X.C1311740kEu r6) {
        /*
            r5 = this;
            int r0 = r5.LIZ
            if (r0 >= 0) goto L9c
            java.lang.String r1 = r6.LIZLLL
            java.lang.String r0 = "page"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L9c
            com.lynx.tasm.behavior.ui.UIBody r2 = r5.LIZIZ
            int r0 = r6.LIZ
            r5.LIZ = r0
            if (r2 == 0) goto La6
            X.0kCu r4 = r5.LJIJ
            if (r4 == 0) goto L86
            java.lang.ref.WeakReference r1 = new java.lang.ref.WeakReference
            r1.<init>(r2)
            X.0kCK r4 = (X.C1310140kCK) r4
            java.lang.Object r0 = r1.get()
            boolean r0 = r0 instanceof com.lynx.tasm.behavior.ui.UIBody
            if (r0 == 0) goto L86
            java.lang.Object r3 = r1.get()
            com.lynx.tasm.behavior.ui.LynxUI r3 = (com.lynx.tasm.behavior.ui.LynxUI) r3
            j27.s r0 = r3.mContext
            if (r0 == 0) goto L86
            r0.LIZIZ()
            java.lang.ref.WeakReference<com.lynx.tasm.behavior.ui.LynxBaseUI> r0 = r4.LIZ
            java.lang.Object r4 = r0.get()
            com.lynx.tasm.behavior.ui.LynxBaseUI r4 = (com.lynx.tasm.behavior.ui.LynxBaseUI) r4
            if (r4 == 0) goto L86
            java.util.HashMap r0 = r4.getChildrenLynxPageUI()
            if (r0 != 0) goto L4e
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r4.setChildrenLynxPageUI(r0)
        L4e:
            java.util.HashMap r1 = r4.getChildrenLynxPageUI()
            int r0 = java.lang.System.identityHashCode(r4)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r1.put(r0, r3)
            j27.s r0 = r4.mContext
            if (r0 == 0) goto L7c
            X.0kEs r0 = r0.LJIILIIL()
            if (r0 == 0) goto L7c
            j27.s r0 = r4.mContext
            X.0kEs r0 = r0.LJIILIIL()
            com.lynx.tasm.behavior.ui.UIBody r0 = r0.LIZIZ
            if (r0 == 0) goto L7c
            j27.s r0 = r4.mContext
            X.0kEs r0 = r0.LJIILIIL()
            com.lynx.tasm.behavior.ui.UIBody r0 = r0.LIZIZ
            r3.setParentLynxPageUI(r0)
        L7c:
            T extends android.view.View r1 = r3.mView
            if (r1 == 0) goto L86
            X.0kDA r1 = (X.C1310660kDA) r1
            r0 = 1
            r1.setIsChildLynxPageUI(r0)
        L86:
            java.util.Map<java.lang.String, X.0juY> r0 = r6.LJ
            r2.setEvents(r0)
            int r1 = r6.LIZ
            java.lang.String r0 = r6.LIZLLL
            r2.setSign(r1, r0)
            int r0 = r6.LIZIZ
            r2.mNodeIndex = r0
            java.util.Map<java.lang.Integer, X.0kEO> r0 = r6.LJFF
            r2.setGestureDetectors(r0)
            return r2
        L9c:
            java.lang.String r1 = r6.LIZLLL
            boolean r0 = r6.LIZJ
            com.lynx.tasm.behavior.ui.LynxBaseUI r2 = r5.LJ(r6, r1, r0)
            if (r2 != 0) goto L86
        La6:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1311720kEs.LJI(X.0kEu):com.lynx.tasm.behavior.ui.LynxBaseUI");
    }

    public final void LJIIIIZZ(LynxBaseUI lynxBaseUI) {
        for (int i = 0; i < lynxBaseUI.getChildren().size(); i++) {
            LynxBaseUI childAt = lynxBaseUI.getChildAt(i);
            childAt.destroy();
            this.LJI.remove(Integer.valueOf(childAt.getSign()));
            this.LJ.remove(childAt);
            this.LIZJ.LJJI(null, childAt);
            LJIIIIZZ(childAt);
        }
    }

    public final LynxBaseUI LJIIJ(String str) {
        if (str.isEmpty()) {
            return null;
        }
        Iterator<Integer> it2 = this.LJI.keySet().iterator();
        while (it2.hasNext()) {
            LynxBaseUI lynxBaseUI = this.LJI.get(it2.next());
            if (lynxBaseUI != null && str.equals(lynxBaseUI.mAccessibilityId)) {
                return lynxBaseUI;
            }
        }
        return null;
    }

    public final LynxBaseUI LJIIJJI(String str) {
        int iIntValue;
        if (!str.isEmpty() && !"-1".equals(str)) {
            if (this.LJIIIIZZ.containsKey(str)) {
                iIntValue = this.LJIIIIZZ.get(str).intValue();
            } else {
                try {
                    iIntValue = CastIntegerProtector.parseInt(str);
                } catch (NumberFormatException e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
            if (iIntValue != -1) {
                return LJIIZILJ(iIntValue);
            }
            return this.LIZIZ;
        }
        return this.LIZIZ;
    }

    public final LynxBaseUI LJIIL(String str) {
        for (LynxBaseUI lynxBaseUI : this.LJI.values()) {
            if (lynxBaseUI != null && str.equals(lynxBaseUI.getIdSelector())) {
                return lynxBaseUI;
            }
        }
        return null;
    }

    public final LynxBaseUI LJIILLIIL(int i) {
        if (this.LJI.get(Integer.valueOf(i)) instanceof UIShadowProxy) {
            return ((UIShadowProxy) this.LJI.get(Integer.valueOf(i))).LL;
        }
        return this.LJI.get(Integer.valueOf(i));
    }

    public final LynxBaseUI LJIIZILJ(int i) {
        HashMap<Integer, LynxBaseUI> map = this.LJI;
        if (map != null) {
            return map.get(Integer.valueOf(i));
        }
        return null;
    }

    public final void LJJIJ(final String str) {
        s sVar;
        int i;
        if (Build.VERSION.SDK_INT >= 24 && LynxEnv.inst().enableComponentStatisticReport() && (sVar = this.LIZJ) != null && sVar.LIZLLL() && !this.LIZLLL.contains(str)) {
            this.LIZLLL.add(str);
            s sVar2 = this.LIZJ;
            if (sVar2 == null) {
                i = -1;
            } else {
                i = sVar2.LLJLILLLLZIIL;
            }
            LynxEventReporter.onEvent("lynxsdk_component_statistic", i, new InterfaceC1289180jeW() { // from class: X.0jeX
                @Override // X.InterfaceC1289180jeW
                public final Map build() {
                    String str2 = str;
                    HashMap map = new HashMap();
                    map.put("component_name", str2);
                    return map;
                }
            });
        }
    }

    public final void LJJIJIIJI(String str) {
        if (this.LIZJ != null) {
            HashMap map = new HashMap();
            map.put("instance_id", String.valueOf(this.LIZJ.LLJLILLLLZIIL));
            TraceEvent.LIZJ(str, map);
            return;
        }
        TraceEvent.LIZIZ(str);
    }

    public static LynxBaseUI LJIILIIL(String str, LynxBaseUI lynxBaseUI) {
        LynxBaseUI lynxBaseUILJIILIIL;
        if (lynxBaseUI != null && lynxBaseUI.getIdSelector() != null && lynxBaseUI.getIdSelector().equals(str)) {
            return lynxBaseUI;
        }
        if (lynxBaseUI == null) {
            return null;
        }
        for (LynxBaseUI lynxBaseUI2 : lynxBaseUI.getChildren()) {
            if (lynxBaseUI2.getIdSelector() != null && lynxBaseUI2.getIdSelector().equals(str)) {
                return lynxBaseUI2;
            }
            if (!(lynxBaseUI2 instanceof UIComponent) && (lynxBaseUILJIILIIL = LJIILIIL(str, lynxBaseUI2)) != null) {
                return lynxBaseUILJIILIIL;
            }
        }
        return null;
    }

    public static LynxBaseUI LJIILJJIL(String str, LynxBaseUI lynxBaseUI) {
        if (lynxBaseUI == null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("findLynxUIByIdSelectorSearchUp failed, the ui is null for ");
            sbLIZ.append(str);
            sbLIZ.append(e3.d);
            LynxLog.e("LynxUIOwner", C2188811AlT.LIZIZ(sbLIZ));
            return null;
        }
        if (lynxBaseUI.getIdSelector() != null && lynxBaseUI.getIdSelector().equals(str)) {
            return lynxBaseUI;
        }
        return LJIILJJIL(str, lynxBaseUI.getParentBaseUI());
    }

    public static LynxBaseUI LJIILL(String str, LynxBaseUI lynxBaseUI) {
        LynxBaseUI lynxBaseUILJIILL;
        if (lynxBaseUI.getRefIdSelector() != null && lynxBaseUI.getRefIdSelector().equals(str)) {
            return lynxBaseUI;
        }
        for (LynxBaseUI lynxBaseUI2 : lynxBaseUI.getChildren()) {
            if (lynxBaseUI2.getRefIdSelector() != null && lynxBaseUI2.getRefIdSelector().equals(str)) {
                return lynxBaseUI2;
            }
            if (!lynxBaseUI2.getTagName().equals("component") && (lynxBaseUILJIILL = LJIILL(str, lynxBaseUI2)) != null) {
                return lynxBaseUILJIILL;
            }
        }
        return null;
    }

    public final void LIZJ(int i, int i2) {
        LynxBaseUI lynxBaseUI;
        C1310290kCZ c1310290kCZ = this.LIZJ.LLLIIII;
        if (c1310290kCZ != null && c1310290kCZ.LJJIIJZLJL && (lynxBaseUI = this.LJI.get(Integer.valueOf(i))) != null && lynxBaseUI.getTranslationZ() != lynxBaseUI.mLastTranslateZ) {
            LynxBaseUI lynxBaseUI2 = this.LJI.get(Integer.valueOf(i2));
            if (lynxBaseUI2 != null && lynxBaseUI2.isFlatten()) {
                LJJ(i2, false);
            }
            LynxBaseUI lynxBaseUI3 = this.LJI.get(Integer.valueOf(i2));
            this.LJ.add(lynxBaseUI3);
            lynxBaseUI3.mNeedSortChildren = true;
            lynxBaseUI.mLastTranslateZ = lynxBaseUI.getTranslationZ();
        }
    }

    public final UIShadowProxy LIZLLL(C1311730kEt c1311730kEt, LynxBaseUI lynxBaseUI) {
        UIShadowProxy uIShadowProxy = null;
        if (c1311730kEt != null) {
            if (LJIJ(c1311730kEt)) {
                uIShadowProxy = new UIShadowProxy(this.LIZJ, lynxBaseUI);
            }
            lynxBaseUI.updatePropertiesInterval(c1311730kEt);
        }
        return uIShadowProxy;
    }

    public final void LJII(int i, int i2) {
        LynxBaseUI parentBaseUI;
        TraceEvent.LIZLLL("UIOwner.destroy.item");
        if (this.LJI.size() > 0) {
            LynxBaseUI lynxBaseUI = this.LJI.get(Integer.valueOf(i2));
            if (lynxBaseUI == null) {
                TraceEvent.LJII("UIOwner.destroy.item");
                return;
            }
            this.LJ.remove(lynxBaseUI);
            LJJIIJZLJL(lynxBaseUI);
            this.LJI.remove(Integer.valueOf(i2));
            this.LIZJ.LJJI(null, lynxBaseUI);
            lynxBaseUI.destroy();
            LJIJJ(lynxBaseUI, 2);
            C1310290kCZ c1310290kCZ = this.LIZJ.LLLIIII;
            if (c1310290kCZ == null || !c1310290kCZ.LJJIJIIJI) {
                LJIIIIZZ(lynxBaseUI);
            }
            if (i == -1) {
                parentBaseUI = lynxBaseUI.getParentBaseUI();
            } else {
                parentBaseUI = this.LJI.get(Integer.valueOf(i));
            }
            if (parentBaseUI == null) {
                TraceEvent.LJII("UIOwner.destroy.item");
                return;
            }
            parentBaseUI.removeChild(lynxBaseUI);
        }
        TraceEvent.LJII("UIOwner.destroy.item");
    }

    public final void LJIJJ(LynxBaseUI lynxBaseUI, int i) {
        C1310360kCg c1310360kCg = this.LIZIZ.LLILZIL;
        if (c1310360kCg != null && c1310360kCg.LJIIJ != null && c1310360kCg.LJIIL()) {
            c1310360kCg.LJIIJ.LIZ(i, lynxBaseUI, "");
        }
    }

    public final void LJJ(int i, boolean z) {
        String strLIZIZ;
        int index;
        LynxBaseUI lynxBaseUI = this.LJI.get(Integer.valueOf(i));
        if (lynxBaseUI == null) {
            return;
        }
        LynxBaseUI parentBaseUI = lynxBaseUI.getParentBaseUI();
        C1311730kEt c1311730kEt = new C1311730kEt(lynxBaseUI.getProps());
        ArrayList<LynxBaseUI> arrayList = new ArrayList(lynxBaseUI.getChildren());
        if (TraceController.isTracingStarted()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("UIOwner.updateFlatten.");
            sbLIZ.append(lynxBaseUI.getTagName());
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            TraceEvent.LIZLLL(strLIZIZ);
        } else {
            strLIZIZ = null;
        }
        int i2 = 0;
        if (parentBaseUI != null) {
            index = parentBaseUI.getIndex(lynxBaseUI);
            LJJIIJZLJL(lynxBaseUI);
            parentBaseUI.removeChild(lynxBaseUI);
        } else {
            index = 0;
        }
        if (!lynxBaseUI.isFlatten()) {
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                LJJIIJZLJL((LynxBaseUI) it2.next());
            }
        }
        int size = lynxBaseUI.getChildren().size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            } else {
                lynxBaseUI.removeChild(lynxBaseUI.getChildAt(size));
            }
        }
        LynxBaseUI lynxBaseUILJ = LJ(null, lynxBaseUI.getTagName(), z);
        lynxBaseUI.applyUIPaintStylesToTarget(lynxBaseUILJ);
        lynxBaseUILJ.setSign(lynxBaseUI.getSign(), lynxBaseUI.getTagName());
        LIZ(lynxBaseUILJ, LIZLLL(c1311730kEt, lynxBaseUILJ), c1311730kEt);
        this.LJI.put(Integer.valueOf(lynxBaseUI.getSign()), lynxBaseUILJ);
        if (this.LJ.contains(lynxBaseUI)) {
            this.LJ.remove(lynxBaseUI);
            this.LJ.add(lynxBaseUILJ);
        }
        if (parentBaseUI != null) {
            parentBaseUI.insertChild(lynxBaseUILJ, index);
            LJIL(parentBaseUI, lynxBaseUILJ, index);
        }
        for (LynxBaseUI lynxBaseUI2 : arrayList) {
            lynxBaseUI2.setBound(null);
            lynxBaseUI2.setLeft(lynxBaseUI2.getOriginLeft());
            lynxBaseUI2.setTop(lynxBaseUI2.getOriginTop());
            lynxBaseUILJ.insertChild(lynxBaseUI2, i2);
            i2++;
        }
        LJIJJLI(lynxBaseUILJ);
        lynxBaseUILJ.updateLayoutInfo(lynxBaseUI);
        lynxBaseUILJ.copyPropFromOldUiInUpdateFlatten(lynxBaseUI);
        lynxBaseUILJ.measure();
        ((LynxUI) lynxBaseUILJ).handleLayout();
        if (lynxBaseUILJ instanceof UIGroup) {
            ((UIGroup) lynxBaseUILJ).layoutChildren();
        }
        lynxBaseUILJ.invalidate();
        lynxBaseUI.destroy();
        if (TraceController.isTracingStarted()) {
            TraceEvent.LJII(strLIZIZ);
        }
    }

    public final void LJJI(int i, long j) {
        LynxBaseUI lynxBaseUI;
        String strLIZIZ;
        C1310290kCZ c1310290kCZ = this.LIZJ.LLLIIII;
        if (c1310290kCZ != null && c1310290kCZ.LJJIIJZLJL) {
            for (LynxBaseUI lynxBaseUI2 : this.LJ) {
                if (lynxBaseUI2.mFlattenChildrenCount > 0 && lynxBaseUI2.mNeedSortChildren) {
                    Iterator<LynxBaseUI> it2 = lynxBaseUI2.getChildren().iterator();
                    while (it2.hasNext()) {
                        LJJIIJZLJL(it2.next());
                    }
                    try {
                        Collections.sort(lynxBaseUI2.getChildren(), LJIJJLI);
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("Something went wrong during sort children by translation Z ");
                        sbLIZ.append(e.getStackTrace());
                        LynxLog.i("LynxUIOwner", C2188811AlT.LIZIZ(sbLIZ));
                    }
                    LJIJJLI(lynxBaseUI2);
                    lynxBaseUI2.mNeedSortChildren = false;
                }
            }
        }
        C1310360kCg c1310360kCg = this.LIZIZ.LLILZIL;
        if (c1310360kCg != null) {
            if (c1310360kCg.LJIIJ != null && c1310360kCg.LJIIL() && c1310360kCg.LJII() != null && c1310360kCg.LJII().mContext != null) {
                C1300290jwR c1300290jwR = c1310360kCg.LJIIJ;
                s sVar = c1310360kCg.LJII().mContext;
                if (sVar != null) {
                    if (!c1300290jwR.LIZ.isEmpty()) {
                        JavaOnlyArray javaOnlyArray = new JavaOnlyArray();
                        Iterator<JavaOnlyMap> it3 = c1300290jwR.LIZ.iterator();
                        while (it3.hasNext()) {
                            javaOnlyArray.add(it3.next());
                        }
                        JavaOnlyArray javaOnlyArray2 = new JavaOnlyArray();
                        javaOnlyArray2.add(javaOnlyArray);
                        sVar.LJJIII("a11y-mutations", javaOnlyArray2);
                        c1300290jwR.LIZ.clear();
                    }
                } else {
                    c1300290jwR.getClass();
                }
            }
            if (c1310360kCg.LJFF()) {
                C1311340kEG c1311340kEG = c1310360kCg.LJIILIIL;
                if (!c1311340kEG.LIZLLL.isEmpty()) {
                    for (WeakReference<LynxBaseUI> weakReference : c1311340kEG.LIZLLL) {
                        if (weakReference != null && weakReference.get() != null) {
                            c1311340kEG.LIZIZ(weakReference.get());
                        }
                    }
                    c1311340kEG.LIZLLL.clear();
                }
                if (!c1311340kEG.LIZJ.isEmpty()) {
                    for (WeakReference<LynxBaseUI> weakReference2 : c1311340kEG.LIZJ) {
                        if (weakReference2 != null && weakReference2.get() != null) {
                            c1311340kEG.LIZIZ(weakReference2.get());
                        }
                    }
                    c1311340kEG.LIZJ.clear();
                }
            }
        }
        UIBody uIBody = this.LIZIZ;
        C1310660kDA c1310660kDA = uIBody.LL;
        if (c1310660kDA != null) {
            int width = uIBody.getWidth();
            int height = this.LIZIZ.getHeight();
            if (width != c1310660kDA.getIntrinsicWidth() || height != c1310660kDA.getIntrinsicHeight()) {
                c1310660kDA.setIntrinsicContentSize(width, height);
            }
        }
        if (j != 0 && (lynxBaseUI = this.LJI.get(Integer.valueOf((int) (j >>> 32)))) != null) {
            if (TraceController.isTracingStarted()) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("UIOwner.layoutFinish.");
                sbLIZ2.append(lynxBaseUI.getTagName());
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
                TraceEvent.LIZLLL(strLIZIZ);
            } else {
                strLIZIZ = null;
            }
            lynxBaseUI.onLayoutFinish(j, this.LJI.get(Integer.valueOf(i)));
            if (TraceController.isTracingStarted()) {
                TraceEvent.LJII(strLIZIZ);
            }
        }
    }

    public final void LJJIIJ(int i, int i2) {
        LynxBaseUI parentBaseUI;
        String strLIZIZ;
        if (this.LJI.size() > 0) {
            LynxBaseUI lynxBaseUI = this.LJI.get(Integer.valueOf(i2));
            if (lynxBaseUI != null) {
                if (i == -1) {
                    parentBaseUI = lynxBaseUI.getParentBaseUI();
                } else {
                    parentBaseUI = this.LJI.get(Integer.valueOf(i));
                }
                if (parentBaseUI != null) {
                    if (TraceController.isTracingStarted()) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("UIOwner.remove.");
                        sbLIZ.append(parentBaseUI.getTagName());
                        sbLIZ.append(e3.d);
                        sbLIZ.append(lynxBaseUI.getTagName());
                        strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                        TraceEvent.LIZLLL(strLIZIZ);
                    } else {
                        strLIZIZ = null;
                    }
                    LJJIIJZLJL(lynxBaseUI);
                    parentBaseUI.removeChild(lynxBaseUI);
                    lynxBaseUI.setBound(null);
                    lynxBaseUI.setLeft(lynxBaseUI.getOriginLeft());
                    lynxBaseUI.setTop(lynxBaseUI.getOriginTop());
                    if (lynxBaseUI.isFlatten()) {
                        parentBaseUI.flattenChildrenCountDecrement();
                    }
                    lynxBaseUI.removeChildrenExposureUI();
                    LJIJJ(lynxBaseUI, 1);
                    if (TraceController.isTracingStarted()) {
                        TraceEvent.LJII(strLIZIZ);
                        return;
                    }
                    return;
                }
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("Trying to remove unknown ui signature: ");
                sbLIZ2.append(i2);
                throw new RuntimeException(C2188811AlT.LIZIZ(sbLIZ2));
            }
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("Trying to remove unknown ui signature: ");
            sbLIZ3.append(i2);
            throw new RuntimeException(C2188811AlT.LIZIZ(sbLIZ3));
        }
    }

    public final void LJJIJLIJ(int i, Object obj) {
        String strLIZIZ;
        if (C1289620jfE.LIZIZ()) {
            LynxBaseUI lynxBaseUI = this.LJI.get(Integer.valueOf(i));
            if (lynxBaseUI != null) {
                if (TraceController.isTracingStarted()) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("UIOwner.updateViewExtraData.");
                    sbLIZ.append(lynxBaseUI.getTagName());
                    strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                    TraceEvent.LIZLLL(strLIZIZ);
                } else {
                    strLIZIZ = null;
                }
                lynxBaseUI.updateExtraData(obj);
                if (TraceController.isTracingStarted()) {
                    TraceEvent.LJII(strLIZIZ);
                    return;
                }
                return;
            }
            return;
        }
        throw new AssertionError("Expected to run on UI thread!");
    }

    public C1311720kEs(C1289430jev c1289430jev, s sVar, C1310660kDA c1310660kDA) {
        TraceEvent.LIZIZ("LynxUIOwner initialized");
        this.LIZJ = sVar;
        this.LJIIIZ = c1289430jev;
        if (Build.VERSION.SDK_INT >= 24) {
            this.LIZLLL = ConcurrentHashMap.newKeySet();
        } else {
            this.LIZLLL = new HashSet();
        }
        this.LJ = new HashSet<>();
        this.LJFF = new ArrayList();
        this.LJI = new HashMap<>();
        new HashMap();
        this.LJIIIIZZ = new HashMap<>();
        this.LIZ = -1;
        UIBody uIBody = new UIBody(this.LIZJ, c1310660kDA);
        this.LIZIZ = uIBody;
        this.LIZJ.LLJILJILJ = uIBody;
        this.LJIIJ = true;
        this.LJIIJJI = true;
        this.LJII = new HashSet<>();
        this.LJIILL = LynxEnv.getBooleanFromExternalEnv(EnumC1310010kC7.ENABLE_REPORT_CREATE_ASYNC_TAG, false);
        this.LJIIZILJ = new HashMap<>();
        if (sVar.LJIJJLI()) {
            this.LJIJJ = new C1316700kMu(sVar);
        }
        LIZIZ(c1310660kDA);
        TraceEvent.LJII("LynxUIOwner initialized");
    }

    public static void LJIL(LynxBaseUI lynxBaseUI, LynxBaseUI lynxBaseUI2, int i) {
        LynxBaseUI drawParent;
        lynxBaseUI2.mNextDrawUI = null;
        if (lynxBaseUI.isFlatten()) {
            drawParent = lynxBaseUI.getDrawParent();
            if (drawParent == null) {
                return;
            }
        } else {
            drawParent = lynxBaseUI;
        }
        if (i == 0) {
            LynxUI lynxUI = (LynxUI) drawParent;
            if (!lynxBaseUI.isFlatten()) {
                lynxBaseUI = null;
            }
            lynxUI.insertDrawList(lynxBaseUI, lynxBaseUI2);
        } else {
            LynxBaseUI childAt = lynxBaseUI.getChildAt(i - 1);
            while (childAt.isFlatten() && !childAt.getChildren().isEmpty()) {
                childAt = childAt.getChildAt(childAt.getChildren().size() - 1);
            }
            ((LynxUI) drawParent).insertDrawList(childAt, lynxBaseUI2);
        }
        if (!lynxBaseUI2.isFlatten()) {
            UIGroup uIGroup = (UIGroup) drawParent;
            if (uIGroup.isInsertViewCalled()) {
                uIGroup.insertView((LynxUI) lynxBaseUI2);
            }
        }
    }

    public final LynxBaseUI LIZ(LynxBaseUI lynxBaseUI, UIShadowProxy uIShadowProxy, C1311730kEt c1311730kEt) {
        InterfaceC1312870kGj interfaceC1312870kGj;
        InterfaceC1312870kGj interfaceC1312870kGj2;
        List<InterfaceC1310460kCq> list;
        if (lynxBaseUI instanceof InterfaceC1311800kF0) {
            s sVar = this.LIZJ;
            if (sVar.LLJJJJJIL == null) {
                sVar.LLJJJJJIL = new ArrayList();
            }
            ((ArrayList) sVar.LLJJJJJIL).add(lynxBaseUI);
        }
        if ((lynxBaseUI instanceof InterfaceC1310460kCq) && (list = this.LJFF) != null) {
            ((ArrayList) list).add(lynxBaseUI);
        }
        if (c1311730kEt != null) {
            lynxBaseUI.afterPropsUpdated(c1311730kEt);
            if (c1311730kEt.LJIIIIZZ("transition") || ((interfaceC1312870kGj2 = c1311730kEt.LIZIZ) != null && interfaceC1312870kGj2.LJLJL(109))) {
                lynxBaseUI.initTransitionAnimator(c1311730kEt.LIZ);
            }
            if (c1311730kEt.LJIIIIZZ("animation") || ((interfaceC1312870kGj = c1311730kEt.LIZIZ) != null && interfaceC1312870kGj.LJLJL(64))) {
                lynxBaseUI.setAnimation(c1311730kEt.LIZ("animation"));
            }
        }
        if (uIShadowProxy != null) {
            return uIShadowProxy;
        }
        return lynxBaseUI;
    }

    public final LynxBaseUI LJ(Object obj, String str, boolean z) {
        boolean z2;
        LynxFlattenUI lynxFlattenUILIZJ;
        C1310290kCZ c1310290kCZ = this.LIZJ.LLLIIII;
        if (c1310290kCZ != null) {
            z2 = c1310290kCZ.LJIIIIZZ;
        } else {
            z2 = false;
        }
        if (z2 && ("swiper".equals(str) || "x-swiper".equals(str))) {
            return new XSwiperUI(this.LIZJ, obj);
        }
        C1311670kEn c1311670kEnLIZIZ = this.LJIIIZ.LIZIZ(str);
        C1310360kCg c1310360kCgLJIIL = this.LIZJ.LJIIL();
        if ((c1310360kCgLJIIL == null || !c1310360kCgLJIIL.LJFF() || !c1310360kCgLJIIL.LJIIJ()) && z && c1311670kEnLIZIZ.LIZIZ && (lynxFlattenUILIZJ = c1311670kEnLIZIZ.LIZJ(this.LIZJ, obj)) != null) {
            return lynxFlattenUILIZJ;
        }
        return c1311670kEnLIZIZ.LJI(this.LIZJ, obj);
    }

    public final void LJIJI(int i, int i2, int i3) {
        if (this.LJI.size() > 0) {
            if (this.LJI.get(Integer.valueOf(i)) != null) {
                LynxBaseUI lynxBaseUI = this.LJI.get(Integer.valueOf(i2));
                if (lynxBaseUI != null) {
                    LIZJ(i2, i);
                    LynxBaseUI lynxBaseUI2 = this.LJI.get(Integer.valueOf(i));
                    if (!lynxBaseUI2.canHaveFlattenChild() && lynxBaseUI.isFlatten()) {
                        LJJ(i2, false);
                        lynxBaseUI = this.LJI.get(Integer.valueOf(i2));
                    }
                    if (i3 == -1) {
                        i3 = lynxBaseUI2.getChildren().size();
                    }
                    lynxBaseUI2.insertChild(lynxBaseUI, i3);
                    LJIL(lynxBaseUI2, lynxBaseUI, i3);
                    if (lynxBaseUI.isFlatten()) {
                        lynxBaseUI2.flattenChildrenCountIncrement();
                    }
                    if (lynxBaseUI.isFlatten()) {
                        LJIJJLI(lynxBaseUI);
                        lynxBaseUI.requestLayout();
                        lynxBaseUI.invalidate();
                    }
                    LJIJJ(lynxBaseUI, 0);
                    return;
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Insertion (new) failed due to unknown child signature: ");
                sbLIZ.append(i2);
                throw new RuntimeException(C2188811AlT.LIZIZ(sbLIZ));
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("Insertion (new) failed due to unknown parent signature: ");
            sbLIZ2.append(i);
            throw new RuntimeException(C2188811AlT.LIZIZ(sbLIZ2));
        }
    }

    public final void LJJIIZI(int i, final String str, final boolean z) {
        final String simpleName;
        s sVar = this.LIZJ;
        if (sVar != null && sVar.LIZLLL() && !TextUtils.equals(str, "page") && this.LJIILL && !this.LJIIZILJ.containsKey(str)) {
            this.LJIIZILJ.put(str, Boolean.valueOf(z));
            LynxBaseUI lynxBaseUILJIIZILJ = LJIIZILJ(i);
            if (lynxBaseUILJIIZILJ != null) {
                simpleName = lynxBaseUILJIIZILJ.getClass().getSimpleName();
            } else {
                simpleName = null;
            }
            LynxEventReporter.onEvent("lynxsdk_async_create_config", this.LIZJ.LLJLILLLLZIIL, new InterfaceC1289180jeW() { // from class: X.0kEw
                @Override // X.InterfaceC1289180jeW
                public final Map build() {
                    String str2 = str;
                    String str3 = simpleName;
                    boolean z2 = z;
                    HashMap map = new HashMap();
                    map.put("tag_name", str2);
                    map.put("class_name", str3);
                    map.put("enable_async", Boolean.valueOf(z2));
                    return map;
                }
            });
        }
    }

    public final void LJJIJIIJIL(int i, String str, C1311730kEt c1311730kEt) {
        if (str.equals("component") && c1311730kEt.LJIIIIZZ("ComponentID")) {
            String strLJII = c1311730kEt.LJII("ComponentID");
            if (strLJII == null) {
                strLJII = "-1";
            }
            this.LJIIIIZZ.put(strLJII, Integer.valueOf(i));
        }
    }

    public final void LJJIIZ(int i, final int i2, final String str, final boolean z) {
        final String simpleName;
        s sVar = this.LIZJ;
        if (sVar != null && sVar.LIZLLL() && this.LJIILL) {
            LynxBaseUI lynxBaseUILJIIZILJ = LJIIZILJ(i);
            if (lynxBaseUILJIIZILJ != null) {
                simpleName = lynxBaseUILJIIZILJ.getClass().getSimpleName();
            } else {
                simpleName = null;
            }
            LynxEventReporter.onEvent("lynxsdk_async_create_success_event", this.LIZJ.LLJLILLLLZIIL, new InterfaceC1289180jeW() { // from class: X.0kEv
                @Override // X.InterfaceC1289180jeW
                public final Map build() {
                    String str2 = str;
                    String str3 = simpleName;
                    boolean z2 = z;
                    int i3 = i2;
                    HashMap map = new HashMap();
                    map.put("tag_name", str2);
                    map.put("class_name", str3);
                    map.put("success", Boolean.valueOf(z2));
                    map.put(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, Integer.valueOf(i3));
                    return map;
                }
            });
        }
    }

    public final void LJJIJL(int i, boolean z, C1311730kEt c1311730kEt, Map<String, C1299120juY> map, Map<Integer, C1311420kEO> map2) {
        String strLIZIZ;
        InterfaceC1312870kGj interfaceC1312870kGj;
        InterfaceC1312870kGj interfaceC1312870kGj2;
        if (C1289620jfE.LIZIZ()) {
            LynxBaseUI lynxBaseUI = this.LJI.get(Integer.valueOf(i));
            if (lynxBaseUI == null) {
                return;
            }
            LJJIJIIJIL(i, lynxBaseUI.getTagName(), c1311730kEt);
            if (TraceController.isTracingStarted()) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("UIOwner.updateProps.");
                sbLIZ.append(lynxBaseUI.getTagName());
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                TraceEvent.LIZLLL(strLIZIZ);
            } else {
                strLIZIZ = null;
            }
            if (map != null) {
                lynxBaseUI.setEvents(map);
            }
            if (map2 != null) {
                lynxBaseUI.setGestureDetectors(map2);
            }
            int index = 0;
            if (!z && lynxBaseUI.isFlatten()) {
                LJJ(i, false);
                lynxBaseUI = this.LJI.get(Integer.valueOf(i));
            }
            if (c1311730kEt != null && !c1311730kEt.LJIIIZ()) {
                if (c1311730kEt.LJIIIIZZ("transition") || ((interfaceC1312870kGj2 = c1311730kEt.LIZIZ) != null && interfaceC1312870kGj2.LJLJL(109))) {
                    if (lynxBaseUI instanceof UIShadowProxy) {
                        ((UIShadowProxy) lynxBaseUI).LL.initTransitionAnimator(c1311730kEt.LIZ);
                    } else {
                        lynxBaseUI.initTransitionAnimator(c1311730kEt.LIZ);
                    }
                }
                if (c1311730kEt.LJIIIIZZ("animation") || ((interfaceC1312870kGj = c1311730kEt.LIZIZ) != null && interfaceC1312870kGj.LJLJL(64))) {
                    if (lynxBaseUI instanceof UIShadowProxy) {
                        ((UIShadowProxy) lynxBaseUI).LL.setAnimation(c1311730kEt.LIZ("animation"));
                    } else {
                        lynxBaseUI.setAnimation(c1311730kEt.LIZ("animation"));
                    }
                }
                if (LJIJ(c1311730kEt) && ((c1311730kEt.LIZ("box-shadow") != null || c1311730kEt.LJFF("outline-style", -1) != -1) && !(lynxBaseUI instanceof UIShadowProxy) && !(lynxBaseUI.mParent instanceof UIShadowProxy))) {
                    LynxBaseUI parentBaseUI = lynxBaseUI.getParentBaseUI();
                    if (parentBaseUI != null) {
                        index = parentBaseUI.getIndex(lynxBaseUI);
                        LJJIIJ(parentBaseUI.getSign(), lynxBaseUI.getSign());
                    }
                    this.LIZJ.LJJI(null, lynxBaseUI);
                    UIShadowProxy uIShadowProxy = new UIShadowProxy(this.LIZJ, lynxBaseUI);
                    this.LJI.put(Integer.valueOf(lynxBaseUI.getSign()), uIShadowProxy);
                    if (parentBaseUI != null) {
                        LJIJI(parentBaseUI.getSign(), uIShadowProxy.getSign(), index);
                    }
                }
            }
            lynxBaseUI.updateProperties(c1311730kEt);
            if (lynxBaseUI.getParentBaseUI() != null) {
                LIZJ(lynxBaseUI.getSign(), lynxBaseUI.getParentBaseUI().getSign());
            }
            if (TraceController.isTracingStarted()) {
                TraceEvent.LJII(strLIZIZ);
                return;
            }
            return;
        }
        throw new AssertionError("Expected to run on UI thread!");
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00d1 A[Catch: all -> 0x010a, TRY_LEAVE, TryCatch #2 {, blocks: (B:9:0x0018, B:11:0x0020, B:12:0x0033, B:14:0x0039, B:18:0x0054, B:27:0x00cb, B:29:0x00d1, B:19:0x0064, B:25:0x00b1, B:26:0x00bc, B:24:0x00a6, B:35:0x00dc, B:37:0x0101, B:36:0x00ec, B:38:0x0102, B:39:0x0109, B:16:0x0046, B:21:0x0071), top: B:47:0x0018, inners: #0, #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJFF(int r15, java.lang.String r16, com.lynx.react.bridge.ReadableMap r17, com.lynx.react.bridge.mapbuffer.ReadableMapBuffer r18, com.lynx.react.bridge.ReadableArray r19, boolean r20, int r21, com.lynx.react.bridge.ReadableArray r22) {
        /*
            Method dump skipped, instruction units count: 269
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1311720kEs.LJFF(int, java.lang.String, com.lynx.react.bridge.ReadableMap, com.lynx.react.bridge.mapbuffer.ReadableMapBuffer, com.lynx.react.bridge.ReadableArray, boolean, int, com.lynx.react.bridge.ReadableArray):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0427  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x043d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJIJIL(int r50, int r51, int r52, int r53, int r54, int r55, int r56, int r57, int r58, int r59, int r60, int r61, int r62, int r63, int r64, int r65, int r66, android.graphics.Rect r67, float[] r68, float r69, int r70) {
        /*
            Method dump skipped, instruction units count: 1450
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1311720kEs.LJJIJIL(int, int, int, int, int, int, int, int, int, int, int, int, int, int, int, int, int, android.graphics.Rect, float[], float, int):void");
    }
}
