package X;

import Y.AObserverS231S0100000_29;
import Y.ARunnableS34S0201000_29;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.createx.editor.gesture.GestureInteractItem;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.ftc.components.sticker.hint.FTCStickerHintTextViewModel;
import com.ss.android.ugc.aweme.ftc.components.sticker.text.FTCEditTextStickerViewModel;
import com.ss.android.ugc.aweme.ftc.components.sticker.text.FTCEditTextStickerViewState;
import com.ss.android.ugc.aweme.shortvideo.SafeHandler;
import com.ss.android.ugc.aweme.story.shootvideo.textsticker.view.SoftKeyBoardListener;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS643S0100000_29;
import zoo.b;

/* JADX INFO: renamed from: X.122b, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C196903122b extends Scene implements InterfaceC1166920gTK, InterfaceC379610EuV {
    public final C1DRG LLJI;
    public final C124C LLJIJIL;
    public final int LLJILJIL;
    public InterfaceC1461390o8H LLJILJILJ;
    public C124T LLJILLL;
    public C121O LLJJ;
    public C196902122a LLJJI;
    public final C01GW LLJJIII = C1449630npJ.LIZ(this, InterfaceC1455860nzM.class);

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
    public final void onDestroyView() {
        C196902122a c196902122a = this.LLJJI;
        if (c196902122a == null) {
            c196902122a = null;
        }
        c196902122a.LIZJ().R02();
        SoftKeyBoardListener softKeyBoardListener = c196902122a.LLJJJ;
        (softKeyBoardListener != null ? softKeyBoardListener : null).LIZ();
        super.onDestroyView();
    }

    @Override // com.bytedance.scene.Scene
    public final void onPause() {
        super.onPause();
        C196902122a c196902122a = this.LLJJI;
        if (c196902122a == null) {
            c196902122a = null;
        }
        SafeHandler safeHandler = c196902122a.LLJJLIIIJLLLLLLLZ;
        if (safeHandler == null) {
            safeHandler = null;
        }
        ARunnableS34S0201000_29 aRunnableS34S0201000_29 = c196902122a.LLJL;
        safeHandler.removeCallbacks(aRunnableS34S0201000_29 != null ? aRunnableS34S0201000_29 : null);
    }

    @Override // com.bytedance.scene.Scene
    public final void onResume() {
        super.onResume();
        C196902122a c196902122a = this.LLJJI;
        if (c196902122a == null) {
            c196902122a = null;
        }
        C121O c121o = c196902122a.LLILZLL;
        if (c121o != null) {
            c121o.hide();
        }
        SafeHandler safeHandler = c196902122a.LLJJLIIIJLLLLLLLZ;
        if (safeHandler == null) {
            safeHandler = null;
        }
        ARunnableS34S0201000_29 aRunnableS34S0201000_29 = c196902122a.LLJL;
        safeHandler.post(aRunnableS34S0201000_29 != null ? aRunnableS34S0201000_29 : null);
    }

    @Override // X.InterfaceC379610EuV
    public final C1DRG getDiContainer() {
        return this.LLJI;
    }

    @Override // com.bytedance.scene.Scene
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        final C196902122a c196902122a = this.LLJJI;
        if (c196902122a == null) {
            c196902122a = null;
        }
        c196902122a.getClass();
        C0FI2.LJIJJ().LJJIL(c196902122a.LLILZ.getContext(), Boolean.valueOf(!C298130BmN.LIZ()));
        c196902122a.LLJILJIL = (FTCEditTextStickerViewModel) C1659640tI2.LIZJ(c196902122a.LLILZ).LIZ(FTCEditTextStickerViewModel.class);
        c196902122a.LLJILJILJ = (FTCStickerHintTextViewModel) C1659630tI1.LJII(c196902122a.LLILZ, null, 6).get(FTCStickerHintTextViewModel.class);
        C1664750tQH c1664750tQH = c196902122a.LLJJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C196902122a.LLJZ;
        c196902122a.LLJJLIIIJLLLLLLLZ = new SafeHandler((Scene) c1664750tQH.getValue(c196902122a, interfaceC2217461BqaArr[1]));
        final FTCEditTextStickerViewModel fTCEditTextStickerViewModelLIZJ = c196902122a.LIZJ();
        c196902122a.LLILLL.LIZIZ(new GestureInteractItem(200, new AbstractC21664419qU(fTCEditTextStickerViewModelLIZJ) { // from class: X.123A
            public final FTCEditTextStickerViewModel LL;

            {
                this.LL = fTCEditTextStickerViewModelLIZJ;
            }

            @Override // X.C0FUM, com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
            public final boolean E2(C21645419nQ c21645419nQ) {
                return this.LL.E2(c21645419nQ);
            }

            @Override // X.C0FUM, com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
            public final boolean LJJLIIIJLJLI(float f) {
                return this.LL.LJJLIIIJLJLI(f);
            }

            @Override // X.C0FUM, com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
            public final boolean LLLZLZ(b bVar) {
                return this.LL.LLLZLZ(bVar);
            }

            @Override // X.C0FUM, com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
            public final boolean onDown(MotionEvent motionEvent) {
                return this.LL.onDown(motionEvent);
            }

            @Override // X.C0FUM, com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
            public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
                return this.LL.onScale(scaleGestureDetector);
            }

            @Override // X.C0FUM, com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
            public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
                return this.LL.onScaleBegin(scaleGestureDetector);
            }

            @Override // X.C0FUM, com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
            public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
                return this.LL.onSingleTapConfirmed(motionEvent);
            }

            @Override // X.C0FUM, com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
            public final boolean onUp(MotionEvent motionEvent) {
                return this.LL.onUp(motionEvent);
            }

            @Override // X.C0FUM, com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
            public final boolean LLLLLLLLL(b bVar, float f, float f2) {
                return this.LL.LLLLLLLLL(bVar, f, f2);
            }

            @Override // X.C0FUM, com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
            public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
                return this.LL.onFling(motionEvent, motionEvent2, f, f2);
            }

            @Override // X.C0FUM, com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
            public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
                return this.LL.onScroll(motionEvent, motionEvent2, f, f2);
            }
        }));
        SoftKeyBoardListener softKeyBoardListener = new SoftKeyBoardListener(c196902122a.LLILLJJLI, null, null, null, 12);
        softKeyBoardListener.LIZIZ(c196902122a);
        c196902122a.LLJJJ = softKeyBoardListener;
        C121O c121o = c196902122a.LLILZLL;
        if (c121o != null) {
            c121o.LJIL();
        }
        c196902122a.LIZJ().lR2().observe((Scene) c196902122a.LLJJ.getValue(c196902122a, interfaceC2217461BqaArr[1]), new AObserverS231S0100000_29(c196902122a, 139));
        FTCEditTextStickerViewModel fTCEditTextStickerViewModelLIZJ2 = c196902122a.LIZJ();
        C196936123i c196936123i = new C2217381BqS() { // from class: X.123i
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((FTCEditTextStickerViewState) obj).getSticker2Top();
            }
        };
        C1765020w20 c1765020w20 = new C1765020w20();
        c1765020w20.LIZ = true;
        C11EA.LJI(c196902122a, fTCEditTextStickerViewModelLIZJ2, c196936123i, c1765020w20, new AwS643S0100000_29(c196902122a, 80));
        FTCEditTextStickerViewModel fTCEditTextStickerViewModelLIZJ3 = c196902122a.LIZJ();
        C196943123p c196943123p = new C2217381BqS() { // from class: X.123p
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((FTCEditTextStickerViewState) obj).getDismissHitText();
            }
        };
        C1765020w20 c1765020w202 = new C1765020w20();
        c1765020w202.LIZ = true;
        C1170060gYO.LIZLLL(c196902122a, fTCEditTextStickerViewModelLIZJ3, c196943123p, c1765020w202, new AwS643S0100000_29(c196902122a, 82));
        FTCEditTextStickerViewModel fTCEditTextStickerViewModelLIZJ4 = c196902122a.LIZJ();
        C196945123r c196945123r = new C2217381BqS() { // from class: X.123r
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((FTCEditTextStickerViewState) obj).getAddSticker();
            }
        };
        C1765020w20 c1765020w203 = new C1765020w20();
        c1765020w203.LIZ = true;
        C11EA.LJI(c196902122a, fTCEditTextStickerViewModelLIZJ4, c196945123r, c1765020w203, new AwS643S0100000_29(c196902122a, 79));
        FTCEditTextStickerViewModel fTCEditTextStickerViewModelLIZJ5 = c196902122a.LIZJ();
        C196942123o c196942123o = new C2217381BqS() { // from class: X.123o
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((FTCEditTextStickerViewState) obj).getTextStickerListener();
            }
        };
        C1765020w20 c1765020w204 = new C1765020w20();
        c1765020w204.LIZ = true;
        C11EA.LJI(c196902122a, fTCEditTextStickerViewModelLIZJ5, c196942123o, c1765020w204, new AwS643S0100000_29(c196902122a, 81));
        FTCEditTextStickerViewModel fTCEditTextStickerViewModelLIZJ6 = c196902122a.LIZJ();
        C196944123q c196944123q = new C2217381BqS() { // from class: X.123q
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((FTCEditTextStickerViewState) obj).getChangeToTopListener();
            }
        };
        C1765020w20 c1765020w205 = new C1765020w20();
        c1765020w205.LIZ = true;
        C11EA.LJI(c196902122a, fTCEditTextStickerViewModelLIZJ6, c196944123q, c1765020w205, new AwS643S0100000_29(c196902122a, 83));
        FTCEditTextStickerViewModel fTCEditTextStickerViewModelLIZJ7 = c196902122a.LIZJ();
        C196946123s c196946123s = new C2217381BqS() { // from class: X.123s
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((FTCEditTextStickerViewState) obj).getTimeClickListener();
            }
        };
        C1765020w20 c1765020w206 = new C1765020w20();
        c1765020w206.LIZ = true;
        C11EA.LJI(c196902122a, fTCEditTextStickerViewModelLIZJ7, c196946123s, c1765020w206, new AwS643S0100000_29(c196902122a, 84));
        FTCEditTextStickerViewModel fTCEditTextStickerViewModelLIZJ8 = c196902122a.LIZJ();
        C196947123t c196947123t = new C2217381BqS() { // from class: X.123t
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((FTCEditTextStickerViewState) obj).getTextStickerEditListener();
            }
        };
        C1765020w20 c1765020w207 = new C1765020w20();
        c1765020w207.LIZ = true;
        C11EA.LJI(c196902122a, fTCEditTextStickerViewModelLIZJ8, c196947123t, c1765020w207, new AwS643S0100000_29(c196902122a, 85));
        FTCEditTextStickerViewModel fTCEditTextStickerViewModelLIZJ9 = c196902122a.LIZJ();
        C196948123u c196948123u = new C2217381BqS() { // from class: X.123u
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((FTCEditTextStickerViewState) obj).getTextStickerMob();
            }
        };
        C1765020w20 c1765020w208 = new C1765020w20();
        c1765020w208.LIZ = true;
        C11EA.LJI(c196902122a, fTCEditTextStickerViewModelLIZJ9, c196948123u, c1765020w208, new AwS643S0100000_29(c196902122a, 86));
        FTCEditTextStickerViewModel fTCEditTextStickerViewModelLIZJ10 = c196902122a.LIZJ();
        C196934123g c196934123g = new C2217381BqS() { // from class: X.123g
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((FTCEditTextStickerViewState) obj).getReloadStickerEvent();
            }
        };
        C1765020w20 c1765020w209 = new C1765020w20();
        c1765020w209.LIZ = true;
        C1170060gYO.LIZLLL(c196902122a, fTCEditTextStickerViewModelLIZJ10, c196934123g, c1765020w209, new AwS643S0100000_29(c196902122a, 72));
        FTCEditTextStickerViewModel fTCEditTextStickerViewModelLIZJ11 = c196902122a.LIZJ();
        C196935123h c196935123h = new C2217381BqS() { // from class: X.123h
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((FTCEditTextStickerViewState) obj).getTargetCanvasSize();
            }
        };
        C1765020w20 c1765020w2010 = new C1765020w20();
        c1765020w2010.LIZ = true;
        C11EA.LJI(c196902122a, fTCEditTextStickerViewModelLIZJ11, c196935123h, c1765020w2010, new AwS643S0100000_29(c196902122a, 73));
        FTCEditTextStickerViewModel fTCEditTextStickerViewModelLIZJ12 = c196902122a.LIZJ();
        C196937123j c196937123j = new C2217381BqS() { // from class: X.123j
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((FTCEditTextStickerViewState) obj).getUpdateLayoutSizeEvent();
            }
        };
        C1765020w20 c1765020w2011 = new C1765020w20();
        c1765020w2011.LIZ = true;
        C11EA.LJI(c196902122a, fTCEditTextStickerViewModelLIZJ12, c196937123j, c1765020w2011, new AwS643S0100000_29(c196902122a, 74));
        FTCEditTextStickerViewModel fTCEditTextStickerViewModelLIZJ13 = c196902122a.LIZJ();
        C196938123k c196938123k = new C2217381BqS() { // from class: X.123k
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((FTCEditTextStickerViewState) obj).getShowInputView();
            }
        };
        C1765020w20 c1765020w2012 = new C1765020w20();
        c1765020w2012.LIZ = true;
        C11EA.LJI(c196902122a, fTCEditTextStickerViewModelLIZJ13, c196938123k, c1765020w2012, new AwS643S0100000_29(c196902122a, 75));
        FTCEditTextStickerViewModel fTCEditTextStickerViewModelLIZJ14 = c196902122a.LIZJ();
        C196939123l c196939123l = new C2217381BqS() { // from class: X.123l
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((FTCEditTextStickerViewState) obj).getRemoveAllStickerEvent();
            }
        };
        C1765020w20 c1765020w2013 = new C1765020w20();
        c1765020w2013.LIZ = true;
        C1170060gYO.LIZLLL(c196902122a, fTCEditTextStickerViewModelLIZJ14, c196939123l, c1765020w2013, new AwS643S0100000_29(c196902122a, 76));
        FTCEditTextStickerViewModel fTCEditTextStickerViewModelLIZJ15 = c196902122a.LIZJ();
        C196940123m c196940123m = new C2217381BqS() { // from class: X.123m
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((FTCEditTextStickerViewState) obj).getResetGuideViewVisibilityEvent();
            }
        };
        C1765020w20 c1765020w2014 = new C1765020w20();
        c1765020w2014.LIZ = true;
        C1170060gYO.LIZLLL(c196902122a, fTCEditTextStickerViewModelLIZJ15, c196940123m, c1765020w2014, new AwS643S0100000_29(c196902122a, 77));
        c196902122a.selectNonNullSubscribe(c196902122a.LIZJ(), new C2217381BqS() { // from class: X.123n
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((FTCEditTextStickerViewState) obj).getUpdateStickerTime();
            }
        }, new C1765020w20(), new AwS643S0100000_29(c196902122a, 78));
        c196902122a.LLJJIJIL = new C196904122c(c196902122a);
        c196902122a.LLJJIJI = new C196913122l(c196902122a);
        final C124T c124t = c196902122a.LLILZIL;
        c124t.setInputLayoutShowListener(new C124A() { // from class: X.122f
            @Override // X.C124A
            public final void dismiss() {
                C196904122c c196904122c = c196902122a.LLJJIJIL;
                if (c196904122c != null) {
                    c196904122c.dismiss();
                }
                C196925122x c196925122x = c196902122a.LLJJI;
                if (c196925122x != null) {
                    c196925122x.LJIIL();
                }
                c124t.LJIILJJIL();
            }

            @Override // X.C124A
            public final void show() {
                C196904122c c196904122c = c196902122a.LLJJIJIL;
                if (c196904122c != null) {
                    c196904122c.show();
                }
            }
        });
        c124t.setTextStickerUpdateListener(new InterfaceC196961124h() { // from class: X.123y
            @Override // X.InterfaceC196961124h
            public final void LIZ() {
                c124t.LJIILJJIL();
            }
        });
        c124t.setVisibleController(new C124P() { // from class: X.122m
            @Override // X.C124P
            public final void LIZ() {
                c124t.LJIILJJIL();
            }

            @Override // X.C124P
            public final void LIZIZ() {
                C196902122a c196902122a2 = c196902122a;
                c196902122a2.LJ(c196902122a2.LLJJI);
            }
        });
        c196902122a.LIZLLL();
        c196902122a.LLJL = new ARunnableS34S0201000_29(c196902122a, 9);
    }

    @Override // X.C11E9
    public final <VM1 extends JediViewModel<S1>, S1 extends C004I, R> R withState(VM1 vm1, Function1<? super S1, ? extends R> function1) {
        return function1.invoke(vm1.FQ2());
    }

    public C196903122b(C1DRG c1drg, C124C c124c, int i) {
        this.LLJI = c1drg;
        this.LLJIJIL = c124c;
        this.LLJILJIL = i;
    }

    @Override // com.bytedance.scene.Scene
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C1DRG c1drg = this.LLJI;
        C19EG c19eg = (C19EG) this.mActivity;
        InterfaceC1461390o8H interfaceC1461390o8H = this.LLJILJILJ;
        if (interfaceC1461390o8H == null) {
            interfaceC1461390o8H = null;
        }
        FrameLayout frameLayout = (FrameLayout) viewGroup;
        C124T c124t = this.LLJILLL;
        if (c124t == null) {
            c124t = null;
        }
        C121O c121o = this.LLJJ;
        if (c121o == null) {
            c121o = null;
        }
        this.LLJJI = new C196902122a(c1drg, c19eg, interfaceC1461390o8H, frameLayout, c124t, c121o, ((InterfaceC1455860nzM) this.LLJJIII.getValue()).g(), this.LLJIJIL, this.LLJILJIL);
        return new View(requireSceneContext());
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
