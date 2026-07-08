package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.056a, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC12978056a {
    public static final /* synthetic */ EnumC12978056a[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC12978056a NO_PERMISSION;
    public static final EnumC12978056a SILENT_MODE;

    public static InterfaceC2044707zh<EnumC12978056a> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC12978056a enumC12978056a = new EnumC12978056a("NO_PERMISSION", 0);
        NO_PERMISSION = enumC12978056a;
        EnumC12978056a enumC12978056a2 = new EnumC12978056a("SILENT_MODE", 1);
        SILENT_MODE = enumC12978056a2;
        EnumC12978056a[] enumC12978056aArr = {enumC12978056a, enumC12978056a2};
        LL = enumC12978056aArr;
        LLILLJJLI = new C2254308sP(enumC12978056aArr);
    }

    public static EnumC12978056a[] values() {
        return (EnumC12978056a[]) LL.clone();
    }

    public static EnumC12978056a valueOf(String str) {
        return (EnumC12978056a) C08FF.LIZ(EnumC12978056a.class, str);
    }

    public EnumC12978056a(String str, int i) {
    }
}
