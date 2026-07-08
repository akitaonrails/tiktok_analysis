package X;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Rect;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.bytedance.android.livesdk.comp.api.linkcore.model.DslLayout;
import com.bytedance.android.livesdk.comp.api.linkcore.model.Layout;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LayoutArray;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LayoutDSLConfig;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkLayerRTCMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkLayerRTCMessageParam;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkUser;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LiveStreamMixer;
import com.bytedance.android.livesdk.comp.api.linkcore.model.MicPositionContentInfo;
import com.bytedance.android.livesdk.comp.api.linkcore.model.MicPositionInfo;
import com.bytedance.android.livesdk.comp.api.linkcore.model.OnLineMicInfo;
import com.bytedance.android.livesdk.comp.impl.linkcore.layout.internal.LayoutSlardarMonitor;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicBizListenerClearFix;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicFixLayoutMgrVisibleRect;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicGuestStateHandleFix;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicLayoutPatchSettings;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicPlayingAdNotRefreshLayoutSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicStateSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicLayoutSlardarCombineSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicSeiEnabledBusinessIdSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestRemoveDividingLineSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestV3RoomLoadingOptSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.MultiLiveFYPDestroyOptSettings;
import com.bytedance.android.livesdk.sei.SeiAppData;
import com.bytedance.android.livesdk.sei.SeiDsl;
import com.bytedance.android.livesdk.sei.SeiRegion;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdk.watch.IWatchLiveService;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.vcloud.strategy.StrategyCenter;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import org.json.JSONException;
import org.json.JSONObject;
import tikcast.linkmic.common.PosIdentity;

