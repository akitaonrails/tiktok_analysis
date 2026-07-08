package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0g7w, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class EnumC1153660g7w {
    public static final /* synthetic */ EnumC1153660g7w[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1153660g7w MUTABLE;
    public static final EnumC1153660g7w STABLE_BY_MESSAGE;
    public static final EnumC1153660g7w STABLE_ON_ROOM;

    public static InterfaceC2044707zh<EnumC1153660g7w> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1153660g7w enumC1153660g7w = new EnumC1153660g7w("MUTABLE", 0);
        MUTABLE = enumC1153660g7w;
        EnumC1153660g7w enumC1153660g7w2 = new EnumC1153660g7w("STABLE_ON_ROOM", 1);
        STABLE_ON_ROOM = enumC1153660g7w2;
        EnumC1153660g7w enumC1153660g7w3 = new EnumC1153660g7w("STABLE_BY_MESSAGE", 2);
        STABLE_BY_MESSAGE = enumC1153660g7w3;
        EnumC1153660g7w[] enumC1153660g7wArr = {enumC1153660g7w, enumC1153660g7w2, enumC1153660g7w3};
        LL = enumC1153660g7wArr;
        LLILLJJLI = new C2254308sP(enumC1153660g7wArr);
    }

    public static EnumC1153660g7w[] values() {
        return (EnumC1153660g7w[]) LL.clone();
    }

    public static EnumC1153660g7w valueOf(String str) {
        return (EnumC1153660g7w) C08FF.LIZ(EnumC1153660g7w.class, str);
    }

    public EnumC1153660g7w(String str, int i) {
    }
}
