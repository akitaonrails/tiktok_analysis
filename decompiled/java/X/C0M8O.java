package X;

import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.google.gson.s;
import com.ss.android.ugc.gamora.editor.ailive.util.AILiveInboxBannerFreqCache;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import kotlin.jvm.internal.AFwS194S0000000_8;

/* JADX INFO: renamed from: X.0M8O, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0M8O {
    public static final C0M8O LIZ = new C0M8O();
    public static final Keva LIZIZ = Keva.getRepo("AI_LIVE_PHOTO");
    public static final C01GW LIZJ = C452501pT.LIZIZ(AFwS194S0000000_8.get$arr$(418));
    public static final String LIZLLL;
    public static boolean LJ;
    public static final SimpleDateFormat LJFF;
    public static final C01GW LJI;

    /* JADX WARN: Removed duplicated region for block: B:9:0x0059  */
    static {
        /*
            X.0M8O r0 = new X.0M8O
            r0.<init>()
            X.C0M8O.LIZ = r0
            java.lang.String r0 = "AI_LIVE_PHOTO"
            com.bytedance.keva.Keva r0 = com.bytedance.keva.Keva.getRepo(r0)
            X.C0M8O.LIZIZ = r0
            r0 = 418(0x1a2, float:5.86E-43)
            kotlin.jvm.internal.AFwS194S0000000_8 r0 = kotlin.jvm.internal.AFwS194S0000000_8.get$arr$(r0)
            X.01GW r0 = X.C452501pT.LIZIZ(r0)
            X.C0M8O.LIZJ = r0
            X.0M95 r0 = X.C0M95.LIZ
            r0.getClass()
            X.0C64 r4 = X.C0C64.LJIILLIIL()
            r3 = 31744(0x7c00, float:4.4483E-41)
            java.lang.String r2 = "studio_story_ai_live_photo_album_entrance_guidance"
            r1 = 1
            r0 = 0
            boolean r0 = r4.LJIIIZ(r3, r2, r1, r0)
            if (r0 == 0) goto L59
            X.0M97 r0 = X.C0M97.LIZ
            r0.getClass()
            boolean r0 = X.C0M97.LIZ()
            if (r0 == 0) goto L59
            java.lang.String r0 = "FIRST_GUIDE_CLICKED_2"
        L3d:
            X.C0M8O.LIZLLL = r0
            java.text.SimpleDateFormat r2 = new java.text.SimpleDateFormat
            java.lang.String r1 = "yyyy-MM-dd HH:mm:ss"
            java.util.Locale r0 = java.util.Locale.getDefault()
            r2.<init>(r1, r0)
            X.C0M8O.LJFF = r2
            r0 = 417(0x1a1, float:5.84E-43)
            kotlin.jvm.internal.AFwS194S0000000_8 r0 = kotlin.jvm.internal.AFwS194S0000000_8.get$arr$(r0)
            X.01GW r0 = X.C452501pT.LIZIZ(r0)
            X.C0M8O.LJI = r0
            return
        L59:
            java.lang.String r0 = "FIRST_GUIDE_CLICKED"
            goto L3d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0M8O.<clinit>():void");
    }

    public static Date LIZ() {
        try {
            return LJFF.parse(LIZLLL());
        } catch (ParseException e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    public static AILiveInboxBannerFreqCache LIZIZ() {
        return (AILiveInboxBannerFreqCache) LJI.getValue();
    }

    public static boolean LIZJ() {
        return LIZIZ.getBoolean(LIZLLL, false);
    }

    public static String LIZLLL() {
        return LJFF.format(Long.valueOf(System.currentTimeMillis()));
    }

    public static void LJ() {
        LIZIZ.storeBoolean(LIZLLL, true);
    }

    public static void LJFF() {
        String json;
        LIZIZ().getClass();
        Keva keva = LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("INBOX_BANENR_FREQ_CACHE");
        sbLIZ.append((String) LIZJ.getValue());
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        try {
            json = GsonProtectorUtils.toJson(new Gson(), LIZIZ());
        } catch (s e) {
            TryCatchGuardChecker.doCheck(e);
        }
        if (json == null) {
            json = "";
        }
        keva.storeString(strLIZIZ, json);
    }
}
