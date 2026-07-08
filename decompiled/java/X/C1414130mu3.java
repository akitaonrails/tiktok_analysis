package X;

import Y.ACListenerS156S0100000_22;
import Y.ALAdapterS18S0100000_22;
import Y.AObjectS245S0100000_22;
import Y.AUListenerS265S0100000_16;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.PointF;
import android.hardware.display.DisplayManager;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSPtr;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.creative.model.AutoCutThemeData;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.PhotoModeEditingStage;
import com.ss.android.ugc.aweme.creative.model.edit.mixediting.EffectMobParams;
import com.ss.android.ugc.aweme.creative.model.edit.mixediting.MixEditingMaterialType;
import com.ss.android.ugc.aweme.creative.model.edit.mixediting.MixEditingModel;
import com.ss.android.ugc.aweme.creative.model.edit.mixediting.SelectMethodType;
import com.ss.android.ugc.aweme.creative.model.edit.mixediting.SelectedMaterialItem;
import com.ss.android.ugc.aweme.creative.model.edit.mixediting.TemplateMobParams;
import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import com.ss.android.ugc.aweme.creative.model.music.MusicBuzModel;
import com.ss.android.ugc.aweme.effect.EffectPointModel;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.music.model.MusicBeanUtilKt;
import com.ss.android.ugc.aweme.offline.tools.debug.gp.IToolsDebugGpService;
import com.ss.android.ugc.aweme.shortvideo.ScreenUtils;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.u4;
import com.ss.android.ugc.aweme.utils.oh;
import com.ss.android.ugc.effectmanager.effect.model.Asset;
import com.ss.android.ugc.effectmanager.effect.model.AssetConsumerType;
import com.ss.android.ugc.effectmanager.effect.model.AssetFrom;
import com.ss.android.ugc.effectmanager.effect.model.BusinessExtra;
import com.ss.android.ugc.gamora.editor.mixediting.experiments.MixEditingPerformanceImproveExperiment;
import com.ss.android.ugc.tiktok.tools.performance.api.settings.LazyLoadEditLazyGroupPhase1;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS210S0000000_22;
import kotlin.jvm.internal.AwS139S0110000_22;
import kotlin.jvm.internal.AwS566S0100000_22;
import kotlin.jvm.internal.AwS601S0100000_22;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0mu3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public class C1414130mu3 extends AbstractC1664490tPr<C1413890mtf, C1413570mt9> implements InterfaceC379610EuV {
    public static final C1414360muQ LLLLZLLIL;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLLZLLLI;
    public static final int LLLZ;
    public static final int LLLZI;
    public static final int LLLZIIL;
    public static final int LLLZIL;
    public final C1DRG LLJJJIL;
    public final VideoPublishEditModel LLJJJJ;
    public View LLJJJJJIL;
    public LinearLayout LLJJJJLIIL;
    public LinearLayout LLJJL;
    public LinearLayout LLJJLIIIJLLLLLLLZ;
    public View LLJL;
    public TuxIconView LLJLIL;
    public TuxTextView LLJLILLLLZIIL;
    public View LLJLL;
    public View LLJLLIL;
    public C370670Eg5 LLJLLL;
    public C1415640mwU LLJZ;
    public FrameLayout LLJZIJLIL;
    public C19671011xk LLL;
    public View LLLF;
    public View LLLFF;
    public TuxTextView LLLFFI;
    public final C1664750tQH LLLIIII;
    public final C1664740tQG LLLIIIIL;
    public final C1664740tQG LLLIIIL;
    public final C1664740tQG LLLIIL;
    public final C1664740tQG LLLIILIL;
    public final C1664750tQH LLLILZ;
    public final C1664750tQH LLLIZZ;
    public final C1664740tQG LLLJ;
    public final C1664740tQG LLLJIL;
    public final C1664740tQG LLLJL;
    public final boolean LLLLII;
    public boolean LLLLIIIILLL;
    public boolean LLLLIIL;
    public boolean LLLLIILL;
    public boolean LLLLIILLL;
    public String LLLLIL;
    public boolean LLLLILI;
    public boolean LLLLJ;
    public boolean LLLLJI;
    public boolean LLLLL;
    public boolean LLLLLIL;
    public boolean LLLLLILLIL;
    public C0ZDN LLLLLJIL;
    public int LLLLLJLJLL;
    public boolean LLLLLL;
    public boolean LLLLLLIL;
    public String LLLLLLJ;
    public final C01GW LLLLLLL;
    public boolean LLLLLLLLL;
    public final C1414330muN LLLLLLLLLL;
    public final C1414170mu7 LLLLLLLZIL;
    public final C1412240mr0 LLLLLLZ;
    public final C1412970msB LLLLLLZZ;
    public final C1412820mrw LLLLLZ;
    public final C1414060mtw LLLLLZIL;
    public DisplayManager LLLLLZL;
    public int LLLLZ;
    public final C1414160mu6 LLLLZI;
    public final ValueAnimator LLLLZIL;
    public final ValueAnimator LLLLZLL;
    public final C1419050n1z LLLFZ = new C1419050n1z();
    public int LLLI = -1;
    public final ArrayList<C1412800mru> LLLII = new ArrayList<>();
    public final MutableLiveData<InterfaceC1417050myl> LLLIL = new MutableLiveData<>(null);
    public final C01GW LLLILZJ = C452501pT.LIZIZ(new AwS566S0100000_22(this, 1086));
    public final C01GW LLLILZLLLI = C452501pT.LIZIZ(new AwS566S0100000_22(this, 1087));
    public final C01GW LLLL = C452501pT.LIZIZ(new AwS566S0100000_22(this, 1085));

    public final void LLLLLLJ() {
        InterfaceC1455610nyx interfaceC1455610nyx;
        if (Intrinsics.LJFF(LLLLILI().LIZ(new C2217381BqS() { // from class: X.0mtY
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1413890mtf) obj).LIZIZ;
            }
        }).LIZJ(), Boolean.TRUE)) {
            if (C1414450muZ.LIZLLL(this.LLLII)) {
                C1415640mwU c1415640mwU = this.LLJZ;
                if (c1415640mwU != null) {
                    C1415640mwU.LIZJ(c1415640mwU, 0);
                }
            } else {
                C1415640mwU c1415640mwU2 = this.LLJZ;
                if (c1415640mwU2 != null) {
                    PointF pointFComputeScrollVectorForPosition = c1415640mwU2.LLILLL.computeScrollVectorForPosition(0);
                    if (pointFComputeScrollVectorForPosition != null) {
                        float f = 50;
                        c1415640mwU2.LLILZ.LJIILL = f / Math.abs(c1415640mwU2.computeHorizontalScrollOffset() - pointFComputeScrollVectorForPosition.x);
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("MixEditingMaterialRecyclerView -> speedPerPixel = ");
                        sbLIZ.append(f / (c1415640mwU2.computeHorizontalScrollOffset() - pointFComputeScrollVectorForPosition.x));
                        C201955140j.LIZ(C2188811AlT.LIZIZ(sbLIZ));
                    }
                    C1440450naV c1440450naV = c1415640mwU2.LLILZ;
                    c1440450naV.LIZ = 0;
                    c1415640mwU2.LLILLL.startSmoothScroll(c1440450naV);
                    C0ZDN c0zdn = c1415640mwU2.LLIZ;
                    if (c0zdn != null) {
                        c0zdn.LIZ(0);
                    }
                }
            }
            LLZLLIL(this, 0, true, false, false, null, 28);
        } else {
            k(0);
            f();
            if (C301690Bs7.LIZ() && (interfaceC1455610nyx = (InterfaceC1455610nyx) this.LLLIIIIL.getValue(this, LLLLZLLLI[1])) != null) {
                interfaceC1455610nyx.refresh();
            }
        }
        LLLLIL().LJIIJ.invoke();
    }

    public void LLLZI() {
    }

    /* JADX WARN: Type inference failed for: r0v20, types: [X.0muQ] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1414130mu3.class, "editPreviewApi", "getEditPreviewApi$tools_camera_edit_release()Lcom/ss/android/ugc/gamora/editor/preview/TiktokEditPreviewApi;", 0);
        C13LE.LIZ.getClass();
        LLLLZLLLI = new InterfaceC2217461Bqa[]{c2217381BqS, new C2217381BqS(C1414130mu3.class, "toolbarApi", "getToolbarApi$tools_camera_edit_release()Lcom/ss/android/ugc/gamora/editor/toolbar/EditToolbarApi;", 0), new C2217381BqS(C1414130mu3.class, "editControlApi", "getEditControlApi$tools_camera_edit_release()Lcom/ss/android/ugc/aweme/shortvideo/edit/editcontrol/EditControlApi;", 0), new C2217381BqS(C1414130mu3.class, "autoCutPreloadApi", "getAutoCutPreloadApi$tools_camera_edit_release()Lcom/ss/android/ugc/aweme/autocut/AutoCutPreloadingApi;", 0), new C2217381BqS(C1414130mu3.class, "editAutoCutApi", "getEditAutoCutApi$tools_camera_edit_release()Lcom/ss/android/ugc/aweme/shortvideo/autocut/EditAutoCutApi;", 0), new C2217381BqS(C1414130mu3.class, "videoPicCountHolder", "getVideoPicCountHolder$tools_camera_edit_release()Lcom/ss/android/ugc/gamora/editor/mixediting/eventtrack/MixEditingCurrentEditModelVideoPicCountHolder;", 0), new C2217381BqS(C1414130mu3.class, "imageEditData", "getImageEditData$tools_camera_edit_release()Lcom/ss/android/ugc/aweme/image/switchmode/ImageEditPageData;", 0), new C2217381BqS(C1414130mu3.class, "imageVideoSeparateModeSwitchApi", "getImageVideoSeparateModeSwitchApi$tools_camera_edit_release()Lcom/ss/android/ugc/aweme/image/switchmode/ImageVideoSeparateModeSwitchApi;", 0), new C2217381BqS(C1414130mu3.class, "mixEditingDataApi", "getMixEditingDataApi$tools_camera_edit_release()Lcom/ss/android/ugc/gamora/editor/mixediting/MixEditingMaterialDataApi;", 0), new C2217381BqS(C1414130mu3.class, "mixEditingAssetsApi", "getMixEditingAssetsApi$tools_camera_edit_release()Lcom/ss/android/ugc/gamora/editor/mixediting/MixEditingAssetsApi;", 0)};
        LLLLZLLIL = new Object() { // from class: X.0muQ
        };
        LLLZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20));
        LLLZI = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(68));
        LLLZIIL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(88));
        LLLZIL = C0C64.LJIILLIIL().LJIJ(31744, 50, "studio_mix_material_recommend_item_total_count", true);
    }

    public final void LLLLLLIL() {
        C1412860ms0 c1412860ms0LIZ;
        AbstractC1412880ms2 abstractC1412880ms2;
        C1412800mru c1412800mruLLLFZ = this.LLLFZ.LLLFZ(this.LLLI);
        if (c1412800mruLLLFZ == null || (c1412860ms0LIZ = c1412800mruLLLFZ.LIZ()) == null || (abstractC1412880ms2 = c1412860ms0LIZ.LIZIZ) == null || abstractC1412880ms2.LIZ) {
            return;
        }
        c1412800mruLLLFZ.LJ = null;
    }

    public final boolean LLLLLLLZIL() {
        return C1428470nHB.LJLLLLLL(this.LLJJJJ) && C311000CHa.LIZ(this.LLJJJJ);
    }

    public final boolean LLLLLLZZ() {
        return ((Boolean) this.LLLL.getValue()).booleanValue();
    }

    public final InterfaceC1446740nke LLLLLZ() {
        return (InterfaceC1446740nke) this.LLLIIII.getValue(this, LLLLZLLLI[0]);
    }

    public final InterfaceC1413730mtP LLLLLZL() {
        return (InterfaceC1413730mtP) this.LLLJIL.getValue(this, LLLLZLLLI[8]);
    }

    public int LLLLZ() {
        if (!this.LLLLJ) {
            int i = this.LLLI;
            if (i >= 0) {
                return i;
            }
            return 0;
        }
        if (C1428470nHB.LJLLLLLL(this.LLJJJJ) && this.LLLLL) {
            if (!C1414450muZ.LIZLLL(this.LLLII)) {
                return 1;
            }
            Iterator<C1412800mru> it2 = this.LLLII.iterator();
            int i2 = 0;
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                if (it2.next().LIZ != MixEditingMaterialType.SOUND_SYNC) {
                    i2++;
                } else if (i2 != -1) {
                    return i2;
                }
            }
            return 1;
        }
        if (this.LLLLJ) {
            C1414930mvL c1414930mvL = C1414930mvL.LIZ;
            VideoPublishEditModel videoPublishEditModel = this.LLJJJJ;
            c1414930mvL.getClass();
            if (C1414930mvL.LJIIJJI(videoPublishEditModel).enableDefaultApply == 2) {
                return 1;
            }
        }
        int i3 = this.LLLI;
        if (i3 >= 0) {
            return i3;
        }
        if (Intrinsics.LJFF(LLLLILI().LIZ(C1413940mtk.LL).LIZJ(), Boolean.TRUE)) {
            return 0;
        }
        if (this.LLLLJ && u4.LJJJJIZL(this.LLJJJJ)) {
            return 0;
        }
        if (this.LLLLJ && LLLLILI().LIZ.LJJIFFI) {
            return 0;
        }
        if (!C1414450muZ.LIZLLL(this.LLLII)) {
            return 1;
        }
        for (C1412800mru c1412800mru : this.LLLII) {
            if (c1412800mru.LIZ != MixEditingMaterialType.CANCEL_TYPE) {
                if (c1412800mru != null) {
                    return this.LLLII.indexOf(c1412800mru);
                }
                return 0;
            }
        }
        return 0;
    }

    public final C1412740mro LLLLZIL() {
        return (C1412740mro) this.LLLILZ.getValue(this, LLLLZLLLI[5]);
    }

    public final void LLLLZLL() {
        C1414130mu3 c1414130mu3 = this.LLLLLZIL.LIZ;
        C337180DJs.LIZ(c1414130mu3.LLL);
        C337180DJs.LIZ(c1414130mu3.LLLFF);
        c1414130mu3.e(false);
    }

    public final void LLLLZLLIL() {
        C1414130mu3 c1414130mu3 = this.LLLLLLLZIL.LIZ;
        C201955140j.LIZJ(C0MJ8.LIZIZ, "hideMaterialPanel");
        FrameLayout frameLayout = c1414130mu3.LLJZIJLIL;
        boolean z = frameLayout != null && frameLayout.getVisibility() == 0;
        c1414130mu3.h();
        if (Intrinsics.LJFF(c1414130mu3.LLLLILI().LIZ(new C2217381BqS() { // from class: X.0mtx
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1413890mtf) obj).LJIILL;
            }
        }).LIZJ(), Boolean.FALSE)) {
            C201955140j.LIZ("MaterialSceneObserverDelegate -> hideMaterialPanel -> fetchAllPanelDataSucceed = false; showFetchAgain()");
            C1414130mu3 c1414130mu32 = c1414130mu3.LLLLLZ.LIZ;
            C337180DJs.LIZ(c1414130mu32.LLJJL);
            C337180DJs.LIZ(c1414130mu32.LLJL);
            C337180DJs.LIZ(c1414130mu32.LLJLLL);
            C337180DJs.LIZJ(c1414130mu32.LLJJLIIIJLLLLLLLZ);
            InterfaceC1417110myr interfaceC1417110myr = (InterfaceC1417110myr) c1414130mu3.LLLIIL.getValue(c1414130mu3, LLLLZLLLI[3]);
            if (interfaceC1417110myr != null) {
                interfaceC1417110myr.dZ0();
            }
        } else if (!c1414130mu3.c()) {
            C201955140j.LIZ("MaterialSceneObserverDelegate -> hideMaterialPanel -> selectRealMaterial() = false; showEntrance()");
            C337180DJs.LIZ(c1414130mu3.LLLFFI);
            c1414130mu3.f();
        } else if (c1414130mu3.LLLLLLLZIL()) {
            c1414130mu3.f();
        } else {
            c1414130mu3.g();
        }
        C337180DJs.LIZ(c1414130mu3.LLJZIJLIL);
        c1414130mu3.n(false, z);
        c1414130mu3.LLLLIILL = true;
        C1415640mwU c1415640mwU = c1414130mu3.LLJZ;
        if (c1415640mwU != null) {
            C12C5.LIZJ(c1415640mwU, 66L, C1619980sG4.LJIIIZ(), new AwS566S0100000_22(c1414130mu3, 1096), 2);
        }
    }

    public final void LLLZ() {
        for (int i = LLLZIL; i > 0; i--) {
            this.LLLII.add(new C1412800mru(MixEditingMaterialType.UNKNOWN_TYPE, "", null, null, null, false, null, null, null, false, null, 0, null, false, null, null, 65532));
        }
        if (LLLLLLZZ()) {
            this.LLLLLIL = true;
        }
        if (C0MQ1.LIZ() && C1414940mvM.LJ(this.LLJJJJ)) {
            this.LLLLLIL = true;
        }
        if (C1414940mvM.LIZLLL(this.LLJJJJ)) {
            this.LLLLLIL = true;
        }
    }

    public final boolean LLLZIL() {
        C1414130mu3 c1414130mu3 = this.LLLLLZIL.LIZ;
        return c1414130mu3.LLLLII && Intrinsics.LJFF(c1414130mu3.LLLLILI().LIZ(new C2217381BqS() { // from class: X.0muF
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1413890mtf) obj).LJIIZILJ;
            }
        }).LIZJ(), Boolean.TRUE) && !((Boolean) c1414130mu3.LLLLILI().LIZ(new C2217381BqS() { // from class: X.0mts
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C1413890mtf) obj).LJIILLIIL);
            }
        }).LIZJ()).booleanValue();
    }

    public final boolean LLLZLL() {
        C1415640mwU c1415640mwU = this.LLJZ;
        return (c1415640mwU == null || c1415640mwU.getVisibility() != 0 || this.LLLLIILL) ? false : true;
    }

    public final void LLLZLZ() {
        int i = this.LLLI;
        if (i < 0 || i >= this.LLLII.size()) {
            return;
        }
        C1412800mru c1412800mru = (C1412800mru) ListProtector.get(this.LLLII, this.LLLI);
        if (c1412800mru.LIZ != MixEditingMaterialType.EFFECT_TYPE) {
            return;
        }
        Iterator<EffectMobParams> it2 = this.LLJJJJ.creativeModel.mixEditingModel.effectMobParamsList.iterator();
        while (it2.hasNext()) {
            EffectMobParams next = it2.next();
            next.isMixEditRecommend = true;
            if (Intrinsics.LJFF(c1412800mru.LIZIZ(), next.effectId)) {
                C0FPZ c0fpz = C0FPZ.LIZ;
                VideoPublishEditModel videoPublishEditModel = this.LLJJJJ;
                AwS566S0100000_22 awS566S0100000_22 = new AwS566S0100000_22(this, 1089);
                c0fpz.getClass();
                C0FPZ.LIZ(videoPublishEditModel, next, awS566S0100000_22);
                it2.remove();
            }
        }
    }

    public final boolean LLZ() {
        C1414930mvL c1414930mvL = C1414930mvL.LIZ;
        VideoPublishEditModel videoPublishEditModel = this.LLJJJJ;
        c1414930mvL.getClass();
        if (!C1414930mvL.LJI(videoPublishEditModel) || p().size() == 0) {
            return (C0EYU.LIZ(LLLLLZ().g().getValue(), this.LLJJJJ) || C1414450muZ.LJIILIIL(this.LLJJJJ) || C1414450muZ.LJIIJJI(this.LLJJJJ)) ? false : true;
        }
        return false;
    }

    public final void LLZIL() {
        ViewPropertyAnimator viewPropertyAnimatorLIZIZ;
        if (!this.LLLLIIL) {
            LLZLI("panel_open");
            this.LLLLIIL = true;
        }
        C1414130mu3 c1414130mu3 = this.LLLLLLLZIL.LIZ;
        C201955140j.LIZJ(C0MJ8.LIZIZ, "openMaterialPanel");
        LLZLLLL(c1414130mu3, false, false, 3);
        c1414130mu3.n(true, false);
        c1414130mu3.LLLLIILL = false;
        C1415640mwU c1415640mwU = c1414130mu3.LLJZ;
        if (c1415640mwU != null && (viewPropertyAnimatorLIZIZ = C12C5.LIZIZ(c1415640mwU, 66L, 0.0f, C1619980sG4.LJIIIZ(), 2)) != null) {
            viewPropertyAnimatorLIZIZ.setListener(new ALAdapterS18S0100000_22(c1414130mu3, 6));
        }
        c1414130mu3.LLLLJ = false;
        c1414130mu3.LLLLLJLJLL = -1;
    }

    public final void LLZLL() {
        if (C1414450muZ.LIZLLL(this.LLLII) && C565160MEo.LIZJ(this.LLJJJJ)) {
            return;
        }
        this.LLLII.clear();
        LLLZ();
        d(this.LLLII);
        i();
    }

    public final boolean c() {
        C0MJ8 c0mj8 = C0MJ8.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MaterialPanelScene -> selectRealMaterial: currentSelectedIndex = ");
        sbLIZ.append(this.LLLI);
        C201955140j.LIZJ(c0mj8, C2188811AlT.LIZIZ(sbLIZ));
        int i = this.LLLI;
        if (i < 0 || i >= this.LLLFZ.getItemCount()) {
            return false;
        }
        C1412800mru c1412800mruLLLFZ = this.LLLFZ.LLLFZ(this.LLLI);
        if ((c1412800mruLLLFZ != null ? c1412800mruLLLFZ.LIZ : null) == MixEditingMaterialType.UNKNOWN_TYPE) {
            return false;
        }
        C1412800mru c1412800mruLLLFZ2 = this.LLLFZ.LLLFZ(this.LLLI);
        return (c1412800mruLLLFZ2 != null ? c1412800mruLLLFZ2.LIZ : null) != MixEditingMaterialType.CANCEL_TYPE;
    }

    public final void f() {
        C1414130mu3 c1414130mu3 = this.LLLLLZ.LIZ;
        C337180DJs.LIZ(c1414130mu3.LLJJLIIIJLLLLLLLZ);
        C337180DJs.LIZ(c1414130mu3.LLJL);
        C337180DJs.LIZ(c1414130mu3.LLJLLL);
        C337180DJs.LIZJ(c1414130mu3.LLJJL);
    }

    public final void g() {
        C1414130mu3 c1414130mu3 = this.LLLLLZ.LIZ;
        C337180DJs.LIZ(c1414130mu3.LLJJL);
        C337180DJs.LIZ(c1414130mu3.LLJJLIIIJLLLLLLLZ);
        C337180DJs.LIZJ(c1414130mu3.LLJL);
        C337180DJs.LIZJ(c1414130mu3.LLJLLL);
    }

    public final void h() {
        ViewPropertyAnimator viewPropertyAnimatorAnimate;
        LinearLayout linearLayout;
        ViewPropertyAnimator viewPropertyAnimatorAnimate2;
        C0MJ8 c0mj8 = C0MJ8.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("showTitleContainerWithAnimation: delayShowContainer = ");
        sbLIZ.append(LLLLLLZZ());
        sbLIZ.append(", titleContainer?.visibility = ");
        LinearLayout linearLayout2 = this.LLJJJJLIIL;
        sbLIZ.append(linearLayout2 != null ? Integer.valueOf(linearLayout2.getVisibility()) : null);
        sbLIZ.append(", isTitleContainerFadingOut = ");
        sbLIZ.append(this.LLLLIILLL);
        C201955140j.LIZJ(c0mj8, C2188811AlT.LIZIZ(sbLIZ));
        if (LLLLLLZZ() && (linearLayout = this.LLJJJJLIIL) != null && (viewPropertyAnimatorAnimate2 = linearLayout.animate()) != null) {
            viewPropertyAnimatorAnimate2.cancel();
        }
        LinearLayout linearLayout3 = this.LLJJJJLIIL;
        if (linearLayout3 == null || linearLayout3.getVisibility() != 0 || this.LLLLIILLL) {
            if (this.LLLLIILLL) {
                this.LLLLIILLL = false;
                LinearLayout linearLayout4 = this.LLJJJJLIIL;
                if (linearLayout4 != null && (viewPropertyAnimatorAnimate = linearLayout4.animate()) != null) {
                    viewPropertyAnimatorAnimate.cancel();
                }
            }
            LinearLayout linearLayout5 = this.LLJJJJLIIL;
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) (linearLayout5 != null ? linearLayout5.getLayoutParams() : null);
            if (C295860Bii.LIZ()) {
                marginLayoutParams.bottomMargin = LLLZLL() ? LLLZIIL : 0;
            } else {
                marginLayoutParams.bottomMargin = LLLZLL() ? LLLZI : 0;
            }
            LinearLayout linearLayout6 = this.LLJJJJLIIL;
            if (linearLayout6 != null) {
                C786410Ut5.d6(linearLayout6, marginLayoutParams);
            }
            this.LLLLIILLL = false;
            LinearLayout linearLayout7 = this.LLJJJJLIIL;
            if (linearLayout7 != null) {
                C12C5.LIZIZ(linearLayout7, 50L, 0.0f, C1619980sG4.LJIIIZ(), 2);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x013b, code lost:
    
        if (r1 != false) goto L34;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0353  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0418  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x042b  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x045c  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x048d  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x04ad  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x04e1  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x04fe  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x0527  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x0544  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:355:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0167  */
    /* JADX WARN: Type inference failed for: r11v1, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r11v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r11v3, types: [java.util.ArrayList] */
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
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i() {
        /*
            Method dump skipped, instruction units count: 1383
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1414130mu3.i():void");
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, com.bytedance.scene.Scene
    public final void onDestroyView() {
        DisplayManager displayManager = this.LLLLLZL;
        if (displayManager != null) {
            displayManager.unregisterDisplayListener(this.LLLLZI);
        }
        super.onDestroyView();
    }

    public final ArrayList<EffectPointModel> p() {
        C348100Dkm c348100DkmLIZIZ;
        C348100Dkm c348100DkmLIZIZ2;
        NLEEditor nLEEditor;
        C356830Dyr c356830Dyr;
        List<NLETrack> listLJIJI;
        VecNLETrackSPtr tracks;
        ArrayList<EffectPointModel> arrayList = new ArrayList<>();
        InterfaceC1452170ntP value = LLLLLZ().g().getValue();
        if (value != null && (c348100DkmLIZIZ = C352130DrH.LIZIZ(value)) != null && (c348100DkmLIZIZ2 = C352130DrH.LIZIZ(value)) != null && (nLEEditor = c348100DkmLIZIZ2.LIZ) != null) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            Iterator it2 = ((ArrayList) C348370DlD.LIZIZ(nLEEditor.getModel())).iterator();
            while (it2.hasNext()) {
                arrayList.add(C363510EMz.LIZ((C348380DlE) it2.next(), false, c348100DkmLIZIZ.LJIIIIZZ().getDuration()));
            }
            EffectPointModel effectPointModel = (EffectPointModel) C13LP.LJJJLL(LLLLLZ().o9());
            if (effectPointModel != null) {
                effectPointModel.setMagic(true);
                arrayList.add(effectPointModel);
            }
            NLEModel model = nLEEditor.getModel();
            if (model != null && (tracks = model.getTracks()) != null && !tracks.isEmpty()) {
                Iterator<NLETrack> it3 = tracks.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        break;
                    }
                    if (Intrinsics.LJFF(C348350DlB.LJI(it3.next()), "TIME")) {
                        EffectPointModel effectPointModel2 = new EffectPointModel();
                        effectPointModel2.setType(2);
                        arrayList.add(effectPointModel2);
                        break;
                    }
                }
            }
            InterfaceC356850Dyt interfaceC356850DytAz1 = LLLLLZ().az1();
            if ((interfaceC356850DytAz1 instanceof C356830Dyr) && (c356830Dyr = (C356830Dyr) interfaceC356850DytAz1) != null && (listLJIJI = c356830Dyr.LJIJI()) != null && !listLJIJI.isEmpty()) {
                EffectPointModel effectPointModel3 = new EffectPointModel();
                effectPointModel3.setType(9);
                arrayList.add(effectPointModel3);
            }
            long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
            C201955140j.LIZJ(C0MJ8.LIZIZ, "calculate effect list cost " + jCurrentTimeMillis2 + "ms");
        }
        return arrayList;
    }

    public void LLLLLJLJLL() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("VideoMixEditingMaterialScene -> uiStates[VideoMixEditingMaterialStates::soundSyncLoadingDismiss].value = ");
        sbLIZ.append(((Boolean) LLLLILI().LIZ(new C2217381BqS() { // from class: X.0mu0
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C1413890mtf) obj).LJIILLIIL);
            }
        }).LIZJ()).booleanValue());
        C201955140j.LJ(C2188811AlT.LIZIZ(sbLIZ));
        VideoPublishEditModel videoPublishEditModel = this.LLJJJJ;
        boolean z = true;
        if (u4.LJJZ(videoPublishEditModel)) {
            C1414930mvL.LIZ.getClass();
            if (C1414930mvL.LIZIZ(videoPublishEditModel) && C1414930mvL.LJIIIZ(videoPublishEditModel)) {
                if (((Boolean) LLLLILI().LIZ(new C2217381BqS() { // from class: X.0mu1
                    @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                    public final Object get(Object obj) {
                        return Boolean.valueOf(((C1413890mtf) obj).LJIILLIIL);
                    }
                }).LIZJ()).booleanValue() || this.LLLLII) {
                    InterfaceC377540ErA interfaceC377540ErA = (InterfaceC377540ErA) this.LLLILZLLLI.getValue();
                    if (interfaceC377540ErA == null || !interfaceC377540ErA.isShowing()) {
                        LLLLIL().LJIIL.invoke(Boolean.TRUE);
                    }
                    if (LLLLLLZZ()) {
                        m(false);
                        return;
                    }
                    Function1<Boolean, Unit> function1 = LLLLIL().LJIILIIL;
                    if (!this.LLLLLIL && !u4.LJJZ(this.LLJJJJ)) {
                        z = false;
                    }
                    function1.invoke(Boolean.valueOf(z));
                    return;
                }
                return;
            }
        }
        if (C0MQ1.LIZ() && C1414940mvM.LJ(this.LLJJJJ) && !LLLLLLZZ()) {
            this.LLLLLLIL = false;
            Function1<Boolean, Unit> function12 = LLLLIL().LJIILIIL;
            if (!this.LLLLLIL && !u4.LJJZ(this.LLJJJJ)) {
                z = false;
            }
            function12.invoke(Boolean.valueOf(z));
            return;
        }
        if (C1414940mvM.LIZLLL(this.LLJJJJ) && !LLLLLLZZ()) {
            this.LLLLLLIL = false;
            LLLLIL().LJIILIIL.invoke(Boolean.valueOf(this.LLLLLIL));
            return;
        }
        C1414930mvL c1414930mvL = C1414930mvL.LIZ;
        VideoPublishEditModel videoPublishEditModel2 = this.LLJJJJ;
        c1414930mvL.getClass();
        if (!C1414930mvL.LIZIZ(videoPublishEditModel2) || LLLLLLZZ()) {
            i();
            this.LLLLIILLL = false;
            if (LLLLLLZZ()) {
                C337180DJs.LIZJ(this.LLJJJJLIIL);
                return;
            }
            return;
        }
        if (Intrinsics.LJFF(LLLLILI().LIZ(new C2217381BqS() { // from class: X.0mtz
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1413890mtf) obj).LJIILL;
            }
        }).LIZJ(), Boolean.TRUE) || this.LLJJJJ.getEnterFromImageSwitch()) {
            this.LLLLLLIL = false;
            Function1<Boolean, Unit> function13 = LLLLIL().LJIILIIL;
            if (!this.LLLLLIL && !u4.LJJZ(this.LLJJJJ)) {
                z = false;
            }
            function13.invoke(Boolean.valueOf(z));
        }
    }

    public final boolean LLLZZ() {
        boolean zO = o();
        boolean zLLZ = LLZ();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("VideoMixEditingMaterialScene -> updateContainerTitle: useMultiMaterials() = ");
        sbLIZ.append(zO);
        sbLIZ.append("; noneMaterial() = ");
        sbLIZ.append(zLLZ);
        C201955140j.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        return zO || zLLZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0181  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean o() {
        /*
            Method dump skipped, instruction units count: 403
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1414130mu3.o():boolean");
    }

    @Override // com.bytedance.scene.Scene
    public final void onPause() {
        super.onPause();
        oh.LJ("edit_mixed_asset_carousel");
    }

    @Override // X.InterfaceC379610EuV
    public final C1DRG getDiContainer() {
        return this.LLJJJIL;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void LLLLLJIL(boolean r6) {
        /*
            Method dump skipped, instruction units count: 229
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1414130mu3.LLLLLJIL(boolean):void");
    }

    public final void LLLLZLLLI(boolean z) {
        long j;
        LinearLayout linearLayout = this.LLJJJJLIIL;
        if (linearLayout != null && linearLayout.getVisibility() == 8) {
            return;
        }
        C0MJ8 c0mj8 = C0MJ8.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("hideTitleContainerWithAnimation: ");
        sbLIZ.append(z);
        C201955140j.LIZJ(c0mj8, C2188811AlT.LIZIZ(sbLIZ));
        this.LLLLIILLL = true;
        LinearLayout linearLayout2 = this.LLJJJJLIIL;
        if (linearLayout2 != null) {
            if (z) {
                j = 0;
            } else {
                j = 50;
            }
            C12C5.LIZJ(linearLayout2, j, C1619980sG4.LJIIIZ(), new AwS566S0100000_22(this, 1088), 2);
        }
    }

    public final boolean LLLZIIL(String str) {
        C1414130mu3 c1414130mu3 = this.LLLLLLZ.LIZ;
        int i = c1414130mu3.LLLI;
        if (i >= 0 && i < c1414130mu3.LLLII.size()) {
            return Intrinsics.LJFF(str, ((C1412800mru) ListProtector.get(c1414130mu3.LLLII, c1414130mu3.LLLI)).LIZIZ());
        }
        return false;
    }

    public final boolean LLLZZIL(C1412800mru c1412800mru) {
        if (C1428470nHB.LJLLLLLL(this.LLJJJJ) && this.LLLLL && c1412800mru.LIZ == MixEditingMaterialType.SOUND_SYNC && c1412800mru.LJII == SelectMethodType.AUTO) {
            return true;
        }
        return false;
    }

    public void LLZL(String str) {
        C201955140j.LIZLLL(C0MJ8.LIZIZ, "MaterialPanelScene", str);
    }

    public final void LLZLI(String str) {
        C1412440mrK c1412440mrK = C1412440mrK.LIZ;
        VideoPublishEditModel videoPublishEditModel = this.LLJJJJ;
        AwS566S0100000_22 awS566S0100000_22 = new AwS566S0100000_22(this, 1090);
        c1412440mrK.getClass();
        C0LAB c0labLIZLLL = C1412440mrK.LIZLLL(videoPublishEditModel, awS566S0100000_22);
        c0labLIZLLL.LIZ(1, "use_delegates");
        c0labLIZLLL.LJ("event", str);
        InterfaceC1452170ntP value = LLLLLZ().g().getValue();
        c0labLIZLLL.LJ("template_type", C1416310mxZ.LJJIJIIJI(this.LLJJJJ, null, true));
        c0labLIZLLL.LIZ(C0EYU.LIZ(value, this.LLJJJJ) ? 1 : 0, "using_template");
        C20684815ws.LJIILLIIL("auto_edit_mix_delegate_ab", c0labLIZLLL.LIZ);
    }

    public final void d(List<C1412800mru> list) {
        C1414130mu3 c1414130mu3 = this.LLLLLLZZ.LIZ;
        c1414130mu3.LLLLLL = false;
        C1419050n1z c1419050n1z = c1414130mu3.LLLFZ;
        c1419050n1z.LL.clear();
        c1419050n1z.LL.addAll(list);
        C0MJ8 c0mj8 = C0MJ8.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("current material list: ");
        sbLIZ.append(c1419050n1z.LL.size());
        C201955140j.LIZJ(c0mj8, C2188811AlT.LIZIZ(sbLIZ));
        c1419050n1z.notifyDataSetChanged();
    }

    public final void e(boolean z) {
        C1414130mu3 c1414130mu3 = this.LLLLLZIL.LIZ;
        if (z) {
            FrameLayout frameLayout = c1414130mu3.LLJZIJLIL;
            if (frameLayout != null) {
                C786410Ut5.O7(frameLayout, new ACListenerS156S0100000_22(c1414130mu3, 58));
                return;
            }
            return;
        }
        FrameLayout frameLayout2 = c1414130mu3.LLJZIJLIL;
        if (frameLayout2 != null) {
            C786410Ut5.O7(frameLayout2, null);
        }
        FrameLayout frameLayout3 = c1414130mu3.LLJZIJLIL;
        if (frameLayout3 == null) {
            return;
        }
        frameLayout3.setClickable(false);
    }

    public final void j(int i) {
        C1414130mu3 c1414130mu3 = this.LLLLLZIL.LIZ;
        C19671011xk c19671011xk = c1414130mu3.LLL;
        if (c19671011xk != null) {
            C337180DJs.LIZJ(c19671011xk);
            c19671011xk.setProgress(i);
        }
        C337180DJs.LIZ(c1414130mu3.LLLFF);
    }

    public final void k(int i) {
        Object obj;
        C1414130mu3 c1414130mu3 = this.LLLLLLZZ.LIZ;
        C0MJ8 c0mj8 = C0MJ8.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MaterialListDelegate updateSelectedItemIndex: index = ");
        sbLIZ.append(i);
        sbLIZ.append(", currentSelectedIndex = ");
        sbLIZ.append(c1414130mu3.LLLI);
        C201955140j.LIZJ(c0mj8, C2188811AlT.LIZIZ(sbLIZ));
        c1414130mu3.LLLI = i;
        if (i > 0 && i < c1414130mu3.LLLII.size()) {
            obj = ListProtector.get(c1414130mu3.LLLII, c1414130mu3.LLLI);
        } else {
            obj = null;
        }
        c1414130mu3.LLLLIL().LJIILL.invoke((C1412800mru) obj);
    }

    public final void l(C1412800mru c1412800mru) {
        String string;
        C1414130mu3 c1414130mu3 = this.LLLLLLZ.LIZ;
        C0MJ8 c0mj8 = C0MJ8.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateSoundSyncItem: ");
        sbLIZ.append(c1414130mu3.LLLZIL());
        C201955140j.LIZJ(c0mj8, C2188811AlT.LIZIZ(sbLIZ));
        if (c1414130mu3.LLLZIL()) {
            TuxIconView tuxIconView = c1414130mu3.LLJLIL;
            if (tuxIconView != null) {
                C786410Ut5.LLLLLLZZ(tuxIconView, 8);
            }
            View view = c1414130mu3.LLJLL;
            if (view != null) {
                C786410Ut5.LJLLLLLL(8, view);
            }
            c1412800mru.LIZIZ = c1414130mu3.getResources().getQuantityString(2131755101, 1, 1);
            return;
        }
        TuxIconView tuxIconView2 = c1414130mu3.LLJLIL;
        if (tuxIconView2 != null) {
            C786410Ut5.LLLLLLZZ(tuxIconView2, 0);
        }
        View view2 = c1414130mu3.LLJLL;
        if (view2 != null) {
            C786410Ut5.LJLLLLLL(0, view2);
        }
        Context sceneContext = c1414130mu3.getSceneContext();
        if (sceneContext == null || (string = sceneContext.getString(2131848921)) == null) {
            string = "";
        }
        c1412800mru.LIZIZ = string;
    }

    public final void m(boolean z) {
        if (LLLLLLZZ()) {
            if (!z) {
                i();
            }
            this.LLLLIILLL = false;
            C337180DJs.LIZJ(this.LLJJJJLIIL);
            if (u4.LJJZ(this.LLJJJJ) || z) {
                this.LLLLLIL = false;
                this.LLLLJ = false;
                this.LLLLILI = false;
                LLZLLLL(this, true, false, 2);
                C1412800mru c1412800mru = (C1412800mru) C13LP.LJJJLZIJ(this.LLLI, this.LLLII);
                if (c1412800mru != null) {
                    String strLIZIZ = c1412800mru.LIZIZ();
                    if (C123100dR.LIZ(strLIZIZ)) {
                        this.LLLLIL = strLIZIZ;
                    }
                }
            }
        }
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, com.bytedance.scene.Scene
    public void onActivityCreated(Bundle bundle) {
        Object objF2;
        DisplayManager displayManager;
        boolean z;
        AVMusic aVMusicExtractAVMusic;
        super.onActivityCreated(bundle);
        if (LazyLoadEditLazyGroupPhase1.LIZ().enableLazySafeComponent) {
            ((C0ETY) this.LLJJJIL.LJII(C0ETY.class, null)).Sd(InterfaceC1417050myl.class, new AwS601S0100000_22(this, 879));
        }
        LLLZ();
        if (C1428470nHB.LJLLLLLL(this.LLJJJJ)) {
            C1439820nZU c1439820nZU = ((C1439810nZT) this.LLLIZZ.getValue(this, LLLLZLLLI[6])).LIZIZ;
            if (c1439820nZU != null && c1439820nZU.LJFF == 1) {
                z = true;
            } else {
                z = false;
            }
            this.LLLLL = z;
            this.LLLLILI = !z;
            if (z && C1414940mvM.LJFF(this.LLJJJJ) && MusicBeanUtilKt.extractAVMusic(this.LLJJJJ.creativeModel.musicBuzModel) != null) {
                MusicBuzModel musicBuzModel = this.LLJJJJ.creativeModel.musicBuzModel;
                if (musicBuzModel != null && (aVMusicExtractAVMusic = MusicBeanUtilKt.extractAVMusic(musicBuzModel)) != null) {
                    this.LLJJJJ.setEditMusicSyncMode(true);
                    C1416830myP.LIZ.getClass();
                    C1416830myP.LIZJ.put(aVMusicExtractAVMusic.getMusicId(), aVMusicExtractAVMusic);
                }
                C1412800mru c1412800mruLLLLLLL = LLLLLLL(C1429680nJ8.LIZJ(this.LLJJJJ.creativeModel.musicBuzModel), MixEditingMaterialType.SOUND_SYNC);
                if (c1412800mruLLLLLLL != null) {
                    c1412800mruLLLLLLL.LJFF = false;
                    c1412800mruLLLLLLL.LJ = null;
                    c1412800mruLLLLLLL.LJII = SelectMethodType.AUTO;
                    ListProtector.add(this.LLLII, 0, c1412800mruLLLLLLL);
                }
                j(1);
            } else {
                this.LLLLLIL = true;
            }
            ListProtector.add(this.LLLII, 0, new C1412800mru(MixEditingMaterialType.CANCEL_TYPE, "", null, null, null, false, null, null, null, false, null, 0, null, false, null, null, 65532));
        }
        C1414130mu3 c1414130mu3 = this.LLLLLLLZIL.LIZ;
        InterfaceC1413730mtP interfaceC1413730mtPLLLLLZL = c1414130mu3.LLLLLZL();
        if (interfaceC1413730mtPLLLLLZL != null) {
            interfaceC1413730mtPLLLLLZL.Qf2().LIZ(c1414130mu3, new AObjectS245S0100000_22(c1414130mu3, 286));
            interfaceC1413730mtPLLLLLZL.getHasMore().LIZ(c1414130mu3, new AObjectS245S0100000_22(c1414130mu3, 287));
        }
        c1414130mu3.LLLLJI(c1414130mu3.LLLLILI(), new C2217381BqS() { // from class: X.0muE
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1413890mtf) obj).LIZ;
            }
        }, Lifecycle.State.STARTED, new AwS601S0100000_22(c1414130mu3, 896));
        c1414130mu3.LLLLJI(c1414130mu3.LLLLILI(), new C2217381BqS() { // from class: X.0mtg
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C1413890mtf) obj).LIZLLL);
            }
        }, Lifecycle.State.STARTED, new AwS601S0100000_22(c1414130mu3, 881));
        c1414130mu3.LLLLJI(c1414130mu3.LLLLILI(), new C2217381BqS() { // from class: X.0mu8
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1413890mtf) obj).LIZIZ;
            }
        }, Lifecycle.State.STARTED, new AwS601S0100000_22(c1414130mu3, 883));
        c1414130mu3.LLLLJI(c1414130mu3.LLLLILI(), new C2217381BqS() { // from class: X.0muG
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1413890mtf) obj).LJIIZILJ;
            }
        }, Lifecycle.State.STARTED, new AwS601S0100000_22(c1414130mu3, 885));
        c1414130mu3.LLLLJI(c1414130mu3.LLLLILI(), new C2217381BqS() { // from class: X.0mto
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1413890mtf) obj).LJIJ;
            }
        }, Lifecycle.State.STARTED, new AwS601S0100000_22(c1414130mu3, 888));
        c1414130mu3.LLLLJI(c1414130mu3.LLLLILI(), new C2217381BqS() { // from class: X.0mty
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1413890mtf) obj).LJIILL;
            }
        }, Lifecycle.State.STARTED, new AwS601S0100000_22(c1414130mu3, 891));
        AbstractC1664490tPr.LLLLLILLIL(c1414130mu3, c1414130mu3.LLLLILI(), new C2217381BqS() { // from class: X.0mtp
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1413890mtf) obj).LJII;
            }
        }, new AwS601S0100000_22(c1414130mu3, 895));
        c1414130mu3.LLLLJI(c1414130mu3.LLLLILI(), new C2217381BqS() { // from class: X.0muK
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1413890mtf) obj).LJ;
            }
        }, Lifecycle.State.STARTED, new AwS601S0100000_22(c1414130mu3, 897));
        c1414130mu3.LLLLJI(c1414130mu3.LLLLILI(), new C2217381BqS() { // from class: X.0mtq
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1413890mtf) obj).LJFF;
            }
        }, Lifecycle.State.STARTED, new AwS601S0100000_22(c1414130mu3, 899));
        AbstractC1664490tPr.LLLLLILLIL(c1414130mu3, c1414130mu3.LLLLILI(), new C2217381BqS() { // from class: X.0muH
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1413890mtf) obj).LJI;
            }
        }, new AwS601S0100000_22(c1414130mu3, 900));
        AbstractC1664490tPr.LLLLLILLIL(c1414130mu3, c1414130mu3.LLLLILI(), new C2217371BqR() { // from class: X.0muO
            @Override // X.C2217371BqR, X.AbstractC2217331BqN, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1413890mtf) obj).LJIIJ;
            }

            @Override // X.C2217371BqR, X.AbstractC2217331BqN
            public final void set(Object obj, Object obj2) {
                ((C1413890mtf) obj).LJIIJ = (C375830EoP) obj2;
            }
        }, new AwS601S0100000_22(c1414130mu3, 875));
        AbstractC1664490tPr.LLLLLILLIL(c1414130mu3, c1414130mu3.LLLLILI(), new C2217381BqS() { // from class: X.0muD
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1413890mtf) obj).LJIIL;
            }
        }, new AwS601S0100000_22(c1414130mu3, 877));
        AbstractC1664490tPr.LLLLLILLIL(c1414130mu3, c1414130mu3.LLLLILI(), new C2217381BqS() { // from class: X.0mtj
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1413890mtf) obj).LJIILIIL;
            }
        }, new AwS601S0100000_22(c1414130mu3, 880));
        AbstractC1664490tPr.LLLLLILLIL(c1414130mu3, c1414130mu3.LLLLILI(), new C2217381BqS() { // from class: X.0mtl
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1413890mtf) obj).LJIJJ;
            }
        }, new AwS601S0100000_22(c1414130mu3, 882));
        AbstractC1664490tPr.LLLLLILLIL(c1414130mu3, c1414130mu3.LLLLILI(), new C2217381BqS() { // from class: X.0mtm
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1413890mtf) obj).LJIJI;
            }
        }, new AwS601S0100000_22(c1414130mu3, 884));
        AbstractC1664490tPr.LLLLLILLIL(c1414130mu3, c1414130mu3.LLLLILI(), new C2217381BqS() { // from class: X.0mtn
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1413890mtf) obj).LJIILJJIL;
            }
        }, new AwS601S0100000_22(c1414130mu3, 886));
        c1414130mu3.LLLLJI(c1414130mu3.LLLLILI(), new C2217381BqS() { // from class: X.0mtr
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1413890mtf) obj).LJIL;
            }
        }, Lifecycle.State.STARTED, new AwS601S0100000_22(c1414130mu3, 887));
        c1414130mu3.LLLLJI(c1414130mu3.LLLLILI(), new C2217381BqS() { // from class: X.0mte
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1413890mtf) obj).LJIIIZ;
            }
        }, Lifecycle.State.STARTED, new AwS601S0100000_22(c1414130mu3, 890));
        c1414130mu3.LLLLJI(c1414130mu3.LLLLILI(), new C2217371BqR() { // from class: X.0muP
            @Override // X.C2217371BqR, X.AbstractC2217331BqN, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1413890mtf) obj).LJIIJJI;
            }

            @Override // X.C2217371BqR, X.AbstractC2217331BqN
            public final void set(Object obj, Object obj2) {
                ((C1413890mtf) obj).LJIIJJI = (AbstractC1413760mtS) obj2;
            }
        }, Lifecycle.State.STARTED, new AwS601S0100000_22(c1414130mu3, 893));
        c1414130mu3.LLLLJI(c1414130mu3.LLLLILI(), new C2217381BqS() { // from class: X.0mtt
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C1413890mtf) obj).LJIILLIIL);
            }
        }, Lifecycle.State.STARTED, new AwS601S0100000_22(c1414130mu3, 898));
        c1414130mu3.LLLLJI(c1414130mu3.LLLLILI(), new C2217381BqS() { // from class: X.0mth
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C1413890mtf) obj).LJJI);
            }
        }, Lifecycle.State.STARTED, new AwS601S0100000_22(c1414130mu3, 876));
        c1414130mu3.LLLLJI(c1414130mu3.LLLLILI(), new C2217381BqS() { // from class: X.0mti
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1413890mtf) obj).LJJ;
            }
        }, Lifecycle.State.STARTED, new AwS601S0100000_22(c1414130mu3, 878));
        if (!this.LLLLIIIILLL) {
            LLZLI("scene_created");
            this.LLLLIIIILLL = true;
        }
        LLLLIL().LIZ.invoke(Boolean.TRUE);
        Activity activity = this.mActivity;
        if (activity != null) {
            objF2 = C786410Ut5.F2(activity, "display");
        } else {
            objF2 = null;
        }
        if (objF2 instanceof DisplayManager) {
            displayManager = (DisplayManager) objF2;
        } else {
            displayManager = null;
        }
        this.LLLLLZL = displayManager;
        if (displayManager != null) {
            displayManager.registerDisplayListener(this.LLLLZI, null);
        }
    }

    /* JADX WARN: Type inference failed for: r0v42, types: [X.0mu6] */
    public C1414130mu3(C1DRG c1drg, VideoPublishEditModel videoPublishEditModel) {
        ValueAnimator valueAnimatorOfInt;
        ValueAnimator valueAnimatorOfInt2;
        this.LLJJJIL = c1drg;
        this.LLJJJJ = videoPublishEditModel;
        this.LLLIIII = C1664770tQJ.LIZ(c1drg, InterfaceC1446740nke.class, null);
        this.LLLIIIIL = C1664770tQJ.LIZIZ(c1drg, InterfaceC1460000o62.class, null);
        this.LLLIIIL = C1664770tQJ.LIZIZ(c1drg, InterfaceC366390EYb.class, null);
        this.LLLIIL = C1664770tQJ.LIZIZ(c1drg, InterfaceC1417110myr.class, null);
        this.LLLIILIL = C1664770tQJ.LIZIZ(c1drg, InterfaceC1417050myl.class, null);
        this.LLLILZ = C1664770tQJ.LIZ(c1drg, C1412740mro.class, null);
        this.LLLIZZ = C1664770tQJ.LIZ(c1drg, C1439810nZT.class, null);
        this.LLLJ = C1664770tQJ.LIZIZ(c1drg, InterfaceC578500MmW.class, null);
        this.LLLJIL = C1664770tQJ.LIZIZ(c1drg, InterfaceC1413730mtP.class, null);
        this.LLLJL = C1664770tQJ.LIZIZ(c1drg, InterfaceC1414530muh.class, null);
        this.LLLLII = C1414930mvL.LIZLLL(videoPublishEditModel);
        SelectedMaterialItem selectedMaterialItem = videoPublishEditModel.creativeModel.mixEditingModel.selectedMaterialItem;
        this.LLLLIL = selectedMaterialItem != null ? selectedMaterialItem.materialId : null;
        this.LLLLILI = true;
        this.LLLLJ = true;
        this.LLLLJI = true;
        this.LLLLLJLJLL = -1;
        this.LLLLLLIL = true;
        this.LLLLLLL = C452501pT.LIZIZ(AFwS210S0000000_22.get$arr$(494));
        this.LLLLLLLLLL = new C1414330muN(this);
        this.LLLLLLLZIL = new C1414170mu7(this);
        this.LLLLLLZ = new C1412240mr0(this);
        this.LLLLLLZZ = new C1412970msB(this);
        this.LLLLLZ = new C1412820mrw(this);
        this.LLLLLZIL = new C1414060mtw(this);
        this.LLLLZI = new DisplayManager.DisplayListener() { // from class: X.0mu6
            @Override // android.hardware.display.DisplayManager.DisplayListener
            public final void onDisplayAdded(int i) {
            }

            @Override // android.hardware.display.DisplayManager.DisplayListener
            public final void onDisplayRemoved(int i) {
            }

            @Override // android.hardware.display.DisplayManager.DisplayListener
            public final void onDisplayChanged(int i) {
                C1415640mwU c1415640mwU;
                C1415640mwU c1415640mwU2;
                if (((Boolean) C273090An5.LIZ.getValue()).booleanValue()) {
                    int screenWidth = ScreenUtils.getScreenWidth(this.LL.mActivity);
                    C1414130mu3 c1414130mu3 = this.LL;
                    if (screenWidth != c1414130mu3.LLLLZ) {
                        c1414130mu3.LLLLZ = screenWidth;
                        if (c1414130mu3.LLLI >= 0 && (c1415640mwU = c1414130mu3.LLJZ) != null && c1415640mwU.getVisibility() == 0 && (c1415640mwU2 = c1414130mu3.LLJZ) != null) {
                            C1415640mwU.LIZJ(c1415640mwU2, c1414130mu3.LLLI);
                        }
                        C1415640mwU c1415640mwU3 = this.LL.LLJZ;
                        if (c1415640mwU3 != null) {
                            c1415640mwU3.LIZLLL(screenWidth);
                        }
                    }
                }
            }
        };
        if (C295860Bii.LIZ()) {
            valueAnimatorOfInt = ValueAnimator.ofInt(0, LLLZIIL);
        } else {
            valueAnimatorOfInt = ValueAnimator.ofInt(0, LLLZI);
        }
        this.LLLLZIL = valueAnimatorOfInt;
        if (C295860Bii.LIZ()) {
            valueAnimatorOfInt2 = ValueAnimator.ofInt(LLLZIIL, 0);
        } else {
            valueAnimatorOfInt2 = ValueAnimator.ofInt(LLLZI, 0);
        }
        this.LLLLZLL = valueAnimatorOfInt2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0449  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x049d  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x04c3  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x04d5 A[PHI: r3
      0x04d5: PHI (r3v113 com.bytedance.ies.nle.editor_jni.NLEModel) = 
      (r3v107 com.bytedance.ies.nle.editor_jni.NLEModel)
      (r3v118 com.bytedance.ies.nle.editor_jni.NLEModel)
      (r3v120 com.bytedance.ies.nle.editor_jni.NLEModel)
      (r3v125 com.bytedance.ies.nle.editor_jni.NLEModel)
     binds: [B:139:0x0447, B:169:0x04d3, B:162:0x04c1, B:153:0x049b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:320:0x0912  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C1412800mru LLLLLLL(java.lang.String r100, com.ss.android.ugc.aweme.creative.model.edit.mixediting.MixEditingMaterialType r101) {
        /*
            Method dump skipped, instruction units count: 2410
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1414130mu3.LLLLLLL(java.lang.String, com.ss.android.ugc.aweme.creative.model.edit.mixediting.MixEditingMaterialType):X.0mru");
    }

    public final Pair LLLLLLZ(int i, String str) {
        C1412860ms0 c1412860ms0LIZ;
        Asset asset;
        C1414130mu3 c1414130mu3 = this.LLLLLLZ.LIZ;
        Iterator<C1412800mru> it2 = c1414130mu3.LLLII.iterator();
        int i2 = 0;
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            C1412800mru next = it2.next();
            if (Intrinsics.LJFF(next.LIZIZ(), str) && (c1412860ms0LIZ = next.LIZ()) != null && (asset = c1412860ms0LIZ.LIZ) != null && asset.getAsset_type() == i) {
                if (i2 >= 0) {
                    return new Pair(Integer.valueOf(i2), ListProtector.get(c1414130mu3.LLLII, i2));
                }
            } else {
                i2++;
            }
        }
        return new Pair(-1, null);
    }

    public final void n(boolean z, boolean z2) {
        ValueAnimator valueAnimator;
        ViewGroup.LayoutParams layoutParams;
        C1414130mu3 c1414130mu3 = this.LLLLLLLZIL.LIZ;
        int i = 0;
        if (z && c1414130mu3.LLLI <= 0 && !c1414130mu3.LLLLLLLZIL()) {
            c1414130mu3.LLLLZLLLI(false);
            return;
        }
        C0MJ8 c0mj8 = C0MJ8.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateTitleBottomMargin: showMaterial = ");
        sbLIZ.append(z);
        sbLIZ.append(", withAnim = ");
        sbLIZ.append(z2);
        C201955140j.LIZJ(c0mj8, C2188811AlT.LIZIZ(sbLIZ));
        if (!z2) {
            c1414130mu3.LLLLZIL.cancel();
            c1414130mu3.LLLLZLL.cancel();
            LinearLayout linearLayout = c1414130mu3.LLJJJJLIIL;
            if (linearLayout != null) {
                layoutParams = linearLayout.getLayoutParams();
            } else {
                layoutParams = null;
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            if (C295860Bii.LIZ()) {
                if (z) {
                    i = C1414170mu7.LIZLLL;
                }
                marginLayoutParams.bottomMargin = i;
            } else {
                if (z) {
                    i = C1414170mu7.LIZJ;
                }
                marginLayoutParams.bottomMargin = i;
            }
            LinearLayout linearLayout2 = c1414130mu3.LLJJJJLIIL;
            if (linearLayout2 == null) {
                return;
            }
            C786410Ut5.d6(linearLayout2, marginLayoutParams);
            return;
        }
        if (z) {
            valueAnimator = c1414130mu3.LLLLZIL;
        } else {
            valueAnimator = c1414130mu3.LLLLZLL;
        }
        valueAnimator.setDuration(50L);
        valueAnimator.addUpdateListener(new AUListenerS265S0100000_16(c1414130mu3, 58));
        valueAnimator.start();
    }

    public final void LLLLLL(EnumC2006407tW enumC2006407tW, boolean z, boolean z2) {
        InterfaceC1417050myl interfaceC1417050myl;
        C0MJ8 c0mj8 = C0MJ8.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MaterialPanelScene -> clearAllMaterial path=");
        sbLIZ.append(enumC2006407tW);
        sbLIZ.append(", needCommit=");
        sbLIZ.append(z);
        sbLIZ.append(", skipNleCommit=");
        sbLIZ.append(z2);
        C201955140j.LIZJ(c0mj8, C2188811AlT.LIZIZ(sbLIZ));
        C1414130mu3 c1414130mu3 = this.LLLLLLZ.LIZ;
        C1302050jzH.LIZ.getClass();
        long jLIZ = C1302050jzH.LIZ();
        C1414130mu3 c1414130mu32 = c1414130mu3.LLLLLLZ.LIZ;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("realClearAllMaterial seekNleCommit=");
        sbLIZ2.append(z2);
        C201955140j.LIZJ(c0mj8, C2188811AlT.LIZIZ(sbLIZ2));
        InterfaceC1452170ntP value = c1414130mu32.LLLLLZ().g().getValue();
        int i = 0;
        if (value != null) {
            value.gf(new AwS139S0110000_22(c1414130mu32, z, 11), z2, false);
        }
        MixEditingModel mixEditingModel = c1414130mu32.LLJJJJ.creativeModel.mixEditingModel;
        mixEditingModel.selectedMaterialItem = null;
        mixEditingModel.templateMobParams = null;
        if (c1414130mu3.LLLLJI) {
            c1414130mu3.LLLLJI = false;
        } else if ((C0EYU.LIZ(c1414130mu3.LLLLLZ().g().getValue(), c1414130mu3.LLJJJJ) || C1414450muZ.LJIILIIL(c1414130mu3.LLJJJJ) || C1414450muZ.LJIIJJI(c1414130mu3.LLJJJJ)) && (interfaceC1417050myl = (InterfaceC1417050myl) c1414130mu3.LLLIILIL.getValue(c1414130mu3, LLLLZLLLI[4])) != null) {
            interfaceC1417050myl.Qm1();
        }
        long jLIZJ = C1302080jzK.LIZJ(jLIZ);
        VideoPublishEditModel videoPublishEditModel = c1414130mu3.LLJJJJ;
        long jLJIIIZ = C19990113Jj.LJIIIZ(jLIZJ);
        AwS566S0100000_22 awS566S0100000_22 = new AwS566S0100000_22(c1414130mu3, 1084);
        C1412440mrK.LIZ.getClass();
        C0LAB c0labLIZLLL = C1412440mrK.LIZLLL(videoPublishEditModel, awS566S0100000_22);
        if (enumC2006407tW == EnumC2006407tW.SELECT_NEW) {
            i = 1;
        }
        c0labLIZLLL.LIZ(i, "clear_type");
        c0labLIZLLL.LIZIZ(jLJIIIZ, "duration");
        List<InterfaceC2342209Fs> list = C2341909Fp.LIZ;
        C2341909Fp.LIZ("tool_performance_mixed_asset_cancel", c0labLIZLLL.LIZ);
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, X.C19A3, com.bytedance.scene.Scene
    public ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int iIntValue;
        String str;
        C1415640mwU c1415640mwU;
        Integer numLIZJ;
        String string;
        ViewGroup viewGroup2 = (ViewGroup) C786410Ut5.Td(layoutInflater, R.layout.vm, viewGroup, false);
        final C1414130mu3 c1414130mu3 = this.LLLLLLLLLL.LIZ;
        c1414130mu3.LLLLLJIL = new C0ZDN(viewGroup2.getContext());
        c1414130mu3.LLJJJJJIL = viewGroup2.findViewById(R.id.tqy);
        c1414130mu3.LLJJJJLIIL = (LinearLayout) viewGroup2.findViewById(R.id.y0w);
        c1414130mu3.LLJJL = (LinearLayout) viewGroup2.findViewById(R.id.h7n);
        TextView textView = (TextView) viewGroup2.findViewById(R.id.h83);
        Integer numLIZJ2 = null;
        if (textView != null) {
            Context sceneContext = c1414130mu3.getSceneContext();
            if (sceneContext != null) {
                string = sceneContext.getString(R.string.creation_autocut_entry_point);
            } else {
                string = null;
            }
            textView.setText(string);
        }
        c1414130mu3.LLJJLIIIJLLLLLLLZ = (LinearLayout) viewGroup2.findViewById(R.id.hwj);
        if (c1414130mu3.LLLLLLLZIL()) {
            c1414130mu3.LLJLLL = (C370670Eg5) viewGroup2.findViewById(R.id.video_to_image_switcher);
        } else {
            c1414130mu3.LLJL = viewGroup2.findViewById(R.id.o3p);
            c1414130mu3.LLJLIL = (TuxIconView) viewGroup2.findViewById(R.id.o3c);
            c1414130mu3.LLJLILLLLZIIL = (TuxTextView) viewGroup2.findViewById(R.id.o3w);
            c1414130mu3.LLJLL = viewGroup2.findViewById(R.id.o3q);
        }
        c1414130mu3.LLJLLIL = viewGroup2.findViewById(R.id.o48);
        FrameLayout frameLayout = (FrameLayout) viewGroup2.findViewById(R.id.o3y);
        c1414130mu3.LLJZIJLIL = frameLayout;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) frameLayout.getLayoutParams();
        if (C295860Bii.LIZ()) {
            marginLayoutParams.width = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(60));
            marginLayoutParams.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(78));
        } else {
            marginLayoutParams.width = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(58));
            marginLayoutParams.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(58));
        }
        C786410Ut5.a6(frameLayout, marginLayoutParams);
        c1414130mu3.LLJZIJLIL = frameLayout;
        C19671011xk c19671011xk = (C19671011xk) viewGroup2.findViewById(R.id.g4f);
        if (C295860Bii.LIZ()) {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(54)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(72)));
            layoutParams.gravity = 17;
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c19671011xk);
            c19671011xk.setLayoutParams(layoutParams);
        } else {
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(52)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(52)));
            layoutParams2.gravity = 17;
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c19671011xk);
            c19671011xk.setLayoutParams(layoutParams2);
        }
        Context sceneContext2 = c1414130mu3.getSceneContext();
        if (sceneContext2 != null && (numLIZJ = C1308910kAL.LIZJ(R.attr.zc, sceneContext2)) != null) {
            iIntValue = numLIZJ.intValue();
        } else {
            iIntValue = 0;
        }
        c19671011xk.setBgCircleColor(iIntValue);
        c19671011xk.setViewBorderRadius(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10)));
        c1414130mu3.LLL = c19671011xk;
        c1414130mu3.LLLFF = viewGroup2.findViewById(R.id.tek);
        View viewFindViewById = viewGroup2.findViewById(R.id.tew);
        c1414130mu3.LLLF = viewFindViewById;
        ViewGroup.LayoutParams layoutParams3 = viewFindViewById.getLayoutParams();
        if (C295860Bii.LIZ()) {
            layoutParams3.width = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(54));
            layoutParams3.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(72));
        } else {
            layoutParams3.width = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(52));
            layoutParams3.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(52));
        }
        C786410Ut5.W5(viewFindViewById, layoutParams3);
        c1414130mu3.LLJZ = (C1415640mwU) viewGroup2.findViewById(R.id.o47);
        View viewFindViewById2 = viewGroup2.findViewById(R.id.o47);
        ViewGroup.LayoutParams layoutParams4 = viewFindViewById2.getLayoutParams();
        if (C295860Bii.LIZ()) {
            layoutParams4.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(78));
        } else {
            layoutParams4.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(58));
        }
        C786410Ut5.W5(viewFindViewById2, layoutParams4);
        if (c1414130mu3.LLLLLLZZ() && (c1415640mwU = c1414130mu3.LLJZ) != null) {
            c1415640mwU.setForbidScroll(true);
        }
        c1414130mu3.LLLFFI = (TuxTextView) viewGroup2.findViewById(R.id.bdv);
        if (!C861960Xre.LIZ()) {
            LinearLayout linearLayout = c1414130mu3.LLJJL;
            if (linearLayout != null) {
                linearLayout.setBackgroundResource(R.drawable.a7x);
            }
            View view = c1414130mu3.LLJL;
            if (view != null) {
                view.setBackgroundResource(R.drawable.a7x);
            }
        } else if (C862000Xri.LIZ()) {
            LinearLayout linearLayout2 = c1414130mu3.LLJJL;
            if (linearLayout2 != null) {
                linearLayout2.setBackgroundResource(R.drawable.a8n);
            }
            View view2 = c1414130mu3.LLJL;
            if (view2 != null) {
                view2.setBackgroundResource(R.drawable.a8n);
            }
        }
        TuxIconView tuxIconView = c1414130mu3.LLJLIL;
        if (tuxIconView != null) {
            C419910GdJ c419910GdJ = new C419910GdJ();
            c419910GdJ.LIZ = R.raw.icon_trash_bin;
            Context sceneContext3 = c1414130mu3.getSceneContext();
            if (sceneContext3 != null) {
                numLIZJ2 = C1308910kAL.LIZJ(R.attr.zi, sceneContext3);
            }
            c419910GdJ.LIZLLL = numLIZJ2;
            tuxIconView.setTuxIcon(c419910GdJ);
        }
        LinearLayout linearLayout3 = c1414130mu3.LLJJL;
        if (linearLayout3 != null) {
            C786410Ut5.R7(linearLayout3, new ACListenerS156S0100000_22(c1414130mu3, 60));
        }
        TuxTextView tuxTextView = c1414130mu3.LLJLILLLLZIIL;
        if (tuxTextView != null) {
            C786410Ut5.h9(tuxTextView, new ACListenerS156S0100000_22(c1414130mu3, 61));
        }
        TuxIconView tuxIconView2 = c1414130mu3.LLJLIL;
        if (tuxIconView2 != null) {
            C786410Ut5.a9(tuxIconView2, new ACListenerS156S0100000_22(c1414130mu3, 62));
        }
        LinearLayout linearLayout4 = c1414130mu3.LLJJLIIIJLLLLLLLZ;
        if (linearLayout4 != null) {
            C786410Ut5.R7(linearLayout4, new ACListenerS156S0100000_22(c1414130mu3, 63));
        }
        C370670Eg5 c370670Eg5 = c1414130mu3.LLJLLL;
        if (c370670Eg5 != null) {
            C786410Ut5.Pa(c370670Eg5, new ACListenerS156S0100000_22(c1414130mu3, 59));
        }
        C1414440muY c1414440muY = new C1414440muY();
        C370670Eg5 c370670Eg52 = c1414130mu3.LLJLLL;
        InterfaceC1414430muX interfaceC1414430muX = new InterfaceC1414430muX() { // from class: X.0muC
            @Override // X.InterfaceC1414430muX
            public final void LJI() {
                C578350MmH c578350MmH = C578350MmH.LIZ;
                VideoPublishEditModel videoPublishEditModel = this.LIZ.LLJJJJ;
                c578350MmH.getClass();
                C578350MmH.LIZIZ(videoPublishEditModel);
            }
        };
        if (c370670Eg52 != null) {
            C786410Ut5.x3(c370670Eg52.getViewTreeObserver(), new ViewTreeObserverOnGlobalLayoutListenerC1466720oGs(c370670Eg52, c1414440muY, interfaceC1414430muX, 0));
            c370670Eg52.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC1414420muW(c370670Eg52, c1414440muY, interfaceC1414430muX));
        }
        final C1414130mu3 c1414130mu32 = c1414130mu3.LLLLLLLLLL.LIZ;
        C1415640mwU c1415640mwU2 = c1414130mu32.LLJZ;
        if (c1415640mwU2 != null) {
            c1415640mwU2.setClipToPadding(false);
            c1415640mwU2.setAdapter(c1414130mu32.LLLFZ);
        }
        C1415640mwU c1415640mwU3 = c1414130mu32.LLJZ;
        if (c1415640mwU3 != null) {
            c1415640mwU3.setSpeedRatio(0.5f);
        }
        C1415640mwU c1415640mwU4 = c1414130mu32.LLJZ;
        if (c1415640mwU4 != null) {
            c1415640mwU4.setScrollListener(new InterfaceC1415670mwX() { // from class: X.0mtW
                @Override // X.InterfaceC1415670mwX
                public final void LIZ(int i) {
                    C1415640mwU c1415640mwU5;
                    View viewLJFF;
                    C1414130mu3 c1414130mu33;
                    C1415640mwU c1415640mwU6;
                    int childAdapterPosition;
                    if (i != 0) {
                        if (i == 1) {
                            C1414130mu3 c1414130mu34 = this.LIZ;
                            c1414130mu34.LLLLLJLJLL = -1;
                            C19671011xk c19671011xk2 = c1414130mu34.LLL;
                            if (c19671011xk2 != null) {
                                C337180DJs.LIZ(c19671011xk2);
                            }
                            View view3 = this.LIZ.LLLFF;
                            if (view3 != null) {
                                C337180DJs.LIZ(view3);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    this.LIZ.getClass();
                    C1414130mu3 c1414130mu35 = this.LIZ;
                    if (c1414130mu35.LLLLLL || (c1415640mwU5 = c1414130mu35.LLJZ) == null || (viewLJFF = c1415640mwU5.LL.LJFF(c1415640mwU5.getLayoutManager())) == null || (c1415640mwU6 = (c1414130mu33 = this.LIZ).LLJZ) == null || c1414130mu33.LLLLLJLJLL == (childAdapterPosition = c1415640mwU6.getChildAdapterPosition(viewLJFF))) {
                        return;
                    }
                    c1414130mu33.LLLLLJLJLL = childAdapterPosition;
                    C0ZDN c0zdn = c1414130mu33.LLLLLJIL;
                    if (c0zdn != null) {
                        c0zdn.LIZ(0);
                    }
                    C1412200mqw c1412200mqw = new C1412200mqw(childAdapterPosition, (C1412800mru) C13LP.LJJJLZIJ(childAdapterPosition, c1414130mu33.LLLII), c1414130mu33.LLJJJJ);
                    C1412250mr1.LIZJ(c1412200mqw);
                    Context sceneContext4 = c1414130mu33.getSceneContext();
                    if (sceneContext4 != null) {
                        C1412250mr1.LIZLLL(sceneContext4, c1412200mqw);
                    }
                    if (childAdapterPosition == c1414130mu33.LLLI) {
                        return;
                    }
                    C1414130mu3.LLZLLIL(c1414130mu33, Integer.valueOf(childAdapterPosition), false, false, false, SelectMethodType.MANUAL_SWIPE_LIST, 14);
                }

                @Override // X.InterfaceC1415670mwX
                public final void LIZIZ(int i, int i2) {
                    C1415640mwU c1415640mwU5;
                    View viewLJFF;
                    C1414130mu3 c1414130mu33;
                    C1415640mwU c1415640mwU6;
                    MixEditingPerformanceImproveExperiment.LIZ.getClass();
                    if (MixEditingPerformanceImproveExperiment.LIZ().enableCancellation && (c1415640mwU5 = this.LIZ.LLJZ) != null && (viewLJFF = c1415640mwU5.LL.LJFF(c1415640mwU5.getLayoutManager())) != null && (c1415640mwU6 = (c1414130mu33 = this.LIZ).LLJZ) != null) {
                        c1414130mu33.LLLLIL().LIZJ.invoke(Integer.valueOf(c1415640mwU6.getChildAdapterPosition(viewLJFF)));
                    }
                }
            });
        }
        C1415640mwU c1415640mwU5 = c1414130mu32.LLJZ;
        if (c1415640mwU5 != null) {
            C860470XpF.LIZLLL(c1415640mwU5, "edit_mixed_asset_carousel");
        }
        C1415640mwU c1415640mwU6 = c1414130mu32.LLJZ;
        if (c1415640mwU6 != null) {
            c1415640mwU6.setOnItemVisibilityChangeListener(new AwS601S0100000_22(c1414130mu32, 892));
        }
        c1414130mu32.LLLFZ.LLILLJJLI = new InterfaceC1419090n23() { // from class: X.0msA
            @Override // X.InterfaceC1419090n23
            public final void LIZJ(int i) {
                if (C0BWH.LIZ() && this.LIZ.LLLFZ.getItemCount() - i == ((Number) C263170ATb.LIZ.getValue()).intValue()) {
                    C1414130mu3 c1414130mu33 = this.LIZ;
                    c1414130mu33.LLLLLL = true;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("onBindItem -> ");
                    sbLIZ.append(i);
                    sbLIZ.append(", load more");
                    c1414130mu33.LLZL(C2188811AlT.LIZIZ(sbLIZ));
                    this.LIZ.LLLLIL().LJIILLIIL.invoke();
                }
            }

            @Override // X.InterfaceC1419090n23
            public final void LIZ(C1412800mru c1412800mru, int i) {
                MixEditingMaterialType mixEditingMaterialType;
                C1414130mu3 c1414130mu33 = this.LIZ;
                if (i == c1414130mu33.LLLI) {
                    return;
                }
                if (c1414130mu33.LLLLLLZZ()) {
                    C1412800mru c1412800mruLLLFZ = this.LIZ.LLLFZ.LLLFZ(i);
                    if (c1412800mruLLLFZ != null) {
                        mixEditingMaterialType = c1412800mruLLLFZ.LIZ;
                    } else {
                        mixEditingMaterialType = null;
                    }
                    if (mixEditingMaterialType == MixEditingMaterialType.UNKNOWN_TYPE) {
                        return;
                    }
                }
                C1414130mu3 c1414130mu34 = this.LIZ;
                C1412200mqw c1412200mqw = new C1412200mqw(i, c1412800mru, c1414130mu34.LLJJJJ);
                C1412250mr1.LIZJ(c1412200mqw);
                C1412250mr1.LIZLLL(c1414130mu34.requireView().getContext(), c1412200mqw);
                C1415640mwU c1415640mwU7 = this.LIZ.LLJZ;
                if (c1415640mwU7 != null) {
                    C1415640mwU.LIZJ(c1415640mwU7, i);
                }
                C1414130mu3.LLZLLIL(this.LIZ, Integer.valueOf(i), false, false, false, SelectMethodType.MANUAL_CLICK_COVER, 14);
            }

            @Override // X.InterfaceC1419090n23
            public final boolean LIZIZ(C1412800mru c1412800mru, int i) {
                C1412870ms1.LIZ.getClass();
                ((IToolsDebugGpService) ServiceManager.get().getService(IToolsDebugGpService.class)).isOpen();
                return false;
            }
        };
        if (c1414130mu3.LLJJJJ.getOrigin() == 0) {
            str = "upload";
        } else {
            str = "shoot";
        }
        VideoPublishEditModel videoPublishEditModel = c1414130mu3.LLJJJJ;
        String str2 = videoPublishEditModel.mShootWay;
        String creationId = videoPublishEditModel.getCreationId();
        CreativeModel creativeModel = c1414130mu3.LLJJJJ.creativeModel;
        PhotoModeEditingStage photoModeEditingStage = creativeModel.photoModeEnterEditingStage;
        C1417710mzp.LJJIJ(str, "edit_page_mix_material", str2, creationId, null, photoModeEditingStage.isFromMultiPhotoContent, photoModeEditingStage.isFromMultiPhotoSpecialPage, creativeModel.draftInfoModel.isDraft, null, 272);
        return viewGroup2;
    }

    public static void LLZLLLL(C1414130mu3 c1414130mu3, boolean z, boolean z2, int i) {
        int i2;
        C1415640mwU c1415640mwU;
        String strLIZJ;
        boolean z3;
        String resource_id;
        BusinessExtra business_extra;
        String music_id;
        boolean z4 = z2;
        boolean z5 = z;
        boolean z6 = false;
        if ((i & 1) != 0) {
            z5 = false;
        }
        if ((i & 2) != 0) {
            z4 = false;
        }
        int iLLLLZ = c1414130mu3.LLLLZ();
        C0MJ8 c0mj8 = C0MJ8.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("selectMaterialIfNeed: targetSelectIndex = ");
        sbLIZ.append(iLLLLZ);
        C201955140j.LIZJ(c0mj8, C2188811AlT.LIZIZ(sbLIZ));
        c1414130mu3.d(c1414130mu3.LLLII);
        C1415640mwU c1415640mwU2 = c1414130mu3.LLJZ;
        if (c1415640mwU2 != null) {
            C1415640mwU.LIZJ(c1415640mwU2, iLLLLZ);
        }
        LLZLLIL(c1414130mu3, Integer.valueOf(iLLLLZ), true, z5, z4, null, 16);
        if (iLLLLZ >= 0 && iLLLLZ < c1414130mu3.LLLII.size()) {
            if (((C1412800mru) ListProtector.get(c1414130mu3.LLLII, iLLLLZ)).LIZ == MixEditingMaterialType.EFFECT_TYPE) {
                VideoPublishEditModel videoPublishEditModel = c1414130mu3.LLJJJJ;
                C0FPZ c0fpz = C0FPZ.LIZ;
                C1412800mru c1412800mru = (C1412800mru) ListProtector.get(c1414130mu3.LLLII, iLLLLZ);
                c0fpz.getClass();
                Asset asset = c1412800mru.LIZLLL;
                String str = "";
                if (asset == null) {
                    strLIZJ = "";
                    z3 = false;
                } else {
                    strLIZJ = C1403700mdE.LIZJ(asset.getExtra());
                    if (strLIZJ.length() > 0) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                }
                String strLIZIZ = c1412800mru.LIZIZ();
                Asset asset2 = c1412800mru.LIZLLL;
                if (asset2 == null || (resource_id = asset2.getResource_id()) == null) {
                    resource_id = "";
                }
                Asset asset3 = c1412800mru.LIZLLL;
                if (asset3 != null && (business_extra = asset3.getBusiness_extra()) != null && (music_id = business_extra.getMusic_id()) != null) {
                    str = music_id;
                }
                i2 = iLLLLZ;
                videoPublishEditModel.creativeModel.mixEditingModel.effectMobParamsList.add(new EffectMobParams(iLLLLZ, 1024, System.currentTimeMillis(), "edit_page_mix_material", strLIZIZ, resource_id, str, "", strLIZJ, z6, z3));
            } else {
                i2 = iLLLLZ;
            }
            if (C1414450muZ.LIZLLL(c1414130mu3.LLLII) && ((C1412800mru) ListProtector.get(c1414130mu3.LLLII, i2)).LIZ == MixEditingMaterialType.UNKNOWN_TYPE && !c1414130mu3.LLLLLLLZIL() && (c1415640mwU = c1414130mu3.LLJZ) != null && c1415640mwU.getVisibility() == 0 && !c1414130mu3.LLLLIILL) {
                c1414130mu3.LLLLZLLLI(false);
            }
        }
    }

    public final C1412800mru LLLLLLLLL(String str, MixEditingMaterialType mixEditingMaterialType, int i, String str2) {
        String str3;
        boolean z;
        String str4;
        TemplateMobParams templateMobParamsLJ;
        Asset asset;
        BusinessExtra business_extra;
        C1412800mru next;
        C1412800mru next2;
        Asset asset2;
        AutoCutThemeData autoCutThemeDataLIZJ;
        C0MJ8 c0mj8 = C0MJ8.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MaterialPanelScene currentMaterialItem: id = ");
        sbLIZ.append(str);
        sbLIZ.append(", type = ");
        sbLIZ.append(mixEditingMaterialType);
        C201955140j.LIZJ(c0mj8, C2188811AlT.LIZIZ(sbLIZ));
        TemplateMobParams templateMobParamsLJ2 = null;
        if (mixEditingMaterialType != MixEditingMaterialType.LYRICS_RULE_TEMPLATE || (autoCutThemeDataLIZJ = C1403130mcJ.LIZJ(this.LLJJJJ.creativeModel)) == null || (str3 = autoCutThemeDataLIZJ.musicId) == null || str3.length() <= 0) {
            str3 = null;
        }
        C1412260mr2 c1412260mr2 = new C1412260mr2(mixEditingMaterialType, str, str3);
        if (i != 0) {
            z = true;
        } else {
            z = false;
        }
        int i2 = -1;
        if (!z) {
            Iterator<C1412800mru> it2 = this.LLLII.iterator();
            while (true) {
                if (it2.hasNext()) {
                    next2 = it2.next();
                    if (((Boolean) c1412260mr2.invoke(next2)).booleanValue()) {
                        break;
                    }
                } else {
                    next2 = null;
                    break;
                }
            }
            C1412800mru c1412800mru = next2;
            if (c1412800mru != null) {
                C0MJ8 c0mj82 = C0MJ8.LIZIZ;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("MaterialPanelScene currentMaterialItem: id = ");
                sbLIZ2.append(str);
                sbLIZ2.append(", type = ");
                sbLIZ2.append(mixEditingMaterialType);
                sbLIZ2.append(" exists");
                C201955140j.LIZJ(c0mj82, C2188811AlT.LIZIZ(sbLIZ2));
                Iterator<C1412800mru> it3 = this.LLLII.iterator();
                int i3 = 0;
                while (true) {
                    if (!it3.hasNext()) {
                        break;
                    }
                    if (((Boolean) c1412260mr2.invoke(it3.next())).booleanValue()) {
                        i2 = i3;
                        break;
                    }
                    i3++;
                }
                k(i2);
                MixEditingModel mixEditingModel = this.LLJJJJ.creativeModel.mixEditingModel;
                SelectedMaterialItem selectedMaterialItem = mixEditingModel.selectedMaterialItem;
                if ((selectedMaterialItem == null || selectedMaterialItem.materialPosition != i2) && ((asset2 = c1412800mru.LIZLLL) == null || asset2.getAsset_consumer_type() != AssetConsumerType.AUTOCUT_INSERT_TEMPLATE.getValue())) {
                    mixEditingModel.selectedMaterialItem = C1412830mrx.LJ(c1412800mru, i2);
                    Asset asset3 = c1412800mru.LIZLLL;
                    if (asset3 != null) {
                        templateMobParamsLJ2 = C1412590mrZ.LJ(asset3, c1412800mru);
                    }
                    mixEditingModel.templateMobParams = templateMobParamsLJ2;
                }
                if (mixEditingMaterialType == MixEditingMaterialType.SOUND_SYNC && i2 == 1) {
                    l((C1412800mru) ListProtector.get(this.LLLII, i2));
                }
                return (C1412800mru) ListProtector.get(this.LLLII, i2);
            }
        }
        C1412800mru c1412800mruLLLLLLL = LLLLLLL(str, mixEditingMaterialType);
        if (c1412800mruLLLLLLL == null) {
            Iterator<C1412800mru> it4 = this.LLLII.iterator();
            while (true) {
                if (it4.hasNext()) {
                    next = it4.next();
                    C1412800mru c1412800mru2 = next;
                    if (Intrinsics.LJFF(c1412800mru2.LIZIZ(), str) && c1412800mru2.LIZ == mixEditingMaterialType) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            C1412800mru c1412800mru3 = next;
            if (c1412800mru3 == null) {
                return null;
            }
            Iterator<C1412800mru> it5 = this.LLLII.iterator();
            int i4 = 0;
            while (true) {
                if (!it5.hasNext()) {
                    break;
                }
                C1412800mru next3 = it5.next();
                if (Intrinsics.LJFF(next3.LIZIZ(), str) && next3.LIZ == mixEditingMaterialType) {
                    i2 = i4;
                    break;
                }
                i4++;
            }
            k(i2);
            return c1412800mru3;
        }
        if (!C1414450muZ.LIZJ(this.LLLII)) {
            ListProtector.add(this.LLLII, 0, C1412790mrt.LIZ());
        }
        if (z) {
            Iterator<C1412800mru> it6 = this.LLLII.iterator();
            int i5 = 0;
            while (true) {
                if (!it6.hasNext()) {
                    break;
                }
                C1412800mru next4 = it6.next();
                if (Intrinsics.LJFF(next4.LIZIZ(), str) && next4.LIZ == mixEditingMaterialType) {
                    if (i5 >= 0) {
                        ListProtector.remove(this.LLLII, i5);
                    }
                } else {
                    i5++;
                }
            }
            c1412800mruLLLLLLL.LJIIJJI = i;
            c1412800mruLLLLLLL.LJIILJJIL = str2;
        }
        if (mixEditingMaterialType == MixEditingMaterialType.SOUND_SYNC && C0C64.LJIILLIIL().LJIIIZ(31744, "studio_sound_sync_duplicate_insert_fix", true, false)) {
            Iterator<C1412800mru> it7 = this.LLLII.iterator();
            while (it7.hasNext()) {
                if (it7.next().LIZ == MixEditingMaterialType.SOUND_SYNC) {
                    it7.remove();
                }
            }
        }
        ListProtector.add(this.LLLII, 1, c1412800mruLLLLLLL);
        C1412860ms0 c1412860ms0LIZ = c1412800mruLLLLLLL.LIZ();
        if (c1412860ms0LIZ != null && c1412860ms0LIZ.LIZ.getAsset_consumer_type() == AssetConsumerType.AUTOCUT_INSERT_TEMPLATE.getValue()) {
            C1413040msI c1413040msI = (C1413040msI) c1412860ms0LIZ.LIZIZ;
            C1414150mu5.LIZJ(c1412860ms0LIZ.LIZ, c1413040msI.LIZIZ, c1413040msI.LIZJ);
        }
        MixEditingModel mixEditingModel2 = this.LLJJJJ.creativeModel.mixEditingModel;
        SelectedMaterialItem selectedMaterialItem2 = mixEditingModel2.selectedMaterialItem;
        if (selectedMaterialItem2 != null) {
            str4 = selectedMaterialItem2.materialId;
        } else {
            str4 = null;
        }
        if (!Intrinsics.LJFF(str4, c1412800mruLLLLLLL.LIZIZ())) {
            MixEditingMaterialType mixEditingMaterialType2 = c1412800mruLLLLLLL.LIZ;
            MixEditingMaterialType mixEditingMaterialType3 = MixEditingMaterialType.SOUND_SYNC;
            if (mixEditingMaterialType2 == mixEditingMaterialType3 && (asset = c1412800mruLLLLLLL.LIZLLL) != null && (business_extra = asset.getBusiness_extra()) != null && business_extra.getAsset_from() == null) {
                business_extra.setAsset_from(Integer.valueOf(AssetFrom.OTHERS.getValue()));
            }
            mixEditingModel2.selectedMaterialItem = C1412830mrx.LJ(c1412800mruLLLLLLL, 1);
            Asset asset4 = c1412800mruLLLLLLL.LIZLLL;
            if (asset4 != null) {
                templateMobParamsLJ = C1412590mrZ.LJ(asset4, c1412800mruLLLLLLL);
            } else {
                templateMobParamsLJ = null;
            }
            mixEditingModel2.templateMobParams = templateMobParamsLJ;
            if (c1412800mruLLLLLLL.LIZ != mixEditingMaterialType3) {
                mixEditingModel2.templateMobParams = null;
            }
        }
        k(1);
        d(this.LLLII);
        LLLLIL().LJIIZILJ.invoke(c1412800mruLLLLLLL);
        return c1412800mruLLLLLLL;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x030d, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.LJFF(r1.materialId, r13.LIZIZ()) != false) goto L174;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x0333, code lost:
    
        if (X.C0C64.LJIILLIIL().LJIIIZ(31744, "studio_mix_editing_force_insert_sound_sync", true, true) != false) goto L174;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x0368, code lost:
    
        if (X.C0EYU.LIZIZ(r4.LLJJJJ, null, r4.LLLLLZ().g().getValue()) != false) goto L174;
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x03bc, code lost:
    
        if (r2 != null) goto L174;
     */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0329  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0354  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x036b  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x037d  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x03c1  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x044d  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0103  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LLZLLIL(X.C1414130mu3 r32, java.lang.Integer r33, boolean r34, boolean r35, boolean r36, com.ss.android.ugc.aweme.creative.model.edit.mixediting.SelectMethodType r37, int r38) {
        /*
            Method dump skipped, instruction units count: 1142
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1414130mu3.LLZLLIL(X.0mu3, java.lang.Integer, boolean, boolean, boolean, com.ss.android.ugc.aweme.creative.model.edit.mixediting.SelectMethodType, int):void");
    }
}
