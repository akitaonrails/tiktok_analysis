package X;

import com.ss.android.ugc.playerkit.simapicommon.model.SimAudioBitrate;
import com.ss.android.ugc.playerkit.simapicommon.model.SimVideoUrlModel;
import java.util.List;

/* JADX INFO: renamed from: X.0oTZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1474590oTZ {
    public static C1474540oTU LIZ(SimVideoUrlModel simVideoUrlModel, SimAudioBitrate simAudioBitrate, boolean z) {
        String format;
        String codecType;
        List<String> listUrlList = simAudioBitrate.urlList();
        C1476780oX6 audioMeta = simAudioBitrate.getAudioMeta();
        if (listUrlList != null && listUrlList.size() > 0) {
            String fileId = "";
            if (C1474810oTv.LLJL()) {
                if (audioMeta == null) {
                    format = "";
                } else {
                    format = audioMeta.getFormat();
                }
            } else {
                format = "dash";
            }
            C1474550oTV c1474550oTV = new C1474550oTV();
            c1474550oTV.LIZ = 1;
            c1474550oTV.LJIILJJIL = simAudioBitrate.getGearName();
            c1474550oTV.LJIIL = "normal";
            c1474550oTV.LJIILIIL = String.valueOf(simAudioBitrate.getQualityType());
            c1474550oTV.LJIIJ = format;
            c1474550oTV.LIZIZ = 0;
            c1474550oTV.LIZJ = 0;
            c1474550oTV.LJIIJJI = EnumC2281151EQn.Undefine;
            c1474550oTV.LIZLLL = simAudioBitrate.getBitRate();
            if (audioMeta == null) {
                codecType = "";
            } else {
                codecType = audioMeta.getCodecType();
            }
            c1474550oTV.LJIIIZ = codecType;
            c1474550oTV.LJFF = simAudioBitrate.getSize();
            c1474550oTV.LJIILL = simVideoUrlModel.getaK();
            c1474550oTV.LJII = simAudioBitrate.getChecksum();
            if (audioMeta != null) {
                fileId = audioMeta.getFileId();
            }
            c1474550oTV.LJIIIIZZ = fileId;
            c1474550oTV.LJIJI = listUrlList;
            C1474540oTU c1474540oTULIZ = c1474550oTV.LIZ();
            if (C1474810oTv.LLJL()) {
                c1474540oTULIZ.LJJJJL = z;
            }
            return c1474540oTULIZ;
        }
        return null;
    }
}
