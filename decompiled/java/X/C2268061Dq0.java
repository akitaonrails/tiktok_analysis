package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.1Dq0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2268061Dq0 extends C09AY implements Function1<C1023640ckE, Unit> {
    public final /* synthetic */ int LL;
    public final /* synthetic */ Integer LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ String LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2268061Dq0(int i, String str, String str2, String str3, Integer num, String str4) {
        super(1);
        this.LL = i;
        this.LLILLJJLI = num;
        this.LLILLL = str;
        this.LLILZ = str2;
        this.LLILZIL = str3;
        this.LLILZLL = str4;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C1023640ckE c1023640ckE) {
        C1023640ckE c1023640ckE2 = c1023640ckE;
        C2268041Dpy.LIZ.getClass();
        c1023640ckE2.withParam(C2268041Dpy.LIZIZ, Integer.valueOf(this.LL));
        c1023640ckE2.withParam(C2268041Dpy.LIZJ, this.LLILLJJLI);
        c1023640ckE2.withParam(C2268041Dpy.LJIIJJI, "iab");
        c1023640ckE2.withParam(C2268041Dpy.LJIIL, this.LLILLL);
        c1023640ckE2.withParam(C2268041Dpy.LJJIFFI, this.LLILZ);
        c1023640ckE2.withParam(C2268041Dpy.LJJI, this.LLILZIL);
        c1023640ckE2.withParam(C2268041Dpy.LJJIJL, this.LLILZLL);
        return Unit.LIZ;
    }
}
