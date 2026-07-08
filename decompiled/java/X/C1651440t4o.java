package X;

import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0t4o, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1651440t4o {
    public static final C1651440t4o LIZ = new C1651440t4o();
    public static final List<String> LIZIZ = new ArrayList();

    public static void LIZ() {
        ((ArrayList) LIZIZ).clear();
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0057  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZIZ(com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r2, X.C1650980t44 r3) {
        /*
            int r1 = r3.LL
            if (r1 == 0) goto L60
            r0 = 1
            if (r1 == r0) goto L5d
            r0 = 2
            if (r1 == r0) goto L5a
            r0 = 3
            if (r1 == r0) goto L57
            r0 = 4
            if (r1 == r0) goto L54
            r0 = 6
            if (r1 == r0) goto L51
            r0 = 7
            if (r1 == r0) goto L4e
            r0 = 29
            if (r1 == r0) goto L4b
            r0 = 10000(0x2710, float:1.4013E-41)
            if (r1 == r0) goto L48
            switch(r1) {
                case 9: goto L45;
                case 10: goto L57;
                case 11: goto L42;
                case 12: goto L3f;
                case 13: goto L3c;
                case 14: goto L39;
                default: goto L21;
            }
        L21:
            switch(r1) {
                case 17: goto L36;
                case 18: goto L33;
                case 19: goto L30;
                case 20: goto L2d;
                case 21: goto L2a;
                default: goto L24;
            }
        L24:
            java.lang.String r0 = ""
        L26:
            LIZJ(r2, r0)
            return
        L2a:
            java.lang.String r0 = "shake_free"
            goto L26
        L2d:
            java.lang.String r0 = "ai_enhance"
            goto L26
        L30:
            java.lang.String r0 = "flash"
            goto L26
        L33:
            java.lang.String r0 = "add_yours"
            goto L26
        L36:
            java.lang.String r0 = "reply"
            goto L26
        L39:
            java.lang.String r0 = "voice_change"
            goto L26
        L3c:
            java.lang.String r0 = "switch_time"
            goto L26
        L3f:
            java.lang.String r0 = "cut_music"
            goto L26
        L42:
            java.lang.String r0 = "wide"
            goto L26
        L45:
            java.lang.String r0 = "switch"
            goto L26
        L48:
            java.lang.String r0 = "more"
            goto L26
        L4b:
            java.lang.String r0 = "hdr"
            goto L26
        L4e:
            java.lang.String r0 = "timer"
            goto L26
        L51:
            java.lang.String r0 = "beauty"
            goto L26
        L54:
            java.lang.String r0 = "filters"
            goto L26
        L57:
            java.lang.String r0 = "mic"
            goto L26
        L5a:
            java.lang.String r0 = "mbeauty"
            goto L26
        L5d:
            java.lang.String r0 = "speed"
            goto L26
        L60:
            java.lang.String r0 = "flip"
            goto L26
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1651440t4o.LIZIZ(com.ss.android.ugc.aweme.shortvideo.ShortVideoContext, X.0t44):void");
    }

    public static void LIZJ(ShortVideoContext shortVideoContext, String str) {
        ArrayList arrayList = (ArrayList) LIZIZ;
        if (arrayList.contains(str)) {
            return;
        }
        arrayList.add(str);
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("icon_name", str);
        c2344009Gk.LJIIIIZZ("content_type", shortVideoContext.LJ().getContentType());
        c2344009Gk.LJIIIIZZ("content_source", shortVideoContext.LJ().getContentSource());
        c2344009Gk.LJIIIIZZ("shoot_way", shortVideoContext.shootWay);
        c2344009Gk.LJIIIIZZ("enter_from", "video_shoot_page");
        c2344009Gk.LJIIIIZZ("creation_id", shortVideoContext.getCreationId());
        C20684815ws.LJIILLIIL("shoot_page_icon_show", c2344009Gk.LIZ);
        if (Intrinsics.LJFF(str, "voice_change")) {
            C2344009Gk c2344009Gk2 = new C2344009Gk();
            c2344009Gk2.LJIIIIZZ("creation_id", shortVideoContext.getCreationId());
            c2344009Gk2.LJIIIIZZ("shoot_way", shortVideoContext.shootWay);
            c2344009Gk2.LJIIIIZZ("enter_from", "video_shoot_page");
            c2344009Gk2.LJIIIIZZ("content_source", shortVideoContext.LJ().getContentSource());
            c2344009Gk2.LJIIIIZZ("content_type", shortVideoContext.LJ().getContentType());
            C20684815ws.LJIILLIIL("voice_effect_entrance_show", c2344009Gk2.LIZ);
        }
    }
}
