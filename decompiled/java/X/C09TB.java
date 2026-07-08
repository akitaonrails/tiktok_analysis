package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.mammon.audiosdk.SAMICore;
import com.mammon.audiosdk.SAMICoreCallBackListener;
import com.mammon.audiosdk.enums.SAMICoreCallBackEventType;
import com.mammon.audiosdk.enums.SAMICoreDataType;
import com.mammon.audiosdk.enums.SAMICorePropertyId;
import com.mammon.audiosdk.structures.SAMICoreBlock;
import com.mammon.audiosdk.structures.SAMICoreProperty;
import com.mammon.audiosdk.structures.SAMICoreServerEvent;
import com.mammon.audiosdk.structures.SAMICoreTtsResult;
import com.ss.android.ugc.aweme.services.audio.ITTSCallback;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.09TB, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C09TB implements SAMICoreCallBackListener {
    public static final C09TB LIZ = new C09TB();

    @Override // com.mammon.audiosdk.SAMICoreCallBackListener
    public final void onMessageReceived(SAMICoreCallBackEventType sAMICoreCallBackEventType, SAMICoreBlock sAMICoreBlock) {
        int i;
        SAMICoreDataType sAMICoreDataType;
        Object[] objArr;
        C09T7 c09t7 = C09T7.LIZ;
        Object objValueOf = null;
        C2296808zG.LIZJ((InterfaceC497601wk) C09T7.LJIIL.getValue(), null);
        C11YP c11yp = C11YP.LIZIZ;
        String str = C09T7.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ttmanger type:");
        sbLIZ.append(sAMICoreCallBackEventType);
        C201955140j.LIZLLL(c11yp, str, C2188811AlT.LIZIZ(sbLIZ));
        if (sAMICoreCallBackEventType == null) {
            i = -1;
        } else {
            i = C09TC.LIZ[sAMICoreCallBackEventType.ordinal()];
        }
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i == 5) {
                            if (sAMICoreBlock != null) {
                                objValueOf = sAMICoreBlock.dataType;
                            }
                            if (objValueOf == SAMICoreDataType.SAMICoreDataType_AudioBin) {
                                SAMICoreTtsResult sAMICoreTtsResult = (SAMICoreTtsResult) sAMICoreBlock.audioData[0];
                                ITTSCallback iTTSCallback = C09T7.LJIIIZ;
                                if (iTTSCallback != null) {
                                    iTTSCallback.onFirstAudioReceived(sAMICoreTtsResult);
                                }
                            }
                        }
                    } else {
                        ITTSCallback iTTSCallback2 = C09T7.LJIIIZ;
                        if (iTTSCallback2 != null) {
                            iTTSCallback2.onStreamTTSPlayFinish();
                        }
                        C09T7.LIZLLL = 5423;
                    }
                } else {
                    if (sAMICoreBlock != null) {
                        objValueOf = sAMICoreBlock.dataType;
                    }
                    if (objValueOf == SAMICoreDataType.SAMICoreDataType_WebSocket_Server_Event) {
                        SAMICoreServerEvent sAMICoreServerEvent = (SAMICoreServerEvent) sAMICoreBlock.audioData[0];
                        C09TF c09tf = C09T7.LJI;
                        if (c09tf != null) {
                            c09tf.LJI = C09TL.FAIL;
                        }
                        ITTSCallback iTTSCallback3 = C09T7.LJIIIZ;
                        if (iTTSCallback3 != null) {
                            iTTSCallback3.onFailure(1, sAMICoreServerEvent.statusCode, sAMICoreServerEvent.statusText, sAMICoreServerEvent.taskId, sAMICoreServerEvent);
                        }
                    }
                }
            } else {
                if (sAMICoreBlock != null) {
                    sAMICoreDataType = sAMICoreBlock.dataType;
                } else {
                    sAMICoreDataType = null;
                }
                if (sAMICoreDataType == SAMICoreDataType.SAMICoreDataType_WebSocket_Server_Event) {
                    SAMICoreServerEvent sAMICoreServerEvent2 = (SAMICoreServerEvent) sAMICoreBlock.audioData[0];
                    if (sAMICoreServerEvent2.statusCode == 20000000) {
                        try {
                            C09TI c09ti = C09T7.LJIIIIZZ;
                            c09ti.LIZ.clear();
                            JSONArray jSONArrayOptJSONArray = new JSONObject(sAMICoreServerEvent2.textMsg).optJSONArray("files");
                            if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() > 0) {
                                c09ti.LIZ.add(jSONArrayOptJSONArray.get(0).toString());
                            }
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append("download cost: ");
                            sbLIZ2.append(System.currentTimeMillis() - 0);
                            sbLIZ2.append("\n fileName: ");
                            sbLIZ2.append(C09T7.LIZJ());
                            sbLIZ2.append(" \ndownload success ");
                            C201955140j.LIZLLL(c11yp, str, C2188811AlT.LIZIZ(sbLIZ2));
                            SAMICoreProperty sAMICoreProperty = new SAMICoreProperty();
                            String str2 = "";
                            SAMICore sAMICore = C09T7.LIZJ.LIZLLL;
                            if (sAMICore != null) {
                                objValueOf = Integer.valueOf(sAMICore.SAMICoreGetPropertyById(SAMICorePropertyId.SAMICorePropertyID_Play_TTS_Performance, sAMICoreProperty));
                            }
                            if (objValueOf == 0 && (objArr = sAMICoreProperty.dataObjectArray) != null) {
                                str2 = (String) objArr[0];
                            }
                            C09TF c09tf2 = C09T7.LJI;
                            if (c09tf2 != null) {
                                c09tf2.LJI = C09TL.SUC;
                            }
                            ITTSCallback iTTSCallback4 = C09T7.LJIIIZ;
                            if (iTTSCallback4 != null) {
                                iTTSCallback4.onSuccess(1, new C0VSJ(C09T7.LIZJ()), str2, sAMICoreServerEvent2);
                            }
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                            sbLIZ3.append(C09T7.LIZIZ);
                            sbLIZ3.append("onMessageReceived");
                            C201955140j.LJI(C2188811AlT.LIZIZ(sbLIZ3), e);
                        }
                    } else {
                        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                        sbLIZ4.append(str);
                        sbLIZ4.append("onMessageReceived: status code error, type = ");
                        sbLIZ4.append(sAMICoreBlock.dataType);
                        sbLIZ4.append(", code = ");
                        sbLIZ4.append(sAMICoreServerEvent2.statusCode);
                        C201955140j.LJ(C2188811AlT.LIZIZ(sbLIZ4));
                    }
                }
            }
        } else {
            if (sAMICoreBlock != null) {
                objValueOf = sAMICoreBlock.dataType;
            }
            if (objValueOf == SAMICoreDataType.SAMICoreDataType_WebSocket_Server_Event) {
                SAMICoreServerEvent sAMICoreServerEvent3 = (SAMICoreServerEvent) sAMICoreBlock.audioData[0];
                if (sAMICoreServerEvent3.statusCode == 20000000) {
                    C09T7.LIZLLL = 5421;
                } else {
                    StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                    sbLIZ5.append("onMessageReceived: status code error, type = ");
                    sbLIZ5.append(sAMICoreBlock.dataType);
                    sbLIZ5.append(", code = ");
                    sbLIZ5.append(sAMICoreServerEvent3.statusCode);
                    C201955140j.LIZLLL(c11yp, str, C2188811AlT.LIZIZ(sbLIZ5));
                }
            }
            ITTSCallback iTTSCallback5 = C09T7.LJIIIZ;
            if (iTTSCallback5 != null) {
                iTTSCallback5.onConnectToServerSuc();
            }
        }
        if (sAMICoreCallBackEventType == SAMICoreCallBackEventType.TTS_Started || sAMICoreCallBackEventType == SAMICoreCallBackEventType.TTS_Finished || sAMICoreCallBackEventType == SAMICoreCallBackEventType.TTS_Failed) {
            C201955140j.LIZLLL(C11YP.LIZIZ, C09T7.LIZIZ, "set process false");
            C09T7.LJ = false;
            C09T7.LIZ.LIZLLL();
        }
    }
}
