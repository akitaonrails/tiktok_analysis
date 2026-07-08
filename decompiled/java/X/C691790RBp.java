package X;

import com.bytedance.assem.arch.core.Assembler;
import com.ss.android.ugc.aweme.ad.feed.component.IAdComponentService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.feed.platform.cell.fullscreen.below.FullScreenBelowInteractionComponent;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0RBp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C691790RBp extends C09AY implements Function1<Assembler, Unit> {
    public final /* synthetic */ FullScreenBelowInteractionComponent LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C691790RBp(FullScreenBelowInteractionComponent fullScreenBelowInteractionComponent) {
        super(1);
        this.LL = fullScreenBelowInteractionComponent;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Assembler assembler) {
        Assembler assembler2 = assembler;
        C0S0L c0s0l = C0S0L.LIZ;
        C690870R8b c690870R8bJm = this.LL.jm();
        c0s0l.getClass();
        if (C0S0L.LIZIZ(c690870R8bJm) || Intrinsics.LJFF(this.LL.jm().LIZ(), "cell_mid_roll") || Intrinsics.LJFF(this.LL.jm().LIZ(), "cell_multi_content_horizon_card")) {
            assembler2.LQ2(this.LL, new C691780RBo(((IAdComponentService) ServiceManager.get().getService(IAdComponentService.class)).LJI()));
        }
        return Unit.LIZ;
    }
}
