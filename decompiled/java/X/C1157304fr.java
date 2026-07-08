package X;

import com.bytedance.assem.arch.core.Assembler;
import com.ss.android.ugc.aweme.main.MainPageFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS403S0200000_2;

/* JADX INFO: renamed from: X.04fr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1157304fr extends C09AY implements Function1<Assembler, Unit> {
    public final /* synthetic */ MainPageFragment LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1157304fr(MainPageFragment mainPageFragment) {
        super(1);
        this.LL = mainPageFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Assembler assembler) {
        Assembler assembler2 = assembler;
        if (C1586520rO6.LIZIZ()) {
            C0S78.LJ(true, new AwS403S0200000_2(assembler2, this.LL, 25));
        }
        return Unit.LIZ;
    }
}
