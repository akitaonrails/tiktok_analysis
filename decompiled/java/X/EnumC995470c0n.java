package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0c0n, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class EnumC995470c0n {
    public static final /* synthetic */ EnumC995470c0n[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC995470c0n Max;
    public static final EnumC995470c0n Min;

    public static InterfaceC2044707zh<EnumC995470c0n> getEntries() {
        return LLILLJJLI;
    }

    public static EnumC995470c0n valueOf(String str) {
        return (EnumC995470c0n) C08FF.LIZ(EnumC995470c0n.class, str);
    }

    public static EnumC995470c0n[] values() {
        return (EnumC995470c0n[]) LL.clone();
    }

    static {
        EnumC995470c0n enumC995470c0n = new EnumC995470c0n("Min", 0);
        Min = enumC995470c0n;
        EnumC995470c0n enumC995470c0n2 = new EnumC995470c0n("Max", 1);
        Max = enumC995470c0n2;
        EnumC995470c0n[] enumC995470c0nArr = {enumC995470c0n, enumC995470c0n2};
        LL = enumC995470c0nArr;
        LLILLJJLI = new C2254308sP(enumC995470c0nArr);
    }

    public EnumC995470c0n(String str, int i) {
    }
}
