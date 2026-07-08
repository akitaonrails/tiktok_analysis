package X;

/* JADX INFO: renamed from: X.1Bkd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public enum EnumC2213771Bkd {
    TTMStateCodeSuccess,
    TTMCenterInitError,
    TTMCenterInitSuccess,
    TTMSceneInBlackList,
    TTMStrategyCenterInitError,
    TTMSceneGetFromDBError,
    TTMSceneGetDBInitError,
    TTMSceneNotExistLocal,
    TTMSceneGetDBError,
    TTMSceneException,
    TTMSceneNotFoundFromCloud,
    TTMSceneDownloading,
    TTMSceneStrategyInfoIsNullOrEmpty,
    TTMSceneStrategyKeyIsNullOrEmpty,
    TTMSceneStrategyPackageTypeUnKnow,
    TTMSceneStrategyPackageInfoIsNull,
    TTMScenePackageKeyIsNullOrEmpty,
    TTMScenePackageContentIsNullOrEmpty,
    TTMScenePackageContentTypeUnKnown,
    TTMScenePackageContentNativeSaveError,
    TTMScenePackageBindingPackageError,
    TTMSceneBindEventStreamIsNull,
    TTMScenePackageTypeNotMatch,
    SceneUnknownStreamOptionType,
    TTMRunSceneCallBackError,
    TTMRunSceneError,
    TTMRunSceneSuccess;

    public static EnumC2213771Bkd valueOf(String str) {
        return (EnumC2213771Bkd) C08FF.LIZ(EnumC2213771Bkd.class, str);
    }
}
