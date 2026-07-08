package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.JSONArrayProtectorUtils;
import com.bytedance.mt.protector.impl.string2number.CastFloatProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.playerkit.model.meta.AudioTransparentProcessData;
import java.io.Serializable;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0oRL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1473210oRL implements Serializable {
    public static final C1473210oRL LLJILJIL = new C1473210oRL();
    public static final C603840NmI LLJILJILJ = new C603840NmI(((Number) C1474810oTv.X5.getValue()).intValue());
    public final String LL;
    public transient C1472100oPY LLILLJJLI;
    public transient C1470140oMO LLILLL;
    public volatile transient C1473250oRP LLILZ;
    public volatile transient C1474740oTo LLILZIL;
    public transient AudioTransparentProcessData LLILZLL;
    public transient C1473220oRM LLIZ;
    public transient String LLIZLLLIL;
    public transient String LLJ;
    public transient JSONObject LLJI;
    public transient String LLJIJIL;

    public AudioTransparentProcessData getAudioTransparentData() {
        if (this.LLILZLL == null) {
            this.LLILZLL = LIZLLL(getJson());
        }
        return this.LLILZLL;
    }

    public C1470140oMO getBarrageMaskInfo() {
        if (this.LLILLL == null) {
            this.LLILLL = LIZ(getJson());
        }
        return this.LLILLL;
    }

    public String getFlightId() {
        JSONObject json;
        if (this.LLIZLLLIL == null && (json = getJson()) != null) {
            try {
                this.LLIZLLLIL = json.optString("flight_id", "");
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
        return this.LLIZLLLIL;
    }

    public JSONObject getJson() {
        JSONObject jSONObject;
        if (this.LLJI == null) {
            try {
                jSONObject = new JSONObject(this.LL);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                jSONObject = new JSONObject();
            }
            this.LLJI = jSONObject;
        }
        return this.LLJI;
    }

    public C1473250oRP getPlayTimeInfo() {
        if (this.LLILZ == null) {
            this.LLILZ = LIZIZ(getJson());
        }
        return this.LLILZ;
    }

    public String getSpExtraInfo() {
        JSONObject json;
        if (this.LLJIJIL == null && (json = getJson()) != null) {
            try {
                this.LLJIJIL = json.optString("sp_extra_info", "");
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
        return this.LLJIJIL;
    }

    public String getStrategyTokens() {
        if (this.LLJ == null) {
            this.LLJ = getJson().optString("strategy_tokens", "");
        }
        return this.LLJ;
    }

    public C1472100oPY getVidToken() {
        if (!((Boolean) C1474810oTv.LJJZ.getValue()).booleanValue()) {
            return null;
        }
        if (this.LLILLJJLI == null) {
            this.LLILLJJLI = LIZJ(getJson());
        }
        return this.LLILLJJLI;
    }

    public C1473220oRM getVolumeInfo() {
        if (this.LLIZ == null) {
            this.LLIZ = LJ(getJson());
        }
        return this.LLIZ;
    }

    public C1474740oTo getWatchTimeInfo() {
        if (this.LLILZIL == null) {
            this.LLILZIL = LJFF(getJson());
        }
        return this.LLILZIL;
    }

    public C1473210oRL() {
    }

    public String getMetaStr() {
        return this.LL;
    }

    public C1473210oRL(String str) {
        JSONObject jSONObject;
        this.LL = str;
        try {
            jSONObject = new JSONObject(str);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            jSONObject = new JSONObject();
        }
        if (C1474810oTv.LLIILZL()) {
            if (jSONObject.length() == 0) {
                this.LLILLJJLI = null;
                this.LLILLL = null;
                this.LLILZ = null;
                this.LLILZIL = null;
                this.LLIZ = null;
                this.LLJ = null;
                this.LLILZLL = null;
                return;
            }
        } else if (TextUtils.isEmpty(C786410Ut5.J3(jSONObject))) {
            this.LLILLJJLI = null;
            this.LLILLL = null;
            this.LLILZ = null;
            this.LLILZIL = null;
            this.LLIZ = null;
            this.LLJ = null;
            this.LLILZLL = null;
            return;
        }
        if (!((Boolean) C1474810oTv.LJJLIIIJLJLI.getValue()).booleanValue()) {
            this.LLJI = jSONObject;
            this.LLILLJJLI = LIZJ(jSONObject);
            this.LLILLL = LIZ(jSONObject);
            this.LLILZ = LIZIZ(jSONObject);
            this.LLILZIL = LJFF(jSONObject);
            this.LLIZ = LJ(jSONObject);
            this.LLJ = jSONObject.optString("strategy_tokens", "");
        }
        if (!C1474810oTv.LLIILZL()) {
            this.LLILZLL = LIZLLL(jSONObject);
        }
    }

    public static C1470140oMO LIZ(JSONObject jSONObject) {
        C1470140oMO c1470140oMO;
        String strOptString = jSONObject.optString("barrage_mask_info");
        if (TextUtils.isEmpty(strOptString)) {
            return null;
        }
        try {
            JSONObject jSONObject2 = new JSONObject(strOptString);
            String strOptString2 = jSONObject2.optString("FileId");
            String strOptString3 = jSONObject2.optString("FileHash");
            String strOptString4 = jSONObject2.optString("BarrageMaskUrl");
            int iOptInt = jSONObject2.optInt("FileSize");
            int iOptInt2 = jSONObject2.optInt("Bitrate");
            c1470140oMO = new C1470140oMO(strOptString2, strOptString4, jSONObject2.optInt("HeadLen"));
            c1470140oMO.setBitrate(iOptInt2);
            c1470140oMO.setFileHash(strOptString3);
            c1470140oMO.setFileSize(iOptInt);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        if (!c1470140oMO.isValid()) {
            return null;
        }
        return c1470140oMO;
    }

    public static C1473250oRP LIZIZ(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        String strOptString = jSONObject.optString("play_time_prob_dist");
        if (TextUtils.isEmpty(strOptString)) {
            return null;
        }
        try {
            JSONArray jSONArray = new JSONArray(strOptString);
            if (jSONArray.length() >= 3) {
                return new C1473250oRP(JSONArrayProtectorUtils.getString(jSONArray, 0), JSONArrayProtectorUtils.getString(jSONArray, 1), JSONArrayProtectorUtils.getString(jSONArray, 2));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        return null;
    }

    public static C1472100oPY LIZJ(JSONObject jSONObject) {
        try {
            JSONObject jSONObject2 = new JSONObject(jSONObject.optString("token_auth", "{}"));
            String strOptString = jSONObject2.optString("vid");
            String strOptString2 = jSONObject2.optString("token");
            int iOptInt = jSONObject2.optInt("version", 2);
            ArrayList arrayList = new ArrayList();
            JSONArray jSONArrayOptJSONArray = jSONObject2.optJSONArray("hosts");
            if (jSONArrayOptJSONArray != null) {
                for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                    arrayList.add(jSONArrayOptJSONArray.optString(i));
                }
            }
            C1472100oPY c1472100oPY = new C1472100oPY(strOptString, strOptString2, arrayList, iOptInt);
            if (c1472100oPY.isValid()) {
                return c1472100oPY;
            }
            return null;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return null;
        }
    }

    public static AudioTransparentProcessData LIZLLL(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        String strOptString = jSONObject.optString("audio_transparent_key");
        if (TextUtils.isEmpty(strOptString)) {
            return null;
        }
        try {
            return (AudioTransparentProcessData) new Gson().LJII(strOptString, AudioTransparentProcessData.class);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return null;
        }
    }

    public static C1473220oRM LJ(JSONObject jSONObject) {
        if (jSONObject != null && !TextUtils.isEmpty(C786410Ut5.J3(jSONObject))) {
            try {
                float f = CastFloatProtector.parseFloat(jSONObject.optString("LoudnessRange", CardStruct.IStatusCode.DEFAULT));
                float f2 = CastFloatProtector.parseFloat(jSONObject.optString("LoudnessRangeStart", CardStruct.IStatusCode.DEFAULT));
                float f3 = CastFloatProtector.parseFloat(jSONObject.optString("LoudnessRangeEnd", CardStruct.IStatusCode.DEFAULT));
                float f4 = CastFloatProtector.parseFloat(jSONObject.optString("MaximumMomentaryLoudness", CardStruct.IStatusCode.DEFAULT));
                float f5 = CastFloatProtector.parseFloat(jSONObject.optString("MaximumShortTermLoudness", CardStruct.IStatusCode.DEFAULT));
                String strOptString = jSONObject.optString("VolumeInfoJson", "");
                String strOptString2 = jSONObject.optString("android_vol_change", "");
                boolean zOptBoolean = jSONObject.optBoolean("disable_in_photo_mode", false);
                int i = CastIntegerProtector.parseInt(jSONObject.optString("Version", CardStruct.IStatusCode.DEFAULT));
                C1473220oRM c1473220oRM = new C1473220oRM();
                c1473220oRM.setLoudnessRange(f);
                c1473220oRM.setLoudnessRangeStart(f2);
                c1473220oRM.setLoudnessRangeEnd(f3);
                c1473220oRM.setMaximumShortTermLoudness(f5);
                c1473220oRM.setMaximumMomentaryLoudness(f4);
                c1473220oRM.setVolumeInfoJson(strOptString);
                c1473220oRM.setVolumeChangeInfoJson(strOptString2);
                c1473220oRM.setDisableInPhotoMode(zOptBoolean);
                c1473220oRM.setVersion(i);
                return c1473220oRM;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                return null;
            }
        }
        return null;
    }

    public static C1474740oTo LJFF(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        String strOptString = jSONObject.optString("estimate_posterior_watch_time");
        if (TextUtils.isEmpty(strOptString)) {
            return null;
        }
        try {
            JSONObject jSONObject2 = new JSONObject(strOptString);
            return new C1474740oTo(jSONObject2.optString("param_a"), jSONObject2.optString("param_b"), jSONObject2.optString("param_c"), jSONObject2.optString("param_d"), jSONObject2.optInt("threshold"));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static C1473210oRL from(String str) {
        if (!((Boolean) C1474810oTv.LJJLIIIJLLLLLLLZ.getValue()).booleanValue()) {
            if (TextUtils.isEmpty(str)) {
                return new C1473210oRL();
            }
            return new C1473210oRL(str);
        }
        if (TextUtils.isEmpty(str)) {
            return LLJILJIL;
        }
        C603840NmI c603840NmI = LLJILJILJ;
        C1473210oRL c1473210oRL = (C1473210oRL) c603840NmI.get(str);
        if (c1473210oRL == null) {
            if (TextUtils.isEmpty(str)) {
                c1473210oRL = new C1473210oRL();
            } else {
                c1473210oRL = new C1473210oRL(str);
            }
            c603840NmI.put(str, c1473210oRL);
        }
        return c1473210oRL;
    }
}
