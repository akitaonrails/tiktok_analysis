package X;

import android.content.pm.ServiceInfo;
import android.os.IBinder;
import android.os.Message;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.Field;

/* JADX INFO: renamed from: X.088J, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C088J {
    public static Field LJFF;
    public static Field LJI;
    public static Field LJII;
    public static Field LJIIIIZZ;
    public static Field LJIIIZ;
    public static Field LJIIJ;
    public final String LIZ;
    public final int LIZIZ;
    public final long LIZJ;
    public final String LIZLLL;
    public final String LJ = C786410Ut5.u3().getName();

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ServiceFollowBean{mServiceName='");
        sbLIZ.append(this.LIZ);
        sbLIZ.append('\'');
        sbLIZ.append(", mWhat=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", mTimeStamp=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", mToken='");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append('\'');
        sbLIZ.append(", mThreadName='");
        sbLIZ.append(this.LJ);
        sbLIZ.append('\'');
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static C088J LIZ(Message message) {
        String str;
        try {
            switch (message.what) {
                case 114:
                    if (LJFF == null) {
                        LJFF = C1961107mD.LIZ(HandlerHook.getMessageObj(message.obj).getClass(), "info");
                    }
                    if (LJI == null) {
                        LJI = C1961107mD.LIZ(HandlerHook.getMessageObj(message.obj).getClass(), "token");
                    }
                    ServiceInfo serviceInfo = (ServiceInfo) LJFF.get(HandlerHook.getMessageObj(message.obj));
                    if (serviceInfo != null) {
                        str = serviceInfo.name;
                    } else {
                        str = null;
                    }
                    return new C088J(message.what, str, System.currentTimeMillis(), LJI.get(HandlerHook.getMessageObj(message.obj)).toString());
                case 115:
                    if (LJII == null) {
                        LJII = C1961107mD.LIZ(HandlerHook.getMessageObj(message.obj).getClass(), "token");
                    }
                    IBinder iBinder = (IBinder) LJII.get(HandlerHook.getMessageObj(message.obj));
                    if (iBinder != null) {
                        return new C088J(message.what, C088K.LLILLJJLI.LIZ(iBinder), System.currentTimeMillis(), iBinder.toString());
                    }
                    break;
                case 116:
                    return new C088J(message.what, C088K.LLILLJJLI.LIZ((IBinder) HandlerHook.getMessageObj(message.obj)), System.currentTimeMillis(), HandlerHook.getMessageObj(message.obj).toString());
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
                    if (LJIIIIZZ == null) {
                        LJIIIIZZ = C1961107mD.LIZ(HandlerHook.getMessageObj(message.obj).getClass(), "token");
                    }
                    IBinder iBinder2 = (IBinder) LJIIIIZZ.get(HandlerHook.getMessageObj(message.obj));
                    if (iBinder2 != null) {
                        return new C088J(message.what, C088K.LLILLJJLI.LIZ(iBinder2), System.currentTimeMillis(), iBinder2.toString());
                    }
                    break;
                case 122:
                    if (LJIIIZ == null) {
                        LJIIIZ = C1961107mD.LIZ(HandlerHook.getMessageObj(message.obj).getClass(), "token");
                    }
                    IBinder iBinder3 = (IBinder) LJIIIZ.get(HandlerHook.getMessageObj(message.obj));
                    if (iBinder3 != null) {
                        return new C088J(message.what, C088K.LLILLJJLI.LIZ(iBinder3), System.currentTimeMillis(), iBinder3.toString());
                    }
                    break;
                case 123:
                    if (LJIIJ == null) {
                        LJIIJ = C1961107mD.LIZ(HandlerHook.getMessageObj(message.obj).getClass(), "token");
                    }
                    IBinder iBinder4 = (IBinder) LJIIJ.get(HandlerHook.getMessageObj(message.obj));
                    if (iBinder4 != null) {
                        return new C088J(message.what, C088K.LLILLJJLI.LIZ(iBinder4), System.currentTimeMillis(), iBinder4.toString());
                    }
                    break;
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        return new C088J(message.what, "unknow", System.currentTimeMillis(), "unknow");
    }

    public C088J(int i, String str, long j, String str2) {
        this.LIZ = str;
        this.LIZIZ = i;
        this.LIZJ = j;
        this.LIZLLL = str2;
    }
}
