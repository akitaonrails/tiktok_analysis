package X;

/* JADX INFO: renamed from: X.1BX4, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
@InterfaceC2206441BXe(name = "startup_provider")
public final class C1BX4 {
    public static void afterOnCreate(C1BXT c1bxt) {
    }

    public static void afterOnAttach(C1BXT c1bxt) {
        int i = C2206611BXv.LIZ[c1bxt.LIZLLL.ordinal()];
        if (i != 1) {
            if (i == 2) {
                c1bxt.LIZ("NpthSecondInitBackgroundTask");
                c1bxt.LIZ("AnrThanosTask");
                c1bxt.LIZ("DeadSystemExceptionTask");
                c1bxt.LIZ("ColdBootInitTask");
                c1bxt.LIZ("InitPushTaskEarlyBackground");
                c1bxt.LIZ("UIInitTaskEarly");
                c1bxt.LIZ("PreloadMDLSoTask");
                c1bxt.LIZ("InitGenoTask");
                c1bxt.LIZ("PreloadStageTaskV1");
                c1bxt.LIZ("SplashAdManagerPreloadTask");
                c1bxt.LIZ("InitAVModuleTask");
                c1bxt.LIZ("FeedPreloadOnAttachTask");
                c1bxt.LIZ("JatoInitTask");
                c1bxt.LIZ("ALogNativeOptTaskBackground");
                c1bxt.LIZ("ClassLoaderPathOptTaskBackground");
                c1bxt.LIZ("WebViewPreInitTask");
                c1bxt.LIZ("ABPreloadTask");
                c1bxt.LIZ("SPKevaPreloadTaskV3");
                c1bxt.LIZ("PreloadColdBootKevaValueTask");
                c1bxt.LIZ("IoPreloadTask");
                c1bxt.LIZ("ZeroVideoViewMonitorTask");
                c1bxt.LIZ("BPEAPreloadTask");
                c1bxt.LIZ("DebugPumbaaTask");
                c1bxt.LIZ("InitHDTTask");
                c1bxt.LIZ("InitBtmSDKTaskSwitch3Background");
                c1bxt.LIZ("AudioSDKABLegoTask");
                c1bxt.LIZ("StoreRegionInitTask");
                c1bxt.LIZ("FeedRequestParamPreloadTask");
                c1bxt.LIZ("MemOptTask");
                c1bxt.LIZ("PreventServerSideCrashes");
                c1bxt.LIZ("MobMainSessionStartTask");
                c1bxt.LIZ("ResIdentifierOptTask");
                return;
            }
            return;
        }
        c1bxt.LIZ("AppStartupRecordTask");
        c1bxt.LIZ("HippoAntiDeteriorationKitTask");
        c1bxt.LIZ("NpthCoreInitTask");
        c1bxt.LIZ("NpthSecondInitMainTask");
        c1bxt.LIZ("AnrThanosEarliestTask");
        c1bxt.LIZ("ScalpelBackgroundRunnableMonitorTask");
        c1bxt.LIZ("DebugPerformanceOptimizeTask");
        c1bxt.LIZ("PushSetupTask");
        c1bxt.LIZ("InitPushTaskEarlyMain");
        c1bxt.LIZ("ArsenalPreloadInitTaskEarly");
        c1bxt.LIZ("SplitCompatInstall");
        c1bxt.LIZ("ClassLoaderPathOptTaskMain");
        c1bxt.LIZ("RejectedExecutionHandler");
        c1bxt.LIZ("TokenResolverInitTask");
        c1bxt.LIZ("InitAdServiceTask");
        c1bxt.LIZ("BindFrescoTask");
        c1bxt.LIZ("InjectWebviewJsTask");
        c1bxt.LIZ("FrescoSoLoadSetterTask");
        c1bxt.LIZ("PreloadWireFieldNoEnumClassTask");
        c1bxt.LIZ("PrimeGlobalVariablesInitTask");
        c1bxt.LIZ("InitBtmSDKTaskSwitch3Main");
        c1bxt.LIZ("InitGodzilla");
        c1bxt.LIZ("InitThreadPoolBlockNumTask");
        c1bxt.LIZ("InitFrescoCoreTask");
        c1bxt.LIZ("InitFakeMainTask");
    }

    public static void core(C1BXT c1bxt) {
        if (C2206611BXv.LIZ[c1bxt.LIZLLL.ordinal()] == 1) {
            c1bxt.LIZ("LibrarianTask");
            c1bxt.LIZ("InitKevaTask");
            c1bxt.LIZ("DebugOptServiceTask");
            c1bxt.LIZ("FlippedTask");
            c1bxt.LIZ("DisableClassVerifyTask");
            c1bxt.LIZ("LessMadviseOptTask");
            c1bxt.LIZ("DepressPreloadTask");
        }
    }

    public static void onAttach(C1BXT c1bxt) {
        int i = C2206611BXv.LIZ[c1bxt.LIZLLL.ordinal()];
        if (i != 1) {
            if (i == 2) {
                c1bxt.LIZ("AsyncInitRewordTask");
                return;
            }
            return;
        }
        c1bxt.LIZ("InjectApplicationTask");
        c1bxt.LIZ("InitABTask");
        c1bxt.LIZ("InitPluggableTask");
        c1bxt.LIZ("AppMonitorTask");
        c1bxt.LIZ("InitPlayerTask");
        c1bxt.LIZ("ColdBootSystemOptTask");
        c1bxt.LIZ("PreloadIOTask");
    }

    public static void onMainActivityFocus(C1BXT c1bxt) {
        if (C2206611BXv.LIZ[c1bxt.LIZLLL.ordinal()] == 2) {
            c1bxt.LIZ("DebugDoolittleWSTask");
            c1bxt.LIZ("AutoMarkerTask");
        }
    }
}
