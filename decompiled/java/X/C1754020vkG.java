package X;

import Y.ARunnableS126S0100000_26;
import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.os.Handler;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.cardview.widget.CardView;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.service.cartservice.cartbenefit.GetCartEntryRequest;
import com.ss.android.ugc.aweme.ecommerce.service.cartservice.cartbenefit.model.CartBenefitBehave;
import com.ss.android.ugc.aweme.ecommerce.service.cartservice.cartbenefit.model.CartBenefitContentInfo;
import com.ss.android.ugc.aweme.ecommerce.service.cartservice.cartbenefit.model.CartBenefitInfo;
import com.ss.android.ugc.aweme.ecommerce.service.cartservice.cartbenefit.model.CartBenefitItem;
import com.ss.android.ugc.aweme.ecommerce.service.cartservice.cartbenefit.model.CartBenefitStyleType;
import com.ss.android.ugc.aweme.ecommerce.service.cartservice.cartbenefit.model.CartEntryFrom;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS215S0000000_26;
import kotlin.jvm.internal.AwS605S0100000_26;
import kotlin.jvm.internal.AwS9S0220000_26;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0vkG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1754020vkG implements InterfaceC1752700vi8 {
    public final Context LIZ;
    public Function0<? extends Map<String, ? extends Object>> LIZIZ;
    public C099G LIZLLL;
    public C1754070vkL LJ;
    public ViewGroup LJI;
    public View LJII;
    public C7937038d LJIIIIZZ;
    public FrameLayout LJIIIZ;
    public CardView LJIIJ;
    public float LJIIJJI;
    public float LJIIL;
    public boolean LJIILIIL;
    public InterfaceC1754210vkZ LJIILJJIL;
    public InterfaceC1754230vkb LJIILL;
    public InterfaceC1753920vk6 LJIILLIIL;
    public CartBenefitStyleType LJIIZILJ;
    public CartEntryFrom LJIJ;
    public CartBenefitInfo LJIJI;
    public boolean LJIJJ;
    public boolean LJIJJLI;
    public RunnableC1754080vkM LJJ;
    public RunnableC1754130vkR LJJI;
    public Animator LJJIFFI;
    public final EnumC992520bw2 LIZJ = EnumC992520bw2.BLACK_LIST_TYPE;
    public final C01GW LJFF = C452501pT.LIZIZ(AFwS215S0000000_26.get$arr$(484));
    public boolean LJIL = true;
    public final C1753850vjz LJJII = new C1753850vjz(this);
    public final ARunnableS126S0100000_26 LJJIII = new ARunnableS126S0100000_26(this, 108);

    @Override // X.InterfaceC1752700vi8
    public final void LIZ() {
        C1754070vkL c1754070vkL = this.LJ;
        if (c1754070vkL == null || c1754070vkL.LJ || !c1754070vkL.LIZIZ()) {
            return;
        }
        BPEAHandler bPEAHandler = c1754070vkL.LIZJ;
        if (bPEAHandler != null) {
            bPEAHandler.removeCallbacks(c1754070vkL.LJIILL);
        }
        c1754070vkL.LIZ();
        c1754070vkL.LJIIL.invoke();
    }

    public C1754020vkG(Context context) {
        this.LIZ = context;
    }

    @Override // X.InterfaceC1752700vi8
    public final void LIZIZ(Float f) {
        if (f == null) {
            C1754070vkL c1754070vkL = this.LJ;
            if (c1754070vkL != null) {
                c1754070vkL.LIZJ(null, null);
                return;
            }
            return;
        }
        C1754070vkL c1754070vkL2 = this.LJ;
        if (c1754070vkL2 == null) {
            return;
        }
        c1754070vkL2.LIZJ(this.LJII, f);
    }

    @Override // X.InterfaceC1752700vi8
    public final void LIZJ(InterfaceC1753920vk6 interfaceC1753920vk6) {
        this.LJIILLIIL = interfaceC1753920vk6;
    }

    @Override // X.InterfaceC1752700vi8
    public final void LIZLLL(InterfaceC1754210vkZ interfaceC1754210vkZ) {
        this.LJIILJJIL = interfaceC1754210vkZ;
    }

    @Override // X.InterfaceC1752700vi8
    public final void LJ(GetCartEntryRequest getCartEntryRequest) {
        C099G c099gLIZIZ;
        LifecycleCoroutineScope lifecycleScope;
        if (!this.LJIL) {
            return;
        }
        this.LJIILIIL = false;
        this.LJIJ = getCartEntryRequest.cartEntryFrom;
        C099G c099g = this.LIZLLL;
        if (c099g != null && c099g.isActive()) {
            C099G c099g2 = this.LIZLLL;
            if (c099g2 != null) {
                c099g2.LIZIZ(null);
            }
            this.LIZLLL = null;
        }
        C19EG c19egLIZIZ = C1388190mED.LIZIZ(this.LIZ);
        if (c19egLIZIZ != null && (lifecycleScope = LifecycleOwnerKt.getLifecycleScope(c19egLIZIZ)) != null) {
            c099gLIZIZ = C23250099c.LIZIZ(lifecycleScope, null, null, new C1754040vkI(this, getCartEntryRequest, null), 3);
        } else {
            c099gLIZIZ = C23250099c.LIZIZ(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C1754050vkJ(this, getCartEntryRequest, null), 3);
        }
        this.LIZLLL = c099gLIZIZ;
    }

    @Override // X.InterfaceC1752700vi8
    public final void LJFF(InterfaceC1754230vkb interfaceC1754230vkb) {
        this.LJIILL = interfaceC1754230vkb;
    }

    @Override // X.InterfaceC1752700vi8
    public final void LJII(Function0<? extends Map<String, ? extends Object>> function0) {
        this.LIZIZ = function0;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x006d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIIIZZ(com.ss.android.ugc.aweme.ecommerce.service.cartservice.cartbenefit.model.CartBenefitItem r12) {
        /*
            r11 = this;
            if (r12 != 0) goto L3
            return
        L3:
            com.ss.android.ugc.aweme.ecommerce.service.cartservice.cartbenefit.model.CartBenefitStyleInfo r1 = r12.styleInfo
            r10 = 0
            if (r1 == 0) goto L93
            android.content.Context r0 = r11.LIZ
            boolean r0 = X.C960203pA.LIZIZ(r0)
            if (r0 == 0) goto L8e
            java.lang.String r2 = r1.descColorDark
            java.lang.String r0 = r1.bgColorDark
        L14:
            X.0vka r1 = new X.0vka
            r1.<init>(r2, r0)
        L19:
            X.038d r4 = r11.LJIIIIZZ
            if (r4 == 0) goto L85
            if (r1 == 0) goto L8c
            java.lang.String r0 = r1.LIZIZ
        L21:
            r4.setBackgroundColor(r0)
            if (r1 == 0) goto L8a
            java.lang.String r0 = r1.LIZ
        L28:
            r4.setContentColor(r0)
            com.ss.android.ugc.aweme.ecommerce.service.cartservice.cartbenefit.model.CartBenefitContentInfo r0 = r12.contentInfo
            if (r0 == 0) goto L88
            com.ss.android.ugc.aweme.ecommerce.base.common.model.Icon r1 = r0.icon
            if (r1 == 0) goto L88
            android.content.Context r0 = r4.getContext()
            com.ss.android.ugc.aweme.ecommerce.service.vo.Image r2 = r1.requireImage(r0)
        L3b:
            com.ss.android.ugc.aweme.ecommerce.service.cartservice.cartbenefit.model.CartBenefitContentInfo r0 = r12.contentInfo
            if (r0 == 0) goto L86
            java.lang.String r3 = r0.desc
        L41:
            if (r2 == 0) goto L6d
            com.bytedance.lighten.loader.SmartImageView r1 = r4.getIvIconFromXml()
            if (r1 == 0) goto L53
            int r0 = r1.getVisibility()
            if (r0 == 0) goto L53
            r0 = 0
            X.C786410Ut5.LJLLLLLL(r0, r1)
        L53:
            java.lang.Class<com.ss.android.ugc.aweme.ecommerce.service.cartservice.cartbenefit.view.ILightenUtilsService> r5 = com.ss.android.ugc.aweme.ecommerce.service.cartservice.cartbenefit.view.ILightenUtilsService.class
            r6 = 0
            r9 = 14
            r7 = r6
            r8 = r6
            java.lang.Object r1 = com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt.pluggableSpi$default(r5, r6, r7, r8, r9, r10)
            com.ss.android.ugc.aweme.ecommerce.service.cartservice.cartbenefit.view.ILightenUtilsService r1 = (com.ss.android.ugc.aweme.ecommerce.service.cartservice.cartbenefit.view.ILightenUtilsService) r1
            if (r1 == 0) goto L6d
            com.bytedance.lighten.loader.SmartImageView r0 = r4.getIvIconFromXml()
            r1.LIZ(r2, r0)
            kotlin.Unit r0 = kotlin.Unit.LIZ
            if (r0 != 0) goto L7e
        L6d:
            com.bytedance.lighten.loader.SmartImageView r2 = r4.getIvIconFromXml()
            if (r2 == 0) goto L7e
            int r1 = r2.getVisibility()
            r0 = 8
            if (r1 == r0) goto L7e
            X.C786410Ut5.LJLLLLLL(r0, r2)
        L7e:
            com.bytedance.tux.input.TuxTextView r0 = r4.getTvContentFromXml()
            r0.setText(r3)
        L85:
            return
        L86:
            r3 = r10
            goto L41
        L88:
            r2 = r10
            goto L3b
        L8a:
            r0 = r10
            goto L28
        L8c:
            r0 = r10
            goto L21
        L8e:
            java.lang.String r2 = r1.descColor
            java.lang.String r0 = r1.bgColor
            goto L14
        L93:
            r1 = r10
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1754020vkG.LJIIIIZZ(com.ss.android.ugc.aweme.ecommerce.service.cartservice.cartbenefit.model.CartBenefitItem):void");
    }

    public final void LJIILIIL(CartBenefitInfo cartBenefitInfo) {
        this.LJIJJLI = true;
        C7937038d c7937038d = this.LJIIIIZZ;
        if (c7937038d != null) {
            C786410Ut5.M(c7937038d, 4);
        }
        CardView cardView = this.LJIIJ;
        if (cardView != null) {
            C786410Ut5.LLILLL(cardView, 8);
        }
        CartBenefitItem cartBenefitItem = cartBenefitInfo.staticItem;
        if (cartBenefitItem == null) {
            return;
        }
        LJIIIIZZ(cartBenefitItem);
        View view = this.LJII;
        if (view != null) {
            C0NC6.LIZIZ(view, true, new AwS605S0100000_26(this, 757));
        }
        CartBenefitStyleType cartBenefitStyleType = this.LJIIZILJ;
        if (cartBenefitStyleType != CartBenefitStyleType.DYNAMIC_TAG && cartBenefitStyleType != CartBenefitStyleType.SIDE_SLIP) {
            LJIIJJI(CartBenefitBehave.BUBBLE_SHOW, cartBenefitInfo);
        }
        InterfaceC1754230vkb interfaceC1754230vkb = this.LJIILL;
        if (interfaceC1754230vkb != null) {
            interfaceC1754230vkb.LIZ(cartBenefitInfo);
        }
    }

    @Override // X.InterfaceC1752700vi8
    public final void release(boolean z) {
        C099G c099g;
        ((Handler) this.LJFF.getValue()).removeCallbacks(this.LJJIII);
        C0NC6.LIZ(this.LJI);
        C0NC6.LIZ(this.LJII);
        C0NC6.LIZ(this.LJIIIIZZ);
        this.LJI = null;
        this.LJII = null;
        this.LJIIIIZZ = null;
        this.LJIIJ = null;
        if (z && (c099g = this.LIZLLL) != null) {
            c099g.LIZIZ(null);
        }
    }

    public final Object LJIIIZ(List<CartBenefitInfo> list, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) throws Throwable {
        if (list == null) {
            C7937038d c7937038d = this.LJIIIIZZ;
            if (c7937038d != null) {
                C786410Ut5.M(c7937038d, 4);
            }
            CardView cardView = this.LJIIJ;
            if (cardView != null) {
                C786410Ut5.LLILLL(cardView, 8);
            }
            return Unit.LIZ;
        }
        C1DFH c1dfh = C0PEM.LIZ;
        Object objLJI = C23250099c.LJI(interfaceC1364105Vn, C2107308Nj.LIZ, new C1754030vkH(list, this, null));
        if (objLJI == C099R.LJFF()) {
            return objLJI;
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00ce  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIIJ(com.ss.android.ugc.aweme.ecommerce.service.cartservice.cartbenefit.GetCartEntryRequest r9, X.InterfaceC1364105Vn<? super com.ss.android.ugc.aweme.ecommerce.api.model.Response<com.ss.android.ugc.aweme.ecommerce.service.cartservice.cartbenefit.GetCartEntryResponseData>> r10) {
        /*
            Method dump skipped, instruction units count: 216
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1754020vkG.LJIIJ(com.ss.android.ugc.aweme.ecommerce.service.cartservice.cartbenefit.GetCartEntryRequest, X.05Vn):java.lang.Object");
    }

    public final void LJIIJJI(CartBenefitBehave cartBenefitBehave, CartBenefitInfo cartBenefitInfo) {
        String str;
        boolean z;
        String str2;
        CartBenefitContentInfo cartBenefitContentInfo;
        CartBenefitContentInfo cartBenefitContentInfo2;
        try {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Function0<? extends Map<String, ? extends Object>> function0 = this.LIZIZ;
            if (function0 != null) {
                linkedHashMap.putAll(function0.invoke());
            }
            linkedHashMap.putAll(C1010603xI.LIZ(cartBenefitInfo.daInfo));
            CartBenefitItem cartBenefitItem = cartBenefitInfo.dynamicItem;
            if (cartBenefitItem != null && (cartBenefitContentInfo2 = cartBenefitItem.contentInfo) != null) {
                str = cartBenefitContentInfo2.desc;
            } else {
                str = null;
            }
            if (str != null && !a0.LJJJIL(str)) {
                z = false;
            } else {
                z = true;
            }
            linkedHashMap.put("is_bubble_text_show", C893803eS.LIZ(!z));
            CartBenefitItem cartBenefitItem2 = cartBenefitInfo.dynamicItem;
            if (cartBenefitItem2 != null && (cartBenefitContentInfo = cartBenefitItem2.contentInfo) != null && cartBenefitContentInfo.schema != null && cartBenefitBehave == CartBenefitBehave.BUBBLE_SHOW) {
                linkedHashMap.put("is_bubble_clickable", C893803eS.LIZ(true));
            }
            C1507790pL7 c1507790pL7 = C1507790pL7.LIZ;
            int i = C1753960vkA.LIZIZ[cartBenefitBehave.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    str2 = "";
                } else {
                    str2 = "tiktokec_bubble_click";
                }
            } else {
                str2 = "tiktokec_bubble_show";
            }
            JSONObject jSONObject = new JSONObject(linkedHashMap);
            c1507790pL7.getClass();
            C1507790pL7.LIZLLL(str2, jSONObject);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        C23250099c.LIZLLL(C817503Hh.LL, null, null, new C1753970vkB(this, cartBenefitBehave, cartBenefitInfo, null), 3);
    }

    public final void LJIIL(CartBenefitInfo cartBenefitInfo, boolean z, boolean z2) {
        C7937038d c7937038d;
        C1754070vkL c1754070vkL = this.LJ;
        if (c1754070vkL != null && c1754070vkL.LIZIZ()) {
            return;
        }
        if (!this.LJIILIIL && cartBenefitInfo.dynamicItem != null) {
            if (this.LJIIJ == null && (c7937038d = this.LJIIIIZZ) != null) {
                C786410Ut5.M(c7937038d, 4);
            }
            CardView cardView = this.LJIIJ;
            if (cardView != null) {
                C786410Ut5.LLILLL(cardView, 8);
            }
            View view = this.LJII;
            if (view != null) {
                C0NC6.LIZIZ(view, true, new AwS9S0220000_26(this, z, cartBenefitInfo, z2, 3));
                return;
            }
            return;
        }
        if (z) {
            LJIILIIL(cartBenefitInfo);
        }
    }

    public final void LJIILJJIL(View view, float f, float f2, AbstractC1754190vkX abstractC1754190vkX) {
        Animator animator = this.LJJIFFI;
        if (animator != null) {
            animator.cancel();
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.TRANSLATION_X, f, f2);
        this.LJJIFFI = objectAnimatorOfFloat;
        objectAnimatorOfFloat.setDuration(500L);
        objectAnimatorOfFloat.addListener(abstractC1754190vkX);
        C786410Ut5.Pd(objectAnimatorOfFloat);
    }

    @Override // X.InterfaceC1752700vi8
    public final void LJI(ViewGroup viewGroup, View view, C7937038d c7937038d, float f, float f2, CardView cardView, FrameLayout frameLayout) {
        C1753840vjy c1753840vjy;
        boolean z = false;
        if (!Intrinsics.LJFF(viewGroup, this.LJI) || !Intrinsics.LJFF(view, this.LJII) || !Intrinsics.LJFF(c7937038d, this.LJIIIIZZ)) {
            release(false);
            z = true;
        }
        this.LJI = viewGroup;
        this.LJII = view;
        this.LJIIIIZZ = c7937038d;
        this.LJIIJ = cardView;
        this.LJIIJJI = C418440Gaw.LIZIZ(Float.valueOf(f));
        this.LJIIL = C418440Gaw.LIZIZ(Float.valueOf(f2));
        this.LJIIIZ = frameLayout;
        if (z) {
            C1754010vkF c1754010vkF = new C1754010vkF(this, null);
            C19EG c19egLIZIZ = C1388190mED.LIZIZ(this.LIZ);
            if (c19egLIZIZ != null) {
                C948503nH.LJ(c19egLIZIZ, C23271099x.INSTANCE, new C319601Lu(c1754010vkF, null));
            } else {
                C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C319701Lv(c1754010vkF, null), 3);
            }
        }
        if ((view instanceof C1753840vjy) && (c1753840vjy = (C1753840vjy) view) != null) {
            c1753840vjy.setOnClickListener(new InterfaceC1753950vk9() { // from class: X.0vkO
                @Override // X.InterfaceC1753950vk9
                public final void LIZIZ() {
                    CartBenefitInfo cartBenefitInfo;
                    C1754020vkG c1754020vkG = this.LIZ;
                    RunnableC1754080vkM runnableC1754080vkM = c1754020vkG.LJJ;
                    if (runnableC1754080vkM != null) {
                        FrameLayout frameLayout2 = c1754020vkG.LJIIIZ;
                        if (frameLayout2 != null) {
                            HandlerHook.viewRemoveCallbacks(frameLayout2, runnableC1754080vkM);
                        }
                        C1754020vkG c1754020vkG2 = this.LIZ;
                        FrameLayout frameLayout3 = c1754020vkG2.LJIIIZ;
                        if (frameLayout3 != null) {
                            HandlerHook.viewRemoveCallbacks(frameLayout3, c1754020vkG2.LJJI);
                        }
                        C1754020vkG c1754020vkG3 = this.LIZ;
                        c1754020vkG3.LJJ = null;
                        c1754020vkG3.LJJI = null;
                    }
                    FrameLayout frameLayout4 = this.LIZ.LJIIIZ;
                    if (frameLayout4 != null) {
                        C786410Ut5.LJZ(8, frameLayout4);
                    }
                    C1754020vkG c1754020vkG4 = this.LIZ;
                    C7937038d c7937038d2 = c1754020vkG4.LJIIIIZZ;
                    if (c7937038d2 != null) {
                        HandlerHook.viewPostDelay(c7937038d2, new ARunnableS126S0100000_26(c1754020vkG4, 109), 300L);
                    }
                    C1754020vkG c1754020vkG5 = this.LIZ;
                    if ((c1754020vkG5.LJIJJ || c1754020vkG5.LJIJJLI) && (cartBenefitInfo = c1754020vkG5.LJIJI) != null) {
                        c1754020vkG5.LJIIJJI(CartBenefitBehave.BUBBLE_CLICK, cartBenefitInfo);
                    }
                }
            });
        }
    }
}
