package X;

import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.jsbopenrecord.RecordPageOptionalConfig;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0njq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1446240njq {
    public static final C1446240njq LIZ = new C1446240njq();
    public static String LIZIZ = "by_default";
    public static final List<String> LIZJ = C1697810uHb.LJIIJJI("camera", "clip");

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:4:0x0007 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String LIZIZ(java.lang.String r1) {
        /*
            int r0 = r1.hashCode()
            switch(r0) {
                case 3556653: goto L8;
                case 106642994: goto L11;
                case 1151385704: goto L1a;
                case 1151385854: goto L35;
                case 1333218597: goto L23;
                case 1333223154: goto L2c;
                default: goto L7;
            }
        L7:
            return r1
        L8:
            java.lang.String r0 = "text"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L3d
            return r1
        L11:
            java.lang.String r0 = "photo"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L3d
            return r1
        L1a:
            java.lang.String r0 = "video_15"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L3d
            return r1
        L23:
            java.lang.String r0 = "video_180"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L3d
            return r1
        L2c:
            java.lang.String r0 = "video_600"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L3d
            return r1
        L35:
            java.lang.String r0 = "video_60"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L7
        L3d:
            java.lang.String r1 = "camera"
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1446240njq.LIZIZ(java.lang.String):java.lang.String");
    }

    public static void LIZ(C0LAB c0lab, ShortVideoContext shortVideoContext) {
        c0lab.LJ("creation_id", shortVideoContext.getCreationId());
        c0lab.LJ("shoot_way", shortVideoContext.shootWay);
        c0lab.LIZ(shortVideoContext.draftId, "draft_id");
        c0lab.LJ("shoot_enter_from", shortVideoContext.enterFrom);
        c0lab.LJ("shoot_enter_method", shortVideoContext.enterMethod);
        c0lab.LJ("enter_method", shortVideoContext.enterMethod);
        c0lab.LJ("enter_dm", shortVideoContext.creativeModel.initialModel.dmCameraModel.enterDM);
    }

    public static void LIZJ(ShortVideoContext shortVideoContext, int i, String str, boolean z) {
        String str2;
        String str3;
        String str4;
        if (Intrinsics.LJFF(str, "video_15")) {
            str = "camera";
        }
        if (LIZJ.contains(str)) {
            return;
        }
        if (z) {
            LIZIZ = "by_default";
        }
        C0LAB c0lab = new C0LAB();
        LIZ(c0lab, shortVideoContext);
        if (z) {
            str2 = "land";
        } else {
            str2 = "outer";
        }
        c0lab.LJ("change_type", str2);
        c0lab.LJ("to_status", str);
        c0lab.LJ("from_status", LIZIZ);
        c0lab.LJ("shoot_page", "video_shoot_page");
        c0lab.LJ("shoot_tab_name", str);
        c0lab.LJ("enter_from", "video_shoot_page");
        if (Intrinsics.LJFF(str, "text")) {
            LIZ.getClass();
            if (i != 1) {
                if (i != 2 && i != 3) {
                    str4 = "";
                } else {
                    str4 = "slide";
                }
            } else {
                str4 = "click";
            }
            c0lab.LJ("text_mode_enter_method", str4);
        }
        if (Intrinsics.LJFF(shortVideoContext.shootWay, "ec_write_review")) {
            RecordPageOptionalConfig recordPageOptionalConfig = shortVideoContext.creativeModel.initialModel.recordPageOptionalConfig;
            if (recordPageOptionalConfig != null) {
                str3 = recordPageOptionalConfig.previousPage;
            } else {
                str3 = null;
            }
            c0lab.LJ("previous_page", str3);
        }
        String str5 = shortVideoContext.creativeModel.initialModel.dmCameraModel.searchSessionId;
        if (str5 != null) {
            c0lab.LJ("search_session_id", str5);
        }
        if (shortVideoContext.creativeModel.initialModel.dmCameraModel.isFromEffectButton) {
            c0lab.LJ("is_chat_page_icon_effect", "1");
        }
        int i2 = shortVideoContext.creativeModel.initialModel.dmCameraModel.chatType;
        if (i2 != -1) {
            c0lab.LJ("chat_type", C912070ZqH.LIZIZ.LJFF().LJIJI(Integer.valueOf(i2)));
        }
        C20684815ws.LJIILLIIL("change_record_mode", c0lab.LIZ);
        LIZIZ = str;
    }
}
