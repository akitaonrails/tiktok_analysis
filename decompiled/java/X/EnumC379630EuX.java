package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0EuX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class EnumC379630EuX {
    public static final EnumC379630EuX AI_VIDEO_TOOL;
    public static final EnumC379630EuX EDITOR_PRO_AI_CREATE;
    public static final EnumC379630EuX EDITOR_PRO_AI_EXTEND;
    public static final EnumC379630EuX EDITOR_PRO_AI_TRANSITION;
    public static final /* synthetic */ EnumC379630EuX[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC379630EuX MAGIC;
    public static final EnumC379630EuX TEMPLATE;

    public static InterfaceC2044707zh<EnumC379630EuX> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC379630EuX enumC379630EuX = new EnumC379630EuX("EDITOR_PRO_AI_CREATE", 0);
        EDITOR_PRO_AI_CREATE = enumC379630EuX;
        EnumC379630EuX enumC379630EuX2 = new EnumC379630EuX("EDITOR_PRO_AI_EXTEND", 1);
        EDITOR_PRO_AI_EXTEND = enumC379630EuX2;
        EnumC379630EuX enumC379630EuX3 = new EnumC379630EuX("EDITOR_PRO_AI_TRANSITION", 2);
        EDITOR_PRO_AI_TRANSITION = enumC379630EuX3;
        EnumC379630EuX enumC379630EuX4 = new EnumC379630EuX("AI_VIDEO_TOOL", 3);
        AI_VIDEO_TOOL = enumC379630EuX4;
        EnumC379630EuX enumC379630EuX5 = new EnumC379630EuX("MAGIC", 4);
        MAGIC = enumC379630EuX5;
        EnumC379630EuX enumC379630EuX6 = new EnumC379630EuX("TEMPLATE", 5);
        TEMPLATE = enumC379630EuX6;
        EnumC379630EuX[] enumC379630EuXArr = {enumC379630EuX, enumC379630EuX2, enumC379630EuX3, enumC379630EuX4, enumC379630EuX5, enumC379630EuX6};
        LL = enumC379630EuXArr;
        LLILLJJLI = new C2254308sP(enumC379630EuXArr);
    }

    public static EnumC379630EuX[] values() {
        return (EnumC379630EuX[]) LL.clone();
    }

    public static EnumC379630EuX valueOf(String str) {
        return (EnumC379630EuX) C08FF.LIZ(EnumC379630EuX.class, str);
    }

    public EnumC379630EuX(String str, int i) {
    }
}
