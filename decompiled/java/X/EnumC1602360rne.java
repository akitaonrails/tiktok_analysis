package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0rne, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class EnumC1602360rne {
    public static final EnumC1602360rne FINISH;
    public static final /* synthetic */ EnumC1602360rne[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1602360rne NO_STREAM;
    public static final EnumC1602360rne NR;
    public static final EnumC1602360rne PAUSE;
    public static final EnumC1602360rne ROOM_STATUS_EXTRA;

    public static InterfaceC2044707zh<EnumC1602360rne> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1602360rne enumC1602360rne = new EnumC1602360rne("FINISH", 0);
        FINISH = enumC1602360rne;
        EnumC1602360rne enumC1602360rne2 = new EnumC1602360rne("NR", 1);
        NR = enumC1602360rne2;
        EnumC1602360rne enumC1602360rne3 = new EnumC1602360rne("PAUSE", 2);
        PAUSE = enumC1602360rne3;
        EnumC1602360rne enumC1602360rne4 = new EnumC1602360rne("NO_STREAM", 3);
        NO_STREAM = enumC1602360rne4;
        EnumC1602360rne enumC1602360rne5 = new EnumC1602360rne("ROOM_STATUS_EXTRA", 4);
        ROOM_STATUS_EXTRA = enumC1602360rne5;
        EnumC1602360rne[] enumC1602360rneArr = {enumC1602360rne, enumC1602360rne2, enumC1602360rne3, enumC1602360rne4, enumC1602360rne5};
        LL = enumC1602360rneArr;
        LLILLJJLI = new C2254308sP(enumC1602360rneArr);
    }

    public static EnumC1602360rne[] values() {
        return (EnumC1602360rne[]) LL.clone();
    }

    public static EnumC1602360rne valueOf(String str) {
        return (EnumC1602360rne) C08FF.LIZ(EnumC1602360rne.class, str);
    }

    public final String messageReportType(Long l) {
        String string;
        if (this == ROOM_STATUS_EXTRA) {
            if (l == null || (string = l.toString()) == null) {
                return String.valueOf(ordinal());
            }
            return string;
        }
        return String.valueOf(ordinal());
    }

    public EnumC1602360rne(String str, int i) {
    }
}
