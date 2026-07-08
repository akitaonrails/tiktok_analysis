package Y;

import X.C0H0N;
import X.C0IJT;
import X.C0IO9;
import X.C0IOB;
import X.C0IOC;
import X.C0IOE;
import X.C0IQV;
import X.C0IRE;
import X.C0J30;
import X.C0J31;
import X.C0K8U;
import X.C1295960jpS;
import X.C1389890mGx;
import X.C13LZ;
import X.C16FZ;
import X.C201955140j;
import X.C20441214yg;
import X.C21578619ce;
import X.C21601619gM;
import X.C2188811AlT;
import X.C418440Gaw;
import X.C464610IJv;
import X.C464770IKl;
import X.C465540INk;
import X.C466240IQc;
import X.C466270IQf;
import X.C466280IQg;
import X.C469460Ib2;
import X.C472700IgG;
import X.C474500IjA;
import X.C497740JfY;
import X.C500260Jjc;
import X.C500910Jkf;
import X.C554890LpX;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC482480Iw2;
import X.InterfaceC466370IQp;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.EditText;
import android.widget.ImageView;
import com.bytedance.android.livesdk.LiveRoomFragment;
import com.bytedance.android.livesdk.chatroom.slide.v1.LiveAnimationDegradeSettings;
import com.bytedance.android.livesdk.chatroom.ui.LivePlayFragment;
import com.bytedance.android.livesdk.chatroom.ui.PortraitAudienceInteractionFragment;
import com.bytedance.android.livesdk.dataChannel.CastersWidgetVisibleChannel;
import com.bytedance.android.livesdk.dataChannel.InteractiveTopBarViewTopChannel;
import com.bytedance.android.livesdk.dataChannel.ViewPagerScrollInterceptionGlobalEvent;
import com.bytedance.android.livesdk.list.MultiPlusFeedRoomListProviderV2;
import com.bytedance.android.livesdk.livesetting.watchlive.RecommendEndAtFollowingSetting;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.tiktok.homepage.mainfragment.toolbar.LiveIconGenerator;
import com.ss.android.ugc.aweme.commercialize.ba.impl.automessage.ui.activity.BaAutoReplyEditActivity;
import com.ss.android.ugc.aweme.commercialize.ba.impl.automessage.ui.activity.BaWelcomeMessageEditActivity;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.hangout.component.distribute.view.MultiTopLiveDistributeAssem;
import com.ss.android.ugc.aweme.hangout.component.push.MultiGuestTopLivePushCardFragment;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.pcs.course.managementpage.ui.PcsCourseInfoEditAssem;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.subscription.pgc.business.foundation.editor.ui.PGCSubSpaceEditorDialogFragment;
import com.ss.android.ugc.gamora.editor.lightening.canvas.forward.onthisday.celebration.CelebrationVideoTemplatePreviewScene;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function2;
import qo2.w;

