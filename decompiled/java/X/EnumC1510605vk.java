package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.05vk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC1510605vk {
    public static final EnumC1510605vk CACHE;
    public static final /* synthetic */ EnumC1510605vk[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1510605vk LOCAL;
    public static final EnumC1510605vk NETWORK;

    public static InterfaceC2044707zh<EnumC1510605vk> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1510605vk enumC1510605vk = new EnumC1510605vk("CACHE", 0);
        CACHE = enumC1510605vk;
        EnumC1510605vk enumC1510605vk2 = new EnumC1510605vk("LOCAL", 1);
        LOCAL = enumC1510605vk2;
        EnumC1510605vk enumC1510605vk3 = new EnumC1510605vk("NETWORK", 2);
        NETWORK = enumC1510605vk3;
        EnumC1510605vk[] enumC1510605vkArr = {enumC1510605vk, enumC1510605vk2, enumC1510605vk3};
        LL = enumC1510605vkArr;
        LLILLJJLI = new C2254308sP(enumC1510605vkArr);
    }

    public static EnumC1510605vk[] values() {
        return (EnumC1510605vk[]) LL.clone();
    }

    public static EnumC1510605vk valueOf(String str) {
        return (EnumC1510605vk) C08FF.LIZ(EnumC1510605vk.class, str);
    }

    public EnumC1510605vk(String str, int i) {
    }
}
