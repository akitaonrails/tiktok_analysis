package X;

import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0CBF, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0CBF extends C09AY implements Function0<Unit> {
    public C0CBF() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        if (C798410VTr.LIZ()) {
            int code = C0CBG.CURRENT.getCode();
            HashMap map = new HashMap();
            map.put("monitor_scene", "scene_non_video_play");
            map.put("vv_code", 9000);
            map.put("report_end_type", 4);
            C798410VTr.LJI(code, map);
        }
        return Unit.LIZ;
    }
}
