package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0XfS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class EnumC854400XfS {
    public static final EnumC854400XfS EMAIL;
    public static final /* synthetic */ EnumC854400XfS[] LLILZ;
    public static final /* synthetic */ C2254308sP LLILZIL;
    public static final EnumC854400XfS PASSWORD;
    public static final EnumC854400XfS SMS;
    public final EnumC854420XfU LL;
    public final EnumC854430XfV LLILLJJLI;
    public final EnumC854390XfR LLILLL;

    public static InterfaceC2044707zh<EnumC854400XfS> getEntries() {
        return LLILZIL;
    }

    static {
        EnumC854400XfS enumC854400XfS = new EnumC854400XfS("SMS", 0, EnumC854420XfU.SMS, EnumC854430XfV.SMS, EnumC854390XfR.SMS);
        SMS = enumC854400XfS;
        EnumC854400XfS enumC854400XfS2 = new EnumC854400XfS("EMAIL", 1, EnumC854420XfU.EMAIL, EnumC854430XfV.EMAIL, EnumC854390XfR.EMAIL);
        EMAIL = enumC854400XfS2;
        EnumC854400XfS enumC854400XfS3 = new EnumC854400XfS("PASSWORD", 2, EnumC854420XfU.PASSWORD, EnumC854430XfV.PASSWORD, EnumC854390XfR.PASSWORD);
        PASSWORD = enumC854400XfS3;
        EnumC854400XfS[] enumC854400XfSArr = {enumC854400XfS, enumC854400XfS2, enumC854400XfS3};
        LLILZ = enumC854400XfSArr;
        LLILZIL = new C2254308sP(enumC854400XfSArr);
    }

    public static EnumC854400XfS[] values() {
        return (EnumC854400XfS[]) LLILZ.clone();
    }

    public final EnumC854390XfR getResult() {
        return this.LLILLL;
    }

    public final EnumC854420XfU getShow() {
        return this.LL;
    }

    public final EnumC854430XfV getTyping() {
        return this.LLILLJJLI;
    }

    public static EnumC854400XfS valueOf(String str) {
        return (EnumC854400XfS) C08FF.LIZ(EnumC854400XfS.class, str);
    }

    public EnumC854400XfS(String str, int i, EnumC854420XfU enumC854420XfU, EnumC854430XfV enumC854430XfV, EnumC854390XfR enumC854390XfR) {
        this.LL = enumC854420XfU;
        this.LLILLJJLI = enumC854430XfV;
        this.LLILLL = enumC854390XfR;
    }
}
