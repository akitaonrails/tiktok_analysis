package X;

import com.bytedance.android.livesdk.livesetting.game.GameKeytimeRecognitionLiveSetting;
import com.bytedance.android.livesdk.livesetting.game.GameRestRecognitionLiveSetting;
import com.bytedance.android.livesdk.livesetting.game.VirtualSexualRecognitionGamesOptSetting;
import com.bytedance.android.livesdk.model.GameTag;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.scene.Scene;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.151F, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C151F {
    public String LIZ;
    public final long LIZIZ;
    public final HashMap<String, AnonymousClass1517> LIZJ = new HashMap<>();
    public StringBuilder LIZLLL = new StringBuilder("");
    public StringBuilder LJ = new StringBuilder("");
    public StringBuilder LJFF = new StringBuilder("");

    public final void LIZ(C204518150y c204518150y) {
        if (c204518150y != null && c204518150y.LIZLLL == C151B.KEY_TIME) {
            if (GameKeytimeRecognitionLiveSetting.INSTANCE.getValue().modelOpt) {
                float[] fArr = c204518150y.LIZIZ;
                if (fArr.length < 6) {
                    return;
                }
                if (C151K.LJFF(fArr)) {
                    LIZIZ(c204518150y);
                    LJFF(c204518150y);
                    return;
                }
                float f = c204518150y.LIZIZ[C151I.NON_TIME.getIdx()];
                StringBuilder sb = this.LIZLLL;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(f);
                sbLIZ.append(',');
                sb.append(C2188811AlT.LIZIZ(sbLIZ));
                this.LJ.append("noneTime,");
                this.LJFF.append("noneKill,");
                return;
            }
            float[] fArr2 = c204518150y.LIZIZ;
            if (fArr2.length < 8) {
                return;
            }
            if (!C151K.LJI(fArr2) && !C151K.LJIIL(fArr2) && !C151K.LIZIZ(fArr2)) {
                float f2 = c204518150y.LIZIZ[C151J.NON_TIME.getIdx()];
                StringBuilder sb2 = this.LIZLLL;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append(f2);
                sbLIZ2.append(',');
                sb2.append(C2188811AlT.LIZIZ(sbLIZ2));
                this.LJ.append("noneTime,");
                this.LJFF.append("noneKill,");
                return;
            }
            LIZIZ(c204518150y);
            LJFF(c204518150y);
        }
    }

    public final void LIZIZ(C204518150y c204518150y) {
        if (c204518150y != null && c204518150y.LIZLLL == C151B.KEY_TIME) {
            String str = "teammate";
            if (GameKeytimeRecognitionLiveSetting.INSTANCE.getValue().modelOpt) {
                float[] fArr = c204518150y.LIZIZ;
                if (fArr.length < 6 || !C151K.LJII(fArr)) {
                    return;
                }
                float f = c204518150y.LIZIZ[C151I.SELF_KILL.getIdx()] + c204518150y.LIZIZ[C151I.TEAMMATE_KILL.getIdx()] + c204518150y.LIZIZ[C151I.ENEMY_KILL.getIdx()];
                StringBuilder sb = this.LIZLLL;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(f);
                sbLIZ.append(',');
                sb.append(C2188811AlT.LIZIZ(sbLIZ));
                this.LJ.append("killTime,");
                if (C151K.LJIIIZ(c204518150y.LIZIZ)) {
                    str = "self";
                } else if (!C151K.LJIIJJI(c204518150y.LIZIZ)) {
                    str = "enemy";
                }
                StringBuilder sb2 = this.LJFF;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append(str);
                sbLIZ2.append(',');
                sb2.append(C2188811AlT.LIZIZ(sbLIZ2));
                return;
            }
            float[] fArr2 = c204518150y.LIZIZ;
            if (fArr2.length < 8 || !C151K.LJI(fArr2)) {
                return;
            }
            float f2 = c204518150y.LIZIZ[C151J.KILL_TIME.getIdx()];
            StringBuilder sb3 = this.LIZLLL;
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append(f2);
            sbLIZ3.append(',');
            sb3.append(C2188811AlT.LIZIZ(sbLIZ3));
            this.LJ.append("killTime,");
            if (C151K.LJIIIIZZ(c204518150y.LIZIZ)) {
                str = "self";
            } else if (!C151K.LJIIJ(c204518150y.LIZIZ)) {
                str = "enemy";
            }
            StringBuilder sb4 = this.LJFF;
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append(str);
            sbLIZ4.append(',');
            sb4.append(C2188811AlT.LIZIZ(sbLIZ4));
        }
    }

    public final void LJFF(C204518150y c204518150y) {
        if (c204518150y != null && c204518150y.LIZLLL == C151B.KEY_TIME) {
            if (GameKeytimeRecognitionLiveSetting.INSTANCE.getValue().modelOpt) {
                float[] fArr = c204518150y.LIZIZ;
                if (fArr.length < 6) {
                    return;
                }
                if (C151K.LJIILIIL(fArr)) {
                    this.LJ.append("VictoryTime,");
                    this.LJFF.append("VictoryTime,");
                    float f = c204518150y.LIZIZ[C151I.VICTORY_TIME.getIdx()];
                    StringBuilder sb = this.LIZLLL;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(f);
                    sbLIZ.append(',');
                    sb.append(C2188811AlT.LIZIZ(sbLIZ));
                    return;
                }
                if (C151K.LIZJ(c204518150y.LIZIZ)) {
                    this.LJ.append("DefeatTime,");
                    this.LJFF.append("DefeatTime,");
                    float f2 = c204518150y.LIZIZ[C151I.DEFEAT_TIME.getIdx()];
                    StringBuilder sb2 = this.LIZLLL;
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append(f2);
                    sbLIZ2.append(',');
                    sb2.append(C2188811AlT.LIZIZ(sbLIZ2));
                    return;
                }
                return;
            }
            float[] fArr2 = c204518150y.LIZIZ;
            if (fArr2.length < 8) {
                return;
            }
            if (C151K.LJIIL(fArr2)) {
                this.LJ.append("VictoryTime,");
                this.LJFF.append("VictoryTime,");
                float f3 = c204518150y.LIZIZ[C151J.VICTORY_TIME.getIdx()];
                StringBuilder sb3 = this.LIZLLL;
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append(f3);
                sbLIZ3.append(',');
                sb3.append(C2188811AlT.LIZIZ(sbLIZ3));
                return;
            }
            if (C151K.LIZIZ(c204518150y.LIZIZ)) {
                this.LJ.append("DefeatTime,");
                this.LJFF.append("DefeatTime,");
                float f4 = c204518150y.LIZIZ[C151J.DEFEAT_TIME.getIdx()];
                StringBuilder sb4 = this.LIZLLL;
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append(f4);
                sbLIZ4.append(',');
                sb4.append(C2188811AlT.LIZIZ(sbLIZ4));
            }
        }
    }

    public final void LJI(C204518150y c204518150y) {
        String str;
        if (c204518150y != null && c204518150y.LIZLLL == C151B.SEXUAL) {
            float f = c204518150y.LIZ;
            StringBuilder sb = this.LIZLLL;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(f);
            sbLIZ.append(',');
            sb.append(C2188811AlT.LIZIZ(sbLIZ));
            if (f > c204518150y.LJ) {
                str = "sexual,";
            } else {
                str = "noneTime";
            }
            this.LJ.append(str);
            this.LJFF.append("noneKill,");
        }
    }

    public C151F(String str, long j) {
        this.LIZ = str;
        this.LIZIZ = j;
    }

    public final void LIZJ(C204518150y c204518150y, AnonymousClass1517 anonymousClass1517) {
        String str;
        if (c204518150y != null && anonymousClass1517 != null && c204518150y.LIZLLL == C151B.MLBB_HERO) {
            float f = anonymousClass1517.LJIIJ.LIZJ;
            StringBuilder sb = this.LIZLLL;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(f);
            sbLIZ.append(',');
            sb.append(C2188811AlT.LIZIZ(sbLIZ));
            if (f > c204518150y.LJ) {
                str = "AaaNoHero";
            } else {
                str = anonymousClass1517.LJIIJ.LIZIZ;
            }
            this.LJ.append(str);
        }
    }

    public final synchronized void LIZLLL(AnonymousClass1517 anonymousClass1517, C204518150y c204518150y, String str, String str2, boolean z) {
        float f;
        String string;
        Long l;
        if (c204518150y == null) {
            f = 1.0f;
        } else {
            f = c204518150y.LJ;
        }
        int size = this.LIZJ.size();
        if (anonymousClass1517 != null) {
            HashMap<String, AnonymousClass1517> map = this.LIZJ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("duration_index_");
            sbLIZ.append(size);
            map.put(C2188811AlT.LIZIZ(sbLIZ), anonymousClass1517);
        }
        LJI(c204518150y);
        LIZ(c204518150y);
        if (c204518150y != null && c204518150y.LIZLLL == C151B.KEY_GAP) {
            float f2 = c204518150y.LIZ;
            StringBuilder sb = this.LIZLLL;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(f2);
            sbLIZ2.append(',');
            sb.append(C2188811AlT.LIZIZ(sbLIZ2));
        }
        LIZJ(c204518150y, anonymousClass1517);
        Map<String, Object> map2 = C1338270kvh.LIZ;
        if ((!this.LIZJ.isEmpty()) && (this.LIZJ.size() >= 10 || z)) {
            if (this.LIZLLL.length() > 0) {
                StringBuilder sb2 = this.LIZLLL;
                sb2.deleteCharAt(sb2.length() - 1);
            }
            if (this.LJ.length() > 0 && !z) {
                StringBuilder sb3 = this.LJ;
                sb3.deleteCharAt(sb3.length() - 1);
            }
            if (this.LJFF.length() > 0 && !z) {
                StringBuilder sb4 = this.LJFF;
                sb4.deleteCharAt(sb4.length() - 1);
            }
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_client_intelligent_online_performance");
            c474500IjALIZ.LJJII(str, Scene.SCENE_SERVICE);
            c474500IjALIZ.LJJII(this.LIZ, "model_name");
            c474500IjALIZ.LJJIFFI(Float.valueOf(f), "model_threshold");
            c474500IjALIZ.LJJII(Long.valueOf(this.LIZIZ), "room_id");
            c474500IjALIZ.LJJII(Long.valueOf(UserService.getInstance().user().getCurrentUserId()), "anchor_id");
            c474500IjALIZ.LJJII(this.LIZLLL.toString(), "model_score");
            c474500IjALIZ.LJJII(this.LJ.toString(), "scene_result");
            c474500IjALIZ.LJJII(this.LJFF.toString(), "scene_result_sub");
            if (!GameRestRecognitionLiveSetting.INSTANCE.getValue().enableFunction && !VirtualSexualRecognitionGamesOptSetting.INSTANCE.getValue() && !GameKeytimeRecognitionLiveSetting.INSTANCE.getValue().modelFusionTagOpt) {
                GameTag gameTag = EnumC754690Tj1.SCREEN_RECORD.getGameTag();
                if (gameTag == null || (l = gameTag.id) == null || (string = l.toString()) == null) {
                    string = "";
                }
                c474500IjALIZ.LJJII(string, "game_name");
            } else {
                c474500IjALIZ.LJJII(str2, "game_name");
            }
            for (Map.Entry<String, AnonymousClass1517> entry : this.LIZJ.entrySet()) {
                JSONObject jSONObjectPut = new JSONObject().put("part1_duration", entry.getValue().LIZLLL).put("part2_duration", entry.getValue().LJ).put("part3_duration", entry.getValue().LJFF);
                AnonymousClass1517 value = entry.getValue();
                c474500IjALIZ.LJJII(C786410Ut5.J3(jSONObjectPut.put("full_duration", value.LIZLLL + value.LJ + value.LJFF).put("kill_time", Float.valueOf(entry.getValue().LJI.LIZIZ)).put("victory_time", Float.valueOf(entry.getValue().LJI.LIZJ)).put("defeat_time", Float.valueOf(entry.getValue().LJI.LIZLLL)).put("none_time", Float.valueOf(entry.getValue().LJI.LIZ)).put("teammate_kill", Float.valueOf(entry.getValue().LJI.LJI)).put("enemy_kill", Float.valueOf(entry.getValue().LJI.LJII)).put("none_kill", Float.valueOf(entry.getValue().LJI.LJ)).put("self_kill", Float.valueOf(entry.getValue().LJI.LJFF)).put(Scene.SCENE_SERVICE, entry.getValue().LJII).put("new_model", entry.getValue().LJIIIIZZ).put("old_model", entry.getValue().LJIIIZ).put("hero_id", entry.getValue().LJIIJ.LIZ).put("hero_name", entry.getValue().LJIIJ.LIZIZ).put("hero_score", Float.valueOf(entry.getValue().LJIIJ.LIZJ))), entry.getKey());
            }
            c474500IjALIZ.LIZ();
            Map<String, Object> map3 = C1338270kvh.LIZ;
            this.LIZJ.clear();
            this.LIZLLL = new StringBuilder();
            this.LJ = new StringBuilder();
            this.LJFF = new StringBuilder();
        }
    }
}
