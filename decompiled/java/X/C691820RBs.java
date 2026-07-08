package X;

import com.bytedance.assem.arch.reused.ReusedUIContentAssem;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0RBs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C691820RBs extends C09AY implements Function1<C0RTA, Unit> {
    public final /* synthetic */ ReusedUIContentAssem<? extends C03H5> LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C691820RBs(ReusedUIContentAssem<? extends C03H5> reusedUIContentAssem) {
        super(1);
        this.LL = reusedUIContentAssem;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C0RTA c0rta) {
        C0RTA c0rta2 = c0rta;
        c0rta2.LLJI = R.id.view_rootview;
        c0rta2.LLJ = this.LL;
        return Unit.LIZ;
    }
}
