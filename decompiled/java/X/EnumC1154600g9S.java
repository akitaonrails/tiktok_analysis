package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0g9S, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class EnumC1154600g9S {
    public static final EnumC1154600g9S AVATAR_AND_NICKNAME_FLOW;
    public static final EnumC1154600g9S AVATAR_ONLY_FLOW;
    public static final /* synthetic */ EnumC1154600g9S[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1154600g9S> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1154600g9S enumC1154600g9S = new EnumC1154600g9S("AVATAR_ONLY_FLOW", 0, 1);
        AVATAR_ONLY_FLOW = enumC1154600g9S;
        EnumC1154600g9S enumC1154600g9S2 = new EnumC1154600g9S("AVATAR_AND_NICKNAME_FLOW", 1, 0);
        AVATAR_AND_NICKNAME_FLOW = enumC1154600g9S2;
        EnumC1154600g9S[] enumC1154600g9SArr = {enumC1154600g9S, enumC1154600g9S2};
        LLILLJJLI = enumC1154600g9SArr;
        LLILLL = new C2254308sP(enumC1154600g9SArr);
    }

    public static EnumC1154600g9S[] values() {
        return (EnumC1154600g9S[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC1154600g9S valueOf(String str) {
        return (EnumC1154600g9S) C08FF.LIZ(EnumC1154600g9S.class, str);
    }

    public EnumC1154600g9S(String str, int i, int i2) {
        this.LL = i2;
    }
}
