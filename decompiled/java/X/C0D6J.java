package X;

import java.io.Serializable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0D6J, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0D6J implements Serializable {
    public static final C0D6J COMPLETED;
    public static final C0D6K Companion;
    public static final C0D6J FAILED;
    public static final /* synthetic */ C0D6J[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C0D6J NORMAL;
    public static final C0D6J PENDING;
    public final int LL;

    public static InterfaceC2044707zh<C0D6J> getEntries() {
        return LLILLL;
    }

    static {
        C0D6J c0d6j = new C0D6J("FAILED", 0, -1);
        FAILED = c0d6j;
        C0D6J c0d6j2 = new C0D6J("NORMAL", 1, 0);
        NORMAL = c0d6j2;
        C0D6J c0d6j3 = new C0D6J("PENDING", 2, 1);
        PENDING = c0d6j3;
        C0D6J c0d6j4 = new C0D6J("COMPLETED", 3, 2);
        COMPLETED = c0d6j4;
        C0D6J[] c0d6jArr = {c0d6j, c0d6j2, c0d6j3, c0d6j4};
        LLILLJJLI = c0d6jArr;
        LLILLL = new C2254308sP(c0d6jArr);
        Companion = new C0D6K();
    }

    public static C0D6J[] values() {
        return (C0D6J[]) LLILLJJLI.clone();
    }

    public final int getRawValue() {
        return this.LL;
    }

    public static C0D6J valueOf(String str) {
        return (C0D6J) C08FF.LIZ(C0D6J.class, str);
    }

    public C0D6J(String str, int i, int i2) {
        this.LL = i2;
    }
}
