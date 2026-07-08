package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Mad, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class EnumC571130Mad {
    public static final EnumC571130Mad CHECKLIST_FAILED;
    public static final EnumC571130Mad DISABLED;
    public static final /* synthetic */ EnumC571130Mad[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC571130Mad MATCHED;
    public static final EnumC571130Mad NOT_EVALUATED;

    public static InterfaceC2044707zh<EnumC571130Mad> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC571130Mad enumC571130Mad = new EnumC571130Mad("MATCHED", 0);
        MATCHED = enumC571130Mad;
        EnumC571130Mad enumC571130Mad2 = new EnumC571130Mad("CHECKLIST_FAILED", 1);
        CHECKLIST_FAILED = enumC571130Mad2;
        EnumC571130Mad enumC571130Mad3 = new EnumC571130Mad("DISABLED", 2);
        DISABLED = enumC571130Mad3;
        EnumC571130Mad enumC571130Mad4 = new EnumC571130Mad("NOT_EVALUATED", 3);
        NOT_EVALUATED = enumC571130Mad4;
        EnumC571130Mad[] enumC571130MadArr = {enumC571130Mad, enumC571130Mad2, enumC571130Mad3, enumC571130Mad4};
        LL = enumC571130MadArr;
        LLILLJJLI = new C2254308sP(enumC571130MadArr);
    }

    public static EnumC571130Mad[] values() {
        return (EnumC571130Mad[]) LL.clone();
    }

    public static EnumC571130Mad valueOf(String str) {
        return (EnumC571130Mad) C08FF.LIZ(EnumC571130Mad.class, str);
    }

    public EnumC571130Mad(String str, int i) {
    }
}
