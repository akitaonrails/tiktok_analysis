package X;

import com.bytedance.android.livesdk.function.RoomFunctionService;

/* JADX INFO: renamed from: X.0edf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
@C09DV(c = "com.bytedance.android.livesdk.function.RoomFunctionService", f = "RoomFunctionService.kt", l = {1497}, m = "readSettings$suspendImpl")
public final class C1096450edf extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ RoomFunctionService LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1096450edf(RoomFunctionService roomFunctionService, InterfaceC1364105Vn<? super C1096450edf> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = roomFunctionService;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("RoomFunctionService@938f.readSettings$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLJ = RoomFunctionService.LJ(this.LLILLJJLI, null, this);
        C1C7U.LIZIZ("RoomFunctionService@938f.readSettings$1");
        return objLJ;
    }
}
