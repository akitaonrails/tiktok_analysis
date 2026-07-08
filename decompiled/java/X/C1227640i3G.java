package X;

import java.util.Map;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0i3G, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1227640i3G {
    public static Map<String, String> LIZ(InterfaceC1224480hyA interfaceC1224480hyA) {
        long jLIZIZ = C1527905yX.LIZIZ(interfaceC1224480hyA.LIZIZ().get(EnumC1227660i3I.FINISH_CREATE_PANEL));
        Map<EnumC1227660i3I, Long> mapLIZIZ = interfaceC1224480hyA.LIZIZ();
        EnumC1227660i3I enumC1227660i3I = EnumC1227660i3I.READY_TO_CREATE_PANEL;
        long jLIZIZ2 = jLIZIZ - C1527905yX.LIZIZ(mapLIZIZ.get(enumC1227660i3I));
        long jLIZIZ3 = C1527905yX.LIZIZ(interfaceC1224480hyA.LIZIZ().get(EnumC1227660i3I.FINISH_LOAD_DATA)) - C1527905yX.LIZIZ(interfaceC1224480hyA.LIZIZ().get(EnumC1227660i3I.READY_TO_LOAD_DATA));
        Map<EnumC1227660i3I, Long> mapLIZIZ2 = interfaceC1224480hyA.LIZIZ();
        EnumC1227660i3I enumC1227660i3I2 = EnumC1227660i3I.FINISH_RENDER_DATA;
        return C2097608Jq.LJIIJ(new Pair("panel_create_duration", String.valueOf(jLIZIZ2)), new Pair("panel_data_load_duration", String.valueOf(jLIZIZ3)), new Pair("panel_render_duration", String.valueOf(C1527905yX.LIZIZ(mapLIZIZ2.get(enumC1227660i3I2)) - C1527905yX.LIZIZ(interfaceC1224480hyA.LIZIZ().get(EnumC1227660i3I.READY_TO_RENDER_DATA)))), new Pair("panel_first_frame_total_duration", String.valueOf(C1527905yX.LIZIZ(interfaceC1224480hyA.LIZIZ().get(enumC1227660i3I2)) - C1527905yX.LIZIZ(interfaceC1224480hyA.LIZIZ().get(enumC1227660i3I)))));
    }

    public static void LIZIZ(InterfaceC1224480hyA interfaceC1224480hyA, EnumC1227660i3I enumC1227660i3I) {
        if (!interfaceC1224480hyA.LIZIZ().containsKey(enumC1227660i3I)) {
            interfaceC1224480hyA.LIZIZ().put(enumC1227660i3I, Long.valueOf(System.currentTimeMillis()));
            if (enumC1227660i3I == EnumC1227660i3I.FINISH_RENDER_DATA) {
                interfaceC1224480hyA.LIZ();
            }
        }
    }
}
