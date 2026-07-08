package X;

import com.bytedance.pia.core.setting.Settings;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.13qy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20138613qy extends C09AY implements Function0<Map<String, ? extends Boolean>> {
    public final /* synthetic */ Settings LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20138613qy(Settings settings) {
        super(0);
        this.LL = settings;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Map<String, ? extends Boolean> invoke() {
        List listLJIIJJI = C1697810uHb.LJIIJJI("prefetch", "nsr", "snapshot", "cache", "streaming", "preload");
        Settings settings = this.LL;
        int iLIZIZ = C2097908Jt.LIZIZ(C15438062q.LJIJJ(listLJIIJJI, 10));
        if (iLIZIZ < 16) {
            iLIZIZ = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iLIZIZ);
        for (Object obj : listLJIIJJI) {
            linkedHashMap.put(obj, Boolean.valueOf(settings.enabledFeatures.contains(obj)));
        }
        return linkedHashMap;
    }
}
