package X;

/* JADX INFO: renamed from: X.0WSw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C823680WSw extends RuntimeException {
    public C823680WSw(String str) {
        this("Launch Protect Custom Exception", str);
    }

    public C823680WSw(String str, String str2) {
        super(str, new Throwable(str2));
    }
}
