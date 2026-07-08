package X;

import java.io.Serializable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.10g8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class EnumC19307010g8 implements Serializable {
    public static final EnumC19307010g8 BOTTOM;
    public static final /* synthetic */ EnumC19307010g8[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC19307010g8 TOP;

    public static InterfaceC2044707zh<EnumC19307010g8> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC19307010g8 enumC19307010g8 = new EnumC19307010g8("TOP", 0);
        TOP = enumC19307010g8;
        EnumC19307010g8 enumC19307010g82 = new EnumC19307010g8("BOTTOM", 1);
        BOTTOM = enumC19307010g82;
        EnumC19307010g8[] enumC19307010g8Arr = {enumC19307010g8, enumC19307010g82};
        LL = enumC19307010g8Arr;
        LLILLJJLI = new C2254308sP(enumC19307010g8Arr);
    }

    public static EnumC19307010g8[] values() {
        return (EnumC19307010g8[]) LL.clone();
    }

    public static EnumC19307010g8 valueOf(String str) {
        return (EnumC19307010g8) C08FF.LIZ(EnumC19307010g8.class, str);
    }

    public EnumC19307010g8(String str, int i) {
    }
}
