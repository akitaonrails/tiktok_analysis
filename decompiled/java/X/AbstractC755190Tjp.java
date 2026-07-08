package X;

import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.zhiliaoapp.musically.R;
import java.util.List;

/* JADX INFO: renamed from: X.0Tjp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public abstract class AbstractC755190Tjp {
    public final int LIZ;
    public String LIZIZ;
    public String LIZJ;
    public boolean LIZLLL;
    public boolean LJ;
    public C755200Tjq LJFF;
    public final List<EnumC755280Tjy> LJI;
    public final EnumC755230Tjt LJII;
    public final int LJIIIIZZ;
    public final boolean LJIIIZ;
    public final String LJIIJ;

    public AbstractC755190Tjp() {
        throw null;
    }

    public AbstractC755190Tjp(int i, String str, String str2, C755200Tjq c755200Tjq, List list, EnumC755230Tjt enumC755230Tjt, int i2, boolean z, String str3, int i3) {
        boolean z2;
        i = (i3 & 1) != 0 ? R.attr.csa : i;
        str = (i3 & 4) != 0 ? "" : str;
        str2 = (i3 & 8) != 0 ? "" : str2;
        if ((i3 & 32) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        list = (i3 & 128) != 0 ? null : list;
        enumC755230Tjt = (i3 & 256) != 0 ? EnumC755230Tjt.SECTION1 : enumC755230Tjt;
        i2 = (i3 & 512) != 0 ? 0 : i2;
        z = (i3 & 1024) != 0 ? false : z;
        str3 = (i3 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0 ? "" : str3;
        this.LIZ = i;
        this.LIZIZ = str;
        this.LIZJ = str2;
        this.LIZLLL = false;
        this.LJ = z2;
        this.LJFF = c755200Tjq;
        this.LJI = list;
        this.LJII = enumC755230Tjt;
        this.LJIIIIZZ = i2;
        this.LJIIIZ = z;
        this.LJIIJ = str3;
    }
}
