package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.10rr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class EnumC19379710rr {
    public static final EnumC19379710rr LIVE_ROOM;
    public static final /* synthetic */ EnumC19379710rr[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC19379710rr PREVIEW;

    public static InterfaceC2044707zh<EnumC19379710rr> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC19379710rr enumC19379710rr = new EnumC19379710rr("LIVE_ROOM", 0);
        LIVE_ROOM = enumC19379710rr;
        EnumC19379710rr enumC19379710rr2 = new EnumC19379710rr("PREVIEW", 1);
        PREVIEW = enumC19379710rr2;
        EnumC19379710rr[] enumC19379710rrArr = {enumC19379710rr, enumC19379710rr2};
        LL = enumC19379710rrArr;
        LLILLJJLI = new C2254308sP(enumC19379710rrArr);
    }

    public static EnumC19379710rr[] values() {
        return (EnumC19379710rr[]) LL.clone();
    }

    public static EnumC19379710rr valueOf(String str) {
        return (EnumC19379710rr) C08FF.LIZ(EnumC19379710rr.class, str);
    }

    public EnumC19379710rr(String str, int i) {
    }
}
