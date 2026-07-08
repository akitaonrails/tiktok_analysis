package X;

import Y.AObserverS231S0100000_29;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.widget.ImageView;
import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLESegmentAudio;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSlotSPtr;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.IAVServiceProxy;
import com.ss.android.ugc.aweme.services.edit.IMuteStripApiService;
import com.ss.android.ugc.aweme.services.edit.IReplaceMusicService;
import com.ss.android.ugc.aweme.services.edit.MusicEditScene;
import com.ss.android.ugc.aweme.services.edit.OriginalAudioTrack;
import com.ss.android.ugc.aweme.services.edit.OriginalAudioTrackEditType;
import com.ss.android.ugc.aweme.services.edit.StripMusicPostType;
import com.ss.android.ugc.aweme.services.edit.StripMusicRequest;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.zhiliaoapp.musically.R;
import ge.i;
import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalUnit;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS218S0000000_29;
import kotlin.jvm.internal.AFwS271S0000000_28;
import kotlin.jvm.internal.AFwS273S0000000_29;
import kotlin.jvm.internal.AwS135S0101000_29;
import kotlin.jvm.internal.AwS41S0010000_29;
import kotlin.jvm.internal.AwS573S0100000_29;
import kotlin.jvm.internal.AwS607S0100000_28;
import kotlin.jvm.internal.AwS608S0100000_29;

