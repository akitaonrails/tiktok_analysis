package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0E6w, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class EnumC359320E6w {
    public static final EnumC359320E6w AI_CREATE;
    public static final EnumC359320E6w AI_EXTEND;
    public static final /* synthetic */ EnumC359320E6w[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final String LL;

    public static InterfaceC2044707zh<EnumC359320E6w> getEntries() {
        return LLILLL;
    }

    static {
        EnumC359320E6w enumC359320E6w = new EnumC359320E6w("AI_EXTEND", 0, "ai_extend");
        AI_EXTEND = enumC359320E6w;
        EnumC359320E6w enumC359320E6w2 = new EnumC359320E6w("AI_CREATE", 1, "ai_create");
        AI_CREATE = enumC359320E6w2;
        EnumC359320E6w[] enumC359320E6wArr = {enumC359320E6w, enumC359320E6w2};
        LLILLJJLI = enumC359320E6wArr;
        LLILLL = new C2254308sP(enumC359320E6wArr);
    }

    public static EnumC359320E6w[] values() {
        return (EnumC359320E6w[]) LLILLJJLI.clone();
    }

    public final String getScenerio() {
        return this.LL;
    }

    public static EnumC359320E6w valueOf(String str) {
        return (EnumC359320E6w) C08FF.LIZ(EnumC359320E6w.class, str);
    }

    public EnumC359320E6w(String str, int i, String str2) {
        this.LL = str2;
    }
}
