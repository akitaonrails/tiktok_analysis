package X;

import kotlin.Unit;

/* JADX INFO: renamed from: X.0aBm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C925400aBm extends C09AY implements InterfaceC1631620sYq<Integer, String, Throwable, Unit> {
    public final /* synthetic */ C925310aBd LL;
    public final /* synthetic */ long LLILLJJLI;
    public final /* synthetic */ long LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C925400aBm(C925310aBd c925310aBd, long j, long j2) {
        super(3);
        this.LL = c925310aBd;
        this.LLILLJJLI = j;
        this.LLILLL = j2;
    }

    @Override // X.InterfaceC1631620sYq
    public final Unit invoke(Integer num, String str, Throwable th) {
        this.LL.LJFF(num.intValue(), this.LLILLJJLI, this.LLILLL);
        return Unit.LIZ;
    }
}
