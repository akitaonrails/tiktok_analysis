package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Z2e, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class EnumC893180Z2e {
    public static final /* synthetic */ EnumC893180Z2e[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC893180Z2e POST;
    public static final EnumC893180Z2e STORY;
    public static final EnumC893180Z2e THOUGHT;
    public static final EnumC893180Z2e UNKNOWN;
    public final int LL;

    public static InterfaceC2044707zh<EnumC893180Z2e> getEntries() {
        return LLILLL;
    }

    static {
        EnumC893180Z2e enumC893180Z2e = new EnumC893180Z2e("UNKNOWN", 0, -1);
        UNKNOWN = enumC893180Z2e;
        EnumC893180Z2e enumC893180Z2e2 = new EnumC893180Z2e("POST", 1, 0);
        POST = enumC893180Z2e2;
        EnumC893180Z2e enumC893180Z2e3 = new EnumC893180Z2e("STORY", 2, 1);
        STORY = enumC893180Z2e3;
        EnumC893180Z2e enumC893180Z2e4 = new EnumC893180Z2e("THOUGHT", 3, 2);
        THOUGHT = enumC893180Z2e4;
        EnumC893180Z2e[] enumC893180Z2eArr = {enumC893180Z2e, enumC893180Z2e2, enumC893180Z2e3, enumC893180Z2e4};
        LLILLJJLI = enumC893180Z2eArr;
        LLILLL = new C2254308sP(enumC893180Z2eArr);
    }

    public static EnumC893180Z2e[] values() {
        return (EnumC893180Z2e[]) LLILLJJLI.clone();
    }

    public final int getEventTrackType() {
        return this.LL;
    }

    public static EnumC893180Z2e valueOf(String str) {
        return (EnumC893180Z2e) C08FF.LIZ(EnumC893180Z2e.class, str);
    }

    public EnumC893180Z2e(String str, int i, int i2) {
        this.LL = i2;
    }
}
