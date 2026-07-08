package X;

/* JADX INFO: renamed from: X.0bls, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
@C09DV(c = "com.bytedance.android.live.liveinteract.competition.game.utils.StageEffectResourceManager", f = "StageEffectResourceManager.kt", l = {67}, m = "tryGetEffect")
public final class C986220bls extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C986210blr LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C986220bls(C986210blr c986210blr, InterfaceC1364105Vn<? super C986220bls> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = c986210blr;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("StageEffectResourceManager@fbbd.tryGetEffect$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLIZ = this.LLILLJJLI.LIZ(this);
        C1C7U.LIZIZ("StageEffectResourceManager@fbbd.tryGetEffect$1");
        return objLIZ;
    }
}
