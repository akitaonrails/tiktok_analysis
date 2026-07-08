package X;

import com.bytedance.assem.arch.reused.ReusedUIAssem;
import com.bytedance.pitaya.api.bean.PTYCepCallbackMode;
import com.ss.android.ugc.aweme.feed.assem.share.InterceptorEventViewModel;
import com.ss.android.ugc.aweme.upvote.detail.vm.RepostCepRuleVM;
import com.ss.android.ugc.aweme.upvote.util.RepostLazyLoadUtil;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0cFo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1004780cFo extends C09AY implements Function2<?, C291001Au<? extends Integer>, Unit> {
    public final /* synthetic */ RepostLazyLoadUtil<ReusedUIAssem<?>, Object> LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1004780cFo(RepostLazyLoadUtil<ReusedUIAssem<?>, Object> repostLazyLoadUtil) {
        super(2);
        this.LL = repostLazyLoadUtil;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Object obj, C291001Au<? extends Integer> c291001Au) {
        String next;
        if (c291001Au != null) {
            C1004840cFu c1004840cFu = this.LL.LIZJ().LLILZ;
            c1004840cFu.LIZ = 0;
            c1004840cFu.LIZIZ = false;
            c1004840cFu.LIZJ = false;
            c1004840cFu.LIZLLL = false;
            c1004840cFu.LJ = false;
            c1004840cFu.LJFF = false;
            c1004840cFu.LJI = false;
            c1004840cFu.LJII = false;
            c1004840cFu.LJIIIIZZ = null;
            c1004840cFu.LJIIIZ = -1;
            c1004840cFu.LJIIJ = "";
            c1004840cFu.LJIIJJI = false;
            c1004840cFu.LJIIL = null;
            c1004840cFu.LJIILIIL = false;
            c1004840cFu.LJIILJJIL = false;
            this.LL.LJIIIZ = 0;
            if (C296820BkG.LIZ()) {
                InterceptorEventViewModel interceptorEventViewModel = (InterceptorEventViewModel) this.LL.LJFF.getValue();
                RepostLazyLoadUtil<ReusedUIAssem<?>, Object> repostLazyLoadUtil = this.LL;
                interceptorEventViewModel.vQ2(0, repostLazyLoadUtil.LJI);
                interceptorEventViewModel.vQ2(1, repostLazyLoadUtil.LJI);
            }
            RepostCepRuleVM repostCepRuleVM = (RepostCepRuleVM) this.LL.LJIIJ.getValue();
            if (!repostCepRuleVM.LL) {
                C15X0.LIZ.getClass();
                if (C15X0.LIZJ()) {
                    C291610Bbr.LIZ.getClass();
                    if ((C291610Bbr.LIZ() & 8) == 8) {
                        repostCepRuleVM.LL = true;
                        Iterator<String> it2 = C1004850cFv.LJI.iterator();
                        while (it2.hasNext() && (next = it2.next()) != null) {
                            C15X0 c15x0 = C15X0.LIZ;
                            RepostCepRuleVM.RepostPTYCepCallback repostPTYCepCallback = new RepostCepRuleVM.RepostPTYCepCallback(new WeakReference(repostCepRuleVM), next);
                            c15x0.getClass();
                            InterfaceC1610880s1O interfaceC1610880s1O = (InterfaceC1610880s1O) C15X0.LIZIZ.getValue();
                            if (interfaceC1610880s1O != null) {
                                interfaceC1610880s1O.LIZ("repost_guides_cep_trigger", next, repostPTYCepCallback, PTYCepCallbackMode.SUCCESS_AND_ERROR);
                            }
                        }
                    }
                }
            }
        }
        return Unit.LIZ;
    }
}
