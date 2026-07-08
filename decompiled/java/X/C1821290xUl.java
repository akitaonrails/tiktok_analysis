package X;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.live.actionhandler.IActionHandlerService;
import com.bytedance.android.live.design.view.sheet.LiveSheetFragment;
import com.bytedance.assem.arch.core.UIAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0xUl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1821290xUl extends C09AY implements Function2<UIAssem, C291001Au<? extends AbstractC1821320xUo>, Unit> {
    public C1821290xUl() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(UIAssem uIAssem, C291001Au<? extends AbstractC1821320xUo> c291001Au) {
        final AbstractC1821320xUo abstractC1821320xUoLIZ;
        LiveSheetFragment liveSheetFragment;
        C20484615Do c20484615Do;
        FragmentManager parentFragmentManager;
        LiveSheetFragment liveSheetFragment2;
        C20484615Do c20484615Do2;
        LiveSheetFragment liveSheetFragment3;
        final UIAssem uIAssem2 = uIAssem;
        C291001Au<? extends AbstractC1821320xUo> c291001Au2 = c291001Au;
        if (c291001Au2 != null && (abstractC1821320xUoLIZ = c291001Au2.LIZ()) != null) {
            if (abstractC1821320xUoLIZ instanceof C1821300xUm) {
                ((IActionHandlerService) C1161920gLG.LIZJ(IActionHandlerService.class)).handle(uIAssem2.getContext(), ((C1821300xUm) abstractC1821320xUoLIZ).LIZ);
            } else if (abstractC1821320xUoLIZ instanceof C1821330xUp) {
                Fragment fragmentLJI = C724240Sb0.LJI(uIAssem2);
                if ((fragmentLJI instanceof LiveSheetFragment) && (liveSheetFragment3 = (LiveSheetFragment) fragmentLJI) != null) {
                    liveSheetFragment3.close();
                }
            } else if (abstractC1821320xUoLIZ instanceof C1821340xUq) {
                Fragment fragmentLJI2 = C724240Sb0.LJI(uIAssem2);
                if ((fragmentLJI2 instanceof LiveSheetFragment) && (liveSheetFragment2 = (LiveSheetFragment) fragmentLJI2) != null && (c20484615Do2 = liveSheetFragment2.LLJJIJIL) != null) {
                    C19322110iZ.LIZ(c20484615Do2.LJIIIZ);
                }
            } else if (abstractC1821320xUoLIZ instanceof C1821310xUn) {
                Fragment fragmentLJI3 = C724240Sb0.LJI(uIAssem2);
                if (fragmentLJI3 != null && (parentFragmentManager = fragmentLJI3.getParentFragmentManager()) != null) {
                    parentFragmentManager.LJZL(new AbstractC813200VvC() { // from class: X.0xUr
                        @Override // X.AbstractC813200VvC
                        public final void onFragmentDetached(FragmentManager fragmentManager, Fragment fragment) {
                            if (Intrinsics.LJFF(fragment, C724240Sb0.LJI(uIAssem2))) {
                                fragmentManager.LLIILZL(this);
                                C500260Jjc.LJJLIIIJJIZ(new C20392114ql(abstractC1821320xUoLIZ));
                            }
                        }
                    }, false);
                }
                Fragment fragmentLJI4 = C724240Sb0.LJI(uIAssem2);
                if ((fragmentLJI4 instanceof LiveSheetFragment) && (liveSheetFragment = (LiveSheetFragment) fragmentLJI4) != null && (c20484615Do = liveSheetFragment.LLJJIJIL) != null) {
                    C19322110iZ.LIZ(c20484615Do.LJIIIZ);
                }
            } else {
                throw new C1954807lC();
            }
        }
        return Unit.LIZ;
    }
}
