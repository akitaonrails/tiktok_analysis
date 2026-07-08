package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0UJk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class EnumC770260UJk {
    public static final EnumC770260UJk BULLETIN_EDIT;
    public static final EnumC770260UJk EC_BILLBOARD_SLOT;
    public static final /* synthetic */ EnumC770260UJk[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<EnumC770260UJk> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC770260UJk enumC770260UJk = new EnumC770260UJk("BULLETIN_EDIT", 0);
        BULLETIN_EDIT = enumC770260UJk;
        EnumC770260UJk enumC770260UJk2 = new EnumC770260UJk("EC_BILLBOARD_SLOT", 1);
        EC_BILLBOARD_SLOT = enumC770260UJk2;
        EnumC770260UJk[] enumC770260UJkArr = {enumC770260UJk, enumC770260UJk2};
        LL = enumC770260UJkArr;
        LLILLJJLI = new C2254308sP(enumC770260UJkArr);
    }

    public static EnumC770260UJk[] values() {
        return (EnumC770260UJk[]) LL.clone();
    }

    public static EnumC770260UJk valueOf(String str) {
        return (EnumC770260UJk) C08FF.LIZ(EnumC770260UJk.class, str);
    }

    public EnumC770260UJk(String str, int i) {
    }
}
