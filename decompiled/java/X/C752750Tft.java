package X;

/* JADX INFO: renamed from: X.0Tft, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.bytedance.android.livesdk.locationservice.FetchLocationData", f = "FetchLocationData.kt", l = {23}, m = "requestLocation")
public final class C752750Tft extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C752740Tfs LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C752750Tft(C752740Tfs c752740Tfs, InterfaceC1364105Vn<? super C752750Tft> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = c752740Tfs;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("FetchLocationData@8f68.requestLocation$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLIZ = this.LLILLJJLI.LIZ(this);
        C1C7U.LIZIZ("FetchLocationData@8f68.requestLocation$1");
        return objLIZ;
    }
}
