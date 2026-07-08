package X;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ViewParent;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0w2g, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1765440w2g extends AbstractC1763170vz1 {
    public final boolean LL;
    public final C21649619o6 LLILLJJLI;
    public InterfaceC1763180vz2 LLILLL;

    @Override // X.AbstractC1763170vz1
    public final void onViewAttachedToWindow() {
        RecyclerView recyclerView;
        ViewParent parent = this.itemView.getParent();
        RecyclerView.LayoutManager layoutManager = (!(parent instanceof RecyclerView) || (recyclerView = (RecyclerView) parent) == null) ? null : recyclerView.getLayoutManager();
        LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
        boolean z = false;
        if (linearLayoutManager != null && linearLayoutManager.getOrientation() == 1) {
            z = true;
        }
        this.LLILLJJLI.setVerticalNestedScrollEnabled(z);
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [REQUEST, X.0kbR] */
    @Override // X.AbstractC1763170vz1
    public final void I5(AbstractC1763110vyv abstractC1763110vyv) {
        AbstractC1320710kTN abstractC1320710kTNLIZ;
        C1762980vyi c1762980vyi = (C1762980vyi) abstractC1763110vyv;
        String strLIZIZ = c1762980vyi.LJ;
        if (strLIZIZ == null) {
            strLIZIZ = "";
        }
        if (new C0VSJ(strLIZIZ).exists()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("file://");
            sbLIZ.append(c1762980vyi.LJ);
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        }
        if (((Boolean) C0AAZ.LIZ.getValue()).booleanValue()) {
            C1326790kdB c1326790kdB = C1326790kdB.LIZ;
            ?? LIZ = C1326590kcr.LIZ(strLIZIZ);
            C1320810kTX c1320810kTXLIZJ = C1322200kVm.LIZJ();
            c1320810kTXLIZJ.LIZLLL = LIZ;
            abstractC1320710kTNLIZ = c1320810kTXLIZJ.LIZ();
        } else {
            C1320810kTX c1320810kTXLIZJ2 = C1322200kVm.LIZJ();
            c1320810kTXLIZJ2.LJII(strLIZIZ);
            abstractC1320710kTNLIZ = c1320810kTXLIZJ2.LIZ();
        }
        InterfaceC1763870w09 interfaceC1763870w09 = c1762980vyi.LIZJ;
        if (interfaceC1763870w09 != null) {
            interfaceC1763870w09.LIZ(this.LLILLJJLI, c1762980vyi.LJ, c1762980vyi.LIZIZ);
        }
        if (((Boolean) C1096904Qt.LIZ.getValue()).booleanValue() && this.LL) {
            C1325540kbA c1325540kbALIZ = C1322200kVm.LIZ();
            C1326790kdB c1326790kdB2 = C1326790kdB.LIZ;
            c1325540kbALIZ.LJIIZILJ(C1326590kcr.LIZ(strLIZIZ), null);
        }
        this.LLILLJJLI.setController(abstractC1320710kTNLIZ);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1765440w2g(C21649519o5 c21649519o5, final boolean z, boolean z2, int i) {
        super(c21649519o5);
        z = (i & 2) != 0 ? true : z;
        z2 = (i & 8) != 0 ? false : z2;
        this.LL = z2;
        C21649619o6 c21649619o6 = (C21649619o6) this.itemView.findViewById(R.id.qe7);
        this.LLILLJJLI = c21649619o6;
        c21649619o6.setHorizontalNestedScrollEnabled(true);
        c21649519o5.setDelegateDragTransitionView(c21649619o6);
        c21649619o6.setTapListener(new GestureDetector.SimpleOnGestureListener() { // from class: X.0w2l
            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
            public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
                if (z) {
                    C21649419o4 c21649419o4 = this.LLILLJJLI.LLIZLLLIL;
                    if (c21649419o4 == null) {
                        c21649419o4 = null;
                    }
                    c21649419o4.LLJZ.set(c21649419o4.LLJIJIL);
                    c21649419o4.LJIJI(true);
                }
                return super.onSingleTapConfirmed(motionEvent);
            }
        });
        c21649619o6.setControllerListener(new C1776250wK7(this, 1));
        c21649619o6.LIZIZ(new InterfaceC21650419oE() { // from class: X.0w2k
            @Override // X.InterfaceC21650419oE
            public final void gA(int i2) {
                this.LL.getClass();
            }

            @Override // X.InterfaceC21650419oE
            public final void xP(int i2) {
                this.LL.getClass();
            }

            @Override // X.InterfaceC21650419oE
            public final void kG(float f, int i2) {
                this.LL.getClass();
            }
        });
    }
}
