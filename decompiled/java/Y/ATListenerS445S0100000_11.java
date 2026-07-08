package Y;

import X.AnonymousClass0956;
import X.C01GW;
import X.C0AGP;
import X.C0R68;
import X.C0SRL;
import X.C0STE;
import X.C0STN;
import X.C1303280k1G;
import X.C1388830mFF;
import X.C1558520qew;
import X.C1620050sGB;
import X.C1AF0;
import X.C2188811AlT;
import X.C721130SQl;
import X.C786410Ut5;
import X.InterfaceC690460R6m;
import X.InterfaceC720380SNo;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ability.IPhotoNestHeaderAbility;
import com.ss.android.ugc.aweme.common.widget.VerticalViewPager;
import com.ss.android.ugc.aweme.ecommerce.service.IECommerceAnchorService;
import com.ss.android.ugc.aweme.feed.assem.ability.IVideoCellAbility;
import com.ss.android.ugc.aweme.feed.landscape.LandscapeVideoViewCell;
import com.ss.android.ugc.aweme.feed.landscape.component.LandScapeFeedIntroComponent;
import com.ss.android.ugc.aweme.feed.landscape.component.ability.LandscapeFeedViewPagerAbility;
import com.ss.android.ugc.aweme.feed.longvideo.edgespeedup.EdgeSpeedupAbility;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.livephoto.vh.LivePhotoViewHolder;
import com.ss.android.ugc.aweme.model.PostModeDetailParams;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.story.feed.common.sub.photo.component.StoryPinchComponent;
import com.ss.android.ugc.aweme.ui.feed.photos.assem.PhotoSwipeHintAssem;
import com.ss.android.ugc.aweme.ui.feed.subphoto.holders.SmartImagePhotoViewHolderV2;
import com.ss.android.ugc.feed.platform.cell.component.penal.CellPenalLongPressOptComponent;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import kotlin.Pair;

