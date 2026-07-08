package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.054v, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC12947054v {
    public static final EnumC12947054v CHILD_ACTIVITY;
    public static final EnumC12947054v EXPANDED_PDP_SHEET;
    public static final /* synthetic */ EnumC12947054v[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC12947054v ONE_STEP_ACTIVITY;

    public static InterfaceC2044707zh<EnumC12947054v> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC12947054v enumC12947054v = new EnumC12947054v("EXPANDED_PDP_SHEET", 0);
        EXPANDED_PDP_SHEET = enumC12947054v;
        EnumC12947054v enumC12947054v2 = new EnumC12947054v("CHILD_ACTIVITY", 1);
        CHILD_ACTIVITY = enumC12947054v2;
        EnumC12947054v enumC12947054v3 = new EnumC12947054v("ONE_STEP_ACTIVITY", 2);
        ONE_STEP_ACTIVITY = enumC12947054v3;
        EnumC12947054v[] enumC12947054vArr = {enumC12947054v, enumC12947054v2, enumC12947054v3};
        LL = enumC12947054vArr;
        LLILLJJLI = new C2254308sP(enumC12947054vArr);
    }

    public static EnumC12947054v[] values() {
        return (EnumC12947054v[]) LL.clone();
    }

    public static EnumC12947054v valueOf(String str) {
        return (EnumC12947054v) C08FF.LIZ(EnumC12947054v.class, str);
    }

    public EnumC12947054v(String str, int i) {
    }
}
