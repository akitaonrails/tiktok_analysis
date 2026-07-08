package X;

import Y.ACListenerS140S0100000_5;
import Y.AObserverS209S0100000_5;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.port.in.IAVSettingService;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.gamora.editorpro.capabilities.text.captions.inline.ui.InlineCaptionFragment;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS371S0200000_5;

/* JADX INFO: renamed from: X.0F5B, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0F5B {
    public final C0F5K LIZ;
    public final C0F5L LIZIZ;
    public C19737512Kf LIZJ;
    public C19737512Kf LIZLLL;
    public boolean LJ;
    public AnonymousClass0956 LJFF;

    public final void LIZ() {
        MutableLiveData<Integer> mutableLiveData;
        this.LIZ.LIZ.AT().removeCallbacksAndMessages(null);
        C0F5K c0f5k = this.LIZ;
        AbstractC2217051Bpv abstractC2217051Bpv = c0f5k.LIZLLL.LLIZ;
        if (abstractC2217051Bpv != null && (mutableLiveData = abstractC2217051Bpv.LJIL) != null) {
            mutableLiveData.removeObservers(c0f5k.LIZ);
        }
        this.LIZ.LIZ.DT().removeCallbacksAndMessages(null);
        AnonymousClass0956 anonymousClass0956 = this.LJFF;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        C1390410mHn c1390410mHn = this.LIZIZ.LJJJI;
        if (c1390410mHn != null) {
            c1390410mHn.LIZLLL();
        }
        LinearLayout linearLayout = this.LIZIZ.LJJIJLIJ;
        if (linearLayout != null) {
            C786410Ut5.LJZL(8, linearLayout);
        }
        this.LIZ.LIZ.YT(true, true);
    }

    public final void LIZJ() {
        FrameLayout frameLayout;
        LinearLayout linearLayout;
        C201955140j.LIZJ(C563650M8t.LIZIZ, "InlineCaptionFragment -> showExitView");
        this.LIZ.LIZ.oT();
        LIZ();
        C786410Ut5.LJZL(8, this.LIZIZ.LJFF);
        this.LIZ.LIZ.AT().removeCallbacksAndMessages(null);
        C0F5L c0f5l = this.LIZIZ;
        View view = c0f5l.LJJJJ;
        if (view == null || (frameLayout = c0f5l.LJJIJL) == null || (linearLayout = c0f5l.LJJIJLIJ) == null) {
            return;
        }
        this.LIZLLL = new C19737512Kf(linearLayout, view, frameLayout);
        C786410Ut5.I7(new ACListenerS140S0100000_5(this, 113), view.findViewById(R.id.dat));
        C19737512Kf c19737512Kf = this.LIZLLL;
        if (c19737512Kf != null) {
            c19737512Kf.LIZJ(new C19510311Uv());
        }
        this.LJ = true;
    }

    public final void LIZIZ(InterfaceC20236714Gf<? super Boolean> interfaceC20236714Gf) {
        if (C296180BjE.LIZ()) {
            C19EG activity = this.LIZ.LIZ.getActivity();
            if (activity != null) {
                InlineCaptionFragment inlineCaptionFragment = this.LIZ.LIZ;
                C1397580mTM c1397580mTM = new C1397580mTM(activity);
                c1397580mTM.LIZ(2131830683);
                C985403tE.LIZ(c1397580mTM, new AwS371S0200000_5(this, (C0F5B) interfaceC20236714Gf, (InterfaceC20236714Gf<? super Boolean>) 210));
                inlineCaptionFragment.LLLLJ = new C1397510mTF(c1397580mTM);
            }
        } else {
            C19EG activity2 = this.LIZ.LIZ.getActivity();
            if (activity2 != null) {
                InlineCaptionFragment inlineCaptionFragment2 = this.LIZ.LIZ;
                C1397580mTM c1397580mTM2 = new C1397580mTM(activity2);
                c1397580mTM2.LIZ(2131826904);
                C985403tE.LIZ(c1397580mTM2, new AwS371S0200000_5(this, (C0F5B) interfaceC20236714Gf, (InterfaceC20236714Gf<? super Boolean>) 211));
                inlineCaptionFragment2.LLLLJ = new C1397510mTF(c1397580mTM2);
            }
        }
        C1397510mTF c1397510mTF = this.LIZ.LIZ.LLLLJ;
        if (c1397510mTF != null) {
            c1397510mTF.LIZLLL();
        }
    }

    public final void LIZLLL(boolean z) {
        MutableLiveData<Integer> mutableLiveData;
        MutableLiveData<Integer> mutableLiveData2;
        int i = 8;
        if (z) {
            if (this.LIZ.LIZIZ()) {
                InlineCaptionFragment inlineCaptionFragment = this.LIZ.LIZ;
                View viewFindViewById = inlineCaptionFragment.LLLILZLLLI;
                if (viewFindViewById == null) {
                    View view = inlineCaptionFragment.getView();
                    if (view != null) {
                        viewFindViewById = view.findViewById(R.id.dce);
                    } else {
                        viewFindViewById = null;
                    }
                    inlineCaptionFragment.LLLILZLLLI = (FrameLayout) viewFindViewById;
                }
                FrameLayout frameLayout = (FrameLayout) viewFindViewById;
                if (frameLayout != null) {
                    C786410Ut5.LJZ(8, frameLayout);
                }
            } else {
                InlineCaptionFragment inlineCaptionFragment2 = this.LIZ.LIZ;
                View viewFindViewById2 = inlineCaptionFragment2.LLLIZZ;
                if (viewFindViewById2 == null) {
                    View view2 = inlineCaptionFragment2.getView();
                    if (view2 != null) {
                        viewFindViewById2 = view2.findViewById(R.id.wmi);
                    } else {
                        viewFindViewById2 = null;
                    }
                    inlineCaptionFragment2.LLLIZZ = (ConstraintLayout) viewFindViewById2;
                }
                ConstraintLayout constraintLayout = (ConstraintLayout) viewFindViewById2;
                if (constraintLayout != null) {
                    C786410Ut5.LL(8, constraintLayout);
                }
            }
            this.LIZ.LJI.LJIJJLI = "captions_loading_panel";
            View view3 = this.LIZIZ.LJIIIZ;
            if (view3 != null) {
                C786410Ut5.LJLLLLLL(4, view3);
            }
            View view4 = this.LIZIZ.LJIIJ;
            if (view4 != null) {
                C786410Ut5.LJLLLLLL(4, view4);
            }
            VideoPublishEditModel videoPublishEditModel = this.LIZ.LIZJ;
            if (videoPublishEditModel != null && C1416310mxZ.LJIILJJIL(videoPublishEditModel)) {
                this.LJFF = C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this.LIZ.LIZ), null, null, new C0F5T(this, null), 3);
            } else {
                this.LIZ.LIZ.DT().post(new Runnable() { // from class: X.0F5Q
                    public int LL;
                    public final String[] LLILLJJLI;

                    public final void LIZ() {
                        TuxTextView tuxTextView = this.LLILLL.LIZIZ.LJJIZ;
                        if (tuxTextView != null) {
                            String[] strArr = this.LLILLJJLI;
                            int i2 = this.LL;
                            this.LL = i2 + 1;
                            tuxTextView.setText(strArr[i2]);
                        }
                        this.LL %= 2;
                        this.LLILLL.LIZ.LIZ.DT().postDelayed(this, Mp4ScreenVideoLoadTimeout.CONTROL);
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean zLIZ;
                        C1C7U.LIZ("CaptionLoadingPresenter$TipsRunnable@2365.run");
                        try {
                            LIZ();
                        } finally {
                            if (!zLIZ) {
                            }
                        }
                        C1C7U.LIZIZ("CaptionLoadingPresenter$TipsRunnable@2365.run");
                    }

                    {
                        this.LLILLJJLI = new String[]{this.LLILLL.LIZ.LIZ.getString(2131826908), this.LLILLL.LIZ.LIZ.getString(2131826909)};
                    }
                });
            }
            C0F5K c0f5k = this.LIZ;
            AbstractC2217051Bpv abstractC2217051Bpv = c0f5k.LIZLLL.LLIZ;
            if (abstractC2217051Bpv != null && (mutableLiveData2 = abstractC2217051Bpv.LJIL) != null) {
                mutableLiveData2.observe(c0f5k.LIZ, new AObserverS209S0100000_5(this, 121));
            }
            LinearLayout linearLayout = this.LIZIZ.LJJIJLIJ;
            if (linearLayout != null) {
                C786410Ut5.LJZL(0, linearLayout);
            }
            C786410Ut5.LJZL(8, this.LIZIZ.LJFF);
            C1390410mHn c1390410mHn = this.LIZIZ.LJJJI;
            if (c1390410mHn != null) {
                c1390410mHn.LIZJ();
            }
            if (linearLayout != null) {
                View viewFindViewById3 = linearLayout.findViewById(R.id.db0);
                if (viewFindViewById3 != null) {
                    C786410Ut5.I7(new ACListenerS140S0100000_5(this, 114), viewFindViewById3);
                }
                View viewFindViewById4 = linearLayout.findViewById(R.id.db0);
                if (viewFindViewById4 != null) {
                    C786410Ut5.LJLLLLLL(8, viewFindViewById4);
                }
            }
            if (this.LIZ.LIZIZ()) {
                C786410Ut5.LJZL(0, this.LIZIZ.LIZIZ);
                TuxTextView tuxTextView = this.LIZIZ.LJIL;
                if (tuxTextView != null) {
                    C786410Ut5.LLLLZLL(tuxTextView, 8);
                }
                ViewGroup viewGroup = this.LIZIZ.LJJIII;
                if (viewGroup != null) {
                    C786410Ut5.LJLZ(8, viewGroup);
                }
                TuxTextView tuxTextView2 = this.LIZIZ.LJIJJLI;
                if (tuxTextView2 != null) {
                    C786410Ut5.LLLLZLL(tuxTextView2, 8);
                }
            }
            this.LIZ.LJI.LIZLLL = false;
        } else {
            C0F5K c0f5k2 = this.LIZ;
            C0F5P c0f5p = c0f5k2.LJI;
            c0f5p.LJIJJLI = "bulk_edit_panel";
            c0f5p.LIZLLL = true;
            AbstractC2217051Bpv abstractC2217051Bpv2 = c0f5k2.LIZLLL.LLIZ;
            if (abstractC2217051Bpv2 != null && (mutableLiveData = abstractC2217051Bpv2.LJIL) != null) {
                mutableLiveData.removeObservers(c0f5k2.LIZ);
            }
            this.LIZ.LIZ.DT().removeCallbacksAndMessages(null);
            AnonymousClass0956 anonymousClass0956 = this.LJFF;
            if (anonymousClass0956 != null) {
                anonymousClass0956.LIZIZ(null);
            }
            C1390410mHn c1390410mHn2 = this.LIZIZ.LJJJI;
            if (c1390410mHn2 != null) {
                c1390410mHn2.LIZLLL();
            }
            LinearLayout linearLayout2 = this.LIZIZ.LJJIJLIJ;
            if (linearLayout2 != null) {
                C786410Ut5.LJZL(8, linearLayout2);
            }
            C786410Ut5.LJZL(0, this.LIZIZ.LJFF);
            C786410Ut5.W4(this.LIZIZ.LJFF, 1.0f);
            if (this.LIZ.LIZIZ()) {
                C786410Ut5.LJZL(8, this.LIZIZ.LIZIZ);
                ViewGroup viewGroup2 = this.LIZIZ.LJJIII;
                if (viewGroup2 != null) {
                    C786410Ut5.LJLZ(8, viewGroup2);
                }
                if (((Boolean) C277750Aub.LIZ.getValue()).booleanValue()) {
                    if (this.LIZ.LIZ.LLLLLLIL.contains(((IAVSettingService) ServiceManager.get().getService(IAVSettingService.class)).getAppLanguage())) {
                        TuxTextView tuxTextView3 = this.LIZIZ.LJIJJLI;
                        if (tuxTextView3 != null) {
                            tuxTextView3.setTextSize(2, 12.0f);
                        }
                        TuxTextView tuxTextView4 = this.LIZIZ.LJIL;
                        if (tuxTextView4 != null) {
                            tuxTextView4.setTextSize(2, 13.0f);
                        }
                    }
                }
                TuxTextView tuxTextView5 = this.LIZIZ.LJIL;
                if (tuxTextView5 != null) {
                    if (!C357780E0y.LIZ()) {
                        i = 0;
                    }
                    C786410Ut5.LLLLZLL(tuxTextView5, i);
                }
                TuxTextView tuxTextView6 = this.LIZIZ.LJIJJLI;
                if (tuxTextView6 != null) {
                    C786410Ut5.LLLLZLL(tuxTextView6, 0);
                }
            }
        }
        this.LIZ.LIZ.YT(!z, true);
    }

    public C0F5B(C0F5K c0f5k, C0F5L c0f5l) {
        this.LIZ = c0f5k;
        this.LIZIZ = c0f5l;
    }
}
