package X;

import android.text.TextUtils;
import android.view.SurfaceView;
import com.bytedance.scene.Scene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.bytertc.engine.type.RemoteStreamStats;
import com.ss.bytertc.engine.type.RemoteVideoStats;
import com.ss.lyrax.audio.LyraxAudioPropertiesInfo;
import com.ss.lyrax.engine.LyraxScene;
import com.ss.lyrax.stream.LyraxStreamIndex;
import com.ss.lyrax.stream.LyraxStreamKey;
import com.ss.lyrax.transcoder.LyraxTranscoderFeatureEvent;
import com.ss.lyrax.transcoder.LyraxTranscoderFeatureEventType;
import com.ss.lyrax.video.LyraxVideoExtraData;
import com.ss.solution.interact.IInteractNativeListener;
import com.ss.ttlivestreamer.core.buffer.VideoFrame;
import com.ss.ttlivestreamer.core.buffer.k;
import com.ss.ttlivestreamer.core.utils.AVLog;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0jHR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public class C1274870jHR implements IInteractNativeListener {
    public final /* synthetic */ C1274840jHO LIZ;

    @Override // com.ss.solution.interact.IInteractNativeListener
    public final /* synthetic */ void onAudioEnabled(boolean z, String str) {
        C1275180jHw.LIZ(this, z, str);
    }

    @Override // com.ss.solution.interact.IInteractNativeListener
    public final /* synthetic */ void onDidRejoinChannel(String str, String str2, int i) {
        C1275180jHw.LJIIIZ(this, str, str2, i);
    }

    @Override // com.ss.solution.interact.IInteractNativeListener
    public final /* synthetic */ void onFirstRemoteAudioFrameDecoded(String str, int i) {
        C1275180jHw.LJIILL(this, str, i);
    }

    @Override // com.ss.solution.interact.IInteractNativeListener
    public final /* synthetic */ void onInfoCallback(int i, String str) {
        C1275180jHw.LJIJJLI(this, i, str);
    }

    @Override // com.ss.solution.interact.IInteractNativeListener
    public final /* synthetic */ void onLocalAudioEnabled(boolean z, String str) {
        C1275180jHw.LJJ(this, z, str);
    }

    @Override // com.ss.solution.interact.IInteractNativeListener
    public final /* synthetic */ void onLocalAudioStats(int i) {
        C1275180jHw.LJJIFFI(this, i);
    }

    @Override // com.ss.solution.interact.IInteractNativeListener
    public final /* synthetic */ void onLocalAudioVadState(int i) {
        C1275180jHw.LJJII(this, i);
    }

    @Override // com.ss.solution.interact.IInteractNativeListener
    public final /* synthetic */ void onLocalAuxStreamStarted(String str, int i) {
        C1275180jHw.LJJIII(this, str, i);
    }

    @Override // com.ss.solution.interact.IInteractNativeListener
    public final /* synthetic */ void onLocalAuxStreamStopped(String str, int i) {
        C1275180jHw.LJJIIJ(this, str, i);
    }

    @Override // com.ss.solution.interact.IInteractNativeListener
    public final /* synthetic */ void onLocalVideoEnabled(boolean z, String str) {
        C1275180jHw.LJJIIJZLJL(this, z, str);
    }

    @Override // com.ss.solution.interact.IInteractNativeListener
    public final /* synthetic */ void onPublishRtmpStreamSucceed() {
        C1275180jHw.LJJIJL(this);
    }

    @Override // com.ss.solution.interact.IInteractNativeListener
    public final /* synthetic */ void onVideoEnabled(boolean z, String str) {
        C1275180jHw.LJJLIIIIJ(this, z, str);
    }

    @Override // com.ss.solution.interact.IInteractNativeListener
    public final /* synthetic */ void onWillLeaveChannel() {
        C1275180jHw.LJJLIIIJL(this);
    }

    @Override // com.ss.solution.interact.IInteractNativeListener
    public final void onConnectionDidInterrupted() {
        this.LIZ.getClass();
        C1274840jHO c1274840jHO = this.LIZ;
        InterfaceC1274710jHB interfaceC1274710jHB = c1274840jHO.LJJIII;
        if (interfaceC1274710jHB != null) {
            interfaceC1274710jHB.LIZ(c1274840jHO, 38, 0L, 0L, new Object[0]);
        }
    }

    @Override // com.ss.solution.interact.IInteractNativeListener
    public final void onConnectionDidLost() {
        this.LIZ.getClass();
        C1274840jHO c1274840jHO = this.LIZ;
        InterfaceC1274710jHB interfaceC1274710jHB = c1274840jHO.LJJIII;
        if (interfaceC1274710jHB != null) {
            interfaceC1274710jHB.LIZ(c1274840jHO, 18, 0L, 0L, new Object[0]);
        }
    }

    public C1274870jHR(C1274840jHO c1274840jHO) {
        this.LIZ = c1274840jHO;
    }

    @Override // com.ss.solution.interact.IInteractNativeListener
    public final void onAuxStreamPublished(String str) {
        C1274840jHO c1274840jHO = this.LIZ;
        C1274840jHO.LJLJI(str, "streamId");
        c1274840jHO.getClass();
        C1274840jHO c1274840jHO2 = this.LIZ;
        c1274840jHO2.getClass();
        if (!TextUtils.isEmpty(str)) {
            synchronized (c1274840jHO2.LJJIJIIJI) {
                try {
                    if (!((ArrayList) c1274840jHO2.LJJIJIIJI).contains(str)) {
                        ((ArrayList) c1274840jHO2.LJJIJIIJI).add(str);
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        C1274840jHO c1274840jHO3 = this.LIZ;
        if (c1274840jHO3.LJJIII != null) {
            String strLJLJJI = c1274840jHO3.LJLJJI(str);
            C1274840jHO c1274840jHO4 = this.LIZ;
            c1274840jHO4.LJJIII.LIZ(c1274840jHO4, 29, 0L, 0L, strLJLJJI, str);
        }
    }

    @Override // com.ss.solution.interact.IInteractNativeListener
    public final void onAuxStreamUnpublished(String str) {
        C1274840jHO c1274840jHO = this.LIZ;
        C1274840jHO.LJLJI(str, "streamId");
        c1274840jHO.getClass();
        String strLJLJJI = this.LIZ.LJLJJI(str);
        this.LIZ.LJL(str);
        C1274840jHO c1274840jHO2 = this.LIZ;
        InterfaceC1274710jHB interfaceC1274710jHB = c1274840jHO2.LJJIII;
        if (interfaceC1274710jHB != null) {
            interfaceC1274710jHB.LIZ(c1274840jHO2, 30, 0L, 0L, strLJLJJI, str);
        }
    }

    @Override // com.ss.solution.interact.IInteractNativeListener
    public final void onConnectionStateChanged(boolean z) {
        C1274840jHO c1274840jHO = this.LIZ;
        C1274840jHO.LJLJI(Boolean.valueOf(z), "isError");
        c1274840jHO.getClass();
        C1274840jHO c1274840jHO2 = this.LIZ;
        InterfaceC1274710jHB interfaceC1274710jHB = c1274840jHO2.LJJIII;
        if (interfaceC1274710jHB != null) {
            long j = z ? 1L : 0L;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onConnectionStateChanged: state ");
            sbLIZ.append(z ? 1 : 0);
            sbLIZ.append(", reason -1");
            interfaceC1274710jHB.LIZ(c1274840jHO2, 37, j, 0L, C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    @Override // com.ss.solution.interact.IInteractNativeListener
    public final void onFeatureEvent(LyraxTranscoderFeatureEvent lyraxTranscoderFeatureEvent) {
        C1269160j8E c1269160j8E;
        int iValue;
        C1274840jHO c1274840jHO = this.LIZ;
        C1274840jHO.LJLJI(lyraxTranscoderFeatureEvent, "event");
        c1274840jHO.getClass();
        if (lyraxTranscoderFeatureEvent != null && (c1269160j8E = this.LIZ.LJ) != null && c1269160j8E.LIZ.mVPassInteractCfg != null) {
            JSONObject jSONObject = new JSONObject();
            try {
                LyraxTranscoderFeatureEventType lyraxTranscoderFeatureEventType = lyraxTranscoderFeatureEvent.eventType;
                if (lyraxTranscoderFeatureEventType != null) {
                    iValue = lyraxTranscoderFeatureEventType.value();
                } else {
                    iValue = -1;
                }
                jSONObject.put("eventType", iValue);
                jSONObject.put("featureName", lyraxTranscoderFeatureEvent.featureName);
                jSONObject.put("errorCode", lyraxTranscoderFeatureEvent.errorCode);
                jSONObject.put("message", lyraxTranscoderFeatureEvent.message);
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
            }
            AVLog.logApiCall("rtc_engine_api_callback", "onFeatureEvent", jSONObject);
        }
        C1274840jHO c1274840jHO2 = this.LIZ;
        c1274840jHO2.LJJIIJ.LIZJ(c1274840jHO2, lyraxTranscoderFeatureEvent);
    }

    @Override // com.ss.solution.interact.IInteractNativeListener
    public final void onFirstLocalAudioFrame(int i) {
        C1274840jHO c1274840jHO = this.LIZ;
        C1274840jHO.LJLJI(Integer.valueOf(i), "elapsed");
        c1274840jHO.getClass();
    }

    @Override // com.ss.solution.interact.IInteractNativeListener
    public final void onFirstRemoteAuxStreamVideoRendered(String str) {
        C1274840jHO c1274840jHO = this.LIZ;
        C1274840jHO.LJLJI(str, "streamId");
        c1274840jHO.getClass();
    }

    @Override // com.ss.solution.interact.IInteractNativeListener
    public final void onNetworkDetectionStopped(int i) {
        C1274840jHO c1274840jHO = this.LIZ;
        C1274840jHO.LJLJI(Integer.valueOf(i), "errorCode");
        c1274840jHO.getClass();
    }

    @Override // com.ss.solution.interact.IInteractNativeListener
    public final void onPublishStreamSucceed(String str) {
        C1274840jHO c1274840jHO = this.LIZ;
        C1274840jHO.LJLJI(str, "streamId");
        c1274840jHO.getClass();
        C1274840jHO c1274840jHO2 = this.LIZ;
        InterfaceC1274710jHB interfaceC1274710jHB = c1274840jHO2.LJJIII;
        if (interfaceC1274710jHB != null) {
            interfaceC1274710jHB.LIZ(c1274840jHO2, 101, 0L, 0L, str);
        }
    }

    @Override // com.ss.solution.interact.IInteractNativeListener
    public final void onSceneSet(LyraxScene lyraxScene) {
        EnumC1276410jJv enumC1276410jJv;
        EnumC1276080jJO enumC1276080jJO;
        C1275030jHh c1275030jHh;
        EnumC1267980j6K enumC1267980j6K;
        C1274840jHO c1274840jHO = this.LIZ;
        C1274840jHO.LJLJI(lyraxScene, Scene.SCENE_SERVICE);
        c1274840jHO.getClass();
        C1269160j8E c1269160j8E = this.LIZ.LJ;
        if (c1269160j8E == null) {
            return;
        }
        InterfaceC1266360j3i interfaceC1266360j3i = c1269160j8E.LJI;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onSceneSet() called with: scene = [");
        sbLIZ.append(lyraxScene);
        sbLIZ.append("], configScene = [");
        C1275030jHh c1275030jHh2 = this.LIZ.LIZIZ;
        if (c1275030jHh2 != null) {
            enumC1276410jJv = c1275030jHh2.LJIJJ;
        } else {
            enumC1276410jJv = null;
        }
        sbLIZ.append(enumC1276410jJv);
        sbLIZ.append(" pusher：");
        sbLIZ.append(interfaceC1266360j3i);
        C2188811AlT.LIZIZ(sbLIZ);
        int i = C1276400jJu.LIZIZ[lyraxScene.ordinal()];
        if (i != 1) {
            if (i == 2) {
                C1274840jHO c1274840jHO2 = this.LIZ;
                c1274840jHO2.LJJIIZI(c1274840jHO2.LJI);
                if (interfaceC1266360j3i != null) {
                    C1274840jHO c1274840jHO3 = this.LIZ;
                    c1274840jHO3.getClass();
                    interfaceC1266360j3i.LJJIIZ(c1274840jHO3.LIZJ.LIZLLL);
                    C1274840jHO c1274840jHO4 = this.LIZ;
                    c1274840jHO4.getClass();
                    interfaceC1266360j3i.bindToRoom(c1274840jHO4.LIZJ.LIZLLL);
                }
                C1274840jHO c1274840jHO5 = this.LIZ;
                AbstractC1273900jFs abstractC1273900jFs = c1274840jHO5.LJI;
                if (abstractC1273900jFs != null && abstractC1273900jFs.LLD() != null && (c1275030jHh = c1274840jHO5.LIZIZ) != null) {
                    int i2 = C1276420jJw.LIZ[c1275030jHh.LJIJJ.ordinal()];
                    if (i2 != 1) {
                        if (i2 != 2) {
                            if (i2 != 3) {
                                if (i2 != 4) {
                                    enumC1267980j6K = EnumC1267980j6K.NORMAL_LIVE;
                                } else {
                                    enumC1267980j6K = EnumC1267980j6K.LINKMIC_UNKNOWN;
                                }
                            } else {
                                enumC1267980j6K = EnumC1267980j6K.GAME_DUAL_DEVICE;
                            }
                        } else {
                            enumC1267980j6K = EnumC1267980j6K.LINKMIC_CO_HOST;
                        }
                    } else {
                        enumC1267980j6K = EnumC1267980j6K.LINKMIC_MULTI_GUEST;
                    }
                    c1274840jHO5.LJI.LLLLIIIILLL(enumC1267980j6K);
                }
            }
        } else {
            if (this.LIZ.LJI.LLIIII() == EnumC1267980j6K.GAME_DUAL_DEVICE) {
                this.LIZ.LJI.LLLLIIIILLL(EnumC1267980j6K.GAME_LIVE);
            } else {
                this.LIZ.LJI.LLLLIIIILLL(EnumC1267980j6K.NORMAL_LIVE);
            }
            C1274840jHO c1274840jHO6 = this.LIZ;
            C1267500j5Y c1267500j5Y = c1274840jHO6.LJFF;
            if (c1267500j5Y != null && c1267500j5Y.LIZ.LJI) {
                c1274840jHO6.LJI.LJLJLLL(false);
                this.LIZ.LLD(EnumC1277210jLD.MULTI_VIEW);
            }
            if (interfaceC1266360j3i != null) {
                interfaceC1266360j3i.cacheJoinRoomState();
                interfaceC1266360j3i.LJIILJJIL();
                C1274840jHO c1274840jHO7 = this.LIZ;
                c1274840jHO7.getClass();
                interfaceC1266360j3i.unbindFromRoom(c1274840jHO7.LIZJ.LIZLLL);
            }
            C1268130j6Z c1268130j6Z = this.LIZ.LJJIJLIJ;
            if (c1268130j6Z != null) {
                c1268130j6Z.LJFF();
            }
            this.LIZ.LJI.LLLF();
            this.LIZ.LJI.LLLLII(null);
            this.LIZ.LJI.LLLILZLLLI(null);
        }
        C1274840jHO c1274840jHO8 = this.LIZ;
        InterfaceC1274710jHB interfaceC1274710jHB = c1274840jHO8.LJJIII;
        if (interfaceC1274710jHB != null) {
            Object[] objArr = new Object[2];
            objArr[0] = 0;
            this.LIZ.getClass();
            C1274840jHO.LJLJI(lyraxScene, Scene.SCENE_SERVICE);
            if (lyraxScene == LyraxScene.LINKMIC) {
                enumC1276080jJO = EnumC1276080jJO.LinkMic;
            } else if (lyraxScene == LyraxScene.LIVE) {
                enumC1276080jJO = EnumC1276080jJO.Live;
            } else {
                enumC1276080jJO = EnumC1276080jJO.None;
            }
            objArr[1] = enumC1276080jJO;
            interfaceC1274710jHB.LIZ(c1274840jHO8, 31, 0L, 0L, objArr);
        }
    }

    @Override // com.ss.solution.interact.IInteractNativeListener
    public final void onUpdateLayoutOfSessionViews(boolean z) {
        C1274840jHO c1274840jHO = this.LIZ;
        C1274840jHO.LJLJI(Boolean.valueOf(z), "animated");
        c1274840jHO.getClass();
    }

    @Override // com.ss.solution.interact.IInteractNativeListener
    public final void onAudioMuted(boolean z, String str) {
        C1274840jHO c1274840jHO = this.LIZ;
        C1274840jHO.LJLJI(Boolean.valueOf(z), "muted");
        C1274840jHO.LJLJI(str, "uid");
        c1274840jHO.getClass();
        C1274840jHO c1274840jHO2 = this.LIZ;
        InterfaceC1274710jHB interfaceC1274710jHB = c1274840jHO2.LJJIII;
        if (interfaceC1274710jHB != null) {
            interfaceC1274710jHB.LIZ(c1274840jHO2, 16, 0L, 0L, str, Boolean.valueOf(z));
        }
    }

    @Override // com.ss.solution.interact.IInteractNativeListener
    public final void onAuxStreamRenderFrame(String str, int i) {
        C1275100jHo c1275100jHo;
        k kVar;
        C1274840jHO c1274840jHO = this.LIZ;
        C1274840jHO.LJLJI(str, "streamId");
        C1274840jHO.LJLJI(Integer.valueOf(i), "streamIndex");
        c1274840jHO.getClass();
        if (str != null && (c1275100jHo = this.LIZ.LJJIIZI.get(str)) != null && c1275100jHo.LIZ != null && (kVar = c1275100jHo.LIZLLL) != null) {
            c1275100jHo.LIZ.onFrame(new VideoFrame(kVar, 0, System.nanoTime()));
        }
    }

    @Override // com.ss.solution.interact.IInteractNativeListener
    public final void onError(int i, String str) {
        C1274840jHO c1274840jHO = this.LIZ;
        C1274840jHO.LJLJI(Integer.valueOf(i), "errorCode");
        C1274840jHO.LJLJI(str, "errorMessage");
        c1274840jHO.getClass();
        C1274840jHO c1274840jHO2 = this.LIZ;
        InterfaceC1274710jHB interfaceC1274710jHB = c1274840jHO2.LJJIII;
        if (interfaceC1274710jHB != null) {
            interfaceC1274710jHB.LIZIZ(c1274840jHO2, i, 0L, 0L, new Exception(str));
        }
    }

    @Override // com.ss.solution.interact.IInteractNativeListener
    public final void onFirstRemoteAudioFrame(LyraxStreamKey lyraxStreamKey, int i) {
        String str;
        C1274840jHO c1274840jHO = this.LIZ;
        C1274840jHO.LJLJI(lyraxStreamKey, "streamKey");
        C1274840jHO.LJLJI(Integer.valueOf(i), "elapsed");
        c1274840jHO.getClass();
        C1274840jHO c1274840jHO2 = this.LIZ;
        InterfaceC1274710jHB interfaceC1274710jHB = c1274840jHO2.LJJIII;
        if (interfaceC1274710jHB != null) {
            if (lyraxStreamKey != null) {
                str = lyraxStreamKey.userID;
            } else {
                str = "";
            }
            interfaceC1274710jHB.LIZ(c1274840jHO2, 10, 0L, 0L, str, InterfaceC1269080j86.LIZ);
        }
    }

    @Override // com.ss.solution.interact.IInteractNativeListener
    public final void onLocalAudioPropertiesReport(LyraxAudioPropertiesInfo[] lyraxAudioPropertiesInfoArr, int i) {
        int length;
        boolean z;
        C1274840jHO c1274840jHO = this.LIZ;
        if (lyraxAudioPropertiesInfoArr != null) {
            length = lyraxAudioPropertiesInfoArr.length;
        } else {
            length = 0;
        }
        C1274840jHO.LJLJI(Integer.valueOf(length), "count");
        C1274840jHO.LJLJI(Integer.valueOf(i), "totalLocalVolume");
        c1274840jHO.getClass();
        if (lyraxAudioPropertiesInfoArr == null) {
            return;
        }
        int i2 = this.LIZ.LIZIZ.LJIL;
        if (i2 <= 0) {
            i2 = 30;
        }
        for (LyraxAudioPropertiesInfo lyraxAudioPropertiesInfo : lyraxAudioPropertiesInfoArr) {
            if (lyraxAudioPropertiesInfo != null && lyraxAudioPropertiesInfo.index == LyraxStreamIndex.kMain) {
                int i3 = lyraxAudioPropertiesInfo.linearVolume;
                if (i3 > i2) {
                    z = true;
                } else {
                    z = false;
                }
                C1274840jHO c1274840jHO2 = this.LIZ;
                String[] strArr = {c1274840jHO2.LIZJ.LJFF};
                boolean[] zArr = {z};
                int[] iArr = {i3};
                InterfaceC1274710jHB interfaceC1274710jHB = c1274840jHO2.LJJIII;
                if (interfaceC1274710jHB != null) {
                    interfaceC1274710jHB.LIZ(c1274840jHO2, 9, 0L, 0L, strArr, zArr, iArr);
                }
            }
        }
    }

    @Override // com.ss.solution.interact.IInteractNativeListener
    public final void onPublishVideoStats(int i, int i2) {
        C1274840jHO c1274840jHO = this.LIZ;
        C1274840jHO.LJLJI(Integer.valueOf(i), "txVideoKBitRate");
        C1274840jHO.LJLJI(Integer.valueOf(i2), "txAudioKBitRate");
        c1274840jHO.getClass();
        C1274840jHO c1274840jHO2 = this.LIZ;
        InterfaceC1274710jHB interfaceC1274710jHB = c1274840jHO2.LJJIII;
        if (interfaceC1274710jHB != null) {
            interfaceC1274710jHB.LIZ(c1274840jHO2, 2, i, 0L, Integer.valueOf(i2));
        }
    }

    @Override // com.ss.solution.interact.IInteractNativeListener
    public final void onPushExternalVideoFrameSizeChanged(int i, int i2) {
        C1274840jHO c1274840jHO = this.LIZ;
        C1274840jHO.LJLJI(Integer.valueOf(i), "width");
        C1274840jHO.LJLJI(Integer.valueOf(i2), "height");
        c1274840jHO.getClass();
        C1274840jHO c1274840jHO2 = this.LIZ;
        InterfaceC1274710jHB interfaceC1274710jHB = c1274840jHO2.LJJIII;
        if (interfaceC1274710jHB != null) {
            interfaceC1274710jHB.LIZ(c1274840jHO2, 22, 0L, 0L, Integer.valueOf(i), Integer.valueOf(i2));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0040 A[PHI: r6
      0x0040: PHI (r6v3 java.lang.String) = (r6v1 java.lang.String), (r6v5 java.lang.String) binds: [B:31:0x0075, B:18:0x003e] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.ss.solution.interact.IInteractNativeListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onRemoteAudioPropertiesReport(com.ss.lyrax.audio.LyraxAudioPropertiesInfo[] r16, int r17) {
        /*
            r15 = this;
            r11 = r15
            X.0jHO r2 = r11.LIZ
            r14 = 0
            r10 = r16
            if (r10 == 0) goto L79
            int r0 = r10.length
        L9:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = "count"
            X.C1274840jHO.LJLJI(r1, r0)
            java.lang.String r1 = "totalRemoteVolume"
            java.lang.Integer r0 = java.lang.Integer.valueOf(r17)
            X.C1274840jHO.LJLJI(r0, r1)
            r2.getClass()
            if (r10 == 0) goto L94
            int r0 = r10.length
            if (r0 == 0) goto L94
            X.0jHO r0 = r11.LIZ
            X.0jHh r0 = r0.LIZIZ
            int r9 = r0.LJIL
            if (r9 > 0) goto L2d
            r9 = 30
        L2d:
            int r8 = r10.length
            java.lang.String[] r4 = new java.lang.String[r8]
            boolean[] r3 = new boolean[r8]
            int[] r2 = new int[r8]
            r7 = 0
        L35:
            r13 = 1
            if (r7 >= r8) goto L7b
            r12 = r10[r7]
            if (r12 == 0) goto L73
            java.lang.String r6 = r12.userId
            if (r6 == 0) goto L73
        L40:
            int r5 = r12.linearVolume
            com.ss.lyrax.stream.LyraxStreamIndex r0 = r12.index
            if (r0 == 0) goto L67
            int r1 = r0.value()
            com.ss.lyrax.stream.LyraxStreamIndex r0 = com.ss.lyrax.stream.LyraxStreamIndex.kMain
            int r0 = r0.value()
            if (r1 <= r0) goto L67
            boolean r0 = android.text.TextUtils.isEmpty(r6)
            if (r0 != 0) goto L67
            X.0jHO r1 = r11.LIZ
            com.ss.lyrax.stream.LyraxStreamIndex r0 = r12.index
            int r0 = r0.value()
            r1.getClass()
            java.lang.String r6 = X.C1274840jHO.LJZ(r0, r6)
        L67:
            r4[r7] = r6
            if (r5 >= r9) goto L6c
            r13 = 0
        L6c:
            r3[r7] = r13
            r2[r7] = r5
            int r7 = r7 + 1
            goto L35
        L73:
            java.lang.String r6 = ""
            if (r12 != 0) goto L40
            r5 = 0
            goto L67
        L79:
            r0 = 0
            goto L9
        L7b:
            X.0jHO r6 = r11.LIZ
            X.0jHB r5 = r6.LJJIII
            if (r5 == 0) goto L94
            r7 = 9
            r8 = 0
            r0 = 3
            java.lang.Object[] r1 = new java.lang.Object[r0]
            r1[r14] = r4
            r1[r13] = r3
            r0 = 2
            r1[r0] = r2
            r10 = r8
            r12 = r1
            r5.LIZ(r6, r7, r8, r10, r12)
        L94:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1274870jHR.onRemoteAudioPropertiesReport(com.ss.lyrax.audio.LyraxAudioPropertiesInfo[], int):void");
    }

    @Override // com.ss.solution.interact.IInteractNativeListener
    public final void onRemoteAudioStats(LyraxStreamKey lyraxStreamKey, int i) {
        C1274840jHO c1274840jHO = this.LIZ;
        C1274840jHO.LJLJI(lyraxStreamKey, "streamKey");
        C1274840jHO.LJLJI(Integer.valueOf(i), "receivedKBitRate");
        c1274840jHO.getClass();
        C1274840jHO c1274840jHO2 = this.LIZ;
        if (c1274840jHO2.LJJIII != null) {
            c1274840jHO2.LJLJJLL(lyraxStreamKey).audioStats.receivedKBitrate = i;
        }
    }

    @Override // com.ss.solution.interact.IInteractNativeListener
    public final void onReportPushStreamEvent(String str, String str2) {
        C1274840jHO c1274840jHO = this.LIZ;
        C1274840jHO.LJLJI(str, "event");
        C1274840jHO.LJLJI(str2, "dataJson");
        c1274840jHO.getClass();
        InterfaceC1274800jHK interfaceC1274800jHK = this.LIZ.LJJII;
        if (interfaceC1274800jHK != null && !TextUtils.isEmpty(str2)) {
            try {
                JSONObject jSONObject = new JSONObject(str2);
                this.LIZ.getClass();
                if ("rtc_push_stream".equals(str) || "rtc_push_stream".equals(jSONObject.optString("event_key"))) {
                    this.LIZ.LJJ(jSONObject);
                    this.LIZ.LJJIIJ(jSONObject);
                    C1274840jHO c1274840jHO2 = this.LIZ;
                    if (c1274840jHO2.LIZIZ.LJIIL == EnumC1274430jGj.ANCHOR) {
                        try {
                            C190800oM.LIZIZ(jSONObject, c1274840jHO2.LIZLLL.LJIIIZ());
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                        }
                    }
                    this.LIZ.LJJIIJZLJL(jSONObject);
                }
                ((C1274850jHP) interfaceC1274800jHK).LJIILJJIL("live_client_monitor_log", jSONObject);
            } catch (JSONException e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
        }
    }

    @Override // com.ss.solution.interact.IInteractNativeListener
    public final void onReportToTTMonitorData(String str, String str2) {
        C1274840jHO c1274840jHO = this.LIZ;
        C1274840jHO.LJLJI(str, "dataJson");
        C1274840jHO.LJLJI(str2, "eventKey");
        c1274840jHO.getClass();
        C1274840jHO c1274840jHO2 = this.LIZ;
        InterfaceC1274710jHB interfaceC1274710jHB = c1274840jHO2.LJJIII;
        if (interfaceC1274710jHB != null) {
            interfaceC1274710jHB.LIZ(c1274840jHO2, 3, 0L, 0L, str, str2);
        }
    }

    @Override // com.ss.solution.interact.IInteractNativeListener
    public final void onRoomMessageReceived(String str, String str2) {
        C1274840jHO c1274840jHO = this.LIZ;
        C1274840jHO.LJLJI(str, "uid");
        C1274840jHO.LJLJI(str2, "message");
        c1274840jHO.getClass();
        C1274840jHO c1274840jHO2 = this.LIZ;
        InterfaceC1274710jHB interfaceC1274710jHB = c1274840jHO2.LJJIII;
        if (interfaceC1274710jHB != null) {
            interfaceC1274710jHB.LIZ(c1274840jHO2, 204, 0L, 0L, str, str2, 0);
        }
    }

    @Override // com.ss.solution.interact.IInteractNativeListener
    public final void onRoomMessageSendResult(long j, int i) {
        C1274840jHO c1274840jHO = this.LIZ;
        C1274840jHO.LJLJI(Long.valueOf(j), "msgId");
        C1274840jHO.LJLJI(Integer.valueOf(i), "error");
        c1274840jHO.getClass();
        C1274840jHO c1274840jHO2 = this.LIZ;
        InterfaceC1274710jHB interfaceC1274710jHB = c1274840jHO2.LJJIII;
        if (interfaceC1274710jHB != null) {
            interfaceC1274710jHB.LIZ(c1274840jHO2, 203, 0L, 0L, Long.valueOf(j), Integer.valueOf(i), 0);
        }
    }

    @Override // com.ss.solution.interact.IInteractNativeListener
    public final void onStreamAdd(String str, String str2) {
        C1274840jHO c1274840jHO = this.LIZ;
        C1274840jHO.LJLJI(str, "uid");
        C1274840jHO.LJLJI(str2, "streamInfo");
        c1274840jHO.getClass();
    }

    @Override // com.ss.solution.interact.IInteractNativeListener
    public final void onStreamRemoved(String str, String str2) {
        C1274840jHO c1274840jHO = this.LIZ;
        C1274840jHO.LJLJI(str, "uid");
        C1274840jHO.LJLJI(str2, "streamInfo");
        c1274840jHO.getClass();
    }

    @Override // com.ss.solution.interact.IInteractNativeListener
    public final void onUpdateLinkmicInfo(String str, String str2) {
        C1274840jHO c1274840jHO = this.LIZ;
        C1274840jHO.LJLJI(str, "remoteLinkMicId");
        C1274840jHO.LJLJI(str2, "infoJson");
        c1274840jHO.getClass();
    }

    @Override // com.ss.solution.interact.IInteractNativeListener
    public final void onUserBizSessionId(String str, String str2) {
        C1274840jHO c1274840jHO = this.LIZ;
        C1274840jHO.LJLJI(str, "uid");
        C1274840jHO.LJLJI(str2, "bizSessionId");
        c1274840jHO.getClass();
        C1274840jHO c1274840jHO2 = this.LIZ;
        InterfaceC1274710jHB interfaceC1274710jHB = c1274840jHO2.LJJIII;
        if (interfaceC1274710jHB != null) {
            interfaceC1274710jHB.LIZ(c1274840jHO2, 27, 0L, 0L, str, str2);
        }
    }

    @Override // com.ss.solution.interact.IInteractNativeListener
    public final void onUserMessageReceived(String str, String str2) {
        C1274840jHO c1274840jHO = this.LIZ;
        C1274840jHO.LJLJI(str, "uid");
        C1274840jHO.LJLJI(str2, "message");
        c1274840jHO.getClass();
        C1274840jHO c1274840jHO2 = this.LIZ;
        InterfaceC1274710jHB interfaceC1274710jHB = c1274840jHO2.LJJIII;
        if (interfaceC1274710jHB != null) {
            interfaceC1274710jHB.LIZ(c1274840jHO2, 202, 0L, 0L, str, str2, 0);
        }
    }

    @Override // com.ss.solution.interact.IInteractNativeListener
    public final void onUserMessageSendResult(long j, int i) {
        C1274840jHO c1274840jHO = this.LIZ;
        C1274840jHO.LJLJI(Long.valueOf(j), "msgId");
        C1274840jHO.LJLJI(Integer.valueOf(i), "error");
        c1274840jHO.getClass();
        C1274840jHO c1274840jHO2 = this.LIZ;
        InterfaceC1274710jHB interfaceC1274710jHB = c1274840jHO2.LJJIII;
        if (interfaceC1274710jHB != null) {
            interfaceC1274710jHB.LIZ(c1274840jHO2, 201, 0L, 0L, Long.valueOf(j), Integer.valueOf(i), 0);
        }
    }

    @Override // com.ss.solution.interact.IInteractNativeListener
    public final void onUserOffline(String str, int i) {
        C1274840jHO c1274840jHO = this.LIZ;
        C1274840jHO.LJLJI(str, "uid");
        C1274840jHO.LJLJI(Integer.valueOf(i), "reason");
        c1274840jHO.getClass();
        this.LIZ.LJLLILLLL(str, false);
        C1274840jHO c1274840jHO2 = this.LIZ;
        InterfaceC1274710jHB interfaceC1274710jHB = c1274840jHO2.LJJIII;
        if (interfaceC1274710jHB != null) {
            interfaceC1274710jHB.LIZ(c1274840jHO2, 8, i, 0L, str);
        }
    }

    @Override // com.ss.solution.interact.IInteractNativeListener
    public final void onVideoMuted(boolean z, String str) {
        C1274840jHO c1274840jHO = this.LIZ;
        C1274840jHO.LJLJI(Boolean.valueOf(z), "muted");
        C1274840jHO.LJLJI(str, "uid");
        c1274840jHO.getClass();
        C1274840jHO c1274840jHO2 = this.LIZ;
        InterfaceC1274710jHB interfaceC1274710jHB = c1274840jHO2.LJJIII;
        if (interfaceC1274710jHB != null) {
            interfaceC1274710jHB.LIZ(c1274840jHO2, 15, 0L, 0L, str, Boolean.valueOf(z));
        }
    }

    @Override // com.ss.solution.interact.IInteractNativeListener
    public final void onVideoSEIReceived(LyraxStreamKey lyraxStreamKey, LyraxVideoExtraData lyraxVideoExtraData) {
        byte channelId;
        ByteBuffer seiData;
        ByteBuffer byteBufferAllocateDirect;
        C1274840jHO c1274840jHO = this.LIZ;
        C1274840jHO.LJLJI(lyraxStreamKey, "streamKey");
        if (lyraxVideoExtraData != null) {
            channelId = lyraxVideoExtraData.getChannelId();
        } else {
            channelId = 0;
        }
        C1274840jHO.LJLJI(Byte.valueOf(channelId), "channelId");
        c1274840jHO.getClass();
        if (lyraxStreamKey != null && lyraxVideoExtraData != null && this.LIZ.LJI != null && (seiData = lyraxVideoExtraData.getSeiData()) != null && seiData.hasRemaining()) {
            String str = lyraxStreamKey.userID;
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (seiData.hasRemaining()) {
                ByteBuffer byteBufferDuplicate = seiData.duplicate();
                int i = 1;
                if (byteBufferDuplicate.get(byteBufferDuplicate.limit() - 1) == 0) {
                    if (byteBufferDuplicate.isDirect()) {
                        byteBufferAllocateDirect = byteBufferDuplicate.slice();
                        byteBufferAllocateDirect.position(0);
                        if (byteBufferAllocateDirect == null) {
                            return;
                        }
                    }
                    C1274840jHO c1274840jHO2 = this.LIZ;
                    c1274840jHO2.LJI.LLJJJJ(c1274840jHO2.LJLLI(str), str, 0, 0, 0, jCurrentTimeMillis, byteBufferAllocateDirect);
                }
                i = 0;
                byteBufferAllocateDirect = ByteBuffer.allocateDirect(byteBufferDuplicate.remaining() + (i ^ 1));
                byteBufferAllocateDirect.put(byteBufferDuplicate);
                if (i == 0) {
                    byteBufferAllocateDirect.put((byte) 0);
                }
                byteBufferAllocateDirect.position(0);
                C1274840jHO c1274840jHO22 = this.LIZ;
                c1274840jHO22.LJI.LLJJJJ(c1274840jHO22.LJLLI(str), str, 0, 0, 0, jCurrentTimeMillis, byteBufferAllocateDirect);
            }
        }
    }

    @Override // com.ss.solution.interact.IInteractNativeListener
    public final void onWarning(int i, String str) {
        C1274840jHO c1274840jHO = this.LIZ;
        C1274840jHO.LJLJI(Integer.valueOf(i), "warnCode");
        C1274840jHO.LJLJI(str, "warnMessage");
        c1274840jHO.getClass();
        C1274840jHO c1274840jHO2 = this.LIZ;
        InterfaceC1274710jHB interfaceC1274710jHB = c1274840jHO2.LJJIII;
        if (interfaceC1274710jHB != null) {
            interfaceC1274710jHB.LIZ(c1274840jHO2, 6, i, 0L, str);
        }
    }

    @Override // com.ss.solution.interact.IInteractNativeListener
    public final void onFirstLocalVideoFrame(int i, int i2, int i3) {
        C1274840jHO c1274840jHO = this.LIZ;
        C1274840jHO.LJLJI(Integer.valueOf(i), "width");
        C1274840jHO.LJLJI(Integer.valueOf(i2), "height");
        C1274840jHO.LJLJI(Integer.valueOf(i3), "elapsed");
        c1274840jHO.getClass();
    }

    @Override // com.ss.solution.interact.IInteractNativeListener
    public final void onFirstRemoteVideoFrameRealRendered(LyraxStreamKey lyraxStreamKey, int i, int i2) {
        int iValue;
        long j;
        C1274840jHO c1274840jHO = this.LIZ;
        C1274840jHO.LJLJI(lyraxStreamKey, "streamKey");
        C1274840jHO.LJLJI(Integer.valueOf(i), "width");
        C1274840jHO.LJLJI(Integer.valueOf(i2), "height");
        c1274840jHO.getClass();
        if (lyraxStreamKey != null && !TextUtils.isEmpty(lyraxStreamKey.userID)) {
            String str = lyraxStreamKey.userID;
            C1274840jHO c1274840jHO2 = this.LIZ;
            LyraxStreamIndex lyraxStreamIndex = lyraxStreamKey.streamIndex;
            c1274840jHO2.getClass();
            if (lyraxStreamIndex != null) {
                iValue = lyraxStreamIndex.value();
            } else {
                iValue = 0;
            }
            SurfaceView surfaceViewLJLJLJ = this.LIZ.LJLJLJ(C1274840jHO.LJJIJIIJIL(iValue, str));
            C1274840jHO c1274840jHO3 = this.LIZ;
            InterfaceC1274710jHB interfaceC1274710jHB = c1274840jHO3.LJJIII;
            if (interfaceC1274710jHB != null) {
                if (c1274840jHO3.LJIILJJIL) {
                    j = 1;
                } else {
                    j = 0;
                }
                String str2 = lyraxStreamKey.userID;
                interfaceC1274710jHB.LIZ(c1274840jHO3, 17, j, 0L, str2, surfaceViewLJLJLJ, Integer.valueOf(c1274840jHO3.LJLLI(str2)), Integer.valueOf(i), Integer.valueOf(i2));
            }
        }
    }

    @Override // com.ss.solution.interact.IInteractNativeListener
    public final void onFirstRemoteVideoFrameRendered(String str, int i, int i2) {
        C1274840jHO c1274840jHO = this.LIZ;
        C1274840jHO.LJLJI(str, "uid");
        c1274840jHO.getClass();
    }

    @Override // com.ss.solution.interact.IInteractNativeListener
    public final void onForwardStreamStateChanged(String str, int i, int i2) {
        int i3;
        C1274840jHO c1274840jHO = this.LIZ;
        C1274840jHO.LJLJI(str, "roomId");
        C1274840jHO.LJLJI(Integer.valueOf(i), "state");
        C1274840jHO.LJLJI(Integer.valueOf(i2), "error");
        c1274840jHO.getClass();
        C1274840jHO c1274840jHO2 = this.LIZ;
        InterfaceC1274710jHB interfaceC1274710jHB = c1274840jHO2.LJJIII;
        if (interfaceC1274710jHB != null) {
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        return;
                    } else {
                        i3 = 303;
                    }
                } else {
                    i3 = 302;
                }
            } else {
                i3 = 301;
            }
            interfaceC1274710jHB.LIZ(c1274840jHO2, i3, 0L, 0L, Integer.valueOf(i2), str);
        }
    }

    @Override // com.ss.solution.interact.IInteractNativeListener
    public final void onNetworkQuality(String str, int i, int i2) {
        AbstractC1273900jFs abstractC1273900jFs;
        C1269340j8W c1269340j8WLLD;
        C1269910j9R c1269910j9RLJIJJ;
        C1274840jHO c1274840jHO = this.LIZ;
        C1274840jHO.LJLJI(str, "uid");
        C1274840jHO.LJLJI(Integer.valueOf(i), "txQuality");
        C1274840jHO.LJLJI(Integer.valueOf(i2), "rxQuality");
        c1274840jHO.getClass();
        C1274840jHO c1274840jHO2 = this.LIZ;
        InterfaceC1274710jHB interfaceC1274710jHB = c1274840jHO2.LJJIII;
        if (interfaceC1274710jHB != null) {
            interfaceC1274710jHB.LIZ(c1274840jHO2, 12, 0L, 0L, str, Integer.valueOf(i), Integer.valueOf(i2));
        }
        if (TextUtils.equals(str, this.LIZ.LIZJ.LJFF) && (abstractC1273900jFs = this.LIZ.LJI) != null && (c1269340j8WLLD = abstractC1273900jFs.LLD()) != null && (c1269910j9RLJIJJ = c1269340j8WLLD.LJIJJ()) != null) {
            c1269910j9RLJIJJ.LJ(i, c1269910j9RLJIJJ.LIZIZ.LIZJ);
        }
    }

    @Override // com.ss.solution.interact.IInteractNativeListener
    public final void onRemoteVideoFrameRendered(String str, int i, int i2) {
        C1274840jHO c1274840jHO = this.LIZ;
        C1274840jHO.LJLJI(str, "uid");
        C1274840jHO.LJLJI(Integer.valueOf(i), "width");
        C1274840jHO.LJLJI(Integer.valueOf(i2), "height");
        c1274840jHO.getClass();
    }

    @Override // com.ss.solution.interact.IInteractNativeListener
    public final void onUserJoined(String str, String str2, int i) {
        C1274840jHO c1274840jHO = this.LIZ;
        C1274840jHO.LJLJI(str, "userId");
        C1274840jHO.LJLJI(str2, "extraInfo");
        C1274840jHO.LJLJI(Integer.valueOf(i), "elapsed");
        c1274840jHO.getClass();
        this.LIZ.LJLLILLLL(str, true);
        C1274840jHO c1274840jHO2 = this.LIZ;
        InterfaceC1274710jHB interfaceC1274710jHB = c1274840jHO2.LJJIII;
        if (interfaceC1274710jHB != null) {
            interfaceC1274710jHB.LIZ(c1274840jHO2, 7, 0L, 0L, str);
        }
    }

    @Override // com.ss.solution.interact.IInteractNativeListener
    public final void onFirstRemoteVideoDecoded(LyraxStreamKey lyraxStreamKey, int i, int i2, int i3) {
        int iValue;
        long j;
        SurfaceView surfaceView;
        long j2;
        C1274840jHO c1274840jHO = this.LIZ;
        C1274840jHO.LJLJI(lyraxStreamKey, "streamKey");
        C1274840jHO.LJLJI(Integer.valueOf(i), "width");
        C1274840jHO.LJLJI(Integer.valueOf(i2), "height");
        C1274840jHO.LJLJI(Integer.valueOf(i3), "elapsed");
        c1274840jHO.getClass();
        if (lyraxStreamKey != null && !TextUtils.isEmpty(lyraxStreamKey.userID)) {
            String str = lyraxStreamKey.userID;
            C1274840jHO c1274840jHO2 = this.LIZ;
            LyraxStreamIndex lyraxStreamIndex = lyraxStreamKey.streamIndex;
            c1274840jHO2.getClass();
            if (lyraxStreamIndex != null) {
                iValue = lyraxStreamIndex.value();
            } else {
                iValue = 0;
            }
            String strLJJIJIIJIL = C1274840jHO.LJJIJIIJIL(iValue, str);
            this.LIZ.LJJIIZ(strLJJIJIIJIL);
            ((ConcurrentHashMap) this.LIZ.LJIILL).containsKey(strLJJIJIIJIL);
            SurfaceView surfaceViewLJLJLJ = this.LIZ.LJLJLJ(strLJJIJIIJIL);
            C1274840jHO c1274840jHO3 = this.LIZ;
            InterfaceC1274710jHB interfaceC1274710jHB = c1274840jHO3.LJJIII;
            if (interfaceC1274710jHB != null) {
                if (lyraxStreamKey.streamIndex == LyraxStreamIndex.kMain) {
                    boolean z = c1274840jHO3.LJIILJJIL;
                    if (z) {
                        j = 1;
                    } else {
                        j = 0;
                    }
                    Object[] objArr = new Object[5];
                    String str2 = lyraxStreamKey.userID;
                    objArr[0] = str2;
                    if (z) {
                        surfaceView = null;
                    } else {
                        surfaceView = surfaceViewLJLJLJ;
                    }
                    objArr[1] = surfaceView;
                    objArr[2] = Integer.valueOf(c1274840jHO3.LJLLI(str2));
                    objArr[3] = Integer.valueOf(i);
                    objArr[4] = Integer.valueOf(i2);
                    interfaceC1274710jHB.LIZ(c1274840jHO3, 11, j, 0L, objArr);
                    C1274840jHO c1274840jHO4 = this.LIZ;
                    InterfaceC1274710jHB interfaceC1274710jHB2 = c1274840jHO4.LJJIII;
                    boolean z2 = c1274840jHO4.LJIILJJIL;
                    if (z2) {
                        j2 = 1;
                    } else {
                        j2 = 0;
                    }
                    Object[] objArr2 = new Object[5];
                    String str3 = lyraxStreamKey.userID;
                    objArr2[0] = str3;
                    if (z2) {
                        surfaceViewLJLJLJ = null;
                    }
                    objArr2[1] = surfaceViewLJLJLJ;
                    objArr2[2] = Integer.valueOf(c1274840jHO4.LJLLI(str3));
                    objArr2[3] = Integer.valueOf(i);
                    objArr2[4] = Integer.valueOf(i2);
                    interfaceC1274710jHB2.LIZ(c1274840jHO4, 14, j2, 0L, objArr2);
                    return;
                }
                String str4 = lyraxStreamKey.userID;
                interfaceC1274710jHB.LIZ(c1274840jHO3, 28, 0L, 0L, str4, strLJJIJIIJIL, surfaceViewLJLJLJ, Integer.valueOf(c1274840jHO3.LJLLI(str4)), Integer.valueOf(i), Integer.valueOf(i2));
            }
        }
    }

    @Override // com.ss.solution.interact.IInteractNativeListener
    public final void onJoinRoomResult(String str, String str2, int i, int i2) {
        C1274840jHO c1274840jHO = this.LIZ;
        C1274840jHO.LJLJI(str, "rtcRoomId");
        C1274840jHO.LJLJI(str2, "rtcUid");
        C1274840jHO.LJLJI(Integer.valueOf(i), "joinType");
        C1274840jHO.LJLJI(Integer.valueOf(i2), "elapsed");
        c1274840jHO.getClass();
        C1274840jHO c1274840jHO2 = this.LIZ;
        InterfaceC1274710jHB interfaceC1274710jHB = c1274840jHO2.LJJIII;
        if (interfaceC1274710jHB != null) {
            interfaceC1274710jHB.LIZ(c1274840jHO2, 4, 0L, 0L, new Object[0]);
        }
    }

    @Override // com.ss.solution.interact.IInteractNativeListener
    public final void onMediaDeviceStateChanged(String str, int i, int i2, int i3) {
        C1274840jHO c1274840jHO = this.LIZ;
        C1274840jHO.LJLJI(str, "deviceId");
        C1274840jHO.LJLJI(Integer.valueOf(i), "deviceType");
        C1274840jHO.LJLJI(Integer.valueOf(i2), "deviceState");
        C1274840jHO.LJLJI(Integer.valueOf(i3), "deviceError");
        c1274840jHO.getClass();
    }

    @Override // com.ss.solution.interact.IInteractNativeListener
    public final void onVideoSizeChanged(LyraxStreamKey lyraxStreamKey, int i, int i2, int i3) {
        String str;
        C1274840jHO c1274840jHO = this.LIZ;
        C1274840jHO.LJLJI(lyraxStreamKey, "streamKey");
        C1274840jHO.LJLJI(Integer.valueOf(i), "width");
        C1274840jHO.LJLJI(Integer.valueOf(i2), "height");
        C1274840jHO.LJLJI(Integer.valueOf(i3), "rotation");
        c1274840jHO.getClass();
        C1274840jHO c1274840jHO2 = this.LIZ;
        InterfaceC1274710jHB interfaceC1274710jHB = c1274840jHO2.LJJIII;
        if (interfaceC1274710jHB != null) {
            if (lyraxStreamKey != null) {
                str = lyraxStreamKey.userID;
            } else {
                str = "";
            }
            interfaceC1274710jHB.LIZ(c1274840jHO2, 19, 0L, 0L, str, Integer.valueOf(i), Integer.valueOf(i2));
        }
    }

    @Override // com.ss.solution.interact.IInteractNativeListener
    public final void onLocalVideoStats(int i, int i2, int i3, int i4, int i5) {
        C1274840jHO c1274840jHO = this.LIZ;
        C1274840jHO.LJLJI(Integer.valueOf(i), "sentKBitRate");
        C1274840jHO.LJLJI(Integer.valueOf(i2), "sentFrameRate");
        C1274840jHO.LJLJI(Integer.valueOf(i3), "encoderOutputFrameRate");
        C1274840jHO.LJLJI(Integer.valueOf(i4), "encodedFrameWidth");
        C1274840jHO.LJLJI(Integer.valueOf(i5), "encodedFrameHeight");
        c1274840jHO.getClass();
        C1274840jHO c1274840jHO2 = this.LIZ;
        InterfaceC1274710jHB interfaceC1274710jHB = c1274840jHO2.LJJIII;
        if (interfaceC1274710jHB != null) {
            interfaceC1274710jHB.LIZ(c1274840jHO2, 23, 0L, 0L, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5));
        }
    }

    @Override // com.ss.solution.interact.IInteractNativeListener
    public final void onPerformanceAlarms(int i, int i2, int i3, int i4, int i5) {
        C1274840jHO c1274840jHO = this.LIZ;
        C1274840jHO.LJLJI(Integer.valueOf(i), "mode");
        C1274840jHO.LJLJI(Integer.valueOf(i2), "reason");
        C1274840jHO.LJLJI(Integer.valueOf(i3), "wantedWidth");
        C1274840jHO.LJLJI(Integer.valueOf(i4), "wantedHeight");
        C1274840jHO.LJLJI(Integer.valueOf(i5), "wantedFrameRate");
        c1274840jHO.getClass();
        C1274840jHO c1274840jHO2 = this.LIZ;
        InterfaceC1274710jHB interfaceC1274710jHB = c1274840jHO2.LJJIII;
        if (interfaceC1274710jHB != null) {
            interfaceC1274710jHB.LIZ(c1274840jHO2, 13, 0L, 0L, Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5));
        }
    }

    @Override // com.ss.solution.interact.IInteractNativeListener
    public final void onNetworkDetectionResult(int i, int i2, int i3, double d, int i4, int i5) {
        C1274840jHO c1274840jHO = this.LIZ;
        C1274840jHO.LJLJI(Integer.valueOf(i), "linkType");
        C1274840jHO.LJLJI(Integer.valueOf(i2), "quality");
        C1274840jHO.LJLJI(Integer.valueOf(i3), "rtt");
        C1274840jHO.LJLJI(Double.valueOf(d), "lostRate");
        C1274840jHO.LJLJI(Integer.valueOf(i4), "bitrate");
        C1274840jHO.LJLJI(Integer.valueOf(i5), "jitter");
        c1274840jHO.getClass();
        C1274840jHO c1274840jHO2 = this.LIZ;
        InterfaceC1274710jHB interfaceC1274710jHB = c1274840jHO2.LJJIII;
        if (interfaceC1274710jHB != null) {
            interfaceC1274710jHB.LIZ(c1274840jHO2, 25, 0L, 0L, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Double.valueOf(d), Integer.valueOf(i4), Integer.valueOf(i5));
        }
    }

    @Override // com.ss.solution.interact.IInteractNativeListener
    public final void onRemoteVideoStats(LyraxStreamKey lyraxStreamKey, int i, int i2, int i3, int i4, int i5) {
        C1274840jHO c1274840jHO = this.LIZ;
        C1274840jHO.LJLJI(lyraxStreamKey, "streamKey");
        C1274840jHO.LJLJI(Integer.valueOf(i), "receivedKBitRate");
        C1274840jHO.LJLJI(Integer.valueOf(i2), "decoderOutputFrameRate");
        C1274840jHO.LJLJI(Integer.valueOf(i3), "rendererOutputFrameRate");
        C1274840jHO.LJLJI(Integer.valueOf(i4), "width");
        C1274840jHO.LJLJI(Integer.valueOf(i5), "height");
        c1274840jHO.getClass();
        C1274840jHO c1274840jHO2 = this.LIZ;
        if (c1274840jHO2.LJJIII != null) {
            RemoteStreamStats remoteStreamStatsLJLJJLL = c1274840jHO2.LJLJJLL(lyraxStreamKey);
            RemoteVideoStats remoteVideoStats = remoteStreamStatsLJLJJLL.videoStats;
            remoteVideoStats.receivedKBitrate = i;
            remoteVideoStats.decoderOutputFrameRate = i2;
            remoteVideoStats.rendererOutputFrameRate = i3;
            remoteVideoStats.width = i4;
            remoteVideoStats.height = i5;
            C1274840jHO c1274840jHO3 = this.LIZ;
            c1274840jHO3.LJJIII.LIZ(c1274840jHO3, 1, remoteStreamStatsLJLJJLL.audioStats.jitterBufferDelay, 0L, new Object[0]);
            C1274840jHO c1274840jHO4 = this.LIZ;
            c1274840jHO4.LJJIII.LIZ(c1274840jHO4, 24, 0L, 0L, 0, remoteStreamStatsLJLJJLL);
        }
    }

    @Override // com.ss.solution.interact.IInteractNativeListener
    public final void onStreamMixingEvent(int i, String str, int i2, int i3, String str2, int i4) {
        C1274840jHO c1274840jHO = this.LIZ;
        C1274840jHO.LJLJI(Integer.valueOf(i), "event");
        C1274840jHO.LJLJI(str, "taskId");
        C1274840jHO.LJLJI(Integer.valueOf(i2), "error");
        C1274840jHO.LJLJI(Integer.valueOf(i3), "subErrorCode");
        C1274840jHO.LJLJI(str2, "errorMsg");
        C1274840jHO.LJLJI(Integer.valueOf(i4), "mixType");
        c1274840jHO.getClass();
        C1274840jHO c1274840jHO2 = this.LIZ;
        InterfaceC1274710jHB interfaceC1274710jHB = c1274840jHO2.LJJIII;
        if (interfaceC1274710jHB != null) {
            interfaceC1274710jHB.LIZ(c1274840jHO2, 404, i, 0L, str, Integer.valueOf(i2), Integer.valueOf(i3), str2, Integer.valueOf(i4));
        }
    }

    @Override // com.ss.solution.interact.IInteractNativeListener
    public final void onDidLeaveChannel(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        C1274840jHO c1274840jHO = this.LIZ;
        C1274840jHO.LJLJI(Integer.valueOf(i), "txBytes");
        C1274840jHO.LJLJI(Integer.valueOf(i2), "rxBytes");
        C1274840jHO.LJLJI(Integer.valueOf(i3), "duration");
        C1274840jHO.LJLJI(Integer.valueOf(i4), "txKBitRate");
        C1274840jHO.LJLJI(Integer.valueOf(i5), "rxKBitRate");
        C1274840jHO.LJLJI(Integer.valueOf(i6), "txAudioKBitRate");
        C1274840jHO.LJLJI(Integer.valueOf(i7), "rxAudioKBitRate");
        C1274840jHO.LJLJI(Integer.valueOf(i8), "txVideoKBitRate");
        C1274840jHO.LJLJI(Integer.valueOf(i9), "rxVideoKBitRate");
        c1274840jHO.getClass();
        C1274840jHO c1274840jHO2 = this.LIZ;
        InterfaceC1274710jHB interfaceC1274710jHB = c1274840jHO2.LJJIII;
        if (interfaceC1274710jHB != null) {
            interfaceC1274710jHB.LIZ(c1274840jHO2, 5, 0L, 0L, new Object[0]);
        }
    }
}
