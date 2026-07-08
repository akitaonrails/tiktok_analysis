package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.AccountUserService;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.commercialize.model.AnoleComponentAppearModel;
import com.ss.android.ugc.aweme.commercialize.model.AnoleComponentModel;
import com.ss.android.ugc.aweme.component.livepincardcomponent.AnoleLivePinCardCommonData;
import com.ss.android.ugc.aweme.component.livepincardcomponent.AnoleLivePinCardModel;
import com.ss.android.ugc.aweme.component.livepincardcomponent.SponsoredLabel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.zhiliaoapp.musically.R;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS204S0000000_16;
import kotlin.jvm.internal.AwS560S0100000_16;
import kotlin.jvm.internal.AwS595S0100000_16;

/* JADX INFO: renamed from: X.0cRy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1012320cRy extends AbstractC1014240cV4 {
    public InterfaceC1107200ev0 LLJLIL;
    public final C01GW LLJLILLLLZIIL;
    public final C01GW LLJLL;
    public long LLJLLIL;
    public final boolean LLJLLL;
    public final boolean LLJZ;
    public final C01GW LLJZIJLIL;

    @Override // X.AbstractC1014240cV4, X.InterfaceC1007930cKt
    public final void clear() {
        this.LLJLIL = null;
    }

    public final AnoleLivePinCardModel LJJ() {
        return (AnoleLivePinCardModel) this.LLJLL.getValue();
    }

    @Override // X.AbstractC1014240cV4, X.InterfaceC1007930cKt
    public final C1014500cVU isReady() {
        boolean z;
        String str;
        if (this.LLJLIL != null) {
            z = true;
            str = "";
        } else {
            z = false;
            str = "pcsNativePinCardView is null";
        }
        return new C1014500cVU(z, str);
    }

    @Override // X.AbstractC1014240cV4, X.InterfaceC1007930cKt
    public final void LIZ() {
        super.LIZ();
        C1012310cRx.LIZIZ(this);
    }

    @Override // X.AbstractC1014240cV4, X.InterfaceC1007930cKt
    public final void LJFF() {
        C1012310cRx.LIZIZ(this);
        this.LLJLIL = null;
    }

    @Override // X.AbstractC1014240cV4
    public final void LJIJI() {
        super.LJIJI();
        this.LLJLIL = null;
    }

    @Override // X.AbstractC1014240cV4
    public final boolean LJIILIIL() {
        return this.LLJLLL;
    }

    @Override // X.AbstractC1014240cV4
    public final boolean LJIILJJIL() {
        return this.LLJZ;
    }

    @Override // X.AbstractC1014240cV4, X.InterfaceC1007930cKt
    public final void Nk(AnoleComponentAppearModel anoleComponentAppearModel) {
        Aweme aweme;
        AbstractC1387200mCc abstractC1387200mCcLIZIZ;
        Fragment fragmentLIZLLL;
        AnoleLivePinCardModel anoleLivePinCardModelLJJ;
        Map<String, Object> map;
        Context contextLIZIZ;
        C1107270ev7 c1107270ev7LJIIIIZZ;
        Context contextLIZIZ2;
        TuxTextView tuxTextView;
        AnoleLivePinCardCommonData anoleLivePinCardCommonData;
        SponsoredLabel sponsoredLabel;
        String str;
        Integer numLIZ;
        AnoleLivePinCardCommonData anoleLivePinCardCommonData2;
        SponsoredLabel sponsoredLabel2;
        String str2;
        Integer numLIZ2;
        AnoleLivePinCardCommonData anoleLivePinCardCommonData3;
        SponsoredLabel sponsoredLabel3;
        Map<String, Object> map2;
        Object obj;
        Long lLJIILIIL;
        InterfaceC1012330cRz interfaceC1012330cRzF4;
        EnumC1012360cS2 enumC1012360cS2;
        String curUserId;
        AccountUserService accountUserServiceLJIIJ;
        Integer num;
        if (LJJ() != null && this.LLJJIII != null) {
            Object obj2 = this.LLILLJJLI.LIZJ;
            String str3 = null;
            if ((obj2 instanceof Aweme) && (aweme = (Aweme) obj2) != null && (abstractC1387200mCcLIZIZ = C1906580ziK.LIZIZ()) != null && (fragmentLIZLLL = abstractC1387200mCcLIZIZ.LIZLLL()) != null && (anoleLivePinCardModelLJJ = LJJ()) != null && (map = anoleLivePinCardModelLJJ.subPinCard) != null) {
                C1227904rF.LIZ.getClass();
                String strLJI = C1227904rF.LJI(map);
                if (strLJI != null) {
                    AbstractC1387200mCc abstractC1387200mCcLIZIZ2 = C1906580ziK.LIZIZ();
                    if (abstractC1387200mCcLIZIZ2 == null || (contextLIZIZ = abstractC1387200mCcLIZIZ2.LIZIZ()) == null) {
                        contextLIZIZ = this.LLILZ;
                    }
                    FrameLayout frameLayout = new FrameLayout(contextLIZIZ);
                    InterfaceC1012330cRz interfaceC1012330cRz = (InterfaceC1012330cRz) this.LLJLILLLLZIIL.getValue();
                    if (interfaceC1012330cRz != null) {
                        AnoleLivePinCardModel anoleLivePinCardModelLJJ2 = LJJ();
                        if (anoleLivePinCardModelLJJ2 != null && (num = anoleLivePinCardModelLJJ2.scene) != null && num.intValue() == 1) {
                            enumC1012360cS2 = EnumC1012360cS2.VIDEO_FEED_ADS_PIN_CARD;
                        } else {
                            enumC1012360cS2 = EnumC1012360cS2.LIVE_FEED_ADS_PIN_CARD;
                        }
                        Pair[] pairArr = new Pair[3];
                        IAccountService iAccountService = (IAccountService) PluggableExtentionKt.pluggableSpi$default(IAccountService.class, false, false, false, 14, null);
                        String str4 = "";
                        if (iAccountService == null || (accountUserServiceLJIIJ = iAccountService.LJIIJ()) == null) {
                            curUserId = "";
                        } else {
                            curUserId = accountUserServiceLJIIJ.getCurUserId();
                        }
                        pairArr[0] = new Pair("user_id", curUserId);
                        String strLJ = C1019100ccu.LJ(aweme);
                        if (strLJ == null) {
                            strLJ = "";
                        }
                        pairArr[1] = new Pair("room_id", strLJ);
                        String strLIZLLL = C1019100ccu.LIZLLL(aweme);
                        if (strLIZLLL != null) {
                            str4 = strLIZLLL;
                        }
                        pairArr[2] = new Pair("anchor_id", str4);
                        c1107270ev7LJIIIIZZ = interfaceC1012330cRz.LJIIIIZZ(frameLayout, strLJI, enumC1012360cS2, fragmentLIZLLL, C2097608Jq.LJIIJ(pairArr), (InterfaceC1107240ev4) this.LLJZIJLIL.getValue());
                    } else {
                        c1107270ev7LJIIIIZZ = null;
                    }
                    this.LLJLIL = c1107270ev7LJIIIIZZ;
                    if (c1107270ev7LJIIIIZZ != null) {
                        AbstractC1387200mCc abstractC1387200mCcLIZIZ3 = C1906580ziK.LIZIZ();
                        if (abstractC1387200mCcLIZIZ3 == null || (contextLIZIZ2 = abstractC1387200mCcLIZIZ3.LIZIZ()) == null) {
                            contextLIZIZ2 = this.LLILZ;
                        }
                        View viewTd = C786410Ut5.Td(C786410Ut5.ne(contextLIZIZ2), R.layout.pn, this.LLJJIII, false);
                        if (viewTd != null) {
                            ViewGroup viewGroup = (ViewGroup) viewTd.findViewById(R.id.b58);
                            if (viewGroup != null) {
                                viewGroup.addView(frameLayout, -1, -1);
                            }
                        } else {
                            viewTd = null;
                        }
                        this.LLJJIJIL = viewTd;
                        AnoleLivePinCardModel anoleLivePinCardModelLJJ3 = LJJ();
                        if (anoleLivePinCardModelLJJ3 != null && (map2 = anoleLivePinCardModelLJJ3.subPinCard) != null && (obj = map2.get(FollowStatusChangeMethod.PARAM_UID)) != null) {
                            if (obj instanceof Number) {
                                lLJIILIIL = Long.valueOf(((Number) obj).longValue());
                            } else if (obj instanceof String) {
                                lLJIILIIL = C2095008Iq.LJIILIIL((String) obj);
                            }
                            if (lLJIILIIL != null) {
                                long jLongValue = lLJIILIIL.longValue();
                                ILiveOuterService iLiveOuterService = (ILiveOuterService) PluggableExtentionKt.pluggableSpi$default(ILiveOuterService.class, false, false, false, 14, null);
                                if (iLiveOuterService != null && (interfaceC1012330cRzF4 = iLiveOuterService.F4()) != null) {
                                    interfaceC1012330cRzF4.LIZLLL(jLongValue, (InterfaceC1107240ev4) this.LLJZIJLIL.getValue());
                                }
                            }
                        }
                        View view = this.LLJJIJIL;
                        if (view != null && (tuxTextView = (TuxTextView) view.findViewById(R.id.z9t)) != null) {
                            AnoleLivePinCardModel anoleLivePinCardModelLJJ4 = LJJ();
                            if (anoleLivePinCardModelLJJ4 != null && (anoleLivePinCardCommonData3 = anoleLivePinCardModelLJJ4.commonData) != null && (sponsoredLabel3 = anoleLivePinCardCommonData3.label) != null) {
                                str3 = sponsoredLabel3.text;
                            }
                            tuxTextView.setText(str3);
                            AnoleLivePinCardModel anoleLivePinCardModelLJJ5 = LJJ();
                            if (anoleLivePinCardModelLJJ5 != null && (anoleLivePinCardCommonData2 = anoleLivePinCardModelLJJ5.commonData) != null && (sponsoredLabel2 = anoleLivePinCardCommonData2.label) != null && (str2 = sponsoredLabel2.colorText) != null && (numLIZ2 = C998460c5c.LIZ(str2)) != null) {
                                tuxTextView.setTextColor(numLIZ2.intValue());
                            }
                            AnoleLivePinCardModel anoleLivePinCardModelLJJ6 = LJJ();
                            if (anoleLivePinCardModelLJJ6 != null && (anoleLivePinCardCommonData = anoleLivePinCardModelLJJ6.commonData) != null && (sponsoredLabel = anoleLivePinCardCommonData.label) != null && (str = sponsoredLabel.color) != null && (numLIZ = C998460c5c.LIZ(str)) != null) {
                                int iIntValue = numLIZ.intValue();
                                GradientDrawable gradientDrawable = new GradientDrawable();
                                gradientDrawable.setColor(ColorStateList.valueOf(iIntValue));
                                gradientDrawable.setCornerRadius(C418440Gaw.LIZIZ(4));
                                tuxTextView.setBackground(gradientDrawable);
                            }
                            C1003890cEN c1003890cEN = AbstractViewOnClickListenerC1003880cEM.LLILLL;
                            AwS595S0100000_16 awS595S0100000_16 = new AwS595S0100000_16(this, 372);
                            c1003890cEN.getClass();
                            C786410Ut5.h9(tuxTextView, new C1003560cDq(awS595S0100000_16));
                        }
                    }
                }
            }
        }
        super.Nk(anoleComponentAppearModel);
    }

    public C1012320cRy(AnoleComponentModel anoleComponentModel, C1009340cNA c1009340cNA, InterfaceC1014270cV7 interfaceC1014270cV7, Context context) {
        super(anoleComponentModel, c1009340cNA, interfaceC1014270cV7, context);
        this.LLJLILLLLZIIL = C452501pT.LIZIZ(AFwS204S0000000_16.get$arr$(484));
        this.LLJLL = C452501pT.LIZIZ(new AwS560S0100000_16(this, 908));
        this.LLJLLIL = -1L;
        this.LLJLLL = true;
        this.LLJZ = true;
        this.LLJZIJLIL = C452501pT.LIZIZ(new AwS560S0100000_16(this, 909));
    }
}
