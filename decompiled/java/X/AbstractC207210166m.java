package X;

import com.bytedance.android.livesdk.livesetting.other.LiveFileMonitorSampleSetting;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.166m, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public abstract class AbstractC207210166m {
    public final String LIZ;
    public final EnumC771350UNp LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public volatile boolean LJFF;
    public volatile Boolean LJII;
    public volatile String LJ = "";
    public volatile int LJI = 50;
    public volatile int LJIIIIZZ = -1;

    public final int LIZIZ() {
        if (this.LJIIIIZZ > 0) {
            return this.LJIIIIZZ;
        }
        int sampleRate = LiveFileMonitorSampleSetting.INSTANCE.getSampleRate(this.LJ);
        if (sampleRate > 0) {
            this.LJIIIIZZ = sampleRate;
            return this.LJIIIIZZ;
        }
        this.LJIIIIZZ = this.LJI;
        return this.LJIIIIZZ;
    }

    public AbstractC207210166m(String str, EnumC771350UNp enumC771350UNp, String str2, String str3) {
        this.LIZ = str;
        this.LIZIZ = enumC771350UNp;
        this.LIZJ = str2;
        this.LIZLLL = str3;
    }

    public void LIZ(String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        if (this.LIZLLL.length() > 0) {
            jSONObject.putOpt("mime_type", this.LIZLLL);
        }
        if (this.LIZJ.length() > 0) {
            jSONObject3.putOpt("sub_dir", this.LIZJ);
        }
        if (this.LJ.length() > 0) {
            jSONObject.putOpt("file_scene", this.LJ);
        }
        jSONObject3.putOpt("sample_config", Integer.valueOf(this.LJI));
        jSONObject3.putOpt("real_sample", Integer.valueOf(LIZIZ()));
    }
}
