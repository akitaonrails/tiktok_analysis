package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.10iM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class EnumC19320810iM implements InterfaceC19211810Ea {
    public static final EnumC19320810iM AGE_DOWN_BANNER;
    public static final EnumC19320810iM AGE_GRAD_BANNER;
    public static final /* synthetic */ EnumC19320810iM[] LLILZLL;
    public static final /* synthetic */ C2254308sP LLIZ;
    public static final EnumC19320810iM PAUSE_INTERACTIONS_BANNER;
    public final String LL;
    public final String LLILLJJLI;
    public final String LLILLL = "banner";
    public final boolean LLILZ = false;
    public final String LLILZIL = "";

    public static InterfaceC2044707zh<EnumC19320810iM> getEntries() {
        return LLIZ;
    }

    static {
        EnumC19320810iM enumC19320810iM = new EnumC19320810iM("AGE_DOWN_BANNER", "age_down_banner", "ageDownBanner", 0);
        AGE_DOWN_BANNER = enumC19320810iM;
        EnumC19320810iM enumC19320810iM2 = new EnumC19320810iM("AGE_GRAD_BANNER", "age_grad_banner", "ageGradBanner", 1);
        AGE_GRAD_BANNER = enumC19320810iM2;
        EnumC19320810iM enumC19320810iM3 = new EnumC19320810iM("PAUSE_INTERACTIONS_BANNER", "pause_interactions_banner", "pauseInteractionBanner", 2);
        PAUSE_INTERACTIONS_BANNER = enumC19320810iM3;
        EnumC19320810iM[] enumC19320810iMArr = {enumC19320810iM, enumC19320810iM2, enumC19320810iM3};
        LLILZLL = enumC19320810iMArr;
        LLIZ = new C2254308sP(enumC19320810iMArr);
    }

    public static EnumC19320810iM[] values() {
        return (EnumC19320810iM[]) LLILZLL.clone();
    }

    @Override // X.InterfaceC19211810Ea
    public String getContentType() {
        return this.LLILLL;
    }

    @Override // X.InterfaceC19211810Ea
    public boolean getHeadingItem() {
        return this.LLILZ;
    }

    @Override // X.InterfaceC19211810Ea
    public String getIdentifier() {
        return this.LLILZIL;
    }

    @Override // X.InterfaceC19211810Ea
    public String getKey() {
        return this.LLILLJJLI;
    }

    @Override // X.InterfaceC19211910Eb
    public String getTag() {
        return this.LL;
    }

    public static EnumC19320810iM valueOf(String str) {
        return (EnumC19320810iM) C08FF.LIZ(EnumC19320810iM.class, str);
    }

    public EnumC19320810iM(String str, String str2, String str3, int i) {
        this.LL = str2;
        this.LLILLJJLI = str3;
    }
}
