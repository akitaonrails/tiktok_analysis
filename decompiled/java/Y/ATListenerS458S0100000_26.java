package Y;

import X.C0QSJ;
import X.C1507750pL3;
import X.C1508390pM5;
import X.C1762410vxn;
import X.C1765620w2y;
import X.C1765730w39;
import X.C687700QyG;
import X.EnumC1508940pMy;
import X.EnumC1508950pMz;
import X.InterfaceC1762510vxx;
import X.InterfaceC665370Q7z;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.widget.SeaPdpCreatorSheetWidget;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.carousel.PdpCarouselScope;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.carousel.assem.carouselpowercells.PdpCarouselSparkContainerReusedAssem;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.widget.PdpCreatorSheetWidget;
import com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.fragment.DistrictPage;
import com.ss.android.ugc.aweme.ecommercelive.common.biz.us.billboard.powercells.ECBillboardAuctionNoteCell;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes27.dex */
public class ATListenerS458S0100000_26 implements View.OnTouchListener {
    public final int $t;
    public Object l0;

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        switch (this.$t) {
            case 0:
                return onTouch$0(this, view, motionEvent);
            case 1:
                return onTouch$1(this, view, motionEvent);
            case 2:
                return onTouch$2(this, view, motionEvent);
            case 3:
                return onTouch$3(this, view, motionEvent);
            case 4:
                return onTouch$4(this, view, motionEvent);
            case 5:
                return onTouch$5(this, view, motionEvent);
            case 6:
                return onTouch$6(this, view, motionEvent);
            case 7:
                return onTouch$7(this, view, motionEvent);
            case 8:
                return onTouch$8(this, view, motionEvent);
            case BdTuring.TYPE_ECAF /* 9 */:
                return onTouch$9(this, view, motionEvent);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return onTouch$10(this, view, motionEvent);
            case BdTuring.TYPE_EMAIL /* 11 */:
                return onTouch$11(this, view, motionEvent);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                return onTouch$12(this, view, motionEvent);
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                return onTouch$13(this, view, motionEvent);
            default:
                return false;
        }
    }

    public ATListenerS458S0100000_26(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean onTouch$0(Y.ATListenerS458S0100000_26 r6, android.view.View r7, android.view.MotionEvent r8) {
        /*
            java.lang.Object r2 = r6.l0
            X.0ubL r2 = (X.C1710050ubL) r2
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "event: "
            r1.append(r0)
            r1.append(r8)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            r2.getClass()
            X.C1710050ubL.LIZ(r0)
            r5 = 1
            r4 = 0
            if (r8 == 0) goto L77
            int r0 = r8.getAction()
            if (r0 != 0) goto L4e
            java.lang.Object r0 = r6.l0
            X.0ubL r0 = (X.C1710050ubL) r0
            r0.getClass()
            java.lang.String r0 = "consume action_down"
            X.C1710050ubL.LIZ(r0)
            java.lang.Object r0 = r6.l0
            X.0ubL r0 = (X.C1710050ubL) r0
            com.ss.android.ugc.aweme.pipo.cashier.lynx.LynxTtlsPdpCashierView r1 = r0.getLynxCashierView()
            if (r1 == 0) goto L4c
            java.lang.Object r3 = r6.l0
            X.0ubL r3 = (X.C1710050ubL) r3
            r1.LJJIIZI(r4)
            Y.ARunnableS126S0100000_26 r2 = new Y.ARunnableS126S0100000_26
            r0 = 0
            r2.<init>(r1, r0)
            r0 = 500(0x1f4, double:2.47E-321)
            com.bytedance.bpea.transmit.hook.HandlerHook.viewPostDelay(r3, r2, r0)
        L4c:
            if (r8 == 0) goto L77
        L4e:
            int r0 = r8.getAction()
            if (r0 != r5) goto L77
            java.lang.Object r0 = r6.l0
            X.0ubL r0 = (X.C1710050ubL) r0
            r0.getClass()
            java.lang.String r0 = "consume action_up"
            X.C1710050ubL.LIZ(r0)
            java.lang.Object r0 = r6.l0
            X.0ubL r0 = (X.C1710050ubL) r0
            com.ss.android.ugc.aweme.pipo.cashier.lynx.LynxTtlsPdpCashierView r3 = r0.getLynxCashierView()
            if (r3 == 0) goto L77
            java.lang.Object r2 = r6.l0
            X.0ubL r2 = (X.C1710050ubL) r2
            Y.ARunnableS126S0100000_26 r1 = new Y.ARunnableS126S0100000_26
            r0 = 1
            r1.<init>(r3, r0)
            com.bytedance.bpea.transmit.hook.HandlerHook.viewPost(r2, r1)
        L77:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ATListenerS458S0100000_26.onTouch$0(Y.ATListenerS458S0100000_26, android.view.View, android.view.MotionEvent):boolean");
    }

    public static final boolean onTouch$1(ATListenerS458S0100000_26 aTListenerS458S0100000_26, View view, MotionEvent motionEvent) {
        ((DistrictPage) aTListenerS458S0100000_26.l0).LLJ = false;
        return false;
    }

    public static final boolean onTouch$10(ATListenerS458S0100000_26 aTListenerS458S0100000_26, View view, MotionEvent motionEvent) {
        PdpCarouselSparkContainerReusedAssem pdpCarouselSparkContainerReusedAssem = (PdpCarouselSparkContainerReusedAssem) aTListenerS458S0100000_26.l0;
        InterfaceC1762510vxx interfaceC1762510vxx = pdpCarouselSparkContainerReusedAssem.LLJLL;
        if (interfaceC1762510vxx == null) {
            synchronized (pdpCarouselSparkContainerReusedAssem) {
                interfaceC1762510vxx = pdpCarouselSparkContainerReusedAssem.LLJLL;
                if (interfaceC1762510vxx == null) {
                    C0QSJ c0qsjLIZLLL = pdpCarouselSparkContainerReusedAssem.LLJZ;
                    if (c0qsjLIZLLL == null) {
                        InterfaceC665370Q7z interfaceC665370Q7zLJIIIZ = pdpCarouselSparkContainerReusedAssem.LLJLLIL;
                        if (interfaceC665370Q7zLJIIIZ == null) {
                            interfaceC665370Q7zLJIIIZ = C687700QyG.LJIIIZ(pdpCarouselSparkContainerReusedAssem);
                            pdpCarouselSparkContainerReusedAssem.LLJLLIL = interfaceC665370Q7zLJIIIZ;
                        }
                        c0qsjLIZLLL = C687700QyG.LIZLLL(interfaceC665370Q7zLJIIIZ, new Class[]{PdpCarouselScope.class});
                        pdpCarouselSparkContainerReusedAssem.LLJZ = c0qsjLIZLLL;
                        if (c0qsjLIZLLL == null) {
                            interfaceC1762510vxx = null;
                        }
                        pdpCarouselSparkContainerReusedAssem.LLJLL = interfaceC1762510vxx;
                    }
                    interfaceC1762510vxx = (InterfaceC1762510vxx) c0qsjLIZLLL.getAbility(InterfaceC1762510vxx.class);
                    C687700QyG.LJ(interfaceC1762510vxx, InterfaceC1762510vxx.class);
                    pdpCarouselSparkContainerReusedAssem.LLJLL = interfaceC1762510vxx;
                }
            }
        }
        return !interfaceC1762510vxx.Vm();
    }

    public static final boolean onTouch$11(ATListenerS458S0100000_26 aTListenerS458S0100000_26, View view, MotionEvent motionEvent) {
        Integer numValueOf;
        C1765730w39 c1765730w39 = (C1765730w39) aTListenerS458S0100000_26.l0;
        if (motionEvent != null && (numValueOf = Integer.valueOf(motionEvent.getAction())) != null) {
            if (numValueOf.intValue() == 0) {
                c1765730w39.LIZLLL();
                return false;
            }
            if ((numValueOf.intValue() != 1 && numValueOf.intValue() != 3) || C1507750pL3.LIZ != EnumC1508940pMy.PLAYER_START) {
                return false;
            }
            c1765730w39.LIZ(3000L);
            return false;
        }
        return false;
    }

    public static final boolean onTouch$12(ATListenerS458S0100000_26 aTListenerS458S0100000_26, View view, MotionEvent motionEvent) {
        Integer numValueOf;
        C1765730w39 c1765730w39 = (C1765730w39) aTListenerS458S0100000_26.l0;
        if (motionEvent != null && (numValueOf = Integer.valueOf(motionEvent.getAction())) != null && numValueOf.intValue() != 0) {
            if (numValueOf.intValue() == 1 || numValueOf.intValue() == 3) {
                if (!c1765730w39.LLJILLL) {
                    c1765730w39.LJFF();
                    return false;
                }
                c1765730w39.LIZ(0L);
                return false;
            }
            return false;
        }
        return false;
    }

    public static final boolean onTouch$13(ATListenerS458S0100000_26 aTListenerS458S0100000_26, View view, MotionEvent motionEvent) {
        ViewParent parent;
        int actionMasked = motionEvent.getActionMasked();
        boolean z = true;
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked == 3 && (parent = view.getParent()) != null) {
                        parent.requestDisallowInterceptTouchEvent(false);
                        return false;
                    }
                    return false;
                }
                float fAbs = Math.abs(motionEvent.getX() - ((ECBillboardAuctionNoteCell) aTListenerS458S0100000_26.l0).LLJ);
                float fAbs2 = Math.abs(motionEvent.getY() - ((ECBillboardAuctionNoteCell) aTListenerS458S0100000_26.l0).LLJI);
                if (fAbs2 <= ((ECBillboardAuctionNoteCell) aTListenerS458S0100000_26.l0).LLJIJIL || fAbs2 <= fAbs) {
                    z = false;
                }
                ViewParent parent2 = view.getParent();
                if (parent2 == null) {
                    return false;
                }
                parent2.requestDisallowInterceptTouchEvent(z);
                return false;
            }
            ViewParent parent3 = view.getParent();
            if (parent3 != null) {
                parent3.requestDisallowInterceptTouchEvent(false);
            }
            float fAbs3 = Math.abs(motionEvent.getX() - ((ECBillboardAuctionNoteCell) aTListenerS458S0100000_26.l0).LLJ);
            float fAbs4 = Math.abs(motionEvent.getY() - ((ECBillboardAuctionNoteCell) aTListenerS458S0100000_26.l0).LLJI);
            ECBillboardAuctionNoteCell eCBillboardAuctionNoteCell = (ECBillboardAuctionNoteCell) aTListenerS458S0100000_26.l0;
            int i = eCBillboardAuctionNoteCell.LLJIJIL;
            if (fAbs3 >= i || fAbs4 >= i) {
                return false;
            }
            ViewGroup viewGroup = eCBillboardAuctionNoteCell.LL;
            if (viewGroup != null) {
                viewGroup.performClick();
                return true;
            }
            eCBillboardAuctionNoteCell.itemView.performClick();
            return true;
        }
        ((ECBillboardAuctionNoteCell) aTListenerS458S0100000_26.l0).LLJ = motionEvent.getX();
        ((ECBillboardAuctionNoteCell) aTListenerS458S0100000_26.l0).LLJI = motionEvent.getY();
        ViewParent parent4 = view.getParent();
        if (parent4 == null) {
            return false;
        }
        parent4.requestDisallowInterceptTouchEvent(true);
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0046, code lost:
    
        if (r4 != 3) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean onTouch$2(Y.ATListenerS458S0100000_26 r15, android.view.View r16, android.view.MotionEvent r17) {
        /*
            Method dump skipped, instruction units count: 610
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ATListenerS458S0100000_26.onTouch$2(Y.ATListenerS458S0100000_26, android.view.View, android.view.MotionEvent):boolean");
    }

    public static final boolean onTouch$3(ATListenerS458S0100000_26 aTListenerS458S0100000_26, View view, MotionEvent motionEvent) {
        ((SeaPdpCreatorSheetWidget) aTListenerS458S0100000_26.l0).LJIIJ(motionEvent, view);
        return true;
    }

    public static final boolean onTouch$4(ATListenerS458S0100000_26 aTListenerS458S0100000_26, View view, MotionEvent motionEvent) {
        ((SeaPdpCreatorSheetWidget) aTListenerS458S0100000_26.l0).LJIIJ(motionEvent, view);
        return true;
    }

    public static final boolean onTouch$5(ATListenerS458S0100000_26 aTListenerS458S0100000_26, View view, MotionEvent motionEvent) {
        Integer numValueOf;
        EnumC1508950pMz enumC1508950pMz = null;
        if (motionEvent != null && (numValueOf = Integer.valueOf(motionEvent.getAction())) != null) {
            if (numValueOf.intValue() == 0) {
                ((C1765620w2y) aTListenerS458S0100000_26.l0).LJ();
                return false;
            }
            if (numValueOf.intValue() != 1 && numValueOf.intValue() != 3) {
                return false;
            }
            C1508390pM5 player = ((C1765620w2y) aTListenerS458S0100000_26.l0).getPlayer();
            if (player != null) {
                enumC1508950pMz = player.LJIILLIIL;
            }
            if (enumC1508950pMz != EnumC1508950pMz.PLAYER_START) {
                return false;
            }
            ((C1765620w2y) aTListenerS458S0100000_26.l0).LIZJ(3000L);
            return false;
        }
        return false;
    }

    public static final boolean onTouch$6(ATListenerS458S0100000_26 aTListenerS458S0100000_26, View view, MotionEvent motionEvent) {
        Integer numValueOf;
        if (motionEvent != null && (numValueOf = Integer.valueOf(motionEvent.getAction())) != null && numValueOf.intValue() != 0) {
            if (numValueOf.intValue() == 1 || numValueOf.intValue() == 3) {
                Function0<Unit> onMaskTap = ((C1765620w2y) aTListenerS458S0100000_26.l0).getOnMaskTap();
                if (onMaskTap != null) {
                    onMaskTap.invoke();
                }
                if (!((C1765620w2y) aTListenerS458S0100000_26.l0).getNeedShowMask()) {
                    ((C1765620w2y) aTListenerS458S0100000_26.l0).LJII();
                    return false;
                }
                ((C1765620w2y) aTListenerS458S0100000_26.l0).LIZJ(0L);
                return false;
            }
            return false;
        }
        return false;
    }

    public static final boolean onTouch$7(ATListenerS458S0100000_26 aTListenerS458S0100000_26, View view, MotionEvent motionEvent) {
        ((PdpCreatorSheetWidget) aTListenerS458S0100000_26.l0).LJIIJ(motionEvent, view);
        return true;
    }

    public static final boolean onTouch$8(ATListenerS458S0100000_26 aTListenerS458S0100000_26, View view, MotionEvent motionEvent) {
        ((PdpCreatorSheetWidget) aTListenerS458S0100000_26.l0).LJIIJ(motionEvent, view);
        return true;
    }

    public static final boolean onTouch$9(ATListenerS458S0100000_26 aTListenerS458S0100000_26, View view, MotionEvent motionEvent) {
        return !((C1762410vxn) aTListenerS458S0100000_26.l0).LLJJJJJIL;
    }
}
