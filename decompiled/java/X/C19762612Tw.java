package X;

import Y.ACallableS416S0100000_9;
import Y.ACallableS432S0100000_29;
import Y.AObserverS231S0100000_29;
import Y.ARunnableS129S0100000_29;
import Y.ARunnableS33S1100000_29;
import Y.ATListenerS461S0100000_29;
import Y.AUListenerS277S0100000_29;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.os.Bundle;
import android.os.Message;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import avg.f;
import com.bytedance.bpea.basics.Cert;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSPtr;
import com.bytedance.mt.protector.impl.color.ColorProtector;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.audiorecord.AudioRecorderParam;
import com.ss.android.ugc.aweme.audiorecord.Point;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.service.IToolsCameraAudioSecurityCheckService;
import com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder;
import com.ss.android.ugc.aweme.shortvideo.ScreenUtils;
import com.ss.android.ugc.aweme.shortvideo.cover.VEVideoCoverGeneratorImpl;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.cover.MvChooseCoverBitmapCreator;
import com.ss.android.ugc.aweme.widgetcompat.WrapLinearLayoutManager;
import com.zhiliaoapp.musically.R;
import irm.AkS95S0100000_29;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AFwS218S0000000_29;
import kotlin.jvm.internal.AwS10S0501000_29;
import mf.a;
import nv7.c0;

