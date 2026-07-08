package X;

import android.graphics.Bitmap;
import android.text.TextUtils;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.google.gson.internal.s;
import com.google.gson.reflect.TypeToken;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.commercialize.challenge.model.Hashtag2Emoji;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.model.TextExtraStruct;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.10yd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19421710yd {
    public static boolean LIZJ;
    public static boolean LIZLLL;
    public static final C19421710yd LIZ = new C19421710yd();
    public static ConcurrentHashMap<String, Hashtag2Emoji> LIZIZ = new ConcurrentHashMap<>();
    public static final LinkedHashMap<String, Bitmap> LJ = new LinkedHashMap<>(30, 0.75f, true);

    public static final void LIZ() {
        ConcurrentHashMap<String, Hashtag2Emoji> concurrentHashMap;
        if (LIZJ) {
            return;
        }
        LIZJ = true;
        try {
            if (C19421810ye.LIZ.isEmpty()) {
                SettingsManager.LIZLLL().getClass();
                ConcurrentHashMap concurrentHashMap2 = (ConcurrentHashMap) SettingsManager.LJII("hashtag2emoji_map", ConcurrentHashMap.class);
                if (concurrentHashMap2 != null) {
                    for (String str : concurrentHashMap2.keySet()) {
                        s sVar = (s) concurrentHashMap2.get(str);
                        if (sVar != null) {
                            Gson gson = C19421810ye.LIZIZ;
                            C19421810ye.LIZ.put(str, (Hashtag2Emoji) gson.LJIIIIZZ(gson.LJIILL(sVar), new TypeToken<Hashtag2Emoji>() { // from class: X.10yf
                            }.getType()));
                        }
                    }
                }
            }
            concurrentHashMap = C19421810ye.LIZ;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1AF0.LJ(th);
            concurrentHashMap = C19421810ye.LIZ;
        }
        LIZIZ = concurrentHashMap;
    }

    public static boolean LIZJ(TextExtraStruct textExtraStruct, String str) {
        if (str != null && textExtraStruct.getStart() >= 0 && textExtraStruct.getEnd() >= 0 && textExtraStruct.getEnd() <= str.length() && textExtraStruct.getStart() < str.length() && textExtraStruct.getStart() < textExtraStruct.getEnd()) {
            return true;
        }
        return false;
    }

    public static void LIZLLL(String str, String str2) {
        if (str2 != null && str2.length() != 0) {
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJIIIIZZ("tag_name", str2.toLowerCase(Locale.ROOT));
            if (str == null) {
                str = "";
            }
            c2344009Gk.LJIIIIZZ("enter_from", str);
            C20684815ws.LJIILLIIL("show_commercial_emoji", c2344009Gk.LIZ);
        }
    }

    public static final UrlModel LIZIZ(String str, boolean z, boolean z2) {
        String strLIZIZ;
        String lowerCase;
        long jCurrentTimeMillis;
        long jCurrentTimeMillis2;
        Long l;
        Long l2;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            SettingsManager.LIZLLL().getClass();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1AF0.LJ(th);
        }
        if (!SettingsManager.LIZ("enable_emoji_of_non_commerce_hashtag", false)) {
            if (!z) {
                return null;
            }
        }
        LIZ();
        if (LIZIZ.isEmpty()) {
            return null;
        }
        for (String str2 : LIZIZ.keySet()) {
            if (z2) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append('#');
                sbLIZ.append(str2);
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            } else {
                strLIZIZ = str2;
            }
            if (str != null) {
                lowerCase = str.toLowerCase(Locale.ROOT);
            } else {
                lowerCase = null;
            }
            if (Intrinsics.LJFF(strLIZIZ, lowerCase)) {
                Hashtag2Emoji hashtag2Emoji = LIZIZ.get(str2);
                if (hashtag2Emoji != null && (l2 = hashtag2Emoji.startTime) != null) {
                    jCurrentTimeMillis = l2.longValue();
                } else {
                    jCurrentTimeMillis = (System.currentTimeMillis() / ((long) LSPassThroughRecordSizeConfig.DEFAULT)) + 1;
                }
                long jCurrentTimeMillis3 = System.currentTimeMillis();
                long j = LSPassThroughRecordSizeConfig.DEFAULT;
                if (jCurrentTimeMillis >= jCurrentTimeMillis3 / j) {
                    continue;
                } else {
                    Hashtag2Emoji hashtag2Emoji2 = LIZIZ.get(str2);
                    if (hashtag2Emoji2 != null && (l = hashtag2Emoji2.expireTime) != null) {
                        jCurrentTimeMillis2 = l.longValue();
                    } else {
                        jCurrentTimeMillis2 = (System.currentTimeMillis() / j) - 1;
                    }
                    if (jCurrentTimeMillis2 > System.currentTimeMillis() / j) {
                        Hashtag2Emoji hashtag2Emoji3 = LIZIZ.get(str2);
                        if (hashtag2Emoji3 == null) {
                            return null;
                        }
                        return hashtag2Emoji3.urlModel;
                    }
                }
            }
        }
        return null;
    }
}
