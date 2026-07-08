package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0P0X, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0P0X {
    public static final C0P0X BIG;
    public static final C0P0Y Companion;
    public static final C0P0X DISABLE;
    public static final C0P0X EXPAND_ICON_WITH_TEXT;
    public static final C0P0X ICON;
    public static final /* synthetic */ C0P0X[] LLILLL;
    public static final /* synthetic */ C2254308sP LLILZ;
    public static final C0P0X ONLY_NAME;
    public static final C0P0X SMALL;
    public static final C0P0X UNKNOWN;
    public final int LL;
    public final String LLILLJJLI;

    public static InterfaceC2044707zh<C0P0X> getEntries() {
        return LLILZ;
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [X.0P0Y] */
    static {
        C0P0X c0p0x = new C0P0X("UNKNOWN", 0, 0, "null");
        UNKNOWN = c0p0x;
        C0P0X c0p0x2 = new C0P0X("BIG", 1, 1, "big");
        BIG = c0p0x2;
        C0P0X c0p0x3 = new C0P0X("SMALL", 2, 2, "small");
        SMALL = c0p0x3;
        C0P0X c0p0x4 = new C0P0X("ONLY_NAME", 3, 3, "only_name");
        ONLY_NAME = c0p0x4;
        C0P0X c0p0x5 = new C0P0X("EXPAND_ICON_WITH_TEXT", 4, -1, "full_dsp_name");
        EXPAND_ICON_WITH_TEXT = c0p0x5;
        C0P0X c0p0x6 = new C0P0X("ICON", 5, -1, "only_icons");
        ICON = c0p0x6;
        C0P0X c0p0x7 = new C0P0X("DISABLE", 6, -1, "disable");
        DISABLE = c0p0x7;
        C0P0X[] c0p0xArr = {c0p0x, c0p0x2, c0p0x3, c0p0x4, c0p0x5, c0p0x6, c0p0x7};
        LLILLL = c0p0xArr;
        LLILZ = new C2254308sP(c0p0xArr);
        Companion = new Object() { // from class: X.0P0Y
            public static C0P0X LIZ(String str) {
                if (str == null) {
                    return C0P0X.UNKNOWN;
                }
                for (C0P0X c0p0x8 : C0P0X.values()) {
                    if (Intrinsics.LJFF(c0p0x8.getEventValue(), str)) {
                        return c0p0x8;
                    }
                }
                return C0P0X.UNKNOWN;
            }
        };
    }

    public static C0P0X[] values() {
        return (C0P0X[]) LLILLL.clone();
    }

    public final String getEventValue() {
        return this.LLILLJJLI;
    }

    public final int getValue() {
        return this.LL;
    }

    public static C0P0X valueOf(String str) {
        return (C0P0X) C08FF.LIZ(C0P0X.class, str);
    }

    public C0P0X(String str, int i, int i2, String str2) {
        this.LL = i2;
        this.LLILLJJLI = str2;
    }
}
