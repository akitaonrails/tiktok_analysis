package X;

import com.bytedance.assem.arch.reused.ReusedUIContentAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0RBn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C691770RBn extends C09AY implements Function1<C0RTA, Unit> {
    public final /* synthetic */ C0RTA LL;
    public final /* synthetic */ ReusedUIContentAssem<? extends C03H5> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C691770RBn(C0RTA c0rta, ReusedUIContentAssem<? extends C03H5> reusedUIContentAssem) {
        super(1);
        this.LL = c0rta;
        this.LLILLJJLI = reusedUIContentAssem;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C0RTA c0rta) {
        C0RTA c0rta2 = c0rta;
        C0RTA c0rta3 = this.LL;
        c0rta2.LLJILJIL = c0rta3.LLJILJIL;
        c0rta2.LLJI = c0rta3.LLJI;
        c0rta2.LLJ = this.LLILLJJLI;
        c0rta2.LLILZIL = C694070RKj.LIZIZ;
        return Unit.LIZ;
    }
}
