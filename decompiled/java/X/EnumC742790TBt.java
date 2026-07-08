package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0TBt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class EnumC742790TBt {
    public static final /* synthetic */ EnumC742790TBt[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC742790TBt NOT_INTERESTED_TUTORIAL;
    public static final EnumC742790TBt SWIPE_UP_GUIDE;

    public static InterfaceC2044707zh<EnumC742790TBt> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC742790TBt enumC742790TBt = new EnumC742790TBt("SWIPE_UP_GUIDE", 0);
        SWIPE_UP_GUIDE = enumC742790TBt;
        EnumC742790TBt enumC742790TBt2 = new EnumC742790TBt("NOT_INTERESTED_TUTORIAL", 1);
        NOT_INTERESTED_TUTORIAL = enumC742790TBt2;
        EnumC742790TBt[] enumC742790TBtArr = {enumC742790TBt, enumC742790TBt2};
        LL = enumC742790TBtArr;
        LLILLJJLI = new C2254308sP(enumC742790TBtArr);
    }

    public static EnumC742790TBt[] values() {
        return (EnumC742790TBt[]) LL.clone();
    }

    public static EnumC742790TBt valueOf(String str) {
        return (EnumC742790TBt) C08FF.LIZ(EnumC742790TBt.class, str);
    }

    public EnumC742790TBt(String str, int i) {
    }
}
