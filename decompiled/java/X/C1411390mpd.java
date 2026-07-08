package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0mpd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1411390mpd extends C09AY implements Function1<C1411350mpZ, C1411350mpZ> {
    public final /* synthetic */ Throwable LL;
    public final /* synthetic */ Function0<Unit> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1411390mpd(Throwable th, Function0<Unit> function0) {
        super(1);
        this.LL = th;
        this.LLILLJJLI = function0;
    }

    @Override // kotlin.jvm.functions.Function1
    public final C1411350mpZ invoke(C1411350mpZ c1411350mpZ) {
        return C1411350mpZ.LIZ(c1411350mpZ, C1411380mpc.LIZ, null, null, false, null, null, null, null, this.LL, this.LLILLJJLI, 254);
    }
}
