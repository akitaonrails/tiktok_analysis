package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0g9c, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class EnumC1154700g9c {
    public static final EnumC1154700g9c GECKO;
    public static final /* synthetic */ EnumC1154700g9c[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1154700g9c LOCAL;

    public static InterfaceC2044707zh<EnumC1154700g9c> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1154700g9c enumC1154700g9c = new EnumC1154700g9c("GECKO", 0);
        GECKO = enumC1154700g9c;
        EnumC1154700g9c enumC1154700g9c2 = new EnumC1154700g9c("LOCAL", 1);
        LOCAL = enumC1154700g9c2;
        EnumC1154700g9c[] enumC1154700g9cArr = {enumC1154700g9c, enumC1154700g9c2};
        LL = enumC1154700g9cArr;
        LLILLJJLI = new C2254308sP(enumC1154700g9cArr);
    }

    public static EnumC1154700g9c[] values() {
        return (EnumC1154700g9c[]) LL.clone();
    }

    public static EnumC1154700g9c valueOf(String str) {
        return (EnumC1154700g9c) C08FF.LIZ(EnumC1154700g9c.class, str);
    }

    public EnumC1154700g9c(String str, int i) {
    }
}
