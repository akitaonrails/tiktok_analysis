package X;

import Y.ACListenerS165S0100000_31;
import Y.ARunnableS131S0100000_31;
import android.os.Bundle;
import android.os.Looper;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import com.ss.android.ugc.aweme.creative.model.music.MusicBuzModel;
import com.ss.android.ugc.aweme.creative.model.music.MusicObject;
import com.ss.android.ugc.aweme.ftc.components.cutmusic.FTCEditMusicCutState;
import com.ss.android.ugc.aweme.ftc.components.cutmusic.FTCEditMusicCutViewModel;
import com.ss.android.ugc.aweme.ftc.components.sticker.core.FTCEditStickerViewModel;
import com.ss.android.ugc.aweme.internal.AVCommerceServiceImpl;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.music.model.MusicBeanUtilKt;
import com.ss.android.ugc.aweme.mvtheme.MvCreateVideoData;
import com.ss.android.ugc.aweme.port.in.IAnotherMusicService;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.aweme.services.video.VEVolumeChangeOp;
import com.ss.android.ugc.aweme.shortvideo.AVMusicWaveBean;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.zhiliaoapp.musically.R;
import java.io.Serializable;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS680S0100000_31;

/* JADX INFO: renamed from: X.15R2, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C15R2 extends Scene implements InterfaceC1166920gTK, View.OnTouchListener, InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLII;
    public final C1DRG LLJI;
    public ImageView LLJIJIL;
    public C0GWO LLJILJIL;
    public TextView LLJILJILJ;
    public TextView LLJILLL;
    public C15R7 LLJJ;
    public TextView LLJJI;
    public RelativeLayout LLJJIII;
    public FrameLayout LLJJIJI;
    public View LLJJIJIIJIL;
    public InterfaceC1455160nyE LLJJIJIL;
    public VideoPublishEditModel LLJJJ;
    public int LLJJJIL;
    public int LLJJJJ;
    public int LLJJJJJIL;
    public boolean LLJJJJLIIL;
    public boolean LLJJL;
    public int LLJJLIIIJLLLLLLLZ;
    public float LLJL;
    public float LLJLIL;
    public int LLJLILLLLZIIL;
    public InterfaceC524950KiL LLJLLIL;
    public C15RI LLJLLL;
    public C20511915Ob LLJZ;
    public FTCEditStickerViewModel LLJZIJLIL;
    public FTCEditMusicCutViewModel LLL;
    public final C1664750tQH LLLF;
    public boolean LLLI;
    public final BPEAHandler LLJLL = new BPEAHandler(Looper.getMainLooper());
    public final C20512015Oc LLLFF = new InterfaceC1464180oCm() { // from class: X.15Oc
        @Override // X.InterfaceC1464180oCm
        public final void onSeekDone(int i) {
            InterfaceC1452170ntP value;
            if (i == 0 && (value = this.LIZ.LLLII().g().getValue()) != null) {
                value.play();
            }
        }
    };
    public final C15R1 LLLFFI = new InterfaceC362610EJn() { // from class: X.15R1
        @Override // X.InterfaceC362610EJn
        public final boolean onKeyDown(int i, KeyEvent keyEvent) {
            if (i == 4) {
                C15R2 c15r2 = this.LL;
                int i2 = c15r2.LLJJJJJIL;
                c15r2.LLJJJJ = i2;
                C15R7 c15r7 = c15r2.LLJJ;
                C15R7 c15r72 = null;
                if (c15r7 == null) {
                    c15r7 = null;
                }
                c15r7.LIZIZ((i2 * 1.0f) / c15r2.LLJJLIIIJLLLLLLLZ);
                C15R7 c15r73 = c15r2.LLJJ;
                if (c15r73 != null) {
                    c15r72 = c15r73;
                }
                c15r72.setTimeBubble(c15r2.LLJJJJ);
                c15r2.LLJJJJLIIL = c15r2.LLJJL;
                c15r2.LLLILZLLLI();
                return true;
            }
            return false;
        }
    };
    public final ARunnableS131S0100000_31 LLLFZ = new ARunnableS131S0100000_31(this, 214);

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C15R2.class, "editPreviewApi", "getEditPreviewApi()Lcom/ss/android/ugc/aweme/shortvideo/preview/EditPreviewApi;", 0);
        C13LE.LIZ.getClass();
        LLLII = new InterfaceC2217461Bqa[]{c2217381BqS};
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

    public final InterfaceC1455860nzM LLLII() {
        return (InterfaceC1455860nzM) this.LLLF.getValue(this, LLLII[0]);
    }

    public final int LLLIIIIL() {
        if (this.LLJJJIL >= this.LLJJLIIIJLLLLLLLZ) {
            return (int) (((1.0f * (this.LLJILJIL != null ? r0 : null).getWidth()) * 15000) / this.LLJJLIIIJLLLLLLLZ);
        }
        C0GWO c0gwo = this.LLJILJIL;
        return (int) (((1.0d * ((double) (c0gwo != null ? c0gwo : null).getWidth())) * ((double) this.LLJJJIL)) / ((double) this.LLJJLIIIJLLLLLLLZ));
    }

    public final int LLLIILIL() {
        if (this.LLJJJIL >= this.LLJJLIIIJLLLLLLLZ) {
            C0GWO c0gwo = this.LLJILJIL;
            return (c0gwo != null ? c0gwo : null).getWidth();
        }
        C0GWO c0gwo2 = this.LLJILJIL;
        return (int) (((1.0d * ((double) (c0gwo2 != null ? c0gwo2 : null).getWidth())) * ((double) this.LLJJJIL)) / ((double) this.LLJJLIIIJLLLLLLLZ));
    }

    public final VideoPublishEditModel LLLIL() {
        VideoPublishEditModel videoPublishEditModel = this.LLJJJ;
        if (videoPublishEditModel != null) {
            return videoPublishEditModel;
        }
        return null;
    }

    public final void LLLILZLLLI() {
        MvCreateVideoData mvCreateVideoData;
        C15RI c15ri = this.LLJLLL;
        if (c15ri != null) {
            VideoPublishEditModel videoPublishEditModelLLLIL = c15ri.LIZ.LLLIL();
            videoPublishEditModelLLLIL.setMMusicStart(c15ri.LIZ.LLJJJJ);
            videoPublishEditModelLLLIL.setIsSoundLoop(Boolean.valueOf(c15ri.LIZ.LLJJJJLIIL));
            int iLIZIZ = C141Q.LIZIZ(-1, videoPublishEditModelLLLIL.getMMusicPath());
            AVMusic aVMusicExtractAVMusic = MusicBeanUtilKt.extractAVMusic(videoPublishEditModelLLLIL.creativeModel.musicBuzModel);
            boolean z = false;
            if (aVMusicExtractAVMusic == null || aVMusicExtractAVMusic.getShootDuration() <= 0) {
                InterfaceC1452170ntP value = c15ri.LIZ.LLLII().g().getValue();
                iLIZIZ = Math.min(15000, value != null ? value.getDuration() : 0);
            } else if (Math.abs(iLIZIZ - aVMusicExtractAVMusic.getShootDuration()) >= 1000) {
                iLIZIZ = aVMusicExtractAVMusic.getShootDuration();
            }
            InterfaceC1452170ntP value2 = c15ri.LIZ.LLLII().g().getValue();
            int iMin = Math.min(iLIZIZ, value2 != null ? value2.getDuration() : 0);
            videoPublishEditModelLLLIL.setMMusicEnd(c15ri.LIZ.LLJJJJ + iMin);
            if (C0CHQ.LIZ().getAccountService().LIZ() || AVCommerceServiceImpl.LJIIJ().LJ()) {
                z = false;
                C1456140nzo.LIZIZ(c15ri.LIZ.LLLII(), true, false, false, false, 12);
            } else {
                C1456140nzo.LIZIZ(c15ri.LIZ.LLLII(), false, false, false, false, 12);
            }
            c15ri.LIZ.LLLIZZ(z);
            FTCEditStickerViewModel fTCEditStickerViewModel = c15ri.LIZ.LLJZIJLIL;
            if (fTCEditStickerViewModel == null) {
                fTCEditStickerViewModel = null;
            }
            MutableLiveData<Boolean> mutableLiveDataFz0 = fTCEditStickerViewModel.fz0();
            Boolean bool = Boolean.TRUE;
            mutableLiveDataFz0.setValue(bool);
            c15ri.LIZ.LLLII().FJ(z);
            c15ri.LIZ.LLLII().SX(new C1450120nq6(videoPublishEditModelLLLIL.getMMusicStart(), iMin, videoPublishEditModelLLLIL.getIsSoundLoop().booleanValue()));
            if (videoPublishEditModelLLLIL.hasOriginalSound()) {
                c15ri.LIZ.LLLII().EY0(VEVolumeChangeOp.ofVoice(videoPublishEditModelLLLIL.getVoiceVolume()));
            }
            C15R2 c15r2 = c15ri.LIZ;
            if (c15r2.LLLILZ() <= c15r2.LLLIL().getMCurMusicLength()) {
                FTCEditStickerViewModel fTCEditStickerViewModel2 = c15r2.LLJZIJLIL;
                if (fTCEditStickerViewModel2 == null) {
                    fTCEditStickerViewModel2 = null;
                }
                fTCEditStickerViewModel2.fz0().setValue(bool);
            }
            if (videoPublishEditModelLLLIL.isMvThemeVideoType() && (mvCreateVideoData = videoPublishEditModelLLLIL.getMvCreateVideoData()) != null && mvCreateVideoData.mvType == 1) {
                InterfaceC1455160nyE interfaceC1455160nyE = c15ri.LIZ.LLJJIJIL;
                if (interfaceC1455160nyE == null) {
                    interfaceC1455160nyE = null;
                }
                interfaceC1455160nyE.Q4(videoPublishEditModelLLLIL.getMMusicPath(), videoPublishEditModelLLLIL.getMMusicStart(), videoPublishEditModelLLLIL.getMMusicEnd(), -1, z);
            }
        }
        InterfaceC524950KiL interfaceC524950KiL = this.LLJLLIL;
        if (interfaceC524950KiL != null) {
            interfaceC524950KiL.b8(this.LLLFFI);
        }
    }

    public final int LLLILZ() {
        InterfaceC1452170ntP value = LLLII().g().getValue();
        if (value != null) {
            return value.getDuration();
        }
        return 0;
    }

    @Override // X.InterfaceC379610EuV
    public final C1DRG getDiContainer() {
        return this.LLJI;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [X.15Oc] */
    /* JADX WARN: Type inference failed for: r0v4, types: [X.15R1] */
    public C15R2(C1DRG c1drg) {
        this.LLJI = c1drg;
        this.LLLF = C1664770tQJ.LIZ(c1drg, InterfaceC1455860nzM.class, null);
    }

    public final void LLLIZZ(boolean z) {
        View view = null;
        if (z) {
            View view2 = this.LLJJIJIIJIL;
            if (view2 == null) {
                view2 = null;
            }
            if (view2.getVisibility() == 0) {
                return;
            }
            View view3 = this.LLJJIJIIJIL;
            if (view3 == null) {
                view3 = null;
            }
            C786410Ut5.LJLLLLLL(0, view3);
            View view4 = this.LLJJIJIIJIL;
            if (view4 == null) {
                view4 = null;
            }
            C786410Ut5.T4(view4, 0.0f);
            View view5 = this.LLJJIJIIJIL;
            if (view5 != null) {
                view = view5;
            }
            view.animate().alpha(1.0f).setDuration(200L).start();
            C786410Ut5.LJJZZIII(this.LLJLL, this.LLLFZ);
            return;
        }
        View view6 = this.LLJJIJIIJIL;
        if (view6 == null) {
            view6 = null;
        }
        if (view6.getVisibility() == 4) {
            return;
        }
        View view7 = this.LLJJIJIIJIL;
        if (view7 == null) {
            view7 = null;
        }
        C786410Ut5.LJLLLLLL(4, view7);
        this.LLJLL.removeCallbacksAndMessages(null);
    }

    public final void LLLJ(boolean z) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        C0GWO c0gwo = this.LLJILJIL;
        TextView textView = null;
        if (c0gwo == null) {
            c0gwo = null;
        }
        int i6 = 0;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        int visibility = c0gwo.getVisibility();
        c0gwo.setVisibility(i);
        C1602160rnK.LIZIZ(visibility, i, c0gwo);
        TextView textView2 = this.LLJILJILJ;
        if (textView2 == null) {
            textView2 = null;
        }
        if (z) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        C786410Ut5.LLIL(textView2, i2);
        TextView textView3 = this.LLJILLL;
        if (textView3 == null) {
            textView3 = null;
        }
        if (z) {
            i3 = 0;
        } else {
            i3 = 8;
        }
        C786410Ut5.LLIL(textView3, i3);
        C15R7 c15r7 = this.LLJJ;
        if (c15r7 == null) {
            c15r7 = null;
        }
        if (z) {
            i4 = 8;
        } else {
            i4 = 0;
        }
        int visibility2 = c15r7.getVisibility();
        c15r7.setVisibility(i4);
        C1602160rnK.LIZIZ(visibility2, i4, c15r7);
        ImageView imageView = this.LLJIJIL;
        if (imageView == null) {
            imageView = null;
        }
        if (!z) {
            i6 = 8;
        }
        C786410Ut5.LJZI(i6, imageView);
        C15R7 c15r72 = this.LLJJ;
        if (c15r72 == null) {
            c15r72 = null;
        }
        LLLILZ();
        LLLIL().getMCurMusicLength();
        c15r72.getClass();
        TextView textView4 = this.LLJJI;
        if (textView4 != null) {
            textView = textView4;
        }
        if (LLLILZ() > LLLIL().getMCurMusicLength() + LSPassThroughRecordSizeConfig.DEFAULT) {
            i5 = 2131828364;
        } else {
            i5 = 2131832462;
        }
        textView.setText(getString(i5));
        List<InterfaceC2342209Fs> list = C2341909Fp.LIZ;
        C0LAB c0lab = new C0LAB();
        c0lab.LJ(Scene.SCENE_SERVICE, "EditMusicCutScene");
        c0lab.LIZ(!z ? 1 : 0, FollowStatusChangeMethod.PARAM_FOLLOW_STATUS);
        C2341909Fp.LIZ("tool_performance_show_music_wave", c0lab.LIZ);
    }

    @Override // com.bytedance.scene.Scene
    public final void onActivityCreated(Bundle bundle) {
        int duration;
        C15R7 c15r7;
        boolean z;
        Serializable serializable;
        String mMusicPath;
        super.onActivityCreated(bundle);
        this.LLJLLIL = C0MWZ.LIZ(this);
        this.LLJZIJLIL = (FTCEditStickerViewModel) C1659640tI2.LIZLLL(this).LIZ(FTCEditStickerViewModel.class);
        this.LLL = (FTCEditMusicCutViewModel) C1659640tI2.LIZLLL(this).LIZ(FTCEditMusicCutViewModel.class);
        InterfaceC1452170ntP value = LLLII().g().getValue();
        boolean z2 = false;
        if (value != null) {
            duration = value.getDuration();
        } else {
            duration = 0;
        }
        this.LLJJJIL = duration;
        View view = this.LLJJIJIIJIL;
        FTCEditMusicCutViewModel fTCEditMusicCutViewModel = null;
        if (view == null) {
            view = null;
        }
        this.LLJILJIL = (C0GWO) view.findViewById(R.id.m3v);
        View view2 = this.LLJJIJIIJIL;
        if (view2 == null) {
            view2 = null;
        }
        this.LLJILJILJ = (TextView) view2.findViewById(R.id.tv_start);
        View view3 = this.LLJJIJIIJIL;
        if (view3 == null) {
            view3 = null;
        }
        this.LLJILLL = (TextView) view3.findViewById(R.id.zk4);
        View view4 = this.LLJJIJIIJIL;
        if (view4 == null) {
            view4 = null;
        }
        this.LLJJ = (C15R7) view4.findViewById(R.id.fef);
        View view5 = this.LLJJIJIIJIL;
        if (view5 == null) {
            view5 = null;
        }
        this.LLJJI = (TextView) view5.findViewById(R.id.zh1);
        View view6 = this.LLJJIJIIJIL;
        if (view6 == null) {
            view6 = null;
        }
        this.LLJJIII = (RelativeLayout) view6.findViewById(R.id.vjf);
        View view7 = this.LLJJIJIIJIL;
        if (view7 == null) {
            view7 = null;
        }
        ImageView imageView = (ImageView) view7.findViewById(R.id.le4);
        if (imageView == null) {
            imageView = null;
        }
        C786410Ut5.Q7(imageView, new ACListenerS165S0100000_31(this, 254));
        TextView textView = this.LLJILLL;
        if (textView == null) {
            textView = null;
        }
        textView.setText(C0F3O.LIZ(this.LLJJLIIIJLLLLLLLZ));
        TextView textView2 = this.LLJILJILJ;
        if (textView2 == null) {
            textView2 = null;
        }
        View view8 = this.LLJJIJIIJIL;
        if (view8 == null) {
            view8 = null;
        }
        textView2.setText(view8.getContext().getString(2131850654));
        View view9 = this.LLJJIJIIJIL;
        if (view9 == null) {
            view9 = null;
        }
        ImageView imageView2 = new ImageView(view9.getContext());
        this.LLJIJIL = imageView2;
        imageView2.setImageResource(R.drawable.bwz);
        ImageView imageView3 = this.LLJIJIL;
        if (imageView3 == null) {
            imageView3 = null;
        }
        imageView3.setScaleType(ImageView.ScaleType.FIT_XY);
        View view10 = this.LLJJIJIIJIL;
        if (view10 == null) {
            view10 = null;
        }
        HandlerHook.viewPostDelay(view10, new ARunnableS131S0100000_31(this, 216), 10L);
        C15R7 c15r72 = this.LLJJ;
        if (c15r72 == null) {
            c15r7 = null;
        } else {
            c15r7 = c15r72;
        }
        if (c15r72 == null) {
            c15r72 = null;
        }
        c15r7.setBubbleTextViewAttribute(C15R6.LIZJ(c15r72.getContext()));
        C15R7 c15r73 = this.LLJJ;
        if (c15r73 == null) {
            c15r73 = null;
        }
        c15r73.setScrollListener(new C15RV() { // from class: X.15RB
            @Override // X.C15RV
            public final void LIZ(float f) {
                int i = (int) (f * r2.LLJJLIIIJLLLLLLLZ);
                C15R7 c15r74 = this.LIZ.LLJJ;
                if (c15r74 == null) {
                    c15r74 = null;
                }
                c15r74.setTimeBubble(i);
            }

            @Override // X.C15RV
            public final void LIZIZ(float f) {
                C15R2 c15r2 = this.LIZ;
                c15r2.LLJJJJ = (int) (f * c15r2.LLJJLIIIJLLLLLLLZ);
                C20511915Ob c20511915Ob = c15r2.LLJZ;
                if (c20511915Ob != null) {
                    c20511915Ob.LIZ();
                }
            }
        });
        C15R7 c15r74 = this.LLJJ;
        if (c15r74 == null) {
            c15r74 = null;
        }
        c15r74.LIZIZ((this.LLJJJJ * 1.0f) / this.LLJJLIIIJLLLLLLLZ);
        C15R7 c15r75 = this.LLJJ;
        if (c15r75 == null) {
            c15r75 = null;
        }
        c15r75.setTimeBubble(this.LLJJJJ);
        C15R7 c15r76 = this.LLJJ;
        if (c15r76 == null) {
            c15r76 = null;
        }
        c15r76.setSoundLoopListener(new C15RP() { // from class: X.15RK
        });
        View view11 = this.LLJJIJIIJIL;
        if (view11 == null) {
            view11 = null;
        }
        view11.bringToFront();
        C786410Ut5.LJJZZIII(this.LLJLL, this.LLLFZ);
        LLLIZZ(false);
        C15R5.LJI.LJIIIIZZ(requireActivity());
        C15R5.LJI.LJ = this.LLJJJIL;
        final AVMusic aVMusicExtractAVMusic = MusicBeanUtilKt.extractAVMusic(LLLIL().creativeModel.musicBuzModel);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("OLD_DRAFT avMusicIsNull:");
        if (aVMusicExtractAVMusic == null) {
            z = true;
        } else {
            z = false;
        }
        sbLIZ.append(z);
        C201955140j.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        if (aVMusicExtractAVMusic != null) {
            IAnotherMusicService musicService = C1403010mc7.LIZ.getMusicService();
            Bundle argumentsSafely = C372650EjH.LIZIZ(this).getArgumentsSafely();
            if (argumentsSafely != null) {
                serializable = argumentsSafely.getSerializable("music_wave_data");
            } else {
                serializable = null;
            }
            AVMusicWaveBean aVMusicWaveBeanZk = musicService.Zk(serializable);
            if (aVMusicExtractAVMusic.getDuration() <= 0) {
                aVMusicExtractAVMusic.setDuration(C1403010mc7.LIZ.getMusicService().getMusicDuration(aVMusicExtractAVMusic.path));
                MusicBuzModel musicBuzModel = LLLIL().creativeModel.musicBuzModel;
                MusicObject musicObject = musicBuzModel.music;
                if (musicObject != null) {
                    musicBuzModel.music = MusicObject.LIZ(musicObject, aVMusicExtractAVMusic.getDuration());
                }
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("OLD_DRAFT musicWaveBeanIsNull:");
            if (aVMusicWaveBeanZk == null) {
                z2 = true;
            }
            sbLIZ2.append(z2);
            C201955140j.LIZ(C2188811AlT.LIZIZ(sbLIZ2));
            if (aVMusicWaveBeanZk != null) {
                LLLJL(aVMusicWaveBeanZk, aVMusicExtractAVMusic.getDuration(), LLLIL().getMMusicStart());
            } else {
                String str = aVMusicExtractAVMusic.path;
                if (str != null) {
                    if (C2486109oh.LIZLLL(getApplicationContext(), str)) {
                        mMusicPath = aVMusicExtractAVMusic.path;
                    }
                    mMusicPath = LLLIL().getMMusicPath();
                    this.LLLI = true;
                    C15R5.LJFF(mMusicPath, new C15RH() { // from class: X.15RA
                        @Override // X.C15RH
                        public final void LIZ(AVMusicWaveBean aVMusicWaveBean) {
                            C15R2 c15r2 = this.LIZ;
                            c15r2.LLLI = false;
                            c15r2.LLLIZZ(true);
                            this.LIZ.LLLJL(aVMusicWaveBean, aVMusicExtractAVMusic.getDuration(), this.LIZ.LLLIL().getMMusicStart());
                        }
                    });
                } else {
                    mMusicPath = LLLIL().getMMusicPath();
                }
                if (mMusicPath == null) {
                    mMusicPath = LLLIL().getMMusicPath();
                }
                this.LLLI = true;
                C15R5.LJFF(mMusicPath, new C15RH() { // from class: X.15RA
                    @Override // X.C15RH
                    public final void LIZ(AVMusicWaveBean aVMusicWaveBean) {
                        C15R2 c15r2 = this.LIZ;
                        c15r2.LLLI = false;
                        c15r2.LLLIZZ(true);
                        this.LIZ.LLLJL(aVMusicWaveBean, aVMusicExtractAVMusic.getDuration(), this.LIZ.LLLIL().getMMusicStart());
                    }
                });
            }
        }
        this.LLJLLL = new C15RI(this);
        this.LLJZ = new C20511915Ob(this);
        FTCEditMusicCutViewModel fTCEditMusicCutViewModel2 = this.LLL;
        if (fTCEditMusicCutViewModel2 != null) {
            fTCEditMusicCutViewModel = fTCEditMusicCutViewModel2;
        }
        C11EA.LJIIIIZZ(this, fTCEditMusicCutViewModel, new C2217381BqS() { // from class: X.15RF
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((FTCEditMusicCutState) obj).getVideoLength();
            }
        }, new C2217381BqS() { // from class: X.15RG
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((FTCEditMusicCutState) obj).getMusicWaveData();
            }
        }, new AwS680S0100000_31(this, 15));
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        View view2 = null;
        if (action != 0) {
            int i = 0;
            if (action != 1) {
                if (action == 2) {
                    float rawX = this.LLJLIL + (motionEvent.getRawX() - this.LLJL);
                    C0GWO c0gwo = this.LLJILJIL;
                    if (c0gwo == null) {
                        c0gwo = null;
                    }
                    float x = c0gwo.getX();
                    ImageView imageView = this.LLJIJIL;
                    if (imageView == null) {
                        imageView = null;
                    }
                    if (rawX < x - (imageView.getWidth() / 2)) {
                        C0GWO c0gwo2 = this.LLJILJIL;
                        if (c0gwo2 == null) {
                            c0gwo2 = null;
                        }
                        float x2 = c0gwo2.getX();
                        ImageView imageView2 = this.LLJIJIL;
                        if (imageView2 == null) {
                            imageView2 = null;
                        }
                        rawX = x2 - (imageView2.getWidth() / 2);
                    }
                    C0GWO c0gwo3 = this.LLJILJIL;
                    if (c0gwo3 == null) {
                        c0gwo3 = null;
                    }
                    float x3 = rawX - c0gwo3.getX();
                    ImageView imageView3 = this.LLJIJIL;
                    if (imageView3 == null) {
                        imageView3 = null;
                    }
                    float width = x3 + (imageView3.getWidth() / 2);
                    C0GWO c0gwo4 = this.LLJILJIL;
                    if (c0gwo4 == null) {
                        c0gwo4 = null;
                    }
                    if (width >= c0gwo4.getWidth() - LLLIIIIL()) {
                        C0GWO c0gwo5 = this.LLJILJIL;
                        if (c0gwo5 == null) {
                            c0gwo5 = null;
                        }
                        float x4 = c0gwo5.getX();
                        ImageView imageView4 = this.LLJIJIL;
                        if (imageView4 == null) {
                            imageView4 = null;
                        }
                        float width2 = x4 - (imageView4.getWidth() / 2);
                        C0GWO c0gwo6 = this.LLJILJIL;
                        if (c0gwo6 == null) {
                            c0gwo6 = null;
                        }
                        rawX = (width2 + c0gwo6.getWidth()) - LLLIIIIL();
                    }
                    if (rawX < 0.0f) {
                        rawX = 0.0f;
                    }
                    ImageView imageView5 = this.LLJIJIL;
                    if (imageView5 == null) {
                        imageView5 = null;
                    }
                    imageView5.animate().x(rawX).setDuration(0L).start();
                    ImageView imageView6 = this.LLJIJIL;
                    if (imageView6 == null) {
                        imageView6 = null;
                    }
                    float x5 = imageView6.getX();
                    ImageView imageView7 = this.LLJIJIL;
                    if (imageView7 == null) {
                        imageView7 = null;
                    }
                    float width3 = x5 + (imageView7.getWidth() / 2);
                    C0GWO c0gwo7 = this.LLJILJIL;
                    if (c0gwo7 == null) {
                        c0gwo7 = null;
                    }
                    int x6 = (int) (width3 - c0gwo7.getX());
                    C0GWO c0gwo8 = this.LLJILJIL;
                    if (c0gwo8 == null) {
                        c0gwo8 = null;
                    }
                    c0gwo8.setStart(x6);
                    C0GWO c0gwo9 = this.LLJILJIL;
                    if (c0gwo9 == null) {
                        c0gwo9 = null;
                    }
                    c0gwo9.setLength(LLLIILIL());
                    TextView textView = this.LLJILJILJ;
                    if (textView == null) {
                        textView = null;
                    }
                    ImageView imageView8 = this.LLJIJIL;
                    if (imageView8 == null) {
                        imageView8 = null;
                    }
                    double x7 = ((double) imageView8.getX()) * 1.0d;
                    C0GWO c0gwo10 = this.LLJILJIL;
                    if (c0gwo10 == null) {
                        c0gwo10 = null;
                    }
                    double x8 = x7 - ((double) c0gwo10.getX());
                    ImageView imageView9 = this.LLJIJIL;
                    if (imageView9 == null) {
                        imageView9 = null;
                    }
                    double width4 = x8 + ((double) (imageView9.getWidth() / 2));
                    C0GWO c0gwo11 = this.LLJILJIL;
                    if (c0gwo11 != null) {
                        view2 = c0gwo11;
                    }
                    double width5 = width4 / ((double) view2.getWidth());
                    int i2 = this.LLJJLIIIJLLLLLLLZ;
                    int i3 = (int) (width5 * ((double) i2));
                    if (i3 < 0) {
                        i3 = 0;
                    }
                    if (i3 <= i2) {
                        i = i3;
                    }
                    textView.setText(C0F3O.LIZ(i));
                }
            } else {
                ImageView imageView10 = this.LLJIJIL;
                if (imageView10 == null) {
                    imageView10 = null;
                }
                float x9 = imageView10.getX();
                C0GWO c0gwo12 = this.LLJILJIL;
                if (c0gwo12 == null) {
                    c0gwo12 = null;
                }
                float x10 = x9 - c0gwo12.getX();
                ImageView imageView11 = this.LLJIJIL;
                if (imageView11 == null) {
                    imageView11 = null;
                }
                int width6 = (int) (x10 + (imageView11.getWidth() / 2));
                if (width6 >= 0) {
                    i = width6;
                }
                double d = ((double) i) * 1.0d;
                C0GWO c0gwo13 = this.LLJILJIL;
                if (c0gwo13 != null) {
                    view2 = c0gwo13;
                }
                this.LLJJJJ = (int) ((d / ((double) view2.getWidth())) * ((double) this.LLJJLIIIJLLLLLLLZ));
                C20511915Ob c20511915Ob = this.LLJZ;
                if (c20511915Ob != null) {
                    c20511915Ob.LIZ();
                    return true;
                }
            }
            return true;
        }
        this.LLJL = motionEvent.getRawX();
        ImageView imageView12 = this.LLJIJIL;
        if (imageView12 != null) {
            view2 = imageView12;
        }
        this.LLJLIL = view2.getX();
        return true;
    }

    @Override // com.bytedance.scene.Scene
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        LayoutInflater layoutInflaterNe = C786410Ut5.ne(this.mActivity);
        FrameLayout frameLayout = this.LLJJIJI;
        View view2 = null;
        if (frameLayout == null) {
            frameLayout = null;
        }
        View viewTd = C786410Ut5.Td(layoutInflaterNe, R.layout.d30, frameLayout, false);
        this.LLJJIJIIJIL = viewTd;
        FrameLayout frameLayout2 = this.LLJJIJI;
        if (frameLayout2 == null) {
            frameLayout2 = null;
        }
        if (viewTd != null) {
            view2 = viewTd;
        }
        frameLayout2.addView(view2);
    }

    @Override // X.C11E9
    public final <VM1 extends JediViewModel<S1>, S1 extends C004I, R> R withState(VM1 vm1, Function1<? super S1, ? extends R> function1) {
        return function1.invoke(vm1.FQ2());
    }

    public final void LLLJL(AVMusicWaveBean aVMusicWaveBean, int i, int i2) {
        int i3;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SoundLoop, EditMusicCutScene.updateMusicWaveData musicLength = ");
        sbLIZ.append(i);
        sbLIZ.append(" videoLength = ");
        sbLIZ.append(this.LLJJJIL);
        C201955140j.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        this.LLJLILLLLZIIL = i;
        LLLJ(true);
        if (aVMusicWaveBean != null && C15R6.LJ(aVMusicWaveBean.getMusicWavePointArray())) {
            C15R5.LJ(aVMusicWaveBean);
            C15R5.LJI.LIZ(aVMusicWaveBean, this.LLJJJIL, i);
            LLLJ(false);
            C15R7 c15r7 = null;
            if (i2 == 0) {
                C15R7 c15r72 = this.LLJJ;
                if (c15r72 == null) {
                    c15r72 = null;
                }
                c15r72.LIZ();
            } else {
                C15R7 c15r73 = this.LLJJ;
                if (c15r73 == null) {
                    c15r73 = null;
                }
                c15r73.LIZIZ((i2 * 1.0f) / i);
                C15R7 c15r74 = this.LLJJ;
                if (c15r74 == null) {
                    c15r74 = null;
                }
                c15r74.setTimeBubble(i2);
            }
            C15R7 c15r75 = this.LLJJ;
            if (c15r75 == null) {
                c15r75 = null;
            }
            C15R5 c15r5 = C15R5.LJI;
            if (this.LLJJJIL > 0) {
                int i4 = c15r5.LJFF;
                int i5 = c15r5.LIZIZ;
                i3 = (i4 + i5) / (c15r5.LIZ + i5);
            } else {
                i3 = 2000;
            }
            c15r75.setOnScreenMaxWavePointCount(i3);
            C15R7 c15r76 = this.LLJJ;
            if (c15r76 != null) {
                c15r7 = c15r76;
            }
            c15r7.setAudioWaveViewData(aVMusicWaveBean);
            return;
        }
        LLLJ(true);
    }

    @Override // com.bytedance.scene.Scene
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        FrameLayout frameLayout = (FrameLayout) C786410Ut5.Td(layoutInflater, R.layout.epz, viewGroup, false);
        this.LLJJIJI = frameLayout;
        return frameLayout;
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
