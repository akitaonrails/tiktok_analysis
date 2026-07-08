package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0b7c, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class EnumC961260b7c {
    public static final EnumC961260b7c EXTENSION;
    public static final /* synthetic */ EnumC961260b7c[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC961260b7c SHRINK;

    public static InterfaceC2044707zh<EnumC961260b7c> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC961260b7c enumC961260b7c = new EnumC961260b7c("EXTENSION", 0);
        EXTENSION = enumC961260b7c;
        EnumC961260b7c enumC961260b7c2 = new EnumC961260b7c("SHRINK", 1);
        SHRINK = enumC961260b7c2;
        EnumC961260b7c[] enumC961260b7cArr = {enumC961260b7c, enumC961260b7c2};
        LL = enumC961260b7cArr;
        LLILLJJLI = new C2254308sP(enumC961260b7cArr);
    }

    public static EnumC961260b7c[] values() {
        return (EnumC961260b7c[]) LL.clone();
    }

    public static EnumC961260b7c valueOf(String str) {
        return (EnumC961260b7c) C08FF.LIZ(EnumC961260b7c.class, str);
    }

    public EnumC961260b7c(String str, int i) {
    }
}
