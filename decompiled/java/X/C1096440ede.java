package X;

import com.bytedance.android.livesdk.function.RoomFunctionService;

/* JADX INFO: renamed from: X.0ede, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
@C09DV(c = "com.bytedance.android.livesdk.function.RoomFunctionService", f = "RoomFunctionService.kt", l = {1559}, m = "getGuardianSettings$suspendImpl")
public final class C1096440ede extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ RoomFunctionService LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1096440ede(RoomFunctionService roomFunctionService, InterfaceC1364105Vn<? super C1096440ede> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = roomFunctionService;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("RoomFunctionService@938f.getGuardianSettings$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLIZIZ = RoomFunctionService.LIZIZ(this.LLILLJJLI, null, this);
        C1C7U.LIZIZ("RoomFunctionService@938f.getGuardianSettings$1");
        return objLIZIZ;
    }
}
