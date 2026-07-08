package X;

/* JADX INFO: renamed from: X.00oZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.bytedance.android.livesdk.rank.impl.data.usecase.messages.HandleOecLiveRankMessageUseCase", f = "HandleOecLiveRankMessageUseCase.kt", l = {31}, m = "invoke")
public final class C192100oZ extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C192000oY LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C192100oZ(C192000oY c192000oY, InterfaceC1364105Vn<? super C192100oZ> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = c192000oY;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("HandleOecLiveRankMessageUseCase@5176.invoke$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLIZ = this.LLILLJJLI.LIZ(this);
        C1C7U.LIZIZ("HandleOecLiveRankMessageUseCase@5176.invoke$1");
        return objLIZ;
    }
}
