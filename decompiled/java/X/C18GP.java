package X;

import android.os.Handler;
import android.os.Message;
import ci3.a;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.18GP, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C18GP extends a implements Handler.Callback {
    public static volatile Handler LLILLJJLI;
    public static final C18GP LL = new C18GP();
    public static final ArrayList<Message> LLILLL = new ArrayList<>();

    @Override // android.os.HandlerThread
    public final void onLooperPrepared() {
        boolean zLJ = C0W9U.LJ(this.bpeaTraceContext);
        try {
            bpea_origin_onLooperPrepared();
            if (zLJ) {
                C0W9U.LJFF();
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            if (zLJ) {
                C0W9U.LJFF();
            }
            throw th;
        }
    }

    public C18GP() {
        super("BtmSDK-ALog");
    }

    public final void bpea_origin_onLooperPrepared() {
        super.onLooperPrepared();
        try {
            Thread.sleep(C18CS.LIZ.LIZLLL().LIZ());
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C18CE.LIZ.LJFF(1498, "ALogHandlerThread#onLooperPrepared", null, e, false);
        }
        LLILLJJLI = new Handler(getLooper(), this);
        ArrayList<Message> arrayList = LLILLL;
        synchronized (arrayList) {
            try {
                for (Message message : arrayList) {
                    Handler handler = LLILLJJLI;
                    if (handler != null) {
                        C786410Ut5.LJLJJL(handler, message);
                    }
                }
                LLILLL.clear();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        C1778280wNO c1778280wNO;
        String strLIZIZ;
        C18HY c18hy;
        Function0 function0;
        Object messageObj = HandlerHook.getMessageObj(message.obj);
        Object objInvoke = null;
        if (messageObj instanceof C1778280wNO) {
            c1778280wNO = (C1778280wNO) messageObj;
        } else {
            c1778280wNO = null;
        }
        if (c1778280wNO == null) {
            return false;
        }
        try {
            if (c1778280wNO.LIZJ != null) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("delayTime: ");
                sbLIZ.append(System.currentTimeMillis() - c1778280wNO.LIZJ.longValue());
                sbLIZ.append('\n');
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            } else {
                strLIZIZ = "";
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(strLIZIZ);
            Object obj = c1778280wNO.LIZIZ;
            if (C19719512Dh.LJFF(0, obj) && (function0 = (Function0) obj) != null) {
                objInvoke = function0.invoke();
            }
            sbLIZ2.append(objInvoke);
            String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
            C18IP c18ip = C18IP.LIZ;
            C18IH c18ihLIZ = c18ip.LIZ();
            if (c18ihLIZ != null) {
                c18ihLIZ.i(c1778280wNO.LIZ, strLIZIZ2);
            }
            if (c18ip.LIZLLL() && (c18hy = (C18HY) C18IP.LJIIIZ.getValue(c18ip, C18IP.LIZIZ[6])) != null) {
                c18hy.i(c1778280wNO.LIZ, strLIZIZ2);
                return true;
            }
            return true;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C18CE.LIZ.LJFF(1498, "ALogHandlerThread#handleMessage", null, e, false);
            return true;
        }
    }
}
