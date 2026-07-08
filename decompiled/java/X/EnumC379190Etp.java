package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Etp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class EnumC379190Etp {
    public static final C379330Eu3 Companion;
    public static final EnumC379190Etp IMAGE;
    public static final /* synthetic */ EnumC379190Etp[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC379190Etp VIDEO;

    public static InterfaceC2044707zh<EnumC379190Etp> getEntries() {
        return LLILLJJLI;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [X.0Eu3] */
    static {
        EnumC379190Etp enumC379190Etp = new EnumC379190Etp("IMAGE", 0);
        IMAGE = enumC379190Etp;
        EnumC379190Etp enumC379190Etp2 = new EnumC379190Etp("VIDEO", 1);
        VIDEO = enumC379190Etp2;
        EnumC379190Etp[] enumC379190EtpArr = {enumC379190Etp, enumC379190Etp2};
        LL = enumC379190EtpArr;
        LLILLJJLI = new C2254308sP(enumC379190EtpArr);
        Companion = new Object() { // from class: X.0Eu3
        };
    }

    public static EnumC379190Etp[] values() {
        return (EnumC379190Etp[]) LL.clone();
    }

    public static EnumC379190Etp valueOf(String str) {
        return (EnumC379190Etp) C08FF.LIZ(EnumC379190Etp.class, str);
    }

    public EnumC379190Etp(String str, int i) {
    }
}
