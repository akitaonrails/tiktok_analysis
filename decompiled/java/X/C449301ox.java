package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.01ox, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C449301ox extends C09AY implements Function1<C419910GdJ, Unit> {
    public final /* synthetic */ int LL;
    public final /* synthetic */ Integer LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C449301ox(int i, Integer num) {
        super(1);
        this.LL = i;
        this.LLILLJJLI = num;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C419910GdJ c419910GdJ) {
        C419910GdJ c419910GdJ2 = c419910GdJ;
        c419910GdJ2.LIZ = this.LL;
        Integer num = this.LLILLJJLI;
        if (num != null) {
            c419910GdJ2.LJ = Integer.valueOf(num.intValue());
        }
        c419910GdJ2.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
        c419910GdJ2.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
        return Unit.LIZ;
    }
}
