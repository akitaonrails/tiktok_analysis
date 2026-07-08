package X;

import com.bytedance.assem.arch.core.Assembler;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS248S0000000_14;
import kotlin.jvm.internal.AwS0S0040000_14;

/* JADX INFO: renamed from: X.0Zn6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C910100Zn6 extends C09AY implements Function1<Assembler, Unit> {
    public final /* synthetic */ AbstractC738140SxQ LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ boolean LLILZ;
    public final /* synthetic */ boolean LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C910100Zn6(AbstractC738140SxQ abstractC738140SxQ, boolean z, boolean z2, boolean z3, boolean z4) {
        super(1);
        this.LL = abstractC738140SxQ;
        this.LLILLJJLI = z;
        this.LLILLL = z2;
        this.LLILZ = z3;
        this.LLILZIL = z4;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Assembler assembler) {
        Assembler assembler2 = assembler;
        assembler2.EQ2(this.LL, new AwS0S0040000_14(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, 0));
        assembler2.vQ2(this.LL, AFwS248S0000000_14.get$arr$(55));
        return Unit.LIZ;
    }
}
