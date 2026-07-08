package X;

import Y.ARunnableS11S0202000_31;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentManager;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.choosemusic.cutpanel.CutMusicPanel;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.common.LogPbBean;
import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import com.ss.android.ugc.aweme.creative.model.music.MusicBuzModel;
import com.ss.android.ugc.aweme.creative.model.music.MusicObject;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.music.model.FullSongDetail;
import com.ss.android.ugc.aweme.music.model.MatchedSoundInfo;
import com.ss.android.ugc.aweme.music.model.MusicBeanUtilKt;
import com.ss.android.ugc.aweme.music.service.IMusicService;
import com.ss.android.ugc.aweme.port.in.IAnotherMusicService;
import com.ss.android.ugc.aweme.shortvideo.CameraComponentModel;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.cutmusic.RepeatMusicPlayer;
import com.ss.android.ugc.aweme.shortvideo.model.MusicWaveBean;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS569S0100000_25;
import kotlin.jvm.internal.AwS674S0100000_25;

/* JADX INFO: renamed from: X.15KT, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C15KT extends Scene implements C15K0 {
    public final Function0<InterfaceC20500415Jq> LLJI;
    public final InterfaceC1631620sYq<Integer, Integer, Boolean, Unit> LLJIJIL;
    public ShortVideoContext LLJILJIL;
    public C15JN LLJILJILJ;
    public int LLJILLL;
    public RepeatMusicPlayer LLJJ;
    public int LLJJIJI;
    public int LLJJJ;
    public List<Integer> LLJJJIL;
    public ArrayList<String> LLJJJJ;
    public AVMusic LLJJJJJIL;
    public boolean LLJJLIIIJLLLLLLLZ;
    public String LLJJI = "";
    public C15JK LLJJIII = new C15JK(null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, 0, false, null, null, null, null, 268435455);
    public String LLJJIJIIJIL = "";
    public String LLJJIJIL = "";
    public final String LLJJJJLIIL = "entrance_icon";
    public final C15K3 LLJJL = new C15K3();

    public final int LLLII() {
        AVMusic aVMusic = this.LLJJJJJIL;
        if (aVMusic != null && C1399580mWa.LIZ() && C1459090o4Z.LIZ(aVMusic) && aVMusic.getMusicEndTime() > aVMusic.getMusicStart()) {
            return aVMusic.getMusicEndTime() - aVMusic.getMusicStart();
        }
        ShortVideoContext shortVideoContext = this.LLJILJIL;
        if (shortVideoContext == null) {
            shortVideoContext = null;
        }
        if (shortVideoContext.cameraComponentModel.mMusicPath != null) {
            IAnotherMusicService musicService = C1403010mc7.LIZ.getMusicService();
            ShortVideoContext shortVideoContext2 = this.LLJILJIL;
            return musicService.getMusicDuration((shortVideoContext2 != null ? shortVideoContext2 : null).cameraComponentModel.mMusicPath);
        }
        AVMusic aVMusic2 = this.LLJJJJJIL;
        if (aVMusic2 != null) {
            return aVMusic2.getDuration();
        }
        return 0;
    }

    public final int LLLIIIIL() {
        AVMusic aVMusic = this.LLJJJJJIL;
        return (aVMusic == null || !C1399580mWa.LIZ() || !C1459090o4Z.LIZ(aVMusic) || aVMusic.getMusicEndTime() <= 0) ? this.LLJJJ : Math.min(aVMusic.getMusicEndTime() - aVMusic.getMusicStart(), this.LLJJJ);
    }

    public final void LLLIZZ() {
        C201955140j.LIZLLL(C201962140q.LIZIZ, "NewRepeatMusicPlayer", "RecordMusicCutScene stopPlayMusic");
        RepeatMusicPlayer repeatMusicPlayer = this.LLJJ;
        if (repeatMusicPlayer != null) {
            repeatMusicPlayer.LIZJ();
        }
        this.LLJJ = null;
    }

    public final int LLLIL() {
        if (C1458070o2v.LJFF()) {
            int i = this.LLJILLL;
            ShortVideoContext shortVideoContext = this.LLJILJIL;
            if (shortVideoContext == null) {
                shortVideoContext = null;
            }
            if (i < LLLIILIL(shortVideoContext)) {
                C15JN c15jn = this.LLJILJILJ;
                if (c15jn == null) {
                    c15jn = null;
                }
                int iAw = c15jn.Aw() * this.LLJILLL;
                ShortVideoContext shortVideoContext2 = this.LLJILJIL;
                return iAw / LLLIILIL(shortVideoContext2 != null ? shortVideoContext2 : null);
            }
        }
        int i2 = this.LLJILLL;
        int i3 = this.LLJJJ;
        if (1 > i3 || i3 >= i2) {
            C15JN c15jn2 = this.LLJILJILJ;
            return (c15jn2 != null ? c15jn2 : null).Aw();
        }
        C15JN c15jn3 = this.LLJILJILJ;
        return ((c15jn3 != null ? c15jn3 : null).Aw() * this.LLJILLL) / this.LLJJJ;
    }

    public final boolean LLLJ() {
        if (!C1458070o2v.LJFF()) {
            return false;
        }
        if (this.LLJJJJJIL == null) {
            return true;
        }
        ShortVideoContext shortVideoContext = this.LLJILJIL;
        if ((shortVideoContext == null ? null : shortVideoContext).shootMode == 16) {
            return false;
        }
        if (shortVideoContext == null) {
            shortVideoContext = null;
        }
        if (shortVideoContext.shootMode == 29) {
            return false;
        }
        int iLLLII = LLLII();
        ShortVideoContext shortVideoContext2 = this.LLJILJIL;
        int iLLLIILIL = LLLIILIL(shortVideoContext2 != null ? shortVideoContext2 : null);
        return Math.abs(iLLLII - iLLLIILIL) > 200 && iLLLII <= iLLLIILIL;
    }

    @Override // com.bytedance.scene.Scene
    public final void onDestroyView() {
        super.onDestroyView();
        C15JN c15jn = this.LLJILJILJ;
        if (c15jn == null) {
            c15jn = null;
        }
        c15jn.onDestroy();
    }

    @Override // com.bytedance.scene.Scene
    public final void onStart() {
        super.onStart();
        LLLILZ(this.LLJJIJI, LLLIIIIL());
    }

    @Override // com.bytedance.scene.Scene
    public final void onStop() {
        super.onStop();
        LLLIZZ();
    }

    public static int LLLIILIL(ShortVideoContext shortVideoContext) {
        AVMusic aVMusicExtractAVMusic;
        int shootDuration;
        boolean z;
        boolean zIsUnlimitedMusic;
        CreativeModel creativeModel;
        MusicBuzModel musicBuzModel;
        MusicObject musicObject;
        if (shortVideoContext != null && (creativeModel = shortVideoContext.creativeModel) != null && (musicBuzModel = creativeModel.musicBuzModel) != null && (musicObject = musicBuzModel.music) != null) {
            aVMusicExtractAVMusic = MusicBeanUtilKt.extractAVMusic(musicObject);
        } else {
            aVMusicExtractAVMusic = null;
        }
        if (C1458070o2v.LJFF()) {
            shootDuration = C1458070o2v.LIZLLL();
        } else if (aVMusicExtractAVMusic != null) {
            shootDuration = aVMusicExtractAVMusic.getShootDuration();
        } else {
            shootDuration = 0;
        }
        long maxShootingDuration = C0CHQ.LIZ().LJJJJJ().getMaxDurationResolver().getMaxShootingDuration(!shortVideoContext.cameraComponentModel.mCurrentDurationMode, shortVideoContext);
        int i = shortVideoContext.shootMode;
        if (i == 16) {
            z = true;
        } else {
            z = false;
        }
        if (!z && i != 29 && C1458070o2v.LJ(shortVideoContext.creativeModel.musicBuzModel)) {
            maxShootingDuration = shortVideoContext.cameraComponentModel.mMaxDuration;
        }
        int i2 = (int) maxShootingDuration;
        if (aVMusicExtractAVMusic != null) {
            zIsUnlimitedMusic = aVMusicExtractAVMusic.isUnlimitedMusic();
        } else {
            zIsUnlimitedMusic = false;
        }
        if (!C1458070o2v.LJFF()) {
            return 0;
        }
        if (zIsUnlimitedMusic) {
            return i2;
        }
        int iLIZJ = (int) C1442040nd4.LIZJ(aVMusicExtractAVMusic, shortVideoContext);
        int i3 = shortVideoContext.shootMode;
        if (i3 != 16 && i3 != 29) {
            if (iLIZJ > shootDuration) {
                return Math.min(i2, iLIZJ);
            }
            return Math.min(i2, shootDuration);
        }
        return Math.min(i2, Math.min(iLIZJ, shootDuration));
    }

    /* JADX WARN: Removed duplicated region for block: B:69:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0162  */
    @Override // com.bytedance.scene.Scene
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onActivityCreated(android.os.Bundle r20) {
        /*
            Method dump skipped, instruction units count: 884
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C15KT.onActivityCreated(android.os.Bundle):void");
    }

    @Override // X.C15K0
    public final void onProgress(int i) {
        int iLLLII;
        RepeatMusicPlayer repeatMusicPlayer;
        C15JN c15jn = null;
        if (C1458070o2v.LJFF()) {
            ShortVideoContext shortVideoContext = this.LLJILJIL;
            if (shortVideoContext == null) {
                shortVideoContext = null;
            }
            int iLLLIILIL = LLLIILIL(shortVideoContext);
            C15JN c15jn2 = this.LLJILJILJ;
            if (c15jn2 == null) {
                c15jn2 = null;
            }
            if (c15jn2.Et()) {
                ShortVideoContext shortVideoContext2 = this.LLJILJIL;
                if (shortVideoContext2 == null) {
                    shortVideoContext2 = null;
                }
                iLLLII = LLLIILIL(shortVideoContext2);
            } else {
                iLLLII = LLLII();
            }
            int i2 = this.LLJJIJI;
            if (i - i2 >= iLLLII && (repeatMusicPlayer = this.LLJJ) != null) {
                int iLLLII2 = LLLII() + this.LLJJIJI;
                C15K3 c15k3 = repeatMusicPlayer.LLIZ;
                if (c15k3 != null) {
                    c15k3.LIZIZ = 0;
                }
                repeatMusicPlayer.LIZIZ(i2, iLLLII2);
            }
            C15JN c15jn3 = this.LLJILJILJ;
            if (c15jn3 != null) {
                c15jn = c15jn3;
            }
            View view = c15jn.getView();
            if (view != null) {
                HandlerHook.viewPost(view, new ARunnableS11S0202000_31(view, this, iLLLIILIL, i, 1));
                return;
            }
            return;
        }
        C15JN c15jn4 = this.LLJILJILJ;
        if (c15jn4 != null) {
            c15jn = c15jn4;
        }
        c15jn.BJ(((i - this.LLJJIJI) * 1.0f) / this.LLJILLL);
    }

    public C15KT(AwS569S0100000_25 awS569S0100000_25, AwS674S0100000_25 awS674S0100000_25) {
        this.LLJI = awS569S0100000_25;
        this.LLJIJIL = awS674S0100000_25;
    }

    /* JADX WARN: Removed duplicated region for block: B:65:0x00ea  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LLLILZ(int r12, int r13) {
        /*
            Method dump skipped, instruction units count: 245
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C15KT.LLLILZ(int, int):void");
    }

    public final void LLLILZLLLI(MusicWaveBean musicWaveBean, boolean z) {
        String str;
        FragmentManager supportFragmentManager;
        ShortVideoContext shortVideoContext;
        IMusicService iMusicService;
        String musicId;
        LLLJL(this.LLJILLL, this.LLJJIJI, musicWaveBean);
        if (z) {
            C19EG c19eg = (C19EG) this.mActivity;
            ShortVideoContext shortVideoContext2 = null;
            if (c19eg != null && (supportFragmentManager = c19eg.getSupportFragmentManager()) != null) {
                C15JN c15jn = this.LLJILJILJ;
                if (c15jn == null) {
                    c15jn = null;
                }
                c15jn.LLLIIII(this.LLJJJIL);
                C15JN c15jn2 = this.LLJILJILJ;
                if (c15jn2 == null) {
                    c15jn2 = null;
                }
                C15JK c15jk = this.LLJJIII;
                ShortVideoContext shortVideoContext3 = this.LLJILJIL;
                if (shortVideoContext3 == null) {
                    shortVideoContext = null;
                } else {
                    shortVideoContext = shortVideoContext3;
                }
                String str2 = shortVideoContext.shootWay;
                if (shortVideoContext3 == null) {
                    shortVideoContext3 = null;
                }
                String creationId = shortVideoContext3.getCreationId();
                ShortVideoContext shortVideoContext4 = this.LLJILJIL;
                if (shortVideoContext4 == null) {
                    shortVideoContext4 = null;
                }
                String contentSource = shortVideoContext4.LJ().getContentSource();
                ShortVideoContext shortVideoContext5 = this.LLJILJIL;
                if (shortVideoContext5 == null) {
                    shortVideoContext5 = null;
                }
                c15jn2.OJ(C15JK.LIZ(c15jk, "video_shoot_page", str2, creationId, contentSource, shortVideoContext5.LJ().getContentType(), null, null, null, false, null, this.LLJJJJ, false, null, null, null, 266338272));
                C15JN c15jn3 = this.LLJILJILJ;
                if (c15jn3 == null) {
                    c15jn3 = null;
                }
                c15jn3.pm(supportFragmentManager, this.LLJJJIL);
                List<Integer> list = this.LLJJJIL;
                if (list != null && !list.isEmpty() && (iMusicService = (IMusicService) PluggableExtentionKt.pluggableSpi$default(IMusicService.class, false, false, false, 14, null)) != null) {
                    iMusicService.LJJJLL();
                    C2344009Gk c2344009Gk = new C2344009Gk();
                    ShortVideoContext shortVideoContext6 = this.LLJILJIL;
                    if (shortVideoContext6 == null) {
                        shortVideoContext6 = null;
                    }
                    c2344009Gk.LJIIIIZZ("content_source", shortVideoContext6.LJ().getContentSource());
                    ShortVideoContext shortVideoContext7 = this.LLJILJIL;
                    if (shortVideoContext7 == null) {
                        shortVideoContext7 = null;
                    }
                    c2344009Gk.LJIIIIZZ("content_type", shortVideoContext7.LJ().getContentType());
                    c2344009Gk.LJIIIIZZ("enter_from", "video_shoot_page");
                    c2344009Gk.LJIIIIZZ("enter_method", this.LLJJJJLIIL);
                    ShortVideoContext shortVideoContext8 = this.LLJILJIL;
                    if (shortVideoContext8 == null) {
                        shortVideoContext8 = null;
                    }
                    c2344009Gk.LJIIIIZZ("shoot_way", shortVideoContext8.shootWay);
                    c2344009Gk.LIZJ(0, "is_multi_content");
                    ShortVideoContext shortVideoContext9 = this.LLJILJIL;
                    if (shortVideoContext9 == null) {
                        shortVideoContext9 = null;
                    }
                    c2344009Gk.LJIIIIZZ("creation_id", shortVideoContext9.getCreationId());
                    AVMusic aVMusic = this.LLJJJJJIL;
                    if (aVMusic != null) {
                        musicId = aVMusic.getMusicId();
                    } else {
                        musicId = null;
                    }
                    c2344009Gk.LJIIIIZZ("music_id", musicId);
                    c2344009Gk.LJ(this.LLJJJJ, "trim_type");
                    C20684815ws.LJIILLIIL("smart_trim_point_show", c2344009Gk.LIZ);
                }
            }
            C2344009Gk c2344009Gk2 = new C2344009Gk();
            ShortVideoContext shortVideoContext10 = this.LLJILJIL;
            if (shortVideoContext10 != null) {
                shortVideoContext2 = shortVideoContext10;
            }
            c2344009Gk2.LJIIIIZZ("creation_id", shortVideoContext2.getCreationId());
            c2344009Gk2.LJIIIIZZ("enter_from", "video_shoot_page");
            if (LLLJ()) {
                str = "1";
            } else {
                str = CardStruct.IStatusCode.DEFAULT;
            }
            c2344009Gk2.LJIIIIZZ("has_music_loop_switch", str);
            C20684815ws.LJIILLIIL("music_trim_panel_show", c2344009Gk2.LIZ);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LLLJL(int r10, int r11, com.ss.android.ugc.aweme.shortvideo.model.MusicWaveBean r12) {
        /*
            r9 = this;
            r4 = r12
            if (r4 == 0) goto L40
            X.15JN r3 = r9.LLJILJILJ
            r2 = 0
            if (r3 != 0) goto L9
            r3 = r2
        L9:
            int r7 = r9.LLJJJ
            boolean r0 = X.C1458070o2v.LJFF()
            if (r0 == 0) goto L41
            int r1 = r9.LLJILLL
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r0 = r9.LLJILJIL
            if (r0 != 0) goto L18
            r0 = r2
        L18:
            int r0 = LLLIILIL(r0)
            if (r1 >= r0) goto L41
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r0 = r9.LLJILJIL
            if (r0 != 0) goto L23
            r0 = r2
        L23:
            int r8 = LLLIILIL(r0)
        L27:
            r6 = r11
            r5 = r10
            r3.rw(r4, r5, r6, r7, r8)
            X.15JN r1 = r9.LLJILJILJ
            if (r1 != 0) goto L31
            r1 = r2
        L31:
            java.lang.String r0 = r9.LLJJIJIIJIL
            r1.mL(r0)
            X.15JN r0 = r9.LLJILJILJ
            if (r0 == 0) goto L3b
            r2 = r0
        L3b:
            java.lang.String r0 = r9.LLJJIJIL
            r2.Na(r0)
        L40:
            return
        L41:
            r8 = 0
            goto L27
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C15KT.LLLJL(int, int, com.ss.android.ugc.aweme.shortvideo.model.MusicWaveBean):void");
    }

    @Override // com.bytedance.scene.Scene
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        EnumC19381710sB enumC19381710sB;
        String musicId;
        String str;
        int i;
        boolean z;
        MatchedSoundInfo matchedSongInfo;
        if (C204644155u.LIZ(requireSceneContext())) {
            enumC19381710sB = EnumC19381710sB.WHITE;
        } else {
            enumC19381710sB = EnumC19381710sB.DARK;
        }
        CutMusicPanel cutMusicPanelLJJII = ((IMusicService) ServiceManager.get().getService(IMusicService.class)).LJJII();
        this.LLJILJILJ = cutMusicPanelLJJII;
        String id = null;
        if (cutMusicPanelLJJII == null) {
            cutMusicPanelLJJII = null;
        }
        cutMusicPanelLJJII.getClass();
        C15JN c15jn = this.LLJILJILJ;
        if (c15jn == null) {
            c15jn = null;
        }
        c15jn.bA((C19EG) requireActivity(), layoutInflater, viewGroup, enumC19381710sB);
        C15JN c15jn2 = this.LLJILJILJ;
        if (c15jn2 == null) {
            c15jn2 = null;
        }
        c15jn2.My(new InterfaceC20503815Ky() { // from class: X.15KU
            @Override // X.InterfaceC20503815Ky
            public final void LIZIZ(List<C15JF> list) {
            }

            @Override // X.InterfaceC20503815Ky
            public final void LIZJ() {
            }

            @Override // X.InterfaceC20503815Ky
            public final void LJFF(long j) {
            }

            @Override // X.InterfaceC20503815Ky
            public final void LIZ() {
                String imprId;
                MatchedSoundInfo matchedSongInfo2;
                C15KT c15kt = this.LIZ;
                ShortVideoContext shortVideoContext = c15kt.LLJILJIL;
                if (shortVideoContext == null) {
                    shortVideoContext = null;
                }
                MusicBuzModel musicBuzModel = shortVideoContext.creativeModel.musicBuzModel;
                int i2 = c15kt.LLJJIJI;
                musicBuzModel.musicStart = i2;
                InterfaceC1631620sYq<Integer, Integer, Boolean, Unit> interfaceC1631620sYq = c15kt.LLJIJIL;
                Integer numValueOf = Integer.valueOf(i2);
                C15KT c15kt2 = this.LIZ;
                interfaceC1631620sYq.invoke(numValueOf, Integer.valueOf(c15kt2.LLJJIJI + c15kt2.LLLIIIIL()), Boolean.TRUE);
                this.LIZ.LLLIZZ();
                ShortVideoContext shortVideoContext2 = this.LIZ.LLJILJIL;
                if (shortVideoContext2 == null) {
                    shortVideoContext2 = null;
                }
                AVMusic aVMusicExtractAVMusic = MusicBeanUtilKt.extractAVMusic(shortVideoContext2.creativeModel.musicBuzModel);
                C2344009Gk c2344009Gk = new C2344009Gk();
                ShortVideoContext shortVideoContext3 = this.LIZ.LLJILJIL;
                if (shortVideoContext3 == null) {
                    shortVideoContext3 = null;
                }
                c2344009Gk.LJIIIIZZ("content_source", shortVideoContext3.LJ().getContentSource());
                ShortVideoContext shortVideoContext4 = this.LIZ.LLJILJIL;
                if (shortVideoContext4 == null) {
                    shortVideoContext4 = null;
                }
                c2344009Gk.LJIIIIZZ("content_type", shortVideoContext4.LJ().getContentType());
                ShortVideoContext shortVideoContext5 = this.LIZ.LLJILJIL;
                if (shortVideoContext5 == null) {
                    shortVideoContext5 = null;
                }
                c2344009Gk.LJIIIIZZ("creation_id", shortVideoContext5.getCreationId());
                c2344009Gk.LJIIIIZZ("enter_from", "video_shoot_page");
                c2344009Gk.LJIIIIZZ("music_id", aVMusicExtractAVMusic != null ? aVMusicExtractAVMusic.getMusicId() : null);
                c2344009Gk.LJIIIIZZ("music_edited_from", aVMusicExtractAVMusic != null ? aVMusicExtractAVMusic.getEditFrom() : null);
                c2344009Gk.LJ(aVMusicExtractAVMusic != null ? Boolean.valueOf(aVMusicExtractAVMusic.isPgc()) : null, "is_pgc");
                c2344009Gk.LJIIIIZZ("meta_song_id", (aVMusicExtractAVMusic == null || (matchedSongInfo2 = aVMusicExtractAVMusic.getMatchedSongInfo()) == null) ? null : matchedSongInfo2.getId());
                c2344009Gk.LJIIIIZZ("enter_method", this.LIZ.LLJJJJLIIL);
                ShortVideoContext shortVideoContext6 = this.LIZ.LLJILJIL;
                if (shortVideoContext6 == null) {
                    shortVideoContext6 = null;
                }
                c2344009Gk.LJIIIIZZ("shoot_way", shortVideoContext6.shootWay);
                c2344009Gk.LIZJ(0, "is_multi_content");
                c2344009Gk.LJ(aVMusicExtractAVMusic != null ? Integer.valueOf(aVMusicExtractAVMusic.getDuration()) : null, "original_music_duration");
                long duration = aVMusicExtractAVMusic != null ? aVMusicExtractAVMusic.getDuration() : 0L;
                ShortVideoContext shortVideoContext7 = this.LIZ.LLJILJIL;
                if (shortVideoContext7 == null) {
                    shortVideoContext7 = null;
                }
                c2344009Gk.LIZLLL(Math.min(duration, shortVideoContext7.LJIILIIL()), "new_music_duration");
                c2344009Gk.LIZJ(0, "is_editor_pro");
                List<Integer> list = this.LIZ.LLJJJIL;
                c2344009Gk.LIZJ(((list == null || list.isEmpty()) ? 1 : 0) ^ 1, "has_smart_trim_point");
                long jCurrentTimeMillis = System.currentTimeMillis();
                ShortVideoContext shortVideoContext8 = this.LIZ.LLJILJIL;
                if (shortVideoContext8 == null) {
                    shortVideoContext8 = null;
                }
                c2344009Gk.LIZLLL(jCurrentTimeMillis - shortVideoContext8.creativeModel.musicBuzModel.enterTrimPanelTime, "edit_duration");
                ShortVideoContext shortVideoContext9 = this.LIZ.LLJILJIL;
                if (shortVideoContext9 == null) {
                    shortVideoContext9 = null;
                }
                LogPbBean logPbBean = shortVideoContext9.creativeModel.musicBuzModel.logPb;
                if (logPbBean == null || (imprId = logPbBean.getImprId()) == null) {
                    imprId = "";
                }
                c2344009Gk.LJIIIIZZ("music_log_id", imprId);
                ShortVideoContext shortVideoContext10 = this.LIZ.LLJILJIL;
                if (shortVideoContext10 == null) {
                    shortVideoContext10 = null;
                }
                c2344009Gk.LJFF("music_selected_from", C1444890nhf.LIZ(shortVideoContext10));
                ShortVideoContext shortVideoContext11 = this.LIZ.LLJILJIL;
                if ((shortVideoContext11 == null ? null : shortVideoContext11).creativeModel.musicBuzModel.fullSongDetail != null) {
                    if (shortVideoContext11 == null) {
                        shortVideoContext11 = null;
                    }
                    FullSongDetail fullSongDetail = shortVideoContext11.creativeModel.musicBuzModel.fullSongDetail;
                    if (fullSongDetail != null && fullSongDetail.getFullSongUrl() != null && (((IMusicService) ServiceManager.get().getService(IMusicService.class)).LJJJJI() || ((IMusicService) ServiceManager.get().getService(IMusicService.class)).LJJIJLIJ())) {
                        ShortVideoContext shortVideoContext12 = this.LIZ.LLJILJIL;
                        ShortVideoContext shortVideoContext13 = shortVideoContext12 != null ? shortVideoContext12 : null;
                        MusicBuzModel musicBuzModel2 = shortVideoContext13.creativeModel.musicBuzModel;
                        MusicObject musicObject = musicBuzModel2.music;
                        int i3 = musicObject != null ? (int) (musicObject.previewStartTime * LSPassThroughRecordSizeConfig.DEFAULT) : 0;
                        int i4 = musicBuzModel2.clipShootDuration + i3;
                        CameraComponentModel cameraComponentModel = shortVideoContext13.cameraComponentModel;
                        int i5 = cameraComponentModel.mMusicStart;
                        c2344009Gk.LIZJ((i5 < i3 || ((long) i5) + cameraComponentModel.mMaxDuration > ((long) i4)) ? 1 : 0, "used_full_song");
                    }
                }
                C20684815ws.LJIILLIIL("edit_music_complete", c2344009Gk.LIZ);
            }

            @Override // X.InterfaceC20503815Ky
            public final void LIZLLL() {
                C15KT c15kt = this.LIZ;
                InterfaceC1631620sYq<Integer, Integer, Boolean, Unit> interfaceC1631620sYq = c15kt.LLJIJIL;
                ShortVideoContext shortVideoContext = c15kt.LLJILJIL;
                if (shortVideoContext == null) {
                    shortVideoContext = null;
                }
                Integer numValueOf = Integer.valueOf(shortVideoContext.cameraComponentModel.mMusicStart);
                ShortVideoContext shortVideoContext2 = this.LIZ.LLJILJIL;
                interfaceC1631620sYq.invoke(numValueOf, Integer.valueOf((shortVideoContext2 != null ? shortVideoContext2 : null).cameraComponentModel.musicEndTime), Boolean.FALSE);
                this.LIZ.LLLIZZ();
            }

            @Override // X.InterfaceC20503815Ky
            public final int LJ(float f) {
                return (int) (this.LIZ.LLJILLL * f);
            }

            @Override // X.InterfaceC20503815Ky
            public final void LJI(float f) {
                if (TextUtils.isEmpty(this.LIZ.LLJJI)) {
                    return;
                }
                C15KT c15kt = this.LIZ;
                int i2 = (int) (c15kt.LLJILLL * f);
                c15kt.LLJJIJI = i2;
                c15kt.LLLILZ(i2, c15kt.LLLIIIIL());
            }
        });
        AVMusic aVMusic = this.LLJJJJJIL;
        if (aVMusic != null) {
            musicId = aVMusic.getMusicId();
        } else {
            musicId = null;
        }
        if (C0MT6.LIZ()) {
            str = "recommend_music";
        } else {
            str = "edit_normal";
        }
        String str2 = this.LLJJJJLIIL;
        List<Integer> list = this.LLJJJIL;
        if (list != null && !list.isEmpty()) {
            i = 0;
        } else {
            i = 1;
        }
        int i2 = i ^ 1;
        ArrayList<String> arrayList = this.LLJJJJ;
        AVMusic aVMusic2 = this.LLJJJJJIL;
        if (aVMusic2 != null && aVMusic2.isPgc()) {
            z = true;
        } else {
            z = false;
        }
        AVMusic aVMusic3 = this.LLJJJJJIL;
        if (aVMusic3 != null && (matchedSongInfo = aVMusic3.getMatchedSongInfo()) != null) {
            id = matchedSongInfo.getId();
        }
        this.LLJJIII = new C15JK(musicId, str, null, null, null, null, null, false, null, null, null, null, null, str2, null, null, null, CardStruct.IStatusCode.DEFAULT, i2, z, id, arrayList, null, null, 264364028);
        return C786410Ut5.Td(layoutInflater, R.layout.i9d, viewGroup, false);
    }
}
