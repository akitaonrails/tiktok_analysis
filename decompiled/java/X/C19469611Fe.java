package X;

import com.ss.android.ugc.aweme.music.model.ThirdMusicCoverItem;

/* JADX INFO: renamed from: X.11Fe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19469611Fe {
    public static ThirdMusicCoverItem LIZ;

    public static void LIZIZ(String str) {
        C2241008qG c2241008qG = new C2241008qG();
        c2241008qG.LIZ.put("message", str);
        C793770VBv.LJ("third_music_json_parse_error", c2241008qG.LJ());
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x003a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZ(android.widget.TextView r4, com.ss.android.ugc.aweme.music.model.Music r5) {
        /*
            r2 = 0
            if (r5 == 0) goto L3c
            java.util.List r1 = r5.getExternalMusicInfos()
        L7:
            boolean r0 = X.C086I.LIZIZ(r1)
            r3 = 0
            if (r0 != 0) goto L3a
            if (r1 == 0) goto L1c
            java.lang.Object r0 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r1, r3)
            com.ss.android.ugc.aweme.music.model.ExternalMusicInfo r0 = (com.ss.android.ugc.aweme.music.model.ExternalMusicInfo) r0
            if (r0 == 0) goto L1c
            java.lang.String r2 = r0.getPartnerName()
        L1c:
            java.lang.String r0 = "awa"
            boolean r0 = android.text.TextUtils.equals(r2, r0)
            if (r0 == 0) goto L3a
            r2 = 2130973710(0x7f04140e, float:1.7556223E38)
        L27:
            if (r4 == 0) goto L37
            if (r2 <= 0) goto L38
            r0 = 4617315517961601024(0x4014000000000000, double:5.0)
            int r0 = X.C341940Daq.LIZ(r0)
        L31:
            r4.setCompoundDrawablePadding(r0)
            r4.setCompoundDrawablesWithIntrinsicBounds(r3, r3, r2, r3)
        L37:
            return
        L38:
            r0 = 0
            goto L31
        L3a:
            r2 = 0
            goto L27
        L3c:
            r1 = r2
            goto L7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19469611Fe.LIZ(android.widget.TextView, com.ss.android.ugc.aweme.music.model.Music):void");
    }
}
