package X;

import android.view.ViewGroup;
import com.bytedance.assem.arch.reused.ReusedUIAssem;
import com.bytedance.assem.arch.reused.ReusedUIContentAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0RBH, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0RBH extends C09AY implements Function1<C0RTA, Unit> {
    public final /* synthetic */ ViewGroup LL;
    public final /* synthetic */ ReusedUIAssem<? extends C03H5> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0RBH(ViewGroup viewGroup, ReusedUIAssem<? extends C03H5> reusedUIAssem) {
        super(1);
        this.LL = viewGroup;
        this.LLILLJJLI = reusedUIAssem;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C0RTA c0rta) {
        C0RTA c0rta2 = c0rta;
        c0rta2.LLJILJIL = this.LL;
        c0rta2.LLJ = (ReusedUIContentAssem) this.LLILLJJLI;
        return Unit.LIZ;
    }
}