/* JADX INFO: loaded from: classes12.dex */
public class ATListenerS445S0100000_11 implements View.OnTouchListener {
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
            default:
                return false;
        }
    }

    public ATListenerS445S0100000_11(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0053  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean onTouch$0(Y.ATListenerS445S0100000_11 r5, android.view.View r6, android.view.MotionEvent r7) {
        /*
            r1 = 1
            r2 = 0
            if (r7 == 0) goto L50
            int r0 = r7.getAction()
            if (r0 != 0) goto L53
            X.01GW r0 = X.C1EAU.LJIILLIIL
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L51
            java.lang.Object r0 = r5.l0
            com.ss.android.ugc.aweme.feed.assem.digg.VideoDiggAssem r0 = (com.ss.android.ugc.aweme.feed.assem.digg.VideoDiggAssem) r0
            r0.LLLIILIL = r2
            Y.ARunnableS80S0200000_11 r1 = r0.LLLIIL
            if (r1 == 0) goto L2d
            X.01GW r0 = r0.LLLIIIL
            java.lang.Object r0 = r0.getValue()
            android.os.Handler r0 = (android.os.Handler) r0
            r0.removeCallbacks(r1)
        L2d:
            Y.ARunnableS80S0200000_11 r4 = new Y.ARunnableS80S0200000_11
            java.lang.Object r1 = r5.l0
            com.ss.android.ugc.aweme.feed.assem.digg.VideoDiggAssem r1 = (com.ss.android.ugc.aweme.feed.assem.digg.VideoDiggAssem) r1
            r0 = 6
            r4.<init>(r6, r1, r0)
            r1.LLLIIL = r4
            X.01GW r0 = r1.LLLIIIL
            java.lang.Object r3 = r0.getValue()
            android.os.Handler r3 = (android.os.Handler) r3
            X.01GW r0 = X.C1EAU.LJIILL
            java.lang.Object r0 = r0.getValue()
            java.lang.Number r0 = (java.lang.Number) r0
            long r0 = r0.longValue()
            X.C786410Ut5.LJLIIL(r0, r3, r4)
        L50:
            return r2
        L51:
            if (r7 == 0) goto L50
        L53:
            int r0 = r7.getAction()
            if (r0 == r1) goto L60
            int r1 = r7.getAction()
            r0 = 3
            if (r1 != r0) goto L50
        L60:
            int r0 = X.C2187451AjH.LIZ
            java.lang.String r1 = "VideoDiggAssem"
            java.lang.String r0 = "motion up"
            X.C1720106oR.LJI(r1, r0)
            java.lang.Object r0 = r5.l0
            com.ss.android.ugc.aweme.feed.assem.digg.VideoDiggAssem r0 = (com.ss.android.ugc.aweme.feed.assem.digg.VideoDiggAssem) r0
            Y.ARunnableS80S0200000_11 r1 = r0.LLLIIL
            if (r1 == 0) goto L7c
            X.01GW r0 = r0.LLLIIIL
            java.lang.Object r0 = r0.getValue()
            android.os.Handler r0 = (android.os.Handler) r0
            r0.removeCallbacks(r1)
        L7c:
            java.lang.Object r0 = r5.l0
            com.ss.android.ugc.aweme.feed.assem.digg.VideoDiggAssem r0 = (com.ss.android.ugc.aweme.feed.assem.digg.VideoDiggAssem) r0
            r1 = 0
            r0.LLLIIL = r1
            boolean r3 = r0.LLLIILIL
            r0.LLLIILIL = r2
            X.0Sb3 r0 = r0.LLJI
            if (r0 == 0) goto L8d
            java.lang.Object r1 = r0.LL
        L8d:
            com.ss.android.ugc.aweme.feed.model.VideoItemParams r1 = (com.ss.android.ugc.aweme.feed.model.VideoItemParams) r1
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r1.getAweme()
            java.lang.String r2 = r0.getAid()
            X.0SmB r1 = new X.0SmB
            r0 = 2
            r1.<init>(r2, r0)
            X.C1440005kM.LIZ(r1)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ATListenerS445S0100000_11.onTouch$0(Y.ATListenerS445S0100000_11, android.view.View, android.view.MotionEvent):boolean");
    }

    public static final boolean onTouch$1(ATListenerS445S0100000_11 aTListenerS445S0100000_11, View view, MotionEvent motionEvent) {
        int itemCount;
        if (motionEvent != null) {
            LandScapeFeedIntroComponent landScapeFeedIntroComponent = (LandScapeFeedIntroComponent) aTListenerS445S0100000_11.l0;
            try {
                int action = motionEvent.getAction();
                if (action != 0) {
                    if (action != 1) {
                        if (action != 2) {
                            if (action == 3) {
                                VerticalViewPager verticalViewPager = landScapeFeedIntroComponent.LLJJL;
                                if (verticalViewPager != null && verticalViewPager.LLLLIILLL) {
                                    verticalViewPager.LLLLZI();
                                }
                                landScapeFeedIntroComponent.LLJL = 0.0f;
                                return true;
                            }
                        } else {
                            float y = motionEvent.getY() - landScapeFeedIntroComponent.LLJJLIIIJLLLLLLLZ;
                            landScapeFeedIntroComponent.LLJJLIIIJLLLLLLLZ = motionEvent.getY();
                            if (y < 0.0f || landScapeFeedIntroComponent.LLJL < 0.0f) {
                                VerticalViewPager verticalViewPager2 = landScapeFeedIntroComponent.LLJJL;
                                if (verticalViewPager2 != null && !verticalViewPager2.LLLLIILLL) {
                                    verticalViewPager2.LLLLZ();
                                }
                                VerticalViewPager verticalViewPager3 = landScapeFeedIntroComponent.LLJJL;
                                if (verticalViewPager3 != null) {
                                    verticalViewPager3.LLLLZIL(y);
                                }
                                landScapeFeedIntroComponent.LLJL += y;
                                return true;
                            }
                        }
                    } else {
                        VerticalViewPager verticalViewPager4 = landScapeFeedIntroComponent.LLJJL;
                        if (verticalViewPager4 != null && verticalViewPager4.LLLLIILLL) {
                            verticalViewPager4.LLLLZI();
                        }
                        landScapeFeedIntroComponent.LLJL = 0.0f;
                        LandscapeFeedViewPagerAbility landscapeFeedViewPagerAbility = (LandscapeFeedViewPagerAbility) C1558520qew.LIZ(C1558520qew.LJIIL(landScapeFeedIntroComponent), LandscapeFeedViewPagerAbility.class, null);
                        if (landscapeFeedViewPagerAbility == null || (itemCount = landscapeFeedViewPagerAbility.getItemCount()) <= 1 || itemCount == landScapeFeedIntroComponent.LLJJJJ + 1) {
                            RelativeLayout relativeLayout = landScapeFeedIntroComponent.LLJJI;
                            if (relativeLayout != null) {
                                C786410Ut5.LLIIL(relativeLayout, 8);
                            }
                            C1303280k1G c1303280k1G = landScapeFeedIntroComponent.LLJJIII;
                            if (c1303280k1G != null) {
                                c1303280k1G.clearAnimation();
                            }
                            landScapeFeedIntroComponent.LLJJIJI = false;
                            C1620050sGB c1620050sGB = landScapeFeedIntroComponent.LLJJJJJIL;
                            if (c1620050sGB != null) {
                                c1620050sGB.LJIIJ(false);
                            }
                            landScapeFeedIntroComponent.LLJJJIL = false;
                            landScapeFeedIntroComponent.LLJJJ.storeBoolean("enable_show_intro", false);
                            return true;
                        }
                    }
                } else {
                    float y2 = motionEvent.getY();
                    landScapeFeedIntroComponent.getClass();
                    landScapeFeedIntroComponent.LLJJLIIIJLLLLLLLZ = y2;
                    VerticalViewPager verticalViewPager5 = landScapeFeedIntroComponent.LLJJL;
                    if (verticalViewPager5 != null) {
                        verticalViewPager5.LLLLZ();
                        return true;
                    }
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("SwipeUpGuideStrengthenLayout onTouchEvent error: ");
                sbLIZ.append(e);
                C1AF0.LIZJ(C2188811AlT.LIZIZ(sbLIZ));
            }
        }
        return true;
    }

    public static final boolean onTouch$10(ATListenerS445S0100000_11 aTListenerS445S0100000_11, View view, MotionEvent motionEvent) {
        ((InterfaceC720380SNo) aTListenerS445S0100000_11.l0).onTouchEvent(motionEvent);
        return true;
    }

    public static final boolean onTouch$11(ATListenerS445S0100000_11 aTListenerS445S0100000_11, View view, MotionEvent motionEvent) {
        Aweme aweme;
        IVideoCellAbility iVideoCellAbility;
        InterfaceC690460R6m interfaceC690460R6mWn0;
        int longPressTimeout;
        WeakReference<View> first;
        View view2;
        VideoItemParams videoItemParams = ((CellPenalLongPressOptComponent) aTListenerS445S0100000_11.l0).LLJLLIL;
        Runnable second = null;
        if (videoItemParams != null) {
            aweme = videoItemParams.getAweme();
        } else {
            aweme = null;
        }
        if (!C0R68.LIZIZ(aweme, null, null)) {
            return false;
        }
        if (motionEvent.getPointerCount() >= 2) {
            ((CellPenalLongPressOptComponent) aTListenerS445S0100000_11.l0).ep(view);
            return false;
        }
        try {
            if (((CellPenalLongPressOptComponent) aTListenerS445S0100000_11.l0).hp(motionEvent)) {
                return false;
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1AF0.LJ(e);
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked == 3 || actionMasked == 5) {
                        ((CellPenalLongPressOptComponent) aTListenerS445S0100000_11.l0).ep(view);
                        ((CellPenalLongPressOptComponent) aTListenerS445S0100000_11.l0).LLL = false;
                    }
                } else {
                    float fAbs = Math.abs(motionEvent.getX() - ((CellPenalLongPressOptComponent) aTListenerS445S0100000_11.l0).LLJLLL);
                    float fAbs2 = Math.abs(motionEvent.getY() - ((CellPenalLongPressOptComponent) aTListenerS445S0100000_11.l0).LLJZ);
                    CellPenalLongPressOptComponent cellPenalLongPressOptComponent = (CellPenalLongPressOptComponent) aTListenerS445S0100000_11.l0;
                    float f = cellPenalLongPressOptComponent.LLLF;
                    if (fAbs > f || fAbs2 > f) {
                        cellPenalLongPressOptComponent.ep(view);
                        ((CellPenalLongPressOptComponent) aTListenerS445S0100000_11.l0).LLL = false;
                    }
                }
            } else {
                ((CellPenalLongPressOptComponent) aTListenerS445S0100000_11.l0).ep(view);
                ((CellPenalLongPressOptComponent) aTListenerS445S0100000_11.l0).LLL = false;
            }
        } else {
            CellPenalLongPressOptComponent cellPenalLongPressOptComponent2 = (CellPenalLongPressOptComponent) aTListenerS445S0100000_11.l0;
            cellPenalLongPressOptComponent2.LLL = false;
            cellPenalLongPressOptComponent2.LLJLLL = motionEvent.getX();
            ((CellPenalLongPressOptComponent) aTListenerS445S0100000_11.l0).LLJZ = motionEvent.getY();
            CellPenalLongPressOptComponent cellPenalLongPressOptComponent3 = (CellPenalLongPressOptComponent) aTListenerS445S0100000_11.l0;
            EdgeSpeedupAbility edgeSpeedupAbility = (EdgeSpeedupAbility) cellPenalLongPressOptComponent3.LLJL.getValue();
            C0R68.LIZ.getClass();
            if (C0R68.LIZ() != 0 && ((edgeSpeedupAbility == null || !edgeSpeedupAbility.cS1(motionEvent.getRawX(), motionEvent.getRawY())) && (iVideoCellAbility = (IVideoCellAbility) cellPenalLongPressOptComponent3.LLJLIL.getValue()) != null && (interfaceC690460R6mWn0 = iVideoCellAbility.Wn0()) != null)) {
                C01GW c01gw = C0AGP.LIZ;
                if (((Number) c01gw.getValue()).intValue() > 0) {
                    if (((Number) c01gw.getValue()).intValue() > 0) {
                        longPressTimeout = ((Number) c01gw.getValue()).intValue();
                    } else {
                        longPressTimeout = 500;
                    }
                } else {
                    longPressTimeout = ViewConfiguration.getLongPressTimeout();
                }
                long j = longPressTimeout;
                WeakReference weakReference = new WeakReference(view);
                Pair<? extends WeakReference<View>, ? extends Runnable> pair = cellPenalLongPressOptComponent3.LLJZIJLIL;
                if (pair != null && (first = pair.getFirst()) != null && (view2 = first.get()) != null) {
                    Pair<? extends WeakReference<View>, ? extends Runnable> pair2 = cellPenalLongPressOptComponent3.LLJZIJLIL;
                    if (pair2 != null) {
                        second = pair2.getSecond();
                    }
                    HandlerHook.viewRemoveCallbacks(view2, second);
                }
                Pair<? extends WeakReference<View>, ? extends Runnable> pair3 = new Pair<>(weakReference, new ARunnableS20S0400000_11(weakReference, cellPenalLongPressOptComponent3, motionEvent, interfaceC690460R6mWn0, 4));
                cellPenalLongPressOptComponent3.LLJZIJLIL = pair3;
                Runnable second2 = pair3.getSecond();
                if (second2 != null) {
                    HandlerHook.viewPostDelay(view, second2, j);
                }
            }
        }
        return ((CellPenalLongPressOptComponent) aTListenerS445S0100000_11.l0).LLL;
    }

    public static final boolean onTouch$2(ATListenerS445S0100000_11 aTListenerS445S0100000_11, View view, MotionEvent motionEvent) {
        boolean z;
        C0STE c0ste;
        int actionMasked;
        if (((LivePhotoViewHolder) aTListenerS445S0100000_11.l0).LLJLLIL.getVisibility() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            ((LivePhotoViewHolder) aTListenerS445S0100000_11.l0).LLJLLIL.onTouch(view, motionEvent);
            LivePhotoViewHolder livePhotoViewHolder = (LivePhotoViewHolder) aTListenerS445S0100000_11.l0;
            if (!livePhotoViewHolder.LLLLZI && livePhotoViewHolder.LLJLLIL.getVisibility() == 0 && livePhotoViewHolder.LLJLLIL.LJIIIIZZ() && ((actionMasked = motionEvent.getActionMasked()) == 1 || actionMasked == 2 || actionMasked == 3)) {
                livePhotoViewHolder.LJLJJLL();
                return true;
            }
        } else {
            C0STE c0ste2 = ((LivePhotoViewHolder) aTListenerS445S0100000_11.l0).LLLLLZL;
            if (c0ste2 != null) {
                c0ste2.onTouch(view, motionEvent);
            }
            LivePhotoViewHolder livePhotoViewHolder2 = (LivePhotoViewHolder) aTListenerS445S0100000_11.l0;
            if (livePhotoViewHolder2.LLJLLIL.getVisibility() == 8 && (c0ste = livePhotoViewHolder2.LLLLLZL) != null && c0ste.LJIJI()) {
                int actionMasked2 = motionEvent.getActionMasked();
                if (actionMasked2 != 1 && actionMasked2 != 2 && actionMasked2 != 3) {
                    return true;
                }
                livePhotoViewHolder2.LJLJJL();
                return true;
            }
        }
        return true;
    }

    public static final boolean onTouch$3(ATListenerS445S0100000_11 aTListenerS445S0100000_11, View view, MotionEvent motionEvent) {
        Integer numValueOf;
        AnonymousClass0956 anonymousClass0956;
        if (motionEvent != null && (numValueOf = Integer.valueOf(motionEvent.getActionMasked())) != null && numValueOf.intValue() == 0 && (anonymousClass0956 = ((PhotoSwipeHintAssem) aTListenerS445S0100000_11.l0).LLJJLIIIJLLLLLLLZ) != null) {
            anonymousClass0956.LIZIZ(null);
            return false;
        }
        return false;
    }

    public static final boolean onTouch$4(ATListenerS445S0100000_11 aTListenerS445S0100000_11, View view, MotionEvent motionEvent) {
        ((SmartImagePhotoViewHolderV2) aTListenerS445S0100000_11.l0).LLJLLIL.onTouch(view, motionEvent);
        return true;
    }

    public static final boolean onTouch$5(ATListenerS445S0100000_11 aTListenerS445S0100000_11, View view, MotionEvent motionEvent) {
        StoryPinchComponent storyPinchComponent = (StoryPinchComponent) aTListenerS445S0100000_11.l0;
        if (storyPinchComponent.LLJLIL) {
            return ((C0STN) storyPinchComponent.LLJJJJLIIL.getValue()).onTouch(view, motionEvent);
        }
        return true;
    }

    public static final boolean onTouch$6(ATListenerS445S0100000_11 aTListenerS445S0100000_11, View view, MotionEvent motionEvent) {
        ((GestureDetector) aTListenerS445S0100000_11.l0).onTouchEvent(motionEvent);
        return false;
    }

    public static final boolean onTouch$7(ATListenerS445S0100000_11 aTListenerS445S0100000_11, View view, MotionEvent motionEvent) {
        if (motionEvent != null) {
            if (motionEvent.getAction() == 0) {
                ((LandscapeVideoViewCell) aTListenerS445S0100000_11.l0).LLLLILI();
            } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                LandscapeVideoViewCell landscapeVideoViewCell = (LandscapeVideoViewCell) aTListenerS445S0100000_11.l0;
                C786410Ut5.LJLIIL(3000L, landscapeVideoViewCell.LLLLL, new ARunnableS111S0100000_11(landscapeVideoViewCell, 128));
                return false;
            }
        }
        return false;
    }

    public static final boolean onTouch$8(ATListenerS445S0100000_11 aTListenerS445S0100000_11, View view, MotionEvent motionEvent) {
        Integer numValueOf;
        Aweme aweme;
        String str = null;
        if (motionEvent != null && (numValueOf = Integer.valueOf(motionEvent.getAction())) != null && numValueOf.intValue() == 1) {
            IECommerceAnchorService iECommerceAnchorService = (IECommerceAnchorService) ServiceManager.get().getService(IECommerceAnchorService.class);
            C0SRL c0srl = ((C1388830mFF) aTListenerS445S0100000_11.l0).LIZ;
            if (c0srl != null) {
                aweme = c0srl.LIZJ;
            } else {
                aweme = null;
            }
            PostModeDetailParams postModeDetailParams = c0srl.LJII;
            if (postModeDetailParams != null) {
                str = postModeDetailParams.eventType;
            }
            iECommerceAnchorService.LJJJJJ(aweme, str);
            return false;
        }
        return false;
    }

    public static final boolean onTouch$9(ATListenerS445S0100000_11 aTListenerS445S0100000_11, View view, MotionEvent motionEvent) {
        GestureDetector gestureDetector;
        IPhotoNestHeaderAbility iPhotoNestHeaderAbility;
        ViewGroup viewGroupLJIIIIZZ = ((C721130SQl) aTListenerS445S0100000_11.l0).LL.LJIIIIZZ();
        if (viewGroupLJIIIIZZ != null) {
            View viewFindViewById = viewGroupLJIIIIZZ.findViewById(R.id.rkk);
            View viewFindViewById2 = viewGroupLJIIIIZZ.findViewById(R.id.rli);
            if (C721130SQl.LIZIZ(viewFindViewById, view, motionEvent) || C721130SQl.LIZIZ(viewFindViewById2, view, motionEvent)) {
                return false;
            }
        }
        C721130SQl c721130SQl = (C721130SQl) aTListenerS445S0100000_11.l0;
        if ((c721130SQl.LL.LJIIZILJ && (iPhotoNestHeaderAbility = (IPhotoNestHeaderAbility) c721130SQl.LLILZ.getValue()) != null && iPhotoNestHeaderAbility.c7()) || (gestureDetector = ((C721130SQl) aTListenerS445S0100000_11.l0).LLILZLL) == null) {
            return false;
        }
        return gestureDetector.onTouchEvent(motionEvent);
    }
}
