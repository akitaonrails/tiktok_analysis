package X;

import com.bytedance.speech.speechengine.SpeechEngineDefines;
import java.util.List;
import java.util.UUID;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0WLA, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0WLA {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final boolean LIZLLL;
    public final String LJ;
    public final JSONObject LJFF;
    public final JSONObject LJI;
    public final Object LJII;
    public final String LJIIIIZZ;
    public final String LJIIIZ;
    public final String LJIIJ;
    public final String LJIIJJI;
    public final String LJIIL;
    public final String LJIILIIL;
    public final String LJIILJJIL;
    public final String LJIILL;
    public final String LJIILLIIL;
    public final List<String> LJIIZILJ;
    public final JSONObject LJIJ;
    public final String LJIJI;

    /* JADX WARN: Multi-variable type inference failed */
    public C0WLA() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, false, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 1048575);
    }

    public static C0WLA LIZ(C0WLA c0wla, JSONObject jSONObject, Object obj, int i) {
        String str;
        String str2;
        String str3;
        boolean z;
        String str4;
        JSONObject jSONObject2;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        String str12;
        String str13;
        List<String> list;
        JSONObject jSONObject3;
        Object obj2 = obj;
        JSONObject jSONObject4 = jSONObject;
        String str14 = null;
        if ((i & 1) != 0) {
            str = c0wla.LIZ;
        } else {
            str = null;
        }
        if ((i & 2) != 0) {
            str2 = c0wla.LIZIZ;
        } else {
            str2 = null;
        }
        if ((i & 4) != 0) {
            str3 = c0wla.LIZJ;
        } else {
            str3 = null;
        }
        if ((i & 8) != 0) {
            z = c0wla.LIZLLL;
        } else {
            z = false;
        }
        if ((i & 16) != 0) {
            str4 = c0wla.LJ;
        } else {
            str4 = null;
        }
        if ((i & 32) != 0) {
            jSONObject2 = c0wla.LJFF;
        } else {
            jSONObject2 = null;
        }
        if ((i & 64) != 0) {
            jSONObject4 = c0wla.LJI;
        }
        if ((i & 128) != 0) {
            obj2 = c0wla.LJII;
        }
        if ((i & 256) != 0) {
            str5 = c0wla.LJIIIIZZ;
        } else {
            str5 = null;
        }
        if ((i & 512) != 0) {
            str6 = c0wla.LJIIIZ;
        } else {
            str6 = null;
        }
        if ((i & 1024) != 0) {
            str7 = c0wla.LJIIJ;
        } else {
            str7 = null;
        }
        if ((i & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            str8 = c0wla.LJIIJJI;
        } else {
            str8 = null;
        }
        if ((i & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0) {
            str9 = c0wla.LJIIL;
        } else {
            str9 = null;
        }
        if ((i & 8192) != 0) {
            str10 = c0wla.LJIILIIL;
        } else {
            str10 = null;
        }
        if ((i & 16384) != 0) {
            str11 = c0wla.LJIILJJIL;
        } else {
            str11 = null;
        }
        if ((32768 & i) != 0) {
            str12 = c0wla.LJIILL;
        } else {
            str12 = null;
        }
        if ((65536 & i) != 0) {
            str13 = c0wla.LJIILLIIL;
        } else {
            str13 = null;
        }
        if ((131072 & i) != 0) {
            list = c0wla.LJIIZILJ;
        } else {
            list = null;
        }
        if ((262144 & i) != 0) {
            jSONObject3 = c0wla.LJIJ;
        } else {
            jSONObject3 = null;
        }
        if ((i & 524288) != 0) {
            str14 = c0wla.LJIJI;
        }
        c0wla.getClass();
        return new C0WLA(str, str2, str3, z, str4, jSONObject2, jSONObject4, obj2, str5, str6, str7, str8, str9, str10, str11, str12, str13, list, jSONObject3, str14);
    }

    public /* synthetic */ C0WLA(String str, String str2, String str3, boolean z, String str4, JSONObject jSONObject, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, List list, String str14, int i) {
        this((i & 1) != 0 ? UUID.randomUUID().toString() : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? true : z, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : jSONObject, null, null, (i & 256) != 0 ? null : str5, (i & 512) != 0 ? null : str6, (i & 1024) != 0 ? null : str7, (i & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0 ? null : str8, (i & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0 ? null : str9, (i & 8192) != 0 ? null : str10, (i & 16384) != 0 ? null : str11, (32768 & i) != 0 ? null : str12, (65536 & i) != 0 ? null : str13, (131072 & i) != 0 ? null : list, null, (i & 524288) == 0 ? str14 : null);
    }

    public C0WLA(String str, String str2, String str3, boolean z, String str4, JSONObject jSONObject, JSONObject jSONObject2, Object obj, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, List<String> list, JSONObject jSONObject3, String str14) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
        this.LIZLLL = z;
        this.LJ = str4;
        this.LJFF = jSONObject;
        this.LJI = jSONObject2;
        this.LJII = obj;
        this.LJIIIIZZ = str5;
        this.LJIIIZ = str6;
        this.LJIIJ = str7;
        this.LJIIJJI = str8;
        this.LJIIL = str9;
        this.LJIILIIL = str10;
        this.LJIILJJIL = str11;
        this.LJIILL = str12;
        this.LJIILLIIL = str13;
        this.LJIIZILJ = list;
        this.LJIJ = jSONObject3;
        this.LJIJI = str14;
    }
}
