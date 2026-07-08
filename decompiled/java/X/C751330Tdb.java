package X;

import com.bytedance.android.live.function.IRoomFunctionService;
import com.bytedance.android.livesdk.chatroom.model.CommentSwitchSettings;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Tdb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.bytedance.android.livesdk.chatroom.viewmodule.ToolbarBroadcastCommentBehavior$openComment$1$1", f = "ToolbarBroadcastCommentBehavior.kt", l = {81}, m = "invokeSuspend")
public final class C751330Tdb extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C752320TfC LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C751330Tdb(C752320TfC c752320TfC, InterfaceC1364105Vn<? super C751330Tdb> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c752320TfC;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C751330Tdb(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ToolbarBroadcastCommentBehavior@d2c.openComment$1$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C766270U4b.LIZLLL(2131842705);
        }
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            CommentSwitchSettings commentSwitchSettings = new CommentSwitchSettings();
            commentSwitchSettings.chat = C750850Tcp.LIZIZ(true);
            IRoomFunctionService iRoomFunctionService = (IRoomFunctionService) C1161920gLG.LIZJ(IRoomFunctionService.class);
            if (iRoomFunctionService != null) {
                DataChannel dataChannelLIZ = this.LLILLJJLI.LIZ();
                this.LL = 1;
                obj = iRoomFunctionService.Rb0(commentSwitchSettings, dataChannelLIZ, this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("ToolbarBroadcastCommentBehavior@d2c.openComment$1$1");
                    return objLJFF;
                }
            }
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_set_comment_status");
            c474500IjALIZ.LJIJJLI(this.LLILLJJLI.LIZ());
            c474500IjALIZ.LJJII("open", FollowStatusChangeMethod.PARAM_FOLLOW_STATUS);
            c474500IjALIZ.LJJII("anchor", "user_type");
            c474500IjALIZ.LJJII("comment_popup", "situation");
            c474500IjALIZ.LIZ();
            C784440Upu.LIZ().LIZIZ(new C751500Tds(true));
            this.LLILLJJLI.LIZIZ();
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("ToolbarBroadcastCommentBehavior@d2c.openComment$1$1");
            return unit;
        }
        C474500IjA c474500IjALIZ2 = C0IJT.LIZ("livesdk_set_comment_status");
        c474500IjALIZ2.LJIJJLI(this.LLILLJJLI.LIZ());
        c474500IjALIZ2.LJJII("open", FollowStatusChangeMethod.PARAM_FOLLOW_STATUS);
        c474500IjALIZ2.LJJII("anchor", "user_type");
        c474500IjALIZ2.LJJII("comment_popup", "situation");
        c474500IjALIZ2.LIZ();
        C784440Upu.LIZ().LIZIZ(new C751500Tds(true));
        this.LLILLJJLI.LIZIZ();
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("ToolbarBroadcastCommentBehavior@d2c.openComment$1$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
