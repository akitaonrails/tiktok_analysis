package X;

import android.net.Uri;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import ayh.i5;
import com.bytedance.als.h0;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.scene.Scene;
import com.bytedance.scene.navigation.NavigationScene;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.editorpro.EditorProDraftModel;
import com.ss.android.ugc.aweme.editorpro.recordtab.EditorTabViewModel;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.utils.oh;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS210S0000000_22;
import kotlin.jvm.internal.AFwS261S0000000_22;
import kotlin.jvm.internal.AwS266S0300000_22;
import kotlin.jvm.internal.AwS436S0200000_35;
import kotlin.jvm.internal.AwS566S0100000_22;
import kotlin.jvm.internal.AwS601S0100000_22;
import kotlin.jvm.internal.Intrinsics;
import nv7.c0;

/* JADX INFO: renamed from: X.0nvD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1453290nvD extends AbstractC1653180t7c implements InterfaceC1166920gTK, InterfaceC379610EuV {
    public static final /* synthetic */ int LLJJLIIIJLLLLLLLZ = 0;
    public final C1DRG LLJILLL;
    public C21580119ct LLJJ;
    public SmartImageView LLJJI;
    public boolean LLJJIII;
    public final h0<Boolean> LLJJIJI = new h0<>(Boolean.FALSE);
    public final C01GW LLJJIJIIJIL = C452501pT.LIZIZ(new AwS566S0100000_22(this, 100));
    public final C01GW LLJJIJIL = C452501pT.LIZIZ(new AwS566S0100000_22(this, 102));
    public final C01GW LLJJJ;
    public InterfaceC524950KiL LLJJJIL;
    public final C01GW LLJJJJ;
    public final C1425800nCs LLJJJJJIL;
    public long LLJJJJLIIL;
    public SmartImageView LLJJL;

    @Override // X.AbstractC1653180t7c
    public final boolean LLLLIIIILLL() {
        return true;
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

    @Override // X.AbstractC1653180t7c
    public final String getTag() {
        return "CreateEntranceScene";
    }

    @Override // X.C11E9
    public final boolean getUniqueOnlyGlobal() {
        return true;
    }

    public final EditorTabViewModel LLLLILI() {
        return (EditorTabViewModel) this.LLJJJ.getValue();
    }

    @Override // X.AbstractC1653180t7c
    public final void hide() {
        oh.LJ("tool_editor_tab");
        InterfaceC1425510nCP interfaceC1425510nCP = (InterfaceC1425510nCP) this.LLJJIJIL.getValue();
        if (interfaceC1425510nCP != null) {
            interfaceC1425510nCP.O7();
        }
        InterfaceC524950KiL interfaceC524950KiL = this.LLJJJIL;
        if (interfaceC524950KiL != null) {
            interfaceC524950KiL.b8(this.LLJJJJJIL);
        }
        InterfaceC1648020szI interfaceC1648020szI = (InterfaceC1648020szI) this.LLJJIJIIJIL.getValue();
        if (interfaceC1648020szI != null) {
            interfaceC1648020szI.switchDarkLightThemeMode(true);
        }
        C1425580nCW.LIZIZ.LJ(this, Boolean.TRUE);
    }

    @Override // X.AbstractC1653180t7c
    public final void show() {
        ShortVideoContext shortVideoContext;
        CreativeModel creativeModel;
        if (Intrinsics.LJFF(this.LLJJIJI.LIZJ(), Boolean.FALSE)) {
            this.LLJJIJI.LJII(Boolean.TRUE);
        }
        EditorTabViewModel editorTabViewModelLLLLILI = LLLLILI();
        if (editorTabViewModelLLLLILI != null && (shortVideoContext = editorTabViewModelLLLLILI.LLILZIL) != null && (creativeModel = shortVideoContext.creativeModel) != null) {
            creativeModel.isFromEditTab = true;
        }
        InterfaceC1425510nCP interfaceC1425510nCP = (InterfaceC1425510nCP) this.LLJJIJIL.getValue();
        if (interfaceC1425510nCP != null) {
            interfaceC1425510nCP.cc();
        }
        C0MWG c0mwg = C0MWG.LIZ;
        ShortVideoContext shortVideoContext2 = LLLLILI().LLILZIL;
        c0mwg.getClass();
        if (shortVideoContext2 != null) {
            C0LAB c0lab = new C0LAB();
            c0lab.LJ("creation_id", shortVideoContext2.getCreationId());
            c0lab.LJ("shoot_way", shortVideoContext2.shootWay);
            c0lab.LJ("enter_from", "video_shoot_page");
            C0MJO.LIZIZ(shortVideoContext2.creativeModel, c0lab);
            C20684815ws.LJIILLIIL("enter_edit_tab_page", c0lab.LIZ);
        }
        InterfaceC524950KiL interfaceC524950KiL = this.LLJJJIL;
        if (interfaceC524950KiL != null) {
            interfaceC524950KiL.kF(this.LLJJJJJIL);
        }
        InterfaceC1648020szI interfaceC1648020szI = (InterfaceC1648020szI) this.LLJJIJIIJIL.getValue();
        if (interfaceC1648020szI != null) {
            C1425580nCW.LIZIZ.getClass();
            interfaceC1648020szI.switchDarkLightThemeMode(AbstractC1671300taq.LIZ);
        }
        C1425580nCW.LIZIZ.LJ(this, null);
    }

    @Override // com.bytedance.scene.Scene
    public final void onResume() {
        super.onResume();
        if (this.LLJJIII) {
            View view = this.mView;
            if (view != null) {
                C0T6I.LIZ(view, new AwS566S0100000_22(this, 101));
            }
            this.LLJJIII = false;
        }
        Scene sceneLIZ = C565530MFz.LIZ(this);
        if (sceneLIZ == null) {
            "Required value was null.".toString();
            throw new IllegalArgumentException("Required value was null.");
        }
        Bundle bundle = sceneLIZ.mArguments;
        if (Intrinsics.LJFF(bundle != null ? Boolean.valueOf(bundle.getBoolean("is_from_publish_after_draft_saved")) : null, Boolean.TRUE)) {
            CreativeInfo creativeInfo = new CreativeInfo(null, 0, null, 7, null);
            ShortVideoContext shortVideoContext = LLLLILI().LLILZIL;
            if (shortVideoContext != null) {
                shortVideoContext.creativeInfo = creativeInfo;
                shortVideoContext.creativeModel.creativeInfo = creativeInfo;
            }
        }
        oh.LIZJ("tool_editor_tab", i5.LIZIZ(), i5.LIZ(), null, null);
    }

    @Override // X.AbstractC1653180t7c
    public final EnumC545560LaU LLLLIL() {
        return EnumC545560LaU.CREATE_SCENE;
    }

    @Override // X.InterfaceC379610EuV
    public final C1DRG getDiContainer() {
        return this.LLJILLL;
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [X.0nCs] */
    public C1453290nvD(C1DRG c1drg) {
        this.LLJILLL = c1drg;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(EditorTabViewModel.class);
        this.LLJJJ = C452501pT.LIZIZ(new AwS266S0300000_22(this, c19719912DlLIZ, c19719912DlLIZ, 0));
        this.LLJJJJ = C452501pT.LIZIZ(AFwS210S0000000_22.get$arr$(57));
        this.LLJJJJJIL = new InterfaceC362610EJn() { // from class: X.0nCs
            @Override // X.InterfaceC362610EJn
            public final boolean onKeyDown(int i, KeyEvent keyEvent) {
                InterfaceC1425510nCP interfaceC1425510nCP;
                if (!this.LL.getLifecycle().getCurrentState().isAtLeast(Lifecycle.State.RESUMED) || i != 4) {
                    return false;
                }
                NavigationScene navigationSceneLIZ = C1447800nmM.LIZ(this.LL);
                if ((navigationSceneLIZ == null || !navigationSceneLIZ.LLLLLJIL(null)) && (interfaceC1425510nCP = (InterfaceC1425510nCP) this.LL.LLJJIJIL.getValue()) != null) {
                    interfaceC1425510nCP.Ts0("system_back_button");
                }
                return true;
            }
        };
    }

    @Override // com.bytedance.scene.Scene
    public final void onViewCreated(View view, Bundle bundle) {
        final View viewFindViewById;
        ShortVideoContext shortVideoContext;
        CreativeModel creativeModel;
        EditorProDraftModel editorProDraftModel;
        Uri uriFromFile;
        SmartImageView smartImageView;
        super.onViewCreated(view, bundle);
        this.LLJJIII = true;
        this.LLJJ = (C21580119ct) this.mView.findViewById(R.id.gtz);
        C0J33 c0j33 = (C0J33) this.mView.findViewById(R.id.gu0);
        C21580119ct c21580119ct = this.LLJJ;
        if (c21580119ct != null) {
            c21580119ct.setParentRefreshLayout(c0j33);
        }
        this.LLJJJIL = C0MWZ.LIZ(this.mParentScene);
        this.LLJJL = (SmartImageView) this.mView.findViewById(R.id.gry);
        this.LLJJI = (SmartImageView) this.mView.findViewById(R.id.gru);
        int iLIZIZ = 0;
        ViewGroup.LayoutParams layoutParams = null;
        if (C0MQ1.LIZIZ() && (shortVideoContext = LLLLILI().LLILZIL) != null && (creativeModel = shortVideoContext.creativeModel) != null && (editorProDraftModel = creativeModel.editorProDraftModel) != null && editorProDraftModel.isEoyCreateTabOn) {
            if (C0MQ1.LIZIZ()) {
                C0LBG.LIZ.getClass();
                C0VSJ c0vsjLIZJ = C0LBG.LIZJ("create_tab_eoy_background.png");
                if (c0vsjLIZJ != null && (uriFromFile = Uri.fromFile(c0vsjLIZJ)) != null && (smartImageView = this.LLJJI) != null) {
                    smartImageView.setImageURI(uriFromFile.toString());
                }
            }
            SmartImageView smartImageView2 = this.LLJJI;
            if (smartImageView2 != null) {
                C786410Ut5.LLFF(0, smartImageView2);
            }
        }
        SmartImageView smartImageView3 = this.LLJJL;
        if (smartImageView3 != null) {
            C786410Ut5.LLFF(8, smartImageView3);
        }
        C1654320t9S.LIZIZ(this, AFwS261S0000000_22.get$arr$(56));
        C1664590tQ1.LIZLLL(this, null, false, new AwS601S0100000_22(this, 88), 3);
        C1664600tQ2.LIZ(this, null, new AwS601S0100000_22(this, 89));
        if (C1462920oAk.LIZLLL()) {
            c0.LIZ.getClass();
            C1660590tJZ c1660590tJZ = c0.LJFF;
            if (c1660590tJZ != null) {
                iLIZIZ = C1660590tJZ.LJFF() + c1660590tJZ.LIZIZ();
            }
        } else {
            iLIZIZ = C0LEO.LIZIZ();
        }
        C426750GoL.LJIIIZ(view.findViewById(R.id.grv), null, null, null, Integer.valueOf(iLIZIZ), false, 23);
        View viewFindViewById2 = view.findViewById(R.id.f7c);
        if (viewFindViewById2 != null) {
            ViewGroup.LayoutParams layoutParams2 = viewFindViewById2.getLayoutParams();
            if (layoutParams2 != null) {
                layoutParams2.height = iLIZIZ;
                layoutParams = layoutParams2;
            }
            C786410Ut5.W5(viewFindViewById2, layoutParams);
        }
        InterfaceC1425510nCP interfaceC1425510nCP = (InterfaceC1425510nCP) this.LLJJIJIL.getValue();
        if (interfaceC1425510nCP != null) {
            interfaceC1425510nCP.LLLIIL(iLIZIZ);
        }
        final View viewFindViewById3 = findViewById(R.id.gu7);
        if (viewFindViewById3 != null && (viewFindViewById = findViewById(R.id.gu_)) != null) {
            final C2272981Dxw c2272981Dxw = new C2272981Dxw(viewFindViewById3, viewFindViewById);
            C21580119ct c21580119ct2 = this.LLJJ;
            if (c21580119ct2 != null) {
                ((ArrayList) c21580119ct2.LL).add(new InterfaceC21580219cu() { // from class: X.1Dxx
                    @Override // X.InterfaceC21580219cu
                    public final void LJI() {
                    }

                    @Override // X.InterfaceC21580219cu
                    public final void b3() {
                    }

                    @Override // X.InterfaceC21580219cu
                    public final void d3(int i) {
                    }

                    @Override // X.InterfaceC21580219cu
                    public final void c3() {
                        C2272981Dxw c2272981Dxw2 = c2272981Dxw;
                        AwS436S0200000_35 awS436S0200000_35 = new AwS436S0200000_35(this, viewFindViewById, 36);
                        AwS436S0200000_35 awS436S0200000_352 = new AwS436S0200000_35(this, viewFindViewById3, 37);
                        if (!c2272981Dxw2.LJFF) {
                            if (c2272981Dxw2.LIZLLL.LIZIZ > 0.0f) {
                                awS436S0200000_352.invoke();
                            }
                        } else if (c2272981Dxw2.LIZJ.LIZIZ <= 0.5f && c2272981Dxw2.LIZLLL.LIZIZ > 0.0f) {
                            awS436S0200000_35.invoke();
                        } else if (c2272981Dxw2.LIZJ.LIZIZ > 0.5f) {
                            awS436S0200000_352.invoke();
                        }
                    }

                    @Override // X.InterfaceC21580219cu
                    public final void a3(int i) {
                        boolean z;
                        C2272981Dxw c2272981Dxw2 = c2272981Dxw;
                        if (i - c2272981Dxw2.LJ > 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        c2272981Dxw2.LJFF = z;
                        c2272981Dxw2.LJ = i;
                        C2272981Dxw.LIZ(c2272981Dxw2.LIZJ);
                        C2272981Dxw.LIZ(c2272981Dxw2.LIZLLL);
                    }
                });
            }
        }
    }

    @Override // X.C11E9
    public final <VM1 extends JediViewModel<S1>, S1 extends C004I, R> R withState(VM1 vm1, Function1<? super S1, ? extends R> function1) {
        return function1.invoke(vm1.FQ2());
    }

    @Override // X.AbstractC1653180t7c, X.C19A3, com.bytedance.scene.Scene
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        setTheme(C1425580nCW.LIZIZ.LIZLLL());
        return (ViewGroup) C786410Ut5.Td(layoutInflater, R.layout.epk, viewGroup, false);
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
