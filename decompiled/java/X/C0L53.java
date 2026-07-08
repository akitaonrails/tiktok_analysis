package X;

import android.app.Activity;
import android.app.Application;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.autocut.s;
import com.ss.android.ugc.aweme.commercialize.media.api.service.ICommerceMediaService;
import com.ss.android.ugc.aweme.creative.model.AutoCutMediaModel;
import com.ss.android.ugc.aweme.creative.model.AutoCutModel;
import com.ss.android.ugc.aweme.creative.model.AutoCutThemeData;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.NowsShootModel;
import com.ss.android.ugc.aweme.creative.model.ReusedMusicInfo;
import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import com.ss.android.ugc.aweme.creative.model.music.FlowDataMusicInfo;
import com.ss.android.ugc.aweme.creative.model.music.MusicBuzModel;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.music.model.MusicBeanUtilKt;
import com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS234S0000000_5;
import kotlin.jvm.internal.AwS35S1400000_8;
import kotlin.jvm.internal.AwS409S0200000_8;
import kotlin.jvm.internal.AwS62S0210000_8;
import kotlin.jvm.internal.AwS90S0110000_2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0L53, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0L53 {
    public static final C0L53 LIZ = new C0L53();

    public static void LIZ(List list, final VideoPublishEditModel videoPublishEditModel, final C1DRG c1drg, Activity activity) {
        boolean z;
        AutoCutThemeData autoCutThemeDataLIZ;
        String musicId;
        final boolean z2;
        final C0L4W c0l4w;
        String strLJFF;
        boolean zIsSelectedByAuto;
        boolean z3;
        final boolean z4;
        InterfaceC1455860nzM interfaceC1455860nzM;
        MutableLiveData<C1452730nuJ> mutableLiveDataVW1;
        s.LIZ.getClass();
        if (s.LJJIJIL()) {
            CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
            creativeToastBuilder.messageRes(2131829438);
            C1390380mHk.LIZ(activity, 6001, creativeToastBuilder);
            return;
        }
        if (!list.isEmpty() && videoPublishEditModel.getCreativeInfo() != null) {
            final AutoCutModel autoCutModel = videoPublishEditModel.creativeModel.autoCutModel;
            if (c1drg != null && (interfaceC1455860nzM = (InterfaceC1455860nzM) c1drg.LJIIL(null, InterfaceC1455860nzM.class)) != null && (mutableLiveDataVW1 = interfaceC1455860nzM.vW1()) != null) {
                mutableLiveDataVW1.postValue(C1452730nuJ.LIZJ());
            }
            C1419810n3D.LIZJ(new C1417870n05(videoPublishEditModel.mShootWay, videoPublishEditModel.getCreationId()));
            final ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                MediaModel mediaModel = (MediaModel) it2.next();
                C526710KlB c526710KlB = AutoCutMediaModel.Companion;
                Application application = C0CHQ.LIZ;
                c526710KlB.getClass();
                AutoCutMediaModel autoCutMediaModelLIZ = C526710KlB.LIZ(application, mediaModel);
                s.LJJLIIJ(autoCutMediaModelLIZ);
                arrayList.add(autoCutMediaModelLIZ);
            }
            videoPublishEditModel.creativeModel.autoCutModel.curMediaList = C1416110mxF.LIZ(arrayList);
            final AVMusic aVMusicExtractAVMusic = MusicBeanUtilKt.extractAVMusic(videoPublishEditModel.creativeModel.musicBuzModel);
            s sVar = s.LIZ;
            String str = videoPublishEditModel.mShootWay;
            String strLIZIZ = C1412490mrP.LIZIZ(videoPublishEditModel);
            FlowDataMusicInfo flowDataMusicInfo = videoPublishEditModel.getCreativeFlowData().getFlowDataMusicInfo();
            if (flowDataMusicInfo != null && flowDataMusicInfo.isSelectedByAuto()) {
                z = true;
            } else {
                z = false;
            }
            MusicBuzModel musicBuzModel = videoPublishEditModel.creativeModel.musicBuzModel;
            sVar.getClass();
            final boolean zLJIIIZ = s.LJIIIZ(aVMusicExtractAVMusic, false, str, strLIZIZ, z, musicBuzModel);
            if (zLJIIIZ && aVMusicExtractAVMusic != null) {
                C1417900n08 c1417900n08 = AutoCutThemeData.Companion;
                MusicModel musicModelLIZ = C389120FNm.LIZ(aVMusicExtractAVMusic);
                C0MJ9 c0mj9 = C0MJ9.AUTO_CUT;
                int value = EnumC1412640mre.DESIGNER_FIXED_TEMPLATE.getValue();
                AFwS234S0000000_5 aFwS234S0000000_5LJIJJLI = s.LJIJJLI(true);
                aVMusicExtractAVMusic.getMatchedPGCSoundInfo();
                c1417900n08.getClass();
                autoCutThemeDataLIZ = C1417900n08.LIZ(musicModelLIZ, c0mj9, value, "", aFwS234S0000000_5LJIJJLI, true, null);
            } else {
                autoCutThemeDataLIZ = null;
            }
            String str2 = autoCutModel.clickFrom;
            if (str2 == null || str2.length() == 0) {
                autoCutModel.clickFrom = "edit_page";
            }
            if (aVMusicExtractAVMusic != null) {
                musicId = aVMusicExtractAVMusic.getMusicId();
            } else {
                musicId = null;
            }
            if (musicId == null && !Intrinsics.LJFF(videoPublishEditModel.mShootWay, "autocut_anchor")) {
                z2 = false;
            } else {
                z2 = true;
            }
            EnumC1418280n0k enumC1418280n0kLIZ = C1418290n0l.LIZ(autoCutModel.clickFrom);
            if (c1drg != null && (c0l4w = (C0L4W) c1drg.LJIIL(null, C0L4W.class)) != null) {
                String str3 = videoPublishEditModel.mShootWay;
                C1418200n0c c1418200n0c = new C1418200n0c(true, true, !zLJIIIZ, ((ICommerceMediaService) ServiceManager.get().getService(ICommerceMediaService.class)).LJ(), 0, null, arrayList, autoCutThemeDataLIZ, null, null, videoPublishEditModel.getCreativeInfo(), false, enumC1418280n0kLIZ, null, 101992);
                C1418320n0o c1418320n0o = new C1418320n0o(R.attr.bn, R.attr.ee, R.attr.eg, R.attr.ee, R.attr.ee, R.attr.dz);
                MediaModel mediaModel2 = (MediaModel) C13LP.LJJJLL(list);
                if (mediaModel2 != null) {
                    strLJFF = mediaModel2.LJFF();
                } else {
                    strLJFF = null;
                }
                C1418100n0S c1418100n0S = new C1418100n0S("image_edit_autocut", null, null, videoPublishEditModel.getCreationId(), videoPublishEditModel.mShootWay, C1428470nHB.LJIILIIL(videoPublishEditModel));
                String strLIZIZ2 = C1412490mrP.LIZIZ(videoPublishEditModel);
                FlowDataMusicInfo flowDataMusicInfo2 = videoPublishEditModel.getCreativeFlowData().getFlowDataMusicInfo();
                if (flowDataMusicInfo2 != null) {
                    zIsSelectedByAuto = flowDataMusicInfo2.isSelectedByAuto();
                } else {
                    zIsSelectedByAuto = true;
                }
                String strLJIILL = C1428470nHB.LJIILL(videoPublishEditModel);
                String strLJIILIIL = C1428470nHB.LJIILIIL(videoPublishEditModel);
                int iLJIIIZ = C580270MpN.LJIIIZ(videoPublishEditModel);
                final String str4 = videoPublishEditModel.mShootWay;
                final String creationId = videoPublishEditModel.getCreationId();
                boolean zLJFF = Intrinsics.LJFF(videoPublishEditModel.mShootWay, "autocut_anchor");
                String str5 = videoPublishEditModel.mShootWay;
                String strLIZIZ3 = C1412490mrP.LIZIZ(videoPublishEditModel);
                FlowDataMusicInfo flowDataMusicInfo3 = videoPublishEditModel.getCreativeFlowData().getFlowDataMusicInfo();
                if (flowDataMusicInfo3 != null && flowDataMusicInfo3.isSelectedByAuto()) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                final boolean zIsSelectedByAuto2 = true;
                final String strLJJIIJZLJL = s.LJJIIJZLJL(aVMusicExtractAVMusic, zLJFF, autoCutModel, str5, strLIZIZ3, z3, videoPublishEditModel.creativeModel.musicBuzModel);
                final boolean zLIZ = C1441980ncy.LIZ();
                final String strLIZIZ4 = C1412490mrP.LIZIZ(videoPublishEditModel);
                CreativeModel creativeModel = videoPublishEditModel.creativeModel;
                final boolean z5 = creativeModel.draftInfoModel.isDraft;
                NowsShootModel nowsShootModel = creativeModel.nowsShootModel;
                if (nowsShootModel != null && nowsShootModel.type == 0) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                C1414930mvL.LIZ.getClass();
                final int iLIZJ = C1414930mvL.LIZJ(videoPublishEditModel);
                FlowDataMusicInfo flowDataMusicInfo4 = videoPublishEditModel.getCreativeFlowData().getFlowDataMusicInfo();
                if (flowDataMusicInfo4 != null) {
                    zIsSelectedByAuto2 = flowDataMusicInfo4.isSelectedByAuto();
                }
                final AwS90S0110000_2 awS90S0110000_2 = new AwS90S0110000_2(aVMusicExtractAVMusic, zLJIIIZ, 2);
                final AwS62S0210000_8 awS62S0210000_8 = new AwS62S0210000_8(zLJIIIZ, aVMusicExtractAVMusic, videoPublishEditModel, 1);
                c0l4w.ob0(new C1418230n0f(c1418200n0c, c1418320n0o, zLJIIIZ, strLJFF, new AbstractC1417130myt(arrayList, autoCutModel, z2, zLJIIIZ, aVMusicExtractAVMusic, videoPublishEditModel, c0l4w, c1drg, str4, creationId, strLJJIIJZLJL, zLIZ, strLIZIZ4, z5, z4, iLIZJ, zIsSelectedByAuto2, awS90S0110000_2, awS62S0210000_8) { // from class: X.0myp
                    public final /* synthetic */ AutoCutModel LJJJ;
                    public final /* synthetic */ boolean LJJJI;
                    public final /* synthetic */ AVMusic LJJJIL;
                    public final /* synthetic */ VideoPublishEditModel LJJJJ;
                    public final /* synthetic */ C0L4W LJJJJI;
                    public final /* synthetic */ C1DRG LJJJJIZL;

                    @Override // X.AbstractC1417130myt, X.InterfaceC1418410n0x
                    public final void onCancel() {
                        super.onCancel();
                        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C576230Mir(this.LJJJ, null), 3);
                        this.LJJJJ.creativeModel.autoCutModel = new AutoCutModel(null, null, null, null, 0, 0, false, false, null, null, null, null, 0, 0, false, null, null, null, null, null, null, null, null, null, 0, null, false, null, 0, 0, null, false, false, null, null, -1, 7, null);
                    }

                    @Override // X.InterfaceC1418410n0x
                    public final void onExit() {
                        C01TT.LIZLLL(new AwS409S0200000_8(this.LJJJJI, this.LJJJJIZL, 27));
                    }

                    @Override // X.InterfaceC1418260n0i
                    public final void LJIIJ(int i) {
                        this.LJJIJ = i;
                        this.LJJIJIIJI = 0;
                        this.LJJI = System.currentTimeMillis();
                        this.LJJJ.asyncRenderModel.asyncRenderNecessaryDownloadCount = i;
                    }

                    @Override // X.AbstractC1417130myt, X.InterfaceC1418260n0i
                    public final void LJIIJJI(C1417310mzB c1417310mzB) {
                        Pair pair;
                        AVMusic aVMusic;
                        AutoCutThemeData autoCutThemeDataLIZLLL;
                        String str6;
                        super.LJIIJJI(c1417310mzB);
                        AutoCutModel autoCutModel2 = this.LJJJ;
                        autoCutModel2.musicLogId = c1417310mzB.LJIILJJIL;
                        autoCutModel2.optimizeLargeNLEId = C1443490nfP.LIZIZ(c1417310mzB.LJII);
                        this.LJJJ.applyScenario = EnumC1417150myv.IMAGE_EDIT.getCode();
                        AutoCutModel autoCutModel3 = this.LJJJ;
                        C0MJ9 c0mj92 = C0MJ9.AUTO_CUT;
                        C1416110mxF.LJIIIZ(autoCutModel3, 0, c0mj92, c1417310mzB.LIZJ, c1417310mzB.LJIIIZ, c1417310mzB.LJIIJ, c1417310mzB.LJIIJJI, C0L9M.FIRST_GENERATE_AUTOCUT.getValue(), c1417310mzB.LJIIL);
                        LJJ("AutoCutImageEditHelper", this.LJJJ);
                        if (this.LJJJI) {
                            AVMusic aVMusic2 = this.LJJJIL;
                            if (aVMusic2 != null) {
                                AutoCutModel autoCutModel4 = this.LJJJ;
                                if (aVMusic2.isPgc()) {
                                    str6 = "pgc";
                                } else {
                                    str6 = "ugc";
                                }
                                autoCutModel4.reuseMusicType = str6;
                            }
                            if (c1417310mzB.LIZIZ == 0 && c1417310mzB.LIZ == c0mj92 && (autoCutThemeDataLIZLLL = C1416110mxF.LIZLLL(this.LJJJ)) != null) {
                                autoCutThemeDataLIZLLL.templateType = c1417310mzB.LIZJ;
                            }
                        }
                        if (!C1428470nHB.LJJJZ(this.LJJJJ)) {
                            if (this.LJJJI && this.LJJJIL != null) {
                                this.LJJJ.reusedMusicInfo = new ReusedMusicInfo(this.LJJJIL.getMusicId(), C1412490mrP.LIZIZ(this.LJJJJ));
                            } else {
                                this.LJJJ.reusedMusicInfo = null;
                            }
                        }
                        if (this.LJJJI && (aVMusic = this.LJJJIL) != null) {
                            aVMusic.setMusicStartFromCut(0);
                            pair = new Pair(this.LJJJIL, this.LJJJJ.getMMusicPath());
                        } else {
                            pair = new Pair(c1417310mzB.LJ, c1417310mzB.LJFF);
                        }
                        AVMusic aVMusic3 = (AVMusic) pair.getFirst();
                        String str7 = (String) pair.getSecond();
                        C1452640nuA.LJII(aVMusic3, false, this.LJJJJ.creativeModel.musicBuzModel);
                        AutoCutThemeData autoCutThemeDataLJJIII = s.LJJIII(c1417310mzB.LIZIZ, this.LJJJJ.creativeModel.autoCutModel, c1417310mzB.LIZ);
                        if (autoCutThemeDataLJJIII != null) {
                            autoCutThemeDataLJJIII.nleLogId = c1417310mzB.LJIILL;
                        }
                        C01TT.LIZLLL(new AwS35S1400000_8(this.LJJJJI, c1417310mzB, this.LJJJJIZL, this.LJJJJ, str7, 0));
                    }

                    @Override // X.InterfaceC1418260n0i
                    public final void LJIJ(List<AutoCutMediaModel> list2) {
                        List<AutoCutMediaModel> list3 = this.LJJJ.mediaList;
                        list3.clear();
                        list3.addAll(list2);
                    }

                    @Override // X.InterfaceC1418260n0i
                    public final void LJI(NLEModel nLEModel, int i, AutoCutThemeData autoCutThemeData) {
                        this.LJJIJL = nLEModel;
                        s sVar2 = s.LIZ;
                        AutoCutModel autoCutModel2 = this.LJI;
                        sVar2.getClass();
                        s.LJJLIL(autoCutModel2, nLEModel);
                        LJJI("AutoCutImageEditHelper", this.LJJJ, i);
                    }

                    @Override // X.AbstractC1417130myt, X.InterfaceC1418260n0i
                    public final void LJII(List<AutoCutThemeData> list2, String str6, Scene scene, boolean z6) {
                        super.LJII(list2, str6, scene, z6);
                        this.LJJJ.templateList = new ArrayList(list2);
                        this.LJJJ.taskId = str6;
                    }

                    {
                        String str6 = "video_edit_page";
                        this.LJJJ = autoCutModel;
                        this.LJJJI = zLJIIIZ;
                        this.LJJJIL = aVMusicExtractAVMusic;
                        this.LJJJJ = videoPublishEditModel;
                        this.LJJJJI = c0l4w;
                        this.LJJJJIZL = c1drg;
                        Function1 function1 = null;
                        Integer numValueOf = Integer.valueOf(iLIZJ);
                        int i = 21536;
                    }
                }, c1418100n0S, str3, strLIZIZ2, zIsSelectedByAuto, strLJIILL, strLJIILIIL, Integer.valueOf(iLJIIIZ)));
            }
        }
    }
}
