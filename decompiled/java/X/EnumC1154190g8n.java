package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0g8n, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class EnumC1154190g8n {
    public static final /* synthetic */ EnumC1154190g8n[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1154190g8n REMOVE_BY_COVER;
    public static final EnumC1154190g8n REMOVE_BY_EXPIRED;
    public static final EnumC1154190g8n REMOVE_BY_MEMORY_INSUFFICIENT;
    public static final EnumC1154190g8n REMOVE_BY_OVERLOAD;
    public static final EnumC1154190g8n REMOVE_BY_USER;

    public static InterfaceC2044707zh<EnumC1154190g8n> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1154190g8n enumC1154190g8n = new EnumC1154190g8n("REMOVE_BY_EXPIRED", 0);
        REMOVE_BY_EXPIRED = enumC1154190g8n;
        EnumC1154190g8n enumC1154190g8n2 = new EnumC1154190g8n("REMOVE_BY_OVERLOAD", 1);
        REMOVE_BY_OVERLOAD = enumC1154190g8n2;
        EnumC1154190g8n enumC1154190g8n3 = new EnumC1154190g8n("REMOVE_BY_COVER", 2);
        REMOVE_BY_COVER = enumC1154190g8n3;
        EnumC1154190g8n enumC1154190g8n4 = new EnumC1154190g8n("REMOVE_BY_USER", 3);
        REMOVE_BY_USER = enumC1154190g8n4;
        EnumC1154190g8n enumC1154190g8n5 = new EnumC1154190g8n("REMOVE_BY_MEMORY_INSUFFICIENT", 4);
        REMOVE_BY_MEMORY_INSUFFICIENT = enumC1154190g8n5;
        EnumC1154190g8n[] enumC1154190g8nArr = {enumC1154190g8n, enumC1154190g8n2, enumC1154190g8n3, enumC1154190g8n4, enumC1154190g8n5};
        LL = enumC1154190g8nArr;
        LLILLJJLI = new C2254308sP(enumC1154190g8nArr);
    }

    public static EnumC1154190g8n[] values() {
        return (EnumC1154190g8n[]) LL.clone();
    }

    public static EnumC1154190g8n valueOf(String str) {
        return (EnumC1154190g8n) C08FF.LIZ(EnumC1154190g8n.class, str);
    }

    public EnumC1154190g8n(String str, int i) {
    }
}
