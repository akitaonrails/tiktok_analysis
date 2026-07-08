package X;

import Y.ARunnableS126S0100000_26;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Icon;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.AiAssistant;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.vm.PdpViewModel;
import com.ss.android.ugc.aweme.ecommerce.core.ab.EcPdpAiAssistantShowPosition;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import g1c.AjS70S0100000_26;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS140S1100000_26;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.04BA, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C04BA {
    public final PdpViewModel LIZ;
    public WeakReference<ViewGroup> LIZIZ = new WeakReference<>(null);
    public Function0<? extends List<? extends InterfaceC997603vC>> LIZJ;
    public final List<InterfaceC1059504Cj> LIZLLL;
    public final Map<String, View> LJ;

    public final void LIZ() {
        C1753110vin c1753110vinLIZIZ;
        ViewGroup viewGroup = this.LIZIZ.get();
        if (viewGroup == null) {
            return;
        }
        Function0<? extends List<? extends InterfaceC997603vC>> function0 = this.LIZJ;
        List<? extends InterfaceC997603vC> listInvoke = function0 != null ? function0.invoke() : null;
        for (InterfaceC1059504Cj interfaceC1059504Cj : (ArrayList) this.LIZLLL) {
            interfaceC1059504Cj.getId();
            if (interfaceC1059504Cj.LIZ(listInvoke, this.LIZ.LLJIJIL) && !this.LJ.containsKey("ai_assistant_entrance") && (c1753110vinLIZIZ = interfaceC1059504Cj.LIZIZ(viewGroup.getContext(), this.LIZ)) != null) {
                this.LJ.put("ai_assistant_entrance", c1753110vinLIZIZ);
                viewGroup.addView(c1753110vinLIZIZ);
            }
        }
    }

    public C04BA(PdpViewModel pdpViewModel) {
        this.LIZ = pdpViewModel;
        ArrayList arrayList = new ArrayList();
        this.LIZLLL = arrayList;
        this.LJ = new LinkedHashMap();
        arrayList.add(new InterfaceC1059504Cj() { // from class: X.0vim
            @Override // X.InterfaceC1059504Cj
            public final void getId() {
            }

            @Override // X.InterfaceC1059504Cj
            public final boolean LIZ(List list, boolean z) {
                Boolean boolValueOf;
                boolean z2 = false;
                if (!z) {
                    return false;
                }
                C0C64 c0c64LJIILLIIL = C0C64.LJIILLIIL();
                EcPdpAiAssistantShowPosition.Config config = EcPdpAiAssistantShowPosition.LIZ;
                EcPdpAiAssistantShowPosition.Config config2 = (EcPdpAiAssistantShowPosition.Config) c0c64LJIILLIIL.LJJII(EcPdpAiAssistantShowPosition.Config.class, config, "ec_pdp_ai_assistant_show", true);
                if (config2 != null) {
                    config = config2;
                }
                if (Intrinsics.LJFF(config.preposed, Boolean.TRUE)) {
                    return true;
                }
                if (list != null) {
                    if (!list.isEmpty()) {
                        Iterator it2 = list.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                break;
                            }
                            if (((InterfaceC997603vC) it2.next()).getBrickName() == EnumC1752690vi7.REVIEW.getValue()) {
                                z2 = true;
                                break;
                            }
                        }
                    }
                    boolValueOf = Boolean.valueOf(z2);
                } else {
                    boolValueOf = null;
                }
                return Intrinsics.LJFF(boolValueOf, Boolean.TRUE);
            }

            @Override // X.InterfaceC1059504Cj
            public final C1753110vin LIZIZ(final Context context, final PdpViewModel pdpViewModel2) {
                final AiAssistant aiAssistant;
                Image icon;
                ProductPackStruct productPackStruct = pdpViewModel2.LLJILLL;
                C1753110vin c1753110vin = null;
                if (productPackStruct != null && (aiAssistant = productPackStruct.aiAssistant) != null) {
                    final String str = aiAssistant.schema;
                    if (str == null || str.length() == 0) {
                        return null;
                    }
                    c1753110vin = new C1753110vin(context);
                    Icon icon2 = aiAssistant.icon;
                    C03DZ.LIZJ(c1753110vin);
                    ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1753110vin);
                    c1753110vin.setAlpha(0.0f);
                    TuxIconView tuxIconView = new TuxIconView(c1753110vin.getContext(), null, 0, 6, null);
                    C786410Ut5.M6(tuxIconView, new FrameLayout.LayoutParams(-1, -1));
                    if (icon2 != null) {
                        Integer viewWidth = icon2.getViewWidth();
                        if (viewWidth != null) {
                            c1753110vin.LLILZ = viewWidth.intValue();
                        }
                        Integer viewHeight = icon2.getViewHeight();
                        if (viewHeight != null) {
                            c1753110vin.LLILZIL = viewHeight.intValue();
                        }
                        if (!C960203pA.LIZIZ(c1753110vin.getContext()) || (icon = icon2.getIconDark()) == null) {
                            icon = icon2.getIcon();
                        }
                        C1326790kdB.LIZ.getClass();
                        C1331670kl3 c1331670kl3LIZLLL = C1326790kdB.LIZLLL(icon);
                        c1331670kl3LIZLLL.LJJ = EnumC1338240kve.FIT_CENTER;
                        c1331670kl3LIZLLL.LJJI(tuxIconView);
                        C786410Ut5.h3(c1331670kl3LIZLLL);
                    }
                    c1753110vin.addView(tuxIconView);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(c1753110vin.LLILZ))), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(c1753110vin.LLILZIL))), 8388613);
                    layoutParams.setMarginEnd(-C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(c1753110vin.LLILZ))));
                    layoutParams.bottomMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
                    ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1753110vin);
                    c1753110vin.setLayoutParams(layoutParams);
                    ViewPropertyAnimator viewPropertyAnimatorWithEndAction = c1753110vin.animate().translationX(-(C418440Gaw.LIZIZ(Integer.valueOf(c1753110vin.LLILZ)) + C418440Gaw.LIZIZ(18))).alpha(1.0f).setDuration(200L).withEndAction(new ARunnableS126S0100000_26(c1753110vin, 83));
                    c1753110vin.LLILLJJLI = viewPropertyAnimatorWithEndAction;
                    if (viewPropertyAnimatorWithEndAction != null) {
                        viewPropertyAnimatorWithEndAction.start();
                    }
                    C786410Ut5.I7(new AjS70S0100000_26(c1753110vin, 78), c1753110vin);
                    C1054004Ag c1054004Ag = pdpViewModel2.LLJLILLLLZIIL;
                    if (c1054004Ag != null) {
                        String str2 = aiAssistant.daInfo;
                        InterfaceC1748810vbr interfaceC1748810vbrLJJIJLIJ = c1054004Ag.LJJIJLIJ();
                        if (interfaceC1748810vbrLJJIJLIJ != null) {
                            C1748720vbi.LIZIZ(interfaceC1748810vbrLJJIJLIJ, new C049X(), new AwS140S1100000_26(c1054004Ag, str2, 65));
                        }
                    }
                    c1753110vin.setOnAiAssistanceEntranceViewClickListener(new InterfaceC1753120vio() { // from class: X.03zX
                        @Override // X.InterfaceC1753120vio
                        public final void LIZ() {
                            String string;
                            Object obj;
                            Map<String, Object> mapLJ = pdpViewModel2.LLILZIL.LJ("c96079.d60603");
                            HashMap<String, Object> mapLJIIJ = C1741890vQh.LJIIJ(aiAssistant.daInfo);
                            HashMap map = new HashMap();
                            if (mapLJIIJ != null) {
                                map.putAll(mapLJIIJ);
                            }
                            C1054004Ag c1054004Ag2 = pdpViewModel2.LLJLILLLLZIIL;
                            if (c1054004Ag2 != null) {
                                if (mapLJIIJ == null || (obj = mapLJIIJ.get("button_name")) == null || (string = obj.toString()) == null) {
                                    string = "ai_assistant";
                                }
                                C1054004Ag.LJIILIIL(c1054004Ag2, string, map, null, mapLJ, 12);
                            }
                            long jCurrentTimeMillis = System.currentTimeMillis();
                            C1053804Ae c1053804Ae = pdpViewModel2.LLILZIL;
                            c1053804Ae.getClass();
                            C919503ib.LIZIZ(context, pdpViewModel2.LLILZIL.LIZIZ(str, c1053804Ae.LJI("c96079.d60603", null)), C2097608Jq.LJI(new Pair("start_click_time", Long.valueOf(jCurrentTimeMillis))), false).open();
                        }
                    });
                }
                return c1753110vin;
            }
        });
    }
}
