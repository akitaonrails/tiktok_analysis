package X;

import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLETemplateModel;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.offline.nletemplate.INLETemplateOfflineService;

/* JADX INFO: renamed from: X.0nHh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1428790nHh {
    public final String LIZ;
    public final int LIZIZ;
    public final NLETemplateModel LIZJ;
    public final NLEModel LIZLLL;
    public final long LJ;
    public final String LJFF;
    public final String LJI;
    public final String LJII;
    public final String LJIIIIZZ;
    public final String LJIIIZ;
    public final int LJIIJ;
    public final AVMusic LJIIJJI;
    public final String LJIIL;
    public final Boolean LJIILIIL;
    public final int LJIILJJIL;
    public final String LJIILL;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    public C1428790nHh() {
        int i = 0;
        this((String) null, i, (NLETemplateModel) (0 == true ? 1 : 0), 0L, (String) (0 == true ? 1 : 0), (String) (0 == true ? 1 : 0), (String) (0 == true ? 1 : 0), (String) (0 == true ? 1 : 0), (String) (0 == true ? 1 : 0), i, (AVMusic) (0 == true ? 1 : 0), (String) (0 == true ? 1 : 0), (Boolean) (0 == true ? 1 : 0), i, (String) (0 == true ? 1 : 0), 65535);
    }

    public final boolean LIZ() {
        int i;
        String str;
        INLETemplateOfflineService iNLETemplateOfflineService;
        if (this.LIZJ != null && (iNLETemplateOfflineService = (INLETemplateOfflineService) ServiceManager.get().getService(INLETemplateOfflineService.class)) != null && iNLETemplateOfflineService.LJFF()) {
            return false;
        }
        int i2 = this.LIZIZ;
        if (i2 == 3 || (i = this.LJIIJ) == 3) {
            return true;
        }
        if (i2 == 2 && this.LIZJ == null && this.LIZLLL == null) {
            return true;
        }
        return i == 2 && (this.LJIIJJI == null || (str = this.LJIIL) == null || str.length() == 0);
    }

    public final boolean LIZIZ() {
        String str;
        String str2 = this.LJIIIZ;
        if (str2 == null || str2.length() == 0) {
            if (this.LIZIZ == 2) {
                return (this.LIZJ == null && this.LIZLLL == null) ? false : true;
            }
            return false;
        }
        if (this.LIZIZ == 2) {
            return ((this.LIZJ == null && this.LIZLLL == null) || this.LJIIJ != 2 || this.LJIIJJI == null || (str = this.LJIIL) == null || str.length() == 0) ? false : true;
        }
        return false;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TemplateDownloadResult(templateId = ");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", templateStatus = ");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", nleTemplateModel = ");
        sbLIZ.append(this.LIZJ != null ? "Non-null" : "null");
        sbLIZ.append(",nleModel = ");
        sbLIZ.append(this.LIZLLL != null ? "Non-null" : "null");
        sbLIZ.append(", musicId = ");
        sbLIZ.append(this.LJIIIZ);
        sbLIZ.append(", musicStatus = ");
        sbLIZ.append(this.LJIIJ);
        sbLIZ.append(", musicPath = ");
        sbLIZ.append(this.LJIIL);
        sbLIZ.append(", avMusic = ");
        sbLIZ.append(this.LJIIJJI == null ? "null" : "Non-null");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C1428790nHh(String str, int i, NLETemplateModel nLETemplateModel, long j, String str2, String str3, String str4, String str5, String str6, int i2, AVMusic aVMusic, String str7, Boolean bool, int i3, String str8, int i4) {
        this((i4 & 1) != 0 ? null : str, (i4 & 2) != 0 ? -1 : i, (i4 & 4) != 0 ? null : nLETemplateModel, (NLEModel) null, (i4 & 16) != 0 ? 0L : j, (i4 & 32) != 0 ? null : str2, (i4 & 64) != 0 ? null : str3, (i4 & 128) != 0 ? null : str4, (i4 & 256) != 0 ? null : str5, (i4 & 512) != 0 ? null : str6, (i4 & 1024) != 0 ? -1 : i2, (i4 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0 ? null : aVMusic, (i4 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0 ? null : str7, (i4 & 8192) != 0 ? null : bool, (i4 & 16384) != 0 ? -1 : i3, (i4 & 32768) != 0 ? null : str8);
    }

    public C1428790nHh(String str, int i, NLETemplateModel nLETemplateModel, NLEModel nLEModel, long j, String str2, String str3, String str4, String str5, String str6, int i2, AVMusic aVMusic, String str7, Boolean bool, int i3, String str8) {
        this.LIZ = str;
        this.LIZIZ = i;
        this.LIZJ = nLETemplateModel;
        this.LIZLLL = nLEModel;
        this.LJ = j;
        this.LJFF = str2;
        this.LJI = str3;
        this.LJII = str4;
        this.LJIIIIZZ = str5;
        this.LJIIIZ = str6;
        this.LJIIJ = i2;
        this.LJIIJJI = aVMusic;
        this.LJIIL = str7;
        this.LJIILIIL = bool;
        this.LJIILJJIL = i3;
        this.LJIILL = str8;
    }
}
