package X;

import com.bytedance.assem.arch.reused.ReusedUIContentAssem;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0RBo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C691780RBo extends C09AY implements Function1<C0RTA, Unit> {
    public final /* synthetic */ C13IQ<? extends ReusedUIContentAssem<? extends C03H5>> LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C691780RBo(C13IQ<? extends ReusedUIContentAssem<? extends C03H5>> c13iq) {
        super(1);
        this.LL = c13iq;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(C0RTA c0rta) {
        C0RTA c0rta2 = c0rta;
        c0rta2.LLJI = R.id.iny;
        c0rta2.LLILLL = this.LL;
        return Unit.LIZ;
    }
}
