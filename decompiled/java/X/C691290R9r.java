package X;

import com.bytedance.assem.arch.core.Assembler;
import com.ss.android.ugc.aweme.ad.feed.component.IAdComponentService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.feed.platform.cell.fullscreen.middle.FullScreenBetweenLRInteractComponent;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0R9r, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C691290R9r extends C09AY implements Function1<Assembler, Unit> {
    public final /* synthetic */ FullScreenBetweenLRInteractComponent LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C691290R9r(FullScreenBetweenLRInteractComponent fullScreenBetweenLRInteractComponent) {
        super(1);
        this.LL = fullScreenBetweenLRInteractComponent;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Assembler assembler) {
        Assembler assembler2 = assembler;
        C0S0L c0s0l = C0S0L.LIZ;
        C690870R8b c690870R8bJm = this.LL.jm();
        c0s0l.getClass();
        if (C0S0L.LIZIZ(c690870R8bJm) || Intrinsics.LJFF(this.LL.jm().LIZ(), "cell_mid_roll") || C0S0L.LJFF(this.LL.jm())) {
            C0RJE.LIZJ(assembler2, this.LL, new C0REN(((IAdComponentService) ServiceManager.get().getService(IAdComponentService.class)).LJIJI()));
        }
        return Unit.LIZ;
    }
}
