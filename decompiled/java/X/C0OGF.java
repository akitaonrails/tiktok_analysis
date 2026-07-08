package X;

import Y.ACallableS241S0200000_9;
import Y.ARunnableS78S0200000_9;
import android.text.TextUtils;
import android.util.Log;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.music.model.MusicDetail;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0OGF, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0OGF extends AbstractC666100QAu<MusicDetail> {
    public final /* synthetic */ C633060OsK LL;

    @Override // X.AbstractC666100QAu
    public final boolean checkParams(Object... objArr) {
        return objArr != null;
    }

    public C0OGF(C633060OsK c633060OsK) {
        this.LL = c633060OsK;
    }

    @Override // X.AbstractC666100QAu
    public final boolean sendRequest(Object... objArr) {
        boolean zBooleanValue;
        this.LL.LLJ = this.mHandler;
        if (!super.sendRequest(objArr)) {
            return false;
        }
        if (objArr.length > 0 && TextUtils.isEmpty((String) objArr[0])) {
            JSONObject jSONObject = new JSONObject();
            try {
                String stackTraceString = Log.getStackTraceString(new Throwable());
                if (stackTraceString.length() > 1024) {
                    stackTraceString = stackTraceString.substring(0, 1024);
                }
                jSONObject.put("error_stack", stackTraceString);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
            C794240VDq.LIZJ("music_id_empty", jSONObject);
        }
        if (objArr.length >= 4) {
            zBooleanValue = ((Boolean) objArr[3]).booleanValue();
        } else {
            zBooleanValue = false;
        }
        C633100OsO c633100OsO = C633100OsO.LIZ;
        String str = (String) objArr[0];
        String string = objArr[1].toString();
        c633100OsO.getClass();
        MusicDetail musicDetailLIZ = C633100OsO.LIZ(str, string);
        if (musicDetailLIZ != null && !zBooleanValue) {
            if (((Boolean) C279540AxU.LIZ.getValue()).booleanValue()) {
                this.mHandler.post(new ARunnableS78S0200000_9(this, musicDetailLIZ, 31));
                return true;
            }
            handleData(musicDetailLIZ);
            this.LL.onSuccess();
            return true;
        }
        C1BVK.LIZIZ().LIZ(this.mHandler, new ACallableS241S0200000_9(this, objArr, 0), 0);
        return true;
    }
}
