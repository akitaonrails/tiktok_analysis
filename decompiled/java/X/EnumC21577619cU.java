package X;

/* JADX INFO: renamed from: X.19cU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public enum EnumC21577619cU {
    None("None", false, false, false, false, false),
    PullDownToRefresh("PullDownToRefresh", true, false, false, false, false),
    PullUpToLoad("PullUpToLoad", true, false, false, false, false),
    PullDownCanceled("PullDownCanceled", false, false, false, false, false),
    PullUpCanceled("PullUpCanceled", false, false, false, false, false),
    ReleaseToRefresh("ReleaseToRefresh", true, false, false, false, true),
    ReleaseToLoad("ReleaseToLoad", true, false, false, false, true),
    ReleaseToTwoLevel("ReleaseToTwoLevel", true, false, false, true, true),
    TwoLevelReleased("TwoLevelReleased", false, false, false, true, false),
    RefreshReleased("RefreshReleased", false, false, false, false, false),
    LoadReleased("LoadReleased", false, false, false, false, false),
    Refreshing("Refreshing", false, true, false, false, false),
    Loading("Loading", false, true, false, false, false),
    TwoLevel("TwoLevel", false, true, false, true, false),
    RefreshFinish("RefreshFinish", false, false, true, false, false),
    LoadFinish("LoadFinish", false, false, true, false, false),
    TwoLevelFinish("TwoLevelFinish", false, false, true, true, false);

    public final boolean isDragging;
    public final boolean isFinishing;
    public final boolean isFooter;
    public final boolean isHeader;
    public final boolean isOpening;
    public final boolean isReleaseToOpening;
    public final boolean isTwoLevel;

    public EnumC21577619cU toFooter() {
        return (!this.isHeader || this.isTwoLevel) ? this : values()[ordinal() + 1];
    }

    public EnumC21577619cU toHeader() {
        return (!this.isFooter || this.isTwoLevel) ? this : values()[ordinal() - 1];
    }

    public static EnumC21577619cU valueOf(String str) {
        return (EnumC21577619cU) C08FF.LIZ(EnumC21577619cU.class, str);
    }

    EnumC21577619cU(String str, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        boolean z6;
        if (i == 1) {
            z6 = true;
        } else {
            z6 = false;
        }
        this.isHeader = z6;
        this.isFooter = i == 2;
        this.isDragging = z;
        this.isOpening = z2;
        this.isFinishing = z3;
        this.isTwoLevel = z4;
        this.isReleaseToOpening = z5;
    }
}
