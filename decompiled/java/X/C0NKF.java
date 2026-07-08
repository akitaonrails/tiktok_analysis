package X;

/* JADX INFO: renamed from: X.0NKF, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public enum C0NKF {
    VideoCache("com.ss.android.ugc.aweme.video.preload.VideoCachePreloader", "cache"),
    MediaLoader("com.ss.android.ugc.aweme.video.preload.enginepreloader.EnginePreloader", "cachev2");

    public final String LL;
    public final String LLILLJJLI;

    public String getCacheDirName() {
        return this.LLILLJJLI;
    }

    public String getType() {
        return this.LL;
    }

    public static C0NKF valueOf(String str) {
        return (C0NKF) C08FF.LIZ(C0NKF.class, str);
    }

    C0NKF(String str, String str2) {
        this.LL = str;
        this.LLILLJJLI = str2;
    }
}
