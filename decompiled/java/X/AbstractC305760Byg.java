package X;

import Y.ACallableS46S0210000_4;
import android.os.Looper;
import android.os.Message;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.otis.memory.OtisGson;
import com.bytedance.otis.memory.OtisMemoryOpt;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.n;
import com.ss.android.ugc.aweme.app.api.Api;
import com.ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.setting.api.SettingApi;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0Byg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC305760Byg implements WeakHandler.IHandler {
    public static final AbstractC305760Byg LLIZLLLIL = new C305770Byh();
    public final SettingApi LL;
    public JSONObject LLILLL;
    public final List<C0CG2> LLIZ;
    public String LLILLJJLI = "{}";
    public OtisGson LLILZ = new OtisGson();
    public long LLILZIL = 0;
    public boolean LLILZLL = false;

    public abstract void LIZJ(Object obj);

    public final String LIZIZ() {
        String string;
        if (!this.LLILZLL) {
            return this.LLILLJJLI;
        }
        try {
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        if (((Boolean) C291440Bba.LJFF.getValue()).booleanValue()) {
            OtisGson otisGson = this.LLILZ;
            long j = this.LLILZIL;
            synchronized (otisGson) {
                string = OtisGson.readString(j);
            }
        } else {
            string = ((Boolean) C291440Bba.LJ.getValue()).booleanValue() ? OtisMemoryOpt.readString() : null;
        }
        if (string != null) {
            return string;
        }
        if (!((Boolean) C291440Bba.LIZLLL.getValue()).booleanValue()) {
            return "{}";
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("type", "3");
            C793770VBv.LJII("SettingManagerOpt", jSONObject, null, null);
            return "{}";
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            return "{}";
        }
    }

    public AbstractC305760Byg() {
        new WeakHandler(Looper.getMainLooper(), this);
        if (!C1E21.LIZIZ()) {
            this.LL = (SettingApi) ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit(Api.LIZ).create(SettingApi.class);
        }
        this.LLIZ = new ArrayList();
    }

    public final void LIZLLL(n nVar) {
        C15O7.LIZJ(new ACallableS46S0210000_4(this, nVar, 1));
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public final void handleMsg(Message message) {
        LIZJ(HandlerHook.getMessageObj(message.obj));
    }

    public static String LIZ(n nVar, boolean z) {
        String strLJFF;
        int iIntValue = ((Number) C291440Bba.LJIIIIZZ.getValue()).intValue();
        int iIntValue2 = ((Number) C291440Bba.LJI.getValue()).intValue();
        boolean zBooleanValue = ((Boolean) C291440Bba.LJII.getValue()).booleanValue();
        if (!z && iIntValue > 0) {
            if (iIntValue2 >= C08JT.OTIS_NATIVE.ordinal()) {
                strLJFF = new OtisGson().LIZIZ(nVar, zBooleanValue, iIntValue);
            } else {
                strLJFF = C08JS.LJFF(nVar, C08JT.fromInt(iIntValue2), iIntValue);
            }
            ((Boolean) C291440Bba.LIZJ.getValue()).booleanValue();
            return strLJFF;
        }
        if (((Boolean) C07FG.LJFF.getValue()).booleanValue()) {
            return C08JS.LIZJ(668220, nVar);
        }
        return nVar.toString();
    }
}
