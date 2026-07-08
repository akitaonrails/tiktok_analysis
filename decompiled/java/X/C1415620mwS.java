package X;

import Y.ARunnableS119S0100000_19;
import Y.ARunnableS122S0100000_22;
import Y.AsS49S0100000_22;
import android.content.Context;
import android.graphics.Rect;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import irm.AkS90S0100000_22;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.0mwS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public class C1415620mwS extends RelativeLayout {
    public View LL;
    public View LLILLJJLI;
    public View LLILLL;
    public C425240Glu LLILZ;
    public View LLILZIL;
    public View LLILZLL;
    public View LLIZ;
    public View LLIZLLLIL;
    public View LLJ;
    public View LLJI;
    public C1390410mHn LLJIJIL;
    public ConstraintLayout LLJILJIL;
    public C1295960jpS LLJILJILJ;
    public TuxTextView LLJILLL;
    public final BPEAHandler LLJJ;
    public final List<Integer> LLJJI;
    public final List<String> LLJJIII;
    public int LLJJIJI;
    public final ARunnableS119S0100000_19 LLJJIJIIJIL;
    public int LLJJIJIL;
    public C1418970n1r LLJJJ;
    public InterfaceC1410010mnP LLJJJIL;
    public final Map<Integer, Integer> LLJJJJ;
    public TuxTextView LLJJJJJIL;
    public EnumC1409600mmk LLJJJJLIIL;
    public Function2<? super Integer, ? super Integer, Unit> LLJJL;
    public final Set<Integer> LLJJLIIIJLLLLLLLZ;

    /* JADX WARN: Removed duplicated region for block: B:29:0x0073  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ() {
        /*
            r8 = this;
            X.0Glu r5 = r8.LLILZ
            if (r5 != 0) goto L5
            return
        L5:
            int r4 = r5.getChildCount()
            r3 = 0
        La:
            if (r3 >= r4) goto L7d
            android.view.View r2 = r5.getChildAt(r3)
            int r6 = r5.getChildAdapterPosition(r2)
            r0 = -1
            if (r6 == r0) goto L6e
            if (r2 == 0) goto L73
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            boolean r0 = r2.getLocalVisibleRect(r1)
            if (r0 == 0) goto L73
            int r0 = r1.height()
            float r7 = (float) r0
            int r0 = r2.getHeight()
            float r1 = (float) r0
            r0 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 >= 0) goto L36
            r1 = 1065353216(0x3f800000, float:1.0)
        L36:
            float r7 = r7 / r1
            r0 = 1058642330(0x3f19999a, float:0.6)
            int r0 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r0 < 0) goto L73
            java.util.Set<java.lang.Integer> r1 = r8.LLJJLIIIJLLLLLLLZ
            java.lang.Integer r0 = java.lang.Integer.valueOf(r6)
            boolean r0 = r1.add(r0)
            if (r0 == 0) goto L6e
            r0 = 2131397217(0x7f0a8a61, float:1.8415197E38)
            android.view.View r0 = r2.findViewById(r0)
            androidx.appcompat.widget.AppCompatTextView r0 = (androidx.appcompat.widget.AppCompatTextView) r0
            if (r0 == 0) goto L71
            java.lang.CharSequence r0 = r0.getText()
            if (r0 == 0) goto L71
            int r0 = r0.length()
        L5f:
            kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super java.lang.Integer, kotlin.Unit> r2 = r8.LLJJL
            if (r2 == 0) goto L6e
            java.lang.Integer r1 = java.lang.Integer.valueOf(r6)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.invoke(r1, r0)
        L6e:
            int r3 = r3 + 1
            goto La
        L71:
            r0 = 0
            goto L5f
        L73:
            java.util.Set<java.lang.Integer> r1 = r8.LLJJLIIIJLLLLLLLZ
            java.lang.Integer r0 = java.lang.Integer.valueOf(r6)
            r1.remove(r0)
            goto L6e
        L7d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1415620mwS.LIZ():void");
    }

    public final void LIZIZ() {
        View view = this.LLILLJJLI;
        if (view != null) {
            view.setEnabled(false);
        }
        View view2 = this.LLILLJJLI;
        if (view2 != null) {
            C786410Ut5.T4(view2, 0.6f);
        }
    }

    public final void LIZJ() {
        ConstraintLayout constraintLayout = this.LLJILJIL;
        if (constraintLayout != null) {
            C786410Ut5.LL(8, constraintLayout);
        }
        this.LLJJ.removeCallbacks(this.LLJJIJIIJIL);
        C1390410mHn c1390410mHn = this.LLJIJIL;
        if (c1390410mHn != null) {
            C786410Ut5.LLLZZIL(c1390410mHn, 0);
        }
        C1390410mHn c1390410mHn2 = this.LLJIJIL;
        if (c1390410mHn2 != null) {
            c1390410mHn2.LIZJ();
        }
    }

    public final void LIZLLL() {
        this.LLJJ.removeCallbacks(this.LLJJIJIIJIL);
        C1295960jpS c1295960jpS = this.LLJILJILJ;
        if (c1295960jpS != null) {
            c1295960jpS.cancelAnimation();
        }
        ConstraintLayout constraintLayout = this.LLJILJIL;
        if (constraintLayout != null) {
            C786410Ut5.LL(8, constraintLayout);
        }
    }

    public final void LJ() {
        String string = getContext().getString(((Number) (this.LLJJIJIL == 0 ? ListProtector.get(this.LLJJI, 0) : ListProtector.get(this.LLJJI, 1))).intValue(), ListProtector.get(this.LLJJIII, this.LLJJIJI));
        TuxTextView tuxTextView = this.LLJILLL;
        if (tuxTextView != null) {
            tuxTextView.setText(string);
        }
        TuxTextView tuxTextView2 = this.LLJILLL;
        if (tuxTextView2 != null) {
            tuxTextView2.setContentDescription(string);
        }
        this.LLJJIJI = (this.LLJJIJI + 1) % this.LLJJIII.size();
    }

    public final boolean getSelectState() {
        C1418970n1r c1418970n1r = this.LLJJJ;
        return (c1418970n1r == null || c1418970n1r.LL == -1) ? false : true;
    }

    public final InterfaceC1410010mnP getInspirationPanelClickListener() {
        return this.LLJJJIL;
    }

    public final Map<Integer, Integer> getItemColumnMap() {
        return this.LLJJJJ;
    }

    public final Function2<Integer, Integer, Unit> getOnItemExposed() {
        return this.LLJJL;
    }

    public final void setCurrentImageIndex(int i) {
        this.LLJJIJIL = i;
        View view = this.LLJI;
        if (view != null && view.getVisibility() == 0 && C290720BaQ.LIZ()) {
            LJ();
        }
    }

    public final void setData(List<C0FNM> list) {
        this.LLJJLIIIJLLLLLLLZ.clear();
        C1418970n1r c1418970n1r = this.LLJJJ;
        if (c1418970n1r != null) {
            c1418970n1r.LLILLJJLI = list;
            c1418970n1r.notifyDataSetChanged();
        }
        C1421590n65 c1421590n65 = C1421590n65.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setData, data size:");
        sbLIZ.append(list.size());
        C201955140j.LIZJ(c1421590n65, C2188811AlT.LIZIZ(sbLIZ));
        C425240Glu c425240Glu = this.LLILZ;
        if (c425240Glu != null) {
            HandlerHook.viewPost(c425240Glu, new ARunnableS122S0100000_22(this, 18));
        }
    }

    public final void setInspirationPanelClickListener(InterfaceC1410010mnP interfaceC1410010mnP) {
        this.LLJJJIL = interfaceC1410010mnP;
    }

    public final void setInspirationPanelType(EnumC1409600mmk enumC1409600mmk) {
        this.LLJJJJLIIL = enumC1409600mmk;
    }

    public final void setOnItemExposed(Function2<? super Integer, ? super Integer, Unit> function2) {
        this.LLJJL = function2;
    }

    public final void setTitle(String str) {
        TuxTextView tuxTextView = this.LLJJJJJIL;
        if (tuxTextView != null) {
            tuxTextView.setText(str);
        }
        TuxTextView tuxTextView2 = this.LLJJJJJIL;
        if (tuxTextView2 != null) {
            tuxTextView2.setContentDescription(str);
        }
    }

    public C1415620mwS(Context context, AttributeSet attributeSet) {
        int iLIZ;
        super(context, attributeSet);
        this.LLJJ = new BPEAHandler(Looper.getMainLooper());
        this.LLJJI = C1697810uHb.LJIIJJI(2131829984, 2131829987);
        this.LLJJIII = C1697810uHb.LJIIJJI(e3.d, "..", "...");
        this.LLJJIJIIJIL = new ARunnableS119S0100000_19(this, 68);
        this.LLJJJJ = new LinkedHashMap();
        EnumC1409600mmk enumC1409600mmk = EnumC1409600mmk.TITLE;
        this.LLJJJJLIIL = enumC1409600mmk;
        this.LLJJLIIIJLLLLLLLZ = new LinkedHashSet();
        setBackgroundColor(0);
        this.LL = C786410Ut5.Sd(R.layout.eob, C786410Ut5.ne(context), this);
        TuxTextView tuxTextView = (TuxTextView) findViewById(R.id.kt8);
        this.LLJJJJJIL = tuxTextView;
        if (tuxTextView != null) {
            if (this.LLJJJJLIIL == enumC1409600mmk) {
                iLIZ = C0FLN.LIZIZ();
            } else {
                iLIZ = C0FLN.LIZ();
            }
            tuxTextView.setText(C555520LqY.LIZIZ(iLIZ));
        }
        findViewById(R.id.evm);
        C425240Glu c425240Glu = (C425240Glu) findViewById(R.id.kt4);
        this.LLILZ = c425240Glu;
        if (c425240Glu != null) {
            StaggeredGridLayoutManager staggeredGridLayoutManager = new StaggeredGridLayoutManager(2, 1);
            staggeredGridLayoutManager.LJJIL(0);
            c425240Glu.setLayoutManager(staggeredGridLayoutManager);
        }
        this.LLILZIL = findViewById(R.id.hc7);
        this.LLILZLL = findViewById(R.id.p6h);
        this.LLIZ = findViewById(R.id.pkd);
        this.LLIZLLLIL = findViewById(R.id.lte);
        this.LLJ = findViewById(R.id.p7o);
        findViewById(R.id.tf3);
        View view = this.LLIZ;
        if (view != null) {
            C786410Ut5.I7(new AkS90S0100000_22(this, 2), view);
        }
        View view2 = this.LLJ;
        if (view2 != null) {
            C786410Ut5.I7(new AkS90S0100000_22(this, 3), view2);
        }
        this.LLJI = findViewById(R.id.nlo);
        this.LLJIJIL = (C1390410mHn) findViewById(R.id.gb5);
        this.LLJILJIL = (ConstraintLayout) findViewById(R.id.kt3);
        this.LLJILJILJ = (C1295960jpS) findViewById(R.id.kt1);
        this.LLJILLL = (TuxTextView) findViewById(R.id.kt2);
        this.LLILLJJLI = findViewById(R.id.lpx);
        LIZIZ();
        View view3 = this.LLILLJJLI;
        if (view3 != null) {
            C786410Ut5.I7(new AkS90S0100000_22(this, 4), view3);
        }
        View viewFindViewById = findViewById(R.id.lf3);
        this.LLILLL = viewFindViewById;
        if (viewFindViewById != null) {
            C786410Ut5.I7(new AkS90S0100000_22(this, 5), viewFindViewById);
        }
        C425240Glu c425240Glu2 = this.LLILZ;
        if (c425240Glu2 != null) {
            final int iLIZ2 = C354870Dvh.LIZ(12);
            final int iLIZ3 = C354870Dvh.LIZ(6);
            c425240Glu2.addItemDecoration(new C0DXR(iLIZ2, iLIZ3) { // from class: X.0GmX
                public final int LLILLJJLI;
                public final int LLILLL;
                public final int LL = 2;
                public final boolean LLILZ = true;

                {
                    this.LLILLJJLI = iLIZ2;
                    this.LLILLL = iLIZ3;
                }

                @Override // X.C0DXR
                public final void LIZIZ(Rect rect, View view4, RecyclerView recyclerView, C21673919s1 c21673919s1) {
                    C21681819tI c21681819tI;
                    int i;
                    ViewGroup.LayoutParams layoutParams = view4.getLayoutParams();
                    if ((layoutParams instanceof C21681819tI) && (c21681819tI = (C21681819tI) layoutParams) != null) {
                        int iLIZ4 = c21681819tI.LIZ();
                        if (this.LLILZ) {
                            int i2 = this.LLILLL;
                            rect.left = i2;
                            rect.right = i2;
                            if (c21681819tI.getViewAdapterPosition() < this.LL) {
                                rect.top = this.LLILLJJLI;
                            }
                            rect.bottom = this.LLILLJJLI;
                            return;
                        }
                        int i3 = 0;
                        if (iLIZ4 == 0) {
                            i = 0;
                        } else {
                            i = this.LLILLL / 2;
                        }
                        rect.left = i;
                        if (iLIZ4 != this.LL - 1) {
                            i3 = this.LLILLL / 2;
                        }
                        rect.right = i3;
                        rect.top = this.LLILLJJLI;
                    }
                }
            });
        }
        this.LLJJJ = new C1418970n1r(this);
        C425240Glu c425240Glu3 = this.LLILZ;
        if (c425240Glu3 != null) {
            c425240Glu3.setItemAnimator(null);
        }
        C425240Glu c425240Glu4 = this.LLILZ;
        if (c425240Glu4 != null) {
            c425240Glu4.setAdapter(this.LLJJJ);
        }
        C425240Glu c425240Glu5 = this.LLILZ;
        if (c425240Glu5 != null) {
            c425240Glu5.addOnScrollListener(new AsS49S0100000_22(this, 3));
        }
    }
}
