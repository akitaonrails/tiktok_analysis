package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0bwy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class EnumC993100bwy {
    public static final EnumC993100bwy LAYOUT_ON;
    public static final /* synthetic */ EnumC993100bwy[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC993100bwy PROP_ON;

    public static InterfaceC2044707zh<EnumC993100bwy> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC993100bwy enumC993100bwy = new EnumC993100bwy("PROP_ON", 0);
        PROP_ON = enumC993100bwy;
        EnumC993100bwy enumC993100bwy2 = new EnumC993100bwy("LAYOUT_ON", 1);
        LAYOUT_ON = enumC993100bwy2;
        EnumC993100bwy[] enumC993100bwyArr = {enumC993100bwy, enumC993100bwy2};
        LL = enumC993100bwyArr;
        LLILLJJLI = new C2254308sP(enumC993100bwyArr);
    }

    public static EnumC993100bwy[] values() {
        return (EnumC993100bwy[]) LL.clone();
    }

    public static EnumC993100bwy valueOf(String str) {
        return (EnumC993100bwy) C08FF.LIZ(EnumC993100bwy.class, str);
    }

    public EnumC993100bwy(String str, int i) {
    }
}
