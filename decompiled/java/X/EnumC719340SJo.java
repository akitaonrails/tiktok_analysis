package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0SJo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class EnumC719340SJo {
    public static final /* synthetic */ EnumC719340SJo[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC719340SJo TAG_ATTRIBUTE_END;
    public static final EnumC719340SJo TAG_ATTRIBUTE_NAME;
    public static final EnumC719340SJo TAG_ATTRIBUTE_VALUE;
    public static final EnumC719340SJo TAG_FINISH;
    public static final EnumC719340SJo TAG_INIT;
    public static final EnumC719340SJo TAG_NAME_END;
    public static final EnumC719340SJo TAG_NAME_START;

    public static InterfaceC2044707zh<EnumC719340SJo> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC719340SJo enumC719340SJo = new EnumC719340SJo("TAG_INIT", 0);
        TAG_INIT = enumC719340SJo;
        EnumC719340SJo enumC719340SJo2 = new EnumC719340SJo("TAG_NAME_START", 1);
        TAG_NAME_START = enumC719340SJo2;
        EnumC719340SJo enumC719340SJo3 = new EnumC719340SJo("TAG_NAME_END", 2);
        TAG_NAME_END = enumC719340SJo3;
        EnumC719340SJo enumC719340SJo4 = new EnumC719340SJo("TAG_ATTRIBUTE_NAME", 3);
        TAG_ATTRIBUTE_NAME = enumC719340SJo4;
        EnumC719340SJo enumC719340SJo5 = new EnumC719340SJo("TAG_ATTRIBUTE_VALUE", 4);
        TAG_ATTRIBUTE_VALUE = enumC719340SJo5;
        EnumC719340SJo enumC719340SJo6 = new EnumC719340SJo("TAG_ATTRIBUTE_END", 5);
        TAG_ATTRIBUTE_END = enumC719340SJo6;
        EnumC719340SJo enumC719340SJo7 = new EnumC719340SJo("TAG_FINISH", 6);
        TAG_FINISH = enumC719340SJo7;
        EnumC719340SJo[] enumC719340SJoArr = {enumC719340SJo, enumC719340SJo2, enumC719340SJo3, enumC719340SJo4, enumC719340SJo5, enumC719340SJo6, enumC719340SJo7};
        LL = enumC719340SJoArr;
        LLILLJJLI = new C2254308sP(enumC719340SJoArr);
    }

    public static EnumC719340SJo[] values() {
        return (EnumC719340SJo[]) LL.clone();
    }

    public static EnumC719340SJo valueOf(String str) {
        return (EnumC719340SJo) C08FF.LIZ(EnumC719340SJo.class, str);
    }

    public EnumC719340SJo(String str, int i) {
    }
}
