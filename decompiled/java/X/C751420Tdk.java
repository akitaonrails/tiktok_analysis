package X;

import com.bytedance.android.live.function.IRoomFunctionService;
import com.bytedance.android.livesdk.chatroom.model.CommentSwitchSettings;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Tdk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.bytedance.android.livesdk.chatroom.viewmodule.RoomActions$updateCommentStatus$1$1", f = "RoomActions.kt", l = {182}, m = "invokeSuspend")
public final class C751420Tdk extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ DataChannel LLILLL;
    public final /* synthetic */ InterfaceC2329309At<Boolean> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C751420Tdk(boolean z, DataChannel dataChannel, InterfaceC2329309At<Boolean> interfaceC2329309At, InterfaceC1364105Vn<? super C751420Tdk> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = z;
        this.LLILLL = dataChannel;
        this.LLILZ = interfaceC2329309At;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C751420Tdk(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("RoomActions@8aa2.updateCommentStatus$1$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            this.LLILZ.onError(e);
        }
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            CommentSwitchSettings commentSwitchSettings = new CommentSwitchSettings();
            commentSwitchSettings.chat = C750850Tcp.LIZIZ(this.LLILLJJLI);
            IRoomFunctionService iRoomFunctionService = (IRoomFunctionService) C1161920gLG.LIZJ(IRoomFunctionService.class);
            if (iRoomFunctionService != null) {
                DataChannel dataChannel = this.LLILLL;
                this.LL = 1;
                obj = iRoomFunctionService.Rb0(commentSwitchSettings, dataChannel, this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("RoomActions@8aa2.updateCommentStatus$1$1");
                    return objLJFF;
                }
            }
            this.LLILZ.onSuccess(true);
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("RoomActions@8aa2.updateCommentStatus$1$1");
            return unit;
        }
        this.LLILZ.onSuccess(true);
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("RoomActions@8aa2.updateCommentStatus$1$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
