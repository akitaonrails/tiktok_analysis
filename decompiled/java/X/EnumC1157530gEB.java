package X;

import java.io.Serializable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0gEB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class EnumC1157530gEB implements Serializable {
    public static final /* synthetic */ EnumC1157530gEB[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1157530gEB NORMAL_LIST;
    public static final EnumC1157530gEB RE_VISIT;

    public static InterfaceC2044707zh<EnumC1157530gEB> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1157530gEB enumC1157530gEB = new EnumC1157530gEB("RE_VISIT", 0);
        RE_VISIT = enumC1157530gEB;
        EnumC1157530gEB enumC1157530gEB2 = new EnumC1157530gEB("NORMAL_LIST", 1);
        NORMAL_LIST = enumC1157530gEB2;
        EnumC1157530gEB[] enumC1157530gEBArr = {enumC1157530gEB, enumC1157530gEB2};
        LL = enumC1157530gEBArr;
        LLILLJJLI = new C2254308sP(enumC1157530gEBArr);
    }

    public static EnumC1157530gEB[] values() {
        return (EnumC1157530gEB[]) LL.clone();
    }

    public static EnumC1157530gEB valueOf(String str) {
        return (EnumC1157530gEB) C08FF.LIZ(EnumC1157530gEB.class, str);
    }

    public EnumC1157530gEB(String str, int i) {
    }
}
