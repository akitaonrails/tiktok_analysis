package X;

import android.content.Intent;
import android.content.pm.ServiceInfo;
import android.os.IBinder;
import android.os.Message;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.Field;

/* JADX INFO: renamed from: X.088I, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C088I {
    public static Field LJI;
    public static Field LJII;
    public static Field LJIIIIZZ;
    public static Field LJIIIZ;
    public static Field LJIIJ;
    public static Field LJIIJJI;
    public static Field LJIIL;
    public final String LIZ;
    public final int LIZIZ;
    public final long LIZJ;
    public final String LIZLLL;
    public final String LJ = C786410Ut5.u3().getName();
    public final int LJFF;

    public final String toString() {
        String strLIZIZ;
        int i = this.LJFF;
        if (i == 0) {
            strLIZIZ = "Not_Followed";
        } else if (i == 9527) {
            strLIZIZ = "System";
        } else if (i == 9528) {
            strLIZIZ = "Schedule";
        } else {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Error:");
            sbLIZ.append(this.LJFF);
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("ServiceFollowBean{mServiceName='");
        sbLIZ2.append(this.LIZ);
        sbLIZ2.append('\'');
        sbLIZ2.append(", mWhat=");
        sbLIZ2.append(this.LIZIZ);
        sbLIZ2.append(", mTimeStamp=");
        sbLIZ2.append(this.LIZJ);
        sbLIZ2.append(", mToken='");
        sbLIZ2.append(this.LIZLLL);
        sbLIZ2.append('\'');
        sbLIZ2.append(", mThreadName='");
        sbLIZ2.append(this.LJ);
        sbLIZ2.append('\'');
        sbLIZ2.append(", mHandleFlag=");
        sbLIZ2.append(strLIZIZ);
        sbLIZ2.append('}');
        return C2188811AlT.LIZIZ(sbLIZ2);
    }

    public static C088I LIZ(Message message) {
        try {
            String str = null;
            switch (message.what) {
                case 113:
                    Object messageObj = HandlerHook.getMessageObj(message.obj);
                    if (LJIIL == null) {
                        LJIIL = C1963407ma.LIZ(messageObj.getClass(), "intent");
                    }
                    Intent intent = (Intent) LJIIL.get(messageObj);
                    if (intent != null) {
                        C2204961BRm.LJJIJIIJIL(intent.getComponent(), new C0WZX("dzBzEgAjS8/YVFkiQFyUajCVf5LEaLPGXpKJLSCaBvL6F2rDOTtqSytTg22ZuIiLf2gIeXWwBlE=", null));
                        AnonymousClass0888.LIZ();
                        return new C088I(message.what, System.currentTimeMillis(), 0, C2204961BRm.LJJIJIIJIL(intent.getComponent(), new C0WZX("dzBzEgAjS8/YVFkiQFyUajCVf5LEaLPGXpKJLSCaBvL6F2rDOTtqSytTg22ZuIiLf2gIeXWwBlE=", null)), "null");
                    }
                    break;
                case 114:
                    if (LJI == null) {
                        LJI = C1963407ma.LIZ(HandlerHook.getMessageObj(message.obj).getClass(), "info");
                    }
                    if (LJII == null) {
                        LJII = C1963407ma.LIZ(HandlerHook.getMessageObj(message.obj).getClass(), "token");
                    }
                    ServiceInfo serviceInfo = (ServiceInfo) LJI.get(HandlerHook.getMessageObj(message.obj));
                    if (serviceInfo != null) {
                        str = serviceInfo.name;
                    }
                    return new C088I(message.what, System.currentTimeMillis(), message.arg2, str, LJII.get(HandlerHook.getMessageObj(message.obj)).toString());
                case 115:
                    if (LJIIIIZZ == null) {
                        LJIIIIZZ = C1963407ma.LIZ(HandlerHook.getMessageObj(message.obj).getClass(), "token");
                    }
                    IBinder iBinder = (IBinder) LJIIIIZZ.get(HandlerHook.getMessageObj(message.obj));
                    if (iBinder != null) {
                        String strLIZ = C088H.LLILLL.LIZ(iBinder);
                        return new C088I(message.what, System.currentTimeMillis(), message.arg2, strLIZ, iBinder.toString());
                    }
                    break;
                case 116:
                    String strLIZ2 = C088H.LLILLL.LIZ((IBinder) HandlerHook.getMessageObj(message.obj));
                    return new C088I(message.what, System.currentTimeMillis(), message.arg2, strLIZ2, HandlerHook.getMessageObj(message.obj).toString());
                case 117:
                case 118:
                case 119:
                case 120:
                default:
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("message.what = ");
                    sbLIZ.append(message.what);
                    sbLIZ.append(" is not excepted!");
                    throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
                case 121:
                    if (LJIIIZ == null) {
                        LJIIIZ = C1963407ma.LIZ(HandlerHook.getMessageObj(message.obj).getClass(), "token");
                    }
                    IBinder iBinder2 = (IBinder) LJIIIZ.get(HandlerHook.getMessageObj(message.obj));
                    if (iBinder2 != null) {
                        String strLIZ3 = C088H.LLILLL.LIZ(iBinder2);
                        return new C088I(message.what, System.currentTimeMillis(), message.arg2, strLIZ3, iBinder2.toString());
                    }
                    break;
                case 122:
                    if (LJIIJ == null) {
                        LJIIJ = C1963407ma.LIZ(HandlerHook.getMessageObj(message.obj).getClass(), "token");
                    }
                    IBinder iBinder3 = (IBinder) LJIIJ.get(HandlerHook.getMessageObj(message.obj));
                    if (iBinder3 != null) {
                        String strLIZ4 = C088H.LLILLL.LIZ(iBinder3);
                        return new C088I(message.what, System.currentTimeMillis(), message.arg2, strLIZ4, iBinder3.toString());
                    }
                    break;
                case 123:
                    if (LJIIJJI == null) {
                        LJIIJJI = C1963407ma.LIZ(HandlerHook.getMessageObj(message.obj).getClass(), "token");
                    }
                    IBinder iBinder4 = (IBinder) LJIIJJI.get(HandlerHook.getMessageObj(message.obj));
                    if (iBinder4 != null) {
                        String strLIZ5 = C088H.LLILLL.LIZ(iBinder4);
                        return new C088I(message.what, System.currentTimeMillis(), message.arg2, strLIZ5, iBinder4.toString());
                    }
                    break;
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        return new C088I(message.what, System.currentTimeMillis(), message.arg2, "unknow", "unknow");
    }

    public C088I(int i, long j, int i2, String str, String str2) {
        this.LIZ = str;
        this.LIZIZ = i;
        this.LIZJ = j;
        this.LIZLLL = str2;
        this.LJFF = i2;
    }
}
