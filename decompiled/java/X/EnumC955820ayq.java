package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0ayq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class EnumC955820ayq {
    public static final EnumC955820ayq COHOST_MODE_NORMAL;
    public static final EnumC955820ayq COHOST_MODE_SCREEN_SHARE;
    public static final /* synthetic */ EnumC955820ayq[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public int LL;

    public static InterfaceC2044707zh<EnumC955820ayq> getEntries() {
        return LLILLL;
    }

    static {
        EnumC955820ayq enumC955820ayq = new EnumC955820ayq("COHOST_MODE_NORMAL", 0, 0);
        COHOST_MODE_NORMAL = enumC955820ayq;
        EnumC955820ayq enumC955820ayq2 = new EnumC955820ayq("COHOST_MODE_SCREEN_SHARE", 1, 1);
        COHOST_MODE_SCREEN_SHARE = enumC955820ayq2;
        EnumC955820ayq[] enumC955820ayqArr = {enumC955820ayq, enumC955820ayq2};
        LLILLJJLI = enumC955820ayqArr;
        LLILLL = new C2254308sP(enumC955820ayqArr);
    }

    public static EnumC955820ayq[] values() {
        return (EnumC955820ayq[]) LLILLJJLI.clone();
    }

    public final int getType() {
        return this.LL;
    }

    public static EnumC955820ayq valueOf(String str) {
        return (EnumC955820ayq) C08FF.LIZ(EnumC955820ayq.class, str);
    }

    public final void setType(int i) {
        this.LL = i;
    }

    public EnumC955820ayq(String str, int i, int i2) {
        this.LL = i2;
    }
}
