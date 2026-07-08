package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0HxT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class EnumC457890HxT {
    public static final EnumC457890HxT ATTACH;
    public static final EnumC457890HxT CUSTOM_DETACH;
    public static final EnumC457890HxT LIFECYCLE_DETACH;
    public static final /* synthetic */ EnumC457890HxT[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC457890HxT NONE;
    public final boolean LL;

    public static InterfaceC2044707zh<EnumC457890HxT> getEntries() {
        return LLILLL;
    }

    static {
        EnumC457890HxT enumC457890HxT = new EnumC457890HxT("NONE", 0, false);
        NONE = enumC457890HxT;
        EnumC457890HxT enumC457890HxT2 = new EnumC457890HxT("ATTACH", 1, true);
        ATTACH = enumC457890HxT2;
        EnumC457890HxT enumC457890HxT3 = new EnumC457890HxT("LIFECYCLE_DETACH", 2, false);
        LIFECYCLE_DETACH = enumC457890HxT3;
        EnumC457890HxT enumC457890HxT4 = new EnumC457890HxT("CUSTOM_DETACH", 3, false);
        CUSTOM_DETACH = enumC457890HxT4;
        EnumC457890HxT[] enumC457890HxTArr = {enumC457890HxT, enumC457890HxT2, enumC457890HxT3, enumC457890HxT4};
        LLILLJJLI = enumC457890HxTArr;
        LLILLL = new C2254308sP(enumC457890HxTArr);
    }

    public static EnumC457890HxT[] values() {
        return (EnumC457890HxT[]) LLILLJJLI.clone();
    }

    public final boolean isAttach() {
        return this.LL;
    }

    public static EnumC457890HxT valueOf(String str) {
        return (EnumC457890HxT) C08FF.LIZ(EnumC457890HxT.class, str);
    }

    public EnumC457890HxT(String str, int i, boolean z) {
        this.LL = z;
    }
}
