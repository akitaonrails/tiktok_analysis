package X;

import Y.AAListenerS339S0100000_29;
import Y.ACListenerS156S0100000_22;
import Y.ALAdapterS14S0200000_19;
import Y.AObjectS247S0100000_29;
import Y.AUListenerS277S0100000_29;
import Y.AUListenerS74S0101000_29;
import Y.AfS188S0100000_19;
import Y.AfS196S0100000_27;
import android.animation.ValueAnimator;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.viewpager.widget.PagerAdapter;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.image.progressbar.ImageProgressViewModel;
import com.ss.android.ugc.aweme.image.progressbar.ImagesProgressState;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.u4;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.AwS573S0100000_29;
import kotlin.jvm.internal.AwS633S0100000_19;
import kotlin.jvm.internal.AwS643S0100000_29;
import nv7.c0;

/* JADX INFO: renamed from: X.12CY, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C12CY extends Scene implements InterfaceC379610EuV, InterfaceC1171660gay {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJLLL;
    public final C1DRG LLJI;
    public final C1462760oAU LLJIJIL;
    public int LLJILJIL;
    public final boolean LLJILJILJ;
    public boolean LLJILLL;
    public final boolean LLJJ;
    public final boolean LLJJI;
    public final boolean LLJJIII;
    public InterfaceC19716212Ca LLJJIJI;
    public boolean LLJJIJIIJIL;
    public C12CZ LLJJIJIL;
    public final C1664740tQG LLJJJIL;
    public final C1664750tQH LLJJJJ;
    public final C1664740tQG LLJJJJJIL;
    public final C1664740tQG LLJJJJLIIL;
    public View LLJL;
    public InterfaceC19717212Ck LLJLIL;
    public boolean LLJLL;
    public boolean LLJLLIL;
    public final C01GW LLJJJ = C1449630npJ.LIZIZ(this, InterfaceC1455860nzM.class);
    public final C01GW LLJJL = C452501pT.LIZIZ(new AwS573S0100000_29(this, 1116));
    public boolean LLJJLIIIJLLLLLLLZ = true;
    public int LLJLILLLLZIIL = 2500;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C12CY.class, "photoLivePhotoApi", "getPhotoLivePhotoApi()Lcom/ss/android/ugc/aweme/image/livephoto/PhotoLivePlayApi;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C12CY.class, "mModel", "getMModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(C12CY.class, "imageEditThumbnailApi", "getImageEditThumbnailApi()Lcom/ss/android/ugc/aweme/image/thumbnail/ImageEditThumbnailApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS4 = new C2217381BqS(C12CY.class, "mixEditingAssetsApi", "getMixEditingAssetsApi()Lcom/ss/android/ugc/gamora/editor/mixediting/MixEditingAssetsApi;", 0);
        c09r3.getClass();
        LLJLLL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3, c2217381BqS4};
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

    public final VideoPublishEditModel LLLII() {
        return (VideoPublishEditModel) this.LLJJJJ.getValue(this, LLJLLL[1]);
    }

    public final ImageProgressViewModel LLLIIIIL() {
        return (ImageProgressViewModel) this.LLJJL.getValue();
    }

    public final void LLLIL() {
        AbstractC19484711Kz<Boolean> abstractC19484711KzRb1;
        C1450070nq1.LIZJ("ImageProgressScene", "processLivePhotoImage");
        InterfaceC1452920nuc interfaceC1452920nuc = (InterfaceC1452920nuc) this.LLJJJIL.getValue(this, LLJLLL[0]);
        if (interfaceC1452920nuc == null || (abstractC19484711KzRb1 = interfaceC1452920nuc.rb1(this.LLJILJIL)) == null) {
            return;
        }
        abstractC19484711KzRb1.LJJIIZ(new AfS196S0100000_27(this, 50), new C09JN() { // from class: X.0hhG
            @Override // X.C09JN
            public final void accept(Object obj) {
                C1C7U.LIZ("ImageProgressScene@3772.processLivePhotoImage$2");
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Debug-F isCurrentLiveModel error mssage = ");
                sbLIZ.append(((Throwable) obj).getMessage());
                C1450070nq1.LIZLLL(C2188811AlT.LIZIZ(sbLIZ));
                C1C7U.LIZIZ("ImageProgressScene@3772.processLivePhotoImage$2");
            }
        });
    }

    public final void LLLIZZ() {
        PagerAdapter adapter = this.LLJIJIL.getAdapter();
        int count = adapter != null ? adapter.getCount() : 0;
        if (!this.LLJJLIIIJLLLLLLLZ || getSceneContext() == null || count <= 0) {
            return;
        }
        int i = this.LLJILJIL;
        int i2 = (i + 1) % count;
        boolean z = i2 + (-1) == i;
        this.LLJILJIL = i2;
        InterfaceC1455860nzM interfaceC1455860nzM = (InterfaceC1455860nzM) this.LLJJJ.getValue();
        if (interfaceC1455860nzM != null) {
            interfaceC1455860nzM.tU0();
        }
        if (!z) {
            this.LLJIJIL.LLFFF(0, false);
            return;
        }
        C12CZ c12cz = this.LLJJIJIL;
        if (c12cz == null) {
            c12cz = null;
        }
        c12cz.getClass();
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, c12cz.LIZ.getWidth() - c12cz.LIZ.getPaddingLeft());
        c12cz.LIZJ = valueAnimatorOfInt;
        if (valueAnimatorOfInt != null) {
            valueAnimatorOfInt.addListener(new AAListenerS339S0100000_29(c12cz, 34));
        }
        ValueAnimator valueAnimator = c12cz.LIZJ;
        if (valueAnimator != null) {
            valueAnimator.setInterpolator(new AccelerateDecelerateInterpolator());
        }
        ValueAnimator valueAnimator2 = c12cz.LIZJ;
        if (valueAnimator2 != null) {
            valueAnimator2.addUpdateListener(new AUListenerS74S0101000_29(c12cz, 2));
        }
        ValueAnimator valueAnimator3 = c12cz.LIZJ;
        if (valueAnimator3 != null) {
            valueAnimator3.setDuration(800L);
        }
        if (c12cz.LIZ.getChildCount() > 0) {
            c12cz.LIZ.LJFF();
        }
        ValueAnimator valueAnimator4 = c12cz.LIZJ;
        if (valueAnimator4 != null) {
            valueAnimator4.start();
        }
    }

    public final void resume() {
        this.LLJJIJIIJIL = this.LLJILLL;
        this.LLJILLL = false;
        boolean z = this.LLJJLIIIJLLLLLLLZ;
        InterfaceC19716212Ca interfaceC19716212Ca = this.LLJJIJI;
        if ((interfaceC19716212Ca == null || interfaceC19716212Ca.isPaused()) && !this.LLJJIJIIJIL && isVisible() && z) {
            LLLILZ(this.LLJILJIL, 0.0f);
        }
    }

    public final void LLLILZLLLI() {
        InterfaceC19716212Ca interfaceC19716212Ca;
        AbstractC19484711Kz<Boolean> abstractC19484711KzRb1;
        if (C295670BiP.LIZ()) {
            InterfaceC1452920nuc interfaceC1452920nuc = (InterfaceC1452920nuc) this.LLJJJIL.getValue(this, LLJLLL[0]);
            if (interfaceC1452920nuc != null && (abstractC19484711KzRb1 = interfaceC1452920nuc.rb1(this.LLJILJIL)) != null) {
                abstractC19484711KzRb1.LJJIIZ(new AfS188S0100000_19(this, 87), new C09JN() { // from class: X.0hhF
                    @Override // X.C09JN
                    public final void accept(Object obj) {
                        C1C7U.LIZ("ImageProgressScene@3772.startAutoPlay$2");
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("Debug-F isCurrentLiveModel error mssage = ");
                        sbLIZ.append(((Throwable) obj).getMessage());
                        C1450070nq1.LIZLLL(C2188811AlT.LIZIZ(sbLIZ));
                        C1C7U.LIZIZ("ImageProgressScene@3772.startAutoPlay$2");
                    }
                });
            }
        } else {
            InterfaceC19716212Ca interfaceC19716212Ca2 = this.LLJJIJI;
            if (interfaceC19716212Ca2 != null) {
                interfaceC19716212Ca2.start();
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("start auto play: ");
            InterfaceC19716212Ca interfaceC19716212Ca3 = this.LLJJIJI;
            sbLIZ.append(interfaceC19716212Ca3 != null ? Boolean.valueOf(interfaceC19716212Ca3.isRunning()) : null);
            sbLIZ.append(' ');
            C1450070nq1.LIZJ("ImageProgressScene", C2188811AlT.LIZIZ(sbLIZ));
        }
        if (!this.LLJILLL || (interfaceC19716212Ca = this.LLJJIJI) == null) {
            return;
        }
        interfaceC19716212Ca.pause();
    }

    @Override // com.bytedance.scene.Scene
    public final void onPause() {
        super.onPause();
        this.LLJJIJIIJIL = true;
        LLLIILIL(false);
    }

    @Override // com.bytedance.scene.Scene
    public final void onResume() {
        super.onResume();
        resume();
    }

    @Override // com.bytedance.scene.Scene
    public final void onStop() {
        super.onStop();
        C12CZ c12cz = this.LLJJIJIL;
        if (c12cz == null) {
            c12cz = null;
        }
        ValueAnimator valueAnimator = c12cz.LIZJ;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        c12cz.LIZJ = null;
    }

    @Override // X.InterfaceC379610EuV
    public final C1DRG getDiContainer() {
        return this.LLJI;
    }

    @Override // com.bytedance.scene.Scene
    public final void LLJJL(boolean z) {
        if (this.LLJLLIL) {
            return;
        }
        this.LLJLLIL = true;
    }

    public final void LLLIILIL(boolean z) {
        InterfaceC19716212Ca interfaceC19716212Ca;
        if (z) {
            InterfaceC19716212Ca interfaceC19716212Ca2 = this.LLJJIJI;
            if (interfaceC19716212Ca2 != null) {
                interfaceC19716212Ca2.pause();
                InterfaceC19716212Ca interfaceC19716212Ca3 = this.LLJJIJI;
                if (interfaceC19716212Ca3 != null) {
                    interfaceC19716212Ca3.cancel();
                }
                InterfaceC19717212Ck interfaceC19717212Ck = null;
                this.LLJJIJI = null;
                this.LLJLILLLLZIIL = 0;
                InterfaceC19717212Ck interfaceC19717212Ck2 = this.LLJLIL;
                if (interfaceC19717212Ck2 != null) {
                    interfaceC19717212Ck = interfaceC19717212Ck2;
                }
                interfaceC19717212Ck.LIZ(this.LLJILJIL);
                return;
            }
            return;
        }
        InterfaceC19716212Ca interfaceC19716212Ca4 = this.LLJJIJI;
        if (interfaceC19716212Ca4 == null || !interfaceC19716212Ca4.isRunning() || (interfaceC19716212Ca = this.LLJJIJI) == null) {
            return;
        }
        interfaceC19716212Ca.pause();
    }

    @Override // com.bytedance.scene.Scene
    public final void onActivityCreated(Bundle bundle) {
        C422020Ggi c422020Ggi;
        int count;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        ViewGroup.MarginLayoutParams marginLayoutParams2;
        ViewGroup.MarginLayoutParams marginLayoutParams3;
        ViewGroup.MarginLayoutParams marginLayoutParams4;
        ViewGroup.MarginLayoutParams marginLayoutParams5;
        View view;
        LiveData<C1456890o11> liveDataYh;
        C444330Hbb c444330Hbb;
        int count2;
        super.onActivityCreated(bundle);
        int iLIZIZ = 0;
        if (this.LLJJ) {
            View viewRequireViewById = requireViewById(R.id.g3m);
            this.LLJL = viewRequireViewById;
            if ((viewRequireViewById instanceof C444330Hbb) && (c444330Hbb = (C444330Hbb) viewRequireViewById) != null) {
                c444330Hbb.setLightBgMode(this.LLJJI);
                c444330Hbb.setLifecycleOwner(this);
                PagerAdapter adapter = this.LLJIJIL.getAdapter();
                if (adapter != null) {
                    count2 = adapter.getCount();
                } else {
                    count2 = 2;
                }
                c444330Hbb.setCount(count2);
                c444330Hbb.setSelectedIndex(0);
                this.LLJLIL = c444330Hbb;
            }
        } else {
            View viewRequireViewById2 = requireViewById(R.id.g3k);
            this.LLJL = viewRequireViewById2;
            if ((viewRequireViewById2 instanceof C422020Ggi) && (c422020Ggi = (C422020Ggi) viewRequireViewById2) != null) {
                c422020Ggi.setLifecycleOwner(this);
                PagerAdapter adapter2 = this.LLJIJIL.getAdapter();
                if (adapter2 != null) {
                    count = adapter2.getCount();
                } else {
                    count = 2;
                }
                c422020Ggi.setCount(count);
                c422020Ggi.setSelectedIndex(0);
                if (C1462920oAk.LIZLLL() && (c422020Ggi.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
                    c0 c0Var = c0.LIZ;
                    c0Var.getClass();
                    C1660590tJZ c1660590tJZ = c0.LJFF;
                    if (c1660590tJZ != null) {
                        if (c1660590tJZ.LJII()) {
                            ViewGroup.LayoutParams layoutParams = c422020Ggi.getLayoutParams();
                            if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams5 = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
                                marginLayoutParams5.bottomMargin = (c0Var.LLJJJJLIIL() + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(69))) - c0Var.o2();
                            }
                        } else {
                            ViewGroup.LayoutParams layoutParams2 = c422020Ggi.getLayoutParams();
                            if ((layoutParams2 instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams4 = (ViewGroup.MarginLayoutParams) layoutParams2) != null) {
                                marginLayoutParams4.bottomMargin = (c0Var.LLJJJJLIIL() + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(21))) - c0Var.o2();
                            }
                        }
                    }
                }
                if (!u4.LJIL(LLLII())) {
                    if (C1462920oAk.LIZLLL()) {
                        ViewGroup.LayoutParams layoutParams3 = c422020Ggi.getLayoutParams();
                        if ((layoutParams3 instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams3) != null) {
                            ViewGroup.LayoutParams layoutParams4 = c422020Ggi.getLayoutParams();
                            if ((layoutParams4 instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams3 = (ViewGroup.MarginLayoutParams) layoutParams4) != null) {
                                iLIZIZ = marginLayoutParams3.bottomMargin - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(51));
                            }
                            marginLayoutParams2.bottomMargin = iLIZIZ;
                        }
                    } else {
                        ViewGroup.LayoutParams layoutParams5 = c422020Ggi.getLayoutParams();
                        if ((layoutParams5 instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams5) != null) {
                            marginLayoutParams.bottomMargin = (int) C12ES.LIZJ(31.0f, c422020Ggi.getContext());
                        }
                    }
                }
                this.LLJLIL = c422020Ggi;
            }
        }
        InterfaceC19717212Ck interfaceC19717212Ck = this.LLJLIL;
        if (interfaceC19717212Ck == null) {
            C571900Mbs.LIZ("Couldn't find DotIndicatorView or the cast is wrong");
        } else {
            if (this.LLJJIII) {
                interfaceC19717212Ck.show();
            }
            if ((!C1416310mxZ.LJJJJZ(LLLII())) && (view = this.LLJL) != null) {
                C786410Ut5.I7(new ACListenerS156S0100000_22(this, 64), view);
            }
        }
        if (!this.LLJILJILJ) {
            if (((Boolean) C277290Atr.LIZ.getValue()).booleanValue()) {
                C1785160wYU c1785160wYU = new C1785160wYU(new AwS563S0100000_19(this, 3361));
                ((ArrayList) c1785160wYU.LJFF).add(new AwS573S0100000_29(this, 1117));
                this.LLJJIJI = c1785160wYU;
                LLLILZLLLI();
            } else {
                ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(2500L);
                duration.setStartDelay(200L);
                duration.setRepeatCount(-1);
                duration.addListener(new ALAdapterS14S0200000_19(duration, this, 1));
                duration.addUpdateListener(new AUListenerS277S0100000_29(this, 69));
                this.LLJJIJI = new C1838200xw2(duration);
                LLLILZLLLI();
            }
        }
        this.LLJJIJIL = new C12CZ(this.LLJIJIL, new AwS573S0100000_29(this, 1115));
        this.LLJIJIL.setCurrentItem(this.LLJILJIL);
        InterfaceC1455860nzM interfaceC1455860nzM = (InterfaceC1455860nzM) this.LLJJJ.getValue();
        if (interfaceC1455860nzM != null && (liveDataYh = interfaceC1455860nzM.Yh()) != null) {
            liveDataYh.observe(this, new AObjectS247S0100000_29(this, 99));
        }
        C11EA.LJII(this, LLLIIIIL(), new C2217381BqS() { // from class: X.12Cc
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((ImagesProgressState) obj).getProgress();
            }
        }, new AwS633S0100000_19(this, 305));
        C11EA.LJII(this, LLLIIIIL(), new C2217381BqS() { // from class: X.12Cd
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((ImagesProgressState) obj).getUpdateCount();
            }
        }, new AwS643S0100000_29(this, 172));
        C11EA.LJII(this, LLLIIIIL(), new C2217381BqS() { // from class: X.12Cb
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((ImagesProgressState) obj).getPause();
            }
        }, new AwS643S0100000_29(this, 173));
        C11EA.LJII(this, LLLIIIIL(), new C2217381BqS() { // from class: X.12Ce
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((ImagesProgressState) obj).getStopAutoPlay();
            }
        }, new AwS643S0100000_29(this, 174));
        C11EA.LJII(this, LLLIIIIL(), new C2217381BqS() { // from class: X.12Cf
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((ImagesProgressState) obj).getLiveModeChanged();
            }
        }, new AwS643S0100000_29(this, 175));
        C11EA.LJII(this, LLLIIIIL(), new C2217381BqS() { // from class: X.12Cg
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((ImagesProgressState) obj).getResume();
            }
        }, new AwS643S0100000_29(this, 176));
        C11EA.LJII(this, LLLIIIIL(), new C2217381BqS() { // from class: X.12Ch
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((ImagesProgressState) obj).getViewState();
            }
        }, new AwS643S0100000_29(this, 177));
        C11EA.LJII(this, LLLIIIIL(), new C2217381BqS() { // from class: X.12Ci
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((ImagesProgressState) obj).getAnimViewState();
            }
        }, new AwS643S0100000_29(this, 178));
        C11EA.LJII(this, LLLIIIIL(), new C2217381BqS() { // from class: X.12Cj
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((ImagesProgressState) obj).getBottomMargin();
            }
        }, new AwS643S0100000_29(this, 179));
    }

    public final void LLLILZ(int i, float f) {
        InterfaceC19716212Ca interfaceC19716212Ca;
        this.LLJILJIL = i;
        InterfaceC19717212Ck interfaceC19717212Ck = null;
        if (this.LLJLILLLLZIIL == 0) {
            InterfaceC19717212Ck interfaceC19717212Ck2 = this.LLJLIL;
            if (interfaceC19717212Ck2 != null) {
                interfaceC19717212Ck = interfaceC19717212Ck2;
            }
            interfaceC19717212Ck.LIZ(i);
        } else {
            InterfaceC19717212Ck interfaceC19717212Ck3 = this.LLJLIL;
            if (interfaceC19717212Ck3 != null) {
                interfaceC19717212Ck = interfaceC19717212Ck3;
            }
            interfaceC19717212Ck.LIZ(i);
        }
        InterfaceC19716212Ca interfaceC19716212Ca2 = this.LLJJIJI;
        if (interfaceC19716212Ca2 != null) {
            interfaceC19716212Ca2.cancel();
        }
        InterfaceC19716212Ca interfaceC19716212Ca3 = this.LLJJIJI;
        if (interfaceC19716212Ca3 != null) {
            interfaceC19716212Ca3.start();
        }
        if (this.LLJJIJIIJIL && (interfaceC19716212Ca = this.LLJJIJI) != null) {
            interfaceC19716212Ca.pause();
        }
    }

    @Override // X.C11E9
    public final <VM1 extends JediViewModel<S1>, S1 extends C004I, R> R withState(VM1 vm1, Function1<? super S1, ? extends R> function1) {
        return function1.invoke(vm1.FQ2());
    }

    @Override // com.bytedance.scene.Scene
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i;
        if (this.LLJJ) {
            i = R.layout.eqm;
        } else {
            i = R.layout.eql;
        }
        return C786410Ut5.Td(layoutInflater, i, viewGroup, false);
    }

    @Override // X.C11E9
    public final <S extends C004I> InterfaceC420801kM subscribe(JediViewModel<S> jediViewModel, C1765020w20<S> c1765020w20, Function2<? super InterfaceC960503pD, ? super S, Unit> function2) {
        return C11EA.LJIIJJI(this, jediViewModel, c1765020w20, function2);
    }

    @Override // X.C11E9
    public final <S extends C004I, A> InterfaceC420801kM selectSubscribe(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, C1765020w20<C11EC<A>> c1765020w20, Function2<? super InterfaceC960503pD, ? super A, Unit> function2) {
        return C11EA.LJI(this, jediViewModel, interfaceC2217241BqE, c1765020w20, function2);
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

    public C12CY(C1DRG c1drg, C1462760oAU c1462760oAU, int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.LLJI = c1drg;
        this.LLJIJIL = c1462760oAU;
        this.LLJILJIL = i;
        this.LLJILJILJ = z;
        this.LLJILLL = z2;
        this.LLJJ = z3;
        this.LLJJI = z4;
        this.LLJJIII = z5;
        this.LLJJJIL = C1664770tQJ.LIZIZ(c1drg, InterfaceC1452920nuc.class, null);
        this.LLJJJJ = C1664770tQJ.LIZ(c1drg, VideoPublishEditModel.class, null);
        this.LLJJJJJIL = C1664770tQJ.LIZIZ(c1drg, InterfaceC1441090nbX.class, null);
        this.LLJJJJLIIL = C1664770tQJ.LIZIZ(c1drg, InterfaceC1414530muh.class, null);
    }
}
