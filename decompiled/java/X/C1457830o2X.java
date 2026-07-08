package X;

import Y.AObjectS245S0100000_22;
import Y.ARunnableS103S0100000_3;
import Y.ARunnableS104S0100000_4;
import Y.ARunnableS122S0100000_22;
import Y.ARunnableS75S0200000_6;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackType;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSPtr;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.scene.Scene;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.creative.model.edit.ImageAlbumData;
import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import com.ss.android.ugc.aweme.creative.model.music.FlowDataMusicInfo;
import com.ss.android.ugc.aweme.creative.model.music.MusicBuzModel;
import com.ss.android.ugc.aweme.creative.model.music.UnSelectMusic;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.music.model.MusicBeanUtilKt;
import com.ss.android.ugc.aweme.services.optimization.ILayoutPreloadServiceForEditPage;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.social.creation.api.edit.SocialEditLayoutPreloadApi;
import com.zhiliaoapp.musically.R;
import irm.AkS90S0100000_22;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS210S0000000_22;
import kotlin.jvm.internal.AwS133S0201000_6;
import kotlin.jvm.internal.AwS566S0100000_22;
import kotlin.jvm.internal.AwS601S0100000_22;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0o2X, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1457830o2X extends Scene implements InterfaceC1166920gTK, InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJLL;
    public final C1DRG LLJI;
    public final C1457760o2Q LLJIJIL;
    public C1457840o2Y LLJILJILJ;
    public boolean LLJILLL;
    public final C1664750tQH LLJJ;
    public final C1664740tQG LLJJIII;
    public final C1664740tQG LLJJIJI;
    public final C1664740tQG LLJJIJIIJIL;
    public final C1664740tQG LLJJIJIL;
    public final C1664740tQG LLJJJ;
    public final InterfaceC1454960nxu LLJJJIL;
    public InterfaceC1458060o2u LLJJJJ;
    public String LLJJJJLIIL;
    public String LLJJL;
    public final C1664740tQG LLJLIL;
    public Boolean LLJLILLLLZIIL;
    public final C01GW LLJILJIL = C452501pT.LIZIZ(AFwS210S0000000_22.get$arr$(213));
    public final C01GW LLJJI = C1449630npJ.LIZIZ(this, InterfaceC1457250o1b.class);
    public final Map<Integer, View> LLJJJJJIL = new LinkedHashMap();
    public long LLJJLIIIJLLLLLLLZ = -1;
    public final C01GW LLJL = C452501pT.LIZIZ(new AwS566S0100000_22(this, 593));

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1457830o2X.class, "mModel", "getMModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C1457830o2X.class, "editPrePublishApi", "getEditPrePublishApi()Lcom/ss/android/ugc/gamora/editor/preload/EditPrePublishApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(C1457830o2X.class, "editorProAdapterApi", "getEditorProAdapterApi()Lcom/ss/android/ugc/gamora/editorpro/infra/EditorProAdapterApiComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS4 = new C2217381BqS(C1457830o2X.class, "editPreviewApi", "getEditPreviewApi()Lcom/ss/android/ugc/aweme/shortvideo/preview/EditPreviewApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS5 = new C2217381BqS(C1457830o2X.class, "editorAutoCutApi", "getEditorAutoCutApi()Lcom/ss/android/ugc/aweme/shortvideo/autocut/EditAutoCutApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS6 = new C2217381BqS(C1457830o2X.class, "editAdjustClipsApi", "getEditAdjustClipsApi()Lcom/ss/android/ugc/aweme/shortvideo/editcut/EditAdjustClipsApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS7 = new C2217381BqS(C1457830o2X.class, "chooseMusicConfig", "getChooseMusicConfig()Lcom/ss/android/ugc/aweme/port/in/music/ChooseMusicConfig;", 0);
        c09r3.getClass();
        LLJLL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3, c2217381BqS4, c2217381BqS5, c2217381BqS6, c2217381BqS7};
    }

    @Override // X.InterfaceC960503pD, X.C11E6
    public final LifecycleOwner getLifecycleOwner() {
        return this;
    }

    @Override // X.C11E9
    public final C11E6 getLifecycleOwnerHolder() {
        return this;
    }

    @Override // X.C11DL
    public final InterfaceC874803bO getReceiver() {
        return this;
    }

    @Override // X.C11E9
    public final C11DL<InterfaceC960503pD> getReceiverHolder() {
        return this;
    }

    @Override // X.C11E9
    public final boolean getUniqueOnlyGlobal() {
        return true;
    }

    public final C1457860o2a LLLIIIIL() {
        return (C1457860o2a) this.LLJLIL.getValue(this, LLJLL[6]);
    }

    public final InterfaceC1455860nzM LLLIILIL() {
        return (InterfaceC1455860nzM) this.LLJJIJIIJIL.getValue(this, LLJLL[3]);
    }

    public final VideoPublishEditModel LLLIL() {
        return (VideoPublishEditModel) this.LLJJ.getValue(this, LLJLL[0]);
    }

    public final void LLLILZ() {
        int i;
        C1457840o2Y c1457840o2Y = this.LLJILJILJ;
        if (c1457840o2Y == null) {
            return;
        }
        C1457860o2a c1457860o2aLLLIIIIL = LLLIIIIL();
        boolean z = false;
        if (c1457860o2aLLLIIIIL == null || (i = c1457860o2aLLLIIIIL.LJII) <= 0) {
            return;
        }
        int iLJIIJ = C12ES.LJIIJ(getSceneContext()) - (Math.max(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(48)), i) * 2);
        if (iLJIIJ < 0 || iLJIIJ <= 0) {
            return;
        }
        View cancelMusicClickContainer = c1457840o2Y.getCancelMusicClickContainer();
        boolean z2 = cancelMusicClickContainer != null && cancelMusicClickContainer.getVisibility() == 0;
        Boolean bool = this.LLJLILLLLZIIL;
        if (bool != null && bool.booleanValue() != z2) {
            z = true;
        }
        this.LLJLILLLLZIIL = Boolean.valueOf(z2);
        LLLILZLLLI(z, iLJIIJ, c1457840o2Y.getChooseMusicDockerContentView(), c1457840o2Y.getChooseMusicTextView());
        LLLILZLLLI(z, iLJIIJ, c1457840o2Y.getChooseMusicDockerContentViewAnimation(), c1457840o2Y.getChooseMusicTextViewAnimation());
    }

    @Override // com.bytedance.scene.Scene
    public final void onDestroyView() {
        super.onDestroyView();
        InterfaceC1458060o2u interfaceC1458060o2u = this.LLJJJJ;
        if (interfaceC1458060o2u != null) {
            interfaceC1458060o2u.clear();
        }
    }

    @Override // X.InterfaceC379610EuV
    public final C1DRG getDiContainer() {
        return this.LLJI;
    }

    public final void LLLII(boolean z) {
        NLEModel nLEModelLLZ;
        InterfaceC1455860nzM interfaceC1455860nzMLLLIILIL;
        LiveData<InterfaceC1452170ntP> liveDataG;
        InterfaceC1452170ntP value;
        NLEModel nLEModelLIZ;
        VecNLETrackSPtr tracks;
        InterfaceC1419190n2D interfaceC1419190n2D;
        String str;
        String str2;
        int i;
        UrlModel urlModel;
        List<String> urlList;
        String str3;
        C0EYP c0eyp;
        InterfaceC1446740nke interfaceC1446740nke;
        ImageAlbumData imageAlbumData;
        InterfaceC1451520nsM interfaceC1451520nsM;
        int i2 = 0;
        if (C297670Bld.LIZ() && C1428470nHB.LJJZZI(LLLIL()) && (imageAlbumData = LLLIL().getImageAlbumData()) != null && imageAlbumData.isTempImageMode() && (interfaceC1451520nsM = (InterfaceC1451520nsM) this.LLJJIII.getValue(this, LLJLL[1])) != null) {
            interfaceC1451520nsM.m7("click_cancel_music");
        }
        C1664740tQG c1664740tQG = this.LLJJJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJLL;
        InterfaceC1419190n2D interfaceC1419190n2D2 = (InterfaceC1419190n2D) c1664740tQG.getValue(this, interfaceC2217461BqaArr[5]);
        if (interfaceC1419190n2D2 != null) {
            interfaceC1419190n2D2.Uu2();
        }
        InterfaceC1455860nzM interfaceC1455860nzMLLLIILIL2 = LLLIILIL();
        Function0<Unit> function0 = null;
        if ((interfaceC1455860nzMLLLIILIL2 instanceof InterfaceC1446740nke) && (interfaceC1446740nke = (InterfaceC1446740nke) interfaceC1455860nzMLLLIILIL2) != null) {
            nLEModelLLZ = interfaceC1446740nke.LLZ();
        } else {
            nLEModelLLZ = null;
        }
        if (C349930Dnj.LIZ(LLLIL(), nLEModelLLZ, false) && LLLIL().hasExtendMusic() && nLEModelLLZ != null && C349930Dnj.LJII(nLEModelLLZ) && (c0eyp = (C0EYP) this.LLJJIJI.getValue(this, interfaceC2217461BqaArr[2])) != null) {
            c0eyp.hs1(false, LLLIL());
        }
        String id = "";
        if (((Boolean) C0BNI.LIZ.getValue()).booleanValue() && !LLLIL().creativeModel.onThisDayData.isInOnThisDayPreviewPage()) {
            LLLIL().creativeModel.onThisDayData.setMusicSelectedFromV2("");
        }
        AVMusic aVMusicExtractAVMusic = MusicBeanUtilKt.extractAVMusic(LLLIL().creativeModel.musicBuzModel);
        if (aVMusicExtractAVMusic != null) {
            if (C298150BmP.LIZIZ() && (urlModel = aVMusicExtractAVMusic.playUrl) != null && (urlList = urlModel.getUrlList()) != null && (str3 = (String) C13LP.LJJJLL(urlList)) != null) {
                C201962140q c201962140q = C201962140q.LIZIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("EditMusicStreamPlayback : stopPreDownload url = ");
                sbLIZ.append(str3);
                C201955140j.LIZJ(c201962140q, C2188811AlT.LIZIZ(sbLIZ));
                C20187213yo.LIZ.getClass();
                C20187213yo.LIZIZ(str3);
            }
            MusicBuzModel musicBuzModel = LLLIL().creativeModel.musicBuzModel;
            if (musicBuzModel != null) {
                musicBuzModel.unSelectMusic = new UnSelectMusic(LLLIL().getCreationId(), aVMusicExtractAVMusic.getMusicId(), 4);
            }
            if (z) {
                C0LAB c0lab = new C0LAB();
                c0lab.LJ("creation_id", LLLIL().getCreationId());
                FlowDataMusicInfo flowDataMusicInfo = LLLIL().getCreativeFlowData().getFlowDataMusicInfo();
                if (flowDataMusicInfo != null && flowDataMusicInfo.isSelectedByAuto()) {
                    str = "auto";
                } else {
                    str = "manual";
                }
                c0lab.LJ("music_selected_method", str);
                c0lab.LJ("content_source", C1428470nHB.LJIILIIL(LLLIL()));
                c0lab.LJ("content_type", C1428470nHB.LJIILL(LLLIL()));
                c0lab.LJ("shoot_way", LLLIL().mShootWay);
                if (!Intrinsics.LJFF(LLLIL().mShootWay, "on_this_day")) {
                    str2 = "video_edit_page";
                } else {
                    str2 = "on_this_day_page";
                }
                c0lab.LJ("enter_from", str2);
                c0lab.LJ("music_id", LLLIL().getMusicId());
                c0lab.LJ("music_edited_from", aVMusicExtractAVMusic.getEditFrom());
                c0lab.LIZ(aVMusicExtractAVMusic.isPgc() ? 1 : 0, "is_pgc");
                if (aVMusicExtractAVMusic.getMatchedSongInfo() != null) {
                    id = aVMusicExtractAVMusic.getMatchedSongInfo().getId();
                }
                c0lab.LJ("meta_song_id", id);
                c0lab.LJ("enter_method", "entrance_icon");
                c0lab.LIZ(0, "is_editor_pro");
                c0lab.LJ("music_selected_from", C1412490mrP.LIZIZ(LLLIL()));
                c0lab.LJ("enter_from", "video_edit_page");
                c0lab.LIZ(LLLIL().creativeModel.autoCutModel.isAutoCutPopupShow ? 1 : 0, "is_autocut_popup_show");
                if (aVMusicExtractAVMusic.similarTag > 0) {
                    i = 1;
                } else {
                    i = 0;
                }
                c0lab.LIZ(i, "is_similar_music");
                if (LLLIL().creativeModel.mdpInfoModel.fromOfflineMusicMdp) {
                    i2 = 1;
                }
                c0lab.LIZ(i2, "is_offline_unmuted_mdp");
                c0lab.LJ("music_log_id", C1412490mrP.LJFF(LLLIL()));
                C20684815ws.LJIILLIIL("unselect_music", c0lab.LIZ);
                C0LAB c0lab2 = new C0LAB();
                c0lab2.LJ("music_selected_from", this.LLJJL);
                c0lab2.LJ("music_id", this.LLJJJJLIIL);
                c0lab2.LJ("enter_from", "video_edit_page");
                c0lab2.LJ("type", "unselect");
                c0lab2.LIZIZ(System.currentTimeMillis() - this.LLJJLIIIJLLLLLLLZ, "duration");
                C20684815ws.LJIILLIIL("show_music_title_duration", c0lab2.LIZ);
                this.LLJJLIIIJLLLLLLLZ = -1L;
            }
        }
        if (((Boolean) C288130BRb.LIZ.getValue()).booleanValue() && LLLIL().getEditMusicSyncMode() && (interfaceC1419190n2D = (InterfaceC1419190n2D) this.LLJJJ.getValue(this, interfaceC2217461BqaArr[5])) != null) {
            interfaceC1419190n2D.ar2();
        }
        Function0<Unit> function02 = this.LLJIJIL.LJIIJJI;
        if (function02 != null) {
            function0 = function02;
        }
        function0.invoke();
        if (C566070MIb.LIZ() && C1428470nHB.LJJJJJL(LLLIL().creativeModel) && (interfaceC1455860nzMLLLIILIL = LLLIILIL()) != null && (liveDataG = interfaceC1455860nzMLLLIILIL.g()) != null && (value = liveDataG.getValue()) != null && (nLEModelLIZ = C352130DrH.LIZ(value)) != null && (tracks = nLEModelLIZ.getTracks()) != null) {
            for (NLETrack nLETrack : tracks) {
                if (nLETrack.getTrackType() == NLETrackType.AUDIO && !C351220Dpo.LLLII(nLETrack)) {
                    nLEModelLIZ.removeTrack(nLETrack);
                    InterfaceC1454960nxu interfaceC1454960nxu = this.LLJJJIL;
                    if (interfaceC1454960nxu != null) {
                        interfaceC1454960nxu.lr(true);
                    }
                }
            }
        }
    }

    public final void LLLIZZ(int i) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        ViewGroup.MarginLayoutParams marginLayoutParams2;
        int i2;
        ViewGroup.MarginLayoutParams marginLayoutParams3;
        int i3;
        ViewGroup.MarginLayoutParams marginLayoutParams4;
        ViewGroup.MarginLayoutParams marginLayoutParams5;
        View view = this.mView;
        if (view instanceof C1457840o2Y) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams5 = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
                if (LLLIILIL() instanceof InterfaceC572860MdQ) {
                    marginLayoutParams5.topMargin = i;
                    C786410Ut5.W5(this.mView, marginLayoutParams5);
                } else if (!C1462920oAk.LIZLLL()) {
                    C385670FAf<Boolean> c385670FAf = this.LLJIJIL.LJIIIZ;
                    if (c385670FAf == null) {
                        c385670FAf = null;
                    }
                    if (!Intrinsics.LJFF(c385670FAf.LIZJ(), Boolean.FALSE)) {
                        marginLayoutParams5.topMargin = i + C366700EZg.LIZ(7.0d);
                        C786410Ut5.W5(this.mView, marginLayoutParams5);
                    }
                }
            }
        } else {
            ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
            if ((layoutParams2 instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2) != null) {
                if (LLLIILIL() instanceof InterfaceC572860MdQ) {
                    marginLayoutParams.topMargin = i;
                    C786410Ut5.W5(this.mView, marginLayoutParams);
                } else if (!C1462920oAk.LIZLLL()) {
                    C385670FAf<Boolean> c385670FAf2 = this.LLJIJIL.LJIIIZ;
                    if (c385670FAf2 == null) {
                        c385670FAf2 = null;
                    }
                    if (!Intrinsics.LJFF(c385670FAf2.LIZJ(), Boolean.FALSE)) {
                        marginLayoutParams.topMargin = i + C366700EZg.LIZ(24.5d);
                        C786410Ut5.W5(this.mView, marginLayoutParams);
                    }
                }
            }
        }
        View viewFindViewById = this.mView.findViewById(R.id.dsl);
        int i4 = 0;
        if (viewFindViewById != null) {
            C385670FAf<Boolean> c385670FAf3 = this.LLJIJIL.LJIIIZ;
            if (c385670FAf3 == null) {
                c385670FAf3 = null;
            }
            Boolean boolLIZJ = c385670FAf3.LIZJ();
            Boolean bool = Boolean.FALSE;
            if (!Intrinsics.LJFF(boolLIZJ, bool)) {
                int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(14));
                ViewGroup.LayoutParams layoutParams3 = this.mView.getLayoutParams();
                if ((layoutParams3 instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams4 = (ViewGroup.MarginLayoutParams) layoutParams3) != null) {
                    i3 = marginLayoutParams4.topMargin;
                } else {
                    i3 = 0;
                }
                C1462920oAk.LIZJ(viewFindViewById, iLIZIZ, i3);
            }
            C385670FAf<Boolean> c385670FAf4 = this.LLJIJIL.LJIIIZ;
            if (c385670FAf4 == null) {
                c385670FAf4 = null;
            }
            if (!Intrinsics.LJFF(c385670FAf4.LIZJ(), bool)) {
                int iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(14));
                ViewGroup.LayoutParams layoutParams4 = this.mView.getLayoutParams();
                if ((layoutParams4 instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams3 = (ViewGroup.MarginLayoutParams) layoutParams4) != null) {
                    i2 = marginLayoutParams3.topMargin;
                } else {
                    i2 = 0;
                }
                C1462920oAk.LIZJ(viewFindViewById, iLIZIZ2, i2);
            }
        }
        View viewFindViewById2 = this.mView.findViewById(R.id.dsm);
        if (viewFindViewById2 != null && !(LLLIILIL() instanceof InterfaceC572860MdQ)) {
            int iLIZIZ3 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(14));
            ViewGroup.LayoutParams layoutParams5 = this.mView.getLayoutParams();
            if ((layoutParams5 instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams5) != null) {
                i4 = marginLayoutParams2.topMargin;
            }
            C1462920oAk.LIZJ(viewFindViewById2, iLIZIZ3, i4);
        }
        View viewFindViewById3 = this.mView.findViewById(R.id.dsl);
        if (viewFindViewById3 != null) {
            HandlerHook.viewPost(viewFindViewById3, new ARunnableS103S0100000_3(viewFindViewById3, 59));
        }
    }

    @Override // com.bytedance.scene.Scene
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        Integer num = C1450870nrJ.LJI;
        if (num != null) {
            LLLIZZ(num.intValue());
        }
        C385670FAf<Pair<Boolean, Function0<Unit>>> c385670FAf = null;
        ((C0ETY) this.LLJI.LJII(C0ETY.class, null)).Sd(InterfaceC1455610nyx.class, new AwS601S0100000_22(this, 402));
        ((C0ETY) this.LLJI.LJII(C0ETY.class, null)).Sd(InterfaceC1457610o2B.class, new AwS601S0100000_22(this, 403));
        LLLIL();
        C1457840o2Y c1457840o2Y = this.LLJILJILJ;
        if (c1457840o2Y != null) {
            c1457840o2Y.getChooseMusicDockerContentViewAnimation();
        }
        C1457840o2Y c1457840o2Y2 = this.LLJILJILJ;
        if (c1457840o2Y2 != null) {
            c1457840o2Y2.getChooseMusicIconViewAnimation();
        }
        C1457840o2Y c1457840o2Y3 = this.LLJILJILJ;
        if (c1457840o2Y3 != null) {
            c1457840o2Y3.getChooseMusicTextViewAnimation();
        }
        C1457840o2Y c1457840o2Y4 = this.LLJILJILJ;
        if (c1457840o2Y4 != null) {
            c1457840o2Y4.getLoadingMusicLottie();
        }
        C259800zU c259800zU = new C259800zU();
        LLLIL();
        LLLIL();
        C1457840o2Y c1457840o2Y5 = this.LLJILJILJ;
        if (c1457840o2Y5 != null) {
            c1457840o2Y5.getChooseMusicDockerContentViewAnimation();
        }
        C385670FAf<String> c385670FAf2 = this.LLJIJIL.LIZ;
        if (c385670FAf2 == null) {
            c385670FAf2 = null;
        }
        c385670FAf2.LIZ(this, new AObjectS245S0100000_22(this, 148));
        C385670FAf<Integer> c385670FAf3 = this.LLJIJIL.LJII;
        if (c385670FAf3 == null) {
            c385670FAf3 = null;
        }
        c385670FAf3.LIZ(this, new AObjectS245S0100000_22(this, c259800zU, 149));
        C385670FAf<TextUtils.TruncateAt> c385670FAf4 = this.LLJIJIL.LIZJ;
        if (c385670FAf4 == null) {
            c385670FAf4 = null;
        }
        c385670FAf4.LIZ(this, new AObjectS245S0100000_22(this, 150));
        C385670FAf<Boolean> c385670FAf5 = this.LLJIJIL.LIZLLL;
        if (c385670FAf5 == null) {
            c385670FAf5 = null;
        }
        c385670FAf5.LIZ(this, new AObjectS245S0100000_22(this, 151));
        C385670FAf<Boolean> c385670FAf6 = this.LLJIJIL.LJI;
        if (c385670FAf6 == null) {
            c385670FAf6 = null;
        }
        c385670FAf6.LIZ(this, new AObjectS245S0100000_22(this, 152));
        C385670FAf<Boolean> c385670FAf7 = this.LLJIJIL.LJFF;
        if (c385670FAf7 == null) {
            c385670FAf7 = null;
        }
        c385670FAf7.LIZ(this, new AObjectS245S0100000_22(this, 145));
        C385670FAf<Boolean> c385670FAf8 = this.LLJIJIL.LIZIZ;
        if (c385670FAf8 == null) {
            c385670FAf8 = null;
        }
        c385670FAf8.LIZ(this, new AObjectS245S0100000_22(this, 146));
        C385670FAf<Pair<Boolean, Function0<Unit>>> c385670FAf9 = this.LLJIJIL.LJIIIIZZ;
        if (c385670FAf9 != null) {
            c385670FAf = c385670FAf9;
        }
        c385670FAf.LIZ(this, new AObjectS245S0100000_22(this, 147));
        if (!this.LLJILLL) {
            AkS90S0100000_22 akS90S0100000_22 = new AkS90S0100000_22(this, 10, 42);
            C1457840o2Y c1457840o2Y6 = this.LLJILJILJ;
            if (c1457840o2Y6 != null) {
                c1457840o2Y6.setChooseMusicLayerListener(akS90S0100000_22);
            }
        } else {
            AkS90S0100000_22 akS90S0100000_222 = new AkS90S0100000_22(this, 11, 42);
            C1457840o2Y c1457840o2Y7 = this.LLJILJILJ;
            if (c1457840o2Y7 != null) {
                c1457840o2Y7.setChooseMusicLayerListener(akS90S0100000_222);
            }
        }
        C1457840o2Y c1457840o2Y8 = this.LLJILJILJ;
        if (c1457840o2Y8 != null) {
            c1457840o2Y8.setCancelMusicLayerListener(new AkS90S0100000_22(this, 9, 42));
        }
    }

    public C1457830o2X(C1DRG c1drg, C1457760o2Q c1457760o2Q) {
        this.LLJI = c1drg;
        this.LLJIJIL = c1457760o2Q;
        this.LLJJ = C1664770tQJ.LIZ(c1drg, VideoPublishEditModel.class, null);
        this.LLJJIII = C1664770tQJ.LIZIZ(c1drg, InterfaceC1451520nsM.class, null);
        this.LLJJIJI = C1664770tQJ.LIZIZ(c1drg, C0EYP.class, null);
        this.LLJJIJIIJIL = C1664770tQJ.LIZIZ(c1drg, InterfaceC1455860nzM.class, null);
        this.LLJJIJIL = C1664770tQJ.LIZIZ(c1drg, InterfaceC1417050myl.class, null);
        this.LLJJJ = C1664770tQJ.LIZIZ(c1drg, InterfaceC1419190n2D.class, null);
        this.LLJJJIL = (InterfaceC1454960nxu) c1drg.LJIIL(null, InterfaceC1454960nxu.class);
        this.LLJLIL = C1664770tQJ.LIZIZ(c1drg, C1457860o2a.class, null);
    }

    @Override // com.bytedance.scene.Scene
    public final void onViewCreated(View view, Bundle bundle) {
        C1457840o2Y c1457840o2Y;
        C572180McK c572180McK;
        Integer numLIZJ;
        View chooseMusicDockerContentView;
        Integer numLIZJ2;
        HashMap<String, Integer> extraShareOptions;
        Integer num;
        super.onViewCreated(view, bundle);
        HashMap<String, Integer> extraShareOptions2 = LLLIL().getCreativeFlowData().getExtraShareOptions();
        if ((extraShareOptions2 != null && extraShareOptions2.containsKey("tiktok_videokit_disable_music_selection") && (extraShareOptions = LLLIL().getCreativeFlowData().getExtraShareOptions()) != null && (num = extraShareOptions.get("tiktok_videokit_disable_music_selection")) != null && num.intValue() == 1) || LLLIL().isLinkShareWithPresetMusic()) {
            this.LLJILLL = true;
        }
        if (view instanceof C1457840o2Y) {
            c1457840o2Y = (C1457840o2Y) view;
        } else {
            c1457840o2Y = null;
        }
        this.LLJILJILJ = c1457840o2Y;
        if (c1457840o2Y != null) {
            c1457840o2Y.setChooseMusicDockerContentView(c1457840o2Y.findViewById(R.id.dsl));
            boolean zLIZ = C862000Xri.LIZ();
            int i = R.attr.zg;
            if (zLIZ && (numLIZJ2 = C1308910kAL.LIZJ(R.attr.zg, c1457840o2Y.getContext())) != null) {
                int iIntValue = numLIZJ2.intValue();
                View chooseMusicDockerContentView2 = c1457840o2Y.getChooseMusicDockerContentView();
                if (chooseMusicDockerContentView2 != null) {
                    chooseMusicDockerContentView2.setBackgroundColor(iIntValue);
                }
            }
            if (C1417210mz1.LIZJ(LLLIL()) && (chooseMusicDockerContentView = c1457840o2Y.getChooseMusicDockerContentView()) != null) {
                if (!C862000Xri.LIZ()) {
                    i = R.attr.e4;
                }
                C384050F3z c384050F3z = new C384050F3z();
                c384050F3z.LIZIZ = Integer.valueOf(i);
                c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(22));
                chooseMusicDockerContentView.setBackground(c384050F3z.LIZ(chooseMusicDockerContentView.getContext()));
            }
            C1457860o2a c1457860o2aLLLIIIIL = LLLIIIIL();
            if (c1457860o2aLLLIIIIL != null) {
                int i2 = c1457860o2aLLLIIIIL.LIZLLL;
                View chooseMusicDockerContentView3 = c1457840o2Y.getChooseMusicDockerContentView();
                if (chooseMusicDockerContentView3 != null) {
                    C426750GoL.LJIIIZ(chooseMusicDockerContentView3, null, Integer.valueOf(i2), null, null, false, 29);
                }
            }
            c1457840o2Y.setChooseMusicClickContainer(c1457840o2Y.findViewById(R.id.dst));
            c1457840o2Y.setChooseMusicTextView((C427250Gp9) c1457840o2Y.findViewById(R.id.tv_top_text));
            TuxIconView tuxIconView = (TuxIconView) c1457840o2Y.findViewById(R.id.dsq);
            tuxIconView.setIconRes(c1457840o2Y.getMusicIcon());
            c1457840o2Y.setChooseMusicIconView(tuxIconView);
            c1457840o2Y.setCancelMusicClickContainer(c1457840o2Y.findViewById(R.id.dsj));
            c1457840o2Y.setCancelMusicIconView((TuxIconView) c1457840o2Y.findViewById(R.id.dsk));
            c1457840o2Y.setChooseMusicDockerDivider(c1457840o2Y.findViewById(R.id.dso));
            c1457840o2Y.setChooseMusicClickContainerNew(c1457840o2Y.findViewById(R.id.dsv));
            c1457840o2Y.setChooseMusicClickContainerNewAnimation(c1457840o2Y.findViewById(R.id.dsw));
            c1457840o2Y.setChooseMusicDockerContentViewAnimation(c1457840o2Y.findViewById(R.id.dsm));
            c1457840o2Y.setChooseMusicDockerContentViewAnimationGroup(c1457840o2Y.findViewById(R.id.dsn));
            c1457840o2Y.setSpaceView(c1457840o2Y.findViewById(R.id.ch3));
            c1457840o2Y.setChooseMusicTextViewAnimation((TuxTextView) c1457840o2Y.findViewById(R.id.tv_top_text_animation));
            c1457840o2Y.setChooseMusicIconViewAnimation((TuxIconView) c1457840o2Y.findViewById(R.id.dsr));
            c1457840o2Y.setLoadingMusicLottie((C1295960jpS) c1457840o2Y.findViewById(R.id.lbq));
            C1457860o2a c1457860o2aLLLIIIIL2 = LLLIIIIL();
            if (c1457860o2aLLLIIIIL2 != null && (c572180McK = c1457860o2aLLLIIIIL2.LJI) != null) {
                Integer num2 = c572180McK.LIZ;
                if (num2 != null && (numLIZJ = C1308910kAL.LIZJ(num2.intValue(), c1457840o2Y.getContext())) != null) {
                    int iIntValue2 = numLIZJ.intValue();
                    View chooseMusicDockerContentView4 = c1457840o2Y.getChooseMusicDockerContentView();
                    if (chooseMusicDockerContentView4 != null) {
                        chooseMusicDockerContentView4.setBackgroundColor(iIntValue2);
                    }
                    View chooseMusicDockerDivider = c1457840o2Y.getChooseMusicDockerDivider();
                    if (chooseMusicDockerDivider != null) {
                        chooseMusicDockerDivider.setBackgroundColor(iIntValue2);
                    }
                }
                Integer num3 = c572180McK.LIZIZ;
                if (num3 != null) {
                    int iIntValue3 = num3.intValue();
                    C427250Gp9 chooseMusicTextView = c1457840o2Y.getChooseMusicTextView();
                    if (chooseMusicTextView != null) {
                        chooseMusicTextView.setTextColorRes(iIntValue3);
                    }
                    TuxIconView cancelMusicIconView = c1457840o2Y.getCancelMusicIconView();
                    if (cancelMusicIconView != null) {
                        cancelMusicIconView.setTintColorRes(iIntValue3);
                    }
                    TuxIconView chooseMusicIconView = c1457840o2Y.getChooseMusicIconView();
                    if (chooseMusicIconView != null) {
                        chooseMusicIconView.setTintColorRes(iIntValue3);
                    }
                }
            }
            LLLILZ();
        }
        C1457840o2Y c1457840o2Y2 = this.LLJILJILJ;
        if (c1457840o2Y2 != null) {
            c1457840o2Y2.LJ(EnumC1457890o2d.DARK_COLOR_WITHOUT_CANCEL_BUTTON);
        }
        C1457840o2Y c1457840o2Y3 = this.LLJILJILJ;
        if (c1457840o2Y3 != null) {
            c1457840o2Y3.LIZLLL();
        }
        C12WG.LIZJ(this, new ARunnableS122S0100000_22(this, 61));
    }

    @Override // X.C11E9
    public final <VM1 extends JediViewModel<S1>, S1 extends C004I, R> R withState(VM1 vm1, Function1<? super S1, ? extends R> function1) {
        return function1.invoke(vm1.FQ2());
    }

    @Override // com.bytedance.scene.Scene
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i;
        String str;
        SocialEditLayoutPreloadApi socialEditLayoutPreloadApi;
        View viewLIZ;
        if (C861960Xre.LIZ()) {
            i = R.layout.i8q;
        } else {
            i = R.layout.i8r;
        }
        if (C861960Xre.LIZ()) {
            str = "video_choose_music_scene_new";
        } else {
            str = "video_choose_music_scene_optimize_new";
        }
        if (!C1453840nw6.LJFF(LLLIL()) || (socialEditLayoutPreloadApi = (SocialEditLayoutPreloadApi) PluggableExtentionKt.pluggableSpi$default(SocialEditLayoutPreloadApi.class, false, false, false, 14, null)) == null || (viewLIZ = socialEditLayoutPreloadApi.LIZ(getSceneContext(), layoutInflater, i, viewGroup)) == null) {
            return ((ILayoutPreloadServiceForEditPage) ServiceManager.get().getService(ILayoutPreloadServiceForEditPage.class)).loadLayoutFiles(str, getSceneContext(), layoutInflater, i, viewGroup, false);
        }
        return viewLIZ;
    }

    @Override // X.C11E9
    public final <S extends C004I> InterfaceC420801kM subscribe(JediViewModel<S> jediViewModel, C1765020w20<S> c1765020w20, Function2<? super InterfaceC960503pD, ? super S, Unit> function2) {
        return C11EA.LJIIJJI(this, jediViewModel, c1765020w20, function2);
    }

    public static final void LLLILZLLLI(boolean z, int i, View view, TuxTextView tuxTextView) {
        if (view != null && tuxTextView != null) {
            AwS133S0201000_6 awS133S0201000_6 = new AwS133S0201000_6(i, view, tuxTextView, 5);
            if (z) {
                view.requestLayout();
                HandlerHook.viewPost(view, new ARunnableS75S0200000_6((Object) view, (Object) awS133S0201000_6, 62));
            } else {
                HandlerHook.viewPost(view, new ARunnableS104S0100000_4((Object) awS133S0201000_6, 56));
            }
        }
    }

    @Override // X.InterfaceC1166920gTK
    public final <S extends C004I, A> void selectNonNullSubscribe(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, C1765020w20<C11EC<A>> c1765020w20, Function2<? super InterfaceC1166920gTK, ? super A, Unit> function2) {
        C1170060gYO.LIZIZ(this, jediViewModel, interfaceC2217241BqE, c1765020w20, function2);
    }

    @Override // X.C11E9
    public final <S extends C004I, A> InterfaceC420801kM selectSubscribe(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, C1765020w20<C11EC<A>> c1765020w20, Function2<? super InterfaceC960503pD, ? super A, Unit> function2) {
        return C11EA.LJI(this, jediViewModel, interfaceC2217241BqE, c1765020w20, function2);
    }

    @Override // X.InterfaceC1166920gTK
    public final <S extends C004I, A> void subscribeEvent(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends C0LCS<? extends A>> interfaceC2217241BqE, C1765020w20<C11EC<C0LCS<A>>> c1765020w20, Function2<? super InterfaceC1166920gTK, ? super A, Unit> function2) {
        C1170060gYO.LIZLLL(this, jediViewModel, interfaceC2217241BqE, c1765020w20, function2);
    }

    @Override // X.C11E9
    public final <S extends C004I, A, B> InterfaceC420801kM selectSubscribe(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, C1765020w20<C11EF<A, B>> c1765020w20, InterfaceC1631620sYq<? super InterfaceC960503pD, ? super A, ? super B, Unit> interfaceC1631620sYq) {
        return C11EA.LJFF(this, jediViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, c1765020w20, interfaceC1631620sYq);
    }

    @Override // X.C11E9
    public final <S extends C004I, T> InterfaceC420801kM asyncSubscribe(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends AbstractC1252750ihl<? extends T>> interfaceC2217241BqE, C1765020w20<C11EC<AbstractC1252750ihl<T>>> c1765020w20, Function2<? super InterfaceC960503pD, ? super Throwable, Unit> function2, Function1<? super InterfaceC960503pD, Unit> function1, Function2<? super InterfaceC960503pD, ? super T, Unit> function22) {
        return C11EA.LIZ(this, jediViewModel, interfaceC2217241BqE, c1765020w20, function2, function1, function22);
    }

    @Override // X.C11E9
    public final <S extends C004I, A, B, C> InterfaceC420801kM selectSubscribe(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, C1765020w20<C1634100scq<A, B, C>> c1765020w20, InterfaceC1631630sYr<? super InterfaceC960503pD, ? super A, ? super B, ? super C, Unit> interfaceC1631630sYr) {
        return C11EA.LJ(this, jediViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, c1765020w20, interfaceC1631630sYr);
    }

    @Override // X.C11E9
    public final <S extends C004I, A, B, C, D> InterfaceC420801kM selectSubscribe(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, InterfaceC2217241BqE<S, ? extends D> interfaceC2217241BqE4, C1765020w20<C1644460stY<A, B, C, D>> c1765020w20, InterfaceC1685420txc<? super InterfaceC960503pD, ? super A, ? super B, ? super C, ? super D, Unit> interfaceC1685420txc) {
        return C11EA.LIZLLL(this, jediViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, interfaceC2217241BqE4, c1765020w20, interfaceC1685420txc);
    }
}
