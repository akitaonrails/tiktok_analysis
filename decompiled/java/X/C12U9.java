package X;

import Y.ACallableS416S0100000_9;
import Y.ACallableS432S0100000_29;
import Y.AObserverS231S0100000_29;
import Y.ARunnableS129S0100000_29;
import Y.ARunnableS33S1100000_29;
import Y.ARunnableS9S0100001_29;
import Y.ATListenerS461S0100000_29;
import Y.AUListenerS277S0100000_29;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.os.Bundle;
import android.os.Message;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import avg.f;
import com.bytedance.bpea.basics.Cert;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.mt.protector.impl.color.ColorProtector;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.audiorecord.AudioRecorderParam;
import com.ss.android.ugc.aweme.audiorecord.Point;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.ftc.components.audiorecord.FTCEditAudioRecordViewModel;
import com.ss.android.ugc.aweme.service.IToolsCameraAudioSecurityCheckService;
import com.ss.android.ugc.aweme.shortvideo.ScreenUtils;
import com.ss.android.ugc.aweme.shortvideo.cover.VEVideoCoverGeneratorImpl;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.cover.MvChooseCoverBitmapCreator;
import com.ss.android.ugc.aweme.widgetcompat.WrapLinearLayoutManager;
import com.ss.android.vesdk.VEEditor;
import com.zhiliaoapp.musically.R;
import irm.AkS95S0100000_29;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS218S0000000_29;
import kotlin.jvm.internal.AwS573S0100000_29;
import mf.a;
import nv7.c0;

