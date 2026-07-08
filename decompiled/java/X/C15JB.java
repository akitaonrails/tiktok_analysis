package X;

import Y.AObserverS233S0100000_31;
import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.ss.android.ugc.aweme.choosemusic.cutmusic.ChooseMusicCutViewModel;
import com.ss.android.ugc.aweme.choosemusic.cutmusic.CutMusicRepeartPlayer;
import com.ss.android.ugc.aweme.choosemusic.cutpanel.CutMusicPanel;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.music.model.FullSongDetail;
import com.ss.android.ugc.aweme.music.service.IMusicService;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.services.external.ability.IAVInfoService;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.shortvideo.model.MusicWaveBean;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AFwS276S0000000_31;
import kotlin.jvm.internal.AwS610S0100000_31;
import kotlin.jvm.internal.AwS680S0100000_31;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.15JB, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C15JB {
    public final Fragment LIZ;
    public final LayoutInflater LIZIZ;
    public final ViewGroup LIZJ;
    public long LIZLLL;
    public boolean LJ;
    public final C19EG LJFF;
    public C15H0 LJI;
    public CutMusicRepeartPlayer LJII;
    public ChooseMusicCutViewModel LJIIIZ;
    public boolean LJIIJJI;
    public ProgressDialogC1399760mWs LJIIL;
    public boolean LJIILIIL;
    public int LJIILJJIL;
    public List<Integer> LJIILL;
    public ArrayList<String> LJIILLIIL;
    public int LJIJ;
    public int LJIJI;
    public MusicModel LJIJJ;
    public int LJIL;
    public int LJJ;
    public int LJJI;
    public int LJJIFFI;
    public final C15JH LJIIIIZZ = new C15JH();
    public Fragment LJIIJ = new CutMusicPanel();
    public List<Integer> LJIIZILJ = new ArrayList();
    public List<C15JF> LJIJJLI = new ArrayList();
    public String LJJII = "";
    public final boolean LJJIII = C07N9.LIZ();
    public C15JK LJJIIJ = new C15JK("video_edit_page", null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, 0, false, null, null, null, null, 268435454);
    public final String LJJIIJZLJL = "CutMusic:";

    public static boolean LJIILJJIL() {
        if (C15IK.LJIILIIL) {
            return false;
        }
        return (C0C64.LJIILLIIL().LJIIIZ(31744, "direct_to_camera_allow_full_song", true, false) && Intrinsics.LJFF(C15IK.LJIIJJI, "direct_shoot")) || (C0C64.LJIILLIIL().LJIIIZ(31744, "single_song_allow_full_song", true, false) && !Intrinsics.LJFF(C15IK.LJIIJJI, "direct_shoot"));
    }

    public final int LIZIZ() {
        if (C1654360t9W.LJII <= 0) {
            return C1654360t9W.LIZJ;
        }
        MusicModel musicModel = this.LJIJJ;
        return (musicModel == null || !musicModel.isUnlimitedMusic()) ? Math.min(C1654360t9W.LJIIIIZZ, C1654360t9W.LJII) : C1654360t9W.LJII;
    }

    public final void LIZJ() {
        MutableLiveData<C15HO> mutableLiveDataVQ2;
        LiveData liveData;
        MutableLiveData<MusicModel> mutableLiveDataWQ2;
        ChooseMusicCutViewModel chooseMusicCutViewModel = this.LJIIIZ;
        if (chooseMusicCutViewModel != null && (mutableLiveDataWQ2 = chooseMusicCutViewModel.wQ2()) != null) {
            mutableLiveDataWQ2.setValue(null);
        }
        ChooseMusicCutViewModel chooseMusicCutViewModel2 = this.LJIIIZ;
        if (chooseMusicCutViewModel2 != null && (liveData = (LiveData) chooseMusicCutViewModel2.LLILLL.getValue()) != null) {
            liveData.setValue(null);
        }
        ChooseMusicCutViewModel chooseMusicCutViewModel3 = this.LJIIIZ;
        if (chooseMusicCutViewModel3 == null || (mutableLiveDataVQ2 = chooseMusicCutViewModel3.vQ2()) == null) {
            return;
        }
        mutableLiveDataVQ2.setValue(null);
    }

    public final void LJ() {
        MutableLiveData<C15HO> mutableLiveDataVQ2;
        LiveData liveData;
        MutableLiveData<MusicModel> mutableLiveDataWQ2;
        this.LJIIIZ = (ChooseMusicCutViewModel) C1659630tI1.LJ(this.LIZ).get(ChooseMusicCutViewModel.class);
        LIZJ();
        ChooseMusicCutViewModel chooseMusicCutViewModel = this.LJIIIZ;
        if (chooseMusicCutViewModel != null && (mutableLiveDataWQ2 = chooseMusicCutViewModel.wQ2()) != null) {
            mutableLiveDataWQ2.observe(this.LIZ, new AObserverS233S0100000_31(this, 39));
        }
        ChooseMusicCutViewModel chooseMusicCutViewModel2 = this.LJIIIZ;
        if (chooseMusicCutViewModel2 != null && (liveData = (LiveData) chooseMusicCutViewModel2.LLILLL.getValue()) != null) {
            liveData.observe(this.LIZ, new AObserverS233S0100000_31(this, 40));
        }
        ChooseMusicCutViewModel chooseMusicCutViewModel3 = this.LJIIIZ;
        if (chooseMusicCutViewModel3 == null || (mutableLiveDataVQ2 = chooseMusicCutViewModel3.vQ2()) == null) {
            return;
        }
        mutableLiveDataVQ2.observe(this.LIZ, new AObserverS233S0100000_31(this, 41));
    }

    public final boolean LJFF() {
        MusicModel musicModel;
        return this.LJJIII && (musicModel = this.LJIJJ) != null && musicModel.hasExtendMusicList();
    }

    public final void LJIIL() {
        C15H0 c15h0;
        MutableLiveData<C15HO> mutableLiveDataVQ2;
        LiveData liveData;
        MutableLiveData<MusicModel> mutableLiveDataWQ2;
        ChooseMusicCutViewModel chooseMusicCutViewModel = this.LJIIIZ;
        if (chooseMusicCutViewModel != null && (mutableLiveDataWQ2 = chooseMusicCutViewModel.wQ2()) != null) {
            mutableLiveDataWQ2.removeObservers(this.LIZ);
        }
        ChooseMusicCutViewModel chooseMusicCutViewModel2 = this.LJIIIZ;
        if (chooseMusicCutViewModel2 != null && (liveData = (LiveData) chooseMusicCutViewModel2.LLILLL.getValue()) != null) {
            liveData.removeObservers(this.LIZ);
        }
        ChooseMusicCutViewModel chooseMusicCutViewModel3 = this.LJIIIZ;
        if (chooseMusicCutViewModel3 != null && (mutableLiveDataVQ2 = chooseMusicCutViewModel3.vQ2()) != null) {
            mutableLiveDataVQ2.removeObservers(this.LIZ);
        }
        MusicModel musicModel = this.LJIJJ;
        if (musicModel == null || (c15h0 = this.LJI) == null) {
            return;
        }
        c15h0.p8(musicModel);
    }

    public static boolean LJIJ() {
        return C1458070o2v.LJFF() && !C1654360t9W.LIZLLL;
    }

    public final boolean LJIIZILJ() {
        MusicModel musicModel;
        if (LJIJ() && (musicModel = this.LJIJJ) != null) {
            return C1654360t9W.LJII > 0 ? musicModel.isUnlimitedMusic() ? musicModel.getDuration() < C1654360t9W.LJII : musicModel.getDuration() < Math.min(C1654360t9W.LJII, C1654360t9W.LJIIIIZZ) : musicModel.getDuration() < C1654360t9W.LIZJ;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [X.15JN, androidx.fragment.app.Fragment] */
    /* JADX WARN: Type inference failed for: r2v1, types: [X.15JN, androidx.fragment.app.Fragment] */
    public final void LIZLLL(C15JN c15jn) {
        EnumC19381710sB enumC19381710sB;
        c15jn.JI();
        if (C960203pA.LIZIZ(this.LJFF)) {
            enumC19381710sB = EnumC19381710sB.DARK;
        } else {
            enumC19381710sB = EnumC19381710sB.WHITE;
        }
        c15jn.bA(this.LJFF, this.LIZIZ, this.LIZJ, enumC19381710sB);
        c15jn.My(new InterfaceC20503815Ky() { // from class: X.15JC
            @Override // X.InterfaceC20503815Ky
            public final void LIZJ() {
            }

            @Override // X.InterfaceC20503815Ky
            public final void LJFF(long j) {
            }

            @Override // X.InterfaceC20503815Ky
            public final void LIZ() {
                MusicModel musicModel;
                FullSongDetail fullSongDetail;
                int i;
                MutableLiveData<C15HO> mutableLiveDataVQ2;
                C15JB c15jb = this.LIZ;
                MusicModel musicModel2 = c15jb.LJIJJ;
                if (musicModel2 != null) {
                    CutMusicRepeartPlayer cutMusicRepeartPlayer = c15jb.LJII;
                    if (cutMusicRepeartPlayer != null) {
                        cutMusicRepeartPlayer.LIZIZ();
                    }
                    MusicModel musicModelM317clone = musicModel2.m317clone();
                    musicModelM317clone.setMusicStartFromCut(c15jb.LJIL);
                    musicModelM317clone.setMusicStart(c15jb.LJIL);
                    if ((C1458070o2v.LIZIZ() || C1452500ntw.LIZ()) && (i = c15jb.LJJIFFI) > 0) {
                        int i2 = c15jb.LJIL;
                        int i3 = c15jb.LJIILJJIL;
                        musicModelM317clone.setMusicEndFromCut(i2 + (i3 > 0 ? Math.min(i, i3) : Math.min(i, c15jb.LJIJI)));
                        int i4 = c15jb.LJIL;
                        int i5 = c15jb.LJJIFFI;
                        int i6 = c15jb.LJIILJJIL;
                        musicModelM317clone.setMusicEndTime(i4 + (i6 > 0 ? Math.min(i5, i6) : Math.min(i5, c15jb.LJIJI)));
                    } else {
                        int i7 = c15jb.LJIL;
                        int iLIZIZ = (int) C142I.LIZIZ(c15jb.LJJII);
                        int i8 = c15jb.LJIILJJIL;
                        musicModelM317clone.setMusicEndFromCut(i7 + (i8 > 0 ? Math.min(iLIZIZ, i8) : Math.min(iLIZIZ, c15jb.LJIJI)));
                    }
                    if (c15jb.LJIL != 0) {
                        musicModelM317clone.setEditFrom(c15jb.LJJIIJ.LJI);
                    }
                    ChooseMusicCutViewModel chooseMusicCutViewModel = c15jb.LJIIIZ;
                    c15jb.LJIILIIL(musicModelM317clone, (chooseMusicCutViewModel == null || (mutableLiveDataVQ2 = chooseMusicCutViewModel.vQ2()) == null) ? null : mutableLiveDataVQ2.getValue());
                    c15jb.LIZJ();
                }
                MusicModel musicModel3 = this.LIZ.LJIJJ;
                if ((musicModel3 != null ? musicModel3.getFullSongDetail() : null) != null && (musicModel = this.LIZ.LJIJJ) != null && (fullSongDetail = musicModel.getFullSongDetail()) != null && fullSongDetail.getFullSongUrl() != null && (((IMusicService) ServiceManager.get().getService(IMusicService.class)).LJJJJI() || ((IMusicService) ServiceManager.get().getService(IMusicService.class)).LJJIJLIJ())) {
                    C15JB c15jb2 = this.LIZ;
                    c15jb2.LJJIIJ.LJIL = true;
                    MusicModel musicModel4 = c15jb2.LJIJJ;
                    int previewStartTime = musicModel4 != null ? (int) (musicModel4.getPreviewStartTime() * LSPassThroughRecordSizeConfig.DEFAULT) : 0;
                    MusicModel musicModel5 = this.LIZ.LJIJJ;
                    int clipShootDuration = (musicModel5 != null ? musicModel5.getClipShootDuration() : 0) + previewStartTime;
                    C15JB c15jb3 = this.LIZ;
                    int i9 = c15jb3.LJIL;
                    if (i9 < previewStartTime || i9 + c15jb3.LJJIFFI > clipShootDuration) {
                        c15jb3.LJJIIJ.LJJ = 1;
                    } else {
                        c15jb3.LJJIIJ.LJJ = 0;
                    }
                }
                C15JB c15jb4 = this.LIZ;
                C15JK c15jk = c15jb4.LJJIIJ;
                int i10 = c15jb4.LJJ;
                int i11 = c15jb4.LJJIFFI;
                long jCurrentTimeMillis = System.currentTimeMillis();
                C15JB c15jb5 = this.LIZ;
                long j = jCurrentTimeMillis - c15jb5.LIZLLL;
                boolean z = c15jb5.LJIIJ instanceof CutMusicPanel;
                C15JJ.LJFF(c15jk, i10, i11, 1.0f, true, false, j);
                this.LIZ.LJ = true;
            }

            @Override // X.InterfaceC20503815Ky
            public final void LIZLLL() {
                String strLJJLIIIJ;
                List<MusicModel> mergedMusicList;
                MusicModel musicModel;
                this.LIZ.LIZJ();
                CutMusicRepeartPlayer cutMusicRepeartPlayer = this.LIZ.LJII;
                if (cutMusicRepeartPlayer != null) {
                    cutMusicRepeartPlayer.LIZIZ();
                }
                C15JB c15jb = this.LIZ;
                c15jb.LJIILIIL = false;
                if (!c15jb.LJ && (musicModel = c15jb.LJIJJ) != null) {
                    musicModel.setTrimPointRecommended(false);
                }
                C15JB c15jb2 = this.LIZ;
                C15JK c15jk = c15jb2.LJJIIJ;
                MusicModel musicModel2 = c15jb2.LJIJJ;
                if (musicModel2 == null || (mergedMusicList = musicModel2.getMergedMusicList()) == null || (strLJJLIIIJ = C13LP.LJJLIIIJ(mergedMusicList, ",", null, null, 0, null, AFwS276S0000000_31.get$arr$(299), 30)) == null) {
                    strLJJLIIIJ = "";
                }
                C15JJ.LJ(C15JK.LIZ(c15jk, null, null, null, null, null, null, null, null, false, null, null, true, strLJJLIIIJ, null, null, 218103807), Integer.valueOf(this.LIZ.LJJ));
            }

            @Override // X.InterfaceC20503815Ky
            public final void LIZIZ(List<C15JF> list) {
                ArrayList arrayList;
                MutableLiveData<C15HO> mutableLiveDataVQ2;
                CutMusicRepeartPlayer cutMusicRepeartPlayer = this.LIZ.LJII;
                if (cutMusicRepeartPlayer != null) {
                    cutMusicRepeartPlayer.LIZIZ();
                }
                MusicModel musicModel = this.LIZ.LJIJJ;
                if (musicModel == null) {
                    return;
                }
                MusicModel musicModelM317clone = musicModel.m317clone();
                C15JF c15jf = (C15JF) C13LP.LJJJLL(list);
                if (c15jf != null) {
                    musicModelM317clone.setMusicStartFromCut((int) c15jf.LIZJ);
                    musicModelM317clone.setMusicStart((int) c15jf.LIZJ);
                    musicModelM317clone.setMusicEndFromCut((int) c15jf.LIZLLL);
                }
                C15JB c15jb = this.LIZ;
                if (c15jb.LJIL != 0) {
                    musicModelM317clone.setEditFrom(c15jb.LJJIIJ.LJI);
                }
                List<MusicModel> smartExtendMusicList = musicModel.getSmartExtendMusicList();
                C15HO value = null;
                if (smartExtendMusicList != null) {
                    arrayList = new ArrayList();
                    int i = 0;
                    for (MusicModel musicModel2 : smartExtendMusicList) {
                        int i2 = i + 1;
                        if (i >= 0) {
                            MusicModel musicModel3 = musicModel2;
                            C15JF c15jf2 = (C15JF) C13LP.LJJJLZIJ(i2, list);
                            if (c15jf2 != null) {
                                musicModel3.setMusicStartFromCut((int) c15jf2.LIZJ);
                                musicModel3.setMusicStart((int) c15jf2.LIZJ);
                                musicModel3.setMusicEndFromCut((int) c15jf2.LIZLLL);
                                arrayList.add(musicModel3);
                            }
                            i = i2;
                        } else {
                            C1697810uHb.LJIJI();
                            throw null;
                        }
                    }
                } else {
                    arrayList = null;
                }
                musicModelM317clone.setSmartExtendMusicList(arrayList);
                C15JB c15jb2 = this.LIZ;
                ChooseMusicCutViewModel chooseMusicCutViewModel = c15jb2.LJIIIZ;
                if (chooseMusicCutViewModel != null && (mutableLiveDataVQ2 = chooseMusicCutViewModel.vQ2()) != null) {
                    value = mutableLiveDataVQ2.getValue();
                }
                c15jb2.LJIILIIL(musicModelM317clone, value);
                this.LIZ.LIZJ();
                C15JK c15jkLIZ = C15JK.LIZ(this.LIZ.LJJIIJ, null, null, null, null, null, null, null, null, false, null, null, true, C13LP.LJJLIIIJ(musicModel.getMergedMusicList(), ",", null, null, 0, null, AFwS276S0000000_31.get$arr$(DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL), 30), null, null, 218103807);
                C15JB c15jb3 = this.LIZ;
                int i3 = c15jb3.LJJ;
                int i4 = c15jb3.LJJIFFI;
                long jCurrentTimeMillis = System.currentTimeMillis();
                C15JB c15jb4 = this.LIZ;
                long j = jCurrentTimeMillis - c15jb4.LIZLLL;
                boolean z = c15jb4.LJIIJ instanceof CutMusicPanel;
                C15JJ.LJFF(c15jkLIZ, i3, i4, 1.0f, true, false, j);
            }

            @Override // X.InterfaceC20503815Ky
            public final int LJ(float f) {
                return (int) (f * this.LIZ.LJJ);
            }

            @Override // X.InterfaceC20503815Ky
            public final void LJI(float f) {
                String str;
                C15JB c15jb = this.LIZ;
                int i = (int) (f * c15jb.LJJ);
                if (i > c15jb.LJIL) {
                    str = "right";
                } else {
                    str = "left";
                }
                c15jb.LJIL = i;
                CutMusicRepeartPlayer cutMusicRepeartPlayer = c15jb.LJII;
                if (cutMusicRepeartPlayer != null) {
                    C15JH c15jh = cutMusicRepeartPlayer.LLILZLL;
                    if (c15jh != null) {
                        c15jh.LIZIZ = 0;
                    }
                    cutMusicRepeartPlayer.LIZ(i);
                }
                C15JB c15jb2 = this.LIZ;
                C15JJ.LIZJ(c15jb2.LJJIIJ, c15jb2.LJJ, c15jb2.LJIL, str);
            }
        });
        c15jn.jz(new AwS680S0100000_31(this, 10));
        if (LJIJ()) {
            c15jn.o4(LIZIZ());
            c15jn.Au(C1654360t9W.LIZIZ, LJIIZILJ());
            this.LJIIJJI = C1654360t9W.LIZIZ;
            c15jn.TM(new AwS610S0100000_31(this, 411));
            this.LJIIJ.z3(AFwS276S0000000_31.get$arr$(301));
            this.LJIIJ.Qw(new AwS610S0100000_31(this, 412));
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.15JN, androidx.fragment.app.Fragment] */
    public final void LJI(final List<String> list) {
        C15KF.LJFF(list, this.LJIIJ.Wj(), new C15KJ() { // from class: X.1443
            @Override // X.C15KJ
            public final void LIZIZ(MusicWaveBean musicWaveBean) {
            }

            @Override // X.C15KJ
            public final void LIZ(List<MusicWaveBean> list2) {
                this.LIZ.LJII(list2, list);
            }
        });
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [X.15JN, androidx.fragment.app.Fragment] */
    public final boolean LJIILL(FragmentManager fragmentManager) {
        if (this.LJIILIIL) {
            return false;
        }
        this.LJIIJ.pm(fragmentManager, this.LJIILL);
        List<Integer> list = this.LJIILL;
        if (list != null && !list.isEmpty()) {
            ((IMusicService) ServiceManager.get().getService(IMusicService.class)).LJJJLL();
            C15JK c15jk = this.LJJIIJ;
            c15jk.LJIJJLI = this.LJIILLIIL;
            C15JJ.LJII(c15jk);
        }
        this.LJIILIIL = true;
        return true;
    }

    public final int LIZ(MusicModel musicModel, Integer num) {
        if (C1399580mWa.LIZ() && !LJIIZILJ()) {
            if (musicModel != null) {
                return musicModel.getDuration();
            }
            if (num != null) {
                return num.intValue();
            }
            return 0;
        }
        return C1465190oEP.LIZJ(musicModel, num);
    }

    public final void LJII(List<MusicWaveBean> list, List<String> list2) {
        ChooseMusicCutViewModel chooseMusicCutViewModel;
        LiveData liveData;
        LJIILLIIL(this.LJFF, false);
        IAVInfoService iAVInfoServiceInfoService = ((IExternalService) ServiceManager.get().getService(IExternalService.class)).abilityService().infoService();
        String str = (String) C13LP.LJJJLL(list2);
        if (str == null) {
            str = "";
        }
        int musicDuration = iAVInfoServiceInfoService.getMusicDuration(str);
        if ((!list.isEmpty()) && (chooseMusicCutViewModel = this.LJIIIZ) != null && (liveData = (LiveData) chooseMusicCutViewModel.LLILLL.getValue()) != null) {
            liveData.postValue(new C15JD(null, list, this.LJIJJ, 0, this.LJJIFFI, null, list2, musicDuration, 0, 0, 7393));
        }
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [X.15JN, androidx.fragment.app.Fragment] */
    /* JADX WARN: Type inference failed for: r0v4, types: [X.15JN, androidx.fragment.app.Fragment] */
    /* JADX WARN: Type inference failed for: r0v6, types: [X.15JN, androidx.fragment.app.Fragment] */
    public final void LJIIIIZZ(final MusicModel musicModel, final String str) {
        int iAw;
        int iLIZ = LIZ(musicModel, Integer.valueOf(musicModel.getDuration()));
        int videoDuration = this.LJJIFFI;
        if (videoDuration == 0) {
            videoDuration = musicModel.getVideoDuration();
        }
        if (LJIJ() && iLIZ < LIZIZ()) {
            iAw = (this.LJIIJ.Aw() * iLIZ) / LIZIZ();
        } else if (1 <= videoDuration && videoDuration < iLIZ) {
            iAw = (this.LJIIJ.Aw() * iLIZ) / videoDuration;
        } else {
            iAw = this.LJIIJ.Aw();
        }
        C15KF.LIZIZ(str, iAw, new C15KJ() { // from class: X.1444
            @Override // X.C15KJ
            public final void LIZ(List<MusicWaveBean> list) {
            }

            @Override // X.C15KJ
            public final void LIZIZ(MusicWaveBean musicWaveBean) {
                this.LIZ.LJIIIZ(musicWaveBean, musicModel, str);
            }
        });
    }

    public final void LJIILIIL(MusicModel musicModel, C15HO c15ho) {
        String str;
        int i;
        String str2;
        C15H0 c15h0 = this.LJI;
        if (c15h0 != null) {
            c15h0.ru(musicModel);
        }
        if (c15ho != null) {
            str = c15ho.LIZJ;
        } else {
            str = null;
        }
        if (!Intrinsics.LJFF(str, "change_music_bar")) {
            if (c15ho != null && (str2 = c15ho.LJIILL) != null) {
                i = CastIntegerProtector.parseInt(str2);
            } else {
                i = -1;
            }
            C15IK.LJIJ(c15ho, musicModel, i, musicModel.getLogPb());
        }
    }

    public final void LJIILLIIL(Context context, boolean z) {
        if (z) {
            this.LJIIL = C1399150mVt.LIZIZ(context, EnumC1399740mWq.VISIBLE, new InterfaceC1399770mWt() { // from class: X.15JG
                @Override // X.InterfaceC1399770mWt
                public final void LIZ() {
                }
            });
            return;
        }
        ProgressDialogC1399760mWs progressDialogC1399760mWs = this.LJIIL;
        if (progressDialogC1399760mWs == null) {
            return;
        }
        progressDialogC1399760mWs.dismiss();
        C785410UrT.LIZ(progressDialogC1399760mWs);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [X.15JN, androidx.fragment.app.Fragment] */
    public C15JB(Fragment fragment, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        this.LIZ = fragment;
        this.LIZIZ = layoutInflater;
        this.LIZJ = viewGroup;
        this.LJFF = fragment.requireActivity();
        LIZLLL(this.LJIIJ);
    }

    public final void LJIIIZ(MusicWaveBean musicWaveBean, MusicModel musicModel, String str) {
        ChooseMusicCutViewModel chooseMusicCutViewModel;
        LiveData liveData;
        int trimmedMusicDuration = 0;
        LJIILLIIL(this.LJFF, false);
        int musicDuration = ((IExternalService) ServiceManager.get().getService(IExternalService.class)).abilityService().infoService().getMusicDuration(str);
        if (((IExternalService) ServiceManager.get().getService(IExternalService.class)).abilityService().infoService().supportTrimmedMuisc(musicModel)) {
            trimmedMusicDuration = musicModel.getTrimmedMusicDuration();
        }
        if (musicWaveBean != null && (chooseMusicCutViewModel = this.LJIIIZ) != null && (liveData = (LiveData) chooseMusicCutViewModel.LLILLL.getValue()) != null) {
            liveData.postValue(new C15JD(musicWaveBean, null, musicModel, musicModel.getMusicStartFromCut(), this.LJJIFFI, str, null, LIZ(musicModel, Integer.valueOf(musicDuration)), trimmedMusicDuration, LIZIZ(), 2402));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0085  */
    /* JADX WARN: Type inference failed for: r0v86, types: [X.15JN, androidx.fragment.app.Fragment] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIJ(X.C19EG r16, final com.ss.android.ugc.aweme.shortvideo.model.MusicModel r17, final java.util.List<? extends com.ss.android.ugc.aweme.shortvideo.model.MusicModel> r18) {
        /*
            Method dump skipped, instruction units count: 735
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C15JB.LJIIJ(X.19EG, com.ss.android.ugc.aweme.shortvideo.model.MusicModel, java.util.List):void");
    }

    public final void LJIIJJI(int i, int i2, int i3, String str) {
        CutMusicRepeartPlayer cutMusicRepeartPlayer;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        CutMusicRepeartPlayer cutMusicRepeartPlayer2 = this.LJII;
        if (cutMusicRepeartPlayer2 != null) {
            cutMusicRepeartPlayer2.LIZIZ();
        }
        C19EG c19egLIZIZ = C1388190mED.LIZIZ(this.LJFF);
        if (c19egLIZIZ != null) {
            CutMusicRepeartPlayer cutMusicRepeartPlayer3 = new CutMusicRepeartPlayer(c19egLIZIZ, str, i2, this.LIZ);
            this.LJII = cutMusicRepeartPlayer3;
            C15JH c15jh = cutMusicRepeartPlayer3.LLILZLL;
            if (c15jh != null) {
                c15jh.LIZIZ = 0;
            }
            cutMusicRepeartPlayer3.LIZ(i);
            cutMusicRepeartPlayer3.LLIZLLLIL = new C15JE(this, i3);
            if (LJIJ() && (cutMusicRepeartPlayer = this.LJII) != null) {
                C15JH c15jh2 = this.LJIIIIZZ;
                c15jh2.LIZ = LIZIZ();
                c15jh2.LIZJ = LIZ(this.LJIJJ, null);
                cutMusicRepeartPlayer.LLILZLL = c15jh2;
                return;
            }
            return;
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }
}
