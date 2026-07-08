package X;

import Y.ATListenerS439S0100000_5;
import android.content.Context;
import android.graphics.Canvas;
import android.os.Bundle;
import android.util.Size;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.lifecycle.Lifecycle;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AwS584S0100000_5;
import zoo.b;

/* JADX INFO: renamed from: X.0FBI, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0FBI extends AbstractC1664490tPr<C385730FAl, C0FUX> {
    public C0FEW LLJJJIL;
    public AppCompatImageView LLJJJJ;
    public C1295960jpS LLJJJJJIL;
    public FrameLayout LLJJJJLIIL;
    public final C0FBF LLJJL;
    public final C0FBL LLJJLIIIJLLLLLLLZ;
    public final C0FBH LLJL;
    public final C0FBJ LLJLIL;
    public final List<C0FBW> LLJLILLLLZIIL;
    public List<? extends C0FBW> LLJLL;
    public C0ZDN LLJLLIL;

    public C0FBI() {
        C0FBF c0fbf = new C0FBF();
        this.LLJJL = c0fbf;
        C0FBL c0fbl = new C0FBL();
        this.LLJJLIIIJLLLLLLLZ = c0fbl;
        C0FBH c0fbh = new C0FBH();
        this.LLJL = c0fbh;
        C0FBJ c0fbj = new C0FBJ();
        this.LLJLIL = c0fbj;
        List<C0FBW> listLJIIJJI = C1697810uHb.LJIIJJI(c0fbf, c0fbj, c0fbl, c0fbh);
        this.LLJLILLLLZIIL = listLJIIJJI;
        this.LLJLL = listLJIIJJI;
    }

    @Override // com.bytedance.scene.Scene
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.LLJLLIL = new C0ZDN(view.getContext());
        C0FEW c0few = this.LLJJJIL;
        if (c0few != null) {
            c0few.setOnGestureListener(new C0FUM() { // from class: X.0FUY
                public MotionEvent LL;

                @Override // X.C0FUM, com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
                public final boolean LIZLLL() {
                    this.LLILLJJLI.LLLLIL().LJIIZILJ.invoke();
                    return true;
                }

                @Override // X.C0FUM, com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
                public final boolean LJ() {
                    this.LLILLJJLI.LLLLIL().LJIILLIIL.invoke();
                    return true;
                }

                @Override // X.C0FUM, com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
                public final boolean E2(C21645419nQ c21645419nQ) {
                    if (c21645419nQ == null) {
                        return false;
                    }
                    this.LLILLJJLI.LLLLIL().LJIIIIZZ.invoke(c21645419nQ);
                    return true;
                }

                @Override // X.C0FUM, com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
                public final boolean LIZIZ(MotionEvent motionEvent) {
                    if (motionEvent == null) {
                        return false;
                    }
                    this.LLILLJJLI.LLLLIL().LJ.invoke(motionEvent);
                    return true;
                }

                @Override // X.C0FUM, com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
                public final void LJFF(b bVar) {
                    if (bVar == null) {
                        return;
                    }
                    this.LLILLJJLI.LLLLIL().LJIILIIL.invoke(bVar);
                }

                @Override // X.C0FUM, com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
                public final boolean LJIIIZ(float f) {
                    this.LLILLJJLI.LLLLIL().LJIIJ.invoke(Float.valueOf(f));
                    return true;
                }

                @Override // X.C0FUM, com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
                public final void LJIJJ(MotionEvent motionEvent) {
                    this.LL = null;
                    if (motionEvent == null) {
                        return;
                    }
                    this.LLILLJJLI.LLLLIL().LIZJ.invoke(motionEvent);
                }

                @Override // X.C0FUM, com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
                public final void LJJIJIIJIL(MotionEvent motionEvent) {
                    this.LL = motionEvent;
                    if (motionEvent == null) {
                        return;
                    }
                    this.LLILLJJLI.LLLLIL().LIZ.invoke(motionEvent);
                }

                @Override // X.C0FUM, com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
                public final boolean LJJLIIIJLJLI(float f) {
                    this.LLILLJJLI.LLLLIL().LJIIIZ.invoke(Float.valueOf(f));
                    return true;
                }

                @Override // X.C0FUM, com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
                public final boolean LLLLJI(float f) {
                    this.LLILLJJLI.LLLLIL().LJII.invoke(Float.valueOf(f));
                    return true;
                }

                @Override // X.C0FUM, com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
                public final boolean LLLZLZ(b bVar) {
                    if (bVar == null) {
                        return false;
                    }
                    this.LLILLJJLI.LLLLIL().LJIIL.invoke(bVar);
                    return true;
                }

                @Override // X.C0FUM, com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
                public final boolean onDown(MotionEvent motionEvent) {
                    if (motionEvent == null) {
                        return false;
                    }
                    this.LLILLJJLI.LLLLIL().LJIILJJIL.invoke(motionEvent);
                    return true;
                }

                @Override // X.C0FUM, com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
                public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
                    if (scaleGestureDetector == null) {
                        return false;
                    }
                    this.LLILLJJLI.LLLLIL().LJI.invoke(scaleGestureDetector);
                    return true;
                }

                @Override // X.C0FUM, com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
                public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
                    if (scaleGestureDetector == null) {
                        return false;
                    }
                    MotionEvent motionEvent = this.LL;
                    if (motionEvent != null && motionEvent.getPointerCount() <= 1) {
                        return false;
                    }
                    this.LLILLJJLI.LLLLIL().LJFF.invoke(scaleGestureDetector);
                    return true;
                }

                @Override // X.C0FUM, com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
                public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
                    if (motionEvent == null) {
                        return false;
                    }
                    this.LLILLJJLI.LLLLIL().LIZLLL.invoke(motionEvent);
                    return true;
                }

                @Override // X.C0FUM, com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
                public final boolean onSingleTapUp(MotionEvent motionEvent) {
                    if (motionEvent == null) {
                        return false;
                    }
                    this.LLILLJJLI.LLLLIL().LJIJ.invoke(motionEvent);
                    return true;
                }

                @Override // X.C0FUM, com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
                public final void onTouchEvent(MotionEvent motionEvent) {
                    if (motionEvent == null) {
                        return;
                    }
                    this.LLILLJJLI.LLLLIL().LIZIZ.invoke(motionEvent);
                }

                @Override // X.C0FUM, com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
                public final boolean onUp(MotionEvent motionEvent) {
                    if (motionEvent == null) {
                        return false;
                    }
                    this.LLILLJJLI.LLLLIL().LJIILL.invoke(motionEvent);
                    return true;
                }

                @Override // X.C0FUM, com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
                public final boolean LLLLLLLLL(b bVar, float f, float f2) {
                    if (bVar == null) {
                        return false;
                    }
                    this.LLILLJJLI.LLLLIL().LJIIJJI.invoke(bVar, Float.valueOf(f), Float.valueOf(f2));
                    return true;
                }
            });
        }
        C0FEW c0few2 = this.LLJJJIL;
        if (c0few2 != null) {
            c0few2.setOnDispatchDrawListener(new C0FBX() { // from class: X.0FBK
                @Override // X.C0FBX
                public final void LIZ(Canvas canvas) {
                    Size size;
                    C0FBI c0fbi = this.LIZ;
                    C0FEW c0few3 = c0fbi.LLJJJIL;
                    if (c0few3 == null || (size = c0fbi.LLLLILI().LIZ.LIZIZ) == null || !this.LIZ.LLLLILI().LIZ.LJIILL) {
                        return;
                    }
                    Iterator<? extends C0FBW> it2 = this.LIZ.LLJLL.iterator();
                    while (it2.hasNext()) {
                        it2.next().LIZ(canvas, size, c0few3);
                    }
                }
            });
        }
        C0FEW c0few3 = this.LLJJJIL;
        if (c0few3 != null) {
            c0few3.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC391530FWt(this, 17));
        }
        FrameLayout frameLayout = this.LLJJJJLIIL;
        if (frameLayout != null) {
            frameLayout.setOnTouchListener(new ATListenerS439S0100000_5(this, 9));
        }
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.0FAv
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C385730FAl) obj).LJFF);
            }
        }, Lifecycle.State.STARTED, new AwS584S0100000_5(this, 1042));
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.0FB2
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C385730FAl) obj).LJIILLIIL;
            }
        }, Lifecycle.State.STARTED, new AwS584S0100000_5(this, 1044));
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.0FAx
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C385730FAl) obj).LJIIIIZZ);
            }
        }, Lifecycle.State.STARTED, new AwS584S0100000_5(this, 1046));
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.0FAz
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C385730FAl) obj).LJIIJ);
            }
        }, Lifecycle.State.STARTED, new AwS584S0100000_5(this, 1043));
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.0FAw
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C385730FAl) obj).LJIIJJI);
            }
        }, Lifecycle.State.STARTED, new AwS584S0100000_5(this, 1045));
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.0FAy
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C385730FAl) obj).LJIIIZ);
            }
        }, Lifecycle.State.STARTED, new AwS584S0100000_5(this, 1047));
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.0FB1
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C385730FAl) obj).LJIIL;
            }
        }, Lifecycle.State.STARTED, new AwS584S0100000_5(this, 1048));
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.0FAr
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C385730FAl) obj).LJIILIIL;
            }
        }, Lifecycle.State.STARTED, new AwS584S0100000_5(this, 1049));
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.0FAs
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C385730FAl) obj).LJIILJJIL;
            }
        }, Lifecycle.State.STARTED, new AwS584S0100000_5(this, 1050));
        AbstractC1664490tPr.LLLLLILLIL(this, LLLLILI(), new C2217381BqS() { // from class: X.0F9o
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C385730FAl) obj).LJIIZILJ;
            }
        }, new AwS584S0100000_5(this, 1051));
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.0FBR
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C385730FAl) obj).LJIJ;
            }
        }, Lifecycle.State.STARTED, new AwS584S0100000_5(this, 1052));
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.0FAt
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C385730FAl) obj).LJIJI);
            }
        }, Lifecycle.State.STARTED, new AwS584S0100000_5(this, 1039));
        AbstractC1664490tPr.LLLLLILLIL(this, LLLLILI(), new C2217381BqS() { // from class: X.0FB0
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C385730FAl) obj).LJIJJ;
            }
        }, new AwS584S0100000_5(this, 1040));
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.0FAu
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C385730FAl) obj).LJIJJLI);
            }
        }, Lifecycle.State.STARTED, new AwS584S0100000_5(this, 1041));
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, X.C19A3, com.bytedance.scene.Scene
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i;
        Context contextRequireSceneContext = requireSceneContext();
        if (C357780E0y.LIZ()) {
            i = R.layout.wb;
        } else {
            i = R.layout.wa;
        }
        ViewGroup viewGroup2 = (ViewGroup) C21146717pB.LIZIZ(contextRequireSceneContext, i, viewGroup, false);
        viewGroup2.setOnTouchListener(new View.OnTouchListener() { // from class: X.0FBN
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return true;
            }
        });
        this.LLJJJJ = (AppCompatImageView) viewGroup2.findViewById(R.id.c24);
        this.LLJJJIL = (C0FEW) viewGroup2.findViewById(R.id.iux);
        this.LLJJJJLIIL = (FrameLayout) viewGroup2.findViewById(R.id.exj);
        C0FEW c0few = this.LLJJJIL;
        if (c0few != null) {
            c0few.setMoveSlop(C0EGK.LIZ(2));
        }
        C0FEW c0few2 = this.LLJJJIL;
        if (c0few2 != null) {
            c0few2.setIsLongPressEnabled(true);
        }
        C0FEW c0few3 = this.LLJJJIL;
        if (c0few3 != null) {
            c0few3.LLILZIL.LJIILLIIL = false;
        }
        return viewGroup2;
    }
}