/* JADX INFO: renamed from: X.12U9, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C12U9 extends Scene implements WeakHandler.IHandler, InterfaceC1166920gTK, InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLJIL;
    public final C1DRG LLJI;
    public InterfaceC1452170ntP LLJIJIL;
    public InterfaceC524950KiL LLJJ;
    public boolean LLJJIII;
    public boolean LLJJIJI;
    public Point LLJJIJIL;
    public final C1664750tQH LLJJJ;
    public final C1664750tQH LLJJJIL;
    public MutableLiveData<C1452730nuJ> LLJJJJJIL;
    public View LLJJJJLIIL;
    public C1749280vcc LLJJL;
    public View LLJJLIIIJLLLLLLLZ;
    public View LLJL;
    public View LLJLIL;
    public View LLJLILLLLZIIL;
    public FrameLayout LLJLL;
    public C0H6D LLJLLIL;
    public View LLJLLL;
    public C12UA LLJZ;
    public ViewGroup LLJZIJLIL;
    public C12UE LLL;
    public boolean LLLF;
    public boolean LLLFF;
    public View LLLFFI;
    public C19471411Fw LLLFZ;
    public C1295960jpS LLLI;
    public CheckBox LLLII;
    public VEVideoCoverGeneratorImpl LLLIIII;
    public C19560811fy LLLIIIIL;
    public MutableLiveData<Bitmap> LLLIIIL;
    public MutableLiveData<Boolean> LLLIIL;
    public C12UK LLLIILIL;
    public int LLJILJIL = 1;
    public final C01GW LLJILJILJ = C452501pT.LIZIZ(AFwS218S0000000_29.get$arr$(467));
    public final C01GW LLJILLL = C452501pT.LIZIZ(AFwS218S0000000_29.get$arr$(466));
    public final ValueAnimator LLJJI = ValueAnimator.ofInt(1, 10);
    public boolean LLJJIJIIJIL = true;
    public final C01GW LLJJJJ = C452501pT.LIZIZ(new AwS573S0100000_29(this, 1129));
    public AudioRecorderParam LLLIL = new AudioRecorderParam();
    public volatile boolean LLLILZ = true;
    public final WeakHandler LLLILZJ = new WeakHandler(this);
    public final C12UC LLLILZLLLI = new C12UC(this);
    public final C12UG LLLIZZ = new InterfaceC362610EJn() { // from class: X.12UG
        @Override // X.InterfaceC362610EJn
        public final boolean onKeyDown(int i, KeyEvent keyEvent) {
            if (i == 4 && this.LL.isVisible()) {
                View view = this.LL.LLJLIL;
                if (view == null) {
                    view = null;
                }
                view.performClick();
                return true;
            }
            return false;
        }
    };
    public final AkS95S0100000_29 LLLJ = new AkS95S0100000_29(this, 101);

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C12U9.class, "mVideoPublishEditModel", "getMVideoPublishEditModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C12U9.class, "editPreviewApi", "getEditPreviewApi()Lcom/ss/android/ugc/aweme/shortvideo/preview/EditPreviewApi;", 0);
        c09r3.getClass();
        LLLJIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
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

    @Override // com.bytedance.scene.Scene
    public final void onResume() {
        this.LLJJIJIIJIL = false;
        super.onResume();
    }

    public final FTCEditAudioRecordViewModel LLLIIIIL() {
        return (FTCEditAudioRecordViewModel) this.LLJJJJ.getValue();
    }

    public final InterfaceC1455860nzM LLLIILIL() {
        return (InterfaceC1455860nzM) this.LLJJJIL.getValue(this, LLLJIL[1]);
    }

    public final VideoPublishEditModel LLLIL() {
        return (VideoPublishEditModel) this.LLJJJ.getValue(this, LLLJIL[0]);
    }

    public final MutableLiveData<Long> LLLILZ() {
        return (MutableLiveData) this.LLJILJILJ.getValue();
    }

    public final int LLLILZLLLI() {
        return ((ScreenUtils.getFullScreenHeight(this.mActivity) - ((int) C12ES.LIZJ(334.0f, this.mActivity))) - ScreenUtils.getStatusBarHeight(this.mActivity)) - ScreenUtils.com_ss_android_ugc_aweme_shortvideo_ScreenUtils_com_ss_android_ugc_tiktok_tools_performance_lancet_SearchPreloadLancet_getNavigationBarHeight(this.mActivity);
    }

    public final void LLLJL() {
        AudioRecorderParam audioRecorderParam = this.LLLIL;
        C12UA c12ua = this.LLJZ;
        if (c12ua == null) {
            c12ua = null;
        }
        audioRecorderParam.setMStack(c12ua.getStack());
        Boolean bool = (Boolean) ((LiveData) this.LLJILLL.getValue()).getValue();
        if (bool != null) {
            this.LLLIL.setNeedOriginalSound(bool.booleanValue());
        }
    }

    @Override // com.bytedance.scene.Scene
    public final void onDestroyView() {
        super.onDestroyView();
        this.LLJJI.cancel();
        this.LLLILZJ.removeCallbacksAndMessages(null);
    }

    @Override // com.bytedance.scene.Scene
    public final void onPause() {
        super.onPause();
        if (this.LLJJIII) {
            LLLIZZ(-1, C1DPV.LIZIZ.LIZJ(C1DPX.STOP_AUDIO_FTC_PAUSE, EnumC1641610sox.PAGE_INVISIBLE), false);
        }
        this.LLJJIJIIJIL = true;
    }

    @Override // X.InterfaceC379610EuV
    public final C1DRG getDiContainer() {
        return this.LLJI;
    }

    /* JADX WARN: Type inference failed for: r0v18, types: [X.12UG] */
    public C12U9(C1DRG c1drg) {
        this.LLJI = c1drg;
        this.LLJJJ = C1664770tQJ.LIZ(c1drg, VideoPublishEditModel.class, null);
        this.LLJJJIL = C1664770tQJ.LIZ(c1drg, InterfaceC1455860nzM.class, null);
    }

    public final void LLLII(String str) {
        C12UK c12uk = this.LLLIILIL;
        if (c12uk != null) {
            c12uk.LIZ.destory();
        }
        C15O7.LIZIZ(new ACallableS432S0100000_29(new ARunnableS33S1100000_29(this, str, 9), 14), C823050WQl.LIZLLL(), null);
    }

    public final void LLLLII(boolean z) {
        C19A3 c19a3;
        ((IToolsCameraAudioSecurityCheckService) ServiceManager.get().getService(IToolsCameraAudioSecurityCheckService.class)).LJIIIIZZ();
        if (z && (c19a3 = (C19A3) this.mParentScene) != null) {
            c19a3.show(this);
        }
        ViewGroup viewGroup = this.LLJZIJLIL;
        View view = null;
        if (viewGroup == null) {
            viewGroup = null;
        }
        C1462750oAT.LIZIZ(viewGroup, z, (int) C12ES.LIZJ(282.0f, this.mActivity), findViewById(R.id.ino), new C19773812Ye(this, z, 7));
        if (z) {
            AudioRecorderParam veAudioRecorderParam = LLLIL().getVeAudioRecorderParam();
            if (veAudioRecorderParam != null) {
                veAudioRecorderParam.setNeedDel(true);
                C1453010nul.LIZ(LLLIILIL(), veAudioRecorderParam);
            } else {
                this.LLLIL = new AudioRecorderParam();
            }
            this.LLLIL.copyFrom(LLLIL().getVeAudioRecorderParam());
            if (this.LLLIL.getNeedOriginalSound()) {
                this.LLLIL.setVoiceVolume(LLLIL().getVoiceVolume());
            }
            this.LLJJIJIL = null;
            CheckBox checkBox = this.LLLII;
            if (checkBox == null) {
                checkBox = null;
            }
            checkBox.setChecked(this.LLLIL.getNeedOriginalSound());
            ((LiveData) this.LLJILLL.getValue()).setValue(Boolean.valueOf(this.LLLIL.getNeedOriginalSound()));
            View view2 = this.LLJLILLLLZIIL;
            if (view2 == null) {
                view2 = null;
            }
            C786410Ut5.LJLLLLLL(0, view2);
            this.LLLILZLLLI.LIZ(0.0f, true);
            C12UA c12ua = this.LLJZ;
            if (c12ua == null) {
                c12ua = null;
            }
            c12ua.setStack(this.LLLIL.getMStack());
            C12UA c12ua2 = this.LLJZ;
            if (c12ua2 == null) {
                c12ua2 = null;
            }
            c12ua2.getClass();
            HandlerHook.viewPost(c12ua2, new ARunnableS9S0100001_29(c12ua2, 0.0f, 1));
            LLLILZ().setValue(0L);
            if (this.LLLIL.getMStack().isEmpty()) {
                View view3 = this.LLLFFI;
                if (view3 == null) {
                    view3 = null;
                }
                C786410Ut5.LJLLLLLL(8, view3);
            } else {
                View view4 = this.LLLFFI;
                if (view4 == null) {
                    view4 = null;
                }
                C786410Ut5.LJLLLLLL(0, view4);
            }
            InterfaceC524950KiL interfaceC524950KiL = this.LLJJ;
            if (interfaceC524950KiL != null) {
                interfaceC524950KiL.kF(this.LLLIZZ);
            }
            ARunnableS129S0100000_29 aRunnableS129S0100000_29 = new ARunnableS129S0100000_29(this, 239);
            this.LLLIILIL = new C12UK();
            C15O7.LIZIZ(new ACallableS416S0100000_9((Object) aRunnableS129S0100000_29, 14), C823050WQl.LIZLLL(), null);
            if (LLLIL().getVeAudioEffectParam() != null) {
                C1233040iBy c1233040iBy = new C1233040iBy(this.mActivity);
                c1233040iBy.LIZIZ(2131829886);
                c1233040iBy.LIZLLL();
            }
            InterfaceC1455860nzM interfaceC1455860nzMLLLIILIL = LLLIILIL();
            int iLIZIZ = C19733712It.LIZIZ(true, false, false, false);
            int iLIZJ = ((int) C12ES.LIZJ(52.0f, this.mActivity)) + ScreenUtils.getStatusBarHeight(this.mActivity);
            int iLIZJ2 = (int) C12ES.LIZJ(282.0f, this.mActivity);
            int iLLLILZLLLI = LLLILZLLLI();
            c0.LIZ.n2();
            interfaceC1455860nzMLLLIILIL.aM0(C1453170nv1.LIZIZ(iLIZIZ, iLIZJ, iLIZJ2, iLLLILZLLLI, false, false, 1984));
            return;
        }
        View view5 = this.LLJL;
        if (view5 == null) {
            view5 = null;
        }
        C786410Ut5.LJLLLLLL(8, view5);
        View view6 = this.LLJLIL;
        if (view6 == null) {
            view6 = null;
        }
        C786410Ut5.LJLLLLLL(8, view6);
        InterfaceC524950KiL interfaceC524950KiL2 = this.LLJJ;
        if (interfaceC524950KiL2 != null) {
            interfaceC524950KiL2.b8(this.LLLIZZ);
        }
        this.LLJJI.cancel();
        InterfaceC1455860nzM interfaceC1455860nzMLLLIILIL2 = LLLIILIL();
        View view7 = this.LLJL;
        if (view7 != null) {
            view = view7;
        }
        int iLIZ = C960203pA.LIZ(R.attr.e1, view.getContext());
        int iLIZJ3 = ((int) C12ES.LIZJ(52.0f, this.mActivity)) + ScreenUtils.getStatusBarHeight(this.mActivity);
        int iLIZJ4 = (int) C12ES.LIZJ(282.0f, this.mActivity);
        int iLLLILZLLLI2 = LLLILZLLLI();
        c0.LIZ.n2();
        interfaceC1455860nzMLLLIILIL2.aM0(C1453170nv1.LIZ(iLIZ, iLIZJ3, iLIZJ4, iLLLILZLLLI2));
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public final void handleMsg(Message message) {
        int i = message.what;
        C1749280vcc c1749280vcc = null;
        MutableLiveData<C1452730nuJ> mutableLiveData = null;
        View view = null;
        if (i != 1) {
            if (i != 2) {
                if (i == 4) {
                    this.LLLILZ = true;
                    C1749280vcc c1749280vcc2 = this.LLJJL;
                    if (c1749280vcc2 == null) {
                        c1749280vcc2 = null;
                    }
                    C786410Ut5.LLLZLZ(c1749280vcc2, 8);
                    View view2 = this.LLJJLIIIJLLLLLLLZ;
                    if (view2 == null) {
                        view2 = null;
                    }
                    C786410Ut5.LJLLLLLL(8, view2);
                    LLLIIIIL().Fd0(false);
                    InterfaceC1452170ntP interfaceC1452170ntP = this.LLJIJIL;
                    if (interfaceC1452170ntP != null) {
                        interfaceC1452170ntP.setLoopPlay(true);
                    }
                    MutableLiveData<C1452730nuJ> mutableLiveData2 = this.LLJJJJJIL;
                    if (mutableLiveData2 != null) {
                        mutableLiveData = mutableLiveData2;
                    }
                    mutableLiveData.setValue(C1452730nuJ.LIZ());
                    return;
                }
                return;
            }
            this.LLLILZ = true;
            C1749280vcc c1749280vcc3 = this.LLJJL;
            if (c1749280vcc3 == null) {
                c1749280vcc3 = null;
            }
            C786410Ut5.LLLZLZ(c1749280vcc3, 8);
            View view3 = this.LLJJLIIIJLLLLLLLZ;
            if (view3 != null) {
                view = view3;
            }
            C786410Ut5.LJLLLLLL(8, view);
            return;
        }
        this.LLLILZ = false;
        View view4 = this.LLJJLIIIJLLLLLLLZ;
        if (view4 == null) {
            view4 = null;
        }
        C786410Ut5.LJLLLLLL(0, view4);
        C1749280vcc c1749280vcc4 = this.LLJJL;
        if (c1749280vcc4 == null) {
            c1749280vcc4 = null;
        }
        C786410Ut5.LLLZLZ(c1749280vcc4, 0);
        C1749280vcc c1749280vcc5 = this.LLJJL;
        if (c1749280vcc5 != null) {
            c1749280vcc = c1749280vcc5;
        }
        c1749280vcc.LJ();
    }

    @Override // com.bytedance.scene.Scene
    public final void onActivityCreated(Bundle bundle) {
        VEEditor.GET_FRAMES_FLAGS get_frames_flags;
        super.onActivityCreated(bundle);
        this.LLJJJJJIL = LLLIILIL().vW1();
        InterfaceC1452170ntP value = LLLIILIL().g().getValue();
        this.LLJIJIL = value;
        if (value != null) {
            this.LLJILJIL = value.getDuration();
        }
        this.LLJL = findViewById(R.id.tv_save);
        this.LLJLIL = findViewById(R.id.zbv);
        this.LLJLILLLLZIIL = findViewById(R.id.lr1);
        this.LLJLL = (FrameLayout) findViewById(R.id.ujl);
        this.LLJLLL = findViewById(R.id.videolayout);
        this.LLJZIJLIL = (ViewGroup) findViewById(R.id.evm);
        this.LLL = (C12UE) findViewById(R.id.vyr);
        this.LLLFFI = findViewById(R.id.bnq);
        C19471411Fw c19471411Fw = (C19471411Fw) findViewById(R.id.zy3);
        this.LLLFZ = c19471411Fw;
        c19471411Fw.LJJJJ();
        CheckBox checkBox = (CheckBox) findViewById(R.id.dj6);
        this.LLLII = checkBox;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("  ");
        sbLIZ.append(getString(2131829835));
        checkBox.setText(C2188811AlT.LIZIZ(sbLIZ));
        this.LLJJL = (C1749280vcc) findViewById(R.id.nne);
        View viewFindViewById = findViewById(R.id.nnf);
        this.LLJJLIIIJLLLLLLLZ = viewFindViewById;
        C786410Ut5.I7(new View.OnClickListener() { // from class: X.12UI
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
            }
        }, viewFindViewById);
        C1295960jpS c1295960jpS = (C1295960jpS) findViewById(R.id.nru);
        this.LLLI = c1295960jpS;
        c1295960jpS.setAnimation("creation_recording_dark_tux_lottie.json");
        C1295960jpS c1295960jpS2 = this.LLLI;
        C0H6D c0h6d = null;
        if (c1295960jpS2 == null) {
            c1295960jpS2 = null;
        }
        c1295960jpS2.setRepeatCount(-1);
        C1464900oDw.LIZ.getClass();
        C786410Ut5.LJLLLLLL(8, findViewById(R.id.gcs));
        View view = this.LLLFFI;
        if (view == null) {
            view = null;
        }
        view.setBackgroundResource(R.drawable.a73);
        C12UA c12ua = new C12UA((C19EG) this.mActivity, this);
        this.LLJZ = c12ua;
        int iLIZJ = (int) C12ES.LIZJ(16.0f, this.mActivity);
        int iLIZJ2 = (int) C12ES.LIZJ(6.0f, this.mActivity);
        int iLIZJ3 = (int) C12ES.LIZJ(4.0f, this.mActivity);
        int i = this.LLJILJIL;
        C12UC c12uc = this.LLLILZLLLI;
        c12ua.LLILLL = iLIZJ;
        c12ua.LLILZ = iLIZJ3 * 5;
        c12ua.LLJ = i;
        c12ua.LLJI = c12uc;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.bottomMargin = iLIZJ2;
        layoutParams.topMargin = iLIZJ2;
        layoutParams.rightMargin = iLIZJ;
        layoutParams.leftMargin = iLIZJ;
        C12UB c12ub = c12ua.LLILLJJLI;
        int color = ColorProtector.parseColor("#ccfe2c55");
        c12ub.getClass();
        c12ub.LLILLJJLI.setColor(color);
        c12ub.LLILLJJLI.setStyle(Paint.Style.FILL);
        c12ub.LLILLL = i;
        c12ub.LLILZ = C12ES.LIZJ(0.0f, c12ub.getContext());
        c12ua.addView(c12ua.LLILLJJLI, layoutParams);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(c12ua.LLILZ, -1);
        if (C1388580mEq.LIZIZ(c12ua.getContext())) {
            layoutParams2.addRule(21);
            layoutParams2.setMarginEnd(iLIZJ - (c12ua.LLILZ / 2));
        } else {
            layoutParams2.leftMargin = iLIZJ - (c12ua.LLILZ / 2);
        }
        c12ua.LL.setImageDrawable(C426580Go4.LIZJ(0, -1, 1, (int) C12ES.LIZJ(2.0f, c12ua.getContext())));
        int i2 = (int) (c12ua.LLILZ * 0.4f);
        c12ua.LL.setPadding(i2, 0, i2, 0);
        c12ua.addView(c12ua.LL, layoutParams2);
        c12ua.LL.setOnTouchListener(new ATListenerS461S0100000_29(c12ua, 27));
        FrameLayout frameLayout = this.LLJLL;
        if (frameLayout == null) {
            frameLayout = null;
        }
        C12UA c12ua2 = this.LLJZ;
        if (c12ua2 == null) {
            c12ua2 = null;
        }
        frameLayout.addView(c12ua2, new FrameLayout.LayoutParams(-1, -1));
        this.LLJLLIL = (C0H6D) findViewById(R.id.dt4);
        this.LLJJ = C0MWZ.LIZ(this);
        this.LLLIIL = LLLIILIL().Ps();
        this.LLLIIIL = LLLIILIL().lk();
        this.LLJJI.setDuration(1000L);
        this.LLJJI.setRepeatCount(-1);
        this.LLJJI.addUpdateListener(new AUListenerS277S0100000_29(this, 72));
        View view2 = this.LLJL;
        if (view2 == null) {
            view2 = null;
        }
        C786410Ut5.I7(this.LLLJ, view2);
        View view3 = this.LLJLIL;
        if (view3 == null) {
            view3 = null;
        }
        C786410Ut5.I7(this.LLLJ, view3);
        View view4 = this.LLJLILLLLZIIL;
        if (view4 == null) {
            view4 = null;
        }
        C786410Ut5.I7(this.LLLJ, view4);
        View view5 = this.LLJLLL;
        if (view5 == null) {
            view5 = null;
        }
        C786410Ut5.I7(this.LLLJ, view5);
        View view6 = this.LLLFFI;
        if (view6 == null) {
            view6 = null;
        }
        C786410Ut5.I7(this.LLLJ, view6);
        C12UE c12ue = this.LLL;
        if (c12ue == null) {
            c12ue = null;
        }
        View.OnClickListener akS95S0100000_29 = new AkS95S0100000_29(this, 102);
        if (C1848410yCV.LIZ) {
            akS95S0100000_29 = new f(akS95S0100000_29);
        }
        a aVar = new a(akS95S0100000_29);
        if (C2213981Bky.LIZIZ.isOffline()) {
            C2211941Bhg.LIZ.injectViewListener(c12ue);
        }
        c12ue.setOnClickListener(aVar);
        C12UE c12ue2 = this.LLL;
        if (c12ue2 == null) {
            c12ue2 = null;
        }
        c12ue2.setOnLongClickListener(new C12YH(this, 5));
        C12UE c12ue3 = this.LLL;
        if (c12ue3 == null) {
            c12ue3 = null;
        }
        c12ue3.setOnTouchListener(new ATListenerS461S0100000_29(this, 28));
        LLLILZ().observe(this, new AObserverS231S0100000_29(this, 257));
        ((LiveData) this.LLJILLL.getValue()).observe(this, new AObserverS231S0100000_29(this, 258));
        CheckBox checkBox2 = this.LLLII;
        if (checkBox2 == null) {
            checkBox2 = null;
        }
        C786410Ut5.v7(checkBox2, new C12YG(this, 6));
        InterfaceC1452170ntP interfaceC1452170ntP = this.LLJIJIL;
        if (interfaceC1452170ntP != null) {
            C0H6D c0h6d2 = this.LLJLLIL;
            if (c0h6d2 == null) {
                c0h6d2 = null;
            }
            c0h6d2.LIZLLL();
            C0H6D c0h6d3 = this.LLJLLIL;
            if (c0h6d3 == null) {
                c0h6d3 = null;
            }
            c0h6d3.setLayoutManager(new WrapLinearLayoutManager(this.mActivity, 0));
            C0H6D c0h6d4 = this.LLJLLIL;
            if (c0h6d4 == null) {
                c0h6d4 = null;
            }
            int frameHeight = c0h6d4.getFrameHeight();
            C0H6D c0h6d5 = this.LLJLLIL;
            if (c0h6d5 == null) {
                c0h6d5 = null;
            }
            int frameWidth = c0h6d5.getFrameWidth();
            int iCeil = (int) Math.ceil((C12ES.LJIIJ(this.mActivity) - (C814420VxA.LIZIZ(C12ES.LIZJ(16.0f, this.mActivity)) * 2)) / (frameWidth * 1.0f));
            C0H6D c0h6d6 = this.LLJLLIL;
            if (c0h6d6 == null) {
                c0h6d6 = null;
            }
            c0h6d6.setCoverSize(iCeil);
            if (C1446620nkS.LIZ()) {
                get_frames_flags = VEEditor.GET_FRAMES_FLAGS.GET_FRAMES_MODE_NORMAL;
            } else {
                get_frames_flags = VEEditor.GET_FRAMES_FLAGS.GET_FRAMES_MODE_NOEFFECT;
            }
            AbstractC214814194y abstractC214814194yLIZIZ = C372650EjH.LIZIZ(this);
            C0H6D c0h6d7 = this.LLJLLIL;
            if (c0h6d7 == null) {
                c0h6d7 = null;
            }
            this.LLLIIII = new VEVideoCoverGeneratorImpl(interfaceC1452170ntP, abstractC214814194yLIZIZ, c0h6d7.getCoverSize(), get_frames_flags, "ai_music");
            VEVideoCoverGeneratorImpl vEVideoCoverGeneratorImpl = this.LLLIIII;
            if (vEVideoCoverGeneratorImpl == null) {
                vEVideoCoverGeneratorImpl = null;
            }
            this.LLLIIIIL = new C19560811fy(vEVideoCoverGeneratorImpl, frameWidth, frameHeight, iCeil);
            if (LLLIL().isMvThemeVideoType()) {
                final C810503Ep c810503Ep = new C810503Ep(frameWidth, frameHeight);
                C0H6D c0h6d8 = this.LLJLLIL;
                if (c0h6d8 == null) {
                    c0h6d8 = null;
                }
                c0h6d8.setAdapter(c810503Ep);
                MvChooseCoverBitmapCreator mvChooseCoverBitmapCreator = new MvChooseCoverBitmapCreator();
                mvChooseCoverBitmapCreator.setMvThemeVideoCoverErrorListener(new InterfaceC1457180o1U() { // from class: X.12UJ
                    @Override // X.InterfaceC1457180o1U
                    public final void onError(int i3, String str) {
                        C201955140j.LJ(str);
                    }
                });
                MutableLiveData<Boolean> mutableLiveData = this.LLLIIL;
                if (mutableLiveData == null) {
                    mutableLiveData = null;
                }
                mvChooseCoverBitmapCreator.setFirstFrameVisibleLiveData(mutableLiveData);
                MutableLiveData<Bitmap> mutableLiveData2 = this.LLLIIIL;
                if (mutableLiveData2 == null) {
                    mutableLiveData2 = null;
                }
                mvChooseCoverBitmapCreator.setFirstFrameBitmapLiveData(mutableLiveData2);
                mvChooseCoverBitmapCreator.setNeedCompileFrame(true);
                mvChooseCoverBitmapCreator.setImgSize(frameWidth, frameHeight);
                Activity activity = this.mActivity;
                InterfaceC20597015ii interfaceC20597015iiLJ = C20622515mp.LJ(this);
                if (interfaceC20597015iiLJ != null) {
                    interfaceC20597015iiLJ.Ss("getIntent", new C12U7(mvChooseCoverBitmapCreator, activity, this, iCeil, c810503Ep));
                } else {
                    mvChooseCoverBitmapCreator.getBitmapList(activity, this.LLJIJIL, iCeil, new InterfaceC741260T5w() { // from class: X.12U8
                        @Override // X.InterfaceC741260T5w
                        public final void LIZ(List<Bitmap> list) {
                            c810503Ep.LLLFZ(list);
                        }
                    });
                }
                C0H6D c0h6d9 = this.LLJLLIL;
                if (c0h6d9 != null) {
                    c0h6d = c0h6d9;
                }
                c0h6d.setAdapter(c810503Ep);
                return;
            }
            C19560811fy c19560811fy = this.LLLIIIIL;
            if (c19560811fy == null) {
                c19560811fy = null;
            }
            C0FPB c0fpb = new C0FPB(c19560811fy, frameWidth, frameHeight);
            C0H6D c0h6d10 = this.LLJLLIL;
            if (c0h6d10 != null) {
                c0h6d = c0h6d10;
            }
            c0h6d.setAdapter(c0fpb);
        }
    }

    public final void LLLLIIIILLL(Cert cert, boolean z) {
        float voiceVolume;
        float musicVolume;
        InterfaceC1452170ntP interfaceC1452170ntP = this.LLJIJIL;
        if (interfaceC1452170ntP == null) {
            return;
        }
        View view = this.LLJLILLLLZIIL;
        MutableLiveData<C1452730nuJ> mutableLiveData = null;
        if (view == null) {
            view = null;
        }
        C786410Ut5.LJLLLLLL(4, view);
        int i = 0;
        if (z) {
            this.LLLIL.setNeedDel(true);
            C1453010nul.LIZ(LLLIILIL(), this.LLLIL);
            C19471411Fw c19471411Fw = this.LLLFZ;
            if (c19471411Fw == null) {
                c19471411Fw = null;
            }
            C786410Ut5.g1(c19471411Fw, 4);
            View view2 = this.LLLFFI;
            if (view2 == null) {
                view2 = null;
            }
            C786410Ut5.LJLLLLLL(4, view2);
            C1295960jpS c1295960jpS = this.LLLI;
            if (c1295960jpS == null) {
                c1295960jpS = null;
            }
            c1295960jpS.playAnimation();
            C1295960jpS c1295960jpS2 = this.LLLI;
            if (c1295960jpS2 == null) {
                c1295960jpS2 = null;
            }
            C786410Ut5.LLD(0, c1295960jpS2);
            musicVolume = 0.0f;
            voiceVolume = 0.0f;
        } else {
            this.LLJJIJI = true;
            AudioRecorderParam audioRecorderParam = this.LLLIL;
            C12UA c12ua = this.LLJZ;
            if (c12ua == null) {
                c12ua = null;
            }
            audioRecorderParam.setMStack(c12ua.getStack());
            if ((!this.LLLIL.getMStack().isEmpty()) && this.LLLIILIL != null && this.LLLIL.getAudioRecordIndex() < 0) {
                C1453010nul.LIZ(LLLIILIL(), this.LLLIL);
            }
            voiceVolume = LLLIL().getVoiceVolume();
            musicVolume = LLLIL().getMusicVolume();
        }
        LLLIIIIL().jR2(musicVolume, voiceVolume);
        if (z) {
            if (this.LLJJIJIL != null) {
                MutableLiveData<C1452730nuJ> mutableLiveData2 = this.LLJJJJJIL;
                if (mutableLiveData2 == null) {
                    mutableLiveData2 = null;
                }
                mutableLiveData2.setValue(C1452730nuJ.LIZLLL(r0.getY()));
                C12UA c12ua2 = this.LLJZ;
                if (c12ua2 == null) {
                    c12ua2 = null;
                }
                int y = this.LLJJIJIL.getY();
                this.LLJJIJIL = c12ua2.LLILLJJLI.getMStack().push(new Point(y, y, System.currentTimeMillis()));
            } else {
                int iLLL = interfaceC1452170ntP.LLL();
                if (iLLL >= 50) {
                    i = iLLL;
                }
                C12UA c12ua3 = this.LLJZ;
                if (c12ua3 == null) {
                    c12ua3 = null;
                }
                this.LLJJIJIL = c12ua3.LLILLJJLI.getMStack().push(new Point(i, i, System.currentTimeMillis()));
            }
            this.LLJJIII = true;
            C12UK c12uk = this.LLLIILIL;
            if (c12uk != null) {
                int iLLL2 = interfaceC1452170ntP.LLL() + 50;
                int i2 = this.LLJILJIL;
                ((IToolsCameraAudioSecurityCheckService) ServiceManager.get().getService(IToolsCameraAudioSecurityCheckService.class)).LIZIZ();
                c12uk.LIZ.startRecord(1.0f, iLLL2, i2, cert);
            }
        }
        MutableLiveData<C1452730nuJ> mutableLiveData3 = this.LLJJJJJIL;
        if (mutableLiveData3 != null) {
            mutableLiveData = mutableLiveData3;
        }
        mutableLiveData.setValue(C1452730nuJ.LIZ());
        this.LLJJI.start();
    }

    @Override // X.C11E9
    public final <VM1 extends JediViewModel<S1>, S1 extends C004I, R> R withState(VM1 vm1, Function1<? super S1, ? extends R> function1) {
        return function1.invoke(vm1.FQ2());
    }

    public final void LLLIZZ(int i, Cert cert, boolean z) {
        MutableLiveData<C1452730nuJ> mutableLiveData = this.LLJJJJJIL;
        C1295960jpS c1295960jpS = null;
        if (mutableLiveData == null) {
            mutableLiveData = null;
        }
        mutableLiveData.setValue(C1452730nuJ.LIZJ());
        InterfaceC1452170ntP interfaceC1452170ntP = this.LLJIJIL;
        if (interfaceC1452170ntP != null) {
            interfaceC1452170ntP.refreshCurrentFrame();
            LLLILZ().setValue(Long.valueOf(interfaceC1452170ntP.LLL()));
        }
        this.LLJJI.cancel();
        View view = this.LLJLILLLLZIIL;
        if (view == null) {
            view = null;
        }
        C786410Ut5.LJLLLLLL(0, view);
        if (this.LLLF) {
            this.LLLF = false;
            C12UE c12ue = this.LLL;
            if (c12ue == null) {
                c12ue = null;
            }
            c12ue.LLILLL.end();
            c12ue.LLILZ.start();
        }
        if (this.LLLFF) {
            this.LLLFF = false;
            C12UE c12ue2 = this.LLL;
            if (c12ue2 == null) {
                c12ue2 = null;
            }
            C12UF c12uf = c12ue2.LLILLJJLI;
            if (c12uf == null) {
                c12uf = null;
            }
            c12uf.LLILZ.end();
            c12uf.LLILLL.start();
        }
        if (this.LLJJIII) {
            C12UK c12uk = this.LLLIILIL;
            if (c12uk != null) {
                if (z) {
                    Point point = this.LLJJIJIL;
                    if (point != null) {
                        point.setY(this.LLJILJIL);
                    }
                    ((IToolsCameraAudioSecurityCheckService) ServiceManager.get().getService(IToolsCameraAudioSecurityCheckService.class)).LIZJ();
                    c12uk.LIZ.stopRecord(cert);
                } else {
                    ((IToolsCameraAudioSecurityCheckService) ServiceManager.get().getService(IToolsCameraAudioSecurityCheckService.class)).LIZJ();
                    int iStopRecord = (int) c12uk.LIZ.stopRecord(cert);
                    if (i == -1) {
                        i = iStopRecord;
                    }
                    Point point2 = this.LLJJIJIL;
                    if (point2 != null) {
                        point2.setY(i);
                    }
                    MutableLiveData<C1452730nuJ> mutableLiveData2 = this.LLJJJJJIL;
                    if (mutableLiveData2 == null) {
                        mutableLiveData2 = null;
                    }
                    mutableLiveData2.setValue(C1452730nuJ.LIZLLL(i));
                    C12UA c12ua = this.LLJZ;
                    if (c12ua == null) {
                        c12ua = null;
                    }
                    c12ua.getClass();
                    HandlerHook.viewPost(c12ua, new ARunnableS9S0100001_29(c12ua, i / this.LLJILJIL, 1));
                }
                C12UA c12ua2 = this.LLJZ;
                if (c12ua2 == null) {
                    c12ua2 = null;
                }
                c12ua2.LIZLLL();
            }
            this.LLJJIII = false;
            if (this.LLJJIJIL != null) {
                LLLILZ().setValue(Long.valueOf(r0.getY()));
            }
        }
        this.LLJJIJI = false;
        AudioRecorderParam audioRecorderParam = this.LLLIL;
        C12UA c12ua3 = this.LLJZ;
        if (c12ua3 == null) {
            c12ua3 = null;
        }
        audioRecorderParam.setMStack(c12ua3.getStack());
        if (this.LLLIL.getMStack().isEmpty()) {
            View view2 = this.LLLFFI;
            if (view2 == null) {
                view2 = null;
            }
            C786410Ut5.LJLLLLLL(8, view2);
        } else {
            View view3 = this.LLLFFI;
            if (view3 == null) {
                view3 = null;
            }
            C786410Ut5.LJLLLLLL(0, view3);
        }
        C19471411Fw c19471411Fw = this.LLLFZ;
        if (c19471411Fw == null) {
            c19471411Fw = null;
        }
        C786410Ut5.g1(c19471411Fw, 0);
        C1295960jpS c1295960jpS2 = this.LLLI;
        if (c1295960jpS2 == null) {
            c1295960jpS2 = null;
        }
        C786410Ut5.LLD(4, c1295960jpS2);
        C1295960jpS c1295960jpS3 = this.LLLI;
        if (c1295960jpS3 != null) {
            c1295960jpS = c1295960jpS3;
        }
        c1295960jpS.cancelAnimation();
    }

    @Override // com.bytedance.scene.Scene
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.epv, viewGroup, false);
        this.LLJJJJLIIL = viewTd;
        if (viewTd == null) {
            return null;
        }
        return viewTd;
    }

    @Override // X.C11E9
    public final <S extends C004I> InterfaceC420801kM subscribe(JediViewModel<S> jediViewModel, C1765020w20<S> c1765020w20, Function2<? super InterfaceC960503pD, ? super S, Unit> function2) {
        return C11EA.LJIIJJI(this, jediViewModel, c1765020w20, function2);
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
