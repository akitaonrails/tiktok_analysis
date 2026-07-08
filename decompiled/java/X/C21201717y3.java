package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import com.bytedance.tt.reliability.monitor.viewchecker.RemoveViewCausedNPEChecker;
import com.ss.android.ugc.aweme.ecommercelive.common.biz.sea.ability.ISeaLiveContextAbility;
import com.ss.android.ugc.aweme.ecommercelive.common.biz.sea.ability.SeaLiveContextAbility;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.BFFCardConfig;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.PopupCardBffData;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.Product;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.popcard.vo.PopupCardVO;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS576S0100000_32;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.17y3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21201717y3 extends AnonymousClass1830 implements InterfaceC1141530foN {
    public C182N LLILZIL;
    public C1155180gAO LLILZLL;
    public C21197717xP LLIZ;
    public SeaLiveContextAbility LLIZLLLIL;
    public C21200317xp LLJ;
    public C099F LLJI;
    public int LLJIJIL;
    public Function0<Unit> LLJILJIL;
    public boolean LLJILJILJ;

    @Override // X.AnonymousClass1830
    public final String e0(View view) {
        return "c7998.d5945";
    }

    @Override // X.AnonymousClass1830
    public final int i0(View view) {
        return 3;
    }

    public final void s0() {
        String str;
        String str2;
        final C21197717xP c21197717xP;
        BFFCardConfig bFFCardConfig;
        BFFCardConfig bFFCardConfig2;
        C1155180gAO c1155180gAO = this.LLILZLL;
        if (c1155180gAO == null) {
            return;
        }
        final PopupCardVO popupCardVO = c1155180gAO.LIZ;
        SeaLiveContextAbility seaLiveContextAbility = this.LLIZLLLIL;
        if (seaLiveContextAbility != null) {
            p0(seaLiveContextAbility, c1155180gAO);
        } else {
            seaLiveContextAbility = new SeaLiveContextAbility(null, null);
            p0(seaLiveContextAbility, c1155180gAO);
            this.LLIZLLLIL = seaLiveContextAbility;
        }
        final C21200317xp c21200317xp = this.LLJ;
        if (c21200317xp == null) {
            c21200317xp = new C21200317xp((C599380Nf6) seaLiveContextAbility.LLILZIL.getValue());
            this.LLJ = c21200317xp;
        }
        C21197717xP c21197717xP2 = this.LLIZ;
        PopupCardVO popupCardVO2 = c1155180gAO.LIZ;
        PopupCardBffData popupCardBffData = popupCardVO2.bffData;
        if (popupCardBffData == null || (bFFCardConfig2 = popupCardBffData.cardConfig) == null || (str = bFFCardConfig2.cardSchema) == null) {
            str = popupCardVO2.lynxCardSchema;
        }
        if (str == null || str.length() == 0 || !(c21197717xP2 instanceof C21197717xP)) {
            C21197717xP c21197717xP3 = this.LLIZ;
            if (c21197717xP3 != null) {
                c21197717xP3.e0();
            }
            PopupCardVO popupCardVO3 = c1155180gAO.LIZ;
            PopupCardBffData popupCardBffData2 = popupCardVO3.bffData;
            if (((popupCardBffData2 == null || (bFFCardConfig = popupCardBffData2.cardConfig) == null || (str2 = bFFCardConfig.cardSchema) == null) && (str2 = popupCardVO3.lynxCardSchema) == null) || str2.length() == 0) {
                c21197717xP = null;
            } else {
                c21197717xP = new C21197717xP(getContext());
                C19ME c19me = new C19ME(-1, -1);
                ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c21197717xP);
                c21197717xP.setLayoutParams(c19me);
                c21197717xP.u0(seaLiveContextAbility, c21200317xp);
                c21197717xP.LLILLJJLI = new C181I() { // from class: X.17uC
                    @Override // X.C181I
                    public final void LIZ(String str3, Product product, Integer num) {
                    }

                    @Override // X.C181I
                    public final void LIZLLL(Map<String, String> map) {
                    }

                    @Override // X.C181I
                    public final void LJII(int i) {
                    }

                    @Override // X.C181I
                    public final void LJIIIIZZ(Map<String, String> map) {
                    }

                    @Override // X.C181I
                    public final void LJIIIZ(int i) {
                    }

                    @Override // X.C181I
                    public final void LJIILIIL(Map<String, String> map) {
                    }

                    @Override // X.C181I
                    public final void LJIILJJIL(Product product) {
                    }

                    @Override // X.C181I
                    public final void LJIILLIIL(PopupCardVO popupCardVO4, boolean z, boolean z2, boolean z3, long j) {
                    }

                    @Override // X.C181I
                    public final void LJIJJLI(String str3) {
                    }

                    @Override // X.C181I
                    public final void LJIL() {
                    }

                    @Override // X.C181I
                    public final void LJ() {
                        Function0<Unit> function0 = this.LL.LLJILJIL;
                        if (function0 != null) {
                            function0.invoke();
                        }
                    }
                };
                RemoveViewCausedNPEChecker.recordViewRemovedPoint(this, null);
                removeAllViews();
                addView(c21197717xP);
            }
            this.LLIZ = c21197717xP;
        } else {
            c21197717xP = this.LLIZ;
        }
        if (c21197717xP == null) {
            C099F c099f = this.LLJI;
            if (c099f != null) {
                c099f.LJJLIIIJILLIZJL(Boolean.FALSE);
                return;
            }
            return;
        }
        String str3 = popupCardVO.lynxCardSchema;
        if (str3 == null) {
            str3 = "";
        }
        C1783930wWV c1783930wWVN0 = c21197717xP.n0(popupCardVO, str3, 2, true);
        final int i = 1 + this.LLJIJIL;
        this.LLJIJIL = i;
        C099F c099f2 = this.LLJI;
        if (c099f2 != null) {
            c099f2.LIZIZ(null);
        }
        this.LLJI = C090F.LIZIZ();
        c21200317xp.LIZIZ(getContext(), c1783930wWVN0.LIZIZ, c1783930wWVN0.LIZ, seaLiveContextAbility, new InterfaceC21200817xu() { // from class: X.17xq
            @Override // X.InterfaceC21200817xu
            public final void LIZ() {
            }

            @Override // X.InterfaceC21200817xu
            public final void LIZIZ(boolean z, String str4, C1783920wWU c1783920wWU, InterfaceC21200617xs interfaceC21200617xs) {
                C1776350wKH c1776350wKH;
                int i2 = i;
                C21201717y3 c21201717y3 = this;
                if (i2 != c21201717y3.LLJIJIL) {
                    return;
                }
                if (z && interfaceC21200617xs != null) {
                    C21200317xp c21200317xp2 = c21200317xp;
                    if (c1783920wWU == null) {
                        c1776350wKH = null;
                    } else {
                        c21200317xp2.getClass();
                        c1776350wKH = new C1776350wKH(c1783920wWU.LIZ);
                    }
                    c21200317xp2.LIZLLL = c1776350wKH;
                    if (c1776350wKH != null) {
                        c21200317xp2.LIZJ.put(c1776350wKH, interfaceC21200617xs);
                    }
                    AbstractC21200217xo abstractC21200217xo = c21197717xP;
                    PopupCardVO popupCardVO4 = popupCardVO;
                    C21201717y3 c21201717y32 = this;
                    c21201717y32.getClass();
                    abstractC21200217xo.i0(popupCardVO4, null, new AwS576S0100000_32(c21201717y32, 502), true, false, 0);
                    C099F c099f3 = this.LLJI;
                    if (c099f3 != null) {
                        c099f3.LJJLIIIJILLIZJL(Boolean.TRUE);
                        return;
                    }
                    return;
                }
                C099F c099f4 = c21201717y3.LLJI;
                if (c099f4 != null) {
                    c099f4.LJJLIIIJILLIZJL(Boolean.FALSE);
                }
            }
        });
    }

    private final String getCurrentContainerId() {
        InterfaceC1541990qEH interfaceC1541990qEH;
        C1537480q70 hybridContext;
        C21197717xP c21197717xP = this.LLIZ;
        KeyEvent.Callback childAt = (!(c21197717xP instanceof ViewGroup) || c21197717xP == null) ? null : c21197717xP.getChildAt(0);
        if (!(childAt instanceof InterfaceC1541990qEH) || (interfaceC1541990qEH = (InterfaceC1541990qEH) childAt) == null || (hybridContext = interfaceC1541990qEH.getHybridContext()) == null) {
            return null;
        }
        return hybridContext.containerId;
    }

    public final void u0() {
        if (this.LLJILJILJ) {
            this.LLJILJILJ = false;
            Iterator it2 = C13LQ.LJLIIL(new String[]{"ec_lynx_card_click", "ec_content_pin_card_action"}).iterator();
            while (it2.hasNext()) {
                C1548820qPI.LJIIIIZZ((String) it2.next(), this);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.LLJILJILJ) {
            return;
        }
        this.LLJILJILJ = true;
        Iterator it2 = C13LQ.LJLIIL(new String[]{"ec_lynx_card_click", "ec_content_pin_card_action"}).iterator();
        while (it2.hasNext()) {
            C1548820qPI.LIZLLL((String) it2.next(), this);
        }
    }

    @Override // X.AnonymousClass1830
    public final void onDestroy() {
        u0();
        this.LLJIJIL++;
        C099F c099f = this.LLJI;
        if (c099f != null) {
            c099f.LIZIZ(null);
        }
        this.LLJI = null;
        this.LLJILJIL = null;
        C21197717xP c21197717xP = this.LLIZ;
        if (c21197717xP != null) {
            c21197717xP.e0();
        }
        this.LLIZ = null;
        C21200317xp c21200317xp = this.LLJ;
        if (c21200317xp != null) {
            c21200317xp.LIZLLL();
        }
        this.LLJ = null;
        this.LLIZLLLIL = null;
        this.LLILZLL = null;
        RemoveViewCausedNPEChecker.recordViewRemovedPoint(this, null);
        removeAllViews();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        u0();
        super.onDetachedFromWindow();
    }

    @Override // X.AnonymousClass1830
    public final Map<String, String> h0(View view) {
        int iIntValue;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C182N c182n = this.LLILZIL;
        String strLIZJ = null;
        if (c182n != null) {
            strLIZJ = c182n.LIZJ();
        }
        String str = "";
        if (strLIZJ == null) {
            strLIZJ = "";
        }
        linkedHashMap.put("product_id", strLIZJ);
        linkedHashMap.put("is_lynx", "1");
        C182N c182n2 = this.LLILZIL;
        if (c182n2 != null) {
            Integer num = c182n2.LJ;
            if (num != null) {
                iIntValue = num.intValue();
            } else {
                iIntValue = 1;
            }
            String string = Integer.valueOf(iIntValue).toString();
            if (string != null) {
                str = string;
            }
        }
        linkedHashMap.put("card_type", str);
        return linkedHashMap;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object l0(X.InterfaceC1364105Vn<? super java.lang.Boolean> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof X.C21163917rx
            if (r0 == 0) goto L3d
            r4 = r6
            X.17rx r4 = (X.C21163917rx) r4
            int r2 = r4.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L3d
            int r2 = r2 - r1
            r4.LLILLL = r2
        L12:
            java.lang.Object r3 = r4.LL
            java.lang.Object r2 = X.C099R.LJFF()
            int r0 = r4.LLILLL
            r1 = 1
            if (r0 == 0) goto L2d
            if (r0 != r1) goto L43
            X.C155000ia.LIZIZ(r3)
        L22:
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r1 = r3.booleanValue()
        L28:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            return r0
        L2d:
            X.C155000ia.LIZIZ(r3)
            X.099F r0 = r5.LLJI
            if (r0 == 0) goto L28
            r4.LLILLL = r1
            java.lang.Object r3 = r0.LJLIIIL(r4)
            if (r3 != r2) goto L22
            return r2
        L3d:
            X.17rx r4 = new X.17rx
            r4.<init>(r5, r6)
            goto L12
        L43:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21201717y3.l0(X.05Vn):java.lang.Object");
    }

    @Override // X.InterfaceC1141530foN
    public final void mh2(C262100zr c262100zr) throws Throwable {
        String string;
        String currentContainerId;
        View.OnClickListener actionClickListener;
        Integer numValueOf;
        InterfaceC1107590evd interfaceC1107590evd = c262100zr.LIZIZ;
        if (interfaceC1107590evd != null && (string = interfaceC1107590evd.getString("container_id")) != null && string.length() != 0 && (currentContainerId = getCurrentContainerId()) != null && currentContainerId.length() != 0 && Intrinsics.LJFF(currentContainerId, string)) {
            String str = c262100zr.LIZ;
            if (Intrinsics.LJFF(str, "ec_lynx_card_click")) {
                int iLIZLLL = C1871910yoP.LIZLLL(interfaceC1107590evd, "should_close_card", 0);
                InterfaceC1107590evd interfaceC1107590evdLJ = C1871910yoP.LJ(interfaceC1107590evd, "route_page");
                if (interfaceC1107590evdLJ != null) {
                    numValueOf = Integer.valueOf(C1871910yoP.LIZLLL(interfaceC1107590evdLJ, "page", 0));
                } else {
                    numValueOf = null;
                }
                if (iLIZLLL == 1) {
                    new AwS576S0100000_32(this, 502).invoke();
                }
                if (numValueOf != null && numValueOf.intValue() == 4) {
                    performClick();
                    return;
                }
                return;
            }
            if (!Intrinsics.LJFF(str, "ec_content_pin_card_action") || C1871910yoP.LIZLLL(interfaceC1107590evd, "action_type", 0) != 2 || (actionClickListener = getActionClickListener()) == null) {
                return;
            }
            actionClickListener.onClick(this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0052 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void n0(X.C1155180gAO r5) {
        /*
            r4 = this;
            r4.LLILZLL = r5
            if (r5 == 0) goto L41
            com.ss.android.ugc.aweme.ecommercelive.common.infra.popcard.vo.PopupCardVO r0 = r5.LIZ
            com.ss.android.ugc.aweme.ecommercelive.common.infra.data.PopupCardBffData r0 = r0.bffData
            r3 = 0
            if (r0 == 0) goto L52
            com.ss.android.ugc.aweme.ecommercelive.common.infra.data.BFFUIConfig r0 = r0.cardUiConfig
            if (r0 == 0) goto L52
            java.lang.Float r0 = r0.height
            if (r0 == 0) goto L52
            float r0 = r0.floatValue()
            int r0 = (int) r0
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            int r0 = r1.intValue()
            if (r0 <= 0) goto L52
            float r0 = X.C418440Gaw.LIZIZ(r1)
            int r3 = X.C814420VxA.LIZIZ(r0)
        L2a:
            android.view.ViewGroup$LayoutParams r2 = r4.getLayoutParams()
            boolean r0 = r2 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r0 == 0) goto L45
            r1 = r2
            android.view.ViewGroup$MarginLayoutParams r1 = (android.view.ViewGroup.MarginLayoutParams) r1
            int r0 = r1.height
            if (r0 == r3) goto L41
            r1.height = r3
            X.ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(r4)
            r4.setLayoutParams(r2)
        L41:
            r4.s0()
            return
        L45:
            android.view.ViewGroup$MarginLayoutParams r1 = new android.view.ViewGroup$MarginLayoutParams
            r0 = -1
            r1.<init>(r0, r3)
            X.ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(r4)
            r4.setLayoutParams(r1)
            goto L41
        L52:
            android.content.Context r0 = r4.getContext()     // Catch: android.content.res.Resources.NotFoundException -> L62
            android.content.res.Resources r1 = r0.getResources()     // Catch: android.content.res.Resources.NotFoundException -> L62
            r0 = 2131297013(0x7f0902f5, float:1.8211959E38)
            int r3 = r1.getDimensionPixelOffset(r0)     // Catch: android.content.res.Resources.NotFoundException -> L62
            goto L2a
        L62:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            goto L2a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21201717y3.n0(X.0gAO):void");
    }

    public final void setOnOverlayFirstShownListener(Function0<Unit> function0) {
        this.LLJILJIL = function0;
    }

    @Override // X.AnonymousClass1830
    public final void j0(C182N c182n, long j) {
        this.LLILZIL = c182n;
        s0();
    }

    public final void p0(ISeaLiveContextAbility iSeaLiveContextAbility, C1155180gAO c1155180gAO) {
        String str;
        C182N c182n = this.LLILZIL;
        if (c182n == null || (str = c182n.LJII) == null) {
            str = "";
        }
        InterfaceC599740Nfg interfaceC599740NfgSU1 = iSeaLiveContextAbility.SU1();
        interfaceC599740NfgSU1.LIZLLL("room_id", str, EnumC599400Nf8.NATIVE, C2097608Jq.LJ());
        interfaceC599740NfgSU1.LIZLLL("author_id", c1155180gAO.LIZIZ, EnumC599400Nf8.NATIVE, C2097608Jq.LJ());
        interfaceC599740NfgSU1.LIZLLL("role_type", 2, EnumC599400Nf8.NATIVE, C2097608Jq.LJ());
        interfaceC599740NfgSU1.LIZLLL("async_load", Boolean.FALSE, EnumC599400Nf8.NATIVE, C2097608Jq.LJ());
        InterfaceC599460NfE interfaceC599460NfEHW1 = iSeaLiveContextAbility.hW1();
        interfaceC599460NfEHW1.LIZ(Long.valueOf(System.currentTimeMillis()), "click_enter_room_time");
        interfaceC599460NfEHW1.LIZ(str, "room_id");
        interfaceC599460NfEHW1.LIZ(c1155180gAO.LIZIZ, "author_id");
        interfaceC599460NfEHW1.LIZ("live_preview_card", "entrance_form");
        interfaceC599460NfEHW1.LIZ("TEMAI", "EVENT_ORIGIN_FEATURE");
        for (Map.Entry<String, Object> entry : c1155180gAO.LIZJ.entrySet()) {
            interfaceC599460NfEHW1.LIZ(entry.getValue(), entry.getKey());
        }
    }

    public C21201717y3(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setBackground(C800330VaR.LIZIZ(new ContextThemeWrapper(getContext(), R.style.z5), R.drawable.bmh));
        setClipToOutline(true);
        setClipChildren(true);
        setOutlineProvider(ViewOutlineProvider.BACKGROUND);
    }
}
