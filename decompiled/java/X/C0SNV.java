package X;

import java.util.Map;
import java.util.Set;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0SNV, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0SNV {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(String str, String str2) {
        InterfaceC1602960roc interfaceC1602960rocLIZ = C0VWN.LIZ(str, false);
        if (C07TP.LIZJ(str2)) {
            interfaceC1602960rocLIZ.LJIIJ(new C1904190zeT());
        }
        interfaceC1602960rocLIZ.start();
    }

    public static void LIZIZ(String str, String str2, C21599719g3 c21599719g3, final Function0 function0) {
        if (c21599719g3 == null) {
            return;
        }
        final InterfaceC1602960roc interfaceC1602960rocLIZ = C0VWN.LIZ(str, false);
        if (C07TP.LIZJ(str2)) {
            interfaceC1602960rocLIZ.LJIIJ(new C1904190zeT());
        }
        c21599719g3.LIZLLL(new C0SNZ() { // from class: X.0SNX
            @Override // X.InterfaceC469360Ias
            public final void onPageScrollStateChanged(int i) {
                Map<String, String> mapInvoke;
                Function0<Map<String, String>> function02 = function0;
                if (function02 != null && (mapInvoke = function02.invoke()) != null) {
                    InterfaceC1602960roc interfaceC1602960roc = interfaceC1602960rocLIZ;
                    for (Map.Entry<String, String> entry : mapInvoke.entrySet()) {
                        interfaceC1602960roc.LIZ(entry.getKey(), entry.getValue());
                    }
                }
                if (i != 0) {
                    if (i != 1) {
                        interfaceC1602960rocLIZ.start();
                        return;
                    } else {
                        interfaceC1602960rocLIZ.start();
                        return;
                    }
                }
                interfaceC1602960rocLIZ.stop();
            }
        });
    }

    public static void LIZJ(long j, final String str, Map map, String str2) {
        Set<Map.Entry> setEntrySet;
        InterfaceC1602960roc interfaceC1602960rocLIZIZ = C0VWN.LIZIZ(str);
        if (interfaceC1602960rocLIZIZ != null) {
            if (map != null && (setEntrySet = map.entrySet()) != null) {
                for (Map.Entry entry : setEntrySet) {
                    interfaceC1602960rocLIZIZ.LIZ((String) entry.getKey(), (String) entry.getValue());
                }
            }
            interfaceC1602960rocLIZIZ.LIZJ(j);
        }
        if (str2 != null && C07TP.LIZJ(str2)) {
            C2487409ou.LIZLLL(j + ((long) 20), new Runnable() { // from class: X.0Rwb
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("PhotoModeFeedFPSMonitor@9f98.stopFpsMonitor$2");
                    try {
                        InterfaceC1602960roc interfaceC1602960rocLIZIZ2 = C0VWN.LIZIZ(str);
                        if (interfaceC1602960rocLIZIZ2 != null) {
                            interfaceC1602960rocLIZIZ2.LJIIIIZZ();
                        }
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("PhotoModeFeedFPSMonitor@9f98.stopFpsMonitor$2");
                }
            });
        }
    }
}
