package X;

import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.form.PcsFormFragment;
import com.bytedance.assem.arch.core.Assembler;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.04cg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1137604cg extends C09AY implements Function1<Assembler, Unit> {
    public final /* synthetic */ PcsFormFragment LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1137604cg(PcsFormFragment pcsFormFragment) {
        super(1);
        this.LL = pcsFormFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Assembler assembler) {
        assembler.RQ2(this.LL, new C1137504cf());
        return Unit.LIZ;
    }
}
