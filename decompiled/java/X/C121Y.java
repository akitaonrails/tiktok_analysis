package X;

import Y.ARunnableS98S0200000_29;
import Y.ATListenerS461S0100000_29;
import android.graphics.PointF;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.SeekBar;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.createx.editor.gesture.GestureInteractItem;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.scene.Scene;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.editSticker.model.InfoStickerModel;
import com.ss.android.ugc.aweme.editSticker.model.StickerItemModel;
import com.ss.android.ugc.aweme.ftc.components.corner.FTCEditCornerViewModel;
import com.ss.android.ugc.aweme.ftc.components.sticker.core.FTCEditStickerViewModel;
import com.ss.android.ugc.aweme.ftc.components.sticker.info.FTCEditInfoStickerState;
import com.ss.android.ugc.aweme.ftc.components.sticker.info.FTCInfoStickerViewModel;
import com.ss.android.ugc.aweme.ftc.components.sticker.text.FTCEditTextStickerViewModel;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.shortvideo.SafeHandler;
import com.ss.android.ugc.aweme.shortvideo.ScreenUtils;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.vesdk.VESize;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS573S0100000_29;
import kotlin.jvm.internal.AwS643S0100000_29;
import nv7.c0;
import zoo.b;

/* JADX INFO: renamed from: X.121Y, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C121Y extends Scene implements InterfaceC1166920gTK, InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIJIL;
    public final C1DRG LLJI;
    public InterfaceC1461390o8H LLJIJIL;
    public final C1664750tQH LLJILJILJ;
    public final C1664750tQH LLJILLL;
    public FrameLayout LLJJIJI;
    public final C01GW LLJILJIL = C1449630npJ.LIZ(this, InterfaceC1455860nzM.class);
    public final C01GW LLJJ = C452501pT.LIZIZ(new AwS573S0100000_29(this, 110));
    public final C01GW LLJJI = C452501pT.LIZIZ(new AwS573S0100000_29(this, 113));
    public final C01GW LLJJIII = C452501pT.LIZIZ(new AwS573S0100000_29(this, 111));
    public final C01GW LLJJIJIIJIL = C452501pT.LIZIZ(new AwS573S0100000_29(this, 112));

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C121Y.class, "publishEditModel", "getPublishEditModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C121Y.class, "stickerChallengeManager", "getStickerChallengeManager()Lcom/ss/android/ugc/aweme/infoSticker/StickerChallengeManager;", 0);
        c09r3.getClass();
        LLJJIJIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    public static final float LLLII(boolean z) {
        return z ? 1.0f : 0.3137255f;
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

    public final InterfaceC1455860nzM LLLIIIIL() {
        return (InterfaceC1455860nzM) this.LLJILJIL.getValue();
    }

    public final C121W LLLIILIL() {
        return (C121W) this.LLJJIJIIJIL.getValue();
    }

    @Override // com.bytedance.scene.Scene
    public final void onResume() {
        super.onResume();
        C121O c121o = LLLIILIL().LLJJLIIIJLLLLLLLZ;
        if (c121o != null) {
            c121o.hide();
        }
    }

    @Override // X.InterfaceC379610EuV
    public final C1DRG getDiContainer() {
        return this.LLJI;
    }

    public C121Y(C1DRG c1drg) {
        this.LLJI = c1drg;
        this.LLJILJILJ = C1664770tQJ.LIZ(c1drg, VideoPublishEditModel.class, null);
        this.LLJILLL = C1664770tQJ.LIZ(c1drg, C1439740nZM.class, null);
    }

    /* JADX WARN: Type inference failed for: r0v61, types: [X.121a] */
    @Override // com.bytedance.scene.Scene
    public final void onActivityCreated(Bundle bundle) {
        InterfaceC1452170ntP interfaceC1452170ntP;
        C196880121e c196880121e;
        super.onActivityCreated(bundle);
        C121W c121wLLLIILIL = LLLIILIL();
        InterfaceC1452170ntP value = LLLIIIIL().g().getValue();
        VideoPublishEditModel videoPublishEditModel = (VideoPublishEditModel) this.LLJILJILJ.getValue(this, LLJJIJIL[0]);
        c121wLLLIILIL.LLJJIII = value;
        c121wLLLIILIL.LLJJIJIIJIL = videoPublishEditModel;
        final C121W c121wLLLIILIL2 = LLLIILIL();
        AbstractC214814194y abstractC214814194yLIZIZ = C372650EjH.LIZIZ(this);
        View view = this.mView;
        List<MediaModel> mediaModelList = LLLIILIL().LLJJIJIIJIL.getMediaModelList();
        c121wLLLIILIL2.getClass();
        c121wLLLIILIL2.LL = abstractC214814194yLIZIZ.requireAppCompatActivity();
        c121wLLLIILIL2.LLILLJJLI = abstractC214814194yLIZIZ;
        c121wLLLIILIL2.LLJJJJJIL = mediaModelList;
        c121wLLLIILIL2.LLJJL = new SafeHandler(abstractC214814194yLIZIZ);
        c121wLLLIILIL2.LLJJIJI = (FTCInfoStickerViewModel) C1659630tI1.LIZLLL(view).get(FTCInfoStickerViewModel.class);
        c121wLLLIILIL2.LLJJIJIL = view;
        c121wLLLIILIL2.LLJL = (FrameLayout) view.findViewById(R.id.tsc);
        c121wLLLIILIL2.LLILLL = (C121Z) c121wLLLIILIL2.LLJJIJIL.findViewById(R.id.knj);
        c121wLLLIILIL2.LLILZ = c121wLLLIILIL2.LLJJIJIL.findViewById(R.id.lr1);
        c121wLLLIILIL2.LLILZIL = c121wLLLIILIL2.LLJJIJIL.findViewById(R.id.evm);
        c121wLLLIILIL2.LLILZLL = (C19471411Fw) c121wLLLIILIL2.LLJJIJIL.findViewById(R.id.xqb);
        c121wLLLIILIL2.LLIZ = (C12UW) c121wLLLIILIL2.LLJJIJIL.findViewById(R.id.video_edit_view);
        c121wLLLIILIL2.LLIZLLLIL = (ImageView) c121wLLLIILIL2.LLJJIJIL.findViewById(R.id.dat);
        c121wLLLIILIL2.LLJ = (ImageView) c121wLLLIILIL2.LLJJIJIL.findViewById(R.id.tz5);
        c121wLLLIILIL2.LLJI = (ImageView) c121wLLLIILIL2.LLJJIJIL.findViewById(R.id.ct9);
        c121wLLLIILIL2.LLJILJIL = c121wLLLIILIL2.LLJJIJIL.findViewById(R.id.qga);
        c121wLLLIILIL2.LLJILJILJ = (TuxTextView) c121wLLLIILIL2.LLJJIJIL.findViewById(R.id.qg3);
        c121wLLLIILIL2.LLJILLL = (TuxTextView) c121wLLLIILIL2.LLJJIJIL.findViewById(R.id.qgt);
        c121wLLLIILIL2.LLJJ = (SeekBar) c121wLLLIILIL2.LLJJIJIL.findViewById(R.id.qgr);
        c121wLLLIILIL2.LLJJI = (ViewGroup) c121wLLLIILIL2.LLJJIJIL.findViewById(R.id.qgs);
        c121wLLLIILIL2.LLLII = (FTCEditCornerViewModel) C1659640tI2.LIZJ(c121wLLLIILIL2.LLJL).LIZ(FTCEditCornerViewModel.class);
        C196878121c c196878121c = new C196878121c(c121wLLLIILIL2.LLLIIIIL, c121wLLLIILIL2.LLJJIII, c121wLLLIILIL2.LLLIIII);
        c121wLLLIILIL2.LLLFZ = c196878121c;
        c196878121c.LJI = new C196899121x(c121wLLLIILIL2);
        ViewGroup viewGroup = c121wLLLIILIL2.LLJJI;
        if (viewGroup != null) {
            viewGroup.setOnTouchListener(new ATListenerS461S0100000_29(c121wLLLIILIL2, 17));
        }
        C121Z c121z = c121wLLLIILIL2.LLILLL;
        int visibility = c121z.getVisibility();
        c121z.setVisibility(0);
        C1602160rnK.LIZIZ(visibility, 0, c121z);
        final C121Z c121z2 = c121wLLLIILIL2.LLILLL;
        SafeHandler safeHandler = c121wLLLIILIL2.LLJJL;
        InterfaceC1452170ntP interfaceC1452170ntP2 = c121wLLLIILIL2.LLJJIII;
        VideoPublishEditModel videoPublishEditModel2 = c121wLLLIILIL2.LLJJIJIIJIL;
        View view2 = c121wLLLIILIL2.LLJJIJIL;
        c121z2.LLILLL = interfaceC1452170ntP2;
        c121z2.LLILZ = safeHandler;
        c121z2.LLILZIL = new C196880121e(c121z2, interfaceC1452170ntP2, view2);
        c121z2.LLJJJ = new AbstractC21664419qU() { // from class: X.121a
            @Override // X.C0FUM, com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
            public final boolean E2(C21645419nQ c21645419nQ) {
                C121Z c121z3 = c121z2;
                if (!c121z3.LLILZLL) {
                    return false;
                }
                c121z3.LIZIZ();
                getClass();
                return this instanceof C1417630mzh;
            }

            @Override // X.C0FUM, com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
            public final void LJFF(b bVar) {
                InterfaceC196898121w interfaceC196898121w;
                C121Z c121z3 = c121z2;
                if (c121z3.LLILZLL && (interfaceC196898121w = c121z3.LLJJIII) != null) {
                    c121z3.LLJ.getClass();
                    interfaceC196898121w.LIZ(false);
                }
            }

            @Override // X.C0FUM, com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
            public final boolean LJIIIZ(float f) {
                InterfaceC196898121w interfaceC196898121w;
                C121Z c121z3 = c121z2;
                if (c121z3.LLILZLL && (interfaceC196898121w = c121z3.LLJJIII) != null) {
                    c121z3.LLJ.getClass();
                    interfaceC196898121w.LIZ(true);
                    return false;
                }
                return false;
            }

            @Override // X.C0FUM, com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
            public final boolean LJJLIIIJLJLI(float f) {
                C121Z c121z3 = c121z2;
                if (!c121z3.LLILZLL) {
                    return false;
                }
                c121z3.LLJ.getClass();
                return this instanceof C1417630mzh;
            }

            @Override // X.C0FUM, com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
            public final boolean LLLLJI(float f) {
                return false;
            }

            @Override // X.C0FUM, com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
            public final boolean LLLZLZ(b bVar) {
                C121Z c121z3 = c121z2;
                if (!c121z3.LLILZLL) {
                    return false;
                }
                PointF pointF = bVar.LJIIJJI;
                float f = pointF.x;
                float f2 = pointF.y;
                float f3 = c121z3.LLJILJILJ + f;
                float f4 = c121z3.LLJILLL + f2;
                float fAbs = Math.abs(f3 - c121z3.LLJJ);
                float fAbs2 = Math.abs(f4 - c121z2.LLJJI);
                if (fAbs < 5.0f && fAbs2 < 5.0f) {
                    return false;
                }
                getClass();
                return false;
            }

            @Override // X.C0FUM, com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
            public final boolean onDown(MotionEvent motionEvent) {
                c121z2.LLJI = false;
                float y = motionEvent.getY() - c0.LIZ.n2();
                c121z2.LLJILJILJ = motionEvent.getX();
                C121Z c121z3 = c121z2;
                c121z3.LLJILLL = y;
                c121z3.LLJJ = motionEvent.getX();
                C121Z c121z4 = c121z2;
                c121z4.LLJJI = y;
                c121z4.LLJIJIL = System.currentTimeMillis();
                C121Z c121z5 = c121z2;
                c121z5.getClass();
                c121z5.LLJ.getClass();
                if (c121z5.LLILZLL) {
                    motionEvent.getX();
                    if (!C0IKQ.LIZ(c121z5.LLILZIL.LIZ)) {
                        C196880121e c196880121e2 = c121z5.LLILZIL;
                        if (c196880121e2 != null) {
                            Iterator it2 = ((ArrayList) c196880121e2.LIZ).iterator();
                            if (it2.hasNext()) {
                                it2.next().getClass();
                                throw null;
                            }
                        }
                        c121z5.LLILLL.LLL();
                        Iterator it3 = ((ArrayList) c121z5.LLILZIL.LIZ).iterator();
                        if (!it3.hasNext()) {
                            c121z5.LLJ.getClass();
                            c121z5.LLILZIL.getClass();
                            return false;
                        }
                        Object next = it3.next();
                        c121z5.LLILZIL.getClass();
                        next.getClass();
                        throw null;
                    }
                }
                return false;
            }

            @Override // X.C0FUM, com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
            public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
                C121Z c121z3 = c121z2;
                if (!c121z3.LLILZLL) {
                    return false;
                }
                c121z3.LLJ.getClass();
                return this instanceof C1417630mzh;
            }

            @Override // X.C0FUM, com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
            public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
                C121Z c121z3 = c121z2;
                if (!c121z3.LLILZLL) {
                    return false;
                }
                scaleGestureDetector.getFocusX();
                scaleGestureDetector.getFocusY();
                c121z3.LIZIZ();
                getClass();
                return false;
            }

            @Override // X.C0FUM, com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
            public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
                C121Z c121z3 = c121z2;
                if (c121z3.LLJILJIL) {
                    if (!c121z3.LLJJIJIL) {
                        return false;
                    }
                    c121z3.LLJJIJIL = false;
                    return true;
                }
                if (c121z3.LLILZIL != null) {
                    motionEvent.getY();
                    c0.LIZ.n2();
                    C196880121e c196880121e2 = c121z2.LLILZIL;
                    motionEvent.getX();
                    List<AnonymousClass1219> list = c196880121e2.LIZ;
                    if (list != null && ((ArrayList) list).size() != 0) {
                        Iterator it2 = ((ArrayList) c196880121e2.LIZ).iterator();
                        while (it2.hasNext()) {
                            it2.next().getClass();
                        }
                    }
                }
                return false;
            }

            @Override // X.C0FUM, com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
            public final boolean onUp(MotionEvent motionEvent) {
                c121z2.getClass();
                c121z2.LLJJJJ.set(motionEvent.getRawX(), motionEvent.getRawY());
                C121Z c121z3 = c121z2;
                boolean z = false;
                if (!c121z3.LLILZLL) {
                    return false;
                }
                if (c121z3.LLJJIII != null) {
                    c121z3.LLJ.getClass();
                }
                long jCurrentTimeMillis = System.currentTimeMillis();
                C121Z c121z4 = c121z2;
                if (jCurrentTimeMillis - c121z4.LLJIJIL < 200) {
                    c121z4.LLJ.getClass();
                    C121Z c121z5 = c121z2;
                    C196880121e c196880121e2 = c121z5.LLILZIL;
                    if (c196880121e2 != null) {
                        if (c196880121e2.LIZIZ != null) {
                            z = true;
                        }
                        c196880121e2.LIZ();
                        c121z5.LLJILJIL = z;
                    }
                    c121z2.LLJJJIL.LJII();
                    c121z2.invalidate();
                    boolean z2 = c121z2.LLJJIJIL;
                    return true;
                }
                boolean z3 = c121z4.LLJJIJIL;
                return false;
            }

            @Override // X.C0FUM, com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
            public final boolean LLLLLLLLL(b bVar, float f, float f2) {
                c0.LIZ.n2();
                C121Z c121z3 = c121z2;
                if (!c121z3.LLILZLL) {
                    return false;
                }
                c121z3.LLJ.getClass();
                c121z2.LIZIZ();
                getClass();
                return false;
            }

            @Override // X.C0FUM, com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
            public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
                if (!c121z2.LLILZLL) {
                    return false;
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("onFling: ");
                getClass();
                sbLIZ.append(true);
                C2188811AlT.LIZIZ(sbLIZ);
                C121Z c121z3 = c121z2;
                if (c121z3.LLJI) {
                    c121z3.LLJI = false;
                    return true;
                }
                c121z3.LLJ.getClass();
                return false;
            }

            @Override // X.C0FUM, com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
            public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
                C121Z c121z3 = c121z2;
                if (!c121z3.LLILZLL) {
                    return false;
                }
                c121z3.LLJ.getClass();
                return false;
            }
        };
        c121z2.LLJJJIL.LJIIL = videoPublishEditModel2;
        if ((c121z2.LL == 0 || c121z2.LLILLJJLI == 0) && (interfaceC1452170ntP = c121z2.LLILLL) != null) {
            VESize initSize = interfaceC1452170ntP.getInitSize();
            c121z2.LL = initSize.width;
            c121z2.LLILLJJLI = initSize.height;
            ScreenUtils.getScreenWidth(c121z2.getContext());
            if (!C537820L7k.LIZ(c121z2.LL, c121z2.LLILLJJLI)) {
                ScreenUtils.getFullScreenHeight(c121z2.getContext());
                c0 c0Var = c0.LIZ;
                c0Var.p2();
                if (c0Var.LJIIIIZZ()) {
                    c0Var.o2();
                } else {
                    c0Var.o2();
                }
                c0Var.LJFF();
            }
        }
        C786410Ut5.LJLLLLLL(8, c121wLLLIILIL2.LLILZIL);
        c121wLLLIILIL2.LLILLL.setOnInfoStickerTimeEdit(new InterfaceC19629711r5() { // from class: X.121j
            @Override // X.InterfaceC19629711r5
            public final void LIZ(C196874120y c196874120y) {
                C121W c121w = c121wLLLIILIL2;
                c121w.LLJJIJI.LLILLL.setValue(Boolean.TRUE);
                c121w.LJII(true, c196874120y);
            }
        });
        c121wLLLIILIL2.LLILLL.setOnInfoStickerPinEditClick(new InterfaceC19629711r5() { // from class: X.121k
            /* JADX WARN: Multi-variable type inference failed */
            @Override // X.InterfaceC19629711r5
            public final void LIZ(C196874120y c196874120y) {
                C121W c121w = c121wLLLIILIL2;
                c121w.LLJJIJI.LLILZ.setValue(Boolean.TRUE);
                c121w.LJI(true, (C196874120y) ((AnonymousClass1219) c196874120y), false);
            }
        });
        c121wLLLIILIL2.LLILLL.setITimeEditListener(c121wLLLIILIL2);
        c121wLLLIILIL2.LLILLL.setPinHelper(c121wLLLIILIL2.LLLFZ);
        C786410Ut5.x3(c121wLLLIILIL2.LLJL.getViewTreeObserver(), new C12YW(c121wLLLIILIL2, 7));
        c121wLLLIILIL2.LLILLL.setStickerOnMoveListener(new InterfaceC196898121w() { // from class: X.121o
            @Override // X.InterfaceC196898121w
            public final int LIZ(boolean z) {
                InterfaceC1453510nvZ interfaceC1453510nvZ = c121wLLLIILIL2.LLJLLL;
                if (interfaceC1453510nvZ == null) {
                    return -1;
                }
                interfaceC1453510nvZ.LJ();
                return -1;
            }
        });
        C196880121e c196880121e2 = c121wLLLIILIL2.LLILLL.LLILZIL;
        new C0FIB() { // from class: X.121m
            @Override // X.C0FIB
            public final void accept(Object obj) {
                C121W c121w = c121wLLLIILIL2;
                AnonymousClass1219 anonymousClass1219 = (AnonymousClass1219) obj;
                if ((c121w.LLLLZLLIL() || c121w.LIZ()) && c121w.LLILLL.LLIZLLLIL == 1) {
                    if (c121w.LIZ()) {
                        c121w.LJIIIIZZ(anonymousClass1219, 1);
                    } else {
                        c121w.LJIIIIZZ(anonymousClass1219, 0);
                    }
                }
            }
        };
        c196880121e2.getClass();
        C121W c121wLLLIILIL3 = LLLIILIL();
        FrameLayout frameLayout = this.LLJJIJI;
        InterfaceC1461390o8H interfaceC1461390o8H = null;
        if (frameLayout == null) {
            frameLayout = null;
        }
        if (c121wLLLIILIL3.LLJJIII != null && frameLayout != null) {
            HandlerHook.viewPost(c121wLLLIILIL3.LLJL, new ARunnableS98S0200000_29(c121wLLLIILIL3, frameLayout, 43));
        }
        LLLIILIL().LLJLILLLLZIIL = LLLIIIIL().Ps();
        LLLIILIL().LLJLIL = LLLIIIIL().lk();
        LLLIILIL().LLJJIJI.LLILLL = ((FTCEditStickerViewModel) this.LLJJIII.getValue()).rb();
        LLLIILIL().LLJJIJI.LLILZ = ((FTCEditStickerViewModel) this.LLJJIII.getValue()).Mk0();
        LLLIILIL().LLJJIJI.LL = LLLIIIIL().vW1();
        LLLIILIL().LLJJIJI.LLILLJJLI = LLLIIIIL().MW1();
        subscribeEvent((JediViewModel) this.LLJJ.getValue(), new C2217381BqS() { // from class: X.121p
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((FTCEditInfoStickerState) obj).getHideHelpBoxEvent();
            }
        }, new C1765020w20(), new AwS643S0100000_29(this, 66));
        subscribeEvent((JediViewModel) this.LLJJ.getValue(), new C2217381BqS() { // from class: X.121q
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((FTCEditInfoStickerState) obj).getResetVideoLengthEvent();
            }
        }, new C1765020w20(), new AwS643S0100000_29(this, 67));
        selectNonNullSubscribe((JediViewModel) this.LLJJ.getValue(), new C2217381BqS() { // from class: X.121r
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((FTCEditInfoStickerState) obj).getRefreshVideoSource();
            }
        }, new C1765020w20(), new AwS643S0100000_29(this, 68));
        subscribeEvent((JediViewModel) this.LLJJ.getValue(), new C2217381BqS() { // from class: X.121s
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((FTCEditInfoStickerState) obj).getEditViewAnimEvent();
            }
        }, new C1765020w20(), new AwS643S0100000_29(this, 69));
        subscribeEvent((JediViewModel) this.LLJJ.getValue(), new C2217381BqS() { // from class: X.121t
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((FTCEditInfoStickerState) obj).getEditViewLayoutEvent();
            }
        }, new C1765020w20(), new AwS643S0100000_29(this, 65));
        LLLIILIL().LLILLL.setStickerDataChangeListener(new C121P() { // from class: X.120q
            @Override // X.C121P
            public final void LIZIZ(StickerItemModel stickerItemModel) {
                if (this.LIZ.LLLIILIL().LLJJIJIIJIL.getInfoStickerModel() == null) {
                    this.LIZ.LLLIILIL().LLJJIJIIJIL.setInfoStickerModel(new InfoStickerModel(C0CHQ.LIZ().LJJIIJZLJL().getPathAdapter().LJJLIIIJ(this.LIZ.LLLIILIL().LLJJIJIIJIL)));
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("add infoSticker ");
                sbLIZ.append(stickerItemModel.getId());
                C201955140j.LJIIL(C2188811AlT.LIZIZ(sbLIZ));
                InfoStickerModel infoStickerModel = this.LIZ.LLLIILIL().LLJJIJIIJIL.getInfoStickerModel();
                if (infoStickerModel != null) {
                    infoStickerModel.addSticker(stickerItemModel);
                }
            }

            @Override // X.C121P
            public final void LIZ(StickerItemModel stickerItemModel, boolean z) {
                InfoStickerModel infoStickerModel = this.LIZ.LLLIILIL().LLJJIJIIJIL.getInfoStickerModel();
                if (infoStickerModel != null) {
                    infoStickerModel.removeSticker(stickerItemModel);
                }
                C121Y c121y = this.LIZ;
                ((C1439740nZM) c121y.LLJILLL.getValue(c121y, C121Y.LLJJIJIL[1])).LIZJ(stickerItemModel.stickerId);
            }
        });
        C121W c121wLLLIILIL4 = LLLIILIL();
        new InterfaceC196898121w(this) { // from class: X.121u
            @Override // X.InterfaceC196898121w
            public final int LIZ(boolean z) {
                return 0;
            }
        };
        c121wLLLIILIL4.getClass();
        LLLIILIL().LLJZIJLIL = new C196882121g(this);
        C121W c121wLLLIILIL5 = LLLIILIL();
        new AnonymousClass1222() { // from class: X.121n
            @Override // X.AnonymousClass1222
            public final void LIZ() {
                ((FTCEditTextStickerViewModel) this.LIZ.LLJJI.getValue()).LJJJLZIJ();
            }
        };
        C121Z c121z3 = c121wLLLIILIL5.LLILLL;
        if (c121z3 != null && (c196880121e = c121z3.LLILZIL) != null) {
            c196880121e.getClass();
        }
        InterfaceC1461390o8H interfaceC1461390o8H2 = this.LLJIJIL;
        if (interfaceC1461390o8H2 != null) {
            interfaceC1461390o8H = interfaceC1461390o8H2;
        }
        interfaceC1461390o8H.LIZIZ(new GestureInteractItem(100, LLLIILIL().LLILLL.getGestureListener()));
    }

    @Override // X.C11E9
    public final <VM1 extends JediViewModel<S1>, S1 extends C004I, R> R withState(VM1 vm1, Function1<? super S1, ? extends R> function1) {
        return function1.invoke(vm1.FQ2());
    }

    @Override // com.bytedance.scene.Scene
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return C786410Ut5.Td(layoutInflater, R.layout.cc9, viewGroup, false);
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
