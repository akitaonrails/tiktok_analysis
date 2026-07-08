package X;

import android.content.Context;
import android.os.Handler;
import android.util.Log;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.ttlivestreamer.core.utils.AVLog;
import java.lang.reflect.InvocationTargetException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0jDu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public abstract class AbstractC1272680jDu {
    public static final String TAG = AbstractC1272680jDu.class.getSimpleName();
    public volatile int mLastCode = -1;
    public int mMask;

    public abstract void canSkipNode(boolean z);

    public abstract void forceEnable(boolean z, int i);

    public abstract JSONObject getBMFColorCorrectionSetting();

    public abstract JSONObject getStatus();

    public abstract int process(int i, boolean z, int i2, int i3, float[] fArr, int[] iArr);

    public abstract void release();

    public abstract void setBMFColorCorrectionSetting(JSONObject jSONObject);

    public abstract void setEnable(boolean z, int i);

    public abstract void setHandler(Handler handler);

    public static void printErrorLog(String str, String str2, Throwable th) {
        if (th != null) {
            if (th instanceof InvocationTargetException) {
                th = ((InvocationTargetException) th).getTargetException();
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str2);
            sbLIZ.append(" stack: ");
            sbLIZ.append(Log.getStackTraceString(th));
            str2 = C2188811AlT.LIZIZ(sbLIZ);
        }
        AVLog.logKibana(4, str, str2, th);
    }

    public void onError(int i, String str, String str2, Throwable th) {
        this.mLastCode = i;
        printErrorLog(str, str2, th);
    }

    public static AbstractC1272680jDu Create(Context context, JSONObject jSONObject, InterfaceC1273880jFq interfaceC1273880jFq, Handler handler, EnumC1267980j6K enumC1267980j6K, C1267500j5Y c1267500j5Y) {
        if (jSONObject != null) {
            try {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(AbstractC1272680jDu.class.getPackage().getName());
                sbLIZ.append(".BmfVideoStreamHDFilterImpl");
                return (AbstractC1272680jDu) Class.forName(C2188811AlT.LIZIZ(sbLIZ)).getDeclaredConstructor(Context.class, JSONObject.class, InterfaceC1273880jFq.class, Handler.class, EnumC1267980j6K.class, C1267500j5Y.class).newInstance(context, jSONObject, interfaceC1273880jFq, handler, enumC1267980j6K, c1267500j5Y);
            } catch (InvocationTargetException e) {
                TryCatchGuardChecker.doCheck(e);
                printErrorLog(TAG, "create BmfVideoStreamHDFilterImpl failed. ", e.getTargetException());
                return null;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                printErrorLog(TAG, "reflect BmfVideoStreamHDFilterImpl failed. ", th);
                return null;
            }
        }
        return null;
    }
}
