package X;

import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subspace.feed.view.assem.SubSpaceFeedAssem;
import com.bytedance.assem.arch.core.Assembler;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.04da, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1143204da extends C09AY implements Function1<Assembler, Unit> {
    public final /* synthetic */ SubSpaceFeedAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1143204da(SubSpaceFeedAssem subSpaceFeedAssem) {
        super(1);
        this.LL = subSpaceFeedAssem;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Assembler assembler) {
        assembler.RQ2(this.LL, new C1143104dZ());
        return Unit.LIZ;
    }
}
