package X;

/* JADX INFO: renamed from: X.0uQc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.changeregion.sdk.data.source.ExistingUserEntranceDataSource", f = "ExistingUserEntranceDataSource.kt", l = {27}, m = "getEntranceInfo")
public final class C1703400uQc extends AbstractC23140094w {
    public C1703300uQS LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C1703390uQb LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1703400uQc(C1703390uQb c1703390uQb, InterfaceC1364105Vn<? super C1703400uQc> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = c1703390uQb;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ExistingUserEntranceDataSource@643a.getEntranceInfo$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLIZ = this.LLILLL.LIZ(this);
        C1C7U.LIZIZ("ExistingUserEntranceDataSource@643a.getEntranceInfo$1");
        return objLIZ;
    }
}
