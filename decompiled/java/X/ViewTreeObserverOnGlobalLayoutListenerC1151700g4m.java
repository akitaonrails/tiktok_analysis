package X;

import Y.ARunnableS117S0100000_17;
import Y.ARunnableS22S1100000_17;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.animation.AlphaAnimation;
import android.view.animation.AnimationSet;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.TranslateAnimation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.lifecycle.Lifecycle;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.gift.base.platform.business.panel.anchor.center.gift.center.GiftAnchorPanelGiftPageCenterAssem;
import com.bytedance.android.livesdk.revenue.level.impl.fansclub.ui.newdialog.AbsNewFansClubJoinDialog;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.nearby.roaming.UserCurrentRegionCell;
import com.tts.oecverify.BdTuring;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0g4m, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public class ViewTreeObserverOnGlobalLayoutListenerC1151700g4m implements ViewTreeObserver.OnGlobalLayoutListener {
    public final int $t;
    public Object l0;

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        switch (this.$t) {
            case 0:
                onGlobalLayout$0(this);
                break;
            case 1:
                onGlobalLayout$1(this);
                break;
            case 2:
                onGlobalLayout$2(this);
                break;
            case 3:
                onGlobalLayout$3(this);
                break;
            case 4:
                onGlobalLayout$4(this);
                break;
            case 5:
                onGlobalLayout$5(this);
                break;
            case 6:
                onGlobalLayout$6(this);
                break;
            case 7:
                onGlobalLayout$7(this);
                break;
            case 8:
                onGlobalLayout$8(this);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                onGlobalLayout$9(this);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                onGlobalLayout$10(this);
                break;
            case BdTuring.TYPE_EMAIL /* 11 */:
                onGlobalLayout$11(this);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                onGlobalLayout$12(this);
                break;
        }
    }

    public static final void onGlobalLayout$0(ViewTreeObserverOnGlobalLayoutListenerC1151700g4m viewTreeObserverOnGlobalLayoutListenerC1151700g4m) {
        C1143090fqt c1143090fqt = ((C1143030fqn) viewTreeObserverOnGlobalLayoutListenerC1151700g4m.l0).LLJJIJI;
        if (c1143090fqt != null) {
            float fMeasureText = (c1143090fqt.getPaint().measureText(c1143090fqt.getText().toString()) * 1.05f) - (c1143090fqt.getWidth() + c1143090fqt.LLJJIII);
            if (0.0f >= fMeasureText) {
                fMeasureText = 0.0f;
            }
            if (((int) fMeasureText) > 0) {
                return;
            }
        }
        View view = ((C1143030fqn) viewTreeObserverOnGlobalLayoutListenerC1151700g4m.l0).LLJJIJIIJIL;
        if (view != null) {
            C786410Ut5.LJLLLLLL(8, view);
        }
    }

    public static final void onGlobalLayout$1(ViewTreeObserverOnGlobalLayoutListenerC1151700g4m viewTreeObserverOnGlobalLayoutListenerC1151700g4m) {
        C1143090fqt c1143090fqt = ((C1143030fqn) viewTreeObserverOnGlobalLayoutListenerC1151700g4m.l0).LLJJIJI;
        if (c1143090fqt != null) {
            float fMeasureText = (c1143090fqt.getPaint().measureText(c1143090fqt.getText().toString()) * 1.05f) - (c1143090fqt.getWidth() + c1143090fqt.LLJJIII);
            if (0.0f >= fMeasureText) {
                fMeasureText = 0.0f;
            }
            if (((int) fMeasureText) > 0) {
                return;
            }
        }
        View view = ((C1143030fqn) viewTreeObserverOnGlobalLayoutListenerC1151700g4m.l0).LLJJIJIIJIL;
        if (view != null) {
            C786410Ut5.LJLLLLLL(8, view);
        }
    }

    public static final void onGlobalLayout$10(ViewTreeObserverOnGlobalLayoutListenerC1151700g4m viewTreeObserverOnGlobalLayoutListenerC1151700g4m) {
        ((C1124290fMZ) viewTreeObserverOnGlobalLayoutListenerC1151700g4m.l0).LJJLIIIJ();
    }

    public static final void onGlobalLayout$11(ViewTreeObserverOnGlobalLayoutListenerC1151700g4m viewTreeObserverOnGlobalLayoutListenerC1151700g4m) {
        ViewTreeObserver viewTreeObserver;
        RunnableC781530UlD runnableC781530UlD = ((C1128710fTh) viewTreeObserverOnGlobalLayoutListenerC1151700g4m.l0).LLJJIII;
        if (runnableC781530UlD != null && (viewTreeObserver = runnableC781530UlD.getViewTreeObserver()) != null) {
            viewTreeObserver.removeOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC1151700g4m);
            C2187701Ajg.LIZIZ(viewTreeObserver, viewTreeObserverOnGlobalLayoutListenerC1151700g4m, ViewTreeObserver.OnGlobalLayoutListener.class);
        }
        C1128710fTh c1128710fTh = (C1128710fTh) viewTreeObserverOnGlobalLayoutListenerC1151700g4m.l0;
        if (!c1128710fTh.LLLZIL && c1128710fTh.LLLZLL) {
            c1128710fTh.LLLZLL = false;
            long jUptimeMillis = SystemClock.uptimeMillis() - ((C1128710fTh) viewTreeObserverOnGlobalLayoutListenerC1151700g4m.l0).LLLZLZ;
            C1128590fTV.LJJJ = SystemClock.uptimeMillis();
            C1128590fTV.LJJIII = jUptimeMillis;
            C1128750fTl.LIZLLL(jUptimeMillis, ((C1128710fTh) viewTreeObserverOnGlobalLayoutListenerC1151700g4m.l0).LLZ);
        }
    }

    public static final void onGlobalLayout$12(ViewTreeObserverOnGlobalLayoutListenerC1151700g4m viewTreeObserverOnGlobalLayoutListenerC1151700g4m) {
        int marginEnd;
        C1914560zvC c1914560zvC = ((C1914550zvB) viewTreeObserverOnGlobalLayoutListenerC1151700g4m.l0).LJ;
        C1914560zvC c1914560zvC2 = null;
        if (c1914560zvC == null) {
            c1914560zvC = null;
        }
        C786410Ut5.C3(c1914560zvC.LLIZ.getViewTreeObserver(), viewTreeObserverOnGlobalLayoutListenerC1151700g4m);
        C1914550zvB c1914550zvB = (C1914550zvB) viewTreeObserverOnGlobalLayoutListenerC1151700g4m.l0;
        C1914560zvC c1914560zvC3 = c1914550zvB.LJ;
        if (c1914560zvC3 == null) {
            c1914560zvC3 = null;
        }
        FrameLayout frameLayout = c1914560zvC3.LLIZLLLIL;
        C1914560zvC c1914560zvC4 = c1914550zvB.LJ;
        if (c1914560zvC4 == null) {
            c1914560zvC4 = null;
        }
        int width = c1914560zvC4.LLIZ.getWidth();
        C1914560zvC c1914560zvC5 = c1914550zvB.LJ;
        if (c1914560zvC5 != null) {
            c1914560zvC2 = c1914560zvC5;
        }
        ViewGroup.LayoutParams layoutParams = c1914560zvC2.LLIZ.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            marginEnd = ((ViewGroup.MarginLayoutParams) layoutParams).getMarginEnd();
        } else {
            marginEnd = 0;
        }
        C786410Ut5.a6(frameLayout, new LinearLayout.LayoutParams(width + marginEnd, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0))));
        C786410Ut5.LJZ(0, frameLayout);
    }

    public static final void onGlobalLayout$2(ViewTreeObserverOnGlobalLayoutListenerC1151700g4m viewTreeObserverOnGlobalLayoutListenerC1151700g4m) {
        C786410Ut5.C3(((C1086750eO1) viewTreeObserverOnGlobalLayoutListenerC1151700g4m.l0).getViewTreeObserver(), viewTreeObserverOnGlobalLayoutListenerC1151700g4m);
        if (((C1086750eO1) viewTreeObserverOnGlobalLayoutListenerC1151700g4m.l0).getWidth() > 0 && ((C1086750eO1) viewTreeObserverOnGlobalLayoutListenerC1151700g4m.l0).getVisibility() == 0) {
            C1086750eO1 c1086750eO1 = (C1086750eO1) viewTreeObserverOnGlobalLayoutListenerC1151700g4m.l0;
            c1086750eO1.LLJJIJIIJIL.removeCallbacks(c1086750eO1.LLJJJ);
            C1086750eO1 c1086750eO12 = (C1086750eO1) viewTreeObserverOnGlobalLayoutListenerC1151700g4m.l0;
            C786410Ut5.LJJZZIII(c1086750eO12.LLJJIJIIJIL, c1086750eO12.LLJJJ);
            return;
        }
        if (!((C1086750eO1) viewTreeObserverOnGlobalLayoutListenerC1151700g4m.l0).isShown()) {
            C20441214yg.LIZIZ("TakeStageMarquee", "onGlobalLayout. isShown is false, skip");
        } else {
            C1086750eO1 c1086750eO13 = (C1086750eO1) viewTreeObserverOnGlobalLayoutListenerC1151700g4m.l0;
            HandlerHook.viewPost(c1086750eO13, new ARunnableS22S1100000_17(c1086750eO13, "scheduleTryStartMarquee", 2));
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static final void onGlobalLayout$3(ViewTreeObserverOnGlobalLayoutListenerC1151700g4m viewTreeObserverOnGlobalLayoutListenerC1151700g4m) {
        RecyclerView.LayoutManager layoutManager;
        LinearLayoutManager linearLayoutManager;
        boolean z;
        List<InterfaceC1891350zJl> listLJII;
        long j;
        boolean z2;
        ViewTreeObserver viewTreeObserver;
        C20600815jK<InterfaceC1891350zJl> state;
        int i;
        RecyclerView.LayoutManager layoutManager2;
        LinearLayoutManager linearLayoutManager2;
        C20600815jK<InterfaceC1891350zJl> state2;
        if (((GiftAnchorPanelGiftPageCenterAssem) viewTreeObserverOnGlobalLayoutListenerC1151700g4m.l0).getLifecycle().getCurrentState().isAtLeast(Lifecycle.State.RESUMED)) {
            ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = ((GiftAnchorPanelGiftPageCenterAssem) viewTreeObserverOnGlobalLayoutListenerC1151700g4m.l0).LLJJJIL;
            Long lValueOf = null;
            if (viewOnAttachStateChangeListenerC20604515jv != null) {
                layoutManager = viewOnAttachStateChangeListenerC20604515jv.getLayoutManager();
            } else {
                layoutManager = null;
            }
            if ((layoutManager instanceof GridLayoutManager) && (linearLayoutManager = (LinearLayoutManager) layoutManager) != null) {
                GiftAnchorPanelGiftPageCenterAssem giftAnchorPanelGiftPageCenterAssem = (GiftAnchorPanelGiftPageCenterAssem) viewTreeObserverOnGlobalLayoutListenerC1151700g4m.l0;
                int iFindFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
                int iFindLastVisibleItemPosition = linearLayoutManager.findLastVisibleItemPosition();
                if (iFindFirstVisibleItemPosition >= 0 && iFindLastVisibleItemPosition >= 0) {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    C1146350fw9 c1146350fw9LIZIZ = C1146440fwI.LIZIZ(giftAnchorPanelGiftPageCenterAssem.ip().getState().LLILLJJLI);
                    if (c1146350fw9LIZIZ != null) {
                        if (!c1146350fw9LIZIZ.LLJJIJI) {
                            ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv2 = giftAnchorPanelGiftPageCenterAssem.LLJJJIL;
                            if (viewOnAttachStateChangeListenerC20604515jv2 != null && (state2 = viewOnAttachStateChangeListenerC20604515jv2.getState()) != null) {
                                Iterator it2 = ((ArrayList) state2.LJII()).iterator();
                                i = 0;
                                while (true) {
                                    if (!it2.hasNext()) {
                                        break;
                                    }
                                    InterfaceC1891350zJl interfaceC1891350zJl = (InterfaceC1891350zJl) it2.next();
                                    if ((interfaceC1891350zJl instanceof C1146350fw9) && ((C1146350fw9) interfaceC1891350zJl).LL == c1146350fw9LIZIZ.LL) {
                                        if (i >= 0) {
                                        }
                                    } else {
                                        i++;
                                    }
                                }
                            } else {
                                i = 0;
                            }
                            if (i < iFindFirstVisibleItemPosition || i > iFindLastVisibleItemPosition) {
                                ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv3 = giftAnchorPanelGiftPageCenterAssem.LLJJJIL;
                                if (viewOnAttachStateChangeListenerC20604515jv3 != null) {
                                    layoutManager2 = viewOnAttachStateChangeListenerC20604515jv3.getLayoutManager();
                                } else {
                                    layoutManager2 = null;
                                }
                                if ((layoutManager2 instanceof GridLayoutManager) && (linearLayoutManager2 = (LinearLayoutManager) layoutManager2) != null) {
                                    linearLayoutManager2.scrollToPositionWithOffset(i, 0);
                                }
                                ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv4 = giftAnchorPanelGiftPageCenterAssem.LLJJJIL;
                                if (viewOnAttachStateChangeListenerC20604515jv4 != null) {
                                    HandlerHook.viewPost(viewOnAttachStateChangeListenerC20604515jv4, new ARunnableS117S0100000_17(giftAnchorPanelGiftPageCenterAssem, 79));
                                }
                                z = false;
                            }
                        }
                        z = true;
                    } else {
                        z = false;
                    }
                    boolean z3 = giftAnchorPanelGiftPageCenterAssem.ip().getState().LLILZ;
                    C1133630fbd c1133630fbd = giftAnchorPanelGiftPageCenterAssem.hp().LLILZIL;
                    String str = giftAnchorPanelGiftPageCenterAssem.hp().LLILLL;
                    ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv5 = giftAnchorPanelGiftPageCenterAssem.LLJJJIL;
                    if (viewOnAttachStateChangeListenerC20604515jv5 != null && (state = viewOnAttachStateChangeListenerC20604515jv5.getState()) != null) {
                        listLJII = state.LJII();
                    } else {
                        listLJII = C13BV.INSTANCE;
                    }
                    C1146350fw9 c1146350fw9LIZIZ2 = C1146440fwI.LIZIZ(giftAnchorPanelGiftPageCenterAssem.ip().getState().LLILLJJLI);
                    if (c1146350fw9LIZIZ2 != null) {
                        lValueOf = Long.valueOf(c1146350fw9LIZIZ2.LL);
                    }
                    long j2 = giftAnchorPanelGiftPageCenterAssem.hp().LLILZLL;
                    C1146150fvp c1146150fvp = giftAnchorPanelGiftPageCenterAssem.hp().LLILZ;
                    if (c1146150fvp != null) {
                        j = c1146150fvp.LIZ;
                    } else {
                        j = 0;
                    }
                    long jLIZ = C158B.LIZ() - (giftAnchorPanelGiftPageCenterAssem.hp().LL.getCreateTime() * ((long) LSPassThroughRecordSizeConfig.DEFAULT));
                    C1146150fvp c1146150fvp2 = giftAnchorPanelGiftPageCenterAssem.hp().LLILZ;
                    if (c1146150fvp2 != null && c1146150fvp2.LIZJ > 1) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    c1133630fbd.LJ(str, iFindFirstVisibleItemPosition, iFindLastVisibleItemPosition, listLJII, z, lValueOf, j2, j, jLIZ, z2, jCurrentTimeMillis, z3 ? 1 : 0);
                    ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv6 = giftAnchorPanelGiftPageCenterAssem.LLJJJIL;
                    if (viewOnAttachStateChangeListenerC20604515jv6 != null && (viewTreeObserver = viewOnAttachStateChangeListenerC20604515jv6.getViewTreeObserver()) != null) {
                        viewTreeObserver.removeOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC1151700g4m);
                        C2187701Ajg.LIZIZ(viewTreeObserver, viewTreeObserverOnGlobalLayoutListenerC1151700g4m, ViewTreeObserver.OnGlobalLayoutListener.class);
                    }
                }
            }
        }
    }

    public static final void onGlobalLayout$4(ViewTreeObserverOnGlobalLayoutListenerC1151700g4m viewTreeObserverOnGlobalLayoutListenerC1151700g4m) {
        int iMeasureText = (int) ((C1117710fBx) viewTreeObserverOnGlobalLayoutListenerC1151700g4m.l0).LLILLJJLI.getPaint().measureText(((C1117710fBx) viewTreeObserverOnGlobalLayoutListenerC1151700g4m.l0).LLILLJJLI.getText().toString());
        if (iMeasureText > ((C1117710fBx) viewTreeObserverOnGlobalLayoutListenerC1151700g4m.l0).LLILLJJLI.getWidth()) {
            iMeasureText = ((C1117710fBx) viewTreeObserverOnGlobalLayoutListenerC1151700g4m.l0).LLILLJJLI.getWidth();
        }
        int iLIZIZ = iMeasureText + ((int) C497740JfY.LIZIZ(3.0f));
        ImageView imageView = ((C1117710fBx) viewTreeObserverOnGlobalLayoutListenerC1151700g4m.l0).LLJJJ;
        C1117830fC9.LJ(iLIZIZ, imageView);
        imageView.requestLayout();
    }

    public static final void onGlobalLayout$5(ViewTreeObserverOnGlobalLayoutListenerC1151700g4m viewTreeObserverOnGlobalLayoutListenerC1151700g4m) {
        int iMeasureText = (int) ((C1117710fBx) viewTreeObserverOnGlobalLayoutListenerC1151700g4m.l0).LLJI.getPaint().measureText(((C1117710fBx) viewTreeObserverOnGlobalLayoutListenerC1151700g4m.l0).LLJI.getText().toString());
        if (iMeasureText > ((C1117710fBx) viewTreeObserverOnGlobalLayoutListenerC1151700g4m.l0).LLJI.getWidth()) {
            iMeasureText = ((C1117710fBx) viewTreeObserverOnGlobalLayoutListenerC1151700g4m.l0).LLJI.getWidth();
        }
        int iLIZIZ = iMeasureText + ((int) C497740JfY.LIZIZ(3.0f));
        ImageView imageView = ((C1117710fBx) viewTreeObserverOnGlobalLayoutListenerC1151700g4m.l0).LLJJJ;
        C1117830fC9.LJ(iLIZIZ, imageView);
        imageView.requestLayout();
    }

    public static final void onGlobalLayout$6(ViewTreeObserverOnGlobalLayoutListenerC1151700g4m viewTreeObserverOnGlobalLayoutListenerC1151700g4m) {
        C786410Ut5.C3(((C1147840fyY) viewTreeObserverOnGlobalLayoutListenerC1151700g4m.l0).getViewTreeObserver(), viewTreeObserverOnGlobalLayoutListenerC1151700g4m);
        C1147840fyY c1147840fyY = (C1147840fyY) viewTreeObserverOnGlobalLayoutListenerC1151700g4m.l0;
        c1147840fyY.LLILZ = c1147840fyY.LLILZIL.getWidth();
        ((C1147840fyY) viewTreeObserverOnGlobalLayoutListenerC1151700g4m.l0).e0();
    }

    public static final void onGlobalLayout$7(ViewTreeObserverOnGlobalLayoutListenerC1151700g4m viewTreeObserverOnGlobalLayoutListenerC1151700g4m) {
        int width;
        C16F5 c16f5 = ((AbsNewFansClubJoinDialog) viewTreeObserverOnGlobalLayoutListenerC1151700g4m.l0).LLJILLL;
        int width2 = 0;
        if (c16f5 != null) {
            width = c16f5.getWidth();
        } else {
            width = 0;
        }
        C16F5 c16f52 = ((AbsNewFansClubJoinDialog) viewTreeObserverOnGlobalLayoutListenerC1151700g4m.l0).LLJILJILJ;
        if (c16f52 != null) {
            width2 = c16f52.getWidth();
        }
        int i = width + width2;
        AbsNewFansClubJoinDialog absNewFansClubJoinDialog = (AbsNewFansClubJoinDialog) viewTreeObserverOnGlobalLayoutListenerC1151700g4m.l0;
        int i2 = absNewFansClubJoinDialog.LLJJL;
        if (i > i2) {
            width2 -= i - i2;
        }
        C16F5 c16f53 = absNewFansClubJoinDialog.LLJILJILJ;
        if (c16f53 != null) {
            ViewGroup.LayoutParams layoutParams = c16f53.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.width = width2;
            } else {
                layoutParams = null;
            }
            C786410Ut5.y6(c16f53, layoutParams);
        }
    }

    public static final void onGlobalLayout$8(ViewTreeObserverOnGlobalLayoutListenerC1151700g4m viewTreeObserverOnGlobalLayoutListenerC1151700g4m) {
        if (((UserCurrentRegionCell) viewTreeObserverOnGlobalLayoutListenerC1151700g4m.l0).itemView.getMeasuredWidth() > 0) {
            UserCurrentRegionCell userCurrentRegionCell = (UserCurrentRegionCell) viewTreeObserverOnGlobalLayoutListenerC1151700g4m.l0;
            LinearLayout linearLayout = userCurrentRegionCell.LLILLJJLI;
            if (linearLayout == null) {
                linearLayout = null;
            }
            linearLayout.setMinimumWidth((userCurrentRegionCell.itemView.getMeasuredWidth() - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8))) / 2);
            C786410Ut5.C3(((UserCurrentRegionCell) viewTreeObserverOnGlobalLayoutListenerC1151700g4m.l0).itemView.getViewTreeObserver(), viewTreeObserverOnGlobalLayoutListenerC1151700g4m);
        }
    }

    public static final void onGlobalLayout$9(ViewTreeObserverOnGlobalLayoutListenerC1151700g4m viewTreeObserverOnGlobalLayoutListenerC1151700g4m) {
        C786410Ut5.C3(((View) viewTreeObserverOnGlobalLayoutListenerC1151700g4m.l0).getViewTreeObserver(), viewTreeObserverOnGlobalLayoutListenerC1151700g4m);
        View view = (View) viewTreeObserverOnGlobalLayoutListenerC1151700g4m.l0;
        AnimationSet animationSet = new AnimationSet(true);
        View view2 = (View) viewTreeObserverOnGlobalLayoutListenerC1151700g4m.l0;
        animationSet.addAnimation(new AlphaAnimation(0.0f, 1.0f));
        animationSet.addAnimation(new TranslateAnimation(0.0f, 0.0f, view2.getHeight() - C497740JfY.LIZIZ(12.0f), 0.0f));
        animationSet.setDuration(300L);
        animationSet.setInterpolator(new DecelerateInterpolator());
        view.startAnimation(animationSet);
    }

    public ViewTreeObserverOnGlobalLayoutListenerC1151700g4m(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }
}
