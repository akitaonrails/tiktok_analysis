package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Ojy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class EnumC627880Ojy {
    public static final EnumC627880Ojy AI_MAGIC;
    public static final EnumC627880Ojy DUET;
    public static final /* synthetic */ EnumC627880Ojy[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<EnumC627880Ojy> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC627880Ojy enumC627880Ojy = new EnumC627880Ojy("DUET", 0);
        DUET = enumC627880Ojy;
        EnumC627880Ojy enumC627880Ojy2 = new EnumC627880Ojy("AI_MAGIC", 1);
        AI_MAGIC = enumC627880Ojy2;
        EnumC627880Ojy[] enumC627880OjyArr = {enumC627880Ojy, enumC627880Ojy2};
        LL = enumC627880OjyArr;
        LLILLJJLI = new C2254308sP(enumC627880OjyArr);
    }

    public static EnumC627880Ojy[] values() {
        return (EnumC627880Ojy[]) LL.clone();
    }

    public static EnumC627880Ojy valueOf(String str) {
        return (EnumC627880Ojy) C08FF.LIZ(EnumC627880Ojy.class, str);
    }

    public EnumC627880Ojy(String str, int i) {
    }
}
