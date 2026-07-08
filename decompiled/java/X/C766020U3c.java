package X;

/* JADX INFO: renamed from: X.0U3c, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.bytedance.android.live.effect.voiceeffect.VoiceEffectDataSource", f = "VoiceEffectDataSource.kt", l = {45}, m = "fetchLocalDataNew")
public final class C766020U3c extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C766010U3b LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C766020U3c(C766010U3b c766010U3b, InterfaceC1364105Vn<? super C766020U3c> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = c766010U3b;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("VoiceEffectDataSource@6f2e.fetchLocalDataNew$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLIZ = this.LLILLJJLI.LIZ(this);
        C1C7U.LIZIZ("VoiceEffectDataSource@6f2e.fetchLocalDataNew$1");
        return objLIZ;
    }
}
