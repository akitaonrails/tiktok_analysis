package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS210S0300000_1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.03MB, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C03MB extends C09AY implements Function1<C03JV, Unit> {
    public final /* synthetic */ C118300cf LL;
    public final /* synthetic */ C013C LLILLJJLI;
    public final /* synthetic */ C03MC LLILLL;
    public final /* synthetic */ C259800zU<String> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C03MB(C118300cf c118300cf, C013C c013c, C03MC c03mc, C259800zU c259800zU) {
        super(1);
        this.LL = c118300cf;
        this.LLILLJJLI = c013c;
        this.LLILLL = c03mc;
        this.LLILZ = c259800zU;
    }

    /* JADX WARN: Type inference failed for: r0v17, types: [T, java.lang.String] */
    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C03JV c03jv) {
        boolean z;
        C03JV c03jv2 = c03jv;
        this.LL.element = c03jv2.LLJILJILJ.LIZ.intValue();
        C013C c013c = this.LLILLJJLI;
        if (!Intrinsics.LJFF(c03jv2.LLIZLLLIL, Boolean.TRUE) && !this.LLILLL.LIZ().LLILZIL) {
            z = false;
        } else {
            z = true;
        }
        c013c.element = z;
        if (this.LL.element > 0) {
            this.LLILZ.element = this.LLILLL.LIZ().wQ2(this.LL.element).toString();
        }
        this.LLILLL.LIZ().setState(new AwS210S0300000_1(this.LLILLJJLI, c03jv2, this.LLILZ, 85));
        return Unit.LIZ;
    }
}
