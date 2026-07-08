package X;

import com.bytedance.scene.Scene;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0i2n, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1227350i2n {
    public final C1227340i2m LIZ;
    public String LIZIZ = "";
    public String LIZJ = "";
    public long LIZLLL;

    public C1227350i2n(C1227340i2m c1227340i2m) {
        this.LIZ = c1227340i2m;
    }

    public static boolean LIZ(AbstractC1223800hx4 abstractC1223800hx4) {
        C1223790hx3 c1223790hx3;
        C1224840hyk c1224840hyk = null;
        if (abstractC1223800hx4 instanceof C1224840hyk) {
            c1224840hyk = (C1224840hyk) abstractC1223800hx4;
        }
        if (c1224840hyk != null && Intrinsics.LJFF(c1224840hyk.LLJI.get("is_related_friend_item"), "1")) {
            return true;
        }
        if ((abstractC1223800hx4 instanceof C1223790hx3) && (c1223790hx3 = (C1223790hx3) abstractC1223800hx4) != null && Intrinsics.LJFF(c1223790hx3.LLILLL.get("is_related_friend_item"), "1")) {
            return true;
        }
        return false;
    }

    public final void LIZIZ(int i, C1224840hyk c1224840hyk) {
        String str;
        int iCurrentTimeMillis = (int) (System.currentTimeMillis() - this.LIZLLL);
        if (C1225230hzN.LIZIZ(c1224840hyk)) {
            str = "search";
        } else {
            str = "default";
        }
        Map mapLJIIJ = C2097608Jq.LJIIJ(new Pair(Scene.SCENE_SERVICE, str), new Pair("source", "local"), new Pair("duration", String.valueOf(iCurrentTimeMillis)), new Pair("size", String.valueOf(i)));
        C0I0B.LJFF.LIZIZ();
        C20684815ws.LJIILLIIL("show_related_friends", mapLJIIJ);
    }
}
