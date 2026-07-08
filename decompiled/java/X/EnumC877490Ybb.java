package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Ybb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class EnumC877490Ybb {
    public static final EnumC877490Ybb ALL;
    public static final C877460YbY Companion;
    public static final EnumC877490Ybb HIGHLIGHTS;
    public static final /* synthetic */ EnumC877490Ybb[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC877490Ybb MUTE;
    public static final EnumC877490Ybb UNKNOWN;
    public final String LL;

    public static InterfaceC2044707zh<EnumC877490Ybb> getEntries() {
        return LLILLL;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [X.0YbY] */
    static {
        EnumC877490Ybb enumC877490Ybb = new EnumC877490Ybb("UNKNOWN", 0, CardStruct.IStatusCode.DEFAULT);
        UNKNOWN = enumC877490Ybb;
        EnumC877490Ybb enumC877490Ybb2 = new EnumC877490Ybb("ALL", 1, "1");
        ALL = enumC877490Ybb2;
        EnumC877490Ybb enumC877490Ybb3 = new EnumC877490Ybb("MUTE", 2, "2");
        MUTE = enumC877490Ybb3;
        EnumC877490Ybb enumC877490Ybb4 = new EnumC877490Ybb("HIGHLIGHTS", 3, "3");
        HIGHLIGHTS = enumC877490Ybb4;
        EnumC877490Ybb[] enumC877490YbbArr = {enumC877490Ybb, enumC877490Ybb2, enumC877490Ybb3, enumC877490Ybb4};
        LLILLJJLI = enumC877490YbbArr;
        LLILLL = new C2254308sP(enumC877490YbbArr);
        Companion = new Object() { // from class: X.0YbY
        };
    }

    public static EnumC877490Ybb[] values() {
        return (EnumC877490Ybb[]) LLILLJJLI.clone();
    }

    public final String toMobValue() {
        int i = C877520Ybe.LIZ[ordinal()];
        if (i == 1) {
            return "unknown";
        }
        if (i == 2) {
            return "all";
        }
        if (i == 3) {
            return "highlights";
        }
        if (i == 4) {
            return "mute";
        }
        throw new C1954807lC();
    }

    public final boolean toMute() {
        return this != ALL;
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC877490Ybb valueOf(String str) {
        return (EnumC877490Ybb) C08FF.LIZ(EnumC877490Ybb.class, str);
    }

    public EnumC877490Ybb(String str, int i, String str2) {
        this.LL = str2;
    }
}
