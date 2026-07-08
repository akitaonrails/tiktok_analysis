package X;

import com.bytedance.scene.Scene;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: renamed from: X.0Sy6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C738560Sy6 implements InterfaceC497601wk {
    public static final C738560Sy6 LL = new C738560Sy6();
    public static final Map<Integer, C738550Sy5> LLILLJJLI;
    public static final C2232408os LLILLL;

    static {
        C2232408os c2232408os = new C2232408os(C786410Ut5.h4());
        LLILLJJLI = new LinkedHashMap();
        LLILLL = c2232408os;
    }

    @Override // X.InterfaceC497601wk
    public final CoroutineContext getCoroutineContext() {
        return LLILLL;
    }

    public static Unit LIZ(String str, float f, EnumC738160SxS enumC738160SxS, String str2, int i) {
        String strName;
        InterfaceC1493505sz interfaceC1493505szLIZIZ = null;
        if ((i & 4) != 0) {
            enumC738160SxS = null;
        }
        if ((i & 16) != 0) {
            interfaceC1493505szLIZIZ = C0I0B.LJFF.LIZIZ();
        }
        if (str.length() != 0 && f != 0.0f) {
            C13DA c13da = new C13DA();
            c13da.put("load_time", String.valueOf(f));
            c13da.put("input_type", str);
            c13da.put(Scene.SCENE_SERVICE, str2);
            if (enumC738160SxS != null && (strName = enumC738160SxS.name()) != null) {
                c13da.put("lifecycle_stage", strName);
            }
            Map mapBuild = c13da.build();
            interfaceC1493505szLIZIZ.getClass();
            C20684815ws.LJIILLIIL("im_input_init_latency", mapBuild);
            return Unit.LIZ;
        }
        return Unit.LIZ;
    }
}
