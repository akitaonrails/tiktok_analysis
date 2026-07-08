package X;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.s;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.sticker.data.StickerAttrStruct;

/* JADX INFO: renamed from: X.11jA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19580611jA {
    public static final StickerAttrStruct LIZ(InteractStickerStruct interactStickerStruct) {
        if (interactStickerStruct == null) {
            return null;
        }
        try {
            return (StickerAttrStruct) GsonProtectorUtils.fromJson(C7740030o.LIZ().getGson(), interactStickerStruct.getAttr(), StickerAttrStruct.class);
        } catch (s e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x005a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x005b A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.util.List<com.ss.android.ugc.aweme.sticker.data.NormalTrackTimeStamp> LIZIZ(com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct r5) {
        /*
            r4 = 0
            if (r5 == 0) goto L8
            java.util.List r0 = r5.getTrackTimeStampCache()     // Catch: com.google.gson.s -> L3c
            goto L9
        L8:
            r0 = r4
        L9:
            if (r0 != 0) goto L33
            com.ss.android.ugc.aweme.utils.GsonProvider r0 = X.C7740030o.LIZ()     // Catch: com.google.gson.s -> L3c
            com.google.gson.Gson r2 = r0.getGson()     // Catch: com.google.gson.s -> L3c
            if (r5 == 0) goto L29
            java.lang.String r1 = r5.getTrackList()     // Catch: com.google.gson.s -> L3c
        L19:
            X.11jB r0 = new X.11jB     // Catch: com.google.gson.s -> L3c
            r0.<init>()     // Catch: com.google.gson.s -> L3c
            java.lang.reflect.Type r0 = r0.getType()     // Catch: com.google.gson.s -> L3c
            java.lang.Object r3 = com.bytedance.mt.protector.impl.GsonProtectorUtils.fromJson(r2, r1, r0)     // Catch: com.google.gson.s -> L3c
            java.util.List r3 = (java.util.List) r3     // Catch: com.google.gson.s -> L3c
            goto L2b
        L29:
            r1 = r4
            goto L19
        L2b:
            if (r5 == 0) goto L54
            r5.setTrackTimeStampCache(r3)     // Catch: com.google.gson.s -> L31
            goto L54
        L31:
            r2 = move-exception
            goto L3e
        L33:
            if (r5 == 0) goto L3a
            java.util.List r3 = r5.getTrackTimeStampCache()     // Catch: com.google.gson.s -> L3c
            goto L54
        L3a:
            r3 = r4
            goto L54
        L3c:
            r2 = move-exception
            r3 = r4
        L3e:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r2)
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "InteractStickerUtils.kt : e "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            X.C2344809Gs.LJ(r0)
        L54:
            boolean r0 = X.C086I.LIZIZ(r3)
            if (r0 == 0) goto L5b
            return r4
        L5b:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19580611jA.LIZIZ(com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct):java.util.List");
    }

    public static final String LIZLLL(String str) {
        String host;
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        Uri uri = UriProtector.parse(str);
        if (uri != null) {
            host = uri.getHost();
        } else {
            host = null;
        }
        if (TextUtils.equals(host, "webview")) {
            return "web_url";
        }
        return "open_url";
    }

    public static final String LJ(Aweme aweme) {
        if (aweme == null) {
            return "";
        }
        if (aweme.getAwemeType() == 13 && aweme.getForwardItem() != null) {
            return aweme.getForwardItem().getAid();
        }
        return aweme.getAid();
    }

    public static final User LJFF(Aweme aweme) {
        if (aweme == null) {
            return null;
        }
        if (aweme.getAwemeType() == 13 && aweme.getForwardItem() != null) {
            return aweme.getForwardItem().getAuthor();
        }
        return aweme.getAuthor();
    }

    public static final boolean LJI(Context context) {
        return C810670Vr7.LIZJ(context, 0, "test_data").getBoolean("sp_interact_stickers_test", false);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x006d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.util.List<com.ss.android.ugc.aweme.sticker.data.NormalTrackTimeStamp> LIZJ(long r7, com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct r9) {
        /*
            r6 = 0
            com.ss.android.ugc.aweme.utils.GsonProvider r0 = X.C7740030o.LIZ()     // Catch: java.lang.Exception -> L1d
            com.google.gson.Gson r2 = r0.getGson()     // Catch: java.lang.Exception -> L1d
            java.lang.String r1 = r9.getTrackList()     // Catch: java.lang.Exception -> L1d
            X.11j7 r0 = new X.11j7     // Catch: java.lang.Exception -> L1d
            r0.<init>()     // Catch: java.lang.Exception -> L1d
            java.lang.reflect.Type r0 = r0.getType()     // Catch: java.lang.Exception -> L1d
            java.lang.Object r0 = r2.LJIIIIZZ(r1, r0)     // Catch: java.lang.Exception -> L1d
            java.util.List r0 = (java.util.List) r0     // Catch: java.lang.Exception -> L1d
            goto L35
        L1d:
            r2 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r2)
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "InteractStickerUtils.kt : e "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            X.C2344809Gs.LJ(r0)
            r0 = r6
        L35:
            if (r0 == 0) goto L74
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.Iterator r5 = r0.iterator()
        L40:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L74
            java.lang.Object r4 = r5.next()
            r3 = r4
            com.ss.android.ugc.aweme.sticker.data.NormalTrackTimeStamp r3 = (com.ss.android.ugc.aweme.sticker.data.NormalTrackTimeStamp) r3
            r2 = 0
            if (r3 == 0) goto L6e
            boolean r0 = r3.isWholeDuration()
            if (r0 != 0) goto L6d
            boolean r0 = r3.timeIsValid()
            if (r0 == 0) goto L6e
            float r1 = (float) r7
            float r0 = r3.getStartTime()
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 < 0) goto L6e
            float r0 = r3.getEndTime()
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 < 0) goto L6e
        L6d:
            r2 = 1
        L6e:
            if (r2 == 0) goto L40
            r6.add(r4)
            goto L40
        L74:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19580611jA.LIZJ(long, com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct):java.util.List");
    }
}
