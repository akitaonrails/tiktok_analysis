package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0S8n, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class EnumC716470S8n {
    public static final EnumC716470S8n ERROR_FULL_FETCH;
    public static final EnumC716470S8n ERROR_PAYWALL;
    public static final /* synthetic */ EnumC716470S8n[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC716470S8n LOADED;
    public static final EnumC716470S8n LOADING;

    public static InterfaceC2044707zh<EnumC716470S8n> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC716470S8n enumC716470S8n = new EnumC716470S8n("LOADING", 0);
        LOADING = enumC716470S8n;
        EnumC716470S8n enumC716470S8n2 = new EnumC716470S8n("LOADED", 1);
        LOADED = enumC716470S8n2;
        EnumC716470S8n enumC716470S8n3 = new EnumC716470S8n("ERROR_PAYWALL", 2);
        ERROR_PAYWALL = enumC716470S8n3;
        EnumC716470S8n enumC716470S8n4 = new EnumC716470S8n("ERROR_FULL_FETCH", 3);
        ERROR_FULL_FETCH = enumC716470S8n4;
        EnumC716470S8n[] enumC716470S8nArr = {enumC716470S8n, enumC716470S8n2, enumC716470S8n3, enumC716470S8n4};
        LL = enumC716470S8nArr;
        LLILLJJLI = new C2254308sP(enumC716470S8nArr);
    }

    public static EnumC716470S8n[] values() {
        return (EnumC716470S8n[]) LL.clone();
    }

    public static EnumC716470S8n valueOf(String str) {
        return (EnumC716470S8n) C08FF.LIZ(EnumC716470S8n.class, str);
    }

    public EnumC716470S8n(String str, int i) {
    }
}
