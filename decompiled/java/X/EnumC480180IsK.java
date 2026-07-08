package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0IsK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class EnumC480180IsK {
    public static final EnumC480180IsK BROADCAST;
    public static final EnumC480180IsK COUNTDOWN;
    public static final EnumC480180IsK END;
    public static final /* synthetic */ EnumC480180IsK[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC480180IsK NONE;
    public static final EnumC480180IsK PREVIEW;

    public static InterfaceC2044707zh<EnumC480180IsK> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC480180IsK enumC480180IsK = new EnumC480180IsK("NONE", 0);
        NONE = enumC480180IsK;
        EnumC480180IsK enumC480180IsK2 = new EnumC480180IsK("PREVIEW", 1);
        PREVIEW = enumC480180IsK2;
        EnumC480180IsK enumC480180IsK3 = new EnumC480180IsK("COUNTDOWN", 2);
        COUNTDOWN = enumC480180IsK3;
        EnumC480180IsK enumC480180IsK4 = new EnumC480180IsK("BROADCAST", 3);
        BROADCAST = enumC480180IsK4;
        EnumC480180IsK enumC480180IsK5 = new EnumC480180IsK("END", 4);
        END = enumC480180IsK5;
        EnumC480180IsK[] enumC480180IsKArr = {enumC480180IsK, enumC480180IsK2, enumC480180IsK3, enumC480180IsK4, enumC480180IsK5};
        LL = enumC480180IsKArr;
        LLILLJJLI = new C2254308sP(enumC480180IsKArr);
    }

    public static EnumC480180IsK[] values() {
        return (EnumC480180IsK[]) LL.clone();
    }

    public static EnumC480180IsK valueOf(String str) {
        return (EnumC480180IsK) C08FF.LIZ(EnumC480180IsK.class, str);
    }

    public EnumC480180IsK(String str, int i) {
    }
}
