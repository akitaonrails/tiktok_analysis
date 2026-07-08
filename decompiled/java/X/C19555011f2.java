package X;

import Y.AfS198S0100000_29;
import Y.AfS60S0110000_29;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.creative.model.SoundEffect;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.model.MusicWaveBean;
import com.ss.android.ugc.effectmanager.common.model.BaseNetResponse;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.AwS110S0201000_29;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.11f2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19555011f2 implements InterfaceC19552911eh {
    public final /* synthetic */ C19555111f3 LIZ;

    @Override // X.InterfaceC19552911eh
    public final C0E48 LIZIZ() {
        return this.LIZ.F4();
    }

    @Override // X.InterfaceC19552911eh
    public final void LIZJ() {
        this.LIZ.S5();
    }

    @Override // X.InterfaceC19552911eh
    public final void LJ() {
        InterfaceC375970Eod interfaceC375970EodH5 = this.LIZ.H5();
        if (interfaceC375970EodH5 != null) {
            interfaceC375970EodH5.exit(false);
        }
        VideoPublishEditModel videoPublishEditModelLJJJLIIL = this.LIZ.LJJJLIIL();
        if (videoPublishEditModelLJJJLIIL != null) {
            C361680EFy.LJJIJ(videoPublishEditModelLJJJLIIL, "sound_effect", true, true);
        }
        C0ETQ c0etqP4 = this.LIZ.P4();
        if (c0etqP4 != null) {
            c0etqP4.close();
        }
    }

    @Override // X.InterfaceC19552911eh
    public final void LJFF() {
        this.LIZ.LLJLIL.pause();
    }

    public C19555011f2(C19555111f3 c19555111f3) {
        this.LIZ = c19555111f3;
    }

    @Override // X.InterfaceC19552911eh
    public final void LJII(Pair<Integer, Integer> pair, C19556311fF c19556311fF) {
        SoundEffect soundEffect = c19556311fF.LIZ;
        String strLJI = C1403010mc7.LIZ.getMusicService().LJI(C19556611fI.LIZ(soundEffect));
        if (C123100dR.LIZ(strLJI) && C2486109oh.LIZ(strLJI) == 0) {
            soundEffect.fileLocalPath = strLJI;
            soundEffect.fileDuration = C1403010mc7.LIZ.getMusicService().getMusicDuration(strLJI);
            LJIIJ(pair, EnumC19554111et.DOWNLOAD, 3);
            return;
        }
        LJIIIIZZ(pair, soundEffect);
    }

    public final void LJIIIIZZ(final Pair<Integer, Integer> pair, final SoundEffect soundEffect) {
        C0CHQ.LIZ().LJJJJL().LJ("sound_effect", C0CHQ.LIZ, C19556611fI.LIZ(soundEffect), 0, false, new InterfaceC1416880myU() { // from class: X.11f1
            @Override // X.InterfaceC1416880myU
            public final void LIZJ(boolean z) {
            }

            @Override // X.InterfaceC1416880myU
            public final void onProgress(int i) {
            }

            @Override // X.InterfaceC1416880myU
            public final void onStart() {
                this.LIZ.LJIIJ(pair, EnumC19554111et.DOWNLOAD, 2);
            }

            @Override // X.InterfaceC1416880myU
            public final void LIZ(Integer num, String str) {
                C19563211gM.LIZ(num, C356670Dyb.LIZ(soundEffect), str, false);
                this.LIZ.LJIIJ(pair, EnumC19554111et.DOWNLOAD, 4);
            }

            @Override // X.InterfaceC1416880myU
            public final void LIZIZ(String str, MusicWaveBean musicWaveBean) {
                C19563211gM.LIZ(0, C356670Dyb.LIZ(soundEffect), "", true);
                SoundEffect soundEffect2 = soundEffect;
                soundEffect2.fileLocalPath = str;
                soundEffect2.fileDuration = C1403010mc7.LIZ.getMusicService().getMusicDuration(str);
                this.LIZ.LJIIJ(pair, EnumC19554111et.DOWNLOAD, 3);
            }
        }, false);
    }

    public final void LJIIIZ(final Pair<Integer, Integer> pair, C19556311fF c19556311fF) {
        boolean z;
        List<String> urlList;
        SoundEffect soundEffect = c19556311fF.LIZ;
        this.LIZ.LLJLIL.LJ(new InterfaceC1485120okY() { // from class: X.11f5
            @Override // X.InterfaceC1485120okY
            public final void LIZ(int i, int i2) {
                this.LIZ.LJIIJ(pair, EnumC19554111et.PREVIEW, 3);
            }
        });
        this.LIZ.LLJLIL.LIZ(new InterfaceC1485100okW() { // from class: X.11f6
            @Override // X.InterfaceC1485100okW
            public final void LIZIZ() {
                this.LIZ.LJIIJ(pair, EnumC19554111et.PREVIEW, 1);
            }
        });
        String strLJI = C1403010mc7.LIZ.getMusicService().LJI(C19556611fI.LIZ(soundEffect));
        if (C123100dR.LIZ(strLJI) && C2486109oh.LIZ(strLJI) == 0) {
            z = true;
        } else {
            z = false;
        }
        C1485060okS c1485060okS = new C1485060okS();
        c1485060okS.LJFF = String.valueOf(soundEffect.id);
        c1485060okS.LIZLLL = soundEffect.duration;
        if (z) {
            C356530DyN.LIZ(C0E6D.LIZIZ, "sound effect Preview: local file exist");
            c1485060okS.LIZ = strLJI;
        } else {
            UrlModel urlModel = soundEffect.playUrl;
            if (urlModel != null) {
                urlList = urlModel.getUrlList();
            } else {
                urlList = null;
            }
            c1485060okS.LIZIZ = urlList;
        }
        c1485060okS.LJI = false;
        this.LIZ.LLJLIL.LIZIZ(c1485060okS);
        if (z) {
            C0EU5.LIZIZ(this.LIZ.F4(), "sound_effect_panel", null, true);
            soundEffect.fileLocalPath = strLJI;
            soundEffect.fileDuration = C1403010mc7.LIZ.getMusicService().getMusicDuration(strLJI);
            LJIIJ(pair, EnumC19554111et.DOWNLOAD, 3);
            return;
        }
        C0EU5.LIZIZ(this.LIZ.F4(), "sound_effect_panel", null, false);
        LJIIIIZZ(pair, soundEffect);
    }

    @Override // X.InterfaceC19552911eh
    public final void LIZ(Pair<Integer, Integer> pair, C19556311fF c19556311fF, String str) {
        boolean zBooleanValue;
        String extra;
        String str2;
        String str3;
        SoundEffect soundEffect = c19556311fF.LIZ;
        this.LIZ.E5().LJ = true;
        Boolean bool = this.LIZ.E5().LIZJ.get(C356670Dyb.LIZ(soundEffect));
        boolean z = false;
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        } else {
            zBooleanValue = false;
        }
        boolean z2 = !zBooleanValue;
        if (pair.getFirst().intValue() == 0) {
            z = true;
        }
        String strLIZ = C356670Dyb.LIZ(c19556311fF.LIZ);
        int iIntValue = pair.getSecond().intValue() + 1;
        VideoPublishEditModel videoPublishEditModelLJJJLIIL = this.LIZ.LJJJLIIL();
        C0E48 c0e48F4 = this.LIZ.F4();
        if (videoPublishEditModelLJJJLIIL != null && c0e48F4 != null) {
            C0LAB c0labLJFF = C361680EFy.LJFF(-1L, videoPublishEditModelLJJJLIIL, c0e48F4, new Pair(-1, -1));
            c0labLJFF.LJ("tab_name", str);
            c0labLJFF.LIZ(iIntValue, "index");
            NLETrack nLETrackLIZLLL = C350890DpH.LIZLLL(c0e48F4);
            if (nLETrackLIZLLL == null || (extra = nLETrackLIZLLL.getExtra("ep_audio_music_id")) == null) {
                extra = "";
            }
            c0labLJFF.LJ("music_id", extra);
            if (z) {
                str2 = "favorite";
            } else {
                str2 = "other";
            }
            c0labLJFF.LJ("sound_effect_source", str2);
            c0labLJFF.LJ("sound_effect_id", strLIZ);
            c0labLJFF.LIZ(1, "is_editor_pro");
            if (z2) {
                str3 = "favorite_sound_effect";
            } else {
                str3 = "cancel_favorite_sound_effect";
            }
            C20684815ws.LJIILLIIL(str3, c0labLJFF.LIZ);
        }
        final String strValueOf = String.valueOf(soundEffect.id);
        final boolean z3 = !z2;
        InterfaceC420801kM interfaceC420801kMLJJLL = C11NZ.LJIJJLI(new InterfaceC1478005qU() { // from class: X.11eV
            @Override // X.InterfaceC1478005qU
            public final void subscribe(C09AJ<BaseNetResponse> c09aj) {
                C1C7U.LIZ("SoundEffectCollectionApi$Companion@fc14.collectSoundEffect$1");
                try {
                    BaseNetResponse baseNetResponseLIZ = C19551811eW.LIZ(strValueOf, z3);
                    if (baseNetResponseLIZ.status_code != 0) {
                        c09aj.tryOnError(new IllegalStateException("result list is null"));
                    } else {
                        c09aj.onNext(baseNetResponseLIZ);
                    }
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    c09aj.tryOnError(e);
                }
                C1C7U.LIZIZ("SoundEffectCollectionApi$Companion@fc14.collectSoundEffect$1");
            }
        }).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS60S0110000_29(this, z2, 5), new AfS198S0100000_29(this, 15));
        this.LIZ.E5().LIZJ.put(String.valueOf(soundEffect.id), Boolean.valueOf(z2));
        LJIIJ(pair, EnumC19554111et.COLLECT, z2 ? 1 : 0);
        this.LIZ.LLJL.LIZ(interfaceC420801kMLJJLL);
    }

    @Override // X.InterfaceC19552911eh
    public final void LIZLLL(Pair<Integer, Integer> pair, C19556311fF c19556311fF, String str) {
        C0E48 c0e48F4;
        String extra;
        String str2;
        SoundEffect soundEffect = c19556311fF.LIZ;
        C0EBB c0ebbN5 = this.LIZ.N5();
        if (c0ebbN5 != null) {
            c0ebbN5.LIZJ(soundEffect, C1403010mc7.LIZ.getMusicService().LJI(C19556611fI.LIZ(soundEffect)));
        }
        C356690Dyd c356690Dyd = (C356690Dyd) this.LIZ.N5();
        if (c356690Dyd != null) {
            c356690Dyd.LIZLLL = this.LIZ.LLJLILLLLZIIL;
        }
        InterfaceC375970Eod interfaceC375970EodH5 = this.LIZ.H5();
        if (interfaceC375970EodH5 != null) {
            interfaceC375970EodH5.exit(true);
        }
        C0ETQ c0etqP4 = this.LIZ.P4();
        if (c0etqP4 != null) {
            c0etqP4.close();
        }
        VideoPublishEditModel videoPublishEditModelLJJJLIIL = this.LIZ.LJJJLIIL();
        if (videoPublishEditModelLJJJLIIL != null && (c0e48F4 = this.LIZ.F4()) != null) {
            NLETrack nLETrackLIZLLL = C350890DpH.LIZLLL(c0e48F4);
            if (nLETrackLIZLLL != null) {
                extra = nLETrackLIZLLL.getExtra("ep_audio_music_id");
            } else {
                extra = null;
            }
            String strLIZ = C356670Dyb.LIZ(c19556311fF.LIZ);
            if (pair.getFirst().intValue() == 0) {
                str2 = "favorite";
            } else {
                str2 = "other";
            }
            int iIntValue = pair.getSecond().intValue() + 1;
            C0LAB c0labLJFF = C361680EFy.LJFF(-1L, videoPublishEditModelLJJJLIIL, c0e48F4, new Pair(-1, -1));
            if (extra == null) {
                extra = "";
            }
            c0labLJFF.LJ("music_id", extra);
            if (strLIZ == null) {
                strLIZ = "";
            }
            c0labLJFF.LJ("sound_effect_id", strLIZ);
            c0labLJFF.LJ("sound_effect_source", str2);
            c0labLJFF.LJ("tab_name", str);
            c0labLJFF.LIZ(iIntValue, "index");
            c0labLJFF.LIZ(1, "is_editor_pro");
            C20684815ws.LJIILLIIL("select_sound_effect", c0labLJFF.LIZ);
        }
    }

    public final void LJIIJ(Pair<Integer, Integer> pair, EnumC19554111et enumC19554111et, int i) {
        this.LIZ.i3(new AwS110S0201000_29((Pair) pair, (Pair<Integer, Integer>) enumC19554111et, (EnumC19554111et) i, 3));
    }

    @Override // X.InterfaceC19552911eh
    public final void LJI(Pair<Integer, Integer> pair, Pair<Integer, Integer> pair2, C19556311fF c19556311fF, String str) {
        boolean z;
        boolean z2;
        String extra;
        String str2;
        String str3;
        if (Intrinsics.LJFF(pair, pair2) && this.LIZ.LLJLIL.isPlaying()) {
            z = true;
        } else {
            z = false;
        }
        if (pair2.getFirst().intValue() == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        String strLIZ = C356670Dyb.LIZ(c19556311fF.LIZ);
        int iIntValue = pair2.getSecond().intValue() + 1;
        VideoPublishEditModel videoPublishEditModelLJJJLIIL = this.LIZ.LJJJLIIL();
        C0E48 c0e48F4 = this.LIZ.F4();
        if (videoPublishEditModelLJJJLIIL != null && c0e48F4 != null) {
            C0LAB c0labLJFF = C361680EFy.LJFF(-1L, videoPublishEditModelLJJJLIIL, c0e48F4, new Pair(-1, -1));
            c0labLJFF.LJ("tab_name", str);
            c0labLJFF.LIZ(iIntValue, "index");
            NLETrack nLETrackLIZLLL = C350890DpH.LIZLLL(c0e48F4);
            if (nLETrackLIZLLL == null || (extra = nLETrackLIZLLL.getExtra("ep_audio_music_id")) == null) {
                extra = "";
            }
            c0labLJFF.LJ("music_id", extra);
            if (z2) {
                str2 = "favorite";
            } else {
                str2 = "other";
            }
            c0labLJFF.LJ("sound_effect_source", str2);
            c0labLJFF.LJ("sound_effect_id", strLIZ);
            c0labLJFF.LIZ(1, "is_editor_pro");
            if (z) {
                str3 = "play";
            } else {
                str3 = "pause";
            }
            c0labLJFF.LJ("to_status", str3);
            C20684815ws.LJIILLIIL("sound_effect_click", c0labLJFF.LIZ);
        }
        if (Intrinsics.LJFF(pair, pair2)) {
            if (this.LIZ.LLJLIL.isPlaying()) {
                this.LIZ.LLJLIL.pause();
                LJIIJ(pair2, EnumC19554111et.PREVIEW, 1);
                return;
            } else {
                LJIIIZ(pair2, c19556311fF);
                return;
            }
        }
        this.LIZ.LLJLIL.pause();
        if (pair != null) {
            LJIIJ(pair, EnumC19554111et.PREVIEW, 1);
            LJIIJ(pair, EnumC19554111et.SELECT, 1);
        }
        LJIIJ(pair2, EnumC19554111et.SELECT, 0);
        LJIIIZ(pair2, c19556311fF);
    }
}
