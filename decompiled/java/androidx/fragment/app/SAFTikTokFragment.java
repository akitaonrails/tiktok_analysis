package androidx.fragment.app;

import X.AnonymousClass1991;
import X.AnonymousClass1993;
import X.AnonymousClass1997;
import X.C01GW;
import X.C07DO;
import X.C07GT;
import X.C0AF2;
import X.C0WZX;
import X.C1202330hOR;
import X.C1202340hOS;
import X.C1202970hPT;
import X.C1254880ilC;
import X.C12WP;
import X.C1361400lX0;
import X.C1389600mGU;
import X.C1447800nmM;
import X.C1701330uNH;
import X.C1800500wxE;
import X.C1954807lC;
import X.C195P;
import X.C199F;
import X.C19BL;
import X.C19CH;
import X.C19CI;
import X.C19CJ;
import X.C19CK;
import X.C19CL;
import X.C19CM;
import X.C19CN;
import X.C19CO;
import X.C19CP;
import X.C19CQ;
import X.C19CR;
import X.C19CS;
import X.C19CT;
import X.C19CU;
import X.C19CV;
import X.C19CW;
import X.C19CX;
import X.C19CY;
import X.C19DL;
import X.C19EG;
import X.C19EH;
import X.C20277814Wa;
import X.C21392718nl;
import X.C214794194e;
import X.C214798194i;
import X.C214905198l;
import X.C214906198m;
import X.C214908198o;
import X.C2188811AlT;
import X.C2204961BRm;
import X.C2350509Ix;
import X.C294780Bgy;
import X.C452501pT;
import X.C488650JEh;
import X.C665300Q7s;
import X.C721560SSc;
import X.C755440TkE;
import X.C960203pA;
import X.EnumC214943199x;
import X.EnumC569750MWf;
import X.InterfaceC1670800ta2;
import X.InterfaceC21392018ne;
import X.InterfaceC214897198d;
import X.InterfaceC214902198i;
import X.InterfaceC214918198y;
import X.InterfaceC21503819Do;
import X.InterfaceC687720QyI;
import X.InterfaceC721300SRc;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.foundation.activity.BaseActivity;
import com.bytedance.ies.foundation.saf.shell.SafTikTokShellActivity;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.bytedance.scene.navigation.NavigationScene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.sheet.BaseSheet;
import com.ss.android.ugc.aweme.SAFFragmentRootScene;
import com.ss.android.ugc.aweme.base.activity.IActivityTransition;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS398S0200000_32;
import kotlin.jvm.internal.AwS576S0100000_32;
import kotlin.jvm.internal.AwS611S0100000_32;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.EventBus;

/* JADX INFO: loaded from: classes33.dex */
public class SAFTikTokFragment extends Fragment implements InterfaceC214902198i, InterfaceC21503819Do, InterfaceC687720QyI {
    public static final String _pnsPageId = "KSsoOyA6LD1iLz0yLygpJzt9KTHELIOSU8ZxwSDhElIhs8IwM+KCg+LSs4";
    public boolean LL;
    public SAFFragmentRootScene LLILLJJLI;
    public final CopyOnWriteArraySet<C19CP> LLILLL = new CopyOnWriteArraySet<>();
    public final AnonymousClass1993 LLILZ;
    public final C214794194e LLILZIL;
    public int LLILZLL;
    public int LLIZ;
    public boolean LLIZLLLIL;
    public final C01GW LLJ;
    public final List<Function1<C19CP, Unit>> LLJI;
    public final C19CX LLJIJIL;
    public final C01GW LLJILJIL;
    public boolean LLJILJILJ;

    @Override // X.InterfaceC214902198i
    public void LJLLLL() {
    }

    @Override // X.InterfaceC214902198i
    public void LLLLIILLL(Bundle bundle) {
    }

    @Override // X.InterfaceC21503819Do
    public final void Q9(Activity activity) {
    }

    @Override // X.InterfaceC214902198i
    public InterfaceC214918198y U5() {
        return null;
    }

    public C19CX UR() {
        return null;
    }

    @Override // X.InterfaceC21503819Do
    public /* synthetic */ void ap() {
    }

