package Y;

import X.AbstractC1714770uix;
import X.AnonymousClass0482;
import X.AnonymousClass0483;
import X.C04AS;
import X.C0HWQ;
import X.C1391190mJ3;
import X.C1391600mJi;
import X.C13LP;
import X.C1406700mi4;
import X.C1697810uHb;
import X.C1708610uZ1;
import X.C1709570uaZ;
import X.C1710070ubN;
import X.C1710780ucW;
import X.C1710830ucb;
import X.C1713570uh1;
import X.C1714750uiv;
import X.C1714760uiw;
import X.C1715560ukE;
import X.C1748440vbG;
import X.C1748720vbi;
import X.C1749140vcO;
import X.C1752170vhH;
import X.C1754660vlI;
import X.C1761780vwm;
import X.C1763840w06;
import X.C1776030wJl;
import X.C323780Cme;
import X.C343970De7;
import X.C418440Gaw;
import X.C443090HZb;
import X.C814420VxA;
import X.DialogC1761330vw3;
import X.DialogInterfaceOnDismissListenerC1775910wJZ;
import X.EnumC1235690iGF;
import X.EnumC1710440uby;
import X.EnumC1733870vDl;
import X.InterfaceC1709310ua9;
import X.InterfaceC1752190vhJ;
import X.InterfaceC1761420vwC;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.address.identity.AddressIdentityAssem;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.IdentityInfoOption;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.IdentityInfoPanel;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.TryOnData;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.vm.PdpViewModel;
import com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment;
import com.ss.android.ugc.aweme.pipo.cashier.cashier.ccdc.CashierIndependentCVVFragment;
import com.ss.android.ugc.aweme.pipo.cashier.common.model.po.PaymentOption;
import com.ss.android.ugc.aweme.prop.activity.EffectMobileTemplateEditActivity;
import com.ss.android.ugc.aweme.prop.presenter.MobileEffectViewModel;
import com.ss.android.ugc.aweme.sticker.model.NewFaceStickerBean;
import com.ss.android.ugc.gamora.recorder.sticker.templateeffect.MobileEffectData;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS107S0201000_26;
import kotlin.jvm.internal.AwS154S0400000_26;
import kotlin.jvm.internal.AwS392S0200000_26;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes27.dex */
public class ACListenerS58S0400000_26 implements View.OnClickListener {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.$t) {
            case 0:
                onClick$0(this, view);
                break;
            case 1:
                onClick$1(this, view);
                break;
            case 2:
                onClick$2(this, view);
                break;
            case 3:
                onClick$3(this, view);
                break;
            case 4:
                onClick$4(this, view);
                break;
            case 5:
                onClick$5(this, view);
                break;
            case 6:
                onClick$6(this, view);
                break;
        }
    }

    public static final void onClick$0(ACListenerS58S0400000_26 aCListenerS58S0400000_26, View view) {
        String str;
        Function0 function0 = (Function0) aCListenerS58S0400000_26.l0;
        if (function0 != null) {
            function0.invoke();
        }
        ArrayList arrayList = new ArrayList();
        C1406700mi4 c1406700mi4 = (C1406700mi4) aCListenerS58S0400000_26.l2;
        List<String> list = c1406700mi4.LL.toImageUrlModel().LIZ;
        if (list == null || (str = (String) C13LP.LJJJLL(list)) == null) {
            str = "";
        }
        arrayList.add(C1761780vwm.LIZIZ(C1761780vwm.LIZ, str, c1406700mi4.LL.getUri(), null, 12));
        DialogC1761330vw3 dialogC1761330vw3 = new DialogC1761330vw3(((C1752170vhH) aCListenerS58S0400000_26.l1).getContext(), false);
        final InterfaceC1752190vhJ interfaceC1752190vhJ = (InterfaceC1752190vhJ) aCListenerS58S0400000_26.l3;
        dialogC1761330vw3.LLJIJIL = new InterfaceC1761420vwC() { // from class: X.0vhK
            @Override // X.InterfaceC1761420vwC
            public final void onShow() {
                interfaceC1752190vhJ.LJJJJJL(true);
            }
        };
        dialogC1761330vw3.LJJZZI(arrayList);
        dialogC1761330vw3.LJJZZIII(0, null);
        dialogC1761330vw3.setOnDismissListener(new DialogInterfaceOnDismissListenerC1775910wJZ(interfaceC1752190vhJ, 1));
    }

    public static final void onClick$1(ACListenerS58S0400000_26 aCListenerS58S0400000_26, View view) {
        PdpViewModel pdpViewModel = (PdpViewModel) aCListenerS58S0400000_26.l0;
        C04AS c04as = new C04AS((TryOnData) aCListenerS58S0400000_26.l2, pdpViewModel.LLJJ, (PdpViewModel) aCListenerS58S0400000_26.l0, pdpViewModel.LLILZIL, null, "c2087.d49471", ((C1763840w06) aCListenerS58S0400000_26.l1).getContext(), (C1763840w06) aCListenerS58S0400000_26.l1, (ECBaseFragment) aCListenerS58S0400000_26.l3, "first_image_button", null, null, null, 7184);
        c04as.LIZLLL(null);
        C04AS.LJ(c04as, ((C1763840w06) aCListenerS58S0400000_26.l1).getServerDaInfoMap(), "main_pic");
    }

    public static final void onClick$2(ACListenerS58S0400000_26 aCListenerS58S0400000_26, View view) {
        String str;
        CashierIndependentCVVFragment cashierIndependentCVVFragment = (CashierIndependentCVVFragment) aCListenerS58S0400000_26.l0;
        C1710780ucW c1710780ucW = (C1710780ucW) aCListenerS58S0400000_26.l1;
        C1709570uaZ c1709570uaZ = (C1709570uaZ) aCListenerS58S0400000_26.l2;
        PaymentOption paymentOption = (PaymentOption) aCListenerS58S0400000_26.l3;
        cashierIndependentCVVFragment.getClass();
        String value = c1710780ucW.getValue();
        C1710830ucb c1710830ucbNR = cashierIndependentCVVFragment.NR(paymentOption, value, EnumC1710440uby.SUBMIT);
        C1710070ubN c1710070ubN = cashierIndependentCVVFragment.LLIZ;
        if (c1710070ubN != null) {
            boolean z = cashierIndependentCVVFragment.LLJIJIL;
            InterfaceC1709310ua9 interfaceC1709310ua9LIZIZ = C1708610uZ1.LIZIZ(c1710070ubN.LJ);
            Boolean bool = Boolean.TRUE;
            Map<String, String> mapLIZ = c1710070ubN.LIZ(z);
            if (c1710830ucbNR == null) {
                str = "success";
            } else {
                str = "fail";
            }
            mapLIZ.put("result", str);
            if (c1710830ucbNR != null) {
                mapLIZ.put("fail_reason", c1710830ucbNR.LIZIZ.getDesc());
                mapLIZ.put("error_msg", c1710830ucbNR.LIZ);
                mapLIZ.put("error_type", c1710830ucbNR.LIZIZ.getDesc());
            }
            interfaceC1709310ua9LIZIZ.LJIIL("independent_cvv", "confirm", bool, mapLIZ);
        }
        if (c1710830ucbNR != null) {
            c1710780ucW.LIZJ(c1710830ucbNR);
            C1748440vbG contentView = c1710780ucW.getContentView();
            contentView.getClass();
            C1754660vlI.LIZ(contentView.getContext(), contentView).LJI(false);
            return;
        }
        paymentOption.LJJIFFI(c1709570uaZ, value);
        cashierIndependentCVVFragment.LLJ = "next";
        String str2 = TuxSheet._pnsPageId;
        C1391190mJ3.LJFF(cashierIndependentCVVFragment, C343970De7.LIZ);
        Function0<Unit> function0 = cashierIndependentCVVFragment.LLILZLL;
        if (function0 == null) {
            return;
        }
        function0.invoke();
    }

    public static final void onClick$3(ACListenerS58S0400000_26 aCListenerS58S0400000_26, View view) {
        int i;
        C1748720vbi.LIZLLL((C1749140vcO) aCListenerS58S0400000_26.l0, new AnonymousClass0483(), new AwS392S0200000_26((AddressIdentityAssem) aCListenerS58S0400000_26.l2, (IdentityInfoPanel) aCListenerS58S0400000_26.l3, 127));
        C0HWQ c0hwq = new C0HWQ((Context) aCListenerS58S0400000_26.l1);
        IdentityInfoPanel identityInfoPanel = (IdentityInfoPanel) aCListenerS58S0400000_26.l3;
        C1749140vcO c1749140vcO = (C1749140vcO) aCListenerS58S0400000_26.l0;
        AddressIdentityAssem addressIdentityAssem = (AddressIdentityAssem) aCListenerS58S0400000_26.l2;
        ArrayList arrayList = new ArrayList();
        List<IdentityInfoOption> identityInfoOptions = identityInfoPanel.getIdentityInfoOptions();
        if (identityInfoOptions != null) {
            int i2 = 0;
            for (IdentityInfoOption identityInfoOption : identityInfoOptions) {
                int i3 = i2 + 1;
                String name = null;
                if (i2 >= 0) {
                    IdentityInfoOption identityInfoOption2 = identityInfoOption;
                    C1748720vbi.LIZLLL(c1749140vcO, new AnonymousClass0482(), new AwS107S0201000_26(addressIdentityAssem, identityInfoOption2, i2, 2));
                    String name2 = identityInfoOption2.getName();
                    if (name2 == null) {
                        name2 = "";
                    }
                    AwS154S0400000_26 awS154S0400000_26 = new AwS154S0400000_26(c1749140vcO, addressIdentityAssem, identityInfoOption2, identityInfoPanel, 19);
                    String name3 = identityInfoOption2.getName();
                    IdentityInfoOption identityInfoOption3 = addressIdentityAssem.LLJJ;
                    if (identityInfoOption3 != null) {
                        name = identityInfoOption3.getName();
                    }
                    if (Intrinsics.LJFF(name3, name)) {
                        i = R.raw.icon_tick_fill_small;
                    } else {
                        i = 0;
                    }
                    arrayList.add(new C443090HZb(name2, awS154S0400000_26, 0, null, i, null, 0, false, false, null, 1004));
                    i2 = i3;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
        }
        c0hwq.LJIIL(Collections.singletonList(arrayList));
        c0hwq.LLIZLLLIL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(200));
        c0hwq.LLILZLL = (ViewGroup) ((C1749140vcO) aCListenerS58S0400000_26.l0).getRootView();
        C1749140vcO c1749140vcO2 = (C1749140vcO) aCListenerS58S0400000_26.l0;
        C1391600mJi c1391600mJi = c0hwq.LLILLJJLI;
        c1391600mJi.LIZIZ = c1749140vcO2;
        c1391600mJi.LJIIL = false;
        c1391600mJi.LJIJJ = true;
        int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(50));
        C1391600mJi c1391600mJi2 = c0hwq.LLILLJJLI;
        c1391600mJi2.LJ = iLIZIZ;
        c1391600mJi2.LIZLLL = EnumC1235690iGF.BOTTOM;
        c1391600mJi2.LJII = -1001L;
        c0hwq.LIZIZ().show();
    }

    public static final void onClick$4(ACListenerS58S0400000_26 aCListenerS58S0400000_26, View view) {
        C1715560ukE.LIZ(((C1714750uiv) ((AbstractC1714770uix) aCListenerS58S0400000_26.l2)).LIZ.LIZ, (Fragment) aCListenerS58S0400000_26.l0, (C1713570uh1) aCListenerS58S0400000_26.l1, (Function0) aCListenerS58S0400000_26.l3);
    }

    public static final void onClick$5(ACListenerS58S0400000_26 aCListenerS58S0400000_26, View view) {
        C1715560ukE.LIZJ((Fragment) aCListenerS58S0400000_26.l0, (C1713570uh1) aCListenerS58S0400000_26.l1, ((C1714760uiw) ((AbstractC1714770uix) aCListenerS58S0400000_26.l2)).LIZ, (Function0) aCListenerS58S0400000_26.l3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void onClick$6(ACListenerS58S0400000_26 aCListenerS58S0400000_26, View view) {
        SettingsManager.LIZLLL().getClass();
        if (SettingsManager.LIZ("ame_edit_effect_with_two_icons", true)) {
            C323780Cme.LIZ((Fragment) aCListenerS58S0400000_26.l1, (MobileEffectViewModel) aCListenerS58S0400000_26.l2, (NewFaceStickerBean) aCListenerS58S0400000_26.l0, (Function0) aCListenerS58S0400000_26.l3);
            return;
        }
        String str = EffectMobileTemplateEditActivity._pnsPageId;
        Fragment fragment = (Fragment) aCListenerS58S0400000_26.l1;
        NewFaceStickerBean newFaceStickerBean = (NewFaceStickerBean) aCListenerS58S0400000_26.l0;
        C1776030wJl c1776030wJl = new C1776030wJl((Function0) aCListenerS58S0400000_26.l3, 2);
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(fragment, "//effect-mobile-template/edit");
        smartRouteBuildRoute.withParam("effect_init_data", new MobileEffectData(EnumC1733870vDl.EDIT, null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, newFaceStickerBean, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, false, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 4078));
        smartRouteBuildRoute.withParam("ENTER_FROM", "prop_page");
        smartRouteBuildRoute.open(1001, c1776030wJl);
    }

    public ACListenerS58S0400000_26(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
        this.l3 = obj4;
    }
}
