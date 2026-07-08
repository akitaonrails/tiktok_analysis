package X;

import android.content.SharedPreferences;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.08cM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.reliability.emergencychannel.EmergencyChannelManager$storeConfig$2", f = "EmergencyChannelManager.kt", l = {}, m = "invokeSuspend")
public final class C2154808cM extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ long LLILLJJLI;
    public final /* synthetic */ String LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2154808cM(String str, long j, String str2, InterfaceC1364105Vn<? super C2154808cM> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = str;
        this.LLILLJJLI = j;
        this.LLILLL = str2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2154808cM(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("EmergencyChannelManager@f1.storeConfig$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        if (C08NF.LIZLLL != null) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            SharedPreferences sharedPreferences = C08NF.LIZLLL;
            if (sharedPreferences == null) {
                sharedPreferences = null;
            }
            sharedPreferences.edit().putString("emergency_config", this.LL).putLong("emergency_config_publish_timestamp", this.LLILLJJLI).putLong("emergency_config_storage_timestamp", jCurrentTimeMillis).commit();
            String str = this.LLILLL;
            long j = this.LLILLJJLI;
            if (C2155408cS.LIZ() >= 1) {
                C793770VBv.LJII("emergency_push_stored", new JSONObject(C2097608Jq.LJIIIIZZ(new Pair("config_id", str), new Pair("publish_timestamp", Long.valueOf(j)), new Pair("storage_timestamp", Long.valueOf(jCurrentTimeMillis)))), null, null);
            }
        } else {
            C2155608cU.LIZIZ("storeConfig: sharedPrefs not initialized, not storing config");
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("EmergencyChannelManager@f1.storeConfig$2");
        return unit;
    }
}
