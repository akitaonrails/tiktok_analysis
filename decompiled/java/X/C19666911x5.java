package X;

import Y.ALAdapterS3S0110000_11;
import Y.AObserverS231S0100000_29;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Vibrator;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.lifecycle.LiveData;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.shortvideo.ScreenUtils;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.tiktok.tools.performance.api.settings.LazyLoadEditLazyGroupPhase1;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS218S0000000_29;
import kotlin.jvm.internal.AwS573S0100000_29;
import kotlin.jvm.internal.AwS608S0100000_29;

/* JADX INFO: renamed from: X.11x5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19666911x5 extends Scene implements C121O, InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJ;
    public final C1DRG LLJI;
    public final boolean LLJIJIL;
    public C0S2Z LLJILJIL;
    public final C01GW LLJILJILJ;
    public final C1664740tQG LLJILLL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C19666911x5.class, "editStickerApi", "getEditStickerApi()Lcom/ss/android/ugc/gamora/editor/sticker/core/EditStickerApi;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C19666911x5.class, "model", "getModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0);
        c09r3.getClass();
        LLJJ = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    @Override // X.C121O
    public final void LJIL() {
        if (this.LLJIJIL) {
            ((LiveData) this.LLJILJILJ.getValue()).setValue(Unit.LIZ);
            return;
        }
        C0S2Z c0s2z = this.LLJILJIL;
        if (c0s2z == null) {
            c0s2z = null;
        }
        c0s2z.LJIL();
    }

    @Override // X.C121O
    public final Rect getDeleteRect() {
        C0S2Z c0s2z = this.LLJILJIL;
        if (c0s2z == null) {
            c0s2z = null;
        }
        return c0s2z.getDeleteRect();
    }

    @Override // X.C121O
    public final void hide() {
        C0S2Z c0s2z = this.LLJILJIL;
        if (c0s2z == null) {
            c0s2z = null;
        }
        c0s2z.hide();
    }

    @Override // X.InterfaceC379610EuV
    public final C1DRG getDiContainer() {
        return this.LLJI;
    }

    @Override // com.bytedance.scene.Scene
    public final void onActivityCreated(Bundle bundle) {
        C0ETY c0ety;
        Class<InterfaceC1461350o8D> cls;
        AwS608S0100000_29 awS608S0100000_29;
        super.onActivityCreated(bundle);
        if (LazyLoadEditLazyGroupPhase1.LIZ().enableLazySafeComponent) {
            ((C0ETY) this.LLJI.LJII(C0ETY.class, null)).Sd(InterfaceC1461350o8D.class, new AwS608S0100000_29(this, 430));
            return;
        }
        C1DRG c1drg = this.LLJI;
        VideoPublishEditModel videoPublishEditModel = (VideoPublishEditModel) this.LLJILLL.getValue(this, LLJJ[1]);
        if (LazyLoadEditLazyGroupPhase1.LIZ().enableMergeEPLazy) {
            c0ety = (C0ETY) c1drg.LJII(C0ETY.class, null);
            cls = InterfaceC1461350o8D.class;
            awS608S0100000_29 = new AwS608S0100000_29(this, 428);
        } else if (C365940EWi.LIZLLL(videoPublishEditModel)) {
            c0ety = (C0ETY) c1drg.LJII(C0ETY.class, null);
            cls = InterfaceC1461350o8D.class;
            awS608S0100000_29 = new AwS608S0100000_29(this, 429);
        } else {
            InterfaceC1461350o8D interfaceC1461350o8D = (InterfaceC1461350o8D) ((C05YF) c1drg.LJIIL(null, InterfaceC1461350o8D.class));
            if (interfaceC1461350o8D == null) {
                return;
            }
            interfaceC1461350o8D.f61(new AwS573S0100000_29(this, 709));
            return;
        }
        c0ety.Sd(cls, awS608S0100000_29);
    }

    public C19666911x5(C1DRG c1drg, boolean z) {
        this.LLJI = c1drg;
        this.LLJIJIL = z;
        C1664770tQJ.LIZIZ(c1drg, InterfaceC1461350o8D.class, null);
        this.LLJILJILJ = C452501pT.LIZIZ(AFwS218S0000000_29.get$arr$(283));
        this.LLJILLL = C1664770tQJ.LIZIZ(c1drg, VideoPublishEditModel.class, null);
    }

    @Override // com.bytedance.scene.Scene
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C0S2Z c0s2z;
        int i;
        if (C390650FTj.LIZ()) {
            final Context contextRequireSceneContext = requireSceneContext();
            c0s2z = new C0S2Z(contextRequireSceneContext) { // from class: X.0S2a
                public static final /* synthetic */ int LLJJJ = 0;
                public View LLJILLL;
                public C1295960jpS LLJJ;
                public boolean LLJJI;
                public boolean LLJJIII;
                public boolean LLJJIJI;
                public final Vibrator LLJJIJIIJIL;
                public int LLJJIJIL;

                @Override // X.C0S2Z
                public View getContentView() {
                    return this;
                }

                private final void LIZJ() {
                    View view = this.LLJILLL;
                    if (view == null || view.getVisibility() != 0) {
                        return;
                    }
                    LJFF(view, false, true);
                }

                @Override // X.C0S2Z, X.C121O
                public Rect getDeleteRect() {
                    return new Rect(getLeft(), getTop() - this.LLJILJIL, getRight(), getBottom() - this.LLJILJIL);
                }

                @Override // X.C0S2Z, X.C121O
                public final void LJIL() {
                    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) getLayoutParams();
                    layoutParams.bottomMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(C387980FJc.LIZ(getContext()) ? 8 : 56)));
                    ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
                    setLayoutParams(layoutParams);
                }

                @Override // X.C0S2Z, X.C121O
                public final void hide() {
                    LIZJ();
                    this.LLJJIII = false;
                }

                {
                    super(contextRequireSceneContext);
                    View viewSd = C786410Ut5.Sd(R.layout.faf, C786410Ut5.ne(contextRequireSceneContext), null);
                    this.LLJILLL = viewSd;
                    if (viewSd != null) {
                        C786410Ut5.LJLLLLLL(8, viewSd);
                    }
                    View view = this.LLJILLL;
                    this.LLJJ = view != null ? (C1295960jpS) view.findViewById(R.id.yjh) : null;
                    addView(this.LLJILLL);
                    this.LLJJIJIIJIL = (Vibrator) C786410Ut5.H2(contextRequireSceneContext, "vibrator");
                }

                public static void LJFF(View view, boolean z, boolean z2) {
                    ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, "alpha", !z ? 1 : 0, z ? 1.0f : 0.0f);
                    objectAnimatorOfFloat.setDuration(200L);
                    objectAnimatorOfFloat.setInterpolator(C1619980sG4.LJII());
                    objectAnimatorOfFloat.addListener(new ALAdapterS3S0110000_11(view, z2, 3));
                    C786410Ut5.Pd(objectAnimatorOfFloat);
                }

                @Override // X.C0S2Z
                public final int LJ(int i2, int i3, boolean z) {
                    Rect deleteRect = getDeleteRect();
                    if (z) {
                        if (deleteRect.contains(i2, i3)) {
                            LIZJ();
                            if (this.LLJJI) {
                                C1295960jpS c1295960jpS = this.LLJJ;
                                if (c1295960jpS != null) {
                                    c1295960jpS.setMinAndMaxProgress(0.24528302f, 1.0f);
                                }
                                C1295960jpS c1295960jpS2 = this.LLJJ;
                                if (c1295960jpS2 != null) {
                                    c1295960jpS2.playAnimation();
                                }
                                this.LLJJI = false;
                            }
                            if (this.LLJJIJIL == 1) {
                                return 2;
                            }
                            return -1;
                        }
                        LIZJ();
                        this.LLJJIII = false;
                        return -1;
                    }
                    if (deleteRect.contains(i2, i3)) {
                        if (!this.LLJJIII) {
                            if (!this.LLJJI) {
                                C1295960jpS c1295960jpS3 = this.LLJJ;
                                if (c1295960jpS3 != null) {
                                    c1295960jpS3.setMinAndMaxProgress(0.0f, 0.23584905f);
                                }
                                C1295960jpS c1295960jpS4 = this.LLJJ;
                                if (c1295960jpS4 != null) {
                                    c1295960jpS4.playAnimation();
                                }
                                this.LLJJI = true;
                            }
                            this.LLJJIII = true;
                        }
                        return 1;
                    }
                    View view = this.LLJILLL;
                    if (view != null && view.getVisibility() == 8) {
                        C1295960jpS c1295960jpS5 = this.LLJJ;
                        if (c1295960jpS5 != null) {
                            c1295960jpS5.setMinAndMaxProgress(1.0f, 1.0f);
                        }
                        C786410Ut5.LJLLLLLL(0, view);
                        LJFF(view, true, false);
                    }
                    if (this.LLJJIII) {
                        if (this.LLJJI) {
                            C1295960jpS c1295960jpS6 = this.LLJJ;
                            if (c1295960jpS6 != null) {
                                c1295960jpS6.setMinAndMaxProgress(0.24528302f, 1.0f);
                            }
                            C1295960jpS c1295960jpS7 = this.LLJJ;
                            if (c1295960jpS7 != null) {
                                c1295960jpS7.playAnimation();
                            }
                            this.LLJJI = false;
                        }
                        this.LLJJIII = false;
                        return 3;
                    }
                    return -1;
                }

                @Override // X.C0S2Z, X.C121O
                public final int LJJJJL(int i2, int i3, boolean z, boolean z2) {
                    int iLJ;
                    if (z2) {
                        if (z) {
                            LIZJ();
                            this.LLJJIII = false;
                            this.LLJJIJI = false;
                            if (this.LLJJIJIL == 1) {
                                iLJ = 2;
                            } else {
                                iLJ = -1;
                            }
                        } else {
                            LIZJ();
                            this.LLJJIII = true;
                            iLJ = 1;
                        }
                    } else {
                        iLJ = LJ(i2, i3, z);
                    }
                    this.LLJJIJIL = iLJ;
                    if (iLJ != 1) {
                        if (iLJ != 2) {
                            if (iLJ != 3) {
                                this.LLJJIJI = false;
                                return 4;
                            }
                            Vibrator vibrator = this.LLJJIJIIJIL;
                            if (vibrator == null) {
                                return 2;
                            }
                            vibrator.vibrate(10L);
                            return 2;
                        }
                        this.LLJJIII = false;
                        this.LLJJIJI = false;
                        return 3;
                    }
                    if (!this.LLJJIJI) {
                        Vibrator vibrator2 = this.LLJJIJIIJIL;
                        if (vibrator2 != null) {
                            vibrator2.vibrate(10L);
                        }
                        this.LLJJIJI = true;
                        return 1;
                    }
                    return 0;
                }
            };
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(C415320GQg.LIZ, C415320GQg.LIZIZ);
            layoutParams.gravity = 81;
            if (C387980FJc.LIZ(contextRequireSceneContext)) {
                i = 8;
            } else {
                i = 56;
            }
            layoutParams.bottomMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(i)));
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c0s2z);
            c0s2z.setLayoutParams(layoutParams);
        } else {
            Context contextRequireSceneContext2 = requireSceneContext();
            if (contextRequireSceneContext2 == null) {
                c0s2z = null;
            } else {
                c0s2z = new C0S2Z(contextRequireSceneContext2);
                int iLIZIZ = (int) C11VU.LIZIZ(72.0f, contextRequireSceneContext2);
                FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(iLIZIZ, iLIZIZ);
                layoutParams2.topMargin = ScreenUtils.getStatusBarHeight(contextRequireSceneContext2);
                ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c0s2z);
                c0s2z.setLayoutParams(layoutParams2);
                layoutParams2.gravity = 49;
                ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c0s2z);
                c0s2z.setLayoutParams(layoutParams2);
            }
        }
        this.LLJILJIL = c0s2z;
        if (C1441980ncy.LIZIZ((VideoPublishEditModel) this.LLJILLL.getValue(this, LLJJ[1]))) {
            C0S2Z c0s2z2 = this.LLJILJIL;
            if (c0s2z2 == null) {
                c0s2z2 = null;
            }
            c0s2z2.setContainerYOffset(C1428150nGf.LIZLLL());
        }
        ((LiveData) this.LLJILJILJ.getValue()).observe(this, new AObserverS231S0100000_29(this, 115));
        C0S2Z c0s2z3 = this.LLJILJIL;
        if (c0s2z3 == null) {
            return null;
        }
        return c0s2z3;
    }

    @Override // X.C121O
    public final int LJJJJL(int i, int i2, boolean z, boolean z2) {
        C0S2Z c0s2z = this.LLJILJIL;
        if (c0s2z == null) {
            c0s2z = null;
        }
        return c0s2z.LJJJJL(i, i2, z, z2);
    }
}
