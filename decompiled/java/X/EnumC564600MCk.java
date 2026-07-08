package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0MCk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class EnumC564600MCk {
    public static final EnumC564600MCk DEFAULT_MIX;
    public static final EnumC564600MCk GPT;
    public static final /* synthetic */ EnumC564600MCk[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC564600MCk PRESET;
    public final int LL;

    public static InterfaceC2044707zh<EnumC564600MCk> getEntries() {
        return LLILLL;
    }

    static {
        EnumC564600MCk enumC564600MCk = new EnumC564600MCk("DEFAULT_MIX", 0, 0);
        DEFAULT_MIX = enumC564600MCk;
        EnumC564600MCk enumC564600MCk2 = new EnumC564600MCk("PRESET", 1, 1);
        PRESET = enumC564600MCk2;
        EnumC564600MCk enumC564600MCk3 = new EnumC564600MCk("GPT", 2, 2);
        GPT = enumC564600MCk3;
        EnumC564600MCk[] enumC564600MCkArr = {enumC564600MCk, enumC564600MCk2, enumC564600MCk3};
        LLILLJJLI = enumC564600MCkArr;
        LLILLL = new C2254308sP(enumC564600MCkArr);
    }

    public static EnumC564600MCk[] values() {
        return (EnumC564600MCk[]) LLILLJJLI.clone();
    }

    public final int getSource() {
        return this.LL;
    }

    public static EnumC564600MCk valueOf(String str) {
        return (EnumC564600MCk) C08FF.LIZ(EnumC564600MCk.class, str);
    }

    public EnumC564600MCk(String str, int i, int i2) {
        this.LL = i2;
    }
}
