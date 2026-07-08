package X;

import Y.ACListenerS156S0100000_22;
import Y.AObjectS245S0100000_22;
import Y.ARunnableS122S0100000_22;
import Y.ARunnableS33S0101000_22;
import Y.ATListenerS455S0100000_22;
import android.animation.Animator;
import android.content.Context;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.scene.Scene;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import com.ss.android.ugc.aweme.music.model.MatchedPGCSoundInfo;
import com.ss.android.ugc.aweme.setting.performance.videoquality.HDRCameraConfig;
import com.ss.android.ugc.aweme.shortvideo.SafeHandler;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContextViewModel;
import com.ss.android.ugc.aweme.shortvideo.model.ShootExtraData;
import com.zhiliaoapp.musically.R;
import java.util.Arrays;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS210S0000000_22;
import kotlin.jvm.internal.AwS566S0100000_22;
import kotlin.jvm.internal.Intrinsics;
import u4.q0;

/* JADX INFO: renamed from: X.0o4I, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1458920o4I extends Scene implements InterfaceC1166920gTK {
    public final C1458930o4J LLJI;
    public final C385670FAf<Boolean> LLJIJIL;
    public final InterfaceC1624480sNK LLJILJIL;
    public final ShortVideoContext LLJILJILJ;
    public final boolean LLJILLL;
    public final boolean LLJJ;
    public C1458950o4L LLJJIII;
    public C0P0T LLJJIJI;
    public ShortVideoContextViewModel LLJJIJIIJIL;
    public TuxIconView LLJJIJIL;
    public TuxIconView LLJJJ;
    public TuxTextView LLJJJIL;
    public RelativeLayout LLJJJJ;
    public View LLJJJJJIL;
    public Animator LLJJJJLIIL;
    public View LLJJL;
    public boolean LLJJLIIIJLLLLLLLZ;
    public Long LLJL;
    public String LLJLIL;
    public C1457840o2Y LLJLILLLLZIIL;
    public final C01GW LLJZ;
    public final int LLJZIJLIL;
    public final boolean LLJJI = true;
    public final C01GW LLJLL = C452501pT.LIZIZ(new AwS566S0100000_22(this, 797));
    public final C01GW LLJLLIL = C452501pT.LIZIZ(new AwS566S0100000_22(this, 796));
    public final C01GW LLJLLL = C452501pT.LIZIZ(AFwS210S0000000_22.get$arr$(277));

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

    public final String LLLIIIIL() {
        String str = this.LLJILJILJ.creativeModel.initialModel.dmCameraModel.receiverNickname;
        return str == null ? "" : str;
    }

    public final SafeHandler LLLIILIL() {
        return (SafeHandler) this.LLJLL.getValue();
    }

    public final void LLLILZLLLI() {
        ShootExtraData shootExtraData;
        Pair<AVMusic, String> pairLIZJ = this.LLJI.LJI.LIZJ();
        if (pairLIZJ == null || (!(((Number) C298080BmI.LIZ.getValue()).intValue() == 2 && (shootExtraData = this.LLJILJILJ.creativeFlowData.getShootExtraData()) != null && Intrinsics.LJFF(shootExtraData.getDownloadMusicInBackground(), Boolean.TRUE)) ? pairLIZJ.getFirst() != null : this.LLJILJILJ.creativeModel.musicBuzModel.isMDPMusicDownloadFinished) || this.LLJILJILJ.LJJJJZ() || ((this.LLJILJILJ.LJJJJLL() && this.LLJILJILJ.LJJZ()) || Intrinsics.LJFF(this.LLJI.LJFF.LIZJ(), Boolean.FALSE))) {
            C1457840o2Y c1457840o2Y = this.LLJLILLLLZIIL;
            if (c1457840o2Y != null) {
                c1457840o2Y.LJ(EnumC1457890o2d.DARK_COLOR_WITHOUT_CANCEL_BUTTON);
            }
        } else {
            C1457840o2Y c1457840o2Y2 = this.LLJLILLLLZIIL;
            if (c1457840o2Y2 != null) {
                c1457840o2Y2.LJ(EnumC1457890o2d.DARK_COLOR_WITH_CANCEL_BUTTON);
            }
        }
        C1457840o2Y c1457840o2Y3 = this.LLJLILLLLZIIL;
        if (c1457840o2Y3 != null) {
            c1457840o2Y3.LIZLLL();
        }
    }

    public final void LLLIZZ() {
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZ = R.raw.icon_paperplane_fill;
        c419910GdJ.LJ = Integer.valueOf(R.attr.ee);
        c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
        c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
        TuxIconView tuxIconView = this.LLJJIJIL;
        if (tuxIconView != null) {
            tuxIconView.setTuxIcon(c419910GdJ);
        }
        TuxIconView tuxIconView2 = this.LLJJJ;
        if (tuxIconView2 != null) {
            tuxIconView2.setTuxIcon(c419910GdJ);
        }
    }

    @Override // com.bytedance.scene.Scene
    public final void onDestroyView() {
        super.onDestroyView();
        Animator animator = this.LLJJJJLIIL;
        if (animator != null) {
            animator.cancel();
        }
    }

    @Override // com.bytedance.scene.Scene
    public final void onResume() {
        C427250Gp9 chooseMusicTextView;
        super.onResume();
        TuxTextView tuxTextView = this.LLJJJIL;
        if (tuxTextView != null) {
            tuxTextView.requestFocus();
        }
        C1457840o2Y c1457840o2Y = this.LLJLILLLLZIIL;
        if (c1457840o2Y == null || (chooseMusicTextView = c1457840o2Y.getChooseMusicTextView()) == null) {
            return;
        }
        chooseMusicTextView.requestFocus();
    }

    public final String LLLII(AVMusic aVMusic) {
        String title;
        int i = C1419700n32.LIZ[C1418630n1J.LIZ(aVMusic).ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    return this.mView.getContext().getString(2131839043, aVMusic.authorName);
                }
                throw new C1954807lC();
            }
            MatchedPGCSoundInfo matchedPGCSoundInfo = aVMusic.getMatchedPGCSoundInfo();
            if (matchedPGCSoundInfo != null && (title = matchedPGCSoundInfo.getTitle()) != null) {
                return title;
            }
            return "";
        }
        String name = aVMusic.getName();
        if (name != null) {
            return name;
        }
        return "";
    }

    public final void LLLIL(boolean z) {
        int i;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        View view = this.LLJJL;
        if (view != null) {
            C786410Ut5.LJLLLLLL(i, view);
        }
        C1457840o2Y c1457840o2Y = this.LLJLILLLLZIIL;
        if (c1457840o2Y != null) {
            c1457840o2Y.LIZJ(z);
        }
        C1457840o2Y c1457840o2Y2 = this.LLJLILLLLZIIL;
        if (c1457840o2Y2 != null) {
            c1457840o2Y2.setUpCutVisibilityAB(false);
        }
    }

    public final void LLLILZ(boolean z) {
        C1457840o2Y c1457840o2Y = this.LLJLILLLLZIIL;
        if (c1457840o2Y != null) {
            if (z) {
                C427250Gp9 chooseMusicTextView = c1457840o2Y.getChooseMusicTextView();
                if (chooseMusicTextView != null) {
                    int visibility = chooseMusicTextView.getVisibility();
                    chooseMusicTextView.setVisibility(0);
                    C1602160rnK.LIZIZ(visibility, 0, chooseMusicTextView);
                }
                LLLIILIL().postDelayed(new ARunnableS122S0100000_22(c1457840o2Y, 89), 100L);
                return;
            }
            C427250Gp9 chooseMusicTextView2 = c1457840o2Y.getChooseMusicTextView();
            if (chooseMusicTextView2 == null) {
                return;
            }
            int visibility2 = chooseMusicTextView2.getVisibility();
            chooseMusicTextView2.setVisibility(8);
            C1602160rnK.LIZIZ(visibility2, 8, chooseMusicTextView2);
            return;
        }
        if (z && this.LLJJI) {
            TuxTextView tuxTextView = this.LLJJJIL;
            if (tuxTextView != null) {
                C786410Ut5.LLLLZLL(tuxTextView, 0);
            }
            LLLIILIL().post(new ARunnableS122S0100000_22(this, 90));
            return;
        }
        TuxTextView tuxTextView2 = this.LLJJJIL;
        if (tuxTextView2 == null) {
            return;
        }
        C786410Ut5.LLLLZLL(tuxTextView2, 8);
    }

    @Override // com.bytedance.scene.Scene
    public final void onViewCreated(View view, Bundle bundle) {
        C1457840o2Y c1457840o2Y;
        Typeface typefaceLIZIZ;
        TuxTextView tuxTextView;
        final boolean z;
        ShortVideoContextViewModel shortVideoContextViewModel;
        Integer numLIZJ;
        TuxTextView tuxTextView2;
        int iIntValue;
        super.onViewCreated(view, bundle);
        this.LLJJJJ = (RelativeLayout) findViewById(R.id.top);
        this.LLJJIJIL = (TuxIconView) findViewById(R.id.lbm);
        this.LLJJJ = (TuxIconView) findViewById(R.id.dsq);
        TuxTextView tuxTextView3 = (TuxTextView) findViewById(R.id.tv_top_text);
        this.LLJJJIL = tuxTextView3;
        if (this.LLJJ) {
            if (tuxTextView3 != null) {
                tuxTextView3.setText(C786410Ut5.j4(getString(2131831012), Arrays.copyOf(new Object[]{LLLIIIIL()}, 1)));
            }
            LLLIZZ();
            C421130GfH c421130GfH = (C421130GfH) findViewById(R.id.dsl);
            if (c421130GfH != null) {
                c421130GfH.setRadius(100);
                Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.zg, (Context) this.LLJLLIL.getValue());
                if (numLIZJ2 != null) {
                    iIntValue = numLIZJ2.intValue();
                } else {
                    iIntValue = -12303292;
                }
                c421130GfH.setBackgroundColor(iIntValue);
            }
        } else {
            if (tuxTextView3 != null) {
                tuxTextView3.setText(2131848068);
            }
            if (((Boolean) this.LLJLLL.getValue()).booleanValue()) {
                TuxIconView tuxIconView = this.LLJJIJIL;
                if (tuxIconView != null) {
                    tuxIconView.setIconRes(this.LLJZIJLIL);
                }
                TuxIconView tuxIconView2 = this.LLJJJ;
                if (tuxIconView2 != null) {
                    tuxIconView2.setIconRes(this.LLJZIJLIL);
                }
            }
        }
        if (((Number) C280770AzT.LIZ.getValue()).intValue() == 2 && (tuxTextView2 = this.LLJJJIL) != null) {
            tuxTextView2.setEllipsize(TextUtils.TruncateAt.END);
        }
        this.LLJJJJJIL = findViewById(R.id.lbp);
        View viewFindViewById = findViewById(R.id.nbc);
        this.LLJJL = viewFindViewById;
        if (viewFindViewById != null) {
            C786410Ut5.LJLLLLLL(8, viewFindViewById);
        }
        ShortVideoContextViewModel shortVideoContextViewModel2 = null;
        if (view instanceof C1457840o2Y) {
            c1457840o2Y = (C1457840o2Y) view;
        } else {
            c1457840o2Y = null;
        }
        this.LLJLILLLLZIIL = c1457840o2Y;
        if (c1457840o2Y != null) {
            c1457840o2Y.setChooseMusicDockerContentView(c1457840o2Y.findViewById(R.id.dsl));
            if (C862000Xri.LIZ() && (numLIZJ = C1308910kAL.LIZJ(R.attr.zg, c1457840o2Y.getContext())) != null) {
                int iIntValue2 = numLIZJ.intValue();
                View chooseMusicDockerContentView = c1457840o2Y.getChooseMusicDockerContentView();
                if (chooseMusicDockerContentView != null) {
                    chooseMusicDockerContentView.setBackgroundColor(iIntValue2);
                }
            }
            c1457840o2Y.setChooseMusicClickContainer(c1457840o2Y.findViewById(R.id.dst));
            c1457840o2Y.setChooseMusicTextView((C427250Gp9) c1457840o2Y.findViewById(R.id.tv_top_text));
            c1457840o2Y.setChooseMusicIconView((TuxIconView) c1457840o2Y.findViewById(R.id.dsq));
            c1457840o2Y.setCancelMusicClickContainer(c1457840o2Y.findViewById(R.id.dsj));
            c1457840o2Y.setChooseMusicLoadingView((ImageView) c1457840o2Y.findViewById(R.id.lbr));
            c1457840o2Y.setCancelMusicIconView((TuxIconView) c1457840o2Y.findViewById(R.id.dsk));
            c1457840o2Y.setChooseMusicDockerDivider(c1457840o2Y.findViewById(R.id.dso));
            c1457840o2Y.setChooseMusicClickContainerNew(c1457840o2Y.findViewById(R.id.dsv));
            View chooseMusicClickContainerNew = c1457840o2Y.getChooseMusicClickContainerNew();
            if (chooseMusicClickContainerNew != null) {
                q0.LJIJ(chooseMusicClickContainerNew, new C786390Ut3(3));
            }
            View chooseMusicClickContainer = c1457840o2Y.getChooseMusicClickContainer();
            if (chooseMusicClickContainer != null) {
                q0.LJIJ(chooseMusicClickContainer, new C786390Ut3(3));
            }
            View cancelMusicClickContainer = c1457840o2Y.getCancelMusicClickContainer();
            if (cancelMusicClickContainer != null) {
                q0.LJIJ(cancelMusicClickContainer, new C786390Ut3(3));
            }
        }
        LLLILZLLLI();
        this.LLJJIJIIJIL = (ShortVideoContextViewModel) C1659630tI1.LJIIIIZZ(this, null, null, 6).get(ShortVideoContextViewModel.class);
        if (this.LLJJ) {
            TuxTextView tuxTextView4 = this.LLJJJIL;
            if (tuxTextView4 != null) {
                tuxTextView4.setTuxFont(52);
            }
        } else if (!((Boolean) this.LLJLLL.getValue()).booleanValue() && (typefaceLIZIZ = C1697580uHE.LIZIZ(0.0f, 500, 17.0f, 0.0f, Float.valueOf(16.0f), 0.0f, 0, null, 224)) != null && (tuxTextView = this.LLJJJIL) != null) {
            tuxTextView.setTypeface(typefaceLIZIZ);
        }
        C385670FAf<Boolean> c385670FAf = this.LLJIJIL;
        if (c385670FAf != null) {
            c385670FAf.LIZ(this, new AObjectS245S0100000_22(this, 249));
        }
        if (!this.LLJJ) {
            this.LLJI.LJIIJJI.LIZ(this, new AObjectS245S0100000_22(this, 250));
        }
        if (((HDRCameraConfig) C2256211DSp.LJIILLIIL.getValue()).enable) {
            TuxIconView tuxIconView3 = this.LLJJIJIL;
            if (tuxIconView3 != null) {
                tuxIconView3.LIZ();
            }
            TuxIconView tuxIconView4 = this.LLJJJ;
            if (tuxIconView4 != null) {
                tuxIconView4.LIZ();
            }
        }
        if (((Boolean) C1458990o4P.LIZJ.getValue()).booleanValue() || ((((Boolean) C1458990o4P.LIZ.getValue()).booleanValue() && Intrinsics.LJFF(this.LLJILJILJ.shootWay, "single_song")) || (((Boolean) C1458990o4P.LIZIZ.getValue()).booleanValue() && (Intrinsics.LJFF(this.LLJILJILJ.shootWay, "prop_reuse") || Intrinsics.LJFF(this.LLJILJILJ.shootWay, "prop_page"))))) {
            z = true;
        } else {
            z = false;
        }
        if (!this.LLJJ) {
            this.LLJI.LJIIL.LIZ(this, new InterfaceC1441305kZ() { // from class: X.0o4K
                @Override // androidx.lifecycle.Observer
                public final void onChanged(Object obj) {
                    Integer num = (Integer) obj;
                    if (num != null && !z) {
                        C1458920o4I c1458920o4I = this;
                        c1458920o4I.LLLIILIL().post(new ARunnableS33S0101000_22(num.intValue(), c1458920o4I, 4));
                        TuxTextView tuxTextView5 = c1458920o4I.LLJJJIL;
                        if (tuxTextView5 != null) {
                            tuxTextView5.setOnTouchListener(new ATListenerS455S0100000_22(c1458920o4I, 6));
                        }
                        C1457840o2Y c1457840o2Y2 = c1458920o4I.LLJLILLLLZIIL;
                        if (c1457840o2Y2 != null) {
                            c1457840o2Y2.setOnTouchListener(new ATListenerS455S0100000_22(c1458920o4I, 5));
                            return;
                        }
                        return;
                    }
                    C0P0T c0p0t = this.LLJJIJI;
                    if (c0p0t == null) {
                        return;
                    }
                    c0p0t.dismiss();
                }
            });
        }
        this.LLJI.LJFF.LIZ(this, new AObjectS245S0100000_22(this, 251));
        this.LLJI.LJI.LIZ(this, new AObjectS245S0100000_22(this, 252));
        this.LLJI.LJ.LIZ(this, new AObjectS245S0100000_22(this, 253));
        this.LLJI.LIZIZ.LIZ(this, new AObjectS245S0100000_22(this, 254));
        this.LLJI.LIZJ.LIZ(this, new AObjectS245S0100000_22(this, 255));
        this.LLJI.LJIILIIL.LIZ(this, new AObjectS245S0100000_22(this, 245));
        ShortVideoContextViewModel shortVideoContextViewModel3 = this.LLJJIJIIJIL;
        if (shortVideoContextViewModel3 == null) {
            shortVideoContextViewModel = null;
        } else {
            shortVideoContextViewModel = shortVideoContextViewModel3;
        }
        if (shortVideoContextViewModel.LL.isPhotoMvMode) {
            if (shortVideoContextViewModel3 != null) {
                shortVideoContextViewModel2 = shortVideoContextViewModel3;
            }
            if (shortVideoContextViewModel2.LL.mIsFromDraft) {
                LLLILZ(false);
                C1457840o2Y c1457840o2Y2 = this.LLJLILLLLZIIL;
                if (c1457840o2Y2 != null) {
                    C786410Ut5.s1(c1457840o2Y2, 8);
                }
            }
        }
        this.LLJI.LJII.LIZ(this, new AObjectS245S0100000_22(this, 246));
        this.LLJI.LJIIJ.LIZ(this, new AObjectS245S0100000_22(this, 247));
        this.LLJI.LJIILL.LIZ(this, new AObjectS245S0100000_22(this, 248));
        View view2 = this.LLJJL;
        if (view2 != null) {
            C786410Ut5.I7(new ACListenerS156S0100000_22(this, 40), view2);
        }
        C1457840o2Y c1457840o2Y3 = this.LLJLILLLLZIIL;
        if (c1457840o2Y3 != null) {
            c1457840o2Y3.setCancelMusicLayerListener(new ACListenerS156S0100000_22(this, 41));
        }
    }

    @Override // X.C11E9
    public final <VM1 extends JediViewModel<S1>, S1 extends C004I, R> R withState(VM1 vm1, Function1<? super S1, ? extends R> function1) {
        return function1.invoke(vm1.FQ2());
    }

    @Override // com.bytedance.scene.Scene
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i;
        if (((Boolean) this.LLJLLL.getValue()).booleanValue()) {
            i = R.layout.i8q;
        } else {
            i = R.layout.i8r;
        }
        return C786410Ut5.Td(layoutInflater, i, viewGroup, false);
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

    public C1458920o4I(C1458930o4J c1458930o4J, C385670FAf<Boolean> c385670FAf, InterfaceC1624480sNK interfaceC1624480sNK, ShortVideoContext shortVideoContext, boolean z, boolean z2) {
        int i;
        this.LLJI = c1458930o4J;
        this.LLJIJIL = c385670FAf;
        this.LLJILJIL = interfaceC1624480sNK;
        this.LLJILJILJ = shortVideoContext;
        this.LLJILLL = z;
        this.LLJJ = z2;
        C01GW c01gwLIZIZ = C452501pT.LIZIZ(AFwS210S0000000_22.get$arr$(276));
        this.LLJZ = c01gwLIZIZ;
        if (((HDRCameraConfig) C2256211DSp.LJIILLIIL.getValue()).enable) {
            i = R.raw.icon_color_camera_single_note;
        } else if (((Boolean) c01gwLIZIZ.getValue()).booleanValue()) {
            i = R.raw.icon_camera_single_note;
        } else {
            i = R.raw.icon_music_note_s_alt;
        }
        this.LLJZIJLIL = i;
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
