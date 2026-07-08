package X;

import com.bytedance.android.livesdk.livesetting.other.LiveStrategyParamsOptAsyncSwitchSetting;
import com.bytedance.android.livesdk.livesetting.other.LiveStrategyParamsSwitchSetting;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS205S0000000_17;

/* JADX INFO: renamed from: X.0eT4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1089880eT4 implements InterfaceC1088570eQx<Pair<? extends InterfaceC1100800ekg, ? extends C1101180elI>> {
    public final EnumC755280Tjy LL;
    public final boolean LLILLJJLI = LiveStrategyParamsOptAsyncSwitchSetting.getValue();
    public final Map<String, Function0<Unit>> LLILLL;

    public C1089880eT4(EnumC755280Tjy enumC755280Tjy) {
        this.LL = enumC755280Tjy;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("temperature", AFwS205S0000000_17.get$arr$(271));
        linkedHashMap.put("network_quality", AFwS205S0000000_17.get$arr$(272));
        linkedHashMap.put("power_rate", AFwS205S0000000_17.get$arr$(273));
        linkedHashMap.put("is_charging", AFwS205S0000000_17.get$arr$(274));
        linkedHashMap.put("is_local_volume", AFwS205S0000000_17.get$arr$(275));
        this.LLILLL = linkedHashMap;
    }

    @Override // X.InterfaceC1088570eQx
    public final void LIZJ(Pair pair) {
        if (this.LL != EnumC755280Tjy.ANCHOR) {
            List<String> list = LiveStrategyParamsSwitchSetting.getValue().performanceParams;
            for (Map.Entry entry : ((LinkedHashMap) this.LLILLL).entrySet()) {
                Object key = entry.getKey();
                Function0 function0 = (Function0) entry.getValue();
                if (list.contains(key)) {
                    if (this.LLILLJJLI) {
                        C23250099c.LIZLLL(C817503Hh.LL, C0PEM.LIZJ, null, new C313801Jo(function0, null), 2);
                    } else {
                        C786410Ut5.LJJZZIII(C0IK5.LIZ(), new RunnableC514801zW(function0, (Function0<Unit>) 153));
                    }
                }
            }
        }
    }
}
