package X;

import com.bytedance.assem.arch.reused.ReusedUIContentAssem;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0REN, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0REN extends C09AY implements Function1<C0REQ, Unit> {
    public final /* synthetic */ C13IQ<? extends ReusedUIContentAssem<? extends C03H5>> LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0REN(C13IQ<? extends ReusedUIContentAssem<? extends C03H5>> c13iq) {
        super(1);
        this.LL = c13iq;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C0REQ c0req) {
        C0REQ c0req2 = c0req;
        c0req2.LIZLLL = R.id.inz;
        c0req2.LIZ = this.LL;
        return Unit.LIZ;
    }
}
