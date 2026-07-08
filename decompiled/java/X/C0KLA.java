package X;

import android.content.Context;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0KLA, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0KLA implements InterfaceC511950K5x {
    public static final /* synthetic */ int LJIJI = 0;
    public final String LIZ;
    public final boolean LIZIZ;
    public final int LIZJ;
    public final String LIZLLL;
    public final long LJ;
    public final long LJFF;
    public boolean LJI;
    public EnumC513480KBu LJII;
    public final String LJIIIIZZ;
    public Context LJIIIZ;
    public C0KLD LJIIJ;
    public String LJIIJJI;
    public final Map<String, String> LJIIL;
    public boolean LJIILIIL;
    public boolean LJIILJJIL;
    public final boolean LJIILL;
    public final boolean LJIILLIIL;
    public final String LJIIZILJ;
    public final String LJIJ;

    public C0KLA() {
        throw null;
    }

    public C0KLA(String str, boolean z, int i, String str2, long j, long j2, boolean z2, EnumC513480KBu enumC513480KBu, String str3, Context context, C0KLD c0kld, Map map, boolean z3, boolean z4, String str4, String str5, int i2) {
        boolean z5;
        String str6 = str4;
        boolean z6 = z4;
        boolean z7 = z3;
        Context context2 = context;
        String str7 = str3;
        EnumC513480KBu enumC513480KBu2 = enumC513480KBu;
        Map linkedHashMap = map;
        boolean z8 = z2;
        long j3 = (i2 & 16) != 0 ? 0L : j;
        long j4 = (i2 & 32) == 0 ? j2 : 0L;
        z8 = (i2 & 64) != 0 ? false : z8;
        enumC513480KBu2 = (i2 & 128) != 0 ? EnumC513480KBu.UNKNOWN : enumC513480KBu2;
        str7 = (i2 & 256) != 0 ? "" : str7;
        context2 = (i2 & 512) != 0 ? null : context2;
        String str8 = (i2 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0 ? "" : null;
        linkedHashMap = (i2 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0 ? new LinkedHashMap() : linkedHashMap;
        if ((i2 & 16384) != 0) {
            z5 = true;
        } else {
            z5 = false;
        }
        z7 = (32768 & i2) != 0 ? false : z7;
        z6 = (65536 & i2) != 0 ? false : z6;
        str6 = (131072 & i2) != 0 ? "" : str6;
        String str9 = (i2 & 262144) == 0 ? str5 : "";
        this.LIZ = str;
        this.LIZIZ = z;
        this.LIZJ = i;
        this.LIZLLL = str2;
        this.LJ = j3;
        this.LJFF = j4;
        this.LJI = z8;
        this.LJII = enumC513480KBu2;
        this.LJIIIIZZ = str7;
        this.LJIIIZ = context2;
        this.LJIIJ = c0kld;
        this.LJIIJJI = str8;
        this.LJIIL = linkedHashMap;
        this.LJIILIIL = false;
        this.LJIILJJIL = z5;
        this.LJIILL = z7;
        this.LJIILLIIL = z6;
        this.LJIIZILJ = str6;
        this.LJIJ = str9;
    }
}
