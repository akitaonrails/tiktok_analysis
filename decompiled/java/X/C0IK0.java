package X;

/* JADX INFO: renamed from: X.0IK0, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public enum C0IK0 {
    BroadcastPreview("live_take_page"),
    BroadcastEnd("live_end_page"),
    WatchLiveEnd("live_watch_end");

    public int crowdStrategy = 1;
    public String enterFrom = "";
    public String enterMethod;

    public static C0IK0 valueOf(String str) {
        return (C0IK0) C08FF.LIZ(C0IK0.class, str);
    }

    C0IK0(String str) {
        this.enterMethod = str;
    }
}
