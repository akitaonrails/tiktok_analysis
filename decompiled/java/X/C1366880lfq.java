package X;

import com.ss.android.ugc.aweme.exp.DMInboxChangeRightZoneClickableSizeExp;

/* JADX INFO: renamed from: X.0lfq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
@C09DV(c = "com.ss.android.ugc.aweme.internalshare.impl.datamgr.collect.ServerContactDataCollectPipeline", f = "ServerContactDataCollectPipeline.kt", l = {DMInboxChangeRightZoneClickableSizeExp.NEW_DP_SIZE, 73}, m = "onCollectData")
public final class C1366880lfq extends AbstractC23140094w {
    public Object LL;
    public C1368260li4 LLILLJJLI;
    public InterfaceC1366180lei LLILLL;
    public C1366860lfo LLILZ;
    public Object LLILZIL;
    public Object LLILZLL;
    public /* synthetic */ Object LLIZ;
    public final /* synthetic */ C1366850lfn LLIZLLLIL;
    public int LLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1366880lfq(C1366850lfn c1366850lfn, InterfaceC1364105Vn<? super C1366880lfq> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLIZLLLIL = c1366850lfn;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ServerContactDataCollectPipeline@ae0a.onCollectData$1");
        this.LLIZ = obj;
        this.LLJ |= Integer.MIN_VALUE;
        Object objLIZ = this.LLIZLLLIL.LIZ(null, null, null, null, null, this);
        C1C7U.LIZIZ("ServerContactDataCollectPipeline@ae0a.onCollectData$1");
        return objLIZ;
    }
}
