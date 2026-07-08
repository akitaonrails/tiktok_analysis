package X;

import com.ss.android.ugc.aweme.feed.assem.share.InterceptorEventViewModel;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.internalshare.impl.feedquickshare.QuickShareButtonAssem;
import com.ss.android.ugc.aweme.internalshare.impl.feedquickshare.QuickShareVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0cEp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1004170cEp extends C09AY implements Function2<QuickShareButtonAssem, C291001Au<? extends C0R9E>, Unit> {
    public C1004170cEp() {
        super(2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(QuickShareButtonAssem quickShareButtonAssem, C291001Au<? extends C0R9E> c291001Au) {
        C0R9E c0r9e;
        QuickShareButtonAssem quickShareButtonAssem2 = quickShareButtonAssem;
        C291001Au<? extends C0R9E> c291001Au2 = c291001Au;
        Object obj = null;
        if (c291001Au2 != null && (c0r9e = (C0R9E) c291001Au2.LIZ) != null && Intrinsics.LJFF(c0r9e.LIZ, ((VideoItemParams) C631370Opb.LIZ(quickShareButtonAssem2)).getAweme().getAid())) {
            InterceptorEventViewModel interceptorEventViewModel = (InterceptorEventViewModel) quickShareButtonAssem2.LLJZIJLIL.getValue();
            C1004140cEm.LIZ.getClass();
            if (C1004140cEm.LIZ().enableLikeTrigger == 1) {
                interceptorEventViewModel.xQ2(0, quickShareButtonAssem2.LLLIIL);
            }
            if (C1004140cEm.LIZ().enableLoopTrigger == 1) {
                interceptorEventViewModel.xQ2(1, quickShareButtonAssem2.LLLIIL);
            }
            C1004330cF5 c1004330cF5 = quickShareButtonAssem2.LLLIILIL;
            if (c1004330cF5 != null) {
                C0YSQ.LIZIZ(InterfaceC876950Yaj.LIZ).LJJIJIIJIL(c1004330cF5);
            }
            StringBuilder sb = new StringBuilder("onHolderUnSelectedEvent ");
            C724270Sb3 c724270Sb3 = quickShareButtonAssem2.LLJI;
            if (c724270Sb3 != null) {
                obj = c724270Sb3.LL;
            }
            sb.append(QuickShareButtonAssem.Ip((VideoItemParams) obj));
            C1720006oQ.LJ("QuickShareAssem", sb.toString());
            QuickShareVM quickShareVMGp = quickShareButtonAssem2.Gp();
            quickShareVMGp.getClass();
            quickShareVMGp.setState(new C1004120cEk(quickShareVMGp));
            C1004550cFR c1004550cFR = C1004550cFR.LIZIZ;
            String str = c0r9e.LIZ;
            c1004550cFR.getClass();
            if (str != null) {
                C1004550cFR.LIZLLL.remove(str);
                C1004550cFR.LJIIIZ.remove(str);
            }
        }
        return Unit.LIZ;
    }
}
