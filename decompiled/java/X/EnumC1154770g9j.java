package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0g9j, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class EnumC1154770g9j {
    public static final EnumC1154770g9j EFFECT_PANEL;
    public static final /* synthetic */ EnumC1154770g9j[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1154770g9j RECORD_PANEL;

    public static InterfaceC2044707zh<EnumC1154770g9j> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1154770g9j enumC1154770g9j = new EnumC1154770g9j("EFFECT_PANEL", 0);
        EFFECT_PANEL = enumC1154770g9j;
        EnumC1154770g9j enumC1154770g9j2 = new EnumC1154770g9j("RECORD_PANEL", 1);
        RECORD_PANEL = enumC1154770g9j2;
        EnumC1154770g9j[] enumC1154770g9jArr = {enumC1154770g9j, enumC1154770g9j2};
        LL = enumC1154770g9jArr;
        LLILLJJLI = new C2254308sP(enumC1154770g9jArr);
    }

    public static EnumC1154770g9j[] values() {
        return (EnumC1154770g9j[]) LL.clone();
    }

    public static EnumC1154770g9j valueOf(String str) {
        return (EnumC1154770g9j) C08FF.LIZ(EnumC1154770g9j.class, str);
    }

    public EnumC1154770g9j(String str, int i) {
    }
}
