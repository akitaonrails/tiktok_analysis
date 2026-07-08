package X;

import Y.AObjectS248S0100000_31;
import android.app.Activity;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.als.LiveEvent;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.music.model.LyricStruct;
import com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.List;
import java.util.Objects;
import kotlin.jvm.internal.AwS610S0100000_31;
import kotlin.jvm.internal.AwS67S1300000_31;
import mn3.e0;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import pyl.s;

/* JADX INFO: renamed from: X.15Rc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20519815Rc extends AbstractC1622390sJx {
    public final Activity LLILLJJLI;
    public final InterfaceC2254081DKk LLILLL;
    public final InterfaceC1650230t2r LLILZ;
    public final InterfaceC1628590sTx LLILZIL;
    public final InterfaceC1648570t0B LLILZLL;
    public final ShortVideoContext LLIZ;
    public final C1DRG LLIZLLLIL;
    public final LifecycleOwner LLJ;
    public final C328730Cud LLJI;
    public List<String> LLJIJIL;
    public C1557870qdt LLJILJIL;
    public AObjectS248S0100000_31 LLJILJILJ;
    public AObjectS248S0100000_31 LLJILLL;
    public AObjectS248S0100000_31 LLJJ;
    public AObjectS248S0100000_31 LLJJI;
    public AObjectS248S0100000_31 LLJJIII;

    public final void LJJIIZI() {
        InterfaceC2254081DKk interfaceC2254081DKk = this.LLILLL;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("interface", "effect_music_data_update");
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("music_info_key", "ttsound_music_info");
        jSONObject2.put("lyrics_data_key", "ttsound_lyrics_data");
        jSONObject.put("data", jSONObject2);
        interfaceC2254081DKk.sendEffectMsg(41, 41L, 0L, C786410Ut5.J3(jSONObject));
    }

    public final void LJJIJL() {
        Activity activity = this.LLILLJJLI;
        CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
        creativeToastBuilder.messageRes(2131836934);
        creativeToastBuilder.isCenterToast(true);
        creativeToastBuilder.duration(3000L);
        creativeToastBuilder.blockContinuousToast(true);
        C1390380mHk.LIZ(activity, 4023, creativeToastBuilder);
    }

    public final void LJJIJLIJ() {
        InterfaceC1647420syK interfaceC1647420syK;
        C385670FAf<InterfaceC1649530t1j> c385670FAfQR0;
        InterfaceC1649530t1j interfaceC1649530t1jLIZJ;
        LiveEvent<s> liveEventR7;
        InterfaceC1647420syK interfaceC1647420syK2;
        C385670FAf<InterfaceC1638550sk1> c385670FAfMv0;
        InterfaceC1638550sk1 interfaceC1638550sk1LIZJ;
        C385670FAf<String> c385670FAfJP0;
        AObjectS248S0100000_31 aObjectS248S0100000_31 = this.LLJILJILJ;
        if (aObjectS248S0100000_31 != null) {
            this.LLILZIL.Vz1().LIZIZ(aObjectS248S0100000_31);
        }
        this.LLJILJILJ = null;
        AObjectS248S0100000_31 aObjectS248S0100000_312 = this.LLJILLL;
        if (aObjectS248S0100000_312 != null) {
            this.LLILZLL.yM2().LIZIZ(aObjectS248S0100000_312);
        }
        this.LLJILLL = null;
        AObjectS248S0100000_31 aObjectS248S0100000_313 = this.LLJJ;
        if (aObjectS248S0100000_313 != null) {
            this.LLILZLL.Vt0().LIZIZ(aObjectS248S0100000_313);
        }
        this.LLJJ = null;
        AObjectS248S0100000_31 aObjectS248S0100000_314 = this.LLJJI;
        if (aObjectS248S0100000_314 != null && (interfaceC1647420syK2 = (InterfaceC1647420syK) this.LLIZLLLIL.LJIIL(null, InterfaceC1647420syK.class)) != null && (c385670FAfMv0 = interfaceC1647420syK2.Mv0()) != null && (interfaceC1638550sk1LIZJ = c385670FAfMv0.LIZJ()) != null && (c385670FAfJP0 = interfaceC1638550sk1LIZJ.jP0()) != null) {
            c385670FAfJP0.LIZIZ(aObjectS248S0100000_314);
        }
        this.LLJJI = null;
        AObjectS248S0100000_31 aObjectS248S0100000_315 = this.LLJJIII;
        if (aObjectS248S0100000_315 != null && (interfaceC1647420syK = (InterfaceC1647420syK) this.LLIZLLLIL.LJIIL(null, InterfaceC1647420syK.class)) != null && (c385670FAfQR0 = interfaceC1647420syK.qR0()) != null && (interfaceC1649530t1jLIZJ = c385670FAfQR0.LIZJ()) != null && (liveEventR7 = interfaceC1649530t1jLIZJ.R7()) != null) {
            liveEventR7.LIZIZ(aObjectS248S0100000_315);
        }
        this.LLJJIII = null;
    }

    @Override // X.AbstractC1622390sJx
    public final void LJJIFFI() {
        LJJIJLIJ();
        C1652570t6d.LIZ = null;
        this.LLJIJIL = null;
        C328730Cud c328730Cud = this.LLJI;
        AnonymousClass0956 anonymousClass0956 = c328730Cud.LIZIZ;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        c328730Cud.LIZIZ = null;
        this.LLILLL.setRenderCacheString("ttsound_lyrics_data", "");
        this.LLILLL.setRenderCacheString("ttsound_music_info", "");
        LJJIIZI();
        this.LLJILJIL = null;
    }

    @Override // X.AbstractC1622390sJx
    public final boolean LJJI(C1627370sRz c1627370sRz) {
        JSONObject jSONObjectOptJSONObject;
        JSONArray jSONArrayOptJSONArray;
        C1446130njf c1446130njf = C1446130njf.LIZ;
        Effect effect = c1627370sRz.LIZ;
        c1446130njf.getClass();
        JSONObject jSONObjectLJIIIZ = C1446130njf.LJIIIZ(effect);
        if (jSONObjectLJIIIZ == null || (jSONObjectOptJSONObject = jSONObjectLJIIIZ.optJSONObject("tool_music")) == null || (jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray("required_lyric_formats")) == null || jSONArrayOptJSONArray.length() <= 0) {
            return false;
        }
        return true;
    }

    public final int LJJIIJZLJL(AVMusic aVMusic) {
        int trimmedMusicDuration = aVMusic.getTrimmedMusicDuration();
        long j = this.LLIZ.cameraComponentModel.mMaxDuration;
        if (1 <= j && j < trimmedMusicDuration) {
            return (int) j;
        }
        return trimmedMusicDuration;
    }

    public final int LJJIIZ(AVMusic aVMusic) {
        int previewStartTime = (int) (aVMusic.getPreviewStartTime() * LSPassThroughRecordSizeConfig.DEFAULT);
        int iLJII = (int) this.LLIZ.LJII();
        if (aVMusic.isFullSong) {
            if (aVMusic.getMusicStart() > 0) {
                previewStartTime = aVMusic.getMusicStart();
            }
        } else {
            previewStartTime += aVMusic.getMusicStart();
        }
        return previewStartTime + iLJII;
    }

    public final void LJJIJ(s sVar) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("interface", "effect_music_record_status");
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("play_speed", String.valueOf(sVar.value()));
        jSONObject.put("data", jSONObject2);
        this.LLILLL.sendEffectMsg(41, 41L, 0L, C786410Ut5.J3(jSONObject));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.ss.android.ugc.aweme.music.model.LyricStruct LJJIJIIJI(java.util.List<com.ss.android.ugc.aweme.music.model.LyricStruct> r7) {
        /*
            Method dump skipped, instruction units count: 222
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20519815Rc.LJJIJIIJI(java.util.List):com.ss.android.ugc.aweme.music.model.LyricStruct");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x005b  */
    @Override // X.AbstractC1622390sJx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJIII(X.C1623370sLX r7, X.C1627370sRz r8) {
        /*
            Method dump skipped, instruction units count: 267
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20519815Rc.LJJIII(X.0sLX, X.0sRz):void");
    }

    public final void LJJIJIL(AVMusic aVMusic, Boolean bool) {
        Object obj;
        String str;
        String str2;
        int iLJJIIZ = LJJIIZ(aVMusic);
        int iLJJIIJZLJL = LJJIIJZLJL(aVMusic);
        String musicId = aVMusic.getMusicId();
        if (musicId == null) {
            musicId = "";
        }
        C1557870qdt c1557870qdt = new C1557870qdt(musicId, iLJJIIZ, iLJJIIJZLJL, aVMusic.getDuration());
        Integer.toHexString(System.identityHashCode(aVMusic));
        aVMusic.getMusicId();
        aVMusic.getDuration();
        aVMusic.getMusicStart();
        aVMusic.getTrimmedMusicDuration();
        aVMusic.getPreviewStartTime();
        List<LyricStruct> lyrics = aVMusic.getLyrics();
        if (lyrics != null) {
            lyrics.size();
        }
        Object obj2 = "auto";
        if (bool == null) {
            obj = "auto";
        } else {
            obj = bool;
        }
        obj.toString();
        this.LLJILJIL = c1557870qdt;
        LyricStruct lyricStructLJJIJIIJI = LJJIJIIJI(aVMusic.getLyrics());
        if (lyricStructLJJIJIIJI != null) {
            str = lyricStructLJJIJIIJI.lyricUrl;
        } else {
            str = null;
        }
        aVMusic.getMusicId();
        Objects.toString(this.LLJIJIL);
        if (str != null) {
            this.LLJI.LIZJ.LIZJ(str);
        }
        if (bool != null) {
            obj2 = bool;
        }
        obj2.toString();
        if (lyricStructLJJIJIIJI != null && str != null && str.length() != 0) {
            int i = lyricStructLJJIJIIJI.lyricType;
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i != 10) {
                                if (i != 11) {
                                    str2 = "custom";
                                } else {
                                    str2 = "preview_txt";
                                }
                            } else {
                                str2 = "json";
                            }
                        } else {
                            str2 = "txt";
                        }
                    } else {
                        str2 = "krc";
                    }
                } else {
                    str2 = "lrc";
                }
            } else {
                str2 = "trc";
            }
            String strLIZJ = this.LLJI.LIZJ.LIZJ(str);
            if (strLIZJ != null) {
                LJJIJIIJIL(aVMusic, str2, strLIZJ, bool);
                return;
            }
            this.LLILLL.setRenderCacheString("ttsound_lyrics_data", "");
            this.LLILLL.setRenderCacheString("ttsound_music_info", LJJIIJ(aVMusic, str2, bool));
            LJJIIZI();
            this.LLJI.LIZIZ(str, new AwS67S1300000_31(this, aVMusic, str2, bool, 2), new AwS610S0100000_31(this, 270));
            return;
        }
        this.LLILLL.setRenderCacheString("ttsound_lyrics_data", "");
        this.LLILLL.setRenderCacheString("ttsound_music_info", LJJIIJ(aVMusic, null, bool));
        LJJIIZI();
        LJJIJL();
    }

    public final String LJJIIJ(AVMusic aVMusic, String str, Boolean bool) throws JSONException {
        boolean zBooleanValue;
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        } else if (this.LLIZ.LJII() <= 0) {
            zBooleanValue = true;
        } else {
            zBooleanValue = false;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("interface", "ttsound_music_info");
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("version", 1);
        if (str != null) {
            jSONObject2.put("format", str);
        }
        String musicId = aVMusic.getMusicId();
        String str2 = "";
        if (musicId == null) {
            musicId = "";
        }
        jSONObject2.put("music_id", musicId);
        String str3 = aVMusic.musicName;
        if (str3 == null) {
            str3 = "";
        }
        jSONObject2.put("title", str3);
        jSONObject2.put("cover_url", C1838950xxF.LIZ(aVMusic.coverMedium));
        String singer = aVMusic.getSinger();
        if (singer != null) {
            str2 = singer;
        }
        jSONObject2.put("artist", str2);
        jSONObject2.put("duration_ms", aVMusic.getDuration());
        jSONObject2.put("trimmed_duration_ms", LJJIIJZLJL(aVMusic));
        jSONObject2.put("start_ms", LJJIIZ(aVMusic));
        jSONObject2.put("auto_play", zBooleanValue);
        jSONObject.put("data", jSONObject2);
        return C786410Ut5.J3(jSONObject);
    }

    public final void LJJIJIIJIL(AVMusic aVMusic, String str, String str2, Boolean bool) throws JSONException {
        String strLJJIIJ = LJJIIJ(aVMusic, str, bool);
        try {
            C786410Ut5.K3(2, new JSONObject(strLJJIIJ));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        aVMusic.getMusicId();
        str2.length();
        Object obj = bool;
        if (bool == null) {
            obj = "auto";
        }
        obj.toString();
        this.LLILLL.setRenderCacheString("ttsound_music_info", strLJJIIJ);
        InterfaceC2254081DKk interfaceC2254081DKk = this.LLILLL;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("interface", "ttsound_lyrics_data");
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put(str, str2);
        jSONObject.put("data", jSONObject2);
        interfaceC2254081DKk.setRenderCacheString("ttsound_lyrics_data", C786410Ut5.J3(jSONObject));
        LJJIIZI();
    }

    public C20519815Rc(C19GS c19gs, InterfaceC2254081DKk interfaceC2254081DKk, e0 e0Var, InterfaceC1628590sTx interfaceC1628590sTx, InterfaceC1648570t0B interfaceC1648570t0B, ShortVideoContext shortVideoContext, C1DRG c1drg, LifecycleOwner lifecycleOwner) {
        this.LLILLJJLI = c19gs;
        this.LLILLL = interfaceC2254081DKk;
        this.LLILZ = e0Var;
        this.LLILZIL = interfaceC1628590sTx;
        this.LLILZLL = interfaceC1648570t0B;
        this.LLIZ = shortVideoContext;
        this.LLIZLLLIL = c1drg;
        this.LLJ = lifecycleOwner;
        this.LLJI = new C328730Cud(LifecycleOwnerKt.getLifecycleScope(lifecycleOwner));
    }
}
