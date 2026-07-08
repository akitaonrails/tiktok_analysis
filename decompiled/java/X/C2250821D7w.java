package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.1D7w, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2250821D7w extends C09AY implements Function1<C1D82, Unit> {
    public final /* synthetic */ Object LL;
    public final /* synthetic */ C259800zU LLILLJJLI;
    public final /* synthetic */ Object LLILLL;
    public final /* synthetic */ C259800zU LLILZ;
    public final /* synthetic */ C259800zU LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2250821D7w(Object obj, C259800zU c259800zU, Object obj2, C259800zU c259800zU2, C259800zU c259800zU3) {
        super(1);
        this.LL = obj;
        this.LLILLJJLI = c259800zU;
        this.LLILLL = obj2;
        this.LLILZ = c259800zU2;
        this.LLILZIL = c259800zU3;
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [T, X.1D82] */
    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C1D82 c1d82) {
        C1D82 c1d822 = c1d82;
        if (Intrinsics.LJFF(c1d822.LJIIL, this.LL)) {
            this.LLILLJJLI.element = c1d822;
        }
        if (Intrinsics.LJFF(c1d822.LJIIL, this.LLILLL)) {
            this.LLILZ.element = c1d822;
        }
        if (Intrinsics.LJFF(c1d822.LJIIL, C2250801D7u.LIZ)) {
            this.LLILZIL.element = c1d822;
        }
        return Unit.LIZ;
    }
}
