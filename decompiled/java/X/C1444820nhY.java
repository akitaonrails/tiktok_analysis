package X;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import com.ss.android.ugc.aweme.creative.model.music.StickPointMusicAlg;
import com.ss.android.ugc.aweme.music.model.MusicBeat;
import com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder;
import com.ss.android.ugc.tiktok.tools.performance.api.settings.LazyLoadStickPointResources;
import java.util.ArrayList;
import java.util.Arrays;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0nhY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1444820nhY {
    public static boolean LIZ;
    public static final boolean LIZIZ;

    static {
        LIZIZ = C0C64.LJIILLIIL().LJIIIZ(31744, "enable_music_stick_point", true, false) && !C0CHQ.LIZ().getAccountService().LIZ();
    }

    public static boolean LIZIZ() {
        return (((Boolean) C273350AnV.LIZ.getValue()).booleanValue() || LazyLoadStickPointResources.LIZ()) ? LIZIZ : LIZ && LIZIZ;
    }

    public static int LJI() {
        return LIZIZ ? 35 : 12;
    }

    public static String LIZJ(Context context) {
        String string;
        Resources resources;
        if (context != null && (resources = context.getResources()) != null) {
            string = resources.getString(2131848919);
        } else {
            string = null;
        }
        return C786410Ut5.j4(string, Arrays.copyOf(new Object[]{Integer.valueOf(LJI())}, 1));
    }

    public static String LIZLLL(AVMusic aVMusic) {
        if (aVMusic == null) {
            return "music == null";
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("music_id", aVMusic.getMusicId());
            if (aVMusic.getStickPointMusicAlg() != null) {
                jSONObject.put("AO_url", aVMusic.getStickPointMusicAlg().getVeBeatsUrl());
                jSONObject.put("C_url", aVMusic.getStickPointMusicAlg().getDownBeatsUrl());
                jSONObject.put("A1_url", aVMusic.getStickPointMusicAlg().getNoStrengthBeatsUrl());
                jSONObject.put("man_mode_url", aVMusic.getStickPointMusicAlg().getManModeBeatsUrl());
            } else {
                jSONObject.put("no_url", aVMusic.getId());
            }
            return C786410Ut5.J3(jSONObject);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return "exception";
        }
    }

    public static String LJ(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        String downloadDir = C0CHQ.LIZ().LJJJJL().getDownloadDir();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(downloadDir);
        sbLIZ.append(C08HM.LIZJ(UriProtector.parse(str).getPath()));
        sbLIZ.append(".json");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static String LJFF(AVMusic aVMusic) {
        if (aVMusic != null && !TextUtils.isEmpty(aVMusic.getPath())) {
            if (aVMusic.isLocalMusic()) {
                return aVMusic.path;
            }
            return C0CHQ.LIZ().LJJJJL().LJIIIZ(aVMusic);
        }
        return null;
    }

    public static void LJII(AVMusic aVMusic) {
        int iIntValue;
        int iIntValue2;
        if (aVMusic == null) {
            return;
        }
        StickPointMusicAlg stickPointMusicAlg = new StickPointMusicAlg();
        stickPointMusicAlg.setMusicId(aVMusic.getMusicId());
        aVMusic.setStickPointMusicAlg(stickPointMusicAlg);
        stickPointMusicAlg.setDefaultLocalUrl(aVMusic.getPath());
        stickPointMusicAlg.setDefaultLocalPath(LJ(stickPointMusicAlg.getDefaultLocalUrl()));
        String str = aVMusic.extra;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("beats");
            if (jSONObjectOptJSONObject != null) {
                stickPointMusicAlg.setVeBeatsUrl(jSONObjectOptJSONObject.optString("audio_effect_onset"));
                stickPointMusicAlg.setDownBeatsUrl(jSONObjectOptJSONObject.optString("merged_beats"));
                stickPointMusicAlg.setNoStrengthBeatsUrl(jSONObjectOptJSONObject.optString("beats_tracker"));
                stickPointMusicAlg.setMusicsyncUrl(jSONObject.optString("music_sync_url"));
                stickPointMusicAlg.setChorusUrl(jSONObject.optString("chorus_url"));
                stickPointMusicAlg.setMusicSyncPath(LJ(stickPointMusicAlg.getMusicsyncUrl()));
                stickPointMusicAlg.setChorusPath(LJ(stickPointMusicAlg.getChorusUrl()));
                stickPointMusicAlg.setDownBeatsPath(LJ(stickPointMusicAlg.getDownBeatsUrl()));
                stickPointMusicAlg.setVeBeatsPath(LJ(stickPointMusicAlg.getVeBeatsUrl()));
                stickPointMusicAlg.setNoStrengthBeatsPath(LJ(stickPointMusicAlg.getNoStrengthBeatsUrl()));
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        MusicBeat musicBeat = aVMusic.getMusicBeat();
        if (musicBeat != null) {
            Integer minVideoNum = musicBeat.getMinVideoNum();
            int iIntValue3 = 0;
            if (minVideoNum != null) {
                iIntValue = minVideoNum.intValue();
            } else {
                iIntValue = 0;
            }
            stickPointMusicAlg.setMinSeg(iIntValue);
            Integer maxVideoNum = musicBeat.getMaxVideoNum();
            if (maxVideoNum != null) {
                iIntValue3 = maxVideoNum.intValue();
            }
            stickPointMusicAlg.setMaxSeg(iIntValue3);
            Integer type = musicBeat.getType();
            if (type != null) {
                iIntValue2 = type.intValue();
            } else {
                StickPointMusicAlg.Companion.getClass();
                iIntValue2 = StickPointMusicAlg.BEATES_FILE_DEFAULT;
            }
            stickPointMusicAlg.setAlgType(iIntValue2);
            stickPointMusicAlg.setManModeBeatsUrl(musicBeat.getManMadeBeats());
            stickPointMusicAlg.setManModeBeatsPath(LJ(stickPointMusicAlg.getManModeBeatsUrl()));
        }
    }

    public static Bundle LIZ(Activity activity, ArrayList arrayList, long j, CreativeInfo creativeInfo) {
        int i;
        if (C580130Mp9.LIZ(arrayList)) {
            return null;
        }
        int iLJI = LJI() - arrayList.size();
        if (iLJI <= 0) {
            if (activity != null) {
                CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
                creativeToastBuilder.message(LIZJ(activity));
                creativeToastBuilder.isTuxToastLegacy(true);
                C1390380mHk.LIZ(activity, 3079, creativeToastBuilder);
            }
            return null;
        }
        long j2 = ((long) 3600000) - j;
        Bundle bundle = new Bundle();
        C533730KwV.LIZ.getClass();
        if (LIZIZ) {
            bundle.putInt("key_photo_select_min_count", 0);
            bundle.putInt("key_photo_select_max_count", iLJI);
            i = 6;
        } else {
            i = 4;
        }
        bundle.putInt("key_support_flag", i);
        bundle.putBoolean("Key_enable_multi_video", true);
        bundle.putInt("key_video_select_min_count", 0);
        bundle.putInt("key_video_select_max_count", iLJI);
        bundle.putLong("Key_max_duration", j2);
        bundle.putLong("Key_min_duration", 1000L);
        C786410Ut5.LJJJIL(bundle, "key_selected_video_path", arrayList);
        C537520L6g.LJFF(bundle, creativeInfo);
        return bundle;
    }
}
