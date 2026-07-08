package X;

import com.bytedance.android.livesdk.function.RoomFunctionService;

/* JADX INFO: renamed from: X.0edd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
@C09DV(c = "com.bytedance.android.livesdk.function.RoomFunctionService", f = "RoomFunctionService.kt", l = {1580}, m = "getAiCommentReplySwitch$suspendImpl")
public final class C1096430edd extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ RoomFunctionService LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1096430edd(RoomFunctionService roomFunctionService, InterfaceC1364105Vn<? super C1096430edd> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = roomFunctionService;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("RoomFunctionService@938f.getAiCommentReplySwitch$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLIZ = RoomFunctionService.LIZ(this.LLILLJJLI, null, this);
        C1C7U.LIZIZ("RoomFunctionService@938f.getAiCommentReplySwitch$1");
        return objLIZ;
    }
}
