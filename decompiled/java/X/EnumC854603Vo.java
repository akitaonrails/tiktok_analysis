package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.03Vo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class EnumC854603Vo implements InterfaceC855403Vw {
    public static final EnumC854603Vo ACTION_TYPE_INVALID;
    public static final EnumC854603Vo CONSENT_RECORDS_EMPTY;
    public static final /* synthetic */ EnumC854603Vo[] LLILLL;
    public static final /* synthetic */ C2254308sP LLILZ;
    public final int LL;
    public final String LLILLJJLI;

    public static InterfaceC2044707zh<EnumC854603Vo> getEntries() {
        return LLILZ;
    }

    static {
        EnumC854603Vo enumC854603Vo = new EnumC854603Vo("ACTION_TYPE_INVALID", 0, 1, "perform privacy action error, actionType invalid");
        ACTION_TYPE_INVALID = enumC854603Vo;
        EnumC854603Vo enumC854603Vo2 = new EnumC854603Vo("CONSENT_RECORDS_EMPTY", 1, 2, "perform privacy action error, consent records empty, maybe entity key invalid");
        CONSENT_RECORDS_EMPTY = enumC854603Vo2;
        EnumC854603Vo[] enumC854603VoArr = {enumC854603Vo, enumC854603Vo2};
        LLILLL = enumC854603VoArr;
        LLILZ = new C2254308sP(enumC854603VoArr);
    }

    public static EnumC854603Vo[] values() {
        return (EnumC854603Vo[]) LLILLL.clone();
    }

    @Override // X.InterfaceC855403Vw
    public int getErrorCode() {
        return this.LL;
    }

    @Override // X.InterfaceC855403Vw
    public String getMessage() {
        return this.LLILLJJLI;
    }

    public static EnumC854603Vo valueOf(String str) {
        return (EnumC854603Vo) C08FF.LIZ(EnumC854603Vo.class, str);
    }

    public EnumC854603Vo(String str, int i, int i2, String str2) {
        this.LL = i2;
        this.LLILLJJLI = str2;
    }
}
