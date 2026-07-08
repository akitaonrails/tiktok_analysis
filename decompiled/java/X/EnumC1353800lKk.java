package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0lKk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class EnumC1353800lKk {
    public static final EnumC1353800lKk COMMENT;
    public static final /* synthetic */ EnumC1353800lKk[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1353800lKk NONE;
    public static final EnumC1353800lKk REACTION;

    public static InterfaceC2044707zh<EnumC1353800lKk> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1353800lKk enumC1353800lKk = new EnumC1353800lKk("NONE", 0);
        NONE = enumC1353800lKk;
        EnumC1353800lKk enumC1353800lKk2 = new EnumC1353800lKk("COMMENT", 1);
        COMMENT = enumC1353800lKk2;
        EnumC1353800lKk enumC1353800lKk3 = new EnumC1353800lKk("REACTION", 2);
        REACTION = enumC1353800lKk3;
        EnumC1353800lKk[] enumC1353800lKkArr = {enumC1353800lKk, enumC1353800lKk2, enumC1353800lKk3};
        LL = enumC1353800lKkArr;
        LLILLJJLI = new C2254308sP(enumC1353800lKkArr);
    }

    public static EnumC1353800lKk[] values() {
        return (EnumC1353800lKk[]) LL.clone();
    }

    public static EnumC1353800lKk valueOf(String str) {
        return (EnumC1353800lKk) C08FF.LIZ(EnumC1353800lKk.class, str);
    }

    public EnumC1353800lKk(String str, int i) {
    }
}
