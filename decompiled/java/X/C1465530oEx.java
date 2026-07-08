package X;

import android.content.Intent;
import android.view.View;
import androidx.lifecycle.LiveData;
import com.bytedance.als.LiveEvent;
import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackType;
import com.ss.android.ugc.aweme.creative.model.album.AlbumModel;
import com.ss.android.ugc.aweme.creative.model.edit.multiedit.MultiEditVideoStatusRecordData;
import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import com.ss.android.ugc.aweme.creative.model.music.MusicBuzModel;
import com.ss.android.ugc.aweme.creative.model.music.UnSelectMusic;
import com.ss.android.ugc.aweme.editSticker.model.StickerItemModel;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData;
import com.ss.android.ugc.aweme.effect.EffectPointModel;
import com.ss.android.ugc.aweme.im.sharepanel.api.util.IDMSendToFriendMenuActionHelper;
import com.ss.android.ugc.aweme.music.model.MusicBeanUtilKt;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.u4;
import com.ss.android.ugc.aweme.shortvideo.ui.TimeSpeedModelExtension;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS566S0100000_22;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0oEx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1465530oEx extends AbstractC2255721DQs<InterfaceC1453420nvQ> implements InterfaceC1453420nvQ, InterfaceC379610EuV {
    public static final C1465620oF6 LLJJJIL;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJJ;
    public static final int LLJJJJJIL;
    public final C1DRG LL;
    public final InterfaceC1453420nvQ LLILLJJLI = this;
    public final InterfaceC1731706qJ LLILLL = C1664770tQJ.LIZ(getDiContainer(), VideoPublishEditModel.class, null);
    public final InterfaceC1731706qJ LLILZ = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1465600oF4.class, null);
    public final InterfaceC1731706qJ LLILZIL = C1664770tQJ.LIZ(getDiContainer(), AbstractC214814194y.class, null);
    public final InterfaceC1731706qJ LLILZLL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1451050nrb.class, null);
    public final InterfaceC1731706qJ LLIZ = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1453760nvy.class, null);
    public final C01GW LLIZLLLIL = C452501pT.LIZIZ(new AwS566S0100000_22(this, 525));
    public final C01GW LLJ = C452501pT.LIZIZ(new AwS566S0100000_22(this, 534));
    public final C560530Lyd<Unit> LLJI;
    public final LiveEvent<Unit> LLJIJIL;
    public final C560530Lyd<Unit> LLJILJIL;
    public final C560530Lyd<Unit> LLJILJILJ;
    public final C560530Lyd<Unit> LLJILLL;
    public final LiveEvent<Unit> LLJJ;
    public final LiveEvent<Unit> LLJJI;
    public final LiveEvent<Unit> LLJJIII;
    public final C560530Lyd<Unit> LLJJIJI;
    public final LiveEvent<Unit> LLJJIJIIJIL;
    public final C560530Lyd<Unit> LLJJIJIL;
    public final LiveEvent<Unit> LLJJJ;

    /* JADX WARN: Type inference failed for: r0v11, types: [X.0oF6] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1465530oEx.class, "editModel", "getEditModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0);
        C13LE.LIZ.getClass();
        LLJJJJ = new InterfaceC2217461Bqa[]{c2217381BqS, new C2217381BqS(C1465530oEx.class, "judge", "getJudge()Lcom/ss/android/ugc/gamora/editor/exit/IJudgeHasEditedForImageMode;", 0), new C2217381BqS(C1465530oEx.class, "rootScene", "getRootScene()Lcom/ss/android/ugc/aweme/adaptation/TikTokSAARootGroupScene;", 0), new C2217381BqS(C1465530oEx.class, "editPreviewApi", "getEditPreviewApi()Lcom/ss/android/ugc/aweme/image/preview/ImageEditPreviewApi;", 0), new C2217381BqS(C1465530oEx.class, "editAudioCopyrightDetectApi", "getEditAudioCopyrightDetectApi()Lcom/ss/android/ugc/gamora/editor/audio/copyrightdetect/EditAudioCopyrightDetectApi;", 0)};
        LLJJJIL = new Object() { // from class: X.0oF6
        };
        LLJJJJJIL = 8;
    }

    @Override // X.InterfaceC1453420nvQ
    public void Of1() {
    }

    @Override // X.InterfaceC1453420nvQ
    public void Si1() {
    }

    @Override // X.InterfaceC1453420nvQ
    public void dC1() {
    }

    @Override // X.InterfaceC1453420nvQ
    public void oE() {
    }

    private final C0M81 H2() {
        return (C0M81) this.LLJ.getValue();
    }

    private final C0M7N Z1() {
        return (C0M7N) this.LLIZLLLIL.getValue();
    }

    private final InterfaceC1465600oF4 w2() {
        return (InterfaceC1465600oF4) this.LLILZ.getValue(this, LLJJJJ[1]);
    }

    public final AbstractC214814194y G2() {
        return (AbstractC214814194y) this.LLILZIL.getValue(this, LLJJJJ[2]);
    }

    public final InterfaceC1453760nvy X1() {
        return (InterfaceC1453760nvy) this.LLIZ.getValue(this, LLJJJJ[4]);
    }

    public final VideoPublishEditModel getEditModel() {
        return (VideoPublishEditModel) this.LLILLL.getValue(this, LLJJJJ[0]);
    }

    public final InterfaceC1451050nrb o2() {
        return (InterfaceC1451050nrb) this.LLILZLL.getValue(this, LLJJJJ[3]);
    }

    private final void W2() {
        ArrayList<TimeSpeedModelExtension> arrayList;
        List<TextStickerData> listLr0;
        LiveData<InterfaceC1452170ntP> liveDataG;
        InterfaceC1452170ntP value;
        if (C295830Bif.LIZ()) {
            InterfaceC1451050nrb interfaceC1451050nrbO2 = o2();
            if (interfaceC1451050nrbO2 != null && (liveDataG = interfaceC1451050nrbO2.g()) != null && (value = liveDataG.getValue()) != null) {
                value.getDuration();
            }
            ArrayList arrayList2 = new ArrayList();
            InterfaceC1461660o8i interfaceC1461660o8iLIZJ = ((InterfaceC1455850nzL) getDiContainer().LJII(InterfaceC1455850nzL.class, null)).AT().LIZJ();
            if (interfaceC1461660o8iLIZJ != null && (listLr0 = interfaceC1461660o8iLIZJ.lr0()) != null) {
                Iterator<TextStickerData> it2 = listLr0.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(it2.next());
                }
            }
            ArrayList arrayList3 = new ArrayList();
            arrayList3.add(new InterfaceC349110DmP() { // from class: X.0MHm
                public MusicBuzModel LIZ;
                public Float LIZIZ;
                public C565930MHn LIZJ;
                public List<C565900MHk> LIZLLL = new ArrayList();
                public UnSelectMusic LJ;

                @Override // X.InterfaceC349110DmP
                public final void LIZ() {
                    this.LIZ = null;
                    this.LIZJ = null;
                    this.LIZLLL.clear();
                }

                @Override // X.InterfaceC349110DmP
                public final void LJI(VideoPublishEditModel videoPublishEditModel, NLEModel nLEModel, List<TextStickerData> list, int i) {
                }

                @Override // X.InterfaceC349110DmP
                public final void LJII(NLEEditor nLEEditor) {
                }

                @Override // X.InterfaceC349110DmP
                public final boolean LJIIIIZZ() {
                    return false;
                }

                @Override // X.InterfaceC349110DmP
                public final void LJIIIZ(Function1<? super StickerItemModel, Unit> function1) {
                }

                @Override // X.InterfaceC349110DmP
                public final void LJIIJ(Function1<? super List<? extends EffectPointModel>, Unit> function1) {
                }

                @Override // X.InterfaceC349110DmP
                public final void LJIIJJI(Function1<? super TextStickerData, Unit> function1) {
                }

                @Override // X.InterfaceC349110DmP
                public final void LJIIL(NLETrack nLETrack, VideoPublishEditModel videoPublishEditModel) {
                }

                @Override // X.InterfaceC349110DmP
                public final List<TextStickerData> LLLLLLZZ() {
                    return null;
                }

                @Override // X.InterfaceC349110DmP
                public final boolean LJ() {
                    return this.LIZ != null;
                }

                @Override // X.InterfaceC349110DmP
                public final boolean LJFF() {
                    return this.LIZ != null;
                }

                @Override // X.InterfaceC349110DmP
                public final NLETrackType LIZIZ() {
                    return NLETrackType.AUDIO;
                }

                @Override // X.InterfaceC349110DmP
                public final void LIZLLL(VideoPublishEditModel videoPublishEditModel) {
                    AVMusic aVMusicExtractAVMusic = MusicBeanUtilKt.extractAVMusic(videoPublishEditModel.creativeModel.musicBuzModel);
                    if (aVMusicExtractAVMusic != null && C1533950q1J.LJ(aVMusicExtractAVMusic.getMusicId())) {
                        this.LIZ = (MusicBuzModel) C571330Max.LIZ(videoPublishEditModel.creativeModel.musicBuzModel);
                        this.LIZIZ = Float.valueOf(videoPublishEditModel.getMusicVolume());
                        String mMusicPath = videoPublishEditModel.getMMusicPath();
                        this.LIZJ = new C565930MHn(videoPublishEditModel.getMusicVolume(), videoPublishEditModel.getMMusicStart(), videoPublishEditModel.getMMusicEnd(), videoPublishEditModel.getVideoLength(), mMusicPath);
                    }
                    this.LJ = videoPublishEditModel.creativeModel.musicBuzModel.unSelectMusic;
                    this.LIZLLL = C565890MHj.LIZ(videoPublishEditModel);
                }

                @Override // X.InterfaceC349110DmP
                public final void LIZJ(VideoPublishEditModel videoPublishEditModel, int i) {
                    String str;
                    if (((ArrayList) this.LIZLLL).isEmpty()) {
                        return;
                    }
                    List<C565900MHk> list = this.LIZLLL;
                    ArrayList arrayList4 = new ArrayList(C15438062q.LJIJJ(list, 10));
                    Iterator it3 = ((ArrayList) list).iterator();
                    while (it3.hasNext()) {
                        arrayList4.add(new C0VSJ(((C565900MHk) it3.next()).LIZ).getName());
                    }
                    List listLIZ = C565890MHj.LIZ(videoPublishEditModel);
                    ArrayList arrayList5 = new ArrayList(C15438062q.LJIJJ(listLIZ, 10));
                    Iterator it4 = ((ArrayList) listLIZ).iterator();
                    while (it4.hasNext()) {
                        arrayList5.add(new C0VSJ(((C565900MHk) it4.next()).LIZ).getName());
                    }
                    if (!Intrinsics.LJFF(arrayList5, arrayList4)) {
                        LIZ();
                        return;
                    }
                    AVMusic aVMusicExtractAVMusic = MusicBeanUtilKt.extractAVMusic(videoPublishEditModel.creativeModel.musicBuzModel);
                    if (aVMusicExtractAVMusic != null && C1533950q1J.LJ(aVMusicExtractAVMusic.getMusicId())) {
                        LIZ();
                        return;
                    }
                    UnSelectMusic unSelectMusic = this.LJ;
                    if (unSelectMusic != null) {
                        str = unSelectMusic.creationId;
                    } else {
                        str = null;
                    }
                    if (Intrinsics.LJFF(str, videoPublishEditModel.getCreationId())) {
                        MusicBuzModel musicBuzModel = videoPublishEditModel.creativeModel.musicBuzModel;
                        UnSelectMusic unSelectMusic2 = this.LJ;
                        if (unSelectMusic2 != null) {
                            unSelectMusic2.changeMaterial = Boolean.FALSE;
                        } else {
                            unSelectMusic2 = null;
                        }
                        musicBuzModel.unSelectMusic = unSelectMusic2;
                        if (this.LIZ == null) {
                            C1452640nuA.LJII(null, false, musicBuzModel);
                        }
                    }
                    MusicBuzModel musicBuzModel2 = this.LIZ;
                    if (musicBuzModel2 != null) {
                        videoPublishEditModel.creativeModel.musicBuzModel = musicBuzModel2;
                        videoPublishEditModel.refreshOldFieldIfNeeded();
                    }
                    Float f = this.LIZIZ;
                    if (f != null) {
                        videoPublishEditModel.setMusicVolume(f.floatValue());
                    }
                    C565930MHn c565930MHn = this.LIZJ;
                    if (c565930MHn != null) {
                        videoPublishEditModel.setMMusicPath(c565930MHn.LIZ);
                        videoPublishEditModel.setMMusicStart(c565930MHn.LIZIZ);
                        videoPublishEditModel.setMMusicEnd(c565930MHn.LIZJ);
                        videoPublishEditModel.setMusicVolume(c565930MHn.LIZLLL);
                        videoPublishEditModel.setVideoLength(c565930MHn.LJ);
                    }
                }
            });
            VideoPublishEditModel editModel = getEditModel();
            C1452150ntN.LIZLLL();
            C1452150ntN.LIZ = editModel.getCreationId();
            C1452150ntN.LIZIZ = editModel.creativeModel.editModel.showFirstTimeAnim;
            ArrayList arrayList4 = (ArrayList) C1452150ntN.LIZJ;
            arrayList4.clear();
            arrayList4.addAll(arrayList3);
            MultiEditVideoStatusRecordData multiEditVideoRecordData = editModel.getMultiEditVideoRecordData();
            if (multiEditVideoRecordData != null && (arrayList = multiEditVideoRecordData.originalSegments) != null) {
                Iterator<TimeSpeedModelExtension> it3 = arrayList.iterator();
                while (it3.hasNext()) {
                    String createId = it3.next().getCreateId();
                    if (createId != null) {
                        C1452150ntN.LIZLLL.add(createId);
                    }
                }
            }
            Iterator it4 = ((ArrayList) C1452150ntN.LIZJ).iterator();
            while (it4.hasNext()) {
                ((InterfaceC349110DmP) it4.next()).LIZLLL(editModel);
            }
            this.LLJJIJIL.LJIIJ(Unit.LIZ);
        }
    }

    private final void c3() {
        if (C568750MSj.LIZIZ(getEditModel())) {
            i3();
        } else {
            H2().LJIIIZ(new AwS566S0100000_22(this, 530), new AwS566S0100000_22(this, 531), (u4.LJIIZILJ(getEditModel()) || C1428470nHB.LJLZ(getEditModel()) || C1428470nHB.LLIIIJ(getEditModel())) ? false : true);
        }
    }

    private final void i3() {
        H2().LJIIIZ(new AwS566S0100000_22(this, 532), new AwS566S0100000_22(this, 533), false);
    }

    @Override // X.InterfaceC1453420nvQ
    public boolean A8() {
        C570010MXf c570010MXf = Z1().LJIILL;
        return c570010MXf != null && c570010MXf.LIZJ();
    }

    @Override // X.InterfaceC1453420nvQ
    public void MO0() {
        W2();
        if (C568750MSj.LIZIZ(getEditModel())) {
            this.LLJILLL.LJIIJ(Unit.LIZ);
        } else {
            this.LLJJIJI.LJIIJ(Unit.LIZ);
        }
    }

    @Override // X.InterfaceC1453420nvQ
    public boolean Q2() {
        return w2().Q2();
    }

    public final void T2() {
        Intent intent = G2().requireAppCompatActivity().getIntent();
        if (intent != null) {
            intent.putExtra("extra_return_to_publish", true);
        }
        MO0();
    }

    @Override // X.InterfaceC1453420nvQ
    public void cG0() {
        C570010MXf c570010MXf = Z1().LJIILL;
        if (c570010MXf != null) {
            c570010MXf.LIZIZ();
        }
    }

    public final void em() {
        getEditModel().creativeModel.draftInfoModel.fromDraftPopup = true;
        this.LLJI.LJIIJ(Unit.LIZ);
    }

    @Override // X.InterfaceC1453420nvQ
    public void iZ0() {
        if (getEditModel().getFromPublishPageEditBtn()) {
            Z1().LJI();
        } else {
            em();
        }
    }

    @Override // X.InterfaceC1453420nvQ
    public void nU1() {
        C0M81 c0m81H2 = H2();
        c0m81H2.getClass();
        c0m81H2.LJI(false, true, false, "editor_pro_add_more", new AwS566S0100000_22(c0m81H2, 523), new AwS566S0100000_22(c0m81H2, 524));
    }

    @Override // X.AbstractC2255721DQs
    public void onPause() {
        super.onPause();
        IDMSendToFriendMenuActionHelper.LIZ.getClass();
        IDMSendToFriendMenuActionHelper iDMSendToFriendMenuActionHelperLIZ = C380260EvY.LIZ();
        if (iDMSendToFriendMenuActionHelperLIZ != null) {
            iDMSendToFriendMenuActionHelperLIZ.LIZJ(false);
        }
    }

    @Override // X.AbstractC2255721DQs
    public void onResume() {
        super.onResume();
        IDMSendToFriendMenuActionHelper.LIZ.getClass();
        IDMSendToFriendMenuActionHelper iDMSendToFriendMenuActionHelperLIZ = C380260EvY.LIZ();
        if (iDMSendToFriendMenuActionHelperLIZ != null) {
            iDMSendToFriendMenuActionHelperLIZ.LIZJ(true);
            iDMSendToFriendMenuActionHelperLIZ.LIZLLL();
        }
    }

    @Override // X.InterfaceC1453420nvQ
    public boolean yV0() {
        return w2().Q2();
    }

    @Override // X.InterfaceC1453420nvQ
    public LiveEvent<Unit> J30() {
        return this.LLJJIII;
    }

    @Override // X.InterfaceC1453420nvQ
    public LiveEvent<Unit> LLLLIILLL() {
        return this.LLJIJIL;
    }

    @Override // X.InterfaceC1453420nvQ
    public LiveEvent<Unit> TK2() {
        return this.LLJJ;
    }

    public InterfaceC1453420nvQ W1() {
        return this.LLILLJJLI;
    }

    @Override // X.InterfaceC1453420nvQ
    public LiveEvent<Unit> Yl2() {
        return this.LLJJJ;
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        return this.LLILLJJLI;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LL;
    }

    @Override // X.InterfaceC1453420nvQ
    public LiveEvent<Unit> lv2() {
        return this.LLJJIJIIJIL;
    }

    @Override // X.InterfaceC1453420nvQ
    public LiveEvent<Unit> qc0() {
        return this.LLJJI;
    }

    @Override // X.InterfaceC1453420nvQ
    public void yO0() {
        MO0();
    }

    public C1465530oEx(C1DRG c1drg) {
        this.LL = c1drg;
        C560530Lyd<Unit> c560530Lyd = new C560530Lyd<>();
        this.LLJI = c560530Lyd;
        this.LLJIJIL = c560530Lyd;
        C560530Lyd<Unit> c560530Lyd2 = new C560530Lyd<>();
        this.LLJILJIL = c560530Lyd2;
        C560530Lyd<Unit> c560530Lyd3 = new C560530Lyd<>();
        this.LLJILJILJ = c560530Lyd3;
        C560530Lyd<Unit> c560530Lyd4 = new C560530Lyd<>();
        this.LLJILLL = c560530Lyd4;
        this.LLJJ = c560530Lyd2;
        this.LLJJI = c560530Lyd3;
        this.LLJJIII = c560530Lyd4;
        C560530Lyd<Unit> c560530Lyd5 = new C560530Lyd<>();
        this.LLJJIJI = c560530Lyd5;
        this.LLJJIJIIJIL = c560530Lyd5;
        C560530Lyd<Unit> c560530Lyd6 = new C560530Lyd<>();
        this.LLJJIJIL = c560530Lyd6;
        this.LLJJJ = c560530Lyd6;
    }

    private final void m3(View view) {
        C21566919al c21566919al = new C21566919al(G2().requireFragmentActivity());
        c21566919al.LIZ(2131830679);
        c21566919al.LJII(2131830680, null, false);
        c21566919al.LJIIJ(2131830681, new DialogInterfaceOnClickListenerC1466630oGj(this, 2), false);
        new C21566519ah(c21566919al).LIZLLL();
    }

    @Override // X.InterfaceC1453420nvQ
    public boolean g72(View view) {
        InterfaceC1465590oF3 interfaceC1465590oF3;
        Z1().LIZIZ = view;
        if (C301590Brx.LIZ()) {
            H2().LIZIZ = view;
        }
        w2().LIZ();
        C548590LfN.LIZ.getClass();
        if (C548590LfN.LIZIZ().LJII(getEditModel().creativeModel)) {
            em();
            return true;
        }
        if (getEditModel().creativeModel.imageEditModel.enterFromImagePublishPreview) {
            if (C1428470nHB.LLIIIILZ(getEditModel()) && C07CK.LIZ()) {
                if (!w2().Q2()) {
                    T2();
                    return true;
                }
                m3(view);
                return true;
            }
            Z1().LJI();
            return true;
        }
        if (C571290Mat.LIZJ(getEditModel())) {
            MO0();
            return true;
        }
        if (C1428470nHB.LJJLIL(getEditModel()) && !C1428470nHB.LJJJZ(getEditModel())) {
            if (w2().Q2()) {
                if (C0A16.LIZ()) {
                    c3();
                    return true;
                }
                getEditModel().creativeModel.draftInfoModel.fromDraftPopup = true;
                this.LLJILJIL.LJIIJ(Unit.LIZ);
                return true;
            }
            if (C0C64.LJIILLIIL().LJIIIZ(31744, "studio_editor_tab_auto_save_draft", true, true)) {
                getEditModel().creativeModel.draftInfoModel.fromDraftPopup = true;
                this.LLJILJIL.LJIIJ(Unit.LIZ);
                return true;
            }
            MO0();
            return true;
        }
        if (C301590Brx.LIZ()) {
            if (!C1428470nHB.LJJJZ(getEditModel()) && ((((Boolean) C284500BDc.LIZ.getValue()).booleanValue() && C1402930mbz.LJ(getEditModel())) || w2().LIZIZ() || C1428470nHB.LJJLIIIJJIZ(getEditModel()))) {
                c3();
                return true;
            }
            if (!C1428470nHB.LJJJZ(getEditModel()) && !w2().LIZIZ()) {
                if (C1465550oEz.LIZ() != 0 && u4.LJIIZILJ(getEditModel())) {
                    AlbumModel albumModel = getEditModel().creativeModel.albumModel;
                    if (C1428520nHG.LJLIIL(getEditModel())) {
                        if (albumModel.videoCount > 0) {
                            interfaceC1465590oF3 = C1465670oFB.LIZ;
                        } else {
                            interfaceC1465590oF3 = C1465640oF8.LIZ;
                        }
                    } else if (C1428520nHG.LJJLIIIJJIZ(getEditModel())) {
                        interfaceC1465590oF3 = C1465630oF7.LIZ;
                    } else if (C1428520nHG.LJJJZ(getEditModel())) {
                        interfaceC1465590oF3 = C1465660oFA.LIZ;
                    }
                    if (interfaceC1465590oF3 != null && C1465550oEz.LIZIZ(interfaceC1465590oF3)) {
                        c3();
                        return true;
                    }
                }
                MO0();
                return true;
            }
        }
        if (!getEditModel().mIsFromDraft) {
            Z1().LJIILIIL(R.raw.icon_trash_bin, 2131829841, new AwS566S0100000_22(this, 526), new AwS566S0100000_22(this, 527));
            return true;
        }
        if (!w2().LIZIZ()) {
            MO0();
            return true;
        }
        Z1().LJIILIIL(R.raw.icon_x_mark_circle, 2131829833, new AwS566S0100000_22(this, 528), new AwS566S0100000_22(this, 529));
        return true;
    }

    @Override // X.InterfaceC1453420nvQ
    public void vR(boolean z, String str, String str2) {
        Z1().LJIIIZ(z, "clickPopupFromEdit", "video_edit_page");
    }

    @Override // X.InterfaceC1453420nvQ
    public void Ys0(String str, int i, Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03) {
        Z1().LJIIIIZZ(str, i, function0, function02, function03);
    }

    @Override // X.InterfaceC1453420nvQ
    public void Za0(String str, boolean z, String str2, Function0<Unit> function0, Function0<Unit> function02) {
        Z1().LJIIJJI(str, z, str2, function0, function02);
    }

    @Override // X.InterfaceC1453420nvQ
    public void iz(String str, int i, Function1<? super String, Unit> function1, Function1<? super VideoPublishEditModel, Unit> function12, Function0<Unit> function0) {
        Z1().LJIIJ(str, function1, function12, function0);
    }
}
