package X;

import Y.ARunnableS105S0100000_5;
import Y.ARunnableS22S0110000_3;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcelable;
import android.view.SurfaceView;
import android.view.View;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.lifecycle.Lifecycle;
import com.bytedance.als.FeatureAlsLogicContainer;
import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLEEditorJniJNI;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.ies.nle.editor_jni.NLEResType;
import com.bytedance.ies.nle.editor_jni.NLEResourceAV;
import com.bytedance.ies.nle.editor_jni.NLEResourceNode;
import com.bytedance.ies.nle.editor_jni.NLESegment;
import com.bytedance.ies.nle.editor_jni.NLESegmentAudio;
import com.bytedance.ies.nle.editor_jni.NLESegmentVideo;
import com.bytedance.ies.nle.editor_jni.NLEStyClip;
import com.bytedance.ies.nle.editor_jni.NLETemplateModel;
import com.bytedance.ies.nle.editor_jni.NLETimeSpaceNode;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.NLETrackType;
import com.bytedance.ies.nle.editor_jni.TemplateInfo;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSPtr;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSlotSPtr;
import com.bytedance.mt.protector.impl.JSONArrayProtectorUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.scene.Scene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.k;
import com.google.gson.p;
import com.ss.android.ugc.aweme.api.IAnchorBusinessOutBridgeService;
import com.ss.android.ugc.aweme.autocut.s;
import com.ss.android.ugc.aweme.autopick.api.AutoPickServiceApi;
import com.ss.android.ugc.aweme.creative.model.AutoCutAnchorModel;
import com.ss.android.ugc.aweme.creative.model.AutoCutModel;
import com.ss.android.ugc.aweme.creative.model.AutoCutThemeData;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.FusedMusic;
import com.ss.android.ugc.aweme.creative.model.MusicInfo;
import com.ss.android.ugc.aweme.creative.model.NLEInfoModel;
import com.ss.android.ugc.aweme.creative.model.PUgcTemplateData;
import com.ss.android.ugc.aweme.creative.model.TemplateAnchorData;
import com.ss.android.ugc.aweme.creative.model.TemplateComplexity;
import com.ss.android.ugc.aweme.creative.model.TemplateData;
import com.ss.android.ugc.aweme.creative.model.UgcTemplateData;
import com.ss.android.ugc.aweme.creative.model.album.ImportVideoInfo;
import com.ss.android.ugc.aweme.creative.model.edit.EditModel;
import com.ss.android.ugc.aweme.creative.model.edit.multiedit.MultiEditVideoRecordData;
import com.ss.android.ugc.aweme.creative.model.edit.multiedit.MultiEditVideoStatusRecordData;
import com.ss.android.ugc.aweme.creative.model.editorpro.EditorProModel;
import com.ss.android.ugc.aweme.creative.model.grid.QuickGridModel;
import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import com.ss.android.ugc.aweme.creative.model.music.MusicBuzModel;
import com.ss.android.ugc.aweme.creative.model.template.MvModel;
import com.ss.android.ugc.aweme.edit.Cut2EditTransferModel;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.interfaces.ITemplateApplyService;
import com.ss.android.ugc.aweme.interfaces.ITemplateMobService;
import com.ss.android.ugc.aweme.interfaces.ITemplateResourceService;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.music.model.MusicBeanUtilKt;
import com.ss.android.ugc.aweme.property.AVSettingsWrapper;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.aweme.services.external.ui.MediaChooseResultListener;
import com.ss.android.ugc.aweme.services.onthisday.OnThisDayService;
import com.ss.android.ugc.aweme.services.optimization.ILayoutPreloadServiceForEditPage;
import com.ss.android.ugc.aweme.services.uikit.CreativeLoadingDialog;
import com.ss.android.ugc.aweme.services.uikit.CreativeLoadingDialogBuilder;
import com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder;
import com.ss.android.ugc.aweme.setting.performance.exp.AlbumIsPreDownloadInWeakNet;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.WorkSpace.Workspace;
import com.ss.android.ugc.aweme.shortvideo.cut.VECutVideoActivity;
import com.ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditPreviewInfo;
import com.ss.android.ugc.aweme.sticker.StickerInfo;
import com.ss.android.ugc.aweme.utils.oh;
import com.ss.android.ugc.gamora.layout.LayoutNLETrackStub;
import com.ss.android.ugc.tools.view.uikit.factory.CreativeDialogWrapper;
import com.ss.android.vesdk.VESize;
import com.ss.android.vesdk.VEUtils;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS194S0000000_8;
import kotlin.jvm.internal.AFwS239S0000000_8;
import kotlin.jvm.internal.AwS145S0101000_5;
import kotlin.jvm.internal.AwS552S0100000_8;
import kotlin.jvm.internal.AwS584S0100000_5;
import kotlin.jvm.internal.AwS96S0110000_8;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import nv7.c0;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0L7R, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public class C0L7R implements InterfaceC533910Kwn {
    public static int LJJIJIIJI = 80;
    public static int LJJIJIIJIL = 40;
    public static int LJJIJIL = 40;
    public static int LJJIJL = 20;
    public static int LJJIJLIJ = 20;
    public static int LJJIL = 3;
    public final long LIZ;
    public final long LIZIZ;
    public final boolean LIZJ;
    public final C1DRG LIZLLL;
    public AnonymousClass0956 LJ;
    public InterfaceC537740L7c LJFF;
    public CreativeDialogWrapper LJI;
    public int LJII;
    public InterfaceC2357009Lk LJIIIIZZ;
    public List<? extends VideoSegment> LJIIIZ;
    public final WeakReference<Activity> LJIIJ;
    public final C01GW LJIIJJI;
    public int LJIIL;
    public long LJIILIIL;
    public long LJIILJJIL;
    public long LJIILL;
    public long LJIILLIIL;
    public EnumC1412640mre LJIIZILJ;
    public boolean LJIJ;
    public String LJIJI;
    public C353570Dtb LJIJJ;
    public C354610DvH LJIJJLI;
    public C357450Dzr LJIL;
    public C0FQS LJJ;
    public C354660DvM LJJI;
    public final Set<String> LJJIFFI;
    public final long LJJII;
    public boolean LJJIII;
    public boolean LJJIIJ;
    public boolean LJJIIJZLJL;
    public String LJJIIZ;
    public boolean LJJIIZI;
    public String LJJIJ;

    public final void LJIIJJI() {
        if (this.LIZJ) {
            this.LJJIIJZLJL = true;
            CreativeDialogWrapper creativeDialogWrapper = this.LJI;
            if (creativeDialogWrapper != null) {
                creativeDialogWrapper.dismiss();
            }
            EnumC1412640mre enumC1412640mre = EnumC1412640mre.UGC_TEMPLATE;
            EnumC1412640mre enumC1412640mre2 = this.LJIIZILJ;
            if (enumC1412640mre == enumC1412640mre2 || EnumC1412640mre.PUGC_TEMPLATE == enumC1412640mre2) {
                LJJIJIL(Long.valueOf(System.currentTimeMillis() - this.LJIILIIL), -1, "dismissDialog", null, null);
            }
        }
    }

    public String LJIILL(CreativeInfo creativeInfo) {
        return null;
    }

    @Override // X.InterfaceC533910Kwn
    public final void LIZ() {
        C354610DvH c354610DvH = this.LJIJJLI;
        if (c354610DvH != null) {
            c354610DvH.cancel();
            C201955140j.LIZIZ("TemplateMattingTask", "Template_Matting release. ");
            C823050WQl.LIZLLL().execute(new ARunnableS105S0100000_5(c354610DvH, 15));
        }
    }

    public final Handler LJIJJLI() {
        return (Handler) this.LJIIJJI.getValue();
    }

    public final void LJJIIJ() {
        List<InterfaceC2342209Fs> list = C2341909Fp.LIZ;
        C0LAB c0lab = new C0LAB();
        long j = this.LJIILL;
        if (j > 60000) {
            j = 0;
        }
        c0lab.LIZIZ(j, "fetch_music");
        long j2 = this.LJIILLIIL;
        c0lab.LIZIZ(j2 <= 60000 ? j2 : 0L, "fetch_algorithm");
        C2341909Fp.LIZ("tool_performance_ai_clip", c0lab.LIZ);
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x00a4, code lost:
    
        r5 = true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static kotlin.Pair LJIILJJIL() {
        /*
            com.ss.android.ugc.gamora.editor.mixediting.experiments.MixEditingPathKeys r0 = X.C537790L7h.LIZ()
            r1 = -1
            r5 = 0
            if (r0 == 0) goto L9a
            com.ss.android.ugc.gamora.editor.mixediting.experiments.MixEditingPathKeys r0 = X.C537800L7i.LIZ()
            if (r0 == 0) goto L9a
            com.ss.android.ugc.gamora.editor.mixediting.experiments.MixEditingPathKeys r4 = X.C537790L7h.LIZ()
            if (r4 != 0) goto L2b
            com.ss.android.ugc.gamora.editor.mixediting.experiments.MixEditingPathKeys r4 = new com.ss.android.ugc.gamora.editor.mixediting.experiments.MixEditingPathKeys
            r17 = 0
            r18 = 8191(0x1fff, float:1.1478E-41)
            r6 = r5
            r7 = r5
            r8 = r5
            r9 = r5
            r10 = r5
            r11 = r5
            r12 = r5
            r13 = r5
            r14 = r5
            r15 = r5
            r16 = r5
            r19 = r17
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
        L2b:
            com.ss.android.ugc.gamora.editor.mixediting.experiments.MixEditingPathKeys r2 = X.C537800L7i.LIZ()
            if (r2 != 0) goto L4c
            com.ss.android.ugc.gamora.editor.mixediting.experiments.MixEditingPathKeys r2 = new com.ss.android.ugc.gamora.editor.mixediting.experiments.MixEditingPathKeys
            r19 = 0
            r20 = 8191(0x1fff, float:1.1478E-41)
            r6 = r2
            r7 = r5
            r8 = r5
            r9 = r5
            r10 = r5
            r11 = r5
            r12 = r5
            r13 = r5
            r14 = r5
            r15 = r5
            r16 = r5
            r17 = r5
            r18 = r5
            r21 = r19
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
        L4c:
            int r0 = r4.delayShowContainer
            if (r0 == r1) goto L89
            if (r0 == 0) goto L98
        L52:
            r3 = 1
        L53:
            int r0 = r2.delayShowContainer
            if (r0 == r1) goto L78
            if (r0 == 0) goto L87
        L59:
            r1 = 1
        L5a:
            boolean r0 = r4.enableMixMaterial
            if (r0 != 0) goto L76
            boolean r0 = r2.enableMixMaterial
            if (r0 != 0) goto L76
            r0 = 0
        L63:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r0)
            if (r3 != 0) goto L6b
            if (r1 == 0) goto L6c
        L6b:
            r5 = 1
        L6c:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r5)
            kotlin.Pair r0 = new kotlin.Pair
            r0.<init>(r2, r1)
            return r0
        L76:
            r0 = 1
            goto L63
        L78:
            X.01GW r0 = X.C288120BRa.LIZ
            java.lang.Object r0 = r0.getValue()
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            if (r0 == 0) goto L87
            goto L59
        L87:
            r1 = 0
            goto L5a
        L89:
            X.01GW r0 = X.C288120BRa.LIZ
            java.lang.Object r0 = r0.getValue()
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            if (r0 == 0) goto L98
            goto L52
        L98:
            r3 = 0
            goto L53
        L9a:
            com.ss.android.ugc.gamora.editor.mixediting.experiments.MixEditingPathKeys r0 = X.C0L7Z.LIZ()
            int r0 = r0.delayShowContainer
            if (r0 == r1) goto Lb9
            if (r0 == 0) goto La5
        La4:
            r5 = 1
        La5:
            com.ss.android.ugc.gamora.editor.mixediting.experiments.MixEditingPathKeys r0 = X.C0L7Z.LIZ()
            boolean r0 = r0.enableMixMaterial
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r0)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r5)
            kotlin.Pair r0 = new kotlin.Pair
            r0.<init>(r2, r1)
            return r0
        Lb9:
            X.01GW r0 = X.C288120BRa.LIZ
            java.lang.Object r0 = r0.getValue()
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            if (r0 == 0) goto La5
            goto La4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0L7R.LJIILJJIL():kotlin.Pair");
    }

    public final boolean LJIJ() {
        return AlbumIsPreDownloadInWeakNet.LIZ() && this.LJJIIZI;
    }

    public static Pair LJIIZILJ(Intent intent) {
        ShortVideoContext shortVideoContext;
        C1412390mrF c1412390mrFLIZLLL;
        CreativeModel creativeModel;
        MvModel mvModel;
        CreativeModel creativeModel2;
        TemplateAnchorData templateAnchorData;
        String str;
        int intExtra = intent.getIntExtra("key_choose_scene", -1);
        Parcelable parcelableExtra = intent.getParcelableExtra("key_short_video_context");
        EnumC1412640mre enumC1412640mreLIZJ = null;
        if (parcelableExtra instanceof ShortVideoContext) {
            shortVideoContext = (ShortVideoContext) parcelableExtra;
        } else {
            shortVideoContext = null;
        }
        if (C298890Bnb.LIZ() && shortVideoContext != null && (creativeModel2 = shortVideoContext.creativeModel) != null && (templateAnchorData = creativeModel2.templateAnchorData) != null && (str = templateAnchorData.followedTemplateDispatchType) != null && str.length() != 0) {
            c1412390mrFLIZLLL = new C1412390mrF(str).LIZLLL();
        } else {
            c1412390mrFLIZLLL = null;
        }
        if (intExtra == 40) {
            if (shortVideoContext != null && (creativeModel = shortVideoContext.creativeModel) != null && (mvModel = creativeModel.mvModel) != null) {
                enumC1412640mreLIZJ = C1412660mrg.LIZJ(mvModel.templateType);
            }
            C1412390mrF c1412390mrF = C1412390mrF.LJI;
            if (enumC1412640mreLIZJ == null) {
                enumC1412640mreLIZJ = EnumC1412640mre.PUGC_TEMPLATE;
            }
            return new Pair(c1412390mrF, enumC1412640mreLIZJ);
        }
        if (intExtra == 36) {
            if (shortVideoContext != null) {
                CreativeModel creativeModel3 = shortVideoContext.creativeModel;
                if (creativeModel3 != null && C0MUK.LJII(creativeModel3)) {
                    if (c1412390mrFLIZLLL == null) {
                        c1412390mrFLIZLLL = C1412390mrF.LIZIZ;
                    }
                    return new Pair(c1412390mrFLIZLLL, EnumC1412640mre.PUGC_TEMPLATE);
                }
                CreativeModel creativeModel4 = shortVideoContext.creativeModel;
                if (creativeModel4 != null && C0MUK.LJI(creativeModel4)) {
                    if (c1412390mrFLIZLLL == null) {
                        c1412390mrFLIZLLL = C1412390mrF.LIZJ;
                    }
                    return new Pair(c1412390mrFLIZLLL, EnumC1412640mre.PUGC_TEMPLATE);
                }
            }
            if (c1412390mrFLIZLLL == null) {
                c1412390mrFLIZLLL = C1412390mrF.LJ;
            }
            return new Pair(c1412390mrFLIZLLL, EnumC1412640mre.PUGC_TEMPLATE);
        }
        if (intExtra == 24) {
            if (c1412390mrFLIZLLL == null) {
                c1412390mrFLIZLLL = C1412390mrF.LIZLLL;
            }
            return new Pair(c1412390mrFLIZLLL, EnumC1412640mre.UGC_TEMPLATE);
        }
        return new Pair(null, null);
    }

    public static final List<ImportVideoInfo> LJIJI(List<? extends VideoSegment> list) {
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        for (VideoSegment videoSegment : list) {
            int i = videoSegment.width;
            int i2 = videoSegment.height;
            int iLIZIZ = videoSegment.LIZIZ();
            int iLIZJ = videoSegment.LIZJ();
            String strLJFF = videoSegment.LJFF(true);
            strLJFF.toString();
            long j = videoSegment.duration;
            long jLIZLLL = videoSegment.LIZLLL() - videoSegment.LJII();
            String str = videoSegment.mDescription;
            String str2 = videoSegment.mMusicId;
            int iLJ = videoSegment.LJ();
            float fLJI = videoSegment.LJI();
            String strLJFF2 = videoSegment.LJFF(false);
            strLJFF2.toString();
            arrayList.add(new ImportVideoInfo(i, i2, iLIZIZ, iLIZJ, strLJFF, j, jLIZLLL, str, str2, iLJ, fLJI, strLJFF2, videoSegment.originPath, videoSegment.fastImportDependHW, null, videoSegment.aigcInfo, videoSegment.date));
        }
        return arrayList;
    }

    public static Pair LJJIFFI(int i) {
        boolean z;
        boolean z2 = false;
        if (i != 24 && i != 36 && i != 40) {
            z = false;
        } else {
            z = true;
        }
        if (i == 36 || i == 40) {
            z2 = true;
        }
        return new Pair(Boolean.valueOf(z), Boolean.valueOf(z2));
    }

    public static void LJJII(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CutOptimizedVideoChosenHandler:");
        sbLIZ.append(str);
        C201955140j.LIZ(C2188811AlT.LIZIZ(sbLIZ));
    }

    public static final C0E4S LJJJJLI(VideoSegment videoSegment) {
        NLEResType nLEResType;
        String strLJFF = videoSegment.LJFF(false);
        if (videoSegment.isImageType) {
            nLEResType = NLEResType.IMAGE;
        } else {
            nLEResType = NLEResType.VIDEO;
        }
        long j = videoSegment.duration;
        float fLJI = videoSegment.LJI();
        long jLJII = videoSegment.LJII();
        long jLIZLLL = videoSegment.LIZLLL();
        String str = videoSegment.slotId;
        if (str == null) {
            str = "";
        }
        C0E4S c0e4s = new C0E4S(strLJFF, nLEResType, j, fLJI, jLJII, jLIZLLL, str, null, 128);
        c0e4s.LJII.put("create_time", Long.valueOf(videoSegment.date));
        return c0e4s;
    }

    public final void LJ(Intent intent) {
        List<? extends VideoSegment> list = this.LJIIIZ;
        if (list != null) {
            int i = 0;
            if (!list.isEmpty()) {
                Iterator<? extends VideoSegment> it2 = list.iterator();
                while (it2.hasNext()) {
                    if (it2.next().isImageType && (i = i + 1) < 0) {
                        C1697810uHb.LJIJ();
                        throw null;
                    }
                }
            }
            int size = list.size() - i;
            intent.putExtra("key_start_go_cut_activity_time", this.LJIILIIL);
            intent.putExtra("key_video_count", size);
            intent.putExtra("key_photo_count", i);
            Iterator<? extends VideoSegment> it3 = list.iterator();
            long j = 0;
            while (it3.hasNext()) {
                j += it3.next().duration;
            }
            intent.putExtra("key_total_import_duration", j);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0037, code lost:
    
        r2 = 1004;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJFF(java.util.List r5) {
        /*
            r4 = this;
            r3 = 0
            r1 = 1
            if (r5 == 0) goto L3a
            boolean r0 = r5.isEmpty()
            if (r0 != 0) goto L3a
            r0 = 0
        Lb:
            r2 = -1
            if (r0 != 0) goto L16
            int r0 = r5.size()
            if (r0 != r1) goto L19
            r2 = 1003(0x3eb, float:1.406E-42)
        L16:
            r4.LJII = r2
            return
        L19:
            java.util.Iterator r1 = r5.iterator()
        L1d:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L37
            java.lang.Object r0 = r1.next()
            com.ss.android.ugc.aweme.mediachoose.helper.MediaModel r0 = (com.ss.android.ugc.aweme.mediachoose.helper.MediaModel) r0
            boolean r0 = r0.LJIIJ()
            if (r0 == 0) goto L34
            if (r3 == r2) goto L37
            r2 = 1005(0x3ed, float:1.408E-42)
            goto L16
        L34:
            int r3 = r3 + 1
            goto L1d
        L37:
            r2 = 1004(0x3ec, float:1.407E-42)
            goto L16
        L3a:
            r0 = 1
            goto Lb
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0L7R.LJFF(java.util.List):void");
    }

    public final void LJIIJ(boolean z) {
        this.LJJIIJZLJL = false;
        C786410Ut5.LJLIIL(this.LJJII, LJIJJLI(), new ARunnableS22S0110000_3(this, z, 0));
    }

    public CreativeLoadingDialogBuilder LJIILLIIL(Activity activity) {
        CreativeLoadingDialogBuilder creativeLoadingDialogBuilder = new CreativeLoadingDialogBuilder();
        creativeLoadingDialogBuilder.showProgress(true);
        creativeLoadingDialogBuilder.backCanCancel(false);
        creativeLoadingDialogBuilder.cancelViewVisibleType(CreativeLoadingDialogBuilder.CancelType.VISIBLE_AFTER_5S);
        creativeLoadingDialogBuilder.loadingMessage(activity.getString(R.string.txr));
        creativeLoadingDialogBuilder.clickCancelListener(new AwS96S0110000_8(this, 2));
        return creativeLoadingDialogBuilder;
    }

    public final void LJJJJI(String str) {
        this.LJJIIZ = str;
    }

    public void LJJJJZ(int i) {
        C0CNO.LIZLLL(0L, new AwS145S0101000_5(this, i, 3));
    }

    public static String LIZLLL(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    public static void LJJJJ(NLETemplateModel nLETemplateModel, PUgcTemplateData pUgcTemplateData) {
        if (nLETemplateModel != null) {
            C348740Dlo.LIZ(nLETemplateModel, new AwS584S0100000_5(pUgcTemplateData, 105));
        }
        C1398350mUb c1398350mUb = C1398350mUb.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Template_Matting saveMattingResToPUGC: mattingCachedRes=");
        sbLIZ.append(pUgcTemplateData.mattingCachedRes);
        sbLIZ.append(", mattingDependencyRes=");
        sbLIZ.append(pUgcTemplateData.mattingDependencyRes);
        C201955140j.LIZLLL(c1398350mUb, "CutOptimizedVideoChosenHandler", C2188811AlT.LIZIZ(sbLIZ));
    }

    public static void LJJJJJ(Activity activity, String str) {
        CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
        creativeToastBuilder.message(str);
        C1390380mHk.LIZ(activity, 3009, creativeToastBuilder);
    }

    public final void LJJ(Intent intent, InterfaceC1631630sYr<? super String, ? super Integer, ? super String, ? super String, Unit> interfaceC1631630sYr) {
        Pair pairLJIIZILJ = LJIIZILJ(intent);
        C1412390mrF c1412390mrF = (C1412390mrF) pairLJIIZILJ.getFirst();
        EnumC1412640mre enumC1412640mre = (EnumC1412640mre) pairLJIIZILJ.getSecond();
        if (enumC1412640mre == EnumC1412640mre.UGC_TEMPLATE || EnumC1412640mre.PUGC_TEMPLATE == enumC1412640mre) {
            String strLIZLLL = LIZLLL(intent, "key_ugc_template_id");
            String str = "";
            if (strLIZLLL == null) {
                strLIZLLL = "";
            }
            this.LJIJI = strLIZLLL;
            String strLIZLLL2 = LIZLLL(intent, "key_ugc_template_url");
            if (strLIZLLL2 != null) {
                str = strLIZLLL2;
            }
            Pair pairLJIJJ = LJIJJ(intent, c1412390mrF, enumC1412640mre);
            int iIntValue = ((Number) pairLJIJJ.getFirst()).intValue();
            Object second = pairLJIJJ.getSecond();
            this.LJIIZILJ = C1412660mrg.LIZJ(iIntValue);
            interfaceC1631630sYr.invoke(this.LJIJI, Integer.valueOf(iIntValue), str, second);
        }
    }

    public final void LJJJJIZL(int i, boolean z) {
        Activity activity;
        CreativeLoadingDialog creativeLoadingDialogCreateLoadingDialog;
        if (this.LIZJ) {
            if ((this.LJJIIJ && this.LJJIIJZLJL) || (activity = this.LJIIJ.get()) == null || activity.isFinishing()) {
                return;
            }
            CreativeDialogWrapper creativeDialogWrapper = this.LJI;
            if (creativeDialogWrapper != null && creativeDialogWrapper.isShowing()) {
                return;
            }
            if (C0C64.LJIILLIIL().LJIJ(31744, 0, "studio_sound_sync_album_loading_style", true) == 1 && z) {
                C19576911iZ c19576911iZ = C19576911iZ.LIZ;
                int i2 = this.LJII;
                CreativeLoadingDialogBuilder creativeLoadingDialogBuilder = new CreativeLoadingDialogBuilder();
                creativeLoadingDialogBuilder.backCanCancel(false);
                creativeLoadingDialogBuilder.showProgress(false);
                creativeLoadingDialogCreateLoadingDialog = c19576911iZ.createLoadingDialog(activity, i2, creativeLoadingDialogBuilder);
            } else {
                creativeLoadingDialogCreateLoadingDialog = C19576911iZ.LIZ.createLoadingDialog(activity, this.LJII, LJIILLIIL(activity));
            }
            CreativeDialogWrapper creativeDialogWrapper2 = (CreativeDialogWrapper) creativeLoadingDialogCreateLoadingDialog;
            this.LJI = creativeDialogWrapper2;
            creativeDialogWrapper2.show();
            this.LJIIL = i;
            LJJJJZ(0);
        }
    }

    public static Pair LJIJJ(Intent intent, C1412390mrF c1412390mrF, EnumC1412640mre enumC1412640mre) {
        char c;
        int value;
        String value2;
        Pair pairLJJIFFI = LJJIFFI(intent.getIntExtra("key_choose_scene", -1));
        ((Boolean) pairLJJIFFI.getFirst()).booleanValue();
        if (((Boolean) pairLJJIFFI.getSecond()).booleanValue()) {
            c = 5;
        } else {
            c = 1;
        }
        if (enumC1412640mre != null) {
            value = enumC1412640mre.getValue();
        } else if (5 == c) {
            value = EnumC1412640mre.PUGC_TEMPLATE.getValue();
        } else {
            value = EnumC1412640mre.UGC_TEMPLATE.getValue();
        }
        if (C298890Bnb.LIZ()) {
            if (Intrinsics.LJFF(c1412390mrF, C1412390mrF.LJI)) {
                value2 = C0L95.TEMPLATE_TAB.getValue();
            } else if (c1412390mrF != null && c1412390mrF.LIZIZ()) {
                value2 = C0L95.ANCHOR.getValue();
            } else {
                value2 = C0L95.UNKOWN.getValue();
            }
        } else if (Intrinsics.LJFF(c1412390mrF, C1412390mrF.LJI)) {
            value2 = C0L95.TEMPLATE_TAB.getValue();
        } else if (!Intrinsics.LJFF(c1412390mrF, C1412390mrF.LIZIZ) && !Intrinsics.LJFF(c1412390mrF, C1412390mrF.LJ) && !Intrinsics.LJFF(c1412390mrF, C1412390mrF.LIZLLL)) {
            value2 = C0L95.UNKOWN.getValue();
        } else {
            value2 = C0L95.ANCHOR.getValue();
        }
        return new Pair(Integer.valueOf(value), value2);
    }

    public final InterfaceC1631620sYq<Intent, Boolean, InterfaceC1364105Vn<? super Boolean>, Object> LJIL(boolean z, Intent intent, NLETemplateModel nLETemplateModel) {
        AutoPickServiceApi autoPickServiceApi;
        InterfaceC1631620sYq<Intent, Boolean, InterfaceC1364105Vn<? super Boolean>, Object> interfaceC1631620sYqLJIIJ;
        Activity activity = this.LJIIJ.get();
        if (activity != null && (autoPickServiceApi = (AutoPickServiceApi) PluggableExtentionKt.pluggableSpi$default(AutoPickServiceApi.class, false, false, false, 14, null)) != null && (interfaceC1631620sYqLJIIJ = autoPickServiceApi.LJIIJ(activity, intent)) != null) {
            return interfaceC1631620sYqLJIIJ;
        }
        if (!z || nLETemplateModel == null || !C0MUK.LIZIZ(intent).pugcTemplateData.featureList.contains("UGC_ASYNC_I2V")) {
            return null;
        }
        if (!C377880Eri.LJIIIIZZ(nLETemplateModel, false)) {
            C536310L1p.LIZ.getClass();
            if (!C536310L1p.LIZJ(nLETemplateModel)) {
                return null;
            }
        }
        VecNLETrackSPtr tracks = nLETemplateModel.getTracks();
        if (tracks == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<NLETrack> it2 = tracks.iterator();
        while (it2.hasNext()) {
            C19719612Di.LJJI(it2.next().getSlots(), arrayList);
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (((NLENode) obj).getFeatureList().contains("UGC_ASYNC_I2V")) {
                arrayList2.add(obj);
            }
        }
        return new C536220L1g(intent, this, arrayList2, null);
    }

    public final void LJJIJL(ShortVideoContext shortVideoContext, String str, List<? extends MediaModel> list) {
        C2269208uo.LIZ.getClass();
        if (C2269208uo.LIZIZ.length() <= 0 && !list.isEmpty()) {
            C2269208uo.LIZIZ = str;
            C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C538290L9f(list, this, shortVideoContext, str, null), 3);
        }
    }

    public Object LJJIJLIJ(List<? extends MediaModel> list, Intent intent, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        return true;
    }

    public final void LJJIZ(String str, String str2, String str3) {
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("cancel_from", str);
        c0lab.LIZIZ(System.currentTimeMillis() - this.LJIILIIL, "time_elapsed");
        c0lab.LJ("shoot_way", str2);
        c0lab.LJ("enter_from", str3);
        C20684815ws.LJIILLIIL("click_cancel_loading_content", c0lab.LIZ);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C0L7R(Activity activity, long j, long j2, int i) {
        boolean z;
        if ((i & 8) != 0) {
            z = true;
        } else {
            z = false;
        }
        this(activity, j, j2, z, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:75:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJII(com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r5, android.content.Intent r6, java.lang.String r7, com.ss.android.ugc.aweme.creative.model.music.AVMusic r8) {
        /*
            Method dump skipped, instruction units count: 263
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0L7R.LJII(com.ss.android.ugc.aweme.shortvideo.ShortVideoContext, android.content.Intent, java.lang.String, com.ss.android.ugc.aweme.creative.model.music.AVMusic):void");
    }

    public static ArrayList LJJIII(List list, Intent intent, InterfaceC497601wk interfaceC497601wk, boolean z) {
        int i = 0;
        if (C297650Blb.LIZ()) {
            C2356009La.LIZ.getClass();
            ArrayList arrayListLIZ = C571930Mbv.LIZ(list, false, C2356009La.LIZIZ, z, 2);
            if (z && C0C64.LJIILLIIL().LJIIIZ(31744, "studio_editor_pro_fix_video_duration", true, true)) {
                for (Object obj : arrayListLIZ) {
                    int i2 = i + 1;
                    if (i >= 0) {
                        VideoSegment videoSegment = (VideoSegment) obj;
                        if (videoSegment.duration == 0 && videoSegment.LIZLLL() == 0) {
                            MediaModel mediaModel = (MediaModel) C13LP.LJJJLZIJ(i, list);
                            if (mediaModel != null) {
                                long j = mediaModel.duration;
                                videoSegment.duration = j;
                                videoSegment.LJIIJ(j);
                            } else {
                                return arrayListLIZ;
                            }
                        }
                        i = i2;
                    } else {
                        C1697810uHb.LJIJI();
                        throw null;
                    }
                }
                return arrayListLIZ;
            }
            return arrayListLIZ;
        }
        if (interfaceC497601wk != null) {
            C23250099c.LIZLLL(interfaceC497601wk, C0PEM.LIZ, null, new C2355809Ky(intent, null), 2);
        }
        return C571930Mbv.LIZ(list, false, C2355609Kw.INSTANCE, false, 10);
    }

    public static void LJJJJJL(C0L7R c0l7r, int i, String str, int i2) {
        Window window;
        View decorView;
        if ((i2 & 1) != 0) {
            i = 0;
        }
        if ((i2 & 2) != 0) {
            str = null;
        }
        Activity activity = c0l7r.LJIIJ.get();
        if (activity != null && (window = activity.getWindow()) != null && (decorView = window.getDecorView()) != null) {
            CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
            if (i != 0) {
                str = activity.getString(i);
            }
            creativeToastBuilder.message(str);
            creativeToastBuilder.isTuxToastLegacy(true);
            C1390380mHk.LIZLLL(decorView, 6015, creativeToastBuilder);
        }
    }

    @Override // X.InterfaceC533910Kwn
    public final void LIZJ(List<? extends MediaModel> list, Intent intent, boolean z, Function0<Unit> function0) {
        boolean z2;
        int i;
        LJFF(list);
        this.LJIILIIL = System.currentTimeMillis();
        AnonymousClass0956 anonymousClass0956 = this.LJ;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        if (list.isEmpty()) {
            function0.invoke();
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (MediaModel mediaModel : list) {
            if (mediaModel.LJIIJ()) {
                arrayList.add(mediaModel);
            }
        }
        if (arrayList.size() == list.size()) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2) {
            Activity activity = this.LJIIJ.get();
            if (activity == null) {
                return;
            }
            if (!C0CHQ.LIZ().LJJJJJ().getAlbumService().checkMediaDurationValid(activity, list, 0L, this.LIZIZ).getFirst().booleanValue()) {
                function0.invoke();
                return;
            }
        }
        if (this.LJIIL == 0) {
            i = 80;
        } else {
            i = 50;
        }
        LJJIJIIJI = i;
        this.LJ = C23250099c.LIZLLL(C817503Hh.LL, C0PEM.LIZJ, null, new C09LX(list, intent, this, z2, function0, z, null), 2);
    }

    public boolean LJJIJIIJIL(VideoSegment videoSegment, boolean z, CreativeInfo creativeInfo, InterfaceC2357009Lk interfaceC2357009Lk) {
        boolean z2;
        if (z) {
            if (interfaceC2357009Lk == null && (interfaceC2357009Lk = this.LJIIIIZZ) == null) {
                interfaceC2357009Lk = C0CHQ.LIZ().LJJJJLL().LIZIZ(creativeInfo);
                this.LJIIIIZZ = interfaceC2357009Lk;
            }
            Pair<Integer, Integer> pairLIZIZ = interfaceC2357009Lk.LIZIZ(z);
            if (videoSegment.width * videoSegment.height > pairLIZIZ.getFirst().intValue() * pairLIZIZ.getSecond().intValue()) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!C536290L1n.LIZ(videoSegment) || z2) {
                return true;
            }
            return false;
        }
        if (!C536290L1n.LIZ(videoSegment)) {
            return true;
        }
        return false;
    }

    public final void LJJJIL(MediaModel mediaModel, Intent intent, CreativeInfo creativeInfo, Function0<Unit> function0) {
        this.LJIILIIL = System.currentTimeMillis();
        AnonymousClass0956 anonymousClass0956 = this.LJ;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        this.LJIIL = 0;
        this.LJ = C23250099c.LIZLLL(C817503Hh.LL, C0PEM.LIZJ, null, new C09LV(mediaModel, this, creativeInfo, intent, function0, null), 2);
    }

    public C0L7R(Activity activity, long j, long j2, boolean z, C1DRG c1drg) {
        this.LIZ = j;
        this.LIZIZ = j2;
        this.LIZJ = z;
        this.LIZLLL = c1drg;
        this.LJII = -1;
        this.LJIIJ = new WeakReference<>(activity);
        this.LJIIJJI = C452501pT.LIZIZ(new AwS552S0100000_8(this, 181));
        this.LJIILJJIL = -1L;
        this.LJIJI = "";
        this.LJJIFFI = new LinkedHashSet();
        this.LJJII = ((Number) C280630AzF.LIZ.getValue()).longValue();
        this.LJJIIZ = "";
    }

    public static void LJJIIJZLJL(ShortVideoContext shortVideoContext, String str, String str2, long j, Map map) {
        String creationId;
        C13DA c13da = new C13DA();
        c13da.put("step", str);
        c13da.put("stage", str2);
        c13da.put("duration", String.valueOf(j));
        String str3 = null;
        if (shortVideoContext != null) {
            creationId = shortVideoContext.getCreationId();
        } else {
            creationId = null;
        }
        c13da.put("creation_id", creationId);
        if (shortVideoContext != null) {
            str3 = shortVideoContext.shootWay;
        }
        c13da.put("shoot_way", str3);
        if (map == null) {
            map = C2097608Jq.LJ();
        }
        c13da.putAll(map);
        C20684815ws.LJIILLIIL("mix_editor_download_info", c13da.build());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC533910Kwn
    public final void LIZIZ(List<? extends MediaModel> list, Intent intent, Intent intent2, MediaChooseResultListener mediaChooseResultListener, Function0<Unit> function0) {
        long jCurrentTimeMillis;
        T parcelableArrayList;
        ShortVideoContext shortVideoContext;
        boolean z;
        boolean z2;
        boolean z3;
        Bundle extras;
        LJFF(list);
        if (intent.getLongExtra("extra_start_enter_edit_page", 0L) != 0) {
            jCurrentTimeMillis = intent.getLongExtra("extra_start_enter_edit_page", -1L);
        } else {
            jCurrentTimeMillis = System.currentTimeMillis();
        }
        this.LJIILIIL = jCurrentTimeMillis;
        C259800zU c259800zU = new C259800zU();
        try {
            extras = intent.getExtras();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        if (extras == null) {
            parcelableArrayList = 0;
        } else {
            parcelableArrayList = extras.getParcelableArrayList("clip_arg_data_process_origin_items");
        }
        c259800zU.element = parcelableArrayList;
        AnonymousClass0956 anonymousClass0956 = this.LJ;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        if (list.isEmpty()) {
            if (mediaChooseResultListener != null) {
                mediaChooseResultListener.onMediaChooseFail("selectedMediaList is null or empty");
            }
            if (function0 != null) {
                function0.invoke();
                return;
            }
            return;
        }
        Activity activity = this.LJIIJ.get();
        if (activity == null) {
            return;
        }
        C443120HZe<Boolean, Integer, Long> c443120HZeCheckMediaDurationValid = C0CHQ.LIZ().LJJJJJ().getAlbumService().checkMediaDurationValid(activity, list, 0L, this.LIZIZ);
        boolean zBooleanValue = c443120HZeCheckMediaDurationValid.getFirst().booleanValue();
        long jLongValue = c443120HZeCheckMediaDurationValid.getThird().longValue();
        if (!zBooleanValue) {
            if (mediaChooseResultListener != null) {
                mediaChooseResultListener.onMediaChooseFail("media duration is invalid");
            }
            if (function0 != null) {
                function0.invoke();
                return;
            }
            return;
        }
        this.LJIIL = 0;
        this.LJJIIJZLJL = false;
        CreativeModel creativeModelLIZIZ = C0MUK.LIZIZ(intent2);
        C013C c013c = new C013C();
        C013C c013c2 = new C013C();
        C013C c013c3 = new C013C();
        Parcelable parcelableExtra = intent.getParcelableExtra("key_short_video_context");
        if (parcelableExtra instanceof ShortVideoContext) {
            shortVideoContext = (ShortVideoContext) parcelableExtra;
            if (shortVideoContext != null) {
                c013c.element = C537970L7z.LJFF(shortVideoContext.creativeModel.editorProSchemeModel);
                c013c2.element = C537970L7z.LJI(shortVideoContext.creativeModel.editorProSchemeModel);
                EditorProModel editorProModel = shortVideoContext.creativeFlowData.getEditorProModel();
                if ((editorProModel != null && editorProModel.getFromEditorProEntranceInAlbum()) || shortVideoContext.creativeModel.editorProDraftModel.isEnterFromRecordTab || shortVideoContext.creativeModel.editorProDraftModel.isEnterFromAlbum) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                c013c3.element = z3;
            }
        } else {
            shortVideoContext = null;
        }
        C013C c013c4 = new C013C();
        C013C c013c5 = new C013C();
        C013C c013c6 = new C013C();
        if (shortVideoContext != null) {
            CreativeModel creativeModel = shortVideoContext.creativeModel;
            c013c4.element = creativeModel.pugcTemplateData.isFromCreateTemplate;
            c013c5.element = creativeModel.onThisDayData.isFromOnThisDay();
            c013c6.element = shortVideoContext.creativeModel.autoPickModel.albumNavigationFlag;
        }
        this.LJIILJJIL = intent2.getLongExtra("extra_start_enter_cut_page", -1L);
        int intExtra = intent.getIntExtra("key_choose_scene", -1);
        LJJ(intent, C581280Mr0.get$arr$(0));
        AFwS239S0000000_8 aFwS239S0000000_8 = AFwS239S0000000_8.get$arr$(72);
        if (intExtra != 14 && intExtra != 46) {
            z = false;
        } else {
            z = true;
        }
        if ((c013c3.element || z) && C09LY.LIZ()) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.LJ = C23250099c.LIZLLL(C817503Hh.LL, C0PEM.LIZJ, null, new C0L0U(this, list, intent2, intent, intExtra, c013c6, c259800zU, creativeModelLIZIZ, c013c, c013c3, c013c4, c013c5, z2, function0, aFwS239S0000000_8, mediaChooseResultListener, c013c2, jLongValue, null), 2);
    }

    public final void LJJIIZI(Intent intent, boolean z, Long l, String str, Integer num) {
        LJJ(intent, new C532640Kuk(num, l, str, z));
    }

    public final void LJJIJ(int i, long j, long j2, String str, String str2) {
        List<? extends VideoSegment> list = this.LJIIIZ;
        if (list != null) {
            ArrayList arrayList = (ArrayList) list;
            int i2 = 0;
            if (!arrayList.isEmpty()) {
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    if (((VideoSegment) it2.next()).isImageType && (i2 = i2 + 1) < 0) {
                        C1697810uHb.LJIJ();
                        throw null;
                    }
                }
            }
            int size = arrayList.size() - i2;
            C0LAB c0lab = new C0LAB();
            c0lab.LJ("template_id", this.LJIJI);
            if (j < j2) {
                j = j2;
            }
            c0lab.LIZIZ(j, "duration");
            c0lab.LJ("shoot_way", str);
            c0lab.LIZ(i2, "pic_cnt");
            c0lab.LIZ(size, "video_cnt");
            c0lab.LIZ(i, "error_code");
            c0lab.LJ("error_msg", str2);
            C20684815ws.LJIILLIIL("ugc_template_import_material", c0lab.LIZ);
        }
    }

    public final void LJJIJIL(Long l, Integer num, String str, Intent intent, Map<String, String> map) {
        Integer numValueOf;
        if (this.LJIJ) {
            return;
        }
        if (intent != null) {
            Pair pairLJIIZILJ = LJIIZILJ(intent);
            C1412390mrF c1412390mrF = (C1412390mrF) pairLJIIZILJ.getFirst();
            EnumC1412640mre enumC1412640mre = (EnumC1412640mre) pairLJIIZILJ.getSecond();
            if (enumC1412640mre == EnumC1412640mre.UGC_TEMPLATE || EnumC1412640mre.PUGC_TEMPLATE == enumC1412640mre) {
                String strLIZLLL = LIZLLL(intent, "key_ugc_template_id");
                String str2 = "";
                if (strLIZLLL == null) {
                    strLIZLLL = "";
                }
                this.LJIJI = strLIZLLL;
                String strLIZLLL2 = LIZLLL(intent, "key_ugc_template_url");
                if (strLIZLLL2 != null) {
                    str2 = strLIZLLL2;
                }
                Pair pairLJIJJ = LJIJJ(intent, c1412390mrF, enumC1412640mre);
                int iIntValue = ((Number) pairLJIJJ.getFirst()).intValue();
                String str3 = (String) pairLJIJJ.getSecond();
                ITemplateMobService iTemplateMobService = (ITemplateMobService) ServiceManager.get().getService(ITemplateMobService.class);
                if (iTemplateMobService != null) {
                    iTemplateMobService.LJIIIZ(this.LJIJI, Integer.valueOf(iIntValue), str2, str3, l, num, str, map, false);
                    return;
                }
                return;
            }
            return;
        }
        ITemplateMobService iTemplateMobService2 = (ITemplateMobService) ServiceManager.get().getService(ITemplateMobService.class);
        if (iTemplateMobService2 == null) {
            return;
        }
        String str4 = this.LJIJI;
        EnumC1412640mre enumC1412640mre2 = this.LJIIZILJ;
        if (enumC1412640mre2 != null) {
            numValueOf = Integer.valueOf(enumC1412640mre2.getValue());
        } else {
            numValueOf = null;
        }
        iTemplateMobService2.LJIIIZ(str4, numValueOf, "", C0L95.UNKOWN.getValue(), l, num, str, map, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002e A[PHI: r1
      0x002e: PHI (r1v15 java.lang.Object) = (r1v9 java.lang.Object), (r1v0 java.lang.Object) binds: [B:91:0x0233, B:11:0x002b] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0235 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0239  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIIL(java.lang.String r43, java.util.List<? extends com.ss.android.ugc.aweme.mediachoose.helper.MediaModel> r44, android.content.Intent r45, boolean r46, com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r47, X.InterfaceC1364105Vn<? super X.C0L0W> r48) {
        /*
            Method dump skipped, instruction units count: 621
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0L7R.LJIIL(java.lang.String, java.util.List, android.content.Intent, boolean, com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0067  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJJI(java.lang.String r18, java.util.List<? extends com.ss.android.ugc.aweme.mediachoose.helper.MediaModel> r19, android.content.Intent r20, boolean r21, com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r22, X.InterfaceC1364105Vn<? super X.C0L0W> r23) {
        /*
            Method dump skipped, instruction units count: 248
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0L7R.LJJI(java.lang.String, java.util.List, android.content.Intent, boolean, com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:75:0x02ed  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIILIIL(java.lang.String r52, boolean r53, boolean r54, android.content.Intent r55, android.content.Intent r56, java.util.List<? extends com.ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment> r57, X.InterfaceC1364105Vn<? super X.C443120HZe<java.lang.Boolean, ? extends com.bytedance.ies.nle.editor_jni.NLETemplateModel, java.lang.Long>> r58) {
        /*
            Method dump skipped, instruction units count: 764
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0L7R.LJIILIIL(java.lang.String, boolean, boolean, android.content.Intent, android.content.Intent, java.util.List, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v117 */
    /* JADX WARN: Type inference failed for: r0v118, types: [com.bytedance.ies.nle.editor_jni.NLENode] */
    /* JADX WARN: Type inference failed for: r0v125 */
    /* JADX WARN: Type inference failed for: r0v126, types: [com.bytedance.ies.nle.editor_jni.NLENode] */
    /* JADX WARN: Type inference failed for: r0v219 */
    /* JADX WARN: Type inference failed for: r0v220 */
    /* JADX WARN: Type inference failed for: r0v221 */
    /* JADX WARN: Type inference failed for: r0v222 */
    /* JADX WARN: Type inference failed for: r0v60 */
    /* JADX WARN: Type inference failed for: r0v61, types: [com.bytedance.ies.nle.editor_jni.NLENode] */
    /* JADX WARN: Type inference failed for: r0v73 */
    /* JADX WARN: Type inference failed for: r0v74, types: [java.lang.String] */
    public final void LJJJJLL(Activity activity, Intent intent, NLETemplateModel nLETemplateModel, CreativeModel creativeModel, List<C531370Ksh> list, ShortVideoContext shortVideoContext, String str) {
        String platform;
        String str2;
        String str3;
        Object obj;
        String str4;
        String str5;
        MusicInfo musicInfo;
        NLETrack next;
        VecNLETrackSlotSPtr slots;
        NLETrackSlot nLETrackSlot;
        NLESegmentAudio nLESegmentAudioDynamicCast;
        MusicInfo musicInfo2;
        List<FusedMusic> fusedMusics;
        NLETrack next2;
        VecNLETrackSlotSPtr slots2;
        String strLJFF;
        FusedMusic next3;
        Double volume;
        String extra;
        NLEResourceNode resource;
        ?? resource2;
        boolean z;
        ?? r0;
        MusicInfo musicInfo3;
        Object next4;
        VecNLETrackSlotSPtr slots3;
        NLETrackSlot nLETrackSlot2;
        NLESegment mainSegment;
        NLEResourceNode resource3;
        String resourceFile;
        Object templateTypeInternal;
        String str6;
        Object c098200Yq;
        C532330KuF c532330KuFLJIIIIZZ;
        VecNLETrackSlotSPtr slots4;
        NLETrackSlot nLETrackSlot3;
        NLESegment mainSegment2;
        NLEResourceNode resource4;
        String resourceFile2;
        ?? resource5;
        ?? resource6;
        Object resourceType;
        List<FusedMusic> fusedMusics2;
        int iIntValue;
        NLEResourceNode resource7;
        String str7;
        if (nLETemplateModel == null) {
            return;
        }
        NLEModel nLEModelSaveToDraft = NLETemplateModel.saveToDraft(nLETemplateModel);
        TemplateInfo templateInfo = nLETemplateModel.getTemplateInfo();
        if (templateInfo != null) {
            platform = templateInfo.getPlatform();
        } else {
            platform = null;
        }
        if (Intrinsics.LJFF(platform, "iOS")) {
            nLEModelSaveToDraft.setTransientExtra("IS_FROM_IOS", "1");
        }
        C536310L1p c536310L1p = C536310L1p.LIZ;
        UgcTemplateData ugcTemplateData = creativeModel.ugcTemplateData;
        if (shortVideoContext != null) {
            str2 = shortVideoContext.shootWay;
        } else {
            str2 = null;
        }
        c536310L1p.getClass();
        boolean zLJFF = C536310L1p.LJFF(ugcTemplateData, str2);
        UgcTemplateData ugcTemplateData2 = creativeModel.ugcTemplateData;
        if (shortVideoContext != null) {
            str3 = shortVideoContext.shootWay;
        } else {
            str3 = null;
        }
        boolean zLJII = C536310L1p.LJII(ugcTemplateData2, str3);
        if (zLJFF) {
            MusicInfo musicInfo4 = creativeModel.ugcTemplateData.awemeMusicInfo;
            if (musicInfo4 != null) {
                fusedMusics2 = musicInfo4.getFusedMusics();
            } else {
                fusedMusics2 = null;
            }
            CreativeModel creativeModelLIZIZ = C0MUK.LIZIZ(intent);
            ArrayList arrayList = (ArrayList) C13LP.LJJJJLI(list);
            if (!arrayList.isEmpty() && fusedMusics2 != null && !fusedMusics2.isEmpty() && nLEModelSaveToDraft != null) {
                long measuredEndTime = nLEModelSaveToDraft.getMeasuredEndTime();
                long j = LSPassThroughRecordSizeConfig.DEFAULT;
                long j2 = measuredEndTime / j;
                NLETrack nLETrack = new NLETrack();
                nLETrack.setExtra("AudioTrackType", "BGM");
                List<NLETrack> listLIZ = C346920Dis.LIZ(nLEModelSaveToDraft);
                ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(listLIZ, 10));
                Iterator it2 = ((ArrayList) listLIZ).iterator();
                while (it2.hasNext()) {
                    arrayList2.add(Integer.valueOf(((NLETimeSpaceNode) it2.next()).getLayer()));
                }
                if (arrayList2.isEmpty()) {
                    iIntValue = 0;
                } else {
                    Iterator it3 = arrayList2.iterator();
                    if (it3.hasNext()) {
                        Integer numValueOf = Integer.valueOf(((Number) it3.next()).intValue());
                        while (it3.hasNext()) {
                            Integer numValueOf2 = Integer.valueOf(((Number) it3.next()).intValue());
                            if (numValueOf.compareTo(numValueOf2) < 0) {
                                numValueOf = numValueOf2;
                            }
                        }
                        iIntValue = numValueOf.intValue() + 1;
                    } else {
                        throw new NoSuchElementException();
                    }
                }
                nLETrack.setLayer(iIntValue);
                ArrayList arrayList3 = new ArrayList();
                boolean z2 = false;
                int i = 0;
                for (Object obj2 : arrayList) {
                    int i2 = i + 1;
                    if (i >= 0) {
                        C531370Ksh c531370Ksh = (C531370Ksh) obj2;
                        FusedMusic fusedMusic = (FusedMusic) C13LP.LJJJLZIJ(i, fusedMusics2);
                        if (fusedMusic != null) {
                            if (fusedMusic.getPlayStartTimeInMs() >= j2) {
                                if (i == 0) {
                                    C1452640nuA.LJ(creativeModelLIZIZ.musicBuzModel);
                                } else {
                                    C1452640nuA c1452640nuA = C1452640nuA.LIZ;
                                    AVMusic aVMusic = c531370Ksh.LIZJ;
                                    MusicBuzModel musicBuzModel = creativeModelLIZIZ.musicBuzModel;
                                    c1452640nuA.getClass();
                                    C1452640nuA.LJFF(musicBuzModel, aVMusic);
                                }
                                z2 = true;
                            } else {
                                NLETrackSlot nLETrackSlot4 = new NLETrackSlot();
                                NLESegmentAudio nLESegmentAudio = new NLESegmentAudio();
                                nLETrackSlot4.setStartTime(fusedMusic.getPlayStartTimeInMs() * 1000);
                                nLETrackSlot4.setEndTime(Math.min((fusedMusic.getPlayStartTimeInMs() + fusedMusic.getEndTimeInMs()) - fusedMusic.getStartTimeInMs(), j2) * 1000);
                                nLESegmentAudio.setTimeClipStart(fusedMusic.getStartTimeInMs() * 1000);
                                nLESegmentAudio.setTimeClipEnd(nLESegmentAudio.getTimeClipStart() + (nLETrackSlot4.getEndTime() - nLETrackSlot4.getStartTime()));
                                Double volume2 = fusedMusic.getVolume();
                                if (volume2 != null) {
                                    nLESegmentAudio.setVolume((float) volume2.doubleValue());
                                }
                                String str8 = c531370Ksh.LIZLLL;
                                if (str8 != null) {
                                    NLEResourceAV nLEResourceAV = new NLEResourceAV();
                                    nLEResourceAV.setResourceFile(str8);
                                    nLEResourceAV.setDuration((fusedMusic.getEndTimeInMs() - fusedMusic.getStartTimeInMs()) * 1000 * j);
                                    AVMusic aVMusic2 = c531370Ksh.LIZJ;
                                    if (aVMusic2 != null && (str7 = aVMusic2.musicName) != null) {
                                        nLEResourceAV.setResourceName(str7);
                                        nLETrackSlot4.setExtra("d_bgmName", str7);
                                    }
                                    nLESegmentAudio.setAVFile(nLEResourceAV);
                                }
                                nLETrackSlot4.setMainSegment(nLESegmentAudio);
                                NLESegmentAudio nLESegmentAudioDynamicCast2 = NLESegmentAudio.dynamicCast(nLETrackSlot4.getMainSegment());
                                if (nLESegmentAudioDynamicCast2 != null) {
                                    nLESegmentAudioDynamicCast2.setRepeatCount(NLEEditorJniJNI.NLESegmentAudio_REPEAT_NORMAL_get());
                                    NLEResourceAV aVFile = nLESegmentAudioDynamicCast2.getAVFile();
                                    if (aVFile != null) {
                                        aVFile.setResourceType(NLEResType.AUDIO);
                                    }
                                }
                                String musicId = fusedMusic.getMusicId();
                                nLETrackSlot4.setExtra("d_bgmId", musicId);
                                nLETrackSlot4.setExtra("music_id", musicId);
                                NLESegment mainSegment3 = nLETrackSlot4.getMainSegment();
                                if (mainSegment3 != null && (resource7 = mainSegment3.getResource()) != null) {
                                    resource7.setExtra("biz_res_id", C0FGD.LIZIZ(fusedMusic.getMusicId()));
                                }
                                nLETrack.addSlot(nLETrackSlot4);
                                arrayList3.add(nLETrackSlot4);
                            }
                        }
                        i = i2;
                    } else {
                        C1697810uHb.LJIJI();
                        throw null;
                    }
                }
                obj = null;
                if (nLETrack.getSlots() != null && nLETrack.getSlots().size() > 1) {
                    nLETrack.setExtra("is_ep_multi_music", "true");
                }
                ArrayList arrayList4 = new ArrayList();
                VecNLETrackSPtr tracks = nLEModelSaveToDraft.getTracks();
                ArrayList arrayList5 = new ArrayList();
                for (NLETrack nLETrack2 : tracks) {
                    NLETrack nLETrack3 = nLETrack2;
                    if (Intrinsics.LJFF(nLETrack3.getExtra("biz_extra_type"), "bgm") || C351220Dpo.LLILLL(nLETrack3)) {
                        arrayList5.add(nLETrack2);
                    }
                }
                arrayList4.addAll(arrayList5);
                Iterator it4 = arrayList4.iterator();
                while (it4.hasNext()) {
                    nLEModelSaveToDraft.removeTrack((NLETrack) it4.next());
                }
                nLEModelSaveToDraft.addTrack(nLETrack);
                if (z2 && creativeModelLIZIZ != null) {
                    C0MUK.LJIIIZ(intent, creativeModelLIZIZ);
                }
            } else {
                obj = null;
            }
        } else {
            zLJFF = false;
            obj = null;
            UgcTemplateData ugcTemplateData3 = creativeModel.ugcTemplateData;
            if (shortVideoContext != null) {
                str4 = shortVideoContext.shootWay;
            } else {
                str4 = null;
            }
            if (C536310L1p.LJI(ugcTemplateData3, str4) && (musicInfo2 = creativeModel.ugcTemplateData.awemeMusicInfo) != null && (fusedMusics = musicInfo2.getFusedMusics()) != null && !fusedMusics.isEmpty() && nLEModelSaveToDraft != null) {
                Iterator<NLETrack> it5 = nLEModelSaveToDraft.getTracks().iterator();
                while (true) {
                    if (it5.hasNext()) {
                        next2 = it5.next();
                        NLETrack nLETrack4 = next2;
                        if (Intrinsics.LJFF(nLETrack4.getExtra("biz_extra_type"), "bgm") || C351220Dpo.LLILLL(nLETrack4)) {
                            break;
                        }
                    } else {
                        next2 = null;
                        break;
                    }
                }
                NLETrack nLETrack5 = next2;
                if (nLETrack5 != null && (slots2 = nLETrack5.getSlots()) != null) {
                    for (NLETrackSlot nLETrackSlot5 : slots2) {
                        IAnchorBusinessOutBridgeService iAnchorBusinessOutBridgeService = (IAnchorBusinessOutBridgeService) PluggableExtentionKt.pluggableSpi$default(IAnchorBusinessOutBridgeService.class, false, false, false, 14, null);
                        if (iAnchorBusinessOutBridgeService != null) {
                            NLESegment mainSegment4 = nLETrackSlot5.getMainSegment();
                            if (mainSegment4 != null && (resource = mainSegment4.getResource()) != null) {
                                extra = resource.getExtra("biz_res_id");
                            } else {
                                extra = null;
                            }
                            strLJFF = iAnchorBusinessOutBridgeService.LJFF(extra);
                        } else {
                            strLJFF = null;
                        }
                        Iterator<FusedMusic> it6 = fusedMusics.iterator();
                        while (true) {
                            if (it6.hasNext()) {
                                next3 = it6.next();
                                if (Intrinsics.LJFF(next3.getMusicId(), strLJFF)) {
                                    break;
                                }
                            } else {
                                next3 = null;
                                break;
                            }
                        }
                        FusedMusic fusedMusic2 = next3;
                        if (fusedMusic2 != null && (volume = fusedMusic2.getVolume()) != null) {
                            double dDoubleValue = volume.doubleValue();
                            NLESegmentAudio nLESegmentAudioDynamicCast3 = NLESegmentAudio.dynamicCast(nLETrackSlot5.getMainSegment());
                            if (nLESegmentAudioDynamicCast3 != null) {
                                nLESegmentAudioDynamicCast3.setVolume((float) dDoubleValue);
                            }
                        }
                    }
                }
            }
            C536310L1p c536310L1p2 = C536310L1p.LIZ;
            UgcTemplateData ugcTemplateData4 = creativeModel.ugcTemplateData;
            if (shortVideoContext != null) {
                str5 = shortVideoContext.shootWay;
            } else {
                str5 = null;
            }
            c536310L1p2.getClass();
            if (C536310L1p.LJIIIIZZ(ugcTemplateData4, str5) && (musicInfo = creativeModel.ugcTemplateData.awemeMusicInfo) != null && nLEModelSaveToDraft != null) {
                Iterator<NLETrack> it7 = nLEModelSaveToDraft.getTracks().iterator();
                while (true) {
                    if (it7.hasNext()) {
                        next = it7.next();
                        NLETrack nLETrack6 = next;
                        if (Intrinsics.LJFF(nLETrack6.getExtra("biz_extra_type"), "bgm") || C351220Dpo.LLILLL(nLETrack6)) {
                            break;
                        }
                    } else {
                        next = null;
                        break;
                    }
                }
                NLETrack nLETrack7 = next;
                if (nLETrack7 != null && (slots = nLETrack7.getSlots()) != null && (nLETrackSlot = (NLETrackSlot) C13LP.LJJJLL(slots)) != null && (nLESegmentAudioDynamicCast = NLESegmentAudio.dynamicCast(nLETrackSlot.getMainSegment())) != null) {
                    nLESegmentAudioDynamicCast.setVolume(musicInfo.getMusicVolume());
                }
            }
        }
        ITemplateApplyService iTemplateApplyService = (ITemplateApplyService) ServiceManager.get().getService(ITemplateApplyService.class);
        C0LE8.LIZ.getClass();
        VideoPublishEditModel videoPublishEditModelLIZJ = iTemplateApplyService.LIZJ(activity, nLEModelSaveToDraft, false, C0LE8.LJFF, creativeModel);
        if (C294050Bfn.LIZ()) {
            VecNLETrackSPtr tracks2 = nLEModelSaveToDraft.getTracks();
            ArrayList arrayList6 = new ArrayList();
            for (NLETrack nLETrack8 : tracks2) {
                if (nLETrack8.getTrackType() == NLETrackType.VIDEO) {
                    arrayList6.add(nLETrack8);
                }
            }
            ArrayList arrayList7 = new ArrayList();
            Iterator it8 = arrayList6.iterator();
            while (it8.hasNext()) {
                C19719612Di.LJJI(((NLETrack) it8.next()).getSlots(), arrayList7);
            }
            ArrayList arrayList8 = new ArrayList();
            for (Object obj3 : arrayList7) {
                NLESegment mainSegment5 = ((NLETrackSlot) obj3).getMainSegment();
                if (mainSegment5 != null) {
                    resource6 = mainSegment5.getResource();
                } else {
                    resource6 = obj;
                }
                NLEResourceAV nLEResourceAVDynamicCast = NLEResourceAV.dynamicCast((NLENode) resource6);
                if (nLEResourceAVDynamicCast != null) {
                    resourceType = nLEResourceAVDynamicCast.getResourceType();
                } else {
                    resourceType = obj;
                }
                if (resourceType == NLEResType.VIDEO) {
                    arrayList8.add(obj3);
                }
            }
            if (!arrayList8.isEmpty()) {
                Iterator it9 = arrayList8.iterator();
                while (it9.hasNext()) {
                    NLESegment mainSegment6 = ((NLETrackSlot) it9.next()).getMainSegment();
                    if (mainSegment6 != null) {
                        resource5 = mainSegment6.getResource();
                    } else {
                        resource5 = obj;
                    }
                    NLEResourceAV nLEResourceAVDynamicCast2 = NLEResourceAV.dynamicCast((NLENode) resource5);
                    if (nLEResourceAVDynamicCast2 != null && nLEResourceAVDynamicCast2.getHasAudio()) {
                        z = true;
                        break;
                    }
                }
            }
            z = false;
        } else {
            VecNLETrackSPtr tracks3 = nLEModelSaveToDraft.getTracks();
            ArrayList arrayList9 = new ArrayList();
            for (NLETrack nLETrack9 : tracks3) {
                if (nLETrack9.getTrackType() == NLETrackType.VIDEO) {
                    arrayList9.add(nLETrack9);
                }
            }
            ArrayList arrayList10 = new ArrayList();
            Iterator it10 = arrayList9.iterator();
            while (it10.hasNext()) {
                C19719612Di.LJJI(((NLETrack) it10.next()).getSlots(), arrayList10);
            }
            if (!arrayList10.isEmpty()) {
                Iterator it11 = arrayList10.iterator();
                while (it11.hasNext()) {
                    NLESegment mainSegment7 = ((NLETrackSlot) it11.next()).getMainSegment();
                    if (mainSegment7 != null) {
                        resource2 = mainSegment7.getResource();
                    } else {
                        resource2 = obj;
                    }
                    NLEResourceAV nLEResourceAVDynamicCast3 = NLEResourceAV.dynamicCast((NLENode) resource2);
                    if (nLEResourceAVDynamicCast3 != null && nLEResourceAVDynamicCast3.getHasAudio()) {
                        z = true;
                        break;
                    }
                }
            }
            z = false;
        }
        C0MUK.LIZIZ(intent).importModel.isFastImport = z;
        if (zLJFF) {
            NLETrack nLETrackLIZIZ = C0EYQ.LIZIZ(nLEModelSaveToDraft);
            if (nLETrackLIZIZ != null && (slots4 = nLETrackLIZIZ.getSlots()) != null && (nLETrackSlot3 = (NLETrackSlot) C13LP.LJJJLZIJ(0, slots4)) != null && (mainSegment2 = nLETrackSlot3.getMainSegment()) != null && (resource4 = mainSegment2.getResource()) != null && (resourceFile2 = resource4.getResourceFile()) != null) {
                intent.putExtra("path", resourceFile2);
            }
        } else {
            if (!zLJII) {
                Iterator<NLETrack> it12 = nLEModelSaveToDraft.getTracks().iterator();
                while (true) {
                    if (it12.hasNext()) {
                        next4 = it12.next();
                        if (Intrinsics.LJFF(((NLENode) next4).getExtra("biz_extra_type"), "bgm")) {
                            break;
                        }
                    } else {
                        next4 = obj;
                        break;
                    }
                }
                NLETrack nLETrack10 = (NLETrack) next4;
                if (nLETrack10 != null && (slots3 = nLETrack10.getSlots()) != null && (nLETrackSlot2 = (NLETrackSlot) C13LP.LJJJLZIJ(0, slots3)) != null && (mainSegment = nLETrackSlot2.getMainSegment()) != null && (resource3 = mainSegment.getResource()) != null && (resourceFile = resource3.getResourceFile()) != null) {
                    intent.putExtra("path", resourceFile);
                }
            }
            C536310L1p c536310L1p3 = C536310L1p.LIZ;
            UgcTemplateData ugcTemplateData5 = creativeModel.ugcTemplateData;
            if (shortVideoContext != null) {
                r0 = shortVideoContext.shootWay;
            } else {
                r0 = obj;
            }
            c536310L1p3.getClass();
            if (C536310L1p.LJIIIIZZ(ugcTemplateData5, r0) && (musicInfo3 = creativeModel.ugcTemplateData.awemeMusicInfo) != null) {
                videoPublishEditModelLIZJ.setMusicVolume(musicInfo3.getMusicVolume());
            }
        }
        C580260MpM.LIZ(intent, videoPublishEditModelLIZJ);
        TemplateData templateData = C0MUK.LIZIZ(intent).templateData;
        if (templateData != null) {
            templateTypeInternal = templateData.getTemplateTypeInternal();
        } else {
            templateTypeInternal = obj;
        }
        if (Intrinsics.LJFF(templateTypeInternal, "sgt") && C0FQJ.LIZ()) {
            CreativeModel creativeModelLIZIZ2 = C0MUK.LIZIZ(intent);
            TemplateData templateData2 = creativeModelLIZIZ2.templateData;
            if (templateData2 != null) {
                templateData2.setTtTemplateType("sgt");
            }
            String str9 = creativeModelLIZIZ2.pugcTemplateData.templateTitle;
            ITemplateResourceService iTemplateResourceService = (ITemplateResourceService) PluggableExtentionKt.pluggableSpi$default(ITemplateResourceService.class, false, false, false, 14, null);
            String str10 = "";
            if (iTemplateResourceService == null || (c532330KuFLJIIIIZZ = iTemplateResourceService.LJIIIIZZ(this.LJIJI)) == null || (str6 = c532330KuFLJIIIIZZ.LIZLLL) == null) {
                str6 = "";
            }
            AutoCutModel autoCutModel = creativeModelLIZIZ2.autoCutModel;
            autoCutModel.clickFrom = "anchor";
            autoCutModel.clickFromMostRecent = "anchor";
            AutoCutAnchorModel autoCutAnchorModel = creativeModelLIZIZ2.autoCutAnchorModel;
            try {
                new p();
                String str11 = autoCutAnchorModel.extra;
                if (str11 == null) {
                    str11 = "";
                }
                k kVarLJJIIZ = p.LIZJ(str11).LJIILIIL().LJJIIZ("template_tier_type");
                if (kVarLJJIIZ != null) {
                    c098200Yq = kVarLJJIIZ.LJIL();
                } else {
                    c098200Yq = obj;
                }
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            if (!C189200o6.m7isFailureimpl(c098200Yq)) {
                obj = c098200Yq;
            }
            AutoCutModel autoCutModel2 = creativeModelLIZIZ2.autoCutModel;
            C0MJ9 c0mj9 = C0MJ9.AUTO_CUT;
            EnumC1412640mre enumC1412640mre = EnumC1412640mre.SGT;
            C1416110mxF.LJIIIZ(autoCutModel2, 0, c0mj9, enumC1412640mre.getValue(), this.LJIJI, null, null, C0L9M.FIRST_GENERATE_AUTOCUT.getValue(), (String) obj);
            List<AutoCutThemeData> list2 = creativeModelLIZIZ2.autoCutModel.templateList;
            int iOrdinal = c0mj9.ordinal();
            String str12 = this.LJIJI;
            int value = enumC1412640mre.getValue();
            String str13 = this.LJJIJ;
            if (str13 != null) {
                str10 = str13;
            }
            list2.add(new AutoCutThemeData(iOrdinal, 0, str12, value, null, str10, nLEModelSaveToDraft.toString(), str, str6, str9, null, true, null, null, null, null, null, null, null, null, -1, null, Boolean.FALSE, null, null, null, UUID.randomUUID().toString(), null, C0MJA.NONE, null, null, null, EnumC543490LTf.COMPLETED, null, false, null, 0, false, 0, null, null, null));
            C0MUK.LJIIIZ(intent, creativeModelLIZIZ2);
        }
    }

    public static void LJJIJIIJI(C0L7R c0l7r, Intent intent, String str, int i, String str2, int i2, String str3, int i3) {
        String creationId;
        String str4 = str;
        String str5 = str3;
        int i4 = i2;
        String str6 = str2;
        int i5 = i;
        int i6 = 0;
        if ((i3 & 4) != 0) {
            i5 = 0;
        }
        if ((i3 & 8) != 0) {
            str6 = "";
        }
        if ((i3 & 16) != 0) {
            i4 = 0;
        }
        if ((i3 & 32) != 0) {
            str5 = "";
        }
        if (!c0l7r.LJIJ) {
            long jCurrentTimeMillis = System.currentTimeMillis() - c0l7r.LJIILIIL;
            C0LAB c0lab = new C0LAB();
            c0lab.LJ("shoot_way", str4);
            c0lab.LJ("template_id", c0l7r.LJIJI);
            c0lab.LIZIZ(jCurrentTimeMillis, "duration");
            c0lab.LIZ(i5, "error_code");
            c0lab.LJ("error_msg", str6);
            c0lab.LJ("server_log_id", str5);
            c0lab.LIZ(i4, "final_status");
            if (!c0l7r.LJJIFFI.isEmpty()) {
                c0l7r.LJJIFFI.size();
                Iterator<String> it2 = c0l7r.LJJIFFI.iterator();
                while (it2.hasNext()) {
                    it2.next();
                    int i7 = i6 + 1;
                    if (i6 >= 0) {
                        i6 = i7;
                    } else {
                        C1697810uHb.LJIJI();
                        throw null;
                    }
                }
                c0lab.LJ("template_feature", c0l7r.LJJIFFI.toString());
            }
            C20684815ws.LJIILLIIL("ugc_template_next_concat", c0lab.LIZ);
            if (i5 != -1) {
                if (intent == null || (creationId = C537520L6g.LIZ(intent).getCreationId()) == null) {
                    creationId = "";
                }
                HashMap map = new HashMap();
                if (str4 == null) {
                    str4 = "";
                }
                map.put("shoot_way", str4);
                map.put("creation_id", creationId);
                c0l7r.LJJIJIL(Long.valueOf(jCurrentTimeMillis), Integer.valueOf(i5), str6, intent, map);
            }
            c0l7r.LJIJ = true;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v1, types: [int] */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v1, types: [int] */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r6v0, types: [X.0LAB] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [int] */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1, types: [int] */
    /* JADX WARN: Type inference failed for: r9v2 */
    public static void LJJIL(C0L7R c0l7r, int i, String str, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, int i2, int i3) {
        int i4;
        String str2;
        ?? r11 = z2;
        ?? r10 = z3;
        ?? r9 = z4;
        ?? r8 = z5;
        if ((i3 & 2) != 0) {
            str = null;
        }
        if ((i3 & 8) != 0) {
            r11 = 0;
        }
        if ((i3 & 16) != 0) {
            r10 = 0;
        }
        if ((i3 & 32) != 0) {
            r9 = 0;
        }
        if ((i3 & 64) != 0) {
            r8 = 0;
        }
        c0l7r.getClass();
        ?? c0lab = new C0LAB();
        c0lab.LIZ(i, FollowStatusChangeMethod.PARAM_FOLLOW_STATUS);
        c0lab.LIZIZ(System.currentTimeMillis() - c0l7r.LJIILIIL, "time_elapsed");
        long j = 0;
        if (c0l7r.LJIILJJIL > 0) {
            c0lab.LIZIZ(System.currentTimeMillis() - c0l7r.LJIILJJIL, "interval_click_next");
        }
        List<? extends VideoSegment> list = c0l7r.LJIIIZ;
        if (list != null) {
            ArrayList arrayList = (ArrayList) list;
            if (arrayList.isEmpty()) {
                i4 = 0;
            } else {
                Iterator it2 = arrayList.iterator();
                i4 = 0;
                while (it2.hasNext()) {
                    if (((VideoSegment) it2.next()).isImageType && (i4 = i4 + 1) < 0) {
                        C1697810uHb.LJIJ();
                        throw null;
                    }
                }
            }
            int size = arrayList.size() - i4;
            c0lab.LIZ(i4, "pic_cnt");
            c0lab.LIZ(size, "video_cnt");
            int i5 = i4 + size;
            boolean z6 = true;
            if (i5 <= 1) {
                z6 = false;
            }
            c0lab.LJFF("is_multi_content", z6);
            if (z) {
                str2 = "1";
            } else {
                str2 = CardStruct.IStatusCode.DEFAULT;
            }
            c0lab.LJ("is_from_editor_pro", str2);
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                j += ((VideoSegment) it3.next()).duration;
            }
            c0lab.LIZIZ(j, "total_import_duration");
            c0lab.LIZ(r11, "is_use_sound_sync");
            c0lab.LIZ(r9, "is_ugc_template_from_anchor");
            c0lab.LIZ(r10, "is_music_pre_download_success");
            c0lab.LIZ(r8, "is_from_layout");
            c0lab.LIZ(i2, "stage");
            c0lab.LJ("creation_id", c0l7r.LJJIIZ);
            if (str == null) {
                str = "";
            }
            c0lab.LJ("shoot_way", str);
            c0lab.LIZ(0, "is_photo_template_from_anchor");
        }
        C20684815ws.LJIILLIIL("tools_performance_pre_cut_opt_process", c0lab.LIZ);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00a1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0166  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object LJJJI(final X.C0L7R r12, com.ss.android.ugc.aweme.creative.model.CreativeInfo r13, java.util.List<? extends com.ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment> r14, boolean r15, boolean r16, boolean r17, boolean r18, boolean r19, boolean r20, X.InterfaceC1364105Vn<? super kotlin.Pair<java.lang.Boolean, java.lang.Long>> r21) {
        /*
            Method dump skipped, instruction units count: 396
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0L7R.LJJJI(X.0L7R, com.ss.android.ugc.aweme.creative.model.CreativeInfo, java.util.List, boolean, boolean, boolean, boolean, boolean, boolean, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00a3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJI(com.bytedance.ies.nle.editor_jni.NLETemplateModel r19, com.ss.android.ugc.aweme.creative.model.CreativeInfo r20, java.lang.String r21, java.lang.Integer r22, java.lang.String r23, java.lang.String r24, java.util.List<java.lang.String> r25, com.ss.android.ugc.aweme.creative.model.CreativeModel r26, java.lang.String r27, X.InterfaceC1364105Vn<? super X.C358620E4e> r28) {
        /*
            r18 = this;
            r3 = r28
            boolean r0 = r3 instanceof X.C0L7V
            r7 = r18
            if (r0 == 0) goto La3
            r6 = r3
            X.0L7V r6 = (X.C0L7V) r6
            int r2 = r6.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto La3
            int r2 = r2 - r1
            r6.LLILZ = r2
        L16:
            java.lang.Object r2 = r6.LLILLJJLI
            java.lang.Object r5 = X.C099R.LJFF()
            int r0 = r6.LLILZ
            r4 = 1
            if (r0 == 0) goto L41
            if (r0 != r4) goto Laa
            X.0FQS r3 = r6.LL
            X.C155000ia.LIZIZ(r2)
        L28:
            X.0E4e r2 = (X.C358620E4e) r2
            X.0ExA r0 = r3.LJIJI
            boolean r1 = r0.LIZIZ
            r2.LIZJ = r1
            boolean r0 = r2.LIZ
            if (r0 != 0) goto L40
            if (r1 != 0) goto L40
            kotlin.jvm.internal.AwS549S0100000_5 r1 = new kotlin.jvm.internal.AwS549S0100000_5
            r0 = 100
            r1.<init>(r7, r0)
            X.C383980F3s.LIZIZ(r1)
        L40:
            return r2
        L41:
            X.C155000ia.LIZIZ(r2)
            X.0Dzr r10 = new X.0Dzr
            r17 = 0
            r16 = r26
            r15 = r24
            r14 = r23
            r13 = r22
            r12 = r21
            r11 = r20
            r10.<init>(r11, r12, r13, r14, r15, r16, r17)
            r7.LJIL = r10
            X.00cf r8 = new X.00cf
            r8.<init>()
            X.0FQS r3 = new X.0FQS
            r3.<init>()
            X.0F1S r9 = new X.0F1S
            java.lang.String r2 = r11.getCreationId()
            int r1 = r11.getVersion()
            java.lang.String r0 = r11.getSessionId()
            r9.<init>(r2, r1, r0)
            r3.LIZIZ = r9
            r3.LJ = r12
            r3.LJII = r13
            r3.LJIIL = r15
            r3.LJI = r14
            r0 = r19
            r3.LJIIJ = r0
            r1 = r25
            r3.LJIIIZ = r1
            r0 = r27
            r3.LIZJ = r0
            r7.LJJ = r3
            java.lang.String r0 = "UGC_ASYNC_I2V"
            boolean r2 = r1.contains(r0)
            kotlin.jvm.internal.AwS59S0210000_5 r1 = new kotlin.jvm.internal.AwS59S0210000_5
            r0 = 2
            r1.<init>(r2, r8, r7, r0)
            r6.LL = r3
            r6.LLILZ = r4
            java.lang.Object r2 = r10.LJJIIZ(r3, r1, r6)
            if (r2 != r5) goto L28
            return r5
        La3:
            X.0L7V r6 = new X.0L7V
            r6.<init>(r7, r3)
            goto L16
        Laa:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0L7R.LJI(com.bytedance.ies.nle.editor_jni.NLETemplateModel, com.ss.android.ugc.aweme.creative.model.CreativeInfo, java.lang.String, java.lang.Integer, java.lang.String, java.lang.String, java.util.List, com.ss.android.ugc.aweme.creative.model.CreativeModel, java.lang.String, X.05Vn):java.lang.Object");
    }

    public static Object LJJJ(C0L7R c0l7r, CreativeInfo creativeInfo, List list, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, InterfaceC1364105Vn interfaceC1364105Vn, int i) {
        if ((i & 8) != 0) {
            z2 = false;
        }
        if ((i & 16) != 0) {
            z3 = false;
        }
        if ((i & 32) != 0) {
            z4 = false;
        }
        if ((i & 64) != 0) {
            z5 = false;
        }
        if ((i & 128) != 0) {
            z6 = false;
        }
        c0l7r.getClass();
        return LJJJI(c0l7r, creativeInfo, list, z, z2, z3, z4, z5, z6, interfaceC1364105Vn);
    }

    public Object LJJJJL(Intent intent, List<? extends VideoSegment> list, List<? extends AVMusic> list2, ArrayList<ImportVideoInfo> arrayList, Cut2EditTransferModel cut2EditTransferModel, boolean z, List<? extends MediaModel> list3, boolean z2, boolean z3, int i, InterfaceC1631620sYq<? super Intent, ? super Boolean, ? super InterfaceC1364105Vn<? super Boolean>, ? extends Object> interfaceC1631620sYq, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        Workspace workspaceLIZ;
        boolean z4;
        MultiEditVideoStatusRecordData multiEditVideoStatusRecordData;
        boolean z5;
        boolean z6;
        String templateTypeInternal;
        boolean z7;
        boolean z8;
        AVMusic aVMusic;
        Bundle extras;
        Bundle extras2;
        Scene scene;
        C19A3 c19a3;
        Lifecycle.State currentState;
        InterfaceC1452360nti interfaceC1452360nti;
        boolean z9;
        boolean z10;
        C1DRG c1drg;
        Lifecycle lifecycle;
        C198H c198hLC;
        String str;
        boolean z11;
        C537760L7e c537760L7e;
        C538370L9n c538370L9nLIZ;
        VESize vESizeCalcTargetRes;
        int i2;
        int iCeil;
        NLETrack next;
        long micros;
        float f;
        VecNLETrackSlotSPtr slots;
        NLETimeSpaceNode nLETimeSpaceNode;
        String strLJFF;
        NLESegmentVideo nLESegmentVideoDynamicCast;
        NLEResType resourceType;
        long jLIZLLL;
        NLETrack next2;
        VecNLETrackSlotSPtr slots2;
        NLETimeSpaceNode nLETimeSpaceNode2;
        NLESegmentVideo nLESegmentVideoDynamicCast2;
        NLEResType resourceType2;
        long jLIZLLL2;
        C0L9K c0l9k;
        int i3;
        int length;
        Activity activity = this.LJIIJ.get();
        if (activity == null) {
            return false;
        }
        if (C1621890sJ9.LIZ() && C0MUK.LIZIZ(intent).aigcOfflineModel.isOfflineAIGCEffectGenerated) {
            Parcelable parcelableExtra = intent.getParcelableExtra("workspace");
            if (!(parcelableExtra instanceof Workspace)) {
                parcelableExtra = null;
            }
            if (parcelableExtra == null || (workspaceLIZ = (Workspace) intent.getParcelableExtra("workspace")) == null) {
                workspaceLIZ = C14D2.LIZ(C537520L6g.LIZ(intent));
            }
        } else {
            workspaceLIZ = C14D2.LIZ(C537520L6g.LIZ(intent));
        }
        C569220MUe c569220MUe = new C569220MUe();
        c569220MUe.LJIIIIZZ = workspaceLIZ;
        C569350MUr.LIZ.getClass();
        C569350MUr.LIZIZ(c569220MUe, intent);
        if (list.size() > 1) {
            z4 = true;
        } else {
            z4 = false;
        }
        Bundle extras3 = null;
        C569360MUs c569360MUs = new C569360MUs(list, 0L, z4, false, null);
        C571550MbJ.LIZ.getClass();
        EditPreviewInfo editPreviewInfoLIZ = C571550MbJ.LIZ(true, workspaceLIZ, list, new long[]{-1, -1});
        editPreviewInfoLIZ.setPreviewVideoLength(i);
        oh.LIZ.getClass();
        oh.LIZIZ = i;
        MultiEditVideoRecordData multiEditVideoRecordDataLIZIZ = C574800MgY.LIZIZ(editPreviewInfoLIZ.getVideoList());
        if (multiEditVideoRecordDataLIZIZ == null) {
            multiEditVideoStatusRecordData = null;
        } else {
            multiEditVideoStatusRecordData = new MultiEditVideoStatusRecordData();
            Iterator<? extends VideoSegment> it2 = list.iterator();
            long j = 0;
            while (it2.hasNext()) {
                j += it2.next().duration;
            }
            multiEditVideoRecordDataLIZIZ.endTime = Math.min(j, C536240L1i.LIZ());
            if (multiEditVideoStatusRecordData.curMultiEditVideoRecordData == null) {
                if (multiEditVideoRecordDataLIZIZ.segmentDataList.size() == 1) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                multiEditVideoRecordDataLIZIZ.isSingleVideo = z5;
                multiEditVideoStatusRecordData.originMultiEditRecordData = multiEditVideoRecordDataLIZIZ.cloneData();
            }
            multiEditVideoStatusRecordData.curMultiEditVideoRecordData = multiEditVideoRecordDataLIZIZ;
        }
        if (multiEditVideoStatusRecordData == null) {
            return false;
        }
        if (intent.getIntExtra("template_type", -1) == EnumC1412640mre.PUGC_TEMPLATE.getValue()) {
            z6 = true;
        } else {
            z6 = false;
        }
        C569350MUr c569350MUr = C569350MUr.LIZ;
        Intent intent2 = new Intent(intent);
        long j2 = this.LJIILIIL;
        c569350MUr.getClass();
        Intent intentLIZJ = C569350MUr.LIZJ(intent2, c569220MUe, c569360MUs, j2, true);
        intentLIZJ.putExtra("workspace", workspaceLIZ);
        CreativeModel creativeModelLIZIZ = C0MUK.LIZIZ(intentLIZJ);
        TemplateData templateData = creativeModelLIZIZ.templateData;
        if (templateData != null) {
            templateTypeInternal = templateData.getTemplateTypeInternal();
        } else {
            templateTypeInternal = null;
        }
        if (Intrinsics.LJFF(templateTypeInternal, "sgt") && C0FQJ.LIZ()) {
            TemplateComplexity templateComplexity = creativeModelLIZIZ.ugcTemplateData.templateComplexity;
            UgcTemplateData ugcTemplateData = new UgcTemplateData(false, false, null, null, null, null, null, null, null, false, false, "", false, false, null, null, null, null, null, null);
            creativeModelLIZIZ.ugcTemplateData = ugcTemplateData;
            ugcTemplateData.templateComplexity = templateComplexity;
        }
        if (!creativeModelLIZIZ.ugcTemplateData.isUgcTemplateFromAnchor && !z6) {
            creativeModelLIZIZ.importModel.isFastImport = true;
        }
        EditModel editModel = creativeModelLIZIZ.editModel;
        editModel.editPreviewInfo = editPreviewInfoLIZ;
        editModel.multiEditVideoStatusRecordData = multiEditVideoStatusRecordData;
        QuickGridModel quickGridModel = creativeModelLIZIZ.quickGridModel;
        if (quickGridModel != null && quickGridModel.isFromQuickGrid) {
            z7 = true;
        } else {
            z7 = false;
        }
        int i4 = 4;
        if (z7) {
            intentLIZJ.putExtra("extra_request_code", 12358);
            C357970E1r.LIZ.getClass();
            QuickGridModel quickGridModel2 = creativeModelLIZIZ.quickGridModel;
            if (quickGridModel2 != null) {
                str = quickGridModel2.gridTypeExtra;
            } else {
                str = null;
            }
            if (str != null && (!a0.LJJJIL(str))) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                JSONObject jSONObject = new JSONObject(new JSONObject(str).optString("grid_desc"));
                JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("layout");
                if (jSONArrayOptJSONArray != null) {
                    length = jSONArrayOptJSONArray.length();
                } else {
                    length = 0;
                }
                int[][] iArr = new int[length][];
                for (int i5 = 0; i5 < length; i5++) {
                    int[] iArr2 = new int[4];
                    for (int i6 = 0; i6 < 4; i6++) {
                        iArr2[i6] = 0;
                    }
                    iArr[i5] = iArr2;
                }
                if (jSONArrayOptJSONArray != null && length > 0) {
                    int i7 = 0;
                    while (i7 < length) {
                        JSONArray jSONArray = JSONArrayProtectorUtils.getJSONArray(jSONArrayOptJSONArray, i7);
                        int[] iArr3 = new int[i4];
                        if (jSONArray != null && jSONArray.length() > 0) {
                            int length2 = jSONArray.length();
                            for (int i8 = 0; i8 < length2; i8++) {
                                iArr3[i8] = jSONArray.optInt(i8);
                            }
                        }
                        iArr[i7] = iArr3;
                        i7++;
                        i4 = 4;
                    }
                }
                c537760L7e = new C537760L7e("", jSONObject.optInt("R"), jSONObject.optInt("C"), length, iArr);
            } else {
                c537760L7e = null;
            }
            if (c537760L7e != null && (c538370L9nLIZ = C538390L9p.LIZ(c537760L7e)) != null) {
                EditPreviewInfo editPreviewInfo = creativeModelLIZIZ.editModel.editPreviewInfo;
                if (editPreviewInfo != null) {
                    vESizeCalcTargetRes = VEUtils.calcTargetRes(editPreviewInfo.getTotalVideoWidth(), editPreviewInfo.getTotalVideoHeight(), C571630MbR.LIZ(editPreviewInfo), editPreviewInfo.getPreviewWidth());
                } else {
                    vESizeCalcTargetRes = null;
                }
                if (vESizeCalcTargetRes != null) {
                    i2 = vESizeCalcTargetRes.width;
                } else {
                    i2 = 1080;
                }
                if (vESizeCalcTargetRes != null) {
                    iCeil = vESizeCalcTargetRes.height;
                } else {
                    iCeil = 1920;
                }
                boolean zLIZ = C537820L7k.LIZ(i2, iCeil);
                if (!zLIZ) {
                    int[] importVideoSize = AVSettingsWrapper.getImportVideoSize();
                    if (importVideoSize != null) {
                        i3 = importVideoSize[0];
                    } else {
                        i3 = 720;
                    }
                    C357970E1r c357970E1r = C357970E1r.LIZ;
                    if (i2 > i3) {
                        i2 = i3;
                    }
                    c357970E1r.getClass();
                    if (((Boolean) C287060BMy.LIZ.getValue()).booleanValue()) {
                        i2 = ((i2 + 4) - 1) & (-4);
                    } else {
                        i2 = ((i2 + 16) - 1) & (-16);
                    }
                }
                if (!zLIZ) {
                    iCeil = (int) (((double) 16) * Math.ceil(((double) i2) / 9.0d));
                }
                Rect rect = new Rect(0, 0, i2, iCeil);
                NLEEditor nLEEditorLIZ = C346630DiP.LIZ();
                nLEEditorLIZ.setModel(new NLEModel());
                C538360L9m c538360L9m = new C538360L9m(nLEEditorLIZ.getModel());
                c538360L9m.LIZJ(i2, iCeil, c538370L9nLIZ);
                int i9 = 0;
                for (MediaModel mediaModel : list3) {
                    int i10 = i9 + 1;
                    if (i9 >= 0) {
                        MediaModel mediaModel2 = mediaModel;
                        String strLJFF2 = mediaModel2.LJFF();
                        C538350L9l c538350L9l = (C538350L9l) C13LP.LJJJLZIJ(i9, c538360L9m.LIZIZ);
                        if (c538350L9l != null) {
                            float f2 = c538350L9l.LIZ;
                            float f3 = c538350L9l.LIZIZ;
                            Rect rect2 = new Rect((int) f2, (int) f3, (int) (f2 + c538350L9l.LIZJ), (int) (f3 + c538350L9l.LIZLLL));
                            if (mediaModel2.LJIILJJIL()) {
                                c0l9k = C0L9K.VIDEO;
                            } else {
                                c0l9k = C0L9K.IMAGE;
                            }
                            LayoutNLETrackStub layoutNLETrackStubLIZ = C538360L9m.LIZ(c538360L9m, strLJFF2, c0l9k, null, 8);
                            if (layoutNLETrackStubLIZ != null) {
                                layoutNLETrackStubLIZ.LIZLLL(rect2);
                                layoutNLETrackStubLIZ.LIZJ(rect);
                                if (!layoutNLETrackStubLIZ.LLJJIJI) {
                                    layoutNLETrackStubLIZ.LLJJIJI = true;
                                    layoutNLETrackStubLIZ.LIZIZ();
                                }
                            }
                        }
                        i9 = i10;
                    } else {
                        C1697810uHb.LJIJI();
                        throw null;
                    }
                }
                int i11 = 0;
                for (NLETrack nLETrack : nLEEditorLIZ.getModel().getTracks()) {
                    int i12 = i11 + 1;
                    if (i11 >= 0) {
                        NLETrack nLETrack2 = nLETrack;
                        MediaModel mediaModel3 = (MediaModel) C13LP.LJJJLZIJ(i11, list3);
                        if (mediaModel3 == null || (strLJFF = mediaModel3.LJFF()) == null) {
                            strLJFF = "";
                        }
                        Pair pairLJ = C20137613qo.LJ(C20137613qo.LIZ.LIZLLL(strLJFF));
                        if (i11 == 0) {
                            nLETrack2.setMainTrack(true);
                            NLETrackSlot nLETrackSlot = (NLETrackSlot) C13LP.LJJJLL(nLETrack2.getSlots());
                            if (nLETrackSlot != null && (nLESegmentVideoDynamicCast2 = NLESegmentVideo.dynamicCast((NLENode) nLETrackSlot.getMainSegment())) != null) {
                                NLEResourceAV aVFile = nLESegmentVideoDynamicCast2.getAVFile();
                                if (aVFile != null) {
                                    resourceType2 = aVFile.getResourceType();
                                } else {
                                    resourceType2 = null;
                                }
                                if (resourceType2 == NLEResType.IMAGE) {
                                    NLEResourceAV aVFile2 = nLESegmentVideoDynamicCast2.getAVFile();
                                    if (aVFile2 != null) {
                                        aVFile2.setDuration(TimeUnit.MILLISECONDS.toMicros(3000L));
                                    }
                                    TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                                    nLETrackSlot.setEndTime(timeUnit.toMicros(3000L));
                                    nLESegmentVideoDynamicCast2.setTimeClipEnd(timeUnit.toMicros(3000L));
                                } else {
                                    if (mediaModel3 != null) {
                                        jLIZLLL2 = C352310DrZ.LIZLLL(mediaModel3.duration);
                                    } else {
                                        jLIZLLL2 = 0;
                                    }
                                    long jMin = Math.min(jLIZLLL2, TimeUnit.MILLISECONDS.toMicros(60000L));
                                    NLEResourceAV aVFile3 = nLESegmentVideoDynamicCast2.getAVFile();
                                    if (aVFile3 != null) {
                                        aVFile3.setDuration(jLIZLLL2);
                                    }
                                    nLETrackSlot.setEndTime(jMin);
                                    nLESegmentVideoDynamicCast2.setTimeClipEnd(jMin);
                                }
                                nLETrackSlot.setMeasuredEndTime(0L);
                                NLEResourceAV aVFile4 = nLESegmentVideoDynamicCast2.getAVFile();
                                if (aVFile4 != null) {
                                    aVFile4.setWidth(((Number) pairLJ.getFirst()).intValue());
                                }
                                NLEResourceAV aVFile5 = nLESegmentVideoDynamicCast2.getAVFile();
                                if (aVFile5 != null) {
                                    aVFile5.setHeight(((Number) pairLJ.getSecond()).intValue());
                                }
                                NLEResourceAV aVFile6 = nLESegmentVideoDynamicCast2.getAVFile();
                                if (aVFile6 != null) {
                                    aVFile6.setHasAudio(!VEUtils.getAudioFileInfoForAllTracks(nLESegmentVideoDynamicCast2.getAVFile().getResourceFile()).isEmpty());
                                }
                                NLEStyClip clip = nLESegmentVideoDynamicCast2.getClip();
                                if (clip != null) {
                                    int i13 = C349360Dmo.LIZJ;
                                    nLESegmentVideoDynamicCast2.setCrop(C350670Dov.LIZ(clip));
                                    C357970E1r.LIZ.getClass();
                                    C357970E1r.LIZ(nLETrackSlot);
                                }
                            }
                        } else {
                            nLETrack2.setLayer(i11 - 1);
                            nLETrack2.setExtra("track_type", "video");
                            nLETrack2.setExtraTrackType(NLETrackType.VIDEO);
                            nLETrack2.setMainTrack(false);
                            nLETrack2.setExtra("track_layer", String.valueOf(nLETrack2.getLayer()));
                            nLETrack2.setExtra("track_extra_pip", "true");
                            NLETrackSlot nLETrackSlot2 = (NLETrackSlot) C13LP.LJJJLL(nLETrack2.getSlots());
                            if (nLETrackSlot2 != null && (nLESegmentVideoDynamicCast = NLESegmentVideo.dynamicCast((NLENode) nLETrackSlot2.getMainSegment())) != null) {
                                NLEResourceAV aVFile7 = nLESegmentVideoDynamicCast.getAVFile();
                                if (aVFile7 != null) {
                                    resourceType = aVFile7.getResourceType();
                                } else {
                                    resourceType = null;
                                }
                                if (resourceType == NLEResType.IMAGE) {
                                    Iterator<NLETrack> it3 = nLEEditorLIZ.getModel().getTracks().iterator();
                                    while (true) {
                                        if (it3.hasNext()) {
                                            next2 = it3.next();
                                            if (next2.getMainTrack()) {
                                                break;
                                            }
                                        } else {
                                            next2 = null;
                                            break;
                                        }
                                    }
                                    NLETrack nLETrack3 = next2;
                                    if (nLETrack3 != null && (slots2 = nLETrack3.getSlots()) != null && (nLETimeSpaceNode2 = (NLETimeSpaceNode) C13LP.LJJJLL(slots2)) != null) {
                                        jLIZLLL = nLETimeSpaceNode2.getEndTime();
                                    } else {
                                        jLIZLLL = TimeUnit.MILLISECONDS.toMicros(3000L);
                                    }
                                } else {
                                    MediaModel mediaModel4 = (MediaModel) C13LP.LJJJLZIJ(i11, list3);
                                    if (mediaModel4 != null) {
                                        jLIZLLL = C352310DrZ.LIZLLL(mediaModel4.duration);
                                    } else {
                                        jLIZLLL = 0;
                                    }
                                }
                                NLEResourceAV aVFile8 = nLESegmentVideoDynamicCast.getAVFile();
                                if (aVFile8 != null) {
                                    aVFile8.setDuration(jLIZLLL);
                                }
                                NLEResourceAV aVFile9 = nLESegmentVideoDynamicCast.getAVFile();
                                if (aVFile9 != null) {
                                    aVFile9.setWidth(((Number) pairLJ.getFirst()).intValue());
                                }
                                NLEResourceAV aVFile10 = nLESegmentVideoDynamicCast.getAVFile();
                                if (aVFile10 != null) {
                                    aVFile10.setHeight(((Number) pairLJ.getSecond()).intValue());
                                }
                                NLEResourceAV aVFile11 = nLESegmentVideoDynamicCast.getAVFile();
                                if (aVFile11 != null) {
                                    aVFile11.setHasAudio(!VEUtils.getAudioFileInfoForAllTracks(nLESegmentVideoDynamicCast.getAVFile().getResourceFile()).isEmpty());
                                }
                                nLETrackSlot2.setEndTime(jLIZLLL);
                                nLETrackSlot2.setMeasuredEndTime(0L);
                                nLESegmentVideoDynamicCast.setTimeClipEnd(jLIZLLL);
                                if (nLESegmentVideoDynamicCast.getClip() != null) {
                                    int i14 = C349360Dmo.LIZJ;
                                    nLESegmentVideoDynamicCast.setCrop(C350670Dov.LIZ(nLESegmentVideoDynamicCast.getClip()));
                                    C357970E1r.LIZ.getClass();
                                    C357970E1r.LIZ(nLETrackSlot2);
                                }
                            }
                        }
                        i11 = i12;
                    } else {
                        C1697810uHb.LJIJI();
                        throw null;
                    }
                }
                C351510DqH c351510DqH = C351510DqH.LIZ;
                NLEModel model = nLEEditorLIZ.getModel();
                AFwS194S0000000_8 aFwS194S0000000_8 = AFwS194S0000000_8.get$arr$(349);
                c351510DqH.getClass();
                C351510DqH.LJIIJ(model, false, aFwS194S0000000_8);
                Iterator<NLETrack> it4 = nLEEditorLIZ.getModel().getTracks().iterator();
                while (true) {
                    if (it4.hasNext()) {
                        next = it4.next();
                        if (next.getMainTrack()) {
                            break;
                        }
                    } else {
                        next = null;
                        break;
                    }
                }
                NLETrack nLETrack4 = next;
                if (nLETrack4 != null) {
                    nLETrack4.timeSort();
                }
                NLEModel model2 = nLEEditorLIZ.getModel();
                NLETrack mainTrack = nLEEditorLIZ.getModel().getMainTrack();
                if (mainTrack != null && (slots = mainTrack.getSlots()) != null && (nLETimeSpaceNode = (NLETimeSpaceNode) C13LP.LJJJLL(slots)) != null) {
                    micros = nLETimeSpaceNode.getEndTime();
                } else {
                    micros = TimeUnit.MILLISECONDS.toMicros(3000L);
                }
                model2.setDuration(micros);
                if (((Boolean) C257150A5x.LIZ.getValue()).booleanValue()) {
                    NLEModel model3 = nLEEditorLIZ.getModel();
                    if (iCeil > 0 && i2 > 0) {
                        QuickGridModel quickGridModel3 = creativeModelLIZIZ.quickGridModel;
                        if (quickGridModel3 != null) {
                            quickGridModel3.width = i2;
                        }
                        if (quickGridModel3 != null) {
                            quickGridModel3.height = iCeil;
                        }
                        f = i2 / iCeil;
                    } else {
                        f = 0.5625f;
                    }
                    model3.setCanvasRatio(f);
                }
                nLEEditorLIZ.commit();
                NLEInfoModel nLEInfoModel = creativeModelLIZIZ.nleInfoModel;
                s sVar = s.LIZ;
                NLEModel model4 = nLEEditorLIZ.getModel();
                int value = EnumC1412640mre.ALGORITHM_TEMPLATE.getValue();
                sVar.getClass();
                nLEInfoModel.nleData = s.LJJLIIIJJIZ(model4, value);
            }
        }
        creativeModelLIZIZ.cut2EditTransferModel = cut2EditTransferModel;
        if (!arrayList.isEmpty()) {
            creativeModelLIZIZ.albumModel.importInfoList = arrayList;
        }
        if (C0L7X.LIZ() && MusicBeanUtilKt.extractAVMusic(creativeModelLIZIZ.musicBuzModel) != null && !creativeModelLIZIZ.ugcTemplateData.isUgcTemplateFromAnchor && !z6 && !creativeModelLIZIZ.onThisDayData.isFromOnThisDay()) {
            intentLIZJ.putExtra("voice_volume", 0.0f);
        }
        if (creativeModelLIZIZ.onThisDayData.isFromOnThisDay() && C301560Bru.LIZ()) {
            workspaceLIZ.MC(creativeModelLIZIZ.musicBuzModel.musicPath);
        }
        if (C1621890sJ9.LIZ() && creativeModelLIZIZ.aigcOfflineModel.isOfflineAIGCEffectGenerated) {
            if (C123100dR.LIZ(workspaceLIZ.getMusicPath())) {
                creativeModelLIZIZ.importModel.isFastImport = false;
            }
            StickerInfo stickerInfo = creativeModelLIZIZ.aigcOfflineModel.stickerInfo;
            if (stickerInfo != null) {
                intentLIZJ.putExtra("sticker_info", stickerInfo);
            }
            String str2 = creativeModelLIZIZ.aigcOfflineModel.isDefaultProp;
            if (!C123100dR.LIZ(str2)) {
                str2 = null;
            }
            if (str2 != null) {
                intentLIZJ.putExtra("is_default_prop", Intrinsics.LJFF(str2, "1"));
            }
        }
        ((OnThisDayService) ServiceManager.get().getService(OnThisDayService.class)).insertChallengeIfNeed(intentLIZJ, C0MUK.LIZIZ(intentLIZJ), activity);
        if (!cut2EditTransferModel.getMusicSyncMode() && !C123100dR.LIZ(LIZLLL(intentLIZJ, "extra_edit_effect_uid"))) {
            z8 = false;
        } else {
            boolean z12 = C1444820nhY.LIZ;
            z8 = false;
            if (list2 != null) {
                aVMusic = (AVMusic) ListProtector.get(list2, 0);
            } else {
                aVMusic = null;
            }
            String strLJFF3 = C1444820nhY.LJFF(aVMusic);
            if (strLJFF3 != null) {
                if (!C123100dR.LIZ(strLJFF3)) {
                    strLJFF3 = null;
                }
                if (strLJFF3 != null) {
                    workspaceLIZ.MC(strLJFF3);
                }
            }
        }
        if (!z && !z2 && !z3) {
            if (interfaceC1631620sYq == null) {
                String str3 = VECutVideoActivity._pnsPageId;
                C0L4B.LIZIZ(activity, intentLIZJ, c569220MUe.LJIJI, C569230MUf.LIZ(c569220MUe));
            } else {
                return interfaceC1631620sYq.invoke(intentLIZJ, Boolean.valueOf(z6), interfaceC1364105Vn);
            }
        } else {
            C0EYF.LIZ.getClass();
            C19EG c19eg = (C19EG) activity;
            C1438840nXu.LIZ.getClass();
            try {
                extras = intentLIZJ.getExtras();
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                extras = null;
            }
            if (extras != null) {
                VideoPublishEditModel videoPublishEditModel = C1438840nXu.LIZIZ(extras, c19eg).LIZ;
                C0CHQ.LIZ().LJJIZ();
                C365800EVu.LIZ.LIZ(c19eg.getApplication());
                if (C365940EWi.LIZLLL(videoPublishEditModel)) {
                    C0EHM.LIZ = C786410Ut5.P3(c19eg);
                    C0EHK.LJIIJJI(c19eg);
                    C23245098x c23245098x = C23245098x.LIZ;
                    ConcurrentHashMap<C370820EgK, Bitmap> concurrentHashMap = new ConcurrentHashMap<>();
                    Context contextP3 = C786410Ut5.P3(c19eg);
                    if (!list3.isEmpty()) {
                        C23245098x.LJ = concurrentHashMap;
                        C23245098x.LIZLLL = C23250099c.LIZLLL(C23245098x.LIZJ, C0PEM.LIZJ, null, new C23243098v(contextP3, list3, concurrentHashMap, null), 2);
                    }
                    intentLIZJ.putExtra("only_hide_surface_view", true);
                    InterfaceC20597015ii interfaceC20597015iiLIZJ = C20622515mp.LIZJ(activity);
                    if (interfaceC20597015iiLIZJ != null && (c198hLC = interfaceC20597015iiLIZJ.LC()) != null) {
                        scene = c198hLC.getScene();
                    } else {
                        scene = null;
                    }
                    if (scene instanceof C19A3) {
                        c19a3 = (C19A3) scene;
                    } else {
                        c19a3 = null;
                    }
                    if (c19a3 != null && (lifecycle = c19a3.getLifecycle()) != null) {
                        currentState = lifecycle.getCurrentState();
                    } else {
                        currentState = null;
                    }
                    if (currentState != Lifecycle.State.DESTROYED && c19a3 != null && (c1drg = ((FeatureAlsLogicContainer) C1664600tQ2.LJ(c19a3)).LLJJI) != null) {
                        interfaceC1452360nti = (InterfaceC1452360nti) c1drg.LJIIL(null, InterfaceC1452360nti.class);
                    } else {
                        interfaceC1452360nti = null;
                    }
                    if (interfaceC1452360nti != null) {
                        SurfaceView surfaceViewLJIJJLI = interfaceC1452360nti.LJIJJLI();
                        AbstractC1437870nWL abstractC1437870nWLLIZ = C1439360nYk.LIZ(videoPublishEditModel);
                        c0 c0Var = c0.LIZ;
                        FrameLayout.LayoutParams layoutParamsT2 = c0Var.t2(abstractC1437870nWLLIZ.LJFF(), abstractC1437870nWLLIZ.LIZJ());
                        if (surfaceViewLJIJJLI.getWidth() != 0 && surfaceViewLJIJJLI.getWidth() != layoutParamsT2.width) {
                            z9 = true;
                        } else {
                            z9 = false;
                        }
                        if (surfaceViewLJIJJLI.getHeight() != 0 && surfaceViewLJIJJLI.getHeight() != layoutParamsT2.height) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (z9 || z10) {
                            interfaceC1452360nti.vh();
                            if (surfaceViewLJIJJLI.getVisibility() == 8) {
                                C786410Ut5.LLIIII(surfaceViewLJIJJLI, 4);
                            }
                            c0Var.q2(abstractC1437870nWLLIZ.LJFF(), abstractC1437870nWLLIZ.LIZJ(), surfaceViewLJIJJLI);
                        }
                    }
                }
                intentLIZJ.putExtra("editor_pro_start_time", System.currentTimeMillis());
                boolean z13 = videoPublishEditModel.getEditorProDraftModel().isEnterFromRecordTab;
                boolean zLIZIZ = C537970L7z.LIZIZ(videoPublishEditModel.creativeModel.editorProSchemeModel);
                if (z13 || C1416310mxZ.LJJI(videoPublishEditModel) || videoPublishEditModel.getEditorProModel().getFromEditorProEntranceInAlbum()) {
                    z8 = true;
                }
                intentLIZJ.putExtra("disable_change_surface_visibility", z8);
                boolean z14 = videoPublishEditModel.creativeModel.editorProSchemeModel.isDeepLink;
                ILayoutPreloadServiceForEditPage iLayoutPreloadServiceForEditPage = (ILayoutPreloadServiceForEditPage) ServiceManager.get().getService(ILayoutPreloadServiceForEditPage.class);
                try {
                    extras2 = intentLIZJ.getExtras();
                } catch (Exception e2) {
                    TryCatchGuardChecker.doCheck(e2);
                    extras2 = null;
                }
                iLayoutPreloadServiceForEditPage.preloadLayoutFiles(activity, extras2);
                try {
                    extras3 = intentLIZJ.getExtras();
                } catch (Exception e3) {
                    TryCatchGuardChecker.doCheck(e3);
                }
                C0MWH.LJIILLIIL(activity, extras3);
                C1402900mbw.LIZLLL(videoPublishEditModel, false, zLIZIZ, false, false, false, false, z13, false, C573570MeZ.LIZIZ(videoPublishEditModel), false, z14, false, false, 27376);
                C1402900mbw.LJ(videoPublishEditModel, false, zLIZIZ, false, false, false, false, z13, false, z14, false, false, 13808);
            } else {
                "Required value was null.".toString();
                throw new IllegalArgumentException("Required value was null.");
            }
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:108:0x03e2  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x03e9  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x041f  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0105  */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v15, types: [T, kotlin.Pair] */
    /* JADX WARN: Type inference failed for: r6v22 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x01a1 -> B:12:0x0071). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIIIIZZ(com.ss.android.ugc.aweme.creative.model.CreativeInfo r35, java.util.List<? extends com.ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment> r36, boolean r37, boolean r38, boolean r39, boolean r40, boolean r41, boolean r42, boolean r43, boolean r44, boolean r45, java.util.List<kotlin.Pair<java.lang.Integer, java.lang.Integer>> r46, kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> r47, boolean r48, com.ss.android.ugc.aweme.creative.model.CreativeModel r49, X.InterfaceC1364105Vn<? super X.C443120HZe<java.lang.Boolean, java.lang.Boolean, java.lang.Long>> r50) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1116
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0L7R.LJIIIIZZ(com.ss.android.ugc.aweme.creative.model.CreativeInfo, java.util.List, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, java.util.List, kotlin.jvm.functions.Function1, boolean, com.ss.android.ugc.aweme.creative.model.CreativeModel, X.05Vn):java.lang.Object");
    }
}
