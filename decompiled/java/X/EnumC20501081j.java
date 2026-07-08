package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.081j, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC20501081j {
    public static final EnumC20501081j DISCOVERY;
    public static final /* synthetic */ EnumC20501081j[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final String LL = "discovery";

    public static InterfaceC2044707zh<EnumC20501081j> getEntries() {
        return LLILLL;
    }

    static {
        EnumC20501081j enumC20501081j = new EnumC20501081j();
        DISCOVERY = enumC20501081j;
        EnumC20501081j[] enumC20501081jArr = {enumC20501081j};
        LLILLJJLI = enumC20501081jArr;
        LLILLL = new C2254308sP(enumC20501081jArr);
    }

    public static EnumC20501081j[] values() {
        return (EnumC20501081j[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC20501081j valueOf(String str) {
        return (EnumC20501081j) C08FF.LIZ(EnumC20501081j.class, str);
    }
}
