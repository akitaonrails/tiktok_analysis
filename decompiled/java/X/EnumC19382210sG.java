package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.10sG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class EnumC19382210sG {
    public static final EnumC19382210sG CREATING;
    public static final /* synthetic */ EnumC19382210sG[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC19382210sG PLAY;
    public static final EnumC19382210sG PLAY_AGAIN;

    public static InterfaceC2044707zh<EnumC19382210sG> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC19382210sG enumC19382210sG = new EnumC19382210sG("CREATING", 0);
        CREATING = enumC19382210sG;
        EnumC19382210sG enumC19382210sG2 = new EnumC19382210sG("PLAY", 1);
        PLAY = enumC19382210sG2;
        EnumC19382210sG enumC19382210sG3 = new EnumC19382210sG("PLAY_AGAIN", 2);
        PLAY_AGAIN = enumC19382210sG3;
        EnumC19382210sG[] enumC19382210sGArr = {enumC19382210sG, enumC19382210sG2, enumC19382210sG3};
        LL = enumC19382210sGArr;
        LLILLJJLI = new C2254308sP(enumC19382210sGArr);
    }

    public static EnumC19382210sG[] values() {
        return (EnumC19382210sG[]) LL.clone();
    }

    public static EnumC19382210sG valueOf(String str) {
        return (EnumC19382210sG) C08FF.LIZ(EnumC19382210sG.class, str);
    }

    public EnumC19382210sG(String str, int i) {
    }
}
