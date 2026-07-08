package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.07s0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC1997007s0 {
    public static final EnumC1997007s0 DANMAKU_AUTHOR;
    public static final /* synthetic */ EnumC1997007s0[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1997007s0 VIDEO_AUTHOR;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1997007s0> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1997007s0 enumC1997007s0 = new EnumC1997007s0("DANMAKU_AUTHOR", 0, 1);
        DANMAKU_AUTHOR = enumC1997007s0;
        EnumC1997007s0 enumC1997007s02 = new EnumC1997007s0("VIDEO_AUTHOR", 1, 2);
        VIDEO_AUTHOR = enumC1997007s02;
        EnumC1997007s0[] enumC1997007s0Arr = {enumC1997007s0, enumC1997007s02};
        LLILLJJLI = enumC1997007s0Arr;
        LLILLL = new C2254308sP(enumC1997007s0Arr);
    }

    public static EnumC1997007s0[] values() {
        return (EnumC1997007s0[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC1997007s0 valueOf(String str) {
        return (EnumC1997007s0) C08FF.LIZ(EnumC1997007s0.class, str);
    }

    public EnumC1997007s0(String str, int i, int i2) {
        this.LL = i2;
    }
}
