package X;

import com.ss.android.ugc.aweme.feed.util.LivePreviewCTASmartDisplayManager;
import java.util.Map;

/* JADX INFO: renamed from: X.0qGh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1543490qGh {
    public static final C1543500qGi LIZ = new C1543500qGi();

    public static final Map<String, Class<? extends InterfaceC1063710dmr>> LIZ(EnumC1063300dmC enumC1063300dmC, String str) {
        C1543510qGj c1543510qGj;
        C1543500qGi c1543500qGi = LIZ;
        if (c1543500qGi.LIZJ.get(str) == null || (c1543510qGj = c1543500qGi.LIZJ.get(str)) == null || enumC1063300dmC == EnumC1063300dmC.NONE) {
            return null;
        }
        return c1543510qGj.LIZJ.get(enumC1063300dmC);
    }

    public static void LIZIZ(Class cls, EnumC1063300dmC enumC1063300dmC, int i) {
        String str;
        if ((i & 2) != 0) {
            enumC1063300dmC = EnumC1063300dmC.ALL;
        }
        if ((i & 4) != 0) {
            str = LivePreviewCTASmartDisplayManager.DEFAULT;
        } else {
            str = null;
        }
        LIZ.LIZ(cls, enumC1063300dmC, str);
    }
}
