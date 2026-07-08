package X;

import android.content.Context;
import android.content.SharedPreferences;
import com.ss.android.ugc.aweme.reliability.emergencychannel.model.EmergencyConfigDomain;
import com.ss.android.ugc.aweme.reliability.emergencychannel.model.EmergencyConfigPayload;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.08cN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.reliability.emergencychannel.EmergencyChannelManager$loadConfig$2", f = "EmergencyChannelManager.kt", l = {80}, m = "invokeSuspend")
public final class C2154908cN extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super EmergencyConfigPayload>, Object> {
    public int LL;
    public final /* synthetic */ Context LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2154908cN(Context context, InterfaceC1364105Vn<? super C2154908cN> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = context;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2154908cN(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super EmergencyConfigPayload> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objLJI = obj;
        C1C7U.LIZ("EmergencyChannelManager@f1.loadConfig$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        EmergencyConfigPayload emergencyConfigPayload = null;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(objLJI);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(objLJI);
            Map<EmergencyConfigDomain, C2155708cV> map = C08NF.LIZ;
            SharedPreferences sharedPreferencesLIZJ = C810670Vr7.LIZJ(this.LLILLJJLI, 0, "emergency_channel_config_store");
            C08NF.LIZLLL = sharedPreferencesLIZJ;
            if (sharedPreferencesLIZJ == null) {
                sharedPreferencesLIZJ = null;
            }
            String string = sharedPreferencesLIZJ.getString("emergency_config", null);
            if (string == null) {
                C1C7U.LIZIZ("EmergencyChannelManager@f1.loadConfig$2");
                return null;
            }
            this.LL = 1;
            objLJI = C23250099c.LJI(this, C0PEM.LIZJ, new C2155208cQ(string, null));
            if (objLJI == objLJFF) {
                C1C7U.LIZIZ("EmergencyChannelManager@f1.loadConfig$2");
                return objLJFF;
            }
        }
        EmergencyConfigPayload emergencyConfigPayload2 = (EmergencyConfigPayload) objLJI;
        SharedPreferences sharedPreferences = C08NF.LIZLLL;
        if (sharedPreferences == null) {
            sharedPreferences = null;
        }
        long j = sharedPreferences.getLong("emergency_config_publish_timestamp", -1L);
        SharedPreferences sharedPreferences2 = C08NF.LIZLLL;
        if (sharedPreferences2 == null) {
            sharedPreferences2 = null;
        }
        long j2 = sharedPreferences2.getLong("emergency_config_storage_timestamp", -1L);
        if (j == -1) {
            j = j2;
        }
        if (System.currentTimeMillis() - j > C0C64.LJIILLIIL().LJIJJLI(31744, 86400000L, "emergency_config_max_age_millis", true)) {
            SharedPreferences sharedPreferences3 = C08NF.LIZLLL;
            if (sharedPreferences3 == null) {
                sharedPreferences3 = null;
            }
            sharedPreferences3.edit().clear().commit();
            if (emergencyConfigPayload2 != null) {
                String str = emergencyConfigPayload2.configId;
                if (C2155408cS.LIZ() >= 0) {
                    C793770VBv.LJII("emergency_push_expired", new JSONObject(C2097908Jt.LIZJ(new Pair("config_id", str))), null, null);
                }
            }
        } else {
            if (emergencyConfigPayload2 != null) {
                String str2 = emergencyConfigPayload2.configId;
                if (C2155408cS.LIZ() >= 0) {
                    C793770VBv.LJII("emergency_push_loaded", new JSONObject(C2097908Jt.LIZJ(new Pair("config_id", str2))), null, null);
                }
            }
            emergencyConfigPayload = emergencyConfigPayload2;
        }
        C1C7U.LIZIZ("EmergencyChannelManager@f1.loadConfig$2");
        return emergencyConfigPayload;
    }
}
