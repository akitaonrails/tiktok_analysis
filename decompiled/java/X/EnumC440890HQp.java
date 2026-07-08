package X;

import com.ss.android.ugc.aweme.socialavatar.mixstudio.framework.MixStudioLoadingPageAssem;
import com.ss.android.ugc.aweme.socialavatar.mixstudio.framework.MixStudioPageAssem;
import com.ss.android.ugc.aweme.socialavatar.mixstudio.generatingpage.MixStudioGeneratingErrorPageAssem;
import com.ss.android.ugc.aweme.socialavatar.mixstudio.generatingpage.MixStudioGeneratingPageAssem;
import com.ss.android.ugc.aweme.socialavatar.mixstudio.homepage.MixStudioHomeErrorPageAssem;
import com.ss.android.ugc.aweme.socialavatar.mixstudio.homepage.MixStudioHomePageAssem;
import com.ss.android.ugc.aweme.socialavatar.mixstudio.resultspage.v1.MixStudioResultsPageV1Assem;
import com.ss.android.ugc.aweme.socialavatar.mixstudio.resultspage.v2.MixStudioResultsPageV2Assem;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0HQp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class EnumC440890HQp {
    public static final EnumC440890HQp GENERATING;
    public static final EnumC440890HQp GENERATING_ERROR;
    public static final EnumC440890HQp HOME;
    public static final EnumC440890HQp HOME_ERROR;
    public static final /* synthetic */ EnumC440890HQp[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC440890HQp LOADING;
    public static final EnumC440890HQp RESULTS;
    public final C13IQ<? extends MixStudioPageAssem> LL;

    public static InterfaceC2044707zh<EnumC440890HQp> getEntries() {
        return LLILLL;
    }

    static {
        EnumC440890HQp enumC440890HQp = new EnumC440890HQp(0, "LOADING", C13LE.LIZ(MixStudioLoadingPageAssem.class));
        LOADING = enumC440890HQp;
        EnumC440890HQp enumC440890HQp2 = new EnumC440890HQp(1, "HOME", C13LE.LIZ(MixStudioHomePageAssem.class));
        HOME = enumC440890HQp2;
        EnumC440890HQp enumC440890HQp3 = new EnumC440890HQp(2, "GENERATING", C13LE.LIZ(MixStudioGeneratingPageAssem.class));
        GENERATING = enumC440890HQp3;
        EnumC440890HQp enumC440890HQp4 = new EnumC440890HQp(3, "RESULTS", C13LE.LIZ(C0HSM.LIZ() ? MixStudioResultsPageV2Assem.class : MixStudioResultsPageV1Assem.class));
        RESULTS = enumC440890HQp4;
        EnumC440890HQp enumC440890HQp5 = new EnumC440890HQp(4, "HOME_ERROR", C13LE.LIZ(MixStudioHomeErrorPageAssem.class));
        HOME_ERROR = enumC440890HQp5;
        EnumC440890HQp enumC440890HQp6 = new EnumC440890HQp(5, "GENERATING_ERROR", C13LE.LIZ(MixStudioGeneratingErrorPageAssem.class));
        GENERATING_ERROR = enumC440890HQp6;
        EnumC440890HQp[] enumC440890HQpArr = {enumC440890HQp, enumC440890HQp2, enumC440890HQp3, enumC440890HQp4, enumC440890HQp5, enumC440890HQp6};
        LLILLJJLI = enumC440890HQpArr;
        LLILLL = new C2254308sP(enumC440890HQpArr);
    }

    public static EnumC440890HQp[] values() {
        return (EnumC440890HQp[]) LLILLJJLI.clone();
    }

    public final C13IQ<? extends MixStudioPageAssem> getAssem() {
        return this.LL;
    }

    public static EnumC440890HQp valueOf(String str) {
        return (EnumC440890HQp) C08FF.LIZ(EnumC440890HQp.class, str);
    }

    public EnumC440890HQp(int i, String str, C19719912Dl c19719912Dl) {
        this.LL = c19719912Dl;
    }
}
