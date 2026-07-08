package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0WXa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class EnumC824760WXa {
    public static final /* synthetic */ EnumC824760WXa[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC824760WXa MONITOR;
    public static final EnumC824760WXa TRACK;

    public static InterfaceC2044707zh<EnumC824760WXa> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC824760WXa enumC824760WXa = new EnumC824760WXa("TRACK", 0);
        TRACK = enumC824760WXa;
        EnumC824760WXa enumC824760WXa2 = new EnumC824760WXa("MONITOR", 1);
        MONITOR = enumC824760WXa2;
        EnumC824760WXa[] enumC824760WXaArr = {enumC824760WXa, enumC824760WXa2};
        LL = enumC824760WXaArr;
        LLILLJJLI = new C2254308sP(enumC824760WXaArr);
    }

    public static EnumC824760WXa[] values() {
        return (EnumC824760WXa[]) LL.clone();
    }

    public static EnumC824760WXa valueOf(String str) {
        return (EnumC824760WXa) C08FF.LIZ(EnumC824760WXa.class, str);
    }

    public EnumC824760WXa(String str, int i) {
    }
}
