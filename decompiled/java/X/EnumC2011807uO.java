package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.07uO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC2011807uO {
    public static final EnumC2011807uO ANIMATION;
    public static final /* synthetic */ EnumC2011807uO[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final String LL = "ai_i2v";

    public static InterfaceC2044707zh<EnumC2011807uO> getEntries() {
        return LLILLL;
    }

    static {
        EnumC2011807uO enumC2011807uO = new EnumC2011807uO();
        ANIMATION = enumC2011807uO;
        EnumC2011807uO[] enumC2011807uOArr = {enumC2011807uO};
        LLILLJJLI = enumC2011807uOArr;
        LLILLL = new C2254308sP(enumC2011807uOArr);
    }

    public static EnumC2011807uO[] values() {
        return (EnumC2011807uO[]) LLILLJJLI.clone();
    }

    public final String getTypeName() {
        return this.LL;
    }

    public static EnumC2011807uO valueOf(String str) {
        return (EnumC2011807uO) C08FF.LIZ(EnumC2011807uO.class, str);
    }
}
