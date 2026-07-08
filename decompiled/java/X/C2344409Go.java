package X;

import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.09Go, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2344409Go {
    public static final C2344409Go LIZ = new C2344409Go();
    public static final Map<String, Long> LIZIZ = new LinkedHashMap();

    public static void LIZ(ShortVideoContext shortVideoContext, Effect effect) {
        String str;
        long jCurrentTimeMillis;
        if (shortVideoContext == null) {
            return;
        }
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("shoot_way", shortVideoContext.shootWay);
        c2344009Gk.LJIIIIZZ("creation_id", shortVideoContext.getCreationId());
        c2344009Gk.LJIIIIZZ("enter_from", "video_shoot_page");
        c2344009Gk.LJIIIIZZ("from_group_id", C1443560nfW.LJIIIIZZ());
        if (effect != null) {
            str = "prop";
        } else {
            str = "non-prop";
        }
        c2344009Gk.LJIIIIZZ("icon_type", str);
        Long l = (Long) ((LinkedHashMap) LIZIZ).get(shortVideoContext.getCreationId());
        if (l != null) {
            jCurrentTimeMillis = System.currentTimeMillis() - l.longValue();
        } else {
            jCurrentTimeMillis = 0;
        }
        c2344009Gk.LIZLLL(jCurrentTimeMillis, "icon_loading_duration");
        c2344009Gk.LJIIIIZZ("shoot_tab_name", shortVideoContext.LJIJJLI());
        if (effect != null) {
            c2344009Gk.LJII(C1905107dB.LIZ(effect));
            c2344009Gk.LJFF("prop_id", effect.getEffectId());
            c2344009Gk.LJFF("resource_id", effect.getResourceId());
        }
        C20684815ws.LJIILLIIL("prop_entrance_show", c2344009Gk.LIZ);
    }
}
