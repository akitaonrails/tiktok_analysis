package X;

import Y.AObserverS189S0200000_29;
import Y.ATListenerS461S0100000_29;
import android.app.Activity;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.service.IToolsCameraAudioSecurityCheckService;
import com.ss.android.ugc.aweme.shortvideo.cover.VEVideoCoverGeneratorImpl;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.cover.MvChooseCoverBitmapCreator;
import com.ss.android.ugc.aweme.widgetcompat.WrapLinearLayoutManager;
import com.ss.android.vesdk.VEEditor;
import com.zhiliaoapp.musically.R;
import irm.AkS95S0100000_29;
import java.util.List;
import kotlin.jvm.internal.AFwS218S0000000_29;
import kotlin.jvm.internal.AwS10S0501000_29;
import kotlin.jvm.internal.AwS395S0200000_29;
import kotlin.jvm.internal.AwS573S0100000_29;
import kotlin.jvm.internal.AwS584S0100000_5;
import kotlin.jvm.internal.AwS608S0100000_29;
import kotlin.jvm.internal.AwS643S0100000_29;
import kotlin.jvm.internal.AwS678S0100000_29;

/* JADX INFO: renamed from: X.12Sr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19759512Sr extends AbstractC1664490tPr<C12SK, C12SY> {
    public final VideoPublishEditModel LLJJJIL;
    public final InterfaceC1455860nzM LLJJJJ;
    public final C19755412Rc LLJJJJJIL;
    public final InterfaceC1461660o8i LLJJJJLIIL;
    public C19759912Sv LLJJL;
    public boolean LLJJLIIIJLLLLLLLZ;
    public C19759712St LLJL;
    public TuxIconView LLJLIL;
    public LinearLayout LLJLILLLLZIIL;
    public C0HZQ LLJLL;
    public TuxTextView LLJLLIL;
    public boolean LLJLLL;
    public boolean LLJZ;
    public View LLJZIJLIL;
    public EnumC1090580eUC LLL = EnumC1090580eUC.IDLE;
    public boolean LLLF;

    public final void LLLLLJIL() {
        TuxIconView tuxIconView = this.LLJLIL;
        if (tuxIconView == null) {
            tuxIconView = null;
        }
        C786410Ut5.LLLLLLZZ(tuxIconView, (this.LLJJJJJIL.LJFF().isEmpty() || this.LLJJLIIIJLLLLLLLZ) ? 8 : 0);
    }

    public final void LLLLLLLLL() {
        long duration = this.LLJJJJ.g().getValue() != null ? r0.getDuration() : 0L;
        C19759712St c19759712St = this.LLJL;
        if (c19759712St != null && duration != c19759712St.getDuration()) {
            C19759712St c19759712St2 = this.LLJL;
            if (c19759712St2 == null) {
                c19759712St2 = null;
            }
            InterfaceC1455860nzM interfaceC1455860nzM = this.LLJJJJ;
            Activity activityRequireActivity = requireActivity();
            VideoPublishEditModel videoPublishEditModel = this.LLJJJIL;
            c19759712St2.getClass();
            InterfaceC1452170ntP value = interfaceC1455860nzM.g().getValue();
            if (value != null) {
                C12T7 c12t7 = new C12T7(interfaceC1455860nzM);
                c19759712St2.LLJJI = c12t7;
                C0H6D c0h6d = c19759712St2.LLJI;
                if (c0h6d == null) {
                    c0h6d = null;
                }
                c0h6d.LIZLLL();
                c0h6d.setLayoutManager(new WrapLinearLayoutManager(activityRequireActivity, 0));
                int frameHeight = c0h6d.getFrameHeight();
                int frameWidth = c0h6d.getFrameWidth();
                int duration2 = value.getDuration() < 1000 ? 1 : value.getDuration() >= 25000 ? 25 : value.getDuration() / LSPassThroughRecordSizeConfig.DEFAULT;
                c0h6d.setCoverSize(duration2);
                c12t7.LIZIZ = new C19560811fy(new VEVideoCoverGeneratorImpl(value, C535690Kzf.LIZIZ(c0h6d), c0h6d.getCoverSize(), C1446620nkS.LIZ() ? VEEditor.GET_FRAMES_FLAGS.GET_FRAMES_MODE_NORMAL : VEEditor.GET_FRAMES_FLAGS.GET_FRAMES_MODE_NOEFFECT, "record_page"), frameWidth, frameHeight, duration2);
                if (videoPublishEditModel.isMvThemeVideoType()) {
                    final C810503Ep c810503Ep = new C810503Ep(frameWidth, frameHeight);
                    c0h6d.setAdapter(c810503Ep);
                    MvChooseCoverBitmapCreator mvChooseCoverBitmapCreator = new MvChooseCoverBitmapCreator();
                    mvChooseCoverBitmapCreator.setMvThemeVideoCoverErrorListener(new InterfaceC1457180o1U() { // from class: X.12T9
                        @Override // X.InterfaceC1457180o1U
                        public final void onError(int i, String str) {
                            C201955140j.LJ(str);
                        }
                    });
                    mvChooseCoverBitmapCreator.setFirstFrameVisibleLiveData(interfaceC1455860nzM.Ps());
                    mvChooseCoverBitmapCreator.setFirstFrameBitmapLiveData(interfaceC1455860nzM.lk());
                    mvChooseCoverBitmapCreator.setImgSize(frameWidth, frameHeight);
                    InterfaceC20597015ii interfaceC20597015iiLIZLLL = C20622515mp.LIZLLL(c0h6d);
                    if (interfaceC20597015iiLIZLLL != null) {
                        interfaceC20597015iiLIZLLL.Ss("getIntent", new AwS10S0501000_29(mvChooseCoverBitmapCreator, interfaceC20597015iiLIZLLL, activityRequireActivity, value, duration2, c810503Ep, 0));
                    } else {
                        mvChooseCoverBitmapCreator.getBitmapList(activityRequireActivity, value, duration2, new InterfaceC741260T5w() { // from class: X.12T6
                            @Override // X.InterfaceC741260T5w
                            public final void LIZ(List<Bitmap> list) {
                                c810503Ep.LLLFZ(list);
                            }
                        });
                    }
                    c0h6d.setAdapter(c810503Ep);
                } else {
                    c0h6d.setAdapter(new C0FPB(c12t7.LIZIZ, frameWidth, frameHeight));
                }
            }
        }
        C19759712St c19759712St3 = this.LLJL;
        if (c19759712St3 == null) {
            c19759712St3 = null;
        }
        c19759712St3.LLILZLL = duration;
        c19759712St3.LJII();
    }

    public final void LLLLLL() {
        this.LLJLILLLLZIIL = (LinearLayout) requireViewById(R.id.bab);
        this.LLJLL = (C0HZQ) requireViewById(R.id.bac);
        this.LLJLLIL = (TuxTextView) requireViewById(R.id.bad);
        LinearLayout linearLayout = this.LLJLILLLLZIIL;
        if (linearLayout == null) {
            linearLayout = null;
        }
        C786410Ut5.I7(new AkS95S0100000_29(this, 15), linearLayout);
        AbstractC1664490tPr.LLLLLILLIL(this, LLLLILI(), new C2217381BqS() { // from class: X.12SO
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C12SK) obj).LJFF;
            }
        }, new AwS608S0100000_29(this, 164));
        AbstractC1664490tPr.LLLLLILLIL(this, LLLLILI(), new C2217381BqS() { // from class: X.12Sy
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C12SK) obj).LJ;
            }
        }, new AwS608S0100000_29(this, 165));
        VideoPublishEditModel videoPublishEditModel = this.LLJJJIL;
        if (C1403850mdT.LJIIJJI(videoPublishEditModel)) {
            LinearLayout linearLayout2 = this.LLJLILLLLZIIL;
            if (linearLayout2 == null) {
                linearLayout2 = null;
            }
            C786410Ut5.LJZL(0, linearLayout2);
        } else {
            LinearLayout linearLayout3 = this.LLJLILLLLZIIL;
            if (linearLayout3 == null) {
                linearLayout3 = null;
            }
            C786410Ut5.LJZL(8, linearLayout3);
        }
        if (videoPublishEditModel.isDuet() || C1428520nHG.LJJL(videoPublishEditModel) || videoPublishEditModel.isPhotoMvMode() || videoPublishEditModel.getEditMusicSyncMode() || videoPublishEditModel.getStitchParams() != null || videoPublishEditModel.isStickPointMode() || videoPublishEditModel.isCurrentAutoCutMode() || videoPublishEditModel.isMuted()) {
            LinearLayout linearLayout4 = this.LLJLILLLLZIIL;
            C786410Ut5.LJZL(8, linearLayout4 != null ? linearLayout4 : null);
        }
    }

    @Override // X.AbstractC1664490tPr
    public final void onHide() {
        ((IToolsCameraAudioSecurityCheckService) ServiceManager.get().getService(IToolsCameraAudioSecurityCheckService.class)).LJIIIIZZ();
    }

    @Override // com.bytedance.scene.Scene
    public final void onPause() {
        super.onPause();
        this.LLLF = true;
        if (this.LLJJLIIIJLLLLLLLZ) {
            LLLLLLIL(-1, "", false);
        }
    }

    @Override // X.AbstractC1664490tPr, com.bytedance.scene.Scene
    public final void onResume() {
        super.onResume();
        this.LLLF = false;
    }

    @Override // X.AbstractC1664490tPr
    public final void onShow() {
        LLLLLLLLL();
        LLLLLL();
        ((IToolsCameraAudioSecurityCheckService) ServiceManager.get().getService(IToolsCameraAudioSecurityCheckService.class)).LJIIIIZZ();
    }

    public final void LLLLLJLJLL(boolean z) {
        float f;
        C0HZQ c0hzq = this.LLJLL;
        TuxTextView tuxTextView = null;
        if (c0hzq == null) {
            c0hzq = null;
        }
        c0hzq.setEnabled(z);
        TuxTextView tuxTextView2 = this.LLJLLIL;
        if (tuxTextView2 != null) {
            tuxTextView = tuxTextView2;
        }
        if (z) {
            f = 1.0f;
        } else {
            f = 0.66f;
        }
        C786410Ut5.B5(tuxTextView, f);
    }

    public final void LLLLLLL(String str) {
        long jLLL;
        if (this.LLL != EnumC1090580eUC.IDLE) {
            return;
        }
        C0HZQ c0hzq = this.LLJLL;
        View view = null;
        if (c0hzq == null) {
            c0hzq = null;
        }
        this.LLJLLL = c0hzq.isEnabled();
        LLLLLJLJLL(false);
        this.LLJJLIIIJLLLLLLLZ = true;
        C19759712St c19759712St = this.LLJL;
        if (c19759712St == null) {
            c19759712St = null;
        }
        InterfaceC1452170ntP value = this.LLJJJJ.g().getValue();
        if (value != null) {
            jLLL = value.LLL();
        } else {
            jLLL = 0;
        }
        C384220F4q c384220F4q = c19759712St.LLJILJIL;
        if (c384220F4q == null) {
            c384220F4q = null;
        }
        c384220F4q.setStartRecordTime(jLLL);
        LLLLIL().LIZIZ.invoke(null, str);
        C19759912Sv c19759912Sv = this.LLJJL;
        if (c19759912Sv == null) {
            c19759912Sv = null;
        }
        c19759912Sv.setBgColorDrawable(null);
        C19759912Sv c19759912Sv2 = this.LLJJL;
        if (c19759912Sv2 == null) {
            c19759912Sv2 = null;
        }
        C12T0 c12t0 = c19759912Sv2.LLILLJJLI;
        if (c12t0 != null) {
            c12t0.LIZIZ();
        }
        C19759912Sv c19759912Sv3 = this.LLJJL;
        if (c19759912Sv3 == null) {
            c19759912Sv3 = null;
        }
        c19759912Sv3.setStopTintColorRes(R.attr.a04);
        C19759912Sv c19759912Sv4 = this.LLJJL;
        if (c19759912Sv4 == null) {
            c19759912Sv4 = null;
        }
        c19759912Sv4.LIZ(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24)));
        C19759712St c19759712St2 = this.LLJL;
        if (c19759712St2 == null) {
            c19759712St2 = null;
        }
        c19759712St2.setRecording(true);
        View view2 = this.LLJZIJLIL;
        if (view2 != null) {
            view = view2;
        }
        C786410Ut5.LJLLLLLL(0, view);
        LLLLLJIL();
    }

    @Override // com.bytedance.scene.Scene
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LIZIZ = Integer.valueOf(R.attr.bn);
        c384050F3z.LJIIIIZZ = Float.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)));
        c384050F3z.LJIIIZ = Float.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)));
        view.setBackground(c384050F3z.LIZ(requireSceneContext()));
        this.LLJL = (C19759712St) requireViewById(R.id.baq);
        LLLLLLLLL();
        C19755412Rc c19755412Rc = this.LLJJJJJIL;
        C19759712St c19759712St = this.LLJL;
        C19759912Sv c19759912Sv = null;
        if (c19759712St == null) {
            c19759712St = null;
        }
        c19755412Rc.LJIIIIZZ = c19759712St;
        AbstractC1664490tPr.LLLLLILLIL(this, LLLLILI(), new C2217381BqS() { // from class: X.12T1
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C12SK) obj).LIZ;
            }
        }, new AwS584S0100000_5(this, 40));
        C19759712St c19759712St2 = this.LLJL;
        if (c19759712St2 == null) {
            c19759712St2 = null;
        }
        c19759712St2.setScrollListener(new AwS643S0100000_29(this, 31));
        C19759712St c19759712St3 = this.LLJL;
        if (c19759712St3 == null) {
            c19759712St3 = null;
        }
        c19759712St3.setOnScrollStateChanged(new AwS678S0100000_29(this, 2));
        AbstractC1664490tPr.LLLLLILLIL(this, LLLLILI(), new C2217381BqS() { // from class: X.12T3
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C12SK) obj).LJI;
            }
        }, new AwS608S0100000_29(this, 160));
        TuxIconView tuxIconView = (TuxIconView) requireViewById(R.id.sy8);
        this.LLJLIL = tuxIconView;
        if (tuxIconView == null) {
            tuxIconView = null;
        }
        C786410Ut5.I7(new AkS95S0100000_29(this, 14), tuxIconView);
        LLLLLJIL();
        this.LLJZIJLIL = requireViewById(R.id.fut);
        C19759912Sv c19759912Sv2 = (C19759912Sv) requireViewById(R.id.vz9);
        this.LLJJL = c19759912Sv2;
        if (c19759912Sv2 == null) {
            c19759912Sv2 = null;
        }
        C786410Ut5.I7(new AkS95S0100000_29(this, 16), c19759912Sv2);
        C19759912Sv c19759912Sv3 = this.LLJJL;
        if (c19759912Sv3 == null) {
            c19759912Sv3 = null;
        }
        c19759912Sv3.setOnLongClickListener(new C12YH(this, 0));
        C19759912Sv c19759912Sv4 = this.LLJJL;
        if (c19759912Sv4 == null) {
            c19759912Sv4 = null;
        }
        c19759912Sv4.setOnTouchListener(new ATListenerS461S0100000_29(this, 6));
        C786410Ut5.I7(new AkS95S0100000_29(this, 17), requireViewById(R.id.zj1));
        View viewRequireViewById = requireViewById(R.id.syd);
        C19755412Rc c19755412Rc2 = this.LLJJJJJIL;
        c19755412Rc2.LJIIIIZZ().observe(this, new AObserverS189S0200000_29(c19755412Rc2, new AwS395S0200000_29(this, viewRequireViewById, 19), 6));
        C19759912Sv c19759912Sv5 = this.LLJJL;
        if (c19759912Sv5 == null) {
            c19759912Sv5 = null;
        }
        c19759912Sv5.LIZ(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24)));
        C19759912Sv c19759912Sv6 = this.LLJJL;
        if (c19759912Sv6 != null) {
            c19759912Sv = c19759912Sv6;
        }
        c19759912Sv.setRecordingTintRes(R.raw.icon_mic_fill);
        LLLLLL();
        this.LLJJJJJIL.LJIIIZ(new AwS608S0100000_29(this, 162), new AwS573S0100000_29(this, 221), new AwS573S0100000_29(this, 222), AFwS218S0000000_29.get$arr$(158));
        AbstractC1664490tPr.LLLLLILLIL(this, LLLLILI(), new C2217381BqS() { // from class: X.12SS
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C12SK) obj).LIZLLL;
            }
        }, new AwS608S0100000_29(this, 163));
    }

    public final void LLLLLLIL(int i, String str, boolean z) {
        int iIntValue;
        View view = null;
        if (this.LLJJLIIIJLLLLLLLZ) {
            C19759912Sv c19759912Sv = this.LLJJL;
            if (c19759912Sv == null) {
                c19759912Sv = null;
            }
            Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a04, requireSceneContext());
            if (numLIZJ != null) {
                iIntValue = numLIZJ.intValue();
            } else {
                iIntValue = 0;
            }
            c19759912Sv.setBgColorRes(iIntValue);
            C19759912Sv c19759912Sv2 = this.LLJJL;
            if (c19759912Sv2 == null) {
                c19759912Sv2 = null;
            }
            C12T0 c12t0 = c19759912Sv2.LLILLJJLI;
            if (c12t0 != null) {
                c12t0.LIZJ();
            }
            C19759912Sv c19759912Sv3 = this.LLJJL;
            if (c19759912Sv3 == null) {
                c19759912Sv3 = null;
            }
            c19759912Sv3.LIZ(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24)));
        }
        LLLLLJLJLL(this.LLJLLL);
        this.LLJJLIIIJLLLLLLLZ = false;
        LLLLIL().LIZJ.invoke(Boolean.valueOf(z), Integer.valueOf(i), null, str);
        this.LLJJJJJIL.LJII();
        C19759712St c19759712St = this.LLJL;
        if (c19759712St == null) {
            c19759712St = null;
        }
        c19759712St.setRecording(false);
        LLLLLJIL();
        View view2 = this.LLJZIJLIL;
        if (view2 != null) {
            view = view2;
        }
        C786410Ut5.LJLLLLLL(8, view);
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, X.C19A3, com.bytedance.scene.Scene
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return (ViewGroup) C786410Ut5.Td(layoutInflater, R.layout.ent, viewGroup, false);
    }

    public C19759512Sr(VideoPublishEditModel videoPublishEditModel, InterfaceC1446740nke interfaceC1446740nke, C19755412Rc c19755412Rc, InterfaceC1461660o8i interfaceC1461660o8i) {
        this.LLJJJIL = videoPublishEditModel;
        this.LLJJJJ = interfaceC1446740nke;
        this.LLJJJJJIL = c19755412Rc;
        this.LLJJJJLIIL = interfaceC1461660o8i;
    }
}
