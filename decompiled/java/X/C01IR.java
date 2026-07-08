package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.01IR, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C01IR {
    public static final C01IR BITMAP;
    public static final /* synthetic */ C01IR[] LL;

    static {
        C01IR c01ir = new C01IR();
        BITMAP = c01ir;
        LL = new C01IR[]{c01ir};
    }

    public static C01IR[] values() {
        return (C01IR[]) LL.clone();
    }

    public static C01IR valueOf(String str) {
        return (C01IR) C08FF.LIZ(C01IR.class, str);
    }
}
