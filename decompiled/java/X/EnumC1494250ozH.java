package X;

/* JADX INFO: renamed from: X.0ozH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public enum EnumC1494250ozH {
    ResultNone(0),
    ResultSlaDisabled(100),
    ResultSlaNoSetting(101),
    ResultSlaMoveLineFeature(103),
    ResultSlaInvalidSdkAidHeader(104),
    ResultSlaNoAvailableSetting(105),
    ResultSlaNoAvailableRule(106),
    ResultSlaInvalidRequest(107),
    ResultSlaBaseApiAll(120),
    ResultSlaApiAllUpload(121),
    ResultSlaUrlRegexBlackList(122),
    ResultSlaNoMatchRule(129),
    ResultSlaHitCommonLogType(130),
    ResultSlaApiAllowList(131);

    public final int LL;

    public int getValue() {
        return this.LL;
    }

    public static EnumC1494250ozH valueOf(String str) {
        return (EnumC1494250ozH) C08FF.LIZ(EnumC1494250ozH.class, str);
    }

    EnumC1494250ozH(int i) {
        this.LL = i;
    }
}