    @Override // X.InterfaceC214902198i
    public Boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return null;
    }

    @Override // X.InterfaceC214902198i
    public Boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return null;
    }

    @Override // X.InterfaceC214902198i
    public void gv(int i, String[] strArr, int[] iArr) {
    }

    @Override // X.InterfaceC21503819Do
    public final void onActivityFinish() {
    }

    @Override // X.InterfaceC214902198i
    public boolean onBackPressed() {
        return false;
    }

    @Override // X.InterfaceC214902198i
    public Boolean onKeyDown(int i, KeyEvent keyEvent) {
        return null;
    }

    @Override // X.InterfaceC214902198i
    public Boolean onKeyLongPress(int i, KeyEvent keyEvent) {
        return null;
    }

    @Override // X.InterfaceC214902198i
    public Boolean onKeyUp(int i, KeyEvent keyEvent) {
        return null;
    }

    @Override // X.InterfaceC214902198i
    public void onRestoreInstanceState(Bundle bundle) {
    }

    @Override // X.InterfaceC214902198i
    public boolean onResult(int i, int i2, Intent intent) {
        return false;
    }

    @Override // X.InterfaceC214902198i
    public void tM() {
    }

    @Override // X.InterfaceC214902198i
    public void zd() {
    }

    private final void NR() {
        for (Function1 function1 : this.LLJI) {
            Iterator<C19CP> it2 = this.LLILLL.iterator();
            while (it2.hasNext()) {
                function1.invoke(it2.next());
            }
        }
        this.LLJI.clear();
    }

    private final C19DL OR() {
        return (C19DL) this.LLJ.getValue();
    }

    private final boolean PR() {
        return ((Boolean) this.LLJILJIL.getValue()).booleanValue();
    }

    private final boolean RR() {
        return this.LLILZ.LJ;
    }

    @Override // X.InterfaceC214902198i
    public void finish() {
        if (C0AF2.LIZIZ) {
            this.LLJILJILJ = true;
        }
        if (C07GT.LIZ()) {
            C214905198l.LIZIZ(this);
        }
        if (PR()) {
            C1800500wxE.LIZ(this);
            return;
        }
        C19EG activity = getActivity();
        if (activity != null) {
            activity.finish();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        dS(new AwS611S0100000_32(this, 6));
        super.onDestroy();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        if (this.LLILZ.LJJIFFI) {
            EventBus eventBusLIZLLL = EventBus.LIZLLL();
            if (eventBusLIZLLL.LJIIJ(this)) {
                eventBusLIZLLL.LJJI(this);
            }
        }
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        dS(new AwS611S0100000_32(this, 7));
        super.onPause();
    }

    @Override // X.InterfaceC214902198i
    public void onRelease() {
        dS(new AwS611S0100000_32(this, 8));
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        dS(new C19CQ(this));
        super.onResume();
        C19DL c19dlOR = OR();
        if (c19dlOR != null) {
            c19dlOR.LIZIZ(requireActivity());
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        dS(new C19CR(this));
        super.onStart();
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        dS(new AwS611S0100000_32(this, 9));
        super.onStop();
        C19DL c19dlOR = OR();
        if (c19dlOR != null) {
            c19dlOR.LIZJ(requireActivity());
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void performAttach() {
        gS(new C19CV(this));
        super.performAttach();
        gS(new C19CW(this));
    }

    @Override // androidx.fragment.app.Fragment
    public void performDestroy() {
        dS(new AwS611S0100000_32(this, 10));
        super.performDestroy();
        dS(new AwS611S0100000_32(this, 11));
    }

    @Override // androidx.fragment.app.Fragment
    public void performPause() {
        dS(new AwS611S0100000_32(this, 12));
        super.performPause();
        dS(new AwS611S0100000_32(this, 13));
    }

    @Override // androidx.fragment.app.Fragment
    public void performResume() {
        dS(new C19CS(this));
        super.performResume();
        dS(new C19CT(this));
    }

    @Override // androidx.fragment.app.Fragment
    public void performStart() {
        dS(new C19CN(this));
        super.performStart();
        dS(new C19CO(this));
    }

    @Override // androidx.fragment.app.Fragment
    public void performStop() {
        dS(new AwS611S0100000_32(this, 4));
        super.performStop();
        dS(new AwS611S0100000_32(this, 5));
    }

    public SAFTikTokFragment() {
        AnonymousClass1993 anonymousClass1993 = new AnonymousClass1993(0);
        this.LLILZ = anonymousClass1993;
        this.LLILZIL = new C214794194e(new C214798194i());
        aS(new AnonymousClass1997(this));
        this.LLILZLL = anonymousClass1993.LJJ;
        this.LLIZ = anonymousClass1993.LJJI;
        this.LLIZLLLIL = anonymousClass1993.LIZLLL;
        this.LLJ = C452501pT.LIZIZ(new C19CL(this));
        this.LLJI = new CopyOnWriteArrayList();
        this.LLJILJIL = C452501pT.LIZIZ(new C1202970hPT(this));
    }

    public final C19CY SR() {
        FragmentManager fragmentManager;
        SAFFragmentRootScene sAFFragmentRootSceneIb = ib();
        if (sAFFragmentRootSceneIb == null || (fragmentManager = sAFFragmentRootSceneIb.getFragmentManager()) == null) {
            return null;
        }
        return fragmentManager.LJJLIIJ();
    }

    @Override // X.InterfaceC214902198i
    public boolean W1() {
        SAFFragmentRootScene sAFFragmentRootSceneIb = ib();
        if (sAFFragmentRootSceneIb != null) {
            return sAFFragmentRootSceneIb.W1();
        }
        return false;
    }

    public boolean WR() {
        InterfaceC214897198d interfaceC214897198d;
        InterfaceC1670800ta2 activity = getActivity();
        if (C294780Bgy.LIZ()) {
            if (!(activity instanceof InterfaceC214897198d) || (interfaceC214897198d = (InterfaceC214897198d) activity) == null) {
                return false;
            }
        } else if (!(activity instanceof InterfaceC214897198d) || (interfaceC214897198d = (InterfaceC214897198d) activity) == null || !interfaceC214897198d.getEnableSAF()) {
            return false;
        }
        return interfaceC214897198d.migrateDarkModeImplToFragment();
    }

    @Override // X.InterfaceC214902198i
    public void YP() {
        InterfaceC214897198d interfaceC214897198d;
        C1202330hOR c1202330hOR;
        BaseActivity baseActivity;
        C1361400lX0 c1361400lX0;
        if (PR() && !RR()) {
            InterfaceC1670800ta2 activity = getActivity();
            if (C294780Bgy.LIZ()) {
                if (!(activity instanceof InterfaceC214897198d) || (interfaceC214897198d = (InterfaceC214897198d) activity) == null) {
                    return;
                }
            } else if (!(activity instanceof InterfaceC214897198d) || (interfaceC214897198d = (InterfaceC214897198d) activity) == null || !interfaceC214897198d.getEnableSAF()) {
                return;
            }
            if (WR()) {
                C19EG activity2 = getActivity();
                if (!(activity2 instanceof BaseActivity) || (baseActivity = (BaseActivity) activity2) == null) {
                    return;
                }
                C755440TkE.LIZ(baseActivity);
                if (C960203pA.LIZIZ(baseActivity) && baseActivity.isDarkModeSupported()) {
                    SAFFragmentRootScene sAFFragmentRootSceneIb = ib();
                    Context sceneContext = sAFFragmentRootSceneIb != null ? sAFFragmentRootSceneIb.getSceneContext() : null;
                    if ((sceneContext instanceof C488650JEh) && (c1361400lX0 = (C1361400lX0) sceneContext) != null) {
                        c1361400lX0.setTheme(R.style.y0);
                    }
                }
            }
            if (C665300Q7s.LIZ() || !interfaceC214897198d.migrateImmersiveBarImplToFragment() || (c1202330hOR = this.LLILZ.LJIL) == null || c1202330hOR.LIZIZ) {
                return;
            }
            C1202340hOS.LIZJ(C1202340hOS.LIZ(this, c1202330hOR, true, false), c1202330hOR);
        }
    }

    public final boolean ZR() {
        NavigationScene navigationSceneLIZ;
        SAFFragmentRootScene sAFFragmentRootSceneIb = ib();
        if (sAFFragmentRootSceneIb == null || (navigationSceneLIZ = C1447800nmM.LIZ(sAFFragmentRootSceneIb)) == null) {
            return false;
        }
        C12WP.LIZ();
        if (!C19BL.LJ(navigationSceneLIZ.mActivity) || sAFFragmentRootSceneIb.mState == EnumC214943199x.NONE) {
            return true;
        }
        if (sAFFragmentRootSceneIb.mParentScene != navigationSceneLIZ) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Scene ");
            sbLIZ.append(SAFFragmentRootScene.class.getName());
            sbLIZ.append(" parent is incorrect");
            throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
        }
        if (!sAFFragmentRootSceneIb.mSceneRestoreEnabled) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("Scene ");
            sbLIZ2.append(SAFFragmentRootScene.class.getName());
            sbLIZ2.append(" don't support restore, so it can't use recreate");
            throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ2));
        }
        if (C2350509Ix.LIZJ(sAFFragmentRootSceneIb)) {
            navigationSceneLIZ.LLJILJILJ.LJJIJIL(sAFFragmentRootSceneIb, 4);
            return true;
        }
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("Scene ");
        sbLIZ3.append(SAFFragmentRootScene.class.getName());
        sbLIZ3.append(" must be a public class or public static class, and have only one parameterless constructor to be properly recreated.");
        throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ3));
    }

    @Override // androidx.fragment.app.Fragment
    public void performViewCreated() {
        super.performViewCreated();
        gS(new C19CK(this));
    }

    @Override // X.InterfaceC21503819Do
    public final void tv() {
        if (onBackPressed()) {
            return;
        }
        C20277814Wa.LIZIZ(this);
    }

    @Override // X.InterfaceC214902198i
    public void uB() {
        YP();
        NR();
    }

    @Override // X.InterfaceC214902198i
    public void uk() {
        FragmentManager supportFragmentManager;
        if (!C07GT.LIZ()) {
            C214906198m.Companion.getClass();
            C214908198o.LIZ(this);
        }
        C19EG activity = getActivity();
        if (activity == null || (supportFragmentManager = activity.getSupportFragmentManager()) == null) {
            return;
        }
        List<Fragment> listLJJLIIIJL = supportFragmentManager.LJJLIIIJL();
        ArrayList arrayList = new ArrayList();
        for (Fragment fragment : listLJJLIIIJL) {
            if (fragment instanceof BaseSheet) {
                arrayList.add(fragment);
            }
        }
        if (!arrayList.isEmpty()) {
            C19EH c19ehLJIIJ = supportFragmentManager.LJIIJ();
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                c19ehLJIIJ.LJIIZILJ((Fragment) it2.next());
            }
            try {
                if (((Boolean) C07DO.LIZIZ.getValue()).booleanValue()) {
                    c19ehLJIIJ.LJIIJ();
                } else {
                    c19ehLJIIJ.LJIIL();
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                if (!((Boolean) C07DO.LIZJ.getValue()).booleanValue()) {
                    throw th;
                }
            }
        }
    }

    @Override // X.InterfaceC687720QyI
    public final boolean Pk() {
        return this.LL;
    }

    @Override // X.InterfaceC214902198i
    public final boolean SL() {
        return this.LLJILJILJ;
    }

    public final AnonymousClass1993 VR() {
        return this.LLILZ;
    }

    @Override // X.InterfaceC214902198i
    public final C214794194e ej() {
        return this.LLILZIL;
    }

    @Override // X.InterfaceC214902198i
    public SAFFragmentRootScene ib() {
        return this.LLILLJJLI;
    }

    @Override // X.InterfaceC214902198i
    public void zB() {
        uk();
    }

    public static Bundle MR(Intent intent) {
        try {
            return intent.getExtras();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    private final void dS(Function1<? super C19CP, Unit> function1) {
        if (C665300Q7s.LIZ()) {
            this.LLJI.add(function1);
            return;
        }
        NR();
        Iterator<C19CP> it2 = this.LLILLL.iterator();
        while (it2.hasNext()) {
            function1.invoke(it2.next());
        }
    }

    private final void gS(Function0<Unit> function0) {
        if (C665300Q7s.LIZ()) {
            dS(new C19CU(function0));
        }
    }

    @Override // X.InterfaceC21503819Do
    public final void FE(Bundle bundle) {
        onRestoreInstanceState(bundle);
    }

    @Override // X.InterfaceC214902198i
    public void Ne(SAFFragmentRootScene sAFFragmentRootScene) {
        this.LLILLJJLI = sAFFragmentRootScene;
    }

    @Override // X.InterfaceC214902198i
    public void U1(Bundle bundle) {
        YP();
        dS(new AwS398S0200000_32(this, bundle, 1));
    }

    @Override // X.InterfaceC21503819Do
    public final void WK(boolean z) {
        onWindowFocusChanged(z);
    }

    public final void aS(Function1<? super AnonymousClass1993, Unit> function1) {
        Pair<Integer, Integer> pairLIZ;
        Pair<Integer, Integer> pairLIZ2;
        EnumC569750MWf enumC569750MWf;
        NavigationScene navigationSceneLIZ;
        AnonymousClass1993 anonymousClass1993 = this.LLILZ;
        function1.invoke(anonymousClass1993);
        InterfaceC721300SRc interfaceC721300SRc = anonymousClass1993.LIZJ;
        if (interfaceC721300SRc != null) {
            SAFFragmentRootScene sAFFragmentRootSceneIb = ib();
            C214794194e c214794194e = this.LLILZIL;
            if (interfaceC721300SRc instanceof C721560SSc) {
                if (sAFFragmentRootSceneIb != null && (navigationSceneLIZ = C1447800nmM.LIZ(sAFFragmentRootSceneIb)) != null) {
                    navigationSceneLIZ.LLLLLJLJLL(sAFFragmentRootSceneIb, ((C721560SSc) interfaceC721300SRc).LIZ);
                }
            } else if (interfaceC721300SRc instanceof InterfaceC21392018ne) {
                c214794194e.LJIIL(new C195P((InterfaceC21392018ne) interfaceC721300SRc));
            } else if (!(interfaceC721300SRc instanceof C21392718nl)) {
                throw new C1954807lC();
            }
        } else {
            int i = anonymousClass1993.LJJ;
            int i2 = anonymousClass1993.LJJI;
            if (i != this.LLILZLL || Intrinsics.LJFF(anonymousClass1993.LJFF, AnonymousClass1991.LJIJJLI)) {
                C1254880ilC.LIZ.getClass();
                IActivityTransition iActivityTransition = (IActivityTransition) PluggableExtentionKt.pluggableSpi$default(IActivityTransition.class, false, false, false, 14, null);
                if (iActivityTransition == null || (pairLIZ = iActivityTransition.LIZ(i, true)) == null) {
                    pairLIZ = C1254880ilC.LIZIZ;
                }
                anonymousClass1993.LJFF = pairLIZ;
            }
            if (i2 != this.LLIZ || Intrinsics.LJFF(anonymousClass1993.LJI, AnonymousClass1991.LJIJJLI)) {
                C1254880ilC.LIZ.getClass();
                IActivityTransition iActivityTransition2 = (IActivityTransition) PluggableExtentionKt.pluggableSpi$default(IActivityTransition.class, false, false, false, 14, null);
                if (iActivityTransition2 == null || (pairLIZ2 = iActivityTransition2.LIZ(i2, false)) == null) {
                    pairLIZ2 = C1254880ilC.LIZIZ;
                }
                anonymousClass1993.LJI = pairLIZ2;
            }
            if (C1389600mGU.LIZ()) {
                anonymousClass1993.LJFF = new Pair<>(-1, -1);
                anonymousClass1993.LJI = new Pair<>(-1, -1);
            }
        }
        boolean z = anonymousClass1993.LIZLLL;
        if (z != this.LLIZLLLIL) {
            SAFFragmentRootScene sAFFragmentRootSceneIb2 = ib();
            if (sAFFragmentRootSceneIb2 != null) {
                if (z) {
                    enumC569750MWf = EnumC569750MWf.TO_TRANSLUCENT;
                } else {
                    enumC569750MWf = EnumC569750MWf.FROM_TRANSLUCENT;
                }
                NavigationScene navigationSceneLIZ2 = C1447800nmM.LIZ(sAFFragmentRootSceneIb2);
                if (navigationSceneLIZ2 != null) {
                    navigationSceneLIZ2.LLLILZ(sAFFragmentRootSceneIb2, enumC569750MWf);
                }
            }
            this.LLIZLLLIL = anonymousClass1993.LIZLLL;
        }
        this.LL = anonymousClass1993.LJJIIJ;
    }

    public final void bS(boolean z) {
        this.LLJILJILJ = z;
    }

    public final void cS(boolean z) {
        this.LL = z;
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        dS(new C19CH(this, bundle));
        super.onCreate(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        dS(new AwS398S0200000_32(this, bundle, 2));
        super.onSaveInstanceState(bundle);
        dS(new AwS398S0200000_32(this, bundle, 3));
    }

    @Override // X.InterfaceC214902198i
    public void onWindowFocusChanged(boolean z) {
        if (OR() != null) {
            C19DL.LIZLLL(requireActivity(), z);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void performCreate(Bundle bundle) {
        gS(new AwS576S0100000_32(this, 4));
        dS(new C19CI(this, bundle));
        super.performCreate(bundle);
        dS(new C19CJ(this, bundle));
        gS(new C19CM(this));
    }

    @Override // androidx.fragment.app.Fragment
    public void performSaveInstanceState(Bundle bundle) {
        dS(new AwS398S0200000_32(this, bundle, 4));
        super.performSaveInstanceState(bundle);
    }

    @Override // X.InterfaceC21503819Do
    public final void qO(Intent intent) {
        Bundle bundleMR;
        if (intent != null) {
            bundleMR = MR(intent);
        } else {
            bundleMR = null;
        }
        LLLLIILLL(bundleMR);
    }

    @Override // X.InterfaceC214902198i
    public void rm(C19CP c19cp) {
        this.LLILLL.remove(c19cp);
    }

    @Override // X.InterfaceC214902198i
    public void uG(C19CP c19cp) {
        this.LLILLL.add(c19cp);
    }

    @Override // X.InterfaceC21503819Do
    public final Boolean onActivityKeyDown(int i, KeyEvent keyEvent) {
        return onKeyDown(i, keyEvent);
    }

    @Override // X.InterfaceC21503819Do
    public final Boolean onActivityKeyLongPress(int i, KeyEvent keyEvent) {
        return onKeyLongPress(i, keyEvent);
    }

    @Override // X.InterfaceC21503819Do
    public final Boolean onActivityKeyUp(int i, KeyEvent keyEvent) {
        return onKeyUp(i, keyEvent);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        if (this.LLILZ.LJJIFFI) {
            EventBus eventBusLIZLLL = EventBus.LIZLLL();
            if (!eventBusLIZLLL.LJIIJ(this)) {
                eventBusLIZLLL.LJIJJ(this);
            }
        }
        super.onViewCreated(view, bundle);
    }

    @Override // X.InterfaceC214902198i
    public final void pg(Activity activity, Bundle bundle) {
        Integer num;
        Intent intent = new Intent();
        int i = C199F.LIZ[this.LLILZ.LIZ.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    num = null;
                } else {
                    throw new C1954807lC();
                }
            } else {
                num = 335544320;
            }
        } else {
            num = 536870912;
        }
        intent.setClass(activity, SafTikTokShellActivity.class);
        if (num != null) {
            intent.addFlags(num.intValue());
        }
        intent.putExtra("rootFragmentClassName", getClass().getName());
        intent.putExtras(bundle);
        RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(activity, intent, "Context_startActivity_1");
        C1701330uNH.LIZ(intent, activity);
        C2204961BRm.LJIILLIIL(activity, intent, new C0WZX("dzBzEgAjS8/YVFkiQFyNY/5Yo2Rd7j/xaP3wGqYFF+Blw9+tkrE0o+gHnldL1nkhIdtU", null));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        onResult(i, i2, intent);
        super.onActivityResult(i, i2, intent);
    }

    @Override // androidx.fragment.app.Fragment
    public void performCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        if (!PR()) {
            super.performCreateView(layoutInflater, viewGroup, bundle);
        } else {
            YP();
            super.performCreateView(layoutInflater, viewGroup, bundle);
        }
    }

    @Override // X.InterfaceC21503819Do
    public final void ur(int i, int i2, Intent intent) {
        if (!onResult(i, i2, intent)) {
            C20277814Wa.LIZ(this, i, i2, intent);
        }
    }
}
