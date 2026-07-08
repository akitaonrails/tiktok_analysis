package X;

import android.os.Message;
import com.bytedance.android.livesdkapi.depend.handler.WeakHandler;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.List;

/* JADX INFO: renamed from: X.0ILc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C464940ILc implements InterfaceC465240IMg {
    public final InterfaceC465090ILr LL;
    public final WeakHandler LLILLJJLI = new WeakHandler(this);

    public C464940ILc(InterfaceC465090ILr interfaceC465090ILr) {
        this.LL = interfaceC465090ILr;
    }

    @Override // X.InterfaceC465240IMg
    public final void handleMsg(Message message) {
        List list;
        if (message == null) {
            return;
        }
        int i = message.what;
        if (HandlerHook.getMessageObj(message.obj) instanceof Exception) {
            if (i != 21 && i != 22 && (HandlerHook.getMessageObj(message.obj) instanceof C501470JlZ)) {
                C766270U4b.LJIIJJI(((C501470JlZ) HandlerHook.getMessageObj(message.obj)).getPrompt());
                return;
            }
            return;
        }
        if (22 != i && 21 != i) {
            if (i == 12) {
                HandlerHook.getMessageObj(message.obj);
                return;
            }
            return;
        }
        if (!(HandlerHook.getMessageObj(message.obj) instanceof List)) {
            return;
        }
        try {
            Object messageObj = HandlerHook.getMessageObj(message.obj);
            if (messageObj instanceof List) {
                list = (List) messageObj;
            } else {
                list = null;
            }
            InterfaceC465090ILr interfaceC465090ILr = this.LL;
            if (interfaceC465090ILr == null || list == null) {
                return;
            }
            interfaceC465090ILr.xw(C19719512Dh.LIZIZ(list));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C20441214yg.LJI("LiveLandNoMorePresenter", th);
        }
    }
}
