package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0z4y, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1882180z4y extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C1882050z4l LL;
    public final /* synthetic */ Function0<Unit> LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ Function1<Boolean, Unit> LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1882180z4y(C1882050z4l c1882050z4l, Function0<Unit> function0, boolean z, String str, Function1<? super Boolean, Unit> function1) {
        super(0);
        this.LL = c1882050z4l;
        this.LLILLJJLI = function0;
        this.LLILLL = z;
        this.LLILZ = str;
        this.LLILZIL = function1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        C1882050z4l c1882050z4l = this.LL;
        c1882050z4l.LJIIJ(new C1882110z4r(this.LLILZIL, this.LLILLL, this.LLILZ, this.LL), new C1882140z4u(this.LLILLJJLI, this.LLILLL, this.LLILZ, c1882050z4l));
        return Unit.LIZ;
    }
}
