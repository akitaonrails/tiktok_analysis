package X;

import com.bytedance.assem.arch.reused.ReusedUIContentAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0RE7, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0RE7 extends C09AY implements Function1<C0RTA, Unit> {
    public final /* synthetic */ C0RUD LL;
    public final /* synthetic */ ReusedUIContentAssem<? extends C03H5> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0RE7(C0RUD c0rud, ReusedUIContentAssem<? extends C03H5> reusedUIContentAssem) {
        super(1);
        this.LL = c0rud;
        this.LLILLJJLI = reusedUIContentAssem;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C0RTA c0rta) {
        C0RTA c0rta2 = c0rta;
        C0RUD c0rud = this.LL;
        c0rta2.LLJILJIL = c0rud.LLJILJIL;
        c0rta2.LLJI = c0rud.LLJI;
        c0rta2.LLJ = this.LLILLJJLI;
        return Unit.LIZ;
    }
}
