package com.bytedance.amg.minigameruntime.nativebridge.api;

import X.C09BH;
import X.C0VSJ;
import X.C0WZX;
import X.C1284660jXE;
import X.C1285100jXw;
import X.C1285520jYc;
import X.C1285530jYd;
import X.C1285540jYe;
import X.C1285550jYf;
import X.C1304170k2h;
import X.C1304180k2i;
import X.C1304190k2j;
import X.C13LP;
import X.C2188811AlT;
import X.C2204961BRm;
import X.C2220181Buy;
import X.C2220191Buz;
import X.C244700x3;
import X.C786410Ut5;
import X.InterfaceC1304230k2n;
import android.app.Application;
import android.graphics.Rect;
import android.os.SystemClock;
import android.util.DisplayMetrics;
import android.view.Surface;
import android.view.WindowManager;
import com.bytedance.amg.minigameruntime.api.GameDirectoryConfig;
import com.bytedance.amg.minigameruntime.api.IClientAdapterService;
import com.bytedance.amg.minigameruntime.api.IClientLogger;
import com.bytedance.amg.minigameruntime.api.IMiniGameRuntimeAPI;
import com.bytedance.amg.minigameruntime.api.InitParams;
import com.bytedance.amg.minigameruntime.api.MiniGameRuntimeManager;
import com.bytedance.amg.minigameruntime.nativebridge.api.MiniGameRuntimeBridge;
import com.bytedance.librarian.Librarian;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.lynx.canvas.player.PlayerContext;
import com.ss.android.ugc.aweme.lancet.LoadSoLancet;
import defpackage.a2;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.text.Charsets;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes21.dex */
public final class MiniGameRuntimeBridge {
    public final MiniGameRuntimeBridgeConfig LIZ;
    public IMiniGameRuntimeAPI LIZIZ;
    public long LIZJ;
    public int LIZLLL;
    public int LJ;
    public final C1285100jXw LJFF;
    public AtomicBoolean isSuccessLaunch;
    public static final Companion Companion = new Companion();
    public static final AtomicBoolean isEffectLibraryLoaded = new AtomicBoolean(false);
    public static final Object effectLibraryLoadLock = new Object();

    public static final class Companion {
        public final boolean ensureEffectLibraryLoaded() {
            AtomicBoolean atomicBoolean = MiniGameRuntimeBridge.isEffectLibraryLoaded;
            boolean z = true;
            if (atomicBoolean.get()) {
                return true;
            }
            synchronized (MiniGameRuntimeBridge.effectLibraryLoadLock) {
                try {
                    if (atomicBoolean.get()) {
                        return true;
                    }
                    try {
                        try {
                            INVOKESTATIC_com_bytedance_amg_minigameruntime_nativebridge_api_MiniGameRuntimeBridge$Companion_com_ss_android_ugc_aweme_lancet_LoadSoLancet_loadLibrary("effect");
                            atomicBoolean.set(true);
                        } catch (UnsatisfiedLinkError e) {
                            TryCatchGuardChecker.doCheck(e);
                            e.getMessage();
                            z = false;
                            return z;
                        }
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        th.getMessage();
                        z = false;
                        return z;
                    }
                    return z;
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                    throw th2;
                }
            }
        }

        public static void INVOKESTATIC_com_bytedance_amg_minigameruntime_nativebridge_api_MiniGameRuntimeBridge$Companion_com_ss_android_ugc_aweme_lancet_LoadSoLancet_loadLibrary(String str) {
            LoadSoLancet.LIZJ(str);
            long jUptimeMillis = SystemClock.uptimeMillis();
            Librarian.LJFF(str);
            LoadSoLancet.LJ(jUptimeMillis, str);
            LoadSoLancet.LIZLLL(jUptimeMillis, str);
            LoadSoLancet.LIZIZ(str);
        }
    }

