package X;

import com.bytedance.android.live.actionhandler.IActionHandlerService;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.form.cell.PcsFormPrivacyPolicyCell;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0v3b, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1727570v3b extends C09AY implements Function0<Unit> {
    public final /* synthetic */ PcsFormPrivacyPolicyCell LL;
    public final /* synthetic */ C1727540v3Y LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1727570v3b(PcsFormPrivacyPolicyCell pcsFormPrivacyPolicyCell, C1727540v3Y c1727540v3Y) {
        super(0);
        this.LL = pcsFormPrivacyPolicyCell;
        this.LLILLJJLI = c1727540v3Y;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        ((IActionHandlerService) C1161920gLG.LIZJ(IActionHandlerService.class)).handle(this.LL.itemView.getContext(), this.LLILLJJLI.LLILZ);
        return Unit.LIZ;
    }
}
