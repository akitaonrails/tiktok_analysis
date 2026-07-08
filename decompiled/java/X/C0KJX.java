package X;

import android.content.Context;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0KJX, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0KJX implements InterfaceC509200Jy2 {
    public static final /* synthetic */ int LJIILLIIL = 0;
    public final String LIZ;
    public final boolean LIZIZ;
    public final int LIZJ;
    public final String LIZLLL;
    public final long LJ;
    public final long LJFF;
    public boolean LJI;
    public EnumC513490KBv LJII;
    public final String LJIIIIZZ;
    public Context LJIIIZ;
    public C0KKO LJIIJ;
    public String LJIIJJI;
    public final Map<String, String> LJIIL;
    public boolean LJIILIIL;
    public boolean LJIILJJIL;
    public final boolean LJIILL;

    public C0KJX() {
        throw null;
    }

    public C0KJX(String str, boolean z, int i, String str2, long j, long j2, boolean z2, EnumC513490KBv enumC513490KBv, String str3, Context context, C0KKO c0kko, Map map, boolean z3, int i2) {
        boolean z4;
        boolean z5 = z2;
        boolean z6 = z3;
        Map linkedHashMap = map;
        Context context2 = context;
        String str4 = str3;
        EnumC513490KBv enumC513490KBv2 = enumC513490KBv;
        long j3 = (i2 & 16) != 0 ? 0L : j;
        long j4 = (i2 & 32) == 0 ? j2 : 0L;
        z5 = (i2 & 64) != 0 ? false : z5;
        enumC513490KBv2 = (i2 & 128) != 0 ? EnumC513490KBv.UNKNOWN : enumC513490KBv2;
        str4 = (i2 & 256) != 0 ? "" : str4;
        context2 = (i2 & 512) != 0 ? null : context2;
        String str5 = (i2 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) == 0 ? null : "";
        linkedHashMap = (i2 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0 ? new LinkedHashMap() : linkedHashMap;
        if ((i2 & 16384) != 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        z6 = (i2 & 32768) != 0 ? false : z6;
        this.LIZ = str;
        this.LIZIZ = z;
        this.LIZJ = i;
        this.LIZLLL = str2;
        this.LJ = j3;
        this.LJFF = j4;
        this.LJI = z5;
        this.LJII = enumC513490KBv2;
        this.LJIIIIZZ = str4;
        this.LJIIIZ = context2;
        this.LJIIJ = c0kko;
        this.LJIIJJI = str5;
        this.LJIIL = linkedHashMap;
        this.LJIILIIL = false;
        this.LJIILJJIL = z4;
        this.LJIILL = z6;
    }
}
