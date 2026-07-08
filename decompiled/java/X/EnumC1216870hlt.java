package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0hlt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class EnumC1216870hlt {
    public static final EnumC1216870hlt Cover;
    public static final EnumC1216870hlt Dialog;
    public static final /* synthetic */ EnumC1216870hlt[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1216870hlt None;

    public static InterfaceC2044707zh<EnumC1216870hlt> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1216870hlt enumC1216870hlt = new EnumC1216870hlt("None", 0);
        None = enumC1216870hlt;
        EnumC1216870hlt enumC1216870hlt2 = new EnumC1216870hlt("Dialog", 1);
        Dialog = enumC1216870hlt2;
        EnumC1216870hlt enumC1216870hlt3 = new EnumC1216870hlt("Cover", 2);
        Cover = enumC1216870hlt3;
        EnumC1216870hlt[] enumC1216870hltArr = {enumC1216870hlt, enumC1216870hlt2, enumC1216870hlt3};
        LL = enumC1216870hltArr;
        LLILLJJLI = new C2254308sP(enumC1216870hltArr);
    }

    public static EnumC1216870hlt[] values() {
        return (EnumC1216870hlt[]) LL.clone();
    }

    public static EnumC1216870hlt valueOf(String str) {
        return (EnumC1216870hlt) C08FF.LIZ(EnumC1216870hlt.class, str);
    }

    public EnumC1216870hlt(String str, int i) {
    }
}
