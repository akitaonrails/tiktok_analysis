package X;

import Y.ARunnableS115S0100000_15;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import com.bytedance.android.live.liveinteract.api.MultiLiveRTCLayoutChannel;
import com.bytedance.android.livesdk.comp.api.linkcore.api.ILinkMicService;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkUser;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicFeedPreviewFirstFrameOptSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveSdkMultiGuestFeedPreviewOptSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.LinkMicMultiGuestShareBgOptSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.MultiGuestV3VideoSeiEndSetting;
import com.bytedance.android.livesdk.sei.LinkMicSei;
import com.bytedance.android.livesdk.sei.SeiAppData;
import com.bytedance.android.livesdk.sei.SeiDsl;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS139S0201000_15;
import kotlin.jvm.internal.AwS19S1110000_15;
import kotlin.jvm.internal.AwS259S0300000_15;
import kotlin.jvm.internal.AwS416S0200000_15;
import kotlin.jvm.internal.AwS76S0500000_15;

/* JADX INFO: renamed from: X.0aa5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C940470aa5 implements InterfaceC2175461ACa, InterfaceC958970b3v {
    public static final C940740aaW LLJLL = new Object() { // from class: X.0aaW
    };
    public InterfaceC940380aZw LL;
    public C940490aa7 LLILZLL;
    public InterfaceC937900aVw LLIZ;
    public FrameLayout LLIZLLLIL;
    public InterfaceC464060IHs LLJ;
    public ViewGroup.LayoutParams LLJI;
    public long LLJIJIL;
    public SeiAppData LLJILJIL;
    public Function1<? super Rect, Unit> LLJILLL;
    public int LLJJ;
    public int LLJJI;
    public int LLJJIII;
    public int LLJJIJI;
    public int LLJJIJIIJIL;
    public Pair<Integer, Integer> LLJJIJIL;
    public InterfaceC958990b3x LLJJJ;
    public InterfaceC940230aZh LLJJJIL;
    public InterfaceC940300aZo LLJJJJ;
    public int LLJJJJJIL;
    public int LLJJJJLIIL;
    public C945320ahu LLJJL;
    public boolean LLJJLIIIJLLLLLLLZ;
    public final ViewTreeObserverOnGlobalLayoutListenerC940540aaC LLJL;
    public final C940530aaB LLJLIL;
    public final C01GW LLJLILLLLZIIL;
    public final AtomicBoolean LLILLJJLI = new AtomicBoolean(false);
    public final AtomicBoolean LLILLL = new AtomicBoolean(false);
    public final C919770a2h LLILZ = new C919770a2h(null);
    public final C01FB LLILZIL = new C01FB(null);
    public Rect LLJILJILJ = new Rect();

    @Override // X.InterfaceC2175461ACa
    public final void LJIIZILJ(LiveWidget liveWidget) {
    }

    @Override // X.InterfaceC958970b3v
    public final void LJJIJL(C2180891AWx c2180891AWx) {
    }

    @Override // X.InterfaceC958970b3v
    public final void LJJJI() {
    }

    @Override // X.InterfaceC958970b3v
    public final boolean LJJJIL() {
        return true;
    }

    @Override // X.InterfaceC958970b3v
    public final void LLIIIL(Map map) {
    }

    @Override // X.InterfaceC958970b3v
    public final void LLJJJ() {
    }

    @Override // X.InterfaceC958970b3v
    public final void LLJLILLLLZIIL(SeiAppData seiAppData) {
    }

    @Override // X.InterfaceC958970b3v
    public final void LLJLLL(List list, boolean z) {
    }

    @Override // X.InterfaceC958970b3v
    public final void LLLIIIIL(C2180891AWx c2180891AWx, int i) {
    }

    @Override // X.InterfaceC958970b3v
    public final void LLLJ(LinkUser linkUser) {
    }

    public final void LIZ() {
        View view;
        InterfaceC937900aVw interfaceC937900aVw = this.LLIZ;
        if (interfaceC937900aVw != null) {
            interfaceC937900aVw.ul();
        }
        InterfaceC940380aZw interfaceC940380aZw = this.LL;
        if (interfaceC940380aZw != null) {
            interfaceC940380aZw.release();
        }
        this.LL = null;
        LJFF("no sei parsed, release window mask.");
        C940490aa7 c940490aa7 = this.LLILZLL;
        if ((c940490aa7 == null || !C933980aPc.LJIIIZ(c940490aa7.LJIILJJIL)) && this.LLJI != null) {
            Object obj = this.LLJ;
            if (obj instanceof View) {
                InterfaceC940230aZh interfaceC940230aZh = this.LLJJJIL;
                if (C500260Jjc.LJJJI(interfaceC940230aZh != null ? Boolean.valueOf(interfaceC940230aZh.LIZLLL(this.LLJJIII, this.LLJJIJI, (View) obj)) : null)) {
                    return;
                }
                if (this.LLJJIII > this.LLJJIJI) {
                    HandlerHook.viewPostDelay((View) this.LLJ, new ARunnableS115S0100000_15(this, 183), 20L);
                } else {
                    HandlerHook.viewPostDelay((View) this.LLJ, new ARunnableS115S0100000_15(this, 184), 20L);
                }
                Object obj2 = this.LLJ;
                if (!(obj2 instanceof View) || (view = (View) obj2) == null) {
                    return;
                }
                C786410Ut5.Jc(view, 0.0f);
            }
        }
    }

    public final int LIZIZ() {
        InterfaceC940380aZw interfaceC940380aZw = this.LL;
        if (interfaceC940380aZw == null) {
            return 0;
        }
        if (interfaceC940380aZw instanceof C939600aYg) {
            return 4;
        }
        if (interfaceC940380aZw instanceof InterfaceC940790aab) {
            return 2;
        }
        return interfaceC940380aZw instanceof C940390aZx ? 4 : 0;
    }

    public final boolean LIZLLL() {
        InterfaceC940230aZh interfaceC940230aZh;
        return LiveSdkMultiGuestFeedPreviewOptSetting.INSTANCE.isEnable() ? this.LLILLJJLI.get() && this.LLILLL.get() && (interfaceC940230aZh = this.LLJJJIL) != null && interfaceC940230aZh.LJFF() : this.LLILLJJLI.get() && this.LLILLL.get();
    }

    @Override // X.InterfaceC2175461ACa
    public final void LJII() {
        C945320ahu c945320ahu = this.LLJJL;
        if (c945320ahu != null) {
            this.LLJJL = null;
            LJ(c945320ahu);
        }
    }

    @Override // X.InterfaceC2175461ACa
    public final C942150acn LJIJ() {
        SeiAppData seiAppData = this.LLJILJIL;
        if (seiAppData == null || seiAppData.linkMicContainer == null) {
            return null;
        }
        return new C942150acn(EnumC939140aXw.LEGACY, null);
    }

    @Override // X.InterfaceC2175461ACa
    public final boolean LJIJI() {
        SeiAppData seiAppData = this.LLJILJIL;
        return seiAppData != null && seiAppData.LJIILL();
    }

    @Override // X.InterfaceC2175461ACa
    public final boolean LJIJJLI() {
        C940490aa7 c940490aa7 = this.LLILZLL;
        return C917280Zyg.LIZ(C940890aal.LIZ, c940490aa7 != null ? c940490aa7.LJIIIIZZ : 0, Integer.valueOf(C940890aal.LIZIZ)) == EnumC918830a1B.CAN_APPLY;
    }

    @Override // X.InterfaceC2175461ACa
    public final int LJJII() {
        InterfaceC937820aVo interfaceC937820aVoLJJJJZ;
        List<InterfaceC937840aVq> allLayoutWindows;
        InterfaceC937900aVw interfaceC937900aVw = this.LLIZ;
        if (interfaceC937900aVw == null || (interfaceC937820aVoLJJJJZ = interfaceC937900aVw.LJJJJZ()) == null || (allLayoutWindows = interfaceC937820aVoLJJJJZ.getAllLayoutWindows()) == null) {
            return 0;
        }
        ArrayList arrayList = new ArrayList();
        for (InterfaceC937840aVq interfaceC937840aVq : allLayoutWindows) {
            InterfaceC937840aVq interfaceC937840aVq2 = interfaceC937840aVq;
            if (!interfaceC937840aVq2.LIZJ() && !interfaceC937840aVq2.LJIILIIL()) {
                arrayList.add(interfaceC937840aVq);
            }
        }
        return arrayList.size();
    }

    @Override // X.InterfaceC2175461ACa
    public final boolean LJJIII() {
        SeiAppData seiAppData = this.LLJILJIL;
        return seiAppData != null && seiAppData.LJIILLIIL();
    }

    @Override // X.InterfaceC2175461ACa
    public final void LJJIIJ() {
        InterfaceC937900aVw interfaceC937900aVw = this.LLIZ;
        if (interfaceC937900aVw != null) {
            interfaceC937900aVw.LJJLIIIJJI();
        }
    }

    @Override // X.InterfaceC2175461ACa
    public final Pair<Rect, Bitmap> LJJIJIL() {
        InterfaceC937820aVo interfaceC937820aVoLJJJJZ;
        List<InterfaceC937840aVq> allLayoutWindows;
        InterfaceC937840aVq interfaceC937840aVq;
        FrameLayout frameLayoutLJJIIJ;
        Object parent;
        View view;
        InterfaceC937900aVw interfaceC937900aVw = this.LLIZ;
        if (interfaceC937900aVw == null || (interfaceC937820aVoLJJJJZ = interfaceC937900aVw.LJJJJZ()) == null || (allLayoutWindows = interfaceC937820aVoLJJJJZ.getAllLayoutWindows()) == null || (interfaceC937840aVq = (InterfaceC937840aVq) C13LP.LJJJLL(allLayoutWindows)) == null || (frameLayoutLJJIIJ = interfaceC937840aVq.LJJIIJ()) == null || (parent = frameLayoutLJJIIJ.getParent()) == null || !(parent instanceof View) || (view = (View) parent) == null) {
            return null;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), Bitmap.Config.ARGB_8888);
        C842150X1x.LIZIZ(new Canvas(bitmapCreateBitmap), view);
        Rect rect = new Rect();
        view.getGlobalVisibleRect(rect);
        return new Pair<>(rect, bitmapCreateBitmap);
    }

    @Override // X.InterfaceC2175461ACa
    public final int LJJIJLIJ() {
        InterfaceC937820aVo interfaceC937820aVoLJJJJZ;
        List<InterfaceC937840aVq> allLayoutWindows;
        InterfaceC937900aVw interfaceC937900aVw = this.LLIZ;
        if (interfaceC937900aVw == null || (interfaceC937820aVoLJJJJZ = interfaceC937900aVw.LJJJJZ()) == null || (allLayoutWindows = interfaceC937820aVoLJJJJZ.getAllLayoutWindows()) == null) {
            return 0;
        }
        return allLayoutWindows.size();
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [X.0aaC] */
    public C940470aa5() {
        this.LLJJI = LinkMicMultiGuestShareBgOptSetting.INSTANCE.isEnable() ? -1 : 0;
        this.LLJJIJIL = new Pair<>(0, 0);
        this.LLJL = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: X.0aaC
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                C940470aa5 c940470aa5 = this.LL;
                FrameLayout frameLayout = c940470aa5.LLIZLLLIL;
                if (frameLayout != null) {
                    if (frameLayout.getWidth() == c940470aa5.LLJJJJJIL && frameLayout.getHeight() == c940470aa5.LLJJJJLIIL) {
                        return;
                    }
                    c940470aa5.LLJJJJJIL = frameLayout.getWidth();
                    c940470aa5.LLJJJJLIIL = frameLayout.getHeight();
                    InterfaceC937900aVw interfaceC937900aVw = c940470aa5.LLIZ;
                    if (interfaceC937900aVw != null) {
                        interfaceC937900aVw.LJJJJLL();
                    }
                }
            }
        };
        this.LLJLIL = new C940530aaB(null, 0L, 0L, 0L, null, 511);
        this.LLJLILLLLZIIL = C930540aK4.LJJIJIL(new C940340aZs(this));
    }

    @Override // X.InterfaceC2175461ACa
    public final C940490aa7 LJJIJIIJIL() {
        return this.LLILZLL;
    }

    public static final void LJFF(String str) {
        C20441214yg.LIZIZ("CommonLinkMicFeedViewManager", str);
    }

    public final void LJ(final C945320ahu c945320ahu) {
        LiveSdkMultiGuestFeedPreviewOptSetting liveSdkMultiGuestFeedPreviewOptSetting = LiveSdkMultiGuestFeedPreviewOptSetting.INSTANCE;
        if (liveSdkMultiGuestFeedPreviewOptSetting.isEnable()) {
            InterfaceC940380aZw interfaceC940380aZw = this.LL;
            if ((interfaceC940380aZw instanceof C939600aYg) && interfaceC940380aZw != null) {
                interfaceC940380aZw.LLLLLJIL(c945320ahu);
            }
        }
        if (liveSdkMultiGuestFeedPreviewOptSetting.isEnable() && LJIIJ(c945320ahu, C969340bKe.LJII(c945320ahu))) {
            return;
        }
        if (!liveSdkMultiGuestFeedPreviewOptSetting.isEnable()) {
            InterfaceC940380aZw interfaceC940380aZw2 = this.LL;
            if ((interfaceC940380aZw2 instanceof C939600aYg) && interfaceC940380aZw2 != null) {
                interfaceC940380aZw2.LLLLLJIL(c945320ahu);
            }
        }
        InterfaceC937900aVw interfaceC937900aVw = this.LLIZ;
        if (interfaceC937900aVw != null) {
            interfaceC937900aVw.LLILL(c945320ahu, new C1AY6() { // from class: X.0aZv
                @Override // X.C1AY6
                public final boolean LIZ() {
                    return true;
                }

                @Override // X.C1AY6
                public final void LIZIZ(C945320ahu c945320ahu2) {
                    LinkMicSei linkMicSei;
                    boolean z;
                    SeiAppData seiAppData;
                    String str;
                    try {
                        Gson gson = C19748512Ol.LIZIZ;
                        if (c945320ahu2 != null) {
                            str = c945320ahu2.LIZIZ;
                        } else {
                            str = null;
                        }
                        linkMicSei = (LinkMicSei) gson.LJII(str, LinkMicSei.class);
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        linkMicSei = null;
                    }
                    InterfaceC940380aZw interfaceC940380aZw3 = this.LIZ.LL;
                    if (interfaceC940380aZw3 != null) {
                        interfaceC940380aZw3.LJJZZIII(linkMicSei);
                    }
                    MultiGuestV3VideoSeiEndSetting multiGuestV3VideoSeiEndSetting = MultiGuestV3VideoSeiEndSetting.INSTANCE;
                    if (multiGuestV3VideoSeiEndSetting.enableNoParseSeiEndLayout() && System.currentTimeMillis() - this.LIZ.LLJIJIL > Mp4ScreenVideoLoadTimeout.CONTROL) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if ((multiGuestV3VideoSeiEndSetting.enableVideoSeiEndLayout() && C969340bKe.LJI(c945320ahu2)) || z) {
                        C940470aa5 c940470aa5 = this.LIZ;
                        c940470aa5.LLILZ.LJJIL(null, c940470aa5.LLIZ);
                        C940470aa5 c940470aa52 = this.LIZ;
                        if (c940470aa52.LIZIZ() == 4 || ((seiAppData = c940470aa52.LLJILJIL) != null && seiAppData.LJIILL())) {
                            c940470aa52.LIZ();
                        }
                        C914240Ztm.LIZ.getClass();
                        C914240Ztm.LIZJ();
                        C914240Ztm.LIZ();
                        C914240Ztm.LIZLLL();
                        InterfaceC940230aZh interfaceC940230aZh = this.LIZ.LLJJJIL;
                        if (interfaceC940230aZh != null) {
                            interfaceC940230aZh.LIZ();
                        }
                    }
                    C914830Zuj.LIZ.getClass();
                }

                @Override // X.C1AY6
                public final boolean LIZJ(SeiAppData seiAppData) {
                    return this.LIZ.LJIIJ(c945320ahu, seiAppData);
                }

                @Override // X.C1AY6
                public final void LIZLLL(SeiAppData seiAppData) {
                    boolean z;
                    boolean z2;
                    boolean z3;
                    SeiDsl seiDsl;
                    SeiDsl seiDsl2;
                    this.LIZ.LLJIJIL = System.currentTimeMillis();
                    SeiAppData seiAppData2 = this.LIZ.LLJILJIL;
                    boolean z4 = true;
                    if (seiAppData2 != null && seiAppData2.LJIILLIIL()) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z && (seiDsl2 = seiAppData.dsl) != null && seiDsl2.scene == 2) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    SeiAppData seiAppData3 = this.LIZ.LLJILJIL;
                    if (seiAppData3 != null && seiAppData3.LJIILL()) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (!z3 || (seiDsl = seiAppData.dsl) == null || seiDsl.scene != 4) {
                        z4 = false;
                    }
                    if (z2 | z4) {
                        InterfaceC940380aZw interfaceC940380aZw3 = this.LIZ.LL;
                        if (interfaceC940380aZw3 != null) {
                            interfaceC940380aZw3.release();
                        }
                        this.LIZ.LL = null;
                    }
                    C940470aa5 c940470aa5 = this.LIZ;
                    c940470aa5.LLJILJIL = seiAppData;
                    if (seiAppData.version == 2 && c940470aa5.LIZIZ() == 4) {
                        c940470aa5.LIZ();
                        if (LinkMicMultiGuestShareBgOptSetting.INSTANCE.isEnable()) {
                            c940470aa5.LLJJI = -1;
                        }
                    }
                }

                @Override // X.C1AY6
                public final void LJ(SeiAppData seiAppData) {
                    C940470aa5 c940470aa5 = this.LIZ;
                    c940470aa5.LJI(new AwS259S0300000_15(c940470aa5, c945320ahu, seiAppData, 47), null);
                }
            });
        }
    }

    @Override // X.InterfaceC2175461ACa
    public final void LJIIIZ(C945320ahu c945320ahu) {
        if (LiveSdkMultiGuestFeedPreviewOptSetting.INSTANCE.isEnable()) {
            LJI(new C940570aaF(this, c945320ahu), new AwS416S0200000_15(this, c945320ahu, 91));
        } else {
            LJI(new AwS416S0200000_15(this, c945320ahu, 92), null);
        }
    }

    @Override // X.InterfaceC2175461ACa
    public final void LJIIL(InterfaceC940230aZh interfaceC940230aZh) {
        this.LLJJJIL = interfaceC940230aZh;
    }

    @Override // X.InterfaceC2175461ACa
    public final void LJIJJ(C940490aa7 c940490aa7) {
        Context context;
        Long l;
        String str;
        int i;
        EnumC945310aht enumC945310aht;
        if (LiveSdkMultiGuestFeedPreviewOptSetting.INSTANCE.isEnable()) {
            C914240Ztm.LIZ.getClass();
            C914240Ztm.LJ();
            this.LLILZLL = c940490aa7;
            ILinkMicService iLinkMicService = (ILinkMicService) C1161920gLG.LIZJ(ILinkMicService.class);
            C940490aa7 c940490aa72 = this.LLILZLL;
            if (c940490aa72 != null && (context = c940490aa72.LIZJ) != null && (l = c940490aa72.LIZIZ) != null) {
                long jLongValue = l.longValue();
                C940490aa7 c940490aa73 = this.LLILZLL;
                if (c940490aa73 != null) {
                    long j = c940490aa73.LIZ;
                    if (c940490aa7.LJIILJJIL == 7) {
                        str = "live_voice";
                    } else {
                        str = "";
                    }
                    C1AXM c1axm = null;
                    EnumC940090aZT enumC940090aZT = c940490aa73.LJFF;
                    if (enumC940090aZT == null) {
                        i = -1;
                    } else {
                        i = C917260Zye.LIZ[enumC940090aZT.ordinal()];
                    }
                    if (i == 1) {
                        enumC945310aht = EnumC945310aht.SEARCH;
                    } else {
                        enumC945310aht = EnumC945310aht.COMMON_FEED;
                    }
                    C1AXM c1axmWs2 = iLinkMicService.Ws2(jLongValue, j, context, enumC945310aht, str, false, false);
                    if (c1axmWs2 != null) {
                        c1axmWs2.LLJJJJLIIL = new AbstractC946520ajq() { // from class: X.0aa9
                            @Override // X.AbstractC946520ajq
                            public final Rect LIZJ() {
                                return null;
                            }

                            @Override // X.AbstractC946520ajq
                            public final void LIZLLL(Rect rect, Pair<Integer, Integer> pair) {
                            }

                            @Override // X.InterfaceC2181941AaO
                            public final void reset() {
                            }

                            @Override // X.InterfaceC2181941AaO
                            public final Pair<Integer, Integer> getResolution() {
                                Pair<Integer, Integer> videoSize;
                                Pair<Integer, Integer> videoSize2;
                                InterfaceC940300aZo interfaceC940300aZo = this.LIZIZ.LLJJJJ;
                                int iIntValue = 0;
                                int iIntValue2 = (interfaceC940300aZo == null || (videoSize2 = interfaceC940300aZo.getVideoSize()) == null) ? 0 : videoSize2.getFirst().intValue();
                                InterfaceC940300aZo interfaceC940300aZo2 = this.LIZIZ.LLJJJJ;
                                if (interfaceC940300aZo2 != null && (videoSize = interfaceC940300aZo2.getVideoSize()) != null) {
                                    iIntValue = videoSize.getSecond().intValue();
                                }
                                return new Pair<>(Integer.valueOf(iIntValue2), Integer.valueOf(iIntValue));
                            }
                        };
                        c1axmWs2.LLIIZ(new C940560aaE());
                        c1axm = c1axmWs2;
                    }
                    this.LLIZ = c1axm;
                    this.LLILLJJLI.set(true);
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("init ");
                    sbLIZ.append(c940490aa7);
                    LJFF(C2188811AlT.LIZIZ(sbLIZ));
                    return;
                }
                return;
            }
            return;
        }
        C500260Jjc.LJJLIIIJILLIZJL(new AwS416S0200000_15(this, c940490aa7, 89));
    }

    @Override // X.InterfaceC2175461ACa
    public final void LJIL(InterfaceC940300aZo interfaceC940300aZo) {
        this.LLJJJJ = interfaceC940300aZo;
    }

    @Override // X.InterfaceC2175461ACa
    public final void LJJ(int i) {
        InterfaceC937820aVo interfaceC937820aVoLJJJJZ;
        this.LLJJLIIIJLLLLLLLZ = true;
        InterfaceC940380aZw interfaceC940380aZw = this.LL;
        if (interfaceC940380aZw != null) {
            interfaceC940380aZw.LLJJJIL();
        }
        InterfaceC937900aVw interfaceC937900aVw = this.LLIZ;
        if (interfaceC937900aVw != null && (interfaceC937820aVoLJJJJZ = interfaceC937900aVw.LJJJJZ()) != null) {
            interfaceC937820aVoLJJJJZ.setNotAddViewOpt(i);
        }
    }

    @Override // X.InterfaceC2175461ACa
    public final void LJJI(InterfaceC958990b3x interfaceC958990b3x) {
        this.LLJJJ = interfaceC958990b3x;
    }

    @Override // X.InterfaceC2175461ACa
    public final void LJJIIZ(int i) {
        this.LLJJIJIIJIL = i;
    }

    @Override // X.InterfaceC2175461ACa
    public final void LJJIIZI(Function1<? super Rect, Unit> function1) {
        this.LLJILLL = function1;
    }

    @Override // X.InterfaceC2175461ACa
    public final Map<String, Rect> LJJIJ(boolean z) {
        InterfaceC937820aVo interfaceC937820aVoLJJJJZ;
        List<InterfaceC937840aVq> allLayoutWindows;
        String strLJ;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        InterfaceC937900aVw interfaceC937900aVw = this.LLIZ;
        if (interfaceC937900aVw != null && (interfaceC937820aVoLJJJJZ = interfaceC937900aVw.LJJJJZ()) != null && (allLayoutWindows = interfaceC937820aVoLJJJJZ.getAllLayoutWindows()) != null) {
            for (InterfaceC937840aVq interfaceC937840aVq : allLayoutWindows) {
                if (!interfaceC937840aVq.LJIILIIL() && !interfaceC937840aVq.LJIIZILJ(true) && (strLJ = interfaceC937840aVq.LJ()) != null) {
                    C940490aa7 c940490aa7 = this.LLILZLL;
                    if (c940490aa7 != null && C933980aPc.LJIIIZ(c940490aa7.LJIILJJIL)) {
                        View viewFindViewById = interfaceC937840aVq.LJJIIJ().findViewById(R.id.qt3);
                        if (viewFindViewById != null) {
                            int[] iArr = new int[2];
                            viewFindViewById.getLocationOnScreen(iArr);
                            int i = iArr[0];
                            linkedHashMap.put(strLJ, new Rect(i, iArr[1], viewFindViewById.getWidth() + i, iArr[1] + viewFindViewById.getHeight()));
                        }
                    } else if (z) {
                        linkedHashMap.put(strLJ, interfaceC937840aVq.LJIIIZ());
                    } else {
                        linkedHashMap.put(strLJ, interfaceC937840aVq.LJFF());
                    }
                }
            }
        }
        return linkedHashMap;
    }

    @Override // X.InterfaceC2175461ACa
    public final C940530aaB LJJIJIIJI(boolean z) {
        InterfaceC940380aZw interfaceC940380aZw = this.LL;
        long j = 0;
        if (interfaceC940380aZw instanceof InterfaceC940790aab) {
            if (interfaceC940380aZw instanceof InterfaceC940790aab) {
                InterfaceC940550aaD interfaceC940550aaD = (InterfaceC940550aaD) interfaceC940380aZw;
                int iLJIIIZ = interfaceC940550aaD.LJIIIZ();
                if (iLJIIIZ != EnumC919170a1j.MATCH_TYPE_1V1.getType() && iLJIIIZ != EnumC919170a1j.MATCH_TYPE_2V2.getType() && iLJIIIZ != EnumC919170a1j.MATCH_TYPE_INDIVIDUAL.getType() && iLJIIIZ != EnumC919170a1j.MATCH_TYPE_1VN.getType()) {
                    if (iLJIIIZ == EnumC919170a1j.MATCH_TYPE_TAKE_THE_STAGE.getType()) {
                        C940530aaB c940530aaB = this.LLJLIL;
                        c940530aaB.LIZ = "take_stage";
                        c940530aaB.LIZJ = interfaceC940550aaD.lr();
                    } else if (iLJIIIZ == EnumC919170a1j.MATCH_TYPE_CATCH_BEANS.getType()) {
                        C940530aaB c940530aaB2 = this.LLJLIL;
                        c940530aaB2.LIZ = "catch_bean";
                        c940530aaB2.LIZJ = interfaceC940550aaD.lr();
                    } else {
                        C940530aaB c940530aaB3 = this.LLJLIL;
                        c940530aaB3.LIZ = "anchor";
                        c940530aaB3.LIZJ = 0L;
                    }
                } else {
                    C940530aaB c940530aaB4 = this.LLJLIL;
                    c940530aaB4.LIZ = "manual_pk";
                    c940530aaB4.LIZJ = interfaceC940550aaD.LIZIZ(z);
                }
                this.LLJLIL.LJ = interfaceC940550aaD.getSubMatchType();
                this.LLJLIL.LIZIZ = interfaceC940550aaD.getChannelId();
                C940530aaB c940530aaB5 = this.LLJLIL;
                if (interfaceC940550aaD.LJ()) {
                    j = 1;
                }
                c940530aaB5.LIZLLL = j;
                this.LLJLIL.LJI = interfaceC940550aaD.LIZLLL();
                this.LLJLIL.LJII = interfaceC940550aaD.LJJI();
                this.LLJLIL.LJIIIIZZ = interfaceC940550aaD.LIZ();
            }
            this.LLJLIL.LJFF = "cohost_all";
        } else if (!(interfaceC940380aZw instanceof C939600aYg) && !(interfaceC940380aZw instanceof C940390aZx)) {
            this.LLJLIL.LIZ();
        } else {
            C940530aaB c940530aaB6 = this.LLJLIL;
            c940530aaB6.LIZ = "guest";
            c940530aaB6.LIZIZ = 0L;
            c940530aaB6.LIZJ = 0L;
            c940530aaB6.LIZLLL = 0L;
            c940530aaB6.LJFF = "audience";
        }
        return this.LLJLIL;
    }

    @Override // X.InterfaceC958970b3v
    public final void LLLLL(InterfaceC937820aVo interfaceC937820aVo) {
        LJI(new AwS416S0200000_15(this, interfaceC937820aVo, 90), null);
    }

    @Override // X.InterfaceC958970b3v
    public final void LIZJ(int i, List list) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onWindowStateChanged, ");
        sbLIZ.append(list.size());
        LJFF(C2188811AlT.LIZIZ(sbLIZ));
        Map<String, Object> map = C1338270kvh.LIZ;
        LJI(new AwS139S0201000_15(list, (List<? extends InterfaceC937840aVq>) this, (C940470aa5) i, 7), null);
    }

    public final void LJI(Function0<Unit> function0, Function0<Unit> function02) {
        if (LIZLLL()) {
            function0.invoke();
        } else {
            if (function02 == null) {
                return;
            }
            function02.invoke();
        }
    }

    public final boolean LJIIJ(C945320ahu c945320ahu, SeiAppData seiAppData) {
        SeiDsl seiDsl;
        EnumC940090aZT enumC940090aZT;
        InterfaceC940230aZh interfaceC940230aZh;
        if (seiAppData != null && (seiDsl = seiAppData.dsl) != null && seiDsl.scene == 4) {
            if (seiAppData.version != 16) {
                C940490aa7 c940490aa7 = this.LLILZLL;
                if (c940490aa7 != null) {
                    enumC940090aZT = c940490aa7.LJFF;
                } else {
                    enumC940090aZT = null;
                }
                if (enumC940090aZT == EnumC940090aZT.FEED && (interfaceC940230aZh = this.LLJJJIL) != null && !interfaceC940230aZh.LJFF() && LinkMicFeedPreviewFirstFrameOptSetting.opt()) {
                    this.LLJJL = c945320ahu;
                } else {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x008d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.InterfaceC940380aZw LJIIJJI(int r12, X.C919770a2h r13) {
        /*
            r11 = this;
            X.0aZw r0 = r11.LL
            r3 = 0
            if (r0 == 0) goto L16
            int r0 = r11.LIZIZ()
            if (r0 == r12) goto L16
            if (r12 == 0) goto L16
            X.0aZw r0 = r11.LL
            if (r0 == 0) goto L14
            r0.release()
        L14:
            r11.LL = r3
        L16:
            int r4 = r11.LLJJI
            X.0aZw r0 = r11.LL
            r2 = 0
            r5 = 1
            r6 = 16
            r1 = 4
            if (r0 == 0) goto L96
            int r0 = r11.LIZIZ()
            if (r0 == r12) goto L96
            if (r12 == 0) goto L39
            X.0aVw r0 = r11.LLIZ
            if (r0 == 0) goto L30
            r0.LJJLIIIJJI()
        L30:
            X.0aZw r0 = r11.LL
            if (r0 == 0) goto L37
            r0.release()
        L37:
            r11.LL = r3
        L39:
            X.0aZw r0 = r11.LL
            if (r0 != 0) goto L62
            X.0aaW r0 = X.C940470aa5.LLJLL
            X.0aa7 r8 = r11.LLILZLL
            int r10 = r11.LLJJI
            X.0aVw r7 = r11.LLIZ
            X.0b3x r4 = r11.LLJJJ
            boolean r9 = r11.LLJJLIIIJLLLLLLLZ
            r0.getClass()
            r0 = 2
            if (r12 == r0) goto L72
            if (r12 != r1) goto L60
            if (r10 != r6) goto L65
            X.0aZx r0 = new X.0aZx
            r0.<init>()
            r0.LIZIZ(r8, r7, r13, r3)
            if (r9 == 0) goto L5f
            r0.LLIZLLLIL = r5
        L5f:
            r3 = r0
        L60:
            r11.LL = r3
        L62:
            X.0aZw r0 = r11.LL
            return r0
        L65:
            X.0aYg r0 = new X.0aYg
            r0.<init>(r2)
            r0.LJIIIIZZ(r8, r7, r13, r3)
            if (r9 == 0) goto L5f
            r0.LLLFF = r5
            goto L5f
        L72:
            com.bytedance.android.livesdk.livesetting.linkmic.cohost.LiveCoHostAddFeedComponentsSetting r0 = com.bytedance.android.livesdk.livesetting.linkmic.cohost.LiveCoHostAddFeedComponentsSetting.INSTANCE
            boolean r0 = r0.isEnable()
            if (r0 == 0) goto L8d
            if (r8 == 0) goto L8b
            X.0aZT r1 = r8.LJFF
        L7e:
            X.0aZT r0 = X.EnumC940090aZT.FEED
            if (r1 != r0) goto L8d
            X.0b3s r0 = new X.0b3s
            r0.<init>(r2)
            r0.LJI(r8, r7, r13, r4)
            goto L5f
        L8b:
            r1 = r3
            goto L7e
        L8d:
            X.0ahp r0 = new X.0ahp
            r0.<init>(r2)
            r0.LJFF(r8, r7, r13, r3)
            goto L5f
        L96:
            if (r12 != r1) goto L39
            if (r4 != r6) goto Lb1
            X.0aZw r0 = r11.LL
            boolean r0 = r0 instanceof X.C940390aZx
            if (r0 != 0) goto L39
        La0:
            X.0aVw r0 = r11.LLIZ
            if (r0 == 0) goto La7
            r0.LJJLIIIJJI()
        La7:
            X.0aZw r0 = r11.LL
            if (r0 == 0) goto Lae
            r0.release()
        Lae:
            r11.LL = r3
            goto L39
        Lb1:
            r0 = 5
            if (r4 != r0) goto La0
            X.0aZw r0 = r11.LL
            boolean r0 = r0 instanceof X.C939600aYg
            if (r0 == 0) goto La0
            goto L39
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C940470aa5.LJIIJJI(int, X.0a2h):X.0aZw");
    }

    @Override // X.InterfaceC2175461ACa
    public final void LJJIFFI(int i, int i2) {
        InterfaceC937900aVw interfaceC937900aVw = this.LLIZ;
        if (interfaceC937900aVw != null) {
            interfaceC937900aVw.LLILZLL(new Pair<>(Integer.valueOf(i), Integer.valueOf(i2)));
        }
    }

    @Override // X.InterfaceC2175461ACa
    public final void LJJIIJZLJL(String str, boolean z) {
        C927970aFv.LIZ.getClass();
        C927970aFv.LIZIZ = null;
        C500260Jjc.LJJLIIIJILLIZJL(new AwS19S1110000_15(this, str, z, 0));
    }

    @Override // X.InterfaceC958970b3v
    public final void LLIILII(InterfaceC937820aVo interfaceC937820aVo, int i) {
        String businessType;
        int size;
        LiveWidget liveWidget;
        DataChannel dataChannel;
        EnumC918990a1R enumC918990a1RLIZ = C916560ZxW.LIZ(interfaceC937820aVo.getLayoutBusinessType());
        if (enumC918990a1RLIZ != null) {
            businessType = enumC918990a1RLIZ.getBusinessType();
        } else {
            businessType = null;
        }
        EnumC918970a1P enumC918970a1PLIZ = C916800Zxu.LIZ(businessType);
        if (!interfaceC937820aVo.getAllLayoutWindows().isEmpty()) {
            size = interfaceC937820aVo.getAllLayoutWindows().size() - 1;
        } else {
            size = 0;
        }
        C1081600eFi c1081600eFi = new C1081600eFi(enumC918970a1PLIZ, size, 0, 0, false, 28);
        C940490aa7 c940490aa7 = this.LLILZLL;
        if (c940490aa7 != null && (liveWidget = c940490aa7.LJI) != null && (dataChannel = liveWidget.dataChannel) != null) {
            dataChannel.zW(MultiLiveRTCLayoutChannel.class, c1081600eFi);
        }
        LJI(new AwS139S0201000_15(this, interfaceC937820aVo, i, 6), null);
    }

    @Override // X.InterfaceC2175461ACa
    public final void LJIILIIL(int i, int i2, View view) {
        if (view == null) {
            return;
        }
        LJI(new C940480aa6(view, this, i2, i), null);
    }

    @Override // X.InterfaceC2175461ACa
    public final void LJIIIIZZ(FrameLayout frameLayout, int i, int i2, int i3) {
        if (frameLayout == null) {
            return;
        }
        this.LLILLL.set(true);
        LJI(new C940500aa8(frameLayout, this, i3, i, i2), null);
    }

    @Override // X.InterfaceC958970b3v
    public final void LJIILL(InterfaceC937840aVq interfaceC937840aVq, EnumC918810a19 enumC918810a19, EnumC918810a19 enumC918810a192, C938510aWv c938510aWv) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onWindowStateChanged ");
        sbLIZ.append(LIZLLL());
        sbLIZ.append(' ');
        sbLIZ.append(interfaceC937840aVq);
        sbLIZ.append(' ');
        sbLIZ.append(c938510aWv);
        LJFF(C2188811AlT.LIZIZ(sbLIZ));
        LJI(new AwS76S0500000_15(this, c938510aWv, interfaceC937840aVq, enumC918810a19, enumC918810a192, 6), null);
    }
}
