package com.bytedance.amg.minigameruntime.api;

import X.EnumC1285200jY6;
import X.InterfaceC1631620sYq;
import android.graphics.RectF;
import android.view.Surface;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes21.dex */
public interface IMiniGameRuntimeAPI {

    public interface ExitResultListener {
        void onFailed();

        void onSuccess();
    }

    public interface LaunchResultListener {
        void onFailed(Exception exc);

        void onFirstOnScreenCanvasFrame();

        void onSuccess();
    }

    long addDownStreamSurface(String str, Surface surface, int i, int i2, EnumC1285200jY6 enumC1285200jY6, RectF rectF, int i3);

    void emitJSAPIEvent(String str, JSONObject jSONObject);

    void executeJSScript(String str, String str2);

    String getAndResetPerformanceStatistics();

    String getRemoteKryptonJS();

    void onExit(ExitResultListener exitResultListener);

    void onLaunch(IClientAdapterService iClientAdapterService, LaunchResultListener launchResultListener);

    void onPause(JSONObject jSONObject);

    void onResume(JSONObject jSONObject);

    void postJSAPIResponse(Number number, JSONObject jSONObject);

    String receiveRemoteJSBuffer(byte[] bArr, Function1<? super byte[], Unit> function1);

    String receiveRemoteJSMsg(String str, String str2, int i);

    void refresh(RefreshParams refreshParams);

    void registerABValue(ABSetting aBSetting);

    void registerJSAPI(String str, Function2<? super JSONObject, ? super Integer, ? extends JSONObject> function2, Object obj);

    void registerJSBufferAPI(String str, Function2<? super JSONObject, ? super Integer, byte[]> function2, Object obj);

    void removeDownStreamSurface(String str, long j);

    ScreenShotData screenshot();

    void setRenderFrameCallback(InterfaceC1631620sYq<? super String, ? super Long, ? super Long, Unit> interfaceC1631620sYq);

    public static final class DefaultImpls {
        public static /* synthetic */ void onExit$default(IMiniGameRuntimeAPI iMiniGameRuntimeAPI, ExitResultListener exitResultListener, int i, Object obj) {
            if (obj == null) {
                if ((i & 1) != 0) {
                    exitResultListener = null;
                }
                iMiniGameRuntimeAPI.onExit(exitResultListener);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onExit");
        }

        public static /* synthetic */ void executeJSScript$default(IMiniGameRuntimeAPI iMiniGameRuntimeAPI, String str, String str2, int i, Object obj) {
            if (obj == null) {
                if ((i & 2) != 0) {
                    str2 = null;
                }
                iMiniGameRuntimeAPI.executeJSScript(str, str2);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: executeJSScript");
        }

        public static /* synthetic */ void registerJSAPI$default(IMiniGameRuntimeAPI iMiniGameRuntimeAPI, String str, Function2 function2, Object obj, int i, Object obj2) {
            if (obj2 == null) {
                if ((i & 4) != 0) {
                    obj = null;
                }
                iMiniGameRuntimeAPI.registerJSAPI(str, function2, obj);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: registerJSAPI");
        }

        public static /* synthetic */ void registerJSBufferAPI$default(IMiniGameRuntimeAPI iMiniGameRuntimeAPI, String str, Function2 function2, Object obj, int i, Object obj2) {
            if (obj2 == null) {
                if ((i & 4) != 0) {
                    obj = null;
                }
                iMiniGameRuntimeAPI.registerJSBufferAPI(str, function2, obj);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: registerJSBufferAPI");
        }
    }
}
