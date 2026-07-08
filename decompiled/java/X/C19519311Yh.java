package X;

import Y.AObjectS240S0100000_5;
import Y.AObserverS231S0100000_29;
import android.app.Activity;
import android.media.MediaPlayer;
import com.bytedance.als.LiveEvent;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.mammon.audiosdk.enums.SAMICoreVopState;
import com.ss.android.ugc.aweme.discover.model.Banner;
import com.ss.android.ugc.aweme.editSticker.text.bean.ReadTextEffectSpeakerExtra;
import com.ss.android.ugc.aweme.services.audio.IVopInstantCloneCameraService;
import com.ss.android.ugc.aweme.services.audio.PlayAuditionCallback;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.gamora.editor.sticker.read.voiceclone.TTSRecordStatus;
import com.ss.android.ugc.gamora.editor.sticker.read.voiceclone.TTSSpeakerInfo;
import com.ss.android.ugc.gamora.editor.sticker.read.voiceclone.VoiceCloneReadTextEffectBean;
import com.ss.android.ugc.gamora.editorpro.capabilities.text.tts.EditRepeatMusicPlayer;
import com.ss.android.ugc.gamora.editorpro.capabilities.text.tts.logic.EditorProTTSHelper;
import java.io.File;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS218S0000000_29;
import kotlin.jvm.internal.AFwS273S0000000_29;
import kotlin.jvm.internal.AwS371S0200000_5;
import kotlin.jvm.internal.AwS378S0200000_12;
import kotlin.jvm.internal.AwS395S0200000_29;
import kotlin.jvm.internal.AwS430S0200000_29;
import kotlin.jvm.internal.AwS549S0100000_5;
import kotlin.jvm.internal.AwS558S0100000_14;
import kotlin.jvm.internal.AwS573S0100000_29;
import kotlin.jvm.internal.AwS608S0100000_29;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.11Yh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19519311Yh extends C0ETZ<InterfaceC362470EIz, C19520211Yq, C19519511Yj, C19519811Ym> implements InterfaceC362470EIz {
    public static final C19520011Yo LLLFZ;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLI;
    public static final int LLLII;
    public final C19A3 LLJJI;
    public final C1DRG LLJJIII;
    public final C01GW LLJJIJI;
    public final C01GW LLJJIJIIJIL;
    public final C01GW LLJJIJIL;
    public InterfaceC1461350o8D LLJJJ;
    public EditRepeatMusicPlayer LLJJJIL;
    public DialogC1389620mGW LLJJJJ;
    public final InterfaceC1731706qJ LLJJJJJIL;
    public final Function0<C19519511Yj> LLJJJJLIIL;
    public final Function0<C19519811Ym> LLJJL;
    public final Function0<C19520211Yq> LLJJLIIIJLLLLLLLZ;
    public final C560530Lyd<EnumC361800EGk> LLJL;
    public final C538770LBb<Boolean> LLJLIL;
    public final C538770LBb<TTSSpeakerInfo> LLJLILLLLZIIL;
    public final C538770LBb<VoiceCloneReadTextEffectBean> LLJLL;
    public EnumC361800EGk LLJLLIL;
    public final LiveEvent<EnumC361800EGk> LLJLLL;
    public final C385670FAf<Boolean> LLJZ;
    public final C385670FAf<TTSSpeakerInfo> LLJZIJLIL;
    public final C385670FAf<VoiceCloneReadTextEffectBean> LLL;
    public final InterfaceC1731706qJ LLLF;
    public final InterfaceC1731706qJ LLLFF;
    public final InterfaceC1731706qJ LLLFFI;

    /* JADX WARN: Type inference failed for: r0v9, types: [X.11Yo] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C19519311Yh.class, "textStickerApi", "getTextStickerApi()Lcom/ss/android/ugc/gamora/editorpro/capabilities/text/sticker/text/api/EditorProTextNewApi;", 0);
        C13LE.LIZ.getClass();
        LLLI = new InterfaceC2217461Bqa[]{c2217381BqS, new C2217381BqS(C19519311Yh.class, "bottomBarApi", "getBottomBarApi()Lcom/ss/android/ugc/gamora/editorpro/framework/bottombar/ui/BottomBarApiComponent;", 0), new C2217381BqS(C19519311Yh.class, "epStateApi", "getEpStateApi()Lcom/ss/android/ugc/gamora/editorpro/startup/EditorProStateApi;", 0), new C2217381BqS(C19519311Yh.class, "epInitLegacyApi", "getEpInitLegacyApi()Lcom/ss/android/ugc/gamora/editorpro/startup/EPSceneLegacyApi;", 0)};
        LLLFZ = new Object() { // from class: X.11Yo
        };
        LLLII = 8;
    }

    private final InterfaceC359950E9h k5() {
        return (InterfaceC359950E9h) this.LLLFF.getValue(this, LLLI[2]);
    }

    private final IVopInstantCloneCameraService t5() {
        return (IVopInstantCloneCameraService) this.LLJJIJIL.getValue();
    }

    public final void H4() {
        DialogC1389620mGW dialogC1389620mGW;
        DialogC1389620mGW dialogC1389620mGW2 = this.LLJJJJ;
        if (dialogC1389620mGW2 == null || !dialogC1389620mGW2.isShowing() || (dialogC1389620mGW = this.LLJJJJ) == null) {
            return;
        }
        dialogC1389620mGW.dismiss();
        C785410UrT.LIZ(dialogC1389620mGW);
    }

    public final VideoPublishEditModel LJJJLIIL() {
        return (VideoPublishEditModel) this.LLJJIJI.getValue();
    }

    public final void M5() {
        MediaPlayer mediaPlayer;
        EditRepeatMusicPlayer editRepeatMusicPlayer;
        EditRepeatMusicPlayer editRepeatMusicPlayer2 = this.LLJJJIL;
        if (editRepeatMusicPlayer2 != null && (mediaPlayer = editRepeatMusicPlayer2.LL) != null && mediaPlayer.isPlaying() && (editRepeatMusicPlayer = this.LLJJJIL) != null) {
            editRepeatMusicPlayer.LIZIZ();
        }
        if (t5().isPlayingAudition()) {
            t5().stopAudition();
        }
    }

    public final String P4() {
        return (String) this.LLJJIJIIJIL.getValue();
    }

    public final C0EGY T4() {
        return (C0EGY) this.LLLF.getValue(this, LLLI[1]);
    }

    public final InterfaceC1461350o8D Z4() {
        InterfaceC1461350o8D interfaceC1461350o8D = this.LLJJJ;
        if (interfaceC1461350o8D != null) {
            return interfaceC1461350o8D;
        }
        if (((C0ETY) getDiContainer().LJII(C0ETY.class, null)).MY1(InterfaceC1461350o8D.class) == null) {
            return null;
        }
        InterfaceC1461350o8D interfaceC1461350o8D2 = (InterfaceC1461350o8D) getDiContainer().LJIIL(null, InterfaceC1461350o8D.class);
        this.LLJJJ = interfaceC1461350o8D2;
        return interfaceC1461350o8D2;
    }

    public final C0EC7 d5() {
        return (C0EC7) this.LLLFFI.getValue(this, LLLI[3]);
    }

    public final C0EJ3 n5() {
        return (C0EJ3) this.LLJJJJJIL.getValue(this, LLLI[0]);
    }

    public final void E5() {
        Activity activityLJII = C1664590tQ1.LJII(this);
        C1397580mTM c1397580mTM = new C1397580mTM(activityLJII);
        c1397580mTM.LJII = false;
        c1397580mTM.LJI(activityLJII.getString(2131820781));
        c1397580mTM.LIZIZ(activityLJII.getString(2131820780));
        C985403tE.LIZ(c1397580mTM, new AwS378S0200000_12(activityLJII, this, 37));
        new C1397510mTF(c1397580mTM).LIZLLL();
    }

    public final void H5() {
        DialogC1389620mGW dialogC1389620mGW;
        Activity activityLJII = C1664590tQ1.LJII(this);
        DialogC1389620mGW dialogC1389620mGW2 = this.LLJJJJ;
        if (dialogC1389620mGW2 == null) {
            DialogC1389620mGW dialogC1389620mGW3 = new DialogC1389620mGW(activityLJII);
            dialogC1389620mGW3.LJJLJLI(activityLJII.getString(2131826442));
            this.LLJJJJ = dialogC1389620mGW3;
            C0FNV.LIZJ(dialogC1389620mGW3);
            return;
        }
        if (dialogC1389620mGW2.isShowing() || (dialogC1389620mGW = this.LLJJJJ) == null) {
            return;
        }
        C786410Ut5.J4(dialogC1389620mGW);
    }

    public final void Xi() {
        pA2().LIZ(this, new AObjectS240S0100000_5(this, 63));
        Kt0().LIZ(this, new AObjectS240S0100000_5(this, 64));
    }

    @Override // X.InterfaceC362470EIz
    public boolean onBackPressed() {
        if (T2().LIZ == EnumC19520711Yv.HIDE) {
            return false;
        }
        M5();
        i3(AFwS273S0000000_29.get$arr$(237));
        return true;
    }

    @Override // ge.i, X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
        C0EHK.LJIIJ(T4().zb0(), this, new AObserverS231S0100000_29(this, 116));
    }

    @Override // X.AbstractC2255721DQs
    public void onDestroy() {
        M5();
        C05HV.LIZ.clear();
        super.onDestroy();
    }

    @Override // X.AbstractC2255721DQs
    public void onResume() {
        super.onResume();
        K4(null, null);
        if (T2().LIZ == EnumC19520711Yv.HIDE || T2().LJ == EnumC1782890wUp.INITIAL) {
            return;
        }
        i3(AFwS273S0000000_29.get$arr$(238));
    }

    public final void x5() {
        Activity activityLJII = C1664590tQ1.LJII(this);
        C1397580mTM c1397580mTM = new C1397580mTM(activityLJII);
        c1397580mTM.LJII = false;
        c1397580mTM.LIZIZ(activityLJII.getString(2131820778));
        C985403tE.LIZ(c1397580mTM, new AwS378S0200000_12(activityLJII, this, 36));
        new C1397510mTF(c1397580mTM).LIZLLL();
    }

    @Override // ge.i
    public Function0<C19520211Yq> E3() {
        return this.LLJJLIIIJLLLLLLLZ;
    }

    @Override // X.InterfaceC362470EIz
    public C385670FAf<TTSSpeakerInfo> Kt0() {
        return this.LLJZIJLIL;
    }

    @Override // X.InterfaceC362470EIz
    public C385670FAf<Boolean> XS() {
        return this.LLJZ;
    }

    @Override // X.InterfaceC362470EIz
    public C385670FAf<VoiceCloneReadTextEffectBean> gH2() {
        return this.LLL;
    }

    @Override // X.C0ETZ, X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LLJJIII;
    }

    public final C19A3 getParentScene() {
        return this.LLJJI;
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C19519511Yj> o2() {
        return this.LLJJJJLIIL;
    }

    @Override // X.InterfaceC362470EIz
    public LiveEvent<EnumC361800EGk> pA2() {
        return this.LLJLLL;
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C19519811Ym> w2() {
        return this.LLJJL;
    }

    @Override // X.InterfaceC362470EIz
    public void BQ(boolean z) {
        C353890Du7 c353890Du7LIZIZ;
        InterfaceC359850E8x interfaceC359850E8xB20 = T4().B20();
        if (interfaceC359850E8xB20 != null) {
            if (z) {
                c353890Du7LIZIZ = C353880Du6.LIZ(null, null, 3);
            } else {
                c353890Du7LIZIZ = C353880Du6.LIZIZ();
            }
            interfaceC359850E8xB20.LJIIZILJ("bottom_item_text_edit_text_to_speech", c353890Du7LIZIZ, true);
        }
    }

    @Override // X.InterfaceC362470EIz
    public void uV(boolean z) {
        this.LLJLIL.LJII(Boolean.valueOf(z));
    }

    public final void v5(final String str) {
        final String str2;
        if (T2().LJ == EnumC1782890wUp.LOADING) {
            return;
        }
        TTSSpeakerInfo tTSSpeakerInfoLIZJ = Kt0().LIZJ();
        String str3 = null;
        if (tTSSpeakerInfoLIZJ != null) {
            str2 = tTSSpeakerInfoLIZJ.speakerId;
        } else {
            str2 = null;
        }
        C386310FCr c386310FCr = new C386310FCr(str, str2);
        ConcurrentHashMap<C386310FCr, String> concurrentHashMap = C05HV.LIZ;
        if (concurrentHashMap.containsKey(c386310FCr)) {
            str3 = concurrentHashMap.get(c386310FCr);
        }
        C19EG c19egLIZIZ = C1388190mED.LIZIZ(C1664590tQ1.LJIIIZ(this));
        if (C123100dR.LIZ(str3) && c19egLIZIZ != null && new C0VSJ(str3).exists()) {
            if (t5().isPlayingAudition()) {
                t5().stopAudition();
            }
            EditRepeatMusicPlayer editRepeatMusicPlayer = this.LLJJJIL;
            if (editRepeatMusicPlayer != null) {
                editRepeatMusicPlayer.LIZIZ();
            }
            this.LLJJJIL = new EditRepeatMusicPlayer(c19egLIZIZ, str3);
            i3(AFwS273S0000000_29.get$arr$(239));
            EditRepeatMusicPlayer editRepeatMusicPlayer2 = this.LLJJJIL;
            if (editRepeatMusicPlayer2 != null) {
                editRepeatMusicPlayer2.LLILZLL = new C11Z3() { // from class: X.11Yk
                    @Override // X.C11Z3
                    public final void LIZ() {
                    }

                    @Override // X.C11Z3
                    public final void LIZIZ() {
                        this.LIZ.i3(AFwS273S0000000_29.get$arr$(240));
                    }
                };
                editRepeatMusicPlayer2.LIZ(0);
            }
        } else {
            t5().initAudioSDKHandler(P4());
            if (str2 != null) {
                i3(AFwS273S0000000_29.get$arr$(241));
                t5().playAudition(str, str2, str2, new PlayAuditionCallback() { // from class: X.11Yi
                    @Override // com.ss.android.ugc.aweme.services.audio.PlayAuditionCallback
                    public final void oPrepare() {
                    }

                    @Override // com.ss.android.ugc.aweme.services.audio.PlayAuditionCallback
                    public final void onPlay() {
                        this.i3(AFwS273S0000000_29.get$arr$(242));
                    }

                    @Override // com.ss.android.ugc.aweme.services.audio.PlayAuditionCallback
                    public final void onStop() {
                        this.i3(AFwS273S0000000_29.get$arr$(243));
                    }

                    @Override // com.ss.android.ugc.aweme.services.audio.PlayAuditionCallback
                    public final void onAudioFileSuccess(int i, File file) {
                        String str4 = str;
                        String str5 = str2;
                        String absolutePath = file.getAbsolutePath();
                        C05HV.LIZ.putIfAbsent(new C386310FCr(str4, str5), absolutePath);
                    }
                });
            }
        }
        C11VK.LIZ.getClass();
        C11VK.LIZLLL(true);
    }

    public C19519311Yh(C19A3 c19a3, C1DRG c1drg) {
        super(c19a3, c1drg);
        this.LLJJI = c19a3;
        this.LLJJIII = c1drg;
        this.LLJJIJI = C452501pT.LIZIZ(new AwS549S0100000_5(this, 419));
        this.LLJJIJIIJIL = C452501pT.LIZIZ(new AwS549S0100000_5(this, 418));
        this.LLJJIJIL = C452501pT.LIZIZ(AFwS218S0000000_29.get$arr$(294));
        this.LLJJJJJIL = C1664770tQJ.LIZIZ(getDiContainer(), C0EJ3.class, null);
        this.LLJJJJLIIL = AFwS218S0000000_29.get$arr$(293);
        this.LLJJL = new AwS573S0100000_29(this, 714);
        this.LLJJLIIIJLLLLLLLZ = new AwS573S0100000_29(this, 715);
        C560530Lyd<EnumC361800EGk> c560530Lyd = new C560530Lyd<>();
        this.LLJL = c560530Lyd;
        C538770LBb<Boolean> c538770LBb = new C538770LBb<>(Boolean.FALSE);
        this.LLJLIL = c538770LBb;
        C538770LBb<TTSSpeakerInfo> c538770LBb2 = new C538770LBb<>(null);
        this.LLJLILLLLZIIL = c538770LBb2;
        C538770LBb<VoiceCloneReadTextEffectBean> c538770LBb3 = new C538770LBb<>(null);
        this.LLJLL = c538770LBb3;
        this.LLJLLL = c560530Lyd;
        this.LLJZ = c538770LBb;
        this.LLJZIJLIL = c538770LBb2;
        this.LLL = c538770LBb3;
        this.LLLF = C1664770tQJ.LIZ(getDiContainer(), C0EGY.class, null);
        this.LLLFF = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC359950E9h.class, null);
        this.LLLFFI = C1664770tQJ.LIZIZ(getDiContainer(), C0EC7.class, null);
    }

    public final void K4(Function0<Unit> function0, Function0<Unit> function02) {
        AwS395S0200000_29 awS395S0200000_29 = new AwS395S0200000_29(this, (C19519311Yh) function0, (Function0<Unit>) 45);
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C05BI(null, new AwS573S0100000_29(function02, (Function0<? extends Banner>) 713), awS395S0200000_29), 3);
    }

    @Override // X.InterfaceC362470EIz
    public void aI2(boolean z, final EnumC361800EGk enumC361800EGk) {
        if (z) {
            if (!C0CHQ.LIZ().getAccountService().isLogin()) {
                C1655820tBs.LIZ(C1664590tQ1.LJII(this), "video_edit_page", "click_voice_clone", new InterfaceC1655960tC6() { // from class: X.11Yl
                    @Override // X.InterfaceC1655960tC6
                    public final void LIZ() {
                    }

                    @Override // X.InterfaceC1655960tC6
                    public final void onSuccess() {
                        C19519311Yh c19519311Yh = this.LIZ;
                        c19519311Yh.K4(new AwS430S0200000_29(c19519311Yh, enumC361800EGk, 62), new AwS558S0100000_14(this.LIZ, 1184));
                    }
                });
                return;
            } else {
                C5(this, enumC361800EGk, false);
                return;
            }
        }
        this.LLJLLIL = null;
        i3(AFwS273S0000000_29.get$arr$(244));
        M5();
    }

    public static final void C5(C19519311Yh c19519311Yh, EnumC361800EGk enumC361800EGk, boolean z) {
        String str;
        if (enumC361800EGk != null) {
            if (enumC361800EGk == EnumC361800EGk.TTS_PANEL) {
                str = "editor_pro_tts";
            } else {
                str = "editor_pro_sound";
            }
            C11VK c11vk = C11VK.LIZ;
            boolean z2 = c19519311Yh.LJJJLIIL().creativeModel.pugcTemplateData.isFromCreateTemplate;
            c11vk.getClass();
            C11VK.LJFF = str;
            C11VK.LJI = z2;
        }
        c19519311Yh.LLJLLIL = enumC361800EGk;
        TTSSpeakerInfo tTSSpeakerInfoLIZJ = c19519311Yh.LLJLILLLLZIIL.LIZJ();
        if (z || tTSSpeakerInfoLIZJ == null ? C05HM.LIZIZ.getCurrentState() == SAMICoreVopState.COMPLETED.getValue() : tTSSpeakerInfoLIZJ.LIZ()) {
            c19519311Yh.i3(new AwS608S0100000_29(enumC361800EGk, 435));
            return;
        }
        c19519311Yh.i3(new AwS608S0100000_29(enumC361800EGk, 436));
        C0EIM c0eim = C0EIM.LIZ;
        C0E48 c0e48F4 = c19519311Yh.F4();
        VideoPublishEditModel videoPublishEditModelLJJJLIIL = c19519311Yh.LJJJLIIL();
        c0eim.getClass();
        C20684815ws.LJIILLIIL("ai_voice_create_panel_show", C0EIM.LIZ(c0e48F4, videoPublishEditModelLJJJLIIL, enumC361800EGk).LIZ);
    }

    public final void N5(String str, String str2, final Function1<? super VoiceCloneReadTextEffectBean, Unit> function1) {
        String str3;
        int iIntValue;
        C560530Lyd<Unit> c560530LydIV;
        Integer num;
        Integer num2;
        TTSSpeakerInfo tTSSpeakerInfoLIZJ = this.LLJLILLLLZIIL.LIZJ();
        if (tTSSpeakerInfoLIZJ != null) {
            str3 = tTSSpeakerInfoLIZJ.speakerId;
        } else {
            str3 = null;
        }
        VoiceCloneReadTextEffectBean voiceCloneReadTextEffectBeanLIZJ = this.LLJLL.LIZJ();
        if (Intrinsics.LJFF(str3, str2) && voiceCloneReadTextEffectBeanLIZJ != null) {
            if (function1 != null) {
                function1.invoke(voiceCloneReadTextEffectBeanLIZJ);
                return;
            }
            return;
        }
        boolean z = true;
        int iIntValue2 = 0;
        if (str != null && str.length() != 0 && str2 != null && str2.length() != 0) {
            if (str != null) {
                if (str2 != null) {
                    C2378209To.LIZIZ(str, new InterfaceC2376809Ta() { // from class: X.11YQ
                        @Override // X.InterfaceC2376809Ta
                        public final void LIZ(TTSSpeakerInfo tTSSpeakerInfo, int i, String str4) {
                            C560530Lyd<Unit> c560530LydIV2;
                            int iIntValue3;
                            C560530Lyd<Unit> c560530LydIV3;
                            Integer num3;
                            Integer num4;
                            if (tTSSpeakerInfo != null) {
                                VoiceCloneReadTextEffectBean voiceCloneReadTextEffectBean = new VoiceCloneReadTextEffectBean(tTSSpeakerInfo.LIZIZ, tTSSpeakerInfo.LIZ);
                                voiceCloneReadTextEffectBean.isPrivate = tTSSpeakerInfo.LIZIZ();
                                TTSRecordStatus tTSRecordStatus = tTSSpeakerInfo.recordStatus;
                                int iIntValue4 = 0;
                                if (tTSRecordStatus != null && (num4 = tTSRecordStatus.succeedCount) != null) {
                                    iIntValue3 = num4.intValue();
                                } else {
                                    iIntValue3 = 0;
                                }
                                voiceCloneReadTextEffectBean.succeedCount = iIntValue3;
                                TTSRecordStatus tTSRecordStatus2 = tTSSpeakerInfo.recordStatus;
                                if (tTSRecordStatus2 != null && (num3 = tTSRecordStatus2.requiredCount) != null) {
                                    iIntValue4 = num3.intValue();
                                }
                                voiceCloneReadTextEffectBean.requiredCount = iIntValue4;
                                voiceCloneReadTextEffectBean.isRecordCompleted = tTSSpeakerInfo.LIZ();
                                this.LIZ.LLJLL.LJFF(voiceCloneReadTextEffectBean);
                                this.LIZ.LLJLILLLLZIIL.LJFF(tTSSpeakerInfo);
                                InterfaceC1461350o8D interfaceC1461350o8DZ4 = this.LIZ.Z4();
                                if (interfaceC1461350o8DZ4 != null && (c560530LydIV3 = interfaceC1461350o8DZ4.iV()) != null) {
                                    c560530LydIV3.LJIIIZ(Unit.LIZ);
                                }
                                Function1<VoiceCloneReadTextEffectBean, Unit> function12 = function1;
                                if (function12 != null) {
                                    function12.invoke(voiceCloneReadTextEffectBean);
                                    return;
                                }
                                return;
                            }
                            this.LIZ.LLJLILLLLZIIL.LJFF(null);
                            InterfaceC1461350o8D interfaceC1461350o8DZ42 = this.LIZ.Z4();
                            if (interfaceC1461350o8DZ42 != null && (c560530LydIV2 = interfaceC1461350o8DZ42.iV()) != null) {
                                c560530LydIV2.LJIIIZ(Unit.LIZ);
                            }
                            Function1<VoiceCloneReadTextEffectBean, Unit> function13 = function1;
                            if (function13 == null) {
                                return;
                            }
                            function13.invoke(null);
                        }
                    });
                    return;
                } else {
                    "Required value was null.".toString();
                    throw new IllegalArgumentException("Required value was null.");
                }
            }
            "Required value was null.".toString();
            throw new IllegalArgumentException("Required value was null.");
        }
        TTSSpeakerInfo tTSSpeakerInfo = new TTSSpeakerInfo("", null, "", "");
        VoiceCloneReadTextEffectBean voiceCloneReadTextEffectBean = new VoiceCloneReadTextEffectBean(tTSSpeakerInfo.LIZIZ, tTSSpeakerInfo.LIZ);
        if (!tTSSpeakerInfo.LIZIZ() || tTSSpeakerInfo.stage.length() <= 0) {
            z = false;
        }
        voiceCloneReadTextEffectBean.isPrivate = z;
        TTSRecordStatus tTSRecordStatus = tTSSpeakerInfo.recordStatus;
        if (tTSRecordStatus != null && (num2 = tTSRecordStatus.succeedCount) != null) {
            iIntValue = num2.intValue();
        } else {
            iIntValue = 0;
        }
        voiceCloneReadTextEffectBean.succeedCount = iIntValue;
        TTSRecordStatus tTSRecordStatus2 = tTSSpeakerInfo.recordStatus;
        if (tTSRecordStatus2 != null && (num = tTSRecordStatus2.requiredCount) != null) {
            iIntValue2 = num.intValue();
        }
        voiceCloneReadTextEffectBean.requiredCount = iIntValue2;
        voiceCloneReadTextEffectBean.isRecordCompleted = tTSSpeakerInfo.LIZ();
        this.LLJLL.LJFF(voiceCloneReadTextEffectBean);
        this.LLJLILLLLZIIL.LJFF(tTSSpeakerInfo);
        InterfaceC1461350o8D interfaceC1461350o8DZ4 = Z4();
        if (interfaceC1461350o8DZ4 != null && (c560530LydIV = interfaceC1461350o8DZ4.iV()) != null) {
            c560530LydIV.LJIIIZ(Unit.LIZ);
        }
        if (function1 == null) {
            return;
        }
        function1.invoke(voiceCloneReadTextEffectBean);
    }

    @Override // X.InterfaceC362470EIz
    public void cU(C19EG c19eg, String str, NLETrackSlot nLETrackSlot, boolean z, Function0<Unit> function0, Function0<Unit> function02) {
        VoiceCloneReadTextEffectBean voiceCloneReadTextEffectBeanLIZJ = this.LLJLL.LIZJ();
        if (voiceCloneReadTextEffectBeanLIZJ != null) {
            C0EVZ.LIZJ(nLETrackSlot, F4());
            EditorProTTSHelper editorProTTSHelper = new EditorProTTSHelper(c19eg, getLifecycle(), LJJJLIIL(), F4());
            AwS371S0200000_5 awS371S0200000_5 = new AwS371S0200000_5(this, (C19519311Yh) function0, (Function0<Unit>) 74);
            if (str != null && str.length() != 0) {
                ReadTextEffectSpeakerExtra readTextEffectSpeakerExtra = voiceCloneReadTextEffectBeanLIZJ.mSpeaker;
                EditorProTTSHelper.LIZIZ(editorProTTSHelper, false, str, nLETrackSlot, readTextEffectSpeakerExtra.speakreID, readTextEffectSpeakerExtra.streamTTSSpkID, C1664460tPo.LJ(voiceCloneReadTextEffectBeanLIZJ.effect), awS371S0200000_5, voiceCloneReadTextEffectBeanLIZJ, z, false, 512);
                return;
            } else {
                awS371S0200000_5.invoke(Boolean.FALSE);
                return;
            }
        }
        if (function02 == null) {
            return;
        }
        function02.invoke();
    }
}
