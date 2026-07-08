package X;

import com.bytedance.assem.arch.core.Assembler;
import com.ss.android.ugc.aweme.ad.feed.component.IAdComponentService;
import com.ss.android.ugc.feed.platform.cell.fullscreen.mask.FullMaskContainerComponent;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0R9q, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C691280R9q extends C09AY implements Function1<Assembler, Unit> {
    public final /* synthetic */ FullMaskContainerComponent LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C691280R9q(FullMaskContainerComponent fullMaskContainerComponent) {
        super(1);
        this.LL = fullMaskContainerComponent;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Assembler assembler) {
        Assembler assembler2 = assembler;
        C0S0L c0s0l = C0S0L.LIZ;
        C690870R8b c690870R8bJm = this.LL.jm();
        c0s0l.getClass();
        if (C0S0L.LIZIZ(c690870R8bJm) || Intrinsics.LJFF(this.LL.jm().LIZ(), "cell_mid_roll") || Intrinsics.LJFF(this.LL.jm().LIZ(), "cell_text") || Intrinsics.LJFF(this.LL.jm().LIZ(), "cell_photos")) {
            IAdComponentService iAdComponentService = (IAdComponentService) this.LL.LLJJJJLIIL.getValue();
            C19719912Dl c19719912DlLIZIZ = null;
            if (iAdComponentService != null) {
                c19719912DlLIZIZ = iAdComponentService.LIZIZ();
            }
            if ((c19719912DlLIZIZ instanceof C13IQ) && c19719912DlLIZIZ != null) {
                C0RJE.LIZJ(assembler2, this.LL, new C0REO(c19719912DlLIZIZ));
            }
        }
        return Unit.LIZ;
    }
}
