package Y;

import X.AbstractC476820Imu;
import X.AbstractC478120Ip0;
import X.AbstractC478270IpF;
import X.C0JFN;
import X.C1161920gLG;
import X.C1308910kAL;
import X.C1361400lX0;
import X.C1602160rnK;
import X.C16F5;
import X.C1834150xpV;
import X.C19EG;
import X.C1C7U;
import X.C20441214yg;
import X.C21374118kl;
import X.C2188811AlT;
import X.C339190DRl;
import X.C418440Gaw;
import X.C422640Ghi;
import X.C468640IZi;
import X.C472280Ifa;
import X.C472450Ifr;
import X.C472490Ifv;
import X.C474850Ijj;
import X.C475700Il6;
import X.C476890In1;
import X.C477190InV;
import X.C477370Inn;
import X.C477400Inq;
import X.C477430Int;
import X.C477530Io3;
import X.C478110Ioz;
import X.C484270Iyv;
import X.C484860Izs;
import X.C497740JfY;
import X.C500260Jjc;
import X.C521610Kcx;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC471790Ien;
import X.EnumC476910In3;
import X.EnumC476920In4;
import X.InterfaceC1106030et7;
import X.InterfaceC476860Imy;
import X.InterfaceC477240Ina;
import X.ViewOnAttachStateChangeListenerC521700Kd6;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.feed.api.ILiveFeedApiService;
import com.bytedance.android.livesdk.interaction.drawguess.ui.DrawGuessStatusWidget;
import com.bytedance.android.livesdk.livesetting.feed.LiveInfeedSkylightEntranceAutoExpandSetting;
import com.bytedance.android.livesdk.livesetting.feed.LiveInfeedSkylightEntranceSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.HangoutRoomFeedEnableSetting;
import com.bytedance.android.livesdk.livesetting.skylight.LiveTopLiveEventSpaceSetting;
import com.bytedance.android.livesdk.livesetting.skylight.LiveTopLiveNotificationSetting;
import com.bytedance.android.livesdk.livesetting.skylight.LiveTopLiveSkylightOptSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveWatchLaterSettingSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.TopliveSkylightAutoOpenOpt;
import com.bytedance.android.livesdk.pad.IPadMultiScreenService;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import webcast.api.feed.TopliveNoticeUnreadCountData;

