package X;

import Y.ARunnableS22S1100000_17;
import Y.AUListenerS266S0100000_17;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.os.Looper;
import android.view.animation.LinearInterpolator;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdk.chatroom.ui.EndIdentifyWidget;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveWidgetLoadOpt;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveWidgetLoadScatterSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.WidgetLoadStrategy;
import com.bytedance.android.widget.Widget;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.bytedance.ies.sdk.widgets.RecyclableWidgetEventListener;
import com.bytedance.ies.sdk.widgets.RecyclableWidgetManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0eAF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1078210eAF {
    public static final Map<String, String> LJJIIZ = C2097608Jq.LJIIIIZZ(new Pair("ProgrammedLiveOnlineAudienceCollapseWidget", "programmed_live_online"), new Pair("ProgrammedLiveTitleWidget", "programmed_live_title"), new Pair("PortraitPublicScreenWidget", "public_screen"), new Pair("CloseWidget", "close"), new Pair("LiveRoomUserInfoWidget", "anchor_info"), new Pair("ClearScreenUserInfoWidget", "anchor_info"), new Pair("ProgrammedLiveUserInfoWidget", "anchor_info"), new Pair("OnlineAudienceRankWidget", "audience_rank"), new Pair("LiveDrawerEntranceWidget", "drawer_entrance"), new Pair("CommentWidget", "comment"), new Pair("LiveAudienceToolbarWidget", "toolbar"), new Pair("AudienceRightToolbarWidget", "toolbar"), new Pair("AudienceLeftToolbarWidget", "toolbar"), new Pair("SkylightSwitchWidget", "skylight_switch"), new Pair("FrameL2SlotWidget", "ec_pop_card"), new Pair("BottomLeftSlotWidget", "ec_shop_icon"), new Pair("FullWindowButtonWidget", "full_window"));
    public final AbstractC1077750e9V LIZ;
    public final DataChannel LIZIZ;
    public WidgetLoadStrategy LJIIL;
    public RecyclableWidgetManager LJIILIIL;
    public C1077730e9T LJIILJJIL;
    public C1085650eMF<EndIdentifyWidget> LJIILL;
    public String LJJII;
    public final boolean LJJIII;
    public final C1078220eAG LJJIIJ;
    public final C1078230eAH LJJIIJZLJL;
    public final BPEAHandler LIZJ = new BPEAHandler(Looper.getMainLooper());
    public final String LIZLLL = "Core";
    public final String LJ = "P0";
    public final String LJFF = "P1";
    public final String LJI = "P2";
    public final String LJII = "Other";
    public final String LJIIIIZZ = "end";
    public final String LJIIIZ = "group";
    public final String LJIIJ = "group_end";
    public final String LJIIJJI = "priority";
    public final Map<String, Function0<Unit>> LJIILLIIL = new LinkedHashMap();
    public final List<String> LJIIZILJ = new ArrayList();
    public final Map<String, List<Function0<Unit>>> LJIJ = new LinkedHashMap();
    public final Map<String, List<String>> LJIJI = new LinkedHashMap();
    public final Map<String, List<Widget>> LJIJJ = new LinkedHashMap();
    public final Map<String, List<String>> LJIJJLI = new LinkedHashMap();
    public final Map<String, String> LJIL = new LinkedHashMap();
    public final Map<String, String> LJJ = new LinkedHashMap();
    public final List<String> LJJI = new ArrayList();
    public final List<String> LJJIFFI = new ArrayList();

    public final void LIZ() {
        this.LIZJ.removeCallbacksAndMessages(null);
        RecyclableWidgetManager recyclableWidgetManager = this.LJIILIIL;
        if (recyclableWidgetManager != null) {
            recyclableWidgetManager.removeLoadInterceptor(this.LJJIIJZLJL);
        }
        RecyclableWidgetManager recyclableWidgetManager2 = this.LJIILIIL;
        if (recyclableWidgetManager2 != null) {
            recyclableWidgetManager2.removeRecyclableWidgetEventListener(this.LJJIIJ);
        }
        this.LJIILIIL = null;
        this.LJIILJJIL = null;
        this.LJIIL = null;
        this.LJIILL = null;
        LIZIZ();
    }

    public final void LIZIZ() {
        ((LinkedHashMap) this.LJIILLIIL).clear();
        ((ArrayList) this.LJIIZILJ).clear();
        ((LinkedHashMap) this.LJIJ).clear();
        ((LinkedHashMap) this.LJIJI).clear();
        ((LinkedHashMap) this.LJIJJ).clear();
        ((LinkedHashMap) this.LJIJJLI).clear();
        ((LinkedHashMap) this.LJIL).clear();
        ((LinkedHashMap) this.LJJ).clear();
        ((ArrayList) this.LJJI).clear();
        ((ArrayList) this.LJJIFFI).clear();
    }

    public final void LIZLLL(String str) {
        EndIdentifyWidget endIdentifyWidget;
        C1085650eMF<EndIdentifyWidget> c1085650eMF = this.LJIILL;
        if (c1085650eMF == null || (endIdentifyWidget = c1085650eMF.LIZIZ()) == null) {
            endIdentifyWidget = new EndIdentifyWidget(this.LJIIIZ, str);
        }
        endIdentifyWidget.LL = this.LJIIIZ;
        endIdentifyWidget.LLILLJJLI = str;
        RecyclableWidgetManager recyclableWidgetManager = this.LJIILIIL;
        if (recyclableWidgetManager != null) {
            recyclableWidgetManager.load(-1, endIdentifyWidget);
        }
    }

    public final void LJ(String str) {
        EndIdentifyWidget endIdentifyWidget;
        C1085650eMF<EndIdentifyWidget> c1085650eMF = this.LJIILL;
        if (c1085650eMF == null || (endIdentifyWidget = c1085650eMF.LIZIZ()) == null) {
            endIdentifyWidget = new EndIdentifyWidget(this.LJIIJJI, str);
        }
        endIdentifyWidget.LL = this.LJIIJJI;
        endIdentifyWidget.LLILLJJLI = str;
        RecyclableWidgetManager recyclableWidgetManager = this.LJIILIIL;
        if (recyclableWidgetManager != null) {
            recyclableWidgetManager.load(-1, endIdentifyWidget);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LJI(String str) {
        List list = (List) ((LinkedHashMap) this.LJIJI).get(str);
        if (list != null && list.size() == 1 && list.contains(this.LJIIIIZZ)) {
            this.LJIJI.remove(str);
            Collection collection = (Collection) ((LinkedHashMap) this.LJIJJ).get(str);
            if (collection != null && !collection.isEmpty()) {
                if (Intrinsics.LJFF(str, "top1")) {
                    List<Widget> list2 = (List) ((LinkedHashMap) this.LJIJJ).get(str);
                    if (list2 != null) {
                        AnimatorSet animatorSet = new AnimatorSet();
                        ArrayList arrayList = new ArrayList();
                        for (final Widget widget : list2) {
                            if (widget instanceof InterfaceC1078250eAJ) {
                                ((InterfaceC1078250eAJ) widget).X0();
                            }
                            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                            valueAnimatorOfFloat.setDuration(200L);
                            valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
                            valueAnimatorOfFloat.addUpdateListener(new AUListenerS266S0100000_17(widget, 49));
                            valueAnimatorOfFloat.addListener(new C1078320eAQ() { // from class: X.0eAK
                                @Override // android.animation.Animator.AnimatorListener
                                public final void onAnimationEnd(Animator animator) {
                                    LifecycleOwner lifecycleOwner = widget;
                                    if (lifecycleOwner instanceof InterfaceC1078250eAJ) {
                                        ((InterfaceC1078250eAJ) lifecycleOwner).LJLIL();
                                    }
                                }
                            });
                            arrayList.add(valueAnimatorOfFloat);
                            widget.show();
                        }
                        animatorSet.playTogether(arrayList);
                        animatorSet.start();
                    }
                } else {
                    List list3 = (List) ((LinkedHashMap) this.LJIJJ).get(str);
                    if (list3 != null) {
                        Iterator it2 = list3.iterator();
                        while (it2.hasNext()) {
                            ((Widget) it2.next()).show();
                        }
                    }
                }
                if (Intrinsics.LJFF(str, this.LJJII)) {
                    this.LJJII = null;
                    DataChannel dataChannel = this.LIZIZ;
                    if (dataChannel != null) {
                        dataChannel.SX0(C1082800eHe.class, Boolean.FALSE);
                    }
                }
                ((ArrayList) this.LJJIFFI).remove(str);
                this.LJIJJ.remove(str);
                return;
            }
            this.LJIJJ.remove(str);
        }
    }

    public final void LJII(String str) {
        List list = (List) ((LinkedHashMap) this.LJIJJLI).get(str);
        if (list != null && list.size() == 1 && list.contains(this.LJIIIIZZ)) {
            this.LJIJJLI.remove(str);
            ((ArrayList) this.LJJI).add(str);
            C20441214yg.LJ("matao-test", "core loaded");
            LIZJ(this, str);
        }
    }

    /* JADX WARN: Type inference failed for: r0v24, types: [X.0eAG] */
    /* JADX WARN: Type inference failed for: r0v25, types: [X.0eAH] */
    public C1078210eAF(C1077740e9U c1077740e9U, DataChannel dataChannel) {
        boolean z;
        this.LIZ = c1077740e9U;
        this.LIZIZ = dataChannel;
        if (!LiveWidgetLoadScatterSetting.INSTANCE.enable() && !LiveWidgetLoadOpt.enable()) {
            z = false;
        } else {
            z = true;
        }
        this.LJJIII = z;
        this.LJJIIJ = new RecyclableWidgetEventListener() { // from class: X.0eAG
            @Override // com.bytedance.ies.sdk.widgets.RecyclableWidgetEventListener
            public final /* synthetic */ void onPostInit(C0ULM c0ulm, LiveRecyclableWidget liveRecyclableWidget) {
                C1078300eAO.LJ(this, c0ulm, liveRecyclableWidget);
            }

            @Override // com.bytedance.ies.sdk.widgets.RecyclableWidgetEventListener
            public final /* synthetic */ void onPostUnload(C0ULM c0ulm, LiveRecyclableWidget liveRecyclableWidget) {
                C1078300eAO.LJI(this, c0ulm, liveRecyclableWidget);
            }

            @Override // com.bytedance.ies.sdk.widgets.RecyclableWidgetEventListener
            public final /* synthetic */ void onPreInit(C0ULM c0ulm, LiveRecyclableWidget liveRecyclableWidget) {
                C1078300eAO.LJIIJ(this, c0ulm, liveRecyclableWidget);
            }

            @Override // com.bytedance.ies.sdk.widgets.RecyclableWidgetEventListener
            public final /* synthetic */ void onPreLoad(C0ULM c0ulm, LiveRecyclableWidget liveRecyclableWidget) {
                C1078300eAO.LJIIJJI(this, c0ulm, liveRecyclableWidget);
            }

            @Override // com.bytedance.ies.sdk.widgets.RecyclableWidgetEventListener
            public final /* synthetic */ void onPreUnload(C0ULM c0ulm, LiveRecyclableWidget liveRecyclableWidget) {
                C1078300eAO.LJIIL(this, c0ulm, liveRecyclableWidget);
            }

            public final void LIZ(Widget widget) {
                Map<String, String> map = C1078210eAF.LJJIIZ;
                String str = C1078210eAF.LJJIIZ.get(widget.getClass().getSimpleName());
                if (str == null) {
                    str = "";
                }
                if (!((ArrayList) this.LIZ.LJIIZILJ).contains(str)) {
                    return;
                }
                Object obj = ((LinkedHashMap) this.LIZ.LJJ).get(str);
                if (obj != null) {
                    C1078210eAF c1078210eAF = this.LIZ;
                    List list = (List) ((LinkedHashMap) c1078210eAF.LJIJJLI).get(obj);
                    if (list != null) {
                        list.add(str);
                    } else {
                        c1078210eAF.LJIJJLI.put((String) obj, C1697810uHb.LJIILJJIL(str));
                    }
                }
                Object obj2 = ((LinkedHashMap) this.LIZ.LJIL).get(str);
                if (obj2 != null) {
                    C1078210eAF c1078210eAF2 = this.LIZ;
                    List list2 = (List) ((LinkedHashMap) c1078210eAF2.LJIJI).get(obj2);
                    if (list2 != null) {
                        list2.add(str);
                    } else {
                        c1078210eAF2.LJIJI.put((String) obj2, C1697810uHb.LJIILJJIL(str));
                    }
                    List list3 = (List) ((LinkedHashMap) c1078210eAF2.LJIJJ).get(obj2);
                    if (list3 != null) {
                        list3.add(widget);
                    } else {
                        c1078210eAF2.LJIJJ.put((String) obj2, C1697810uHb.LJIILJJIL(widget));
                    }
                }
                String str2 = (String) ((LinkedHashMap) this.LIZ.LJIL).get(str);
                if (str2 != null) {
                    C1078210eAF c1078210eAF3 = this.LIZ;
                    if (Intrinsics.LJFF(str, "toolbar")) {
                        c1078210eAF3.LJJII = str2;
                        DataChannel dataChannel2 = c1078210eAF3.LIZIZ;
                        if (dataChannel2 != null) {
                            dataChannel2.SX0(C1082800eHe.class, Boolean.TRUE);
                        }
                    }
                }
            }

            @Override // com.bytedance.ies.sdk.widgets.RecyclableWidgetEventListener
            public final void onPostLoad(C0ULM c0ulm, LiveRecyclableWidget liveRecyclableWidget) {
                Map<String, String> map = C1078210eAF.LJJIIZ;
                String str = C1078210eAF.LJJIIZ.get(liveRecyclableWidget.getClass().getSimpleName());
                if (str == null) {
                    str = "";
                }
                if (!((ArrayList) this.LIZ.LJIIZILJ).contains(str)) {
                    return;
                }
                String str2 = (String) ((LinkedHashMap) this.LIZ.LJIL).get(str);
                if (str2 != null) {
                    C1078210eAF c1078210eAF = this.LIZ;
                    liveRecyclableWidget.hide();
                    List list = (List) ((LinkedHashMap) c1078210eAF.LJIJI).get(str2);
                    if (list != null) {
                        list.remove(str);
                    }
                    c1078210eAF.LJI(str2);
                }
                String str3 = (String) ((LinkedHashMap) this.LIZ.LJJ).get(str);
                if (str3 != null) {
                    C1078210eAF c1078210eAF2 = this.LIZ;
                    List list2 = (List) ((LinkedHashMap) c1078210eAF2.LJIJJLI).get(str3);
                    if (list2 != null) {
                        list2.remove(str);
                    }
                    c1078210eAF2.LJII(str3);
                }
            }

            @Override // com.bytedance.ies.sdk.widgets.RecyclableWidgetEventListener, X.InterfaceC2262151DgT
            public final /* bridge */ /* synthetic */ void onHide(C0ULM c0ulm, Widget widget) {
            }

            @Override // com.bytedance.ies.sdk.widgets.RecyclableWidgetEventListener, X.InterfaceC2262151DgT
            public final /* bridge */ /* synthetic */ void onPostCreate(C0ULM c0ulm, Widget widget) {
            }

            @Override // com.bytedance.ies.sdk.widgets.RecyclableWidgetEventListener, X.InterfaceC2262151DgT
            public final /* bridge */ /* synthetic */ void onPostCreateView(C0ULM c0ulm, Widget widget) {
            }

            @Override // com.bytedance.ies.sdk.widgets.RecyclableWidgetEventListener, X.InterfaceC2262151DgT
            public final /* bridge */ /* synthetic */ void onPostDestroy(C0ULM c0ulm, Widget widget) {
            }

            @Override // com.bytedance.ies.sdk.widgets.RecyclableWidgetEventListener, X.InterfaceC2262151DgT
            public final /* bridge */ /* synthetic */ void onPreCreate(C0ULM c0ulm, Widget widget) {
            }

            @Override // com.bytedance.ies.sdk.widgets.RecyclableWidgetEventListener, X.InterfaceC2262151DgT
            public final /* bridge */ /* synthetic */ void onPreCreateView(C0ULM c0ulm, Widget widget) {
            }

            @Override // com.bytedance.ies.sdk.widgets.RecyclableWidgetEventListener, X.InterfaceC2262151DgT
            public final /* bridge */ /* synthetic */ void onPreDestroy(C0ULM c0ulm, Widget widget) {
            }

            @Override // com.bytedance.ies.sdk.widgets.RecyclableWidgetEventListener, X.InterfaceC2262151DgT
            public final /* bridge */ /* synthetic */ void onShow(C0ULM c0ulm, Widget widget) {
            }

            @Override // com.bytedance.ies.sdk.widgets.RecyclableWidgetEventListener, X.InterfaceC2262151DgT
            public final void onWidgetPreRequestLoading(C0ULM c0ulm, Widget widget, boolean z2) {
                if (!this.LIZ.LJJIII) {
                    return;
                }
                LIZ(widget);
            }

            @Override // com.bytedance.ies.sdk.widgets.RecyclableWidgetEventListener, X.InterfaceC2262151DgT
            public final void onWidgetRequestLoading(C0ULM c0ulm, Widget widget, boolean z2) {
                if (this.LIZ.LJJIII) {
                    return;
                }
                LIZ(widget);
            }
        };
        this.LJJIIJZLJL = new RecyclableWidgetManager.LoadInterceptor() { // from class: X.0eAH
            @Override // com.bytedance.ies.sdk.widgets.RecyclableWidgetManager.LoadInterceptor
            public final boolean intercept(int i, Class<? extends Widget> cls) {
                return false;
            }

            @Override // com.bytedance.ies.sdk.widgets.RecyclableWidgetManager.LoadInterceptor
            public final boolean intercept(int i, Widget widget) {
                if (i != -1 || !(widget instanceof EndIdentifyWidget)) {
                    return false;
                }
                EndIdentifyWidget endIdentifyWidget = (EndIdentifyWidget) widget;
                String str = endIdentifyWidget.LL;
                String str2 = endIdentifyWidget.LLILLJJLI;
                if (Intrinsics.LJFF(str, this.LIZ.LJIIIZ)) {
                    List list = (List) ((LinkedHashMap) this.LIZ.LJIJI).get(str2);
                    if (list != null) {
                        list.add(this.LIZ.LJIIIIZZ);
                    } else {
                        C1078210eAF c1078210eAF = this.LIZ;
                        c1078210eAF.LJIJI.put(str2, C1697810uHb.LJIILJJIL(c1078210eAF.LJIIIIZZ));
                    }
                    this.LIZ.LJI(str2);
                } else if (Intrinsics.LJFF(str, this.LIZ.LJIIJJI)) {
                    List list2 = (List) ((LinkedHashMap) this.LIZ.LJIJJLI).get(str2);
                    if (list2 != null) {
                        list2.add(this.LIZ.LJIIIIZZ);
                    } else {
                        C1078210eAF c1078210eAF2 = this.LIZ;
                        c1078210eAF2.LJIJJLI.put(str2, C1697810uHb.LJIILJJIL(c1078210eAF2.LJIIIIZZ));
                    }
                    this.LIZ.LJII(str2);
                }
                try {
                    C1085650eMF<EndIdentifyWidget> c1085650eMF = this.LIZ.LJIILL;
                    if (c1085650eMF != null) {
                        c1085650eMF.LIZ(widget);
                        return true;
                    }
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                return true;
            }
        };
        this.LJIILL = new C1085650eMF<>(6);
    }

    public static void LIZJ(C1078210eAF c1078210eAF, String str) {
        Runnable runnable;
        String str2;
        while (true) {
            C1077730e9T c1077730e9T = c1078210eAF.LJIILJJIL;
            if (c1077730e9T != null) {
                String str3 = c1077730e9T.LIZJ;
                C1077730e9T c1077730e9T2 = null;
                if (str3 != null && !Intrinsics.LJFF(str3, str)) {
                    List<String> list = c1078210eAF.LJJI;
                    C1077730e9T c1077730e9T3 = c1078210eAF.LJIILJJIL;
                    if (c1077730e9T3 != null) {
                        str2 = c1077730e9T3.LIZJ;
                    } else {
                        str2 = null;
                    }
                    if (!C13LP.LJJJJ(str2, list)) {
                        return;
                    }
                }
                C1077730e9T c1077730e9T4 = c1078210eAF.LJIILJJIL;
                if (c1077730e9T4 != null) {
                    long j = c1077730e9T4.LIZLLL;
                    if (j > 0) {
                        if (c1077730e9T4 != null) {
                            c1077730e9T4.LIZLLL = 0L;
                        }
                        C786410Ut5.LJLIIL(j, c1078210eAF.LIZJ, new ARunnableS22S1100000_17(c1078210eAF, str, 7));
                        return;
                    } else if (c1077730e9T4 != null && (runnable = c1077730e9T4.LIZIZ) != null) {
                        C786410Ut5.LJJZZIII(c1078210eAF.LIZJ, runnable);
                    }
                }
                C1077730e9T c1077730e9T5 = c1078210eAF.LJIILJJIL;
                if (c1077730e9T5 != null) {
                    c1077730e9T2 = c1077730e9T5.LIZ;
                }
                c1078210eAF.LJIILJJIL = c1077730e9T2;
            } else {
                return;
            }
        }
    }

    public final void LJFF(String str, Function0<Unit> function0) {
        this.LJIILLIIL.put(str, function0);
        ((ArrayList) this.LJIIZILJ).add(str);
    }
}
