package X;

import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.mammon.audiosdk.SAMICore;
import com.mammon.audiosdk.enums.SAMICoreDataType;
import com.mammon.audiosdk.enums.SAMICoreIdentify;
import com.mammon.audiosdk.enums.SAMICorePropertyId;
import com.mammon.audiosdk.structures.SAMICoreAudioBuffer;
import com.mammon.audiosdk.structures.SAMICoreBlock;
import com.mammon.audiosdk.structures.SAMICoreExecutorContextCreateParameter;
import com.mammon.audiosdk.structures.SAMICoreProperty;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.LinkedBlockingQueue;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1Bru, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2218281Bru {
    public SAMICore LIZ;
    public int LIZJ;
    public int LIZLLL;
    public String LJFF;
    public volatile byte[] LJI;
    public boolean LJIIIIZZ;
    public int LJIIIZ;
    public long LJIIJ;
    public Aweme LJIIJJI;
    public boolean LJIIL;
    public boolean LJIILIIL;
    public int LIZIZ = 2;
    public float LJ = -1.0f;
    public final LinkedBlockingQueue<C2218311Brx> LJII = new LinkedBlockingQueue<>();

    public final synchronized void LIZIZ() {
        SAMICore sAMICore;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("audioRelease: samiCore?.handle:");
        SAMICore sAMICore2 = this.LIZ;
        sbLIZ.append(sAMICore2 == null || sAMICore2.getHandle() != 0);
        sbLIZ.append(' ');
        sbLIZ.append(C786410Ut5.u3().getId());
        C201955140j.LIZIZ("FeedAudioMetrics", C2188811AlT.LIZIZ(sbLIZ));
        SAMICore sAMICore3 = this.LIZ;
        if (sAMICore3 != null && sAMICore3.getHandle() != 0 && (sAMICore = this.LIZ) != null) {
            sAMICore.SAMICoreDestroyHandle();
        }
        this.LIZ = null;
        this.LJIIL = false;
        this.LJII.clear();
        if (C20520815Rm.LIZIZ() >= 30) {
            this.LJI = null;
        }
        this.LJIIIZ = 0;
        this.LJIILIIL = false;
        this.LJIIIIZZ = false;
        this.LJIIJJI = null;
        this.LJIIJ = 0L;
        this.LJ = -1.0f;
        this.LJFF = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x02ca  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x02d6 A[Catch: Exception -> 0x02e7, TryCatch #3 {Exception -> 0x02e7, blocks: (B:109:0x02d0, B:111:0x02d6, B:113:0x02de), top: B:133:0x02d0, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:115:0x02e4  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x030f A[Catch: Exception -> 0x033f, LOOP:2: B:119:0x0309->B:121:0x030f, LOOP_END, TRY_LEAVE, TryCatch #1 {Exception -> 0x033f, blocks: (B:30:0x0091, B:32:0x00b5, B:35:0x00bf, B:37:0x00d3, B:38:0x00db, B:49:0x0109, B:51:0x0119, B:52:0x011d, B:58:0x0129, B:60:0x0134, B:62:0x013a, B:63:0x013e, B:65:0x015d, B:66:0x0162, B:68:0x01b8, B:69:0x0200, B:71:0x0206, B:73:0x020e, B:79:0x0225, B:80:0x0229, B:81:0x022a, B:83:0x023f, B:84:0x0244, B:85:0x025d, B:87:0x0263, B:89:0x0271, B:91:0x0281, B:93:0x0289, B:97:0x029e, B:98:0x02a2, B:108:0x02cc, B:118:0x02eb, B:119:0x0309, B:121:0x030f, B:117:0x02e8, B:105:0x02c4, B:77:0x021a, B:46:0x0101, B:40:0x00ed, B:42:0x00f3, B:44:0x00fb, B:109:0x02d0, B:111:0x02d6, B:113:0x02de, B:99:0x02b0, B:101:0x02b6, B:103:0x02be), top: B:130:0x0091, inners: #0, #3, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0119 A[Catch: Exception -> 0x033f, TryCatch #1 {Exception -> 0x033f, blocks: (B:30:0x0091, B:32:0x00b5, B:35:0x00bf, B:37:0x00d3, B:38:0x00db, B:49:0x0109, B:51:0x0119, B:52:0x011d, B:58:0x0129, B:60:0x0134, B:62:0x013a, B:63:0x013e, B:65:0x015d, B:66:0x0162, B:68:0x01b8, B:69:0x0200, B:71:0x0206, B:73:0x020e, B:79:0x0225, B:80:0x0229, B:81:0x022a, B:83:0x023f, B:84:0x0244, B:85:0x025d, B:87:0x0263, B:89:0x0271, B:91:0x0281, B:93:0x0289, B:97:0x029e, B:98:0x02a2, B:108:0x02cc, B:118:0x02eb, B:119:0x0309, B:121:0x030f, B:117:0x02e8, B:105:0x02c4, B:77:0x021a, B:46:0x0101, B:40:0x00ed, B:42:0x00f3, B:44:0x00fb, B:109:0x02d0, B:111:0x02d6, B:113:0x02de, B:99:0x02b0, B:101:0x02b6, B:103:0x02be), top: B:130:0x0091, inners: #0, #3, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x015d A[Catch: Exception -> 0x033f, TryCatch #1 {Exception -> 0x033f, blocks: (B:30:0x0091, B:32:0x00b5, B:35:0x00bf, B:37:0x00d3, B:38:0x00db, B:49:0x0109, B:51:0x0119, B:52:0x011d, B:58:0x0129, B:60:0x0134, B:62:0x013a, B:63:0x013e, B:65:0x015d, B:66:0x0162, B:68:0x01b8, B:69:0x0200, B:71:0x0206, B:73:0x020e, B:79:0x0225, B:80:0x0229, B:81:0x022a, B:83:0x023f, B:84:0x0244, B:85:0x025d, B:87:0x0263, B:89:0x0271, B:91:0x0281, B:93:0x0289, B:97:0x029e, B:98:0x02a2, B:108:0x02cc, B:118:0x02eb, B:119:0x0309, B:121:0x030f, B:117:0x02e8, B:105:0x02c4, B:77:0x021a, B:46:0x0101, B:40:0x00ed, B:42:0x00f3, B:44:0x00fb, B:109:0x02d0, B:111:0x02d6, B:113:0x02de, B:99:0x02b0, B:101:0x02b6, B:103:0x02be), top: B:130:0x0091, inners: #0, #3, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01b8 A[Catch: Exception -> 0x033f, TryCatch #1 {Exception -> 0x033f, blocks: (B:30:0x0091, B:32:0x00b5, B:35:0x00bf, B:37:0x00d3, B:38:0x00db, B:49:0x0109, B:51:0x0119, B:52:0x011d, B:58:0x0129, B:60:0x0134, B:62:0x013a, B:63:0x013e, B:65:0x015d, B:66:0x0162, B:68:0x01b8, B:69:0x0200, B:71:0x0206, B:73:0x020e, B:79:0x0225, B:80:0x0229, B:81:0x022a, B:83:0x023f, B:84:0x0244, B:85:0x025d, B:87:0x0263, B:89:0x0271, B:91:0x0281, B:93:0x0289, B:97:0x029e, B:98:0x02a2, B:108:0x02cc, B:118:0x02eb, B:119:0x0309, B:121:0x030f, B:117:0x02e8, B:105:0x02c4, B:77:0x021a, B:46:0x0101, B:40:0x00ed, B:42:0x00f3, B:44:0x00fb, B:109:0x02d0, B:111:0x02d6, B:113:0x02de, B:99:0x02b0, B:101:0x02b6, B:103:0x02be), top: B:130:0x0091, inners: #0, #3, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x021a A[Catch: Exception -> 0x033f, TryCatch #1 {Exception -> 0x033f, blocks: (B:30:0x0091, B:32:0x00b5, B:35:0x00bf, B:37:0x00d3, B:38:0x00db, B:49:0x0109, B:51:0x0119, B:52:0x011d, B:58:0x0129, B:60:0x0134, B:62:0x013a, B:63:0x013e, B:65:0x015d, B:66:0x0162, B:68:0x01b8, B:69:0x0200, B:71:0x0206, B:73:0x020e, B:79:0x0225, B:80:0x0229, B:81:0x022a, B:83:0x023f, B:84:0x0244, B:85:0x025d, B:87:0x0263, B:89:0x0271, B:91:0x0281, B:93:0x0289, B:97:0x029e, B:98:0x02a2, B:108:0x02cc, B:118:0x02eb, B:119:0x0309, B:121:0x030f, B:117:0x02e8, B:105:0x02c4, B:77:0x021a, B:46:0x0101, B:40:0x00ed, B:42:0x00f3, B:44:0x00fb, B:109:0x02d0, B:111:0x02d6, B:113:0x02de, B:99:0x02b0, B:101:0x02b6, B:103:0x02be), top: B:130:0x0091, inners: #0, #3, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0263 A[Catch: Exception -> 0x033f, TryCatch #1 {Exception -> 0x033f, blocks: (B:30:0x0091, B:32:0x00b5, B:35:0x00bf, B:37:0x00d3, B:38:0x00db, B:49:0x0109, B:51:0x0119, B:52:0x011d, B:58:0x0129, B:60:0x0134, B:62:0x013a, B:63:0x013e, B:65:0x015d, B:66:0x0162, B:68:0x01b8, B:69:0x0200, B:71:0x0206, B:73:0x020e, B:79:0x0225, B:80:0x0229, B:81:0x022a, B:83:0x023f, B:84:0x0244, B:85:0x025d, B:87:0x0263, B:89:0x0271, B:91:0x0281, B:93:0x0289, B:97:0x029e, B:98:0x02a2, B:108:0x02cc, B:118:0x02eb, B:119:0x0309, B:121:0x030f, B:117:0x02e8, B:105:0x02c4, B:77:0x021a, B:46:0x0101, B:40:0x00ed, B:42:0x00f3, B:44:0x00fb, B:109:0x02d0, B:111:0x02d6, B:113:0x02de, B:99:0x02b0, B:101:0x02b6, B:103:0x02be), top: B:130:0x0091, inners: #0, #3, #4 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZLLL() {
        /*
            Method dump skipped, instruction units count: 861
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2218281Bru.LIZLLL():void");
    }

    public final synchronized void LIZ(C2218311Brx c2218311Brx) {
        long j = this.LJIIJ;
        long j2 = c2218311Brx.LJII;
        if (j > j2) {
            int i = this.LJIIIZ;
            if (((long) i) - j > 0 && ((long) i) - j < 100) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("play end, audio close ");
                sbLIZ.append(C786410Ut5.u3().getId());
                C201955140j.LIZIZ("FeedAudioMetrics", C2188811AlT.LIZIZ(sbLIZ));
                if (this.LJIILIIL) {
                    LIZLLL();
                    this.LJIILIIL = false;
                }
                return;
            }
        }
        this.LJIIJ = j2;
        SAMICore sAMICore = this.LIZ;
        if (sAMICore != null && sAMICore.getHandle() != 0 && this.LJIIIZ != 0) {
            SAMICoreAudioBuffer sAMICoreAudioBuffer = new SAMICoreAudioBuffer();
            int i2 = this.LIZIZ;
            sAMICoreAudioBuffer.numberChannels = i2;
            sAMICoreAudioBuffer.isInterleave = 1;
            int i3 = c2218311Brx.LJI;
            sAMICoreAudioBuffer.numberSamples = i3;
            sAMICoreAudioBuffer.data = new float[][]{new float[i3 * i2]};
            SAMICoreBlock sAMICoreBlock = new SAMICoreBlock();
            sAMICoreBlock.dataType = SAMICoreDataType.SAMICoreDataType_AudioBuffer;
            sAMICoreBlock.audioData = new SAMICoreAudioBuffer[]{sAMICoreAudioBuffer};
            int i4 = c2218311Brx.LJI;
            int i5 = 0;
            for (int i6 = 0; i6 < i4; i6++) {
                ArrayList<float[]> arrayList = c2218311Brx.LJIIIIZZ;
                if (arrayList != null) {
                    Iterator<float[]> it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        sAMICoreAudioBuffer.data[0][i5] = it2.next()[i6];
                        i5++;
                    }
                }
            }
            SAMICore sAMICore2 = this.LIZ;
            if (sAMICore2 != null && sAMICore2.SAMICoreProcess(sAMICoreBlock, null) == 0) {
                return;
            }
            LIZIZ();
        }
    }

    public final void LIZJ(C2218311Brx c2218311Brx) {
        JSONObject jSONObjectOptJSONObject;
        int iSAMICoreCreateHandleByIdentify;
        JSONObject jSONObjectLIZ;
        int i = c2218311Brx.LIZIZ;
        if (i == 0) {
            synchronized (this) {
                Long lValueOf = null;
                try {
                    jSONObjectLIZ = C20520815Rm.LIZ();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (jSONObjectLIZ != null) {
                    jSONObjectOptJSONObject = jSONObjectLIZ.optJSONObject("audio_metrics_params");
                } else {
                    jSONObjectOptJSONObject = null;
                }
                if (jSONObjectOptJSONObject != null) {
                    this.LIZ = new SAMICore();
                    SAMICoreExecutorContextCreateParameter sAMICoreExecutorContextCreateParameter = new SAMICoreExecutorContextCreateParameter();
                    int i2 = c2218311Brx.LIZJ;
                    this.LIZJ = i2;
                    this.LIZLLL = c2218311Brx.LJ;
                    sAMICoreExecutorContextCreateParameter.sampleRate = i2;
                    int i3 = c2218311Brx.LIZLLL;
                    this.LIZIZ = i3;
                    sAMICoreExecutorContextCreateParameter.numChannel = i3;
                    sAMICoreExecutorContextCreateParameter.maxBlockSize = SpeechEngineDefines.TTS_WORK_MODE_BOTH;
                    byte[] bArr = this.LJI;
                    sAMICoreExecutorContextCreateParameter.modelBuffer = bArr;
                    sAMICoreExecutorContextCreateParameter.modelLen = bArr.length;
                    SAMICore sAMICore = this.LIZ;
                    if (sAMICore != null) {
                        iSAMICoreCreateHandleByIdentify = sAMICore.SAMICoreCreateHandleByIdentify(SAMICoreIdentify.SAMICoreIdentify_EngineExecutor_AudioMetrics, sAMICoreExecutorContextCreateParameter);
                    } else {
                        iSAMICoreCreateHandleByIdentify = -1;
                    }
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("audioOpen ret:");
                    sbLIZ.append(iSAMICoreCreateHandleByIdentify);
                    sbLIZ.append(" handle:");
                    SAMICore sAMICore2 = this.LIZ;
                    if (sAMICore2 != null) {
                        lValueOf = Long.valueOf(sAMICore2.getHandle());
                    }
                    sbLIZ.append(lValueOf);
                    sbLIZ.append(' ');
                    sbLIZ.append(C786410Ut5.u3().getId());
                    C201955140j.LIZIZ("FeedAudioMetrics", C2188811AlT.LIZIZ(sbLIZ));
                    if (iSAMICoreCreateHandleByIdentify == 0) {
                        SAMICore sAMICore3 = this.LIZ;
                        if (sAMICore3 == null || sAMICore3.getHandle() != 0) {
                            SAMICoreProperty sAMICoreProperty = new SAMICoreProperty();
                            SAMICorePropertyId sAMICorePropertyId = SAMICorePropertyId.SAMICorePropertyID_AudioMetricsJson;
                            sAMICoreProperty.id = sAMICorePropertyId;
                            sAMICoreProperty.type = SAMICoreDataType.SAMICoreDataType_String;
                            sAMICoreProperty.dataObjectArray = new Object[1];
                            jSONObjectOptJSONObject.put("num_channel", c2218311Brx.LIZLLL);
                            jSONObjectOptJSONObject.put("sample_rate", c2218311Brx.LIZJ);
                            sAMICoreProperty.dataObjectArray[0] = C786410Ut5.J3(jSONObjectOptJSONObject);
                            sAMICoreProperty.dataArrayLen = 1;
                            SAMICore sAMICore4 = this.LIZ;
                            if (sAMICore4 != null && sAMICore4.SAMICoreSetProperty(sAMICorePropertyId, sAMICoreProperty) == 0) {
                                this.LJIIIZ = c2218311Brx.LJFF;
                                this.LJ = c2218311Brx.LJIIIZ;
                                this.LJFF = c2218311Brx.LJIIJ;
                                this.LJIIJJI = c2218311Brx.LIZ;
                                return;
                            }
                        }
                    }
                }
                LIZIZ();
                return;
            }
        }
        if (i == 1) {
            LIZ(c2218311Brx);
        } else if (i == 4) {
            LIZLLL();
        } else if (i == 2) {
            LIZIZ();
        }
    }
}
