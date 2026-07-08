package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0vqm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class EnumC1758060vqm {
    public static final EnumC1758060vqm CACHE;
    public static final /* synthetic */ EnumC1758060vqm[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1758060vqm ONLINE;

    public static InterfaceC2044707zh<EnumC1758060vqm> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1758060vqm enumC1758060vqm = new EnumC1758060vqm("CACHE", 0);
        CACHE = enumC1758060vqm;
        EnumC1758060vqm enumC1758060vqm2 = new EnumC1758060vqm("ONLINE", 1);
        ONLINE = enumC1758060vqm2;
        EnumC1758060vqm[] enumC1758060vqmArr = {enumC1758060vqm, enumC1758060vqm2};
        LL = enumC1758060vqmArr;
        LLILLJJLI = new C2254308sP(enumC1758060vqmArr);
    }

    public static EnumC1758060vqm[] values() {
        return (EnumC1758060vqm[]) LL.clone();
    }

    public static EnumC1758060vqm valueOf(String str) {
        return (EnumC1758060vqm) C08FF.LIZ(EnumC1758060vqm.class, str);
    }

    public EnumC1758060vqm(String str, int i) {
    }
}
