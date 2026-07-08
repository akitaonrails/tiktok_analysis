package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0XoX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C860030XoX extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C1455260nyO LL;
    public final /* synthetic */ Runnable LLILLJJLI;
    public final /* synthetic */ boolean LLILLL = false;
    public final /* synthetic */ boolean LLILZ;
    public final /* synthetic */ boolean LLILZIL;
    public final /* synthetic */ Runnable LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C860030XoX(C1455260nyO c1455260nyO, Runnable runnable, boolean z, boolean z2, Runnable runnable2) {
        super(0);
        this.LL = c1455260nyO;
        this.LLILLJJLI = runnable;
        this.LLILZ = z;
        this.LLILZIL = z2;
        this.LLILZLL = runnable2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        this.LL.v(this.LLILLJJLI, this.LLILZLL, this.LLILLL, this.LLILZ, this.LLILZIL);
        return Unit.LIZ;
    }
}
