package X;

import androidx.fragment.app.Fragment;
import com.bytedance.assem.arch.core.Assembler;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS22S0001000_7;
import kotlin.jvm.internal.AwS25S1101000_19;

/* JADX INFO: renamed from: X.0Jjb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C500250Jjb extends C09AY implements Function1<Assembler, Unit> {
    public final /* synthetic */ Fragment LL;
    public final /* synthetic */ C1230910i8X LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ int LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C500250Jjb(int i, int i2, Fragment fragment, C1230910i8X c1230910i8X, String str) {
        super(1);
        this.LL = fragment;
        this.LLILLJJLI = c1230910i8X;
        this.LLILLL = i;
        this.LLILZ = str;
        this.LLILZIL = i2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Assembler assembler) {
        Assembler assembler2 = assembler;
        assembler2.DQ2(this.LL, new AwS25S1101000_19(this.LLILLJJLI, this.LLILLL, this.LLILZ, 2));
        assembler2.RQ2(this.LL, new AwS22S0001000_7(this.LLILZIL, 5));
        return Unit.LIZ;
    }
}
