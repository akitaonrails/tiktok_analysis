package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0ahK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class EnumC944960ahK {
    public static final EnumC944960ahK ENDED_VIEWER_LIMIT;
    public static final EnumC944960ahK LEFT_COHOST;
    public static final /* synthetic */ EnumC944960ahK[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC944960ahK STARTED_VIEWER_LIMIT;

    public static InterfaceC2044707zh<EnumC944960ahK> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC944960ahK enumC944960ahK = new EnumC944960ahK("STARTED_VIEWER_LIMIT", 0);
        STARTED_VIEWER_LIMIT = enumC944960ahK;
        EnumC944960ahK enumC944960ahK2 = new EnumC944960ahK("ENDED_VIEWER_LIMIT", 1);
        ENDED_VIEWER_LIMIT = enumC944960ahK2;
        EnumC944960ahK enumC944960ahK3 = new EnumC944960ahK("LEFT_COHOST", 2);
        LEFT_COHOST = enumC944960ahK3;
        EnumC944960ahK[] enumC944960ahKArr = {enumC944960ahK, enumC944960ahK2, enumC944960ahK3};
        LL = enumC944960ahKArr;
        LLILLJJLI = new C2254308sP(enumC944960ahKArr);
    }

    public static EnumC944960ahK[] values() {
        return (EnumC944960ahK[]) LL.clone();
    }

    public static EnumC944960ahK valueOf(String str) {
        return (EnumC944960ahK) C08FF.LIZ(EnumC944960ahK.class, str);
    }

    public EnumC944960ahK(String str, int i) {
    }
}
