package X;

import Y.ARunnableS94S0200000_25;
import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.experiment.SimplifyCameraPermissionExperiment;
import com.ss.android.ugc.aweme.experiment.SimplifyCameraPermissionExperimentV2Gif;
import com.ss.android.ugc.slideslip.view.CarouselLayoutManager;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS214S0000000_25;
import kotlin.jvm.internal.AwS569S0100000_25;

/* JADX INFO: renamed from: X.0sWS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1630140sWS extends AbstractC1585810rMx {
    public final Scene LL;
    public final CarouselLayoutManager LLILLJJLI;
    public final C1630500sX2 LLILLL;
    public final C20636015p0 LLILZ;
    public final C1627130sRb LLILZIL;
    public final C0GRO LLILZLL;
    public final boolean LLIZ;
    public final float LLIZLLLIL;
    public int LLJ;
    public final Function1<Boolean, Unit> LLJIJIL;
    public final InterfaceC1631620sYq<Integer, InterfaceC1626470sQX, Boolean, Unit> LLJILJIL;
    public final Function2<Integer, InterfaceC1626470sQX, Unit> LLJILJILJ;
    public final Function0<Unit> LLJILLL;
    public C1351210lGZ LLJJ;
    public boolean LLJJJ;
    public final int LLJI = 12;
    public final C01GW LLJJI = C452501pT.LIZIZ(AFwS214S0000000_25.get$arr$(587));
    public final C01GW LLJJIII = C452501pT.LIZIZ(AFwS214S0000000_25.get$arr$(588));
    public final C01GW LLJJIJI = C452501pT.LIZIZ(AFwS214S0000000_25.get$arr$(585));
    public final C01GW LLJJIJIIJIL = C452501pT.LIZIZ(AFwS214S0000000_25.get$arr$(586));
    public int LLJJIJIL = -1;
    public long LLJJJIL = System.currentTimeMillis();
    public int LLJJJJ = -1;
    public int LLJJJJJIL = -1;
    public final C01GW LLJJJJLIIL = C452501pT.LIZIZ(new AwS569S0100000_25(this, 1154));
    public final C01GW LLJJL = C452501pT.LIZIZ(new AwS569S0100000_25(this, 1155));
    public int LLJJLIIIJLLLLLLLZ = -1;
    public int LLJL = -1;
    public int LLJLIL = -1;

    public final int LJJIJIIJIL() {
        if (this.LLJJLIIIJLLLLLLLZ == -1) {
            this.LLJJLIIIJLLLLLLLZ = LJJJJJ();
        }
        return this.LLJJLIIIJLLLLLLLZ;
    }

    public final int LJJIL() {
        if (this.LLJLIL == -1) {
            this.LLJLIL = LJJJJZ();
        }
        return this.LLJLIL;
    }

    public final int LJJIZ() {
        if (this.LLJL == -1) {
            this.LLJL = LJJJJZI();
        }
        return this.LLJL;
    }

    public final int LJJJJJ() {
        return this.LLIZ ? C814420VxA.LIZIZ(C418440Gaw.LIZIZ(166)) : (this.LLJ - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(42))) + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2));
    }

    public final int LJJJJZ() {
        return LJJIJIIJIL() + (this.LLIZ ? C814420VxA.LIZIZ(C418440Gaw.LIZIZ(42)) : -C814420VxA.LIZIZ(C418440Gaw.LIZIZ(42)));
    }

    public final int LJJJJZI() {
        return LJJIJIIJIL() + (this.LLIZ ? C814420VxA.LIZIZ(C418440Gaw.LIZIZ(84)) : -C814420VxA.LIZIZ(C418440Gaw.LIZIZ(84)));
    }

    public final void LJJJLIIL(int i) {
        if (this.LLJJIJIL == i) {
            return;
        }
        this.LLJJIJIL = i;
        if ((SimplifyCameraPermissionExperiment.isEnabled() || SimplifyCameraPermissionExperimentV2Gif.isEnabled()) && !C533930Kwp.LIZLLL("android.permission.CAMERA")) {
            return;
        }
        if (i <= 0) {
            C0GRO c0gro = this.LLILZLL;
            int visibility = c0gro.getVisibility();
            c0gro.setVisibility(0);
            C1602160rnK.LIZIZ(visibility, 0, c0gro);
            return;
        }
        C0GRO c0gro2 = this.LLILZLL;
        int visibility2 = c0gro2.getVisibility();
        c0gro2.setVisibility(8);
        C1602160rnK.LIZIZ(visibility2, 8, c0gro2);
    }

    @Override // X.AbstractC1585810rMx
    public final void LJJIIJ(RecyclerView recyclerView, int i) {
        boolean z;
        Integer num;
        int iIntValue;
        InterfaceC1626470sQX interfaceC1626470sQXLLLFZ;
        InterfaceC1626470sQX interfaceC1626470sQXLLLFZ2;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("carousel view onScrollStateChanged, new state: ");
        sbLIZ.append(i);
        C1628270sTR.LIZIZ("CarouselViewScrollListener", C2188811AlT.LIZIZ(sbLIZ));
        if (i == 1) {
            z = true;
        } else {
            z = false;
        }
        this.LLJJJ = z;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    this.LLJIJIL.invoke(Boolean.FALSE);
                    this.LLILZIL.LJ.invoke(Boolean.TRUE);
                    return;
                }
                return;
            }
            this.LLJIJIL.invoke(Boolean.FALSE);
            this.LLILZIL.LJ.invoke(Boolean.TRUE);
            return;
        }
        Function1<Boolean, Unit> function1 = this.LLJIJIL;
        Boolean bool = Boolean.TRUE;
        function1.invoke(bool);
        View viewLJFF = LJFF(this.LLILLJJLI);
        Object tag = null;
        if (viewLJFF != null) {
            if (Math.abs(LIZJ(this.LLILLJJLI, viewLJFF)[0]) < 2) {
                LJJJ(viewLJFF, ((Number) this.LLJJJJLIIL.getValue()).floatValue());
                C786410Ut5.Jc(viewLJFF, 0.0f);
            }
            tag = viewLJFF.getTag();
        }
        if ((tag instanceof Integer) && (num = (Integer) tag) != null && (interfaceC1626470sQXLLLFZ = this.LLILLL.LLLFZ((iIntValue = num.intValue()))) != null) {
            if (interfaceC1626470sQXLLLFZ instanceof C1629810sVv) {
                this.LLILZIL.LIZIZ.invoke(interfaceC1626470sQXLLLFZ, Integer.valueOf(iIntValue), Boolean.FALSE);
                int i2 = iIntValue - 1;
                if (i2 >= 0 && (interfaceC1626470sQXLLLFZ2 = this.LLILLL.LLLFZ(i2)) != null) {
                    this.LLJILJIL.invoke(Integer.valueOf(i2), interfaceC1626470sQXLLLFZ2, bool);
                }
            } else {
                if (((Boolean) this.LLJJI.getValue()).booleanValue() && iIntValue == 0) {
                    this.LLJIJIL.invoke(Boolean.FALSE);
                }
                LJJJLIIL(iIntValue);
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("SCROLL_STATE_IDLE in position: ");
                sbLIZ2.append(iIntValue);
                sbLIZ2.append(" effect: ");
                sbLIZ2.append(C1629110sUn.LIZ(interfaceC1626470sQXLLLFZ).getName());
                C1628270sTR.LIZIZ("CarouselViewScrollListener", C2188811AlT.LIZIZ(sbLIZ2));
                this.LLILZIL.LIZIZ.invoke(interfaceC1626470sQXLLLFZ, Integer.valueOf(iIntValue), Boolean.FALSE);
                this.LLJILLL.invoke();
            }
        }
        this.LLILZIL.LJ.invoke(Boolean.FALSE);
        if (this.LLILZLL.getVisibility() == 0) {
            C0GRO c0gro = this.LLILZLL;
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c0gro);
            c0gro.setAlpha(1.0f);
        } else {
            C0GRO c0gro2 = this.LLILZLL;
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c0gro2);
            c0gro2.setAlpha(0.0f);
        }
    }

    public final void LJJJ(View view, float f) {
        float fLIZIZ;
        if (this.LLIZ) {
            fLIZIZ = C418440Gaw.LIZIZ(80);
        } else {
            fLIZIZ = 0.0f;
        }
        view.setPivotX(fLIZIZ);
        view.setPivotY((C418440Gaw.LIZIZ(84) / 2) - C418440Gaw.LIZIZ(2));
        C786410Ut5.Ob(view, f);
        C786410Ut5.pc(view, f);
    }

    public final void LJJJJ(RecyclerView recyclerView, int i) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("scrollToPosition: ");
        sbLIZ.append(i);
        C1628270sTR.LIZIZ("CarouselViewScrollListener", C2188811AlT.LIZIZ(sbLIZ));
        recyclerView.scrollToPosition(i);
        HandlerHook.viewPost(recyclerView, new ARunnableS94S0200000_25(this, recyclerView, 30));
    }

    public final void LJJJJJL(RecyclerView recyclerView, int i) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("smoothScrollToPosition: ");
        sbLIZ.append(i);
        C1628270sTR.LIZIZ("CarouselViewScrollListener", C2188811AlT.LIZIZ(sbLIZ));
        if (Math.abs(this.LLJJIJIL - i) > 2) {
            LJJJJ(recyclerView, i);
        } else {
            this.LLJJIJIL = -1;
            recyclerView.smoothScrollToPosition(i);
        }
    }

    @Override // X.AbstractC1585810rMx
    public final void LJJIIZI(RecyclerView recyclerView, int i, int i2) {
        float fAbs;
        boolean z;
        Object tag;
        Integer num;
        C1351210lGZ c1351210lGZ;
        int i3;
        int decoratedLeft;
        boolean z2;
        Integer num2;
        boolean z3;
        float fLJJIJIIJIL;
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j = jCurrentTimeMillis - this.LLJJJIL;
        this.LLJJJIL = jCurrentTimeMillis;
        if (j > 0) {
            fAbs = Math.abs(i / j);
        } else {
            fAbs = 0.0f;
        }
        if (fAbs > ((Number) this.LLJJIII.getValue()).floatValue()) {
            z = true;
        } else {
            z = false;
        }
        int childCount = recyclerView.getChildCount();
        int iAbs = Integer.MAX_VALUE;
        int iIntValue = -1;
        View view = null;
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = recyclerView.getChildAt(i4);
            if (this.LLIZ) {
                decoratedLeft = this.LLILLJJLI.getDecoratedRight(childAt);
            } else {
                decoratedLeft = this.LLILLJJLI.getDecoratedLeft(childAt);
            }
            if (!this.LLIZ ? decoratedLeft >= LJJIJIIJIL() - 2 : decoratedLeft <= LJJIJIIJIL() + 2) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                float fAbs2 = Math.abs(LJJIJIIJIL() - decoratedLeft) / Math.abs(LJJIJIIJIL() - LJJIZ());
                if (fAbs2 > 1.0f) {
                    C786410Ut5.LJLLLLLL(4, childAt);
                    C786410Ut5.Ob(childAt, 1.0f);
                    C786410Ut5.pc(childAt, 1.0f);
                    C786410Ut5.Jc(childAt, 0.0f);
                } else {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("child: ");
                    sbLIZ.append(i4);
                    sbLIZ.append(" is scaling in the record center end=");
                    sbLIZ.append(decoratedLeft);
                    sbLIZ.append(" secondEnd=");
                    sbLIZ.append(LJJIJIIJIL());
                    sbLIZ.append(" progress=");
                    sbLIZ.append(fAbs2);
                    C1628270sTR.LIZIZ("CarouselViewScrollListener", C2188811AlT.LIZIZ(sbLIZ));
                    C786410Ut5.LJLLLLLL(0, childAt);
                    float fFloatValue = ((Number) this.LLJJL.getValue()).floatValue() + ((((Number) this.LLJJJJLIIL.getValue()).floatValue() - ((Number) this.LLJJL.getValue()).floatValue()) * (1.0f - Math.min(fAbs2, 1.0f)));
                    float f = 2;
                    childAt.setPivotX((C418440Gaw.LIZIZ(84) / f) - C418440Gaw.LIZIZ(2));
                    childAt.setPivotY((C418440Gaw.LIZIZ(84) / f) - C418440Gaw.LIZIZ(2));
                    C786410Ut5.Ob(childAt, fFloatValue);
                    C786410Ut5.pc(childAt, fFloatValue);
                    if (this.LLIZ) {
                        fLJJIJIIJIL = (LJJIJIIJIL() - decoratedLeft) - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(this.LLJI)));
                    } else {
                        fLJJIJIIJIL = (LJJIJIIJIL() - decoratedLeft) + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(this.LLJI)));
                    }
                    C786410Ut5.Jc(childAt, fLJJIJIIJIL);
                }
            } else if (!this.LLIZ ? decoratedLeft <= LJJIZ() : decoratedLeft >= LJJIZ()) {
                C786410Ut5.LJLLLLLL(0, childAt);
                C786410Ut5.Ob(childAt, 1.0f);
                C786410Ut5.pc(childAt, 1.0f);
                C786410Ut5.Jc(childAt, 0.0f);
            } else {
                C786410Ut5.LJLLLLLL(0, childAt);
                C786410Ut5.Jc(childAt, 0.0f);
                float fAbs3 = 1.0f - (Math.abs(LJJIJIIJIL() - decoratedLeft) / Math.abs(LJJIJIIJIL() - LJJIZ()));
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("child: ");
                sbLIZ2.append(i4);
                sbLIZ2.append(" is animating dx=");
                sbLIZ2.append(i);
                sbLIZ2.append(" dy=");
                sbLIZ2.append(i2);
                sbLIZ2.append(" end=");
                sbLIZ2.append(decoratedLeft);
                sbLIZ2.append(" secondEnd=");
                sbLIZ2.append(LJJIJIIJIL());
                sbLIZ2.append(" scale progress=");
                sbLIZ2.append(fAbs3);
                C1628270sTR.LIZIZ("CarouselViewScrollListener", C2188811AlT.LIZIZ(sbLIZ2));
                Object tag2 = childAt.getTag();
                if ((tag2 instanceof Integer) && (num2 = (Integer) tag2) != null) {
                    iIntValue = num2.intValue();
                } else {
                    iIntValue = -1;
                }
                if (this.LLILZLL.getVisibility() == 0) {
                    C0GRO c0gro = this.LLILZLL;
                    ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c0gro);
                    c0gro.setAlpha(1.0f - fAbs3);
                }
                LJJJ(childAt, ((((Number) this.LLJJJJLIIL.getValue()).floatValue() - 1.0f) * fAbs3) + 1.0f);
            }
            if (!this.LLIZ ? decoratedLeft > LJJIL() : decoratedLeft < LJJIL()) {
                z3 = true;
                if (view == null) {
                    view = childAt;
                }
            } else {
                z3 = false;
            }
            if (Math.abs(decoratedLeft - LJJIL()) < iAbs) {
                iAbs = Math.abs(decoratedLeft - LJJIL());
                if (z3) {
                    view = childAt;
                }
            }
        }
        if (iIntValue > 0 && iIntValue - 1 != this.LLJJIJIL && this.LLILLL.LLLFZ(i3) != null) {
            LJJJLIIL(i3);
        }
        if (iAbs < 20) {
            if (iIntValue != this.LLJJJJJIL) {
                if (!((Boolean) this.LLJJIJIIJIL.getValue()).booleanValue() || !((Boolean) this.LLJJIJI.getValue()).booleanValue()) {
                    if (this.LLJJ == null) {
                        Context sceneContext = this.LL.getSceneContext();
                        if (sceneContext != null) {
                            c1351210lGZ = new C1351210lGZ(sceneContext);
                        } else {
                            c1351210lGZ = null;
                        }
                        this.LLJJ = c1351210lGZ;
                    }
                    C1351210lGZ c1351210lGZ2 = this.LLJJ;
                    if (c1351210lGZ2 != null) {
                        c1351210lGZ2.LIZ();
                    }
                }
                this.LLJJJJJIL = iIntValue;
                InterfaceC1626470sQX interfaceC1626470sQXLLLFZ = this.LLILLL.LLLFZ(iIntValue - 1);
                if (interfaceC1626470sQXLLLFZ != null) {
                    this.LLJILJILJ.invoke(Integer.valueOf(iIntValue), interfaceC1626470sQXLLLFZ);
                }
            }
        } else {
            this.LLJJJJJIL = -1;
        }
        if (((Boolean) this.LLJJIJIIJIL.getValue()).booleanValue()) {
            if (!this.LLJJJ || z) {
                return;
            }
        } else if (!this.LLJJJ || iAbs >= 20) {
            return;
        }
        if (view != null) {
            tag = view.getTag();
        } else {
            tag = null;
        }
        if ((tag instanceof Integer) && (num = (Integer) tag) != null && num.intValue() != this.LLJJJJ) {
            int iIntValue2 = num.intValue();
            this.LLJJJJ = iIntValue2;
            InterfaceC1626470sQX interfaceC1626470sQXLLLFZ2 = this.LLILLL.LLLFZ(iIntValue2);
            if (interfaceC1626470sQXLLLFZ2 != null) {
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("SCROLL_STATE_DRAGGING in position: ");
                sbLIZ3.append(iIntValue2);
                sbLIZ3.append(" effect: ");
                sbLIZ3.append(C1629110sUn.LIZ(interfaceC1626470sQXLLLFZ2).getName());
                C1628270sTR.LIZIZ("CarouselViewScrollListener", C2188811AlT.LIZIZ(sbLIZ3));
                if (interfaceC1626470sQXLLLFZ2 instanceof C1629810sVv) {
                    return;
                }
                this.LLILZIL.LIZIZ.invoke(interfaceC1626470sQXLLLFZ2, Integer.valueOf(iIntValue2), Boolean.TRUE);
            }
        }
    }

    public C1630140sWS(C1630020sWG c1630020sWG, CarouselLayoutManager carouselLayoutManager, C1630500sX2 c1630500sX2, C20636015p0 c20636015p0, C1627130sRb c1627130sRb, C0GRO c0gro, boolean z, float f, int i, C1630040sWI c1630040sWI, C1630050sWJ c1630050sWJ, C1628290sTT c1628290sTT, C1630010sWF c1630010sWF) {
        this.LL = c1630020sWG;
        this.LLILLJJLI = carouselLayoutManager;
        this.LLILLL = c1630500sX2;
        this.LLILZ = c20636015p0;
        this.LLILZIL = c1627130sRb;
        this.LLILZLL = c0gro;
        this.LLIZ = z;
        this.LLIZLLLIL = f;
        this.LLJ = i;
        this.LLJIJIL = c1630040sWI;
        this.LLJILJIL = c1630050sWJ;
        this.LLJILJILJ = c1628290sTT;
        this.LLJILLL = c1630010sWF;
    }
}
