package X;

import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.geoblocking.api.IGeoBlockingDepService;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0pdB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1518990pdB {
    public static final C1518990pdB LIZ = new C1518990pdB();
    public static String LIZIZ = "default";
    public static final AtomicBoolean LIZJ = new AtomicBoolean(false);
    public static final AtomicBoolean LIZLLL = new AtomicBoolean(false);
    public static final AtomicBoolean LJ = new AtomicBoolean(false);

    public static void LIZ(int i, String str) {
        Object obj;
        int i2;
        InterfaceC1519030pdF interfaceC1519030pdFLIZJ = C100C.LIZ.LIZJ();
        Pair[] pairArr = new Pair[5];
        pairArr[0] = new Pair(Scene.SCENE_SERVICE, String.valueOf(i));
        pairArr[1] = new Pair("business", "geoblock_popup");
        String str2 = "1";
        if (((IGeoBlockingDepService) ServiceManager.get().getService(IGeoBlockingDepService.class)).isLogin()) {
            obj = "1";
        } else {
            obj = CardStruct.IStatusCode.DEFAULT;
        }
        pairArr[2] = new Pair("login_type", obj);
        pairArr[3] = new Pair("trigger_path", str);
        AtomicBoolean atomicBoolean = LJ;
        if (!atomicBoolean.get()) {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        pairArr[4] = new Pair("popup_ready", str2);
        interfaceC1519030pdFLIZJ.LIZ("trigger_geoblock_popup", C2097608Jq.LJIIIIZZ(pairArr));
        C1519020pdE c1519020pdE = C1519020pdE.LIZ;
        if (atomicBoolean.get()) {
            i2 = 200;
        } else {
            i2 = 100;
        }
        c1519020pdE.LIZIZ(i2);
    }
}
