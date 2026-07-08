package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0g9F, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class EnumC1154470g9F {
    public static final EnumC1154470g9F Height;
    public static final /* synthetic */ EnumC1154470g9F[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1154470g9F Width;

    public static InterfaceC2044707zh<EnumC1154470g9F> getEntries() {
        return LLILLJJLI;
    }

    public static EnumC1154470g9F valueOf(String str) {
        return (EnumC1154470g9F) C08FF.LIZ(EnumC1154470g9F.class, str);
    }

    public static EnumC1154470g9F[] values() {
        return (EnumC1154470g9F[]) LL.clone();
    }

    static {
        EnumC1154470g9F enumC1154470g9F = new EnumC1154470g9F("Width", 0);
        Width = enumC1154470g9F;
        EnumC1154470g9F enumC1154470g9F2 = new EnumC1154470g9F("Height", 1);
        Height = enumC1154470g9F2;
        EnumC1154470g9F[] enumC1154470g9FArr = {enumC1154470g9F, enumC1154470g9F2};
        LL = enumC1154470g9FArr;
        LLILLJJLI = new C2254308sP(enumC1154470g9FArr);
    }

    public EnumC1154470g9F(String str, int i) {
    }
}
