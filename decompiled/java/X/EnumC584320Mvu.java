package X;

/* JADX INFO: renamed from: X.0Mvu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public enum EnumC584320Mvu {
    DataCenterEventVoDFeedIndexUpdate(1),
    DataCenterEventVoDIOStateUpdate(2),
    DataCenterEventVoDIOSceneSwitch(3),
    DataCenterEventLiveIOStateUpdate(10000),
    DataCenterEventLiveFirstFrameRendered(10001),
    DataCenterEventAppCustomEvent(20000),
    DataCenterEventUpdateCurrentAwemeId(20001);

    public final int LL;

    public int getValue() {
        return this.LL;
    }

    public static EnumC584320Mvu valueOf(String str) {
        return (EnumC584320Mvu) C08FF.LIZ(EnumC584320Mvu.class, str);
    }

    EnumC584320Mvu(int i) {
        this.LL = i;
    }
}
