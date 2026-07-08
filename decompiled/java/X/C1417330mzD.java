package X;

import Y.ARunnableS122S0100000_22;
import Y.ARunnableS17S1300000_22;
import Y.ARunnableS28S0201000_22;
import Y.ARunnableS91S0200000_22;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelProvider;
import com.bytedance.als.LiveEvent;
import com.bytedance.als.extensions.LifecycleOwnerExtensionsKt;
import com.bytedance.createx.editor.gesture.GestureInteractItem;
import com.bytedance.ies.cutsame.cut_android.NLEPrepareListener;
import com.bytedance.ies.nle.editor_jni.LogLevel;
import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLEModelDownloader;
import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.ies.nle.editor_jni.NLEResType;
import com.bytedance.ies.nle.editor_jni.NLEResourceAV;
import com.bytedance.ies.nle.editor_jni.NLEResourceNode;
import com.bytedance.ies.nle.editor_jni.NLESegment;
import com.bytedance.ies.nle.editor_jni.NLESegmentAudio;
import com.bytedance.ies.nle.editor_jni.NLESegmentVideo;
import com.bytedance.ies.nle.editor_jni.NLETemplateModel;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.TemplateInfo;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSPtr;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSlotSPtr;
import com.bytedance.ies.smartmovie.jni.SmartMovieErrorCode;
import com.bytedance.ies.smartmovie.jni.UnorderedMapStrStr;
import com.bytedance.ies.smartmovie.jni.VecMeta;
import com.bytedance.ies.smartmovie.jni.VecStr;
import com.bytedance.keva.KevaImpl;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.IAutoCutService;
import com.ss.android.ugc.aweme.autocut.s;
import com.ss.android.ugc.aweme.autocut.sdk.smartmovie.model.MetaExt;
import com.ss.android.ugc.aweme.commercialize.media.api.service.ICommerceMediaService;
import com.ss.android.ugc.aweme.creative.model.AutoCutCategory;
import com.ss.android.ugc.aweme.creative.model.AutoCutMediaModel;
import com.ss.android.ugc.aweme.creative.model.AutoCutModel;
import com.ss.android.ugc.aweme.creative.model.AutoCutThemeData;
import com.ss.android.ugc.aweme.creative.model.AutoCutTitle;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.PUgcTemplateData;
import com.ss.android.ugc.aweme.creative.model.PhotoModeEditingStage;
import com.ss.android.ugc.aweme.creative.model.ReusedMusicInfo;
import com.ss.android.ugc.aweme.creative.model.edit.mixediting.MixEditingModel;
import com.ss.android.ugc.aweme.creative.model.edit.mixediting.SelectedMaterialItem;
import com.ss.android.ugc.aweme.creative.model.edit.mixediting.TemplateMobParams;
import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import com.ss.android.ugc.aweme.creative.model.music.FlowDataMusicInfo;
import com.ss.android.ugc.aweme.creative.model.music.MusicBuzModel;
import com.ss.android.ugc.aweme.cutsame.CutsameDataItem;
import com.ss.android.ugc.aweme.feed.util.LivePreviewCTASmartDisplayManager;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.image.switchmode.payload.AutoCutReturn;
import com.ss.android.ugc.aweme.interfaces.ITemplateResourceService;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.music.model.MusicBeanUtilKt;
import com.ss.android.ugc.aweme.mvtheme.MvCreateVideoData;
import com.ss.android.ugc.aweme.services.uikit.CreativeLoadingDialog;
import com.ss.android.ugc.aweme.services.uikit.CreativeLoadingDialogBuilder;
import com.ss.android.ugc.aweme.shortvideo.ScreenUtils;
import com.ss.android.ugc.aweme.shortvideo.autocut.AutoCutProcessViewModel;
import com.ss.android.ugc.aweme.shortvideo.autocut.lyricsrule.ILyricsRuleTemplatePreloadService;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.shortvideo.model.MusicWaveBean;
import com.ss.android.ugc.aweme.sticker.data.CreateAnchorInfo;
import com.ss.android.ugc.cut_reportor_interface.ICutReporter;
import com.ss.android.ugc.cut_ui.CutSource;
import com.ss.android.ugc.cut_ui.CutSourceType;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import com.ss.android.ugc.effectmanager.effect.model.AssetFrom;
import com.ss.android.ugc.tiktok.tools.performance.api.settings.LazyLoadEditLazyGroupPhase1;
import com.ss.android.vesdk.VEEditor;
import ge.i;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS210S0000000_22;
import kotlin.jvm.internal.AFwS234S0000000_5;
import kotlin.jvm.internal.AFwS261S0000000_22;
import kotlin.jvm.internal.AwS105S0201000_22;
import kotlin.jvm.internal.AwS10S0120000_22;
import kotlin.jvm.internal.AwS136S1100000_22;
import kotlin.jvm.internal.AwS145S0201000_22;
import kotlin.jvm.internal.AwS19S2000000_22;
import kotlin.jvm.internal.AwS217S0300000_8;
import kotlin.jvm.internal.AwS260S0000000_22;
import kotlin.jvm.internal.AwS35S0001000_22;
import kotlin.jvm.internal.AwS35S0010000_22;
import kotlin.jvm.internal.AwS388S0200000_22;
import kotlin.jvm.internal.AwS38S1110000_22;
import kotlin.jvm.internal.AwS423S0200000_22;
import kotlin.jvm.internal.AwS457S0200000_22;
import kotlin.jvm.internal.AwS566S0100000_22;
import kotlin.jvm.internal.AwS587S0100000_8;
import kotlin.jvm.internal.AwS593S0100000_14;
import kotlin.jvm.internal.AwS59S0310000_22;
import kotlin.jvm.internal.AwS601S0100000_22;
import kotlin.jvm.internal.AwS622S0100000_8;
import kotlin.jvm.internal.AwS636S0100000_22;
import kotlin.jvm.internal.AwS72S1000000_22;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import nv7.c0;

