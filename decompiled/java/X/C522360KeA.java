package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0KeA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C522360KeA {
    public static final void LIZ(C522350Ke9 c522350Ke9) {
        String str;
        if (c522350Ke9 == null) {
            return;
        }
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("creation_id", c522350Ke9.LIZ);
        c0lab.LJ("album_from_page", c522350Ke9.LJ);
        c0lab.LJ("album_from_scene", c522350Ke9.LJFF);
        c0lab.LJ("shoot_enter_method", c522350Ke9.LIZLLL);
        c0lab.LJ("shoot_enter_from", c522350Ke9.LIZJ);
        c0lab.LJ(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, c522350Ke9.LJII);
        c0lab.LIZ(c522350Ke9.LIZIZ, "choose_scene");
        c0lab.LIZ(c522350Ke9.LJIIIZ ? 1 : 0, "is_upload_layout");
        c0lab.LIZ(c522350Ke9.LJIIJ, "photo_count");
        c0lab.LIZ(c522350Ke9.LJIIJJI, "video_count");
        C523280Kfe.LIZ.getClass();
        c0lab.LJ("has_upload_permission", C523280Kfe.LIZIZ());
        if (C523280Kfe.LIZJ(true)) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        c0lab.LJ("is_private_access", str);
        if (Intrinsics.LJFF(c522350Ke9.LJII, C0L92.SUCCESS.getValue()) || Intrinsics.LJFF(c522350Ke9.LJII, C0L92.FAILED.getValue())) {
            c0lab.LIZIZ(System.currentTimeMillis() - c522350Ke9.LJI, "duration");
        }
        if (Intrinsics.LJFF(c522350Ke9.LJII, C0L92.FAILED.getValue())) {
            c0lab.LJ("error_msg", c522350Ke9.LJIIIIZZ);
        }
        List<InterfaceC2342209Fs> list = C2341909Fp.LIZ;
        C2341909Fp.LIZ("tool_performance_album_export_result", c0lab.LIZ);
    }
}
