package X;

/* JADX INFO: renamed from: X.0n0T, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
@C09DV(c = "com.ss.android.ugc.aweme.autocut.AutoCutHelper$requestNLEModelAsFlow$1$invokeSuspend$$inlined$transform$1$1", f = "AutoCutHelper.kt", l = {225, 228, 232, 235}, m = "emit")
public final class C1418110n0T extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public int LLILLJJLI;
    public final /* synthetic */ C1417960n0E LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1418110n0T(C1417960n0E c1417960n0E, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = c1417960n0E;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AutoCutHelper@27e4.requestNLEModelAsFlow$1$invokeSuspend$$inlined$transform$1$1$1");
        this.LL = obj;
        this.LLILLJJLI |= Integer.MIN_VALUE;
        Object objEmit = this.LLILLL.emit(null, this);
        C1C7U.LIZIZ("AutoCutHelper@27e4.requestNLEModelAsFlow$1$invokeSuspend$$inlined$transform$1$1$1");
        return objEmit;
    }
}
