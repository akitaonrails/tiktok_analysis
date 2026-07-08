package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0bvb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class EnumC992250bvb {
    public static final EnumC992250bvb ACTIVITY_INITIATE;
    public static final /* synthetic */ EnumC992250bvb[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC992250bvb TRANSIT_TO_EDIT_PAGE;

    public static InterfaceC2044707zh<EnumC992250bvb> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC992250bvb enumC992250bvb = new EnumC992250bvb("ACTIVITY_INITIATE", 0);
        ACTIVITY_INITIATE = enumC992250bvb;
        EnumC992250bvb enumC992250bvb2 = new EnumC992250bvb("TRANSIT_TO_EDIT_PAGE", 1);
        TRANSIT_TO_EDIT_PAGE = enumC992250bvb2;
        EnumC992250bvb[] enumC992250bvbArr = {enumC992250bvb, enumC992250bvb2};
        LL = enumC992250bvbArr;
        LLILLJJLI = new C2254308sP(enumC992250bvbArr);
    }

    public static EnumC992250bvb[] values() {
        return (EnumC992250bvb[]) LL.clone();
    }

    public static EnumC992250bvb valueOf(String str) {
        return (EnumC992250bvb) C08FF.LIZ(EnumC992250bvb.class, str);
    }

    public EnumC992250bvb(String str, int i) {
    }
}
