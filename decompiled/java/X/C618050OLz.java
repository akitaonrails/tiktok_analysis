package X;

import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0OLz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C618050OLz extends C09AY implements Function1<C618040OLy, C618040OLy> {
    public final /* synthetic */ boolean LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ Throwable LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C618050OLz(int i, Throwable th, boolean z) {
        super(1);
        this.LL = z;
        this.LLILLJJLI = i;
        this.LLILLL = th;
    }

    @Override // kotlin.jvm.functions.Function1
    public final C618040OLy invoke(C618040OLy c618040OLy) {
        C618040OLy c618040OLy2 = c618040OLy;
        if (this.LL) {
            return C618040OLy.LIZ(c618040OLy2, new C1623606Xi(Integer.valueOf(this.LLILLJJLI)), null, 2);
        }
        Throwable th = this.LLILLL;
        if (th == null) {
            th = new Throwable("unknown");
        }
        return C618040OLy.LIZ(c618040OLy2, new C491001vg(th), null, 2);
    }
}
