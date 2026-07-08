package X;

/* JADX INFO: renamed from: X.0Tq1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.bytedance.android.livesdk.function.RoomFunctionSettingsManager", f = "RoomFunctionSettingsManager.kt", l = {390}, m = "updateShowLocationSetting")
public final class C759030Tq1 extends AbstractC23140094w {
    public boolean LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C758980Tpw LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C759030Tq1(C758980Tpw c758980Tpw, InterfaceC1364105Vn<? super C759030Tq1> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = c758980Tpw;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("RoomFunctionSettingsManager@eba.updateShowLocationSetting$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLJIILLIIL = this.LLILLL.LJIILLIIL(false, this);
        C1C7U.LIZIZ("RoomFunctionSettingsManager@eba.updateShowLocationSetting$1");
        return objLJIILLIIL;
    }
}
