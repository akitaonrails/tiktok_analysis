package X;

/* JADX INFO: renamed from: X.09eS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public enum EnumC2422609eS {
    NOT_SO("not_so"),
    X86("x86"),
    ARM("armeabi-v7a"),
    X86_64("x86_64"),
    AARCH64("arm64-v8a"),
    OTHERS("others");

    public final String LL;

    @Override // java.lang.Enum
    public String toString() {
        return this.LL;
    }

    EnumC2422609eS(String str) {
        this.LL = str;
    }
}
