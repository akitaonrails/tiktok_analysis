package X;

import java.util.ArrayList;

/* JADX INFO: renamed from: X.0oYe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1477740oYe {
    public static final /* synthetic */ int LIZ = 0;

    public static C1477130oXf LIZ() {
        final ArrayList arrayList = new ArrayList();
        if (C582130MsN.LIZ().getConfig().getCommonConfig().getVideoUrlHooks() != null) {
            arrayList.addAll(C582130MsN.LIZ().getConfig().getCommonConfig().getVideoUrlHooks());
        }
        if (C582130MsN.LIZ().getConfig().getPreloaderExperiment().PreloadTypeExperiment() == C0NKF.VideoCache) {
            EnumC1477770oYh.VideoCache.call(new InterfaceC1481300oeO() { // from class: X.0oYk
                @Override // X.InterfaceC1481300oeO
                public final Object call() {
                    return Boolean.valueOf(arrayList.add(new C1477910oYv(C1478160oZK.LIZ())));
                }
            });
        } else {
            arrayList.add(new C1477900oYu(C1478160oZK.LIZ(), C582130MsN.LIZ().getConfig().getCommonConfig().getVideoUrlHookHook()));
        }
        C582130MsN.LIZ().getConfig().getCommonConfig().getDefaultCDNTimeoutTime();
        return new C1477130oXf(arrayList);
    }
}
