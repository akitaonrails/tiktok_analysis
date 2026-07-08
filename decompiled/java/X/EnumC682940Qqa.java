package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Qqa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class EnumC682940Qqa {
    public static final /* synthetic */ EnumC682940Qqa[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC682940Qqa SCALE_FILL;
    public static final EnumC682940Qqa SCALE_FIX;

    public static InterfaceC2044707zh<EnumC682940Qqa> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC682940Qqa enumC682940Qqa = new EnumC682940Qqa("SCALE_FIX", 0);
        SCALE_FIX = enumC682940Qqa;
        EnumC682940Qqa enumC682940Qqa2 = new EnumC682940Qqa("SCALE_FILL", 1);
        SCALE_FILL = enumC682940Qqa2;
        EnumC682940Qqa[] enumC682940QqaArr = {enumC682940Qqa, enumC682940Qqa2};
        LL = enumC682940QqaArr;
        LLILLJJLI = new C2254308sP(enumC682940QqaArr);
    }

    public static EnumC682940Qqa[] values() {
        return (EnumC682940Qqa[]) LL.clone();
    }

    public static EnumC682940Qqa valueOf(String str) {
        return (EnumC682940Qqa) C08FF.LIZ(EnumC682940Qqa.class, str);
    }

    public EnumC682940Qqa(String str, int i) {
    }
}
