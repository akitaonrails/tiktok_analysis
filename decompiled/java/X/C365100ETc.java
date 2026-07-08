package X;

import android.app.Activity;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.lifecycle.Lifecycle;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.effect.EffectModel;
import com.ss.android.ugc.aweme.effect.EffectSearchModel;
import com.ss.android.ugc.aweme.shortvideo.cover.VEVideoCoverGeneratorImpl;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.cover.MvChooseCoverBitmapCreator;
import com.ss.android.ugc.aweme.widgetcompat.WrapLinearLayoutManager;
import com.ss.android.vesdk.VEEditor;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS234S0000000_5;
import kotlin.jvm.internal.AwS549S0100000_5;
import kotlin.jvm.internal.AwS584S0100000_5;
import kotlin.jvm.internal.AwS619S0100000_5;
import u4.q0;

/* JADX INFO: renamed from: X.0ETc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C365100ETc extends AbstractC1664490tPr<C364260EPw, C0EPQ> {
    public final VideoPublishEditModel LLJJJIL;
    public final C113G LLJJJJ;
    public final C113D LLJJJJJIL;
    public final C365260ETs LLJJJJLIIL;
    public final InterfaceC365270ETt LLJJL;
    public final InterfaceC1452170ntP LLJJLIIIJLLLLLLLZ;
    public final C356830Dyr LLJL;
    public RelativeLayout LLJLIL;
    public View LLJLILLLLZIIL;
    public View LLJLL;
    public LinearLayout LLJLLIL;
    public FrameLayout LLJLLL;
    public C0H6D LLJZ;
    public LinearLayout LLJZIJLIL;
    public ImageView LLL;
    public TuxIconView LLLF;
    public TuxIconView LLLFF;
    public TuxIconView LLLFFI;
    public TuxIconView LLLFZ;
    public TuxIconView LLLI;
    public View LLLII;
    public LinearLayout LLLIIII;
    public TuxTextView LLLIIIIL;
    public C1322110kVd LLLIIIL;
    public RelativeLayout LLLIIL;
    public C113Z LLLILZ;
    public C365200ETm LLLILZJ;
    public C1426800nEU LLLILZLLLI;
    public C19560811fy LLLIZZ;
    public AnonymousClass0956 LLLL;
    public final HashMap<String, InterfaceC2257101DWa> LLLIILIL = new HashMap<>();
    public boolean LLLIL = true;
    public final C01GW LLLJ = C452501pT.LIZIZ(new AwS549S0100000_5(this, 69));
    public final C01GW LLLJIL = C452501pT.LIZIZ(new AwS549S0100000_5(this, 68));
    public final C01GW LLLJL = C452501pT.LIZIZ(new AwS549S0100000_5(this, 71));

    public final void LLLLLJIL() {
        TuxIconView tuxIconView = this.LLLFF;
        if (tuxIconView == null) {
            tuxIconView = null;
        }
        LLLLLL(tuxIconView, false);
        if (C0BSW.LIZ) {
            TuxIconView tuxIconView2 = this.LLLFFI;
            if (tuxIconView2 == null) {
                tuxIconView2 = null;
            }
            C786410Ut5.LLLLLLZZ(tuxIconView2, 8);
            View view = this.LLLII;
            if (view == null) {
                view = null;
            }
            C786410Ut5.LJLLLLLL(8, view);
            TuxIconView tuxIconView3 = this.LLLFFI;
            if (tuxIconView3 == null) {
                tuxIconView3 = null;
            }
            LLLLLL(tuxIconView3, false);
        }
        C365200ETm c365200ETm = this.LLLILZJ;
        if (c365200ETm == null) {
            c365200ETm = null;
        }
        c365200ETm.LJII();
        C113Z c113z = this.LLLILZ;
        if (c113z == null) {
            c113z = null;
        }
        c113z.F0(null);
        this.LLJJJJJIL.LJIIIZ();
        C1426800nEU c1426800nEU = this.LLLILZLLLI;
        if (c1426800nEU != null) {
            c1426800nEU.VF();
        }
    }

    public final void LLLLLJLJLL() {
        LinearLayout linearLayout = this.LLLIIII;
        if (linearLayout == null) {
            linearLayout = null;
        }
        C786410Ut5.LJZL(8, linearLayout);
        C1322110kVd c1322110kVd = this.LLLIIIL;
        if (c1322110kVd == null) {
            c1322110kVd = null;
        }
        C786410Ut5.LLZZLLIL(c1322110kVd, 8);
        TuxTextView tuxTextView = this.LLLIIIIL;
        C786410Ut5.LLLLZLL(tuxTextView != null ? tuxTextView : null, 8);
    }

    public final void LLLLLLL(boolean z) {
        String str;
        String str2;
        if (this.LLJLL == null) {
            return;
        }
        if (z) {
            str = (String) this.LLLJL.getValue();
            str2 = (String) this.LLLJ.getValue();
        } else {
            str = (String) this.LLLJIL.getValue();
            str2 = null;
        }
        View view = this.LLJLL;
        if (view == null) {
            view = null;
        }
        q0.LJJIFFI(view, str2);
        View view2 = this.LLJLL;
        if (view2 == null) {
            view2 = null;
        }
        q0.LJIILL(view2, C20092413jW.LJI, str, null);
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, com.bytedance.scene.Scene
    public final void onActivityCreated(Bundle bundle) {
        VEEditor.GET_FRAMES_FLAGS get_frames_flags;
        AbstractC21673619ry<?> c0fpb;
        super.onActivityCreated(bundle);
        C391500FWq c391500FWq = new C391500FWq(this, 0);
        this.LLJLIL = (RelativeLayout) requireViewById(R.id.trr);
        this.LLJLLIL = (LinearLayout) requireViewById(R.id.ceb);
        this.LLLIIIIL = (TuxTextView) requireViewById(R.id.zi2);
        this.LLLIIIL = (C1322110kVd) requireViewById(R.id.zi1);
        this.LLLIIII = (LinearLayout) requireViewById(R.id.mfd);
        int iLJIIIIZZ = (int) (C12ES.LJIIIIZZ(requireSceneContext()) * this.LLJJJJ.LJIJJLI);
        View viewRequireViewById = requireViewById(R.id.rr0);
        C786410Ut5.I7(c391500FWq, viewRequireViewById);
        ((RelativeLayout.LayoutParams) viewRequireViewById.getLayoutParams()).bottomMargin = this.LLJJJJLIIL.LJIIL + iLJIIIIZZ;
        this.LLJLILLLLZIIL = viewRequireViewById;
        View viewRequireViewById2 = requireViewById(R.id.video_layout);
        C786410Ut5.I7(c391500FWq, viewRequireViewById2);
        this.LLJLL = viewRequireViewById2;
        FrameLayout frameLayout = (FrameLayout) requireViewById(R.id.yh5);
        this.LLJLLL = frameLayout;
        TuxIconView tuxIconView = null;
        if (frameLayout == null) {
            frameLayout = null;
        }
        ((LinearLayout.LayoutParams) frameLayout.getLayoutParams()).height = this.LLJJJJLIIL.LJIIL;
        LinearLayout linearLayout = (LinearLayout) requireViewById(R.id.q1v);
        this.LLJZIJLIL = linearLayout;
        if (linearLayout == null) {
            linearLayout = null;
        }
        ((LinearLayout.LayoutParams) linearLayout.getLayoutParams()).height = iLJIIIIZZ;
        TuxTextView tuxTextView = (TuxTextView) requireViewById(R.id.zbp);
        C786410Ut5.h9(tuxTextView, c391500FWq);
        C377000EqI.LIZ(tuxTextView);
        TuxTextView tuxTextView2 = (TuxTextView) requireViewById(R.id.tv_save);
        C786410Ut5.h9(tuxTextView2, c391500FWq);
        C377000EqI.LIZ(tuxTextView2);
        TuxIconView tuxIconView2 = (TuxIconView) requireViewById(R.id.llj);
        C0EZX.LIZIZ(tuxIconView2, 0.5f);
        C786410Ut5.a9(tuxIconView2, c391500FWq);
        this.LLLFFI = tuxIconView2;
        this.LLLII = requireViewById(R.id.kme);
        TuxIconView tuxIconView3 = (TuxIconView) requireViewById(R.id.lr1);
        C786410Ut5.a9(tuxIconView3, c391500FWq);
        this.LLLF = tuxIconView3;
        TuxIconView tuxIconView4 = (TuxIconView) requireViewById(R.id.lea);
        C0EZX.LIZIZ(tuxIconView4, 0.5f);
        C786410Ut5.a9(tuxIconView4, c391500FWq);
        this.LLLFF = tuxIconView4;
        TuxIconView tuxIconView5 = (TuxIconView) requireViewById(R.id.lys);
        C0EZX.LIZIZ(tuxIconView5, 0.5f);
        C786410Ut5.a9(tuxIconView5, c391500FWq);
        this.LLLFZ = tuxIconView5;
        TuxIconView tuxIconView6 = (TuxIconView) requireViewById(R.id.lt4);
        C0EZX.LIZIZ(tuxIconView6, 0.5f);
        C786410Ut5.a9(tuxIconView6, c391500FWq);
        this.LLLI = tuxIconView6;
        this.LLLIIL = (RelativeLayout) requireViewById(R.id.y1z);
        C0H6D c0h6d = (C0H6D) requireViewById(R.id.dt4);
        this.LLJZ = c0h6d;
        if (c0h6d == null) {
            c0h6d = null;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) c0h6d.getLayoutParams();
        int i = this.LLJJJJLIIL.LJIIJJI;
        marginLayoutParams.setMargins(i, 0, i, 0);
        Activity activityRequireActivity = requireActivity();
        if (this.LLJJLIIIJLLLLLLLZ != null) {
            C0H6D c0h6d2 = this.LLJZ;
            if (c0h6d2 == null) {
                c0h6d2 = null;
            }
            c0h6d2.LIZLLL();
            C0H6D c0h6d3 = this.LLJZ;
            if (c0h6d3 == null) {
                c0h6d3 = null;
            }
            c0h6d3.setLayoutManager(new WrapLinearLayoutManager(activityRequireActivity, 0));
            C0H6D c0h6d4 = this.LLJZ;
            if (c0h6d4 == null) {
                c0h6d4 = null;
            }
            int frameHeight = c0h6d4.getFrameHeight();
            C0H6D c0h6d5 = this.LLJZ;
            if (c0h6d5 == null) {
                c0h6d5 = null;
            }
            int frameWidth = c0h6d5.getFrameWidth();
            int iCeil = (int) Math.ceil(((double) (C12ES.LJIIJ(activityRequireActivity) - (this.LLJJJJLIIL.LJIIJJI * 2))) / ((double) frameWidth));
            C0H6D c0h6d6 = this.LLJZ;
            if (c0h6d6 == null) {
                c0h6d6 = null;
            }
            c0h6d6.setCoverSize(iCeil);
            if (this.LLJJJIL.isMvThemeVideoType()) {
                final C810503Ep c810503Ep = new C810503Ep(frameWidth, frameHeight);
                MvChooseCoverBitmapCreator mvChooseCoverBitmapCreator = new MvChooseCoverBitmapCreator();
                mvChooseCoverBitmapCreator.setMvThemeVideoCoverErrorListener(new InterfaceC1457180o1U() { // from class: X.0ETh
                    @Override // X.InterfaceC1457180o1U
                    public final void onError(int i2, String str) {
                        C201955140j.LJII(C20012313Rx.LIZIZ, str);
                    }
                });
                mvChooseCoverBitmapCreator.setImgSize(frameWidth, frameHeight);
                C0H6D c0h6d7 = this.LLJZ;
                if (c0h6d7 == null) {
                    c0h6d7 = null;
                }
                InterfaceC20597015ii interfaceC20597015iiLIZLLL = C20622515mp.LIZLLL(c0h6d7);
                if (interfaceC20597015iiLIZLLL != null) {
                    interfaceC20597015iiLIZLLL.Ss("getIntent", new C365140ETg(mvChooseCoverBitmapCreator, interfaceC20597015iiLIZLLL, activityRequireActivity, this, iCeil, c810503Ep));
                    c0fpb = c810503Ep;
                } else {
                    mvChooseCoverBitmapCreator.getBitmapList(activityRequireActivity, this.LLJJLIIIJLLLLLLLZ, iCeil, new InterfaceC741260T5w() { // from class: X.0ETj
                        @Override // X.InterfaceC741260T5w
                        public final void LIZ(List<Bitmap> list) {
                            c810503Ep.LLLFZ(list);
                        }
                    });
                    c0fpb = c810503Ep;
                }
            } else {
                InterfaceC1452170ntP interfaceC1452170ntP = this.LLJJLIIIJLLLLLLLZ;
                C0H6D c0h6d8 = this.LLJZ;
                if (c0h6d8 == null) {
                    c0h6d8 = null;
                }
                int coverSize = c0h6d8.getCoverSize();
                if (C1446620nkS.LIZ()) {
                    get_frames_flags = VEEditor.GET_FRAMES_FLAGS.GET_FRAMES_MODE_NORMAL;
                } else {
                    get_frames_flags = VEEditor.GET_FRAMES_FLAGS.GET_FRAMES_MODE_NOEFFECT;
                }
                this.LLLIZZ = new C19560811fy(new VEVideoCoverGeneratorImpl(interfaceC1452170ntP, this, coverSize, get_frames_flags, "ai_music"), frameWidth, frameHeight, iCeil);
                c0fpb = new C0FPB(this.LLLIZZ, frameWidth, frameHeight);
            }
            C0H6D c0h6d9 = this.LLJZ;
            C0H6D c0h6d10 = c0h6d9;
            if (c0h6d9 == null) {
                c0h6d10 = null;
            }
            c0h6d10.setAdapter(c0fpb);
        }
        ImageView imageView = (ImageView) requireViewById(R.id.le2);
        imageView.setOnTouchListener(new View.OnTouchListener() { // from class: X.0ETk
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return false;
            }
        });
        ((ViewGroup.MarginLayoutParams) imageView.getLayoutParams()).setMarginStart(this.LLJJJJLIIL.LJIIJJI - (imageView.getLayoutParams().width / 2));
        this.LLL = imageView;
        C365200ETm c365200ETm = new C365200ETm(this.LLJJJJLIIL, this.LLJJL, requireSceneContext(), this.LLJL);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 16;
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c365200ETm);
        c365200ETm.setLayoutParams(layoutParams);
        ImageView imageView2 = this.LLL;
        if (imageView2 == null) {
            imageView2 = null;
        }
        c365200ETm.setCursor$tools_camera_edit_release(imageView2);
        ImageView imageView3 = this.LLL;
        if (imageView3 == null) {
            imageView3 = null;
        }
        c365200ETm.setOnTouchListener(new ViewOnTouchListenerC365210ETn(c365200ETm, imageView3));
        this.LLLILZJ = c365200ETm;
        FrameLayout frameLayout2 = this.LLJLLL;
        if (frameLayout2 == null) {
            frameLayout2 = null;
        }
        boolean z = true;
        frameLayout2.addView(c365200ETm, 1);
        C113Z c113z = new C113Z(this.LLJJJIL, C372650EjH.LIZIZ(this), requireSceneContext(), this.LLJJJJ, this.LLJJJJJIL, this.LLJJLIIIJLLLLLLLZ, C0CHQ.LIZ().getAccountService());
        this.LLLILZ = c113z;
        LinearLayout linearLayout2 = this.LLJZIJLIL;
        if (linearLayout2 == null) {
            linearLayout2 = null;
        }
        linearLayout2.addView(c113z);
        TuxIconView tuxIconView7 = this.LLLF;
        if (tuxIconView7 != null) {
            tuxIconView = tuxIconView7;
        }
        if (tuxIconView.getVisibility() != 0) {
            z = false;
        }
        LLLLLLL(z);
        C1654320t9S.LIZIZ(this, AFwS234S0000000_5.get$arr$(32));
        C1664590tQ1.LIZLLL(this, "EditEffectSceneV2", false, AFwS234S0000000_5.get$arr$(33), 2);
        C1664600tQ2.LIZ(this, "EditEffectSceneV2", new AwS584S0100000_5(this, 63));
        Function1<Function0<Boolean>, Unit> function1 = LLLLIL().LJIIIZ;
        if (function1 != null) {
            function1.invoke(new AwS549S0100000_5(this, 74));
        }
        C1426800nEU c1426800nEU = this.LLLILZLLLI;
        if (c1426800nEU != null) {
            c1426800nEU.Eb(new InterfaceC1426650nEF() { // from class: X.0EPS
                @Override // X.InterfaceC1426650nEF
                public final boolean LIZJ(EffectModel effectModel) {
                    return false;
                }

                @Override // X.InterfaceC1426650nEF
                public final boolean LJ(EffectModel effectModel, int i2, String str, boolean z2, String str2, String str3) {
                    return false;
                }

                @Override // X.InterfaceC1426650nEF
                public final boolean LIZLLL(EffectModel effectModel, int i2, boolean z2) {
                    C113Z c113z2 = this.LIZ.LLLILZ;
                    C113Z c113z3 = null;
                    if (c113z2 == null) {
                        c113z2 = null;
                    }
                    c113z2.i0(effectModel);
                    EffectSearchModel effectSearchModel = effectModel.searchModel;
                    if (effectSearchModel != null) {
                        effectSearchModel.setAppliedFromSearchPanel(Boolean.TRUE);
                    }
                    boolean zLIZLLL = this.LIZ.LLJJJJJIL.LIZLLL(effectModel, 1, false);
                    EffectSearchModel effectSearchModel2 = effectModel.searchModel;
                    if (effectSearchModel2 != null) {
                        effectSearchModel2.setAppliedFromSearchPanel(Boolean.FALSE);
                    }
                    if (zLIZLLL) {
                        C113Z c113z4 = this.LIZ.LLLILZ;
                        if (c113z4 == null) {
                            c113z4 = null;
                        }
                        c113z4.F0("trending02");
                        C113Z c113z5 = this.LIZ.LLLILZ;
                        if (c113z5 == null) {
                            c113z5 = null;
                        }
                        c113z5.z0(effectModel);
                        List<String> listInvoke = this.LIZ.LLLLIL().LJIIJ.invoke();
                        C113Z c113z6 = this.LIZ.LLLILZ;
                        if (c113z6 != null) {
                            c113z3 = c113z6;
                        }
                        c113z3.p0(listInvoke);
                        return zLIZLLL;
                    }
                    C113Z c113z7 = this.LIZ.LLLILZ;
                    if (c113z7 != null) {
                        c113z3 = c113z7;
                    }
                    c113z3.n0(effectModel);
                    return zLIZLLL;
                }
            });
        }
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.0EQ5
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C364260EPw) obj).LIZ;
            }
        }, Lifecycle.State.CREATED, new AwS584S0100000_5(this, 98));
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.0EQW
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C364260EPw) obj).LJ;
            }
        }, Lifecycle.State.STARTED, new AwS584S0100000_5(this, 102));
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.0EQ1
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C364260EPw) obj).LIZIZ);
            }
        }, Lifecycle.State.STARTED, new AwS584S0100000_5(this, 103));
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.0EQ2
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C364260EPw) obj).LIZJ;
            }
        }, Lifecycle.State.STARTED, new AwS584S0100000_5(this, 52));
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.0EPz
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C364260EPw) obj).LIZLLL);
            }
        }, Lifecycle.State.STARTED, new AwS584S0100000_5(this, 56));
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.0EQX
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Integer.valueOf(((C364260EPw) obj).LJII);
            }
        }, Lifecycle.State.STARTED, new AwS584S0100000_5(this, 60));
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.0EQF
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C364260EPw) obj).LJIIZILJ;
            }
        }, Lifecycle.State.STARTED, new C365120ETe(this));
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.0EQ0
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C364260EPw) obj).LJIJ);
            }
        }, Lifecycle.State.STARTED, new AwS584S0100000_5(this, 64));
        AbstractC1664490tPr.LLLLLILLIL(this, LLLLILI(), new C2217381BqS() { // from class: X.0EQ6
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C364260EPw) obj).LJIILJJIL;
            }
        }, new C365110ETd(this));
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.0EQ9
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C364260EPw) obj).LJIILL;
            }
        }, Lifecycle.State.STARTED, new AwS584S0100000_5(this, 72));
        AbstractC1664490tPr.LLLLLILLIL(this, LLLLILI(), new C2217381BqS() { // from class: X.0EQB
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C364260EPw) obj).LJIIL;
            }
        }, new AwS584S0100000_5(this, 94));
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.0EQC
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C364260EPw) obj).LJIIJJI;
            }
        }, Lifecycle.State.STARTED, new AwS584S0100000_5(this, 97));
        AbstractC1664490tPr.LLLLLILLIL(this, LLLLILI(), new C2217381BqS() { // from class: X.0EQD
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C364260EPw) obj).LJIILIIL;
            }
        }, new AwS584S0100000_5(this, 101));
        AbstractC1664490tPr.LLLLLILLIL(this, LLLLILI(), new C2217381BqS() { // from class: X.0EQE
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C364260EPw) obj).LJIIIZ;
            }
        }, new AwS584S0100000_5(this, 48));
        AbstractC1664490tPr.LLLLLILLIL(this, LLLLILI(), new C2217381BqS() { // from class: X.0EQ3
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C364260EPw) obj).LJIIJ;
            }
        }, new AwS584S0100000_5(this, 50));
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.0EPy
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C364260EPw) obj).LJFF);
            }
        }, Lifecycle.State.STARTED, new AwS584S0100000_5(this, 53));
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.0EPv
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C364260EPw) obj).LJI;
            }
        }, Lifecycle.State.STARTED, new AwS584S0100000_5(this, 57));
        AbstractC1664490tPr.LLLLLILLIL(this, LLLLILI(), new C2217381BqS() { // from class: X.0EQG
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C364260EPw) obj).LJIIIIZZ;
            }
        }, new AwS584S0100000_5(this, 61));
        AbstractC1664490tPr.LLLLLILLIL(this, LLLLILI(), new C2217381BqS() { // from class: X.0EQ4
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C364260EPw) obj).LJIJI;
            }
        }, new AwS584S0100000_5(this, 65));
        AbstractC1664490tPr.LLLLLILLIL(this, LLLLILI(), new C2217381BqS() { // from class: X.0EQ7
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C364260EPw) obj).LJIJJ;
            }
        }, new AwS584S0100000_5(this, 69));
        AbstractC1664490tPr.LLLLLILLIL(this, LLLLILI(), new C2217381BqS() { // from class: X.0EQ8
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C364260EPw) obj).LJIJJLI;
            }
        }, new AwS584S0100000_5(this, 70));
        AbstractC1664490tPr.LLLLLILLIL(this, LLLLILI(), new C2217381BqS() { // from class: X.0EQA
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C364260EPw) obj).LJIL;
            }
        }, new AwS584S0100000_5(this, 93));
        C1426800nEU c1426800nEU2 = this.LLLILZLLLI;
        if (c1426800nEU2 != null) {
            c1426800nEU2.VB(new AwS619S0100000_5(this, 2));
        }
        C1426800nEU c1426800nEU3 = this.LLLILZLLLI;
        if (c1426800nEU3 != null) {
            c1426800nEU3.lB0(new AwS549S0100000_5(this, 90));
        }
    }

    public static void LLLLLL(TuxIconView tuxIconView, boolean z) {
        int i;
        tuxIconView.setEnabled(z);
        if (z) {
            i = R.attr.ee;
        } else {
            i = R.attr.ei;
        }
        tuxIconView.setTintColorRes(i);
    }

    public final void LLLLLLIL(String str, String str2) {
        if (str.length() == 0) {
            LLLLLJIL();
            return;
        }
        C113Z c113z = this.LLLILZ;
        if (c113z == null) {
            c113z = null;
        }
        c113z.B0(str, str2);
        C1426800nEU c1426800nEU = this.LLLILZLLLI;
        if (c1426800nEU == null) {
            return;
        }
        c1426800nEU.IH(str);
    }

    public final void LLLLLLJ(UrlModel urlModel, String str) {
        LinearLayout linearLayout = this.LLLIIII;
        C1322110kVd c1322110kVd = null;
        if (linearLayout == null) {
            linearLayout = null;
        }
        C786410Ut5.LJZL(0, linearLayout);
        TuxTextView tuxTextView = this.LLLIIIIL;
        if (tuxTextView == null) {
            tuxTextView = null;
        }
        tuxTextView.setText(str);
        C1322110kVd c1322110kVd2 = this.LLLIIIL;
        if (c1322110kVd2 == null) {
            c1322110kVd2 = null;
        }
        C786410Ut5.LLZZLLIL(c1322110kVd2, 0);
        TuxTextView tuxTextView2 = this.LLLIIIIL;
        if (tuxTextView2 == null) {
            tuxTextView2 = null;
        }
        C786410Ut5.LLLLZLL(tuxTextView2, 0);
        C1322110kVd c1322110kVd3 = this.LLLIIIL;
        if (c1322110kVd3 != null) {
            c1322110kVd = c1322110kVd3;
        }
        C1324750kZt.LJFF(c1322110kVd, urlModel);
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, X.C19A3, com.bytedance.scene.Scene
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return (ViewGroup) C786410Ut5.Td(layoutInflater, R.layout.by_, viewGroup, false);
    }

    public C365100ETc(VideoPublishEditModel videoPublishEditModel, C113G c113g, C361760EGg c361760EGg, C365260ETs c365260ETs, C0EPU c0epu, InterfaceC1452170ntP interfaceC1452170ntP, C356830Dyr c356830Dyr) {
        this.LLJJJIL = videoPublishEditModel;
        this.LLJJJJ = c113g;
        this.LLJJJJJIL = c361760EGg;
        this.LLJJJJLIIL = c365260ETs;
        this.LLJJL = c0epu;
        this.LLJJLIIIJLLLLLLLZ = interfaceC1452170ntP;
        this.LLJL = c356830Dyr;
    }
}
