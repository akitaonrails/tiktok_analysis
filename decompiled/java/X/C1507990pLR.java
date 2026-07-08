package X;

import com.bytedance.android.btm.impl.page.model.PageInfo;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import java.util.Map;
import java.util.UUID;
import kotlin.jvm.internal.AFwS212S0000000_23;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0pLR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1507990pLR {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public int LIZLLL;
    public final int LJ;
    public final InterfaceC1508110pLd LJFF;
    public final Map<String, Object> LJI;
    public final Integer LJII;
    public final InterfaceC1508140pLg LJIIIIZZ;
    public final String LJIIIZ;
    public final String LJIIJ;
    public final String LJIIJJI;
    public final String LJIIL;
    public final String LJIILIIL;
    public long LJIILJJIL;
    public final String LJIILL;
    public final C01GW LJIILLIIL;

    public C1507990pLR() {
        throw null;
    }

    public final boolean LIZ(String str, String str2) {
        if (Intrinsics.LJFF(str, this.LIZIZ) && Intrinsics.LJFF(str2, this.LIZ)) {
            return true;
        }
        if (Intrinsics.LJFF(str, this.LIZIZ) && Intrinsics.LJFF(str2, "*")) {
            return true;
        }
        if (Intrinsics.LJFF(str, "*") && Intrinsics.LJFF(str2, this.LIZ)) {
            return true;
        }
        return false;
    }

    public C1507990pLR(String str, String str2, String str3, int i, int i2, InterfaceC1508110pLd interfaceC1508110pLd, Map map, Integer num, InterfaceC1508140pLg interfaceC1508140pLg, String str4, String str5, String str6, String str7, int i3) {
        String str8 = str5;
        String str9 = str6;
        String str10 = str7;
        i = (i3 & 8) != 0 ? 0 : i;
        i2 = (i3 & 16) != 0 ? 1 : i2;
        str8 = (i3 & 1024) != 0 ? null : str8;
        str9 = (i3 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0 ? null : str9;
        str10 = (i3 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0 ? null : str10;
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
        this.LIZLLL = i;
        this.LJ = i2;
        this.LJFF = interfaceC1508110pLd;
        this.LJI = map;
        this.LJII = num;
        this.LJIIIIZZ = interfaceC1508140pLg;
        this.LJIIIZ = str4;
        this.LJIIJ = str8;
        this.LJIIJJI = str9;
        this.LJIIL = str10;
        this.LJIILIIL = UUID.randomUUID().toString();
        this.LJIILJJIL = -1L;
        C21248618Dk c21248618Dk = C21248618Dk.LIZ;
        Object objLIZ = C18CJ.LIZ();
        c21248618Dk.getClass();
        PageInfo pageInfoLJIIIIZZ = C21248618Dk.LJIIIIZZ(objLIZ);
        this.LJIILL = C1326620kcu.LIZ(pageInfoLJIIIIZZ != null ? pageInfoLJIIIIZZ.getPageBtm() : null);
        this.LJIILLIIL = C452501pT.LIZIZ(AFwS212S0000000_23.get$arr$(258));
    }
}
