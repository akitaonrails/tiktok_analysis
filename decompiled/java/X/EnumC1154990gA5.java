package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0gA5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class EnumC1154990gA5 {
    public static final EnumC1154990gA5 H5_RESOURCE_TIMING;
    public static final EnumC1154990gA5 H5_TIMING;
    public static final /* synthetic */ EnumC1154990gA5[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1154990gA5 RN_TIMING;

    public static InterfaceC2044707zh<EnumC1154990gA5> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1154990gA5 enumC1154990gA5 = new EnumC1154990gA5("RN_TIMING", 0);
        RN_TIMING = enumC1154990gA5;
        EnumC1154990gA5 enumC1154990gA52 = new EnumC1154990gA5("H5_TIMING", 1);
        H5_TIMING = enumC1154990gA52;
        EnumC1154990gA5 enumC1154990gA53 = new EnumC1154990gA5("H5_RESOURCE_TIMING", 2);
        H5_RESOURCE_TIMING = enumC1154990gA53;
        EnumC1154990gA5[] enumC1154990gA5Arr = {enumC1154990gA5, enumC1154990gA52, enumC1154990gA53};
        LL = enumC1154990gA5Arr;
        LLILLJJLI = new C2254308sP(enumC1154990gA5Arr);
    }

    public static EnumC1154990gA5[] values() {
        return (EnumC1154990gA5[]) LL.clone();
    }

    public static EnumC1154990gA5 valueOf(String str) {
        return (EnumC1154990gA5) C08FF.LIZ(EnumC1154990gA5.class, str);
    }

    public EnumC1154990gA5(String str, int i) {
    }
}
