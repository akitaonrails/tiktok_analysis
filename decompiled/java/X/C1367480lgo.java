package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.AFwS209S0000000_21;

/* JADX INFO: renamed from: X.0lgo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1367480lgo {
    public static final C01GW LIZ = C452501pT.LIZIZ(AFwS209S0000000_21.get$arr$(5));
    public static final ArrayList<String> LIZIZ;

    static {
        ArrayList<String> arrayListLJ = C1697810uHb.LJ("comment", "aweme", "aweme_photo", "challenge", "mix_videos", "music", "point_of_interest", "playlist", "qna", "sticker", "user", "following_feed_0_following", "friends_feed_empty", "video_collection", "repost_feed_empty", "search", "search_image", "minis");
        arrayListLJ.add("live");
        LIZIZ = arrayListLJ;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0054 A[PHI: r2
      0x0054: PHI (r2v1 java.lang.String) = (r2v0 java.lang.String), (r2v5 java.lang.String) binds: [B:16:0x0021, B:22:0x0030] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean LIZIZ(com.ss.android.ugc.aweme.share.base.model.BaseSharePackage r6) {
        /*
            r3 = 0
            if (r6 == 0) goto L56
            android.os.Bundle r1 = r6.extras
            if (r1 == 0) goto L56
            java.lang.String r0 = "enter_from"
            java.lang.String r4 = r1.getString(r0)
        Ld:
            java.lang.String r2 = ""
            if (r4 != 0) goto L12
            r4 = r2
        L12:
            if (r6 == 0) goto L20
            android.os.Bundle r1 = r6.extras
            if (r1 == 0) goto L20
            java.lang.String r0 = "enter_method"
            java.lang.String r5 = r1.getString(r0)
            if (r5 != 0) goto L21
        L20:
            r5 = r2
        L21:
            if (r6 == 0) goto L54
            android.os.Bundle r1 = r6.extras
            if (r1 == 0) goto L32
            java.lang.String r0 = "panel_source"
            java.lang.String r0 = r1.getString(r0)
            if (r0 == 0) goto L30
            r2 = r0
        L30:
            if (r6 == 0) goto L54
        L32:
            java.lang.String r1 = r6.itemType
        L34:
            java.lang.String r0 = "live"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            r1 = 0
            if (r0 == 0) goto L58
            java.lang.String r0 = "feed_live_long_press"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r4, r0)
            if (r0 != 0) goto L53
            boolean r0 = r6.LJIILJJIL()
            if (r0 == 0) goto L53
            java.lang.String r0 = "long_press"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r2, r0)
            if (r0 == 0) goto L58
        L53:
            return r1
        L54:
            r1 = r3
            goto L34
        L56:
            r4 = r3
            goto Ld
        L58:
            java.lang.String r0 = "shortcut_panel"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r5, r0)
            if (r0 == 0) goto L71
            java.lang.String r0 = "personal_homepage"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r4, r0)
            if (r0 != 0) goto L70
            java.lang.String r0 = "others_homepage"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r4, r0)
            if (r0 == 0) goto L71
        L70:
            return r1
        L71:
            java.lang.String r0 = "share_post_and_group_chat_panel"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r2, r0)
            if (r0 == 0) goto L7a
            return r1
        L7a:
            r2 = 1
            if (r6 == 0) goto L8a
            android.os.Bundle r1 = r6.extras
            if (r1 == 0) goto L8a
            java.lang.String r0 = "use_enhance_share_panel_use_square_icon"
            boolean r0 = r1.getBoolean(r0)
            if (r0 != r2) goto L8a
            return r2
        L8a:
            java.util.ArrayList<java.lang.String> r0 = X.C1367480lgo.LIZIZ
            if (r6 == 0) goto L90
            java.lang.String r3 = r6.itemType
        L90:
            boolean r0 = X.C13LP.LJJJJ(r3, r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1367480lgo.LIZIZ(com.ss.android.ugc.aweme.share.base.model.BaseSharePackage):boolean");
    }

    public static void LIZ(int i, int i2, int i3, long j, String str, String str2, List list) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("duration", Long.valueOf(j));
        linkedHashMap.put("platform", str);
        linkedHashMap.put("item_type", Integer.valueOf(i));
        linkedHashMap.put("reason", Integer.valueOf(i2));
        linkedHashMap.put("result", str2);
        linkedHashMap.put("is_preload", Integer.valueOf(i3));
        if (i3 == 1) {
            linkedHashMap.put("link_forms", list);
        } else if (true ^ list.isEmpty()) {
            linkedHashMap.put("link_form", ListProtector.get(list, 0));
        }
        InterfaceC1367490lgp interfaceC1367490lgp = C1370370llT.LIZIZ;
        if (interfaceC1367490lgp != null) {
            interfaceC1367490lgp.LIZ("share_convert_loading_duration", linkedHashMap);
        }
    }
}
