package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0x9c, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class EnumC1808180x9c {
    public static final EnumC1808180x9c EMPTY;
    public static final EnumC1808180x9c FLARE;
    public static final /* synthetic */ EnumC1808180x9c[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1808180x9c MIX;
    public static final EnumC1808180x9c PROMOTE;

    public static InterfaceC2044707zh<EnumC1808180x9c> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1808180x9c enumC1808180x9c = new EnumC1808180x9c("FLARE", 0);
        FLARE = enumC1808180x9c;
        EnumC1808180x9c enumC1808180x9c2 = new EnumC1808180x9c("PROMOTE", 1);
        PROMOTE = enumC1808180x9c2;
        EnumC1808180x9c enumC1808180x9c3 = new EnumC1808180x9c("MIX", 2);
        MIX = enumC1808180x9c3;
        EnumC1808180x9c enumC1808180x9c4 = new EnumC1808180x9c("EMPTY", 3);
        EMPTY = enumC1808180x9c4;
        EnumC1808180x9c[] enumC1808180x9cArr = {enumC1808180x9c, enumC1808180x9c2, enumC1808180x9c3, enumC1808180x9c4};
        LL = enumC1808180x9cArr;
        LLILLJJLI = new C2254308sP(enumC1808180x9cArr);
    }

    public static EnumC1808180x9c[] values() {
        return (EnumC1808180x9c[]) LL.clone();
    }

    public static EnumC1808180x9c valueOf(String str) {
        return (EnumC1808180x9c) C08FF.LIZ(EnumC1808180x9c.class, str);
    }

    public EnumC1808180x9c(String str, int i) {
    }
}
