package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.1AsO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class EnumC2193101AsO {
    public static final /* synthetic */ EnumC2193101AsO[] LLILLJJLI;
    public final String LL;

    static {
        EnumC2193101AsO[] enumC2193101AsOArr = {new EnumC2193101AsO("DISLIKE", 0, "dislike"), new EnumC2193101AsO("FLAG", 1, "flag")};
        LLILLJJLI = enumC2193101AsOArr;
        new C2254308sP(enumC2193101AsOArr);
    }

    public static EnumC2193101AsO[] values() {
        return (EnumC2193101AsO[]) LLILLJJLI.clone();
    }

    public static EnumC2193101AsO valueOf(String str) {
        return (EnumC2193101AsO) C08FF.LIZ(EnumC2193101AsO.class, str);
    }

    public EnumC2193101AsO(String str, int i, String str2) {
        this.LL = str2;
    }
}
