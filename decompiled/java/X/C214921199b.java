package X;

import com.bytedance.scene.Scene;
import com.bytedance.scene.navigation.NavigationScene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.SAFExtensionKt;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.199b, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C214921199b extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C199Y LL;
    public final /* synthetic */ InterfaceC214923199d LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C214921199b(C199Y c199y, InterfaceC214923199d interfaceC214923199d) {
        super(0);
        this.LL = c199y;
        this.LLILLJJLI = interfaceC214923199d;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        NavigationScene navigationScene;
        NavigationScene navigationScene2 = this.LL.getNavigationScene();
        if (navigationScene2 != null) {
            navigationScene2.LLJLL = true;
        }
        if (!this.LL.onlyOnePageWhenNavigationOpen() && (navigationScene = this.LL.getNavigationScene()) != null) {
            final C199Y c199y = this.LL;
            navigationScene.LLLIIIIL(c199y, new InterfaceC214930199k() { // from class: X.198n
                @Override // X.InterfaceC214930199k
                public final void LLJJI(Scene scene, Scene scene2, boolean z) {
                    AnonymousClass1993 anonymousClass1993;
                    C1202330hOR c1202330hOR;
                    InterfaceC214902198i interfaceC214902198iLJIILJJIL = SAFExtensionKt.LJIILJJIL(scene2);
                    if (C07GT.LIZ()) {
                        C214905198l.LIZ(interfaceC214902198iLJIILJJIL);
                    } else {
                        C214906198m.Companion.getClass();
                        if (interfaceC214902198iLJIILJJIL != null) {
                            WeakHashMap<InterfaceC214902198i, List<C214906198m>> weakHashMap = C480900ItU.LIZ;
                            synchronized (weakHashMap) {
                                try {
                                    List<C214906198m> list = weakHashMap.get(interfaceC214902198iLJIILJJIL);
                                    if (list == null) {
                                        list = C13BV.INSTANCE;
                                    }
                                    Iterator<C214906198m> it2 = list.iterator();
                                    while (it2.hasNext()) {
                                        it2.next().hookShowIfNeeded$saf_release();
                                    }
                                } catch (Throwable th) {
                                    TryCatchGuardChecker.doCheck(th);
                                    throw th;
                                }
                            }
                        }
                    }
                    if (!c199y.migrateImmersiveBarImplToFragment()) {
                        AnonymousClass1991 anonymousClass1991LIZIZ = null;
                        if (interfaceC214902198iLJIILJJIL != null) {
                            anonymousClass1991LIZIZ = C1800490wxD.LIZIZ(interfaceC214902198iLJIILJJIL);
                        }
                        if ((anonymousClass1991LIZIZ instanceof AnonymousClass1993) && (anonymousClass1993 = (AnonymousClass1993) anonymousClass1991LIZIZ) != null && (c1202330hOR = anonymousClass1993.LJIL) != null && (!c1202330hOR.LIZIZ)) {
                            C1202340hOS.LIZIZ(c199y, c1202330hOR);
                        }
                    }
                }
            });
        }
        C199Y c199y2 = this.LL;
        c199y2.sceneLifecycleDispatcher = this.LLILLJJLI;
        c199y2.getEvent().LJIILIIL = this.LL.getEnableNavigation();
        C199Z event = this.LL.getEvent();
        if (event.LIZJ != -1) {
            event.LIZLLL = System.currentTimeMillis() - event.LIZJ;
        }
        return Unit.LIZ;
    }
}