/* JADX INFO: loaded from: classes8.dex */
public class ARunnableS10S0210000_7 implements Runnable {
    public final int $t;
    public Object l0;
    public Object l1;
    public boolean z2;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                break;
            case 1:
                run$1(this);
                break;
            case 2:
                run$2(this);
                break;
            case 3:
                run$3(this);
                break;
            case 4:
                run$4(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void LIZ$0() {
        InterfaceC476860Imy interfaceC476860ImyLIZLLL;
        InterfaceC476860Imy interfaceC476860ImyLIZLLL2;
        RecyclerView.LayoutManager layoutManager;
        ViewGroup viewGroup;
        RecyclerView recyclerView;
        C472280Ifa c472280Ifa;
        TopliveNoticeUnreadCountData topliveNoticeUnreadCountData;
        C477430Int c477430Int;
        C477530Io3 c477530Io3;
        AbstractC476820Imu abstractC476820Imu = (AbstractC476820Imu) this.l0;
        boolean z = this.z2;
        InterfaceC477240Ina interfaceC477240Ina = (InterfaceC477240Ina) this.l1;
        ViewGroup viewGroup2 = abstractC476820Imu.LJIJI;
        int i = 1;
        if (viewGroup2 != null) {
            C477430Int c477430Int2 = new C477430Int(viewGroup2);
            abstractC476820Imu.LJIJJ = c477430Int2;
            C786410Ut5.I7(new ACListenerS142S0100000_7(c477430Int2, 191), (View) c477430Int2.LJ.getValue());
            LiveTopLiveNotificationSetting liveTopLiveNotificationSetting = LiveTopLiveNotificationSetting.INSTANCE;
            if (liveTopLiveNotificationSetting.getEnable()) {
                View view = (View) c477430Int2.LIZIZ.getValue();
                int visibility = view.getVisibility();
                view.setVisibility(0);
                C1602160rnK.LIZIZ(visibility, 0, view);
                Long l = C484270Iyv.LIZLLL;
                if (l != null) {
                    boolean z2 = l.longValue() > 0;
                    C477400Inq c477400Inq = (C477400Inq) c477430Int2.LIZIZ.getValue();
                    if (z2) {
                        C339190DRl.LIZLLL(c477400Inq.getAlertDot());
                    } else {
                        C339190DRl.LIZIZ(c477400Inq.getAlertDot());
                    }
                }
            }
            if (LiveTopLiveEventSpaceSetting.INSTANCE.getEnable() && (c477530Io3 = (C477530Io3) c477430Int2.LIZLLL.getValue()) != null) {
                c477530Io3.LIZLLL(true);
            }
            if (LiveWatchLaterSettingSetting.INSTANCE.getValue() == 1) {
                View view2 = (View) c477430Int2.LIZJ.getValue();
                if (view2 != null) {
                    int visibility2 = view2.getVisibility();
                    view2.setVisibility(0);
                    C1602160rnK.LIZIZ(visibility2, 0, view2);
                }
                ((ILiveFeedApiService) C1161920gLG.LIZJ(ILiveFeedApiService.class)).zr();
                int iLIZ = C468640IZi.LIZ();
                C477370Inn c477370Inn = (C477370Inn) c477430Int2.LIZJ.getValue();
                if (c477370Inn != null) {
                    c477370Inn.i0(iLIZ);
                }
            }
            if (liveTopLiveNotificationSetting.getEnable() && (topliveNoticeUnreadCountData = abstractC476820Imu.LJJJJJL) != null && (c477430Int = abstractC476820Imu.LJIJJ) != null) {
                boolean z3 = topliveNoticeUnreadCountData.unreadCount > 0;
                C477400Inq c477400Inq2 = (C477400Inq) c477430Int.LIZIZ.getValue();
                if (z3) {
                    C339190DRl.LIZLLL(c477400Inq2.getAlertDot());
                } else {
                    C339190DRl.LIZIZ(c477400Inq2.getAlertDot());
                }
            }
        }
        C422640Ghi c422640Ghi = abstractC476820Imu.LJJ;
        if (c422640Ghi != null) {
            Integer numLIZJ = C1308910kAL.LIZJ(HangoutRoomFeedEnableSetting.INSTANCE.isEnable() ? R.attr.kd : R.attr.zm, C1834150xpV.LJII(abstractC476820Imu.LIZ));
            if (numLIZJ != null) {
                c422640Ghi.setBackgroundColor(numLIZJ.intValue());
            }
        }
        ViewGroup viewGroup3 = abstractC476820Imu.LJJIII;
        if (viewGroup3 != null) {
            viewGroup3.getLayoutParams().height = (int) C497740JfY.LIZIZ(C474850Ijj.LIZLLL() - 14);
        }
        if (LiveTopLiveSkylightOptSetting.INSTANCE.getEnable() && (c472280Ifa = abstractC476820Imu.LJIILJJIL) != null && abstractC476820Imu.LJIJ == null) {
            C1361400lX0 c1361400lX0 = new C1361400lX0(c472280Ifa.getContext(), R.style.y0);
            FrameLayout frameLayout = new FrameLayout(c1361400lX0);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(65)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(18)));
            layoutParams.gravity = 49;
            layoutParams.topMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
            C786410Ut5.a6(frameLayout, layoutParams);
            frameLayout.setBackgroundResource(R.drawable.cgn);
            C786410Ut5.LJZ(8, frameLayout);
            TuxIconView tuxIconView = new TuxIconView(c1361400lX0, null, 0, 6, null);
            tuxIconView.setIconRes(R.raw.icon_chevron_up_fill);
            tuxIconView.setTintColorRes(R.attr.exr);
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(14)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(14)));
            layoutParams2.gravity = 17;
            C786410Ut5.M6(tuxIconView, layoutParams2);
            frameLayout.addView(tuxIconView);
            c472280Ifa.addView(frameLayout);
            abstractC476820Imu.LJIJ = frameLayout;
        }
        boolean zLIZ = C474850Ijj.LIZ(abstractC476820Imu.LJ);
        C477190InV c477190InVTI = ((ILiveFeedApiService) C1161920gLG.LIZJ(ILiveFeedApiService.class)).TI(abstractC476820Imu.LJJJJLI, abstractC476820Imu.LJJI(), abstractC476820Imu.LJ, abstractC476820Imu.LIZIZ);
        abstractC476820Imu.LJJI = c477190InVTI;
        if (c477190InVTI != null) {
            FrameLayout frameLayout2 = abstractC476820Imu.LJIILLIIL;
            C19EG c19eg = abstractC476820Imu.LIZ;
            if (frameLayout2 != null) {
                c477190InVTI.LLILZLL = frameLayout2;
                Context context = frameLayout2.getContext();
                c477190InVTI.LLJI = c19eg;
                ViewGroup.LayoutParams layoutParams3 = new ViewGroup.LayoutParams(-1, -2);
                RecyclerView recyclerView2 = new RecyclerView(context);
                recyclerView2.setMinimumHeight((int) C497740JfY.LIZIZ(108.0f));
                c477190InVTI.LLILZ = recyclerView2;
                ViewGroup viewGroup4 = c477190InVTI.LLILZLL;
                if (viewGroup4 != null) {
                    C786410Ut5.LJJJJI(viewGroup4);
                }
                ViewGroup viewGroup5 = c477190InVTI.LLILZLL;
                if (viewGroup5 != null) {
                    viewGroup5.addView(c477190InVTI.LLILZ, layoutParams3);
                }
                ViewGroup viewGroup6 = c477190InVTI.LLILZLL;
                if (viewGroup6 != null) {
                    viewGroup6.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC521700Kd6(c477190InVTI, 4));
                }
                LinearLayoutManager linearLayoutManager = new LinearLayoutManager(context);
                linearLayoutManager.setOrientation(0);
                c477190InVTI.LLILZIL = linearLayoutManager;
                RecyclerView recyclerView3 = c477190InVTI.LLILZ;
                if (recyclerView3 != null) {
                    recyclerView3.setLayoutManager(linearLayoutManager);
                }
                C472450Ifr c472450Ifr = new C472450Ifr(C472490Ifv.LIZIZ, c477190InVTI.LL, c477190InVTI.LLILLJJLI, c477190InVTI.LLILLL);
                c477190InVTI.LLIZ = c472450Ifr;
                RecyclerView recyclerView4 = c477190InVTI.LLILZ;
                if (recyclerView4 != null) {
                    recyclerView4.setAdapter(c472450Ifr);
                }
                RecyclerView recyclerView5 = c477190InVTI.LLILZ;
                if (recyclerView5 != null) {
                    recyclerView5.setItemAnimator(null);
                }
                RecyclerView recyclerView6 = c477190InVTI.LLILZ;
                if (recyclerView6 != null) {
                    recyclerView6.addItemDecoration(new C521610Kcx(c477190InVTI, 2));
                }
                RecyclerView recyclerView7 = c477190InVTI.LLILZ;
                if (recyclerView7 != null) {
                    recyclerView7.addOnScrollListener(new AsS34S0100000_7(c477190InVTI, 7));
                }
                if (((Boolean) c477190InVTI.LLJIJIL.getValue()).booleanValue() && (recyclerView = c477190InVTI.LLILZ) != null) {
                    recyclerView.addOnScrollListener(new AsS34S0100000_7(c477190InVTI, 8));
                }
            }
            ViewGroup viewGroup7 = abstractC476820Imu.LJJIJ;
            C472280Ifa c472280Ifa2 = abstractC476820Imu.LJIILJJIL;
            if (viewGroup7 != null) {
                C478110Ioz c478110Ioz = c477190InVTI.LLJ;
                RecyclerView recyclerView8 = c477190InVTI.LLILZ;
                Iterator<Map.Entry<Integer, AbstractC478120Ip0>> it2 = c478110Ioz.LIZLLL.entrySet().iterator();
                while (it2.hasNext()) {
                    AbstractC478120Ip0 value = it2.next().getValue();
                    value.getClass();
                    value.LIZ = viewGroup7.getLayoutDirection() == i;
                    if (value.LIZIZ == null) {
                        value.LIZIZ = value.LIZ(viewGroup7.getContext());
                    }
                    AbstractC478270IpF abstractC478270IpF = value.LIZIZ;
                    if (abstractC478270IpF != null) {
                        abstractC478270IpF.LIZLLL = c472280Ifa2;
                        View viewLIZIZ = abstractC478270IpF.LIZIZ();
                        if (viewLIZIZ != null) {
                            ViewParent parent = viewLIZIZ.getParent();
                            if ((parent instanceof ViewGroup) && (viewGroup = (ViewGroup) parent) != null) {
                                C786410Ut5.LJJJLZIJ(viewLIZIZ, viewGroup);
                            }
                            FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(-2, -2);
                            layoutParams4.gravity = 8388691;
                            viewGroup7.addView(viewLIZIZ, layoutParams4);
                            C786410Ut5.LJLLLLLL(4, viewLIZIZ);
                        }
                    }
                    AbstractC478270IpF abstractC478270IpF2 = value.LIZIZ;
                    if (abstractC478270IpF2 != null) {
                        abstractC478270IpF2.LJ();
                    }
                    i = 1;
                }
                if (recyclerView8 != null) {
                    recyclerView8.addOnScrollListener(new AsS34S0100000_7(c478110Ioz, 9));
                    layoutManager = recyclerView8.getLayoutManager();
                } else {
                    layoutManager = null;
                }
                c478110Ioz.LIZ = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
            }
            abstractC476820Imu.LJIJJ(c477190InVTI);
        }
        if (zLIZ) {
            C476890In1 c476890In1 = (C476890In1) interfaceC477240Ina;
            if ((LiveInfeedSkylightEntranceAutoExpandSetting.INSTANCE.matchEntrance(c476890In1.LIZ()) || z) && !((IPadMultiScreenService) C1161920gLG.LIZJ(IPadMultiScreenService.class)).vH1()) {
                abstractC476820Imu.LJJIII(true, false, EnumC476920In4.DEFAULT, EnumC476910In3.NULL, z);
                if (c476890In1.LIZIZ.LLJJ.c1() != null) {
                    c476890In1.LIZIZ.LLJJ.c1().LIZLLL(true);
                }
                if (!z || (((interfaceC476860ImyLIZLLL2 = abstractC476820Imu.LIZLLL()) == null || !interfaceC476860ImyLIZLLL2.LJIIJ()) && !TopliveSkylightAutoOpenOpt.INSTANCE.getAutoOpenOpt())) {
                    abstractC476820Imu.LIZ();
                    return;
                }
                return;
            }
        }
        if (abstractC476820Imu.LJ == EnumC471790Ien.NEARBY || !InterfaceC1106030et7.p4.LIZIZ().booleanValue()) {
            return;
        }
        InterfaceC477240Ina interfaceC477240Ina2 = abstractC476820Imu.LJJIL;
        if (LiveInfeedSkylightEntranceSetting.matchEntrance(interfaceC477240Ina2 != null ? ((C476890In1) interfaceC477240Ina2).LIZ() : null)) {
            LiveInfeedSkylightEntranceAutoExpandSetting liveInfeedSkylightEntranceAutoExpandSetting = LiveInfeedSkylightEntranceAutoExpandSetting.INSTANCE;
            InterfaceC477240Ina interfaceC477240Ina3 = abstractC476820Imu.LJJIL;
            if (liveInfeedSkylightEntranceAutoExpandSetting.matchEntrance(interfaceC477240Ina3 != null ? ((C476890In1) interfaceC477240Ina3).LIZ() : null) || (interfaceC476860ImyLIZLLL = abstractC476820Imu.LIZLLL()) == null) {
                return;
            }
            interfaceC476860ImyLIZLLL.LJFF(abstractC476820Imu.LIZJ());
        }
    }

    public final void LIZ$1() {
        FrameLayout frameLayout;
        if (((FrameLayout) this.l0).getParent() == null) {
            return;
        }
        float top = (((FrameLayout) this.l0).getTop() + ((FrameLayout) this.l0).getBottom()) / 2.0f;
        C484860Izs c484860Izs = (C484860Izs) this.l1;
        float f = top - c484860Izs.LIZJ;
        boolean z = this.z2 || c484860Izs.LIZLLL != f;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updatePlayerViewOffset[172]: bind=");
        sbLIZ.append(this.z2);
        sbLIZ.append(" playerCenterY=");
        sbLIZ.append(top);
        sbLIZ.append(" targetCenterY=");
        sbLIZ.append(((C484860Izs) this.l1).LIZJ);
        sbLIZ.append(" tempOffset=");
        sbLIZ.append(f);
        sbLIZ.append(" targetTranslationY=");
        sbLIZ.append(((C484860Izs) this.l1).LIZLLL);
        C20441214yg.LIZIZ("LiveTouchScalingV2", C2188811AlT.LIZIZ(sbLIZ));
        C484860Izs c484860Izs2 = (C484860Izs) this.l1;
        c484860Izs2.LIZLLL = f;
        if (!z || (frameLayout = c484860Izs2.LJIILLIIL) == null) {
            return;
        }
        float measuredHeight = frameLayout.getMeasuredHeight();
        float measuredWidth = c484860Izs2.LJIILLIIL.getMeasuredWidth();
        if (measuredHeight != 0.0f) {
            c484860Izs2.LJFF = c484860Izs2.LIZIZ / measuredHeight;
        }
        if (measuredWidth != 0.0f) {
            c484860Izs2.LJ = c484860Izs2.LIZ / measuredWidth;
        }
        if (c484860Izs2.LJIJJLI) {
            c484860Izs2.LJIIIZ(1.0f);
            View view = c484860Izs2.LJIJ;
            if (view != null) {
                view.setClickable(true);
            }
        }
    }

    public final void LIZ$2() {
        try {
            int size = ((ArrayList) ((C21374118kl) this.l0).LLILLJJLI).size();
            ((ArrayList) ((C21374118kl) this.l0).LLILLJJLI).addAll((List) this.l1);
            if (this.z2) {
                ((C21374118kl) this.l0).notifyDataSetChanged();
            } else {
                ((C21374118kl) this.l0).notifyItemRangeInserted(size, ((List) this.l1).size());
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C20441214yg.LJFF("GameLiveBottombarVideoMixAdapter", "Failed to notify item range inserted, falling back to notifyDataSetChanged", e);
            ((C21374118kl) this.l0).notifyDataSetChanged();
        }
    }

    public final void LIZ$3() {
        try {
            int size = ((C475700Il6) this.l0).LL.size();
            ((C475700Il6) this.l0).LL.addAll((List) this.l1);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Adding ");
            sbLIZ.append(((List) this.l1).size());
            sbLIZ.append(" items at position ");
            sbLIZ.append(size);
            sbLIZ.append(", sourceItems items: ");
            sbLIZ.append(((C475700Il6) this.l0).LL.size());
            sbLIZ.append(" isRefresh:");
            sbLIZ.append(this.z2);
            C20441214yg.LIZIZ("GameLiveBottombarVideoAdapter", C2188811AlT.LIZIZ(sbLIZ));
            if (this.z2) {
                ((C475700Il6) this.l0).notifyDataSetChanged();
            } else {
                ((C475700Il6) this.l0).notifyItemRangeInserted(size, ((List) this.l1).size());
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("Notified item range inserted: start=");
            sbLIZ2.append(size);
            sbLIZ2.append(", count=");
            sbLIZ2.append(((List) this.l1).size());
            C20441214yg.LIZIZ("GameLiveBottombarVideoAdapter", C2188811AlT.LIZIZ(sbLIZ2));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C20441214yg.LJFF("GameLiveBottombarVideoAdapter", "Failed to notify item range inserted, falling back to notifyDataSetChanged", e);
            ((C475700Il6) this.l0).notifyDataSetChanged();
        }
    }

    public final void LIZ$4() {
        Long l = (Long) this.l0;
        C0JFN c0jfn = C0JFN.LIZ;
        DataChannel dataChannel = ((DrawGuessStatusWidget) this.l1).dataChannel;
        c0jfn.getClass();
        if (Intrinsics.LJFF(l, C0JFN.LJIJJ(dataChannel))) {
            DrawGuessStatusWidget drawGuessStatusWidget = (DrawGuessStatusWidget) this.l1;
            if (drawGuessStatusWidget.LLJI) {
                C16F5 c16f5 = drawGuessStatusWidget.LLILZIL;
                if (c16f5 == null) {
                    c16f5 = null;
                }
                c16f5.setText(drawGuessStatusWidget.D1(2131841410));
                DrawGuessStatusWidget drawGuessStatusWidget2 = (DrawGuessStatusWidget) this.l1;
                C16F5 c16f52 = drawGuessStatusWidget2.LLILZIL;
                if (c16f52 == null) {
                    c16f52 = null;
                }
                drawGuessStatusWidget2.z1(c16f52);
                View view = ((DrawGuessStatusWidget) this.l1).LLILLJJLI;
                if (view == null) {
                    view = null;
                }
                C500260Jjc.LLFFF(view);
                C16F5 c16f53 = ((DrawGuessStatusWidget) this.l1).LLILZ;
                if (c16f53 == null) {
                    c16f53 = null;
                }
                C500260Jjc.LJIILIIL(c16f53);
                DrawGuessStatusWidget drawGuessStatusWidget3 = (DrawGuessStatusWidget) this.l1;
                View view2 = drawGuessStatusWidget3.LL;
                if (view2 == null) {
                    view2 = null;
                }
                C16F5 c16f54 = drawGuessStatusWidget3.LLILZLL;
                drawGuessStatusWidget3.A1(view2, c16f54 != null ? c16f54 : null, this.z2);
            }
        }
    }

    public static final void run$0(ARunnableS10S0210000_7 aRunnableS10S0210000_7) {
        boolean zLIZ;
        C1C7U.LIZ("SkylightContainerManager@b223.initView$1");
        try {
            aRunnableS10S0210000_7.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("SkylightContainerManager@b223.initView$1");
    }

    public static final void run$1(ARunnableS10S0210000_7 aRunnableS10S0210000_7) {
        boolean zLIZ;
        C1C7U.LIZ("LiveTouchScalingControllerV2@b787.updatePlayerViewOffset$1");
        try {
            aRunnableS10S0210000_7.LIZ$1();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("LiveTouchScalingControllerV2@b787.updatePlayerViewOffset$1");
    }

    public static final void run$2(ARunnableS10S0210000_7 aRunnableS10S0210000_7) {
        boolean zLIZ;
        C1C7U.LIZ("GameLiveBottombarFeedMixAdapter@b60c.addItems$1");
        try {
            aRunnableS10S0210000_7.LIZ$2();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("GameLiveBottombarFeedMixAdapter@b60c.addItems$1");
    }

    public static final void run$3(ARunnableS10S0210000_7 aRunnableS10S0210000_7) {
        boolean zLIZ;
        C1C7U.LIZ("GameLiveBottombarVideoAdapter@28f8.addItems$1");
        try {
            aRunnableS10S0210000_7.LIZ$3();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("GameLiveBottombarVideoAdapter@28f8.addItems$1");
    }

    public static final void run$4(ARunnableS10S0210000_7 aRunnableS10S0210000_7) {
        boolean zLIZ;
        C1C7U.LIZ("DrawGuessStatusWidget@3108.updateUiForAudience$1");
        try {
            aRunnableS10S0210000_7.LIZ$4();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("DrawGuessStatusWidget@3108.updateUiForAudience$1");
    }

    public ARunnableS10S0210000_7(Object obj, Object obj2, boolean z, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.z2 = z;
    }
}
