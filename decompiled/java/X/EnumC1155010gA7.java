package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0gA7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class EnumC1155010gA7 {
    public static final /* synthetic */ EnumC1155010gA7[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1155010gA7 REFRESH_ACTIVITY_STATUS;
    public static final EnumC1155010gA7 REFRESH_ALL;

    public static InterfaceC2044707zh<EnumC1155010gA7> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1155010gA7 enumC1155010gA7 = new EnumC1155010gA7("REFRESH_ALL", 0);
        REFRESH_ALL = enumC1155010gA7;
        EnumC1155010gA7 enumC1155010gA72 = new EnumC1155010gA7("REFRESH_ACTIVITY_STATUS", 1);
        REFRESH_ACTIVITY_STATUS = enumC1155010gA72;
        EnumC1155010gA7[] enumC1155010gA7Arr = {enumC1155010gA7, enumC1155010gA72};
        LL = enumC1155010gA7Arr;
        LLILLJJLI = new C2254308sP(enumC1155010gA7Arr);
    }

    public static EnumC1155010gA7[] values() {
        return (EnumC1155010gA7[]) LL.clone();
    }

    public static EnumC1155010gA7 valueOf(String str) {
        return (EnumC1155010gA7) C08FF.LIZ(EnumC1155010gA7.class, str);
    }

    public EnumC1155010gA7(String str, int i) {
    }
}
