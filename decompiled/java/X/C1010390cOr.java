package X;

import android.content.Context;
import android.graphics.PointF;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.ugc.aweme.commercialize.search.ISearchAdEventLogger;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.ss.android.ugc.aweme.IAnoleManager;
import com.ss.android.ugc.aweme.IAnoleService;
import com.ss.android.ugc.aweme.commercialize.model.AnoleComponentAppearModel;
import com.ss.android.ugc.aweme.commercialize.model.AnoleComponentModel;
import com.ss.android.ugc.aweme.commercialize.video.IVideoPlayTaskManager;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.search.common.utils.SAFHelper;
import java.util.HashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS558S0100000_14;
import kotlin.jvm.internal.AwS560S0100000_16;
import kotlin.jvm.internal.AwS81S0100100_16;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0cOr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1010390cOr implements InterfaceC1010470cOz {
    public final InterfaceC1010420cOu LL;
    public final Context LLILLJJLI;
    public final Aweme LLILLL;
    public final C1010580cPA LLILZ;
    public final View LLILZIL;
    public final LifecycleOwner LLILZLL;
    public IAnoleManager LLIZ;
    public ViewGroup LLIZLLLIL;
    public C1010790cPV LLJ;
    public IVideoPlayTaskManager LLJI;
    public final Long LLJIJIL;
    public final C01GW LLJILJIL;
    public boolean LLJILJILJ;
    public final InterfaceC1007880cKo LLJILLL;

    @Override // X.InterfaceC1010520cP4
    public final void bind() {
        C1007900cKq c1007900cKqLJI;
        IAnoleManager iAnoleManager = this.LLIZ;
        if (iAnoleManager != null) {
            iAnoleManager.LJ();
        }
        InterfaceC1014340cVE interfaceC1014340cVE = null;
        this.LLIZ = null;
        Context context = this.LLILLJJLI;
        Aweme aweme = this.LL.getAweme();
        Aweme aweme2 = this.LL.getAweme();
        AwemeRawAd awemeRawAd = aweme2 != null ? aweme2.getAwemeRawAd() : null;
        Aweme aweme3 = this.LL.getAweme();
        String aid = aweme3 != null ? aweme3.getAid() : null;
        if (context == null || aweme == null || awemeRawAd == null || aid == null) {
            c1007900cKqLJI = null;
        } else {
            interfaceC1014340cVE = null;
            c1007900cKqLJI = ((IAnoleService) ServiceManager.get().getService(IAnoleService.class)).LJI(context, null, new C1009340cNA(aid, aweme.getGroupId(), aweme, awemeRawAd, null, null, null, 112), new InterfaceC1007910cKr() { // from class: X.0cO5
                @Override // X.InterfaceC1007910cKr
                public final void LJJLIIJ() {
                }

                @Override // X.InterfaceC1007910cKr
                public final long LJJLIL() {
                    return 0L;
                }

                @Override // X.InterfaceC1007910cKr
                public final int LLJILLL() {
                    return 0;
                }

                @Override // X.InterfaceC1007910cKr
                public final void LLJJIII(String str, View.OnLayoutChangeListener onLayoutChangeListener) {
                }

                @Override // X.InterfaceC1007910cKr
                public final C1014390cVJ LLJJIJIIJIL() {
                    return null;
                }

                @Override // X.InterfaceC1007910cKr
                public final void P() {
                }

                @Override // X.InterfaceC1007910cKr
                public final void U2() {
                }

                @Override // X.InterfaceC1007910cKr
                public final JSONObject V2() {
                    return null;
                }

                @Override // X.InterfaceC1007910cKr
                public final void X2(String str, ViewOnLayoutChangeListenerC1014330cVD viewOnLayoutChangeListenerC1014330cVD) {
                }

                @Override // X.InterfaceC1007910cKr
                public final HashMap<String, Object> Z2() {
                    return null;
                }

                @Override // X.InterfaceC1007910cKr
                public final ViewGroup b3() {
                    return null;
                }

                @Override // X.InterfaceC1007910cKr
                public final C1008080cL8 c3() {
                    return null;
                }

                @Override // X.InterfaceC1007910cKr
                public final boolean d3() {
                    return true;
                }

                @Override // X.InterfaceC1007910cKr
                public final boolean e3() {
                    return false;
                }

                @Override // X.InterfaceC1007910cKr
                public final void f3(long j, String str, String str2, AwS81S0100100_16 awS81S0100100_16) {
                }

                @Override // X.InterfaceC1007910cKr
                public final void g3(int i) {
                }

                @Override // X.InterfaceC1007910cKr
                public final Integer i3() {
                    return null;
                }

                @Override // X.InterfaceC1007910cKr
                public final void o0() {
                }

                @Override // X.InterfaceC1007910cKr
                public final void pauseVideo() {
                }

                @Override // X.InterfaceC1007910cKr
                public final long r1() {
                    return 0L;
                }

                @Override // X.InterfaceC1007910cKr
                public final C1014390cVJ Y2() {
                    double width = this.LIZ.LLILZIL != null ? r0.getWidth() : 0.0d;
                    double height = this.LIZ.LLILZIL != null ? r0.getHeight() : 0.0d;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("getDisplayInfo  width= ");
                    sbLIZ.append(width);
                    sbLIZ.append(" height= ");
                    sbLIZ.append(height);
                    sbLIZ.append(" width= ");
                    sbLIZ.append(width);
                    C2188811AlT.LIZIZ(sbLIZ);
                    double d = 2;
                    return new C1014390cVJ(new C1009390cNF(width, height), new PointF((float) (width / d), (float) (height / d)));
                }

                @Override // X.InterfaceC1007910cKr
                public final C1014410cVL LLJJIJI(String str) {
                    View view;
                    if (Intrinsics.LJFF(str, EnumC1009140cMq.ANOLE_SEARCH_CONTENT_AREA.getInteractName()) && (view = this.LIZ.LLILZIL) != null) {
                        int[] iArr = new int[2];
                        view.getLocationInWindow(iArr);
                        return new C1014410cVL(view.getWidth(), view.getHeight(), new int[]{0, iArr[1]});
                    }
                    return null;
                }

                @Override // X.InterfaceC1007910cKr
                public final C1009390cNF W2(String str) {
                    return C1008220cLM.LIZ();
                }

                @Override // X.InterfaceC1007910cKr
                public final void LIZIZ(AbstractC991850bux abstractC991850bux, InterfaceC1007930cKt interfaceC1007930cKt) {
                    String str;
                    AnoleComponentModel anoleComponentModelAk;
                    ISearchAdEventLogger iSearchAdEventLogger;
                    ISearchAdEventLogger iSearchAdEventLogger2;
                    C1009960cOA c1009960cOALIZ;
                    Boolean boolValueOf;
                    ISearchAdEventLogger iSearchAdEventLogger3;
                    ISearchAdEventLogger iSearchAdEventLogger4;
                    AnoleComponentModel anoleComponentModelAk2;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("receive Event ");
                    sbLIZ.append(abstractC991850bux.getClass().getName());
                    sbLIZ.append(" component type ");
                    Object obj = null;
                    Object obj2 = null;
                    AwemeRawAd awemeRawAd2 = null;
                    if (interfaceC1007930cKt != null && (anoleComponentModelAk2 = interfaceC1007930cKt.Ak()) != null) {
                        str = anoleComponentModelAk2.type;
                    } else {
                        str = null;
                    }
                    sbLIZ.append(str);
                    C2188811AlT.LIZIZ(sbLIZ);
                    int i = C2510609se.LIZ;
                    if (interfaceC1007930cKt != null && (anoleComponentModelAk = interfaceC1007930cKt.Ak()) != null) {
                        if (abstractC991850bux instanceof C991870buz) {
                            C1010390cOr c1010390cOr = this.LIZ;
                            c1010390cOr.getClass();
                            String str2 = anoleComponentModelAk.type;
                            if (Intrinsics.LJFF(str2, "search_product_anchor")) {
                                InterfaceC1007880cKo interfaceC1007880cKo = c1010390cOr.LLJILLL;
                                if (interfaceC1007880cKo != null) {
                                    c1009960cOALIZ = interfaceC1007880cKo.LIZ(c1010390cOr.LLILLL);
                                } else {
                                    c1009960cOALIZ = null;
                                }
                                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                sbLIZ2.append("logSearchAdAnoleAnchorShow eventTrackState?.trackedAnchorShow = ");
                                if (c1009960cOALIZ != null) {
                                    boolValueOf = Boolean.valueOf(c1009960cOALIZ.LIZ);
                                } else {
                                    boolValueOf = null;
                                }
                                sbLIZ2.append(boolValueOf);
                                C2188811AlT.LIZIZ(sbLIZ2);
                                if (c1009960cOALIZ != null && c1009960cOALIZ.LIZ) {
                                    return;
                                }
                                Map<String, ? extends Object> map = anoleComponentModelAk.data;
                                if (map != null) {
                                    obj2 = map.get("anchor_style");
                                }
                                if (Intrinsics.LJFF(obj2, EnumC1991207r4.IMAGE_ANCHOR.getValue())) {
                                    C1010580cPA c1010580cPALIZIZ = c1010390cOr.LL.LIZIZ();
                                    if (c1010580cPALIZIZ != null && (iSearchAdEventLogger4 = c1010580cPALIZIZ.LJ) != null) {
                                        C1009980cOC.LIZ.getClass();
                                        iSearchAdEventLogger4.logAd(C1009980cOC.LJJIIZI);
                                    }
                                } else {
                                    C1010580cPA c1010580cPALIZIZ2 = c1010390cOr.LL.LIZIZ();
                                    if (c1010580cPALIZIZ2 != null && (iSearchAdEventLogger3 = c1010580cPALIZIZ2.LJ) != null) {
                                        C1009980cOC.LIZ.getClass();
                                        iSearchAdEventLogger3.logAd(C1009980cOC.LJJIIJZLJL);
                                    }
                                }
                                if (c1009960cOALIZ == null) {
                                    return;
                                }
                                c1009960cOALIZ.LIZ = true;
                                return;
                            }
                            if (!Intrinsics.LJFF(str2, "search_cta")) {
                                return;
                            }
                            InterfaceC688220Qz6 interfaceC688220Qz6LJJI = C0R12.LIZIZ.LJJI();
                            Aweme aweme4 = c1010390cOr.LLILLL;
                            if (aweme4 != null) {
                                awemeRawAd2 = aweme4.getAwemeRawAd();
                            }
                            interfaceC688220Qz6LJJI.LIZIZ(awemeRawAd2);
                            return;
                        }
                        if (!(abstractC991850bux instanceof C1005320cGg)) {
                            return;
                        }
                        C1010390cOr c1010390cOr2 = this.LIZ;
                        c1010390cOr2.getClass();
                        if (!Intrinsics.LJFF(anoleComponentModelAk.type, "search_product_anchor")) {
                            return;
                        }
                        Map<String, ? extends Object> map2 = anoleComponentModelAk.data;
                        if (map2 != null) {
                            obj = map2.get("anchor_style");
                        }
                        if (Intrinsics.LJFF(obj, EnumC1991207r4.IMAGE_ANCHOR.getValue())) {
                            C1010580cPA c1010580cPALIZIZ3 = c1010390cOr2.LL.LIZIZ();
                            if (c1010580cPALIZIZ3 == null || (iSearchAdEventLogger2 = c1010580cPALIZIZ3.LJ) == null) {
                                return;
                            }
                            C1009980cOC.LIZ.getClass();
                            iSearchAdEventLogger2.logAd(C1009980cOC.LJJIJ);
                            return;
                        }
                        C1010580cPA c1010580cPALIZIZ4 = c1010390cOr2.LL.LIZIZ();
                        if (c1010580cPALIZIZ4 == null || (iSearchAdEventLogger = c1010580cPALIZIZ4.LJ) == null) {
                            return;
                        }
                        C1009980cOC.LIZ.getClass();
                        iSearchAdEventLogger.logAd(C1009980cOC.LJJIIZ);
                    }
                }

                @Override // X.InterfaceC1007910cKr
                public final boolean a3(String str, Runnable runnable, int i) {
                    if (this.LIZ.LIZ()) {
                        ViewGroup viewGroup = this.LIZ.LLIZLLLIL;
                        if (viewGroup != null) {
                            HandlerHook.viewPostDelay(viewGroup, runnable, i);
                        }
                        int i2 = C2510609se.LIZ;
                        return true;
                    }
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("registerPlayProgressObserver  progress= ");
                    sbLIZ.append(i);
                    sbLIZ.append(" videoDuration= ");
                    sbLIZ.append(this.LIZ.LLJIJIL);
                    C2188811AlT.LIZIZ(sbLIZ);
                    Long l = this.LIZ.LLJIJIL;
                    if (l == null) {
                        return false;
                    }
                    l.longValue();
                    C1010390cOr c1010390cOr = this.LIZ;
                    IVideoPlayTaskManager iVideoPlayTaskManager = c1010390cOr.LLJI;
                    if (iVideoPlayTaskManager != null) {
                        C988300bpE c988300bpE = new C988300bpE(str);
                        c988300bpE.LIZIZ(c1010390cOr.LLJIJIL.longValue());
                        c988300bpE.LIZJ = i;
                        c988300bpE.LIZLLL = runnable;
                        c988300bpE.LJ = false;
                        iVideoPlayTaskManager.LLIFFJFJJ(c988300bpE.LIZ());
                    }
                    IVideoPlayTaskManager iVideoPlayTaskManager2 = this.LIZ.LLJI;
                    if (iVideoPlayTaskManager2 != null) {
                        iVideoPlayTaskManager2.LL();
                    }
                    return true;
                }

                @Override // X.InterfaceC1007910cKr
                public final boolean h3(String str, InterfaceC1007930cKt interfaceC1007930cKt, AnoleComponentAppearModel anoleComponentAppearModel) {
                    InterfaceC657510Pqf interfaceC657510PqfLIZLLL;
                    C0Q17 c0q17LJIIJ;
                    if (!Intrinsics.LJFF(interfaceC1007930cKt.getType(), EnumC1008920cMU.SEARCH_EASTER_EGG.getType()) || ((interfaceC657510PqfLIZLLL = C655610Pnb.LIZIZ.LIZLLL()) != null && (c0q17LJIIJ = interfaceC657510PqfLIZLLL.LJIIJ()) != null && c0q17LJIIJ.LIZ(this.LIZ.LLILLJJLI))) {
                        return true;
                    }
                    return false;
                }
            }, new C1008160cLG(new InterfaceC1003440cDe() { // from class: X.0cOt
                @Override // X.InterfaceC1003440cDe
                public final boolean LIZLLL() {
                    return true;
                }

                @Override // X.InterfaceC1003440cDe
                public final void LJ(View view) {
                }

                @Override // X.InterfaceC1003440cDe
                public final void LJFF(String str) {
                }

                @Override // X.InterfaceC1003440cDe
                public final void LJI(View view) {
                }

                @Override // X.InterfaceC1003440cDe
                public final View LIZIZ() {
                    C1010580cPA c1010580cPA = this.LIZ.LLILZ;
                    if (c1010580cPA == null) {
                        return null;
                    }
                    InterfaceC1010250cOd interfaceC1010250cOd = c1010580cPA.LJI;
                    if (!(interfaceC1010250cOd instanceof InterfaceC1010560cP8)) {
                        interfaceC1010250cOd = null;
                    }
                    InterfaceC1010560cP8 interfaceC1010560cP8 = (InterfaceC1010560cP8) interfaceC1010250cOd;
                    if (interfaceC1010560cP8 != null) {
                        return interfaceC1010560cP8.LIZIZ();
                    }
                    return null;
                }

                @Override // X.InterfaceC1003440cDe
                public final Function0<Unit> LJII() {
                    return this.LIZ.LL.LIZ();
                }

                @Override // X.InterfaceC1003440cDe
                public final void LIZJ(View view, Integer num, Integer num2) {
                    C1004580cFU c1004580cFU;
                    C423340Giq.LIZIZ(view, num, num2);
                    C0R12.LIZIZ.LJIIIIZZ().LIZLLL(3, this.LIZ.LLILLL);
                    C1010580cPA c1010580cPALIZIZ = this.LIZ.LL.LIZIZ();
                    if (c1010580cPALIZIZ != null && (c1004580cFU = c1010580cPALIZIZ.LJFF) != null) {
                        c1004580cFU.LIZ = 3;
                    }
                }
            }, null, null, null, null, 30));
        }
        this.LLIZ = c1007900cKqLJI;
        if (c1007900cKqLJI != null) {
            c1007900cKqLJI.mount(this.LLIZLLLIL, "tt_search_bottom_slot", interfaceC1014340cVE);
            c1007900cKqLJI.LIZJ();
        }
    }

    @Override // X.InterfaceC1037910d7F
    public final void initialize() {
    }

    public final boolean LIZ() {
        Aweme aweme = this.LLILLL;
        if (aweme != null && C1010120cOQ.LJIL(aweme)) {
            return true;
        }
        Aweme aweme2 = this.LLILLL;
        return aweme2 != null && C1010120cOQ.LJJIFFI(aweme2);
    }

    public final void LIZIZ() {
        IAnoleManager iAnoleManager = this.LLIZ;
        if (iAnoleManager != null) {
            C995850c1P c995850c1P = C995850c1P.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("postEventToAnole,AnoleFromBusinessEvent= ");
            sbLIZ.append(c995850c1P);
            C2188811AlT.LIZIZ(sbLIZ);
            iAnoleManager.LJIIZILJ(c995850c1P);
        }
        this.LLJILJILJ = true;
    }

    @Override // X.InterfaceC1010520cP4
    public final void onViewDetachedFromWindow() {
        IAnoleManager iAnoleManager = this.LLIZ;
        if (iAnoleManager != null) {
            iAnoleManager.LIZ();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("hostWillDisAppear, aweme = ");
            Aweme aweme = this.LLILLL;
            sbLIZ.append(aweme != null ? aweme.getDesc() : null);
            C2188811AlT.LIZIZ(sbLIZ);
        }
        C1010790cPV c1010790cPV = this.LLJ;
        if (c1010790cPV != null) {
            c1010790cPV.onViewDetachedFromWindow();
        }
        this.LLJILJILJ = false;
    }

    @Override // X.InterfaceC1010520cP4
    public final void onViewAttachedToWindow() {
        boolean zLJI = MethodIDManager.LJI(202291);
        IAnoleManager iAnoleManager = this.LLIZ;
        if (iAnoleManager != null) {
            iAnoleManager.LIZJ();
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("hostWillAppear,aweme = ");
        Aweme aweme = this.LLILLL;
        sbLIZ.append(aweme != null ? aweme.getDesc() : null);
        sbLIZ.append(", currentItemView = ");
        sbLIZ.append(this.LLILZIL);
        C2188811AlT.LIZIZ(sbLIZ);
        C1010790cPV c1010790cPV = this.LLJ;
        if (c1010790cPV != null) {
            c1010790cPV.onViewAttachedToWindow();
        }
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    @Override // X.InterfaceC1010470cOz
    public final void ra() {
        if (LIZ()) {
            LIZIZ();
        }
    }

    @Override // X.InterfaceC1010530cP5
    public final /* bridge */ /* synthetic */ InterfaceC1010420cOu Mh() {
        return this.LL;
    }

    @Override // X.InterfaceC1010470cOz
    public final InterfaceC1010450cOx ne() {
        return this.LLJ;
    }

    public C1010390cOr(C1010400cOs c1010400cOs) {
        C19EG c19egLIZIZ;
        Long lValueOf;
        Video video;
        this.LL = c1010400cOs;
        Context context = c1010400cOs.LIZ;
        this.LLILLJJLI = context;
        Aweme aweme = c1010400cOs.LIZIZ;
        this.LLILLL = aweme;
        this.LLILZ = c1010400cOs.LJ.LL;
        this.LLILZIL = c1010400cOs.LIZJ;
        SAFHelper sAFHelper = SAFHelper.LIZ;
        View view = this.LLILZIL;
        if (context != null) {
            c19egLIZIZ = C1388190mED.LIZIZ(context);
        } else {
            c19egLIZIZ = null;
        }
        sAFHelper.getClass();
        this.LLILZLL = SAFHelper.LJIJI(view, c19egLIZIZ);
        if (aweme != null && (video = aweme.getVideo()) != null) {
            lValueOf = Long.valueOf(video.getDuration());
        } else {
            lValueOf = null;
        }
        this.LLJIJIL = lValueOf;
        this.LLJILJIL = C452501pT.LIZIZ(new AwS558S0100000_14(this, 1309));
        InterfaceC657510Pqf interfaceC657510PqfLIZLLL = C655610Pnb.LIZIZ.LIZLLL();
        this.LLJILLL = interfaceC657510PqfLIZLLL != null ? interfaceC657510PqfLIZLLL.LJIILIIL() : null;
    }

    @Override // X.InterfaceC1010470cOz
    public final void Ms(InterfaceC1010450cOx interfaceC1010450cOx) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("initObservers playerModule=");
        sbLIZ.append(interfaceC1010450cOx);
        C2188811AlT.LIZIZ(sbLIZ);
        int i = C2510609se.LIZ;
        this.LLJI = interfaceC1010450cOx.g70();
        C1009940cO8.LIZIZ(interfaceC1010450cOx, this.LLILZLL, C2097608Jq.LJIIIIZZ(new Pair(C1010930cPj.LIZ, new AwS560S0100000_16(this, 641)), new Pair(C1010900cPg.LIZ, new AwS560S0100000_16(this, 642)), new Pair(C1010920cPi.LIZ, new AwS560S0100000_16(this, 643))));
    }

    @Override // X.InterfaceC1010470cOz
    public final InterfaceC1010450cOx ik(InterfaceC1010860cPc interfaceC1010860cPc) {
        LifecycleCoroutineScope lifecycleScope;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("createPlayerModule() searchPlayerModule=");
        sbLIZ.append(this.LLJ);
        C2188811AlT.LIZIZ(sbLIZ);
        int i = C2510609se.LIZ;
        if (this.LLJ == null) {
            C1010790cPV c1010790cPVLIZ = C1010810cPX.LIZ(interfaceC1010860cPc);
            this.LLJ = c1010790cPVLIZ;
            this.LLJI = c1010790cPVLIZ.g70();
            LifecycleOwner lifecycleOwner = this.LLILZLL;
            if (lifecycleOwner != null && (lifecycleScope = LifecycleOwnerKt.getLifecycleScope(lifecycleOwner)) != null) {
                C23250099c.LIZLLL(lifecycleScope, null, null, new C860250Xot(this, null), 3);
            }
        }
        return this.LLJ;
    }

    @Override // X.InterfaceC1010470cOz
    public final void r90(ViewGroup viewGroup) {
        this.LLIZLLLIL = viewGroup;
    }
}
