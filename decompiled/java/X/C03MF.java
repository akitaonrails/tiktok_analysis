package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS367S0200000_1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.03MF, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C03MF extends C09AY implements Function1<C03JV, Unit> {
    public final /* synthetic */ C013C LL;
    public final /* synthetic */ C03ME LLILLJJLI;
    public final /* synthetic */ C259800zU<String> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C03MF(C013C c013c, C03ME c03me, C259800zU c259800zU) {
        super(1);
        this.LL = c013c;
        this.LLILLJJLI = c03me;
        this.LLILLL = c259800zU;
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [T, java.lang.String] */
    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C03JV c03jv) {
        boolean z;
        C03JV c03jv2 = c03jv;
        Integer num = c03jv2.LLJILLL;
        C013C c013c = this.LL;
        if (Intrinsics.LJFF(c03jv2.LLIZLLLIL, Boolean.TRUE) && num != null && !this.LLILLJJLI.LIZ().LLILZIL) {
            z = true;
        } else {
            z = false;
        }
        c013c.element = z;
        if (num != null) {
            C259800zU<String> c259800zU = this.LLILLL;
            C03ME c03me = this.LLILLJJLI;
            int iIntValue = num.intValue();
            if (iIntValue > 0) {
                c259800zU.element = c03me.LIZ().wQ2(iIntValue).toString();
            }
        }
        this.LLILLJJLI.LIZ().setState(new AwS367S0200000_1(this.LL, this.LLILLL, 293));
        return Unit.LIZ;
    }
}
