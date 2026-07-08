package X;

import com.bytedance.assem.arch.core.Assembler;
import com.bytedance.assem.arch.reused.ReusedUIAssem;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0SE8, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0SE8 extends C09AY implements Function1<Assembler, Unit> {
    public final /* synthetic */ ReusedUIAssem<? extends C03H5> LL;
    public final /* synthetic */ int LLILLJJLI = R.id.i48;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0SE8(ReusedUIAssem reusedUIAssem, int i, int i2) {
        super(1);
        this.LL = reusedUIAssem;
        this.LLILLL = i;
        this.LLILZ = i2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Assembler assembler) {
        assembler.MQ2(this.LL, new C0SE7(this.LLILLJJLI, this.LLILLL, this.LLILZ));
        return Unit.LIZ;
    }
}
