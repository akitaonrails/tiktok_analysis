package X;

import com.ss.android.ugc.aweme.feed.util.LivePreviewCTASmartDisplayManager;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.0qFt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
@InterfaceC1294060jmO
public final class C1542990qFt {
    public static final C1542990qFt LIZ = new C1542990qFt();
    public static final ConcurrentHashMap<String, C1063560dmc> LIZIZ = new ConcurrentHashMap<>();

    public static EnumC1063540dma LIZ(C1543190qGD c1543190qGD, String str, String str2) {
        EnumC1063530dmZ access;
        String value;
        C1543420qGa c1543420qGa = c1543190qGD.LJIIL;
        c1543420qGa.getClass();
        InterfaceC1063710dmr interfaceC1063710dmrLIZ = c1543420qGa.LIZIZ.LIZ(C1543040qFy.LIZ(c1543190qGD), str2);
        if (interfaceC1063710dmrLIZ != null && (access = interfaceC1063710dmrLIZ.getAccess()) != null && (value = access.getValue()) != null) {
            return C1063550dmb.LIZ(value);
        }
        LIZ.getClass();
        ConcurrentHashMap<String, C1063560dmc> concurrentHashMap = LIZIZ;
        if (concurrentHashMap.get(str) != null) {
            return concurrentHashMap.get(str).LIZ.get(str2);
        }
        C1063560dmc c1063560dmc = concurrentHashMap.get(LivePreviewCTASmartDisplayManager.DEFAULT);
        if (c1063560dmc == null) {
            return null;
        }
        return c1063560dmc.LIZ.get(str2);
    }
}
