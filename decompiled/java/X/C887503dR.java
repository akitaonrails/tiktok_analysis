package X;

import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.google.gson.n;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentElement;
import java.util.List;

/* JADX INFO: renamed from: X.03dR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C887503dR {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public final String LJFF;
    public final String LJI;
    public final String LJII;
    public n LJIIIIZZ;
    public final List<PaymentElement> LJIIIZ;
    public final String LJIIJ;
    public final String LJIIJJI;
    public final String LJIIL;
    public final Integer LJIILIIL;
    public final String LJIILJJIL;
    public final String LJIILL;
    public final String LJIILLIIL;

    public C887503dR() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 262143);
    }

    public C887503dR(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, List list, String str9, String str10, String str11, Integer num, String str12, String str13, String str14, int i) {
        String str15 = str5;
        String str16 = str4;
        String str17 = str3;
        String str18 = str2;
        List list2 = list;
        String str19 = str8;
        String str20 = str7;
        String str21 = str6;
        Integer num2 = num;
        String str22 = str11;
        String str23 = str10;
        String str24 = str9;
        String str25 = str14;
        String str26 = str13;
        String str27 = str12;
        String str28 = (i & 1) != 0 ? null : str;
        str18 = (i & 2) != 0 ? null : str18;
        str17 = (i & 4) != 0 ? null : str17;
        str16 = (i & 8) != 0 ? null : str16;
        str15 = (i & 16) != 0 ? null : str15;
        str21 = (i & 32) != 0 ? null : str21;
        str20 = (i & 128) != 0 ? null : str20;
        str19 = (i & 256) != 0 ? null : str19;
        list2 = (i & 1024) != 0 ? null : list2;
        str24 = (i & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0 ? null : str24;
        str23 = (i & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0 ? null : str23;
        str22 = (i & 8192) != 0 ? null : str22;
        num2 = (i & 16384) != 0 ? null : num2;
        str27 = (32768 & i) != 0 ? null : str27;
        str26 = (65536 & i) != 0 ? null : str26;
        str25 = (i & 131072) != 0 ? null : str25;
        this.LIZ = str28;
        this.LIZIZ = str18;
        this.LIZJ = str17;
        this.LIZLLL = str16;
        this.LJ = str15;
        this.LJFF = str21;
        this.LJI = str20;
        this.LJII = str19;
        this.LJIIIIZZ = null;
        this.LJIIIZ = list2;
        this.LJIIJ = str24;
        this.LJIIJJI = str23;
        this.LJIIL = str22;
        this.LJIILIIL = num2;
        this.LJIILJJIL = str27;
        this.LJIILL = str26;
        this.LJIILLIIL = str25;
    }
}
