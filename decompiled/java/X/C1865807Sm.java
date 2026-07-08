package X;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.07Sm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1865807Sm {
    public C1865907Sn LIZ;

    public final void LIZ(Map<String, String> map) {
        C1866907Sx c1866907Sx = C1866507St.LIZ;
        String str = map.get("music_id");
        String str2 = "";
        if (str == null) {
            str = "";
        }
        String str3 = map.get("music_selected_from");
        if (str3 == null) {
            str3 = "";
        }
        String str4 = map.get("music_log_id");
        if (str4 != null) {
            str2 = str4;
        }
        c1866907Sx.LIZJ = new C1865907Sn(str, str3, str2, 24);
        this.LIZ = C1866507St.LIZ.LIZJ;
    }

    public final void LIZIZ(C1865907Sn c1865907Sn, String str) {
        C1866507St.LIZ.LIZJ = c1865907Sn;
        if (Intrinsics.LJFF(str, "video_shoot_page")) {
            this.LIZ = c1865907Sn;
        }
    }
}
