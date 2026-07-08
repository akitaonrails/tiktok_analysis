package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.13Yd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20028513Yd extends C09AY implements Function1<Object, Unit> {
    public final /* synthetic */ C13YZ<T> LL;
    public final /* synthetic */ C13FW LLILLJJLI;
    public final /* synthetic */ C20028313Yb<C13YP> LLILLL;
    public final /* synthetic */ int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20028513Yd(C13YZ<T> c13yz, C13FW c13fw, C20028313Yb<C13YP> c20028313Yb, int i) {
        super(1);
        this.LL = c13yz;
        this.LLILLJJLI = c13fw;
        this.LLILLL = c20028313Yb;
        this.LLILZ = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Object obj) {
        int i;
        if (obj != this.LL) {
            if (obj instanceof C13YP) {
                int i2 = this.LLILLJJLI.LIZ;
                C20028313Yb<C13YP> c20028313Yb = this.LLILLL;
                int i3 = i2 - this.LLILZ;
                int iLIZ = c20028313Yb.LIZ(obj);
                if (iLIZ >= 0) {
                    i = c20028313Yb.LIZJ[iLIZ];
                } else {
                    i = Integer.MAX_VALUE;
                }
                c20028313Yb.LJII(Math.min(i3, i), obj);
            }
            return Unit.LIZ;
        }
        "A derived state calculation cannot read itself".toString();
        throw new IllegalStateException("A derived state calculation cannot read itself");
    }
}
