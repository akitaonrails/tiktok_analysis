package X;

import com.bytedance.assem.arch.view.UISlotAssem;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.04eH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1147504eH extends C09AY implements Function1<C0SZ5, Unit> {
    public final /* synthetic */ C13IQ<? extends UISlotAssem> LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1147504eH(C13IQ<? extends UISlotAssem> c13iq) {
        super(1);
        this.LL = c13iq;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C0SZ5 c0sz5) {
        C0SZ5 c0sz52 = c0sz5;
        c0sz52.LL = this.LL;
        c0sz52.LLIZLLLIL = R.id.yuu;
        return Unit.LIZ;
    }
}
