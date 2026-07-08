package X;

import com.ss.android.ugc.aweme.feed.util.LivePreviewCTASmartDisplayManager;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AFwS212S0000000_23;

/* JADX INFO: renamed from: X.0qGd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1543450qGd {
    public InterfaceC634840OvC LIZ;
    public final ConcurrentHashMap<EnumC1063300dmC, ConcurrentHashMap<String, InterfaceC1063710dmr>> LIZIZ = new ConcurrentHashMap<>();
    public final C01GW LIZJ = C452501pT.LIZIZ(AFwS212S0000000_23.get$arr$(225));

    public final ConcurrentHashMap<String, InterfaceC1063710dmr> LIZIZ(EnumC1063300dmC enumC1063300dmC) {
        ConcurrentHashMap<String, InterfaceC1063710dmr> concurrentHashMap = this.LIZIZ.get(enumC1063300dmC);
        if (concurrentHashMap == null) {
            this.LIZIZ.put(enumC1063300dmC, new ConcurrentHashMap<>());
            return this.LIZIZ.get(enumC1063300dmC);
        }
        return concurrentHashMap;
    }

    public final InterfaceC1063710dmr LIZ(EnumC1063300dmC enumC1063300dmC, String str) {
        ConcurrentHashMap<String, InterfaceC1063710dmr> concurrentHashMap;
        C1543510qGj c1543510qGj;
        Class<? extends InterfaceC1063710dmr> clsLIZ;
        C1543510qGj c1543510qGj2;
        InterfaceC1063710dmr interfaceC1063710dmr;
        ConcurrentHashMap<String, InterfaceC1063710dmr> concurrentHashMap2 = this.LIZIZ.get(enumC1063300dmC);
        if ((concurrentHashMap2 != null && (interfaceC1063710dmr = concurrentHashMap2.get(str)) != null) || ((concurrentHashMap = this.LIZIZ.get(EnumC1063300dmC.ALL)) != null && (interfaceC1063710dmr = concurrentHashMap.get(str)) != null)) {
            return interfaceC1063710dmr;
        }
        C1543500qGi c1543500qGi = (C1543500qGi) this.LIZJ.getValue();
        if (c1543500qGi.LIZJ.get(LivePreviewCTASmartDisplayManager.DEFAULT) == null || (c1543510qGj2 = c1543500qGi.LIZJ.get(LivePreviewCTASmartDisplayManager.DEFAULT)) == null || (clsLIZ = c1543510qGj2.LIZ(enumC1063300dmC, str)) == null) {
            C1543500qGi c1543500qGi2 = C1543490qGh.LIZ;
            if (c1543500qGi2.LIZJ.get(LivePreviewCTASmartDisplayManager.DEFAULT) == null || (c1543510qGj = c1543500qGi2.LIZJ.get(LivePreviewCTASmartDisplayManager.DEFAULT)) == null || (clsLIZ = c1543510qGj.LIZ(enumC1063300dmC, str)) == null) {
                return null;
            }
        }
        InterfaceC1063710dmr interfaceC1063710dmrNewInstance = clsLIZ.newInstance();
        LIZIZ(enumC1063300dmC).put(str, interfaceC1063710dmrNewInstance);
        return interfaceC1063710dmrNewInstance;
    }
}
