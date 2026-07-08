package X;

import Y.AObjectS248S0100000_31;
import Y.ARunnableS131S0100000_31;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.FragmentManager;
import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.choosemusic.cutpanel.CutMultiMusicPanel;
import com.ss.android.ugc.aweme.choosemusic.cutpanel.CutMusicPanel;
import com.ss.android.ugc.aweme.creative.model.common.LogPbBean;
import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import com.ss.android.ugc.aweme.creative.model.music.MusicBuzModel;
import com.ss.android.ugc.aweme.creative.model.music.MusicObject;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.music.model.FullSongDetail;
import com.ss.android.ugc.aweme.music.model.MatchedSoundInfo;
import com.ss.android.ugc.aweme.music.model.MusicBeanUtilKt;
import com.ss.android.ugc.aweme.music.service.IMusicService;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.shortvideo.SafeHandler;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.model.MusicWaveBean;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS276S0000000_31;
import kotlin.jvm.internal.AwS397S0200000_31;
import kotlin.jvm.internal.AwS610S0100000_31;
import kotlin.jvm.internal.AwS680S0100000_31;

/* JADX INFO: renamed from: X.15Ki, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20502215Ki extends Scene implements InterfaceC1459220o4m, InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLILZLLLI;
    public final C1DRG LLJI;
    public final InterfaceC20502415Kk LLJIJIL;
    public final InterfaceC1464180oCm LLJILJIL;
    public final long LLJILJILJ;
    public int LLJILLL;
    public int LLJJ;
    public int LLJJI;
    public int LLJJIII;
    public boolean LLJJIJI;
    public boolean LLJJIJIIJIL;
    public MusicWaveBean LLJJIJIL;
    public List<MusicWaveBean> LLJJJ;
    public int LLJJJIL;
    public AVMusic LLJJJJ;
    public String LLJJJJJIL;
    public int LLJJJJLIIL;
    public float LLJJL;
    public boolean LLJJLIIIJLLLLLLLZ;
    public List<Integer> LLJL;
    public List<C15JF> LLJLIL;
    public final C15JM LLJLILLLLZIIL;
    public final SafeHandler LLJLL;
    public final C1664750tQH LLJLLIL;
    public final C1664740tQG LLJLLL;
    public final C1664750tQH LLJZ;
    public final C1664740tQG LLJZIJLIL;
    public final C1664740tQG LLL;
    public final C1664740tQG LLLF;
    public final C1664750tQH LLLFF;
    public final InterfaceC1452170ntP LLLFFI;
    public final NLEEditor LLLFZ;
    public boolean LLLI;
    public FrameLayout LLLII;
    public C15JN LLLIIII;
    public C15JN LLLIIIIL;
    public FragmentManager LLLIIIL;
    public C15JK LLLIIL;
    public final boolean LLLIILIL;
    public boolean LLLIL;
    public final ARunnableS131S0100000_31 LLLILZ;
    public boolean LLLILZJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C20502215Ki.class, "mVideoPublishModel", "getMVideoPublishModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C20502215Ki.class, "editVolumeV2Api", "getEditVolumeV2Api()Lcom/ss/android/ugc/gamora/editor/volume/EditVolumeV2Api;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(C20502215Ki.class, "editCutMusicApi", "getEditCutMusicApi()Lcom/ss/android/ugc/gamora/editor/cutmusic/EditCutMusicApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS4 = new C2217381BqS(C20502215Ki.class, "imageComponent", "getImageComponent()Lcom/ss/android/ugc/aweme/image/preview/ImageEditPreviewApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS5 = new C2217381BqS(C20502215Ki.class, "imageVideoFusionPreviewComponent", "getImageVideoFusionPreviewComponent()Lcom/ss/android/ugc/aweme/image/preview/ImageEditPreviewApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS6 = new C2217381BqS(C20502215Ki.class, "text2ImageChoosePreviewComponent", "getText2ImageChoosePreviewComponent()Lcom/ss/android/ugc/aweme/texttoimage/choose/Text2ImageChoosePreviewApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS7 = new C2217381BqS(C20502215Ki.class, "editPreviewApi", "getEditPreviewApi()Lcom/ss/android/ugc/aweme/shortvideo/preview/EditPreviewApi;", 0);
        c09r3.getClass();
        LLLILZLLLI = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3, c2217381BqS4, c2217381BqS5, c2217381BqS6, c2217381BqS7};
    }

    @Override // X.InterfaceC1459220o4m
    public final void ca(boolean z) {
    }

    @Override // X.InterfaceC1459220o4m
    public final void LJJIJIIJIL() {
        this.LLJLL.removeCallbacksAndMessages(null);
    }

    public final InterfaceC1457250o1b LLLII() {
        return (InterfaceC1457250o1b) this.LLJZ.getValue(this, LLLILZLLLI[2]);
    }

    public final InterfaceC1455860nzM LLLIIIIL() {
        return (InterfaceC1455860nzM) this.LLLFF.getValue(this, LLLILZLLLI[6]);
    }

    public final InterfaceC1451050nrb LLLIILIL() {
        return (InterfaceC1451050nrb) this.LLJZIJLIL.getValue(this, LLLILZLLLI[3]);
    }

    public final VideoPublishEditModel LLLIL() {
        return (VideoPublishEditModel) this.LLJLLIL.getValue(this, LLLILZLLLI[0]);
    }

    public final boolean LLLILZLLLI() {
        List<MusicBuzModel> list;
        return (!this.LLLIILIL || (list = LLLIL().creativeModel.musicBuzModel.extendMusicList) == null || list.isEmpty()) ? false : true;
    }

    public final void LLLJ() {
        InterfaceC1452170ntP interfaceC1452170ntP = this.LLLFFI;
        if (interfaceC1452170ntP != null) {
            C348100Dkm c348100DkmLIZIZ = C352130DrH.LIZIZ(interfaceC1452170ntP);
            if (c348100DkmLIZIZ == null) {
                "Required value was null.".toString();
                throw new IllegalArgumentException("Required value was null.");
            }
            List<C347660Dk4> listLJJJJLI = c348100DkmLIZIZ.LJFF().LJJJJLI();
            if (listLJJJJLI != null) {
                ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listLJJJJLI, 10));
                for (C347660Dk4 c347660Dk4 : listLJJJJLI) {
                    long j = c347660Dk4.LJII;
                    long j2 = c347660Dk4.LJ;
                    long j3 = c347660Dk4.LIZLLL;
                    long j4 = j2 - j3;
                    String str = c347660Dk4.LJIJJ;
                    String str2 = c347660Dk4.LIZIZ;
                    if (j2 <= 0) {
                        j2 = j3 + j4;
                    }
                    long j5 = c347660Dk4.LJFF;
                    long j6 = c347660Dk4.LJI;
                    arrayList.add(new C15JF(j3, j2, j5, j6 <= 0 ? j4 + j5 : j6, j, str, str2));
                }
                this.LLJLIL = arrayList;
                C15JN c15jn = this.LLLIIIIL;
                if (c15jn != null) {
                    c15jn.LB(this.LLLFFI.getDuration(), arrayList);
                }
            }
        }
    }

    public final void LLLJL() {
        C15JN c15jn;
        InterfaceC1452170ntP interfaceC1452170ntP;
        this.LLLIL = C1416310mxZ.LJJJJLI(LLLIL());
        View view = this.mView;
        if (view != null) {
            C786410Ut5.LJLLLLLL(0, view);
        }
        FragmentManager fragmentManager = this.LLLIIIL;
        if (fragmentManager != null && (!LLLILZLLLI() ? (c15jn = this.LLLIIII) != null : (c15jn = this.LLLIIIIL) != null)) {
            c15jn.xi();
            if (!LLLILZLLLI() && (interfaceC1452170ntP = this.LLLFFI) != null) {
                C348100Dkm c348100DkmLIZIZ = C352130DrH.LIZIZ(interfaceC1452170ntP);
                if (c348100DkmLIZIZ == null) {
                    "Required value was null.".toString();
                    throw new IllegalArgumentException("Required value was null.");
                }
                InterfaceC391070FUz interfaceC391070FUzLJFF = c348100DkmLIZIZ.LJFF();
                C347660Dk4 c347660Dk4LJJJJ = interfaceC391070FUzLJFF.LJJJJ();
                this.LLJJL = c347660Dk4LJJJJ != null ? c347660Dk4LJJJJ.LJIIJJI : 1.0f;
                C347660Dk4 c347660Dk4LJJJJ2 = interfaceC391070FUzLJFF.LJJJJ();
                boolean z = c347660Dk4LJJJJ2 != null ? c347660Dk4LJJJJ2.LJIIL : false;
                this.LLLI = z;
                if (!z) {
                    C347660Dk4 c347660Dk4LJJJJ3 = interfaceC391070FUzLJFF.LJJJJ();
                    if (c347660Dk4LJJJJ3 != null) {
                        c347660Dk4LJJJJ3.LJIIL = this.LLLI;
                    } else {
                        c347660Dk4LJJJJ3 = null;
                    }
                    interfaceC391070FUzLJFF.LJJJJLL(c347660Dk4LJJJJ3);
                }
            }
            c15jn.ec(this.LLJJL);
            c15jn.Df();
            if (LLLLIIIILLL()) {
                c15jn.Au(C1458070o2v.LJ(LLLIL().creativeModel.musicBuzModel), LLLLII());
                c15jn.o4(C1416310mxZ.LJJL(LLLIL(), 0, null, 3));
            }
            c15jn.LLLIIII(LLLIL().creativeModel.musicBuzModel.trimPointsList);
            VideoPublishEditModel videoPublishEditModel = (VideoPublishEditModel) this.LLJI.LJII(VideoPublishEditModel.class, null);
            C15JK c15jk = this.LLLIIL;
            String enterMethod = LLLII().getEnterMethod();
            MusicBuzModel musicBuzModel = videoPublishEditModel.creativeModel.musicBuzModel;
            c15jn.OJ(C15JK.LIZ(c15jk, null, null, null, null, null, enterMethod, musicBuzModel.musicSelectTab, musicBuzModel.musicRecTypeRecent, false, null, null, false, null, null, null, 268328959));
            c15jn.h5(this.LLJJLIIIJLLLLLLLZ);
            C19292410dm currentUser = C0CHQ.LIZ().getAccountService().getCurrentUser();
            if (currentUser != null) {
                currentUser.LIZLLL();
            }
            c15jn.GI();
            AVMusic aVMusic = this.LLJJJJ;
            if (aVMusic != null) {
                String strValueOf = String.valueOf(aVMusic.id);
                String lyricContent = aVMusic.getLyricContent();
                Integer numValueOf = Integer.valueOf(aVMusic.getLyricContentType());
                aVMusic.getPreviewStartTime();
                aVMusic.getDuration();
                c15jn.C6(new C20502815Ko(strValueOf, lyricContent, numValueOf));
            }
            c15jn.Of();
            if (!this.LLLILZJ) {
                c15jn.pm(fragmentManager, LLLIL().creativeModel.musicBuzModel.trimPointsList);
            }
            List<Integer> list = this.LLJL;
            if (list != null && !list.isEmpty()) {
                ((IMusicService) ServiceManager.get().getService(IMusicService.class)).LJJJLL();
                C15JJ.LJII(C15JK.LIZ(this.LLLIIL, null, null, null, null, null, LLLII().getEnterMethod(), LLLII().PJ2(), null, false, null, null, false, null, null, null, 268394495));
            }
        }
        this.LLJLL.post(this.LLLILZ);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ab A[PHI: r6
      0x00ab: PHI (r6v2 java.lang.Integer) = (r6v1 java.lang.Integer), (r6v1 java.lang.Integer), (r6v3 java.lang.Integer) binds: [B:26:0x00a3, B:28:0x00a9, B:24:0x0095] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // X.InterfaceC1459220o4m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJLIIIJJI() {
        /*
            Method dump skipped, instruction units count: 362
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20502215Ki.LJJLIIIJJI():void");
    }

    public final boolean LLLLII() {
        NLEModel nleModel;
        AbstractC1452680nuE abstractC1452680nuEGc;
        String strLJIIZILJ;
        if (!LLLLIIIILLL() || LLLIL().getEditMusicSyncMode() || ((nleModel = LLLIL().getNleModel()) != null && (strLJIIZILJ = C0EYQ.LJIIZILJ(nleModel)) != null && C1533950q1J.LJ(strLJIIZILJ))) {
            return false;
        }
        AVMusic aVMusicExtractAVMusic = MusicBeanUtilKt.extractAVMusic(LLLIL().creativeModel.musicBuzModel);
        if (aVMusicExtractAVMusic == null) {
            return true;
        }
        int iLIZ = C1465190oEP.LIZ(aVMusicExtractAVMusic, null);
        VideoPublishEditModel videoPublishEditModelLLLIL = LLLIL();
        InterfaceC1455860nzM interfaceC1455860nzMLLLIIIIL = LLLIIIIL();
        int iLJJL = C1416310mxZ.LJJL(videoPublishEditModelLLLIL, (interfaceC1455860nzMLLLIIIIL == null || (abstractC1452680nuEGc = interfaceC1455860nzMLLLIIIIL.gc()) == null) ? 0 : abstractC1452680nuEGc.LJJ().getDuration(), null, 2);
        return Math.abs(iLIZ - iLJJL) > 200 && iLIZ <= iLJJL;
    }

    public final boolean LLLLIIIILLL() {
        return C1458070o2v.LJFF() && !C1416310mxZ.LJJJJZ(LLLIL());
    }

    @Override // com.bytedance.scene.Scene
    public final void onPause() {
        super.onPause();
        this.LLJLL.removeCallbacksAndMessages(null);
    }

    @Override // com.bytedance.scene.Scene
    public final void onResume() {
        super.onResume();
        this.LLJLL.post(this.LLLILZ);
    }

    @Override // X.InterfaceC379610EuV
    public final C1DRG getDiContainer() {
        return this.LLJI;
    }

    @Override // X.InterfaceC1459220o4m
    public final void LLLIIII(List<Integer> list) {
        this.LLJL = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [X.15KJ, X.15Kl] */
    public final void LLLLIILL(final boolean z) {
        int iAw;
        List<Integer> listWj;
        ?? r3 = new C15KJ() { // from class: X.15Kl
            @Override // X.C15KJ
            public final void LIZ(List<MusicWaveBean> list) {
                C20502215Ki c20502215Ki = this.LIZ;
                c20502215Ki.LLLILZJ = false;
                c20502215Ki.LLJJJ = list;
                c20502215Ki.LLLLIL(c20502215Ki.LLJJIJIL, list, c20502215Ki.LLJJJIL, c20502215Ki.LLJJI);
                if (z) {
                    this.LIZ.LLLJL();
                }
            }

            @Override // X.C15KJ
            public final void LIZIZ(MusicWaveBean musicWaveBean) {
                C20502215Ki c20502215Ki = this.LIZ;
                c20502215Ki.LLLILZJ = false;
                c20502215Ki.LLJJIJIL = musicWaveBean;
                c20502215Ki.LLLLIL(musicWaveBean, c20502215Ki.LLJJJ, c20502215Ki.LLJJJIL, c20502215Ki.LLJJI);
                if (z) {
                    this.LIZ.LLLJL();
                }
            }
        };
        this.LLLILZJ = z;
        if (LLLILZLLLI()) {
            if (!this.LLJLIL.isEmpty()) {
                IMusicService iMusicService = (IMusicService) ServiceManager.get().getService(IMusicService.class);
                List<C15JF> list = this.LLJLIL;
                ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
                Iterator<C15JF> it2 = list.iterator();
                while (it2.hasNext()) {
                    arrayList.add(it2.next().LIZIZ);
                }
                C15JN c15jn = this.LLLIIIIL;
                if (c15jn == null || (listWj = c15jn.Wj()) == null) {
                    listWj = C13BV.INSTANCE;
                }
                iMusicService.LJJIZ(arrayList, listWj, r3);
                return;
            }
            return;
        }
        IMusicService iMusicService2 = (IMusicService) ServiceManager.get().getService(IMusicService.class);
        String str = this.LLJJJJJIL;
        C15JN c15jn2 = null;
        if (LLLLIIIILLL() && this.LLJJJIL < C1416310mxZ.LJJL(LLLIL(), 0, null, 3)) {
            C15JN c15jn3 = this.LLLIIII;
            if (c15jn3 == null) {
                c15jn3 = null;
            }
            iAw = (c15jn3.Aw() * this.LLJJJIL) / Math.min(this.LLJJ, C1416310mxZ.LJJL(LLLIL(), 0, null, 3));
        } else {
            int i = this.LLJJJIL;
            int i2 = this.LLJILLL;
            if (1 <= i2 && i2 < i) {
                C15JN c15jn4 = this.LLLIIII;
                if (c15jn4 != null) {
                    c15jn2 = c15jn4;
                }
                iAw = (c15jn2.Aw() * this.LLJJJIL) / this.LLJILLL;
            } else {
                C15JN c15jn5 = this.LLLIIII;
                if (c15jn5 != null) {
                    c15jn2 = c15jn5;
                }
                iAw = c15jn2.Aw();
            }
        }
        iMusicService2.LJIIZILJ(str, iAw, r3);
    }

    @Override // X.InterfaceC1459220o4m
    public final void h5(boolean z) {
        this.LLJJLIIIJLLLLLLLZ = z;
    }

    @Override // com.bytedance.scene.Scene
    public final void onActivityCreated(Bundle bundle) {
        int duration;
        int shootDuration;
        int iLongValue;
        String mMusicPath;
        super.onActivityCreated(bundle);
        AVMusic aVMusicExtractAVMusic = MusicBeanUtilKt.extractAVMusic(LLLIL().creativeModel.musicBuzModel);
        boolean z = false;
        if (C1428470nHB.LJJZZI(LLLIL()) && C0EM4.LIZ()) {
            duration = Math.min(C1465190oEP.LIZ(aVMusicExtractAVMusic, Integer.valueOf(LLLIL().getVideoLength())), LLLIL().getVideoLength());
        } else {
            InterfaceC1452170ntP interfaceC1452170ntP = this.LLLFFI;
            if (interfaceC1452170ntP != null) {
                duration = interfaceC1452170ntP.getDuration();
            } else {
                duration = 0;
            }
        }
        if (aVMusicExtractAVMusic != null) {
            shootDuration = aVMusicExtractAVMusic.getShootDuration();
        } else {
            shootDuration = 0;
        }
        Long l = Long.getLong("max_video_duration", 0L);
        if (l != null) {
            iLongValue = (int) l.longValue();
        } else {
            iLongValue = 0;
        }
        if (duration > 0) {
            if (shootDuration > 0) {
                duration = Math.min(shootDuration, duration);
            }
        } else {
            List listLJIIJJI = C1697810uHb.LJIIJJI(Integer.valueOf(shootDuration), Integer.valueOf(iLongValue));
            ArrayList arrayList = new ArrayList();
            for (Object obj : listLJIIJJI) {
                if (((Number) obj).intValue() > 0) {
                    arrayList.add(obj);
                }
            }
            if (arrayList.isEmpty()) {
                duration = 0;
            } else {
                duration = ((Number) Collections.min(arrayList)).intValue();
            }
        }
        this.LLJILLL = duration;
        if (aVMusicExtractAVMusic != null && ((IExternalService) ServiceManager.get().getService(IExternalService.class)).abilityService().infoService().supportTrimmedMuisc(C389120FNm.LIZ(aVMusicExtractAVMusic)) && aVMusicExtractAVMusic != null) {
            this.LLJILLL = Math.min(this.LLJILLL, C1465190oEP.LIZIZ(LLLIL().creativeModel.musicBuzModel, C389120FNm.LIZ(aVMusicExtractAVMusic), Integer.valueOf(C389120FNm.LIZ(aVMusicExtractAVMusic).getTrimmedMusicDuration())));
        }
        if (LLLILZLLLI()) {
            LLLJ();
        }
        AVMusic aVMusicExtractAVMusic2 = MusicBeanUtilKt.extractAVMusic(LLLIL().creativeModel.musicBuzModel);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("OLD_DRAFT avMusicIsNull:");
        if (aVMusicExtractAVMusic2 == null) {
            z = true;
        }
        sbLIZ.append(z);
        C201955140j.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        if (aVMusicExtractAVMusic2 != null) {
            if (aVMusicExtractAVMusic2.getDuration() <= 0) {
                aVMusicExtractAVMusic2.setDuration(C1403010mc7.LIZ.getMusicService().getMusicDuration(aVMusicExtractAVMusic2.path));
                MusicBuzModel musicBuzModel = LLLIL().creativeModel.musicBuzModel;
                MusicObject musicObject = musicBuzModel.music;
                if (musicObject != null) {
                    musicBuzModel.music = MusicObject.LIZ(musicObject, aVMusicExtractAVMusic2.getDuration());
                }
            }
            if (C2486109oh.LIZLLL(getApplicationContext(), aVMusicExtractAVMusic2.path)) {
                mMusicPath = aVMusicExtractAVMusic2.path;
            } else {
                mMusicPath = LLLIL().getMMusicPath();
            }
            aVMusicExtractAVMusic2.getTrimPointRecommended();
            this.LLJJJJ = aVMusicExtractAVMusic2;
            this.LLJJJIL = LJJJIL(null, Integer.valueOf(aVMusicExtractAVMusic2.getDuration()));
            if (mMusicPath == null) {
                mMusicPath = "";
            }
            this.LLJJJJJIL = mMusicPath;
            this.LLJJI = LLLIL().getMMusicStart();
            LLLLIILL(true);
        }
        LLLII().getVideoLength().LIZ(this, new AObjectS248S0100000_31(this, 0));
        LLLII().rI().LIZ(this, new AObjectS248S0100000_31(this, 1));
        LLLII().ed2().LIZ(this, new AObjectS248S0100000_31(this, 2));
        LLLII().Pn1().LIZ(this, new AObjectS248S0100000_31(this, 3));
    }

    @Override // X.InterfaceC1459220o4m
    public final int LJJJIL(AVMusic aVMusic, Integer num) {
        if (!LLLLII() && num != null) {
            return num.intValue();
        }
        if (aVMusic == null) {
            aVMusic = MusicBeanUtilKt.extractAVMusic(LLLIL().creativeModel.musicBuzModel);
        }
        return C1465190oEP.LIZ(aVMusic, num);
    }

    public final void LLLIZZ(List list, boolean z) {
        C1459260o4q c1459260o4q = new C1459260o4q();
        if (LLLILZLLLI()) {
            if (!list.isEmpty()) {
                this.LLJIJIL.LJI(z, list, c1459260o4q);
                return;
            }
            return;
        }
        this.LLJIJIL.LJFF(z, this.LLJJI, c1459260o4q, this.LLJJL);
    }

    public final void LLLILZ(C15JN c15jn, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        EnumC19381710sB enumC19381710sB;
        if (C204644155u.LIZ(requireSceneContext())) {
            enumC19381710sB = EnumC19381710sB.WHITE;
        } else {
            enumC19381710sB = EnumC19381710sB.DARK;
        }
        c15jn.bA((C19EG) requireActivity(), layoutInflater, viewGroup, enumC19381710sB);
        c15jn.My(new InterfaceC20503815Ky() { // from class: X.15Kj
            @Override // X.InterfaceC20503815Ky
            public final void LIZ() {
                String imprId;
                FullSongDetail fullSongDetail;
                this.LIZ.LLLIZZ(C13BV.INSTANCE, false);
                C20502215Ki c20502215Ki = this.LIZ;
                if (c20502215Ki.LLLIL().creativeModel.musicBuzModel.fullSongDetail != null && (fullSongDetail = c20502215Ki.LLLIL().creativeModel.musicBuzModel.fullSongDetail) != null && fullSongDetail.getFullSongUrl() != null && (((IMusicService) ServiceManager.get().getService(IMusicService.class)).LJJJJI() || ((IMusicService) ServiceManager.get().getService(IMusicService.class)).LJJIJLIJ())) {
                    c20502215Ki.LLLIIL.LJIL = true;
                    MusicObject musicObject = c20502215Ki.LLLIL().creativeModel.musicBuzModel.music;
                    int i = musicObject != null ? (int) (musicObject.previewStartTime * LSPassThroughRecordSizeConfig.DEFAULT) : 0;
                    int i2 = c20502215Ki.LLLIL().creativeModel.musicBuzModel.clipShootDuration + i;
                    if (c20502215Ki.LLLIL().creativeModel.musicBuzModel.musicStartFromCut < i || c20502215Ki.LLLIL().creativeModel.musicBuzModel.musicStartFromCut + c20502215Ki.LLJILLL > i2) {
                        c20502215Ki.LLLIIL.LJJ = 1;
                    } else {
                        c20502215Ki.LLLIIL.LJJ = 0;
                    }
                }
                C20502215Ki c20502215Ki2 = this.LIZ;
                C15JK c15jk = c20502215Ki2.LLLIIL;
                String enterMethod = c20502215Ki2.LLLII().getEnterMethod();
                String strPJ2 = this.LIZ.LLLII().PJ2();
                MusicObject musicObject2 = this.LIZ.LLLIL().creativeModel.musicBuzModel.music;
                boolean z = musicObject2 != null && musicObject2.isPgc;
                MatchedSoundInfo matchedSoundInfo = this.LIZ.LLLIL().creativeModel.musicBuzModel.matchedSongInfo;
                String id = matchedSoundInfo != null ? matchedSoundInfo.getId() : null;
                String strLIZIZ = C1412490mrP.LIZIZ(this.LIZ.LLLIL());
                LogPbBean logPbBean = this.LIZ.LLLIL().creativeModel.musicBuzModel.logPb;
                if (logPbBean == null || (imprId = logPbBean.getImprId()) == null) {
                    imprId = "";
                }
                C15JK c15jkLIZ = C15JK.LIZ(c15jk, null, null, null, null, null, enterMethod, strPJ2, null, z, id, null, false, null, strLIZIZ, imprId, 65495039);
                C20502215Ki c20502215Ki3 = this.LIZ;
                int i3 = c20502215Ki3.LLJJJIL;
                int i4 = c20502215Ki3.LLJILLL;
                float f = c20502215Ki3.LLJJL;
                boolean z2 = !c20502215Ki3.LLLI;
                boolean zLJJJJZ = C1416310mxZ.LJJJJZ(c20502215Ki3.LLLIL());
                long jCurrentTimeMillis = System.currentTimeMillis() - this.LIZ.LLLIL().creativeModel.musicBuzModel.enterTrimPanelTime;
                C1428470nHB.LJIILIIL(this.LIZ.LLLIL());
                C1428470nHB.LJIILL(this.LIZ.LLLIL());
                C15JJ.LJFF(c15jkLIZ, i3, i4, f, z2, zLJJJJZ, jCurrentTimeMillis);
            }

            @Override // X.InterfaceC20503815Ky
            public final void LIZJ() {
                this.LIZ.LLJIJIL.LJIIIIZZ();
            }

            @Override // X.InterfaceC20503815Ky
            public final void LIZLLL() {
                C20502215Ki c20502215Ki = this.LIZ;
                int i = c20502215Ki.LLJJIII;
                c20502215Ki.LLJJI = i;
                C15JN c15jn2 = c20502215Ki.LLLIIII;
                if ((c15jn2 == null ? null : c15jn2) != null) {
                    if (c15jn2 == null) {
                        c15jn2 = null;
                    }
                    c15jn2.fC((i * 1.0f) / c20502215Ki.LLJJJIL, i);
                }
                c20502215Ki.LLJJIJI = c20502215Ki.LLJJIJIIJIL;
                if (c20502215Ki.LLLILZLLLI()) {
                    C15JN c15jn3 = c20502215Ki.LLLIIIIL;
                    if (c15jn3 != null) {
                        c15jn3.JH(c20502215Ki.LLJLIL);
                    }
                    c20502215Ki.LLLIZZ(c20502215Ki.LLJLIL, true);
                } else {
                    c20502215Ki.LLJIJIL.LJ();
                    c20502215Ki.LLLIZZ(C13BV.INSTANCE, true);
                }
                FrameLayout frameLayout = this.LIZ.LLLII;
                if (frameLayout == null) {
                    frameLayout = null;
                }
                C786410Ut5.LJZ(4, frameLayout);
                C20502215Ki c20502215Ki2 = this.LIZ;
                C15JJ.LJ(C15JK.LIZ(c20502215Ki2.LLLIIL, null, null, null, null, null, c20502215Ki2.LLLII().getEnterMethod(), this.LIZ.LLLII().PJ2(), null, false, null, null, this.LIZ.LLLILZLLLI(), C13LP.LJJLIIIJ(C1429680nJ8.LIZIZ(this.LIZ.LLLIL().creativeModel.musicBuzModel), ",", null, null, 0, null, AFwS276S0000000_31.get$arr$(245), 30), null, null, 218062847), null);
                if (this.LIZ.LLLLIIIILLL()) {
                    C20502215Ki c20502215Ki3 = this.LIZ;
                    boolean z = c20502215Ki3.LLLIL;
                    C15JN c15jn4 = c20502215Ki3.LLLIIII;
                    if (c15jn4 == null) {
                        c15jn4 = null;
                    }
                    if (z != c15jn4.Et()) {
                        C1452640nuA c1452640nuA = C1452640nuA.LIZ;
                        MusicBuzModel musicBuzModel = this.LIZ.LLLIL().creativeModel.musicBuzModel;
                        C20502215Ki c20502215Ki4 = this.LIZ;
                        boolean z2 = c20502215Ki4.LLLIL;
                        int iLJJL = C1416310mxZ.LJJL(c20502215Ki4.LLLIL(), 0, null, 3);
                        c1452640nuA.getClass();
                        C1452640nuA.LJIIIIZZ(musicBuzModel, z2, iLJJL);
                        C20502215Ki c20502215Ki5 = this.LIZ;
                        c20502215Ki5.LLJIJIL.LIZJ(c20502215Ki5.LLJJL, c20502215Ki5.LLJJI, c20502215Ki5.LLLIL);
                    }
                }
            }

            @Override // X.InterfaceC20503815Ky
            public final void LIZIZ(List<C15JF> list) {
                boolean z;
                String id;
                String imprId;
                C20502215Ki c20502215Ki = this.LIZ;
                c20502215Ki.LLJLIL = list;
                c20502215Ki.LLLIZZ(list, false);
                C20502215Ki c20502215Ki2 = this.LIZ;
                C15JK c15jk = c20502215Ki2.LLLIIL;
                String enterMethod = c20502215Ki2.LLLII().getEnterMethod();
                String strPJ2 = this.LIZ.LLLII().PJ2();
                MusicObject musicObject = this.LIZ.LLLIL().creativeModel.musicBuzModel.music;
                if (musicObject != null && musicObject.isPgc) {
                    z = true;
                } else {
                    z = false;
                }
                MatchedSoundInfo matchedSoundInfo = this.LIZ.LLLIL().creativeModel.musicBuzModel.matchedSongInfo;
                if (matchedSoundInfo != null) {
                    id = matchedSoundInfo.getId();
                } else {
                    id = null;
                }
                String strLJJLIIIJ = C13LP.LJJLIIIJ(C1429680nJ8.LIZIZ(this.LIZ.LLLIL().creativeModel.musicBuzModel), ",", null, null, 0, null, AFwS276S0000000_31.get$arr$(246), 30);
                String strLIZIZ = C1412490mrP.LIZIZ(this.LIZ.LLLIL());
                LogPbBean logPbBean = this.LIZ.LLLIL().creativeModel.musicBuzModel.logPb;
                if (logPbBean == null || (imprId = logPbBean.getImprId()) == null) {
                    imprId = "";
                }
                C15JK c15jkLIZ = C15JK.LIZ(c15jk, null, null, null, null, null, enterMethod, strPJ2, null, z, id, null, true, strLJJLIIIJ, strLIZIZ, imprId, 15163391);
                C20502215Ki c20502215Ki3 = this.LIZ;
                int i = c20502215Ki3.LLJJJIL;
                int i2 = c20502215Ki3.LLJILLL;
                float f = c20502215Ki3.LLJJL;
                boolean z2 = !c20502215Ki3.LLLI;
                boolean zLJJJJZ = C1416310mxZ.LJJJJZ(c20502215Ki3.LLLIL());
                long jCurrentTimeMillis = System.currentTimeMillis() - this.LIZ.LLLIL().creativeModel.musicBuzModel.enterTrimPanelTime;
                C1428470nHB.LJIILIIL(this.LIZ.LLLIL());
                C1428470nHB.LJIILL(this.LIZ.LLLIL());
                C15JJ.LJFF(c15jkLIZ, i, i2, f, z2, zLJJJJZ, jCurrentTimeMillis);
            }

            @Override // X.InterfaceC20503815Ky
            public final int LJ(float f) {
                return (int) (this.LIZ.LLJJJIL * f);
            }

            @Override // X.InterfaceC20503815Ky
            public final void LJFF(long j) {
                C20502215Ki c20502215Ki = this.LIZ;
                c20502215Ki.LLJIJIL.LJIIIZ(c20502215Ki.LLJJL, j);
            }

            @Override // X.InterfaceC20503815Ky
            public final void LJI(float f) {
                String str;
                C20502215Ki c20502215Ki = this.LIZ;
                int i = (int) (c20502215Ki.LLJJJIL * f);
                if (i > c20502215Ki.LLJJI) {
                    str = "right";
                } else {
                    str = "left";
                }
                c20502215Ki.LLJJI = i;
                c20502215Ki.LLJIJIL.LIZIZ(i, c20502215Ki.LLJJL);
                this.LIZ.LLJIJIL.LIZ();
                C20502215Ki c20502215Ki2 = this.LIZ;
                C15JK c15jkLIZ = C15JK.LIZ(c20502215Ki2.LLLIIL, null, null, null, null, null, c20502215Ki2.LLLII().getEnterMethod(), null, null, false, null, null, false, null, null, null, 268427263);
                C20502215Ki c20502215Ki3 = this.LIZ;
                C15JJ.LIZJ(c15jkLIZ, c20502215Ki3.LLJJJIL, c20502215Ki3.LLJJI, str);
            }
        });
        c15jn.jz(new AwS680S0100000_31(this, 8));
        c15jn.A8(new C16HJ(this, 1));
        if (LLLLIIIILLL()) {
            boolean z = false;
            c15jn.o4(C1416310mxZ.LJJL(LLLIL(), 0, null, 3));
            boolean z2 = true;
            if (MusicBeanUtilKt.extractAVMusic(LLLIL().creativeModel.musicBuzModel) != null) {
                if (LJJJIL(null, null) < C1416310mxZ.LJJL(LLLIL(), 0, null, 3)) {
                    z = true;
                }
                z2 = z;
            }
            c15jn.Au(C1458070o2v.LJ(LLLIL().creativeModel.musicBuzModel), z2);
            AwS610S0100000_31 awS610S0100000_31 = new AwS610S0100000_31(this, 266);
            c15jn.TM(new AwS397S0200000_31(this, awS610S0100000_31, 61));
            c15jn.z3(new AwS610S0100000_31(this, 264));
            c15jn.Qw(new AwS610S0100000_31(awS610S0100000_31, 265));
        }
    }

    @Override // com.bytedance.scene.Scene
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        String str;
        String str2;
        int i;
        boolean z;
        String id;
        FragmentManager supportFragmentManager;
        CutMusicPanel cutMusicPanelLJJII = ((IMusicService) ServiceManager.get().getService(IMusicService.class)).LJJII();
        LLLILZ(cutMusicPanelLJJII, layoutInflater, viewGroup);
        this.LLLIIII = cutMusicPanelLJJII;
        CutMultiMusicPanel cutMultiMusicPanelLJJIFFI = ((IMusicService) ServiceManager.get().getService(IMusicService.class)).LJJIFFI();
        LLLILZ(cutMultiMusicPanelLJJIFFI, layoutInflater, viewGroup);
        this.LLLIIIIL = cutMultiMusicPanelLJJIFFI;
        Pair<Integer, Integer> pairLJIIJJI = C580270MpN.LJIIJJI(LLLIL());
        int iIntValue = pairLJIIJJI.getFirst().intValue();
        int iIntValue2 = pairLJIIJJI.getSecond().intValue();
        VideoPublishEditModel videoPublishEditModel = (VideoPublishEditModel) this.LLJI.LJII(VideoPublishEditModel.class, null);
        String str3 = videoPublishEditModel.mShootWay;
        String creationId = videoPublishEditModel.getCreationId();
        String strLJIILIIL = C1428470nHB.LJIILIIL(videoPublishEditModel);
        String strLJIILL = C1428470nHB.LJIILL(videoPublishEditModel);
        String musicId = videoPublishEditModel.getMusicId();
        if (C0MT6.LIZ()) {
            str = "recommend_music";
        } else {
            str = "edit_normal";
        }
        String enterMethod = LLLII().getEnterMethod();
        MusicBuzModel musicBuzModel = videoPublishEditModel.creativeModel.musicBuzModel;
        String str4 = musicBuzModel.musicSelectTab;
        String str5 = musicBuzModel.musicRecTypeRecent;
        if (iIntValue + iIntValue2 > 1) {
            str2 = "1";
        } else {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        List<Integer> list = musicBuzModel.trimPointsList;
        int duration = 0;
        if (list != null && !list.isEmpty()) {
            i = 0;
        } else {
            i = 1;
        }
        int i2 = i ^ 1;
        MusicBuzModel musicBuzModel2 = videoPublishEditModel.creativeModel.musicBuzModel;
        ArrayList<String> arrayList = musicBuzModel2.trimTypeList;
        MusicObject musicObject = musicBuzModel2.music;
        if (musicObject != null && musicObject.isPgc) {
            z = true;
        } else {
            z = false;
        }
        MatchedSoundInfo matchedSoundInfo = musicBuzModel2.matchedSongInfo;
        if (matchedSoundInfo != null) {
            id = matchedSoundInfo.getId();
        } else {
            id = null;
        }
        this.LLLIIL = new C15JK("video_edit_page", str3, creationId, strLJIILIIL, strLJIILL, musicId, str, false, null, null, null, null, null, enterMethod, null, str4, str5, str2, i2, z, id, arrayList, null, null, 264265600);
        this.LLLII = (FrameLayout) C786410Ut5.Td(layoutInflater, R.layout.eog, viewGroup, false);
        C19EG c19eg = (C19EG) this.mActivity;
        if (c19eg != null) {
            supportFragmentManager = c19eg.getSupportFragmentManager();
        } else {
            supportFragmentManager = null;
        }
        this.LLLIIIL = supportFragmentManager;
        MusicBeanUtilKt.extractAVMusic(LLLIL().creativeModel.musicBuzModel);
        InterfaceC1452170ntP value = LLLIIIIL().g().getValue();
        if (value != null) {
            duration = value.getDuration();
        }
        this.LLJJ = duration;
        FrameLayout frameLayout = this.LLLII;
        if (frameLayout == null) {
            return null;
        }
        return frameLayout;
    }

    public C20502215Ki(C1DRG c1drg, InterfaceC20502415Kk interfaceC20502415Kk, InterfaceC1464180oCm interfaceC1464180oCm, boolean z) {
        C348100Dkm c348100DkmLIZIZ;
        this.LLJI = c1drg;
        this.LLJIJIL = interfaceC20502415Kk;
        this.LLJILJIL = interfaceC1464180oCm;
        ((Number) C0E5G.LIZIZ(EnumC357850E1f.VIDEO_CLIP_MIN_DURATION, 100L)).longValue();
        this.LLJILJILJ = 60L;
        C13BV c13bv = C13BV.INSTANCE;
        this.LLJJJ = c13bv;
        this.LLJJJJJIL = "";
        this.LLJJL = 1.0f;
        this.LLJLIL = c13bv;
        this.LLJLILLLLZIIL = ((IMusicService) ServiceManager.get().getService(IMusicService.class)).LJJJIL();
        this.LLJLL = new SafeHandler(this);
        NLEEditor nLEEditor = null;
        this.LLJLLIL = C1664770tQJ.LIZ(c1drg, VideoPublishEditModel.class, null);
        this.LLJLLL = C1664770tQJ.LIZIZ(c1drg, InterfaceC1418580n1E.class, null);
        this.LLJZ = C1664770tQJ.LIZ(c1drg, InterfaceC1457250o1b.class, null);
        this.LLJZIJLIL = C1664770tQJ.LIZIZ(c1drg, InterfaceC1451050nrb.class, null);
        this.LLL = C1664770tQJ.LIZIZ(c1drg, InterfaceC1451050nrb.class, null);
        this.LLLF = C1664770tQJ.LIZIZ(c1drg, InterfaceC572860MdQ.class, null);
        this.LLLFF = C1664770tQJ.LIZ(c1drg, InterfaceC1455860nzM.class, null);
        this.LLLFFI = LLLIIIIL().g().getValue();
        InterfaceC1452170ntP value = LLLIIIIL().g().getValue();
        if (value != null && (c348100DkmLIZIZ = C352130DrH.LIZIZ(value)) != null) {
            nLEEditor = c348100DkmLIZIZ.LIZ;
        }
        this.LLLFZ = nLEEditor;
        this.LLLIIL = new C15JK(null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, 0, false, null, null, null, null, 268435455);
        this.LLLIILIL = C07N9.LIZ();
        this.LLLILZ = new ARunnableS131S0100000_31(this, 96);
    }

    public final void LLLLIL(MusicWaveBean musicWaveBean, List<MusicWaveBean> list, int i, int i2) {
        C15JN c15jn;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SoundLoop, EditMusicCutScene.updateMusicWaveData musicLength = ");
        sbLIZ.append(i);
        sbLIZ.append(" videoLength = ");
        sbLIZ.append(this.LLJILLL);
        sbLIZ.append(" bean = ");
        sbLIZ.append(musicWaveBean);
        C201955140j.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        if (LLLILZLLLI()) {
            if ((!list.isEmpty()) && (c15jn = this.LLLIIIIL) != null) {
                c15jn.Wr(list);
                return;
            }
            return;
        }
        if (musicWaveBean == null) {
            return;
        }
        this.LLJJJJLIIL = i;
        C15JN c15jn2 = this.LLLIIII;
        if (c15jn2 == null) {
            c15jn2 = null;
        }
        int i3 = this.LLJILLL;
        C536570L2p.LIZ();
        c15jn2.rw(musicWaveBean, i, i2, i3, this.LLJJ);
    }
}
