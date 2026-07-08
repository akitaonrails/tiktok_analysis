package X;

import android.content.Context;
import android.os.Message;
import com.bytedance.common.utility.Logger;
import com.bytedance.common.wschannel.model.IntegerParcelable;
import com.bytedance.common.wschannel.model.SsWsApp;
import com.bytedance.common.wschannel.model.WsChannelMsg;

/* JADX INFO: renamed from: X.0WJW, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0WJW implements InterfaceC821120WJa {
    public static final void LJ(int i, Context context) {
        if (context != null && i > 0 && i <= 3) {
            Logger.debug();
            if (!C0WFY.LIZIZ(context).LIZJ()) {
                return;
            }
            Message message = new Message();
            message.what = 2;
            message.arg1 = i;
            C0WK4.LIZIZ(context).handleMsg(message);
        }
    }

    public static void LJFF(Context context, C0WJY c0wjy) {
        Message messageObtain = Message.obtain();
        messageObtain.what = c0wjy.LIZJ;
        C786410Ut5.LJJIJL(messageObtain.getData(), c0wjy.LIZ, c0wjy.LIZIZ);
        C0WK4.LIZIZ(context).handleMsg(messageObtain);
    }

    @Override // X.InterfaceC821120WJa
    public final void LIZ(Context context, SsWsApp ssWsApp) {
        C0WJY c0wjy = new C0WJY();
        c0wjy.LIZ = "ws_app";
        c0wjy.LIZIZ = ssWsApp;
        c0wjy.LIZJ = 0;
        LJFF(context, c0wjy);
    }

    @Override // X.InterfaceC821120WJa
    public final void LIZIZ(int i, Context context) {
        C0WJY c0wjy = new C0WJY();
        c0wjy.LIZ = "ws_app";
        c0wjy.LIZIZ = new IntegerParcelable(i);
        c0wjy.LIZJ = 1;
        LJFF(context, c0wjy);
    }

    @Override // X.InterfaceC821120WJa
    public final void LIZJ(Context context, SsWsApp ssWsApp) {
        if (!C0WFY.LIZIZ(context).LIZJ()) {
            return;
        }
        C0WJY c0wjy = new C0WJY();
        c0wjy.LIZ = "ws_app";
        c0wjy.LIZIZ = ssWsApp;
        c0wjy.LIZJ = 4;
        LJFF(context, c0wjy);
    }

    @Override // X.InterfaceC821120WJa
    public final void LIZLLL(Context context, WsChannelMsg wsChannelMsg) {
        C0WJY c0wjy = new C0WJY();
        c0wjy.LIZ = "payload";
        c0wjy.LIZIZ = wsChannelMsg;
        c0wjy.LIZJ = 5;
        LJFF(context, c0wjy);
    }
}
