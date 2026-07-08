package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0ht3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class EnumC1221310ht3 {
    public static final EnumC1221310ht3 DISABLE;
    public static final EnumC1221310ht3 GENERATE_MORE;
    public static final EnumC1221310ht3 GENERATING;
    public static final EnumC1221310ht3 HIDE;
    public static final /* synthetic */ EnumC1221310ht3[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1221310ht3 SELECT_PHOTOS_SLOW;

    public static InterfaceC2044707zh<EnumC1221310ht3> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1221310ht3 enumC1221310ht3 = new EnumC1221310ht3("GENERATE_MORE", 0);
        GENERATE_MORE = enumC1221310ht3;
        EnumC1221310ht3 enumC1221310ht32 = new EnumC1221310ht3("GENERATING", 1);
        GENERATING = enumC1221310ht32;
        EnumC1221310ht3 enumC1221310ht33 = new EnumC1221310ht3("SELECT_PHOTOS_SLOW", 2);
        SELECT_PHOTOS_SLOW = enumC1221310ht33;
        EnumC1221310ht3 enumC1221310ht34 = new EnumC1221310ht3("DISABLE", 3);
        DISABLE = enumC1221310ht34;
        EnumC1221310ht3 enumC1221310ht35 = new EnumC1221310ht3("HIDE", 4);
        HIDE = enumC1221310ht35;
        EnumC1221310ht3[] enumC1221310ht3Arr = {enumC1221310ht3, enumC1221310ht32, enumC1221310ht33, enumC1221310ht34, enumC1221310ht35};
        LL = enumC1221310ht3Arr;
        LLILLJJLI = new C2254308sP(enumC1221310ht3Arr);
    }

    public static EnumC1221310ht3[] values() {
        return (EnumC1221310ht3[]) LL.clone();
    }

    public static EnumC1221310ht3 valueOf(String str) {
        return (EnumC1221310ht3) C08FF.LIZ(EnumC1221310ht3.class, str);
    }

    public EnumC1221310ht3(String str, int i) {
    }
}
