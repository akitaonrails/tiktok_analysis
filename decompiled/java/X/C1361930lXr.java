package X;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.multi.maker.PoiAnchorMaker;
import com.ss.android.ugc.aweme.multi.maker.ServicePluginAnchorMaker;
import com.ss.android.ugc.aweme.multi.maker.ShopWindowAnchorMaker;
import com.ss.android.ugc.aweme.platform.AnchorEventCenter;
import com.ss.android.ugc.aweme.poi_api.service.IPoiService;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS209S0000000_21;
import kotlin.jvm.internal.AFwS259S0000000_21;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: renamed from: X.0lXr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1361930lXr extends FrameLayout {
    public final SmartImageView LL;
    public final TuxTextView LLILLJJLI;
    public final View LLILLL;
    public final TuxTextView LLILZ;
    public final View LLILZIL;
    public final TuxTextView LLILZLL;
    public final C01GW LLIZ;
    public C712520RxC LLIZLLLIL;
    public InterfaceC1393560mMs LLJ;
    public String LLJI;
    public AnchorEventCenter LLJIJIL;

    private final IPoiService getPoiService() {
        return (IPoiService) this.LLIZ.getValue();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        C622680Oba.LIZJ(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C622680Oba.LIZLLL(this);
    }

    public C1361930lXr(Context context) {
        super(context, null, 0);
        this.LLIZ = C452501pT.LIZIZ(AFwS209S0000000_21.get$arr$(560));
        FrameLayout.inflate(context, R.layout.a1c, this);
        this.LL = (SmartImageView) findViewById(R.id.b2h);
        this.LLILLJJLI = (TuxTextView) findViewById(R.id.b2n);
        this.LLILLL = findViewById(R.id.b2j);
        this.LLILZ = (TuxTextView) findViewById(R.id.b2l);
        this.LLILZIL = findViewById(R.id.b34);
        this.LLILZLL = (TuxTextView) findViewById(R.id.b37);
    }

    public static boolean LIZIZ(C712520RxC c712520RxC) {
        InterfaceC1393560mMs interfaceC1393560mMs = (InterfaceC1393560mMs) C13LP.LJJJLL(c712520RxC.LJIILL());
        if (interfaceC1393560mMs != null && interfaceC1393560mMs.LJJLI() > 1) {
            return true;
        }
        return false;
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onPoiCommentAnchorShowEvent(C735520StC c735520StC) {
        C712520RxC c712520RxC;
        InterfaceC1393560mMs interfaceC1393560mMs;
        C2344009Gk c2344009GkLIZIZ;
        C1357620lQu c1357620lQu;
        try {
            if ((this.LLJ instanceof PoiAnchorMaker) && Intrinsics.LJFF(c735520StC.LIZ, this.LLJI) && (c712520RxC = this.LLIZLLLIL) != null && (interfaceC1393560mMs = this.LLJ) != null) {
                C1392530mLD c1392530mLDLJFF = interfaceC1393560mMs.LJII().LJFF();
                if (C04UD.LIZ() && (c1392530mLDLJFF instanceof C1392530mLD)) {
                    c2344009GkLIZIZ = c1392530mLDLJFF.LJ(interfaceC1393560mMs);
                } else {
                    c2344009GkLIZIZ = C1392540mLE.LIZIZ(c712520RxC, (InterfaceC1393560mMs) C13LP.LJJJJZI(c712520RxC.LJIILL()), LIZIZ(c712520RxC));
                }
                interfaceC1393560mMs.p1(c2344009GkLIZIZ);
                InterfaceC1393560mMs interfaceC1393560mMs2 = this.LLJ;
                if (interfaceC1393560mMs2 != null) {
                    AnchorEventCenter anchorEventCenter = this.LLJIJIL;
                    AFwS259S0000000_21 aFwS259S0000000_21 = AFwS259S0000000_21.get$arr$(403);
                    if (C04UD.LIZ() && (c1357620lQu = (C1357620lQu) C1361900lXo.LIZ("event_show")) != null) {
                        aFwS259S0000000_21.invoke(c1357620lQu);
                        if (anchorEventCenter != null) {
                            anchorEventCenter.kF(c1357620lQu, interfaceC1393560mMs2);
                        }
                    }
                }
            }
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    public final void LIZ(final C712520RxC c712520RxC, final InterfaceC1393560mMs interfaceC1393560mMs, final AnchorEventCenter anchorEventCenter) {
        String str;
        this.LLJIJIL = anchorEventCenter;
        this.LLIZLLLIL = c712520RxC;
        this.LLJ = interfaceC1393560mMs;
        this.LLJI = c712520RxC.LIZIZ.LIZ.getAid();
        interfaceC1393560mMs.LJJJI(this.LL);
        String strLJJIFFI = u.LJJIFFI(interfaceC1393560mMs.LIZLLL(), "|", "·", false);
        String strLJJIZ = null;
        if (interfaceC1393560mMs instanceof PoiAnchorMaker) {
            PoiAnchorMaker poiAnchorMaker = (PoiAnchorMaker) interfaceC1393560mMs;
            IPoiService poiService = getPoiService();
            if (poiService != null) {
                String strLIZLLL = poiAnchorMaker.LIZLLL();
                TuxTextView tuxTextView = this.LLILLJJLI;
                InterfaceC1197120hG2 interfaceC1197120hG2 = poiAnchorMaker.LLJI;
                if (interfaceC1197120hG2 != null) {
                    strLJJIZ = interfaceC1197120hG2.LJJIZ();
                }
                poiService.measureAnchorTexts(strLIZLLL, tuxTextView, strLJJIZ, this.LLILZ, this.LLILZLL, new C1209070hZJ(poiAnchorMaker, 11));
            }
        } else if (interfaceC1393560mMs instanceof ServicePluginAnchorMaker) {
            AbstractC1066890drz abstractC1066890drz = (AbstractC1066890drz) interfaceC1393560mMs;
            CharSequence charSequenceLJJIZ = abstractC1066890drz.LJJIZ();
            if ((charSequenceLJJIZ instanceof String) && charSequenceLJJIZ != null) {
                this.LLILZLL.setText(" · ");
                C786410Ut5.LLLLZLL(this.LLILZLL, 0);
            }
            C0DW3.LIZ(C19298910ep.LIZ(abstractC1066890drz.LIZLLL(), 0).toString(), this.LLILLJJLI, abstractC1066890drz.LJJIZ(), this.LLILZ, true, null);
        } else if (!(interfaceC1393560mMs instanceof ShopWindowAnchorMaker) && !(interfaceC1393560mMs instanceof C1392780mLc)) {
            this.LLILLJJLI.setText(strLJJIFFI);
        } else {
            AbstractC1066890drz abstractC1066890drz2 = (AbstractC1066890drz) interfaceC1393560mMs;
            CharSequence charSequenceLJJIZ2 = abstractC1066890drz2.LJJIZ();
            if ((charSequenceLJJIZ2 instanceof String) && (str = (String) charSequenceLJJIZ2) != null && str.length() > 0) {
                C786410Ut5.LLLLZLL(this.LLILZLL, 0);
            }
            C0DW3.LIZ(strLJJIFFI, this.LLILLJJLI, abstractC1066890drz2.LJJIZ(), this.LLILZ, true, null);
        }
        interfaceC1393560mMs.LJII().LIZLLL();
        C1341780l1M.LIZIZ(C1341780l1M.LIZ, this.LLILLL, EnumC1341650l19.BUTTON, 0.0f, null, 12);
        C786410Ut5.I7(new AbstractViewOnClickListenerC372950Ejl() { // from class: X.0lXs
            @Override // X.AbstractViewOnClickListenerC372950Ejl
            public final void LIZ(View view) {
                C2344009Gk c2344009GkLIZIZ;
                C2344009Gk c2344009GkLIZJ;
                C1357600lQs c1357600lQsLIZ;
                C1357600lQs c1357600lQsLIZ2;
                if (view != null) {
                    InterfaceC1393560mMs interfaceC1393560mMs2 = interfaceC1393560mMs;
                    C1361930lXr c1361930lXr = this;
                    C712520RxC c712520RxC2 = c712520RxC;
                    c1361930lXr.getClass();
                    C1392530mLD c1392530mLDLJFF = interfaceC1393560mMs2.LJII().LJFF();
                    if (C04UD.LIZ() && (c1392530mLDLJFF instanceof C1392530mLD)) {
                        c2344009GkLIZIZ = c1392530mLDLJFF.LJ(interfaceC1393560mMs2);
                    } else {
                        c2344009GkLIZIZ = C1392540mLE.LIZIZ(c712520RxC2, interfaceC1393560mMs2, C1361930lXr.LIZIZ(c712520RxC2));
                        c2344009GkLIZIZ.LJFF("click_method", "click_anchor");
                    }
                    interfaceC1393560mMs2.LJFF(c2344009GkLIZIZ);
                    InterfaceC1393560mMs interfaceC1393560mMs3 = interfaceC1393560mMs;
                    C1361930lXr c1361930lXr2 = this;
                    C712520RxC c712520RxC3 = c712520RxC;
                    c1361930lXr2.getClass();
                    C1392530mLD c1392530mLDLJFF2 = interfaceC1393560mMs3.LJII().LJFF();
                    if (C04UD.LIZ() && (c1392530mLDLJFF2 instanceof C1392530mLD)) {
                        c2344009GkLIZJ = c1392530mLDLJFF2.LJIIIZ(interfaceC1393560mMs3, true);
                    } else {
                        c2344009GkLIZJ = C1392540mLE.LIZJ(interfaceC1393560mMs3, c712520RxC3, "click_anchor", C1361930lXr.LIZIZ(c712520RxC3));
                    }
                    interfaceC1393560mMs3.LJJJLL(view, c2344009GkLIZJ);
                    C1361930lXr c1361930lXr3 = this;
                    AnchorEventCenter anchorEventCenter2 = anchorEventCenter;
                    InterfaceC1393560mMs interfaceC1393560mMs4 = interfaceC1393560mMs;
                    AFwS259S0000000_21 aFwS259S0000000_21 = AFwS259S0000000_21.get$arr$(401);
                    c1361930lXr3.getClass();
                    if (C04UD.LIZ() && (c1357600lQsLIZ2 = C1361900lXo.LIZ("event_entrance_click")) != null) {
                        aFwS259S0000000_21.invoke(c1357600lQsLIZ2);
                        if (anchorEventCenter2 != null) {
                            anchorEventCenter2.kF(c1357600lQsLIZ2, interfaceC1393560mMs4);
                        }
                    }
                    C1361930lXr c1361930lXr4 = this;
                    AnchorEventCenter anchorEventCenter3 = anchorEventCenter;
                    InterfaceC1393560mMs interfaceC1393560mMs5 = interfaceC1393560mMs;
                    AFwS259S0000000_21 aFwS259S0000000_212 = AFwS259S0000000_21.get$arr$(402);
                    c1361930lXr4.getClass();
                    if (C04UD.LIZ() && (c1357600lQsLIZ = C1361900lXo.LIZ("event_enter_detail")) != null) {
                        aFwS259S0000000_212.invoke(c1357600lQsLIZ);
                        if (anchorEventCenter3 != null) {
                            anchorEventCenter3.kF(c1357600lQsLIZ, interfaceC1393560mMs5);
                        }
                    }
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(700L);
            }
        }, this.LLILLL);
    }
}
