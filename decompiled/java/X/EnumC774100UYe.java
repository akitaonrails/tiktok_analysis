package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0UYe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class EnumC774100UYe {
    public static final EnumC774100UYe ALOG_REPORT_BLOCK;
    public static final EnumC774100UYe APM_REPORT_BLOCK;
    public static final EnumC774100UYe BRIGHTNESS_DOWNGRADE;
    public static final EnumC774100UYe DIALOG_ANIMATION_BLOCK;
    public static final /* synthetic */ EnumC774100UYe[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC774100UYe SLARDAR_REPORT_BLOCK;
    public final String LL;

    public EnumC774100UYe() {
        throw null;
    }

    public static InterfaceC2044707zh<EnumC774100UYe> getEntries() {
        return LLILLL;
    }

    static {
        EnumC774100UYe enumC774100UYe = new EnumC774100UYe("ALOG_REPORT_BLOCK", 0, "alog_report_block");
        ALOG_REPORT_BLOCK = enumC774100UYe;
        EnumC774100UYe enumC774100UYe2 = new EnumC774100UYe("SLARDAR_REPORT_BLOCK", 1, "slardar_report_block");
        SLARDAR_REPORT_BLOCK = enumC774100UYe2;
        EnumC774100UYe enumC774100UYe3 = new EnumC774100UYe("APM_REPORT_BLOCK", 2, "apm_report_block");
        APM_REPORT_BLOCK = enumC774100UYe3;
        EnumC774100UYe enumC774100UYe4 = new EnumC774100UYe("DIALOG_ANIMATION_BLOCK", 3, "dialog_animation_block");
        DIALOG_ANIMATION_BLOCK = enumC774100UYe4;
        EnumC774100UYe enumC774100UYe5 = new EnumC774100UYe("BRIGHTNESS_DOWNGRADE", 4, "base_brightness_heavy_reduce_when_high");
        BRIGHTNESS_DOWNGRADE = enumC774100UYe5;
        EnumC774100UYe[] enumC774100UYeArr = {enumC774100UYe, enumC774100UYe2, enumC774100UYe3, enumC774100UYe4, enumC774100UYe5};
        LLILLJJLI = enumC774100UYeArr;
        LLILLL = new C2254308sP(enumC774100UYeArr);
    }

    public static EnumC774100UYe[] values() {
        return (EnumC774100UYe[]) LLILLJJLI.clone();
    }

    public final String getFeatureName() {
        return this.LL;
    }

    public static EnumC774100UYe valueOf(String str) {
        return (EnumC774100UYe) C08FF.LIZ(EnumC774100UYe.class, str);
    }

    public EnumC774100UYe(String str, int i, String str2) {
        this.LL = str2;
    }
}
