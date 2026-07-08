package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0wP6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class EnumC1779340wP6 {
    public static final /* synthetic */ EnumC1779340wP6[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1779340wP6 VIDEO_CONTENT_REUSE;
    public static final EnumC1779340wP6 VIDEO_DUET;
    public static final EnumC1779340wP6 VIDEO_VISIBILITY_SELECT;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1779340wP6> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1779340wP6 enumC1779340wP6 = new EnumC1779340wP6("VIDEO_VISIBILITY_SELECT", 0, 0);
        VIDEO_VISIBILITY_SELECT = enumC1779340wP6;
        EnumC1779340wP6 enumC1779340wP62 = new EnumC1779340wP6("VIDEO_DUET", 1, 1);
        VIDEO_DUET = enumC1779340wP62;
        EnumC1779340wP6 enumC1779340wP63 = new EnumC1779340wP6("VIDEO_CONTENT_REUSE", 2, 2);
        VIDEO_CONTENT_REUSE = enumC1779340wP63;
        EnumC1779340wP6[] enumC1779340wP6Arr = {enumC1779340wP6, enumC1779340wP62, enumC1779340wP63};
        LLILLJJLI = enumC1779340wP6Arr;
        LLILLL = new C2254308sP(enumC1779340wP6Arr);
    }

    public static EnumC1779340wP6[] values() {
        return (EnumC1779340wP6[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC1779340wP6 valueOf(String str) {
        return (EnumC1779340wP6) C08FF.LIZ(EnumC1779340wP6.class, str);
    }

    public EnumC1779340wP6(String str, int i, int i2) {
        this.LL = i2;
    }
}
