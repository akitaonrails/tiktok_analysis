package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0bwb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class EnumC992870bwb {
    public static final /* synthetic */ EnumC992870bwb[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC992870bwb ONE_ITEM_NO_SCROLL;
    public static final EnumC992870bwb THREE_HALF_ITEMS_SCROLL;
    public static final EnumC992870bwb TWO_HALF_ITEMS_SCROLL;
    public final float LL;

    public static InterfaceC2044707zh<EnumC992870bwb> getEntries() {
        return LLILLL;
    }

    static {
        EnumC992870bwb enumC992870bwb = new EnumC992870bwb(1.0f, "ONE_ITEM_NO_SCROLL", 0);
        ONE_ITEM_NO_SCROLL = enumC992870bwb;
        EnumC992870bwb enumC992870bwb2 = new EnumC992870bwb(2.5f, "TWO_HALF_ITEMS_SCROLL", 1);
        TWO_HALF_ITEMS_SCROLL = enumC992870bwb2;
        EnumC992870bwb enumC992870bwb3 = new EnumC992870bwb(3.5f, "THREE_HALF_ITEMS_SCROLL", 2);
        THREE_HALF_ITEMS_SCROLL = enumC992870bwb3;
        EnumC992870bwb[] enumC992870bwbArr = {enumC992870bwb, enumC992870bwb2, enumC992870bwb3};
        LLILLJJLI = enumC992870bwbArr;
        LLILLL = new C2254308sP(enumC992870bwbArr);
    }

    public static EnumC992870bwb[] values() {
        return (EnumC992870bwb[]) LLILLJJLI.clone();
    }

    public final float getValue() {
        return this.LL;
    }

    public static EnumC992870bwb valueOf(String str) {
        return (EnumC992870bwb) C08FF.LIZ(EnumC992870bwb.class, str);
    }

    public EnumC992870bwb(float f, String str, int i) {
        this.LL = f;
    }
}
