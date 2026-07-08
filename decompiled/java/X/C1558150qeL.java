package X;

import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.assem.arch.core.Assembler;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.ss.android.ugc.aweme.experiment.ColdBootDegradeAssem;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0qeL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1558150qeL {
    public static final void LIZ(Assembler assembler, LifecycleOwner lifecycleOwner) {
        assembler.vQ2(lifecycleOwner, new C1558190qeP());
        assembler.vQ2(lifecycleOwner, new C1558090qeF());
        assembler.QQ2(lifecycleOwner, new C1558120qeI());
        if (!C285090BFj.LIZJ()) {
            assembler.QQ2(lifecycleOwner, new C1558160qeM());
        }
        assembler.vQ2(lifecycleOwner, new C1558140qeK());
        if (!C285090BFj.LIZJ()) {
            assembler.QQ2(lifecycleOwner, new C1558060qeC());
            assembler.QQ2(lifecycleOwner, new C1558070qeD());
            assembler.QQ2(lifecycleOwner, new C1558170qeN());
            C13IQ<? extends UIContentAssem> c13iqT3 = ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).t3();
            if (c13iqT3 != null) {
                assembler.QQ2(lifecycleOwner, new C1558080qeE(c13iqT3));
            }
        }
        if (!ColdBootDegradeAssem.LIZ()) {
            assembler.QQ2(lifecycleOwner, new C1558100qeG());
        }
        assembler.QQ2(lifecycleOwner, new C1558110qeH());
        if (!((Boolean) C285090BFj.LJJZZIII.getValue()).booleanValue()) {
            assembler.vQ2(lifecycleOwner, new C1558180qeO());
        }
        assembler.vQ2(lifecycleOwner, new C1558130qeJ());
    }

    public static final void LIZIZ(AbstractC738140SxQ abstractC738140SxQ, Function2<? super InterfaceC497601wk, ? super InterfaceC1364105Vn<? super Unit>, ? extends Object> function2) {
        if (C1562780qlo.LIZJ() && abstractC738140SxQ.isHitTrack()) {
            LifecycleOwnerKt.getLifecycleScope(abstractC738140SxQ).launchWhenStarted(new C459580I0m(abstractC738140SxQ, function2, null));
        } else {
            LifecycleOwnerKt.getLifecycleScope(abstractC738140SxQ).launchWhenStarted(new C459570I0l(abstractC738140SxQ, function2, null));
        }
    }
}
