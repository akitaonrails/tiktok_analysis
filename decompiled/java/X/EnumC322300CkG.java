package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0CkG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class EnumC322300CkG {
    public static final EnumC322300CkG DESELECT_ALL;
    public static final /* synthetic */ EnumC322300CkG[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC322300CkG SELECT_ALL;

    public static InterfaceC2044707zh<EnumC322300CkG> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC322300CkG enumC322300CkG = new EnumC322300CkG("SELECT_ALL", 0);
        SELECT_ALL = enumC322300CkG;
        EnumC322300CkG enumC322300CkG2 = new EnumC322300CkG("DESELECT_ALL", 1);
        DESELECT_ALL = enumC322300CkG2;
        EnumC322300CkG[] enumC322300CkGArr = {enumC322300CkG, enumC322300CkG2};
        LL = enumC322300CkGArr;
        LLILLJJLI = new C2254308sP(enumC322300CkGArr);
    }

    public static EnumC322300CkG[] values() {
        return (EnumC322300CkG[]) LL.clone();
    }

    public static EnumC322300CkG valueOf(String str) {
        return (EnumC322300CkG) C08FF.LIZ(EnumC322300CkG.class, str);
    }

    public EnumC322300CkG(String str, int i) {
    }
}