    /* JADX INFO: renamed from: com.bytedance.amg.minigameruntime.nativebridge.api.MiniGameRuntimeBridge$exit$1, reason: invalid class name */
    public final class AnonymousClass1 implements IMiniGameRuntimeAPI.ExitResultListener {
        public final /* synthetic */ C1285100jXw LIZ;
        public final /* synthetic */ Function0<Unit> LIZIZ;

        @Override // com.bytedance.amg.minigameruntime.api.IMiniGameRuntimeAPI.ExitResultListener
        public void onFailed() {
            C1285100jXw c1285100jXw = this.LIZ;
            final Function0<Unit> function0 = this.LIZIZ;
            c1285100jXw.LJIILJJIL(new Function0() { // from class: X.0k2l
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return MiniGameRuntimeBridge.AnonymousClass1.lambda$semisugar$onFailed$lambda$1$0(function0);
                }
            });
        }

        @Override // com.bytedance.amg.minigameruntime.api.IMiniGameRuntimeAPI.ExitResultListener
        public void onSuccess() {
            C1285100jXw c1285100jXw = this.LIZ;
            final Function0<Unit> function0 = this.LIZIZ;
            c1285100jXw.LJIILJJIL(new Function0() { // from class: X.0k2m
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return MiniGameRuntimeBridge.AnonymousClass1.lambda$semisugar$onSuccess$lambda$0$0(function0);
                }
            });
        }

        public static Unit lambda$semisugar$onFailed$lambda$1$0(Function0 function0) {
            function0.invoke();
            return Unit.LIZ;
        }

        public static Unit lambda$semisugar$onSuccess$lambda$0$0(Function0 function0) {
            function0.invoke();
            return Unit.LIZ;
        }

        public AnonymousClass1(C1285100jXw c1285100jXw, C1304190k2j c1304190k2j) {
            this.LIZ = c1285100jXw;
            this.LIZIZ = c1304190k2j;
        }
    }

    public final native void amgEmitEventToEffect(int i, String str);

    public final native String amgPullCachedDataFromEffect(String str);

    public final native ByteBuffer amgReadSharedDataBufferByIndex(int i);

    public final native long amgReadSharedDataState();

    public final native void amgSendCachedDataToEffect(String str, String str2);

    /* JADX WARN: Type inference failed for: r1v2, types: [X.0k2j] */
    public final void exit() {
        this.LIZJ = 0L;
        C244700x3.LIZJ = false;
        IMiniGameRuntimeAPI iMiniGameRuntimeAPI = this.LIZIZ;
        C1285100jXw c1285100jXw = this.LJFF;
        boolean andSet = this.isSuccessLaunch.getAndSet(false);
        this.LIZIZ = null;
        if (iMiniGameRuntimeAPI == null || !andSet) {
            c1285100jXw.LJIILJJIL(null);
            return;
        }
        amgEmitEventToEffect(2147418113, "");
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        final ?? r1 = new Function0() { // from class: X.0k2j
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MiniGameRuntimeBridge.lambda$semisugar$exit$lambda$0$0(atomicBoolean, this);
            }
        };
        try {
            iMiniGameRuntimeAPI.onExit(new AnonymousClass1(c1285100jXw, r1));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            e.getMessage();
            c1285100jXw.LJIILJJIL(new Function0() { // from class: X.0k2k
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return MiniGameRuntimeBridge.lambda$semisugar$exit$lambda$1$0(r1);
                }
            });
        }
    }

    public final void launch() {
        Application app;
        MiniGameRuntimeBridgeConfig miniGameRuntimeBridgeConfig = this.LIZ;
        if (miniGameRuntimeBridgeConfig.isValid() && (app = miniGameRuntimeBridgeConfig.getApp()) != null) {
            C244700x3.LIZJ = true;
            try {
                WindowManager windowManager = (WindowManager) C786410Ut5.G2(app, "window");
                DisplayMetrics displayMetrics = new DisplayMetrics();
                C2204961BRm.LLILZIL(windowManager, new C0WZX("dzBzEgAjS8/YVFkiQFyFazRzjkQWGhg/xMmInCmbDBgXSPDrBHgem064tPQOv3mx8tkRqQ+FeWQ2Xw2iLszOjZAgdf1biHMt", null)).getMetrics(displayMetrics);
                int i = displayMetrics.widthPixels;
                this.LIZLLL = i;
                int i2 = displayMetrics.heightPixels;
                this.LJ = i2;
                int i3 = (int) (1080 / (i / i2));
                C1285100jXw c1285100jXw = this.LJFF;
                miniGameRuntimeBridgeConfig.getGameDirector();
                c1285100jXw.LJIIZILJ(i3);
                InitParams initParams = new InitParams(app);
                initParams.setSDKVersion("2.0.0");
                initParams.setIsDebugLocateJSMode(true);
                this.LIZIZ = MiniGameRuntimeManager.Companion.createMiniGameRuntimeWithCustomView(initParams, this.LJFF);
                this.isSuccessLaunch.set(false);
                final String gameDirector = this.LIZ.getGameDirector();
                if (gameDirector == null) {
                    return;
                }
                final String gameDirector2 = this.LIZ.getGameDirector();
                if (gameDirector2 == null) {
                    gameDirector2 = gameDirector;
                }
                final String gameDirector3 = this.LIZ.getGameDirector();
                if (gameDirector3 == null) {
                    gameDirector3 = gameDirector;
                }
                IClientAdapterService iClientAdapterService = new IClientAdapterService() { // from class: com.bytedance.amg.minigameruntime.nativebridge.api.MiniGameRuntimeBridge$createClientAdapter$1
                    @Override // com.bytedance.amg.minigameruntime.api.IClientAdapterService
                    public boolean checkHttpUrlValidity(String str) {
                        return true;
                    }

                    @Override // com.bytedance.amg.minigameruntime.api.IClientAdapterService
                    public void emitRemoteJSCallBack(Number number, String str) {
                    }

                    @Override // com.bytedance.amg.minigameruntime.api.IClientAdapterService
                    public void emitRemoteJSEvent(String str, String str2) {
                    }

                    @Override // com.bytedance.amg.minigameruntime.api.IClientAdapterService
                    public IClientLogger getAppLogger() {
                        return null;
                    }

                    @Override // com.bytedance.amg.minigameruntime.api.IClientAdapterService
                    public long getFileSizeLimit() {
                        return 104857600L;
                    }

                    @Override // com.bytedance.amg.minigameruntime.api.IClientAdapterService
                    public long getReadSizeLimit() {
                        return 104857600L;
                    }

                    @Override // com.bytedance.amg.minigameruntime.api.IClientAdapterService
                    public boolean isRemoteDebugMode() {
                        return false;
                    }

                    @Override // com.bytedance.amg.minigameruntime.api.IClientAdapterService
                    public void sendRemoteObject(String str, long j, String str2, String str3) {
                    }

                    @Override // com.bytedance.amg.minigameruntime.api.IClientAdapterService
                    public GameDirectoryConfig getGameArchDirectoryConfig() {
                        return new GameDirectoryConfig(gameDirector, -1);
                    }

                    @Override // com.bytedance.amg.minigameruntime.api.IClientAdapterService
                    public GameDirectoryConfig getGameSetupDirectoryConfig() {
                        return new GameDirectoryConfig(gameDirector, -1);
                    }

                    @Override // com.bytedance.amg.minigameruntime.api.IClientAdapterService
                    public GameDirectoryConfig getPluginDirectoryConfig() {
                        return new GameDirectoryConfig(gameDirector, -1);
                    }

                    @Override // com.bytedance.amg.minigameruntime.api.IClientAdapterService
                    public Rect getSafeArea() {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("An operation is not implemented: ");
                        sbLIZ.append("Not yet implemented");
                        throw new C1284660jXE(C2188811AlT.LIZIZ(sbLIZ));
                    }

                    @Override // com.bytedance.amg.minigameruntime.api.IClientAdapterService
                    public int getStatusBarHeight() {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("An operation is not implemented: ");
                        sbLIZ.append("Not yet implemented");
                        throw new C1284660jXE(C2188811AlT.LIZIZ(sbLIZ));
                    }

                    @Override // com.bytedance.amg.minigameruntime.api.IClientAdapterService
                    public GameDirectoryConfig getTempDirectoryConfig() {
                        return new GameDirectoryConfig(gameDirector2, 10485760);
                    }

                    @Override // com.bytedance.amg.minigameruntime.api.IClientAdapterService
                    public GameDirectoryConfig getUserDirectoryConfig() {
                        return new GameDirectoryConfig(gameDirector3, -1);
                    }

                    @Override // com.bytedance.amg.minigameruntime.api.IClientAdapterService
                    public String getAppLanguage() {
                        String strT2 = C786410Ut5.t2(Locale.getDefault());
                        return strT2.length() == 0 ? "en" : strT2;
                    }
                };
                IMiniGameRuntimeAPI iMiniGameRuntimeAPI = this.LIZIZ;
                if (iMiniGameRuntimeAPI != null) {
                    iMiniGameRuntimeAPI.onLaunch(iClientAdapterService, new IMiniGameRuntimeAPI.LaunchResultListener() { // from class: com.bytedance.amg.minigameruntime.nativebridge.api.MiniGameRuntimeBridge.launch.1
                        @Override // com.bytedance.amg.minigameruntime.api.IMiniGameRuntimeAPI.LaunchResultListener
                        public void onSuccess() throws Throwable {
                            MiniGameRuntimeBridge.this.isSuccessLaunch.set(true);
                            MiniGameRuntimeBridge.this.registerReadStringMethod();
                            MiniGameRuntimeBridge.this.loadGame();
                        }

                        @Override // com.bytedance.amg.minigameruntime.api.IMiniGameRuntimeAPI.LaunchResultListener
                        public void onFirstOnScreenCanvasFrame() {
                        }

                        @Override // com.bytedance.amg.minigameruntime.api.IMiniGameRuntimeAPI.LaunchResultListener
                        public void onFailed(Exception exc) {
                            exc.getMessage();
                        }
                    });
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                e.getMessage();
            }
        }
    }

    public final void loadGame() throws Throwable {
        String gameDirector = this.LIZ.getGameDirector();
        if (gameDirector == null) {
            return;
        }
        C0VSJ c0vsj = new C0VSJ(gameDirector + "/" + this.LIZ.getLaunchJSFileName());
        if (c0vsj.exists() && c0vsj.isFile()) {
            String strLJI = C09BH.LJI(c0vsj, Charsets.UTF_8);
            IMiniGameRuntimeAPI iMiniGameRuntimeAPI = this.LIZIZ;
            if (iMiniGameRuntimeAPI != null) {
                iMiniGameRuntimeAPI.executeJSScript(strLJI, "sdk.js");
            }
            IMiniGameRuntimeAPI iMiniGameRuntimeAPI2 = this.LIZIZ;
            if (iMiniGameRuntimeAPI2 != null) {
                IMiniGameRuntimeAPI.DefaultImpls.executeJSScript$default(iMiniGameRuntimeAPI2, "require('game.js')", null, 2, null);
            }
        }
    }

    public final void registerReadStringMethod() {
        IMiniGameRuntimeAPI iMiniGameRuntimeAPI = this.LIZIZ;
        if (iMiniGameRuntimeAPI != null) {
            IMiniGameRuntimeAPI.DefaultImpls.registerJSBufferAPI$default(iMiniGameRuntimeAPI, "amgReadBinarySharedRaw", new C1285520jYc(this), null, 4, null);
        }
        IMiniGameRuntimeAPI iMiniGameRuntimeAPI2 = this.LIZIZ;
        if (iMiniGameRuntimeAPI2 != null) {
            IMiniGameRuntimeAPI.DefaultImpls.registerJSAPI$default(iMiniGameRuntimeAPI2, "emitEventToEffect", new C1285530jYd(this), null, 4, null);
        }
        IMiniGameRuntimeAPI iMiniGameRuntimeAPI3 = this.LIZIZ;
        if (iMiniGameRuntimeAPI3 != null) {
            IMiniGameRuntimeAPI.DefaultImpls.registerJSAPI$default(iMiniGameRuntimeAPI3, "pullCachedDataFromEffect", new C1285540jYe(this), null, 4, null);
        }
        IMiniGameRuntimeAPI iMiniGameRuntimeAPI4 = this.LIZIZ;
        if (iMiniGameRuntimeAPI4 != null) {
            IMiniGameRuntimeAPI.DefaultImpls.registerJSAPI$default(iMiniGameRuntimeAPI4, "sendCachedDataToEffect", new C1285550jYf(this), null, 4, null);
        }
    }

    public final int syncRender() {
        try {
            return this.LJFF.LJIJI();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            e.getMessage();
            return -1;
        }
    }

    public MiniGameRuntimeBridge() {
        Companion.ensureEffectLibraryLoaded();
        this.isSuccessLaunch = new AtomicBoolean(false);
        this.LIZ = new MiniGameRuntimeBridgeConfig();
        this.LJFF = new C1285100jXw();
    }

    public final long getNativeRuntimePtr() {
        return this.LIZJ;
    }

    public final int getRealScreenHeight() {
        return this.LJ;
    }

    public final int getRealScreenWidth() {
        return this.LIZLLL;
    }

    public static Unit lambda$semisugar$exit$lambda$1$0(Function0 function0) {
        function0.invoke();
        return Unit.LIZ;
    }

    public final Surface getAlgoTextureSurface(String str) {
        Surface surface;
        C1304170k2h c1304170k2h;
        synchronized (C1304180k2i.LIZ) {
            LinkedHashSet linkedHashSet = (LinkedHashSet) ((LinkedHashMap) C1304180k2i.LIZIZ).get(str);
            if (linkedHashSet != null && (c1304170k2h = (C1304170k2h) C13LP.LJJLIIIJJIZ(linkedHashSet)) != null) {
                surface = c1304170k2h.LL;
            } else {
                surface = null;
            }
        }
        return surface;
    }

    public final boolean isAlgoTextureTypeActive(String str) {
        boolean z;
        synchronized (C1304180k2i.LIZ) {
            Integer num = (Integer) ((LinkedHashMap) C1304180k2i.LIZJ).get(str);
            z = false;
            if (num != null) {
                if (num.intValue() > 0) {
                    z = true;
                }
            }
        }
        return z;
    }

    public final void registerConfig(MiniGameRuntimeBridgeConfig miniGameRuntimeBridgeConfig) {
        this.LIZ.copyFrom(miniGameRuntimeBridgeConfig);
    }

    public final void setNativeRuntimePtr(long j) {
        this.LIZJ = j;
    }

    public final void setRealScreenHeight(int i) {
        this.LJ = i;
    }

    public final void setRealScreenWidth(int i) {
        this.LIZLLL = i;
    }

    public final void updateFrame(double d) {
        if (this.isSuccessLaunch.get()) {
            this.LJFF.LJIILLIIL.LJ(d);
        }
    }

    public static Unit lambda$semisugar$exit$lambda$0$0(AtomicBoolean atomicBoolean, MiniGameRuntimeBridge miniGameRuntimeBridge) {
        if (atomicBoolean.compareAndSet(false, true)) {
            miniGameRuntimeBridge.amgEmitEventToEffect(2147418114, "");
        }
        return Unit.LIZ;
    }

    public final JSONObject emitEventToEffect(JSONObject jSONObject, Integer num) {
        String strOptString;
        int iOptInt = 0;
        if (jSONObject != null) {
            iOptInt = jSONObject.optInt("eventType", 0);
        }
        String str = "";
        if (jSONObject != null && (strOptString = jSONObject.optString("args", "")) != null) {
            str = strOptString;
        }
        amgEmitEventToEffect(iOptInt, str);
        JSONObject jSONObject2 = new JSONObject();
        C2220181Buy c2220181Buy = C2220181Buy.LIZJ;
        return C2220191Buz.LIZIZ(jSONObject2).LIZ();
    }

    public final void emitEventToMiniGame(int i, String str) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("eventType", i);
        jSONObject.put("args", str);
        IMiniGameRuntimeAPI iMiniGameRuntimeAPI = this.LIZIZ;
        if (iMiniGameRuntimeAPI != null) {
            iMiniGameRuntimeAPI.emitJSAPIEvent("onEffectEvent", jSONObject);
        }
    }

    public final void executeGameJS(String str, String str2) {
        IMiniGameRuntimeAPI iMiniGameRuntimeAPI;
        if (this.isSuccessLaunch.get() && (iMiniGameRuntimeAPI = this.LIZIZ) != null) {
            iMiniGameRuntimeAPI.executeJSScript(str, str2);
        }
    }

    public final JSONObject pullCachedDataFromEffect(JSONObject jSONObject, Integer num) throws JSONException {
        String strOptString;
        String str = "";
        if (jSONObject != null && (strOptString = jSONObject.optString("key", "")) != null) {
            str = strOptString;
        }
        String strAmgPullCachedDataFromEffect = amgPullCachedDataFromEffect(str);
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("value", strAmgPullCachedDataFromEffect);
        C2220181Buy c2220181Buy = C2220181Buy.LIZJ;
        return C2220191Buz.LIZIZ(jSONObject2).LIZ();
    }

    public final byte[] readBinarySharedRaw(JSONObject jSONObject, Integer num) {
        ByteBuffer byteBufferAmgReadSharedDataBufferByIndex;
        long jAmgReadSharedDataState = amgReadSharedDataState();
        long j = jAmgReadSharedDataState >>> 32;
        int i = (int) ((jAmgReadSharedDataState >>> 31) & 1);
        int i2 = (int) (jAmgReadSharedDataState & 2147483647L);
        if (j != 0 && i2 > 0 && (byteBufferAmgReadSharedDataBufferByIndex = amgReadSharedDataBufferByIndex(i)) != null && i2 <= byteBufferAmgReadSharedDataBufferByIndex.capacity()) {
            byte[] bArr = new byte[i2];
            ByteBuffer byteBufferDuplicate = byteBufferAmgReadSharedDataBufferByIndex.duplicate();
            ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
            ByteBuffer byteBufferOrder = byteBufferDuplicate.order(byteOrder);
            byteBufferOrder.position(0);
            byteBufferOrder.limit(i2);
            byteBufferOrder.get(bArr);
            if (j == (amgReadSharedDataState() >>> 32) && i2 >= 16) {
                ByteBuffer byteBufferOrder2 = ByteBuffer.wrap(bArr, 0, 16).order(byteOrder);
                int i3 = byteBufferOrder2.getInt();
                int i4 = byteBufferOrder2.getShort() & 65535;
                byteBufferOrder2.getShort();
                byteBufferOrder2.getInt();
                int i5 = byteBufferOrder2.getInt();
                if (i3 == 1296519984 && i4 == 1 && i5 > 0 && i5 + 16 <= i2) {
                    return bArr;
                }
            }
        }
        return new byte[0];
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x000f A[PHI: r1
      0x000f: PHI (r1v3 java.lang.String) = (r1v0 java.lang.String), (r1v4 java.lang.String) binds: [B:7:0x000d, B:5:0x000a] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final org.json.JSONObject sendCachedDataToEffect(org.json.JSONObject r4, java.lang.Integer r5) {
        /*
            r3 = this;
            java.lang.String r2 = ""
            if (r4 == 0) goto Lc
            java.lang.String r0 = "key"
            java.lang.String r1 = r4.optString(r0, r2)
            if (r1 != 0) goto Lf
        Lc:
            r1 = r2
            if (r4 == 0) goto L18
        Lf:
            java.lang.String r0 = "value"
            java.lang.String r0 = r4.optString(r0, r2)
            if (r0 == 0) goto L18
            r2 = r0
        L18:
            r3.amgSendCachedDataToEffect(r1, r2)
            org.json.JSONObject r1 = new org.json.JSONObject
            r1.<init>()
            X.1Buy r0 = X.C2220181Buy.LIZJ
            X.1Buy r0 = X.C2220191Buz.LIZIZ(r1)
            org.json.JSONObject r0 = r0.LIZ()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.amg.minigameruntime.nativebridge.api.MiniGameRuntimeBridge.sendCachedDataToEffect(org.json.JSONObject, java.lang.Integer):org.json.JSONObject");
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void emitTouchEvent(int i, float f, float f2) throws JSONException {
        a2.b bVar;
        a2.b.Companion.getClass();
        a2.b[] bVarArrValues = a2.b.values();
        int length = bVarArrValues.length;
        int i2 = 0;
        while (true) {
            if (i2 < length) {
                bVar = bVarArrValues[i2];
                if (bVar.getCode() == i) {
                    break;
                } else {
                    i2++;
                }
            } else {
                bVar = a2.b.NONE;
                break;
            }
        }
        String eventName = bVar.getEventName();
        if (eventName == null) {
            return;
        }
        C1285100jXw c1285100jXw = this.LJFF;
        Float fValueOf = Float.valueOf(c1285100jXw.LJI * f);
        Float fValueOf2 = Float.valueOf(c1285100jXw.LJII * f2);
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("identifier", (Object) 0);
        jSONObject2.put("pageX", fValueOf);
        jSONObject2.put("pageY", fValueOf2);
        jSONObject2.put("clientX", fValueOf);
        jSONObject2.put("clientY", fValueOf2);
        jSONObject2.put("force", (Object) 0);
        jSONArray.put(jSONObject2);
        jSONObject.put("touches", jSONArray);
        JSONArray jSONArray2 = new JSONArray();
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("identifier", (Object) 0);
        jSONObject3.put("pageX", fValueOf);
        jSONObject3.put("pageY", fValueOf2);
        jSONObject3.put("clientX", fValueOf);
        jSONObject3.put("clientY", fValueOf2);
        jSONObject3.put("force", (Object) 0);
        jSONArray2.put(jSONObject3);
        jSONObject.put("changedTouches", jSONArray2);
        jSONObject.put("timeStamp", System.currentTimeMillis());
        IMiniGameRuntimeAPI iMiniGameRuntimeAPI = this.LIZIZ;
        if (iMiniGameRuntimeAPI != null) {
            iMiniGameRuntimeAPI.emitJSAPIEvent(eventName, jSONObject);
        }
    }

    public final void setAlgoTextureFrameSize(String str, int i, int i2) {
        InterfaceC1304230k2n interfaceC1304230k2n;
        synchronized (C1304180k2i.LIZ) {
            LinkedHashSet<C1304170k2h> linkedHashSet = (LinkedHashSet) ((LinkedHashMap) C1304180k2i.LIZIZ).get(str);
            if (linkedHashSet != null) {
                for (C1304170k2h c1304170k2h : linkedHashSet) {
                    c1304170k2h.getClass();
                    if (i > 0 && i2 > 0 && (c1304170k2h.LLILZ != i || c1304170k2h.LLILZIL != i2)) {
                        c1304170k2h.LLILZ = i;
                        c1304170k2h.LLILZIL = i2;
                        if (!c1304170k2h.LLILZLL) {
                            c1304170k2h.LLILZLL = true;
                            InterfaceC1304230k2n interfaceC1304230k2n2 = c1304170k2h.LLILLJJLI;
                            if (interfaceC1304230k2n2 != null) {
                                PlayerContext playerContext = (PlayerContext) interfaceC1304230k2n2;
                                playerContext.LJ = true;
                                playerContext.LIZ(0, null);
                            }
                        }
                        if (c1304170k2h.LLILLL && (interfaceC1304230k2n = c1304170k2h.LLILLJJLI) != null) {
                            ((PlayerContext) interfaceC1304230k2n).LIZ(3, null);
                        }
                    }
                }
            }
        }
    }
}
