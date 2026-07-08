package X;

import Y.AObjectS185S0300000_25;
import Y.AObjectS246S0100000_25;
import Y.AObjectS306S0200000_25;
import a6n.a;
import android.view.View;
import android.widget.LinearLayout;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.als.h0;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.widget.TabHost;
import com.ss.android.ugc.gamora.recorder.bottom.IBottomTabChangeService;
import com.ss.android.ugc.gamora.recorder.bottom.r0;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AwS569S0100000_25;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0t7X, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public abstract class AbstractC1653130t7X extends AbstractC1171700gb2 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIJIL;
    public static final int LLJJJ;
    public final C19A3 LLILLJJLI;
    public final C1DRG LLILLL;
    public final List<InterfaceC1653190t7d> LLILZ;
    public final InterfaceC1648020szI LLILZIL = this;
    public final InterfaceC1731706qJ LLILZLL = C1664770tQJ.LIZ(getDiContainer(), ShortVideoContext.class, null);
    public final InterfaceC1731706qJ LLIZ = C1664770tQJ.LIZ(getDiContainer(), C19EG.class, null);
    public a LLIZLLLIL;
    public final h0<C1647390syH> LLJ;
    public final C385670FAf<C1647390syH> LLJI;
    public final C560530Lyd<String> LLJIJIL;
    public final List<String> LLJILJIL;
    public final AbstractC1653290t7n LLJILJILJ;
    public final C560530Lyd<Boolean> LLJILLL;
    public final C560530Lyd<Integer> LLJJ;
    public final C560530Lyd<Integer> LLJJI;
    public final C01GW LLJJIII;
    public boolean LLJJIJI;
    public boolean LLJJIJIIJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(AbstractC1653130t7X.class, "shortVideoContext", "getShortVideoContext()Lcom/ss/android/ugc/aweme/shortvideo/ShortVideoContext;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(AbstractC1653130t7X.class, "activity", "getActivity()Landroidx/fragment/app/FragmentActivity;", 0);
        c09r3.getClass();
        LLJJIJIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
        LLJJJ = 8;
    }

    public void B3(boolean z) {
    }

    public boolean E3() {
        return false;
    }

    public void X1(C1653090t7T c1653090t7T) {
    }

    public final boolean v3(C19A3 c19a3, C1653090t7T c1653090t7T) {
        return true;
    }

    public abstract C385670FAf<Boolean> va();

    public final a G2() {
        a aVar = this.LLIZLLLIL;
        if (aVar != null) {
            return aVar;
        }
        return null;
    }

    public final C19EG getActivity() {
        return (C19EG) this.LLIZ.getValue(this, LLJJIJIL[1]);
    }

    public final ShortVideoContext getShortVideoContext() {
        return (ShortVideoContext) this.LLILZLL.getValue(this, LLJJIJIL[0]);
    }

    @Override // X.InterfaceC1648020szI
    public boolean isValid() {
        return !C12WG.LIZIZ(this.LLILLJJLI);
    }

    public r0 o2() {
        return (r0) this.LLJJIII.getValue();
    }

    @Override // X.InterfaceC1648020szI
    public int bottomTabSize() {
        return ((ArrayList) Z1().LIZLLL).size();
    }

    @Override // X.InterfaceC1648020szI
    public String defaultBottomTab() {
        List<C1653090t7T> list = Z1().LIZLLL;
        if (C086I.LIZIZ(list)) {
            return null;
        }
        Iterator<C1653090t7T> it2 = list.iterator();
        while (it2.hasNext()) {
            C1653330t7r c1653330t7r = it2.next().LIZ;
            if (c1653330t7r.LIZLLL) {
                return c1653330t7r.LIZIZ;
            }
        }
        return null;
    }

    @Override // X.InterfaceC1648020szI
    public C1653330t7r getCurrentBottomTabItem() {
        return Z1().LJFF();
    }

    @Override // X.InterfaceC1648020szI
    public C1653330t7r getCurrentBottomTabItemBeforeOnTabChanged() {
        C1653330t7r c1653330t7r = Z1().LJIIL;
        return c1653330t7r == null ? getCurrentBottomTabItem() : c1653330t7r;
    }

    @Override // X.InterfaceC1647930sz9
    public String getCurrentBottomTag() {
        return Z1().LJI();
    }

    @Override // X.InterfaceC1648020szI
    public List<C1653090t7T> getExistingTabs() {
        return Z1().LIZLLL;
    }

    @Override // X.AbstractC1171700gb2, X.InterfaceC1648020szI
    public C1653370t7v getTooltipCoordinator() {
        return (C1653370t7v) Z1().LJIIJ.getValue();
    }

    @Override // X.InterfaceC1648020szI
    public void hidePopupForLiveTab() {
        C1653300t7o c1653300t7o = Z1().LJI;
        if (c1653300t7o == null) {
            c1653300t7o = null;
        }
        C0P0T c0p0t = c1653300t7o.LIZLLL;
        if (c0p0t != null) {
            c0p0t.dismiss();
        }
    }

    @Override // X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
        Object objLJ = this.LLILLJJLI.getScope().LJ("record_env_context");
        if (objLJ == null) {
            "Required value was null.".toString();
            throw new IllegalArgumentException("Required value was null.");
        }
        O3((a) objLJ);
        Z1().LJIIIZ(G2(), this.LLILZ, this.LLJ, m3());
        if (E3()) {
            return;
        }
        List<C1653090t7T> list = Z1().LIZLLL;
        q3(list);
        this.LLILLJJLI.add(R.id.sz5, o2(), "RecordBottomTabScene");
        init(this.LLILLJJLI, list);
        this.LLJJ.LIZ(this, new AObjectS246S0100000_25(this, 331));
        this.LLJJI.LIZ(this, new AObjectS246S0100000_25(this, 332));
    }

    @Override // X.AbstractC2255721DQs
    public void onStart() {
        super.onStart();
        setDefaultSelectedTab(this.LLILLJJLI, Z1().LIZLLL);
    }

    @Override // X.InterfaceC1647930sz9
    public a provideRecordEnv() {
        return G2();
    }

    @Override // X.InterfaceC1648020szI
    public void tryShowPopupForLiveTab() {
        Z1().LJIILL();
    }

    public final C560530Lyd<Integer> H2() {
        return this.LLJJI;
    }

    public final C560530Lyd<Integer> T2() {
        return this.LLJJ;
    }

    public final C560530Lyd<Boolean> W2() {
        return this.LLJILLL;
    }

    public AbstractC1653290t7n Z1() {
        return this.LLJILJILJ;
    }

    public final h0<C1647390syH> c3() {
        return this.LLJ;
    }

    @Override // X.InterfaceC1647930sz9
    public C385670FAf<C1647390syH> getBottomTabIndexChangeEvent() {
        return this.LLJI;
    }

    @Override // X.AbstractC1171700gb2, X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LLILLL;
    }

    public final C19A3 getParentScene() {
        return this.LLILLJJLI;
    }

    @Override // X.InterfaceC1648020szI
    public List<String> getPrevTabTags() {
        return this.LLJILJIL;
    }

    public final List<String> i3() {
        return this.LLJILJIL;
    }

    @Override // X.AbstractC1171700gb2, X.InterfaceC1648020szI
    public boolean isBottomTabThemeDarkMode() {
        return this.LLJJIJI;
    }

    public C560530Lyd<String> m3() {
        return this.LLJIJIL;
    }

    public final boolean w2() {
        return this.LLJJIJI;
    }

    @Override // X.AbstractC2255721DQs
    public InterfaceC1648020szI getApiComponent() {
        return this.LLILZIL;
    }

    public final void H3(boolean z) {
        this.LLJJIJI = z;
    }

    public final void O3(a aVar) {
        this.LLIZLLLIL = aVar;
    }

    @Override // X.InterfaceC1648020szI
    public void clearAIBrandTextByTag(String str) {
        o2().LLLIL(str);
    }

    @Override // X.InterfaceC1648020szI
    public C1653090t7T findBottomTabByTag(String str) {
        return Z1().LIZLLL(str);
    }

    @Override // X.InterfaceC1648020szI
    public View getHostViewByIndex(int i) {
        TabHost tabHost = o2().LLJILLL;
        if (tabHost == null) {
            tabHost = null;
        }
        LinearLayout linearLayout = tabHost.LLIZ;
        if (linearLayout == null) {
            return null;
        }
        return linearLayout.getChildAt(i);
    }

    @Override // X.InterfaceC1648020szI
    public int getIndexByTag(String str) {
        return o2().LLLIIIIL(str);
    }

    @Override // X.InterfaceC1648020szI
    public void notifyBottomTabIndexChange(C1647390syH c1647390syH) {
        this.LLJ.LJII(c1647390syH);
        IBottomTabChangeService iBottomTabChangeService = (IBottomTabChangeService) PluggableExtentionKt.pluggableSpi$default(IBottomTabChangeService.class, false, false, false, 14, null);
        if (iBottomTabChangeService != null) {
            iBottomTabChangeService.LIZLLL(this.LLJ.LIZJ().LIZIZ);
        }
    }

    public void q3(List<C1653090t7T> list) {
        for (C1653090t7T c1653090t7T : list) {
            AbstractC1653180t7c abstractC1653180t7c = c1653090t7T.LIZIZ;
            if (abstractC1653180t7c != null && v3(this.LLILLJJLI, c1653090t7T)) {
                C1658150tFd.LIZ(this.LLILLJJLI, R.id.sz5, abstractC1653180t7c, abstractC1653180t7c.getTag());
            }
        }
    }

    @Override // X.InterfaceC1648020szI
    public void resetToCurTab(String str) {
        int iLLLIIIIL;
        if ((!C300070BpV.LIZ() || !Intrinsics.LJFF(o2().LLLII(), str)) && (iLLLIIIIL = o2().LLLIIIIL(str)) >= 0) {
            o2().LLLIZZ(iLLLIIIIL, false, false);
        }
    }

    @Override // X.InterfaceC1648020szI
    public void setBottomTabEndMargin(int i) {
        this.LLJJI.LJIIJ(Integer.valueOf(i));
    }

    @Override // X.InterfaceC1648020szI
    public void setBottomTabStartMargin(int i) {
        this.LLJJ.LJIIJ(Integer.valueOf(i));
    }

    @Override // X.InterfaceC1648020szI
    public void setBottomTabWidgetGestureListener(InterfaceC1653650t8N interfaceC1653650t8N) {
        TabHost tabHost = o2().LLJILLL;
        if (tabHost == null) {
            tabHost = null;
        }
        tabHost.setBottomTabWidgetGestureListener(interfaceC1653650t8N);
    }

    @Override // X.InterfaceC1648020szI
    public void setTabSwitchEnabled(boolean z) {
        o2().setTabSwitchEnabled(z);
    }

    @Override // X.InterfaceC1648020szI
    public void switchDarkLightThemeMode(boolean z) {
        o2().LLLLIIIILLL(z);
        this.LLJJIJI = z;
    }

    @Override // X.InterfaceC1648020szI
    public void updateBottomDotRes(int i) {
        o2().LLLLILI(i);
    }

    @Override // X.InterfaceC1648020szI
    public void updateDotVisibility(boolean z) {
        o2().LLLLIL(z);
    }

    private final void init(C19A3 c19a3, List<C1653090t7T> list) {
        String str;
        C1653090t7T next;
        C1653090t7T next2;
        C1653330t7r c1653330t7r;
        Iterator<C1653090t7T> it2 = list.iterator();
        while (it2.hasNext()) {
            observeBottomTabVisibility(c19a3, it2.next());
        }
        this.LLJILLL.LIZ(c19a3, new AObjectS306S0200000_25((Object) new C259800zU(), (Object) c19a3, (InterfaceC1648570t0B) 10));
        Iterator<C1653090t7T> it3 = list.iterator();
        while (true) {
            str = null;
            if (it3.hasNext()) {
                next = it3.next();
                if (next.LIZ.LIZLLL) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        C1653090t7T c1653090t7T = next;
        if (c1653090t7T != null) {
            if (!Intrinsics.LJFF(((C1653090t7T) C13LP.LJJJJZI(list)).LIZ.LIZIZ, "AISelf")) {
                Iterator<C1653090t7T> it4 = list.iterator();
                while (true) {
                    if (it4.hasNext()) {
                        next2 = it4.next();
                        if (next2.LIZ.LIZLLL) {
                            break;
                        }
                    } else {
                        next2 = null;
                        break;
                    }
                }
                C1653090t7T c1653090t7T2 = next2;
                if (c1653090t7T2 != null && (c1653330t7r = c1653090t7T2.LIZ) != null) {
                    str = c1653330t7r.LIZIZ;
                }
                if (!Intrinsics.LJFF("record_mode_editor_tab", str)) {
                    W1(this, c19a3, c1653090t7T, false, 2, null);
                    return;
                }
            }
            changeToDefaultTab(c19a3, c1653090t7T, false);
        }
    }

    private final void setDefaultSelectedTab(C19A3 c19a3, List<C1653090t7T> list) {
        C1653090t7T next;
        if (this.LLJJIJIIJIL) {
            return;
        }
        this.LLJJIJIIJIL = true;
        Iterator<C1653090t7T> it2 = list.iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (next.LIZ.LIZLLL) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        C1653090t7T c1653090t7T = next;
        if (c1653090t7T != null) {
            changeToDefaultTab(c19a3, c1653090t7T, false);
            Z1().LJIILJJIL(c1653090t7T);
        }
    }

    public final void observeBottomTabVisibility(C19A3 c19a3, C1653090t7T c1653090t7T) {
        if (!C12WG.LIZIZ(c19a3) && !c19a3.mViewDestroyed) {
            c1653090t7T.LIZJ.observe(C1447800nmM.LIZIZ(c19a3), new AObjectS185S0300000_25(c19a3, c1653090t7T, this, 13));
        }
    }

    @Override // X.InterfaceC1647930sz9
    public void setBottomSelectedTextColor(int i, int i2) {
        TabHost tabHost = o2().LLJILLL;
        if (tabHost == null) {
            tabHost = null;
        }
        tabHost.LJIIIIZZ(i, i2, false);
    }

    @Override // X.InterfaceC1648020szI
    public void showAIBrandTextByTag(String str, C1655280tB0 c1655280tB0) {
        o2().LLLJL(str, c1655280tB0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AbstractC1653130t7X(C19A3 c19a3, C1DRG c1drg, List<? extends InterfaceC1653190t7d> list) {
        this.LLILLJJLI = c19a3;
        this.LLILLL = c1drg;
        this.LLILZ = list;
        h0<C1647390syH> h0Var = new h0<>(new C1647390syH(null, "RecordShoot15s", 0, false, false, false, null, false, true, 240));
        this.LLJ = h0Var;
        this.LLJI = h0Var;
        this.LLJILJIL = new ArrayList();
        final LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope(c19a3);
        this.LLJILJILJ = new AbstractC1653290t7n(lifecycleScope) { // from class: X.0t7e
        };
        this.LLJILLL = new C560530Lyd<>();
        this.LLJJ = new C560530Lyd<>();
        this.LLJJI = new C560530Lyd<>();
        this.LLJJIII = C452501pT.LIZIZ(new AwS569S0100000_25(this, 514));
        this.LLJJIJI = true;
    }

    public final void changeToDefaultTab(C19A3 c19a3, C1653090t7T c1653090t7T, boolean z) {
        Scene sceneFindSceneByTag = c19a3.findSceneByTag("RecordBottomTabScene");
        if (sceneFindSceneByTag != null) {
            r0 r0Var = (r0) sceneFindSceneByTag;
            int iLLLIIIIL = r0Var.LLLIIIIL(c1653090t7T.LIZ.LIZIZ);
            if (iLLLIIIIL >= 0) {
                r0Var.LLLIZZ(iLLLIIIIL, z, true);
                return;
            }
            return;
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    @Override // X.InterfaceC1648020szI
    public void setCurrentTab(String str, boolean z, int i, boolean z2) {
        Z1().LJIILIIL(str, z, i, z2);
    }

    public static /* synthetic */ void W1(AbstractC1653130t7X abstractC1653130t7X, C19A3 c19a3, C1653090t7T c1653090t7T, boolean z, int i, Object obj) {
        if (obj == null) {
            if ((i & 2) != 0) {
                z = true;
            }
            abstractC1653130t7X.changeToDefaultTab(c19a3, c1653090t7T, z);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: changeToDefaultTab");
    }
}
