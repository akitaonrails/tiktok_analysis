package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Gsa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class EnumC429380Gsa {
    public static final /* synthetic */ EnumC429380Gsa[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC429380Gsa LOOP;
    public static final EnumC429380Gsa ONCE;

    public static InterfaceC2044707zh<EnumC429380Gsa> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC429380Gsa enumC429380Gsa = new EnumC429380Gsa("ONCE", 0);
        ONCE = enumC429380Gsa;
        EnumC429380Gsa enumC429380Gsa2 = new EnumC429380Gsa("LOOP", 1);
        LOOP = enumC429380Gsa2;
        EnumC429380Gsa[] enumC429380GsaArr = {enumC429380Gsa, enumC429380Gsa2};
        LL = enumC429380GsaArr;
        LLILLJJLI = new C2254308sP(enumC429380GsaArr);
    }

    public static EnumC429380Gsa[] values() {
        return (EnumC429380Gsa[]) LL.clone();
    }

    public static EnumC429380Gsa valueOf(String str) {
        return (EnumC429380Gsa) C08FF.LIZ(EnumC429380Gsa.class, str);
    }

    public EnumC429380Gsa(String str, int i) {
    }
}
