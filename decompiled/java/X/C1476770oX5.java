package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.playerkit.simapicommon.model.SimAudioBitrate;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0oX5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1476770oX5 {
    public static final List<SimAudioBitrate> LIZ(List<C1476750oX3> list) {
        long jIntValue;
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (C1476750oX3 c1476750oX3 : list) {
            try {
                SimAudioBitrate simAudioBitrate = new SimAudioBitrate();
                C1476780oX6 c1476780oX6 = new C1476780oX6();
                C1476790oX7 c1476790oX7 = new C1476790oX7();
                List<String> urlList = c1476750oX3.getUrlList();
                c1476790oX7.setMainUrl((String) C13LP.LJJJLZIJ(0, urlList));
                c1476790oX7.setBackupUrl((String) C13LP.LJJJLZIJ(1, urlList));
                c1476790oX7.setFallbackUrl((String) C13LP.LJJJLZIJ(2, urlList));
                c1476780oX6.setUrlList(c1476790oX7);
                c1476780oX6.setMediaType("audio");
                c1476780oX6.setFormat(c1476750oX3.getFormat());
                Integer bitRate = c1476750oX3.getBitRate();
                if (bitRate != null) {
                    jIntValue = bitRate.intValue();
                } else {
                    jIntValue = -1;
                }
                c1476780oX6.setBitrate(jIntValue);
                String subInfo = c1476750oX3.getSubInfo();
                String str = "";
                if (subInfo == null) {
                    subInfo = "";
                }
                c1476780oX6.setSubInfo(subInfo);
                c1476780oX6.setFileHash(c1476750oX3.fileHash);
                c1476780oX6.setFileId(c1476750oX3.fileHash);
                String languageCode = c1476750oX3.getLanguageCode();
                if (languageCode != null) {
                    str = languageCode;
                }
                c1476780oX6.setLanguageCode(str);
                c1476780oX6.setLoudness(c1476750oX3.getLoudness());
                c1476780oX6.setPeak(c1476750oX3.getPeak());
                c1476780oX6.setIsDubbedAudio(true);
                simAudioBitrate.setAudioMeta(c1476780oX6);
                arrayList.add(simAudioBitrate);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C1481110oe5.LIZIZ("SIM_AUDIO_LOG", "Insufficient data to build SimAudioBitrate");
            }
        }
        return arrayList;
    }
}