/* JADX INFO: renamed from: X.1AXM, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final class C1AXM implements InterfaceC964790bDJ, InterfaceC964930bDX, InterfaceC955150axl {
    public static final C2175881ADq LLLLL = new Object() { // from class: X.1ADq
    };
    public static final Pair<Integer, Integer> LLLLLIL = new Pair<>(720, 1280);
    public final C2177031AIb LL;
    public final String LLILLJJLI;
    public final CopyOnWriteArrayList<Runnable> LLILLL;
    public final CopyOnWriteArrayList<Runnable> LLILZ;
    public Map<String, String> LLILZIL;
    public final C01GW LLILZLL;
    public final C01GW LLIZ;
    public final C01GW LLIZLLLIL;
    public final C01GW LLJ;
    public final C01GW LLJI;
    public final C01GW LLJIJIL;
    public final C01GW LLJILJIL;
    public final C01GW LLJILJILJ;
    public final C01GW LLJILLL;
    public final C01GW LLJJ;
    public FrameLayout LLJJI;
    public final C939230aY5 LLJJIII;
    public DslLayout LLJJIJI;
    public final ConcurrentLinkedQueue<InterfaceC958970b3v> LLJJIJIIJIL;
    public final OnLineMicInfo LLJJIJIL;
    public LinkUser LLJJJ;
    public final AtomicBoolean LLJJJIL;
    public final Rect LLJJJJ;
    public Pair<Integer, Integer> LLJJJJJIL;
    public InterfaceC2181941AaO LLJJJJLIIL;
    public Pair<Integer, Integer> LLJJL;
    public View LLJJLIIIJLLLLLLLZ;
    public C1AFF LLJL;
    public final C01GW LLJLIL;
    public final C01GW LLJLILLLLZIIL;
    public List<String> LLJLL;
    public float LLJLLIL;
    public boolean LLJLLL;
    public List<LinkUser> LLJZ;
    public List<LinkUser> LLJZIJLIL;
    public long LLL;
    public int LLLF;
    public int LLLFF;
    public boolean LLLFFI;
    public boolean LLLFZ;
    public String LLLI;
    public Function1<? super C2284411EbH, Integer> LLLII;
    public volatile String LLLIIII;
    public final C01GW LLLIIIIL;
    public final C01GW LLLIIIL;
    public long LLLIIL;
    public SeiAppData LLLIILIL;
    public InterfaceC940430aa1 LLLIL;
    public C945320ahu LLLILZ;
    public InterfaceC940430aa1 LLLILZJ;
    public String LLLILZLLLI;
    public boolean LLLIZZ;
    public LayoutSlardarMonitor LLLJ;
    public final int LLLJIL;
    public boolean LLLJL;
    public final C01GW LLLL;
    public final C1AXN LLLLII;
    public final C969020bK8 LLLLIIIILLL;
    public final List<Runnable> LLLLIIL;
    public ViewGroup LLLLIILL;
    public boolean LLLLIILLL;
    public volatile boolean LLLLIL;
    public boolean LLLLILI;
    public boolean LLLLJ;
    public int LLLLJI;

    @Override // X.InterfaceC937900aVw
    public final void LJJJJI(String str) {
    }

    @Override // X.InterfaceC937900aVw
    @InterfaceC1294060jmO
    public final void LJJJLIIL() {
    }

    @Override // X.InterfaceC937900aVw
    public final View LJJLIL(String str) {
        return null;
    }

    @Override // X.InterfaceC937900aVw
    @InterfaceC1294060jmO
    public final void LJJLJLI() {
    }

    @Override // X.InterfaceC937900aVw
    public final Map<String, OnLineMicInfo> LIZ() {
        return this.LL.LJFF.LIZ();
    }

    @Override // X.InterfaceC937900aVw
    public final Map<String, OnLineMicInfo> LJIIIIZZ() {
        return this.LL.LJFF.LJIIIIZZ();
    }

    @Override // X.InterfaceC937900aVw
    public final List<LinkUser> LJIIIZ() {
        return this.LL.LJFF.LJIIIZ();
    }

    @Override // X.InterfaceC964790bDJ
    public final void LJIIL() {
        C1AZW c1azw = C1AZW.LIZ;
        String strLLIIII = LLIIII(769);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(LJLLL());
        sbLIZ.append(":onLinkedUsersChanged");
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c1azw.getClass();
        C1AZW.LIZ(strLLIIII, strLIZIZ, null, null);
        for (Runnable runnable : this.LLILLL) {
            runnable.run();
            this.LLILLL.remove(runnable);
        }
    }

    @Override // X.InterfaceC955150axl
    public final void LJJI() {
        boolean zLJJJI = this.LL.LJFF.LJJJI();
        Layout layoutLIZJ = LJJLIIJ().LIZJ(true);
        if (!zLJJJI || layoutLIZJ == null) {
            return;
        }
        List<C1276580jKC> listLJIILL = this.LL.LJFF.LJIILL();
        LJLIL().mixStream(1080, (int) (1080 / layoutLIZJ.viewForCanvas.ratio), listLJIILL);
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listLJIILL, 10));
        for (C1276580jKC c1276580jKC : listLJIILL) {
            arrayList.add(new C1276780jKW(c1276580jKC.LIZIZ, (float) c1276580jKC.LJ, (float) c1276580jKC.LJFF, (float) c1276580jKC.LJI, (float) c1276580jKC.LJII, c1276580jKC.LJIILIIL, c1276580jKC.LIZLLL));
        }
        this.LL.LJFF.LJJLIIIIJ(arrayList);
    }

    @Override // X.InterfaceC937900aVw
    public final void LJJIII() {
        if (LivesdkLinkmicSeiEnabledBusinessIdSetting.INSTANCE.isEnable("live_show_sei")) {
            synchronized (LJJLIIIIJ()) {
                try {
                    synchronized (LJJLI()) {
                        try {
                            LJJLIIIIJ().remove("live_show_sei");
                            LJJLI().remove("show_info");
                        } finally {
                            TryCatchGuardChecker.doCheck(th);
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            LIZJ("removePermanentData");
        }
    }

    public final void LJJIIJ() {
        for (int childCount = this.LLJJI.getChildCount() - 1; childCount < 1; childCount++) {
            View childAt = this.LLJJI.getChildAt(childCount);
            if (childAt instanceof C2180891AWx) {
                C786410Ut5.LJJJZ(childAt, this.LLJJI);
            }
        }
    }

    public final void LJJJI() {
        Iterator<InterfaceC958970b3v> it2 = this.LLJJIJIIJIL.iterator();
        while (it2.hasNext()) {
            it2.next().LJJJIL();
        }
    }

    @Override // X.InterfaceC937900aVw
    public final void LJJJJLL() {
        ViewGroup viewGroup = this.LLLLIILL;
        if (viewGroup != null) {
            HandlerHook.viewPost(viewGroup, new Runnable() { // from class: X.1AXZ
                public final void LIZ() throws JSONException {
                    ViewGroup viewGroup2 = this.LL.LLLLIILL;
                    if (viewGroup2 == null) {
                        return;
                    }
                    Rect rect = new Rect();
                    viewGroup2.getGlobalVisibleRect(rect);
                    C1AXM c1axm = this.LL;
                    c1axm.LLJJJJ.set(c1axm.LJJIFFI(rect, 0.0f));
                    this.LL.LLJJJJJIL = new Pair<>(Integer.valueOf(viewGroup2.getWidth()), Integer.valueOf(viewGroup2.getHeight() + this.LL.LLLF));
                    Layout layoutLIZJ = this.LL.LJJLIIJ().LIZJ(false);
                    if (layoutLIZJ != null) {
                        C1AXM.LLIZLLLIL(this.LL, layoutLIZJ, "onParentSizeChange", true, false, false, false, false, null, 248);
                    }
                }

                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("LinkLayoutManager@cbf4.onParentSizeChange$1");
                    try {
                        LIZ();
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("LinkLayoutManager@cbf4.onParentSizeChange$1");
                }
            });
        }
    }

    public final HashMap<String, C1AYC> LJJJLL() {
        return (HashMap) this.LLJI.getValue();
    }

    @Override // X.InterfaceC937900aVw
    public final boolean LJJJZ() {
        return this.LL.LJFF.LJJJZ();
    }

    public final Map<String, Object> LJJL() {
        return (Map) this.LLIZLLLIL.getValue();
    }

    public final HashMap<String, Map<String, JSONObject>> LJJLI() {
        return (HashMap) this.LLJ.getValue();
    }

    public final HashMap<String, Map<String, String>> LJJLIIIIJ() {
        return (HashMap) this.LLIZ.getValue();
    }

    @Override // X.InterfaceC937900aVw
    public final void LJJLIIIJJI() {
        this.LLLIIL = 0L;
        this.LLLIILIL = null;
        this.LLLIL = null;
        this.LLLILZLLLI = "";
    }

    public final HashMap<String, Map<String, String>> LJJLIIIJL() {
        return (HashMap) this.LLILZLL.getValue();
    }

    public final C1AYR LJJLIIJ() {
        return (C1AYR) this.LLJILJIL.getValue();
    }

    public final InterfaceC2181151AXx LJJLL() {
        return (InterfaceC2181151AXx) this.LLJLILLLLZIIL.getValue();
    }

    public final C1AFV LJJZ() {
        return (C1AFV) this.LLJLIL.getValue();
    }

    public final boolean LJL() {
        return this.LLJJJIL.get();
    }

    public final C2180891AWx LJLI() {
        return (C2180891AWx) this.LLJILLL.getValue();
    }

    @Override // X.InterfaceC937900aVw
    public final InterfaceC964840bDO LJLIIL() {
        return (C2181001AXi) this.LLLL.getValue();
    }

    public final LiveStreamMixer LJLIL() {
        return (LiveStreamMixer) this.LLLIIIL.getValue();
    }

    public final C2181141AXw LJLJI() {
        return (C2181141AXw) this.LLJIJIL.getValue();
    }

    @Override // X.InterfaceC937900aVw
    public final void LJLJJI() {
        String strLLIIII = LLIIII(822);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(LJLLL());
        sbLIZ.append(":startToShow");
        C1AZW.LJIIJ(12, strLLIIII, C2188811AlT.LIZIZ(sbLIZ), null, null);
        LLILLJJLI();
        LJLLILLLL(this.LLJJJ, null, null, true);
        LayoutSlardarMonitor layoutSlardarMonitor = this.LLLJ;
        if (layoutSlardarMonitor != null) {
            LinkUser linkUser = this.LLJJJ;
            Long l = linkUser.userId;
            String str = linkUser.linkMicId;
            if (str == null) {
                str = "";
            }
            layoutSlardarMonitor.LIZIZ(true, l, str, 0, 0, true, LJLLL());
        }
    }

    public final C1AXO LJLJJLL() {
        return (C1AXO) this.LLJILJILJ.getValue();
    }

    @InterfaceC1294060jmO
    public final LiveStreamMixer LJLLJ() {
        if (this.LL.LJIIIIZZ) {
            return LJLIL();
        }
        return null;
    }

    public final C2181231AYf LJLLLL() {
        return (C2181231AYf) this.LLLIIIIL.getValue();
    }

    @Override // X.InterfaceC964930bDX
    public final void LJZ() {
        Runnable runnable = new Runnable() { // from class: X.1AXP
            public final void LIZ() throws JSONException {
                EnumC918810a19 enumC918810a19;
                C1AXI c1axi;
                this.LL.LJLLLL().LJI("notifyContentLayoutUpdate", false);
                this.LL.LLFFF();
                Layout layoutLIZ = this.LL.LJLJJLL().LIZ(false);
                if (layoutLIZ != null) {
                    C1AXM c1axm = this.LL;
                    if (c1axm.LLF()) {
                        return;
                    }
                    Map<String, OnLineMicInfo> mapLIZ = layoutLIZ.isFixedType() ? c1axm.LL.LJFF.LIZ() : c1axm.LL.LJFF.LJJII();
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    for (Map.Entry<String, OnLineMicInfo> entry : mapLIZ.entrySet()) {
                        MicPositionInfo micPositionInfo = entry.getValue().micPositionData;
                        if (micPositionInfo == null || micPositionInfo.contentType != 0) {
                            linkedHashMap.put(entry.getKey(), entry.getValue());
                        }
                    }
                    Iterator it2 = linkedHashMap.entrySet().iterator();
                    while (true) {
                        EnumC918810a19 enumC918810a192 = null;
                        if (!it2.hasNext()) {
                            break;
                        }
                        Map.Entry entry2 = (Map.Entry) it2.next();
                        if (!((HashSet) c1axm.LJJLIIJ().LJII()).contains(entry2.getKey())) {
                            C1AYR c1ayrLJJLIIJ = c1axm.LJJLIIJ();
                            MicPositionInfo micPositionInfo2 = ((OnLineMicInfo) entry2.getValue()).micPositionData;
                            Integer numValueOf = micPositionInfo2 != null ? Integer.valueOf(micPositionInfo2.contentType) : null;
                            String str = (String) entry2.getKey();
                            if (numValueOf == null || !(numValueOf.intValue() == 2 || numValueOf.intValue() == 3)) {
                                enumC918810a19 = EnumC918810a19.StateInit;
                            } else {
                                C1AX3 c1ax3LJI = c1axm.LJJLIIJ().LJI(str);
                                if (c1ax3LJI != null && (c1axi = c1ax3LJI.LIZ) != null) {
                                    enumC918810a192 = c1axi.LIZ;
                                }
                                enumC918810a19 = EnumC918810a19.StateLinked;
                                if (enumC918810a192 != enumC918810a19) {
                                    enumC918810a19 = EnumC918810a19.StatePreparing;
                                }
                            }
                            c1ayrLJJLIIJ.LJIILLIIL(new C1AXI(enumC918810a19, null, (String) entry2.getKey(), null, null, null, null, 1016), null);
                        }
                    }
                    c1axm.LL(true);
                    if (layoutLIZ.isFixedType()) {
                        c1axm.LLIILII("onFixedPositionChanged", null);
                    } else {
                        C1AXM.LLIZLLLIL(c1axm, layoutLIZ, "onFloatPositionChanged", true, false, false, false, false, null, 248);
                    }
                    if (!c1axm.LLILZ.isEmpty()) {
                        Iterator<Runnable> it3 = c1axm.LLILZ.iterator();
                        while (it3.hasNext()) {
                            it3.next().run();
                        }
                        c1axm.LLILZ.clear();
                    }
                }
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("LinkLayoutManager@cbf4.notifyContentLayoutUpdate$runnable$1");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("LinkLayoutManager@cbf4.notifyContentLayoutUpdate$runnable$1");
            }
        };
        if (LJLJJLL().LIZ(false) == null) {
            ((ArrayList) this.LLLLIIL).add(runnable);
        } else {
            runnable.run();
        }
    }

    @Override // X.InterfaceC937900aVw
    public final void LLII() {
        C500260Jjc.LJJLIIIJILLIZJL(new C1AXT(this));
    }

    @Override // X.InterfaceC937900aVw
    public final EnumC921070a4n LLILIL() {
        return ((C1AFE) this.LLJJ.getValue()).LJ;
    }

    public final void LLILLJJLI() {
        this.LLLILZLLLI = "";
        this.LLLIILIL = null;
        this.LLLIL = null;
        this.LLLIIL = 0L;
    }

    @Override // X.InterfaceC937900aVw
    public final Map<String, String> LLILZ() {
        Map<String, String> map = this.LLILZIL;
        if (map != null) {
            return C2097608Jq.LJIIZILJ(map);
        }
        return null;
    }

    @Override // X.InterfaceC937900aVw
    public final Layout LJFF() {
        return LJJLIIJ().LIZJ(false);
    }

    @Override // X.InterfaceC964790bDJ
    public final List<PosIdentity> LJIIJJI() {
        return LJJLIIJ().LJIIIZ();
    }

    @Override // X.InterfaceC937900aVw
    public final InterfaceC937820aVo LJJJJZ() {
        return LJLI();
    }

    @Override // X.InterfaceC937900aVw
    public final Layout LJJLIIIJLLLLLLLZ() {
        return LJLJJLL().LIZ(false);
    }

    public final String LJLLL() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(this.LLLJIL);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final boolean LLF() {
        return (LJL() || this.LL.LJIIIIZZ) ? false : true;
    }

    public final void LLFFF() {
        if (LinkMicLayoutPatchSettings.isEnable()) {
            return;
        }
        if (C949650aot.LIZ()) {
            this.LLLI = "seamless";
        } else {
            this.LLLI = null;
        }
    }

    @Override // X.InterfaceC964790bDJ
    public final LayoutArray LLFII() {
        MicPositionInfo micPositionInfo;
        int iIntValue;
        MicPositionInfo micPositionInfo2;
        Layout layoutLIZ = LJLJJLL().LIZ(false);
        if (layoutLIZ == null) {
            String strLLIIII = LLIIII(1685);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(LJLLL());
            sbLIZ.append(":getCurrentUserResolution return as layout is null!");
            C1AZW.LJFF(strLLIIII, C2188811AlT.LIZIZ(sbLIZ), null, null);
            return null;
        }
        LinkUser linkUserLJIIJJI = LJJZ().LJIIJJI(UserService.getInstance().user().getCurrentUserId());
        if (linkUserLJIIJJI == null) {
            return null;
        }
        C918060Zzw c918060Zzw = C918060Zzw.LIZ;
        boolean z = this.LL.LJIIIIZZ;
        c918060Zzw.getClass();
        if (C918060Zzw.LIZ(z) && this.LL.LIZIZ == 4) {
            Pair pairLJI = C500260Jjc.LJI(LJJLIIJ().LJIIIZ(), new C1AY0(linkUserLJIIJJI));
            if (pairLJI.getFirst() == null) {
                return null;
            }
            iIntValue = ((Number) pairLJI.getSecond()).intValue();
        } else {
            C1AXO c1axoLJLJJLL = LJLJJLL();
            String actualLinkMicId = linkUserLJIIJJI.getActualLinkMicId();
            OnLineMicInfo onLineMicInfoLJIJI = c1axoLJLJJLL.LJI() ? c1axoLJLJJLL.LIZJ.LJIJI(actualLinkMicId) : c1axoLJLJJLL.LIZJ.LJFF(actualLinkMicId);
            if (!LJLJI().LIZ()) {
                if (onLineMicInfoLJIJI != null && (micPositionInfo = onLineMicInfoLJIJI.micPositionData) != null) {
                    iIntValue = micPositionInfo.position;
                }
                return null;
            }
            if (onLineMicInfoLJIJI == null || (micPositionInfo2 = onLineMicInfoLJIJI.micPositionData) == null) {
                return null;
            }
            iIntValue = micPositionInfo2.uiPos;
        }
        LayoutArray layoutByPosAndSize = layoutLIZ.getLayoutByPosAndSize(iIntValue, LJJLL().LIZIZ());
        if (layoutByPosAndSize != null) {
            this.LLLIIII = layoutByPosAndSize.businessId;
            return layoutByPosAndSize;
        }
        return null;
    }

    @Override // X.InterfaceC964790bDJ, X.InterfaceC937820aVo
    public final String getLayoutId() {
        Layout layoutLIZJ = LJJLIIJ().LIZJ(false);
        if (layoutLIZJ != null) {
            return layoutLIZJ.layoutId;
        }
        return null;
    }

    @Override // X.InterfaceC937900aVw
    public final void ul() throws JSONException {
        LLIZLLLIL(this, C2490609pQ.LIZIZ(), "switchToNormalLayout", false, false, false, false, false, null, 252);
    }

    @Override // X.InterfaceC964790bDJ
    public final InterfaceC964830bDN LJJIJL() {
        return this.LLLLII;
    }

    @Override // X.InterfaceC937900aVw
    public final C939230aY5 LJJJLZIJ() {
        return this.LLJJIII;
    }

    @Override // X.InterfaceC964790bDJ
    public final String LLIIIILZ() {
        return this.LLLIIII;
    }

    @Override // X.InterfaceC937900aVw
    public final ViewGroup LLILLIZIL() {
        return this.LLJJI;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v63, types: [X.0bK7] */
    public C1AXM(C2177031AIb c2177031AIb) {
        String str;
        InterfaceC969000bK6 interfaceC969000bK6;
        this.LL = c2177031AIb;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        if (c2177031AIb.LIZIZ == 4) {
            str = "Multi";
        } else {
            str = "Cross";
        }
        sbLIZ.append(str);
        sbLIZ.append("LayoutManager");
        this.LLILLJJLI = C2188811AlT.LIZIZ(sbLIZ);
        this.LLILLL = new CopyOnWriteArrayList<>();
        this.LLILZ = new CopyOnWriteArrayList<>();
        this.LLILZLL = C452501pT.LIZIZ(new C2176111AEn());
        this.LLIZ = C452501pT.LIZIZ(new C2176101AEm());
        this.LLIZLLLIL = C452501pT.LIZIZ(new C2176071AEj());
        this.LLJ = C452501pT.LIZIZ(new C2176091AEl());
        this.LLJI = C452501pT.LIZIZ(new C2176081AEk());
        this.LLJIJIL = C452501pT.LIZIZ(new C1AGU(this));
        this.LLJILJIL = C452501pT.LIZIZ(new C1AWZ(this));
        this.LLJILJILJ = C452501pT.LIZIZ(new C2180671AWb(this));
        this.LLJILLL = C452501pT.LIZIZ(new C2180661AWa(this));
        this.LLJJ = C452501pT.LIZIZ(new C1AFJ(this));
        C972430bPd c972430bPd = new C972430bPd(c2177031AIb.LIZ);
        c972430bPd.setId(R.id.ysu);
        this.LLJJI = c972430bPd;
        this.LLJJIII = new C939230aY5();
        this.LLJJIJIIJIL = new ConcurrentLinkedQueue<>();
        OnLineMicInfo.Builder builder = new OnLineMicInfo.Builder();
        builder.setMicPositionData(new MicPositionInfo(1, 0, -1, 0L, 0, null));
        this.LLJJIJIL = builder.build();
        LinkUser.Builder builder2 = new LinkUser.Builder();
        builder2.setUserId(Long.valueOf(c2177031AIb.LJ));
        this.LLJJJ = builder2.build();
        this.LLJJJIL = new AtomicBoolean(false);
        this.LLJJJJ = new Rect();
        this.LLJJL = LLLLLIL;
        this.LLJLIL = C452501pT.LIZIZ(new C1AFR(this));
        this.LLJLILLLLZIIL = C452501pT.LIZIZ(new C1AFK(this));
        this.LLJLLIL = -1.0f;
        this.LLJZ = new CopyOnWriteArrayList();
        this.LLJZIJLIL = new CopyOnWriteArrayList();
        this.LLL = -1L;
        this.LLLFF = -1;
        this.LLLI = "";
        this.LLLIIIIL = C452501pT.LIZIZ(new C2181031AXl(this));
        this.LLLIIIL = C452501pT.LIZIZ(new C2181301AYm(this));
        this.LLLILZLLLI = "";
        this.LLLL = C452501pT.LIZIZ(new C2181081AXq(this));
        this.LLLLII = new C1AXN(this);
        this.LLLLIIIILLL = new C969020bK8(this);
        this.LLLLIIL = new ArrayList();
        C1AXQ c1axq = c2177031AIb.LJFF;
        if ((c1axq instanceof InterfaceC969000bK6) && (interfaceC969000bK6 = (InterfaceC969000bK6) c1axq) != 0) {
            interfaceC969000bK6.LJJIIZI(new InterfaceC968880bJu() { // from class: X.0bK7
                @Override // X.InterfaceC968880bJu
                public final void LIZ(Map<String, OnLineMicInfo> map) {
                    String strLLIIII = this.LIZ.LLIIII(677);
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append(this.LIZ.LJLLL());
                    sbLIZ2.append(":onLiveUsersFloatPositionChanged size = ");
                    sbLIZ2.append(map.size());
                    C1AZW.LJIIJ(12, strLLIIII, C2188811AlT.LIZIZ(sbLIZ2), null, null);
                }

                @Override // X.InterfaceC968880bJu
                public final void LJJZ(Map<String, OnLineMicInfo> map) {
                    int i;
                    String str2;
                    String strLLIIII = this.LIZ.LLIIII(673);
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append(this.LIZ.LJLLL());
                    sbLIZ2.append(":onLiveUsersPositionChanged size = ");
                    sbLIZ2.append(map.size());
                    C1AZW.LJIIJ(12, strLLIIII, C2188811AlT.LIZIZ(sbLIZ2), null, null);
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    for (Map.Entry<String, OnLineMicInfo> entry : map.entrySet()) {
                        String key = entry.getKey();
                        MicPositionInfo micPositionInfo = entry.getValue().micPositionData;
                        int i2 = 0;
                        if (micPositionInfo != null) {
                            i = micPositionInfo.position;
                            i2 = micPositionInfo.contentType;
                            str2 = micPositionInfo.contentLinkMicId;
                        } else {
                            i = 0;
                            str2 = null;
                        }
                        linkedHashMap.put(key, new MicPositionContentInfo(i, i2, str2));
                    }
                    this.LIZ.LL.LJFF.LJJJLZIJ(linkedHashMap);
                }
            });
        }
        if (c2177031AIb.LJII == EnumC945310aht.LIVE_ROOM && !c2177031AIb.LJI) {
            this.LLLJ = new LayoutSlardarMonitor(new C2181101AXs(UserService.getInstance().user().getCurrentUserId(), new C1AFU(this), new C1AFN(this), c2177031AIb.LIZJ, c2177031AIb.LIZIZ, c2177031AIb.LIZLLL, new C1AY9(this)));
        }
        this.LLLJIL = hashCode();
    }

    public static boolean LLFF(Integer num) {
        if (num != null) {
            if (num.intValue() == 1 || num.intValue() == 3 || num.intValue() == 2) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static final void LLIL(View view) {
        ViewGroup viewGroup;
        ViewParent parent = view.getParent();
        if ((parent instanceof ViewGroup) && (viewGroup = (ViewGroup) parent) != null) {
            C786410Ut5.LJJJLZIJ(view, viewGroup);
        }
    }

    @Override // X.InterfaceC937900aVw
    public final void LIZJ(String str) {
        C2177031AIb c2177031AIb = this.LL;
        if (c2177031AIb.LJIIIIZZ && this.LLLLIILL != null) {
            c2177031AIb.LJFF.LIZJ(str);
        }
    }

    @Override // X.InterfaceC955150axl
    public final void LIZLLL(InterfaceC1280020jPk interfaceC1280020jPk) {
        this.LL.LJFF.LJLI(interfaceC1280020jPk);
    }

    @Override // X.InterfaceC937900aVw
    public final boolean LJ(String str) {
        return this.LL.LJFF.LJ(str);
    }

    @Override // X.InterfaceC937900aVw, X.InterfaceC937820aVo
    public final InterfaceC937840aVq LJI(String str) {
        return LJLI().LJI(str);
    }

    @Override // X.InterfaceC964790bDJ
    public final void LJII(long j) {
        LayoutSlardarMonitor layoutSlardarMonitor = this.LLLJ;
        if (layoutSlardarMonitor != null) {
            layoutSlardarMonitor.LJ = j;
        }
        C1303200k18.LIZLLL = String.valueOf(j);
    }

    @Override // X.InterfaceC964790bDJ
    public final Rect LJIIJ(String str) {
        List<SeiRegion> list;
        SeiRegion next;
        SeiAppData seiAppData = this.LLLIILIL;
        if (seiAppData != null && (list = seiAppData.grids) != null) {
            Iterator<SeiRegion> it2 = list.iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    if (Intrinsics.LJFF(next.uidStr, str)) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            SeiRegion seiRegion = next;
            if (seiRegion != null) {
                int iDoubleValue = (int) (seiRegion.x * this.LLJJL.getFirst().doubleValue());
                int iDoubleValue2 = ((int) (seiRegion.width * this.LLJJL.getFirst().doubleValue())) + iDoubleValue;
                int iDoubleValue3 = (int) (seiRegion.y * this.LLJJL.getSecond().doubleValue());
                return new Rect(iDoubleValue, iDoubleValue3, iDoubleValue2, ((int) (seiRegion.height * this.LLJJL.getSecond().doubleValue())) + iDoubleValue3);
            }
        }
        return null;
    }

    @Override // X.InterfaceC937900aVw
    public final void LJIILL(String str) {
        synchronized (LJJLIIIIJ()) {
            try {
                LJJLIIIIJ().remove(str);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        LIZJ("removePermanentData");
    }

    @Override // X.InterfaceC937900aVw
    public final void LJIIZILJ(InterfaceC940430aa1 interfaceC940430aa1) {
        this.LL.LJFF.LJIIZILJ(interfaceC940430aa1);
    }

    @Override // X.InterfaceC937900aVw
    public final void LJIJ(String str) {
        C500260Jjc.LJJLIIIJILLIZJL(new C1AXS(this, str));
    }

    @Override // X.InterfaceC955150axl
    public final void LJIJJ(InterfaceC1280020jPk interfaceC1280020jPk) {
        this.LL.LJFF.LJLI(null);
    }

    @Override // X.InterfaceC964930bDX
    public final void LJIJJLI(List<PosIdentity> list) {
        LJZL(list);
    }

    @Override // X.InterfaceC937900aVw
    public final void LJIL(InterfaceC940430aa1 interfaceC940430aa1) {
        this.LL.LJFF.LJIL(interfaceC940430aa1);
    }

    public final void LJJIIJZLJL(DslLayout dslLayout) {
        String strLLIIII = LLIIII(815);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(LJLLL());
        sbLIZ.append(":createLayout, scene:");
        sbLIZ.append(dslLayout.scene);
        sbLIZ.append(", version:");
        sbLIZ.append(dslLayout.version);
        C1AZW.LJIIJ(12, strLLIIII, C2188811AlT.LIZIZ(sbLIZ), null, null);
        this.LLJJIJI = dslLayout;
        C939230aY5 c939230aY5 = this.LLJJIII;
        int i = dslLayout.version;
        c939230aY5.LIZ = i;
        LayoutSlardarMonitor layoutSlardarMonitor = this.LLLJ;
        if (layoutSlardarMonitor != null) {
            layoutSlardarMonitor.LJFF = i;
        }
    }

    @Override // X.InterfaceC964790bDJ
    public final Pair<Integer, Rect> LJJIJIIJIL(String str) {
        FrameLayout frameLayout;
        ViewGroup viewGroup;
        int width;
        int height;
        C1AX3 c1ax3LJI = LJJLIIJ().LJI(str);
        if (c1ax3LJI == null || (frameLayout = c1ax3LJI.LIZIZ) == null) {
            return null;
        }
        int[] iArr = new int[2];
        frameLayout.getLocationOnScreen(iArr);
        ViewParent parent = frameLayout.getParent();
        if (!(parent instanceof ViewGroup) || (viewGroup = (ViewGroup) parent) == null) {
            return null;
        }
        if (frameLayout.getLayoutParams().width > 0) {
            width = frameLayout.getLayoutParams().width;
        } else {
            width = frameLayout.getWidth();
        }
        if (frameLayout.getLayoutParams().height > 0) {
            height = frameLayout.getLayoutParams().height;
        } else {
            height = frameLayout.getHeight();
        }
        Integer numValueOf = Integer.valueOf(viewGroup.indexOfChild(frameLayout));
        int i = iArr[0];
        int i2 = iArr[1];
        return new Pair<>(numValueOf, new Rect(i, i2, width + i, height + i2));
    }

    @Override // X.InterfaceC937900aVw
    public final void LJJIZ(String str) {
        if (!LivesdkLinkmicSeiEnabledBusinessIdSetting.INSTANCE.isEnable(str)) {
            return;
        }
        synchronized (LJJLI()) {
            try {
                LJJLI().remove(str);
                LIZJ("removePermanentRegionStreamData");
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // X.InterfaceC937900aVw
    public final void LJJJJ(SurfaceView surfaceView) {
        long currentUserId = UserService.getInstance().user().getCurrentUserId();
        LinkUser linkUserLJIIJJI = LJJZ().LJIIJJI(currentUserId);
        if (linkUserLJIIJJI == null) {
            String strLLIIII = LLIIII(1252);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(LJLLL());
            sbLIZ.append(":updateGuestSelfSurfaceView return as linkUser is null");
            C1AZW.LJFF(strLLIIII, C2188811AlT.LIZIZ(sbLIZ), null, null);
            return;
        }
        if (LJJLIIJ().LJIILLIIL(new C1AXI(EnumC918810a19.StateLinked, Long.valueOf(currentUserId), linkUserLJIIJJI.linkMicId, surfaceView, null, null, null, 1008), null) && LJLJJLL().LIZLLL(linkUserLJIIJJI.getActualLinkMicId()) != null) {
            LLIILII("updateGuestSelfSurfaceView", null);
            return;
        }
        C1AZW c1azw = C1AZW.LIZ;
        String strLLIIII2 = LLIIII(1266);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(LJLLL());
        sbLIZ2.append(":updateGuestSelfSurfaceView updateOrInsert = false");
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
        c1azw.getClass();
        C1AZW.LIZ(strLLIIII2, strLIZIZ, null, null);
    }

    @Override // X.InterfaceC937900aVw
    public final int LJJJJJ(String str) {
        final C118300cf c118300cf = new C118300cf();
        int i = this.LLJJIII.LIZ;
        c118300cf.element = i;
        this.LL.LJFF.LJJL(i, str, new InterfaceC1303160k14() { // from class: X.1AXk
            @Override // X.InterfaceC1303160k14
            public final void LIZ(Layout layout) {
                String str2;
                int i2;
                String strLLIIII = this.LIZ.LLIIII(1198);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(this.LIZ.LJLLL());
                sbLIZ.append(":getVersionByLayoutId layoutId = ");
                if (layout != null) {
                    str2 = layout.layoutId;
                } else {
                    str2 = null;
                }
                sbLIZ.append(str2);
                C1AZW.LJIIJ(12, strLLIIII, C2188811AlT.LIZIZ(sbLIZ), null, null);
                C118300cf c118300cf2 = c118300cf;
                if (layout != null) {
                    i2 = layout.version;
                } else {
                    i2 = this.LIZ.LLJJIII.LIZ;
                }
                c118300cf2.element = i2;
            }
        }, null);
        return c118300cf.element;
    }

    @Override // X.InterfaceC937900aVw
    public final void LJJJJJL(InterfaceC958970b3v interfaceC958970b3v) {
        if (this.LLJJIJIIJIL.contains(interfaceC958970b3v)) {
            return;
        }
        this.LLJJIJIIJIL.add(interfaceC958970b3v);
    }

    @Override // X.InterfaceC964790bDJ
    public final void LJJLIIIJ(boolean z) {
        String strLLIIII = LLIIII(1409);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(LJLLL());
        sbLIZ.append(":updateLinkState isInLinked:");
        sbLIZ.append(z);
        C1AZW.LJFF(strLLIIII, C2188811AlT.LIZIZ(sbLIZ), null, null);
        LLJ(z);
    }

    @Override // X.InterfaceC937900aVw
    public final void LJJLIIIJILLIZJL(int i) {
        LJLI().setDividerType(i);
    }

    @Override // X.InterfaceC937900aVw
    public final Layout LJJLIIIJJIZ(String str) {
        String str2;
        DslLayout dslLayout = this.LLJJIJI;
        if (dslLayout == null) {
            return null;
        }
        Layout layout = dslLayout.data.get(str);
        String strLLIIII = LLIIII(1074);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(LJLLL());
        sbLIZ.append(":calculateLayout layoutName = ");
        sbLIZ.append(str);
        sbLIZ.append(" layoutId = ");
        if (layout != null) {
            str2 = layout.layoutId;
        } else {
            str2 = null;
        }
        sbLIZ.append(str2);
        C1AZW.LJIIJ(12, strLLIIII, C2188811AlT.LIZIZ(sbLIZ), null, null);
        return layout;
    }

    @Override // X.InterfaceC937900aVw
    public final void LJJLJ(boolean z) {
        this.LLLIZZ = z;
    }

    @Override // X.InterfaceC937900aVw
    public final void LJJZZI(final int i) {
        this.LLLF = i;
        final ViewGroup viewGroup = this.LLLLIILL;
        if (viewGroup == null) {
            return;
        }
        HandlerHook.viewPost(viewGroup, new Runnable() { // from class: X.1AXd
            public final void LIZ() throws JSONException {
                this.LL.LLJJJJJIL = new Pair<>(Integer.valueOf(viewGroup.getWidth()), Integer.valueOf(viewGroup.getHeight() + i));
                Layout layoutLIZJ = this.LL.LJJLIIJ().LIZJ(false);
                if (layoutLIZJ == null) {
                    return;
                }
                C1AXM.LLIZLLLIL(this.LL, layoutLIZJ, "addExtraHeightForParent", true, false, false, false, false, null, 248);
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("LinkLayoutManager@cbf4.addExtraHeightForParent$1");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("LinkLayoutManager@cbf4.addExtraHeightForParent$1");
            }
        });
    }

    @Override // X.InterfaceC937900aVw
    public final void LJJZZIII(boolean z) {
        Rect rect;
        C2180891AWx c2180891AWxLJLI = LJLI();
        if (z) {
            rect = new Rect();
            ViewGroup viewGroup = this.LLLLIILL;
            if (viewGroup != null) {
                viewGroup.getLocalVisibleRect(rect);
            }
        } else {
            rect = null;
        }
        c2180891AWxLJLI.getLayoutMixer().LIZLLL(rect, z);
        c2180891AWxLJLI.LJIILL(EnumC993190bx7.SwitchLayout, false, null);
    }

    @Override // X.InterfaceC937900aVw
    public final void LJLJJL(Layout layout) {
        boolean zLJJJI = this.LL.LJFF.LJJJI();
        if (layout == null) {
            layout = LJJLIIJ().LIZJ(true);
        }
        if (zLJJJI && layout != null) {
            List<C1276580jKC> listLJIILL = this.LL.LJFF.LJIILL();
            LJLIL().mixStream(1080, (int) (1080 / layout.viewForCanvas.ratio), listLJIILL);
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listLJIILL, 10));
            for (C1276580jKC c1276580jKC : listLJIILL) {
                arrayList.add(new C1276780jKW(c1276580jKC.LIZIZ, (float) c1276580jKC.LJ, (float) c1276580jKC.LJFF, (float) c1276580jKC.LJI, (float) c1276580jKC.LJII, c1276580jKC.LJIILIIL, c1276580jKC.LIZLLL));
            }
            this.LL.LJFF.LJJLJLI(arrayList);
        }
    }

    @Override // X.InterfaceC937900aVw
    public final void LJLJL(View view) {
        this.LLJJLIIIJLLLLLLLZ = view;
    }

    @Override // X.InterfaceC937900aVw
    public final void LJLJLJ(InterfaceC958970b3v interfaceC958970b3v) {
        this.LLJJIJIIJIL.remove(interfaceC958970b3v);
    }

    @Override // X.InterfaceC937900aVw
    public final void LJLL(String str) {
        this.LLLI = str;
    }

    public final void LJZI(Map<String, ? extends Map<String, String>> map) {
        if (map != null) {
            try {
                Map<String, String> map2 = map.get("ae");
                if (map2 != null) {
                    this.LLILZIL = new LinkedHashMap(map2);
                    return;
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                this.LLILZIL = null;
                C20441214yg.LJ("handleAnchorExperiment", e.toString());
                return;
            }
        }
        this.LLILZIL = null;
    }

    public final boolean LJZL(List<PosIdentity> list) {
        boolean zLJIJ = LJJLIIJ().LJIJ(list);
        if (zLJIJ && this.LL.LJIIIIZZ) {
            LJLLLL().LJI("innerUpdateUIPositions", true);
        }
        return zLJIJ;
    }

    public final void LL(boolean z) {
        this.LL.LJFF.LJJLIIIJL();
        if (z) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(this.LLILLJJLI);
            sbLIZ.append(" invalideSeiAndUpdateRtcInfo");
            LIZJ(C2188811AlT.LIZIZ(sbLIZ));
        }
        if ((!LJL() && !this.LL.LJIIIIZZ) || LJJLIIIJLLLLLLLZ() == null) {
            return;
        }
        this.LL.LJFF.LJJLIIIJILLIZJL();
    }

    @Override // X.InterfaceC964930bDX
    public final void LLI(List<Pair<String, Integer>> list) throws JSONException {
        Integer numValueOf;
        C2181231AYf c2181231AYfLJLLLL = LJLLLL();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("notifyLayoutUpdate linkMicPositionArray:");
        Integer numValueOf2 = null;
        if (list != null) {
            numValueOf = Integer.valueOf(list.size());
        } else {
            numValueOf = null;
        }
        sbLIZ.append(numValueOf);
        boolean z = false;
        c2181231AYfLJLLLL.LJI(C2188811AlT.LIZIZ(sbLIZ), false);
        int size = this.LLILZ.size();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < size; i++) {
            Runnable runnable = this.LLILZ.get(i);
            runnable.run();
            arrayList.add(runnable);
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            this.LLILZ.remove(it2.next());
        }
        LLFFF();
        Layout layoutLIZ = LJLJJLL().LIZ(true);
        if (layoutLIZ != null && !LLF()) {
            if (layoutLIZ.isFixedType()) {
                LL(true);
                LLIILII("onFixedPositionChanged", null);
            } else {
                if (list != null) {
                    Iterator<Pair<String, Integer>> it3 = list.iterator();
                    while (it3.hasNext()) {
                        String first = it3.next().getFirst();
                        if (LJJLIIJ().LJI(first) == null) {
                            LJJLIIJ().LJIILLIIL(new C1AXI(EnumC918810a19.StateJoined, null, first, null, null, null, null, 1016), null);
                        }
                    }
                }
                LL(true);
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("onFloatPositionChanged_notifyLayoutUpdate「");
                if (list != null) {
                    numValueOf2 = Integer.valueOf(list.size());
                }
                sbLIZ2.append(numValueOf2);
                sbLIZ2.append((char) 12301);
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
                if (list != null) {
                    List<InterfaceC937840aVq> allLayoutWindows = LJLI().getAllLayoutWindows();
                    if (allLayoutWindows.size() == list.size()) {
                        Map mapLJIILLIIL = C2097608Jq.LJIILLIIL(list);
                        if (!allLayoutWindows.isEmpty()) {
                            for (InterfaceC937840aVq interfaceC937840aVq : allLayoutWindows) {
                                Integer num = (Integer) mapLJIILLIIL.get(interfaceC937840aVq.LJ());
                                int iLJIIIIZZ = interfaceC937840aVq.LJIIIIZZ();
                                if (num == null || num.intValue() != iLJIIIIZZ) {
                                    z = true;
                                    break;
                                }
                            }
                        }
                    } else {
                        z = true;
                        break;
                    }
                }
                LLIZLLLIL(this, layoutLIZ, strLIZIZ, z, false, false, false, false, null, 248);
            }
        }
        Iterator<InterfaceC958970b3v> it4 = this.LLJJIJIIJIL.iterator();
        while (it4.hasNext()) {
            it4.next().LLIIIL(this.LL.LJFF.LIZ());
        }
    }

    @Override // X.InterfaceC937900aVw
    public final void LLIFFJFJJ(String str) {
        int i;
        String strLLIIII = LLIIII(1758);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateLayoutParam start layoutName=");
        sbLIZ.append(str);
        C1AZW.LJIIJ(12, strLLIIII, C2188811AlT.LIZIZ(sbLIZ), null, null);
        if (str != null) {
            C939230aY5 c939230aY5 = this.LLJJIII;
            if (c939230aY5 != null) {
                i = c939230aY5.LIZ;
            } else {
                i = 0;
            }
            LayoutDSLConfig layoutDSLConfig = new LayoutDSLConfig(i, str);
            InterfaceC964840bDO interfaceC964840bDOLJLIIL = LJLIIL();
            if (interfaceC964840bDOLJLIIL != null) {
                ((C2181001AXi) interfaceC964840bDOLJLIIL).LJIILJJIL(layoutDSLConfig);
            }
        }
    }

    public final String LLIIII(int i) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(EnumC1303240k1C.LAYOUT.getValue());
        sbLIZ.append('_');
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append('_');
        sbLIZ.append(i);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC964790bDJ
    public final void LLIIIJ(DslLayout dslLayout) {
        this.LLJJIJI = dslLayout;
        C939230aY5 c939230aY5 = this.LLJJIII;
        int i = dslLayout.version;
        c939230aY5.LIZ = i;
        LayoutSlardarMonitor layoutSlardarMonitor = this.LLLJ;
        if (layoutSlardarMonitor != null) {
            layoutSlardarMonitor.LJFF = i;
        }
        String strLLIIII = LLIIII(832);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(LJLLL());
        sbLIZ.append(":updateDslLayout, dsl version:");
        sbLIZ.append(this.LLJJIII.LIZ);
        C1AZW.LJFF(strLLIIII, C2188811AlT.LIZIZ(sbLIZ), null, null);
    }

    @Override // X.InterfaceC937900aVw
    public final void LLIIIL(boolean z) {
        if (this.LLLLIILLL == z) {
            return;
        }
        this.LLLLIILLL = z;
        LLIILII("switchBusinessContainerSuperView", null);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:161:0x073f  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0758  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0801  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0819  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x081f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x011d  */
    /* JADX WARN: Type inference failed for: r16v1, types: [X.1AWo] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LLIIJI(com.bytedance.android.livesdk.comp.api.linkcore.model.Layout r29) {
        /*
            Method dump skipped, instruction units count: 2122
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1AXM.LLIIJI(com.bytedance.android.livesdk.comp.api.linkcore.model.Layout):void");
    }

    @Override // X.InterfaceC964790bDJ
    public final void LLIIJLIL(List<String> list) {
        C1AZW c1azw = C1AZW.LIZ;
        String strLLIIII = LLIIII(StrategyCenter.ENABLE_SMART_SERVICE);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(LJLLL());
        sbLIZ.append(":refreshSeiForLinkedListChanged newLinkMicIdList:");
        sbLIZ.append(list);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c1azw.getClass();
        C1AZW.LIZ(strLLIIII, strLIZIZ, null, null);
        this.LLJLL = list;
    }

    @Override // X.InterfaceC937900aVw
    public final void LLIIL(C2181211AYd c2181211AYd) {
        C1AYR c1ayrLJJLIIJ = LJJLIIJ();
        EnumC918810a19 enumC918810a19 = EnumC918810a19.StateLinked;
        LinkUser linkUser = this.LLJJJ;
        c1ayrLJJLIIJ.LJIILLIIL(new C1AXI(enumC918810a19, linkUser.userId, linkUser.linkMicId, null, c2181211AYd, null, null, LSPassThroughRecordSizeConfig.DEFAULT), null);
    }

    @Override // X.InterfaceC937900aVw
    public final void LLIILZL(SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB) {
        LJLI().setSubviewBetweenRenderAndUIContainer(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB);
        LLIILII("addSubviewBetweenRenderAndUIContainer", null);
    }

    public final void LLIIZ(C940560aaE c940560aaE) {
        this.LLLII = c940560aaE;
    }

    @Override // X.InterfaceC937900aVw
    public final void LLILII(String str) {
        int iHashCode;
        ViewGroup viewGroup = this.LLLLIILL;
        FrameLayout frameLayout = this.LLJJI;
        try {
            String str2 = this.LLILLJJLI;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("destroyLayoutImmediately fix, tempVP=");
            if (viewGroup == null) {
                iHashCode = 0;
            } else {
                iHashCode = viewGroup.hashCode();
            }
            sbLIZ.append(iHashCode);
            sbLIZ.append(", tmp containerFrameLayout=");
            sbLIZ.append(frameLayout.hashCode());
            C20441214yg.LJIIIZ(str2, C2188811AlT.LIZIZ(sbLIZ));
            if (viewGroup != null) {
                if ((Intrinsics.LJFF(str, "onDestroyView") || Intrinsics.LJFF(str, "onLivePause")) && MultiLiveFYPDestroyOptSettings.INSTANCE.isEnable()) {
                    C20441214yg.LIZIZ("MultiLiveFYPDestroyOpt", "opt FYPDestroy");
                } else {
                    LJJIIJ();
                }
                if (Intrinsics.LJFF(frameLayout.getParent(), viewGroup)) {
                    C786410Ut5.LJJJLZIJ(frameLayout, viewGroup);
                } else {
                    LLIL(frameLayout);
                }
                this.LLLLIILL = null;
            } else {
                LLIL(frameLayout);
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C20441214yg.LJFF(this.LLILLJJLI, "destroyLayoutImmediately exception", th);
        }
        C972430bPd c972430bPd = new C972430bPd(this.LL.LIZ);
        c972430bPd.setId(R.id.ysu);
        this.LLJJI = c972430bPd;
    }

    @Override // X.InterfaceC937900aVw
    public final void LLILLL(boolean z) {
        this.LLLJL = z;
    }

    @Override // X.InterfaceC937900aVw
    public final void LLILZLL(Pair<Integer, Integer> pair) throws JSONException {
        if ((pair.getFirst().intValue() <= 0 && pair.getSecond().intValue() <= 0) || !Intrinsics.LJFF(pair, this.LLJJL)) {
            if (pair.getFirst().intValue() <= 0 || pair.getSecond().intValue() <= 0) {
                pair = LLLLLIL;
            }
            this.LLJJL = pair;
            pair.getFirst().intValue();
            this.LLJJL.getSecond().intValue();
            String strLLIIII = LLIIII(936);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(LJLLL());
            sbLIZ.append(":update player size mPlayerSize:");
            sbLIZ.append(this.LLJJL);
            C1AZW.LJIIJ(12, strLLIIII, C2188811AlT.LIZIZ(sbLIZ), null, null);
            Layout layoutLIZJ = LJJLIIJ().LIZJ(false);
            if (layoutLIZJ == null) {
                String strLLIIII2 = LLIIII(939);
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append(LJLLL());
                sbLIZ2.append(":setParent return as layout is null");
                C1AZW.LJIIJ(12, strLLIIII2, C2188811AlT.LIZIZ(sbLIZ2), null, null);
                return;
            }
            LLIZLLLIL(this, layoutLIZJ, "setStreamResolution", true, false, false, false, false, null, 248);
        }
    }

    @Override // X.InterfaceC937900aVw
    public final void LLIZ(int i) {
        this.LLLF = i;
    }

    public final void LLJ(boolean z) {
        String str;
        String str2;
        String str3;
        String strLLIIII = LLIIII(1351);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(LJLLL());
        sbLIZ.append(":updateIsLinked isLink = ");
        sbLIZ.append(z);
        C1AZW.LJIIJ(12, strLLIIII, C2188811AlT.LIZIZ(sbLIZ), null, null);
        String str4 = "";
        if (this.LLJJJIL.getAndSet(z) != z && z) {
            this.LLLIILIL = null;
            this.LLLIL = null;
            this.LLLILZLLLI = "";
            this.LLLIIL = 0L;
        }
        if (!z && !this.LL.LJIIIIZZ) {
            this.LLILLL.clear();
            C1303200k18.LIZ = "audience";
            C1AZW.LIZ.getClass();
            C1AZW.LJII = "audience";
            C1AZW.LJIIIZ = Intrinsics.LJFF("audience", "anchor");
            C1AZW.LJFF = "";
            return;
        }
        if (this.LL.LJIIIIZZ) {
            str = "anchor";
        } else {
            str = "guest";
        }
        C1303200k18.LIZ = str;
        C1AZW.LIZ.getClass();
        C1AZW.LJII = str;
        C1AZW.LJIIIZ = Intrinsics.LJFF(str, "anchor");
        int i = this.LL.LIZIZ;
        if (i != 0) {
            if (i != 2) {
                if (i == 4) {
                    str4 = "multi_guest";
                }
            } else {
                str4 = "multi_host";
            }
        } else {
            str4 = "union";
        }
        C1AZW.LJIIIIZZ = str4;
        LinkUser linkUserLJIIJJI = LJJZ().LJIIJJI(UserService.getInstance().user().getCurrentUserId());
        if (linkUserLJIIJJI != null) {
            str2 = linkUserLJIIJJI.linkMicId;
        } else {
            str2 = null;
        }
        C1303200k18.LIZIZ = str2;
        if (linkUserLJIIJJI == null || (str3 = linkUserLJIIJJI.linkMicId) == null) {
            return;
        }
        C1AZW.LJFF = str3;
        if (!Intrinsics.LJFF(this.LL.LIZLLL, "live_voice") || this.LL.LJIIIIZZ) {
            return;
        }
        C1AX3 c1ax3LJI = LJJLIIJ().LJI(str3);
        if ((c1ax3LJI != null && c1ax3LJI.LIZ.LIZLLL != null) || !LJJLIIJ().LJIILLIIL(new C1AXI(EnumC918810a19.StateJoined, linkUserLJIIJJI.userId, linkUserLJIIJJI.linkMicId, null, null, null, null, 1016), null)) {
            return;
        }
        LLIILII("updateIsLinked", null);
    }

    @Override // X.InterfaceC937900aVw
    public final void O2(boolean z) {
        this.LLJJI.setClipChildren(false);
        LJLI().setClipChildren(false);
    }

    @Override // X.InterfaceC937900aVw
    public final void S0(String str) {
        if (LinkMicBizListenerClearFix.INSTANCE.enable()) {
            C500260Jjc.LJJLIIIJILLIZJL(new C1AYB(this, str));
        } else {
            LJJJLL().remove(str);
        }
    }

    @Override // X.InterfaceC937900aVw
    public final void V4(boolean z) {
        C500260Jjc.LJJLIIIJILLIZJL(new C1AXV(this, z));
    }

    @Override // X.InterfaceC937900aVw
    public final void LJIILLIIL(String str, C1AYC c1ayc) {
        if (LinkMicBizListenerClearFix.INSTANCE.enable()) {
            C500260Jjc.LJJLIIIJILLIZJL(new C1AY7(this, str, c1ayc));
        } else {
            LJJJLL().put(str, c1ayc);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC937900aVw
    public final void LJIJI(String str, Map<String, ? extends JSONObject> map) {
        if (!LivesdkLinkmicSeiEnabledBusinessIdSetting.INSTANCE.isEnable(str)) {
            return;
        }
        synchronized (LJJLI()) {
            try {
                LJJLI().put(str, map);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        if (this.LL.LJFF.LJIIJJI() != 1) {
            LIZJ("postPermanentMixRegionStreamData");
        }
    }

    @Override // X.InterfaceC937900aVw
    public final void LJJ(Map<String, Object> map, boolean z) {
        if (!LivesdkLinkmicSeiEnabledBusinessIdSetting.INSTANCE.isEnable("ae")) {
            return;
        }
        synchronized (LJJL()) {
            try {
                LJJL().putAll(map);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        if (z) {
            LIZJ("postAnchorExperimentToMixStreamData");
        }
    }

    public final Rect LJJIFFI(Rect rect, float f) {
        float fYG0;
        if (LinkMicFixLayoutMgrVisibleRect.INSTANCE.getValue()) {
            fYG0 = ((IWatchLiveService) C1161920gLG.LIZJ(IWatchLiveService.class)).YG0(this.LL.LIZJ);
        } else {
            fYG0 = 0.0f;
        }
        float f2 = fYG0 + f;
        if (f2 <= 0.0f) {
            return rect;
        }
        Rect rect2 = new Rect(rect);
        if (Math.abs(f2 - rect2.top) <= 1.0f) {
            rect2.top = 0;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("adaptTranslation1: originalRect=");
            sbLIZ.append(rect);
            sbLIZ.append(", adaptRect=");
            sbLIZ.append(rect2);
            C1AZW.LJIIJ(12, "LayoutFirstFrameOptLog", C2188811AlT.LIZIZ(sbLIZ), null, null);
        } else {
            int i = rect2.top;
            if (i > f2) {
                rect2.top = i - ((int) f2);
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("adaptTranslation2: originalRect=");
                sbLIZ2.append(rect);
                sbLIZ2.append(", adaptRect=");
                sbLIZ2.append(rect2);
                C1AZW.LJIIJ(12, "LayoutFirstFrameOptLog", C2188811AlT.LIZIZ(sbLIZ2), null, null);
                return rect2;
            }
        }
        return rect2;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final void LJJII(View view, InterfaceC937820aVo interfaceC937820aVo) {
        if (interfaceC937820aVo.getLayoutId() != null) {
            String layoutName = interfaceC937820aVo.getLayoutName();
            if (layoutName == null) {
                layoutName = "NORMAL";
            }
            switch (layoutName.hashCode()) {
                case -1866333181:
                    if (layoutName.equals("GRID_FLOAT")) {
                        Rect playerRange = interfaceC937820aVo.getPlayerRange();
                        ViewGroup viewGroup = this.LLLLIILL;
                        if (viewGroup == null) {
                            return;
                        }
                        if (viewGroup.getWidth() == playerRange.width() && viewGroup.getHeight() == playerRange.height()) {
                            LJJIJ(true, view, interfaceC937820aVo);
                            return;
                        } else {
                            LJJIJ(false, view, interfaceC937820aVo);
                            return;
                        }
                    }
                    break;
                case 66988604:
                    if (layoutName.equals("FLOAT")) {
                        LJJIJ(false, view, interfaceC937820aVo);
                        return;
                    }
                    break;
                case 676522866:
                    if (layoutName.equals("FLOAT_FIX")) {
                        LJJIJ(false, view, interfaceC937820aVo);
                        return;
                    }
                    break;
                case 1101967228:
                    if (layoutName.equals("GRID_FIX")) {
                        LJJIJ(false, view, interfaceC937820aVo);
                        return;
                    }
                    break;
            }
            Rect playerRange2 = interfaceC937820aVo.getPlayerRange();
            ViewGroup viewGroup2 = this.LLLLIILL;
            if (viewGroup2 == null) {
                return;
            }
            if (viewGroup2.getWidth() == playerRange2.width() && viewGroup2.getHeight() == playerRange2.height()) {
                LJJIJ(true, view, interfaceC937820aVo);
                return;
            } else {
                LJJIJ(false, view, interfaceC937820aVo);
                return;
            }
        }
        LJJIJ(true, view, interfaceC937820aVo);
    }

    public final void LJJIJIIJI(final View view, final Function1<? super View, Unit> function1) {
        Object obj;
        String str = "anchor";
        if (view.getWidth() > 0) {
            function1.invoke(view);
            int i = this.LLLLJI;
            if (i > 0) {
                HashMap map = new HashMap();
                map.put("function_name", "interactionLayer_post_work_old");
                if (!this.LL.LJIIIIZZ) {
                    str = "guest";
                }
                map.put("to_user_type", str);
                map.put("error_msg", String.valueOf(i));
                C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_multi_function_call_result");
                c474500IjALIZ.LJJIIZI(map);
                c474500IjALIZ.LIZ();
                this.LLLLJI = 0;
                return;
            }
            return;
        }
        if (this.LLLLIL && !this.LLLLJ) {
            int i2 = this.LLLLJI;
            HashMap map2 = new HashMap();
            map2.put("function_name", "interactionLayer_post_but_destroy_old");
            if (this.LL.LJIIIIZZ) {
                obj = "anchor";
            } else {
                obj = "guest";
            }
            map2.put("to_user_type", obj);
            map2.put("error_msg", String.valueOf(i2));
            C474500IjA c474500IjALIZ2 = C0IJT.LIZ("livesdk_multi_function_call_result");
            c474500IjALIZ2.LJJIIZI(map2);
            c474500IjALIZ2.LIZ();
            this.LLLLJ = true;
        }
        if (this.LLLLILI) {
            int width = view.getWidth();
            int height = view.getHeight();
            if (!this.LL.LJIIIIZZ) {
                str = "guest";
            }
            String strLLIIII = LLIIII(3468);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("reportWidthZeroAfterPost, width: ");
            sbLIZ.append(width);
            sbLIZ.append(", height: ");
            sbLIZ.append(height);
            sbLIZ.append(", userType: ");
            sbLIZ.append(str);
            C20441214yg.LJIIL(strLLIIII, C2188811AlT.LIZIZ(sbLIZ));
        }
        HandlerHook.viewPost(view, new Runnable() { // from class: X.0hhK
            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("LinkLayoutManager@cbf4.doAfterHasSize$1");
                try {
                    this.LL.LJJIJIIJI(view, function1);
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("LinkLayoutManager@cbf4.doAfterHasSize$1");
            }
        });
        this.LLLLJI++;
        this.LLLLILI = true;
    }

    @Override // X.InterfaceC964790bDJ
    public final void LJJIJIL(EnumC918810a19 enumC918810a19, LinkUser linkUser) {
        if (!LLF()) {
            LLIIIZ(enumC918810a19, linkUser);
        }
    }

    @Override // X.InterfaceC964790bDJ
    public final void LJJIJLIJ(final int i, final String str) {
        this.LL.LJFF.LJJL(i, str, new InterfaceC1303160k14() { // from class: X.1AWt
            @Override // X.InterfaceC1303160k14
            public final void LIZ(Layout layout) {
                if (layout != null) {
                    this.LIZ.LJJLIIJ().LJIILJJIL(layout, false);
                    String strLLIIII = this.LIZ.LLIIII(1563);
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(this.LIZ.LJLLL());
                    sbLIZ.append(":updateDataCenterLayout, version:");
                    sbLIZ.append(i);
                    sbLIZ.append(", layoutId:");
                    sbLIZ.append(str);
                    C1AZW.LJIIJ(12, strLLIIII, C2188811AlT.LIZIZ(sbLIZ), null, null);
                }
            }
        }, null);
    }

    @Override // X.InterfaceC937900aVw
    public final void LJJIL(Map map, Map map2) {
        if (!LivesdkLinkmicSeiEnabledBusinessIdSetting.INSTANCE.isEnable("live_show_sei")) {
            return;
        }
        synchronized (LJJLIIIIJ()) {
            try {
                synchronized (LJJLI()) {
                    try {
                        LJJLIIIIJ().put("live_show_sei", map);
                        LJJLI().put("show_info", map2);
                    } finally {
                        TryCatchGuardChecker.doCheck(th);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        LIZJ("postPermanentMixStreamData");
    }

    @Override // X.InterfaceC937900aVw
    public final void LJJJIL(long j, boolean z) {
        String strLLIIII = LLIIII(1364);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(LJLLL());
        sbLIZ.append(":updateSeiBattleId battleId:");
        sbLIZ.append(j);
        C1AZW.LJFF(strLLIIII, C2188811AlT.LIZIZ(sbLIZ), null, null);
        this.LLL = j;
        if (z) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(this.LLILLJJLI);
            sbLIZ2.append(" updateSeiBattleId");
            LIZJ(C2188811AlT.LIZIZ(sbLIZ2));
        }
    }

    @Override // X.InterfaceC964790bDJ
    public final void LJJJJZI(LinkUser linkUser, boolean z) {
        String strLLIIII = LLIIII(1270);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(LJLLL());
        sbLIZ.append(":updateRoomOwnerUserWithDiff owner =");
        sbLIZ.append(linkUser);
        sbLIZ.append(" old = ");
        sbLIZ.append(this.LLJJJ);
        C1AZW.LJIIJ(12, strLLIIII, C2188811AlT.LIZIZ(sbLIZ), null, null);
        if (linkUser == null) {
            return;
        }
        this.LLJJJ = linkUser;
        if (LJJLIIJ().LJIILLIIL(new C1AXI(EnumC918810a19.StateLinked, linkUser.userId, linkUser.linkMicId, null, null, new WeakReference(null), null, 976), null) && z) {
            C1AZW.LJIIJ(12, LLIIII(2292), "notifyUIChange(source = updateRoomOwnerUser)", null, null);
            LLIILII("updateRoomOwnerUser", null);
        }
    }

    @Override // X.InterfaceC964930bDX
    public final void LJJLIIIJLJLI(String str, final List<PosIdentity> list) {
        C918060Zzw c918060Zzw = C918060Zzw.LIZ;
        boolean z = this.LL.LJIIIIZZ;
        c918060Zzw.getClass();
        if (C918060Zzw.LIZ(z) && str != null) {
            this.LL.LJFF.LJJL(0, str, new InterfaceC1303160k14() { // from class: X.1AXm
                @Override // X.InterfaceC1303160k14
                public final void LIZ(Layout layout) {
                    if (layout != null) {
                        C1AXM c1axm = this.LIZ;
                        List<PosIdentity> list2 = list;
                        boolean z2 = true;
                        if (!c1axm.LL.LJIIIIZZ || c1axm.LJLI().getRealDrawLayoutId() != null) {
                            c1axm.LJJLIIJ().LJIILJJIL(layout, false);
                            c1axm.LLLFFI = true;
                        }
                        if (!c1axm.LLLFZ && !c1axm.LJZL(list2)) {
                            z2 = false;
                        }
                        c1axm.LLLFZ = z2;
                    }
                }
            }, null);
        }
    }

    @Override // X.InterfaceC937900aVw
    public final void LJLJLLL(String str, boolean z) {
        LJLLLL().LJI = z;
        LJLIL().setEnableRoundCorner(z);
        LJLI().setEnableRoundCorner(z);
        String str2 = this.LLILLJJLI;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setEnableCornerRadius, enable=");
        sbLIZ.append(z);
        sbLIZ.append(", source=");
        sbLIZ.append(str);
        C20441214yg.LIZIZ(str2, C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // X.InterfaceC937900aVw
    public final void LJLLI(String str, List<PosIdentity> list) {
        boolean z;
        String realDrawLayoutId = LJLI().getRealDrawLayoutId();
        if (!LJZL(list) && !this.LLLFZ) {
            z = false;
        } else {
            z = true;
        }
        String strLLIIII = LLIIII(1876);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(LJLLL());
        sbLIZ.append(":onLayoutStateChanged layoutId :");
        sbLIZ.append(str);
        sbLIZ.append(" uiPositions: ");
        sbLIZ.append(list);
        sbLIZ.append(" realDrawLayoutId: ");
        sbLIZ.append(realDrawLayoutId);
        sbLIZ.append(" updated: ");
        sbLIZ.append(z);
        C1AZW.LJIIJ(12, strLLIIII, C2188811AlT.LIZIZ(sbLIZ), null, null);
        if (((!this.LL.LJIIIIZZ && LinkMicGuestStateHandleFix.INSTANCE.isEnable()) || realDrawLayoutId != null) && !Intrinsics.LJFF(str, realDrawLayoutId)) {
            LJJJJIZL(str, true, false, true, false, new C916150Zwr());
            this.LLLFZ = false;
        } else {
            if (!z) {
                return;
            }
            LLIILII("onLayoutStateChanged", null);
            LL(true);
            this.LLLFZ = false;
        }
    }

    @Override // X.InterfaceC937900aVw
    public final void LJLZ(int i, boolean z) {
        String strLLIIII = LLIIII(1365);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(LJLLL());
        sbLIZ.append(":updateLinkerArchType archType:");
        sbLIZ.append(i);
        C1AZW.LJFF(strLLIIII, C2188811AlT.LIZIZ(sbLIZ), null, null);
        this.LLLFF = i;
        if (z) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(this.LLILLJJLI);
            sbLIZ2.append(" updateLinkerArchType");
            LIZJ(C2188811AlT.LIZIZ(sbLIZ2));
        }
    }

    @Override // X.InterfaceC937900aVw
    public final void LLD(final String str, final Map map) {
        String strLLIIII = LLIIII(2668);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setPositionMap ");
        sbLIZ.append(map);
        sbLIZ.append(' ');
        sbLIZ.append(str);
        C1AZW.LJIIJ(12, strLLIIII, C2188811AlT.LIZIZ(sbLIZ), null, null);
        final C2181141AXw c2181141AXwLJLJI = LJLJI();
        int i = this.LLJJIII.LIZ;
        if (map.equals(c2181141AXwLJLJI.LJ) && Intrinsics.LJFF(str, c2181141AXwLJLJI.LIZJ)) {
            return;
        }
        c2181141AXwLJLJI.LJ = map;
        c2181141AXwLJLJI.LIZJ = str;
        c2181141AXwLJLJI.LIZ.LJIJ(map);
        c2181141AXwLJLJI.LIZIZ = true;
        String str2 = c2181141AXwLJLJI.LIZJ;
        if (str2 != null) {
            C1303220k1A.LIZ.getValue().LJJL(i, str2, new InterfaceC1303160k14() { // from class: X.0a1z
                @Override // X.InterfaceC1303160k14
                public final void LIZ(Layout layout) {
                    c2181141AXwLJLJI.LIZLLL = layout;
                    C1143300frE c1143300frELJIIJJI = C1143300frE.LJIIJJI();
                    c2181141AXwLJLJI.getClass();
                    Pair[] pairArr = new Pair[2];
                    pairArr[0] = new Pair("action", "setPositionMap");
                    String str3 = str;
                    if (str3 == null) {
                        str3 = "";
                    }
                    pairArr[1] = new Pair("zoomToLayoutId", str3);
                    Map<String, ?> mapLJIIJ = C2097608Jq.LJIIJ(pairArr);
                    for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                        mapLJIIJ.put(String.valueOf(entry.getKey().intValue()), String.valueOf(entry.getValue().intValue()));
                    }
                    c1143300frELJIIJJI.LJII("Zoom/MappingHelper", mapLJIIJ);
                }
            }, null);
        } else {
            c2181141AXwLJLJI.LIZLLL = null;
        }
    }

    @Override // X.InterfaceC937900aVw
    public final void LLFZ(int i, String str) {
        C965220bE0 c965220bE0 = this.LL.LJIIJ;
        if (c965220bE0 != null && c965220bE0.LLILZIL.getSecond().intValue() <= i) {
            Pair<String, Integer> pair = new Pair<>(str, Integer.valueOf(i));
            c965220bE0.LLILZIL = pair;
            if (c965220bE0.LLILLL != null) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("update currentProcess's value:");
                sbLIZ.append(pair);
                C20441214yg.LIZIZ("layout_identify", C2188811AlT.LIZIZ(sbLIZ));
            }
        }
    }

    @Override // X.InterfaceC964790bDJ
    public final void LLIIIZ(EnumC918810a19 enumC918810a19, LinkUser linkUser) {
        String strLLIIII = LLIIII(1414);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(LJLLL());
        sbLIZ.append(":updateUserLinkState linkState = ");
        sbLIZ.append(enumC918810a19);
        sbLIZ.append(" linkUser = ");
        sbLIZ.append(linkUser);
        C1AZW.LJIIJ(12, strLLIIII, C2188811AlT.LIZIZ(sbLIZ), null, null);
        LJJLIIJ().LJIILLIIL(new C1AXI(enumC918810a19, linkUser.userId, linkUser.linkMicId, null, null, null, null, 1016), null);
        if (this.LL.LIZIZ != 2) {
            LLIILII("updateUserWindowLinkState", null);
        }
    }

    public final void LLIILII(String str, Function1 function1) {
        String targetLayoutData;
        if (this.LL.LJI) {
            C1304630k3R.LIZLLL(6, "did not call update because of currently is only calculate player range", this.LLILLJJLI);
            return;
        }
        if (this.LLLIZZ) {
            C1304630k3R.LIZLLL(6, "did not call update because of currently is intercept refresh", this.LLILLJJLI);
            return;
        }
        if (this.LLLLIILL == null) {
            return;
        }
        String str2 = this.LLILLJJLI;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("notifyUIChange ");
        sbLIZ.append(str);
        C20441214yg.LIZIZ(str2, C2188811AlT.LIZIZ(sbLIZ));
        LayoutSlardarMonitor layoutSlardarMonitor = this.LLLJ;
        if (layoutSlardarMonitor != null) {
            Layout layoutLIZJ = LJJLIIJ().LIZJ(false);
            if (layoutLIZJ == null || (targetLayoutData = layoutLIZJ.getTargetLayoutData(Integer.valueOf(LJJLL().LIZIZ()))) == null) {
                targetLayoutData = "";
            }
            layoutSlardarMonitor.LIZLLL = targetLayoutData;
        }
        C2180891AWx c2180891AWxLJLI = LJLI();
        c2180891AWxLJLI.getActionCallback();
        c2180891AWxLJLI.invoke(new C1AYQ() { // from class: X.1AYJ
        }, function1);
    }

    @Override // X.InterfaceC937900aVw
    public final void LLILL(C945320ahu c945320ahu, C1AY6 c1ay6) throws JSONException {
        Map<String, String> map;
        SeiAppData seiAppDataLJII = C969340bKe.LJII(c945320ahu);
        if (seiAppDataLJII != null) {
            boolean z = false;
            if (c1ay6.LIZJ(seiAppDataLJII)) {
                return;
            }
            c1ay6.LIZLLL(seiAppDataLJII);
            if (seiAppDataLJII.timestamp <= this.LLLIIL) {
                return;
            }
            if (seiAppDataLJII.LJIIIIZZ(this.LLLIILIL)) {
                this.LLLIIL = seiAppDataLJII.timestamp;
                this.LLLIILIL = seiAppDataLJII;
                return;
            }
            this.LL.LJFF.LJIL(seiAppDataLJII);
            this.LL.LJFF.LJIIZILJ(seiAppDataLJII);
            if (!Intrinsics.LJFF(C949650aot.LIZ, seiAppDataLJII.anchorLinkMicId)) {
                try {
                    C949650aot.LIZIZ = false;
                    Map<String, Map<String, String>> map2 = seiAppDataLJII.businessExtraInfo;
                    if (map2 != null && (map = map2.get("lp")) != null && map.get("b") != null) {
                        MultiGuestRemoveDividingLineSetting multiGuestRemoveDividingLineSetting = MultiGuestRemoveDividingLineSetting.INSTANCE;
                        multiGuestRemoveDividingLineSetting.getValue();
                        int value = multiGuestRemoveDividingLineSetting.getValue();
                        if (value == 1 || value == 3) {
                            z = true;
                        }
                        C949650aot.LIZIZ = z;
                    }
                    C949650aot.LIZ = seiAppDataLJII.anchorLinkMicId;
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    C20441214yg.LJ("LinkMicBackgroundNoiseReductionSettingHelper", e.toString());
                }
            }
            if (C500260Jjc.LJJJI(Boolean.valueOf(c1ay6.LIZ()))) {
                LJZI(seiAppDataLJII.businessExtraInfo);
            }
            c1ay6.LJ(seiAppDataLJII);
            if (c945320ahu != null) {
                this.LLLLII.LJ(c945320ahu, seiAppDataLJII, true);
                if (Unit.LIZ != null) {
                    return;
                }
            }
        }
        c1ay6.LIZIZ(c945320ahu);
    }

    @Override // X.InterfaceC937900aVw
    public final void LLILZIL(AbstractC946520ajq abstractC946520ajq, String str) {
        this.LLJJJJLIIL = abstractC946520ajq;
    }

    public final void LJJIIZ(boolean z, View view, InterfaceC937820aVo interfaceC937820aVo) {
        C0IEU c0ieu;
        FrameLayout.LayoutParams layoutParams;
        String str = "NORMAL";
        if (z) {
            String layoutName = interfaceC937820aVo.getLayoutName();
            if (layoutName != null) {
                str = layoutName;
            }
            c0ieu = new C0IEU(-1, -1, 0, 0, 0, true, EnumC918990a1R.valueOf(str), (String) null, (InterfaceC463550IFt) null, (String) null, false, 3968);
        } else {
            Rect playerRange = interfaceC937820aVo.getPlayerRange();
            ViewGroup viewGroup = this.LLLLIILL;
            if (viewGroup == null) {
                return;
            }
            int iWidth = playerRange.width();
            int iHeight = playerRange.height();
            int i = playerRange.top;
            int i2 = playerRange.left;
            int width = viewGroup.getWidth() - playerRange.right;
            String layoutName2 = interfaceC937820aVo.getLayoutName();
            if (layoutName2 != null) {
                str = layoutName2;
            }
            c0ieu = new C0IEU(iWidth, iHeight, i, i2, width, false, EnumC918990a1R.valueOf(str), (String) null, (InterfaceC463550IFt) null, (String) null, false, 3968);
        }
        if (c0ieu.LJFF) {
            ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
            if ((layoutParams2 instanceof FrameLayout.LayoutParams) && (layoutParams = (FrameLayout.LayoutParams) layoutParams2) != null) {
                layoutParams.width = -1;
                layoutParams.height = -1;
                layoutParams.gravity = 51;
                layoutParams.rightMargin = 0;
                layoutParams.bottomMargin = 0;
                C786410Ut5.W5(view, layoutParams);
                LJJIIZ(false, view, interfaceC937820aVo);
                return;
            }
            return;
        }
        C500260Jjc.LJJLIIIJILLIZJL(new C0IY1(this, c0ieu, view));
    }

    @Override // X.InterfaceC937900aVw
    public final void LJJIIZI(String str, Map<String, String> map, boolean z) {
        if (!LivesdkLinkmicSeiEnabledBusinessIdSetting.INSTANCE.isEnable(str)) {
            return;
        }
        synchronized (LJJLIIIIJ()) {
            try {
                LJJLIIIIJ().put(str, map);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        if (z) {
            LIZJ("postPermanentMixStreamData");
        }
    }

    public final void LJJIJ(boolean z, View view, InterfaceC937820aVo interfaceC937820aVo) {
        if (MultiGuestV3RoomLoadingOptSetting.INSTANCE.isEnable()) {
            Rect playerRange = interfaceC937820aVo.getPlayerRange();
            ViewGroup viewGroup = this.LLLLIILL;
            if (viewGroup != null) {
                int iWidth = playerRange.width();
                int iHeight = playerRange.height();
                int i = playerRange.top;
                int i2 = playerRange.left;
                int width = viewGroup.getWidth() - playerRange.right;
                String layoutName = interfaceC937820aVo.getLayoutName();
                if (layoutName == null) {
                    layoutName = "NORMAL";
                }
                C500260Jjc.LJJLIIIJILLIZJL(new C0IY0(view, this, playerRange, new C0IEU(iWidth, iHeight, i, i2, width, false, EnumC918990a1R.valueOf(layoutName), (String) null, (InterfaceC463550IFt) null, (String) null, false, 3968)));
                return;
            }
            return;
        }
        LJJIIZ(z, view, interfaceC937820aVo);
    }

    @Override // X.InterfaceC964790bDJ
    public final void LJJJ(View view, boolean z, String str) {
        Integer numValueOf;
        View view2;
        Rect containerActualRange = LJLI().getContainerActualRange();
        String str2 = this.LLILLJJLI;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("switchToSingleRenderView: enable=");
        sbLIZ.append(z);
        sbLIZ.append(", singleView:");
        if (view != null) {
            numValueOf = Integer.valueOf(view.hashCode());
        } else {
            numValueOf = null;
        }
        sbLIZ.append(numValueOf);
        sbLIZ.append(", rect=");
        sbLIZ.append(containerActualRange);
        sbLIZ.append(" source=");
        sbLIZ.append(str);
        C20441214yg.LIZIZ(str2, C2188811AlT.LIZIZ(sbLIZ));
        if (z) {
            Layout layoutLIZJ = LJJLIIJ().LIZJ(false);
            if (layoutLIZJ != null) {
                LJLJJL(layoutLIZJ);
            }
            C2180891AWx c2180891AWxLJLI = LJLI();
            if (view != null) {
                WeakReference<View> weakReference = c2180891AWxLJLI.LLJJIJI;
                if (weakReference != null) {
                    view2 = weakReference.get();
                } else {
                    view2 = null;
                }
                if (!Intrinsics.LJFF(view2, view)) {
                    c2180891AWxLJLI.LLJJIJI = new WeakReference<>(view);
                }
            } else {
                c2180891AWxLJLI.getClass();
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("switchToSingleRenderView_");
            sbLIZ2.append(z);
            LLIILII(C2188811AlT.LIZIZ(sbLIZ2), null);
            return;
        }
        LJLI().getClass();
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("switchToSingleRenderView_");
        sbLIZ3.append(z);
        LLIILII(C2188811AlT.LIZIZ(sbLIZ3), null);
    }

    public final C1AYF LJJJJL(String str, SeiAppData seiAppData, SeiAppData seiAppData2) {
        SeiRegion next;
        List<SeiRegion> list;
        SeiRegion next2;
        int i;
        int i2;
        C1AYF c1ayf = null;
        if (seiAppData2 == null) {
            return null;
        }
        List<SeiRegion> list2 = seiAppData2.grids;
        if (list2 != null) {
            Iterator<SeiRegion> it2 = list2.iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    if (Intrinsics.LJFF(next.uidStr, str)) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            SeiRegion seiRegion = next;
            if (seiRegion != null) {
                int i3 = 0;
                if (seiAppData != null && (list = seiAppData.grids) != null) {
                    Iterator<SeiRegion> it3 = list.iterator();
                    while (true) {
                        if (it3.hasNext()) {
                            next2 = it3.next();
                            if (Intrinsics.LJFF(next2.uidStr, str)) {
                                break;
                            }
                        } else {
                            next2 = null;
                            break;
                        }
                    }
                    SeiRegion seiRegion2 = next2;
                    if (seiRegion2 != null) {
                        boolean z = seiRegion2.muteVideoBool;
                        boolean z2 = seiRegion.muteVideoBool;
                        if (z == z2) {
                            boolean z3 = seiRegion2.muteAudioBool;
                            boolean z4 = seiRegion.muteAudioBool;
                            if (z3 == z4) {
                                int i4 = seiRegion2.onlineUserState;
                                int i5 = seiRegion.onlineUserState;
                                if (i4 == i5 || i5 != 2) {
                                    SeiDsl seiDsl = seiAppData2.dsl;
                                    if (seiDsl != null) {
                                        i2 = seiDsl.scene;
                                    } else {
                                        i2 = 0;
                                    }
                                    return new C1AYF(false, new C938510aWv(i2, i5, this.LL.LJFF.LJJIL(), z4, z2));
                                }
                            }
                        }
                        SeiDsl seiDsl2 = seiAppData2.dsl;
                        if (seiDsl2 != null) {
                            i = seiDsl2.scene;
                        } else {
                            i = 0;
                        }
                        c1ayf = new C1AYF(true, new C938510aWv(i, seiRegion.onlineUserState, this.LL.LJFF.LJJIL(), seiRegion.muteAudioBool, z2));
                    }
                }
                SeiDsl seiDsl3 = seiAppData2.dsl;
                if (seiDsl3 != null) {
                    i3 = seiDsl3.scene;
                }
                return new C1AYF(true, new C938510aWv(i3, seiRegion.onlineUserState, this.LL.LJFF.LJJIL(), seiRegion.muteAudioBool, seiRegion.muteVideoBool));
            }
        }
        return c1ayf;
    }

    @Override // X.InterfaceC937900aVw
    public final void LJLIIIL(C945320ahu c945320ahu, Class cls, C940360aZu c940360aZu) throws JSONException {
        String str;
        String str2;
        String strReplace = null;
        if (c945320ahu != null) {
            str = c945320ahu.LIZIZ;
        } else {
            str = null;
        }
        InterfaceC940430aa1 interfaceC940430aa1 = (InterfaceC940430aa1) C969340bKe.LJIIIIZZ(cls, str);
        if (interfaceC940430aa1 != null) {
            if (!C940360aZu.LIZ(interfaceC940430aa1)) {
                c940360aZu.LIZLLL(interfaceC940430aa1);
                if (interfaceC940430aa1.timestamp() > this.LLLIIL) {
                    String strReplace2 = new Regex("(,(.){2}talk\"(.+?),)|(,(.){2}timestamp(.){3}[0-9]*,)|(signResult(.+?)\\})|(,(.){1}canvas(.+)\\})").replace(this.LLLILZLLLI, ",");
                    if (c945320ahu != null && (str2 = c945320ahu.LIZIZ) != null) {
                        strReplace = new Regex("(,(.){2}talk\"(.+?),)|(,(.){2}timestamp(.){3}[0-9]*,)|(signResult(.+?)\\})|(,(.){1}canvas(.+)\\})").replace(str2, ",");
                    }
                    if (!Intrinsics.LJFF(strReplace2, strReplace) && !Intrinsics.LJFF(this.LLLIILIL, interfaceC940430aa1)) {
                        this.LL.LJFF.LJIL(interfaceC940430aa1);
                        this.LL.LJFF.LJIIZILJ(interfaceC940430aa1);
                        if (C500260Jjc.LJJJI(Boolean.TRUE)) {
                            LJZI(interfaceC940430aa1.LJFF());
                        }
                        c940360aZu.LIZJ(interfaceC940430aa1);
                        if (c945320ahu != null) {
                            this.LLLLII.LJ(c945320ahu, interfaceC940430aa1, true);
                            return;
                        }
                        return;
                    }
                    this.LLLIIL = interfaceC940430aa1.timestamp();
                    return;
                }
                return;
            }
            return;
        }
        c940360aZu.LIZIZ(c945320ahu);
    }

    @Override // X.InterfaceC937900aVw
    public final void LJLLLLLL(float f, int i, boolean z) {
        int iLIZIZ;
        String strLLIIII = LLIIII(1371);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(LJLLL());
        sbLIZ.append(":updateContainerOffsetY offsetY:");
        sbLIZ.append(f);
        sbLIZ.append(", animate:");
        sbLIZ.append(z);
        sbLIZ.append(", duration:");
        sbLIZ.append(i);
        C20441214yg.LIZIZ(strLLIIII, C2188811AlT.LIZIZ(sbLIZ));
        int iLIZIZ2 = (int) C497740JfY.LIZIZ(f);
        if (this.LLJJI.getLayoutParams() == null) {
            LJLI().LJIJI(iLIZIZ2);
            ((C1AFE) this.LLJJ.getValue()).LJII(iLIZIZ2);
            this.LLJLLIL = f;
        }
        if (!(this.LLJJI.getLayoutParams() instanceof C19ME)) {
            return;
        }
        final C19ME c19me = (C19ME) this.LLJJI.getLayoutParams();
        int iAbs = Math.abs(((ViewGroup.MarginLayoutParams) c19me).topMargin);
        LJLI().LJIJI(iLIZIZ2);
        LLIILII("updateContainerOffsetY", null);
        ((C1AFE) this.LLJJ.getValue()).LJII(iLIZIZ2);
        if (f == 0.0f) {
            iLIZIZ = iAbs - ((int) C497740JfY.LIZIZ(this.LLJLLIL));
        } else {
            iLIZIZ = iLIZIZ2 + iAbs;
        }
        if (z) {
            ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(iAbs, iLIZIZ);
            valueAnimatorOfInt.setDuration(i).start();
            valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: X.0bM9
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    ((ViewGroup.MarginLayoutParams) c19me).topMargin = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                    this.LLJJI.requestLayout();
                    C1AZW c1azw = C1AZW.LIZ;
                    String strLLIIII2 = this.LLIIII(1394);
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append(this.LJLLL());
                    sbLIZ2.append(":updateContainerOffsetY:");
                    sbLIZ2.append(((Integer) valueAnimator.getAnimatedValue()).intValue());
                    String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
                    c1azw.getClass();
                    C1AZW.LIZ(strLLIIII2, strLIZIZ, null, null);
                }
            });
        } else {
            ((ViewGroup.MarginLayoutParams) c19me).topMargin = iLIZIZ;
            this.LLJJI.requestLayout();
        }
        C1AZW c1azw = C1AZW.LIZ;
        String strLLIIII2 = LLIIII(1396);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(LJLLL());
        sbLIZ2.append(":updateContainerOffsetY invalidateSei offsetY:");
        sbLIZ2.append(f);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
        c1azw.getClass();
        C1AZW.LIZ(strLLIIII2, strLIZIZ, null, null);
        this.LLJLLIL = f;
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append(this.LLILLJJLI);
        sbLIZ3.append(" updateContainerOffsetY");
        LIZJ(C2188811AlT.LIZIZ(sbLIZ3));
    }

    @Override // X.InterfaceC964790bDJ
    public final void LJLLILLLL(LinkUser linkUser, SurfaceView surfaceView, InterfaceC1268870j7l interfaceC1268870j7l, boolean z) {
        String strLLIIII = LLIIII(1270);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(LJLLL());
        sbLIZ.append(":updateRoomOwnerUser owner =");
        sbLIZ.append(linkUser);
        C1AZW.LJIIJ(12, strLLIIII, C2188811AlT.LIZIZ(sbLIZ), null, null);
        if (linkUser == null) {
            return;
        }
        this.LLJJJ = linkUser;
        if (LJJLIIJ().LJIILLIIL(new C1AXI(EnumC918810a19.StateLinked, linkUser.userId, linkUser.linkMicId, surfaceView, null, new WeakReference(interfaceC1268870j7l), null, 976), null) && z) {
            LLIILII("updateRoomOwnerUser", null);
        }
    }

    @Override // X.InterfaceC937900aVw
    public final void LJJJJIZL(String str, final boolean z, final boolean z2, final boolean z3, final boolean z4, final Function0<Unit> function0) {
        String strLLIIII = LLIIII(1074);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(LJLLL());
        sbLIZ.append(":switchLayoutById layoutId :");
        sbLIZ.append(str);
        sbLIZ.append(" forceMeasure:");
        sbLIZ.append(z3);
        C1AZW.LJIIJ(12, strLLIIII, C2188811AlT.LIZIZ(sbLIZ), null, null);
        if (str != null) {
            this.LL.LJFF.LJJL(this.LLJJIII.LIZ, str, new InterfaceC1303160k14() { // from class: X.1AXj
                @Override // X.InterfaceC1303160k14
                public final void LIZ(Layout layout) throws JSONException {
                    if (layout != null) {
                        String strLLIIII2 = this.LIZ.LLIIII(1083);
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append(this.LIZ.LJLLL());
                        sbLIZ2.append(":switchLayoutById layoutId = ");
                        sbLIZ2.append(layout.layoutId);
                        C1AZW.LJIIJ(12, strLLIIII2, C2188811AlT.LIZIZ(sbLIZ2), null, null);
                        C1AXM.LLIZLLLIL(this.LIZ, layout, "switchLayoutById", z3, z, z2, z4, false, null, 192);
                        function0.invoke();
                    }
                }
            }, null);
        }
    }

    @Override // X.InterfaceC937900aVw
    public final void LJJJJLI(ViewGroup viewGroup, FrameLayout frameLayout, Pair<Integer, Integer> pair, String str, Rect rect, float f) {
        boolean z;
        boolean z2;
        String str2 = this.LLILLJJLI;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setParent viewParent=");
        sbLIZ.append(viewGroup);
        sbLIZ.append(" videoRegion=");
        sbLIZ.append(frameLayout);
        sbLIZ.append(" playerSize=");
        sbLIZ.append(pair);
        sbLIZ.append(", source:");
        sbLIZ.append(str);
        C20441214yg.LJIIIZ(str2, C2188811AlT.LIZIZ(sbLIZ));
        C786410Ut5.LJLZ(0, viewGroup);
        if (Intrinsics.LJFF(viewGroup, this.LLLLIILL) && (frameLayout == null || Intrinsics.LJFF(frameLayout, this.LLJJI))) {
            z = true;
        } else {
            z = false;
        }
        if (pair != null && ((pair.getFirst().intValue() > 0 || pair.getSecond().intValue() > 0) && Intrinsics.LJFF(pair, this.LLJJL))) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z && z2) {
            String strLLIIII = LLIIII(882);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(LJLLL());
            sbLIZ2.append(":setParent return as viewParent and playerSize the same as old, source=");
            sbLIZ2.append(str);
            C1AZW.LJFF(strLLIIII, C2188811AlT.LIZIZ(sbLIZ2), null, null);
            return;
        }
        if (frameLayout != null) {
            this.LLJJI = frameLayout;
        }
        if (rect != null && rect.width() > 0 && rect.height() > 0 && C0IWY.LIZ && LLF()) {
            C1AZW c1azw = C1AZW.LIZ;
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("setParent, setDefaultParentRect, source=");
            sbLIZ3.append(str);
            sbLIZ3.append(", defaultParentRect=");
            sbLIZ3.append(rect);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ3);
            c1azw.getClass();
            C1AZW.LIZ("LayoutFirstFrameOptLog", strLIZIZ, null, null);
            Rect rectLJJIFFI = LJJIFFI(rect, f);
            LLJI(viewGroup, pair, rectLJJIFFI, rectLJJIFFI.width(), rectLJJIFFI.height(), false);
            LJJIJIIJI(viewGroup, new C2180821AWq(str, rect, this, f, viewGroup, pair));
            return;
        }
        LJJIJIIJI(viewGroup, new C2180811AWp(this, f, pair));
    }

    @Override // X.InterfaceC937900aVw
    public final void LJLILLLLZI(ViewGroup viewGroup, boolean z, boolean z2, String str, Rect rect, float f) {
        InterfaceC951900asW interfaceC951900asW;
        InterfaceC951900asW interfaceC951900asW2;
        DataChannel dataChannel = this.LL.LJFF.getDataChannel();
        if (dataChannel != null && (interfaceC951900asW2 = (InterfaceC951900asW) dataChannel.gg0(C957010b0l.class)) != null) {
            interfaceC951900asW2.LJIJJLI();
        }
        String str2 = this.LLILLJJLI;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setParentWithOutVideoSize viewParent=");
        sbLIZ.append(viewGroup);
        sbLIZ.append(" videoRegion=");
        sbLIZ.append((Object) null);
        sbLIZ.append(" isResumeBroadcastWithoutGuest=");
        sbLIZ.append(z);
        sbLIZ.append(" defaultParentRect=");
        sbLIZ.append(rect);
        C1AZW.LJIIJ(12, str2, C2188811AlT.LIZIZ(sbLIZ), null, null);
        C786410Ut5.LJLZ(0, viewGroup);
        if (Intrinsics.LJFF(viewGroup, this.LLLLIILL)) {
            String strLLIIII = LLIIII(846);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(LJLLL());
            sbLIZ2.append(":setParent return as viewParent the same as old");
            C1AZW.LJFF(strLLIIII, C2188811AlT.LIZIZ(sbLIZ2), null, null);
            return;
        }
        if (rect != null && rect.width() > 0 && rect.height() > 0 && C0IWY.LIZ && LLF()) {
            C1AZW c1azw = C1AZW.LIZ;
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("setParentWithOutVideoSize, setDefaultParentRect, source=");
            sbLIZ3.append(str);
            sbLIZ3.append(", defaultParentRect=");
            sbLIZ3.append(rect);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ3);
            c1azw.getClass();
            C1AZW.LIZ("LayoutFirstFrameOptLog", strLIZIZ, null, null);
            Rect rectLJJIFFI = LJJIFFI(rect, f);
            LLJIJIL(z2, viewGroup, z, rectLJJIFFI, rectLJJIFFI.width(), rectLJJIFFI.height(), false);
            LJJIJIIJI(viewGroup, new C2180831AWr(str, rect, this, f, z2, viewGroup, z));
        } else {
            LJJIJIIJI(viewGroup, new C2180841AWs(this, f, z2, z));
        }
        DataChannel dataChannel2 = this.LL.LJFF.getDataChannel();
        if (dataChannel2 != null && (interfaceC951900asW = (InterfaceC951900asW) dataChannel2.gg0(C957010b0l.class)) != null) {
            interfaceC951900asW.LJFF();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00ec  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LLJI(android.view.View r18, kotlin.Pair<java.lang.Integer, java.lang.Integer> r19, android.graphics.Rect r20, int r21, int r22, boolean r23) {
        /*
            Method dump skipped, instruction units count: 485
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1AXM.LLJI(android.view.View, kotlin.Pair, android.graphics.Rect, int, int, boolean):void");
    }

    @Override // X.InterfaceC955150axl
    public final void LJIILIIL(EnumC965730bEp enumC965730bEp, C955340ay4 c955340ay4, String str, String str2, boolean z, JSONObject jSONObject, JSONObject jSONObject2) {
        String strLLIIII = LLIIII(2074);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("startLayoutAnimation not implemented, layoutKey:");
        sbLIZ.append(c955340ay4.LIZ.LIZIZ);
        C20441214yg.LJIIL(strLLIIII, C2188811AlT.LIZIZ(sbLIZ));
    }

    public final void LLJIJIL(boolean z, View view, boolean z2, Rect rect, int i, int i2, boolean z3) {
        InterfaceC940430aa1 interfaceC940430aa1;
        this.LLJJI.setClipChildren(z);
        LJLI().setClipChildren(z);
        Rect rect2 = this.LLJJJJ;
        rect2.left = rect.left;
        rect2.top = rect.top;
        rect2.bottom = rect.bottom;
        rect2.right = rect.right;
        this.LLJJJJJIL = new Pair<>(Integer.valueOf(i), Integer.valueOf(i2 + this.LLLF));
        ViewGroup viewGroup = this.LLLLIILL;
        this.LLLLIILL = (ViewGroup) view;
        LJLI().setLayoutViewContainer(this.LLLLIILL);
        if (!Intrinsics.LJFF(viewGroup, view) || z3) {
            String strLLIIII = LLIIII(856);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(LJLLL());
            sbLIZ.append(":setParent");
            C1AZW.LJIIJ(12, strLLIIII, C2188811AlT.LIZIZ(sbLIZ), null, null);
            Layout layoutLIZJ = LJJLIIJ().LIZJ(false);
            if (layoutLIZJ == null) {
                C945320ahu c945320ahu = this.LLLILZ;
                if (c945320ahu != null && (interfaceC940430aa1 = this.LLLILZJ) != null) {
                    this.LLLLII.LJ(c945320ahu, interfaceC940430aa1, false);
                    return;
                }
                return;
            }
            if (!z2) {
                LLIZLLLIL(this, layoutLIZJ, "setParentWithOutVideoSize", true, true, false, false, false, null, 240);
            }
            LL(true);
        }
    }

    @Override // X.InterfaceC955150axl
    public final void LIZIZ(final String str, final List<LinkUser> list, final String str2, final String str3, final boolean z, final JSONObject jSONObject, final JSONObject jSONObject2, final Function0<Unit> function0) {
        String strLLIIII = LLIIII(2096);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("startLayoutAnimation enter: layoutId:");
        sbLIZ.append(str);
        sbLIZ.append(", animationId:");
        sbLIZ.append(str2);
        sbLIZ.append(", animationPath:");
        sbLIZ.append(str3);
        sbLIZ.append(", extra:");
        sbLIZ.append(jSONObject);
        C1AZW.LJFF(strLLIIII, C2188811AlT.LIZIZ(sbLIZ), null, null);
        if (str == null) {
            return;
        }
        String strLLIIII2 = LLIIII(2115);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(LJLLL());
        sbLIZ2.append(":startLayoutAnimation, layoutId = ");
        sbLIZ2.append(str);
        C1AZW.LJIIJ(12, strLLIIII2, C2188811AlT.LIZIZ(sbLIZ2), null, null);
        List<C1276580jKC> listLJIILL = this.LL.LJFF.LJIILL();
        Pair<Integer, Integer> pairLJJJJJ = this.LL.LJFF.LJJJJJ();
        LJLIL().mixStream(pairLJJJJJ.getFirst().intValue(), pairLJJJJJ.getSecond().intValue(), listLJIILL);
        this.LL.LJFF.LJJL(this.LLJJIII.LIZ, str, new InterfaceC1303160k14() { // from class: X.1AXR
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v6, types: [T, kotlin.Pair] */
            /* JADX WARN: Type inference failed for: r12v0, types: [X.1AXU] */
            /* JADX WARN: Type inference failed for: r6v1, types: [T, java.util.ArrayList] */
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
            @Override // X.InterfaceC1303160k14
            public final void LIZ(final Layout layout) throws JSONException {
                Layout layoutLIZJ;
                if (layout == null) {
                    String strLLIIII3 = this.LIZ.LLIIII(2125);
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append(this.LIZ.LJLLL());
                    sbLIZ3.append(":startLayoutAnimation, dsl not found, layoutId=");
                    sbLIZ3.append(str);
                    C1AZW.LJIIJ(12, strLLIIII3, C2188811AlT.LIZIZ(sbLIZ3), null, null);
                    return;
                }
                final List<C1276580jKC> listLJIILL2 = this.LIZ.LL.LJFF.LJIILL();
                final C259800zU c259800zU = new C259800zU();
                c259800zU.element = this.LIZ.LL.LJFF.LJJJJJ();
                this.LIZ.LJLIL().mixStream(((Number) ((Pair) c259800zU.element).getFirst()).intValue(), ((Number) ((Pair) c259800zU.element).getSecond()).intValue(), listLJIILL2);
                final C259800zU c259800zU2 = new C259800zU();
                final boolean zLJJJI = this.LIZ.LL.LJFF.LJJJI();
                if (zLJJJI && z && (layoutLIZJ = this.LIZ.LJJLIIJ().LIZJ(true)) != null) {
                    List<C1276580jKC> listLJIILL3 = this.LIZ.LL.LJFF.LJIILL();
                    this.LIZ.LJLIL().mixStream(1080, (int) (1080 / layoutLIZJ.viewForCanvas.ratio), listLJIILL3);
                    ?? arrayList = new ArrayList(C15438062q.LJIJJ(listLJIILL3, 10));
                    for (C1276580jKC c1276580jKC : listLJIILL3) {
                        arrayList.add(new C1276780jKW(c1276580jKC.LIZIZ, (float) c1276580jKC.LJ, (float) c1276580jKC.LJFF, (float) c1276580jKC.LJI, (float) c1276580jKC.LJII, c1276580jKC.LJIILIIL, c1276580jKC.LIZLLL));
                    }
                    c259800zU2.element = arrayList;
                }
                C1AXM.LLIZLLLIL(this.LIZ, layout, "startLayoutAnimation", false, false, false, false, true, null, 156);
                final C1AXM c1axm = this.LIZ;
                C1AXQ c1axq = c1axm.LL.LJFF;
                List<LinkUser> list2 = list;
                final String str4 = str2;
                final String str5 = str3;
                final JSONObject jSONObject3 = jSONObject;
                final JSONObject jSONObject4 = jSONObject2;
                final Function0<Unit> function02 = function0;
                c1axq.LJJZZIII(list2, new InterfaceC967450bHb() { // from class: X.1AXU
                    @Override // X.InterfaceC967500bHg
                    public final void LJIIL() {
                    }

                    @Override // X.InterfaceC967500bHg
                    public final void LJIILJJIL(int i, C967130bH5 c967130bH5) {
                    }

                    @Override // X.InterfaceC967500bHg
                    public final void LJIILLIIL(List<LinkUser> list3, List<LinkUser> list4) {
                    }

                    @Override // X.InterfaceC967450bHb
                    public final void LJJIIJ(List<LinkUser> list3, List<LinkUser> list4) {
                    }

                    @Override // X.InterfaceC967450bHb
                    public final void LJJJJZ(List<LinkUser> list3, List<LinkUser> list4) {
                    }

                    @Override // X.InterfaceC967450bHb
                    public final void LJJJJZI(List<LinkUser> list3) {
                    }

                    @Override // X.InterfaceC967450bHb
                    public final void LJJJLL(List<LinkUser> list3) {
                    }

                    @Override // X.InterfaceC967450bHb
                    public final void LJJJLZIJ(LinkUser linkUser) {
                    }

                    /* JADX WARN: Type inference failed for: r1v5, types: [T, kotlin.Pair] */
                    @Override // X.InterfaceC967450bHb
                    public final void LJJL() {
                        C1AZW c1azw = C1AZW.LIZ;
                        String strLLIIII4 = c1axm.LLIIII(2117);
                        ArrayList arrayList2 = null;
                        c1azw.getClass();
                        C1AZW.LIZ(strLLIIII4, "startLayoutAnimation, onLocalLinkedListDidUpdate", null, null);
                        c259800zU.element = c1axm.LL.LJFF.LJJJJJ();
                        List<C1276580jKC> listLJIILL4 = c1axm.LL.LJFF.LJIILL();
                        String strMixStream = c1axm.LJLIL().mixStream(c259800zU.element.getFirst().intValue(), c259800zU.element.getSecond().intValue(), listLJIILL4);
                        if (zLJJJI) {
                            List<C1276580jKC> listLJIILL5 = c1axm.LL.LJFF.LJIILL();
                            c1axm.LJLIL().mixStream(1080, (int) (1080 / layout.viewForCanvas.ratio), listLJIILL5);
                            arrayList2 = new ArrayList(C15438062q.LJIJJ(listLJIILL5, 10));
                            for (C1276580jKC c1276580jKC2 : listLJIILL5) {
                                arrayList2.add(new C1276780jKW(c1276580jKC2.LIZIZ, (float) c1276580jKC2.LJ, (float) c1276580jKC2.LJFF, (float) c1276580jKC2.LJI, (float) c1276580jKC2.LJII, c1276580jKC2.LJIILIIL, c1276580jKC2.LIZLLL));
                            }
                        }
                        c1axm.LL.LJFF.LJJLI(str4, str5, listLJIILL2, c259800zU2.element, listLJIILL4, arrayList2, strMixStream, jSONObject3, jSONObject4);
                        Function0<Unit> function03 = function02;
                        if (function03 != null) {
                            function03.invoke();
                        }
                    }
                });
            }
        }, null);
    }

    public static void LLIZLLLIL(final C1AXM c1axm, Layout layout, String str, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, C2181161AXy c2181161AXy, int i) throws JSONException {
        InterfaceC951900asW interfaceC951900asW;
        String str2;
        final boolean z6;
        Context context;
        Resources resources;
        Configuration configuration;
        C2181161AXy c2181161AXy2 = c2181161AXy;
        boolean z7 = z5;
        boolean z8 = z4;
        boolean z9 = z3;
        boolean z10 = z2;
        boolean z11 = z;
        if ((i & 4) != 0) {
            z11 = false;
        }
        if ((i & 8) != 0) {
            z10 = false;
        }
        if ((i & 16) != 0) {
            z9 = false;
        }
        if ((i & 32) != 0) {
            z8 = false;
        }
        if ((i & 64) != 0) {
            z7 = false;
        }
        if ((i & 128) != 0) {
            c2181161AXy2 = null;
        }
        c1axm.getClass();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[switchLayoutInternal] layout=");
        sbLIZ.append(layout.layoutId);
        sbLIZ.append(", source=");
        sbLIZ.append(str);
        sbLIZ.append(",forceMeasure=");
        sbLIZ.append(z11);
        sbLIZ.append(", forceStartRtc=");
        sbLIZ.append(z10);
        sbLIZ.append(", isResumeBroadcastWithoutGuest=");
        sbLIZ.append(z9);
        sbLIZ.append(", updateVideoInfo=");
        sbLIZ.append(z8);
        sbLIZ.append(", switchWithAnimation=");
        sbLIZ.append(z7);
        C1304630k3R.LIZLLL(6, C2188811AlT.LIZIZ(sbLIZ), c1axm.LLILLJJLI);
        if (c1axm.LLLIZZ) {
            C1304630k3R.LIZLLL(6, "call switchLayoutInternal failed because of intercept refresh..", c1axm.LLILLJJLI);
            return;
        }
        if (Intrinsics.LJFF(c1axm.LJJLIIJ().LIZJ(false), layout) && !z11 && !c1axm.LJLJI().LIZIZ && !c1axm.LLLFFI) {
            String strLLIIII = c1axm.LLIIII(1145);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(c1axm.LJLLL());
            sbLIZ2.append(":switchLayoutInternal return is mCurrentLayout the same as old");
            C1AZW.LJIIJ(12, strLLIIII, C2188811AlT.LIZIZ(sbLIZ2), null, null);
        } else if (!LinkMicPlayingAdNotRefreshLayoutSetting.getValue() || !c1axm.LLLJL) {
            c1axm.LLFFF();
            Layout layoutLIZJ = c1axm.LJJLIIJ().LIZJ(false);
            c1axm.LJJLIIJ().LJIILJJIL(layout, false);
            DslLayout dslLayout = c1axm.LLJJIJI;
            if (dslLayout == null || dslLayout.scene != layout.scene || dslLayout.version != layout.version) {
                c1axm.LL.LJFF.LJJJ(layout.scene, layout.version, new InterfaceC1303110k0z() { // from class: X.1AYD
                    @Override // X.InterfaceC1303110k0z
                    public final void LIZ(DslLayout dslLayout2) {
                        this.LIZ.LJJIIJZLJL(dslLayout2);
                    }
                }, "LinkLayoutManager#switchLayoutInternal()");
            }
            String strLLIIII2 = c1axm.LLIIII(1997);
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("[switchLayoutInternal] updateLayout=");
            sbLIZ3.append(layout.layoutId);
            C1AZW.LJIIJ(12, strLLIIII2, C2188811AlT.LIZIZ(sbLIZ3), null, null);
            if (c1axm.LLLLIILL == null) {
                String strLLIIII3 = c1axm.LLIIII(1175);
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append(c1axm.LJLLL());
                sbLIZ4.append(":viewParent is null, do nothing");
                C1AZW.LJFF(strLLIIII3, C2188811AlT.LIZIZ(sbLIZ4), null, null);
                return;
            }
            Layout layoutLIZ = c1axm.LJLJJLL().LIZ(true);
            if (layoutLIZ == null) {
                layoutLIZ = layout;
            }
            final LayoutSlardarMonitor layoutSlardarMonitor = c1axm.LLLJ;
            if (layoutSlardarMonitor != null) {
                final String str3 = layoutLIZ.layoutId;
                final String targetLayoutData = layoutLIZ.getTargetLayoutData(Integer.valueOf(c1axm.LL.LJFF.LIZIZ()));
                ViewGroup viewGroup = c1axm.LLLLIILL;
                if (viewGroup != null && (context = viewGroup.getContext()) != null && (resources = context.getResources()) != null && (configuration = resources.getConfiguration()) != null && configuration.orientation == 2) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                final String strLJLLL = c1axm.LJLLL();
                LayoutSlardarMonitor.LIZLLL(new Runnable() { // from class: X.1AXf
                    public final void LIZ() throws JSONException {
                        LayoutSlardarMonitor layoutSlardarMonitor2 = layoutSlardarMonitor;
                        long j = layoutSlardarMonitor2.LIZIZ + 1;
                        layoutSlardarMonitor2.LIZIZ = j;
                        C1303200k18.LIZJ = j;
                        if (LivesdkLinkmicLayoutSlardarCombineSetting.INSTANCE.isLayoutSwitchReportEnable()) {
                            LayoutSlardarMonitor layoutSlardarMonitor3 = layoutSlardarMonitor;
                            String str4 = layoutSlardarMonitor3.LIZJ;
                            layoutSlardarMonitor3.LIZJ = str3;
                            layoutSlardarMonitor3.LIZLLL = targetLayoutData;
                            JSONObject jSONObjectLIZ = layoutSlardarMonitor3.LIZ("linkmic_layout_switch");
                            boolean z12 = z6;
                            String str5 = strLJLLL;
                            jSONObjectLIZ.put("from_layout_id", str4);
                            jSONObjectLIZ.put("is_horizontal", z12);
                            jSONObjectLIZ.put("hash", str5);
                            C1CC2.LJIIIIZZ("ttlive_link_interact_layout_event_monitor", 0, jSONObjectLIZ);
                        }
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean zLIZ;
                        C1C7U.LIZ("LayoutSlardarMonitor@96d1.onLayoutSwitch$1");
                        try {
                            LIZ();
                        } finally {
                            if (!zLIZ) {
                            }
                        }
                        C1C7U.LIZIZ("LayoutSlardarMonitor@96d1.onLayoutSwitch$1");
                    }
                });
            }
            C1276840jKc c1276840jKc = C1276840jKc.LIZ;
            String str4 = layoutLIZ.layoutId;
            c1276840jKc.getClass();
            C1276840jKc.LJIIL.put("layout_id", str4);
            final LayoutSlardarMonitor layoutSlardarMonitor2 = c1axm.LLLJ;
            if (layoutSlardarMonitor2 != null) {
                final int size = layout.layoutData.size();
                final String strLJLLL2 = c1axm.LJLLL();
                LayoutSlardarMonitor.LIZLLL(new Runnable() { // from class: X.1AXn
                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean zLIZ;
                        C1C7U.LIZ("LayoutSlardarMonitor@96d1.onLayoutLoad$1");
                        try {
                            if (LivesdkLinkmicLayoutSlardarCombineSetting.INSTANCE.isLayoutLoadReportEnable()) {
                                JSONObject jSONObjectLIZ = layoutSlardarMonitor2.LIZ("linkmic_layout_load");
                                int i2 = size;
                                String str5 = strLJLLL2;
                                jSONObjectLIZ.put("layout_data_size", i2);
                                jSONObjectLIZ.put("hash", str5);
                                C1CC2.LJIIIIZZ("ttlive_link_interact_layout_event_monitor", 0, jSONObjectLIZ);
                            }
                        } finally {
                            if (!zLIZ) {
                            }
                        }
                        C1C7U.LIZIZ("LayoutSlardarMonitor@96d1.onLayoutLoad$1");
                    }
                });
            }
            c1axm.LLIIJI(layoutLIZ);
            String strLLIIII4 = c1axm.LLIIII(1222);
            StringBuilder sbLIZ5 = C2188811AlT.LIZ();
            sbLIZ5.append(c1axm.LJLLL());
            sbLIZ5.append(":switchLayoutInternal mCurrentLayout = ");
            sbLIZ5.append(c1axm.LJJLIIJ().LIZJ(false));
            C1AZW.LJIIJ(12, strLLIIII4, C2188811AlT.LIZIZ(sbLIZ5), null, null);
            C1AZW c1azw = C1AZW.LIZ;
            String str5 = layoutLIZ.layoutId;
            int i2 = layoutLIZ.version;
            c1azw.getClass();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("layout_id", str5);
            jSONObject.put("scene_version", i2);
            C1AZW.LIZLLL = C786410Ut5.J3(jSONObject);
            boolean z12 = !z7;
            if (((!Intrinsics.LJFF(layoutLIZJ, layoutLIZ) || c1axm.LJLJI().LIZIZ || c1axm.LLLFFI) && !c1axm.LL.LJI) || z10) {
                if (c1axm.LL.LJIIIIZZ) {
                    boolean zLJI = MethodIDManager.LJI(137197);
                    C2177031AIb c2177031AIb = c1axm.LL;
                    if (!c2177031AIb.LJIIIIZZ) {
                        if (zLJI) {
                            MethodIDManager.LJ();
                        }
                    } else if (c2177031AIb.LIZIZ == 2) {
                        if (zLJI) {
                            MethodIDManager.LJ();
                        }
                    } else if (!LinkMicStateSetting.INSTANCE.enableRTCSend()) {
                        if (zLJI) {
                            MethodIDManager.LJ();
                        }
                    } else {
                        Layout layoutLIZJ2 = c1axm.LJJLIIJ().LIZJ(false);
                        if (layoutLIZJ2 != null) {
                            str2 = layoutLIZJ2.layoutId;
                        } else {
                            str2 = null;
                        }
                        if (str2 == null) {
                            String strLLIIII5 = c1axm.LLIIII(1016);
                            StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                            sbLIZ6.append(c1axm.LJLLL());
                            sbLIZ6.append(":send rtc room msg layoutId return as is null");
                            C1AZW.LJIIJ(12, strLLIIII5, C2188811AlT.LIZIZ(sbLIZ6), null, null);
                            if (zLJI) {
                                MethodIDManager.LJ();
                            }
                        } else {
                            String strLLIIII6 = c1axm.LLIIII(1016);
                            StringBuilder sbLIZ7 = C2188811AlT.LIZ();
                            sbLIZ7.append(c1axm.LJLLL());
                            sbLIZ7.append(":send rtc room msg layoutId = ");
                            sbLIZ7.append(str2);
                            C1AZW.LJIIJ(12, strLLIIII6, C2188811AlT.LIZIZ(sbLIZ7), null, null);
                            DslLayout dslLayout2 = c1axm.LLJJIJI;
                            if (dslLayout2 == null) {
                                if (zLJI) {
                                    MethodIDManager.LJ();
                                }
                            } else {
                                LinkLayerRTCMessage linkLayerRTCMessage = new LinkLayerRTCMessage("linkMicSDKLayoutChange", new LinkLayerRTCMessageParam(str2, dslLayout2.scene, dslLayout2.version, new ArrayList(), null, "", true), Long.valueOf(C158B.LIZ()), "", -1L, "", "");
                                linkLayerRTCMessage.generateId();
                                c1axm.LL.LJFF.LJJLIIIJJI(linkLayerRTCMessage);
                                if (zLJI) {
                                    MethodIDManager.LJ();
                                }
                            }
                        }
                    }
                    c1axm.LL.LJFF.LJL(new C969030bK9(c1axm, z12));
                    c1axm.LJLLLL().LJI("switch-layout", false);
                }
                if (!z7) {
                    c1axm.LJLJJL(layout);
                }
                c1axm.LL(z12);
                c1axm.LLLFFI = false;
            }
            DataChannel dataChannel = c1axm.LL.LJFF.getDataChannel();
            if (dataChannel != null && (interfaceC951900asW = (InterfaceC951900asW) dataChannel.gg0(C957010b0l.class)) != null) {
                interfaceC951900asW.LJ();
            }
            if (z9) {
                return;
            }
            C2181131AXv c2181131AXv = new C2181131AXv(c1axm, layoutLIZ, c2181161AXy2);
            if (c1axm.LL.LJI) {
                c2181131AXv.invoke("unknown");
            } else {
                C2180891AWx c2180891AWxLJLI = c1axm.LJLI();
                c2180891AWxLJLI.getActionCallback();
                c2180891AWxLJLI.invoke(new C1AYI(), c2181131AXv);
                C1304630k3R.LIZLLL(6, "[switchLayoutForLayoutView] real switch", c1axm.LLILLJJLI);
            }
            if (!z7) {
                c1axm.LJLJJL(layout);
            }
            if (!z8) {
                return;
            }
            c1axm.LL(z12);
            return;
        }
        C1304630k3R.LIZLLL(6, "call switchLayoutInternal failed because of redundant refresh..", c1axm.LLILLJJLI);
    }

    @Override // X.InterfaceC955150axl
    public final void LJIILJJIL(EnumC965730bEp enumC965730bEp, byte[] bArr, String str, List<C957030b0n> list, String str2, String str3, boolean z, JSONObject jSONObject, JSONObject jSONObject2, C917100ZyO c917100ZyO) {
        String strLLIIII = LLIIII(2123);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("startLayoutAnimation not implemented, layoutKey:");
        sbLIZ.append(str);
        C20441214yg.LJIIL(strLLIIII, C2188811AlT.LIZIZ(sbLIZ));
    }
}
