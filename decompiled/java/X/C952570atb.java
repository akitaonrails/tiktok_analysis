package X;

import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkUser;
import com.bytedance.scene.Scene;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0atb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C952570atb {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(String str, String str2, long j, boolean z) {
        String str3;
        C954460awe next;
        int i;
        List<LinkUser> listLLLLIILL = C915980Zwa.LJII().LLLLIILL();
        if (z) {
            C952580atc value = C952580atc.LJI.getValue();
            int size = listLLLLIILL.size();
            value.getClass();
            value.LJIIL(1, "sdk_version", true);
            value.LJIIL(str, "stage", true);
            value.LJIIL("", Scene.SCENE_SERVICE, true);
            Iterator<C954460awe> it2 = C915980Zwa.LJII().LJIJJ().iterator();
            while (true) {
                str3 = null;
                if (it2.hasNext()) {
                    next = it2.next();
                    if (next.LJI()) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            C954460awe c954460awe = next;
            if (c954460awe != null) {
                str3 = c954460awe.LJIIJJI;
            }
            if (value.LJIJJ()) {
                i = 1;
            } else if (C948780anU.LJIIJ(C915980Zwa.LJII().LJIIIZ(), str3)) {
                i = 2;
            } else {
                i = 3;
            }
            value.LJIIL(Integer.valueOf(i), "user_type", true);
            AbstractC962030b8r.LJIIJ(value.LIZLLL, "fail_reason", "", true);
            AbstractC962030b8r.LJIIJ(value.LIZLLL, "linked_count", Integer.valueOf(size), true);
            AbstractC962030b8r.LJIIJ(value.LIZLLL, "layout_key", "", true);
            AbstractC962030b8r.LJIIJ(value.LIZLLL, "layout_id", str2, true);
            AbstractC962030b8r.LJIIJ(value.LIZLLL, "layout_extra", "", true);
            AbstractC962030b8r.LJIIJ(value.LIZLLL, "total_duration", Long.valueOf(j), true);
            value.LJIJJLI("layout_trigger_anchor");
            return;
        }
        C952580atc value2 = C952580atc.LJI.getValue();
        int size2 = listLLLLIILL.size();
        value2.getClass();
        value2.LJIIL(1, "sdk_version", true);
        value2.LJIIL(str, "stage", true);
        value2.LJIIL("", Scene.SCENE_SERVICE, true);
        AbstractC962030b8r.LJIIJ(value2.LIZLLL, "fail_reason", "", true);
        AbstractC962030b8r.LJIIJ(value2.LIZLLL, "linked_count", Integer.valueOf(size2), true);
        AbstractC962030b8r.LJIIJ(value2.LIZLLL, "layout_key", "", true);
        AbstractC962030b8r.LJIIJ(value2.LIZLLL, "layout_id", str2, true);
        AbstractC962030b8r.LJIIJ(value2.LIZLLL, "layout_extra", "", true);
        AbstractC962030b8r.LJIIJ(value2.LIZLLL, "total_duration", Long.valueOf(j), true);
        value2.LJIJJLI("layout_trigger_audience");
    }
}
