package X;

import android.view.View;
import com.bytedance.android.livesdk.comp.impl.game.partnership.mixlayout.business.host.gamedetail.GameDetailMixPageBaseFragment;
import com.bytedance.android.livesdk.comp.impl.game.partnership.mixlayout.framework.model.MixTabModel;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0z4J, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1881770z4J extends C09AY implements Function0<C1881780z4K> {
    public final /* synthetic */ C1881590z41 LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1881770z4J(C1881590z41 c1881590z41) {
        super(0);
        this.LL = c1881590z41;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [X.0z4K] */
    @Override // kotlin.jvm.functions.Function0
    public final C1881780z4K invoke() {
        final C1881590z41 c1881590z41 = this.LL;
        return new InterfaceC1883320z6o() { // from class: X.0z4K
            @Override // X.InterfaceC1883320z6o
            public final void LIZ(final C1881800z4M c1881800z4M) {
                int i;
                InterfaceC1881340z3c interfaceC1881340z3cLJIIIZ;
                final GameDetailMixPageBaseFragment gameDetailMixPageBaseFragment = c1881590z41.LLJJIJIL;
                if (gameDetailMixPageBaseFragment != null && (i = c1881800z4M.LIZ) >= 0) {
                    gameDetailMixPageBaseFragment.LLJILJILJ = i;
                    gameDetailMixPageBaseFragment.LLJJIJI = i;
                    if (i == 0) {
                        C1881590z41 c1881590z412 = gameDetailMixPageBaseFragment.LLJZIJLIL;
                        if (c1881590z412 != null) {
                            interfaceC1881340z3cLJIIIZ = c1881590z412.LJIIIZ();
                        } else {
                            interfaceC1881340z3cLJIIIZ = null;
                        }
                        C1880070z1Z.LJIIJ(interfaceC1881340z3cLJIIIZ, 0, "click");
                    }
                    View view = gameDetailMixPageBaseFragment.getView();
                    if (view != null) {
                        C476770Imp.LIZIZ(view, new Runnable() { // from class: X.0z72
                            @Override // java.lang.Runnable
                            public final void run() {
                                boolean zLIZ;
                                C1883550z7B c1883550z7BLJJ;
                                C1883100z6S c1883100z6S;
                                C1884300z8O c1884300z8O;
                                C1884370z8V c1884370z8V;
                                C1C7U.LIZ("GameDetailMixPageBaseFragment@91f6.onJumpToDefaultTab$1");
                                try {
                                    GameDetailMixPageBaseFragment gameDetailMixPageBaseFragment2 = gameDetailMixPageBaseFragment;
                                    if (!gameDetailMixPageBaseFragment2.isDetached() && !gameDetailMixPageBaseFragment2.isRemoving()) {
                                        gameDetailMixPageBaseFragment.aS(c1881800z4M.LIZ);
                                        GameDetailMixPageBaseFragment gameDetailMixPageBaseFragment3 = gameDetailMixPageBaseFragment;
                                        int i2 = c1881800z4M.LIZ;
                                        C1881590z41 c1881590z413 = gameDetailMixPageBaseFragment3.LLJZIJLIL;
                                        if (c1881590z413 != null && (c1883550z7BLJJ = c1881590z413.LJJ()) != null && (c1883100z6S = (C1883100z6S) C13LP.LJJJLZIJ(i2, c1883550z7BLJJ.LLJJJIL)) != null && (c1884300z8O = c1883100z6S.LLIZLLLIL) != null && (c1884370z8V = gameDetailMixPageBaseFragment3.LLJJLIIIJLLLLLLLZ) != null) {
                                            c1884370z8V.setCurChildNestScrollView(c1884300z8O);
                                        }
                                    }
                                } finally {
                                    if (!zLIZ) {
                                    }
                                }
                                C1C7U.LIZIZ("GameDetailMixPageBaseFragment@91f6.onJumpToDefaultTab$1");
                            }
                        }, 100L);
                    }
                }
            }

            @Override // X.InterfaceC1883320z6o
            public final String LIZIZ(String str, List list) {
                c1881590z41.LJJIJ(list);
                String strLJFF = C1882380z5I.LJFF(c1881590z41.LJII(), "default_tab");
                if (strLJFF.length() != 0 && (!(list instanceof Collection) || !list.isEmpty())) {
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        if (Intrinsics.LJFF(((MixTabModel) it2.next()).tabClass, strLJFF)) {
                            return strLJFF;
                        }
                    }
                }
                return str;
            }
        };
    }
}
