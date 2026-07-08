package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0a6w, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class EnumC922400a6w {
    public static final EnumC922400a6w INROOM_INVITE_PRE_APPROVE;
    public static final /* synthetic */ EnumC922400a6w[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC922400a6w NONE;
    public static final EnumC922400a6w OUTROOM_INVITE_PRE_APPROVE;

    public static InterfaceC2044707zh<EnumC922400a6w> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC922400a6w enumC922400a6w = new EnumC922400a6w("NONE", 0);
        NONE = enumC922400a6w;
        EnumC922400a6w enumC922400a6w2 = new EnumC922400a6w("INROOM_INVITE_PRE_APPROVE", 1);
        INROOM_INVITE_PRE_APPROVE = enumC922400a6w2;
        EnumC922400a6w enumC922400a6w3 = new EnumC922400a6w("OUTROOM_INVITE_PRE_APPROVE", 2);
        OUTROOM_INVITE_PRE_APPROVE = enumC922400a6w3;
        EnumC922400a6w[] enumC922400a6wArr = {enumC922400a6w, enumC922400a6w2, enumC922400a6w3};
        LL = enumC922400a6wArr;
        LLILLJJLI = new C2254308sP(enumC922400a6wArr);
    }

    public static EnumC922400a6w[] values() {
        return (EnumC922400a6w[]) LL.clone();
    }

    public static EnumC922400a6w valueOf(String str) {
        return (EnumC922400a6w) C08FF.LIZ(EnumC922400a6w.class, str);
    }

    public EnumC922400a6w(String str, int i) {
    }
}