/* JADX INFO: loaded from: classes8.dex */
public class ATListenerS441S0100000_7 implements View.OnTouchListener {
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
            case 14:
                return onTouch$14(this, view, motionEvent);
            case 15:
                return onTouch$15(this, view, motionEvent);
            default:
                return false;
        }
    }

    public ATListenerS441S0100000_7(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final boolean onTouch$0(ATListenerS441S0100000_7 aTListenerS441S0100000_7, View view, MotionEvent motionEvent) {
        C1295960jpS c1295960jpS = ((C466280IQg) aTListenerS441S0100000_7.l0).LLILLJJLI;
        if (c1295960jpS != null) {
            c1295960jpS.cancelAnimation();
        }
        C466280IQg c466280IQg = (C466280IQg) aTListenerS441S0100000_7.l0;
        c466280IQg.animate().alpha(0.0f).setDuration(200L).setListener(new ALAdapterS4S0100000_7(c466280IQg, 0));
        return false;
    }

    public static final boolean onTouch$1(ATListenerS441S0100000_7 aTListenerS441S0100000_7, View view, MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked != 1 && actionMasked != 3) {
                return false;
            }
            ((MultiTopLiveDistributeAssem) aTListenerS441S0100000_7.l0).LLJJJJJIL = false;
            DataChannelGlobal.LLILZ.FQ2(ViewPagerScrollInterceptionGlobalEvent.class, Boolean.FALSE);
            return false;
        }
        ((MultiTopLiveDistributeAssem) aTListenerS441S0100000_7.l0).LLJJJJJIL = true;
        DataChannelGlobal.LLILZ.FQ2(ViewPagerScrollInterceptionGlobalEvent.class, Boolean.TRUE);
        return false;
    }

    public static final boolean onTouch$10(ATListenerS441S0100000_7 aTListenerS441S0100000_7, View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1) {
            PGCSubSpaceEditorDialogFragment pGCSubSpaceEditorDialogFragment = (PGCSubSpaceEditorDialogFragment) aTListenerS441S0100000_7.l0;
            if (pGCSubSpaceEditorDialogFragment.LLJILJILJ) {
                EditText editText = pGCSubSpaceEditorDialogFragment.LLILLL;
                if (editText != null) {
                    editText.setShowSoftInputOnFocus(true);
                }
                C0K8U c0k8u = ((PGCSubSpaceEditorDialogFragment) aTListenerS441S0100000_7.l0).LLJJIJI;
                if (c0k8u != null) {
                    c0k8u.LIZ();
                }
                PGCSubSpaceEditorDialogFragment.RR(((PGCSubSpaceEditorDialogFragment) aTListenerS441S0100000_7.l0).LLILLL);
                return false;
            }
            return false;
        }
        return false;
    }

    public static final boolean onTouch$11(ATListenerS441S0100000_7 aTListenerS441S0100000_7, View view, MotionEvent motionEvent) {
        ViewGroup viewGroup;
        ((PcsCourseInfoEditAssem) aTListenerS441S0100000_7.l0).getClass();
        ViewParent parent = view.getParent();
        while (true) {
            if (parent != null) {
                if (parent instanceof C21578619ce) {
                    viewGroup = (ViewGroup) parent;
                    break;
                }
                parent = parent.getParent();
            } else {
                viewGroup = null;
                break;
            }
        }
        if ((view.canScrollVertically(1) || view.canScrollVertically(-1)) && viewGroup != null) {
            viewGroup.requestDisallowInterceptTouchEvent(true);
        }
        if ((motionEvent.getAction() & 255) == 1 && viewGroup != null) {
            viewGroup.requestDisallowInterceptTouchEvent(false);
        }
        return false;
    }

    public static final boolean onTouch$12(ATListenerS441S0100000_7 aTListenerS441S0100000_7, View view, MotionEvent motionEvent) {
        boolean z;
        boolean z2;
        if (motionEvent == null) {
            return false;
        }
        if (motionEvent.getActionMasked() == 0) {
            C0J30 c0j30 = (C0J30) aTListenerS441S0100000_7.l0;
            c0j30.LJ = false;
            c0j30.LIZJ = (int) motionEvent.getRawX();
            ((C0J30) aTListenerS441S0100000_7.l0).LIZLLL = (int) motionEvent.getRawY();
        } else if (!((C0J30) aTListenerS441S0100000_7.l0).LJ && (Math.abs(motionEvent.getRawX() - ((C0J30) aTListenerS441S0100000_7.l0).LIZJ) > ((C0J30) aTListenerS441S0100000_7.l0).LJFF || Math.abs(motionEvent.getRawY() - ((C0J30) aTListenerS441S0100000_7.l0).LIZLLL) > ((C0J30) aTListenerS441S0100000_7.l0).LJFF)) {
            ((C0J30) aTListenerS441S0100000_7.l0).LJ = true;
        }
        List<Pair<View, C0J31>> list = ((C0J30) aTListenerS441S0100000_7.l0).LIZ.get(Integer.valueOf(motionEvent.getActionMasked()));
        if (list != null) {
            loop0: while (true) {
                z = true;
                for (Pair<View, C0J31> pair : list) {
                    if (!z || C0H0N.LJFF(pair.getFirst()).contains((int) motionEvent.getRawX(), (int) motionEvent.getRawY())) {
                        z = false;
                    }
                }
            }
        } else {
            z = true;
        }
        List<Pair<View, C0J31>> list2 = ((C0J30) aTListenerS441S0100000_7.l0).LIZ.get(Integer.valueOf(motionEvent.getActionMasked()));
        if (list2 != null) {
            C0J30 c0j302 = (C0J30) aTListenerS441S0100000_7.l0;
            loop2: while (true) {
                z2 = false;
                for (Pair<View, C0J31> pair2 : list2) {
                    if (z2 || (pair2.getSecond().LIZ(!C0H0N.LJFF(pair2.getFirst()).contains((int) motionEvent.getRawX(), (int) motionEvent.getRawY()), z, c0j302.LJ) && pair2.getFirst().getVisibility() == 0)) {
                        z2 = true;
                    }
                }
            }
        } else {
            z2 = false;
        }
        List<Pair<View, C0J31>> list3 = ((C0J30) aTListenerS441S0100000_7.l0).LIZ.get(Integer.valueOf(motionEvent.getActionMasked()));
        if (list3 == null || list3.isEmpty()) {
            C0J30 c0j303 = (C0J30) aTListenerS441S0100000_7.l0;
            for (Function2 function2 : (ArrayList) c0j303.LIZIZ) {
                if (!z2 && !((Boolean) function2.invoke(motionEvent, Boolean.valueOf(c0j303.LJ))).booleanValue()) {
                    z2 = false;
                } else {
                    z2 = true;
                }
            }
        }
        return z2;
    }

    public static final boolean onTouch$13(ATListenerS441S0100000_7 aTListenerS441S0100000_7, View view, MotionEvent motionEvent) {
        C1389890mGx c1389890mGx = new C1389890mGx((BaWelcomeMessageEditActivity) aTListenerS441S0100000_7.l0);
        c1389890mGx.LJIIIZ(2131857727);
        c1389890mGx.LJIIJJI();
        return true;
    }

    public static final boolean onTouch$14(ATListenerS441S0100000_7 aTListenerS441S0100000_7, View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1) {
            C1389890mGx c1389890mGx = new C1389890mGx((BaAutoReplyEditActivity) aTListenerS441S0100000_7.l0);
            c1389890mGx.LJIIIZ(2131857727);
            c1389890mGx.LJIIJJI();
        }
        return true;
    }

    public static final boolean onTouch$15(ATListenerS441S0100000_7 aTListenerS441S0100000_7, View view, MotionEvent motionEvent) {
        View.OnTouchListener onTouchListener = ((C472700IgG) aTListenerS441S0100000_7.l0).LJ;
        if (onTouchListener != null) {
            return onTouchListener.onTouch(view, motionEvent);
        }
        return false;
    }

    public static final boolean onTouch$2(ATListenerS441S0100000_7 aTListenerS441S0100000_7, View view, MotionEvent motionEvent) {
        C466270IQf c466270IQf = (C466270IQf) aTListenerS441S0100000_7.l0;
        c466270IQf.getClass();
        if (!LiveAnimationDegradeSettings.INSTANCE.disableGuide()) {
            c466270IQf.LL.cancelAnimation();
        }
        c466270IQf.e0();
        return false;
    }

    public static final boolean onTouch$3(ATListenerS441S0100000_7 aTListenerS441S0100000_7, View view, MotionEvent motionEvent) {
        Pair pair;
        Boolean bool;
        Integer num;
        DataChannel dataChannel = ((PortraitAudienceInteractionFragment) aTListenerS441S0100000_7.l0).LLJIJIL;
        if (dataChannel != null && (pair = (Pair) dataChannel.gg0(CastersWidgetVisibleChannel.class)) != null && (bool = (Boolean) pair.getFirst()) != null && bool.booleanValue() && (num = (Integer) dataChannel.gg0(InteractiveTopBarViewTopChannel.class)) != null && num.intValue() != 0) {
            float fIntValue = num.intValue() + C497740JfY.LIZIZ(127.0f);
            if (motionEvent.getActionMasked() == 0) {
                if (motionEvent.getY() < num.intValue() || motionEvent.getY() > fIntValue) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("Caster hide cause by outer touch: topBarViewTop = ");
                    sbLIZ.append(num);
                    sbLIZ.append(", topBarViewBottom = ");
                    sbLIZ.append(fIntValue);
                    sbLIZ.append(", touchX = ");
                    sbLIZ.append(motionEvent.getX());
                    sbLIZ.append(", touchY = ");
                    sbLIZ.append(motionEvent.getY());
                    C20441214yg.LJIIIZ("Casters", C2188811AlT.LIZIZ(sbLIZ));
                    Boolean bool2 = Boolean.FALSE;
                    dataChannel.zW(CastersWidgetVisibleChannel.class, new Pair(bool2, bool2));
                    return false;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public static final boolean onTouch$4(ATListenerS441S0100000_7 aTListenerS441S0100000_7, View view, MotionEvent motionEvent) {
        ((C500910Jkf) aTListenerS441S0100000_7.l0).LLILLL.invoke();
        return true;
    }

    public static final boolean onTouch$5(ATListenerS441S0100000_7 aTListenerS441S0100000_7, View view, MotionEvent motionEvent) {
        boolean z;
        boolean z2;
        int iLJIILLIIL;
        boolean zOR;
        int iAbs;
        C21601619gM c21601619gM;
        int i;
        String str;
        InterfaceC466370IQp currentFragment;
        LiveRoomFragment liveRoomFragment = (LiveRoomFragment) aTListenerS441S0100000_7.l0;
        liveRoomFragment.getClass();
        int action = motionEvent.getAction();
        if (action != 1) {
            if (action == 2) {
                InterfaceC466370IQp currentFragment2 = liveRoomFragment.getCurrentFragment();
                InterfaceC466370IQp interfaceC466370IQpZR = liveRoomFragment.ZR();
                if (interfaceC466370IQpZR != null && (interfaceC466370IQpZR instanceof LivePlayFragment) && currentFragment2 != null && (currentFragment2 instanceof LivePlayFragment)) {
                    float y = motionEvent.getY() - liveRoomFragment.LLLJIL.getInitialMotionY();
                    liveRoomFragment.LLJI = y;
                    ((LivePlayFragment) interfaceC466370IQpZR).xU(y);
                    ((LivePlayFragment) currentFragment2).xU(y);
                }
            }
        } else {
            boolean z3 = C466240IQc.LIZ;
            if (z3) {
                z = C0IQV.LLJJIII.LJFF;
            } else {
                z = C465540INk.LIZLLL;
            }
            if (z) {
                InterfaceC466370IQp currentFragment3 = liveRoomFragment.getCurrentFragment();
                InterfaceC466370IQp interfaceC466370IQpZR2 = liveRoomFragment.ZR();
                if ((currentFragment3 instanceof LivePlayFragment) && interfaceC466370IQpZR2 != null && (interfaceC466370IQpZR2 instanceof LivePlayFragment)) {
                    LivePlayFragment livePlayFragment = (LivePlayFragment) currentFragment3;
                    LivePlayFragment livePlayFragment2 = (LivePlayFragment) interfaceC466370IQpZR2;
                    if (z3) {
                        C0IQV.LLJJIII.LIZIZ(livePlayFragment, livePlayFragment2);
                    } else {
                        C465540INk c465540INk = C465540INk.LIZ;
                        C465540INk.LJFF(livePlayFragment, livePlayFragment2);
                    }
                }
            }
        }
        if (liveRoomFragment.LLLJL != null && !liveRoomFragment.LLLLIILL && liveRoomFragment.getCurrentPosition() == liveRoomFragment.LLLLIIL.getCount() - 1) {
            C0IO9 c0io9 = liveRoomFragment.LLLJL;
            c0io9.getClass();
            int action2 = motionEvent.getAction();
            float y2 = motionEvent.getY() - c0io9.LIZIZ.getInitialMotionY();
            if (action2 != 1) {
                if (action2 == 2) {
                    if (y2 > 0.0f) {
                        if (c0io9.LIZLLL != C0IOB.SHOW) {
                            c0io9.LIZ("stay");
                            c0io9.LIZLLL = C0IOB.HIDE;
                        }
                    } else if (y2 < (-((int) C497740JfY.LIZIZ(30.0f))) && c0io9.LIZLLL != C0IOB.HIDE) {
                        c0io9.LIZLLL = C0IOB.SHOW;
                        C16FZ c16fz = c0io9.LJFF;
                        if ((c16fz == null || c16fz.getVisibility() != 0) && c0io9.LIZJ.LJJIFFI()) {
                            C20441214yg.LIZIZ("ScrollLoadingHelper", "show");
                            c0io9.LIZJ(-((Number) c0io9.LJI.getValue()).intValue());
                            C0IOE c0ioe = c0io9.LJII;
                            if (c0ioe != null) {
                                ((C0IOC) c0ioe).LIZ.HS();
                            }
                            C16FZ c16fz2 = c0io9.LJFF;
                            if (c16fz2 != null) {
                                C786410Ut5.LLLIZZ(c16fz2, 0);
                            }
                            C0IOE c0ioe2 = c0io9.LJII;
                            if (c0ioe2 != null && ((C0IOC) c0ioe2).LIZ.getCurrentPosition() == 0) {
                                i = 1;
                            } else {
                                i = 0;
                            }
                            C0IOE c0ioe3 = c0io9.LJII;
                            DataChannel dataChannel = null;
                            if (c0ioe3 != null && (currentFragment = ((C0IOC) c0ioe3).LIZ.getCurrentFragment()) != null) {
                                dataChannel = currentFragment.getDataChannel();
                            }
                            boolean z4 = c0io9.LJ;
                            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_slide_loadmore_show");
                            if (z4) {
                                str = "follow_recommend";
                            } else {
                                str = "normal_draw";
                            }
                            c474500IjALIZ.LJJII(str, "is_follow_recommend");
                            c474500IjALIZ.LJJII(Integer.valueOf(i), "is_first_position");
                            c474500IjALIZ.LJIJJLI(dataChannel);
                            c474500IjALIZ.LIZ();
                        }
                    }
                }
            } else {
                C20441214yg.LIZIZ("ScrollLoadingHelper", "dispatchEvent: up");
                c0io9.LIZLLL = C0IOB.IDLE;
            }
        }
        if (liveRoomFragment.LLLL != null && !liveRoomFragment.LLLLIILL && liveRoomFragment.getCurrentPosition() == liveRoomFragment.LLLLIIL.getCount() - 1 && !liveRoomFragment.LLLLIIIILLL.LJJIFFI()) {
            float y3 = motionEvent.getY() - liveRoomFragment.LLLJIL.getInitialMotionY();
            InterfaceC466370IQp currentFragment4 = liveRoomFragment.getCurrentFragment();
            if ((currentFragment4 instanceof LivePlayFragment) && motionEvent.getAction() == 2 && y3 < (-((int) C497740JfY.LIZIZ(30.0f)))) {
                liveRoomFragment.LLLL.getClass();
                ((LivePlayFragment) currentFragment4).sU(true);
            }
        }
        RecommendEndAtFollowingSetting recommendEndAtFollowingSetting = RecommendEndAtFollowingSetting.INSTANCE;
        if (recommendEndAtFollowingSetting.getValue().enableShowRecommend > 0 && (!C464610IJv.LIZ() || liveRoomFragment.getActivity() == null || !C500260Jjc.LJJII(liveRoomFragment.getActivity().getRequestedOrientation()) || (c21601619gM = liveRoomFragment.LLLJIL) == null || liveRoomFragment.LLLLJI == null || c21601619gM.getCurrentItem() != liveRoomFragment.LLLLJI.LJII())) {
            if (liveRoomFragment.LLJ <= 0.0f) {
                liveRoomFragment.LLJ = liveRoomFragment.LLLJIL.getInitialMotionY() - C464770IKl.LJIIJ;
                liveRoomFragment.LLJIJIL = liveRoomFragment.LLLJIL.getCurrentItem();
                liveRoomFragment.LLJILJIL = false;
            }
            if (Math.abs(motionEvent.getY() - liveRoomFragment.LLJ) >= 3.0f && C497740JfY.LJIILLIIL() > 0) {
                if (motionEvent.getY() - liveRoomFragment.LLJ <= 0.0f) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (liveRoomFragment.LLLLIILL) {
                    iLJIILLIIL = C497740JfY.LJIIZILJ();
                } else {
                    iLJIILLIIL = C497740JfY.LJIILLIIL();
                }
                float fAbs = Math.abs(motionEvent.getY() - liveRoomFragment.LLJ) / iLJIILLIIL;
                if (recommendEndAtFollowingSetting.getValue().enableShowRecommend == 3) {
                    int currentItem = liveRoomFragment.LLLJIL.getCurrentItem();
                    HashMap map = new HashMap();
                    if (liveRoomFragment.gS(currentItem, currentItem + 1, z2)) {
                        liveRoomFragment.LLJJIJIIJIL = true;
                        map.put("draw_action", "down");
                    } else {
                        int i2 = currentItem - 1;
                        if (recommendEndAtFollowingSetting.getValue().enableShowRecommend == 3 && !z2) {
                            if (liveRoomFragment.LLLLIIIILLL instanceof MultiPlusFeedRoomListProviderV2) {
                                if (!C469460Ib2.LIZJ()) {
                                    zOR = liveRoomFragment.LLLLIIIILLL.LJJJI(currentItem, i2);
                                }
                            } else {
                                zOR = liveRoomFragment.OR(i2, currentItem);
                            }
                            if (zOR) {
                                map.put("draw_action", "up");
                            }
                        }
                        liveRoomFragment.FS(motionEvent);
                    }
                    InterfaceC466370IQp currentFragment5 = liveRoomFragment.getCurrentFragment();
                    if (currentFragment5 != null && motionEvent.getAction() == 1) {
                        EnterRoomConfig enterRoomConfigEq = currentFragment5.Eq();
                        if (enterRoomConfigEq != null) {
                            map.put("enter_from_merge", enterRoomConfigEq.mRoomsData.enterFromMerge);
                            map.put("enter_method", enterRoomConfigEq.mRoomsData.enterMethod);
                            map.put("room_id", String.valueOf(enterRoomConfigEq.mRoomsData.roomId));
                            map.put("anchor_id", String.valueOf(enterRoomConfigEq.mRoomsData.userId));
                            C21601619gM c21601619gM2 = liveRoomFragment.LLLJIL;
                            if (c21601619gM2 == null) {
                                iAbs = -1;
                            } else {
                                iAbs = Math.abs(c21601619gM2.LLJZIJLIL);
                            }
                            map.put("speed", String.valueOf(iAbs));
                        }
                        C474500IjA c474500IjALIZ2 = C0IJT.LIZ("livesdk_end_to_recommend_slide");
                        w.LIZ.getClass();
                        c474500IjALIZ2.LJJII(w.LIZLLL(), "action_type");
                        c474500IjALIZ2.LJJIIZI(map);
                        c474500IjALIZ2.LIZ();
                    }
                    liveRoomFragment.LLJJIJIL = true;
                    float y4 = motionEvent.getY() - liveRoomFragment.LLJ;
                    if (currentFragment5 instanceof C0IRE) {
                        liveRoomFragment.ES((C0IRE) currentFragment5, fAbs, z2, true, y4);
                    }
                    if (z2) {
                        InterfaceC466370IQp interfaceC466370IQpZR3 = liveRoomFragment.ZR();
                        if (interfaceC466370IQpZR3 instanceof C0IRE) {
                            C0IRE c0ire = (C0IRE) interfaceC466370IQpZR3;
                            liveRoomFragment.LLJJJIL = c0ire;
                            liveRoomFragment.ES(c0ire, fAbs, true, false, y4);
                        }
                    } else {
                        InterfaceC466370IQp interfaceC466370IQpAS = liveRoomFragment.aS();
                        if (interfaceC466370IQpAS instanceof C0IRE) {
                            C0IRE c0ire2 = (C0IRE) interfaceC466370IQpAS;
                            liveRoomFragment.LLJJJIL = c0ire2;
                            liveRoomFragment.ES(c0ire2, fAbs, false, false, y4);
                        }
                    }
                    liveRoomFragment.FS(motionEvent);
                }
            }
            if (1 == motionEvent.getAction()) {
                liveRoomFragment.LLJ = 0.0f;
                return false;
            }
        }
        return false;
    }

    public static final boolean onTouch$6(ATListenerS441S0100000_7 aTListenerS441S0100000_7, View view, MotionEvent motionEvent) {
        ImageView imageView = ((LiveIconGenerator) aTListenerS441S0100000_7.l0).LLILZLL;
        if (imageView != null && imageView.getVisibility() == 0 && motionEvent != null && motionEvent.getAction() == 0) {
            ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).q4().P5(EnumC482480Iw2.TOUCH_PRELOAD, Boolean.TRUE);
        }
        return false;
    }

    public static final boolean onTouch$7(ATListenerS441S0100000_7 aTListenerS441S0100000_7, View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action != 2) {
                    if (action != 3) {
                        return false;
                    }
                } else {
                    float rawY = motionEvent.getRawY() - ((MultiGuestTopLivePushCardFragment) aTListenerS441S0100000_7.l0).LLJI;
                    if (rawY < 0.0f) {
                        C786410Ut5.ed(view, rawY);
                        ((MultiGuestTopLivePushCardFragment) aTListenerS441S0100000_7.l0).LLJIJIL = true;
                        if (view.getHeight() > 0) {
                            float fLIZLLL = C13LZ.LIZLLL(Math.abs(rawY) / view.getHeight(), 0.0f, 1.0f);
                            float f = 1.0f - (0.5f * fLIZLLL);
                            C786410Ut5.Ob(view, f);
                            C786410Ut5.pc(view, f);
                            C786410Ut5.T4(view, 1.0f - fLIZLLL);
                            return true;
                        }
                        return true;
                    }
                    return true;
                }
            }
            if (((MultiGuestTopLivePushCardFragment) aTListenerS441S0100000_7.l0).LLJIJIL && view.getTranslationY() < (-((MultiGuestTopLivePushCardFragment) aTListenerS441S0100000_7.l0).LLJILJIL)) {
                view.animate().translationY(-view.getHeight()).alpha(0.0f).scaleX(0.5f).scaleY(0.5f).setDuration(200L).withEndAction(new ARunnableS107S0100000_7((MultiGuestTopLivePushCardFragment) aTListenerS441S0100000_7.l0, 122)).start();
            } else {
                view.animate().translationY(0.0f).alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(200L).start();
            }
            ((MultiGuestTopLivePushCardFragment) aTListenerS441S0100000_7.l0).LLJIJIL = false;
            return true;
        }
        ((MultiGuestTopLivePushCardFragment) aTListenerS441S0100000_7.l0).LLJI = motionEvent.getRawY();
        ((MultiGuestTopLivePushCardFragment) aTListenerS441S0100000_7.l0).LLJIJIL = false;
        return true;
    }

    public static final boolean onTouch$8(ATListenerS441S0100000_7 aTListenerS441S0100000_7, View view, MotionEvent motionEvent) {
        View viewFindViewById;
        if (motionEvent.getAction() == 0 && (viewFindViewById = ((CelebrationVideoTemplatePreviewScene) aTListenerS441S0100000_7.l0).mView.findViewById(R.id.bmy)) != null) {
            viewFindViewById.getGlobalVisibleRect(new Rect());
            view.getLocationOnScreen(new int[2]);
            float x = r1[0] + motionEvent.getX();
            float y = r1[1] + motionEvent.getY();
            int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(20.0f)));
            if (x >= r4.left - iLIZIZ && x <= r4.right + iLIZIZ && y >= r4.top - iLIZIZ && y <= r4.bottom + iLIZIZ) {
                C201955140j.LIZLLL(C554890LpX.LIZIZ, "OnThisDayVideoPreviewScene", "Back button area clicked, allowing click through");
                viewFindViewById.performClick();
            }
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0067  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean onTouch$9(Y.ATListenerS441S0100000_7 r6, android.view.View r7, android.view.MotionEvent r8) {
        /*
            int r1 = r8.getActionMasked()
            r3 = 0
            if (r1 == 0) goto L7b
            r2 = 1
            if (r1 == r2) goto L67
            r0 = 2
            if (r1 == r0) goto L11
            r0 = 3
            if (r1 == r0) goto L67
        L10:
            return r3
        L11:
            float r5 = r8.getRawY()
            java.lang.Object r0 = r6.l0
            com.ss.android.ugc.aweme.hangout.component.interact.view.HangoutInteractModuleV2Assem r0 = (com.ss.android.ugc.aweme.hangout.component.interact.view.HangoutInteractModuleV2Assem) r0
            float r0 = r0.LLJJJJ
            float r5 = r5 - r0
            float r4 = r8.getRawX()
            java.lang.Object r1 = r6.l0
            com.ss.android.ugc.aweme.hangout.component.interact.view.HangoutInteractModuleV2Assem r1 = (com.ss.android.ugc.aweme.hangout.component.interact.view.HangoutInteractModuleV2Assem) r1
            float r0 = r1.LLJJJJJIL
            float r4 = r4 - r0
            boolean r0 = r1.LLJJJJLIIL
            if (r0 != 0) goto L10
            float r1 = java.lang.Math.abs(r5)
            java.lang.Object r0 = r6.l0
            com.ss.android.ugc.aweme.hangout.component.interact.view.HangoutInteractModuleV2Assem r0 = (com.ss.android.ugc.aweme.hangout.component.interact.view.HangoutInteractModuleV2Assem) r0
            X.01GW r0 = r0.LLJJL
            java.lang.Object r0 = r0.getValue()
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            float r0 = (float) r0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 <= 0) goto L10
            float r1 = java.lang.Math.abs(r5)
            float r0 = java.lang.Math.abs(r4)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 <= 0) goto L10
            java.lang.Object r0 = r6.l0
            com.ss.android.ugc.aweme.hangout.component.interact.view.HangoutInteractModuleV2Assem r0 = (com.ss.android.ugc.aweme.hangout.component.interact.view.HangoutInteractModuleV2Assem) r0
            r0.LLJJJJLIIL = r2
            com.bytedance.ies.sdk.datachannel.DataChannelGlobal r2 = com.bytedance.ies.sdk.datachannel.DataChannelGlobal.LLILZ
            java.lang.Class<com.bytedance.android.livesdk.dataChannel.ViewPagerScrollInterceptionGlobalEvent> r1 = com.bytedance.android.livesdk.dataChannel.ViewPagerScrollInterceptionGlobalEvent.class
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r2.FQ2(r1, r0)
            java.lang.String r1 = "InteractModuleV2Assem"
            java.lang.String r0 = "vertical scroll detected, intercept ViewPager"
            X.C20441214yg.LIZIZ(r1, r0)
            return r3
        L67:
            java.lang.Object r1 = r6.l0
            com.ss.android.ugc.aweme.hangout.component.interact.view.HangoutInteractModuleV2Assem r1 = (com.ss.android.ugc.aweme.hangout.component.interact.view.HangoutInteractModuleV2Assem) r1
            boolean r0 = r1.LLJJJJLIIL
            if (r0 == 0) goto L10
            r1.LLJJJJLIIL = r3
            com.bytedance.ies.sdk.datachannel.DataChannelGlobal r2 = com.bytedance.ies.sdk.datachannel.DataChannelGlobal.LLILZ
            java.lang.Class<com.bytedance.android.livesdk.dataChannel.ViewPagerScrollInterceptionGlobalEvent> r1 = com.bytedance.android.livesdk.dataChannel.ViewPagerScrollInterceptionGlobalEvent.class
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r2.FQ2(r1, r0)
            return r3
        L7b:
            java.lang.Object r1 = r6.l0
            com.ss.android.ugc.aweme.hangout.component.interact.view.HangoutInteractModuleV2Assem r1 = (com.ss.android.ugc.aweme.hangout.component.interact.view.HangoutInteractModuleV2Assem) r1
            float r0 = r8.getRawX()
            r1.LLJJJJJIL = r0
            java.lang.Object r1 = r6.l0
            com.ss.android.ugc.aweme.hangout.component.interact.view.HangoutInteractModuleV2Assem r1 = (com.ss.android.ugc.aweme.hangout.component.interact.view.HangoutInteractModuleV2Assem) r1
            float r0 = r8.getRawY()
            r1.LLJJJJ = r0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ATListenerS441S0100000_7.onTouch$9(Y.ATListenerS441S0100000_7, android.view.View, android.view.MotionEvent):boolean");
    }
}