/* JADX INFO: renamed from: X.12Tw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19762612Tw extends Scene implements WeakHandler.IHandler, InterfaceC379610EuV, InterfaceC19762512Tv {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLLJ;
    public final C1DRG LLJI;
    public final C1664750tQH LLJIJIL;
    public InterfaceC1452170ntP LLJILJIL;
    public InterfaceC524950KiL LLJJI;
    public boolean LLJJIJI;
    public boolean LLJJIJIIJIL;
    public Point LLJJJ;
    public final C1664750tQH LLJJJJ;
    public final C1664740tQG LLJJJJLIIL;
    public final C1664740tQG LLJJL;
    public final C1664740tQG LLJJLIIIJLLLLLLLZ;
    public final C1664740tQG LLJL;
    public final C1664750tQH LLJLIL;
    public MutableLiveData<C1452730nuJ> LLJLILLLLZIIL;
    public View LLJLL;
    public C1749280vcc LLJLLIL;
    public View LLJLLL;
    public View LLJZ;
    public View LLJZIJLIL;
    public View LLL;
    public FrameLayout LLLF;
    public C0H6D LLLFF;
    public View LLLFFI;
    public C19762412Tu LLLFZ;
    public ViewGroup LLLI;
    public C19762712Tx LLLII;
    public boolean LLLIIII;
    public boolean LLLIIIIL;
    public View LLLIIIL;
    public C19471411Fw LLLIIL;
    public C1295960jpS LLLIILIL;
    public CheckBox LLLIL;
    public VEVideoCoverGeneratorImpl LLLILZ;
    public C19560811fy LLLILZJ;
    public MutableLiveData<Bitmap> LLLILZLLLI;
    public MutableLiveData<Boolean> LLLIZZ;
    public C0EZE LLLJ;
    public int LLJILJILJ = 1;
    public final C01GW LLJILLL = C452501pT.LIZIZ(AFwS218S0000000_29.get$arr$(178));
    public final C01GW LLJJ = C452501pT.LIZIZ(AFwS218S0000000_29.get$arr$(177));
    public final ValueAnimator LLJJIII = ValueAnimator.ofInt(1, 10);
    public boolean LLJJIJIL = true;
    public boolean LLJJJIL = true;
    public final C01GW LLJJJJJIL = C1449630npJ.LIZ(this, InterfaceC1455860nzM.class);
    public AudioRecorderParam LLLJIL = new AudioRecorderParam();
    public volatile boolean LLLJL = true;
    public final WeakHandler LLLL = new WeakHandler(this);
    public final int LLLLII = 1;
    public final int LLLLIIIILLL = 2;
    public final int LLLLIIL = 4;
    public final C19762812Ty LLLLIILL = new C19762812Ty(this);
    public final C12U0 LLLLIILLL = new InterfaceC362610EJn() { // from class: X.12U0
        @Override // X.InterfaceC362610EJn
        public final boolean onKeyDown(int i, KeyEvent keyEvent) {
            if (i == 4 && this.LL.isVisible()) {
                View view = this.LL.LLJZIJLIL;
                if (view == null) {
                    view = null;
                }
                view.performClick();
                return true;
            }
            return false;
        }
    };
    public final AkS95S0100000_29 LLLLIL = new AkS95S0100000_29(this, 39);
    public final AudioRecorderParam LLLLILI = new AudioRecorderParam();

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C19762612Tw.class, "editAudioRecordApi", "getEditAudioRecordApi()Lcom/ss/android/ugc/aweme/shortvideo/edit/audiorecord/EditAudioRecordApi;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C19762612Tw.class, "mVideoPublishEditModel", "getMVideoPublishEditModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(C19762612Tw.class, "editVolumeV2Api", "getEditVolumeV2Api()Lcom/ss/android/ugc/gamora/editor/volume/EditVolumeV2Api;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS4 = new C2217381BqS(C19762612Tw.class, "editSubtitleApi", "getEditSubtitleApi()Lcom/ss/android/ugc/gamora/editor/subtitle/EditSubtitleApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS5 = new C2217381BqS(C19762612Tw.class, "editLoudnessApi", "getEditLoudnessApi()Lcom/ss/android/ugc/gamora/editor/loudness/EditLoudnessApiComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS6 = new C2217381BqS(C19762612Tw.class, "editAudioMetricsApi", "getEditAudioMetricsApi()Lcom/ss/android/ugc/gamora/editor/audiometrics/EditAudioMetricsApiComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS7 = new C2217381BqS(C19762612Tw.class, "editAdapterApi", "getEditAdapterApi()Lcom/ss/android/ugc/gamora/editor/adapter/EditAdapterApi;", 0);
        c09r3.getClass();
        LLLLJ = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3, c2217381BqS4, c2217381BqS5, c2217381BqS6, c2217381BqS7};
    }

    @Override // com.bytedance.scene.Scene
    public final void onResume() {
        this.LLJJIJIL = false;
        super.onResume();
    }

    public final void LLLIIIIL() {
        if (this.LLLLILI.hasChange(this.LLLJIL, true)) {
            this.LLLLILI.copyFrom(this.LLLJIL);
            C0EZB c0ezb = (C0EZB) this.LLJJLIIIJLLLLLLLZ.getValue(this, LLLLJ[4]);
            if (c0ezb != null) {
                c0ezb.cL1(this.LLLJIL.getAudioUrl(), this.LLLJIL.getAudioRecordIndex(), this.LLJILJIL);
            }
        }
    }

    public final InterfaceC1455860nzM LLLIL() {
        return (InterfaceC1455860nzM) this.LLJJJJJIL.getValue();
    }

    public final InterfaceC1418580n1E LLLILZ() {
        return (InterfaceC1418580n1E) this.LLJJJJLIIL.getValue(this, LLLLJ[2]);
    }

    public final C0LAB LLLILZLLLI() {
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("content_source", C1428470nHB.LJIILIIL(LLLIZZ()));
        c0lab.LJ("enter_from", "video_edit_page");
        c0lab.LJ("shoot_way", LLLIZZ().mShootWay);
        c0lab.LJ("creation_id", LLLIZZ().getCreationId());
        c0lab.LJ("content_type", "video");
        return c0lab;
    }

    public final VideoPublishEditModel LLLIZZ() {
        return (VideoPublishEditModel) this.LLJJJJ.getValue(this, LLLLJ[1]);
    }

    public final MutableLiveData<Long> LLLJ() {
        return (MutableLiveData) this.LLJILLL.getValue();
    }

    public final int LLLJL() {
        return ((ScreenUtils.getFullScreenHeight(this.mActivity) - ((int) C12ES.LIZJ(334.0f, C545820Lau.LIZIZ(this)))) - ScreenUtils.getStatusBarHeight(this.mActivity)) - ScreenUtils.com_ss_android_ugc_aweme_shortvideo_ScreenUtils_com_ss_android_ugc_tiktok_tools_performance_lancet_SearchPreloadLancet_getNavigationBarHeight(this.mActivity);
    }

    @Override // com.bytedance.scene.Scene
    public final void onDestroyView() {
        super.onDestroyView();
        this.LLJJIII.cancel();
        this.LLLL.removeCallbacksAndMessages(null);
    }

    @Override // com.bytedance.scene.Scene
    public final void onPause() {
        super.onPause();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("EditAudioRecordScene pauseRecord isRecording ");
        sbLIZ.append(this.LLJJIJI);
        C201955140j.LJIIL(C2188811AlT.LIZIZ(sbLIZ));
        if (this.LLJJIJI) {
            LLLLII(-1, C1DPV.LIZIZ.LIZJ(C1DPX.STOP_AUDIO_PAUSE, EnumC1641610sox.PAGE_INVISIBLE), false);
        }
        this.LLJJIJIL = true;
    }

    @Override // X.InterfaceC19762512Tv
    public final boolean LJLJJLL() {
        return this.LLJJIJI;
    }

    @Override // X.InterfaceC379610EuV
    public final C1DRG getDiContainer() {
        return this.LLJI;
    }

    /* JADX WARN: Type inference failed for: r0v28, types: [X.12U0] */
    public C19762612Tw(C1DRG c1drg) {
        this.LLJI = c1drg;
        this.LLJIJIL = C1664770tQJ.LIZ(c1drg, InterfaceC1455730nz9.class, null);
        this.LLJJJJ = C1664770tQJ.LIZ(c1drg, VideoPublishEditModel.class, null);
        this.LLJJJJLIIL = C1664770tQJ.LIZIZ(c1drg, InterfaceC1418580n1E.class, null);
        this.LLJJL = C1664770tQJ.LIZIZ(c1drg, InterfaceC1456910o13.class, null);
        this.LLJJLIIIJLLLLLLLZ = C1664770tQJ.LIZIZ(c1drg, C0EZB.class, null);
        this.LLJL = C1664770tQJ.LIZIZ(c1drg, C0EZC.class, null);
        this.LLJLIL = C1664770tQJ.LIZ(c1drg, InterfaceC1455850nzL.class, null);
    }

    public final void LLLII(String str) {
        C0EZE c0eze = this.LLLJ;
        if (c0eze != null && !c0eze.LIZIZ) {
            c0eze.LIZIZ = true;
            c0eze.LIZJ.destory();
        }
        C15O7.LIZIZ(new ACallableS432S0100000_29(new ARunnableS33S1100000_29(this, str, 3), 4), C823050WQl.LIZLLL(), null);
    }

    public final void LLLIILIL(boolean z) {
        InterfaceC1452170ntP value = LLLIL().g().getValue();
        if (value == null) {
            return;
        }
        C348100Dkm c348100DkmLIZIZ = C352130DrH.LIZIZ(value);
        if (c348100DkmLIZIZ != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("enableAddedAudio, isEnable:");
            sbLIZ.append(z);
            C201955140j.LIZIZ("EditAudioRecordScene", C2188811AlT.LIZIZ(sbLIZ));
            VecNLETrackSPtr tracks = c348100DkmLIZIZ.LIZ.getModel().getTracks();
            ArrayList arrayList = new ArrayList();
            for (NLETrack nLETrack : tracks) {
                NLETrack nLETrack2 = nLETrack;
                if (C351220Dpo.LLLJ(nLETrack2) || C351220Dpo.LLLILZLLLI(nLETrack2)) {
                    arrayList.add(nLETrack);
                }
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                ((NLENode) it2.next()).setEnable(z);
            }
            c348100DkmLIZIZ.LIZ.commit();
            return;
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    public final void LLLLIILL(boolean z) {
        Activity activity;
        C19A3 c19a3;
        ((IToolsCameraAudioSecurityCheckService) ServiceManager.get().getService(IToolsCameraAudioSecurityCheckService.class)).LJIIIIZZ();
        if (z && (c19a3 = (C19A3) this.mParentScene) != null) {
            c19a3.show(this);
        }
        ViewGroup viewGroup = this.LLLI;
        View view = null;
        if (viewGroup == null) {
            viewGroup = null;
        }
        C1462750oAT.LIZIZ(viewGroup, z, (int) C12ES.LIZJ(282.0f, this.mActivity), findViewById(R.id.ino), new C19773812Ye(this, z, 2));
        if (z) {
            C20684815ws.LJIILLIIL("click_dub", LLLILZLLLI().LIZ);
            AudioRecorderParam veAudioRecorderParam = LLLIZZ().getVeAudioRecorderParam();
            if (veAudioRecorderParam != null) {
                veAudioRecorderParam.setNeedDel(true);
                C1453010nul.LIZ(LLLIL(), veAudioRecorderParam);
            } else {
                this.LLLJIL = new AudioRecorderParam();
                if (LLLIZZ().creativeModel.micDataModel.editDefaultVolume == 0.0f && LLLIZZ().creativeModel.micDataModel.editDefaultVolume == LLLIZZ().getVoiceVolume() && !LLLIZZ().creativeModel.micDataModel.editVolumeChangeMark) {
                    LLLIZZ().setVoiceVolume(1.0f);
                    InterfaceC1418580n1E interfaceC1418580n1ELLLILZ = LLLILZ();
                    if (interfaceC1418580n1ELLLILZ != null) {
                        interfaceC1418580n1ELLLILZ.Hr1(false, false, true);
                    }
                    this.LLJJJIL = false;
                }
            }
            this.LLLJIL.copyFrom(LLLIZZ().getVeAudioRecorderParam());
            if (this.LLLJIL.getNeedOriginalSound()) {
                this.LLLJIL.setVoiceVolume(LLLIZZ().getVoiceVolume());
            }
            this.LLJJJ = null;
            CheckBox checkBox = this.LLLIL;
            if (checkBox == null) {
                checkBox = null;
            }
            checkBox.setChecked(this.LLLJIL.getNeedOriginalSound());
            CheckBox checkBox2 = this.LLLIL;
            if (checkBox2 == null) {
                checkBox2 = null;
            }
            checkBox2.setEnabled(!this.LLLJIL.getMuteByAudioCopyright());
            ((LiveData) this.LLJJ.getValue()).setValue(Boolean.valueOf(this.LLLJIL.getNeedOriginalSound()));
            View view2 = this.LLL;
            if (view2 == null) {
                view2 = null;
            }
            C786410Ut5.LJLLLLLL(0, view2);
            this.LLLLIILL.LIZ(0.0f, true);
            C19762412Tu c19762412Tu = this.LLLFZ;
            if (c19762412Tu == null) {
                c19762412Tu = null;
            }
            c19762412Tu.setStack(this.LLLJIL.getMStack());
            C19762412Tu c19762412Tu2 = this.LLLFZ;
            if (c19762412Tu2 == null) {
                c19762412Tu2 = null;
            }
            c19762412Tu2.LJIILL(0.0f);
            LLLJ().setValue(0L);
            if (this.LLLJIL.getMStack().isEmpty()) {
                View view3 = this.LLLIIIL;
                if (view3 == null) {
                    view3 = null;
                }
                C786410Ut5.LJLLLLLL(8, view3);
            } else {
                View view4 = this.LLLIIIL;
                if (view4 == null) {
                    view4 = null;
                }
                C786410Ut5.LJLLLLLL(0, view4);
            }
            InterfaceC524950KiL interfaceC524950KiL = this.LLJJI;
            if (interfaceC524950KiL != null) {
                interfaceC524950KiL.kF(this.LLLLIILLL);
            }
            ARunnableS129S0100000_29 aRunnableS129S0100000_29 = new ARunnableS129S0100000_29(this, 80);
            this.LLLJ = new C0EZE();
            C15O7.LIZIZ(new ACallableS416S0100000_9((Object) aRunnableS129S0100000_29, 4), C823050WQl.LIZLLL(), null);
            if (LLLIZZ().getVeAudioEffectParam() != null && (activity = this.mActivity) != null) {
                CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
                creativeToastBuilder.messageRes(2131829886);
                creativeToastBuilder.isTuxToastLegacy(true);
                C1390380mHk.LIZ(activity, 3082, creativeToastBuilder);
            }
            InterfaceC1455860nzM interfaceC1455860nzMLLLIL = LLLIL();
            int iLIZIZ = C19733712It.LIZIZ(true, false, false, false);
            int iLIZJ = ((int) C12ES.LIZJ(52.0f, this.mActivity)) + ScreenUtils.getStatusBarHeight(this.mActivity);
            int iLIZJ2 = (int) C12ES.LIZJ(282.0f, this.mActivity);
            int iLLLJL = LLLJL();
            c0.LIZ.n2();
            interfaceC1455860nzMLLLIL.aM0(C1453170nv1.LIZIZ(iLIZIZ, iLIZJ, iLIZJ2, iLLLJL, false, false, 1984));
            return;
        }
        View view5 = this.LLJZ;
        if (view5 == null) {
            view5 = null;
        }
        C786410Ut5.LJLLLLLL(8, view5);
        View view6 = this.LLJZIJLIL;
        if (view6 == null) {
            view6 = null;
        }
        C786410Ut5.LJLLLLLL(8, view6);
        InterfaceC524950KiL interfaceC524950KiL2 = this.LLJJI;
        if (interfaceC524950KiL2 != null) {
            interfaceC524950KiL2.b8(this.LLLLIILLL);
        }
        this.LLJJIII.cancel();
        InterfaceC1455860nzM interfaceC1455860nzMLLLIL2 = LLLIL();
        View view7 = this.LLJZ;
        if (view7 != null) {
            view = view7;
        }
        int iLIZ = C960203pA.LIZ(R.attr.e1, view.getContext());
        int iLIZJ3 = ((int) C12ES.LIZJ(52.0f, this.mActivity)) + ScreenUtils.getStatusBarHeight(this.mActivity);
        int iLIZJ4 = (int) C12ES.LIZJ(282.0f, this.mActivity);
        int iLLLJL2 = LLLJL();
        c0.LIZ.n2();
        interfaceC1455860nzMLLLIL2.aM0(C1453170nv1.LIZ(iLIZ, iLIZJ3, iLIZJ4, iLLLJL2));
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public final void handleMsg(Message message) {
        int i = message.what;
        MutableLiveData<C1452730nuJ> mutableLiveData = null;
        C1749280vcc c1749280vcc = null;
        View view = null;
        if (i == this.LLLLII) {
            this.LLLJL = false;
            View view2 = this.LLJLLL;
            if (view2 == null) {
                view2 = null;
            }
            C786410Ut5.LJLLLLLL(0, view2);
            C1749280vcc c1749280vcc2 = this.LLJLLIL;
            if (c1749280vcc2 == null) {
                c1749280vcc2 = null;
            }
            C786410Ut5.LLLZLZ(c1749280vcc2, 0);
            C1749280vcc c1749280vcc3 = this.LLJLLIL;
            if (c1749280vcc3 != null) {
                c1749280vcc = c1749280vcc3;
            }
            c1749280vcc.LJ();
            return;
        }
        if (i == this.LLLLIIIILLL) {
            this.LLLJL = true;
            C1749280vcc c1749280vcc4 = this.LLJLLIL;
            if (c1749280vcc4 == null) {
                c1749280vcc4 = null;
            }
            C786410Ut5.LLLZLZ(c1749280vcc4, 8);
            View view3 = this.LLJLLL;
            if (view3 != null) {
                view = view3;
            }
            C786410Ut5.LJLLLLLL(8, view);
            return;
        }
        if (i != this.LLLLIIL) {
            return;
        }
        this.LLLJL = true;
        C1749280vcc c1749280vcc5 = this.LLJLLIL;
        if (c1749280vcc5 == null) {
            c1749280vcc5 = null;
        }
        C786410Ut5.LLLZLZ(c1749280vcc5, 8);
        View view4 = this.LLJLLL;
        if (view4 == null) {
            view4 = null;
        }
        C786410Ut5.LJLLLLLL(8, view4);
        ((InterfaceC1455730nz9) this.LLJIJIL.getValue(this, LLLLJ[0])).Fd0(false);
        InterfaceC1452170ntP interfaceC1452170ntP = this.LLJILJIL;
        if (interfaceC1452170ntP != null) {
            interfaceC1452170ntP.setLoopPlay(true);
        }
        MutableLiveData<C1452730nuJ> mutableLiveData2 = this.LLJLILLLLZIIL;
        if (mutableLiveData2 != null) {
            mutableLiveData = mutableLiveData2;
        }
        mutableLiveData.setValue(C1452730nuJ.LIZ());
    }

    @Override // com.bytedance.scene.Scene
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        this.LLJLILLLLZIIL = LLLIL().vW1();
        InterfaceC1452170ntP value = LLLIL().g().getValue();
        this.LLJILJIL = value;
        if (value != null) {
            this.LLJILJILJ = value.getDuration();
        }
        this.LLJZ = findViewById(R.id.tv_save);
        this.LLJZIJLIL = findViewById(R.id.zbv);
        this.LLL = findViewById(R.id.lr1);
        this.LLLF = (FrameLayout) findViewById(R.id.ujl);
        this.LLLFFI = findViewById(R.id.videolayout);
        this.LLLI = (ViewGroup) findViewById(R.id.evm);
        this.LLLII = (C19762712Tx) findViewById(R.id.vyr);
        this.LLLIIIL = findViewById(R.id.bnq);
        C19471411Fw c19471411Fw = (C19471411Fw) findViewById(R.id.zy3);
        this.LLLIIL = c19471411Fw;
        c19471411Fw.LJJJJ();
        CheckBox checkBox = (CheckBox) findViewById(R.id.dj6);
        this.LLLIL = checkBox;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("  ");
        sbLIZ.append(getString(2131829835));
        checkBox.setText(C2188811AlT.LIZIZ(sbLIZ));
        Typeface typefaceLIZIZ = C1697580uHE.LIZIZ(0.0f, 400, 17.0f, 0.0f, Float.valueOf(16.0f), 0.0f, 0, null, 224);
        C0H6D c0h6d = null;
        if (typefaceLIZIZ != null) {
            CheckBox checkBox2 = this.LLLIL;
            if (checkBox2 == null) {
                checkBox2 = null;
            }
            checkBox2.setTypeface(typefaceLIZIZ);
        }
        this.LLJLLIL = (C1749280vcc) findViewById(R.id.nne);
        View viewFindViewById = findViewById(R.id.nnf);
        this.LLJLLL = viewFindViewById;
        C786410Ut5.I7(new View.OnClickListener() { // from class: X.12U3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
            }
        }, viewFindViewById);
        C1295960jpS c1295960jpS = (C1295960jpS) findViewById(R.id.nru);
        this.LLLIILIL = c1295960jpS;
        c1295960jpS.setAnimation("creation_recording_dark_tux_lottie.json");
        C1295960jpS c1295960jpS2 = this.LLLIILIL;
        if (c1295960jpS2 == null) {
            c1295960jpS2 = null;
        }
        c1295960jpS2.setRepeatCount(-1);
        C1464900oDw.LIZ.getClass();
        C786410Ut5.LJLLLLLL(8, findViewById(R.id.gcs));
        View view = this.LLLIIIL;
        if (view == null) {
            view = null;
        }
        view.setBackgroundResource(R.drawable.a73);
        C19762412Tu c19762412Tu = new C19762412Tu(C545820Lau.LIZIZ(this), this);
        this.LLLFZ = c19762412Tu;
        int iLIZJ = (int) C12ES.LIZJ(16.0f, this.mActivity);
        int iLIZJ2 = (int) C12ES.LIZJ(6.0f, this.mActivity);
        int iLIZJ3 = (int) C12ES.LIZJ(4.0f, this.mActivity);
        int i = this.LLJILJILJ;
        C19762812Ty c19762812Ty = this.LLLLIILL;
        c19762412Tu.LLILLL = iLIZJ;
        c19762412Tu.LLILZ = iLIZJ3 * 5;
        c19762412Tu.LLJ = i;
        c19762412Tu.LLJI = c19762812Ty;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.bottomMargin = iLIZJ2;
        layoutParams.topMargin = iLIZJ2;
        layoutParams.rightMargin = iLIZJ;
        layoutParams.leftMargin = iLIZJ;
        C19756012Ri c19756012Ri = c19762412Tu.LLILLJJLI;
        int color = ColorProtector.parseColor("#ccfe2c55");
        c19756012Ri.getClass();
        c19756012Ri.LLILLJJLI.setColor(color);
        c19756012Ri.LLILLJJLI.setStyle(Paint.Style.FILL);
        c19756012Ri.LLILLL = i;
        c19756012Ri.LLILZ = C12ES.LIZJ(0.0f, c19756012Ri.getContext());
        c19762412Tu.addView(c19762412Tu.LLILLJJLI, layoutParams);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(c19762412Tu.LLILZ, -1);
        if (C1388580mEq.LIZIZ(c19762412Tu.getContext())) {
            layoutParams2.addRule(21);
            layoutParams2.setMarginEnd((c19762412Tu.getWidth() - iLIZJ) - (c19762412Tu.LLILZ / 2));
        } else {
            layoutParams2.leftMargin = iLIZJ - (c19762412Tu.LLILZ / 2);
        }
        c19762412Tu.LL.setImageDrawable(C426580Go4.LIZJ(0, -1, 1, (int) C12ES.LIZJ(2.0f, c19762412Tu.getContext())));
        int i2 = (int) (c19762412Tu.LLILZ * 0.4f);
        c19762412Tu.LL.setPadding(i2, 0, i2, 0);
        c19762412Tu.addView(c19762412Tu.LL, layoutParams2);
        c19762412Tu.LL.setOnTouchListener(new ATListenerS461S0100000_29(c19762412Tu, 8));
        FrameLayout frameLayout = this.LLLF;
        if (frameLayout == null) {
            frameLayout = null;
        }
        C19762412Tu c19762412Tu2 = this.LLLFZ;
        if (c19762412Tu2 == null) {
            c19762412Tu2 = null;
        }
        frameLayout.addView(c19762412Tu2, new FrameLayout.LayoutParams(-1, -1));
        this.LLLFF = (C0H6D) findViewById(R.id.dt4);
        this.LLJJI = C0MWZ.LIZ(this);
        this.LLLIZZ = LLLIL().Ps();
        this.LLLILZLLLI = LLLIL().lk();
        this.LLJJIII.setDuration(1000L);
        this.LLJJIII.setRepeatCount(-1);
        this.LLJJIII.addUpdateListener(new AUListenerS277S0100000_29(this, 13));
        View view2 = this.LLJZ;
        if (view2 == null) {
            view2 = null;
        }
        C786410Ut5.I7(this.LLLLIL, view2);
        View view3 = this.LLJZIJLIL;
        if (view3 == null) {
            view3 = null;
        }
        C786410Ut5.I7(this.LLLLIL, view3);
        View view4 = this.LLL;
        if (view4 == null) {
            view4 = null;
        }
        C786410Ut5.I7(this.LLLLIL, view4);
        View view5 = this.LLLFFI;
        if (view5 == null) {
            view5 = null;
        }
        C786410Ut5.I7(this.LLLLIL, view5);
        View view6 = this.LLLIIIL;
        if (view6 == null) {
            view6 = null;
        }
        C786410Ut5.I7(this.LLLLIL, view6);
        C19762712Tx c19762712Tx = this.LLLII;
        if (c19762712Tx == null) {
            c19762712Tx = null;
        }
        View.OnClickListener akS95S0100000_29 = new AkS95S0100000_29(this, 40);
        if (C1848410yCV.LIZ) {
            akS95S0100000_29 = new f(akS95S0100000_29);
        }
        a aVar = new a(akS95S0100000_29);
        if (C2213981Bky.LIZIZ.isOffline()) {
            C2211941Bhg.LIZ.injectViewListener(c19762712Tx);
        }
        c19762712Tx.setOnClickListener(aVar);
        C19762712Tx c19762712Tx2 = this.LLLII;
        if (c19762712Tx2 == null) {
            c19762712Tx2 = null;
        }
        c19762712Tx2.setOnLongClickListener(new C12YH(this, 2));
        C19762712Tx c19762712Tx3 = this.LLLII;
        if (c19762712Tx3 == null) {
            c19762712Tx3 = null;
        }
        c19762712Tx3.setOnTouchListener(new ATListenerS461S0100000_29(this, 9));
        LLLJ().observe(this, new AObserverS231S0100000_29(this, 76));
        ((LiveData) this.LLJJ.getValue()).observe(this, new AObserverS231S0100000_29(this, 77));
        CheckBox checkBox3 = this.LLLIL;
        if (checkBox3 == null) {
            checkBox3 = null;
        }
        C786410Ut5.v7(checkBox3, new C12YG(this, 2));
        CheckBox checkBox4 = this.LLLIL;
        if (checkBox4 == null) {
            checkBox4 = null;
        }
        C786410Ut5.LLIIIZ(checkBox4, 8);
        VideoPublishEditModel videoPublishEditModelLLLIZZ = LLLIZZ();
        if (videoPublishEditModelLLLIZZ.realHasOriginalSound() || videoPublishEditModelLLLIZZ.isFastImport()) {
            CheckBox checkBox5 = this.LLLIL;
            if (checkBox5 == null) {
                checkBox5 = null;
            }
            C786410Ut5.LLIIIZ(checkBox5, 0);
        }
        if (videoPublishEditModelLLLIZZ.getEditMusicSyncMode() || videoPublishEditModelLLLIZZ.isDuet() || videoPublishEditModelLLLIZZ.getStitchParams() != null || videoPublishEditModelLLLIZZ.isStickPointMode()) {
            CheckBox checkBox6 = this.LLLIL;
            if (checkBox6 == null) {
                checkBox6 = null;
            }
            C786410Ut5.LLIIIZ(checkBox6, 8);
        }
        InterfaceC1452170ntP interfaceC1452170ntP = this.LLJILJIL;
        if (interfaceC1452170ntP != null) {
            C0H6D c0h6d2 = this.LLLFF;
            if (c0h6d2 == null) {
                c0h6d2 = null;
            }
            c0h6d2.LIZLLL();
            C0H6D c0h6d3 = this.LLLFF;
            if (c0h6d3 == null) {
                c0h6d3 = null;
            }
            c0h6d3.setLayoutManager(new WrapLinearLayoutManager(C545820Lau.LIZIZ(this), 0));
            C0H6D c0h6d4 = this.LLLFF;
            if (c0h6d4 == null) {
                c0h6d4 = null;
            }
            int frameHeight = c0h6d4.getFrameHeight();
            C0H6D c0h6d5 = this.LLLFF;
            if (c0h6d5 == null) {
                c0h6d5 = null;
            }
            int frameWidth = c0h6d5.getFrameWidth();
            int iCeil = (int) Math.ceil((C12ES.LJIIJ(this.mActivity) - (C814420VxA.LIZIZ(C12ES.LIZJ(16.0f, this.mActivity)) * 2)) / (frameWidth * 1.0f));
            C0H6D c0h6d6 = this.LLLFF;
            if (c0h6d6 == null) {
                c0h6d6 = null;
            }
            c0h6d6.setCoverSize(iCeil);
            C0H6D c0h6d7 = this.LLLFF;
            if (c0h6d7 == null) {
                c0h6d7 = null;
            }
            this.LLLILZ = new VEVideoCoverGeneratorImpl(interfaceC1452170ntP, this, c0h6d7.getCoverSize(), null, "ai_music");
            VEVideoCoverGeneratorImpl vEVideoCoverGeneratorImpl = this.LLLILZ;
            if (vEVideoCoverGeneratorImpl == null) {
                vEVideoCoverGeneratorImpl = null;
            }
            this.LLLILZJ = new C19560811fy(vEVideoCoverGeneratorImpl, frameWidth, frameHeight, iCeil);
            if (LLLIZZ().isMvThemeVideoType()) {
                final C810503Ep c810503Ep = new C810503Ep(frameWidth, frameHeight);
                C0H6D c0h6d8 = this.LLLFF;
                if (c0h6d8 == null) {
                    c0h6d8 = null;
                }
                c0h6d8.setAdapter(c810503Ep);
                MvChooseCoverBitmapCreator mvChooseCoverBitmapCreator = new MvChooseCoverBitmapCreator();
                mvChooseCoverBitmapCreator.setMvThemeVideoCoverErrorListener(new InterfaceC1457180o1U() { // from class: X.12U4
                    @Override // X.InterfaceC1457180o1U
                    public final void onError(int i3, String str) {
                        C201955140j.LJ(str);
                    }
                });
                MutableLiveData<Boolean> mutableLiveData = this.LLLIZZ;
                if (mutableLiveData == null) {
                    mutableLiveData = null;
                }
                mvChooseCoverBitmapCreator.setFirstFrameVisibleLiveData(mutableLiveData);
                MutableLiveData<Bitmap> mutableLiveData2 = this.LLLILZLLLI;
                if (mutableLiveData2 == null) {
                    mutableLiveData2 = null;
                }
                mvChooseCoverBitmapCreator.setFirstFrameBitmapLiveData(mutableLiveData2);
                mvChooseCoverBitmapCreator.setNeedCompileFrame(true);
                mvChooseCoverBitmapCreator.setImgSize(frameWidth, frameHeight);
                Activity activity = this.mActivity;
                InterfaceC20597015ii interfaceC20597015iiLJ = C20622515mp.LJ(this);
                if (interfaceC20597015iiLJ != null) {
                    interfaceC20597015iiLJ.Ss("getIntent", new AwS10S0501000_29(mvChooseCoverBitmapCreator, activity, this, iCeil, interfaceC20597015iiLJ, c810503Ep, 2));
                } else {
                    mvChooseCoverBitmapCreator.getBitmapList(activity, this.LLJILJIL, iCeil, new InterfaceC741260T5w() { // from class: X.12U2
                        @Override // X.InterfaceC741260T5w
                        public final void LIZ(List<Bitmap> list) {
                            c810503Ep.LLLFZ(list);
                        }
                    });
                }
                C0H6D c0h6d9 = this.LLLFF;
                if (c0h6d9 != null) {
                    c0h6d = c0h6d9;
                }
                c0h6d.setAdapter(c810503Ep);
                return;
            }
            C19560811fy c19560811fy = this.LLLILZJ;
            if (c19560811fy == null) {
                c19560811fy = null;
            }
            C0FPB c0fpb = new C0FPB(c19560811fy, frameWidth, frameHeight);
            C0H6D c0h6d10 = this.LLLFF;
            if (c0h6d10 != null) {
                c0h6d = c0h6d10;
            }
            c0h6d.setAdapter(c0fpb);
        }
    }

    public final void LLLLIL(Cert cert, boolean z) {
        Integer numValueOf;
        int iIntValue;
        InterfaceC1452170ntP interfaceC1452170ntP = this.LLJILJIL;
        if (interfaceC1452170ntP == null) {
            return;
        }
        View view = this.LLL;
        MutableLiveData<C1452730nuJ> mutableLiveData = null;
        if (view == null) {
            view = null;
        }
        C786410Ut5.LJLLLLLL(4, view);
        int i = 0;
        if (z) {
            this.LLLJIL.setNeedDel(true);
            C1453010nul.LIZ(LLLIL(), this.LLLJIL);
            C19471411Fw c19471411Fw = this.LLLIIL;
            if (c19471411Fw == null) {
                c19471411Fw = null;
            }
            C786410Ut5.g1(c19471411Fw, 4);
            View view2 = this.LLLIIIL;
            if (view2 == null) {
                view2 = null;
            }
            C786410Ut5.LJLLLLLL(4, view2);
            C1295960jpS c1295960jpS = this.LLLIILIL;
            if (c1295960jpS == null) {
                c1295960jpS = null;
            }
            c1295960jpS.playAnimation();
            C1295960jpS c1295960jpS2 = this.LLLIILIL;
            if (c1295960jpS2 == null) {
                c1295960jpS2 = null;
            }
            C786410Ut5.LLD(0, c1295960jpS2);
            InterfaceC1418580n1E interfaceC1418580n1ELLLILZ = LLLILZ();
            if (interfaceC1418580n1ELLLILZ != null) {
                interfaceC1418580n1ELLLILZ.wM1(false);
            }
            LLLIILIL(false);
        } else {
            this.LLJJIJIIJIL = true;
            AudioRecorderParam audioRecorderParam = this.LLLJIL;
            C19762412Tu c19762412Tu = this.LLLFZ;
            if (c19762412Tu == null) {
                c19762412Tu = null;
            }
            audioRecorderParam.setMStack(c19762412Tu.getStack());
            if ((!this.LLLJIL.getMStack().isEmpty()) && this.LLLJ != null && this.LLLJIL.getAudioRecordIndex() < 0) {
                C1453010nul.LIZ(LLLIL(), this.LLLJIL);
            }
            InterfaceC1418580n1E interfaceC1418580n1ELLLILZ2 = LLLILZ();
            if (interfaceC1418580n1ELLLILZ2 != null) {
                interfaceC1418580n1ELLLILZ2.wM1(true);
            }
            LLLIILIL(true);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("EditAudioRecordScene startRecording isRecording ");
        sbLIZ.append(this.LLJJIJI);
        sbLIZ.append(" isRecord ");
        sbLIZ.append(z);
        C201955140j.LJIIL(C2188811AlT.LIZIZ(sbLIZ));
        if (z) {
            if (this.LLJJJ != null) {
                MutableLiveData<C1452730nuJ> mutableLiveData2 = this.LLJLILLLLZIIL;
                if (mutableLiveData2 == null) {
                    mutableLiveData2 = null;
                }
                mutableLiveData2.setValue(C1452730nuJ.LIZLLL(r0.getY()));
                C19762412Tu c19762412Tu2 = this.LLLFZ;
                if (c19762412Tu2 == null) {
                    c19762412Tu2 = null;
                }
                Point point = this.LLJJJ;
                if (point != null) {
                    this.LLJJJ = c19762412Tu2.LJ(point.getY());
                } else {
                    "Required value was null.".toString();
                    throw new IllegalArgumentException("Required value was null.");
                }
            } else {
                int iLLL = interfaceC1452170ntP.LLL();
                if (iLLL >= 50) {
                    i = iLLL;
                }
                C19762412Tu c19762412Tu3 = this.LLLFZ;
                if (c19762412Tu3 == null) {
                    c19762412Tu3 = null;
                }
                this.LLJJJ = c19762412Tu3.LJ(i);
            }
            this.LLJJIJI = true;
            C0EZE c0eze = this.LLLJ;
            if (c0eze != null) {
                numValueOf = Integer.valueOf(c0eze.LIZJ(interfaceC1452170ntP.LLL() + 50, this.LLJILJILJ, cert));
                if (numValueOf == null || numValueOf.intValue() != 0) {
                }
            } else {
                numValueOf = null;
            }
            C19771012Xc c19771012Xc = C19771012Xc.LIZ;
            String creationId = LLLIZZ().getCreationId();
            if (numValueOf != null) {
                iIntValue = numValueOf.intValue();
            } else {
                iIntValue = Integer.MAX_VALUE;
            }
            c19771012Xc.getClass();
            C19771012Xc.LIZIZ(iIntValue, creationId, "");
        }
        MutableLiveData<C1452730nuJ> mutableLiveData3 = this.LLJLILLLLZIIL;
        if (mutableLiveData3 != null) {
            mutableLiveData = mutableLiveData3;
        }
        mutableLiveData.setValue(C1452730nuJ.LIZ());
        this.LLJJIII.start();
    }

    public final void LLLLII(int i, Cert cert, boolean z) {
        C1295960jpS c1295960jpS = null;
        if (!z) {
            MutableLiveData<C1452730nuJ> mutableLiveData = this.LLJLILLLLZIIL;
            if (mutableLiveData == null) {
                mutableLiveData = null;
            }
            mutableLiveData.setValue(C1452730nuJ.LIZJ());
        }
        InterfaceC1452170ntP interfaceC1452170ntP = this.LLJILJIL;
        if (interfaceC1452170ntP != null) {
            interfaceC1452170ntP.refreshCurrentFrame();
            LLLJ().setValue(Long.valueOf(interfaceC1452170ntP.LLL()));
        }
        this.LLJJIII.cancel();
        View view = this.LLL;
        if (view == null) {
            view = null;
        }
        C786410Ut5.LJLLLLLL(0, view);
        if (this.LLLIIII) {
            this.LLLIIII = false;
            InterfaceC1461660o8i interfaceC1461660o8iLIZJ = ((InterfaceC1455850nzL) this.LLJLIL.getValue(this, LLLLJ[6])).AT().LIZJ();
            if (interfaceC1461660o8iLIZJ != null) {
                interfaceC1461660o8iLIZJ.R3(false);
            }
            C19762712Tx c19762712Tx = this.LLLII;
            if (c19762712Tx == null) {
                c19762712Tx = null;
            }
            c19762712Tx.LLILLL.end();
            c19762712Tx.LLILZ.start();
        }
        if (this.LLLIIIIL) {
            this.LLLIIIIL = false;
            InterfaceC1461660o8i interfaceC1461660o8iLIZJ2 = ((InterfaceC1455850nzL) this.LLJLIL.getValue(this, LLLLJ[6])).AT().LIZJ();
            if (interfaceC1461660o8iLIZJ2 != null) {
                interfaceC1461660o8iLIZJ2.R3(false);
            }
            C19762712Tx c19762712Tx2 = this.LLLII;
            if (c19762712Tx2 == null) {
                c19762712Tx2 = null;
            }
            C19762912Tz c19762912Tz = c19762712Tx2.LLILLJJLI;
            if (c19762912Tz == null) {
                c19762912Tz = null;
            }
            c19762912Tz.LLILZ.end();
            c19762912Tz.LLILLL.start();
        }
        if (this.LLJJIJI) {
            C0EZE c0eze = this.LLLJ;
            if (c0eze != null) {
                if (z) {
                    Point point = this.LLJJJ;
                    if (point != null) {
                        point.setY(this.LLJILJILJ);
                    }
                    c0eze.LIZLLL(cert);
                } else {
                    int iLIZLLL = (int) c0eze.LIZLLL(cert);
                    if (i == -1) {
                        i = iLIZLLL;
                    }
                    Point point2 = this.LLJJJ;
                    if (point2 != null) {
                        point2.setY(i);
                    }
                    MutableLiveData<C1452730nuJ> mutableLiveData2 = this.LLJLILLLLZIIL;
                    if (mutableLiveData2 == null) {
                        mutableLiveData2 = null;
                    }
                    mutableLiveData2.setValue(C1452730nuJ.LIZLLL(i));
                    C19762412Tu c19762412Tu = this.LLLFZ;
                    if (c19762412Tu == null) {
                        c19762412Tu = null;
                    }
                    c19762412Tu.LJIILL(i / this.LLJILJILJ);
                }
                C19762412Tu c19762412Tu2 = this.LLLFZ;
                if (c19762412Tu2 == null) {
                    c19762412Tu2 = null;
                }
                c19762412Tu2.LIZIZ();
            }
            this.LLJJIJI = false;
            if (this.LLJJJ != null) {
                LLLJ().setValue(Long.valueOf(r0.getY()));
            }
        }
        this.LLJJIJIIJIL = false;
        AudioRecorderParam audioRecorderParam = this.LLLJIL;
        C19762412Tu c19762412Tu3 = this.LLLFZ;
        if (c19762412Tu3 == null) {
            c19762412Tu3 = null;
        }
        audioRecorderParam.setMStack(c19762412Tu3.getStack());
        if (this.LLLJIL.getMStack().isEmpty()) {
            View view2 = this.LLLIIIL;
            if (view2 == null) {
                view2 = null;
            }
            C786410Ut5.LJLLLLLL(8, view2);
        } else {
            View view3 = this.LLLIIIL;
            if (view3 == null) {
                view3 = null;
            }
            C786410Ut5.LJLLLLLL(0, view3);
        }
        C19471411Fw c19471411Fw = this.LLLIIL;
        if (c19471411Fw == null) {
            c19471411Fw = null;
        }
        C786410Ut5.g1(c19471411Fw, 0);
        C1295960jpS c1295960jpS2 = this.LLLIILIL;
        if (c1295960jpS2 == null) {
            c1295960jpS2 = null;
        }
        C786410Ut5.LLD(4, c1295960jpS2);
        C1295960jpS c1295960jpS3 = this.LLLIILIL;
        if (c1295960jpS3 != null) {
            c1295960jpS = c1295960jpS3;
        }
        c1295960jpS.cancelAnimation();
    }

    @Override // com.bytedance.scene.Scene
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.eo0, viewGroup, false);
        this.LLJLL = viewTd;
        if (viewTd == null) {
            return null;
        }
        return viewTd;
    }
}
