package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0zXD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1899690zXD extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C1899490zWt LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ int LLILZ;
    public final /* synthetic */ int LLILZIL;
    public final /* synthetic */ int LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1899690zXD(C1899490zWt c1899490zWt, boolean z, int i, int i2, int i3, int i4) {
        super(0);
        this.LL = c1899490zWt;
        this.LLILLJJLI = z;
        this.LLILLL = i;
        this.LLILZ = i2;
        this.LLILZIL = i3;
        this.LLILZLL = i4;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        super/*android.widget.FrameLayout*/.onLayout(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL);
        this.LL.LJIJJLI();
        C1899490zWt c1899490zWt = this.LL;
        c1899490zWt.getClass();
        C01U6.LIZIZ(new C1899610zX5(c1899490zWt));
        return Unit.LIZ;
    }
}
