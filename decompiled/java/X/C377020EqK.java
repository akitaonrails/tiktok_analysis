package X;

import Y.AObserverS209S0100000_5;
import Y.AfS0S0300100_5;
import android.content.Context;
import android.widget.TextView;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSlotSPtr;
import com.ss.android.ugc.aweme.PopupMonitorServiceImpl;
import com.ss.android.ugc.aweme.creative.model.editorpro.EditorProModel;
import com.ss.android.ugc.aweme.creative.model.editorpro.aigc.AiPlaygroundCameraModel;
import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import com.ss.android.ugc.aweme.creative.model.music.MusicBuzModel;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.music.model.MusicBeanUtilKt;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.aweme.services.audio.IVoiceDetectorService;
import com.ss.android.ugc.aweme.services.audio.VoiceDetectionParam;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.gamora.editor.music.experiment.AutoMusicRecommendConfig;
import com.ss.android.ugc.gamora.editor.services.IMusicEditService;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS371S0200000_5;

/* JADX INFO: renamed from: X.0EqK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C377020EqK implements InterfaceC359970E9j {
    public final Context LL;
    public final C0EY2 LLILLJJLI;
    public final C0EC7 LLILLL;
    public final C0E48 LLILZ;
    public C11JF LLILZLL;
    public final C1458080o2w LLILZIL = new C1458080o2w();
    public final boolean LLIZ = true;

    public final void LIZJ() {
        C0E48 c0e48;
        AVMusic aVMusicExtractAVMusic;
        final VideoPublishEditModel editModel = this.LLILLJJLI.getEditModel();
        if (editModel == null) {
            return;
        }
        if ((C295830Bif.LIZ() && (aVMusicExtractAVMusic = MusicBeanUtilKt.extractAVMusic(editModel.creativeModel.musicBuzModel)) != null && C1533950q1J.LJ(aVMusicExtractAVMusic.getMusicId())) || (c0e48 = this.LLILZ) == null) {
            return;
        }
        NLEModel nLEModelLJI = C350870DpF.LJI(c0e48);
        long jCurrentTimeMillis = System.currentTimeMillis();
        Context context = this.LL;
        InterfaceC377040EqM interfaceC377040EqM = new InterfaceC377040EqM() { // from class: X.0EqL
            @Override // X.InterfaceC377040EqM
            public final void LIZIZ() {
            }

            @Override // X.InterfaceC377040EqM
            public final void LIZ() {
                C11JF c11jf;
                C11JF c11jf2 = this.LIZ.LLILZLL;
                if (c11jf2 == null || c11jf2.isDisposed() || (c11jf = this.LIZ.LLILZLL) == null) {
                    return;
                }
                c11jf.dispose();
            }
        };
        DialogC386800FEo dialogC386800FEo = new DialogC386800FEo(context, true);
        String string = context.getString(2131834186);
        TextView textView = (TextView) dialogC386800FEo.findViewById(R.id.nnk);
        TextView textView2 = (TextView) dialogC386800FEo.findViewById(R.id.nnl);
        if (textView != null) {
            textView.setText(string);
        }
        if (textView2 != null) {
            textView2.setText(string);
        }
        dialogC386800FEo.LLILLL = interfaceC377040EqM;
        dialogC386800FEo.show();
        C785410UrT.LIZIZ(dialogC386800FEo);
        PopupMonitorServiceImpl.LIZ.getClass();
        PopupMonitorServiceImpl.LJJJ(dialogC386800FEo);
        C816490W1f.LIZ(dialogC386800FEo);
        C1458080o2w c1458080o2w = this.LLILZIL;
        Context context2 = this.LL;
        long duration = nLEModelLJI.getDuration();
        Context context3 = this.LL;
        c1458080o2w.LJ(context2, editModel, duration, context3 != null ? C1388190mED.LIZ(context3) : null);
        this.LLILZIL.LJFF = new AwS371S0200000_5(this, editModel, 275);
        this.LLILZIL.LJ = new AwS371S0200000_5(this, editModel, 276);
        this.LLILZLL = (C11JF) C1458080o2w.LJI(this.LLILZIL, editModel, new InterfaceC1455230nyL() { // from class: X.0EMY
            @Override // X.InterfaceC1455230nyL
            public final MusicBuzModel LIZIZ() {
                return editModel.creativeModel.musicBuzModel;
            }

            @Override // X.InterfaceC1455230nyL
            public final void LIZ(AVMusic aVMusic) {
                if (aVMusic == null) {
                    return;
                }
                C201955140j.LIZJ(C201962140q.LIZIZ, "update auto music");
            }
        }, !C0C64.LJIILLIIL().LJIIIZ(31744, "studio_recommend_music_disable_aed", true, false), false, false, nLEModelLJI, 184).LJJLL(new AfS0S0300100_5(dialogC386800FEo, this, editModel, jCurrentTimeMillis, 0), new AfS0S0300100_5(dialogC386800FEo, this, editModel, jCurrentTimeMillis, 1));
    }

    public final void LIZLLL() {
        C1461010o7f c1461010o7fLIZIZ;
        C0ELJ c0elj;
        C0EHI value = this.LLILLJJLI.zu2().getValue();
        if (value == null || (c0elj = value.LJ) == null || !c0elj.isRestoreData()) {
            C0E48 c0e48 = this.LLILZ;
            if (c0e48 != null) {
                NLEModel nLEModelLJI = C350870DpF.LJI(c0e48);
                VideoPublishEditModel editModel = this.LLILLJJLI.getEditModel();
                if (editModel != null) {
                    if (!C0C64.LJIILLIIL().LJIIIZ(31744, "studio_recommend_music_disable_aed", true, false)) {
                        C1456980o1A.LIZJ(editModel, new AwS371S0200000_5(this, editModel, 277));
                        if (C1428470nHB.LJFF(editModel)) {
                            NLEModel nLEModelDynamicCast = NLEModel.dynamicCast(nLEModelLJI.deepClone(false));
                            IMusicEditService iMusicEditService = (IMusicEditService) PluggableExtentionKt.pluggableSpi$default(IMusicEditService.class, false, false, false, 14, null);
                            if (iMusicEditService != null && (c1461010o7fLIZIZ = iMusicEditService.LIZIZ(System.currentTimeMillis(), nLEModelDynamicCast, editModel)) != null) {
                                C01GW c01gw = C1456990o1B.LIZIZ;
                                IVoiceDetectorService.DefaultImpls.startDetectVoiceActivity$default((IVoiceDetectorService) ServiceManager.get().getService(IVoiceDetectorService.class), new VoiceDetectionParam(1, ((AutoMusicRecommendConfig) c01gw.getValue()).aedCheckBusinessType, ((AutoMusicRecommendConfig) c01gw.getValue()).aedCheckThresh, (C1456990o1B.LIZ() || C1416310mxZ.LJIIIZ(editModel)) ? false : true, 0L, nLEModelDynamicCast.getDuration() / ((long) LSPassThroughRecordSizeConfig.DEFAULT), 0, "", 0L, editModel.getCreationId(), editModel.getMusicId()), c1461010o7fLIZIZ, null, 4, null);
                            }
                        }
                    } else if (this.LLILZ.Bo().LIZ()) {
                        C201955140j.LJIILJJIL(C563650M8t.LIZIZ, "skip auto music because its already edited.");
                        C0EFJ c0efj = C0EFJ.LIZ;
                        C0E48 c0e482 = this.LLILZ;
                        c0efj.getClass();
                        C0EFJ.LIZIZ(editModel, c0e482, "edit");
                    } else {
                        LIZJ();
                    }
                }
            }
            C0E48 c0e483 = this.LLILZ;
            if (c0e483 != null) {
                c0e483.S7().LIZIZ(Boolean.TRUE, "event_user_guide_intercepted", false);
            }
        }
    }

    @Override // X.InterfaceC359970E9j
    public final boolean LIZ() {
        return this.LLIZ;
    }

    @Override // X.InterfaceC359970E9j
    public final void LIZIZ(LifecycleOwner lifecycleOwner) {
        EditorProModel editorProModel;
        VecNLETrackSlotSPtr slots;
        C0ELJ c0elj;
        EditorProModel editorProModel2;
        C0E48 c0e48 = this.LLILZ;
        if (c0e48 != null) {
            NLEModel nLEModelLJI = C350870DpF.LJI(c0e48);
            VideoPublishEditModel editModel = this.LLILLJJLI.getEditModel();
            if (editModel == null) {
                return;
            }
            AiPlaygroundCameraModel aiPlaygroundCameraModel = editModel.creativeModel.editorProAIGCInfoModel.aiPlaygroundCameraModel;
            if (C1428470nHB.LJFF(editModel) && aiPlaygroundCameraModel.needAddRecommendMusic) {
                aiPlaygroundCameraModel.needAddRecommendMusic = false;
                LIZLLL();
                return;
            }
            VideoPublishEditModel editModel2 = this.LLILLJJLI.getEditModel();
            boolean z = true;
            if (editModel2 != null && (editorProModel = editModel2.getEditorProModel()) != null && editorProModel.getFromEditorProEntranceInAlbum()) {
                VideoPublishEditModel editModel3 = this.LLILLJJLI.getEditModel();
                if ((editModel3 == null || (editorProModel2 = editModel3.getEditorProModel()) == null || !editorProModel2.isAdvancedEdit()) && !editModel.creativeModel.draftInfoModel.isDraft) {
                    C0EHI value = this.LLILLJJLI.zu2().getValue();
                    if (value != null && (c0elj = value.LJ) != null && c0elj.isRestoreData()) {
                        return;
                    }
                    NLETrack mainTrack = nLEModelLJI.getMainTrack();
                    if (mainTrack == null || (slots = mainTrack.getSlots()) == null || slots.size() <= 1) {
                        z = false;
                    }
                    if (((Boolean) C273740Ao8.LIZ.getValue()).booleanValue() && z) {
                        this.LLILLL.xi1().observe(lifecycleOwner, new AObserverS209S0100000_5(this, 183));
                        C0E48 c0e482 = this.LLILZ;
                        if (c0e482 != null) {
                            c0e482.S7().LIZIZ(Boolean.TRUE, "event_user_guide_intercepted", false);
                            return;
                        }
                        return;
                    }
                    if (!((Boolean) C273720Ao6.LIZ.getValue()).booleanValue()) {
                        return;
                    }
                    LIZLLL();
                }
            }
        }
    }

    public static void LJ(long j, VideoPublishEditModel videoPublishEditModel, boolean z) {
        String str;
        if (!C1428470nHB.LJFF(videoPublishEditModel) || !videoPublishEditModel.creativeModel.editorProAIGCInfoModel.aiPlaygroundCameraModel.isEditorPro) {
            return;
        }
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("business", "ai_video_tool");
        c0lab.LIZIZ(j, "duration");
        if (z) {
            str = "success";
        } else {
            str = "fail";
        }
        c0lab.LJ(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, str);
        c0lab.LIZ(1, "is_editor_pro");
        C20684815ws.LJIILLIIL("creation_auto_select_recommend_music", c0lab.LIZ);
    }

    public C377020EqK(Context context, C0EY2 c0ey2, C0EC7 c0ec7, C0E48 c0e48) {
        this.LL = context;
        this.LLILLJJLI = c0ey2;
        this.LLILLL = c0ec7;
        this.LLILZ = c0e48;
    }
}
