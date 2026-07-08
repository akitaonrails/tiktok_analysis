package X;

import java.util.List;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0rJz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class EnumC1583970rJz {
    public static final /* synthetic */ EnumC1583970rJz[] LLILLL;
    public static final /* synthetic */ C2254308sP LLILZ;
    public static final EnumC1583970rJz RIGHT;
    public static final EnumC1583970rJz SECOND_RIGHT;
    public static final EnumC1583970rJz X_TAB;
    public final int LL;
    public final List<String> LLILLJJLI;

    public static InterfaceC2044707zh<EnumC1583970rJz> getEntries() {
        return LLILZ;
    }

    static {
        InterfaceC475400Ikc.LIZ.getClass();
        EnumC1583970rJz enumC1583970rJz = new EnumC1583970rJz("X_TAB", 0, 0, C1583980rK0.LIZLLL);
        X_TAB = enumC1583970rJz;
        EnumC1583970rJz enumC1583970rJz2 = new EnumC1583970rJz("SECOND_RIGHT", 1, 1, C1583980rK0.LIZJ);
        SECOND_RIGHT = enumC1583970rJz2;
        EnumC1583970rJz enumC1583970rJz3 = new EnumC1583970rJz("RIGHT", 2, 2, C1583980rK0.LIZIZ);
        RIGHT = enumC1583970rJz3;
        EnumC1583970rJz[] enumC1583970rJzArr = {enumC1583970rJz, enumC1583970rJz2, enumC1583970rJz3};
        LLILLL = enumC1583970rJzArr;
        LLILZ = new C2254308sP(enumC1583970rJzArr);
    }

    public static EnumC1583970rJz[] values() {
        return (EnumC1583970rJz[]) LLILLL.clone();
    }

    public final int getIndex() {
        return this.LL;
    }

    public final List<String> getPriorityList() {
        return this.LLILLJJLI;
    }

    public static EnumC1583970rJz valueOf(String str) {
        return (EnumC1583970rJz) C08FF.LIZ(EnumC1583970rJz.class, str);
    }

    public EnumC1583970rJz(String str, int i, int i2, List list) {
        this.LL = i2;
        this.LLILLJJLI = list;
    }
}
