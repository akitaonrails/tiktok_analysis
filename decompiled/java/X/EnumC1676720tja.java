package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0tja, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class EnumC1676720tja {
    public static final /* synthetic */ EnumC1676720tja[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1676720tja PostExit;
    public static final EnumC1676720tja PreEnter;
    public static final EnumC1676720tja Visible;

    public static InterfaceC2044707zh<EnumC1676720tja> getEntries() {
        return LLILLJJLI;
    }

    public static EnumC1676720tja valueOf(String str) {
        return (EnumC1676720tja) C08FF.LIZ(EnumC1676720tja.class, str);
    }

    public static EnumC1676720tja[] values() {
        return (EnumC1676720tja[]) LL.clone();
    }

    static {
        EnumC1676720tja enumC1676720tja = new EnumC1676720tja("PreEnter", 0);
        PreEnter = enumC1676720tja;
        EnumC1676720tja enumC1676720tja2 = new EnumC1676720tja("Visible", 1);
        Visible = enumC1676720tja2;
        EnumC1676720tja enumC1676720tja3 = new EnumC1676720tja("PostExit", 2);
        PostExit = enumC1676720tja3;
        EnumC1676720tja[] enumC1676720tjaArr = {enumC1676720tja, enumC1676720tja2, enumC1676720tja3};
        LL = enumC1676720tjaArr;
        LLILLJJLI = new C2254308sP(enumC1676720tjaArr);
    }

    public EnumC1676720tja(String str, int i) {
    }
}
