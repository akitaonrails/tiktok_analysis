package X;

import android.content.Context;
import android.os.Handler;
import android.util.Log;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.ttlivestreamer.core.utils.AVLog;
import java.lang.reflect.InvocationTargetException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0jDv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public abstract class AbstractC1272690jDv {
    public static final String TAG = AbstractC1272690jDv.class.getSimpleName();
    public InterfaceC1283880jVy mCallback;
    public volatile int mLastCode = -17;
    public int mMask;

    public abstract JSONObject getStatus();

    public abstract boolean isInplaceProcess2D();

    public abstract int process(int i, boolean z, int i2, int i3, float[] fArr, int[] iArr);

    public abstract void release();

    public abstract void setEnable(boolean z, int i);

    public abstract void setHandler(Handler handler);

    public abstract void updateParams(JSONObject jSONObject);

    public boolean enable() {
        return this.mMask == 0;
    }

    public void setCallback(InterfaceC1283880jVy interfaceC1283880jVy) {
        this.mCallback = interfaceC1283880jVy;
    }

    public void enable(boolean z, int i) {
        int i2;
        if (z) {
            i2 = 0;
        } else {
            i2 = this.mMask | i;
        }
        this.mMask = i2;
    }

    public static AbstractC1272690jDv Create(Context context, JSONObject jSONObject, InterfaceC1283880jVy interfaceC1283880jVy) {
        if (jSONObject != null) {
            try {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(AbstractC1272690jDv.class.getPackage().getName());
                sbLIZ.append(".BmfVideoDenoiseFilterImpl");
                return (AbstractC1272690jDv) Class.forName(C2188811AlT.LIZIZ(sbLIZ)).getDeclaredConstructor(Context.class, JSONObject.class, InterfaceC1283880jVy.class).newInstance(context, jSONObject, interfaceC1283880jVy);
            } catch (InvocationTargetException e) {
                TryCatchGuardChecker.doCheck(e);
                printErrorLog(TAG, "create BmfVideoDenoiseFilterImpl failed. ", e.getTargetException());
                return null;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                printErrorLog(TAG, "reflect BmfVideoDenoiseFilterImpl failed. ", th);
                return null;
            }
        }
        return null;
    }

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
        AVLog.ioe(str, str2);
    }

    public void onError(int i, String str, String str2, Throwable th) {
        this.mLastCode = i;
        printErrorLog(str, str2, th);
    }
}
