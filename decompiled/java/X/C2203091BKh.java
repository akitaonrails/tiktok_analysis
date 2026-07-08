package X;

import com.bytedance.android.livesdk.livesetting.clientai.AlgoPkgConfig;
import com.bytedance.android.livesdk.livesetting.clientai.LiveClientTriggerConfig;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS70S1300000_34;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1BKh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2203091BKh implements InterfaceC2203121BKk {
    public final Map<String, C2203071BKf> LIZ;

    @Override // X.InterfaceC2203121BKk
    public final void LIZLLL() {
    }

    public C2203091BKh(Map<String, C2203071BKf> map) {
        this.LIZ = map;
    }

    @Override // X.InterfaceC2203121BKk
    public final void LIZ(String str) {
        Function0<? extends InterfaceC2203131BKl> function0;
        InterfaceC2203131BKl interfaceC2203131BKlInvoke;
        Iterator<T> it2 = this.LIZ.entrySet().iterator();
        while (it2.hasNext()) {
            Map.Entry entry = (Map.Entry) it2.next();
            String str2 = (String) entry.getKey();
            C2203071BKf c2203071BKf = (C2203071BKf) entry.getValue();
            C182100mx.LIZ(str2, c2203071BKf.LIZ, c2203071BKf.LIZIZ, c2203071BKf.LIZJ, false, C203600qQ.LIZ(), str);
            if (((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).isLocalTest() && (function0 = C2203061BKe.LJIIIIZZ) != null && (interfaceC2203131BKlInvoke = function0.invoke()) != null) {
                interfaceC2203131BKlInvoke.LIZIZ(c2203071BKf.LIZ, str2, c2203071BKf.LIZJ, c2203071BKf.LIZIZ, str);
            }
        }
    }

    @Override // X.InterfaceC2203121BKk
    public final void LIZJ(final JSONArray jSONArray) {
        ((ExecutorService) C1472420oQ4.LIZ.getValue()).submit(new Runnable() { // from class: X.1BKg
            public final void LIZ() {
                Function0<? extends InterfaceC2203131BKl> function0;
                InterfaceC2203131BKl interfaceC2203131BKlInvoke;
                C2203091BKh c2203091BKh = this.LL;
                JSONArray jSONArray2 = jSONArray;
                c2203091BKh.getClass();
                String strLIZ = C203600qQ.LIZ();
                AtomicBoolean atomicBoolean = C2203061BKe.LIZ;
                Map<String, C2203071BKf> map = c2203091BKh.LIZ;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                for (Map.Entry<String, C2203071BKf> entry : map.entrySet()) {
                    if (entry.getValue().LIZLLL) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    } else {
                        linkedHashMap2.put(entry.getKey(), entry.getValue());
                    }
                }
                if (!linkedHashMap.isEmpty()) {
                    C2203071BKf c2203071BKf = (C2203071BKf) C13LP.LJJJJZ(linkedHashMap.values());
                    AlgoPkgConfig algoPkgConfig = LiveClientTriggerConfig.INSTANCE.getAlgoPkgConfig(c2203071BKf.LJ);
                    if (c2203071BKf.LJ.length() == 0) {
                        C2203061BKe.LIZ(linkedHashMap, strLIZ, C786410Ut5.J3(new JSONObject()), jSONArray2);
                    } else {
                        C1106700euC.LIZ(c2203071BKf.LJ, C2203061BKe.LJIIIZ, c2203071BKf.LIZ, C13LP.LLIIII(linkedHashMap.keySet()), new C2203051BKd(strLIZ, linkedHashMap, jSONArray2), new AwS70S1300000_34(algoPkgConfig, (AlgoPkgConfig) linkedHashMap, (Map<String, C2203071BKf>) strLIZ, (String) jSONArray2, (JSONArray) 2));
                    }
                }
                if (!linkedHashMap2.isEmpty()) {
                    C2203061BKe.LIZ(linkedHashMap2, strLIZ, C786410Ut5.J3(new JSONObject()), jSONArray2);
                }
                Iterator<T> it2 = c2203091BKh.LIZ.entrySet().iterator();
                while (it2.hasNext()) {
                    Map.Entry entry2 = (Map.Entry) it2.next();
                    String str = (String) entry2.getKey();
                    C2203071BKf c2203071BKf2 = (C2203071BKf) entry2.getValue();
                    C182100mx.LIZ(str, c2203071BKf2.LIZ, c2203071BKf2.LIZIZ, c2203071BKf2.LIZJ, true, C203600qQ.LIZ(), null);
                    if (((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).isLocalTest() && (function0 = C2203061BKe.LJIIIIZZ) != null && (interfaceC2203131BKlInvoke = function0.invoke()) != null) {
                        interfaceC2203131BKlInvoke.LIZ(c2203071BKf2.LIZ, str, c2203071BKf2.LIZJ, c2203071BKf2.LIZIZ);
                    }
                }
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("LiveTriggerEngine$TriggerCepListener@6fd.onSuccess$1");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("LiveTriggerEngine$TriggerCepListener@6fd.onSuccess$1");
            }
        });
    }
}
