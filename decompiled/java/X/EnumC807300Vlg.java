package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Vlg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class EnumC807300Vlg {
    public static final EnumC807300Vlg CREATED;
    public static final EnumC807300Vlg DESTROYED;
    public static final EnumC807300Vlg INVISIBLE;
    public static final /* synthetic */ EnumC807300Vlg[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC807300Vlg UNINITIALIZED;
    public static final EnumC807300Vlg VISIBLE;

    public static InterfaceC2044707zh<EnumC807300Vlg> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC807300Vlg enumC807300Vlg = new EnumC807300Vlg("UNINITIALIZED", 0);
        UNINITIALIZED = enumC807300Vlg;
        EnumC807300Vlg enumC807300Vlg2 = new EnumC807300Vlg("CREATED", 1);
        CREATED = enumC807300Vlg2;
        EnumC807300Vlg enumC807300Vlg3 = new EnumC807300Vlg("VISIBLE", 2);
        VISIBLE = enumC807300Vlg3;
        EnumC807300Vlg enumC807300Vlg4 = new EnumC807300Vlg("INVISIBLE", 3);
        INVISIBLE = enumC807300Vlg4;
        EnumC807300Vlg enumC807300Vlg5 = new EnumC807300Vlg("DESTROYED", 4);
        DESTROYED = enumC807300Vlg5;
        EnumC807300Vlg[] enumC807300VlgArr = {enumC807300Vlg, enumC807300Vlg2, enumC807300Vlg3, enumC807300Vlg4, enumC807300Vlg5};
        LL = enumC807300VlgArr;
        LLILLJJLI = new C2254308sP(enumC807300VlgArr);
    }

    public static EnumC807300Vlg[] values() {
        return (EnumC807300Vlg[]) LL.clone();
    }

    public static EnumC807300Vlg valueOf(String str) {
        return (EnumC807300Vlg) C08FF.LIZ(EnumC807300Vlg.class, str);
    }

    public EnumC807300Vlg(String str, int i) {
    }
}
