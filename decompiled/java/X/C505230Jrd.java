package X;

import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subspace.detail.view.assem.SubSpaceDetailListAssem;
import com.bytedance.assem.arch.core.Assembler;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0Jrd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C505230Jrd extends C09AY implements Function1<Assembler, Unit> {
    public final /* synthetic */ SubSpaceDetailListAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C505230Jrd(SubSpaceDetailListAssem subSpaceDetailListAssem) {
        super(1);
        this.LL = subSpaceDetailListAssem;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Assembler assembler) {
        assembler.RQ2(this.LL, new C505240Jre());
        return Unit.LIZ;
    }
}
