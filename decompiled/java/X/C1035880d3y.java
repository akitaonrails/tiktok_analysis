package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.commercialize.hybrid.api.web.model.AdWebMultiTabModel;
import com.ss.android.ugc.aweme.commercialize.hybrid.api.web.model.AdWebRecordingModel;
import com.ss.android.ugc.aweme.commercialize.hybrid.api.web.model.FailMsgModel;
import com.ss.android.ugc.aweme.commercialize.hybrid.api.web.model.LoginModel;
import com.ss.android.ugc.aweme.commercialize.hybrid.api.web.model.NonAdWebModel;
import com.ss.android.ugc.aweme.commercialize.hybrid.api.web.model.PaymentModel;
import com.ss.android.ugc.aweme.commercialize.hybrid.api.web.settings.AdLandPageMemLeakOptimizationModel;
import com.ss.android.ugc.aweme.commercialize.model.AiAgentConfig;
import com.ss.android.ugc.aweme.feed.model.AutofillModel;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.BotConfig;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.CommerceAgentHint;
import com.ss.android.ugc.aweme.feed.model.EfficiencyComponents;
import com.ss.android.ugc.aweme.feed.model.LandingPageConfig;
import com.ss.android.ugc.aweme.feed.model.ad.LandingPageNetworkOptimization;
import com.ss.android.ugc.aweme.feed.model.commercialize.adshopifycheckout.ShopifyCheckoutEntity;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0d3y, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1035880d3y implements InterfaceC1041500dD2, Serializable {
    public static final C1035960d46 Companion = new Object() { // from class: X.0d46
    };
    public AwemeRawAd LL;
    public String LLILLJJLI;
    public String LLILLL;
    public String LLILZ;
    public Boolean LLILZIL;
    public String LLILZLL;
    public String LLIZ;
    public String LLIZLLLIL;
    public String LLJ;
    public boolean LLJI;
    public boolean LLJIJIL;
    public boolean LLJILJIL;
    public int LLJILJILJ;
    public String LLJILLL;
    public String LLJJ;
    public String LLJJI;
    public int LLJJIII;
    public boolean LLJJIJI;
    public long LLJJIJIIJIL;
    public String LLJJIJIL;
    public String LLJJJ;
    public Integer LLJJJIL;
    public Boolean LLJJJJ;
    public String LLJJJJJIL;
    public int LLJJJJLIIL;
    public int LLJJL;
    public String LLJJLIIIJLLLLLLLZ;
    public String LLJL;
    public boolean LLJLIL;
    public boolean LLJLILLLLZIIL;
    public boolean LLJLL;
    public boolean LLJLLIL;
    public boolean LLJLLL;
    public String LLJZ;
    public String LLJZIJLIL;
    public boolean LLL;
    public boolean LLLF;
    public boolean LLLFF;
    public boolean LLLFFI;
    public boolean LLLFZ;
    public C1035890d3z LLLI;
    public int LLLII;
    public Integer LLLIIII;
    public NonAdWebModel LLLIIIIL;
    public boolean LLLIIIL;
    public int LLLIIL;
    public boolean LLLIILIL;
    public boolean LLLIL;
    public String LLLILZ;
    public Boolean LLLILZJ;
    public C1016930cZP LLLILZLLLI;
    public int LLLIZZ;
    public boolean LLLJ;
    public int LLLJIL;
    public Boolean LLLJL;
    public int LLLL;
    public int LLLLII;
    public long LLLLIIIILLL;
    public long LLLLIIL;
    public long LLLLIILL;
    public int LLLLIILLL;
    public float LLLLIL;
    public int LLLLILI;
    public boolean LLLLJ;
    public int LLLLJI;
    public int LLLLL;
    public int LLLLLIL;
    public int LLLLLILLIL;
    public int LLLLLJIL;
    public int LLLLLJLJLL;
    public boolean LLLLLL;
    public int LLLLLLIL;
    public boolean LLLLLLJ;
    public boolean LLLLLLL;
    public C1025720cna LLLLLLLLL;
    public boolean LLLLLLLLLL;
    public boolean LLLLLLLZIL;
    public boolean LLLLLLZ;
    public boolean LLLLLLZZ;
    public int LLLLLZ;
    public C1026310coX LLLLLZIL;
    public boolean LLLLLZL;
    public boolean LLLLZ;
    public boolean LLLLZI;
    public boolean LLLLZIL;
    public boolean LLLLZLL;
    public boolean LLLLZLLIL;
    public boolean LLLLZLLLI;
    public boolean LLLZ;
    public final C1035910d41 LLLZI;
    public final C1035920d42 LLLZIIL;
    public final AdWebRecordingModel LLLZIL;
    public long LLLZL;
    public int LLLZLL;
    public boolean LLLZLZ;
    public C1016360cYU LLLZZ;
    public UrlModel LLLZZIL;
    public final C1035900d40 LLZ;
    public int LLZIL;
    public int LLZILL;
    public int LLZL;
    public int LLZLI;
    public String LLZLL;
    public Map<String, String> LLZLLIL;
    public boolean LLZLLLL;
    public long LLZZ;
    public boolean LLZZJLIL;
    public Runnable LLZZLLIL;
    public EfficiencyComponents LLZZZIL;
    public boolean LLZZZZ;
    public boolean a;
    public int b;
    public InterfaceC1035480d3K c;
    public LoginModel d;
    public PaymentModel e;
    public String f;
    public String g;
    public AiAgentConfig h;
    public List<CommerceAgentHint> i;
    public AdWebMultiTabModel j;
    public boolean k;
    public float l;
    public boolean m;
    public boolean n;
    public boolean o;
    public boolean p;
    public FailMsgModel q;
    public boolean r;
    public String s;
    public C1035930d43 t;
    public int u;
    public boolean v;
    public String w;
    public Boolean x;

    public C1035880d3y(AwemeRawAd awemeRawAd, String str, String str2, String str3, Boolean bool, String str4, String str5, String str6, String str7, boolean z, boolean z2, boolean z3, int i, String str8, String str9, String str10, int i2, boolean z4, long j, String str11, String str12, Integer num, Boolean bool2, String str13, int i3, int i4, String str14, String str15, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, String str16, String str17, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, C1035890d3z c1035890d3z, int i5, Integer num2, NonAdWebModel nonAdWebModel, boolean z15, int i6, boolean z16, boolean z17, String str18, Boolean bool3, C1016930cZP c1016930cZP, int i7, boolean z18, int i8, Boolean bool4, int i9, int i10, long j2, long j3, long j4, int i11, float f, int i12, boolean z19, int i13, int i14, int i15, int i16, int i17, int i18, boolean z20, int i19, boolean z21, boolean z22, C1025720cna c1025720cna, boolean z23, boolean z24, boolean z25, boolean z26, int i20, C1026310coX c1026310coX, boolean z27, boolean z28, boolean z29, boolean z30, boolean z31, boolean z32, boolean z33, boolean z34, C1035910d41 c1035910d41, C1035920d42 c1035920d42, AdWebRecordingModel adWebRecordingModel, long j5, int i21, boolean z35, C1016360cYU c1016360cYU, UrlModel urlModel, C1035900d40 c1035900d40, int i22, int i23, int i24, int i25, String str19, Map<String, String> map, boolean z36, long j6, boolean z37, Runnable runnable, EfficiencyComponents efficiencyComponents, boolean z38, boolean z39, int i26, InterfaceC1035480d3K interfaceC1035480d3K, LoginModel loginModel, PaymentModel paymentModel, String str20, String str21, AiAgentConfig aiAgentConfig, List<CommerceAgentHint> list, AdWebMultiTabModel adWebMultiTabModel, boolean z40, float f2, boolean z41, boolean z42, boolean z43, boolean z44, FailMsgModel failMsgModel, boolean z45, String str22, C1035930d43 c1035930d43, int i27, boolean z46) {
        String strLIZIZ;
        this.LL = awemeRawAd;
        this.LLILLJJLI = str;
        this.LLILLL = str2;
        this.LLILZ = str3;
        this.LLILZIL = bool;
        this.LLILZLL = str4;
        this.LLIZ = str5;
        this.LLIZLLLIL = str6;
        this.LLJ = str7;
        this.LLJI = z;
        this.LLJIJIL = z2;
        this.LLJILJIL = z3;
        this.LLJILJILJ = i;
        this.LLJILLL = str8;
        this.LLJJ = str9;
        this.LLJJI = str10;
        this.LLJJIII = i2;
        this.LLJJIJI = z4;
        this.LLJJIJIIJIL = j;
        this.LLJJIJIL = str11;
        this.LLJJJ = str12;
        this.LLJJJIL = num;
        this.LLJJJJ = bool2;
        this.LLJJJJJIL = str13;
        this.LLJJJJLIIL = i3;
        this.LLJJL = i4;
        this.LLJJLIIIJLLLLLLLZ = str14;
        this.LLJL = str15;
        this.LLJLIL = z5;
        this.LLJLILLLLZIIL = z6;
        this.LLJLL = z7;
        this.LLJLLIL = z8;
        this.LLJLLL = z9;
        this.LLJZ = str16;
        this.LLJZIJLIL = str17;
        this.LLL = z10;
        this.LLLF = z11;
        this.LLLFF = z12;
        this.LLLFFI = z13;
        this.LLLFZ = z14;
        this.LLLI = c1035890d3z;
        this.LLLII = i5;
        this.LLLIIII = num2;
        this.LLLIIIIL = nonAdWebModel;
        this.LLLIIIL = z15;
        this.LLLIIL = i6;
        this.LLLIILIL = z16;
        this.LLLIL = z17;
        this.LLLILZ = str18;
        this.LLLILZJ = bool3;
        this.LLLILZLLLI = c1016930cZP;
        this.LLLIZZ = i7;
        this.LLLJ = z18;
        this.LLLJIL = i8;
        this.LLLJL = bool4;
        this.LLLL = i9;
        this.LLLLII = i10;
        this.LLLLIIIILLL = j2;
        this.LLLLIIL = j3;
        this.LLLLIILL = j4;
        this.LLLLIILLL = i11;
        this.LLLLIL = f;
        this.LLLLILI = i12;
        this.LLLLJ = z19;
        this.LLLLJI = i13;
        this.LLLLL = i14;
        this.LLLLLIL = i15;
        this.LLLLLILLIL = i16;
        this.LLLLLJIL = i17;
        this.LLLLLJLJLL = i18;
        this.LLLLLL = z20;
        this.LLLLLLIL = i19;
        this.LLLLLLJ = z21;
        this.LLLLLLL = z22;
        this.LLLLLLLLL = c1025720cna;
        this.LLLLLLLLLL = z23;
        this.LLLLLLLZIL = z24;
        this.LLLLLLZ = z25;
        this.LLLLLLZZ = z26;
        this.LLLLLZ = i20;
        this.LLLLLZIL = c1026310coX;
        this.LLLLLZL = z27;
        this.LLLLZ = z28;
        this.LLLLZI = z29;
        this.LLLLZIL = z30;
        this.LLLLZLL = z31;
        this.LLLLZLLIL = z32;
        this.LLLLZLLLI = z33;
        this.LLLZ = z34;
        this.LLLZI = c1035910d41;
        this.LLLZIIL = c1035920d42;
        this.LLLZIL = adWebRecordingModel;
        this.LLLZL = j5;
        this.LLLZLL = i21;
        this.LLLZLZ = z35;
        this.LLLZZ = c1016360cYU;
        this.LLLZZIL = urlModel;
        this.LLZ = c1035900d40;
        this.LLZIL = i22;
        this.LLZILL = i23;
        this.LLZL = i24;
        this.LLZLI = i25;
        this.LLZLL = str19;
        this.LLZLLIL = map;
        this.LLZLLLL = z36;
        this.LLZZ = j6;
        this.LLZZJLIL = z37;
        this.LLZZLLIL = runnable;
        this.LLZZZIL = efficiencyComponents;
        this.LLZZZZ = z38;
        this.a = z39;
        this.b = i26;
        this.c = interfaceC1035480d3K;
        this.d = loginModel;
        this.e = paymentModel;
        this.f = str20;
        this.g = str21;
        this.h = aiAgentConfig;
        this.i = list;
        this.j = adWebMultiTabModel;
        this.k = z40;
        this.l = f2;
        this.m = z41;
        this.n = z42;
        this.o = z43;
        this.p = z44;
        this.q = failMsgModel;
        this.r = z45;
        this.s = str22;
        this.t = c1035930d43;
        this.u = i27;
        this.v = z46;
        if (((AdLandPageMemLeakOptimizationModel) C1035970d47.LIZIZ.getValue()).enableFixContainerId) {
            strLIZIZ = null;
        } else {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(System.currentTimeMillis());
            sbLIZ.append('-');
            sbLIZ.append(UUID.randomUUID());
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        }
        this.w = strLIZIZ;
    }

    public C1035880d3y() {
        this(null, null, null, null, Boolean.FALSE, null, null, null, null, false, false, false, 0, null, CardStruct.IStatusCode.DEFAULT, UUID.randomUUID().toString(), 0, false, System.currentTimeMillis(), "", null, null, null, null, 1, -1, "", "", true, false, false, false, false, null, null, false, false, false, false, false, new C1035890d3z(false, false, false, false, EnumC1037150d61.VISIBLE, EnumC1039490d9n.DEFAULT_SESSION_START, Collections.synchronizedList(new ArrayList()), null, null, false, null, null), 0, 0, null, false, 0, false, false, null, null, null, 1, false, 1, null, 0, 0, System.currentTimeMillis(), 0L, 0L, 0, 0.0f, 0, false, 0, 0, 0, -1, -1, 1, false, 100, true, false, null, false, false, false, false, 0, null, false, false, false, false, true, false, true, false, new C1035910d41(0L, 0L, -1, false), new C1035920d42(EnumC1036690d5H.NORMAL, false), new AdWebRecordingModel(new AtomicInteger(0), new AtomicLong(0L), new AtomicLong(0L), new AtomicBoolean(false)), 0L, -1, false, null, null, new C1035900d40(new ConcurrentHashMap(), null, null, new AtomicInteger(0), new AtomicInteger(0), new AtomicInteger(0), new AtomicInteger(0), new AtomicLong(0L)), 0, 0, 1, 0, null, null, false, 0L, false, null, null, false, false, 0, null, null, new PaymentModel(null, null, null, null, null, 0, null), null, null, null, new ArrayList(), new AdWebMultiTabModel(0, 0, 0, 0, 0, 0, 0, 0), false, 0.0f, true, false, false, false, new FailMsgModel(null, 1, 0), false, null, null, 0, false);
    }

    public final C1035880d3y copy(AwemeRawAd awemeRawAd, String str, String str2, String str3, Boolean bool, String str4, String str5, String str6, String str7, boolean z, boolean z2, boolean z3, int i, String str8, String str9, String str10, int i2, boolean z4, long j, String str11, String str12, Integer num, Boolean bool2, String str13, int i3, int i4, String str14, String str15, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, String str16, String str17, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, C1035890d3z c1035890d3z, int i5, Integer num2, NonAdWebModel nonAdWebModel, boolean z15, int i6, boolean z16, boolean z17, String str18, Boolean bool3, C1016930cZP c1016930cZP, int i7, boolean z18, int i8, Boolean bool4, int i9, int i10, long j2, long j3, long j4, int i11, float f, int i12, boolean z19, int i13, int i14, int i15, int i16, int i17, int i18, boolean z20, int i19, boolean z21, boolean z22, C1025720cna c1025720cna, boolean z23, boolean z24, boolean z25, boolean z26, int i20, C1026310coX c1026310coX, boolean z27, boolean z28, boolean z29, boolean z30, boolean z31, boolean z32, boolean z33, boolean z34, C1035910d41 c1035910d41, C1035920d42 c1035920d42, AdWebRecordingModel adWebRecordingModel, long j5, int i21, boolean z35, C1016360cYU c1016360cYU, UrlModel urlModel, C1035900d40 c1035900d40, int i22, int i23, int i24, int i25, String str19, Map<String, String> map, boolean z36, long j6, boolean z37, Runnable runnable, EfficiencyComponents efficiencyComponents, boolean z38, boolean z39, int i26, InterfaceC1035480d3K interfaceC1035480d3K, LoginModel loginModel, PaymentModel paymentModel, String str20, String str21, AiAgentConfig aiAgentConfig, List<CommerceAgentHint> list, AdWebMultiTabModel adWebMultiTabModel, boolean z40, float f2, boolean z41, boolean z42, boolean z43, boolean z44, FailMsgModel failMsgModel, boolean z45, String str22, C1035930d43 c1035930d43, int i27, boolean z46) {
        return new C1035880d3y(awemeRawAd, str, str2, str3, bool, str4, str5, str6, str7, z, z2, z3, i, str8, str9, str10, i2, z4, j, str11, str12, num, bool2, str13, i3, i4, str14, str15, z5, z6, z7, z8, z9, str16, str17, z10, z11, z12, z13, z14, c1035890d3z, i5, num2, nonAdWebModel, z15, i6, z16, z17, str18, bool3, c1016930cZP, i7, z18, i8, bool4, i9, i10, j2, j3, j4, i11, f, i12, z19, i13, i14, i15, i16, i17, i18, z20, i19, z21, z22, c1025720cna, z23, z24, z25, z26, i20, c1026310coX, z27, z28, z29, z30, z31, z32, z33, z34, c1035910d41, c1035920d42, adWebRecordingModel, j5, i21, z35, c1016360cYU, urlModel, c1035900d40, i22, i23, i24, i25, str19, map, z36, j6, z37, runnable, efficiencyComponents, z38, z39, i26, interfaceC1035480d3K, loginModel, paymentModel, str20, str21, aiAgentConfig, list, adWebMultiTabModel, z40, f2, z41, z42, z43, z44, failMsgModel, z45, str22, c1035930d43, i27, z46);
    }

    @Override // X.InterfaceC1041500dD2
    public boolean enableCardPreload() {
        return false;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1035880d3y)) {
            return false;
        }
        C1035880d3y c1035880d3y = (C1035880d3y) obj;
        return Intrinsics.LJFF(this.LL, c1035880d3y.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1035880d3y.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c1035880d3y.LLILLL) && Intrinsics.LJFF(this.LLILZ, c1035880d3y.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c1035880d3y.LLILZIL) && Intrinsics.LJFF(this.LLILZLL, c1035880d3y.LLILZLL) && Intrinsics.LJFF(this.LLIZ, c1035880d3y.LLIZ) && Intrinsics.LJFF(this.LLIZLLLIL, c1035880d3y.LLIZLLLIL) && Intrinsics.LJFF(this.LLJ, c1035880d3y.LLJ) && this.LLJI == c1035880d3y.LLJI && this.LLJIJIL == c1035880d3y.LLJIJIL && this.LLJILJIL == c1035880d3y.LLJILJIL && this.LLJILJILJ == c1035880d3y.LLJILJILJ && Intrinsics.LJFF(this.LLJILLL, c1035880d3y.LLJILLL) && Intrinsics.LJFF(this.LLJJ, c1035880d3y.LLJJ) && Intrinsics.LJFF(this.LLJJI, c1035880d3y.LLJJI) && this.LLJJIII == c1035880d3y.LLJJIII && this.LLJJIJI == c1035880d3y.LLJJIJI && this.LLJJIJIIJIL == c1035880d3y.LLJJIJIIJIL && Intrinsics.LJFF(this.LLJJIJIL, c1035880d3y.LLJJIJIL) && Intrinsics.LJFF(this.LLJJJ, c1035880d3y.LLJJJ) && Intrinsics.LJFF(this.LLJJJIL, c1035880d3y.LLJJJIL) && Intrinsics.LJFF(this.LLJJJJ, c1035880d3y.LLJJJJ) && Intrinsics.LJFF(this.LLJJJJJIL, c1035880d3y.LLJJJJJIL) && this.LLJJJJLIIL == c1035880d3y.LLJJJJLIIL && this.LLJJL == c1035880d3y.LLJJL && Intrinsics.LJFF(this.LLJJLIIIJLLLLLLLZ, c1035880d3y.LLJJLIIIJLLLLLLLZ) && Intrinsics.LJFF(this.LLJL, c1035880d3y.LLJL) && this.LLJLIL == c1035880d3y.LLJLIL && this.LLJLILLLLZIIL == c1035880d3y.LLJLILLLLZIIL && this.LLJLL == c1035880d3y.LLJLL && this.LLJLLIL == c1035880d3y.LLJLLIL && this.LLJLLL == c1035880d3y.LLJLLL && Intrinsics.LJFF(this.LLJZ, c1035880d3y.LLJZ) && Intrinsics.LJFF(this.LLJZIJLIL, c1035880d3y.LLJZIJLIL) && this.LLL == c1035880d3y.LLL && this.LLLF == c1035880d3y.LLLF && this.LLLFF == c1035880d3y.LLLFF && this.LLLFFI == c1035880d3y.LLLFFI && this.LLLFZ == c1035880d3y.LLLFZ && Intrinsics.LJFF(this.LLLI, c1035880d3y.LLLI) && this.LLLII == c1035880d3y.LLLII && Intrinsics.LJFF(this.LLLIIII, c1035880d3y.LLLIIII) && Intrinsics.LJFF(this.LLLIIIIL, c1035880d3y.LLLIIIIL) && this.LLLIIIL == c1035880d3y.LLLIIIL && this.LLLIIL == c1035880d3y.LLLIIL && this.LLLIILIL == c1035880d3y.LLLIILIL && this.LLLIL == c1035880d3y.LLLIL && Intrinsics.LJFF(this.LLLILZ, c1035880d3y.LLLILZ) && Intrinsics.LJFF(this.LLLILZJ, c1035880d3y.LLLILZJ) && Intrinsics.LJFF(this.LLLILZLLLI, c1035880d3y.LLLILZLLLI) && this.LLLIZZ == c1035880d3y.LLLIZZ && this.LLLJ == c1035880d3y.LLLJ && this.LLLJIL == c1035880d3y.LLLJIL && Intrinsics.LJFF(this.LLLJL, c1035880d3y.LLLJL) && this.LLLL == c1035880d3y.LLLL && this.LLLLII == c1035880d3y.LLLLII && this.LLLLIIIILLL == c1035880d3y.LLLLIIIILLL && this.LLLLIIL == c1035880d3y.LLLLIIL && this.LLLLIILL == c1035880d3y.LLLLIILL && this.LLLLIILLL == c1035880d3y.LLLLIILLL && Float.compare(this.LLLLIL, c1035880d3y.LLLLIL) == 0 && this.LLLLILI == c1035880d3y.LLLLILI && this.LLLLJ == c1035880d3y.LLLLJ && this.LLLLJI == c1035880d3y.LLLLJI && this.LLLLL == c1035880d3y.LLLLL && this.LLLLLIL == c1035880d3y.LLLLLIL && this.LLLLLILLIL == c1035880d3y.LLLLLILLIL && this.LLLLLJIL == c1035880d3y.LLLLLJIL && this.LLLLLJLJLL == c1035880d3y.LLLLLJLJLL && this.LLLLLL == c1035880d3y.LLLLLL && this.LLLLLLIL == c1035880d3y.LLLLLLIL && this.LLLLLLJ == c1035880d3y.LLLLLLJ && this.LLLLLLL == c1035880d3y.LLLLLLL && Intrinsics.LJFF(this.LLLLLLLLL, c1035880d3y.LLLLLLLLL) && this.LLLLLLLLLL == c1035880d3y.LLLLLLLLLL && this.LLLLLLLZIL == c1035880d3y.LLLLLLLZIL && this.LLLLLLZ == c1035880d3y.LLLLLLZ && this.LLLLLLZZ == c1035880d3y.LLLLLLZZ && this.LLLLLZ == c1035880d3y.LLLLLZ && Intrinsics.LJFF(this.LLLLLZIL, c1035880d3y.LLLLLZIL) && this.LLLLLZL == c1035880d3y.LLLLLZL && this.LLLLZ == c1035880d3y.LLLLZ && this.LLLLZI == c1035880d3y.LLLLZI && this.LLLLZIL == c1035880d3y.LLLLZIL && this.LLLLZLL == c1035880d3y.LLLLZLL && this.LLLLZLLIL == c1035880d3y.LLLLZLLIL && this.LLLLZLLLI == c1035880d3y.LLLLZLLLI && this.LLLZ == c1035880d3y.LLLZ && Intrinsics.LJFF(this.LLLZI, c1035880d3y.LLLZI) && Intrinsics.LJFF(this.LLLZIIL, c1035880d3y.LLLZIIL) && Intrinsics.LJFF(this.LLLZIL, c1035880d3y.LLLZIL) && this.LLLZL == c1035880d3y.LLLZL && this.LLLZLL == c1035880d3y.LLLZLL && this.LLLZLZ == c1035880d3y.LLLZLZ && Intrinsics.LJFF(this.LLLZZ, c1035880d3y.LLLZZ) && Intrinsics.LJFF(this.LLLZZIL, c1035880d3y.LLLZZIL) && Intrinsics.LJFF(this.LLZ, c1035880d3y.LLZ) && this.LLZIL == c1035880d3y.LLZIL && this.LLZILL == c1035880d3y.LLZILL && this.LLZL == c1035880d3y.LLZL && this.LLZLI == c1035880d3y.LLZLI && Intrinsics.LJFF(this.LLZLL, c1035880d3y.LLZLL) && Intrinsics.LJFF(this.LLZLLIL, c1035880d3y.LLZLLIL) && this.LLZLLLL == c1035880d3y.LLZLLLL && this.LLZZ == c1035880d3y.LLZZ && this.LLZZJLIL == c1035880d3y.LLZZJLIL && Intrinsics.LJFF(this.LLZZLLIL, c1035880d3y.LLZZLLIL) && Intrinsics.LJFF(this.LLZZZIL, c1035880d3y.LLZZZIL) && this.LLZZZZ == c1035880d3y.LLZZZZ && this.a == c1035880d3y.a && this.b == c1035880d3y.b && Intrinsics.LJFF(this.c, c1035880d3y.c) && Intrinsics.LJFF(this.d, c1035880d3y.d) && Intrinsics.LJFF(this.e, c1035880d3y.e) && Intrinsics.LJFF(this.f, c1035880d3y.f) && Intrinsics.LJFF(this.g, c1035880d3y.g) && Intrinsics.LJFF(this.h, c1035880d3y.h) && Intrinsics.LJFF(this.i, c1035880d3y.i) && Intrinsics.LJFF(this.j, c1035880d3y.j) && this.k == c1035880d3y.k && Float.compare(this.l, c1035880d3y.l) == 0 && this.m == c1035880d3y.m && this.n == c1035880d3y.n && this.o == c1035880d3y.o && this.p == c1035880d3y.p && Intrinsics.LJFF(this.q, c1035880d3y.q) && this.r == c1035880d3y.r && Intrinsics.LJFF(this.s, c1035880d3y.s) && Intrinsics.LJFF(this.t, c1035880d3y.t) && this.u == c1035880d3y.u && this.v == c1035880d3y.v;
    }

    public String toString() {
        return "AdWebModel(awemeRawAd=" + this.LL + ", title=" + this.LLILLJJLI + ", url=" + this.LLILLL + ", originalUrl=" + this.LLILZ + ", isServerRedirection=" + this.LLILZIL + ", commerceEnterFrom=" + this.LLILZLL + ", refer=" + this.LLIZ + ", awemeId=" + this.LLIZLLLIL + ", awemeAuthorUid=" + this.LLJ + ", previewMode=" + this.LLJI + ", feedBackgroundLoadMode=" + this.LLJIJIL + ", forbidJump=" + this.LLJILJIL + ", useWebUrl=" + this.LLJILJILJ + ", requestId=" + this.LLJILLL + ", sessionId=" + this.LLJJ + ", messageSessionId=" + this.LLJJI + ", isNineScreen=" + this.LLJJIII + ", isFromJsb=" + this.LLJJIJI + ", webInitTime=" + this.LLJJIJIIJIL + ", extraInfo=" + this.LLJJIJIL + ", currentUrl=" + this.LLJJJ + ", iabThemeColor=" + this.LLJJJIL + ", iabThemeColorUseDarkForeground=" + this.LLJJJJ + ", iabThemeColorUrl=" + this.LLJJJJJIL + ", firstPage=" + this.LLJJJJLIIL + ", preloadStatus=" + this.LLJJL + ", hasAdInfoJson=" + this.LLJJLIIIJLLLLLLLZ + ", adInfoJson=" + this.LLJL + ", shouldClearHistory=" + this.LLJLIL + ", hideNavBar=" + this.LLJLILLLLZIIL + ", hideTitleBar=" + this.LLJLL + ", transStatusBar=" + this.LLJLLIL + ", disableImmersionBar=" + this.LLJLLL + ", containerBgColor=" + this.LLJZ + ", initialData=" + this.LLJZIJLIL + ", isPreRender=" + this.LLL + ", cameraGranted=" + this.LLLF + ", audioGranted=" + this.LLLFF + ", locationGranted=" + this.LLLFFI + ", fromAdWebPage=" + this.LLLFZ + ", adCommonData=" + this.LLLI + ", anchorType=" + this.LLLII + ", isPseudoAd=" + this.LLLIIII + ", nonAdWebModel=" + this.LLLIIIIL + ", isWebPageReuse=" + this.LLLIIIL + ", webPageClickCount=" + this.LLLIIL + ", useNewStyle=" + this.LLLIILIL + ", isFullScreen=" + this.LLLIL + ", sceneWhenUseNativeHeaderStyle=" + this.LLLILZ + ", needShowEventPopup=" + this.LLLILZJ + ", adLpBottomModel=" + this.LLLILZLLLI + ", isVisible=" + this.LLLIZZ + ", isJump=" + this.LLLJ + ", pageSource=" + this.LLLJIL + ", hadLog=" + this.LLLJL + ", jumpTimes=" + this.LLLL + ", isBackground=" + this.LLLLII + ", lastTime=" + this.LLLLIIIILLL + ", backgroundDurationFromLoad=" + this.LLLLIIL + ", backgroundDurationFromFinish=" + this.LLLLIILL + ", webPageScrollCount=" + this.LLLLIILLL + ", webPageScrollOffset=" + this.LLLLIL + ", currentOffset=" + this.LLLLILI + ", isOnShow=" + this.LLLLJ + ", allClickCount=" + this.LLLLJI + ", allScrollCount=" + this.LLLLL + ", hasPageStart=" + this.LLLLLIL + ", redirectType=" + this.LLLLLILLIL + ", redirectTypeAtPageStart=" + this.LLLLLJIL + ", isSecured=" + this.LLLLLJLJLL + ", isTitleTruncated=" + this.LLLLLL + ", sheetRatio=" + this.LLLLLLIL + ", fromBlackNavBar=" + this.LLLLLLJ + ", fromTransparentStatusBarPage=" + this.LLLLLLL + ", tuxSheetConfig=" + this.LLLLLLLLL + ", isPreWarm=" + this.LLLLLLLLLL + ", isSheetVariantFullScreen=" + this.LLLLLLLZIL + ", sheetExpanded=" + this.LLLLLLZ + ", enableReuseWeb=" + this.LLLLLLZZ + ", preloadH5Type=" + this.LLLLLZ + ", adlpPopUpModel=" + this.LLLLLZIL + ", isReenterModel=" + this.LLLLLZL + ", onLoadUrlCheck=" + this.LLLLZ + ", shouldShowHistoryTips=" + this.LLLLZI + ", showedHistoryTips=" + this.LLLLZIL + ", bottomBarShowing=" + this.LLLLZLL + ", iabIsShowAndDelayInChangedScreen=" + this.LLLLZLLIL + ", iabResume=" + this.LLLLZLLLI + ", iabResumeFinish=" + this.LLLZ + ", webLoadStatusModel=" + this.LLLZI + ", reuseDataModel=" + this.LLLZIIL + ", recordingModel=" + this.LLLZIL + ", preWarmV2Status=" + this.LLLZL + ", createScene=" + this.LLLZLL + ", forceShowNavBar=" + this.LLLZLZ + ", adWebLoadingFormatModel=" + this.LLLZZ + ", authorAvatar=" + this.LLLZZIL + ", resourceModel=" + this.LLZ + ", isBack=" + this.LLZIL + ", isGoForward=" + this.LLZILL + ", pageOrder=" + this.LLZL + ", pageCount=" + this.LLZLI + ", currentUrlAddedTtclid=" + this.LLZLL + ", utmParams=" + this.LLZLLIL + ", isLoadFinish=" + this.LLZLLLL + ", pageStartTime=" + this.LLZZ + ", aiComponentHasShowed=" + this.LLZZJLIL + ", iEnterProfilePage=" + this.LLZZLLIL + ", efficiencyComponents=" + this.LLZZZIL + ", clickedCloseAll=" + this.LLZZZZ + ", hasLoadUrlForIABRecording=" + this.a + ", iabType=" + this.b + ", bocRuleMatcher=" + this.c + ", loginModel=" + this.d + ", paymentModel=" + this.e + ", changeToUrl=" + this.f + ", reportAdExtraData=" + this.g + ", aiAgentConfig=" + this.h + ", cacheAgentActionQuestions=" + this.i + ", multiTapModel=" + this.j + ", loadStarted=" + this.k + ", downY=" + this.l + ", pullRefreshIsAtTop=" + this.m + ", pullRefreshCssSuppressed=" + this.n + ", pullRefreshCssProbeReady=" + this.o + ", isBannerShowedByExternalGuide=" + this.p + ", failMsgModel=" + this.q + ", autofillJsInjected=" + this.r + ", enterScene=" + this.s + ", webPipModel=" + this.t + ", alphaLoadingEffectiveScene=" + this.u + ", ignoreSslErrorOnce=" + this.v + ')';
    }

    public boolean aiBotEnableInIAB() {
        AwemeRawAd awemeRawAd;
        AiAgentConfig aiAgentConfig;
        BotConfig botConfig;
        return (this.LLJI || (awemeRawAd = this.LL) == null || !awemeRawAd.isGlobalEnableBot() || (aiAgentConfig = this.h) == null || (botConfig = aiAgentConfig.getBotConfig()) == null || !Intrinsics.LJFF(botConfig.aiBotEnable, Boolean.TRUE)) ? false : true;
    }

    @Override // X.InterfaceC1041500dD2
    public boolean autofillEnable() {
        AutofillModel autofillModel;
        AwemeRawAd awemeRawAd = this.LL;
        if (awemeRawAd == null || (autofillModel = awemeRawAd.getAutofillModel()) == null) {
            return false;
        }
        return autofillModel.getEnable();
    }

    @Override // X.InterfaceC1041500dD2
    public AutofillModel autofillModel() {
        AwemeRawAd awemeRawAd = this.LL;
        if (awemeRawAd != null) {
            return awemeRawAd.getAutofillModel();
        }
        return null;
    }

    public final C1035880d3y customCopy() {
        String str = this.w;
        C1035890d3z c1035890d3z = this.LLLI;
        C1035890d3z c1035890d3zCopy = c1035890d3z.copy(c1035890d3z.hasLoad, c1035890d3z.isHide, c1035890d3z.hasLoadFinishOrError, c1035890d3z.isInstantPage, c1035890d3z.webViewVisible, c1035890d3z.sessionType, c1035890d3z.logList, c1035890d3z.enterWebViewTimeStamp, c1035890d3z.exitWebViewTimeStamp, c1035890d3z.hitSSPDataWhenEnter, c1035890d3z.clickTimeStamp, c1035890d3z.pendingClickRunnable);
        C1025720cna c1025720cna = this.LLLLLLLLL;
        C1025720cna c1025720cnaCopy = c1025720cna != null ? c1025720cna.copy(c1025720cna.defaultHeightRatio, c1025720cna.cancelOnTouchOutside, c1025720cna.hasOverlay, c1025720cna.variant, c1025720cna.hideMoreMenu, c1025720cna.dynamicHeight, c1025720cna.peekHeight, c1025720cna.hideHistoryEntry) : null;
        C1035910d41 c1035910d41 = this.LLLZI;
        C1035910d41 c1035910d41Copy = c1035910d41.copy(c1035910d41.totalDuration, c1035910d41.loadDuration, c1035910d41.loadingStatus, c1035910d41.stopLoading);
        C1035920d42 c1035920d42 = this.LLLZIIL;
        C1035920d42 c1035920d42Copy = c1035920d42.copy(c1035920d42.webReuseMode, c1035920d42.hasFirstPageBackgroundLoadFinish);
        AdWebRecordingModel adWebRecordingModel = this.LLLZIL;
        AdWebRecordingModel adWebRecordingModelCopy = adWebRecordingModel.copy(adWebRecordingModel.eventIndex, adWebRecordingModel.currentPageClickCount, adWebRecordingModel.currentPageScrollCount, adWebRecordingModel.isInjectJs);
        C1035900d40 c1035900d40 = this.LLZ;
        C1035880d3y c1035880d3yCopy = copy(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI, this.LLJIJIL, this.LLJILJIL, this.LLJILJILJ, this.LLJILLL, this.LLJJ, this.LLJJI, this.LLJJIII, this.LLJJIJI, this.LLJJIJIIJIL, this.LLJJIJIL, this.LLJJJ, this.LLJJJIL, this.LLJJJJ, this.LLJJJJJIL, this.LLJJJJLIIL, this.LLJJL, this.LLJJLIIIJLLLLLLLZ, this.LLJL, this.LLJLIL, this.LLJLILLLLZIIL, this.LLJLL, this.LLJLLIL, this.LLJLLL, this.LLJZ, this.LLJZIJLIL, this.LLL, this.LLLF, this.LLLFF, this.LLLFFI, this.LLLFZ, c1035890d3zCopy, this.LLLII, this.LLLIIII, this.LLLIIIIL, this.LLLIIIL, this.LLLIIL, this.LLLIILIL, this.LLLIL, this.LLLILZ, this.LLLILZJ, this.LLLILZLLLI, this.LLLIZZ, this.LLLJ, this.LLLJIL, this.LLLJL, this.LLLL, this.LLLLII, this.LLLLIIIILLL, this.LLLLIIL, this.LLLLIILL, this.LLLLIILLL, this.LLLLIL, this.LLLLILI, this.LLLLJ, this.LLLLJI, this.LLLLL, this.LLLLLIL, this.LLLLLILLIL, this.LLLLLJIL, this.LLLLLJLJLL, this.LLLLLL, this.LLLLLLIL, this.LLLLLLJ, this.LLLLLLL, c1025720cnaCopy, this.LLLLLLLLLL, this.LLLLLLLZIL, this.LLLLLLZ, this.LLLLLLZZ, this.LLLLLZ, this.LLLLLZIL, this.LLLLLZL, this.LLLLZ, this.LLLLZI, this.LLLLZIL, this.LLLLZLL, this.LLLLZLLIL, this.LLLLZLLLI, this.LLLZ, c1035910d41Copy, c1035920d42Copy, adWebRecordingModelCopy, this.LLLZL, this.LLLZLL, this.LLLZLZ, this.LLLZZ, this.LLLZZIL, c1035900d40.copy(c1035900d40.operationMap, c1035900d40.prefetchTaskMonitor, c1035900d40.resourceGroup, c1035900d40.cancelByStatusCount, c1035900d40.cancelByTypeCount, c1035900d40.cancelByMaxReuseCount, c1035900d40.cancelByDurationCount, c1035900d40.totalDuration), this.LLZIL, this.LLZILL, this.LLZL, this.LLZLI, this.LLZLL, this.LLZLLIL, this.LLZLLLL, this.LLZZ, this.LLZZJLIL, this.LLZZLLIL, this.LLZZZIL, this.LLZZZZ, this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, this.r, this.s, this.t, this.u, this.v);
        if (str == null) {
            str = "";
        }
        c1035880d3yCopy.setContainerId(str);
        return c1035880d3yCopy;
    }

    public boolean enableAmazonAd() {
        AwemeRawAd awemeRawAd;
        return (this.LLJI || (awemeRawAd = this.LL) == null || !Intrinsics.LJFF(awemeRawAd.isAmazonAd(), Boolean.TRUE)) ? false : true;
    }

    public boolean enableClickIdAttach() {
        AwemeRawAd awemeRawAd = this.LL;
        return awemeRawAd != null && awemeRawAd.getEnableClickIdAttach() == 1;
    }

    public boolean enableNativeCheckoutInIAB() {
        AwemeRawAd awemeRawAd;
        ShopifyCheckoutEntity shopifyData;
        return (this.LLJI || (awemeRawAd = this.LL) == null || (shopifyData = awemeRawAd.getShopifyData()) == null || !shopifyData.getEnableNativeCheckout()) ? false : true;
    }

    @Override // X.InterfaceC1041500dD2
    public boolean enableWebGoogleLogin() {
        AwemeRawAd awemeRawAd = this.LL;
        if (awemeRawAd != null) {
            return awemeRawAd.isEnableWebGoogleLogin();
        }
        return false;
    }

    public final JSONObject getAdInfoMethodObj() {
        JSONObject jSONObject = new JSONObject();
        AwemeRawAd awemeRawAd = this.LL;
        if (awemeRawAd != null) {
            try {
                jSONObject.put("cid", awemeRawAd.getCreativeIdStr());
                jSONObject.put("ad_type", awemeRawAd.getSystemOrigin());
                jSONObject.put("log_extra", awemeRawAd.getLogExtra());
                jSONObject.put("download_url", awemeRawAd.getDownloadUrl());
                jSONObject.put("package_name", awemeRawAd.getPackageName());
                jSONObject.put("app_name", awemeRawAd.getAppName());
                Long creativeId = awemeRawAd.getCreativeId();
                jSONObject.put("code", (creativeId == null || creativeId.longValue() != 0) ? 1 : 0);
                return jSONObject;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
        return jSONObject;
    }

    public final String getCurrentUrlOrWebUrl() {
        String str = this.LLJJJ;
        return (str == null || str.length() == 0) ? this.LLILLL : this.LLJJJ;
    }

    public int getNetworkOptimization() {
        LandingPageNetworkOptimization landingPageNetworkOptimization;
        AwemeRawAd awemeRawAd = this.LL;
        if (awemeRawAd == null || (landingPageNetworkOptimization = awemeRawAd.getLandingPageNetworkOptimization()) == null) {
            return 0;
        }
        return landingPageNetworkOptimization.getNetworkOptimization();
    }

    public final String getOriginalWebUrl() {
        String originalWebUrl;
        AwemeRawAd awemeRawAd = this.LL;
        if (awemeRawAd == null || !Intrinsics.LJFF(awemeRawAd.isServerRedirection(), Boolean.TRUE)) {
            return this.LLILLL;
        }
        AwemeRawAd awemeRawAd2 = this.LL;
        return (awemeRawAd2 == null || (originalWebUrl = awemeRawAd2.getOriginalWebUrl()) == null) ? this.LLILLL : originalWebUrl;
    }

    @Override // X.InterfaceC1041500dD2
    public String getPreloadAdChannel() {
        AwemeRawAd awemeRawAd = this.LL;
        if (awemeRawAd != null) {
            return awemeRawAd.getChannelName();
        }
        return null;
    }

    @Override // X.InterfaceC1041500dD2
    public String getPreloadAdScene() {
        AwemeRawAd awemeRawAd = this.LL;
        return (awemeRawAd == null || awemeRawAd.getSplashInfo() == null) ? "feed" : "splash";
    }

    @Override // X.InterfaceC1041500dD2
    public int getPreloadAdWeb() {
        AwemeRawAd awemeRawAd = this.LL;
        if (awemeRawAd != null) {
            return awemeRawAd.getPreloadWeb();
        }
        return 0;
    }

    public int getPreloadWebType() {
        AwemeRawAd awemeRawAd = this.LL;
        if (awemeRawAd != null) {
            return awemeRawAd.getPreloadH5Type();
        }
        return 0;
    }

    @Override // X.InterfaceC1041500dD2
    public long getRealCreativeId() {
        Long creativeId;
        AwemeRawAd awemeRawAd = this.LL;
        if (awemeRawAd == null || (creativeId = awemeRawAd.getCreativeId()) == null) {
            return 0L;
        }
        return creativeId.longValue();
    }

    @Override // X.InterfaceC1041500dD2
    public String getRealCreativeIdStr() {
        String creativeIdStr;
        AwemeRawAd awemeRawAd = this.LL;
        return (awemeRawAd == null || (creativeIdStr = awemeRawAd.getCreativeIdStr()) == null) ? "" : creativeIdStr;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x002f A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String getRealLoadUrl() {
        /*
            r3 = this;
            boolean r0 = r3.LLJJIJI
            r2 = 0
            if (r0 != 0) goto L15
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r0 = r3.LL
            if (r0 == 0) goto L30
            com.ss.android.ugc.aweme.commercialize.model.AdWebUrlDataFromJsb r0 = r0.getAdWebUrlDataFromJsb()
            if (r0 == 0) goto L30
            java.lang.String r0 = r0.getWebUrl()
            if (r0 == 0) goto L30
        L15:
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r0 = r3.LL
            if (r0 == 0) goto L25
            com.ss.android.ugc.aweme.commercialize.model.AdWebUrlDataFromJsb r0 = r0.getAdWebUrlDataFromJsb()
            if (r0 == 0) goto L25
            java.lang.String r1 = r0.getWebUrl()
            if (r1 != 0) goto L29
        L25:
            java.lang.String r1 = r3.LLILLL
        L27:
            if (r1 == 0) goto L39
        L29:
            int r0 = r1.length()
            if (r0 == 0) goto L39
            return r1
        L30:
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r0 = r3.LL
            if (r0 == 0) goto L39
            java.lang.String r1 = r0.getWebUrl()
            goto L27
        L39:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1035880d3y.getRealLoadUrl():java.lang.String");
    }

    @Override // X.InterfaceC1041500dD2
    public String getRealLogExtra() {
        String logExtra;
        AwemeRawAd awemeRawAd = this.LL;
        return (awemeRawAd == null || (logExtra = awemeRawAd.getLogExtra()) == null) ? "{}" : logExtra;
    }

    public int hashCode() {
        AwemeRawAd awemeRawAd = this.LL;
        int iHashCode = (awemeRawAd == null ? 0 : awemeRawAd.hashCode()) * 31;
        String str = this.LLILLJJLI;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.LLILLL;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.LLILZ;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool = this.LLILZIL;
        int iHashCode5 = (iHashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str4 = this.LLILZLL;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.LLIZ;
        int iHashCode7 = (iHashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.LLIZLLLIL;
        int iHashCode8 = (iHashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.LLJ;
        int iHashCode9 = (((((((((iHashCode8 + (str7 == null ? 0 : str7.hashCode())) * 31) + C786410Ut5.Z2(this.LLJI)) * 31) + C786410Ut5.Z2(this.LLJIJIL)) * 31) + C786410Ut5.Z2(this.LLJILJIL)) * 31) + this.LLJILJILJ) * 31;
        String str8 = this.LLJILLL;
        int iHashCode10 = (((iHashCode9 + (str8 == null ? 0 : str8.hashCode())) * 31) + this.LLJJ.hashCode()) * 31;
        String str9 = this.LLJJI;
        int iHashCode11 = (((((((((iHashCode10 + (str9 == null ? 0 : str9.hashCode())) * 31) + this.LLJJIII) * 31) + C786410Ut5.Z2(this.LLJJIJI)) * 31) + C786410Ut5.Y2(this.LLJJIJIIJIL)) * 31) + this.LLJJIJIL.hashCode()) * 31;
        String str10 = this.LLJJJ;
        int iHashCode12 = (iHashCode11 + (str10 == null ? 0 : str10.hashCode())) * 31;
        Integer num = this.LLJJJIL;
        int iHashCode13 = (iHashCode12 + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool2 = this.LLJJJJ;
        int iHashCode14 = (iHashCode13 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str11 = this.LLJJJJJIL;
        int iHashCode15 = (((((((((((((((((((iHashCode14 + (str11 == null ? 0 : str11.hashCode())) * 31) + this.LLJJJJLIIL) * 31) + this.LLJJL) * 31) + this.LLJJLIIIJLLLLLLLZ.hashCode()) * 31) + this.LLJL.hashCode()) * 31) + C786410Ut5.Z2(this.LLJLIL)) * 31) + C786410Ut5.Z2(this.LLJLILLLLZIIL)) * 31) + C786410Ut5.Z2(this.LLJLL)) * 31) + C786410Ut5.Z2(this.LLJLLIL)) * 31) + C786410Ut5.Z2(this.LLJLLL)) * 31;
        String str12 = this.LLJZ;
        int iHashCode16 = (iHashCode15 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.LLJZIJLIL;
        int iHashCode17 = (((((((((((((((iHashCode16 + (str13 == null ? 0 : str13.hashCode())) * 31) + C786410Ut5.Z2(this.LLL)) * 31) + C786410Ut5.Z2(this.LLLF)) * 31) + C786410Ut5.Z2(this.LLLFF)) * 31) + C786410Ut5.Z2(this.LLLFFI)) * 31) + C786410Ut5.Z2(this.LLLFZ)) * 31) + this.LLLI.hashCode()) * 31) + this.LLLII) * 31;
        Integer num2 = this.LLLIIII;
        int iHashCode18 = (iHashCode17 + (num2 == null ? 0 : num2.hashCode())) * 31;
        NonAdWebModel nonAdWebModel = this.LLLIIIIL;
        int iHashCode19 = (((((((((iHashCode18 + (nonAdWebModel == null ? 0 : nonAdWebModel.hashCode())) * 31) + C786410Ut5.Z2(this.LLLIIIL)) * 31) + this.LLLIIL) * 31) + C786410Ut5.Z2(this.LLLIILIL)) * 31) + C786410Ut5.Z2(this.LLLIL)) * 31;
        String str14 = this.LLLILZ;
        int iHashCode20 = (iHashCode19 + (str14 == null ? 0 : str14.hashCode())) * 31;
        Boolean bool3 = this.LLLILZJ;
        int iHashCode21 = (iHashCode20 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        C1016930cZP c1016930cZP = this.LLLILZLLLI;
        int iHashCode22 = (((((((iHashCode21 + (c1016930cZP == null ? 0 : c1016930cZP.hashCode())) * 31) + this.LLLIZZ) * 31) + C786410Ut5.Z2(this.LLLJ)) * 31) + this.LLLJIL) * 31;
        Boolean bool4 = this.LLLJL;
        int iHashCode23 = (((((((((((((((((((((((((((((((((((((((iHashCode22 + (bool4 == null ? 0 : bool4.hashCode())) * 31) + this.LLLL) * 31) + this.LLLLII) * 31) + C786410Ut5.Y2(this.LLLLIIIILLL)) * 31) + C786410Ut5.Y2(this.LLLLIIL)) * 31) + C786410Ut5.Y2(this.LLLLIILL)) * 31) + this.LLLLIILLL) * 31) + Float.floatToIntBits(this.LLLLIL)) * 31) + this.LLLLILI) * 31) + C786410Ut5.Z2(this.LLLLJ)) * 31) + this.LLLLJI) * 31) + this.LLLLL) * 31) + this.LLLLLIL) * 31) + this.LLLLLILLIL) * 31) + this.LLLLLJIL) * 31) + this.LLLLLJLJLL) * 31) + C786410Ut5.Z2(this.LLLLLL)) * 31) + this.LLLLLLIL) * 31) + C786410Ut5.Z2(this.LLLLLLJ)) * 31) + C786410Ut5.Z2(this.LLLLLLL)) * 31;
        C1025720cna c1025720cna = this.LLLLLLLLL;
        int iHashCode24 = (((((((((((iHashCode23 + (c1025720cna == null ? 0 : c1025720cna.hashCode())) * 31) + C786410Ut5.Z2(this.LLLLLLLLLL)) * 31) + C786410Ut5.Z2(this.LLLLLLLZIL)) * 31) + C786410Ut5.Z2(this.LLLLLLZ)) * 31) + C786410Ut5.Z2(this.LLLLLLZZ)) * 31) + this.LLLLLZ) * 31;
        C1026310coX c1026310coX = this.LLLLLZIL;
        int iHashCode25 = (((((((((((((((((((((((((((((iHashCode24 + (c1026310coX == null ? 0 : c1026310coX.hashCode())) * 31) + C786410Ut5.Z2(this.LLLLLZL)) * 31) + C786410Ut5.Z2(this.LLLLZ)) * 31) + C786410Ut5.Z2(this.LLLLZI)) * 31) + C786410Ut5.Z2(this.LLLLZIL)) * 31) + C786410Ut5.Z2(this.LLLLZLL)) * 31) + C786410Ut5.Z2(this.LLLLZLLIL)) * 31) + C786410Ut5.Z2(this.LLLLZLLLI)) * 31) + C786410Ut5.Z2(this.LLLZ)) * 31) + this.LLLZI.hashCode()) * 31) + this.LLLZIIL.hashCode()) * 31) + this.LLLZIL.hashCode()) * 31) + C786410Ut5.Y2(this.LLLZL)) * 31) + this.LLLZLL) * 31) + C786410Ut5.Z2(this.LLLZLZ)) * 31;
        C1016360cYU c1016360cYU = this.LLLZZ;
        int iHashCode26 = (iHashCode25 + (c1016360cYU == null ? 0 : c1016360cYU.hashCode())) * 31;
        UrlModel urlModel = this.LLLZZIL;
        int iHashCode27 = (((((((((((iHashCode26 + (urlModel == null ? 0 : urlModel.hashCode())) * 31) + this.LLZ.hashCode()) * 31) + this.LLZIL) * 31) + this.LLZILL) * 31) + this.LLZL) * 31) + this.LLZLI) * 31;
        String str15 = this.LLZLL;
        int iHashCode28 = (iHashCode27 + (str15 == null ? 0 : str15.hashCode())) * 31;
        Map<String, String> map = this.LLZLLIL;
        int iHashCode29 = (((((((iHashCode28 + (map == null ? 0 : map.hashCode())) * 31) + C786410Ut5.Z2(this.LLZLLLL)) * 31) + C786410Ut5.Y2(this.LLZZ)) * 31) + C786410Ut5.Z2(this.LLZZJLIL)) * 31;
        Runnable runnable = this.LLZZLLIL;
        int iHashCode30 = (iHashCode29 + (runnable == null ? 0 : runnable.hashCode())) * 31;
        EfficiencyComponents efficiencyComponents = this.LLZZZIL;
        int iHashCode31 = (((((((iHashCode30 + (efficiencyComponents == null ? 0 : efficiencyComponents.hashCode())) * 31) + C786410Ut5.Z2(this.LLZZZZ)) * 31) + C786410Ut5.Z2(this.a)) * 31) + this.b) * 31;
        InterfaceC1035480d3K interfaceC1035480d3K = this.c;
        int iHashCode32 = (iHashCode31 + (interfaceC1035480d3K == null ? 0 : interfaceC1035480d3K.hashCode())) * 31;
        LoginModel loginModel = this.d;
        int iHashCode33 = (((iHashCode32 + (loginModel == null ? 0 : loginModel.hashCode())) * 31) + this.e.hashCode()) * 31;
        String str16 = this.f;
        int iHashCode34 = (iHashCode33 + (str16 == null ? 0 : str16.hashCode())) * 31;
        String str17 = this.g;
        int iHashCode35 = (iHashCode34 + (str17 == null ? 0 : str17.hashCode())) * 31;
        AiAgentConfig aiAgentConfig = this.h;
        int iHashCode36 = (((((((((((((((((iHashCode35 + (aiAgentConfig == null ? 0 : aiAgentConfig.hashCode())) * 31) + this.i.hashCode()) * 31) + this.j.hashCode()) * 31) + C786410Ut5.Z2(this.k)) * 31) + Float.floatToIntBits(this.l)) * 31) + C786410Ut5.Z2(this.m)) * 31) + C786410Ut5.Z2(this.n)) * 31) + C786410Ut5.Z2(this.o)) * 31) + C786410Ut5.Z2(this.p)) * 31;
        FailMsgModel failMsgModel = this.q;
        int iHashCode37 = (((iHashCode36 + (failMsgModel == null ? 0 : failMsgModel.hashCode())) * 31) + C786410Ut5.Z2(this.r)) * 31;
        String str18 = this.s;
        int iHashCode38 = (iHashCode37 + (str18 == null ? 0 : str18.hashCode())) * 31;
        C1035930d43 c1035930d43 = this.t;
        return ((((iHashCode38 + (c1035930d43 != null ? c1035930d43.hashCode() : 0)) * 31) + this.u) * 31) + C786410Ut5.Z2(this.v);
    }

    @Override // X.InterfaceC1041500dD2
    public Integer isAutofillNoneffective() {
        LandingPageConfig landingPageConfig;
        AwemeRawAd awemeRawAd = this.LL;
        if (awemeRawAd == null || (landingPageConfig = awemeRawAd.getLandingPageConfig()) == null) {
            return null;
        }
        return Integer.valueOf(landingPageConfig.isAutofillNoneffective());
    }

    @Override // X.InterfaceC1041500dD2
    public boolean isFromLynxPage() {
        return this.LLJJIJI && Intrinsics.LJFF(this.LLIZ, "landing_page");
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0047 A[Catch: all -> 0x00fc, TryCatch #0 {all -> 0x00fc, blocks: (B:26:0x003f, B:29:0x0047, B:32:0x004f, B:34:0x0055, B:36:0x0063, B:38:0x0069, B:40:0x0077, B:42:0x0085, B:46:0x008e, B:49:0x009f, B:51:0x00ad, B:54:0x00ba, B:62:0x00d6, B:64:0x00dc, B:67:0x00e9, B:70:0x00f0, B:57:0x00c7, B:61:0x00d2, B:71:0x00f5, B:23:0x0037), top: B:85:0x0037 }] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0108  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean isPlayableUrl() {
        /*
            Method dump skipped, instruction units count: 284
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1035880d3y.isPlayableUrl():boolean");
    }

    @Override // X.InterfaceC1041500dD2
    public int isPreloadSecondPage() {
        AwemeRawAd awemeRawAd = this.LL;
        if (awemeRawAd != null) {
            return awemeRawAd.getPreloadWebSecondPage();
        }
        return 0;
    }

    @Override // X.InterfaceC1041500dD2
    public boolean pureMode() {
        LandingPageConfig landingPageConfig;
        AwemeRawAd awemeRawAd = this.LL;
        if (awemeRawAd == null || (landingPageConfig = awemeRawAd.getLandingPageConfig()) == null) {
            return false;
        }
        return landingPageConfig.strictUsePureLink;
    }

    public String ttclid() {
        AwemeRawAd awemeRawAd = this.LL;
        if (awemeRawAd != null) {
            return awemeRawAd.getTtclid();
        }
        return null;
    }

    public final C1035890d3z getAdCommonData() {
        return this.LLLI;
    }

    @Override // X.InterfaceC1041500dD2
    public String getAdContainerId() {
        return this.w;
    }

    public final String getAdInfoJson() {
        return this.LLJL;
    }

    public final C1016930cZP getAdLpBottomModel() {
        return this.LLLILZLLLI;
    }

    public final C1016360cYU getAdWebLoadingFormatModel() {
        return this.LLLZZ;
    }

    public final C1026310coX getAdlpPopUpModel() {
        return this.LLLLLZIL;
    }

    public final AiAgentConfig getAiAgentConfig() {
        return this.h;
    }

    public final boolean getAiComponentHasShowed() {
        return this.LLZZJLIL;
    }

    public final int getAllClickCount() {
        return this.LLLLJI;
    }

    public final int getAllScrollCount() {
        return this.LLLLL;
    }

    public final int getAlphaLoadingEffectiveScene() {
        return this.u;
    }

    public final int getAnchorType() {
        return this.LLLII;
    }

    public final boolean getAudioGranted() {
        return this.LLLFF;
    }

    public final UrlModel getAuthorAvatar() {
        return this.LLLZZIL;
    }

    public final boolean getAutofillJsInjected() {
        return this.r;
    }

    public final String getAwemeAuthorUid() {
        return this.LLJ;
    }

    public final String getAwemeId() {
        return this.LLIZLLLIL;
    }

    public final AwemeRawAd getAwemeRawAd() {
        return this.LL;
    }

    public final long getBackgroundDurationFromFinish() {
        return this.LLLLIILL;
    }

    public final long getBackgroundDurationFromLoad() {
        return this.LLLLIIL;
    }

    public final InterfaceC1035480d3K getBocRuleMatcher() {
        return this.c;
    }

    public final boolean getBottomBarShowing() {
        return this.LLLLZLL;
    }

    public final List<CommerceAgentHint> getCacheAgentActionQuestions() {
        return this.i;
    }

    public final boolean getCameraGranted() {
        return this.LLLF;
    }

    public final String getChangeToUrl() {
        return this.f;
    }

    public final boolean getClickedCloseAll() {
        return this.LLZZZZ;
    }

    public final String getCommerceEnterFrom() {
        return this.LLILZLL;
    }

    public final String getContainerBgColor() {
        return this.LLJZ;
    }

    public final String getContainerId() {
        return this.w;
    }

    public final int getCreateScene() {
        return this.LLLZLL;
    }

    public final int getCurrentOffset() {
        return this.LLLLILI;
    }

    public final String getCurrentUrl() {
        return this.LLJJJ;
    }

    public final String getCurrentUrlAddedTtclid() {
        return this.LLZLL;
    }

    public final boolean getDisableImmersionBar() {
        return this.LLJLLL;
    }

    public final float getDownY() {
        return this.l;
    }

    public final EfficiencyComponents getEfficiencyComponents() {
        return this.LLZZZIL;
    }

    public final boolean getEnableReuseWeb() {
        return this.LLLLLLZZ;
    }

    public final String getEnterScene() {
        return this.s;
    }

    public final String getExtraInfo() {
        return this.LLJJIJIL;
    }

    public final FailMsgModel getFailMsgModel() {
        return this.q;
    }

    public final boolean getFeedBackgroundLoadMode() {
        return this.LLJIJIL;
    }

    public final int getFirstPage() {
        return this.LLJJJJLIIL;
    }

    public final boolean getForbidJump() {
        return this.LLJILJIL;
    }

    public final boolean getForceShowNavBar() {
        return this.LLLZLZ;
    }

    public final boolean getFromAdWebPage() {
        return this.LLLFZ;
    }

    public final boolean getFromBlackNavBar() {
        return this.LLLLLLJ;
    }

    public final boolean getFromTransparentStatusBarPage() {
        return this.LLLLLLL;
    }

    public final Boolean getHadLog() {
        return this.LLLJL;
    }

    public final String getHasAdInfoJson() {
        return this.LLJJLIIIJLLLLLLLZ;
    }

    public final boolean getHasLoadUrlForIABRecording() {
        return this.a;
    }

    public final int getHasPageStart() {
        return this.LLLLLIL;
    }

    public final boolean getHideNavBar() {
        return this.LLJLILLLLZIIL;
    }

    public final boolean getHideTitleBar() {
        return this.LLJLL;
    }

    @Override // X.InterfaceC1041500dD2
    public LoginModel getIABLoginModel() {
        return this.d;
    }

    @Override // X.InterfaceC1041500dD2
    public String getIABMessageSessionId() {
        return this.LLJJI;
    }

    @Override // X.InterfaceC1041500dD2
    public PaymentModel getIABPaymentModel() {
        return this.e;
    }

    public final Runnable getIEnterProfilePage() {
        return this.LLZZLLIL;
    }

    public final boolean getIabIsShowAndDelayInChangedScreen() {
        return this.LLLLZLLIL;
    }

    public final boolean getIabResume() {
        return this.LLLLZLLLI;
    }

    public final boolean getIabResumeFinish() {
        return this.LLLZ;
    }

    public final Integer getIabThemeColor() {
        return this.LLJJJIL;
    }

    public final String getIabThemeColorUrl() {
        return this.LLJJJJJIL;
    }

    public final Boolean getIabThemeColorUseDarkForeground() {
        return this.LLJJJJ;
    }

    public final int getIabType() {
        return this.b;
    }

    public final boolean getIgnoreSslErrorOnce() {
        return this.v;
    }

    public final String getInitialData() {
        return this.LLJZIJLIL;
    }

    @Override // X.InterfaceC1041500dD2
    public int getIsFirstPage() {
        return this.LLJJJJLIIL;
    }

    @Override // X.InterfaceC1041500dD2
    public boolean getIsFromJsb() {
        return this.LLJJIJI;
    }

    public boolean getIsWebPageReused() {
        return this.LLLIIIL;
    }

    public final int getJumpTimes() {
        return this.LLLL;
    }

    public final long getLastTime() {
        return this.LLLLIIIILLL;
    }

    public final boolean getLoadStarted() {
        return this.k;
    }

    @Override // X.InterfaceC1041500dD2
    public String getLoadUrl() {
        return this.LLILLL;
    }

    public final boolean getLocationGranted() {
        return this.LLLFFI;
    }

    public final LoginModel getLoginModel() {
        return this.d;
    }

    @Override // X.InterfaceC1041500dD2
    public String getLpRefer() {
        return this.LLIZ;
    }

    public final String getMessageSessionId() {
        return this.LLJJI;
    }

    public final AdWebMultiTabModel getMultiTapModel() {
        return this.j;
    }

    public final Boolean getNeedShowEventPopup() {
        return this.LLLILZJ;
    }

    public final NonAdWebModel getNonAdWebModel() {
        return this.LLLIIIIL;
    }

    public final boolean getOnLoadUrlCheck() {
        return this.LLLLZ;
    }

    public final String getOriginalUrl() {
        return this.LLILZ;
    }

    public final int getPageCount() {
        return this.LLZLI;
    }

    public final int getPageOrder() {
        return this.LLZL;
    }

    public final int getPageSource() {
        return this.LLLJIL;
    }

    public final long getPageStartTime() {
        return this.LLZZ;
    }

    public final PaymentModel getPaymentModel() {
        return this.e;
    }

    public final long getPreWarmV2Status() {
        return this.LLLZL;
    }

    public final int getPreloadH5Type() {
        return this.LLLLLZ;
    }

    public final int getPreloadStatus() {
        return this.LLJJL;
    }

    @Override // X.InterfaceC1041500dD2
    public int getPreloadWebStatus() {
        return this.LLJJL;
    }

    public final boolean getPreviewMode() {
        return this.LLJI;
    }

    public final boolean getPullRefreshCssProbeReady() {
        return this.o;
    }

    public final boolean getPullRefreshCssSuppressed() {
        return this.n;
    }

    public final boolean getPullRefreshIsAtTop() {
        return this.m;
    }

    @Override // X.InterfaceC1041500dD2
    public AwemeRawAd getRawAd() {
        return this.LL;
    }

    public final AdWebRecordingModel getRecordingModel() {
        return this.LLLZIL;
    }

    public final int getRedirectType() {
        return this.LLLLLILLIL;
    }

    public final int getRedirectTypeAtPageStart() {
        return this.LLLLLJIL;
    }

    public final String getRefer() {
        return this.LLIZ;
    }

    public final String getReportAdExtraData() {
        return this.g;
    }

    public final String getRequestId() {
        return this.LLJILLL;
    }

    public final C1035900d40 getResourceModel() {
        return this.LLZ;
    }

    public final C1035920d42 getReuseDataModel() {
        return this.LLLZIIL;
    }

    public final String getSceneWhenUseNativeHeaderStyle() {
        return this.LLLILZ;
    }

    public final String getSessionId() {
        return this.LLJJ;
    }

    public final boolean getSheetExpanded() {
        return this.LLLLLLZ;
    }

    public final int getSheetRatio() {
        return this.LLLLLLIL;
    }

    public final boolean getShouldClearHistory() {
        return this.LLJLIL;
    }

    public final boolean getShouldShowHistoryTips() {
        return this.LLLLZI;
    }

    public final boolean getShowedHistoryTips() {
        return this.LLLLZIL;
    }

    public final String getTitle() {
        return this.LLILLJJLI;
    }

    public final boolean getTransStatusBar() {
        return this.LLJLLIL;
    }

    public final C1025720cna getTuxSheetConfig() {
        return this.LLLLLLLLL;
    }

    public final String getUrl() {
        return this.LLILLL;
    }

    public final boolean getUseNewStyle() {
        return this.LLLIILIL;
    }

    public final int getUseWebUrl() {
        return this.LLJILJILJ;
    }

    public final Map<String, String> getUtmParams() {
        return this.LLZLLIL;
    }

    public final long getWebInitTime() {
        return this.LLJJIJIIJIL;
    }

    public final C1035910d41 getWebLoadStatusModel() {
        return this.LLLZI;
    }

    public final int getWebPageClickCount() {
        return this.LLLIIL;
    }

    public final int getWebPageScrollCount() {
        return this.LLLLIILLL;
    }

    public final float getWebPageScrollOffset() {
        return this.LLLLIL;
    }

    public final C1035930d43 getWebPipModel() {
        return this.t;
    }

    public final int isBack() {
        return this.LLZIL;
    }

    public final int isBackground() {
        return this.LLLLII;
    }

    public final boolean isBannerShowedByExternalGuide() {
        return this.p;
    }

    public final boolean isFromJsb() {
        return this.LLJJIJI;
    }

    public final boolean isFullScreen() {
        return this.LLLIL;
    }

    public final int isGoForward() {
        return this.LLZILL;
    }

    public final boolean isJump() {
        return this.LLLJ;
    }

    public final boolean isLoadFinish() {
        return this.LLZLLLL;
    }

    public final int isNineScreen() {
        return this.LLJJIII;
    }

    public final boolean isOnShow() {
        return this.LLLLJ;
    }

    public final boolean isPreRender() {
        return this.LLL;
    }

    public final boolean isPreWarm() {
        return this.LLLLLLLLLL;
    }

    @Override // X.InterfaceC1041500dD2
    public boolean isPreviewMode() {
        return this.LLJI;
    }

    public final Integer isPseudoAd() {
        return this.LLLIIII;
    }

    public final boolean isReenterModel() {
        return this.LLLLLZL;
    }

    @Override // X.InterfaceC1041500dD2
    public boolean isReuseMode() {
        return this.LLLLLLZZ;
    }

    public final int isSecured() {
        return this.LLLLLJLJLL;
    }

    public final Boolean isServerRedirection() {
        return this.LLILZIL;
    }

    public final boolean isSheetVariantFullScreen() {
        return this.LLLLLLLZIL;
    }

    public final boolean isTitleTruncated() {
        return this.LLLLLL;
    }

    @Override // X.InterfaceC1041500dD2
    public int isUseWebUrl() {
        return this.LLJILJILJ;
    }

    public final int isVisible() {
        return this.LLLIZZ;
    }

    public final boolean isWebPageReuse() {
        return this.LLLIIIL;
    }

    @Override // X.InterfaceC1041500dD2
    public boolean sheetExpanded() {
        return this.LLLLLLZ;
    }

    @Override // X.InterfaceC1041500dD2
    public boolean sheetVariantFullScreenMode() {
        return this.LLLLLLLZIL;
    }

    public final void setAdCommonData(C1035890d3z c1035890d3z) {
        this.LLLI = c1035890d3z;
    }

    public final void setAdInfoJson(String str) {
        this.LLJL = str;
    }

    public final void setAdLpBottomModel(C1016930cZP c1016930cZP) {
        this.LLLILZLLLI = c1016930cZP;
    }

    public final void setAdWebLoadingFormatModel(C1016360cYU c1016360cYU) {
        this.LLLZZ = c1016360cYU;
    }

    public final void setAdlpPopUpModel(C1026310coX c1026310coX) {
        this.LLLLLZIL = c1026310coX;
    }

    public final void setAiAgentConfig(AiAgentConfig aiAgentConfig) {
        this.h = aiAgentConfig;
    }

    public final void setAiComponentHasShowed(boolean z) {
        this.LLZZJLIL = z;
    }

    public final void setAllClickCount(int i) {
        this.LLLLJI = i;
    }

    public final void setAllScrollCount(int i) {
        this.LLLLL = i;
    }

    public final void setAlphaLoadingEffectiveScene(int i) {
        this.u = i;
    }

    public final void setAnchorType(int i) {
        this.LLLII = i;
    }

    public final void setAudioGranted(boolean z) {
        this.LLLFF = z;
    }

    public final void setAuthorAvatar(UrlModel urlModel) {
        this.LLLZZIL = urlModel;
    }

    public final void setAutofillJsInjected(boolean z) {
        this.r = z;
    }

    public final void setAwemeAuthorUid(String str) {
        this.LLJ = str;
    }

    public final void setAwemeId(String str) {
        this.LLIZLLLIL = str;
    }

    public final void setAwemeRawAd(AwemeRawAd awemeRawAd) {
        this.LL = awemeRawAd;
    }

    public final void setBack(int i) {
        this.LLZIL = i;
    }

    public final void setBackground(int i) {
        this.LLLLII = i;
    }

    public final void setBackgroundDurationFromFinish(long j) {
        this.LLLLIILL = j;
    }

    public final void setBackgroundDurationFromLoad(long j) {
        this.LLLLIIL = j;
    }

    public final void setBannerShowedByExternalGuide(boolean z) {
        this.p = z;
    }

    public final void setBocRuleMatcher(InterfaceC1035480d3K interfaceC1035480d3K) {
        this.c = interfaceC1035480d3K;
    }

    public final void setBottomBarShowing(boolean z) {
        this.LLLLZLL = z;
    }

    public final void setCacheAgentActionQuestions(List<CommerceAgentHint> list) {
        this.i = list;
    }

    public final void setCameraGranted(boolean z) {
        this.LLLF = z;
    }

    public final void setChangeToUrl(String str) {
        this.f = str;
    }

    public final void setClickedCloseAll(boolean z) {
        this.LLZZZZ = z;
    }

    public final void setCommerceEnterFrom(String str) {
        this.LLILZLL = str;
    }

    public final void setContainerBgColor(String str) {
        this.LLJZ = str;
    }

    public void setContainerId(String str) {
        this.w = str;
    }

    public final void setCreateScene(int i) {
        this.LLLZLL = i;
    }

    public final void setCurrentOffset(int i) {
        this.LLLLILI = i;
    }

    public final void setCurrentUrl(String str) {
        this.LLJJJ = str;
    }

    public final void setCurrentUrlAddedTtclid(String str) {
        this.LLZLL = str;
    }

    public final void setDisableImmersionBar(boolean z) {
        this.LLJLLL = z;
    }

    public final void setDownY(float f) {
        this.l = f;
    }

    public final void setEfficiencyComponents(EfficiencyComponents efficiencyComponents) {
        this.LLZZZIL = efficiencyComponents;
    }

    public final void setEnableReuseWeb(boolean z) {
        this.LLLLLLZZ = z;
    }

    public final void setEnterScene(String str) {
        this.s = str;
    }

    public final void setExtraInfo(String str) {
        this.LLJJIJIL = str;
    }

    public final void setFailMsgModel(FailMsgModel failMsgModel) {
        this.q = failMsgModel;
    }

    public final void setFeedBackgroundLoadMode(boolean z) {
        this.LLJIJIL = z;
    }

    public final void setFirstPage(int i) {
        this.LLJJJJLIIL = i;
    }

    public final void setForbidJump(boolean z) {
        this.LLJILJIL = z;
    }

    public final void setForceShowNavBar(boolean z) {
        this.LLLZLZ = z;
    }

    public final void setFromAdWebPage(boolean z) {
        this.LLLFZ = z;
    }

    public final void setFromBlackNavBar(boolean z) {
        this.LLLLLLJ = z;
    }

    public final void setFromJsb(boolean z) {
        this.LLJJIJI = z;
    }

    public final void setFromTransparentStatusBarPage(boolean z) {
        this.LLLLLLL = z;
    }

    public final void setFullScreen(boolean z) {
        this.LLLIL = z;
    }

    public final void setGoForward(int i) {
        this.LLZILL = i;
    }

    public final void setHadLog(Boolean bool) {
        this.LLLJL = bool;
    }

    public final void setHasAdInfoJson(String str) {
        this.LLJJLIIIJLLLLLLLZ = str;
    }

    public final void setHasLoadUrlForIABRecording(boolean z) {
        this.a = z;
    }

    public final void setHasPageStart(int i) {
        this.LLLLLIL = i;
    }

    public final void setHideNavBar(boolean z) {
        this.LLJLILLLLZIIL = z;
    }

    public final void setHideTitleBar(boolean z) {
        this.LLJLL = z;
    }

    public final void setIEnterProfilePage(Runnable runnable) {
        this.LLZZLLIL = runnable;
    }

    public final void setIabIsShowAndDelayInChangedScreen(boolean z) {
        this.LLLLZLLIL = z;
    }

    public final void setIabResume(boolean z) {
        this.LLLLZLLLI = z;
    }

    public final void setIabResumeFinish(boolean z) {
        this.LLLZ = z;
    }

    public final void setIabThemeColor(Integer num) {
        this.LLJJJIL = num;
    }

    public final void setIabThemeColorUrl(String str) {
        this.LLJJJJJIL = str;
    }

    public final void setIabThemeColorUseDarkForeground(Boolean bool) {
        this.LLJJJJ = bool;
    }

    public final void setIabType(int i) {
        this.b = i;
    }

    public final void setIgnoreSslErrorOnce(boolean z) {
        this.v = z;
    }

    public final void setInitialData(String str) {
        this.LLJZIJLIL = str;
    }

    public final void setJump(boolean z) {
        this.LLLJ = z;
    }

    public final void setJumpTimes(int i) {
        this.LLLL = i;
    }

    public final void setLastTime(long j) {
        this.LLLLIIIILLL = j;
    }

    public final void setLoadFinish(boolean z) {
        this.LLZLLLL = z;
    }

    public final void setLoadStarted(boolean z) {
        this.k = z;
    }

    public final void setLocationGranted(boolean z) {
        this.LLLFFI = z;
    }

    public final void setLoginModel(LoginModel loginModel) {
        this.d = loginModel;
    }

    public final void setMessageSessionId(String str) {
        this.LLJJI = str;
    }

    public final void setMultiTapModel(AdWebMultiTabModel adWebMultiTabModel) {
        this.j = adWebMultiTabModel;
    }

    public final void setNeedShowEventPopup(Boolean bool) {
        this.LLLILZJ = bool;
    }

    public final void setNineScreen(int i) {
        this.LLJJIII = i;
    }

    public final void setNonAdWebModel(NonAdWebModel nonAdWebModel) {
        this.LLLIIIIL = nonAdWebModel;
    }

    public final void setOnLoadUrlCheck(boolean z) {
        this.LLLLZ = z;
    }

    public final void setOnShow(boolean z) {
        this.LLLLJ = z;
    }

    public final void setOriginalUrl(String str) {
        this.LLILZ = str;
    }

    public final void setPageCount(int i) {
        this.LLZLI = i;
    }

    public final void setPageOrder(int i) {
        this.LLZL = i;
    }

    public final void setPageSource(int i) {
        this.LLLJIL = i;
    }

    public final void setPageStartTime(long j) {
        this.LLZZ = j;
    }

    public final void setPaymentModel(PaymentModel paymentModel) {
        this.e = paymentModel;
    }

    public final void setPreRender(boolean z) {
        this.LLL = z;
    }

    public final void setPreWarm(boolean z) {
        this.LLLLLLLLLL = z;
    }

    public final void setPreWarmV2Status(long j) {
        this.LLLZL = j;
    }

    public final void setPreloadH5Type(int i) {
        this.LLLLLZ = i;
    }

    public final void setPreloadStatus(int i) {
        this.LLJJL = i;
    }

    public final void setPreviewMode(boolean z) {
        this.LLJI = z;
    }

    public final void setPseudoAd(Integer num) {
        this.LLLIIII = num;
    }

    public final void setPullRefreshCssProbeReady(boolean z) {
        this.o = z;
    }

    public final void setPullRefreshCssSuppressed(boolean z) {
        this.n = z;
    }

    public final void setPullRefreshIsAtTop(boolean z) {
        this.m = z;
    }

    public final void setRedirectType(int i) {
        this.LLLLLILLIL = i;
    }

    public final void setRedirectTypeAtPageStart(int i) {
        this.LLLLLJIL = i;
    }

    public final void setReenterModel(boolean z) {
        this.LLLLLZL = z;
    }

    public final void setRefer(String str) {
        this.LLIZ = str;
    }

    public final void setReportAdExtraData(String str) {
        this.g = str;
    }

    public final void setRequestId(String str) {
        this.LLJILLL = str;
    }

    public final void setSceneWhenUseNativeHeaderStyle(String str) {
        this.LLLILZ = str;
    }

    public final void setSecured(int i) {
        this.LLLLLJLJLL = i;
    }

    public final void setServerRedirection(Boolean bool) {
        this.LLILZIL = bool;
    }

    public final void setSessionId(String str) {
        this.LLJJ = str;
    }

    public final void setSheetExpanded(boolean z) {
        this.LLLLLLZ = z;
    }

    public final void setSheetRatio(int i) {
        this.LLLLLLIL = i;
    }

    public final void setSheetVariantFullScreen(boolean z) {
        this.LLLLLLLZIL = z;
    }

    public final void setShouldClearHistory(boolean z) {
        this.LLJLIL = z;
    }

    public final void setShouldShowHistoryTips(boolean z) {
        this.LLLLZI = z;
    }

    public final void setShowedHistoryTips(boolean z) {
        this.LLLLZIL = z;
    }

    public final void setTitle(String str) {
        this.LLILLJJLI = str;
    }

    public final void setTitleTruncated(boolean z) {
        this.LLLLLL = z;
    }

    public final void setTransStatusBar(boolean z) {
        this.LLJLLIL = z;
    }

    public final void setTuxSheetConfig(C1025720cna c1025720cna) {
        this.LLLLLLLLL = c1025720cna;
    }

    public final void setUrl(String str) {
        this.LLILLL = str;
    }

    public final void setUseNewStyle(boolean z) {
        this.LLLIILIL = z;
    }

    public final void setUseWebUrl(int i) {
        this.LLJILJILJ = i;
    }

    public final void setUtmParams(Map<String, String> map) {
        this.LLZLLIL = map;
    }

    @Override // X.InterfaceC1041500dD2
    public void setVisible(EnumC1037150d61 enumC1037150d61) {
        this.LLLI.setWebViewVisible(enumC1037150d61);
    }

    public final void setWebInitTime(long j) {
        this.LLJJIJIIJIL = j;
    }

    public final void setWebPageClickCount(int i) {
        this.LLLIIL = i;
    }

    public final void setWebPageReuse(boolean z) {
        this.LLLIIIL = z;
    }

    public final void setWebPageScrollCount(int i) {
        this.LLLLIILLL = i;
    }

    public final void setWebPageScrollOffset(float f) {
        this.LLLLIL = f;
    }

    public final void setWebPipModel(C1035930d43 c1035930d43) {
        this.t = c1035930d43;
    }

    public final void setVisible(int i) {
        this.LLLIZZ = i;
    }
}