/* JADX INFO: renamed from: X.0mzD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1417330mzD extends i<InterfaceC1417050myl, C1418830n1d, C1418670n1N, C1417770mzv> implements InterfaceC1417050myl {
    public static final C1417680mzm l;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] m;
    public static final int n;
    public final C1DRG LLJILJILJ;
    public final C19A3 LLJILLL;
    public final boolean LLJJ;
    public final C01GW LLJJI;
    public final InterfaceC1731706qJ LLJJIII;
    public final InterfaceC1731706qJ LLJJIJI;
    public final InterfaceC1731706qJ LLJJIJIIJIL;
    public InterfaceC559500Lwy LLJJIJIL;
    public final C560530Lyd<String> LLJJJ;
    public final C560530Lyd<Unit> LLJJJIL;
    public final C560530Lyd<Unit> LLJJJJ;
    public final C560530Lyd<Unit> LLJJJJJIL;
    public final LiveEvent<Unit> LLJJJJLIIL;
    public final C560530Lyd<Unit> LLJJL;
    public final C560530Lyd<Unit> LLJJLIIIJLLLLLLLZ;
    public final C560530Lyd<Pair<Integer, Integer>> LLJL;
    public final C560530Lyd<Pair<Boolean, Boolean>> LLJLIL;
    public final InterfaceC1731706qJ LLJLILLLLZIIL;
    public final C01GW LLJLL;
    public final C01GW LLJLLIL;
    public final C01GW LLJLLL;
    public final C1417620mzg LLJZ;
    public final InterfaceC1731706qJ LLJZIJLIL;
    public final InterfaceC1731706qJ LLL;
    public final InterfaceC1731706qJ LLLF;
    public final InterfaceC1731706qJ LLLFF;
    public final InterfaceC1731706qJ LLLFFI;
    public final InterfaceC1731706qJ LLLFZ;
    public final InterfaceC1731706qJ LLLI;
    public final InterfaceC1731706qJ LLLII;
    public final InterfaceC1731706qJ LLLIIII;
    public final InterfaceC1731706qJ LLLIIIIL;
    public final InterfaceC1731706qJ LLLIIIL;
    public final InterfaceC1731706qJ LLLIIL;
    public final InterfaceC1731706qJ LLLIILIL;
    public final InterfaceC1731706qJ LLLIL;
    public final InterfaceC1731706qJ LLLILZ;
    public final InterfaceC1731706qJ LLLILZJ;
    public final InterfaceC1731706qJ LLLILZLLLI;
    public final InterfaceC1731706qJ LLLIZZ;
    public final InterfaceC1731706qJ LLLJ;
    public final InterfaceC1731706qJ LLLJIL;
    public InterfaceC1461660o8i LLLJL;
    public final InterfaceC1731706qJ LLLL;
    public final InterfaceC1731706qJ LLLLII;
    public final InterfaceC1731706qJ LLLLIIIILLL;
    public final InterfaceC1731706qJ LLLLIIL;
    public final Set<String> LLLLIILL;
    public final InterfaceC1731706qJ LLLLIILLL;
    public C1417310mzB LLLLIL;
    public C1417540mzY LLLLILI;
    public C1417540mzY LLLLJ;
    public boolean LLLLJI;
    public boolean LLLLL;
    public boolean LLLLLIL;
    public long LLLLLILLIL;
    public C1417310mzB LLLLLJIL;
    public boolean LLLLLJLJLL;
    public boolean LLLLLL;
    public boolean LLLLLLIL;
    public EnumC1413160msU LLLLLLJ;
    public boolean LLLLLLL;
    public final C01GW LLLLLLLLL;
    public final C01GW LLLLLLLLLL;
    public final boolean LLLLLLLZIL;
    public final boolean LLLLLLZ;
    public final boolean LLLLLLZZ;
    public boolean LLLLLZ;
    public boolean LLLLLZIL;
    public CreativeLoadingDialog LLLLLZL;
    public C1417310mzB LLLLZ;
    public String LLLLZI;
    public C09AE LLLLZIL;
    public List<AutoCutMediaModel> LLLLZLL;
    public List<AutoCutMediaModel> LLLLZLLIL;
    public final Map<Pair<Integer, C0MJ9>, C1417310mzB> LLLLZLLLI;
    public final Map<String, float[]> LLLZ;
    public final Map<Pair<Integer, C0MJ9>, List<AutoCutTitle>> LLLZI;
    public final C01GW LLLZIIL;
    public final C01GW LLLZIL;
    public final C01GW LLLZL;
    public final C01GW LLLZLL;
    public final C01GW LLLZLZ;
    public final Function0<C1418670n1N> LLLZZ;
    public final Function0<C1417770mzv> LLLZZIL;
    public long LLZ;
    public long LLZIL;
    public long LLZILL;
    public long LLZL;
    public long LLZLI;
    public String LLZLL;
    public String LLZLLIL;
    public String LLZLLLL;
    public int LLZZ;
    public String LLZZJLIL;
    public String LLZZLLIL;
    public int LLZZZIL;
    public int LLZZZZ;
    public boolean a;
    public C1417360mzG b;
    public boolean c;
    public List<AutoCutThemeData> d;
    public final C01GW e;
    public TemplateMobParams f;
    public SelectedMaterialItem g;
    public boolean h;
    public final String i;
    public final C01GW j;
    public final Set<String> k;

    public final void L6() {
        int i;
        C0MJ9 c0mj9;
        String str;
        String str2;
        String str3;
        Pf(false);
        int i2 = -1;
        hh(-1, true);
        C1417310mzB c1417310mzB = this.LLLLIL;
        if (c1417310mzB != null) {
            i = c1417310mzB.LIZIZ;
            c0mj9 = c1417310mzB.LIZ;
            i2 = c1417310mzB.LIZJ;
        } else {
            i = -1;
            c0mj9 = null;
        }
        if (c1417310mzB != null) {
            str = c1417310mzB.LJIIIZ;
            str2 = c1417310mzB.LJIIJ;
            str3 = c1417310mzB.LJIIJJI;
        } else {
            str = null;
            str2 = null;
            str3 = null;
        }
        AutoCutThemeData autoCutThemeData = (AutoCutThemeData) C13LP.LJJJLL(this.d);
        if ((autoCutThemeData != null ? autoCutThemeData.LIZIZ() : null) != C0MJ9.SOUND_SYNC) {
            AutoCutModel autoCutModel = Na().creativeModel.autoCutModel;
            C1417310mzB c1417310mzB2 = this.LLLLIL;
            C1416110mxF.LJIIIZ(autoCutModel, i, c0mj9, i2, str, str2, str3, C0L9M.FIRST_GENERATE_AUTOCUT.getValue(), c1417310mzB2 != null ? c1417310mzB2.LJIIL : null);
            Na().creativeModel.autoCutModel.curRecommendTitleList = this.LLLZI.get(new Pair(Integer.valueOf(i), c0mj9));
            C1417310mzB c1417310mzB3 = this.LLLLZLLLI.get(new Pair(Integer.valueOf(i), c0mj9));
            if (c1417310mzB3 != null) {
                O4(this, c1417310mzB3, false, false);
            } else {
                j9().tl0();
            }
        } else if (Na().mIsFromDraft) {
            AutoCutModel autoCutModel2 = Na().creativeModel.autoCutModel;
            C1417310mzB c1417310mzB4 = this.LLLLIL;
            C1416110mxF.LJIIIZ(autoCutModel2, i, c0mj9, i2, str, str2, str3, C0L9M.FIRST_GENERATE_AUTOCUT.getValue(), c1417310mzB4 != null ? c1417310mzB4.LJIIL : null);
            Na().creativeModel.autoCutModel.curRecommendTitleList = this.LLLZI.get(new Pair(Integer.valueOf(i), c0mj9));
            C1417310mzB c1417310mzB5 = this.LLLLZLLLI.get(new Pair(Integer.valueOf(i), c0mj9));
            if (c1417310mzB5 != null) {
                O4(this, c1417310mzB5, false, false);
            } else {
                j9().tl0();
            }
        } else {
            j9().Ua1();
            C1416110mxF.LJIIIZ(Na().creativeModel.autoCutModel, -1, null, -1, null, null, null, C0L9M.FIRST_GENERATE_AUTOCUT.getValue(), null);
            Na().creativeModel.autoCutModel.curRecommendTitleList = null;
        }
        ze(true);
        String str4 = Na().mShootWay;
        String creationId = Na().getCreationId();
        int origin = Na().getOrigin();
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("enter_from", "video_edit_page");
        c0lab.LJ("shoot_way", str4);
        c0lab.LJ("content_source", origin == 0 ? "upload" : "shoot");
        c0lab.LJ("creation_id", creationId);
        C20684815ws.LJIILLIIL("click_autocut_none_button", c0lab.LIZ);
    }

    @Override // X.InterfaceC1417050myl
    public void Qm1() {
        Fd(this, false, true);
    }

    public final void U5() {
        this.LLLLZI = null;
        this.LLLLZ = null;
    }

    @Override // ge.i, X.InterfaceC1455500nym
    public void show() {
        InterfaceC1418610n1H interfaceC1418610n1HL7;
        CreativeModel creativeModel;
        PhotoModeEditingStage photoModeEditingStage;
        this.LLLLLLIL = false;
        super.show();
        this.LLLLL = true;
        ((C560530Lyd) aM()).LJIIJ(Unit.LIZ);
        InterfaceC524950KiL interfaceC524950KiLY7 = y7();
        if (interfaceC524950KiLY7 != null) {
            interfaceC524950KiLY7.kF(kb());
        }
        Zf(false);
        i3(AFwS261S0000000_22.get$arr$(102));
        i3(new AwS601S0100000_22(this, 183));
        EnumC1413160msU enumC1413160msU = null;
        if (this.LLLLLLLZIL) {
            if (LazyLoadEditLazyGroupPhase1.LIZ().enableLazySafeComponent) {
                ((C0ETY) this.LLJILJILJ.LJII(C0ETY.class, null)).Sd(InterfaceC1452130ntL.class, new AwS260S0000000_22(4));
            } else {
                InterfaceC1452130ntL interfaceC1452130ntLOa = oa();
                if (interfaceC1452130ntLOa != null) {
                    interfaceC1452130ntLOa.aB1(false);
                }
            }
            int iO8 = o8();
            int iYb = yb();
            int iTb = tb();
            int iXb = xb();
            c0.LIZ.n2();
            C1453160nv0 c1453160nv0LIZIZ = C1453170nv1.LIZIZ(iO8, iYb, iTb, iXb, false, false, 1984);
            c1453160nv0LIZIZ.LJIIJ = Boolean.TRUE;
            c1453160nv0LIZIZ.LJIILL = C1417220mz2.LIZ(Na());
            c1453160nv0LIZIZ.LJIILLIIL = false;
            c1453160nv0LIZIZ.LJIIL = new AwS566S0100000_22(this, 274);
            JY0().aM0(c1453160nv0LIZIZ);
        } else {
            VideoPublishEditModel videoPublishEditModelNa = Na();
            if (C1417210mz1.LIZ(videoPublishEditModelNa)) {
                if (videoPublishEditModelNa != null && (creativeModel = videoPublishEditModelNa.creativeModel) != null && (photoModeEditingStage = creativeModel.photoModeEnterEditingStage) != null) {
                    enumC1413160msU = photoModeEditingStage.itemType;
                }
                if (enumC1413160msU == EnumC1413160msU.NONE && (interfaceC1418610n1HL7 = L7()) != null) {
                    interfaceC1418610n1HL7.yR1(true);
                }
            }
        }
        C1451630nsX c1451630nsXT9 = T9();
        if (c1451630nsXT9 != null) {
            c1451630nsXT9.LIZIZ(AFwS261S0000000_22.get$arr$(103));
        }
        H4(true);
        InterfaceC1417110myr interfaceC1417110myrD8 = d8();
        if (interfaceC1417110myrD8 != null) {
            interfaceC1417110myrD8.uQ0();
        }
        ((IAutoCutService) ServiceManager.get().getService(IAutoCutService.class)).LIZJ(System.currentTimeMillis());
    }

    /* JADX WARN: Type inference failed for: r0v58, types: [X.0mzm] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1417330mzD.class, "editAdapterApi", "getEditAdapterApi()Lcom/ss/android/ugc/gamora/editor/adapter/EditAdapterApi;", 0);
        C13LE.LIZ.getClass();
        m = new InterfaceC2217461Bqa[]{c2217381BqS, new C2217381BqS(C1417330mzD.class, "editUgcTemplateApi", "getEditUgcTemplateApi()Lcom/ss/android/ugc/gamora/ugctemplate/EditUgcTemplateApi;", 0), new C2217381BqS(C1417330mzD.class, "autoCutMediaListBridge", "getAutoCutMediaListBridge()Lcom/ss/android/ugc/aweme/shortvideo/autocut/AutoCutMediaListBridge;", 0), new C2217381BqS(C1417330mzD.class, "model", "getModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0), new C2217381BqS(C1417330mzD.class, "editMusicControlApi", "getEditMusicControlApi()Lcom/ss/android/ugc/gamora/editor/IEditMusicController;", 0), new C2217381BqS(C1417330mzD.class, "editAdjustClipsApi", "getEditAdjustClipsApi()Lcom/ss/android/ugc/aweme/shortvideo/editcut/EditAdjustClipsApi;", 0), new C2217381BqS(C1417330mzD.class, "editPreviewApi", "getEditPreviewApi()Lcom/ss/android/ugc/gamora/editor/preview/TiktokEditPreviewApi;", 0), new C2217381BqS(C1417330mzD.class, "editStickApi", "getEditStickApi()Lcom/ss/android/ugc/gamora/editor/sticker/core/EditStickerApi;", 0), new C2217381BqS(C1417330mzD.class, "editLyricStickerApi", "getEditLyricStickerApi()Lcom/ss/android/ugc/gamora/editor/sticker/lyric/LyricStickerEditPageApi;", 0), new C2217381BqS(C1417330mzD.class, "aiCaptionComponentApi", "getAiCaptionComponentApi()Lcom/ss/android/ugc/aweme/aicaption/AIMemeApiComponent;", 0), new C2217381BqS(C1417330mzD.class, "gestureApi", "getGestureApi()Lcom/ss/android/ugc/gamora/editor/gesture/EditGestureApi;", 0), new C2217381BqS(C1417330mzD.class, "editControlApi", "getEditControlApi()Lcom/ss/android/ugc/aweme/shortvideo/edit/editcontrol/EditControlApi;", 0), new C2217381BqS(C1417330mzD.class, "activity", "getActivity()Landroidx/fragment/app/FragmentActivity;", 0), new C2217381BqS(C1417330mzD.class, "editCutMusicApi", "getEditCutMusicApi()Lcom/ss/android/ugc/gamora/editor/cutmusic/EditCutMusicApi;", 0), new C2217381BqS(C1417330mzD.class, "editAutoCutCancellationApi", "getEditAutoCutCancellationApi()Lcom/ss/android/ugc/aweme/shortvideo/autocut/EditAutoCutCancellationApi;", 0), new C2217381BqS(C1417330mzD.class, "editCutToolbarApi", "getEditCutToolbarApi()Lcom/ss/android/ugc/gamora/editor/toolbar/EditToolbarApi;", 0), new C2217381BqS(C1417330mzD.class, "baseEditToolbarApi", "getBaseEditToolbarApi()Lcom/ss/android/ugc/gamora/editor/toolbar/BaseEditToolbarApi;", 0), new C2217381BqS(C1417330mzD.class, "editVolumeV2Api", "getEditVolumeV2Api()Lcom/ss/android/ugc/gamora/editor/volume/EditVolumeV2Api;", 0), new C2217381BqS(C1417330mzD.class, "editSecondPageState", "getEditSecondPageState()Lcom/ss/android/ugc/gamora/editor/EditSecondPageState;", 0), new C2217381BqS(C1417330mzD.class, "gestureService", "getGestureService()Lcom/bytedance/createx/editor/gesture/IGestureService;", 0), new C2217381BqS(C1417330mzD.class, "editMusicApi", "getEditMusicApi()Lcom/ss/android/ugc/gamora/editor/music/EditMusicApi;", 0), new C2217381BqS(C1417330mzD.class, "autoCutPreFetchPugcTemplateApi", "getAutoCutPreFetchPugcTemplateApi()Lcom/ss/android/ugc/aweme/shortvideo/autocut/AutoCutPreFetchPugcTemplateApi;", 0), new C2217381BqS(C1417330mzD.class, "musicController", "getMusicController()Lcom/ss/android/ugc/gamora/editor/IEditMusicController;", 0), new C2217381BqS(C1417330mzD.class, "silentAutoCaptionApi", "getSilentAutoCaptionApi()Lcom/ss/android/ugc/aweme/shortvideo/subtitle/SilentAutoCaptionApiComponent;", 0), new C2217381BqS(C1417330mzD.class, "autoCutImagePreviewApi", "getAutoCutImagePreviewApi()Lcom/ss/android/ugc/aweme/shortvideo/autocut/AutoCutImagePreviewComponentApi;", 0), new C2217381BqS(C1417330mzD.class, "autoCutPreloadApi", "getAutoCutPreloadApi()Lcom/ss/android/ugc/aweme/autocut/AutoCutPreloadingApi;", 0), new C2217381BqS(C1417330mzD.class, "mixEditingMaterialAiAliveApi", "getMixEditingMaterialAiAliveApi()Lcom/ss/android/ugc/gamora/editor/mixediting/ailive/MixEditingMaterialAiAliveApi;", 0), new C2217381BqS(C1417330mzD.class, "templateAutoCutAIApi", "getTemplateAutoCutAIApi()Lcom/ss/android/ugc/aweme/shortvideo/autocut/TemplateAutoCutAIApi;", 0), new C2217381BqS(C1417330mzD.class, "lyricBusinessApi", "getLyricBusinessApi()Lcom/ss/android/ugc/gamora/lyrics/ILyricStickerEffectDataLogicComponent;", 0)};
        l = new Object() { // from class: X.0mzm
        };
        n = 8;
    }

    private final String Bb() {
        return (String) this.LLLZLZ.getValue();
    }

    private final void Be() {
        AutoCutCategory autoCutCategory;
        AutoCutThemeData autoCutThemeData = (AutoCutThemeData) C13LP.LJJJLZIJ(0, this.d);
        if (autoCutThemeData == null || (autoCutCategory = autoCutThemeData.category) == null) {
            Fe(0, this.d.size() - 1);
        } else {
            Ee(autoCutCategory);
            C1432940nOO.LIZ.getClass();
            if (!C1432940nOO.LJII()) {
                List<AutoCutThemeData> list = this.d;
                ArrayList arrayList = new ArrayList();
                for (AutoCutThemeData autoCutThemeData2 : list) {
                    if (Intrinsics.LJFF(autoCutThemeData2.category, autoCutCategory)) {
                        arrayList.add(autoCutThemeData2);
                    }
                }
                Ae(arrayList);
            }
        }
        C1432940nOO.LIZ.getClass();
        if (C1432940nOO.LJII()) {
            Ae(this.d);
        }
    }

    private final void C5() {
        C1420050n3b c1420050n3b = (C1420050n3b) this.LLJILJILJ.LJIIL(null, C1420050n3b.class);
        if (c1420050n3b != null) {
            C0M66.LIZ(new ARunnableS122S0100000_22(c1420050n3b, 29));
        }
    }

    private final void Dd() {
        C0MJ9 c0mj9;
        long jLIZLLL = C1417710mzp.LIZLLL(this.LLZ);
        String str = this.LLZLL;
        String str2 = Na().creativeModel.autoCutModel.taskId;
        List<AutoCutMediaModel> list = this.LLLLZLLIL;
        String str3 = Na().mShootWay;
        String creationId = Na().getCreationId();
        AutoCutModel autoCutModel = Na().creativeModel.autoCutModel;
        C1417310mzB c1417310mzB = this.LLLLZ;
        Integer numValueOf = null;
        if (c1417310mzB != null) {
            c0mj9 = c1417310mzB.LIZ;
            numValueOf = Integer.valueOf(c1417310mzB.LIZIZ);
        } else {
            c0mj9 = null;
        }
        String strLJJIIJ = s.LJJIIJ(autoCutModel, c0mj9, numValueOf);
        String str4 = this.LLZLLIL;
        int i = this.LLZZ;
        String str5 = this.LLZZJLIL;
        C1417710mzp.LJJIIJ("source_switch", true, 0, Integer.MIN_VALUE, null, jLIZLLL, str, str2, list, "video_edit_page", str3, creationId, strLJJIIJ, str4, i, str5 != null && str5.length() > 0, this.LLZLLLL, false);
    }

    private final void Ev() {
        C201955140j.LJIILJJIL(C1398350mUb.LIZIZ, "EditAutoCutComponent#clearMusic");
        C1452640nuA.LJII(null, false, Na().creativeModel.musicBuzModel);
        InterfaceC1454960nxu interfaceC1454960nxu = (InterfaceC1454960nxu) this.LLJILJILJ.LJIIL(null, InterfaceC1454960nxu.class);
        if (interfaceC1454960nxu != null) {
            interfaceC1454960nxu.lr(true);
        }
    }

    private final InterfaceC1453200nv4 I9() {
        return (InterfaceC1453200nv4) this.LLLILZLLLI.getValue(this, m[20]);
    }

    private final InterfaceC564930MDr Ka() {
        return (InterfaceC564930MDr) this.LLLLIIIILLL.getValue(this, m[26]);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0193 A[PHI: r10
      0x0193: PHI (r10v1 java.lang.String) = (r10v0 java.lang.String), (r10v3 java.lang.String) binds: [B:59:0x018f, B:38:0x00da] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0199 A[PHI: r7
      0x0199: PHI (r7v2 java.lang.String) = (r7v0 java.lang.String), (r7v3 java.lang.String) binds: [B:23:0x0094, B:21:0x008a] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void Ld() {
        /*
            Method dump skipped, instruction units count: 417
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1417330mzD.Ld():void");
    }

    private final InterfaceC1454960nxu Oa() {
        return (InterfaceC1454960nxu) this.LLLJ.getValue(this, m[22]);
    }

    private final InterfaceC559500Lwy P9() {
        return (InterfaceC559500Lwy) this.LLJJI.getValue();
    }

    private final void Rd() {
        ((C0ETY) this.LLJILJILJ.LJII(C0ETY.class, null)).Sd(InterfaceC1417440mzO.class, new AwS593S0100000_14(this, 139));
    }

    private final C1451630nsX T9() {
        return (C1451630nsX) this.LLLILZ.getValue(this, m[18]);
    }

    private final C1417190myz W7() {
        return (C1417190myz) this.LLJJIJIIJIL.getValue(this, m[2]);
    }

    private final InterfaceC1416960myc Z7() {
        return (InterfaceC1416960myc) this.LLLIZZ.getValue(this, m[21]);
    }

    private final InterfaceC1455620nyy bc() {
        return (InterfaceC1455620nyy) this.LLLJIL.getValue(this, m[23]);
    }

    private final InterfaceC1417660mzk c9() {
        return (InterfaceC1417660mzk) this.LLLIIIL.getValue(this, m[14]);
    }

    private final InterfaceC1417110myr d8() {
        return (InterfaceC1417110myr) this.LLLLII.getValue(this, m[25]);
    }

    private final InterfaceC1455610nyx h8() {
        return (InterfaceC1455610nyx) this.LLLIILIL.getValue(this, m[16]);
    }

    private final InterfaceC362610EJn kb() {
        return (InterfaceC362610EJn) this.LLLLLLLLL.getValue();
    }

    private final InterfaceC1635410sex ma() {
        return (InterfaceC1635410sex) this.e.getValue();
    }

    private final InterfaceC1457250o1b n9() {
        return (InterfaceC1457250o1b) this.LLLIIIIL.getValue(this, m[13]);
    }

    private final InterfaceC1452130ntL oa() {
        return (InterfaceC1452130ntL) this.LLLI.getValue(this, m[10]);
    }

    private final InterfaceC1461390o8H pa() {
        return (InterfaceC1461390o8H) this.LLLILZJ.getValue(this, m[19]);
    }

    private final boolean re() {
        if (this.LLLLLLJ != Na().creativeModel.photoModeEnterEditingStage.itemType) {
            return true;
        }
        return Na().creativeModel.photoModeEnterEditingStage.photoModeEntryMode == EnumC994360bz0.MULTI_IMAGE && Na().creativeModel.photoModeEnterEditingStage.itemType == EnumC1413160msU.TEMPLATE;
    }

    private final GestureInteractItem sa() {
        return (GestureInteractItem) this.j.getValue();
    }

    private final InterfaceC1455500nym t9() {
        return (InterfaceC1455500nym) this.LLLLLLLLLL.getValue();
    }

    private final C0EZ1 w9() {
        return (C0EZ1) this.LLLFFI.getValue(this, m[8]);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void x5() {
        AutoCutModel autoCutModel;
        int i;
        C0MJ9 c0mj9LJIIJJI;
        NLEModel nLEModelDynamicCast;
        C1463670oBx c1463670oBx;
        String str;
        AutoCutThemeData autoCutThemeDataLJFF;
        C1463670oBx c1463670oBx2;
        if (Na().isCurrentAutoCutMode() && (i = (autoCutModel = Na().creativeModel.autoCutModel).curIndexFromSource) >= 0 && (c0mj9LJIIJJI = C1416110mxF.LJIIJJI(autoCutModel.curSource)) != null) {
            int i2 = autoCutModel.curTemplateType;
            String str2 = autoCutModel.curTemplateId;
            AutoCutThemeData autoCutThemeDataLJFF2 = C1416110mxF.LJFF(i, autoCutModel, c0mj9LJIIJJI);
            NLENode nLENodeDeepClone = null;
            String str3 = autoCutThemeDataLJFF2 != null ? autoCutThemeDataLJFF2.nickName : null;
            AutoCutThemeData autoCutThemeDataLJFF3 = C1416110mxF.LJFF(i, autoCutModel, c0mj9LJIIJJI);
            String str4 = autoCutThemeDataLJFF3 != null ? autoCutThemeDataLJFF3.musicId : null;
            AutoCutThemeData autoCutThemeDataLJFF4 = C1416110mxF.LJFF(i, autoCutModel, c0mj9LJIIJJI);
            String str5 = autoCutThemeDataLJFF4 != null ? autoCutThemeDataLJFF4.musicUrl : null;
            String mMusicPath = Na().getMMusicPath();
            AVMusic aVMusicExtractAVMusic = MusicBeanUtilKt.extractAVMusic(Na().creativeModel.musicBuzModel);
            if (i2 == EnumC1412640mre.PUGC_TEMPLATE.getValue() || i2 == EnumC1412640mre.UGC_TEMPLATE.getValue()) {
                C0FGC.LIZ(2);
                AutoCutThemeData autoCutThemeDataLJ = C1403130mcJ.LJ(autoCutModel.templateList, autoCutModel.curIndexFromSource, C1416110mxF.LJIIJJI(autoCutModel.curSource));
                if (autoCutThemeDataLJ == null || (str = autoCutThemeDataLJ.templateData) == null || (nLEModelDynamicCast = NLETemplateModel.saveToDraft(NLETemplateModel.restore(str))) == null) {
                    if (Na().mIsFromDraft) {
                        AbstractC1452680nuE abstractC1452680nuEGc = JY0().gc();
                        InterfaceC1452170ntP interfaceC1452170ntPLJJ = abstractC1452680nuEGc != null ? abstractC1452680nuEGc.LJJ() : null;
                        if ((interfaceC1452170ntPLJJ instanceof C1463670oBx) && (c1463670oBx = (C1463670oBx) interfaceC1452170ntPLJJ) != null) {
                            nLENodeDeepClone = c1463670oBx.LIZJ().deepClone();
                        }
                        nLEModelDynamicCast = NLEModel.dynamicCast(nLENodeDeepClone);
                    } else {
                        nLEModelDynamicCast = null;
                    }
                }
            } else {
                AbstractC1452680nuE abstractC1452680nuEGc2 = JY0().gc();
                InterfaceC1452170ntP interfaceC1452170ntPLJJ2 = abstractC1452680nuEGc2 != null ? abstractC1452680nuEGc2.LJJ() : null;
                if ((interfaceC1452170ntPLJJ2 instanceof C1463670oBx) && (c1463670oBx2 = (C1463670oBx) interfaceC1452170ntPLJJ2) != null) {
                    nLENodeDeepClone = c1463670oBx2.LIZJ().deepClone();
                }
                nLEModelDynamicCast = NLEModel.dynamicCast(nLENodeDeepClone);
            }
            Fz(new C1417310mzB(c0mj9LJIIJJI, i, i2, str3, aVMusicExtractAVMusic, mMusicPath, nLEModelDynamicCast, str2, null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, str5, str4, 0 == true ? 1 : 0, false, 15203648), false);
            if (!Na().mIsFromDraft || nLEModelDynamicCast == null || (autoCutThemeDataLJFF = C1416110mxF.LJFF(i, autoCutModel, c0mj9LJIIJJI)) == null || !C1402530mbL.LIZIZ(autoCutThemeDataLJFF.featureBits, autoCutThemeDataLJFF.featureCode)) {
                return;
            }
            ((C0ETY) this.LLJILJILJ.LJII(C0ETY.class, null)).Sd(InterfaceC1417440mzO.class, new AwS388S0200000_22(autoCutThemeDataLJFF, nLEModelDynamicCast, 30));
        }
    }

    private final InterfaceC524950KiL y7() {
        InterfaceC524950KiL interfaceC524950KiL = (InterfaceC524950KiL) this.LLJILJILJ.LJIIL(null, InterfaceC524950KiL.class);
        return interfaceC524950KiL == null ? C0MWZ.LIZ(this.LLJILLL) : interfaceC524950KiL;
    }

    public final InterfaceC366450EYh Ba() {
        return (InterfaceC366450EYh) this.LLLLIILLL.getValue(this, m[28]);
    }

    public final C1415130mvf Da() {
        return (C1415130mvf) this.LLJLLL.getValue();
    }

    @Override // X.InterfaceC1417050myl
    public void FN() {
        this.LLJJJIL.LJIIJ(Unit.LIZ);
    }

    public final C0EXI I7() {
        return (C0EXI) this.LLLFZ.getValue(this, m[9]);
    }

    public final InterfaceC1454960nxu J9() {
        return (InterfaceC1454960nxu) this.LLJZIJLIL.getValue(this, m[4]);
    }

    public final InterfaceC1446740nke JY0() {
        return (InterfaceC1446740nke) this.LLLF.getValue(this, m[6]);
    }

    public final InterfaceC1418610n1H L7() {
        return (InterfaceC1418610n1H) this.LLLL.getValue(this, m[24]);
    }

    public final VideoPublishEditModel Na() {
        return (VideoPublishEditModel) this.LLJLILLLLZIIL.getValue(this, m[3]);
    }

    public final void T6() {
        CreativeLoadingDialog creativeLoadingDialog = this.LLLLLZL;
        if (creativeLoadingDialog != null) {
            creativeLoadingDialog.dismiss();
        }
        this.LLLLLZL = null;
    }

    public final InterfaceC1455850nzL T8() {
        return (InterfaceC1455850nzL) this.LLJJIII.getValue(this, m[0]);
    }

    public final InterfaceC1461350o8D U9() {
        return (InterfaceC1461350o8D) this.LLLFF.getValue(this, m[7]);
    }

    public final InterfaceC366660EZc V9() {
        return (InterfaceC366660EZc) this.LLJJIJI.getValue(this, m[1]);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00da  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Yg() {
        /*
            Method dump skipped, instruction units count: 311
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1417330mzD.Yg():void");
    }

    public final InterfaceC1419190n2D a9() {
        return (InterfaceC1419190n2D) this.LLL.getValue(this, m[5]);
    }

    @Override // X.InterfaceC1417050myl
    public void clearCache() {
        this.LLLLZLLLI.clear();
        this.LLLZI.clear();
        C13BV c13bv = C13BV.INSTANCE;
        Nf(c13bv);
        Na().creativeModel.autoCutModel.oriMediaList = c13bv;
        this.LLLLZLLIL = c13bv;
    }

    public final InterfaceC1418580n1E da() {
        return (InterfaceC1418580n1E) this.LLLIL.getValue(this, m[17]);
    }

    public final C0EMC dc() {
        return (C0EMC) this.LLJLLIL.getValue();
    }

    public final C19EG getActivity() {
        return (C19EG) this.LLLIIII.getValue(this, m[12]);
    }

    public final InterfaceC366390EYb j9() {
        return (InterfaceC366390EYb) this.LLLII.getValue(this, m[11]);
    }

    public final C0EWD kc() {
        return (C0EWD) this.LLJLL.getValue();
    }

    public final InterfaceC1417440mzO mc() {
        return (InterfaceC1417440mzO) this.LLLLIIL.getValue(this, m[27]);
    }

    public final void nd() {
        C1417710mzp.LJIIJ("source_switch", true, 0, null, C1417710mzp.LIZLLL(this.LLZILL), this.LLZLL, Na().mShootWay, Na().getCreationId());
    }

    public final int o8() {
        return ((Number) this.LLLZLL.getValue()).intValue();
    }

    @Override // X.InterfaceC1417050myl
    public void os1() {
        this.LLJJJ.LJIIJ(null);
    }

    public final InterfaceC1460000o62 q9() {
        return (InterfaceC1460000o62) this.LLLIIL.getValue(this, m[15]);
    }

    public final int tb() {
        return ((Number) this.LLLZIL.getValue()).intValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x012c A[PHI: r6
      0x012c: PHI (r6v5 java.lang.String) = (r6v4 java.lang.String), (r6v7 java.lang.String) binds: [B:45:0x0129, B:40:0x00ff] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void ue() {
        /*
            Method dump skipped, instruction units count: 333
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1417330mzD.ue():void");
    }

    public final void we() {
        i3(AFwS261S0000000_22.get$arr$(101));
        Ld();
        hh(-1, true);
        if (this.LLLLLLJ == EnumC1413160msU.TEMPLATE) {
            m6(false, EnumC1417170myx.PHOTO_MODE_NONE.getIndex(), this.LLLLJ);
        }
        ch(EnumC1417170myx.PHOTO_MODE_NONE);
        Na().creativeModel.autoCutModel.isNone = true;
        C1417710mzp.LJJIIZI(this.LLLLZLLIL, "video_edit_page", Na().mShootWay, Na().getCreationId(), null, null, null, Na().getOrigin(), null, Na().creativeModel.autoCutModel.clickFrom, null, null, Na().creativeModel.autoCutModel.taskId, null, null, null, C1412490mrP.LIZIZ(Na()), null, null, null, false, Na(), Na().getMusicId(), Integer.valueOf(AssetFrom.OTHERS.getValue()), new AwS601S0100000_22(this, 182), false, 0, false, null, 604119040);
    }

    public final int xb() {
        return ((Number) this.LLLZL.getValue()).intValue();
    }

    public final int yb() {
        return ((Number) this.LLLZIIL.getValue()).intValue();
    }

    public final void zd() {
        C1417710mzp.LJIILIIL("source_switch", C1417710mzp.LIZLLL(this.LLZIL), this.LLZLL, Na().mShootWay, Na().getCreationId());
    }

    private final void S5() {
        C385670FAf<InterfaceC1461650o8h> c385670FAfIz2;
        InterfaceC1461650o8h interfaceC1461650o8hLIZJ;
        C385670FAf<InterfaceC1461660o8i> c385670FAfAT;
        InterfaceC1461660o8i interfaceC1461660o8iLIZJ;
        InterfaceC1455850nzL interfaceC1455850nzLT8 = T8();
        if (interfaceC1455850nzLT8 != null && (c385670FAfAT = interfaceC1455850nzLT8.AT()) != null && (interfaceC1461660o8iLIZJ = c385670FAfAT.LIZJ()) != null) {
            interfaceC1461660o8iLIZJ.Yr();
        }
        InterfaceC1455850nzL interfaceC1455850nzLT82 = T8();
        if (interfaceC1455850nzLT82 == null || (c385670FAfIz2 = interfaceC1455850nzLT82.Iz2()) == null || (interfaceC1461650o8hLIZJ = c385670FAfIz2.LIZJ()) == null) {
            return;
        }
        interfaceC1461650o8hLIZJ.Nm();
    }

    private final String Vb() {
        AutoCutThemeData autoCutThemeData;
        int iIntValue = T2().LIZIZ.LIZ.intValue();
        if (iIntValue >= 0 && (autoCutThemeData = (AutoCutThemeData) C13LP.LJJJLZIJ(iIntValue, this.d)) != null) {
            return autoCutThemeData.uuid;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x015f  */
    /* JADX WARN: Type inference failed for: r5v0, types: [X.0mzP, X.0mzi] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void Xi() {
        /*
            Method dump skipped, instruction units count: 402
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1417330mzD.Xi():void");
    }

    private final void d6() {
        dc().LIZJ();
        Na();
        Na().getMusicOriginWithCheck();
        Ev();
    }

    private final void wg() {
        boolean zLJI = MethodIDManager.LJI(72056);
        List<AutoCutThemeData> list = this.d;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<AutoCutThemeData> it2 = list.iterator();
            while (it2.hasNext()) {
                if (it2.next().LIZIZ() == C0MJ9.PLACE_HOLDER) {
                    this.c = true;
                    C201955140j.LJIILJJIL(C1398350mUb.LIZIZ, "EditAutoCutComponent#startPreload: orderedMusicList contains placeholders, deferring preload to template list update");
                    if (zLJI) {
                        MethodIDManager.LJ();
                        return;
                    }
                    return;
                }
            }
        }
        this.c = false;
        C1417360mzG c1417360mzG = new C1417360mzG(Na(), this.LLLLZLLIL, this.a);
        this.b = c1417360mzG;
        C1417340mzE c1417340mzE = c1417360mzG.LIZIZ;
        if (c1417340mzE != null) {
            c1417340mzE.LJIIIIZZ = new AwS636S0100000_22(this, 9);
        }
        Be();
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    private final C1417540mzY y8() {
        VideoPublishEditModel videoPublishEditModelNa;
        String mMusicPath;
        AVMusic aVMusicExtractAVMusic = MusicBeanUtilKt.extractAVMusic(Na().creativeModel.musicBuzModel);
        if (aVMusicExtractAVMusic == null || (videoPublishEditModelNa = Na()) == null || (mMusicPath = videoPublishEditModelNa.getMMusicPath()) == null) {
            return null;
        }
        return new C1417540mzY(aVMusicExtractAVMusic, mMusicPath, Na().getMMusicStart(), Float.valueOf(Na().getMusicVolume()));
    }

    private final String z8() {
        C1463670oBx c1463670oBx;
        AbstractC1452680nuE abstractC1452680nuEGc = JY0().gc();
        NLEModel nLEModelLIZJ = null;
        InterfaceC1452170ntP interfaceC1452170ntPLJJ = abstractC1452680nuEGc != null ? abstractC1452680nuEGc.LJJ() : null;
        if ((interfaceC1452170ntPLJJ instanceof C1463670oBx) && (c1463670oBx = (C1463670oBx) interfaceC1452170ntPLJJ) != null) {
            nLEModelLIZJ = c1463670oBx.LIZJ();
        }
        return gb(nLEModelLIZJ);
    }

    public final void Id() {
        InterfaceC1417440mzO interfaceC1417440mzOMc = mc();
        boolean z = false;
        boolean z2 = true;
        if (interfaceC1417440mzOMc != null && interfaceC1417440mzOMc.bF()) {
            AutoCutModel autoCutModel = Na().creativeModel.autoCutModel;
            s sVar = s.LIZ;
            List<AutoCutThemeData> list = this.d;
            sVar.getClass();
            int iLJIILLIIL = s.LJIILLIIL(autoCutModel, list);
            AutoCutThemeData autoCutThemeData = (AutoCutThemeData) C13LP.LJJJLZIJ(iLJIILLIIL, this.d);
            Td(iLJIILLIIL, autoCutThemeData != null ? autoCutThemeData.uuid : null);
        }
        VideoPublishEditModel videoPublishEditModelNa = Na();
        AbstractC1452680nuE abstractC1452680nuEGc = JY0().gc();
        videoPublishEditModelNa.setNleData(abstractC1452680nuEGc != null ? abstractC1452680nuEGc.LJJ().Zf() : null);
        Na().creativeModel.autoCutAnchorModel.nleData = Na().getNleData();
        Yg();
        if (C1417210mz1.LIZJ(Na()) && this.LLLLLLJ == EnumC1413160msU.NONE) {
            this.LLLLLIL = true;
            Ld();
            C1417360mzG c1417360mzG = this.b;
            if (c1417360mzG != null) {
                c1417360mzG.cancel();
            }
            xf(new AutoCutReturn(z2, z, 30));
            return;
        }
        this.LLJJL.LJIIJ(Unit.LIZ);
        this.LLLLLIL = true;
        Ld();
        C1417360mzG c1417360mzG2 = this.b;
        if (c1417360mzG2 != null) {
            c1417360mzG2.cancel();
        }
        InterfaceC564930MDr interfaceC564930MDrKa = Ka();
        if (interfaceC564930MDrKa != null) {
            interfaceC564930MDrKa.ix1();
        }
    }

    public final void O() {
        NLEModel nLEModelLIZ;
        NLETrack mainTrack;
        AutoCutModel autoCutModel = Na().creativeModel.autoCutModel;
        C12VU c12vu = (C12VU) ((C0ETY) this.LLJILJILJ.LJII(C0ETY.class, null)).MY1(C12VU.class);
        boolean z = autoCutModel.curTemplateType == EnumC1412640mre.LYRICS_RULE_TEMPLATE.getValue();
        if (C1416110mxF.LJIIJJI(autoCutModel.curSource) == C0MJ9.SOUND_SYNC || z) {
            Na().setEditMusicSyncMode(true);
            if (c12vu != null) {
                c12vu.Z10(true);
            }
        } else {
            Na().setEditMusicSyncMode(false);
            if (c12vu != null) {
                c12vu.Z10(false);
            }
            Na().creativeModel.autoCutAnchorModel.nleData = Na().getNleData();
        }
        VideoPublishEditModel videoPublishEditModelNa = Na();
        AbstractC1452680nuE abstractC1452680nuEGc = JY0().gc();
        videoPublishEditModelNa.setNleData(abstractC1452680nuEGc != null ? abstractC1452680nuEGc.LJJ().Zf() : null);
        Na().creativeModel.autoCutAnchorModel.nleData = Na().getNleData();
        if (EnumC1412640mre.PUGC_TEMPLATE.getValue() == Na().creativeModel.autoCutModel.curTemplateType) {
            int i = Na().creativeModel.autoCutModel.curIndexFromSource;
            if (i < 0) {
                i = 0;
            }
            AbstractC1452680nuE abstractC1452680nuEGc2 = JY0().gc();
            String extra = (abstractC1452680nuEGc2 == null || (nLEModelLIZ = C352130DrH.LIZ(abstractC1452680nuEGc2.LJJ())) == null || (mainTrack = nLEModelLIZ.getMainTrack()) == null) ? null : mainTrack.getExtra("biz_ugc_template_cover_time");
            if (C298990Bnl.LIZ() && C123100dR.LIZ(extra)) {
                Float fLJIIIIZZ = extra != null ? C2327809Ae.LJIIIIZZ(extra) : null;
                Na().setVideoCoverStartTm(fLJIIIIZZ != null ? fLJIIIIZZ.floatValue() : 0.0f);
            }
            if (((Boolean) C0BO2.LIZ.getValue()).booleanValue()) {
                AutoCutThemeData autoCutThemeData = (AutoCutThemeData) C13LP.LJJJLZIJ(i, Na().creativeModel.autoCutModel.templateList);
                String str = autoCutThemeData != null ? autoCutThemeData.name : null;
                PUgcTemplateData pUgcTemplateData = Na().creativeModel.pugcTemplateData;
                if (str == null) {
                    str = "";
                }
                pUgcTemplateData.templateTitle = str;
            }
        }
        InterfaceC559500Lwy interfaceC559500LwyP9 = (C365940EWi.LIZLLL(Na()) || LazyLoadEditLazyGroupPhase1.LIZ().enableLazySafeComponent) ? P9() : this.LLJJIJIL;
        if (interfaceC559500LwyP9 != null) {
            interfaceC559500LwyP9.Qk(false);
        }
    }

    @Override // X.InterfaceC1417050myl
    public void Qd() {
        dc().LIZJ();
    }

    @Override // X.InterfaceC1417050myl
    public int ZM1() {
        return xb();
    }

    public final VideoPublishEditModel bb2() {
        return Na();
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x009f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void cancel() {
        /*
            Method dump skipped, instruction units count: 293
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1417330mzD.cancel():void");
    }

    @Override // ge.i, X.InterfaceC1455500nym
    public void hide() {
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C353500DtU(this, null), 3);
        this.LLLLL = false;
        InterfaceC524950KiL interfaceC524950KiLY7 = y7();
        if (interfaceC524950KiLY7 != null) {
            interfaceC524950KiLY7.b8(kb());
        }
        i3(new AwS601S0100000_22(this, 170));
        if (this.LLLLLLLZIL) {
            InterfaceC1446740nke interfaceC1446740nkeJY0 = JY0();
            int iO8 = o8();
            int iYb = yb();
            int iTb = tb();
            int iXb = xb();
            c0.LIZ.n2();
            C1453160nv0 c1453160nv0LIZ = C1453170nv1.LIZ(iO8, iYb, iTb, iXb);
            c1453160nv0LIZ.LJIIL = new AwS566S0100000_22(this, 267);
            interfaceC1446740nkeJY0.aM0(c1453160nv0LIZ);
            if (LazyLoadEditLazyGroupPhase1.LIZ().enableLazySafeComponent) {
                ((C0ETY) this.LLJILJILJ.LJII(C0ETY.class, null)).Sd(InterfaceC1452130ntL.class, new AwS260S0000000_22(0));
            } else {
                InterfaceC1452130ntL interfaceC1452130ntLOa = oa();
                if (interfaceC1452130ntLOa != null) {
                    interfaceC1452130ntLOa.aB1(true);
                }
            }
        } else {
            JY0().rh0(true ^ T2().LIZJ);
            C1456140nzo.LIZIZ(JY0(), true, false, false, false, 12);
        }
        C1451630nsX c1451630nsXT9 = T9();
        if (c1451630nsXT9 != null) {
            c1451630nsXT9.LIZIZ(AFwS261S0000000_22.get$arr$(96));
        }
        if (C301690Bs7.LIZ()) {
            this.LLJJJJJIL.LJIIJ(Unit.LIZ);
        }
        InterfaceC564930MDr interfaceC564930MDrKa = Ka();
        if (interfaceC564930MDrKa != null) {
            interfaceC564930MDrKa.ix1();
        }
    }

    @Override // X.InterfaceC1417050myl
    public void lJ1() {
        Ev();
        Na().setVeAudioRecorderParam(null);
        InterfaceC1418580n1E interfaceC1418580n1EDa = da();
        if (interfaceC1418580n1EDa != null) {
            C1414930mvL.LIZ.getClass();
            interfaceC1418580n1EDa.Hr1(true, false, C1414930mvL.LJIILIIL());
            if (!C291340BbQ.LIZ() || C1414600muo.LJFF(Na().getVoiceVolume(), 1.0f)) {
                interfaceC1418580n1EDa.N81(1.0f);
            }
        }
        d32(C0MJ9.MIX_EDITING);
        kc().LJFF(false, false, false);
        Na().creativeModel.mixEditingModel.templateMobParams = null;
        Fj2(null);
    }

    @Override // X.InterfaceC1417050myl
    public int lw2() {
        return yb();
    }

    @Override // ge.i, X.AbstractC2255721DQs
    public void onCreate() {
        InterfaceC1455610nyx interfaceC1455610nyxH8;
        List<AutoCutMediaModel> listLJIIJ;
        C0L4W c0l4w;
        boolean zLJI = MethodIDManager.LJI(202410);
        super.onCreate();
        s.LJJLIIIJLLLLLLLZ(C2537209ww.LIZ());
        C1417160myw c1417160myw = C1417160myw.LIZ;
        VideoPublishEditModel videoPublishEditModelNa = Na();
        c1417160myw.getClass();
        if (C1417160myw.LJIJI(videoPublishEditModelNa) && !C0L0X.LIZ(Na().creativeModel) && (listLJIIJ = C1417160myw.LJIIJ(getActivity(), Na(), this.LLJILJILJ, true)) != null && (!((ArrayList) listLJIIJ).isEmpty()) && (c0l4w = (C0L4W) this.LLJILJILJ.LJIIL(null, C0L4W.class)) != null) {
            c0l4w.OG1(listLJIIJ, C1416110mxF.LIZLLL(Na().creativeModel.autoCutModel), this.LLZLL, 15, ((ICommerceMediaService) ServiceManager.get().getService(ICommerceMediaService.class)).LJ(), Na().getCreativeInfo(), C1418290n0l.LIZ(Na().creativeModel.autoCutModel.clickFrom), Na().mShootWay, C1417160myw.LIZIZ(Na()), null, new AwS622S0100000_8(this, 13));
        }
        if (this.LLJJ && (interfaceC1455610nyxH8 = h8()) != null) {
            interfaceC1455610nyxH8.Fe2(false);
        }
        Xi();
        if (!C365940EWi.LIZLLL(Na()) && !LazyLoadEditLazyGroupPhase1.LIZ().enableLazySafeComponent) {
            this.LLJJIJIL = (InterfaceC559500Lwy) this.LLJILJILJ.LJIIL(null, InterfaceC559500Lwy.class);
        }
        if (LazyLoadEditLazyGroupPhase1.LIZ().enableLazySafeComponent) {
            ((C0ETY) this.LLJILJILJ.LJII(C0ETY.class, null)).Sd(InterfaceC532760Kuw.class, new AwS587S0100000_8(this, 105));
        }
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    @Override // X.AbstractC2255721DQs
    public void onDestroy() {
        super.onDestroy();
        if (C1417030myj.LIZ()) {
            synchronized (s.LIZ) {
                s.LJII = null;
                s.LJIIIIZZ = null;
                s.LJIIIZ = null;
            }
        }
        C0CHQ.LIZ().getPublishService().LJJIJIL();
    }

    @Override // X.AbstractC2255721DQs
    public void onResume() {
        AutoCutProcessViewModel autoCutProcessViewModel;
        MutableLiveData<List<AutoCutThemeData>> mutableLiveData;
        List<AutoCutThemeData> value;
        super.onResume();
        if (!C1417030myj.LIZ() && C1417040myk.LIZ()) {
            List<AutoCutThemeData> list = this.d;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator<AutoCutThemeData> it2 = list.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    if (it2.next().LIZIZ() == C0MJ9.PLACE_HOLDER) {
                        ViewModelProvider viewModelProviderLIZ = C0L3U.LIZ(getActivity());
                        if (viewModelProviderLIZ != null && (autoCutProcessViewModel = (AutoCutProcessViewModel) viewModelProviderLIZ.get(AutoCutProcessViewModel.class)) != null && (mutableLiveData = autoCutProcessViewModel.LL) != null && (value = mutableLiveData.getValue()) != null) {
                            if (value.isEmpty()) {
                                C201955140j.LJIILJJIL(C1398350mUb.LIZIZ, "EditAutoCutComponent#onResume: refreshing from ViewModel, size=" + value.size());
                                Cg(value);
                            } else {
                                Iterator<AutoCutThemeData> it3 = value.iterator();
                                while (it3.hasNext()) {
                                    if (it3.next().LIZIZ() == C0MJ9.PLACE_HOLDER) {
                                        break;
                                    }
                                }
                                C201955140j.LJIILJJIL(C1398350mUb.LIZIZ, "EditAutoCutComponent#onResume: refreshing from ViewModel, size=" + value.size());
                                Cg(value);
                            }
                        }
                    }
                }
            }
        }
        if (this.LLLLL && this.LLLLLIL) {
            if (this.LLLLLLLZIL) {
                InterfaceC1446740nke interfaceC1446740nkeJY0 = JY0();
                int iO8 = o8();
                int iYb = yb();
                int iTb = tb();
                int iXb = xb();
                c0.LIZ.n2();
                C1453160nv0 c1453160nv0LIZIZ = C1453170nv1.LIZIZ(iO8, iYb, iTb, iXb, false, false, 1984);
                c1453160nv0LIZIZ.LJIIIZ = 0L;
                c1453160nv0LIZIZ.LJIIJ = Boolean.TRUE;
                c1453160nv0LIZIZ.LJIILL = C1417220mz2.LIZ(Na());
                interfaceC1446740nkeJY0.aM0(c1453160nv0LIZIZ);
            }
            JY0().vW1().setValue(C1452730nuJ.LIZ());
            mg(false);
            this.LLLLLILLIL = System.currentTimeMillis();
        }
        this.LLLLLIL = false;
    }

    public final void publish() {
        InterfaceC1417440mzO interfaceC1417440mzOMc = mc();
        boolean z = true;
        boolean z2 = false;
        if (interfaceC1417440mzOMc != null && interfaceC1417440mzOMc.bF()) {
            AutoCutModel autoCutModel = Na().creativeModel.autoCutModel;
            s sVar = s.LIZ;
            List<AutoCutThemeData> list = this.d;
            sVar.getClass();
            int iLJIILLIIL = s.LJIILLIIL(autoCutModel, list);
            AutoCutThemeData autoCutThemeData = (AutoCutThemeData) C13LP.LJJJLZIJ(iLJIILLIIL, this.d);
            Td(iLJIILLIIL, autoCutThemeData != null ? autoCutThemeData.uuid : null);
        }
        if (C1417210mz1.LIZJ(Na()) && this.LLLLLLJ == EnumC1413160msU.NONE) {
            Ld();
            C1417360mzG c1417360mzG = this.b;
            if (c1417360mzG != null) {
                c1417360mzG.cancel();
            }
            xf(new AutoCutReturn(z2, z, 29));
            return;
        }
        VideoPublishEditModel videoPublishEditModelNa = Na();
        AbstractC1452680nuE abstractC1452680nuEGc = JY0().gc();
        videoPublishEditModelNa.setNleData(abstractC1452680nuEGc != null ? abstractC1452680nuEGc.LJJ().Zf() : null);
        Na().creativeModel.autoCutAnchorModel.nleData = Na().getNleData();
        this.LLJJLIIIJLLLLLLLZ.LJIIJ(Unit.LIZ);
        Ld();
        C1417360mzG c1417360mzG2 = this.b;
        if (c1417360mzG2 != null) {
            c1417360mzG2.cancel();
        }
    }

    public final boolean ye() {
        return C1417210mz1.LIZ(Na());
    }

    public C560530Lyd<Unit> Cb() {
        return this.LLJJLIIIJLLLLLLLZ;
    }

    @Override // X.InterfaceC1417050myl
    public /* bridge */ /* synthetic */ LiveEvent FW1() {
        return this.LLJL;
    }

    @Override // X.InterfaceC1417050myl
    public /* bridge */ /* synthetic */ LiveEvent HC2() {
        return this.LLJJJJ;
    }

    public C560530Lyd<Unit> J8() {
        return this.LLJJJJ;
    }

    public C560530Lyd<String> Lb() {
        return this.LLJJJ;
    }

    @Override // X.InterfaceC1417050myl
    public /* bridge */ /* synthetic */ LiveEvent WR() {
        return this.LLJJJIL;
    }

    @Override // X.InterfaceC1417050myl
    public /* bridge */ /* synthetic */ LiveEvent Yx() {
        return this.LLJJJ;
    }

    @Override // X.InterfaceC1417050myl
    public boolean Z72() {
        return this.LLLLL;
    }

    @Override // X.InterfaceC1417050myl
    public LiveEvent<Unit> aM() {
        return this.LLJJJJLIIL;
    }

    @Override // X.InterfaceC1417050myl
    public /* bridge */ /* synthetic */ LiveEvent bR1() {
        return this.LLJJL;
    }

    @Override // X.InterfaceC1417050myl
    public /* bridge */ /* synthetic */ LiveEvent bv0() {
        return this.LLJJJJJIL;
    }

    public C560530Lyd<Unit> cb() {
        return this.LLJJL;
    }

    @Override // X.InterfaceC1417050myl
    public /* bridge */ /* synthetic */ LiveEvent kG0() {
        return this.LLJJLIIIJLLLLLLLZ;
    }

    @Override // X.InterfaceC1417050myl
    public List<AutoCutMediaModel> nw2() {
        return this.LLLLZLL;
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C1418670n1N> o2() {
        return this.LLLZZ;
    }

    public final C560530Lyd<Pair<Boolean, Boolean>> p8() {
        return this.LLJLIL;
    }

    public C560530Lyd<Pair<Integer, Integer>> r8() {
        return this.LLJL;
    }

    public C560530Lyd<Unit> ra() {
        return this.LLJJJJJIL;
    }

    public C560530Lyd<Unit> u8() {
        return this.LLJJJIL;
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C1417770mzv> w2() {
        return this.LLLZZIL;
    }

    private final void Ae(List<AutoCutThemeData> list) {
        C1417360mzG c1417360mzG;
        C1417460mzQ c1417460mzQ;
        String str;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (((AutoCutThemeData) ListProtector.get(list, i)).LIZIZ() != null && ((AutoCutThemeData) ListProtector.get(list, i)).LIZIZ() != C0MJ9.SOUND_SYNC) {
                Pair pair = new Pair(Integer.valueOf(((AutoCutThemeData) ListProtector.get(list, i)).indexFromSource), ((AutoCutThemeData) ListProtector.get(list, i)).LIZIZ());
                int iIntValue = ((Number) pair.getFirst()).intValue();
                Object second = pair.getSecond();
                if (second != null && (c1417360mzG = this.b) != null && (c1417460mzQ = c1417360mzG.LIZJ) != null) {
                    Pair pair2 = new Pair(Integer.valueOf(iIntValue), second);
                    if (c1417460mzQ.LIZIZ.get(pair2) != null) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("preload: task already exist. task theme=");
                        sbLIZ.append(pair2);
                        C2188811AlT.LIZIZ(sbLIZ);
                    } else {
                        AutoCutThemeData autoCutThemeDataLJ = C1403130mcJ.LJ(c1417460mzQ.LIZ.creativeModel.autoCutModel.templateList, ((Number) pair2.getFirst()).intValue(), (C0MJ9) pair2.getSecond());
                        if (autoCutThemeDataLJ != null && (str = autoCutThemeDataLJ.coverUrl) != null) {
                            new C1417670mzl(str);
                            if (str.length() != 0) {
                                if (C1324750kZt.LJIIZILJ(UriProtector.parse(str))) {
                                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                    sbLIZ2.append("execute: already downloaded. url=");
                                    sbLIZ2.append(str);
                                    C2188811AlT.LIZIZ(sbLIZ2);
                                } else {
                                    C1328130kfL.LJIILIIL().LJIIL().LJIIZILJ(C1325710kbR.LIZIZ(str), null);
                                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                                    sbLIZ3.append("execute: url=");
                                    sbLIZ3.append(str);
                                    C2188811AlT.LIZIZ(sbLIZ3);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    private final C443120HZe<Long, Long, String> E5(NLEModel nLEModel) {
        NLETrack next;
        VecNLETrackSlotSPtr slots;
        NLETrackSlot nLETrackSlot;
        NLESegmentAudio nLESegmentAudioDynamicCast;
        String resourceFile;
        C443120HZe<Long, Long, String> c443120HZe = null;
        if (nLEModel == null) {
            return null;
        }
        Iterator<NLETrack> it2 = nLEModel.getTracks().iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (C351220Dpo.LLILZ(next)) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        NLETrack nLETrack = next;
        if (nLETrack != null && (slots = nLETrack.getSlots()) != null && (nLETrackSlot = (NLETrackSlot) C13LP.LJJJLL(slots)) != null && (nLESegmentAudioDynamicCast = NLESegmentAudio.dynamicCast(nLETrackSlot.getMainSegment())) != null) {
            Long lValueOf = Long.valueOf(nLESegmentAudioDynamicCast.getTimeClipStart());
            Long lValueOf2 = Long.valueOf(nLESegmentAudioDynamicCast.getTimeClipEnd());
            NLEResourceAV aVFile = nLESegmentAudioDynamicCast.getAVFile();
            if (aVFile == null || (resourceFile = aVFile.getResourceFile()) == null) {
                resourceFile = "";
            }
            c443120HZe = new C443120HZe<>(lValueOf, lValueOf2, resourceFile);
        }
        return c443120HZe;
    }

    private final void Ee(AutoCutCategory autoCutCategory) {
        Pair<Integer, Integer> pairGa = Ga(autoCutCategory);
        Fe(pairGa.getFirst().intValue(), pairGa.getSecond().intValue());
    }

    private final Pair<Integer, Integer> Ga(AutoCutCategory autoCutCategory) {
        int iMax = 0;
        if (autoCutCategory == null) {
            return new Pair<>(0, Integer.valueOf(this.d.size() - 1));
        }
        int iMin = Integer.MAX_VALUE;
        int i = 0;
        for (AutoCutThemeData autoCutThemeData : this.d) {
            int i2 = i + 1;
            if (i >= 0) {
                if (Intrinsics.LJFF(autoCutCategory, autoCutThemeData.category)) {
                    iMin = Math.min(iMin, i);
                    iMax = Math.max(iMax, i);
                }
                i = i2;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
        if (iMin <= iMax) {
            return new Pair<>(Integer.valueOf(iMin), Integer.valueOf(iMax));
        }
        return new Pair<>(0, Integer.valueOf(this.d.size() - 1));
    }

    private final void M5(C1417310mzB c1417310mzB) {
        NLEModel nLEModel = c1417310mzB.LJII;
        if (nLEModel == null || nLEModel.getMainTrack() == null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("EditAutoCutComponent AUTO_CUT_NO_TRACK_CRASH: musicLogId=");
            sbLIZ.append(Na().creativeModel.autoCutModel.musicLogId);
            sbLIZ.append(", autoCutData=");
            sbLIZ.append(c1417310mzB);
            C1417710mzp.LIZ(LogLevel.LEVEL_INFO, C2188811AlT.LIZIZ(sbLIZ));
        }
        s sVar = s.LIZ;
        NLEModel nLEModel2 = c1417310mzB.LJII;
        sVar.getClass();
        s.LJII(nLEModel2);
    }

    private final boolean N5(InterfaceC1455860nzM interfaceC1455860nzM) {
        NLEModel nLEModelLIZ;
        InterfaceC1452170ntP value = interfaceC1455860nzM.g().getValue();
        if (value != null && (nLEModelLIZ = C352130DrH.LIZ(value)) != null) {
            return C0EYQ.LIZLLL(nLEModelLIZ);
        }
        return false;
    }

    private final void Nf(List<AutoCutMediaModel> list) {
        C1417190myz c1417190myzW7;
        this.LLLLZLL = list;
        if (LazyLoadEditLazyGroupPhase1.LIZ().enableLazySafeComponent && (c1417190myzW7 = W7()) != null) {
            c1417190myzW7.LIZ = list;
        }
    }

    private final List<AutoCutThemeData> Pe(List<AutoCutThemeData> list) {
        ArrayList<AutoCutThemeData> arrayList = new ArrayList();
        for (AutoCutThemeData autoCutThemeData : list) {
            if (autoCutThemeData.templateType == EnumC1412640mre.SOUND_SYNC_TEMPLATE.getValue()) {
                arrayList.add(autoCutThemeData);
            }
        }
        ArrayList<AutoCutThemeData> arrayList2 = new ArrayList();
        for (AutoCutThemeData autoCutThemeData2 : list) {
            AutoCutThemeData autoCutThemeData3 = autoCutThemeData2;
            if (autoCutThemeData3.templateType == EnumC1412640mre.DESIGNER_FIXED_TEMPLATE.getValue() || autoCutThemeData3.templateType == EnumC1412640mre.ALGORITHM_TEMPLATE.getValue() || autoCutThemeData3.templateType == EnumC1412640mre.AIGT.getValue() || autoCutThemeData3.templateType == EnumC1412640mre.SGT.getValue()) {
                arrayList2.add(autoCutThemeData2);
            }
        }
        ArrayList arrayList3 = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator<AutoCutThemeData> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList3.add(AutoCutThemeData.LIZ(it2.next(), null, null, null, null, C0MJA.NONE, false, null, 0, 0, null, null, -268435457, 1023));
        }
        for (AutoCutThemeData autoCutThemeData4 : arrayList) {
            for (AutoCutThemeData autoCutThemeData5 : arrayList2) {
                if ((Intrinsics.LJFF(Re(autoCutThemeData4.coverUrl), Re(autoCutThemeData5.coverUrl)) && autoCutThemeData4.coverUrl != null) || Intrinsics.LJFF(autoCutThemeData4.musicId, autoCutThemeData5.musicId)) {
                    AutoCutThemeData autoCutThemeDataLIZ = AutoCutThemeData.LIZ(autoCutThemeData4, null, null, null, null, C0MJA.SOUND_SYNC, false, null, 0, 0, null, null, -268435457, 1023);
                    AutoCutThemeData autoCutThemeDataLIZ2 = AutoCutThemeData.LIZ(autoCutThemeData5, null, null, null, null, C0MJA.TEMPLATE, false, null, 0, 0, null, null, -268435457, 1023);
                    ArrayList arrayList4 = new ArrayList(C15438062q.LJIJJ(arrayList3, 10));
                    for (Object obj : arrayList3) {
                        if (Intrinsics.LJFF(obj, autoCutThemeData4)) {
                            obj = autoCutThemeDataLIZ;
                        } else if (Intrinsics.LJFF(obj, autoCutThemeData5)) {
                            obj = autoCutThemeDataLIZ2;
                        }
                        arrayList4.add(obj);
                    }
                    return arrayList4;
                }
            }
        }
        return arrayList3;
    }

    private final void Pf(boolean z) {
        i3(new AwS35S0010000_22(z, 15));
    }

    private final void R5(String str) {
        i3(new AwS72S1000000_22(str, 3));
    }

    public static final String Re(String str) {
        List listLJJLIIIJILLIZJL;
        Object obj = null;
        if (str == null || (listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(str, new String[]{"/"}, 0, 6)) == null) {
            return null;
        }
        ListIterator listIterator = listLJJLIIIJILLIZJL.listIterator(listLJJLIIIJILLIZJL.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                break;
            }
            Object objPrevious = listIterator.previous();
            if (((String) objPrevious).length() > 0) {
                obj = objPrevious;
                break;
            }
        }
        return (String) obj;
    }

    private final void Te(int i) {
        boolean zLIZIZ;
        Pair pairLIZ = C1403130mcJ.LIZ(i, this.d);
        int iIntValue = ((Number) pairLIZ.getFirst()).intValue();
        C0MJ9 c0mj9 = (C0MJ9) pairLIZ.getSecond();
        if (c0mj9 == null) {
            return;
        }
        AutoCutModel autoCutModel = Na().creativeModel.autoCutModel;
        s sVar = s.LIZ;
        List<AutoCutThemeData> list = this.d;
        sVar.getClass();
        int iLJIILLIIL = s.LJIILLIIL(autoCutModel, list);
        String strNc = nc(iIntValue, c0mj9);
        hh(i, false);
        AutoCutThemeData autoCutThemeData = (AutoCutThemeData) C13LP.LJJJLZIJ(i, this.d);
        if (autoCutThemeData != null) {
            zLIZIZ = C1402530mbL.LIZIZ(autoCutThemeData.featureBits, autoCutThemeData.featureCode);
        } else {
            zLIZIZ = false;
        }
        if (!C0C64.LJIILLIIL().LJIIIZ(31744, "studio_auto_cut_panel_loading_optimize", true, false) && !zLIZIZ) {
            if (strNc != null && (autoCutThemeData == null || autoCutThemeData.templateType != EnumC1412640mre.LYRICS_RULE_TEMPLATE.getValue())) {
                this.LLLZ.put(strNc, new float[]{0.0f, 0.0f});
            }
            ug(new C1417600mze(this, iLJIILLIIL, strNc));
        } else if (strNc != null) {
            yg(strNc, zLIZIZ, 0.0f, 0.0f);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("startTemplateLoading templateId = ");
            sbLIZ.append(this.LLZLLIL);
            sbLIZ.append(" themeUuid = ");
            sbLIZ.append(strNc);
            sbLIZ.append(" themeIndex = ");
            sbLIZ.append(i);
            sbLIZ.append(" indexFromSource = ");
            sbLIZ.append(iIntValue);
            sbLIZ.append(" source = ");
            sbLIZ.append(c0mj9.ordinal());
            C201955140j.LIZIZ("EditAutoCutComponent", C2188811AlT.LIZIZ(sbLIZ));
        }
        if (autoCutThemeData != null && autoCutThemeData.templateType == EnumC1412640mre.LYRICS_RULE_TEMPLATE.getValue()) {
            if (strNc != null) {
                tc(strNc, autoCutThemeData, iIntValue, c0mj9);
                return;
            }
            return;
        }
        hf(iIntValue, c0mj9);
    }

    private final void Ve(C1417540mzY c1417540mzY) {
        if (c1417540mzY != null) {
            long jLJIILL = s.LJIILL(JY0());
            Na().setMMusicStart(0);
            Na().setMMusicEnd((int) jLJIILL);
            T4(c1417540mzY.LIZ, c1417540mzY.LIZIZ, jLJIILL, Na().getMMusicStart(), -1);
            Float f = c1417540mzY.LIZLLL;
            if (f != null) {
                float fFloatValue = f.floatValue();
                InterfaceC1418580n1E interfaceC1418580n1EDa = da();
                if (interfaceC1418580n1EDa != null) {
                    interfaceC1418580n1EDa.A10(fFloatValue);
                    return;
                }
                return;
            }
            return;
        }
        Ev();
    }

    private final String Ya(AutoCutThemeData autoCutThemeData) {
        String str;
        String str2;
        AutoCutModel autoCutModel = Na().creativeModel.autoCutModel;
        if (autoCutModel.reusedMusicInfo != null) {
            Na();
            ReusedMusicInfo reusedMusicInfo = autoCutModel.reusedMusicInfo;
            String str3 = null;
            if (reusedMusicInfo != null) {
                str = reusedMusicInfo.reusedMusicId;
            } else {
                str = null;
            }
            if (autoCutThemeData != null) {
                str2 = autoCutThemeData.musicId;
            } else {
                str2 = null;
            }
            if (C1412490mrP.LIZLLL(str, str2)) {
                ReusedMusicInfo reusedMusicInfo2 = autoCutModel.reusedMusicInfo;
                if (reusedMusicInfo2 != null) {
                    str3 = reusedMusicInfo2.reusedMusicOrigin;
                }
                return String.valueOf(str3);
            }
        }
        if (autoCutThemeData != null && autoCutThemeData.templateType == EnumC1412640mre.CUT_SAME.getValue()) {
            if (Intrinsics.LJFF(autoCutThemeData.musicPostUnavailable, Boolean.TRUE)) {
                return "original";
            }
            return "lv_sync";
        }
        return "auto_cut_music_recommend";
    }

    private final void Zf(boolean z) {
        i3(new AwS35S0010000_22(z, 16));
    }

    private final boolean Zg(NLEModel nLEModel) {
        C348100Dkm c348100DkmLIZIZ;
        NLEEditor nLEEditor;
        InterfaceC1452170ntP value = JY0().g().getValue();
        if (value != null && (c348100DkmLIZIZ = C352130DrH.LIZIZ(value)) != null && (nLEEditor = c348100DkmLIZIZ.LIZ) != null) {
            nLEEditor.setModel(nLEModel);
            return nLEEditor.commit();
        }
        return false;
    }

    private final void ch(EnumC1417170myx enumC1417170myx) {
        if (enumC1417170myx == EnumC1417170myx.PHOTO_MODE_NONE) {
            this.LLLLLLJ = EnumC1413160msU.NONE;
            Na().creativeModel.autoCutModel.isPhotoModeNone = true;
            this.LLLLLILLIL = System.currentTimeMillis();
        } else if (enumC1417170myx == EnumC1417170myx.SLIDE_SHOW) {
            this.LLLLLLJ = EnumC1413160msU.SLIDESHOW;
            this.LLLLLILLIL = System.currentTimeMillis();
        } else {
            this.LLLLLLJ = EnumC1413160msU.TEMPLATE;
        }
    }

    private final void fd(int i) {
        AutoCutThemeData autoCutThemeData = (AutoCutThemeData) C13LP.LJJJLZIJ(i, this.d);
        if (autoCutThemeData == null) {
            return;
        }
        Pair pairLIZ = C1403130mcJ.LIZ(i, this.d);
        int iIntValue = ((Number) pairLIZ.getFirst()).intValue();
        C0MJ9 c0mj9 = (C0MJ9) pairLIZ.getSecond();
        if (!getActivity().isFinishing() && iIntValue >= 0 && c0mj9 != null) {
            int iHc = hc(i, autoCutThemeData);
            String strLJJIIJ = s.LJJIIJ(Na().creativeModel.autoCutModel, c0mj9, Integer.valueOf(iIntValue));
            String strLJJII = C1428520nHG.LJJII(Na(), autoCutThemeData.LIZIZ(), null);
            String str = autoCutThemeData.templateId;
            if (!(!a0.LJJJIL(str)) || str == null) {
                str = autoCutThemeData.musicId;
            }
            C1417710mzp.LJIJ(iHc, strLJJII, "3", strLJJIIJ, Integer.valueOf(autoCutThemeData.templateType), str);
        }
    }

    private final String gb(NLEModel nLEModel) {
        VecNLETrackSPtr tracks;
        NLETrack next;
        VecNLETrackSlotSPtr slots;
        NLETrackSlot nLETrackSlot;
        NLESegment mainSegment;
        NLEResourceNode resource;
        if (nLEModel == null || (tracks = nLEModel.getTracks()) == null) {
            return null;
        }
        Iterator<NLETrack> it2 = tracks.iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (C351220Dpo.LLILLL(next)) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        NLETrack nLETrack = next;
        if (nLETrack == null || (slots = nLETrack.getSlots()) == null || (nLETrackSlot = (NLETrackSlot) C13LP.LJJJLL(slots)) == null || (mainSegment = nLETrackSlot.getMainSegment()) == null || (resource = mainSegment.getResource()) == null) {
            return null;
        }
        return resource.getResourceFile();
    }

    private final void k5(NLEModel nLEModel) {
        InterfaceC366660EZc interfaceC366660EZcV9 = V9();
        if (interfaceC366660EZcV9 != null) {
            interfaceC366660EZcV9.d10(true, null, null);
        }
        j9().tv2(nLEModel);
    }

    private final void mg(boolean z) {
        i3(new AwS35S0010000_22(z, 14));
    }

    private final void mh(List<AutoCutThemeData> list) {
        i3(new AwS601S0100000_22(Pe(list), (List<CreateAnchorInfo>) 179));
    }

    private final void n7(final C1417310mzB c1417310mzB) {
        Object c098200Yq;
        boolean z;
        final AVMusic aVMusic = c1417310mzB.LJ;
        if (aVMusic == null) {
            O4(this, c1417310mzB, false, false);
            return;
        }
        String strLJI = C1403010mc7.LIZ.getMusicService().LJI(aVMusic);
        if (strLJI != null && strLJI.length() != 0) {
            try {
                C0VSJ c0vsj = new C0VSJ(strLJI);
                if (c0vsj.exists() && c0vsj.length() > 0) {
                    z = true;
                } else {
                    z = false;
                }
                c098200Yq = Boolean.valueOf(z);
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            Boolean bool = Boolean.FALSE;
            if (C189200o6.m7isFailureimpl(c098200Yq)) {
                c098200Yq = bool;
            }
            if (((Boolean) c098200Yq).booleanValue()) {
                aVMusic.path = strLJI;
                c1417310mzB.LJFF = strLJI;
                O4(this, c1417310mzB, false, false);
                return;
            }
        }
        Context sceneContext = this.LLJILLL.getSceneContext();
        if (sceneContext == null) {
            O4(this, c1417310mzB, false, false);
        } else {
            C1403010mc7.LIZ.getMusicService().LJ("edit_auto_cut_reuse", sceneContext, aVMusic, 0, false, new InterfaceC1416880myU() { // from class: X.0myh
                @Override // X.InterfaceC1416880myU
                public final void LIZJ(boolean z2) {
                }

                @Override // X.InterfaceC1416880myU
                public final void onProgress(int i) {
                }

                @Override // X.InterfaceC1416880myU
                public final void onStart() {
                }

                @Override // X.InterfaceC1416880myU
                public final void LIZ(Integer num, String str) {
                    C1417330mzD c1417330mzD = this.LIZ;
                    LifecycleOwnerExtensionsKt.LIZJ(c1417330mzD, new ARunnableS91S0200000_22(c1417330mzD, c1417310mzB, 9));
                }

                @Override // X.InterfaceC1416880myU
                public final void LIZIZ(String str, MusicWaveBean musicWaveBean) {
                    C1417330mzD c1417330mzD = this.LIZ;
                    LifecycleOwnerExtensionsKt.LIZJ(c1417330mzD, new ARunnableS17S1300000_22(aVMusic, str, c1417310mzB, c1417330mzD, 0));
                }
            }, false);
        }
    }

    private final void rh(C1417310mzB c1417310mzB) {
        String str;
        AutoCutThemeData autoCutThemeDataLJFF = C1416110mxF.LJFF(c1417310mzB.LIZIZ, Na().creativeModel.autoCutModel, c1417310mzB.LIZ);
        if (autoCutThemeDataLJFF != null && (str = c1417310mzB.LJFF) != null && str.length() > 0) {
            autoCutThemeDataLJFF.musicPath = c1417310mzB.LJFF;
        }
    }

    private final void ug(Function0<Unit> function0) {
        C19576911iZ c19576911iZ = C19576911iZ.LIZ;
        C19EG activity = getActivity();
        CreativeLoadingDialogBuilder creativeLoadingDialogBuilder = new CreativeLoadingDialogBuilder();
        creativeLoadingDialogBuilder.showProgress(true);
        creativeLoadingDialogBuilder.backCanCancel(false);
        creativeLoadingDialogBuilder.cancelViewVisibleType(CreativeLoadingDialogBuilder.CancelType.VISIBLE);
        String strBb = Bb();
        if (strBb == null) {
            strBb = "";
        }
        creativeLoadingDialogBuilder.loadingMessage(strBb);
        creativeLoadingDialogBuilder.clickCancelListener(new AwS601S0100000_22(function0, (Function0<Unit>) 167));
        CreativeLoadingDialog creativeLoadingDialogCreateLoadingDialog = c19576911iZ.createLoadingDialog(activity, 1101, creativeLoadingDialogBuilder);
        this.LLLLLZL = creativeLoadingDialogCreateLoadingDialog;
        creativeLoadingDialogCreateLoadingDialog.show();
    }

    private final void xf(AutoCutReturn autoCutReturn) {
        Na().creativeModel.imageEditModel.isVideoChildPageFromImage = true;
        Na().creativeModel.photoModeEnterEditingStage.photoModeEnterAutoCut = false;
        View view = this.LLJILLL.mView;
        if (view != null) {
            Rect rect = new Rect(0, ScreenUtils.getStatusBarHeight(view.getContext()), view.getWidth(), view.getHeight());
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(rect.width(), rect.height(), Bitmap.Config.RGB_565);
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            view.getLocationOnScreen(new int[2]);
            canvas.translate((-r3[0]) - rect.left, (-r3[1]) - rect.top);
            C842150X1x.LIZIZ(canvas, view);
            if (bitmapCreateBitmap != null) {
                autoCutReturn.captureBitmap = bitmapCreateBitmap;
            }
        }
        JY0().x61(autoCutReturn);
    }

    public final void Cg(List<AutoCutThemeData> list) {
        Na().creativeModel.autoCutModel.templateList = new ArrayList(list);
        s sVar = s.LIZ;
        AutoCutModel autoCutModel = Na().creativeModel.autoCutModel;
        sVar.getClass();
        this.d = s.LJJIFFI(autoCutModel);
        if ((!((ArrayList) r0).isEmpty()) && (C0CHU.LIZ() || C0CHV.LIZ())) {
            list = this.d;
        }
        mh(list);
        if (this.c) {
            C1417360mzG c1417360mzG = this.b;
            if (c1417360mzG != null) {
                c1417360mzG.cancel();
            }
            wg();
        }
    }

    public final void D5(Pair<Integer, Integer> pair) {
        this.LLJL.LJIIJ(pair);
    }

    @Override // X.InterfaceC1417050myl
    public boolean E52(Pair<Integer, ? extends C0MJ9> pair) {
        C1417310mzB c1417310mzB;
        if (pair.getSecond() == null || (c1417310mzB = this.LLLLZLLLI.get(pair)) == null || c1417310mzB.LJII == null) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC1417050myl
    public void Fj2(String str) {
        String str2;
        List<MusicModel> musicList;
        InterfaceC1453200nv4 interfaceC1453200nv4I9;
        if (C0C0A.LIZ()) {
            AutoCutThemeData autoCutThemeDataLIZJ = C1403130mcJ.LIZJ(Na().creativeModel);
            String musicId = null;
            if (autoCutThemeDataLIZJ != null) {
                str2 = autoCutThemeDataLIZJ.musicId;
            } else {
                str2 = null;
            }
            AVMusic aVMusicExtractAVMusic = MusicBeanUtilKt.extractAVMusic(Na().creativeModel.musicBuzModel);
            if (aVMusicExtractAVMusic != null) {
                musicId = aVMusicExtractAVMusic.getMusicId();
            }
            InterfaceC1453200nv4 interfaceC1453200nv4I92 = I9();
            if (interfaceC1453200nv4I92 != null && (musicList = interfaceC1453200nv4I92.getMusicList()) != null) {
                ArrayList<MusicModel> arrayList = new ArrayList();
                for (MusicModel musicModel : musicList) {
                    if (musicModel.isCCTemplateLocalMusic()) {
                        arrayList.add(musicModel);
                    }
                }
                for (MusicModel musicModel2 : arrayList) {
                    if (C123100dR.LIZ(musicModel2.getMusicId()) && !Intrinsics.LJFF(musicModel2.getMusicId(), str) && !Intrinsics.LJFF(musicModel2.getMusicId(), str2) && !Intrinsics.LJFF(musicModel2.getMusicId(), musicId) && (interfaceC1453200nv4I9 = I9()) != null) {
                        interfaceC1453200nv4I9.Ex1(musicModel2.getMusicId());
                    }
                }
            }
        }
    }

    public final void Gf(String str) {
        if (this.LLLLLLIL) {
            return;
        }
        this.LLLLLLIL = true;
        Df(this, str);
    }

    public final void H4(boolean z) {
        if (C1417220mz2.LIZ(Na()) && C1417220mz2.LIZIZ()) {
            if (z) {
                pa().LIZIZ(sa());
            } else {
                pa().LIZ(sa());
            }
        }
    }

    @Override // X.InterfaceC1417050myl
    public void HB0(String str) {
        Iterator<AutoCutThemeData> it2 = this.d.iterator();
        int i = 0;
        while (it2.hasNext()) {
            if (Intrinsics.LJFF(it2.next().templateId, str)) {
                if (i >= 0) {
                    Hf(i, Boolean.FALSE);
                    return;
                }
                return;
            }
            i++;
        }
    }

    @Override // X.InterfaceC1417050myl
    public void Il2(String str) {
        Df(this, str);
    }

    public final List<AutoCutThemeData> K4(List<AutoCutThemeData> list) {
        boolean zIsSelectedByAuto;
        String strLIZ;
        if (!C0CHU.LIZ() && !C0CHV.LIZ()) {
            return list;
        }
        String strLIZIZ = C1412490mrP.LIZIZ(Na());
        FlowDataMusicInfo flowDataMusicInfo = Na().getCreativeFlowData().getFlowDataMusicInfo();
        if (flowDataMusicInfo != null) {
            zIsSelectedByAuto = flowDataMusicInfo.isSelectedByAuto();
        } else {
            zIsSelectedByAuto = true;
        }
        if (!Intrinsics.LJFF(strLIZIZ, "single_song") && zIsSelectedByAuto) {
            return list;
        }
        AutoCutThemeData autoCutThemeDataLIZLLL = C1416110mxF.LIZLLL(Na().creativeModel.autoCutModel);
        if (autoCutThemeDataLIZLLL == null) {
            autoCutThemeDataLIZLLL = (AutoCutThemeData) C13LP.LJJJLL(list);
        }
        C1417160myw c1417160myw = C1417160myw.LIZ;
        VideoPublishEditModel videoPublishEditModelNa = Na();
        c1417160myw.getClass();
        AVMusic aVMusicLJI = C1417160myw.LJI(videoPublishEditModelNa);
        if (aVMusicLJI != null) {
            strLIZ = C1417570mzb.LIZ(aVMusicLJI);
        } else {
            strLIZ = null;
        }
        s sVar = s.LIZ;
        if (C0CHU.LIZ() || C0CHV.LIZ()) {
            s.LIZ.getClass();
            if (s.LJJJJJ(strLIZIZ, zIsSelectedByAuto) && autoCutThemeDataLIZLLL != null) {
                int iLIZ = C0CHI.LIZ();
                if (C0CHU.LIZ()) {
                    return s.LIZIZ(list, autoCutThemeDataLIZLLL, iLIZ, strLIZ);
                }
                return s.LIZ(list, autoCutThemeDataLIZLLL, iLIZ, strLIZ);
            }
        }
        return list;
    }

    public final boolean Kc(NLEModel nLEModel) {
        VecNLETrackSPtr tracks = nLEModel.getTracks();
        ArrayList<NLETrackSlot> arrayList = new ArrayList();
        Iterator<NLETrack> it2 = tracks.iterator();
        while (it2.hasNext()) {
            C19719612Di.LJJI(it2.next().getSlots(), arrayList);
        }
        if (arrayList.isEmpty()) {
            return false;
        }
        for (NLETrackSlot nLETrackSlot : arrayList) {
            if (C377880Eri.LJIIL(nLETrackSlot) || (C348520DlS.LJFF(nLETrackSlot) && !nLETrackSlot.getFeatureList().contains("UGC_ASYNC_I2V"))) {
                return true;
            }
        }
        return false;
    }

    public final void Kf(boolean z) {
        InterfaceC1418610n1H interfaceC1418610n1HL7 = L7();
        if (interfaceC1418610n1HL7 != null) {
            interfaceC1418610n1HL7.yR1(z);
        }
    }

    @Override // X.InterfaceC1417050myl
    public void Lm1(C1417310mzB c1417310mzB) {
        List<AutoCutThemeData> list = Na().creativeModel.autoCutModel.templateList;
        if ((list instanceof Collection) && list.isEmpty()) {
            return;
        }
        for (AutoCutThemeData autoCutThemeData : list) {
            if (autoCutThemeData.indexFromSource == c1417310mzB.LIZIZ && autoCutThemeData.LIZIZ() == c1417310mzB.LIZ) {
                O4(this, c1417310mzB, false, false);
                return;
            }
        }
    }

    @Override // X.InterfaceC1417050myl
    public void MM0(String str) {
        int i = 0;
        C1417180myy c1417180myyLJII = C1417160myw.LJII(getActivity(), Na(), this.LLJILJILJ, false);
        AutoCutModel autoCutModel = Na().creativeModel.autoCutModel;
        String str2 = autoCutModel.clickFrom;
        if (str2 == null || str2.length() == 0) {
            autoCutModel.clickFrom = "edit_page";
        }
        Iterator<AutoCutThemeData> it2 = this.d.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            if (Intrinsics.LJFF(it2.next().templateId, str)) {
                if (i >= 0) {
                    Hf(i, Boolean.FALSE);
                }
            } else {
                i++;
            }
        }
        C1417160myw c1417160myw = C1417160myw.LIZ;
        C1DRG c1drg = this.LLJILJILJ;
        VideoPublishEditModel videoPublishEditModelNa = Na();
        c1417160myw.getClass();
        C1417160myw.LJIIL(c1drg, videoPublishEditModelNa);
        Tz0(null, null, C1417160myw.LJI(Na()), Na().getMMusicPath(), c1417180myyLJII);
    }

    @Override // X.InterfaceC1417050myl
    public void Pl2(String str) {
        Iterator<AutoCutThemeData> it2 = this.d.iterator();
        int i = 0;
        while (it2.hasNext()) {
            if (Intrinsics.LJFF(it2.next().templateId, str)) {
                if (i >= 0) {
                    Hf(i, Boolean.TRUE);
                    return;
                }
                return;
            }
            i++;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void Wd(List<MetaExt> list) {
        String strLJJLIIIJ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onCompressDone: ");
        if (list != null) {
            strLJJLIIIJ = C13LP.LJJLIIIJ(list, null, null, null, 0, null, AFwS261S0000000_22.get$arr$(98), 31);
        } else {
            strLJJLIIIJ = null;
        }
        sbLIZ.append(strLJJLIIIJ);
        C1417710mzp.LIZ(LogLevel.LEVEL_INFO, C2188811AlT.LIZIZ(sbLIZ));
        if (Na().creativeModel.autoCutModel.mediaList.isEmpty() && list != null) {
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
            for (MetaExt metaExt : list) {
                String str = metaExt.path;
                int i = metaExt.width;
                int i2 = metaExt.height;
                long j = metaExt.duration;
                long j2 = 0;
                arrayList.add(new AutoCutMediaModel(str, null, 0 == true ? 1 : 0, i, i2, metaExt.isVideo(), j, j2, j2, 0.0f, false, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 8070, 0 == true ? 1 : 0));
            }
            Na().creativeModel.autoCutModel.mediaList.addAll(arrayList);
        }
    }

    @Override // X.InterfaceC1417050myl
    public void Xm1(C0MJ9 c0mj9) {
        C1417310mzB c1417310mzB;
        C0MJ9 c0mj92 = C0MJ9.SOUND_SYNC;
        if (c0mj9 == c0mj92) {
            c1417310mzB = null;
            C1416110mxF.LJIIIZ(Na().creativeModel.autoCutModel, -1, c0mj92, EnumC1412640mre.SOUND_SYNC_TEMPLATE.getValue(), null, null, null, C0L9M.FIRST_GENERATE_AUTOCUT.getValue(), null);
        } else {
            c1417310mzB = null;
            C1416110mxF.LJIIIZ(Na().creativeModel.autoCutModel, -1, null, -1, null, null, null, C0L9M.FIRST_GENERATE_AUTOCUT.getValue(), null);
        }
        Na().creativeModel.autoCutModel.isNone = true;
        this.LLLLLJIL = c1417310mzB;
    }

    public final void ae(int i) {
        String str;
        InterfaceC1417440mzO interfaceC1417440mzOMc;
        C559140LwO c559140LwOEt2;
        AutoCutThemeData autoCutThemeData = (AutoCutThemeData) C13LP.LJJJLZIJ(i, this.d);
        String str2 = null;
        if (autoCutThemeData != null) {
            str = autoCutThemeData.templateId;
        } else {
            str = null;
        }
        InterfaceC1417440mzO interfaceC1417440mzOMc2 = mc();
        if (interfaceC1417440mzOMc2 != null && (c559140LwOEt2 = interfaceC1417440mzOMc2.Et2()) != null) {
            str2 = c559140LwOEt2.LIZ;
        }
        if (!Intrinsics.LJFF(str2, str)) {
            InterfaceC1417440mzO interfaceC1417440mzOMc3 = mc();
            if (interfaceC1417440mzOMc3 != null) {
                interfaceC1417440mzOMc3.LJIIL();
            }
            if (str2 != null && (interfaceC1417440mzOMc = mc()) != null) {
                interfaceC1417440mzOMc.Qp2(str2);
            }
        }
    }

    public final void ag(boolean z) {
        i3(new AwS35S0010000_22(z, 17));
    }

    public final boolean cd(C1417540mzY c1417540mzY) {
        String str;
        C1417540mzY c1417540mzYY8 = y8();
        C1398350mUb c1398350mUb = C1398350mUb.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("EditAutoCutComponent#keepMusic: curMusic path = ");
        String str2 = null;
        if (c1417540mzYY8 != null) {
            str = c1417540mzYY8.LIZIZ;
        } else {
            str = null;
        }
        sbLIZ.append(str);
        sbLIZ.append(", curNleModelMusicPath = ");
        sbLIZ.append(z8());
        C201955140j.LJIILJJIL(c1398350mUb, C2188811AlT.LIZIZ(sbLIZ));
        if (Mc(c1417540mzY, c1417540mzYY8)) {
            String strZ8 = z8();
            if (c1417540mzYY8 != null) {
                str2 = c1417540mzYY8.LIZIZ;
            }
            if (Intrinsics.LJFF(strZ8, str2)) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // X.InterfaceC1417050myl
    public void d32(C0MJ9 c0mj9) {
        C1414450muZ.LJFF(Na().creativeModel.autoCutModel.templateList, new AwS587S0100000_8(c0mj9, 104));
        C1416110mxF.LJIIIZ(Na().creativeModel.autoCutModel, -1, null, -1, null, null, null, C0L9M.FIRST_GENERATE_AUTOCUT.getValue(), null);
        this.LLLLLJIL = null;
    }

    public final void o7(int i) {
        AbstractC1452680nuE abstractC1452680nuEGc;
        C5();
        lf(this, true);
        if (i < 0) {
            C1398350mUb c1398350mUb = C1398350mUb.LIZIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("EditAutoCutComponent cancel: clear cache, beforeEnterTheme=");
            sbLIZ.append(this.LLLLIL);
            C201955140j.LIZLLL(c1398350mUb, "EditAutoCutComponent", C2188811AlT.LIZIZ(sbLIZ));
            if (!C0C64.LJIILLIIL().LJIIIZ(31744, "maintain_autocut_data_after_cancel", true, false)) {
                Map<Pair<Integer, C0MJ9>, C1417310mzB> map = this.LLLLZLLLI;
                C0MJ9 c0mj9 = C0MJ9.SOUND_SYNC;
                C1417310mzB c1417310mzB = map.get(new Pair(0, c0mj9));
                this.LLLLZLLLI.clear();
                this.LLLZI.clear();
                this.LLLLZLLLI.put(new Pair<>(0, c0mj9), c1417310mzB);
            }
        }
        MvCreateVideoData mvCreateVideoData = Na().getMvCreateVideoData();
        if (mvCreateVideoData != null && (abstractC1452680nuEGc = JY0().gc()) != null) {
            abstractC1452680nuEGc.LJJ().Df(mvCreateVideoData.resDestWidth, mvCreateVideoData.resDestHeight, mvCreateVideoData.resFillMode);
        }
        this.LLJJJJ.LJIIJ(Unit.LIZ);
    }

    public final void sf(int i) {
        C0MJ9 c0mj9LIZIZ;
        String str;
        Integer numValueOf;
        AutoCutProcessViewModel autoCutProcessViewModel;
        C0L4W c0l4w;
        if (getActivity().isFinishing()) {
            return;
        }
        boolean zLIZ = C1417040myk.LIZ();
        boolean zLJ = C1417320mzC.LJ(Na().creativeModel.autoCutModel);
        if (!zLIZ && !zLJ) {
            return;
        }
        List<AutoCutThemeData> list = this.d;
        boolean zLJ2 = false;
        if ((list instanceof Collection) && list.isEmpty()) {
            return;
        }
        Iterator<AutoCutThemeData> it2 = list.iterator();
        while (it2.hasNext()) {
            if (it2.next().LIZIZ() == C0MJ9.PLACE_HOLDER) {
                AutoCutModel autoCutModel = Na().creativeModel.autoCutModel;
                AutoCutThemeData autoCutThemeData = (AutoCutThemeData) C13LP.LJJJLZIJ(0, this.d);
                VideoPublishEditModel videoPublishEditModelNa = Na();
                if (autoCutThemeData == null || (c0mj9LIZIZ = autoCutThemeData.LIZIZ()) == null) {
                    c0mj9LIZIZ = C0MJ9.AUTO_CUT;
                }
                String strLJJII = C1428520nHG.LJJII(videoPublishEditModelNa, c0mj9LIZIZ, null);
                String strLJJIIJ = s.LJJIIJ(autoCutModel, null, null);
                if (autoCutThemeData != null) {
                    str = autoCutThemeData.templateId;
                    if (str == null || !(!a0.LJJJIL(str))) {
                        str = autoCutThemeData.musicId;
                    }
                    numValueOf = Integer.valueOf(autoCutThemeData.templateType);
                } else {
                    str = null;
                    numValueOf = null;
                }
                C1417710mzp.LJIJ(i, strLJJII, "2", strLJJIIJ, numValueOf, str);
                if (C1417030myj.LIZ()) {
                    s.LIZ.LJJJI(false);
                } else {
                    ViewModelProvider viewModelProviderLIZ = C0L3U.LIZ(getActivity());
                    if (viewModelProviderLIZ != null && (autoCutProcessViewModel = (AutoCutProcessViewModel) viewModelProviderLIZ.get(AutoCutProcessViewModel.class)) != null) {
                        autoCutProcessViewModel.LLILLJJLI.setValue(Boolean.FALSE);
                    }
                }
                List<AutoCutMediaModel> listLJIIJ = C1417160myw.LJIIJ(getActivity(), Na(), this.LLJILJILJ, true);
                if (listLJIIJ != null && (!((ArrayList) listLJIIJ).isEmpty()) && (c0l4w = (C0L4W) this.LLJILJILJ.LJIIL(null, C0L4W.class)) != null) {
                    AutoCutThemeData autoCutThemeDataLIZLLL = C1416110mxF.LIZLLL(Na().creativeModel.autoCutModel);
                    String str2 = this.LLZLL;
                    ICommerceMediaService iCommerceMediaService = (ICommerceMediaService) PluggableExtentionKt.pluggableSpi$default(ICommerceMediaService.class, false, false, false, 14, null);
                    if (iCommerceMediaService != null) {
                        zLJ2 = iCommerceMediaService.LJ();
                    }
                    c0l4w.OG1(listLJIIJ, autoCutThemeDataLIZLLL, str2, 15, zLJ2, Na().getCreativeInfo(), C1418290n0l.LIZ(Na().creativeModel.autoCutModel.clickFrom), Na().mShootWay, C1417160myw.LIZIZ(Na()), new AwS566S0100000_22(this, 266), new AwS457S0200000_22(this, autoCutModel, 2));
                    return;
                }
                return;
            }
        }
    }

    public final void sh(int i) {
        C0MJ9 c0mj9LIZIZ;
        int i2;
        String str;
        String str2;
        String str3;
        String str4;
        Integer numValueOf;
        String str5;
        s sVar = s.LIZ;
        AutoCutModel autoCutModel = Na().creativeModel.autoCutModel;
        sVar.getClass();
        List listLJJIFFI = s.LJJIFFI(autoCutModel);
        if (i >= 0 && i < ((ArrayList) listLJJIFFI).size()) {
            AutoCutThemeData autoCutThemeData = (AutoCutThemeData) ListProtector.get(listLJJIFFI, i);
            Integer numValueOf2 = Integer.valueOf(autoCutThemeData.indexFromSource);
            C0MJ9 c0mj9LIZIZ2 = autoCutThemeData.LIZIZ();
            if (c0mj9LIZIZ2 == null) {
                c0mj9LIZIZ2 = C0MJ9.AUTO_CUT;
            }
            Pair pair = new Pair(numValueOf2, c0mj9LIZIZ2);
            if (autoCutThemeData.LIZIZ() == null) {
                return;
            }
            int i3 = 1;
            int i4 = i + 1;
            if (autoCutThemeData.category != null) {
                for (AutoCutThemeData autoCutThemeData2 : this.d) {
                    if (Intrinsics.LJFF(autoCutThemeData2, autoCutThemeData)) {
                        break;
                    } else if (Intrinsics.LJFF(autoCutThemeData2.category, autoCutThemeData.category)) {
                        i3++;
                    }
                }
            } else {
                i3 = i4;
            }
            String str6 = autoCutThemeData.uuid;
            if (C123100dR.LIZ(str6) && !this.k.contains(str6)) {
                this.k.add(str6);
                List<MediaModel> mediaModelList = Na().getMediaModelList();
                String str7 = Na().mShootWay;
                String creationId = Na().getCreationId();
                int origin = Na().getOrigin();
                String str8 = autoCutThemeData.musicId;
                VideoPublishEditModel videoPublishEditModelNa = Na();
                C1417310mzB c1417310mzB = this.LLLLZLLLI.get(pair);
                if (c1417310mzB == null || (c0mj9LIZIZ = c1417310mzB.LIZ) == null) {
                    c0mj9LIZIZ = autoCutThemeData.LIZIZ();
                }
                String strLJJII = C1428520nHG.LJJII(videoPublishEditModelNa, c0mj9LIZIZ, autoCutThemeData);
                C1417310mzB c1417310mzB2 = this.LLLLZLLLI.get(pair);
                if (c1417310mzB2 != null) {
                    i2 = c1417310mzB2.LIZJ;
                } else {
                    i2 = autoCutThemeData.templateType;
                }
                C1417310mzB c1417310mzB3 = this.LLLLZLLLI.get(pair);
                if (c1417310mzB3 == null || (str = c1417310mzB3.LJIIIZ) == null) {
                    str = autoCutThemeData.templateId;
                }
                String str9 = Na().creativeModel.autoCutModel.taskId;
                List<AutoCutTitle> list = this.LLLZI.get(pair);
                C1417310mzB c1417310mzB4 = this.LLLLZLLLI.get(pair);
                if (c1417310mzB4 == null || (str2 = c1417310mzB4.LJIIJ) == null) {
                    str2 = autoCutThemeData.templateGroupId;
                }
                C1417310mzB c1417310mzB5 = this.LLLLZLLLI.get(pair);
                if (c1417310mzB5 == null || (str3 = c1417310mzB5.LJIIJJI) == null) {
                    str3 = autoCutThemeData.templateTag;
                }
                String strYa = Ya(autoCutThemeData);
                AutoCutCategory autoCutCategory = autoCutThemeData.category;
                String str10 = null;
                if (autoCutCategory != null) {
                    str10 = autoCutCategory.categoryName;
                    str4 = autoCutCategory.categoryKey;
                } else {
                    str4 = null;
                }
                C1417720mzq c1417720mzq = new C1417720mzq(Na().creativeModel.commonMobModel.originVideoCount, Na().creativeModel.commonMobModel.originPhotoCount, null, null, 12);
                String musicId = Na().getMusicId();
                boolean zLJJJZ = C1428470nHB.LJJJZ(Na());
                if (autoCutThemeData.LIZIZ() == C0MJ9.AUTO_CUT) {
                    numValueOf = autoCutThemeData.assetFrom;
                } else {
                    numValueOf = Integer.valueOf(AssetFrom.CLIENT_INSERT.getValue());
                }
                boolean z = Na().creativeModel.photoModeEnterEditingStage.isFromMultiPhotoSpecialPage;
                C1414930mvL c1414930mvL = C1414930mvL.LIZ;
                VideoPublishEditModel videoPublishEditModelNa2 = Na();
                c1414930mvL.getClass();
                int iLIZJ = C1414930mvL.LIZJ(videoPublishEditModelNa2);
                boolean zLIZIZ = C1402530mbL.LIZIZ(autoCutThemeData.featureBits, autoCutThemeData.featureCode);
                int i5 = autoCutThemeData.reuseMusicAlignBranch;
                boolean z2 = autoCutThemeData.shouldApplyReuseMusicOnSelect;
                C1417310mzB c1417310mzB6 = this.LLLLZLLLI.get(pair);
                if ((c1417310mzB6 == null || (str5 = c1417310mzB6.LJIIL) == null) && (str5 = autoCutThemeData.sceneType) == null) {
                    str5 = Na().creativeModel.autoCutModel.curSceneType;
                }
                C1417710mzp.LJJIJIIJI(mediaModelList, "video_edit_page", str7, creationId, origin, str8, strLJJII, i3, i2, str, str9, list, str2, str3, strYa, str10, str4, null, null, c1417720mzq, musicId, numValueOf, z, zLJJJZ, new AwS601S0100000_22(this, 180), Integer.valueOf(iLIZJ), zLIZIZ, i5, z2, str5, 393216);
            }
        }
    }

    public final void tf(boolean z) {
        InterfaceC1418610n1H interfaceC1418610n1HL7 = L7();
        if (interfaceC1418610n1HL7 != null) {
            interfaceC1418610n1HL7.yR1(false);
        }
        Na().creativeModel.imageEditModel.isVideoChildPageFromImage = true;
        Na().creativeModel.photoModeEnterEditingStage.photoModeEnterAutoCut = false;
        JY0().rh0(false);
    }

    public final void ze(boolean z) {
        C1452730nuJ c1452730nuJLIZJ;
        mg(!z);
        MutableLiveData<C1452730nuJ> mutableLiveDataVW1 = JY0().vW1();
        if (z) {
            c1452730nuJLIZJ = C1452730nuJ.LIZ();
        } else {
            c1452730nuJLIZJ = C1452730nuJ.LIZJ();
        }
        mutableLiveDataVW1.setValue(c1452730nuJLIZJ);
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x02c1 A[PHI: r5
      0x02c1: PHI (r5v18 java.lang.String) = (r5v17 java.lang.String), (r5v20 java.lang.String) binds: [B:105:0x02bd, B:80:0x020f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:108:0x02c4  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x02d4  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x02d7  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x02df A[PHI: r7
      0x02df: PHI (r7v1 java.lang.String) = (r7v0 java.lang.String), (r7v7 java.lang.String) binds: [B:113:0x02db, B:48:0x013e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0333  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x033b  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0287  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void Df(X.C1417330mzD r39, java.lang.String r40) {
        /*
            Method dump skipped, instruction units count: 881
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1417330mzD.Df(X.0mzD, java.lang.String):void");
    }

    private final void Jg(EnumC1413160msU enumC1413160msU, boolean z) {
        EnumC1413160msU enumC1413160msU2 = EnumC1413160msU.SLIDESHOW;
        if (enumC1413160msU == enumC1413160msU2) {
            this.LLLLLLL = true;
        }
        Na().creativeModel.photoModeEnterEditingStage.itemType = enumC1413160msU;
        if (z) {
            return;
        }
        if (enumC1413160msU != enumC1413160msU2 && enumC1413160msU != EnumC1413160msU.TEMPLATE) {
            Na().creativeModel.photoModeEnterEditingStage.photoModeEntryMode = EnumC994360bz0.MULTI_IMAGE;
        } else {
            Na().creativeModel.photoModeEnterEditingStage.photoModeEntryMode = EnumC994360bz0.VIDEO_EDIT;
        }
    }

    private final boolean Mc(C1417540mzY c1417540mzY, C1417540mzY c1417540mzY2) {
        C1398350mUb c1398350mUb = C1398350mUb.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("EditAutoCutComponent#isMusicSame: music0 = ");
        sbLIZ.append(c1417540mzY);
        sbLIZ.append("\nmusic1 = ");
        sbLIZ.append(c1417540mzY2);
        sbLIZ.append('\n');
        C201955140j.LJIILJJIL(c1398350mUb, C2188811AlT.LIZIZ(sbLIZ));
        if (c1417540mzY == null && c1417540mzY2 == null) {
            return true;
        }
        if (c1417540mzY != null && c1417540mzY2 != null && Intrinsics.LJFF(c1417540mzY.LIZ.getMusicId(), c1417540mzY2.LIZ.getMusicId()) && c1417540mzY.LIZJ == 0 && Intrinsics.LJFF(c1417540mzY.LIZIZ, c1417540mzY2.LIZIZ)) {
            return true;
        }
        return false;
    }

    private final boolean bg(C1417310mzB c1417310mzB, C1417310mzB c1417310mzB2) {
        if (!C0C64.LJIILLIIL().LJIIIZ(31744, "studio_ai_alive_fix_change_template_music", true, true)) {
            return false;
        }
        int i = c1417310mzB.LIZJ;
        EnumC1412640mre enumC1412640mre = EnumC1412640mre.AI_ALIVE_TEMPLATE;
        if (i != enumC1412640mre.getValue()) {
            return false;
        }
        if ((c1417310mzB.LJ != null && c1417310mzB.LJFF != null) || c1417310mzB2 == null) {
            return false;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("EditAutoCutComponent AIAlive from ");
        sbLIZ.append(c1417310mzB2);
        sbLIZ.append(" to ");
        sbLIZ.append(c1417310mzB);
        sbLIZ.append(' ');
        C1417710mzp.LIZ(LogLevel.LEVEL_INFO, C2188811AlT.LIZIZ(sbLIZ));
        if (c1417310mzB2.LIZJ != enumC1412640mre.getValue()) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void gg(kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> r6, kotlin.jvm.functions.Function0<kotlin.Unit> r7) {
        /*
            r5 = this;
            boolean r0 = r5.LLLLLL
            if (r0 == 0) goto L5
            return
        L5:
            r0 = 1
            r5.LLLLLL = r0
            X.0mzB r0 = r5.LLLLIL
            if (r0 == 0) goto L36
            int r4 = r0.LIZIZ
            if (r4 < 0) goto L37
            if (r0 == 0) goto L37
            X.0MJ9 r0 = r0.LIZ
            if (r0 == 0) goto L37
            r3 = 2131829814(0x7f112436, float:1.9292608E38)
        L19:
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r5.Na()
            com.ss.android.ugc.aweme.creative.model.CreativeModel r0 = r0.creativeModel
            com.ss.android.ugc.aweme.creative.model.AutoCutModel r0 = r0.autoCutModel
            java.lang.String r1 = r0.clickFrom
            java.lang.String r0 = "music_detail"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L3b
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)
            r6.invoke(r0)
            r0 = 0
            r5.LLLLLL = r0
            return
        L36:
            r4 = -1
        L37:
            r3 = 2131829819(0x7f11243b, float:1.9292618E38)
            goto L19
        L3b:
            X.19EG r0 = r5.getActivity()
            X.0mTM r2 = new X.0mTM
            r2.<init>(r0)
            r0 = 2131829820(0x7f11243c, float:1.929262E38)
            r2.LJFF(r0)
            r2.LIZ(r3)
            kotlin.jvm.internal.AwS105S0201000_22 r1 = new kotlin.jvm.internal.AwS105S0201000_22
            r0 = 3
            r1.<init>(r4, r7, r6, r0)
            X.C985403tE.LIZ(r2, r1)
            kotlin.jvm.internal.AwS601S0100000_22 r1 = new kotlin.jvm.internal.AwS601S0100000_22
            r0 = 164(0xa4, float:2.3E-43)
            r1.<init>(r5, r0)
            r2.LIZLLL(r1)
            X.0mTF r0 = new X.0mTF
            r0.<init>(r2)
            r0.LIZLLL()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1417330mzD.gg(kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function0):void");
    }

    private final int hc(int i, AutoCutThemeData autoCutThemeData) {
        int i2 = 1;
        if (autoCutThemeData.category == null) {
            return i + 1;
        }
        for (AutoCutThemeData autoCutThemeData2 : this.d) {
            if (Intrinsics.LJFF(autoCutThemeData2, autoCutThemeData)) {
                break;
            }
            if (Intrinsics.LJFF(autoCutThemeData2.category, autoCutThemeData.category)) {
                i2++;
            }
        }
        return i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01c7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void hf(int r32, X.C0MJ9 r33) {
        /*
            Method dump skipped, instruction units count: 472
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1417330mzD.hf(int, X.0MJ9):void");
    }

    private final void hh(int i, boolean z) {
        boolean z2 = false;
        if (i == -1) {
            Pf(false);
            z2 = true;
        } else {
            Pf(true);
        }
        this.LLLLJI = z2;
        ch(EnumC1417170myx.VIDEO_TEMPLATE);
        i3(AFwS261S0000000_22.get$arr$(99));
        i3(AFwS261S0000000_22.get$arr$(100));
        i3(new AwS35S0001000_22(i, 12));
        ag(z);
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0251 A[PHI: r6
      0x0251: PHI (r6v5 java.lang.String) = (r6v4 java.lang.String), (r6v7 java.lang.String) binds: [B:105:0x024d, B:56:0x0133] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:123:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0235  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void lf(X.C1417330mzD r37, boolean r38) {
        /*
            Method dump skipped, instruction units count: 628
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1417330mzD.lf(X.0mzD, boolean):void");
    }

    private final void wc(List<AutoCutThemeData> list, int i) {
        mh(C13LP.LLIIII(list));
        if (ye()) {
            EnumC1417170myx enumC1417170myx = EnumC1417170myx.PHOTO_MODE_NONE;
            if (i == enumC1417170myx.getIndex()) {
                i3(AFwS261S0000000_22.get$arr$(88));
                ch(enumC1417170myx);
            }
        }
        if (i >= 0) {
            hh(i, true);
            i3(new AwS35S0001000_22(i, 10));
        } else {
            if (i != EnumC1417170myx.NOT_APPLYING_TEMPLATE.getIndex() || !C306410Bzj.LIZ()) {
                return;
            }
            hh(-1, true);
            if (ye()) {
                return;
            }
            i3(AFwS261S0000000_22.get$arr$(91));
        }
    }

    public final float Fb(int i, C0MJ9 c0mj9) {
        String strNc = nc(i, c0mj9);
        if (strNc == null) {
            return 0.0f;
        }
        C1416070mxB c1416070mxB = T2().LJIJJ.get(strNc);
        if (c1416070mxB != null) {
            return c1416070mxB.LJ;
        }
        float[] fArr = this.LLLZ.get(strNc);
        if (fArr == null) {
            return 0.0f;
        }
        return fArr[1];
    }

    public final void Fe(int i, int i2) {
        int iMax;
        C1417360mzG c1417360mzG;
        C1417340mzE c1417340mzE;
        if (C0C64.LJIILLIIL().LJIIIZ(31744, "disable_autocut_preload_visible_pos", true, false) || (iMax = Math.max(i, 0)) > i2) {
            return;
        }
        while (true) {
            Pair pairLIZ = C1403130mcJ.LIZ(iMax, this.d);
            int iIntValue = ((Number) pairLIZ.getFirst()).intValue();
            Object second = pairLIZ.getSecond();
            if (this.LLLLZLLLI.get(new Pair(Integer.valueOf(iIntValue), second)) == null && second != null && second != C0MJ9.SOUND_SYNC && (c1417360mzG = this.b) != null && (c1417340mzE = c1417360mzG.LIZIZ) != null) {
                Pair<Integer, C0MJ9> pair = new Pair<>(Integer.valueOf(iIntValue), second);
                C1417350mzF c1417350mzF = c1417340mzE.LJ.get(pair);
                if (c1417350mzF != null) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("preload: task already exist. update task theme = ");
                    sbLIZ.append(pair);
                    C2188811AlT.LIZIZ(sbLIZ);
                    c1417340mzE.LIZLLL.remove(c1417350mzF);
                    c1417340mzE.LIZLLL.offerFirst(c1417350mzF);
                } else {
                    AutoCutThemeData autoCutThemeDataLJ = C1403130mcJ.LJ(c1417340mzE.LIZ.creativeModel.autoCutModel.templateList, pair.getFirst().intValue(), pair.getSecond());
                    if (autoCutThemeDataLJ != null) {
                        VideoPublishEditModel videoPublishEditModel = c1417340mzE.LIZ;
                        AutoCutModel autoCutModel = videoPublishEditModel.creativeModel.autoCutModel;
                        C1417350mzF c1417350mzF2 = new C1417350mzF(new C1417500mzU(pair, autoCutThemeDataLJ, autoCutModel.taskId, autoCutModel.musicLogId, c1417340mzE.LIZIZ, videoPublishEditModel.getCreativeInfo(), c1417340mzE.LIZJ, c1417340mzE.LIZ.getCreationId(), c1417340mzE.LIZ.mShootWay), new AwS423S0200000_22(c1417340mzE, (C1417340mzE) pair, (Pair<Integer, ? extends C0MJ9>) 1), new AwS388S0200000_22(c1417340mzE, (C1417340mzE) pair, (Pair<Integer, ? extends C0MJ9>) 0), c1417340mzE.LIZ);
                        c1417340mzE.LJ.put(pair, c1417350mzF2);
                        c1417340mzE.LIZLLL.offer(c1417350mzF2);
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("preload: preloadingCount=");
                        sbLIZ2.append(c1417340mzE.LJII.get());
                        sbLIZ2.append(". add queue. task theme=");
                        sbLIZ2.append(pair);
                        C2188811AlT.LIZIZ(sbLIZ2);
                        c1417340mzE.LIZJ();
                    }
                }
            }
            if (iMax != i2) {
                iMax++;
            } else {
                return;
            }
        }
    }

    @Override // X.InterfaceC1417050myl
    public void Fz(C1417310mzB c1417310mzB, boolean z) {
        String strLJJLIIIJ;
        Long lValueOf;
        boolean z2;
        VecNLETrackSPtr tracks;
        C1417310mzB c1417310mzB2 = c1417310mzB;
        C1398350mUb c1398350mUb = C1398350mUb.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("EditAutoCutComponent#cacheAutoCutData: indexFromSource = ");
        sbLIZ.append(c1417310mzB2.LIZIZ);
        sbLIZ.append(", source = ");
        sbLIZ.append(c1417310mzB2.LIZ);
        sbLIZ.append(", templateType = ");
        sbLIZ.append(c1417310mzB2.LIZJ);
        sbLIZ.append(", nleModel = ");
        NLEModel nLEModel = c1417310mzB2.LJII;
        Long lValueOf2 = null;
        if (nLEModel != null && (tracks = nLEModel.getTracks()) != null) {
            strLJJLIIIJ = C13LP.LJJLIIIJ(tracks, null, null, null, 0, null, AFwS234S0000000_5.get$arr$(29), 31);
        } else {
            strLJJLIIIJ = null;
        }
        sbLIZ.append(strLJJLIIIJ);
        C201955140j.LJIILJJIL(c1398350mUb, C2188811AlT.LIZIZ(sbLIZ));
        int i = c1417310mzB2.LIZJ;
        EnumC1412640mre enumC1412640mre = EnumC1412640mre.LYRICS_RULE_TEMPLATE;
        if (i == enumC1412640mre.getValue()) {
            StringBuilder sb = new StringBuilder("key=");
            AVMusic aVMusic = c1417310mzB2.LJ;
            if (aVMusic != null) {
                lValueOf = Long.valueOf(aVMusic.id);
            } else {
                lValueOf = null;
            }
            sb.append(lValueOf);
            sb.append('#');
            sb.append(c1417310mzB2.LJIIIZ);
            sb.append(" | indexFromSource=");
            sb.append(c1417310mzB2.LIZIZ);
            sb.append(" source=");
            sb.append(c1417310mzB2.LIZ);
            sb.append(" avMusic=");
            boolean z3 = true;
            if (c1417310mzB2.LJ != null) {
                z2 = true;
            } else {
                z2 = false;
            }
            sb.append(z2);
            sb.append(" musicPath=");
            String str = c1417310mzB2.LJFF;
            if (str == null || str.length() <= 0) {
                z3 = false;
            }
            sb.append(z3);
            sb.append(" isComplete=");
            sb.append(c1417310mzB2.LIZIZ());
            sb.append(" forceUpdate=");
            sb.append(z);
            C1426005i6.LIZ(c1398350mUb, "Cache.AutoCut", sb.toString());
        }
        if (c1417310mzB2.LIZJ != EnumC1412640mre.SOUND_SYNC_TEMPLATE.getValue() && c1417310mzB2.LIZJ != enumC1412640mre.getValue() && !c1417310mzB2.LIZIZ()) {
            C201955140j.LJIILJJIL(c1398350mUb, "EditAutoCutComponent#cacheAutoCutData: not complete");
            return;
        }
        C1417310mzB c1417310mzB3 = this.LLLLZLLLI.get(new Pair(Integer.valueOf(c1417310mzB2.LIZIZ), c1417310mzB2.LIZ));
        if (c1417310mzB3 != null && !z) {
            C201955140j.LJIILJJIL(c1398350mUb, "EditAutoCutComponent#cacheAutoCutData: has previous cache, update cache");
            c1417310mzB3.LJ = c1417310mzB2.LJ;
            c1417310mzB3.LJFF = c1417310mzB2.LJFF;
            c1417310mzB3.LJIIIIZZ = c1417310mzB2.LJIIIIZZ;
            NLEModel nLEModel2 = c1417310mzB2.LJII;
            if (nLEModel2 != null && c1417310mzB3.LIZJ != EnumC1412640mre.PUGC_TEMPLATE.getValue()) {
                c1417310mzB3.LJII = nLEModel2;
            }
            rh(c1417310mzB2);
        } else {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("EditAutoCutComponent#cacheAutoCutData: no previous cache: forceUpdate = ");
            sbLIZ2.append(z);
            C201955140j.LJIILJJIL(c1398350mUb, C2188811AlT.LIZIZ(sbLIZ2));
            this.LLLLZLLLI.put(new Pair<>(Integer.valueOf(c1417310mzB2.LIZIZ), c1417310mzB2.LIZ), c1417310mzB2);
            rh(c1417310mzB2);
        }
        if (c1417310mzB2.LIZJ == enumC1412640mre.getValue() && c1417310mzB2.LIZIZ == 0) {
            C0MJ9 c0mj9 = c1417310mzB2.LIZ;
            C0MJ9 c0mj92 = C0MJ9.AUTO_CUT;
            if (c0mj9 == c0mj92 && this.LLLLLJIL == null) {
                C1417310mzB c1417310mzB4 = this.LLLLZLLLI.get(new Pair(0, c0mj92));
                if (c1417310mzB4 != null) {
                    c1417310mzB2 = c1417310mzB4;
                }
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("schedule via cacheAutoCutData key=");
                AVMusic aVMusic2 = c1417310mzB2.LJ;
                if (aVMusic2 != null) {
                    lValueOf2 = Long.valueOf(aVMusic2.id);
                }
                sbLIZ3.append(lValueOf2);
                sbLIZ3.append('#');
                sbLIZ3.append(c1417310mzB2.LJIIIZ);
                C1426005i6.LIZ(c1398350mUb, "Apply.AutoCut.LR.AutoApplyFirst", C2188811AlT.LIZIZ(sbLIZ3));
                LifecycleOwnerExtensionsKt.LIZJ(this, new ARunnableS91S0200000_22(this, c1417310mzB2, 10));
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:152:0x033f  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0347  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x034d  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x03bd  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x03c4  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x03cd  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x03e2  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x03f2  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x03f6  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0420  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0422  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0429  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0435  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x043e A[PHI: r19
      0x043e: PHI (r19v1 java.lang.String) = (r19v0 java.lang.String), (r19v6 java.lang.String) binds: [B:188:0x043a, B:148:0x032b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:213:0x051a  */
    /* JADX WARN: Type inference failed for: r1v11, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v46, types: [com.bytedance.ies.nle.editor_jni.NLEModel, com.ss.android.ugc.aweme.creative.model.music.AVMusic, java.lang.Boolean, java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v82 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Hf(int r57, java.lang.Boolean r58) {
        /*
            Method dump skipped, instruction units count: 1316
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1417330mzD.Hf(int, java.lang.Boolean):void");
    }

    public final void Je(int i, C0MJ9 c0mj9) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("EditAutoCutComponent autocut final success: result: ");
        sbLIZ.append(this.LLLLZ);
        C1417710mzp.LIZ(LogLevel.LEVEL_INFO, C2188811AlT.LIZIZ(sbLIZ));
        LifecycleOwnerExtensionsKt.LIZJ(this, new ARunnableS28S0201000_22(this, c0mj9, i, 2));
    }

    @Override // X.InterfaceC1417050myl
    public void Kd0(CutsameDataItem cutsameDataItem, C0MJ9 c0mj9) {
        AutoCutThemeData autoCutThemeData;
        AutoCutCategory autoCutCategory;
        s.LIZ.getClass();
        int i = 0;
        AutoCutThemeData autoCutThemeDataLIZLLL = C1417910n09.LIZLLL(cutsameDataItem, c0mj9, 0, s.LJIJJLI(false), false);
        AutoCutThemeData autoCutThemeData2 = (AutoCutThemeData) C13LP.LJJJLZIJ(0, Na().creativeModel.autoCutModel.templateList);
        if (autoCutThemeData2 != null && (autoCutCategory = autoCutThemeData2.category) != null) {
            autoCutThemeDataLIZLLL.category = autoCutCategory;
        }
        Iterator<AutoCutThemeData> it2 = Na().creativeModel.autoCutModel.templateList.iterator();
        while (it2.hasNext()) {
            if (C1416110mxF.LJII(it2.next(), autoCutThemeDataLIZLLL)) {
                if (i >= 0 && (autoCutThemeData = (AutoCutThemeData) C13LP.LJJJLZIJ(i, Na().creativeModel.autoCutModel.templateList)) != null) {
                    if (C306410Bzj.LIZ()) {
                        C1416110mxF.LJIIIIZZ(Na().creativeModel.autoCutModel, autoCutThemeData.indexFromSource, autoCutThemeData);
                        return;
                    } else {
                        C1416110mxF.LJIIIIZZ(Na().creativeModel.autoCutModel, i, autoCutThemeData);
                        return;
                    }
                }
                return;
            }
            i++;
        }
    }

    public final boolean Nc(C1417310mzB c1417310mzB, C1417310mzB c1417310mzB2) {
        String str;
        if (c1417310mzB.LIZJ != c1417310mzB2.LIZJ) {
            return false;
        }
        String str2 = c1417310mzB.LJIIIZ;
        if (str2 != null && str2.length() != 0 && (str = c1417310mzB2.LJIIIZ) != null && str.length() != 0) {
            return Intrinsics.LJFF(c1417310mzB.LJIIIZ, c1417310mzB2.LJIIIZ);
        }
        if (c1417310mzB.LIZ != c1417310mzB2.LIZ || c1417310mzB.LIZIZ != c1417310mzB2.LIZIZ) {
            return false;
        }
        return true;
    }

    public final Function2<String, String, Unit> P6(int i, C0MJ9 c0mj9) {
        return new C1417550mzZ(this, i, c0mj9);
    }

    public final float P8(int i, C0MJ9 c0mj9) {
        String strNc = nc(i, c0mj9);
        if (strNc == null) {
            return 0.0f;
        }
        C1416070mxB c1416070mxB = T2().LJIJJ.get(strNc);
        if (c1416070mxB != null) {
            return c1416070mxB.LIZLLL;
        }
        float[] fArr = this.LLLZ.get(strNc);
        if (fArr == null) {
            return 0.0f;
        }
        return fArr[0];
    }

    public final Function1<C559080LwI, Unit> S6(AutoCutThemeData autoCutThemeData, List<AutoCutMediaModel> list) {
        return new AwS217S0300000_8(this, (C1417330mzD) autoCutThemeData, (AutoCutThemeData) list, (List<AutoCutMediaModel>) 14);
    }

    public final void Td(int i, String str) {
        EnumC1416050mx9 enumC1416050mx9;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("EditAutoCutComponent onCancelSelect: lastIndex = ");
        sbLIZ.append(i);
        C1417710mzp.LIZ(LogLevel.LEVEL_INFO, C2188811AlT.LIZIZ(sbLIZ));
        String str2 = this.LLLLZI;
        if (str2 != null) {
            s.LJI(str2);
        }
        C09AE c09ae = this.LLLLZIL;
        if (c09ae != null) {
            c09ae.LIZIZ(null);
        }
        U5();
        hh(i, true);
        J6(this, str, true);
        C1416070mxB c1416070mxB = T2().LJIJJ.get(str);
        if (c1416070mxB != null && c1416070mxB.LJI && ((enumC1416050mx9 = c1416070mxB.LIZ) == EnumC1416050mx9.LOADING || enumC1416050mx9 == EnumC1416050mx9.FAILED)) {
            ze(true);
        }
        T6();
    }

    @Override // X.InterfaceC1417050myl
    public C1417310mzB XC1(int i, C0MJ9 c0mj9) {
        return this.LLLLZLLLI.get(new Pair(Integer.valueOf(i), c0mj9));
    }

    public final boolean Yc(int i, C0MJ9 c0mj9) {
        C1417310mzB c1417310mzB = this.LLLLZ;
        if (c1417310mzB != null && i == c1417310mzB.LIZIZ && c0mj9 == c1417310mzB.LIZ) {
            return true;
        }
        return false;
    }

    public final void ed(String str, String str2) {
        i3(new AwS19S2000000_22(str, str2, 1));
    }

    public final void ef(NLEModel nLEModel, List<AutoCutMediaModel> list) {
        VecNLETrackSlotSPtr sortedSlots;
        NLEResourceAV aVFile;
        AutoCutMediaModel autoCutMediaModel;
        String str;
        NLEResType nLEResType;
        NLETrack mainTrack = nLEModel.getMainTrack();
        if (mainTrack != null && (sortedSlots = mainTrack.getSortedSlots()) != null) {
            int i = 0;
            for (NLETrackSlot nLETrackSlot : sortedSlots) {
                int i2 = i + 1;
                if (i >= 0) {
                    NLESegmentVideo nLESegmentVideoDynamicCast = NLESegmentVideo.dynamicCast((NLENode) nLETrackSlot.getMainSegment());
                    if (nLESegmentVideoDynamicCast != null && (aVFile = nLESegmentVideoDynamicCast.getAVFile()) != null && (autoCutMediaModel = (AutoCutMediaModel) C13LP.LJJJLZIJ(i, list)) != null) {
                        if (FileUtils.INSTANCE.checkFileExists(autoCutMediaModel.filePath)) {
                            str = autoCutMediaModel.filePath;
                        } else {
                            str = autoCutMediaModel.fileUriPath;
                            if (str == null || str.length() <= 0) {
                            }
                        }
                        aVFile.setResourceFile(str);
                        if (autoCutMediaModel.isVideoType) {
                            nLEResType = NLEResType.VIDEO;
                        } else {
                            nLEResType = NLEResType.IMAGE;
                        }
                        aVFile.setResourceType(nLEResType);
                    }
                    i = i2;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
        }
    }

    @Override // X.InterfaceC1417050myl
    public void g51(Pair<Integer, ? extends C0MJ9> pair, NLEModel nLEModel) {
        C1417310mzB c1417310mzB;
        C1417310mzB c1417310mzB2 = this.LLLLZLLLI.get(pair);
        if ((c1417310mzB2 == null || c1417310mzB2.LJII == null) && (c1417310mzB = this.LLLLZLLLI.get(pair)) != null) {
            c1417310mzB.LJII = nLEModel;
        }
    }

    @Override // X.InterfaceC1417050myl
    public void i40(TemplateMobParams templateMobParams, SelectedMaterialItem selectedMaterialItem) {
        this.f = templateMobParams;
        this.g = selectedMaterialItem;
    }

    public final void n5(C1417310mzB c1417310mzB, C1417310mzB c1417310mzB2) {
        String musicId;
        C1417540mzY c1417540mzYY8;
        String musicId2;
        String name;
        String musicId3;
        String str;
        String name2;
        AVMusic aVMusic;
        String str2;
        int musicStart;
        long jLongValue;
        String third;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("EditAutoCutComponent applyAutoCutData: avMusic=");
        AVMusic aVMusic2 = c1417310mzB.LJ;
        String musicId4 = null;
        if (aVMusic2 != null) {
            musicId = aVMusic2.getMusicId();
        } else {
            musicId = null;
        }
        sbLIZ.append(musicId);
        sbLIZ.append(", musicPath=");
        sbLIZ.append(c1417310mzB.LJFF);
        sbLIZ.append(", templateType: ");
        sbLIZ.append(c1417310mzB.LIZJ);
        C2188811AlT.LIZIZ(sbLIZ);
        if (c1417310mzB.LIZJ == EnumC1412640mre.CUT_SAME.getValue() && !c1417310mzB.LIZ()) {
            if (MusicBeanUtilKt.extractAVMusic(Na().creativeModel.musicBuzModel) != null) {
                Ev();
                return;
            }
            return;
        }
        if (bg(c1417310mzB, c1417310mzB2)) {
            C1417710mzp.LIZ(LogLevel.LEVEL_INFO, "EditAutoCutComponent AIAlive - clear music");
            if (MusicBeanUtilKt.extractAVMusic(Na().creativeModel.musicBuzModel) != null) {
                Ev();
                return;
            }
            return;
        }
        if (c1417310mzB.LJFF != null && c1417310mzB.LJ != null) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("applyAutoCutData: applyMusic=");
            AVMusic aVMusic3 = c1417310mzB.LJ;
            if (aVMusic3 != null) {
                musicId2 = aVMusic3.getMusicId();
            } else {
                musicId2 = null;
            }
            sbLIZ2.append(musicId2);
            sbLIZ2.append(", musicPath=");
            sbLIZ2.append(c1417310mzB.LJFF);
            sbLIZ2.append(", name=");
            AVMusic aVMusic4 = c1417310mzB.LJ;
            if (aVMusic4 != null) {
                name = aVMusic4.getName();
            } else {
                name = null;
            }
            sbLIZ2.append(name);
            C2188811AlT.LIZIZ(sbLIZ2);
            AVMusic aVMusicExtractAVMusic = MusicBeanUtilKt.extractAVMusic(Na().creativeModel.musicBuzModel);
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("applyAutoCutData: currentMusic=");
            if (aVMusicExtractAVMusic != null) {
                musicId3 = aVMusicExtractAVMusic.getMusicId();
            } else {
                musicId3 = null;
            }
            sbLIZ3.append(musicId3);
            sbLIZ3.append(", musicPath=");
            if (aVMusicExtractAVMusic != null) {
                str = aVMusicExtractAVMusic.path;
            } else {
                str = null;
            }
            sbLIZ3.append(str);
            sbLIZ3.append(", name=");
            if (aVMusicExtractAVMusic != null) {
                name2 = aVMusicExtractAVMusic.getName();
            } else {
                name2 = null;
            }
            sbLIZ3.append(name2);
            C2188811AlT.LIZIZ(sbLIZ3);
            if (!C294040Bfm.LIZ() && aVMusicExtractAVMusic != null && Intrinsics.LJFF(aVMusicExtractAVMusic.path, c1417310mzB.LJFF)) {
                String musicId5 = aVMusicExtractAVMusic.getMusicId();
                AVMusic aVMusic5 = c1417310mzB.LJ;
                if (aVMusic5 != null) {
                    musicId4 = aVMusic5.getMusicId();
                }
                if (Intrinsics.LJFF(musicId5, musicId4)) {
                    Ev();
                }
            }
            String str3 = c1417310mzB.LJFF;
            if (str3 != null && (aVMusic = c1417310mzB.LJ) != null) {
                String imprId = aVMusic.getImprId();
                if (imprId == null || imprId.length() == 0) {
                    String str4 = c1417310mzB.LJIILJJIL;
                    if (str4 != null && str4.length() != 0) {
                        str2 = c1417310mzB.LJIILJJIL;
                    } else {
                        str2 = Na().creativeModel.autoCutModel.musicLogId;
                    }
                    aVMusic.setImprId(str2);
                }
                if (C294040Bfm.LIZ() && C1412630mrd.LIZ(Integer.valueOf(c1417310mzB.LIZJ))) {
                    C443120HZe<Long, Long, String> c443120HZeE5 = E5(c1417310mzB.LJII);
                    long jLongValue2 = 0;
                    if (c443120HZeE5 != null) {
                        jLongValue = c443120HZeE5.getFirst().longValue();
                    } else {
                        jLongValue = 0;
                    }
                    long j = LSPassThroughRecordSizeConfig.DEFAULT;
                    int i = (int) (jLongValue / j);
                    if (c443120HZeE5 != null) {
                        jLongValue2 = c443120HZeE5.getSecond().longValue();
                    }
                    int musicStart2 = (int) (jLongValue2 / j);
                    if (musicStart2 <= 0) {
                        musicStart2 = aVMusic.getMusicStart() + aVMusic.getDuration();
                    }
                    if (c1417310mzB.LJJ) {
                        C1398350mUb c1398350mUb = C1398350mUb.LIZIZ;
                        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                        sbLIZ4.append("force PUGC override path=");
                        sbLIZ4.append(str3);
                        sbLIZ4.append(" musicId=");
                        sbLIZ4.append(aVMusic.getMusicId());
                        sbLIZ4.append(" templateId=");
                        sbLIZ4.append(c1417310mzB.LJIIIZ);
                        C201955140j.LIZLLL(c1398350mUb, "AutoCutReuseAlign", C2188811AlT.LIZIZ(sbLIZ4));
                        T4(aVMusic, str3, s.LJIILL(JY0()), i, musicStart2);
                        return;
                    }
                    if (c443120HZeE5 == null || (third = c443120HZeE5.getThird()) == null) {
                        third = "";
                    }
                    if (third.length() <= 0) {
                        third = str3;
                    }
                    T4(aVMusic, third, s.LJIILL(JY0()), i, musicStart2);
                    return;
                }
                long jLJIILL = s.LJIILL(JY0());
                AVMusic aVMusic6 = c1417310mzB.LJ;
                if (aVMusic6 != null) {
                    musicStart = aVMusic6.getMusicStart();
                } else {
                    musicStart = 0;
                }
                T4(aVMusic, str3, jLJIILL, musicStart, -1);
                return;
            }
            return;
        }
        if (!C0C64.LJIILLIIL().LJIIIZ(31744, "studio_ai_alive_fix_template_reapply_music", true, true) || c1417310mzB.LIZJ != EnumC1412640mre.AI_ALIVE_TEMPLATE.getValue() || (c1417540mzYY8 = y8()) == null) {
            return;
        }
        T4(c1417540mzYY8.LIZ, c1417540mzYY8.LIZIZ, s.LJIILL(JY0()), (int) c1417540mzYY8.LIZJ, -1);
    }

    public final String nc(int i, C0MJ9 c0mj9) {
        AutoCutThemeData autoCutThemeDataLJ = C1403130mcJ.LJ(this.d, i, c0mj9);
        if (autoCutThemeDataLJ != null) {
            return autoCutThemeDataLJ.uuid;
        }
        return null;
    }

    public final boolean ne(NLEModel nLEModel, String str) {
        NLETrack next;
        VecNLETrackSlotSPtr slots;
        NLETrackSlot nLETrackSlot;
        NLESegmentAudio nLESegmentAudioDynamicCast;
        NLEResourceAV aVFile;
        if (nLEModel == null || str == null || str.length() == 0) {
            return false;
        }
        Iterator<NLETrack> it2 = nLEModel.getTracks().iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (C351220Dpo.LLILZ(next)) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        NLETrack nLETrack = next;
        if (nLETrack == null || (slots = nLETrack.getSlots()) == null || (nLETrackSlot = (NLETrackSlot) C13LP.LJJJLL(slots)) == null || (nLESegmentAudioDynamicCast = NLESegmentAudio.dynamicCast(nLETrackSlot.getMainSegment())) == null || (aVFile = nLESegmentAudioDynamicCast.getAVFile()) == null || Intrinsics.LJFF(aVFile.getResourceFile(), str)) {
            return false;
        }
        aVFile.setResourceFile(str);
        return true;
    }

    @Override // X.InterfaceC1417050myl
    public void rA1(boolean z, boolean z2) {
        this.LLJLIL.LJIIJ(new Pair<>(Boolean.valueOf(z), Boolean.valueOf(z2)));
        i3(new AwS10S0120000_22(z, z2, this, 0));
    }

    public final void sc(String str, boolean z) {
        C01TT.LIZLLL(new C1417230mz3(this, str, z));
    }

    /* JADX WARN: Type inference failed for: r0v22, types: [X.0mzg] */
    public C1417330mzD(C1DRG c1drg, C19A3 c19a3, boolean z) {
        boolean z2;
        boolean z3;
        String str;
        super(c19a3);
        this.LLJILJILJ = c1drg;
        this.LLJILLL = c19a3;
        this.LLJJ = z;
        this.LLJJI = C452501pT.LIZIZ(new AwS566S0100000_22(this, 260));
        this.LLJJIII = new C1664740tQG(c1drg.LJIILIIL(null, InterfaceC1455850nzL.class), InterfaceC1455850nzL.class);
        this.LLJJIJI = new C1664740tQG(c1drg.LJIILIIL(null, InterfaceC366660EZc.class), InterfaceC366660EZc.class);
        this.LLJJIJIIJIL = new C1664740tQG(c1drg.LJIILIIL(null, C1417190myz.class), C1417190myz.class);
        this.LLJJJ = new C560530Lyd<>();
        this.LLJJJIL = new C560530Lyd<>();
        this.LLJJJJ = new C560530Lyd<>();
        this.LLJJJJJIL = new C560530Lyd<>();
        this.LLJJJJLIIL = new C560530Lyd();
        this.LLJJL = new C560530Lyd<>();
        this.LLJJLIIIJLLLLLLLZ = new C560530Lyd<>();
        this.LLJL = new C560530Lyd<>();
        this.LLJLIL = new C560530Lyd<>();
        this.LLJLILLLLZIIL = C1664770tQJ.LIZ(c1drg, VideoPublishEditModel.class, null);
        this.LLJLL = C452501pT.LIZIZ(new AwS566S0100000_22(this, 268));
        this.LLJLLIL = C452501pT.LIZIZ(new AwS566S0100000_22(this, 265));
        this.LLJLLL = C452501pT.LIZIZ(new AwS566S0100000_22(this, 264));
        this.LLJZ = new Object() { // from class: X.0mzg
            {
                KevaImpl.getRepo("auto_cut_clear_hint", 1);
            }
        };
        this.LLJZIJLIL = C1664770tQJ.LIZ(c1drg, InterfaceC1454960nxu.class, null);
        this.LLL = new C1664740tQG(c1drg.LJIILIIL(null, InterfaceC1419190n2D.class), InterfaceC1419190n2D.class);
        this.LLLF = C1664770tQJ.LIZ(c1drg, InterfaceC1446740nke.class, null);
        this.LLLFF = C1664770tQJ.LIZ(c1drg, InterfaceC1461350o8D.class, null);
        this.LLLFFI = new C1664740tQG(c1drg.LJIILIIL(null, C0EZ1.class), C0EZ1.class);
        this.LLLFZ = new C1664740tQG(c1drg.LJIILIIL(null, C0EXI.class), C0EXI.class);
        this.LLLI = new C1664740tQG(c1drg.LJIILIIL(null, InterfaceC1452130ntL.class), InterfaceC1452130ntL.class);
        this.LLLII = C1664770tQJ.LIZ(c1drg, InterfaceC366390EYb.class, null);
        this.LLLIIII = C1664770tQJ.LIZ(c1drg, C19EG.class, null);
        this.LLLIIIIL = new C1664740tQG(c1drg.LJIILIIL(null, InterfaceC1457250o1b.class), InterfaceC1457250o1b.class);
        this.LLLIIIL = new C1664740tQG(c1drg.LJIILIIL(null, InterfaceC1417660mzk.class), InterfaceC1417660mzk.class);
        this.LLLIIL = new C1664740tQG(c1drg.LJIILIIL(null, InterfaceC1460000o62.class), InterfaceC1460000o62.class);
        this.LLLIILIL = new C1664740tQG(c1drg.LJIILIIL(null, InterfaceC1455610nyx.class), InterfaceC1455610nyx.class);
        this.LLLIL = new C1664740tQG(c1drg.LJIILIIL(null, InterfaceC1418580n1E.class), InterfaceC1418580n1E.class);
        this.LLLILZ = new C1664740tQG(c1drg.LJIILIIL(null, C1451630nsX.class), C1451630nsX.class);
        this.LLLILZJ = C1664770tQJ.LIZ(c1drg, InterfaceC1461390o8H.class, null);
        this.LLLILZLLLI = new C1664740tQG(c1drg.LJIILIIL(null, InterfaceC1453200nv4.class), InterfaceC1453200nv4.class);
        this.LLLIZZ = new C1664740tQG(c1drg.LJIILIIL(null, InterfaceC1416960myc.class), InterfaceC1416960myc.class);
        this.LLLJ = new C1664740tQG(c1drg.LJIILIIL(null, InterfaceC1454960nxu.class), InterfaceC1454960nxu.class);
        this.LLLJIL = new C1664740tQG(c1drg.LJIILIIL(null, InterfaceC1455620nyy.class), InterfaceC1455620nyy.class);
        this.LLLL = new C1664740tQG(c1drg.LJIILIIL(null, InterfaceC1418610n1H.class), InterfaceC1418610n1H.class);
        this.LLLLII = new C1664740tQG(c1drg.LJIILIIL(null, InterfaceC1417110myr.class), InterfaceC1417110myr.class);
        this.LLLLIIIILLL = new C1664740tQG(c1drg.LJIILIIL(null, InterfaceC564930MDr.class), InterfaceC564930MDr.class);
        this.LLLLIIL = new C1664740tQG(c1drg.LJIILIIL(null, InterfaceC1417440mzO.class), InterfaceC1417440mzO.class);
        this.LLLLIILL = new LinkedHashSet();
        this.LLLLIILLL = new C1664740tQG(c1drg.LJIILIIL(null, InterfaceC366450EYh.class), InterfaceC366450EYh.class);
        this.LLLLLLLLL = C452501pT.LIZIZ(new AwS566S0100000_22(this, 270));
        this.LLLLLLLLLL = C452501pT.LIZIZ(new AwS566S0100000_22(this, 276));
        boolean z4 = false;
        if ((!C1417220mz2.LIZJ() || !C1417220mz2.LIZ(Na())) && C1417220mz2.LIZ(Na())) {
            z2 = false;
        } else {
            z2 = true;
        }
        this.LLLLLLLZIL = z2;
        if (C1417220mz2.LIZ(Na()) && C1417220mz2.LIZIZ()) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.LLLLLLZ = z3;
        if (z3 && !C1417220mz2.LIZJ()) {
            z4 = true;
        }
        this.LLLLLLZZ = z4;
        C13BV c13bv = C13BV.INSTANCE;
        this.LLLLZLL = c13bv;
        this.LLLLZLLIL = c13bv;
        this.LLLLZLLLI = new LinkedHashMap();
        this.LLLZ = new LinkedHashMap();
        this.LLLZI = new LinkedHashMap();
        this.LLLZIIL = C452501pT.LIZIZ(new AwS566S0100000_22(this, 275));
        this.LLLZIL = C452501pT.LIZIZ(new AwS566S0100000_22(this, 272));
        this.LLLZL = C452501pT.LIZIZ(new AwS566S0100000_22(this, 273));
        this.LLLZLL = C452501pT.LIZIZ(new AwS566S0100000_22(this, 262));
        this.LLLZLZ = C452501pT.LIZIZ(new AwS566S0100000_22(this, 261));
        this.LLLZZ = new AwS566S0100000_22(this, 271);
        this.LLLZZIL = new AwS566S0100000_22(this, 269);
        this.LLZ = -1L;
        this.LLZIL = -1L;
        this.LLZILL = -1L;
        this.LLZL = -1L;
        this.LLZLI = -1L;
        this.LLZZ = -1;
        this.d = c13bv;
        this.e = C452501pT.LIZIZ(AFwS210S0000000_22.get$arr$(124));
        if (C1428520nHG.LJJJLL(Na())) {
            str = "shoot_page_edit_tab";
        } else {
            str = "video_edit_page";
        }
        this.i = str;
        this.j = C452501pT.LIZIZ(new AwS566S0100000_22(this, 263));
        this.k = new LinkedHashSet();
    }

    public static final void Fd(C1417330mzD c1417330mzD, boolean z, boolean z2) {
        boolean z3;
        EnumC1416050mx9 enumC1416050mx9;
        C1398350mUb c1398350mUb = C1398350mUb.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("EditAutoCutComponent#newNone: auto = ");
        sbLIZ.append(z);
        C201955140j.LJIILJJIL(c1398350mUb, C2188811AlT.LIZIZ(sbLIZ));
        String strVb = c1417330mzD.Vb();
        if (strVb != null) {
            C1416070mxB c1416070mxB = c1417330mzD.T2().LJIJJ.get(strVb);
            if (c1416070mxB != null) {
                enumC1416050mx9 = c1416070mxB.LIZ;
            } else {
                enumC1416050mx9 = null;
            }
            if (enumC1416050mx9 == EnumC1416050mx9.LOADING) {
                String str = c1417330mzD.LLLLZI;
                if (str != null) {
                    s.LJI(str);
                }
                C09AE c09ae = c1417330mzD.LLLLZIL;
                if (c09ae != null) {
                    c09ae.LIZIZ(null);
                }
                c1417330mzD.U5();
            }
            J6(c1417330mzD, strVb, true);
        }
        c1417330mzD.hh(-1, true);
        c1417330mzD.i3(AFwS261S0000000_22.get$arr$(93));
        C1417540mzY c1417540mzY = c1417330mzD.LLLLILI;
        if (z2 || (z && c1417330mzD.cd(c1417540mzY))) {
            z3 = true;
        } else {
            z3 = false;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("EditAutoCutComponent#newNone: keepMusic = ");
        sbLIZ2.append(z3);
        C201955140j.LJIILJJIL(c1398350mUb, C2188811AlT.LIZIZ(sbLIZ2));
        C1416110mxF.LJIIIZ(c1417330mzD.Na().creativeModel.autoCutModel, -1, null, -1, null, null, null, C0L9M.FIRST_GENERATE_AUTOCUT.getValue(), null);
        c1417330mzD.Na().creativeModel.autoCutModel.isNone = true;
        MixEditingModel mixEditingModel = c1417330mzD.Na().creativeModel.mixEditingModel;
        mixEditingModel.templateMobParams = null;
        mixEditingModel.selectedMaterialItem = null;
        if (z) {
            c1417330mzD.kc().LJIIJJI(c1417330mzD.JY0());
        }
        c1417330mzD.kc().LJFF(true, z3, true);
        c1417330mzD.LLLLLJIL = null;
        if (!z3) {
            if (c1417540mzY != null) {
                c1417330mzD.Ve(c1417330mzD.LLLLILI);
            } else {
                c1417330mzD.Ev();
            }
        }
        c1417330mzD.Xe(false, null, z, Boolean.FALSE, null, null);
        InterfaceC1414530muh interfaceC1414530muh = (InterfaceC1414530muh) c1417330mzD.LLJILJILJ.LJIIL(null, InterfaceC1414530muh.class);
        if (interfaceC1414530muh != null) {
            interfaceC1414530muh.Jv0();
        }
        if (!z) {
            C1417710mzp.LJJIIZI(c1417330mzD.LLLLZLLIL, "video_edit_page", c1417330mzD.Na().mShootWay, c1417330mzD.Na().getCreationId(), null, null, null, c1417330mzD.Na().getOrigin(), null, c1417330mzD.Na().creativeModel.autoCutModel.clickFrom, null, null, c1417330mzD.Na().creativeModel.autoCutModel.taskId, null, null, null, null, null, null, null, false, c1417330mzD.Na(), c1417330mzD.Na().getMusicId(), Integer.valueOf(AssetFrom.OTHERS.getValue()), new AwS601S0100000_22(c1417330mzD, 171), false, 0, false, null, 608313344);
        }
        if (!z3) {
            AutoCutModel autoCutModel = c1417330mzD.Na().creativeModel.autoCutModel;
            String strLJJIIJ = s.LJJIIJ(autoCutModel, null, null);
            String str2 = autoCutModel.clickFrom;
            C0LAB c0lab = new C0LAB();
            c0lab.LJ("autocut_click_from", str2);
            c0lab.LJ("reuse_music_type", strLJJIIJ);
            C20684815ws.LJIILLIIL("click_autocut_none_button", c0lab.LIZ);
        }
    }

    public static final void J6(C1417330mzD c1417330mzD, String str, boolean z) {
        if (str == null) {
            return;
        }
        c1417330mzD.i3(new AwS38S1110000_22(c1417330mzD, str, z, 1));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void W6(String str, final int i, final C0MJ9 c0mj9) {
        if (str != null && (!a0.LJJJIL(str))) {
            NLETemplateModel nLETemplateModelRestore = NLETemplateModel.restore(str);
            if (nLETemplateModelRestore == null) {
                oc(this, 1016, "NLETemplateModel.restore() returned null", i, c0mj9, Integer.MIN_VALUE, null);
                return;
            }
            TemplateInfo templateInfo = nLETemplateModelRestore.getTemplateInfo();
            if (templateInfo != null) {
                templateInfo.clearMutableItems();
            }
            String strStore = nLETemplateModelRestore.store();
            s7(50L, i, c0mj9, new AwS105S0201000_22(this, i, c0mj9, 4));
            boolean z = false;
            ITemplateResourceService iTemplateResourceService = (ITemplateResourceService) PluggableExtentionKt.pluggableSpi$default(ITemplateResourceService.class, false, false, false, 14, null);
            if (iTemplateResourceService != null) {
                C0LB9.LIZ(iTemplateResourceService, getActivity(), new CutSource(strStore, CutSourceType.JSON), new C1428840nHm("", (Boolean) null, z, (NLEModelDownloader) (0 == true ? 1 : 0), EnumC539100LCi.AUTOCUT, (ICutReporter) (0 == true ? 1 : 0), z, z, new NLEPrepareListener() { // from class: X.0mzT
                    @Override // com.bytedance.ies.cutsame.cut_android.NLEPrepareListener
                    public final void onPreSuccess(NLETemplateModel nLETemplateModel) {
                    }

                    @Override // com.bytedance.ies.cutsame.cut_android.NLEPrepareListener
                    public final void onProgress(float f, String str2) {
                    }

                    @Override // com.bytedance.ies.cutsame.cut_android.NLEPrepareListener
                    public final void onSuccess(NLETemplateModel nLETemplateModel) {
                        if (!this.LIZ.Yc(i, c0mj9) || nLETemplateModel == null) {
                            return;
                        }
                        C0EYQ.LJI(nLETemplateModel, EnumC1412640mre.AUTO_PICK_TEMPLATE.getValue(), null);
                        C1417330mzD c1417330mzD = this.LIZ;
                        c1417330mzD.ef(nLETemplateModel, c1417330mzD.LLLLZLLIL);
                        C1417330mzD c1417330mzD2 = this.LIZ;
                        C1417310mzB c1417310mzB = c1417330mzD2.LLLLZ;
                        if (c1417310mzB != null) {
                            c1417310mzB.LJII = nLETemplateModel;
                        }
                        C01TT.LIZLLL(new AwS145S0201000_22(c1417330mzD2, i, c0mj9, 2));
                        this.LIZ.Je(i, c0mj9);
                    }

                    @Override // com.bytedance.ies.cutsame.cut_android.NLEPrepareListener
                    public final void onError(int i2, String str2) {
                        if (!this.LIZ.Yc(i, c0mj9)) {
                            return;
                        }
                        C1417330mzD.oc(this.LIZ, 1016, str2, i, c0mj9, Integer.MIN_VALUE, null);
                    }
                }, 474), null, 24);
                return;
            }
            return;
        }
        oc(this, 1016, "AutoPick nleSummary is null", i, c0mj9, Integer.MIN_VALUE, null);
    }

    private final void u7(String str, final int i, final C0MJ9 c0mj9) {
        MusicBuzModel musicBuzModel;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("EditAutoCutComponent start fetchAndDownloadMusic: musicId = ");
        sbLIZ.append(str);
        sbLIZ.append(", indexFromSource = ");
        sbLIZ.append(i);
        sbLIZ.append(", source = ");
        sbLIZ.append(c0mj9);
        C1417710mzp.LIZ(LogLevel.LEVEL_INFO, C2188811AlT.LIZIZ(sbLIZ));
        s7(20L, i, c0mj9, new AwS105S0201000_22(this, i, c0mj9, 1));
        AutoCutThemeData autoCutThemeDataLJ = C1403130mcJ.LJ(this.d, i, c0mj9);
        if (autoCutThemeDataLJ != null) {
            musicBuzModel = C1417320mzC.LJFF(autoCutThemeDataLJ).musicBuzModel;
        } else {
            musicBuzModel = null;
        }
        AVMusic aVMusicExtractAVMusic = MusicBeanUtilKt.extractAVMusic(musicBuzModel);
        if (aVMusicExtractAVMusic != null) {
            d7(aVMusicExtractAVMusic, i, c0mj9);
        } else {
            this.LLZIL = System.currentTimeMillis();
            C1403010mc7.LIZ.getMusicService().requestMusic(str, new InterfaceC1416890myV() { // from class: X.0mzc
                @Override // X.InterfaceC1416890myV
                public final void LIZIZ(Exception exc) {
                    if (!this.LIZ.Yc(i, c0mj9)) {
                        return;
                    }
                    C1417330mzD.oc(this.LIZ, 1002, null, i, c0mj9, Integer.MIN_VALUE, null);
                }

                @Override // X.InterfaceC1416890myV
                public final void LIZLLL(AVMusic aVMusic) {
                    if (!this.LIZ.Yc(i, c0mj9)) {
                        return;
                    }
                    if (aVMusic == null) {
                        C1417330mzD.oc(this.LIZ, 1003, null, i, c0mj9, Integer.MIN_VALUE, null);
                    } else {
                        this.LIZ.zd();
                        this.LIZ.d7(aVMusic, i, c0mj9);
                    }
                }
            });
        }
    }

    public final void d7(AVMusic aVMusic, final int i, final C0MJ9 c0mj9) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("EditAutoCutComponent start downloadMusic: musicId = ");
        sbLIZ.append(aVMusic.getMusicId());
        sbLIZ.append(", indexFromSource = ");
        sbLIZ.append(i);
        sbLIZ.append(", source = ");
        sbLIZ.append(c0mj9);
        C1417710mzp.LIZ(LogLevel.LEVEL_INFO, C2188811AlT.LIZIZ(sbLIZ));
        C1417310mzB c1417310mzB = this.LLLLZ;
        if (c1417310mzB != null) {
            c1417310mzB.LJ = aVMusic;
        }
        if (this.LLJILLL.getSceneContext() == null) {
            return;
        }
        this.LLZILL = System.currentTimeMillis();
        C1403010mc7.LIZ.getMusicService().LJ("edit_auto_cut", this.LLJILLL.requireSceneContext(), aVMusic, 0, false, new InterfaceC1416880myU() { // from class: X.0mzR
            @Override // X.InterfaceC1416880myU
            public final void LIZJ(boolean z) {
            }

            @Override // X.InterfaceC1416880myU
            public final void onStart() {
            }

            @Override // X.InterfaceC1416880myU
            public final void onProgress(int i2) {
                this.LIZ.Yc(i, c0mj9);
            }

            @Override // X.InterfaceC1416880myU
            public final void LIZ(Integer num, String str) {
                if (!this.LIZ.Yc(i, c0mj9)) {
                    return;
                }
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("EditAutoCutComponent download music onFailed: code = ");
                sbLIZ2.append(num);
                sbLIZ2.append(", msg = ");
                sbLIZ2.append(str);
                C1417710mzp.LIZ(LogLevel.LEVEL_INFO, C2188811AlT.LIZIZ(sbLIZ2));
                C1417330mzD.oc(this.LIZ, 1007, str, i, c0mj9, Integer.MIN_VALUE, null);
            }

            @Override // X.InterfaceC1416880myU
            public final void LIZIZ(String str, MusicWaveBean musicWaveBean) {
                if (!this.LIZ.Yc(i, c0mj9)) {
                    return;
                }
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("EditAutoCutComponent download music onSuccess: musicPath: ");
                sbLIZ2.append(str);
                C1417710mzp.LIZ(LogLevel.LEVEL_INFO, C2188811AlT.LIZIZ(sbLIZ2));
                C1417330mzD c1417330mzD = this.LIZ;
                C1417310mzB c1417310mzB2 = c1417330mzD.LLLLZ;
                if (c1417310mzB2 != null) {
                    c1417310mzB2.LJFF = str;
                }
                C01TT.LIZLLL(new AwS145S0201000_22(c1417330mzD, i, c0mj9, 3));
                this.LIZ.nd();
                this.LIZ.Je(i, c0mj9);
            }
        }, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x004d A[PHI: r6
      0x004d: PHI (r6v3 java.lang.String) = (r6v0 java.lang.String), (r6v4 java.lang.String) binds: [B:16:0x004b, B:14:0x0047] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0051 A[PHI: r6
      0x0051: PHI (r6v2 java.lang.String) = (r6v0 java.lang.String), (r6v3 java.lang.String) binds: [B:16:0x004b, B:18:0x004f] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void ie(com.ss.android.ugc.aweme.creative.model.AutoCutCategory r9, com.ss.android.ugc.aweme.creative.model.AutoCutCategory r10, java.lang.String r11) {
        /*
            r8 = this;
            r8.Ee(r10)
            X.0nOO r0 = X.C1432940nOO.LIZ
            r0.getClass()
            boolean r0 = X.C1432940nOO.LJII()
            if (r0 != 0) goto L35
            java.util.List<com.ss.android.ugc.aweme.creative.model.AutoCutThemeData> r0 = r8.d
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r2 = r0.iterator()
        L19:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L32
            java.lang.Object r1 = r2.next()
            r0 = r1
            com.ss.android.ugc.aweme.creative.model.AutoCutThemeData r0 = (com.ss.android.ugc.aweme.creative.model.AutoCutThemeData) r0
            com.ss.android.ugc.aweme.creative.model.AutoCutCategory r0 = r0.category
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r0, r10)
            if (r0 == 0) goto L19
            r3.add(r1)
            goto L19
        L32:
            r8.Ae(r3)
        L35:
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r8.Na()
            java.lang.String r7 = r0.getCreationId()
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r8.Na()
            java.lang.String r1 = r0.mShootWay
            if (r9 == 0) goto L49
            java.lang.String r6 = r9.categoryName
            if (r6 != 0) goto L4d
        L49:
            java.lang.String r6 = "by_default"
            if (r9 == 0) goto L51
        L4d:
            java.lang.String r5 = r9.categoryKey
            if (r5 != 0) goto L53
        L51:
            java.lang.String r5 = ""
        L53:
            java.lang.String r4 = r10.categoryName
            java.lang.String r3 = r10.categoryKey
            X.0LAB r2 = new X.0LAB
            r2.<init>()
            java.lang.String r0 = "creation_id"
            r2.LJ(r0, r7)
            java.lang.String r0 = "shoot_way"
            r2.LJ(r0, r1)
            java.lang.String r1 = "enter_from"
            java.lang.String r0 = "video_edit_page"
            r2.LJ(r1, r0)
            java.lang.String r0 = "from_tab"
            r2.LJ(r0, r6)
            java.lang.String r0 = "from_category_key"
            r2.LJ(r0, r5)
            java.lang.String r0 = "to_tab"
            r2.LJ(r0, r4)
            java.lang.String r0 = "to_category_key"
            r2.LJ(r0, r3)
            java.lang.String r0 = "click_method"
            r2.LJ(r0, r11)
            java.util.Map<java.lang.String, java.lang.String> r1 = r2.LIZ
            java.lang.String r0 = "click_autocut_sub_tab"
            X.C20684815ws.LJIILLIIL(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1417330mzD.ie(com.ss.android.ugc.aweme.creative.model.AutoCutCategory, com.ss.android.ugc.aweme.creative.model.AutoCutCategory, java.lang.String):void");
    }

    public final void m6(boolean z, int i, C1417540mzY c1417540mzY) {
        boolean zCd;
        C1417540mzY c1417540mzY2 = c1417540mzY;
        if (!ye()) {
            C1414930mvL c1414930mvL = C1414930mvL.LIZ;
            VideoPublishEditModel videoPublishEditModelNa = Na();
            c1414930mvL.getClass();
            if (!C1414930mvL.LJII(videoPublishEditModelNa, false)) {
                c1417540mzY2 = this.LLLLILI;
            } else {
                c1417540mzY2 = null;
            }
        }
        if (z) {
            zCd = cd(c1417540mzY2);
        } else {
            zCd = false;
        }
        C1398350mUb c1398350mUb = C1398350mUb.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("EditAutoCutComponent#newNone: keepMusic = ");
        sbLIZ.append(zCd);
        C201955140j.LJIILJJIL(c1398350mUb, C2188811AlT.LIZIZ(sbLIZ));
        C1416110mxF.LJIIIZ(Na().creativeModel.autoCutModel, i, null, -1, null, null, null, C0L9M.FIRST_GENERATE_AUTOCUT.getValue(), null);
        if (z) {
            kc().LJIIJJI(JY0());
        }
        kc().LJFF(true, zCd, true);
        this.LLLLLJIL = null;
        if (!zCd) {
            if (c1417540mzY2 != null) {
                Ve(c1417540mzY2);
            } else {
                Ev();
            }
        }
        Xe(false, null, false, Boolean.FALSE, null, null);
    }

    @Override // X.InterfaceC1417050myl
    public void nL0(int i, C0MJ9 c0mj9, C1417310mzB c1417310mzB) {
        this.LLLLZLLLI.put(new Pair<>(Integer.valueOf(i), c0mj9), c1417310mzB);
        rh(c1417310mzB);
    }

    public final boolean t5(C1417310mzB c1417310mzB, boolean z, boolean z2) {
        String uuid;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("EditAutoCutComponent applyAutoCutData: ");
        NLEModel nLEModel = c1417310mzB.LJII;
        if (nLEModel != null) {
            uuid = nLEModel.getUUID();
        } else {
            uuid = null;
        }
        sbLIZ.append(uuid);
        sbLIZ.append(", templateId: ");
        sbLIZ.append(c1417310mzB.LJIIIZ);
        C2188811AlT.LIZIZ(sbLIZ);
        NLEModel nLEModel2 = c1417310mzB.LJII;
        if (nLEModel2 == null) {
            return true;
        }
        if (c1417310mzB.LIZ == C0MJ9.AUTO_CUT && c1417310mzB.LIZIZ > 0) {
            C5();
        }
        this.LLLLLJIL = c1417310mzB;
        this.LLLLLILLIL = System.currentTimeMillis();
        if (C294050Bfn.LIZ()) {
            return d5(nLEModel2, z, z2, C1412660mrg.LIZJ(c1417310mzB.LIZJ));
        }
        C0EYQ.LJFF(nLEModel2, c1417310mzB.LIZJ, c1417310mzB.LJIIIZ);
        return d5(nLEModel2, z, z2, C1412660mrg.LIZJ(c1417310mzB.LIZJ));
    }

    private final boolean H5(String str, String str2, C1417310mzB c1417310mzB, AutoCutThemeData autoCutThemeData) {
        String str3;
        String str4;
        if (str != null && str.length() != 0) {
            if (Intrinsics.LJFF(str, str2)) {
                return false;
            }
        } else {
            String str5 = null;
            if (c1417310mzB != null) {
                str3 = c1417310mzB.LJFF;
            } else {
                str3 = null;
            }
            if (Intrinsics.LJFF(str3, str2)) {
                return false;
            }
            if (c1417310mzB != null) {
                str4 = c1417310mzB.LJFF;
            } else {
                str4 = null;
            }
            if (autoCutThemeData != null) {
                str5 = autoCutThemeData.musicPath;
            }
            if (Intrinsics.LJFF(str4, str5)) {
                return false;
            }
        }
        return true;
    }

    public static final void O4(C1417330mzD c1417330mzD, C1417310mzB c1417310mzB, boolean z, boolean z2) {
        String strLJJLIIIJ;
        VecNLETrackSPtr tracks;
        if (LazyLoadEditLazyGroupPhase1.LIZ().enableLazySafeComponent && c1417330mzD.getLifecycle().getCurrentState() == Lifecycle.State.DESTROYED) {
            return;
        }
        C1417310mzB c1417310mzB2 = c1417330mzD.LLLLLJIL;
        c1417330mzD.M5(c1417310mzB);
        C1398350mUb c1398350mUb = C1398350mUb.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("EditAutoCutComponent#applyAutoCutData: indexFromSource = ");
        sbLIZ.append(c1417310mzB.LIZIZ);
        sbLIZ.append(", source = ");
        sbLIZ.append(c1417310mzB.LIZ);
        sbLIZ.append(", nleModel = ");
        NLEModel nLEModel = c1417310mzB.LJII;
        if (nLEModel != null && (tracks = nLEModel.getTracks()) != null) {
            strLJJLIIIJ = C13LP.LJJLIIIJ(tracks, null, null, null, 0, null, AFwS261S0000000_22.get$arr$(90), 31);
        } else {
            strLJJLIIIJ = null;
        }
        sbLIZ.append(strLJJLIIIJ);
        C201955140j.LJIILJJIL(c1398350mUb, C2188811AlT.LIZIZ(sbLIZ));
        if (!c1417310mzB.LIZLLL()) {
            return;
        }
        if (!z2 && c1417310mzB2 != null && c1417330mzD.Nc(c1417310mzB2, c1417310mzB)) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("applyAutoCutData: same template applied, skip. templateId=");
            sbLIZ2.append(c1417310mzB.LJIIIZ);
            C201955140j.LIZJ(c1398350mUb, C2188811AlT.LIZIZ(sbLIZ2));
            return;
        }
        C01TT.LIZLLL(new AwS59S0310000_22(c1417330mzD, c1417310mzB, z, c1417310mzB2, 0));
    }

    private final boolean d5(NLEModel nLEModel, boolean z, boolean z2, EnumC1412640mre enumC1412640mre) {
        Integer numValueOf;
        AbstractC1452680nuE abstractC1452680nuEGc;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("EditAutoCutComponent#applyNLEModel: ");
        C1417710mzp.LIZ.getClass();
        sbLIZ.append(C1417710mzp.LJII(nLEModel));
        C1417710mzp.LIZ(LogLevel.LEVEL_INFO, C2188811AlT.LIZIZ(sbLIZ));
        if (z2) {
            kc().LJFF(false, z, true);
        }
        InterfaceC1455620nyy interfaceC1455620nyyBc = bc();
        if (interfaceC1455620nyyBc != null) {
            interfaceC1455620nyyBc.jE();
        }
        if (enumC1412640mre != null) {
            C0EYQ.LJFF(nLEModel, enumC1412640mre.getValue(), this.LLZLLIL);
        }
        C0EWD c0ewdKc = kc();
        VideoPublishEditModel videoPublishEditModelNa = Na();
        VEEditor.VEState state = null;
        if (enumC1412640mre != null) {
            numValueOf = Integer.valueOf(enumC1412640mre.getValue());
        } else {
            numValueOf = null;
        }
        boolean zM8isSuccessimpl = C189200o6.m8isSuccessimpl(c0ewdKc.LIZJ(nLEModel, videoPublishEditModelNa, z, C1412630mrd.LIZ(numValueOf)));
        AbstractC1452680nuE abstractC1452680nuEGc2 = JY0().gc();
        if (abstractC1452680nuEGc2 != null) {
            state = abstractC1452680nuEGc2.LJJ().getState();
        }
        AbstractC1452680nuE abstractC1452680nuEGc3 = JY0().gc();
        if (abstractC1452680nuEGc3 != null) {
            abstractC1452680nuEGc3.LJJ().nf(0, VEEditor.SEEK_MODE.EDITOR_SEEK_FLAG_LastSeek);
        }
        if (state == VEEditor.VEState.STARTED && (abstractC1452680nuEGc = JY0().gc()) != null) {
            abstractC1452680nuEGc.LJJ().play();
        }
        return zM8isSuccessimpl;
    }

    private final void ld(String str, String str2, int i, String str3) {
        int i2 = this.LLZZZIL;
        C1417710mzp.LJIJJLI("source_switch", Na().mShootWay, i2 - this.LLZZZZ, Na().getCreationId(), i2, str, str2, str3, i, C1417710mzp.LIZLLL(this.LLZL));
    }

    private final void s7(long j, int i, C0MJ9 c0mj9, Function1<? super Float, Unit> function1) {
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C353490DtT(this, i, c0mj9, function1, j, null), 3);
    }

    private final void tc(final String str, final AutoCutThemeData autoCutThemeData, final int i, final C0MJ9 c0mj9) {
        String str2;
        boolean z;
        float fLJFF;
        boolean z2;
        String str3 = autoCutThemeData.musicId;
        String str4 = autoCutThemeData.templateId;
        if (str3 == null) {
            str2 = "";
        } else {
            str2 = str3;
        }
        final String strLIZ = C1414680muw.LIZ(str2, str4);
        if (str3 != null && str3.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (!z && str4.length() != 0) {
            ILyricsRuleTemplatePreloadService iLyricsRuleTemplatePreloadService = (ILyricsRuleTemplatePreloadService) PluggableExtentionKt.pluggableSpi$default(ILyricsRuleTemplatePreloadService.class, false, false, false, 14, null);
            if (iLyricsRuleTemplatePreloadService != null) {
                fLJFF = iLyricsRuleTemplatePreloadService.LJFF(str3, str4);
            } else {
                fLJFF = 0.0f;
            }
            C1398350mUb c1398350mUb = C1398350mUb.LIZIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("key=");
            sbLIZ.append(strLIZ);
            sbLIZ.append(" | uuid=");
            sbLIZ.append(str);
            sbLIZ.append(" initialProgress=");
            sbLIZ.append(fLJFF);
            sbLIZ.append(" svc=");
            if (iLyricsRuleTemplatePreloadService != null) {
                z2 = true;
            } else {
                z2 = false;
            }
            sbLIZ.append(z2);
            C1426005i6.LIZ(c1398350mUb, "Preload.AutoCut.ProgressResume", C2188811AlT.LIZIZ(sbLIZ));
            this.LLLZ.put(str, new float[]{fLJFF, 1.0f});
            if (iLyricsRuleTemplatePreloadService != null) {
                iLyricsRuleTemplatePreloadService.LJ(getActivity(), str3, str4, new InterfaceC1437705jz<AVMusic>() { // from class: X.0mx2
                    @Override // X.InterfaceC1437705jz
                    public final void LIZ(Exception exc) {
                        String message;
                        C1398350mUb c1398350mUb2 = C1398350mUb.LIZIZ;
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("key=");
                        sbLIZ2.append(strLIZ);
                        sbLIZ2.append(" | preload onFail e=");
                        if (exc != null) {
                            message = exc.getMessage();
                        } else {
                            message = null;
                        }
                        sbLIZ2.append(message);
                        C1426005i6.LIZJ(c1398350mUb2, "Preload.AutoCut.ProgressResume", C2188811AlT.LIZIZ(sbLIZ2));
                        this.LIZ.sc(str, true);
                    }

                    @Override // X.InterfaceC1437705jz
                    public final void onProgress(int i2) {
                        if (C0C64.LJIILLIIL().LJIIIZ(31744, "lyrics_rule_autocut_listener_main_thread_fix", true, true)) {
                            C01TT.LIZLLL(new C1415990mx3(this.LIZ, i, c0mj9, i2));
                        } else {
                            C1417330mzD.Rg(this.LIZ, i, c0mj9, Float.valueOf(i2 / 100.0f), Float.valueOf(1.0f), null);
                        }
                    }

                    @Override // X.InterfaceC1437705jz
                    public final void LIZIZ(AVMusic aVMusic, final boolean z3) {
                        final AVMusic aVMusic2 = aVMusic;
                        C1398350mUb c1398350mUb2 = C1398350mUb.LIZIZ;
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("key=");
                        sbLIZ2.append(strLIZ);
                        sbLIZ2.append(" | preload onSuccess fromCache=");
                        sbLIZ2.append(z3);
                        sbLIZ2.append(" → loadingDialog 100%");
                        C1426005i6.LIZ(c1398350mUb2, "Preload.AutoCut.ProgressResume", C2188811AlT.LIZIZ(sbLIZ2));
                        if (C0C64.LJIILLIIL().LJIIIZ(31744, "lyrics_rule_autocut_listener_main_thread_fix", true, true)) {
                            final C1417330mzD c1417330mzD = this.LIZ;
                            final int i2 = i;
                            final C0MJ9 c0mj92 = c0mj9;
                            final AutoCutThemeData autoCutThemeData2 = autoCutThemeData;
                            final String str5 = str;
                            final String str6 = strLIZ;
                            LifecycleOwnerExtensionsKt.LIZJ(c1417330mzD, new Runnable() { // from class: X.0mx1
                                @Override // java.lang.Runnable
                                public final void run() {
                                    boolean zLIZ;
                                    C1C7U.LIZ("EditAutoCutComponent@9215.initLyricsRuleProgressCache$1$onSuccess$1");
                                    try {
                                        C1417330mzD c1417330mzD2 = c1417330mzD;
                                        int i3 = i2;
                                        C0MJ9 c0mj93 = c0mj92;
                                        Float fValueOf = Float.valueOf(1.0f);
                                        C1417330mzD.Rg(c1417330mzD2, i3, c0mj93, fValueOf, fValueOf, null);
                                        c1417330mzD.Ig(autoCutThemeData2, i2, c0mj92, aVMusic2, str5, str6, z3);
                                    } finally {
                                        if (!zLIZ) {
                                        }
                                    }
                                    C1C7U.LIZIZ("EditAutoCutComponent@9215.initLyricsRuleProgressCache$1$onSuccess$1");
                                }
                            });
                            return;
                        }
                        C1417330mzD.Rg(this.LIZ, i, c0mj9, Float.valueOf(1.0f), Float.valueOf(1.0f), null);
                        this.LIZ.Ig(autoCutThemeData, i, c0mj9, aVMusic2, str, strLIZ, z3);
                    }
                }, null);
                return;
            }
            return;
        }
        C1398350mUb c1398350mUb2 = C1398350mUb.LIZIZ;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("key=");
        sbLIZ2.append(strLIZ);
        sbLIZ2.append(" | REJECT empty musicId or effectResourceId — fallback to 0/0");
        C1426005i6.LIZJ(c1398350mUb2, "Preload.AutoCut.ProgressResume", C2188811AlT.LIZIZ(sbLIZ2));
        this.LLLZ.put(str, new float[]{0.0f, 0.0f});
    }

    private final void yg(String str, boolean z, float f, float f2) {
        i3(new C1416000mx4(str, f, f2, z));
    }

    private final void T4(AVMusic aVMusic, String str, long j, int i, int i2) {
        String musicId;
        C1454900nxo c1454900nxoLIZ;
        InterfaceC1418580n1E interfaceC1418580n1EDa;
        Float f;
        if (aVMusic == null || str == null) {
            return;
        }
        if (!C294040Bfm.LIZ() || i2 == -1) {
            AVMusic aVMusicExtractAVMusic = MusicBeanUtilKt.extractAVMusic(Na().creativeModel.musicBuzModel);
            if (aVMusicExtractAVMusic != null) {
                musicId = aVMusicExtractAVMusic.getMusicId();
            } else {
                musicId = null;
            }
            if (Intrinsics.LJFF(musicId, aVMusic.getMusicId())) {
                Ev();
            }
        }
        InterfaceC1457250o1b interfaceC1457250o1bN9 = n9();
        if (interfaceC1457250o1bN9 != null) {
            interfaceC1457250o1bN9.LLLL((int) j);
        }
        aVMusic.setMusicStartFromCut(i);
        if (C294040Bfm.LIZ() && i2 > 0) {
            aVMusic.setMusicEndFromCut(i2);
        }
        Na().setMusicOrigin("auto_cut_music_recommend");
        AutoCutThemeData autoCutThemeDataLIZJ = C1403130mcJ.LIZJ(Na().creativeModel);
        if (autoCutThemeDataLIZJ != null && (f = autoCutThemeDataLIZJ.musicVolume) != null) {
            float fFloatValue = f.floatValue();
            InterfaceC1418580n1E interfaceC1418580n1EDa2 = da();
            if (interfaceC1418580n1EDa2 != null) {
                interfaceC1418580n1EDa2.A10(fFloatValue);
            }
        }
        if (!C294040Bfm.LIZ()) {
            C1452640nuA.LJII(aVMusic, false, Na().creativeModel.musicBuzModel);
        }
        if (C294030Bfl.LIZ() && Na().getMusicVolume() <= 0.0f && (interfaceC1418580n1EDa = da()) != null) {
            interfaceC1418580n1EDa.LLLLZI(true);
        }
        if (C0MT6.LIZ()) {
            if (C294040Bfm.LIZ() && i2 > 0) {
                InterfaceC1454960nxu interfaceC1454960nxuOa = Oa();
                if (interfaceC1454960nxuOa != null) {
                    interfaceC1454960nxuOa.Rq(str, aVMusic, true, false, false, false, i2 - i, false, true, "", false, null);
                }
            } else {
                InterfaceC1454960nxu interfaceC1454960nxuOa2 = Oa();
                if (interfaceC1454960nxuOa2 != null) {
                    interfaceC1454960nxuOa2.Rq(str, aVMusic, true, false, false, false, aVMusic.getDuration(), false, true, "", false, null);
                }
            }
        } else {
            if (C294040Bfm.LIZ()) {
                C1452640nuA.LJII(aVMusic, false, Na().creativeModel.musicBuzModel);
            }
            if (str.length() == 0) {
                c1454900nxoLIZ = C1421090n5H.LIZ(Boolean.TRUE, null, null, null, null, true, null, aVMusic.getDuration(), LivePreviewCTASmartDisplayManager.DEFAULT, false);
            } else {
                c1454900nxoLIZ = C1421090n5H.LIZ(Boolean.FALSE, "edit_page_list", aVMusic, str, null, true, null, aVMusic.getDuration(), LivePreviewCTASmartDisplayManager.DEFAULT, false);
            }
            InterfaceC1454960nxu interfaceC1454960nxuOa3 = Oa();
            if (interfaceC1454960nxuOa3 != null) {
                interfaceC1454960nxuOa3.hr(c1454900nxoLIZ);
            }
        }
        Na().setMusicOrigin("auto_cut_music_recommend");
    }

    public final Function1<C0233005v, Unit> N6(AutoCutThemeData autoCutThemeData, NLEModel nLEModel, List<AutoCutMediaModel> list, int i, C0MJ9 c0mj9) {
        return new C1417140myu(autoCutThemeData, list, this, c0mj9, i, nLEModel);
    }

    /* JADX WARN: Removed duplicated region for block: B:125:0x041d A[PHI: r6 r9
      0x041d: PHI (r6v3 int) = (r6v13 int), (r6v14 int) binds: [B:124:0x041b, B:122:0x0417] A[DONT_GENERATE, DONT_INLINE]
      0x041d: PHI (r9v10 java.lang.String) = (r9v20 java.lang.String), (r9v21 java.lang.String) binds: [B:124:0x041b, B:122:0x0417] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0421 A[PHI: r6 r9
      0x0421: PHI (r6v12 int) = (r6v3 int), (r6v13 int) binds: [B:126:0x041f, B:124:0x041b] A[DONT_GENERATE, DONT_INLINE]
      0x0421: PHI (r9v19 java.lang.String) = (r9v10 java.lang.String), (r9v20 java.lang.String) binds: [B:126:0x041f, B:124:0x041b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0425 A[PHI: r6 r8 r9
      0x0425: PHI (r6v11 int) = (r6v3 int), (r6v12 int) binds: [B:126:0x041f, B:128:0x0423] A[DONT_GENERATE, DONT_INLINE]
      0x0425: PHI (r8v12 java.lang.String) = (r8v4 java.lang.String), (r8v13 java.lang.String) binds: [B:126:0x041f, B:128:0x0423] A[DONT_GENERATE, DONT_INLINE]
      0x0425: PHI (r9v18 java.lang.String) = (r9v10 java.lang.String), (r9v19 java.lang.String) binds: [B:126:0x041f, B:128:0x0423] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0429 A[PHI: r6 r8 r9
      0x0429: PHI (r6v4 int) = (r6v11 int), (r6v12 int) binds: [B:130:0x0427, B:128:0x0423] A[DONT_GENERATE, DONT_INLINE]
      0x0429: PHI (r8v5 java.lang.String) = (r8v12 java.lang.String), (r8v13 java.lang.String) binds: [B:130:0x0427, B:128:0x0423] A[DONT_GENERATE, DONT_INLINE]
      0x0429: PHI (r9v11 java.lang.String) = (r9v18 java.lang.String), (r9v19 java.lang.String) binds: [B:130:0x0427, B:128:0x0423] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:133:0x042d A[PHI: r6 r7 r8 r9
      0x042d: PHI (r6v10 int) = (r6v4 int), (r6v11 int) binds: [B:132:0x042b, B:130:0x0427] A[DONT_GENERATE, DONT_INLINE]
      0x042d: PHI (r7v20 java.lang.String) = (r7v14 java.lang.String), (r7v21 java.lang.String) binds: [B:132:0x042b, B:130:0x0427] A[DONT_GENERATE, DONT_INLINE]
      0x042d: PHI (r8v11 java.lang.String) = (r8v5 java.lang.String), (r8v12 java.lang.String) binds: [B:132:0x042b, B:130:0x0427] A[DONT_GENERATE, DONT_INLINE]
      0x042d: PHI (r9v17 java.lang.String) = (r9v11 java.lang.String), (r9v18 java.lang.String) binds: [B:132:0x042b, B:130:0x0427] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:157:0x04ec  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x04f8  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0500  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0552 A[PHI: r1 r14
      0x0552: PHI (r1v18 X.0mzB) = (r1v12 X.0mzB), (r1v21 X.0mzB), (r1v21 X.0mzB) binds: [B:303:0x0762, B:184:0x054c, B:186:0x0550] A[DONT_GENERATE, DONT_INLINE]
      0x0552: PHI (r14v11 boolean) = (r14v8 boolean), (r14v18 boolean), (r14v18 boolean) binds: [B:303:0x0762, B:184:0x054c, B:186:0x0550] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0562  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x056b  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0578  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x05a3  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x05c2  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x05e2  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x05e6  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x05f0  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x05f4  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x0602  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x064b  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0656  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x0676  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x0689  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x0708  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x0711  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x07a0  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x07a3  */
    /* JADX WARN: Removed duplicated region for block: B:314:0x07a6  */
    @Override // X.InterfaceC1417050myl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void Tz0(X.C1417310mzB r29, X.C1417310mzB r30, com.ss.android.ugc.aweme.creative.model.music.AVMusic r31, java.lang.String r32, X.C1417180myy r33) {
        /*
            Method dump skipped, instruction units count: 1965
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1417330mzD.Tz0(X.0mzB, X.0mzB, com.ss.android.ugc.aweme.creative.model.music.AVMusic, java.lang.String, X.0myy):void");
    }

    public static final void Jf(C259800zU<C1417310mzB> c259800zU, boolean z, C1417330mzD c1417330mzD, int i, String str, AutoCutThemeData autoCutThemeData) {
        Integer numValueOf;
        C1417310mzB c1417310mzB = c259800zU.element;
        if (c1417310mzB != null && (c1417310mzB.LIZJ == EnumC1412640mre.SOUND_SYNC_TEMPLATE.getValue() || z)) {
            String strLIZ = null;
            c1417330mzD.hh(i, true);
            O4(c1417330mzD, c259800zU.element, false, false);
            if (c1417330mzD.LLLLLLLZIL) {
                InterfaceC1446740nke interfaceC1446740nkeJY0 = c1417330mzD.JY0();
                int iO8 = c1417330mzD.o8();
                int iYb = c1417330mzD.yb();
                int iTb = c1417330mzD.tb();
                int iXb = c1417330mzD.xb();
                c0.LIZ.n2();
                C1453160nv0 c1453160nv0LIZIZ = C1453170nv1.LIZIZ(iO8, iYb, iTb, iXb, false, false, 1984);
                c1453160nv0LIZIZ.LJIIIZ = 0L;
                c1453160nv0LIZIZ.LJIIJ = Boolean.TRUE;
                c1453160nv0LIZIZ.LJIILL = C1417220mz2.LIZ(c1417330mzD.Na());
                interfaceC1446740nkeJY0.aM0(c1453160nv0LIZIZ);
            }
            if (str != null) {
                J6(c1417330mzD, str, true);
            }
            c1417330mzD.ze(true);
            long jLIZLLL = C1417710mzp.LIZLLL(c1417330mzD.LLZLI);
            List<AutoCutMediaModel> list = c1417330mzD.LLLLZLLIL;
            String str2 = c1417330mzD.Na().mShootWay;
            String creationId = c1417330mzD.Na().getCreationId();
            C1417310mzB c1417310mzB2 = c259800zU.element;
            int i2 = c1417310mzB2.LIZJ;
            String str3 = c1417310mzB2.LJIIIZ;
            String str4 = c1417310mzB2.LJIIJ;
            Set<String> set = c1417310mzB2.LJIILIIL;
            if (set != null) {
                numValueOf = Integer.valueOf(set.size());
            } else {
                numValueOf = null;
            }
            NLEModel nLEModel = c259800zU.element.LJII;
            if (nLEModel != null) {
                strLIZ = C0FPT.LIZ(nLEModel);
            }
            C1417710mzp.LJJIJIIJIL(0, i2, 6, jLIZLLL, numValueOf, null, str2, creationId, str3, str4, strLIZ, list, true, true);
            s sVar = s.LIZ;
            AutoCutModel autoCutModel = c1417330mzD.Na().creativeModel.autoCutModel;
            NLEModel nLEModel2 = c259800zU.element.LJII;
            sVar.getClass();
            s.LJJLIL(autoCutModel, nLEModel2);
            return;
        }
        if (autoCutThemeData != null && autoCutThemeData.templateType == EnumC1412640mre.SOUND_SYNC_TEMPLATE.getValue()) {
            C201955140j.LJ("SS cache miss!!");
        } else {
            c1417330mzD.Te(i);
        }
    }

    public static final void Rg(C1417330mzD c1417330mzD, int i, C0MJ9 c0mj9, Float f, Float f2, Float f3) {
        C1416070mxB c1416070mxB;
        float fFloatValue;
        float fFloatValue2;
        float fFloatValue3;
        float fP8;
        float fFb;
        float[] fArr = c1417330mzD.LLLZ.get(c1417330mzD.nc(i, c0mj9));
        if (fArr != null) {
            if (f != null) {
                fArr[0] = f.floatValue();
            }
            if (f2 != null) {
                fArr[1] = f2.floatValue();
            }
        }
        CreativeLoadingDialog creativeLoadingDialog = c1417330mzD.LLLLLZL;
        if (creativeLoadingDialog != null) {
            if (f != null) {
                fP8 = f.floatValue();
            } else {
                fP8 = c1417330mzD.P8(i, c0mj9);
            }
            if (f2 != null) {
                fFb = f2.floatValue();
            } else {
                fFb = c1417330mzD.Fb(i, c0mj9);
            }
            CreativeLoadingDialog.DefaultImpls.updateProgress$default(creativeLoadingDialog, C13LZ.LJ((int) (((fP8 * 0.5f) + (fFb * 0.5f)) * 100), 0, 100), false, 2, null);
        }
        String strNc = c1417330mzD.nc(i, c0mj9);
        if (strNc != null && (c1416070mxB = c1417330mzD.T2().LJIJJ.get(strNc)) != null) {
            EnumC1416050mx9 enumC1416050mx9 = c1416070mxB.LIZ;
            EnumC1416050mx9 enumC1416050mx92 = EnumC1416050mx9.LOADING;
            if (enumC1416050mx9 != enumC1416050mx92) {
                return;
            }
            if (Intrinsics.LIZLLL(f3, 1.0f)) {
                enumC1416050mx92 = EnumC1416050mx9.SUCCESS;
            }
            if (f != null) {
                fFloatValue = f.floatValue();
            } else {
                fFloatValue = c1416070mxB.LIZLLL;
            }
            if (f2 != null) {
                fFloatValue2 = f2.floatValue();
            } else {
                fFloatValue2 = c1416070mxB.LJ;
            }
            if (f3 != null) {
                fFloatValue3 = f3.floatValue();
            } else {
                fFloatValue3 = c1416070mxB.LJFF;
            }
            c1417330mzD.i3(new AwS136S1100000_22(strNc, C1416070mxB.LIZ(c1416070mxB, enumC1416050mx92, null, false, fFloatValue, fFloatValue2, fFloatValue3, false, 70), 3));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0150  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void pd(X.C1417330mzD r39, int r40, java.lang.String r41, int r42, X.C0MJ9 r43, int r44) {
        /*
            Method dump skipped, instruction units count: 374
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1417330mzD.pd(X.0mzD, int, java.lang.String, int, X.0MJ9, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:73:0x0136  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Xe(boolean r11, X.EnumC1412640mre r12, boolean r13, java.lang.Boolean r14, java.lang.String r15, java.lang.String r16) {
        /*
            Method dump skipped, instruction units count: 399
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1417330mzD.Xe(boolean, X.0mre, boolean, java.lang.Boolean, java.lang.String, java.lang.String):void");
    }

    private final void k7(final String str, final String str2, AVMusic aVMusic, Boolean bool, C1418100n0S c1418100n0S, final int i, final C0MJ9 c0mj9) {
        s7(20L, i, c0mj9, new AwS105S0201000_22(this, i, c0mj9, 5));
        ((ITemplateResourceService) ServiceManager.get().getService(ITemplateResourceService.class)).LIZ(getActivity(), str, str2, aVMusic, bool, c1418100n0S, new InterfaceC1428880nHq() { // from class: X.0mzS
            @Override // X.InterfaceC1428880nHq
            public final void LIZIZ(Exception exc) {
            }

            @Override // X.InterfaceC1428880nHq
            public final void LIZJ() {
            }

            @Override // X.InterfaceC1428880nHq
            public final void LIZLLL(AVMusic aVMusic2) {
            }

            @Override // X.InterfaceC1428880nHq
            public final void LJ() {
            }

            @Override // X.InterfaceC1428880nHq
            public final void LJI() {
            }

            @Override // X.InterfaceC1428880nHq
            public final void LJII(int i2) {
            }

            @Override // X.InterfaceC1428880nHq
            public final void LJIIIIZZ() {
            }

            @Override // X.InterfaceC1428880nHq
            public final void LIZ(Integer num, String str3) {
                C1417330mzD.oc(this.LIZ, 1007, str3, i, c0mj9, Integer.MIN_VALUE, null);
            }

            @Override // X.InterfaceC1428880nHq
            public final void LJFF(AVMusic aVMusic2, String str3, boolean z, boolean z2) {
                if (!this.LIZ.Yc(i, c0mj9)) {
                    return;
                }
                C1417310mzB c1417310mzB = this.LIZ.LLLLZ;
                if (c1417310mzB != null) {
                    c1417310mzB.LJ = aVMusic2;
                    c1417310mzB.LJFF = str3;
                    c1417310mzB.LJIJI = str2;
                    c1417310mzB.LJIJJ = str;
                    c1417310mzB.LJIJJLI = Boolean.valueOf(z2);
                }
                C01TT.LIZLLL(new AwS145S0201000_22(this.LIZ, i, c0mj9, 4));
                this.LIZ.nd();
                this.LIZ.Je(i, c0mj9);
            }
        });
    }

    public static final void oc(C1417330mzD c1417330mzD, int i, String str, int i2, C0MJ9 c0mj9, int i3, String str2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("EditAutoCutComponent handleFailure ");
        sbLIZ.append(i);
        C1417710mzp.LIZ(LogLevel.LEVEL_INFO, C2188811AlT.LIZIZ(sbLIZ));
        String str3 = c1417330mzD.LLLLZI;
        if (str3 != null) {
            s.LJI(str3);
        }
        C09AE c09ae = c1417330mzD.LLLLZIL;
        if (c09ae != null) {
            c09ae.LIZIZ(null);
        }
        pd(c1417330mzD, i, str, i2, c0mj9, i3);
        c1417330mzD.U5();
        C01TT.LIZLLL(new C1417370mzH(c1417330mzD, c1417330mzD.nc(i2, c0mj9), str, str2, i));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void Ig(AutoCutThemeData autoCutThemeData, int i, C0MJ9 c0mj9, AVMusic aVMusic, String str, String str2, boolean z) {
        boolean z2;
        int value = EnumC1412640mre.LYRICS_RULE_TEMPLATE.getValue();
        String str3 = autoCutThemeData.templateId;
        String str4 = autoCutThemeData.musicId;
        String str5 = null;
        C1417310mzB c1417310mzB = new C1417310mzB(c0mj9, i, value, null, aVMusic, aVMusic.path, 0 == true ? 1 : 0, str3, autoCutThemeData.templateGroupId, autoCutThemeData.templateTag, 0 == true ? 1 : 0, 0 == true ? 1 : 0, autoCutThemeData.musicUrl, str4, autoCutThemeData.musicPostUnavailable, false, 13103560);
        this.LLLLZLLLI.put(new Pair<>(Integer.valueOf(i), c0mj9), c1417310mzB);
        int iIntValue = T2().LIZIZ.LIZ.intValue();
        AutoCutThemeData autoCutThemeData2 = (AutoCutThemeData) C13LP.LJJJLZIJ(iIntValue, this.d);
        if (autoCutThemeData2 != null && Intrinsics.LJFF(autoCutThemeData2.templateId, autoCutThemeData.templateId) && Intrinsics.LJFF(autoCutThemeData2.musicId, autoCutThemeData.musicId)) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2) {
            C1398350mUb c1398350mUb = C1398350mUb.LIZIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("key=");
            sbLIZ.append(str2);
            sbLIZ.append(" SKIP user-switched curIdx=");
            sbLIZ.append(iIntValue);
            sbLIZ.append(" curTemplateId=");
            String str6 = null;
            if (autoCutThemeData2 != null) {
                str5 = autoCutThemeData2.templateId;
            }
            sbLIZ.append(str5);
            sbLIZ.append(" curMusicId=");
            if (autoCutThemeData2 != null) {
                str6 = autoCutThemeData2.musicId;
            }
            sbLIZ.append(str6);
            sbLIZ.append(" expected=");
            sbLIZ.append(autoCutThemeData.templateId);
            sbLIZ.append('#');
            sbLIZ.append(autoCutThemeData.musicId);
            C1426005i6.LIZ(c1398350mUb, "Apply.AutoCut.LR.AutoApply", C2188811AlT.LIZIZ(sbLIZ));
            return;
        }
        C1398350mUb c1398350mUb2 = C1398350mUb.LIZIZ;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("key=");
        sbLIZ2.append(str2);
        sbLIZ2.append(" TRIGGER fromCache=");
        sbLIZ2.append(z);
        C1426005i6.LIZ(c1398350mUb2, "Apply.AutoCut.LR.AutoApply", C2188811AlT.LIZIZ(sbLIZ2));
        J6(this, str, true);
        T6();
        O4(this, c1417310mzB, false, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC1417050myl
    public void ih1(CutsameDataItem cutsameDataItem, C0MJ9 c0mj9, int i, NLEModel nLEModel, AVMusic aVMusic, String str, boolean z, int i2, boolean z2) {
        String musicId;
        String str2;
        AutoCutProcessViewModel autoCutProcessViewModel;
        AutoCutCategory autoCutCategory;
        C1398350mUb c1398350mUb = C1398350mUb.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("EditAutoCutComponent#insertTemplate: templateId = ");
        sbLIZ.append(cutsameDataItem.templateId);
        sbLIZ.append(", source = ");
        sbLIZ.append(c0mj9);
        sbLIZ.append(", templateType = ");
        int i3 = i;
        sbLIZ.append(i3);
        sbLIZ.append(", nleModel = ");
        sbLIZ.append(nLEModel);
        sbLIZ.append(", music = ");
        Object c098200Yq = null;
        if (aVMusic != null) {
            musicId = aVMusic.getMusicId();
        } else {
            musicId = null;
        }
        sbLIZ.append(musicId);
        sbLIZ.append(", clickFrom = ");
        sbLIZ.append(str);
        sbLIZ.append(", needReplace = ");
        sbLIZ.append(z);
        C201955140j.LJIILJJIL(c1398350mUb, C2188811AlT.LIZIZ(sbLIZ));
        if (C1412660mrg.LIZJ(i3) == null) {
            return;
        }
        s sVar = s.LIZ;
        sVar.getClass();
        AutoCutThemeData autoCutThemeDataLIZLLL = C1417910n09.LIZLLL(cutsameDataItem, c0mj9, i2, s.LJIJJLI(false), true);
        autoCutThemeDataLIZLLL.templateType = i3;
        AutoCutThemeData autoCutThemeData = (AutoCutThemeData) C13LP.LJJJLZIJ(0, Na().creativeModel.autoCutModel.templateList);
        if (autoCutThemeData != null && (autoCutCategory = autoCutThemeData.category) != null) {
            autoCutThemeDataLIZLLL.category = autoCutCategory;
        }
        AutoCutModel autoCutModel = Na().creativeModel.autoCutModel;
        if (z) {
            if (C0C64.LJIILLIIL().LJIJ(31744, 1, "mae_completion_default_panel", true) == 2) {
                C19719612Di.LJJIIJ(autoCutModel.templateList, new AwS601S0100000_22(c0mj9, 161), true);
            } else {
                C19719612Di.LJJIIJ(autoCutModel.templateList, new AwS601S0100000_22(c0mj9, 163), true);
            }
        }
        int iLJ = C13LZ.LJ(i2, 0, autoCutModel.templateList.size());
        ListProtector.add(autoCutModel.templateList, iLJ, autoCutThemeDataLIZLLL);
        if (!z2) {
            i3 = i3;
            C1416110mxF.LJIIIZ(Na().creativeModel.autoCutModel, iLJ, c0mj9, i3, cutsameDataItem.templateId, cutsameDataItem.templateGroupId, cutsameDataItem.templateTag, C0L9M.FIRST_GENERATE_AUTOCUT.getValue(), cutsameDataItem.sceneType);
        }
        if (z && (autoCutThemeDataLIZLLL.templateType == EnumC1412640mre.SOUND_SYNC_TEMPLATE.getValue() || autoCutThemeDataLIZLLL.templateType == EnumC1412640mre.LYRICS_RULE_TEMPLATE.getValue())) {
            mh(autoCutModel.templateList);
        }
        if (str != null) {
            autoCutModel.clickFrom = str;
        }
        if (autoCutModel.oriMediaList.isEmpty() && nw2().isEmpty()) {
            C1417160myw c1417160myw = C1417160myw.LIZ;
            C19EG activity = getActivity();
            VideoPublishEditModel videoPublishEditModelNa = Na();
            C1DRG c1drg = this.LLJILJILJ;
            c1417160myw.getClass();
            List<AutoCutMediaModel> list = C1417160myw.LJIIIIZZ(activity, videoPublishEditModelNa, c1drg, true).LIZ;
            if (list != null) {
                autoCutModel.insertMediaList = list;
            }
        }
        int i4 = 0;
        Object[] objArr = 0;
        String str3 = autoCutThemeDataLIZLLL.nickName;
        if (aVMusic != null) {
            str2 = aVMusic.path;
        } else {
            str2 = null;
        }
        Fz(new C1417310mzB(c0mj9, i4, i3, str3, aVMusic, str2, nLEModel, autoCutThemeDataLIZLLL.templateId, autoCutThemeDataLIZLLL.templateGroupId, autoCutThemeDataLIZLLL.templateTag, autoCutThemeDataLIZLLL.nleLogId, autoCutThemeDataLIZLLL.templateUrl, autoCutThemeDataLIZLLL.musicUrl, autoCutThemeDataLIZLLL.musicId, autoCutThemeDataLIZLLL.musicPostUnavailable, objArr == true ? 1 : 0, 13005120), true);
        if (C1417040myk.LIZ()) {
            if (C1417030myj.LIZ()) {
                sVar.LJJJIL(Na().creativeModel.autoCutModel.templateList);
                return;
            }
            try {
                ViewModelProvider viewModelProviderLIZ = C0L3U.LIZ(getActivity());
                if (viewModelProviderLIZ != null && (autoCutProcessViewModel = (AutoCutProcessViewModel) viewModelProviderLIZ.get(AutoCutProcessViewModel.class)) != null) {
                    autoCutProcessViewModel.vQ2(Na().creativeModel.autoCutModel.templateList);
                    c098200Yq = Unit.LIZ;
                }
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            C189200o6.m1boximpl(c098200Yq);
        }
    }

    public final void he(NLEModel nLEModel, int i, C0MJ9 c0mj9, Map<String, String> map, int i2, String str, String str2, EnumC1417520mzW enumC1417520mzW, String str3, String str4) {
        int i3;
        String str5;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("EditAutoCutComponent requestNLEModel onSuccess: ");
        sbLIZ.append(nLEModel);
        C1417710mzp.LIZ(LogLevel.LEVEL_INFO, C2188811AlT.LIZIZ(sbLIZ));
        if (!Yc(i, c0mj9)) {
            return;
        }
        String str6 = null;
        this.LLLLZI = null;
        C1417310mzB c1417310mzB = this.LLLLZ;
        if (c1417310mzB != null) {
            c1417310mzB.LJII = nLEModel;
            s.LIZ.getClass();
            Integer numLJJIJ = s.LJJIJ(map);
            if (numLJJIJ != null) {
                i2 = numLJJIJ.intValue();
            }
            c1417310mzB.LIZJ = i2;
        }
        C1417310mzB c1417310mzB2 = this.LLLLZ;
        if (c1417310mzB2 != null) {
            s.LIZ.getClass();
            String strLJJIIZ = s.LJJIIZ(map);
            if (strLJJIIZ != null) {
                str = strLJJIIZ;
            }
            c1417310mzB2.LJIIJ = str;
        }
        C1417310mzB c1417310mzB3 = this.LLLLZ;
        if (c1417310mzB3 != null) {
            s.LIZ.getClass();
            c1417310mzB3.LJIIJJI = s.LJJIIZI(map);
        }
        C1417310mzB c1417310mzB4 = this.LLLLZ;
        if (c1417310mzB4 != null) {
            c1417310mzB4.LJI = s.LJJ(nLEModel);
        }
        C1417310mzB c1417310mzB5 = this.LLLLZ;
        if (c1417310mzB5 != null) {
            if (map != null) {
                str5 = map.get("autocut_nle_log_id");
            } else {
                str5 = null;
            }
            c1417310mzB5.LJIILL = str5;
        }
        C1417310mzB c1417310mzB6 = this.LLLLZ;
        if (c1417310mzB6 != null) {
            c1417310mzB6.LJIILLIIL = str2;
        }
        C01TT.LIZLLL(new AwS145S0201000_22(this, i, c0mj9, 1));
        if (enumC1417520mzW != EnumC1417520mzW.TEMPLATE_CC) {
            C1417310mzB c1417310mzB7 = this.LLLLZ;
            if (c1417310mzB7 != null) {
                i3 = c1417310mzB7.LIZJ;
                str6 = c1417310mzB7.LJIIJ;
            } else {
                i3 = -1;
            }
            ld(str3, str4, i3, str6);
        }
        Dd();
        Je(i, c0mj9);
    }

    private final void ff(String str, final String str2, final String str3, final int i, final String str4, String str5, final EnumC1417520mzW enumC1417520mzW, List<AutoCutMediaModel> list, Set<String> set, CreativeInfo creativeInfo, final int i2, final C0MJ9 c0mj9, final String str6, boolean z) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("EditAutoCutComponent start requestNLEModel: taskId = ");
        sbLIZ.append(str);
        sbLIZ.append(", musicId = ");
        sbLIZ.append(str2);
        sbLIZ.append(",isFromNLE=");
        sbLIZ.append(this.a);
        sbLIZ.append("， mediaModelList = ");
        sbLIZ.append(C13LP.LJJLIIIJ(list, null, null, null, 0, null, AFwS261S0000000_22.get$arr$(92), 31));
        sbLIZ.append(", indexFromSource = ");
        sbLIZ.append(i2);
        sbLIZ.append(", source = ");
        sbLIZ.append(c0mj9);
        sbLIZ.append(", creativeInfo = ");
        sbLIZ.append(creativeInfo);
        C1417710mzp.LIZ(LogLevel.LEVEL_INFO, C2188811AlT.LIZIZ(sbLIZ));
        s7(20L, i2, c0mj9, new AwS105S0201000_22(this, i2, c0mj9, 2));
        C1417310mzB c1417310mzB = this.LLLLZ;
        if (c1417310mzB != null) {
            c1417310mzB.LJIILIIL = set;
        }
        this.LLZ = System.currentTimeMillis();
        if (C295320Bhq.LIZ()) {
            s sVar = s.LIZ;
            boolean z2 = this.a;
            String str7 = Na().creativeModel.autoCutModel.musicLogId;
            InterfaceC1635410sex interfaceC1635410sexMa = ma();
            sVar.getClass();
            this.LLLLZIL = C09IC.LJJI(LifecycleOwnerKt.getLifecycleScope(this), new C861640Xr8(new C1417410mzL(this, i2, c0mj9, i, str6, str4, enumC1417520mzW, str2, str3, null), s.LJJJJLL(str, str2, str3, str4, str5, enumC1417520mzW, list, set, creativeInfo, z2, false, i, "source_switch", str7, str6, interfaceC1635410sexMa, null, false, false, z, false, this)));
            return;
        }
        boolean z3 = this.a;
        String str8 = Na().creativeModel.autoCutModel.musicLogId;
        InterfaceC1635410sex interfaceC1635410sexMa2 = ma();
        final C13BV c13bv = C13BV.INSTANCE;
        this.LLLLZI = s.LJJJLIIL(str, str2, str3, str4, str5, enumC1417520mzW, list, set, creativeInfo, z3, false, i, "source_switch", str8, str6, interfaceC1635410sexMa2, null, false, false, z, false, this, new C1417970n0F(c13bv) { // from class: X.0mzK
            @Override // com.bytedance.ies.smartmovie.jni.NLEModelRequestProgressCallback
            public final void onCompressDone(VecMeta vecMeta) {
                List<MetaExt> listLIZJ;
                C1417330mzD c1417330mzD = this.LJII;
                if (vecMeta != null) {
                    listLIZJ = C1418020n0K.LIZJ(vecMeta);
                } else {
                    listLIZJ = null;
                }
                c1417330mzD.Wd(listLIZJ);
            }

            @Override // com.bytedance.ies.smartmovie.jni.NLEModelRequestProgressCallback
            public final void onCompressProgress(float f) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("EditAutoCutComponent onCompressProgress progress: ");
                sbLIZ2.append(f);
                C1417710mzp.LIZ(LogLevel.LEVEL_INFO, C2188811AlT.LIZIZ(sbLIZ2));
                this.LJII.Yc(i2, c0mj9);
            }

            @Override // com.bytedance.ies.smartmovie.jni.NLEModelRequestProgressCallback
            public final void onFetchProgress(float f) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("EditAutoCutComponent requestNLEModel onFetchProgress: progress = ");
                sbLIZ2.append(f);
                C1417710mzp.LIZ(LogLevel.LEVEL_INFO, C2188811AlT.LIZIZ(sbLIZ2));
                this.LJII.Yc(i2, c0mj9);
            }

            @Override // com.bytedance.ies.smartmovie.jni.NLEModelRequestProgressCallback
            public final void onNeedFetch(VecStr vecStr) {
                C1417330mzD c1417330mzD = this.LJII;
                int size = 0;
                c1417330mzD.LLZZZZ = 0;
                if (vecStr != null) {
                    size = vecStr.size();
                }
                c1417330mzD.LLZZZIL = size;
                this.LJII.LLZL = System.currentTimeMillis();
            }

            @Override // X.C1417970n0F
            public final void LIZIZ(NLEModel nLEModel, Map<String, String> map) {
                this.LJII.he(nLEModel, i2, c0mj9, map, i, str6, str4, enumC1417520mzW, str2, str3);
            }

            @Override // X.C1417970n0F, com.bytedance.ies.smartmovie.jni.NLEModelRequestProgressCallback
            public final void onResponse(NLEModel nLEModel, UnorderedMapStrStr unorderedMapStrStr) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("EditAutoCutComponent requestNLEModel onResponse: ");
                sbLIZ2.append(nLEModel);
                C1417710mzp.LIZ(LogLevel.LEVEL_INFO, C2188811AlT.LIZIZ(sbLIZ2));
                if (!this.LJII.Yc(i2, c0mj9)) {
                    return;
                }
                super.onResponse(nLEModel, unorderedMapStrStr);
            }

            @Override // X.C1417970n0F
            public final void LIZJ(int i3, int i4, String str9) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("EditAutoCutComponent requestNLEModel onTemplateFailure: ");
                sbLIZ2.append(i3);
                sbLIZ2.append(", ");
                sbLIZ2.append(i4);
                sbLIZ2.append(", ");
                sbLIZ2.append(str9);
                C1417710mzp.LIZ(LogLevel.LEVEL_INFO, C2188811AlT.LIZIZ(sbLIZ2));
                if (!this.LJII.Yc(i2, c0mj9)) {
                    return;
                }
                C1417330mzD.oc(this.LJII, i3, str9, i2, c0mj9, i4, null);
            }

            @Override // com.bytedance.ies.smartmovie.jni.NLEModelRequestProgressCallback
            public final void onFailure(String str9, int i3, String str10, UnorderedMapStrStr unorderedMapStrStr) {
                Map mapLJIIZILJ;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("EditAutoCutComponent requestNLEModel onFailure: urs=");
                sbLIZ2.append(str9);
                sbLIZ2.append(", ");
                sbLIZ2.append(i3);
                sbLIZ2.append(", ");
                sbLIZ2.append(str10);
                sbLIZ2.append(" extraParams=");
                sbLIZ2.append(unorderedMapStrStr);
                C1417710mzp.LIZ(LogLevel.LEVEL_INFO, C2188811AlT.LIZIZ(sbLIZ2));
                if (!this.LJII.Yc(i2, c0mj9)) {
                    return;
                }
                if (i3 != SmartMovieErrorCode.FETCH_NLEMODEL_FAILURE.swigValue()) {
                    C1417330mzD.oc(this.LJII, i3, str10, i2, c0mj9, Integer.MIN_VALUE, null);
                    return;
                }
                if (unorderedMapStrStr != null) {
                    mapLJIIZILJ = C2097608Jq.LJIIZILJ(unorderedMapStrStr);
                } else {
                    mapLJIIZILJ = null;
                }
                C1417710mzp.LJIJI("source_switch", str9, i3, str10, mapLJIIZILJ, null);
                this.LJII.LLZZZZ++;
            }
        });
    }
}
