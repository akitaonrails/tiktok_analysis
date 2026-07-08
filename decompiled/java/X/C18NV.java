package X;

import android.content.Context;
import android.view.ViewGroup;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.ecommerce.anchor.showcase.settings.AnchorDynamicAnimationConfig;
import com.ss.android.ugc.aweme.ecommerce.anchor.showcase.viewmodel.ECommerceShowcaseAnchorViewModel;
import com.ss.android.ugc.aweme.ecommerce.anchor.utils.AnchorBizUtils;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS576S0100000_32;

/* JADX INFO: renamed from: X.18NV, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C18NV implements InterfaceC2249881D4g, InterfaceC1392510mLB {
    public final Context LL;
    public final ViewGroup LLILLJJLI;
    public C18NN LLILLL;
    public boolean LLILZ;
    public boolean LLILZIL;
    public final ECommerceShowcaseAnchorViewModel LLILZLL = new ECommerceShowcaseAnchorViewModel();
    public InterfaceC1392640mLO LLIZ;
    public Double LLIZLLLIL;
    public final C054G LLJ;
    public AnonymousClass0956 LLJI;

    @Override // X.InterfaceC2249881D4g
    public final void LJI(int i) {
    }

    @Override // X.InterfaceC2249881D4g
    public final void LJIIIZ() {
    }

    @Override // X.InterfaceC2249881D4g
    public final String LJIIJ(C2344009Gk c2344009Gk) {
        return "click_list";
    }

    @Override // X.InterfaceC2249881D4g
    public final boolean LJIIJJI() {
        return false;
    }

    @Override // X.InterfaceC2249881D4g
    public final HashMap<String, String> getShowContentInfo() {
        return null;
    }

    @Override // X.InterfaceC2249881D4g
    public final void LIZ() {
        AnonymousClass0956 anonymousClass0956 = this.LLJI;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        this.LLJI = null;
        C18NN c18nn = this.LLILLL;
        if (c18nn != null) {
            c18nn.LIZ();
        }
        this.LLILZ = false;
    }

    @Override // X.InterfaceC2249881D4g
    public final C1400390mXt getAnchorMobConfiguration() {
        return new C1400390mXt(new AwS576S0100000_32(this, 840), null, null, null, null, 30);
    }

    @Override // X.InterfaceC2249881D4g
    public final boolean LIZJ(C2344009Gk c2344009Gk) {
        Aweme aweme;
        if (C0C14.LIZ() && (aweme = this.LLILZLL.LL) != null && AwemeExtKt.isPhotoMode(aweme) && C21274118Nf.LIZIZ(aweme)) {
            AnonymousClass0956 anonymousClass0956 = this.LLJI;
            if (anonymousClass0956 != null) {
                anonymousClass0956.LIZIZ(null);
            }
            this.LLJI = C23250099c.LIZLLL(this.LLJ, null, null, new C18NY(this, null), 3);
        }
        C18NN c18nn = this.LLILLL;
        if (c18nn != null) {
            c18nn.LIZJ(c2344009Gk);
        }
        return true;
    }

    @Override // X.InterfaceC2249881D4g
    public final void LJIIL(double d) {
        boolean z;
        double dDoubleValue;
        int i;
        boolean z2;
        int videoLength;
        Video video;
        if (this.LLIZLLLIL == null) {
            this.LLIZLLLIL = Double.valueOf(d);
        }
        boolean zLIZ = C0C14.LIZ();
        Aweme aweme = this.LLILZLL.LL;
        boolean z3 = false;
        if (aweme != null && AwemeExtKt.isPhotoMode(aweme) && C21274118Nf.LIZIZ(aweme)) {
            z = true;
        } else {
            z = false;
        }
        if ((!zLIZ || !z) && C21274118Nf.LIZIZ(this.LLILZLL.LL) && !this.LLILZ) {
            Double d2 = this.LLIZLLLIL;
            if (d2 != null) {
                dDoubleValue = d2.doubleValue();
            } else {
                dDoubleValue = 0.0d;
            }
            Aweme aweme2 = this.LLILZLL.LL;
            AnchorBizUtils.LIZ.getClass();
            if (AnchorBizUtils.LJJJLL(aweme2)) {
                SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
                AnchorDynamicAnimationConfig anchorDynamicAnimationConfig = C18P0.LIZ;
                AnchorDynamicAnimationConfig anchorDynamicAnimationConfig2 = (AnchorDynamicAnimationConfig) settingsManagerLIZLLL.LJIIIIZZ("ec_shop_anchor_dynamic_view_ads", AnchorDynamicAnimationConfig.class, anchorDynamicAnimationConfig);
                if (anchorDynamicAnimationConfig2 != null) {
                    anchorDynamicAnimationConfig = anchorDynamicAnimationConfig2;
                }
                i = anchorDynamicAnimationConfig.delayShowSubtitle;
            } else {
                SettingsManager settingsManagerLIZLLL2 = SettingsManager.LIZLLL();
                AnchorDynamicAnimationConfig anchorDynamicAnimationConfig3 = C18P2.LIZ;
                AnchorDynamicAnimationConfig anchorDynamicAnimationConfig4 = (AnchorDynamicAnimationConfig) settingsManagerLIZLLL2.LJIIIIZZ("ec_shop_anchor_dynamic_view", AnchorDynamicAnimationConfig.class, anchorDynamicAnimationConfig3);
                if (anchorDynamicAnimationConfig4 != null) {
                    anchorDynamicAnimationConfig3 = anchorDynamicAnimationConfig4;
                }
                i = anchorDynamicAnimationConfig3.delayShowSubtitle;
            }
            if (d >= dDoubleValue + ((double) i)) {
                z2 = true;
            } else {
                z2 = false;
            }
            int iFloor = (int) Math.floor(d);
            Aweme aweme3 = this.LLILZLL.LL;
            if (aweme3 != null && (video = aweme3.getVideo()) != null) {
                videoLength = video.getVideoLength();
            } else {
                videoLength = Integer.MAX_VALUE;
            }
            if (iFloor >= (videoLength / LSPassThroughRecordSizeConfig.DEFAULT) - 1) {
                z3 = true;
            }
            if (z2 || z3) {
                C18NN c18nn = this.LLILLL;
                if (c18nn != null) {
                    c18nn.LIZLLL();
                }
                this.LLILZ = true;
            }
        }
    }

    public C18NV(Context context, AbstractC2249871D4f abstractC2249871D4f) {
        this.LL = context;
        this.LLILLJJLI = abstractC2249871D4f;
        C23119094b c23119094bLIZ = C2296908zH.LIZ();
        C1DFH c1dfh = C0PEM.LIZ;
        this.LLJ = C2296808zG.LIZ(C09A1.LIZLLL(c23119094bLIZ, C2107308Nj.LIZ.LLIILII()));
    }

    @Override // X.InterfaceC2249881D4g
    public final void LJ(C2344009Gk c2344009Gk, Function1<? super Boolean, Unit> function1) {
        if (C0C14.LIZ()) {
            this.LLILZLL.vQ2(this.LL, c2344009Gk, this.LLILLJJLI);
        } else {
            this.LLILZLL.vQ2(this.LL, c2344009Gk, null);
        }
    }

    @Override // X.InterfaceC2249881D4g
    public final void LJIIIIZZ(AnchorCommonStruct anchorCommonStruct, InterfaceC1392640mLO interfaceC1392640mLO, int i, Function0 function0) {
        if (!this.LLILZIL) {
            C817503Hh c817503Hh = C817503Hh.LL;
            C1DFH c1dfh = C0PEM.LIZ;
            C23250099c.LIZLLL(c817503Hh, C2107308Nj.LIZ, null, new C18NW(this, interfaceC1392640mLO, anchorCommonStruct, null), 2);
            this.LLILZIL = true;
        }
    }
}
