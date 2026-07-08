package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Z9j, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class EnumC895050Z9j {
    public static final C895060Z9k Companion;
    public static final /* synthetic */ EnumC895050Z9j[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC895050Z9j NUDGE;
    public static final EnumC895050Z9j NUDGE_BACK;
    public static final EnumC895050Z9j STICKER;
    public static final EnumC895050Z9j STREAK;
    public static final EnumC895050Z9j STREAK_BACK;
    public final String LL;

    public static InterfaceC2044707zh<EnumC895050Z9j> getEntries() {
        return LLILLL;
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [X.0Z9k] */
    static {
        EnumC895050Z9j enumC895050Z9j = new EnumC895050Z9j("STICKER", 0, "sticker");
        STICKER = enumC895050Z9j;
        EnumC895050Z9j enumC895050Z9j2 = new EnumC895050Z9j("NUDGE", 1, "nudge");
        NUDGE = enumC895050Z9j2;
        EnumC895050Z9j enumC895050Z9j3 = new EnumC895050Z9j("NUDGE_BACK", 2, "nudge_back");
        NUDGE_BACK = enumC895050Z9j3;
        EnumC895050Z9j enumC895050Z9j4 = new EnumC895050Z9j("STREAK", 3, "spark");
        STREAK = enumC895050Z9j4;
        EnumC895050Z9j enumC895050Z9j5 = new EnumC895050Z9j("STREAK_BACK", 4, "spark_back");
        STREAK_BACK = enumC895050Z9j5;
        EnumC895050Z9j[] enumC895050Z9jArr = {enumC895050Z9j, enumC895050Z9j2, enumC895050Z9j3, enumC895050Z9j4, enumC895050Z9j5};
        LLILLJJLI = enumC895050Z9jArr;
        LLILLL = new C2254308sP(enumC895050Z9jArr);
        Companion = new Object() { // from class: X.0Z9k
        };
    }

    public static EnumC895050Z9j[] values() {
        return (EnumC895050Z9j[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static final boolean isNudgeType(String str) {
        Companion.getClass();
        for (EnumC895050Z9j enumC895050Z9j : values()) {
            if (Intrinsics.LJFF(enumC895050Z9j.getValue(), str)) {
                return true;
            }
        }
        return false;
    }

    public static EnumC895050Z9j valueOf(String str) {
        return (EnumC895050Z9j) C08FF.LIZ(EnumC895050Z9j.class, str);
    }

    public EnumC895050Z9j(String str, int i, String str2) {
        this.LL = str2;
    }
}
