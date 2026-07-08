package X;

import com.bytedance.android.bcm.api.model.BcmParams;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.aweme.feed.model.CardStruct;

/* JADX INFO: renamed from: X.18Cs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21246818Cs {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public final int LJFF;
    public final String LJI;
    public final String LJII;
    public final String LJIIIIZZ;
    public final String LJIIIZ;
    public final String LJIIJ;
    public final String LJIIJJI;
    public final BcmParams LJIIL;
    public final String LJIILIIL;

    /* JADX WARN: Multi-variable type inference failed */
    public C21246818Cs() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 32767);
    }

    public /* synthetic */ C21246818Cs(String str, String str2, String str3, String str4, String str5, int i, String str6, String str7, String str8, String str9, String str10, BcmParams bcmParams, int i2) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? "" : str3, (i2 & 8) != 0 ? "" : str4, (i2 & 16) == 0 ? str5 : "", false, (i2 & 64) != 0 ? 1 : i, (i2 & 128) != 0 ? null : str6, (i2 & 256) != 0 ? null : str7, (i2 & 512) != 0 ? CardStruct.IStatusCode.DEFAULT : str8, (i2 & 1024) != 0 ? null : str9, (i2 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0 ? null : str10, null, (i2 & 8192) != 0 ? null : bcmParams, null);
    }

    public C21246818Cs(String str, String str2, String str3, String str4, String str5, boolean z, int i, String str6, String str7, String str8, String str9, String str10, String str11, BcmParams bcmParams, String str12) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
        this.LIZLLL = str4;
        this.LJ = str5;
        this.LJFF = i;
        this.LJI = str6;
        this.LJII = str7;
        this.LJIIIIZZ = str8;
        this.LJIIIZ = str9;
        this.LJIIJ = str10;
        this.LJIIJJI = str11;
        this.LJIIL = bcmParams;
        this.LJIILIIL = str12;
    }
}
