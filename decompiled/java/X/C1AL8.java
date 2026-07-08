package X;

/* JADX INFO: renamed from: X.1AL8, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
@C09DV(c = "com.bytedance.android.livesdk.comp.impl.event.api.LiveEventApi$Companion", f = "LiveEventApi.kt", l = {69}, m = "getLiveEventDetail$liveevent_impl_release")
public final class C1AL8 extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C1AL6 LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1AL8(C1AL6 c1al6, InterfaceC1364105Vn<? super C1AL8> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = c1al6;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("LiveEventApi$Companion@2b6b.getLiveEventDetail$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLIZ = this.LLILLJJLI.LIZ(null, this);
        C1C7U.LIZIZ("LiveEventApi$Companion@2b6b.getLiveEventDetail$1");
        return objLIZ;
    }
}