/* JADX INFO: renamed from: X.12D1, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C12D1 extends i<InterfaceC372120EiQ, C12DF, C12D5, C12DA> implements InterfaceC372120EiQ, InterfaceC379610EuV {
    public static final C12D7 LLJJJJLIIL;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJL;
    public static final int LLJJLIIIJLLLLLLLZ;
    public final C1DRG LLJILJILJ;
    public final C19A3 LLJILLL;
    public final InterfaceC1731706qJ LLJJ;
    public final InterfaceC1731706qJ LLJJI;
    public final InterfaceC1731706qJ LLJJIII;
    public final InterfaceC1731706qJ LLJJIJI;
    public final InterfaceC1731706qJ LLJJIJIIJIL;
    public final InterfaceC1731706qJ LLJJIJIL;
    public C12D4 LLJJJ;
    public final Function0<C12D5> LLJJJIL;
    public final Function0<C12DA> LLJJJJ;
    public final Function0<C12DF> LLJJJJJIL;

    /* JADX WARN: Type inference failed for: r0v13, types: [X.12D7] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C12D1.class, "model", "getModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0);
        C13LE.LIZ.getClass();
        LLJJL = new InterfaceC2217461Bqa[]{c2217381BqS, new C2217381BqS(C12D1.class, "editMusicApi", "getEditMusicApi()Lcom/ss/android/ugc/gamora/editor/music/EditMusicApi;", 0), new C2217381BqS(C12D1.class, "toolbarApi", "getToolbarApi()Lcom/ss/android/ugc/gamora/editor/toolbar/EditToolbarApi;", 0), new C2217381BqS(C12D1.class, "editPreviewApi", "getEditPreviewApi()Lcom/ss/android/ugc/gamora/editor/preview/TiktokEditPreviewApi;", 0), new C2217381BqS(C12D1.class, "musicController", "getMusicController()Lcom/ss/android/ugc/gamora/editor/IEditMusicController;", 0), new C2217381BqS(C12D1.class, "replaceManagerApi", "getReplaceManagerApi()Lcom/ss/android/ugc/gamora/editor/toolbar/ReplaceMusicToolbarApi;", 0)};
        LLJJJJLIIL = new Object() { // from class: X.12D7
        };
        LLJJLIIIJLLLLLLLZ = 8;
    }

    private final DialogC1390150mHN M5() {
        Context sceneContext = this.LLJILLL.getSceneContext();
        if (sceneContext == null) {
            return null;
        }
        DialogC1390150mHN dialogC1390150mHN = new DialogC1390150mHN(sceneContext);
        dialogC1390150mHN.LJJLJLI(sceneContext.getString(2131857894));
        dialogC1390150mHN.LJJLIIJ(false);
        dialogC1390150mHN.LJJLJ(false);
        dialogC1390150mHN.setOnCancelListener(new C12YJ(this, 2));
        dialogC1390150mHN.setOnDismissListener(null);
        C786410Ut5.K4(dialogC1390150mHN);
        dialogC1390150mHN.LJJLL(20.0f, false);
        return dialogC1390150mHN;
    }

    private final InterfaceC1453200nv4 T4() {
        return (InterfaceC1453200nv4) this.LLJJI.getValue(this, LLJJL[1]);
    }

    private final InterfaceC1454960nxu d5() {
        return (InterfaceC1454960nxu) this.LLJJIJIIJIL.getValue(this, LLJJL[4]);
    }

    private final InterfaceC1459020o4S k5() {
        return (InterfaceC1459020o4S) this.LLJJIJIL.getValue(this, LLJJL[5]);
    }

    private final InterfaceC1460000o62 n5() {
        return (InterfaceC1460000o62) this.LLJJIII.getValue(this, LLJJL[2]);
    }

    public final void C5() {
        Context contextLIZIZ = C545820Lau.LIZIZ(this.LLJILLL);
        if (contextLIZIZ == null) {
            return;
        }
        if (C1453970nwJ.LIZJ() == 1) {
            P4();
            return;
        }
        C01GW c01gw = C10I6.LIZ;
        int i = ((Keva) c01gw.getValue()).getInt("user_post_cnt", 0) + 1;
        if (i <= 2 || !Instant.ofEpochMilli(((Keva) c01gw.getValue()).getLong("last_auto_strip_toast_showed_time", 0L)).isBefore(Instant.now().minus(7L, (TemporalUnit) ChronoUnit.DAYS))) {
            ((Keva) c01gw.getValue()).storeInt("user_post_cnt", i);
            P4();
            return;
        }
        C1397580mTM c1397580mTM = new C1397580mTM(contextLIZIZ);
        c1397580mTM.LJFF(2131826853);
        c1397580mTM.LIZ(2131826851);
        ImageView imageView = new ImageView(contextLIZIZ);
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        imageView.setAdjustViewBounds(true);
        C0HTI c0hti = new C0HTI();
        c0hti.LIZ = R.drawable.tk;
        imageView.setImageDrawable(c0hti.LIZ(contextLIZIZ));
        C929103k9.LIZ(c1397580mTM, imageView, AFwS271S0000000_28.get$arr$(230));
        C985403tE.LIZ(c1397580mTM, new AwS607S0100000_28(this, 162));
        c1397580mTM.LIZLLL(new AwS608S0100000_29(this, 413));
        c1397580mTM.LJ(new AwS607S0100000_28(this, 163));
        new C1397510mTF(c1397580mTM).LIZLLL();
    }

    public final InterfaceC1446740nke JY0() {
        return (InterfaceC1446740nke) this.LLJJIJI.getValue(this, LLJJL[3]);
    }

    public final VideoPublishEditModel Z4() {
        return (VideoPublishEditModel) this.LLJJ.getValue(this, LLJJL[0]);
    }

    public final void v5() {
        C1455260nyO c1455260nyO;
        C19A3 c19a3 = this.LLJILLL;
        if ((c19a3 instanceof C1455260nyO) && (c1455260nyO = (C1455260nyO) c19a3) != null) {
            C1455260nyO.w(c1455260nyO, false, false, false, false, true, false, true, null, 366);
        }
        C1458310o3J c1458310o3J = C1458310o3J.LIZ;
        VideoPublishEditModel videoPublishEditModelZ4 = Z4();
        c1458310o3J.getClass();
        C20684815ws.LJIILLIIL("click_remove_add_music", C1458310o3J.LIZ(videoPublishEditModelZ4).LIZ);
    }

    public final void x5() {
        IMuteStripApiService iMuteStripApiService = (IMuteStripApiService) PluggableExtentionKt.pluggableSpi$default(IMuteStripApiService.class, false, false, false, 14, null);
        if (iMuteStripApiService != null) {
            iMuteStripApiService.setFlag();
        }
        K4();
    }

    private final void E5() {
        InterfaceC1452170ntP interfaceC1452170ntPLJIJ;
        C348100Dkm c348100DkmLIZIZ;
        NLEEditor nLEEditor;
        NLEModel model;
        NLETrack nLETrack;
        NLETrackSlot nLETrackSlot;
        AbstractC1452680nuE abstractC1452680nuEGc = JY0().gc();
        if (abstractC1452680nuEGc == null || (interfaceC1452170ntPLJIJ = abstractC1452680nuEGc.LJIJ()) == null || (c348100DkmLIZIZ = C352130DrH.LIZIZ(interfaceC1452170ntPLJIJ)) == null || (model = (nLEEditor = c348100DkmLIZIZ.LIZ).getModel()) == null) {
            return;
        }
        C12D4 c12d4 = this.LLJJJ;
        if (c12d4 != null && (nLETrackSlot = c12d4.LIZJ) != null) {
            NLETrack mainTrack = model.getMainTrack();
            if (mainTrack == null) {
                return;
            }
            mainTrack.clearSlot();
            mainTrack.addSlot(nLETrackSlot);
        }
        NLETrack nLETrackLIZ = C346780Die.LIZ(model);
        if (nLETrackLIZ != null) {
            nLETrackLIZ.clearSlot();
        }
        C1438590nXV replaceMusicModel = Z4().getReplaceMusicModel();
        if (replaceMusicModel != null) {
            replaceMusicModel.setAddedStrippedOriginSound(false);
        }
        C1438590nXV replaceMusicModel2 = Z4().getReplaceMusicModel();
        if (replaceMusicModel2 != null) {
            replaceMusicModel2.setStrippedAudioVid(null);
        }
        C12D4 c12d42 = this.LLJJJ;
        C1452640nuA.LJII(c12d42 != null ? c12d42.LIZ : null, false, Z4().creativeModel.musicBuzModel);
        C12D4 c12d43 = this.LLJJJ;
        if (c12d43 != null && (nLETrack = c12d43.LIZIZ) != null) {
            model.removeTrack(C0EYQ.LIZIZ(model));
            model.addTrack(nLETrack);
        }
        c348100DkmLIZIZ.LJFF().LJJIJLIJ(nLEEditor);
        nLEEditor.commit();
    }

    private final void O4() {
        ((IAVServiceProxy) ServiceManager.get().getService(IAVServiceProxy.class)).getApplicationService();
        Intent intent = new Intent(this.LLJILLL.mActivity, C19221910Hx.LIZJ());
        intent.addFlags(603979776);
        H4(this.LLJILLL.requireActivity(), intent);
    }

    private final void Xi() {
        JY0().Yh().observe(this, new AObserverS231S0100000_29(this, 111));
        ((C0ETY) getDiContainer().LJII(C0ETY.class, null)).Sd(InterfaceC1457600o2A.class, new AwS608S0100000_29(this, 412));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [X.12D6] */
    private final void t5() {
        final InterfaceC1452170ntP value = JY0().g().getValue();
        if (value == 0) {
            return;
        }
        value.kg(new C1DOL() { // from class: X.12D6
            @Override // X.C1DOL
            public final void LIZ(int i, int i2) {
                if (i == 0) {
                    this.LIZ.i3(new AwS135S0101000_29(i2, value, 6));
                }
            }
        });
    }

    public final void D5() {
        Context sceneContext;
        String str = Z4().creativeModel.musicBuzModel.musicMuteDetailUrl;
        if (str == null || (sceneContext = this.LLJILLL.getSceneContext()) == null) {
            return;
        }
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(sceneContext, "//webview");
        smartRouteBuildRoute.withParam(UriProtector.parse(str));
        smartRouteBuildRoute.open();
        C1458310o3J c1458310o3J = C1458310o3J.LIZ;
        VideoPublishEditModel videoPublishEditModelZ4 = Z4();
        c1458310o3J.getClass();
        C20684815ws.LJIILLIIL("click_violation_detail_page_entrance", C1458310o3J.LIZ(videoPublishEditModelZ4).LIZ);
    }

    public final void K4() {
        E5();
        i3(AFwS273S0000000_29.get$arr$(222));
        InterfaceC1459020o4S interfaceC1459020o4SK5 = k5();
        if (interfaceC1459020o4SK5 != null) {
            interfaceC1459020o4SK5.RC1(true);
        }
        InterfaceC1460000o62 interfaceC1460000o62N5 = n5();
        if (interfaceC1460000o62N5 != null) {
            interfaceC1460000o62N5.Ws(1);
        }
    }

    public final void P4() {
        VecNLETrackSlotSPtr slots;
        NLETrackSlot nLETrackSlot;
        NLESegmentAudio nLESegmentAudioDynamicCast;
        Float fValueOf;
        IReplaceMusicService iReplaceMusicService = (IReplaceMusicService) ServiceManager.get().getService(IReplaceMusicService.class);
        NLEModel nLEModelLLZ = JY0().LLZ();
        C1438590nXV replaceMusicModel = Z4().getReplaceMusicModel();
        if (nLEModelLLZ == null) {
            C201955140j.LJII(C201962140q.LIZIZ, "StripMusicPreviewComponent nleModel is null");
            return;
        }
        if (replaceMusicModel == null) {
            C201955140j.LJII(C201962140q.LIZIZ, "StripMusicPreviewComponent replace is null");
            return;
        }
        NLETrack nLETrackLIZ = C346780Die.LIZ(nLEModelLLZ);
        float fFloatValue = (nLETrackLIZ == null || (slots = nLETrackLIZ.getSlots()) == null || (nLETrackSlot = (NLETrackSlot) C13LP.LJJJLL(slots)) == null || (nLESegmentAudioDynamicCast = NLESegmentAudio.dynamicCast(nLETrackSlot.getMainSegment())) == null || (fValueOf = Float.valueOf(nLESegmentAudioDynamicCast.getVolume())) == null) ? 0.0f : fValueOf.floatValue();
        OriginalAudioTrack originalAudioTrack = replaceMusicModel.getStrippedAudioVid() != null ? new OriginalAudioTrack((int) (fFloatValue * 50), Boolean.FALSE, null, replaceMusicModel.getStrippedAudioVid(), Integer.valueOf(OriginalAudioTrackEditType.ORIGINAL_AUDIO_TRACK_EDIT_TYPE_COPYRIGHT_INFRINGEMENT_REPLACEMENT.getValue())) : replaceMusicModel.getAudioVid() != null ? new OriginalAudioTrack((int) (fFloatValue * 50), Boolean.TRUE, replaceMusicModel.getAudioVid(), null, Integer.valueOf(OriginalAudioTrackEditType.ORIGINAL_AUDIO_TRACK_EDIT_TYPE_KEEP_WITH_VOLUME.getValue())) : null;
        Gson gson = C0CHQ.LIZ().getGson();
        StripMusicRequest stripMusicRequest = new StripMusicRequest();
        stripMusicRequest.setItemID(replaceMusicModel.getAid());
        stripMusicRequest.setOriginalVid(replaceMusicModel.getVid());
        stripMusicRequest.setOriginalAudioTrack(originalAudioTrack);
        stripMusicRequest.setMultiMusicEditInfo(C349940Dnk.LIZIZ(nLEModelLLZ, Z4().creativeModel.musicBuzModel));
        stripMusicRequest.setMusicEditScene(Integer.valueOf(MusicEditScene.MUSIC_EDIT_SCENE_VIDEO_GENERAL.getValue()));
        stripMusicRequest.setExtra(GsonProtectorUtils.toJson(gson, C2097608Jq.LJIIIIZZ(new Pair("add_song_only", Boolean.FALSE), new Pair("post_type", StripMusicPostType.POST_FROM_ADD_SOUND))));
        stripMusicRequest.setVersion(2);
        stripMusicRequest.setStripAudioExist(replaceMusicModel.getStrippedAudioVid() != null);
        iReplaceMusicService.setReplaceStartTime(System.currentTimeMillis());
        iReplaceMusicService.setStripPostClicked(StripMusicPostType.POST_WITH_PREVIEW);
        iReplaceMusicService.setStripMusicRequest(stripMusicRequest);
        boolean z = stripMusicRequest.getOriginalAudioTrack() != null;
        C1458300o3I c1458300o3I = C1458300o3I.LIZ;
        VideoPublishEditModel videoPublishEditModelZ4 = Z4();
        c1458300o3I.getClass();
        C1458300o3I.LIZ(videoPublishEditModelZ4, "", null, z);
        C1458310o3J c1458310o3J = C1458310o3J.LIZ;
        VideoPublishEditModel videoPublishEditModelZ42 = Z4();
        c1458310o3J.getClass();
        iReplaceMusicService.setStripMusicPostMobParams(C1458310o3J.LIZIZ(videoPublishEditModelZ42, z));
        O4();
    }

    public final void R5() {
        boolean z = T2().LIZ;
        JY0().vW1().setValue(z ? C1452730nuJ.LIZJ() : C1452730nuJ.LIZ());
        i3(new AwS41S0010000_29(z, 37));
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void S5() {
        /*
            r3 = this;
            X.0nke r0 = r3.JY0()
            androidx.lifecycle.LiveData r0 = r0.Yh()
            java.lang.Object r0 = r0.getValue()
            X.0o11 r0 = (X.C1456890o11) r0
            r2 = 0
            if (r0 == 0) goto L32
            boolean r0 = r0.LIZ
            r1 = 1
            if (r0 != r1) goto L32
        L16:
            java.lang.Object r0 = r3.T2()
            X.12D5 r0 = (X.C12D5) r0
            boolean r0 = r0.LJ
            if (r1 == 0) goto L34
            if (r0 == 0) goto L34
            r3.show()
            X.0o62 r0 = r3.n5()
            if (r0 == 0) goto L2e
            r0.Jf1(r2, r2)
        L2e:
            r3.t5()
            return
        L32:
            r1 = 0
            goto L16
        L34:
            r3.hide()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C12D1.S5():void");
    }

    @Override // ge.i, X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
        t5();
        Xi();
    }

    @Override // ge.i
    public Function0<C12DF> E3() {
        return this.LLJJJJJIL;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LLJILJILJ;
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C12D5> o2() {
        return this.LLJJJIL;
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C12DA> w2() {
        return this.LLJJJJ;
    }

    @Override // X.InterfaceC372120EiQ
    public void yM() {
        S5();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x008a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object N5(X.InterfaceC1364105Vn<? super java.lang.Boolean> r13) {
        /*
            Method dump skipped, instruction units count: 268
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C12D1.N5(X.05Vn):java.lang.Object");
    }

    @Override // X.InterfaceC372120EiQ
    public Object kB1(InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        i3(AFwS273S0000000_29.get$arr$(223));
        InterfaceC1459020o4S interfaceC1459020o4SK5 = k5();
        if (interfaceC1459020o4SK5 != null) {
            interfaceC1459020o4SK5.RC1(false);
        }
        InterfaceC1453200nv4 interfaceC1453200nv4T4 = T4();
        if (interfaceC1453200nv4T4 != null) {
            interfaceC1453200nv4T4.hide();
        }
        InterfaceC1460000o62 interfaceC1460000o62N5 = n5();
        if (interfaceC1460000o62N5 != null) {
            interfaceC1460000o62N5.Jf1(false, false);
        }
        return N5(interfaceC1364105Vn);
    }

    public C12D1(C1DRG c1drg, C19A3 c19a3) {
        super(c19a3);
        this.LLJILJILJ = c1drg;
        this.LLJILLL = c19a3;
        this.LLJJ = C1664770tQJ.LIZ(getDiContainer(), VideoPublishEditModel.class, null);
        this.LLJJI = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1453200nv4.class, null);
        this.LLJJIII = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1460000o62.class, null);
        this.LLJJIJI = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1446740nke.class, null);
        this.LLJJIJIIJIL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1454960nxu.class, null);
        this.LLJJIJIL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1459020o4S.class, null);
        this.LLJJJIL = AFwS218S0000000_29.get$arr$(280);
        this.LLJJJJ = new AwS573S0100000_29(this, 701);
        this.LLJJJJJIL = new AwS573S0100000_29(this, 702);
    }

    public static void F4(Activity activity, Intent intent) {
        C1701330uNH.LIZ(intent, activity);
        C2204961BRm.LJIILLIIL(activity, intent, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF384cWghZ6StZ5ba0yD0CJgTfHDFqUhUAoKGWUXuA3FnK+FxporwesngN5zPjOW/aw==", null));
    }

    public static void H4(Activity activity, Intent intent) {
        RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(activity, intent, "Context_startActivity_1");
        F4(activity, intent);
    }

    public final void H5(int i, final Function0<Unit> function0) {
        JY0().vW1().setValue(new C1452730nuJ(3, i, new InterfaceC1464180oCm() { // from class: X.12D3
            @Override // X.InterfaceC1464180oCm
            public final void onSeekDone(int i2) {
                if (this.LIZ.T2().LIZ) {
                    this.LIZ.JY0().vW1().postValue(C1452730nuJ.LIZ());
                }
                function0.invoke();
            }
        }));
    }
}
