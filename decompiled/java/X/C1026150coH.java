package X;

import android.content.Context;
import android.graphics.PointF;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.IAnoleManager;
import com.ss.android.ugc.aweme.IAnoleService;
import com.ss.android.ugc.aweme.commercialize.anchor.interfaces.ICommerceAnchorLogger;
import com.ss.android.ugc.aweme.commercialize.anchor.interfaces.ICommerceAnchorService;
import com.ss.android.ugc.aweme.commercialize.anchor.model.CommerceAnchorInfo;
import com.ss.android.ugc.aweme.commercialize.anchor.model.Format;
import com.ss.android.ugc.aweme.commercialize.anchor.model.MapExtra;
import com.ss.android.ugc.aweme.commercialize.model.AnoleComponentAppearModel;
import com.ss.android.ugc.aweme.commercialize.model.AnoleModel;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.AFwS204S0000000_16;
import kotlin.jvm.internal.AFwS252S0000000_16;
import kotlin.jvm.internal.AwS560S0100000_16;
import kotlin.jvm.internal.AwS81S0100100_16;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0coH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1026150coH implements InterfaceC1034510d1l {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJILLL;
    public final InterfaceC1026140coG LL;
    public final String LLILLJJLI;
    public AnchorCommonStruct LLILZIL;
    public Integer LLILZLL;
    public AnoleModel LLIZ;
    public CommerceAnchorInfo LLIZLLLIL;
    public IAnoleManager LLJ;
    public ViewGroup LLJI;
    public final C997320c3m LLILLL = new C997320c3m(AFwS252S0000000_16.get$arr$(458));
    public final C997320c3m LLILZ = new C997320c3m(AFwS252S0000000_16.get$arr$(457));
    public final C01GW LLJIJIL = C452501pT.LIZIZ(AFwS204S0000000_16.get$arr$(391));
    public final C01GW LLJILJIL = C452501pT.LIZIZ(new AwS560S0100000_16(this, 728));
    public final C01GW LLJILJILJ = C452501pT.LIZIZ(AFwS204S0000000_16.get$arr$(392));

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1026150coH.class, "context", "getContext()Landroid/content/Context;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C1026150coH.class, "aweme", "getAweme()Lcom/ss/android/ugc/aweme/feed/model/Aweme;", 0);
        c09r3.getClass();
        LLJILLL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    /* JADX WARN: Type inference failed for: r10v1, types: [X.0coI] */
    @Override // X.InterfaceC1037910d7F
    public final void initialize() {
        CommerceAnchorInfo commerceAnchorInfoLJIIIZ;
        MapExtra mapExtra;
        Format formatData;
        String styleTemplate;
        Object c098200Yq;
        List<AnchorCommonStruct> anchors = LIZIZ().getAnchors();
        if (anchors != null && !anchors.isEmpty()) {
            int i = 0;
            for (AnchorCommonStruct anchorCommonStruct : LIZIZ().getAnchors()) {
                int i2 = i + 1;
                if (i < 0) {
                    C1697810uHb.LJIJI();
                    throw null;
                }
                AnchorCommonStruct anchorCommonStruct2 = anchorCommonStruct;
                if (LIZ().LJIIIIZZ(anchorCommonStruct2) && (commerceAnchorInfoLJIIIZ = LIZ().LJIIIZ(anchorCommonStruct2.getExtra())) != null && (mapExtra = commerceAnchorInfoLJIIIZ.getMapExtra()) != null && (formatData = mapExtra.getFormatData()) != null && (styleTemplate = formatData.getStyleTemplate()) != null) {
                    try {
                        Gson gson = C7740030o.LIZ().getGson();
                        c098200Yq = gson != null ? (AnoleModel) gson.LJII(styleTemplate, AnoleModel.class) : null;
                        C189200o6.m2constructorimpl(c098200Yq);
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        c098200Yq = new C098200Yq(th);
                        C189200o6.m2constructorimpl(c098200Yq);
                    }
                    C189200o6.m8isSuccessimpl(c098200Yq);
                    Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
                    if (thM5exceptionOrNullimpl != null) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("getAnoleData() parse failed ,reason = ");
                        sbLIZ.append(thM5exceptionOrNullimpl.getMessage());
                        C2188811AlT.LIZIZ(sbLIZ);
                    }
                    AnoleModel anoleModel = (AnoleModel) (C189200o6.m7isFailureimpl(c098200Yq) ? null : c098200Yq);
                    if (anoleModel != null) {
                        this.LLILZLL = Integer.valueOf(i);
                        this.LLILZIL = anchorCommonStruct2;
                        this.LLIZ = anoleModel;
                        this.LLIZLLLIL = LIZ().LJIIIZ(anchorCommonStruct2.getExtra());
                    }
                }
                i = i2;
            }
        }
        if (this.LLIZ == null) {
            return;
        }
        String aid = LIZIZ().getAid();
        AnoleModel anoleModel2 = this.LLIZ;
        if (aid == null || anoleModel2 == null) {
            return;
        }
        IAnoleService iAnoleService = (IAnoleService) ServiceManager.get().getService(IAnoleService.class);
        C997320c3m c997320c3m = this.LLILLL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJILLL;
        this.LLJ = iAnoleService.LJI((Context) c997320c3m.LIZ(this), null, new C1009340cNA(aid, LIZIZ().getGroupId(), LIZIZ(), new AwemeRawAd(), null, anoleModel2, null, 64), new InterfaceC1007910cKr() { // from class: X.0cOq
            @Override // X.InterfaceC1007910cKr
            public final void LIZIZ(AbstractC991850bux abstractC991850bux, InterfaceC1007930cKt interfaceC1007930cKt) {
            }

            @Override // X.InterfaceC1007910cKr
            public final void LJJLIIJ() {
            }

            @Override // X.InterfaceC1007910cKr
            public final long LJJLIL() {
                return 0L;
            }

            @Override // X.InterfaceC1007910cKr
            public final int LLJILLL() {
                return 0;
            }

            @Override // X.InterfaceC1007910cKr
            public final void LLJJIII(String str, View.OnLayoutChangeListener onLayoutChangeListener) {
            }

            @Override // X.InterfaceC1007910cKr
            public final C1014410cVL LLJJIJI(String str) {
                return null;
            }

            @Override // X.InterfaceC1007910cKr
            public final C1014390cVJ LLJJIJIIJIL() {
                return null;
            }

            @Override // X.InterfaceC1007910cKr
            public final void P() {
            }

            @Override // X.InterfaceC1007910cKr
            public final void U2() {
            }

            @Override // X.InterfaceC1007910cKr
            public final JSONObject V2() {
                return null;
            }

            @Override // X.InterfaceC1007910cKr
            public final void X2(String str, ViewOnLayoutChangeListenerC1014330cVD viewOnLayoutChangeListenerC1014330cVD) {
            }

            @Override // X.InterfaceC1007910cKr
            public final HashMap<String, Object> Z2() {
                return null;
            }

            @Override // X.InterfaceC1007910cKr
            public final boolean a3(String str, Runnable runnable, int i3) {
                return false;
            }

            @Override // X.InterfaceC1007910cKr
            public final ViewGroup b3() {
                return null;
            }

            @Override // X.InterfaceC1007910cKr
            public final C1008080cL8 c3() {
                return null;
            }

            @Override // X.InterfaceC1007910cKr
            public final boolean d3() {
                return true;
            }

            @Override // X.InterfaceC1007910cKr
            public final boolean e3() {
                return false;
            }

            @Override // X.InterfaceC1007910cKr
            public final void f3(long j, String str, String str2, AwS81S0100100_16 awS81S0100100_16) {
            }

            @Override // X.InterfaceC1007910cKr
            public final void g3(int i3) {
            }

            @Override // X.InterfaceC1007910cKr
            public final Integer i3() {
                return null;
            }

            @Override // X.InterfaceC1007910cKr
            public final void o0() {
            }

            @Override // X.InterfaceC1007910cKr
            public final void pauseVideo() {
            }

            @Override // X.InterfaceC1007910cKr
            public final long r1() {
                return 0L;
            }

            @Override // X.InterfaceC1007910cKr
            public final C1014390cVJ Y2() {
                double width = this.LIZ.LLJI != null ? r0.getWidth() : 0.0d;
                double height = this.LIZ.LLJI != null ? r0.getHeight() : 0.0d;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("getDisplayInfo  width= ");
                sbLIZ2.append(width);
                sbLIZ2.append(" height= ");
                sbLIZ2.append(height);
                C2188811AlT.LIZIZ(sbLIZ2);
                double d = 2;
                return new C1014390cVJ(new C1009390cNF(width, height), new PointF((float) (width / d), (float) (height / d)));
            }

            @Override // X.InterfaceC1007910cKr
            public final C1009390cNF W2(String str) {
                return C1008220cLM.LIZ();
            }

            @Override // X.InterfaceC1007910cKr
            public final boolean h3(String str, InterfaceC1007930cKt interfaceC1007930cKt, AnoleComponentAppearModel anoleComponentAppearModel) {
                if (!this.LIZ.LIZ().LJ()) {
                    return false;
                }
                if (!this.LIZ.LIZ().LJIILIIL(this.LIZ.LLILZIL)) {
                    this.LIZ.LIZJ("time_limit");
                    return false;
                }
                if (!this.LIZ.LIZ().LIZIZ()) {
                    this.LIZ.LIZJ("frequency_limit");
                    return false;
                }
                return true;
            }
        }, new C1008160cLG(null, null, null, null, new InterfaceC1009820cNw() { // from class: X.0coI
            @Override // X.InterfaceC1009820cNw
            public final void LIZ() {
                InterfaceC1050170dR1 interfaceC1050170dR1 = (InterfaceC1050170dR1) this.LIZ.LLJILJIL.getValue();
                if (interfaceC1050170dR1 != null) {
                    interfaceC1050170dR1.if0("profile_card", "profile");
                }
            }

            @Override // X.InterfaceC1009820cNw
            public final void LIZIZ() {
                InterfaceC1050170dR1 interfaceC1050170dR1 = (InterfaceC1050170dR1) this.LIZ.LLJILJIL.getValue();
                if (interfaceC1050170dR1 != null) {
                    interfaceC1050170dR1.o42("profile_card", "profile");
                }
                this.LIZ.LIZ().LJIILJJIL(this.LIZ.LLILZIL);
            }

            @Override // X.InterfaceC1009820cNw
            public final void LIZJ(String str) {
                Integer numValueOf;
                MapExtra mapExtra2;
                MapExtra mapExtra3 = null;
                mapAnchorExtra = null;
                String mapAnchorExtra = null;
                if (AwemeExtKt.isPseudoAd(this.LIZ.LIZIZ())) {
                    C1022820ciu c1022820ciuLIZLLL = C2184171Adz.LIZLLL("draw_ad", "close", C1017070cZd.LJJIJL(this.LIZ.LIZIZ()));
                    c1022820ciuLIZLLL.LIZJ("profile_card", "refer");
                    AnchorCommonStruct anchorCommonStruct3 = this.LIZ.LLILZIL;
                    if (anchorCommonStruct3 != null) {
                        numValueOf = Integer.valueOf(anchorCommonStruct3.getType());
                    } else {
                        numValueOf = null;
                    }
                    c1022820ciuLIZLLL.LIZIZ(String.valueOf(numValueOf), "anchor_type");
                    c1022820ciuLIZLLL.LIZIZ(this.LIZ.LLILLJJLI, "enter_from");
                    c1022820ciuLIZLLL.LIZIZ(str, "dismiss_type");
                    CommerceAnchorInfo commerceAnchorInfo = this.LIZ.LLIZLLLIL;
                    if (commerceAnchorInfo != null && (mapExtra2 = commerceAnchorInfo.getMapExtra()) != null) {
                        mapAnchorExtra = mapExtra2.getMapAnchorExtra();
                    }
                    c1022820ciuLIZLLL.LIZIZ(mapAnchorExtra, "map_anchor_extra");
                    c1022820ciuLIZLLL.LJII();
                    return;
                }
                ICommerceAnchorLogger iCommerceAnchorLogger = (ICommerceAnchorLogger) this.LIZ.LLJILJILJ.getValue();
                Aweme awemeLIZIZ = this.LIZ.LIZIZ();
                C1026150coH c1026150coH = this.LIZ;
                AnchorCommonStruct anchorCommonStruct4 = c1026150coH.LLILZIL;
                CommerceAnchorInfo commerceAnchorInfo2 = c1026150coH.LLIZLLLIL;
                if (commerceAnchorInfo2 != null) {
                    mapExtra3 = commerceAnchorInfo2.getMapExtra();
                }
                C1026150coH c1026150coH2 = this.LIZ;
                iCommerceAnchorLogger.LJFF(awemeLIZIZ, anchorCommonStruct4, mapExtra3, c1026150coH2.LLILLJJLI, c1026150coH2.LLILZLL, str);
            }
        }, 15));
    }

    public final ICommerceAnchorService LIZ() {
        return (ICommerceAnchorService) this.LLJIJIL.getValue();
    }

    public final Aweme LIZIZ() {
        C997320c3m c997320c3m = this.LLILZ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJILLL;
        return (Aweme) c997320c3m.LIZ(this);
    }

    @Override // X.InterfaceC1034510d1l
    public final void Ou2() {
        IAnoleManager iAnoleManager = this.LLJ;
        if (iAnoleManager != null) {
            iAnoleManager.LIZ();
        }
        IAnoleManager iAnoleManager2 = this.LLJ;
        if (iAnoleManager2 != null) {
            iAnoleManager2.LJIIJJI("tt_profile_full_screen");
        }
        this.LLJI = null;
    }

    @Override // X.InterfaceC1034510d1l
    public final void onPagePause() {
        C1022620cia.LIZ("CommerceProfilePageOrganicModule", "onPagePause");
    }

    @Override // X.InterfaceC1010530cP5
    public final /* bridge */ /* synthetic */ InterfaceC1026140coG Mh() {
        return this.LL;
    }

    public final void LIZJ(String str) {
        Integer numValueOf;
        MapExtra mapExtra;
        MapExtra mapExtra2 = null;
        mapAnchorExtra = null;
        String mapAnchorExtra = null;
        if (AwemeExtKt.isPseudoAd(LIZIZ())) {
            C1022820ciu c1022820ciuLIZLLL = C2184171Adz.LIZLLL("draw_ad", "othershow_fail", C1017070cZd.LJJIJL(LIZIZ()));
            c1022820ciuLIZLLL.LIZJ("profile_card", "refer");
            AnchorCommonStruct anchorCommonStruct = this.LLILZIL;
            if (anchorCommonStruct != null) {
                numValueOf = Integer.valueOf(anchorCommonStruct.getType());
            } else {
                numValueOf = null;
            }
            c1022820ciuLIZLLL.LIZIZ(String.valueOf(numValueOf), "anchor_type");
            c1022820ciuLIZLLL.LIZIZ(this.LLILLJJLI, "enter_from");
            c1022820ciuLIZLLL.LIZIZ(str, "fail_reason");
            CommerceAnchorInfo commerceAnchorInfo = this.LLIZLLLIL;
            if (commerceAnchorInfo != null && (mapExtra = commerceAnchorInfo.getMapExtra()) != null) {
                mapAnchorExtra = mapExtra.getMapAnchorExtra();
            }
            c1022820ciuLIZLLL.LIZIZ(mapAnchorExtra, "map_anchor_extra");
            c1022820ciuLIZLLL.LJII();
            return;
        }
        ICommerceAnchorLogger iCommerceAnchorLogger = (ICommerceAnchorLogger) this.LLJILJILJ.getValue();
        Aweme awemeLIZIZ = LIZIZ();
        AnchorCommonStruct anchorCommonStruct2 = this.LLILZIL;
        CommerceAnchorInfo commerceAnchorInfo2 = this.LLIZLLLIL;
        if (commerceAnchorInfo2 != null) {
            mapExtra2 = commerceAnchorInfo2.getMapExtra();
        }
        iCommerceAnchorLogger.LJIILL(awemeLIZIZ, anchorCommonStruct2, mapExtra2, this.LLILLJJLI, this.LLILZLL, str);
    }

    @Override // X.InterfaceC1034510d1l
    public final void LZ(AbstractC1026180coK abstractC1026180coK) {
        if (Intrinsics.LJFF(abstractC1026180coK, C1026270coT.LIZ)) {
            C1022620cia.LIZ("CommerceProfilePageOrganicModule", "onUserInfoLoaded");
            return;
        }
        if (Intrinsics.LJFF(abstractC1026180coK, C1026260coS.LIZ)) {
            C1022620cia.LIZ("CommerceProfilePageOrganicModule", "onPageCompleteLoaded");
        } else if (Intrinsics.LJFF(abstractC1026180coK, C1026240coQ.LIZ)) {
            C1022620cia.LIZ("CommerceProfilePageOrganicModule", "onBannerClicked");
        } else {
            if (Intrinsics.LJFF(abstractC1026180coK, C1026250coR.LIZ)) {
                C1022620cia.LIZ("CommerceProfilePageOrganicModule", "onBannerShow");
                return;
            }
            throw new C1954807lC();
        }
    }

    @Override // X.InterfaceC1034510d1l
    public final void s41(ViewGroup viewGroup) {
        C1022620cia.LIZ("CommerceProfilePageOrganicModule", "hostWillAppear");
        this.LLJI = viewGroup;
        IAnoleManager iAnoleManager = this.LLJ;
        if (iAnoleManager != null) {
            iAnoleManager.mount(viewGroup, "tt_profile_full_screen", null);
        }
        IAnoleManager iAnoleManager2 = this.LLJ;
        if (iAnoleManager2 != null) {
            iAnoleManager2.LIZJ();
        }
    }

    @Override // X.InterfaceC1034510d1l
    public final void xt2(Boolean bool) {
        C1022620cia.LIZ("CommerceProfilePageOrganicModule", "onPageResume");
    }

    public C1026150coH(C1026230coP c1026230coP, String str) {
        this.LL = c1026230coP;
        this.LLILLJJLI = str;
    }
}
