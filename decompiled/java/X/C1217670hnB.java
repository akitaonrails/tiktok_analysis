package X;

import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.thirdpartylink.view.PcsThirdPartyLinkFragment;
import com.bytedance.assem.arch.core.Assembler;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0hnB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1217670hnB extends C09AY implements Function1<Assembler, Unit> {
    public final /* synthetic */ PcsThirdPartyLinkFragment LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1217670hnB(PcsThirdPartyLinkFragment pcsThirdPartyLinkFragment) {
        super(1);
        this.LL = pcsThirdPartyLinkFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Assembler assembler) {
        Assembler assembler2 = assembler;
        PcsThirdPartyLinkFragment pcsThirdPartyLinkFragment = this.LL;
        if (pcsThirdPartyLinkFragment.LLILZ) {
            assembler2.RQ2(pcsThirdPartyLinkFragment, new C1217640hn8());
        }
        assembler2.RQ2(this.LL, new C1217660hnA());
        assembler2.RQ2(this.LL, new C1137704ch());
        return Unit.LIZ;
    }
}
