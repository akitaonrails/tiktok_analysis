package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Zdr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class EnumC904370Zdr {
    public static final /* synthetic */ EnumC904370Zdr[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC904370Zdr MEMBERS;
    public static final EnumC904370Zdr PRIVATE_MEDIA;
    public static final EnumC904370Zdr SHARED_COLLECTION;
    public static final EnumC904370Zdr SHARED_VIDEOS;

    public static InterfaceC2044707zh<EnumC904370Zdr> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC904370Zdr enumC904370Zdr = new EnumC904370Zdr("SHARED_VIDEOS", 0);
        SHARED_VIDEOS = enumC904370Zdr;
        EnumC904370Zdr enumC904370Zdr2 = new EnumC904370Zdr("PRIVATE_MEDIA", 1);
        PRIVATE_MEDIA = enumC904370Zdr2;
        EnumC904370Zdr enumC904370Zdr3 = new EnumC904370Zdr("SHARED_COLLECTION", 2);
        SHARED_COLLECTION = enumC904370Zdr3;
        EnumC904370Zdr enumC904370Zdr4 = new EnumC904370Zdr("MEMBERS", 3);
        MEMBERS = enumC904370Zdr4;
        EnumC904370Zdr[] enumC904370ZdrArr = {enumC904370Zdr, enumC904370Zdr2, enumC904370Zdr3, enumC904370Zdr4};
        LL = enumC904370ZdrArr;
        LLILLJJLI = new C2254308sP(enumC904370ZdrArr);
    }

    public static EnumC904370Zdr[] values() {
        return (EnumC904370Zdr[]) LL.clone();
    }

    public static EnumC904370Zdr valueOf(String str) {
        return (EnumC904370Zdr) C08FF.LIZ(EnumC904370Zdr.class, str);
    }

    public EnumC904370Zdr(String str, int i) {
    }
}
