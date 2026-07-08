package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0EkO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class EnumC373340EkO {
    public static final EnumC373340EkO ADD_KEYFRAME;
    public static final /* synthetic */ EnumC373340EkO[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC373340EkO REMOVE_KEYFRAME;

    public static InterfaceC2044707zh<EnumC373340EkO> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC373340EkO enumC373340EkO = new EnumC373340EkO("ADD_KEYFRAME", 0);
        ADD_KEYFRAME = enumC373340EkO;
        EnumC373340EkO enumC373340EkO2 = new EnumC373340EkO("REMOVE_KEYFRAME", 1);
        REMOVE_KEYFRAME = enumC373340EkO2;
        EnumC373340EkO[] enumC373340EkOArr = {enumC373340EkO, enumC373340EkO2};
        LL = enumC373340EkOArr;
        LLILLJJLI = new C2254308sP(enumC373340EkOArr);
    }

    public static EnumC373340EkO[] values() {
        return (EnumC373340EkO[]) LL.clone();
    }

    public static EnumC373340EkO valueOf(String str) {
        return (EnumC373340EkO) C08FF.LIZ(EnumC373340EkO.class, str);
    }

    public EnumC373340EkO(String str, int i) {
    }
}
