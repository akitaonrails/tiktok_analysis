package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0bz0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class EnumC994360bz0 {
    public static final /* synthetic */ EnumC994360bz0[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC994360bz0 MULTI_IMAGE;
    public static final EnumC994360bz0 VIDEO_EDIT;

    public static InterfaceC2044707zh<EnumC994360bz0> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC994360bz0 enumC994360bz0 = new EnumC994360bz0("MULTI_IMAGE", 0);
        MULTI_IMAGE = enumC994360bz0;
        EnumC994360bz0 enumC994360bz02 = new EnumC994360bz0("VIDEO_EDIT", 1);
        VIDEO_EDIT = enumC994360bz02;
        EnumC994360bz0[] enumC994360bz0Arr = {enumC994360bz0, enumC994360bz02};
        LL = enumC994360bz0Arr;
        LLILLJJLI = new C2254308sP(enumC994360bz0Arr);
    }

    public static EnumC994360bz0[] values() {
        return (EnumC994360bz0[]) LL.clone();
    }

    public static EnumC994360bz0 valueOf(String str) {
        return (EnumC994360bz0) C08FF.LIZ(EnumC994360bz0.class, str);
    }

    public EnumC994360bz0(String str, int i) {
    }
}
