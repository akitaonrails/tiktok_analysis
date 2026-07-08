package X;

import com.bytedance.scene.Scene;
import com.bytedance.scene.navigation.NavigationScene;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.tools.mvtemplate.search.datasource.TemplateSearchNetApi;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS210S0000000_22;
import kotlin.jvm.internal.AwS566S0100000_22;
import kotlin.jvm.internal.AwS636S0100000_22;

/* JADX INFO: renamed from: X.0nD7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1425950nD7 extends AbstractC2255721DQs<InterfaceC1422590n7h> implements InterfaceC1422590n7h {
    public static final int LLJILJIL = 8;
    public final C1DRG LL;
    public final NavigationScene LLILLJJLI;
    public NavigationScene LLIZLLLIL;
    public final C1422530n7b LLJIJIL;
    public final InterfaceC1422590n7h LLILLL = this;
    public final C01GW LLILZ = C452501pT.LIZIZ(AFwS210S0000000_22.get$arr$(314));
    public final List<Function0<Boolean>> LLILZIL = new ArrayList();
    public final List<Function1<Boolean, Unit>> LLILZLL = new ArrayList();
    public final List<InterfaceC1422390n7N> LLIZ = new ArrayList();
    public final Function0<Boolean> LLJ = new AwS566S0100000_22(this, 835);
    public final C01GW LLJI = C452501pT.LIZIZ(AFwS210S0000000_22.get$arr$(315));

    private final boolean w2() {
        List<Scene> sceneList;
        NavigationScene navigationScene = this.LLIZLLLIL;
        return (navigationScene == null || (sceneList = navigationScene.getSceneList()) == null || sceneList.size() != 1) ? false : true;
    }

    @Override // X.InterfaceC1422590n7h
    /* JADX INFO: renamed from: G2, reason: merged with bridge method [inline-methods] */
    public C1425920nD4 p10() {
        return (C1425920nD4) this.LLILZ.getValue();
    }

    @Override // X.InterfaceC1422590n7h
    public InterfaceC816210W0d<TemplateSearchNetApi> UA() {
        return (InterfaceC816210W0d) this.LLJI.getValue();
    }

    @Override // X.InterfaceC1422590n7h
    public boolean zM1() {
        List<Scene> sceneList;
        NavigationScene navigationScene = this.LLIZLLLIL;
        return !(navigationScene == null || (sceneList = navigationScene.getSceneList()) == null || sceneList.isEmpty());
    }

    @Override // X.AbstractC2255721DQs
    public void onDestroy() {
        super.onDestroy();
        this.LLILZIL.clear();
        this.LLILZLL.clear();
        this.LLIZ.clear();
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        return this.LLILLL;
    }

    @Override // X.InterfaceC1422590n7h
    public C1422530n7b iF() {
        return this.LLJIJIL;
    }

    public InterfaceC1422590n7h o2() {
        return this.LLILLL;
    }

    private final void H2(C19BM c19bm) {
        this.LLIZ.clear();
        this.LLILZIL.clear();
        NavigationScene navigationScene = this.LLILLJJLI;
        if (navigationScene != null) {
            navigationScene.LLLLLLLZIL(new C1466910oHB(this.LLJ, 6));
            navigationScene.LLLLLLIL(X1(c19bm));
        }
        this.LLIZLLLIL = null;
        Iterator<Function1<Boolean, Unit>> it2 = this.LLILZLL.iterator();
        while (it2.hasNext()) {
            it2.next().invoke(Boolean.FALSE);
        }
        this.LLILZLL.clear();
    }

    private final void W1(Function2<? super C539960LFq, ? super C1424220nAK, Unit> function2) {
        if (this.LLILLJJLI == null || this.LLIZLLLIL != null) {
            return;
        }
        NavigationScene navigationSceneLIZ = C214871197d.LIZ(new C1425970nD9(this.LL, new AwS636S0100000_22(function2, (Function2<? super C539960LFq, ? super C1424220nAK, Unit>) 40)));
        this.LLIZLLLIL = navigationSceneLIZ;
        NavigationScene navigationScene = this.LLILLJJLI;
        navigationScene.LLLLLLLLLL(navigationSceneLIZ, null);
        navigationScene.LLLIILIL(navigationSceneLIZ, new C1466910oHB(this.LLJ, 6));
        Iterator<Function1<Boolean, Unit>> it2 = this.LLILZLL.iterator();
        while (it2.hasNext()) {
            it2.next().invoke(Boolean.TRUE);
        }
    }

    private final C19BM X1(C19BM c19bm) {
        if (c19bm == null) {
            C560320LyI c560320LyI = new C560320LyI();
            c560320LyI.LIZ = new C190U();
            return c560320LyI.LIZ();
        }
        return c19bm;
    }

    private final C19AL Z1(C19AL c19al) {
        if (c19al == null) {
            C569760MWg c569760MWg = new C569760MWg();
            c569760MWg.LIZJ = new C214798194i();
            return c569760MWg.LIZ();
        }
        return c19al;
    }

    @Override // X.InterfaceC1422590n7h
    public void BN2(InterfaceC1422390n7N interfaceC1422390n7N) {
        this.LLIZ.remove(interfaceC1422390n7N);
    }

    @Override // X.InterfaceC1422590n7h
    public void J70(Function0<Boolean> function0) {
        this.LLILZIL.add(function0);
    }

    @Override // X.InterfaceC1422590n7h
    public void fv2(Function1<? super Boolean, Unit> function1) {
        this.LLILZLL.add(function1);
    }

    @Override // X.InterfaceC1422590n7h
    public void gO(Function1<? super Boolean, Unit> function1) {
        this.LLILZLL.remove(function1);
    }

    @Override // X.InterfaceC1422590n7h
    public void rB1(InterfaceC1422390n7N interfaceC1422390n7N) {
        this.LLIZ.add(interfaceC1422390n7N);
    }

    @Override // X.InterfaceC1422590n7h
    public void wC2(C19BM c19bm) {
        NavigationScene navigationScene = this.LLIZLLLIL;
        if (navigationScene == null) {
            return;
        }
        if (w2()) {
            H2(c19bm);
        } else {
            navigationScene.LLLLLLIL(X1(c19bm));
        }
    }

    @Override // X.InterfaceC1422590n7h
    public void ya0(Function0<Boolean> function0) {
        this.LLILZIL.remove(function0);
    }

    @Override // X.InterfaceC1422590n7h
    public void Cf1(Scene scene, C19AL c19al) {
        NavigationScene navigationScene = this.LLIZLLLIL;
        if (navigationScene != null) {
            navigationScene.LLLLLLLLLL(scene, Z1(c19al));
        }
    }

    @Override // X.InterfaceC1422590n7h
    public void FT(C1422410n7P c1422410n7P, Function2<? super InterfaceC1422390n7N, ? super C1422410n7P, Unit> function2) {
        Iterator<InterfaceC1422390n7N> it2 = this.LLIZ.iterator();
        while (it2.hasNext()) {
            function2.invoke(it2.next(), c1422410n7P);
        }
    }

    public C1425950nD7(C1DRG c1drg, ShortVideoContext shortVideoContext, NavigationScene navigationScene) {
        this.LL = c1drg;
        this.LLILLJJLI = navigationScene;
        this.LLJIJIL = new C1422530n7b(shortVideoContext);
    }

    @Override // X.InterfaceC1422590n7h
    public void qp1(C19AL c19al, Function1<? super Boolean, Unit> function1, Function2<? super C539960LFq, ? super C1424220nAK, Unit> function2) {
        NavigationScene navigationScene = this.LLIZLLLIL;
        if (navigationScene == null) {
            if (function1 != null) {
                this.LLILZLL.add(function1);
            }
            W1(function2);
            return;
        }
        navigationScene.LLLLLLLLLL(new C1425970nD9(this.LL, new AwS636S0100000_22(function2, (Function2<? super C539960LFq, ? super C1424220nAK, Unit>) 41)), Z1(c19al));
    }
}
