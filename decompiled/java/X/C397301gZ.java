package X;

import com.bytedance.android.livesdk.sei.BoardItemSeiData;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.List;

/* JADX INFO: renamed from: X.01gZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C397301gZ {
    public String LIZ;
    public String LIZIZ;
    public String LIZJ;
    public String LIZLLL;
    public String LJ;
    public String LJFF;
    public String LJI;
    public String LJII;
    public String LJIIIIZZ;
    public String LJIIIZ;
    public String LJIIJ;
    public String LJIIJJI;
    public int LJIIL;
    public int LJIILIIL;
    public List<BoardItemSeiData> LJIILJJIL;

    public C397301gZ(String str, String str2, String str3, String str4, String str5, String str6, String str7, int i) {
        String str8;
        String str9;
        String str10;
        String str11;
        str = (i & 1) != 0 ? "" : str;
        str2 = (i & 2) != 0 ? "" : str2;
        str3 = (i & 4) != 0 ? "" : str3;
        if ((i & 8) != 0) {
            str8 = "";
        } else {
            str8 = null;
        }
        if ((i & 16) != 0) {
            str9 = "";
        } else {
            str9 = null;
        }
        str4 = (i & 32) != 0 ? "" : str4;
        str5 = (i & 64) != 0 ? "board" : str5;
        str6 = (i & 128) != 0 ? "" : str6;
        str7 = (i & 256) != 0 ? CardStruct.IStatusCode.DEFAULT : str7;
        if ((i & 512) != 0) {
            str10 = "";
        } else {
            str10 = null;
        }
        if ((i & 1024) != 0) {
            str11 = "";
        } else {
            str11 = null;
        }
        String str12 = (i & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) == 0 ? null : "";
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
        this.LIZLLL = str8;
        this.LJ = str9;
        this.LJFF = str4;
        this.LJI = str5;
        this.LJII = str6;
        this.LJIIIIZZ = str7;
        this.LJIIIZ = str10;
        this.LJIIJ = str11;
        this.LJIIJJI = str12;
        this.LJIIL = 0;
        this.LJIILIIL = 0;
        this.LJIILJJIL = null;
    }
}
