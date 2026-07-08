package X;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import com.zhiliaoapp.musically.R;
import java.util.List;

/* JADX INFO: renamed from: X.0lhP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1367850lhP extends FrameLayout implements InterfaceC1370520lli {
    public static final int LLJI = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
    public static final int LLJIJIL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
    public static final int LLJILJIL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10));
    public final Context LL;
    public RecyclerView LLILLJJLI;
    public List<? extends InterfaceC1370450llb> LLILLL;
    public C1370460llc LLILZ;
    public C1371590lnR LLILZIL;
    public BaseSharePackage LLILZLL;
    public LinearLayoutManager LLIZ;
    public InterfaceC1368050lhj LLIZLLLIL;
    public InterfaceC1369750lkT LLJ;

    @Override // X.InterfaceC1370520lli
    public final void LIZLLL() {
    }

    @Override // X.InterfaceC1370520lli
    public final void LJ(boolean z) {
    }

    @Override // X.InterfaceC1370520lli
    public final View LJI(C1361400lX0 c1361400lX0, C1371590lnR c1371590lnR, Fragment fragment) {
        return null;
    }

    @Override // X.InterfaceC1370520lli
    public final View LJII(C1361400lX0 c1361400lX0, C1371590lnR c1371590lnR, InterfaceC1362720lZ8 interfaceC1362720lZ8, Fragment fragment) {
        return this;
    }

    @Override // X.InterfaceC1370520lli
    public final boolean LJIIIZ() {
        return false;
    }

    @Override // X.InterfaceC1370520lli
    public final void LJIIJJI(Fragment fragment, C1371590lnR c1371590lnR, InterfaceC1362720lZ8 interfaceC1362720lZ8, ViewGroup viewGroup, ViewGroup viewGroup2) {
    }

    @Override // X.InterfaceC1370520lli
    public final void LJIIL(Context context, RecyclerView recyclerView, C1371590lnR c1371590lnR, InterfaceC1362720lZ8 interfaceC1362720lZ8, Fragment fragment) {
    }

    @Override // X.InterfaceC1370520lli
    public final boolean LJIILIIL() {
        return false;
    }

    @Override // X.InterfaceC1370520lli
    public final void LJLZ() {
    }

    @Override // X.InterfaceC1370520lli
    public View getWidgetView() {
        return this;
    }

    public void setUpAdditionView(Fragment fragment) {
    }

    @Override // X.InterfaceC1370520lli
    public final boolean LIZ() {
        C1371590lnR c1371590lnR = this.LLILZIL;
        if (c1371590lnR == null) {
            return false;
        }
        List<InterfaceC1370310llN> list = c1371590lnR.LJFF;
        return !(list == null || list.isEmpty() || c1371590lnR.LJJIIZI) || C1367830lhN.LIZ(c1371590lnR);
    }

    @Override // X.InterfaceC1370520lli
    public final void LIZJ() {
        RecyclerView rvConcatBarFromXml;
        if (!(!this.LLILLL.isEmpty()) || (rvConcatBarFromXml = getRvConcatBarFromXml()) == null) {
            return;
        }
        rvConcatBarFromXml.scrollToPosition(0);
    }

    public final RecyclerView getRvConcatBarFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILLJJLI;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.tv3);
            this.LLILLJJLI = (RecyclerView) callbackFindViewById;
        }
        return (RecyclerView) callbackFindViewById;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        C1370200llC c1370200llC;
        super.onAttachedToWindow();
        C1371590lnR c1371590lnR = this.LLILZIL;
        boolean z = (c1371590lnR == null || (c1370200llC = c1371590lnR.LJJLIIIIJ) == null) ? false : c1370200llC.LJ;
        C1370460llc c1370460llc = new C1370460llc(this.LL, this.LLIZLLLIL, this.LLJ, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(z ? 48 : 44))), this.LLILZLL, this.LLILZIL);
        ((Number) c1370460llc.LLJI.getValue()).intValue();
        this.LLILZ = c1370460llc;
        C786410Ut5.Td(C786410Ut5.ne(this.LL), R.layout.d8j, this, true);
        C1370460llc c1370460llc2 = this.LLILZ;
        if (c1370460llc2 != null) {
            c1370460llc2.LLLFZ(this.LLILLL);
        }
        this.LLIZ = new LinearLayoutManager(this.LL, 0, false);
        RecyclerView rvConcatBarFromXml = getRvConcatBarFromXml();
        if (rvConcatBarFromXml != null) {
            rvConcatBarFromXml.setAdapter(this.LLILZ);
            rvConcatBarFromXml.setLayoutManager(this.LLIZ);
            InterfaceC1368120lhq interfaceC1368120lhq = C1370370llT.LJI;
            if (interfaceC1368120lhq != null) {
                interfaceC1368120lhq.LIZIZ("share_panel_concat", rvConcatBarFromXml, null, null);
            }
            if (z) {
                rvConcatBarFromXml.addItemDecoration(new C424780GlA(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8))));
                return;
            }
            final int i = LLJILJIL;
            final int i2 = LLJIJIL;
            rvConcatBarFromXml.addItemDecoration(new C0DXR(i, i2) { // from class: X.06ti
                public final int LL;
                public final int LLILLJJLI;

                {
                    this.LL = i;
                    this.LLILLJJLI = i2;
                }

                @Override // X.C0DXR
                public final void LIZIZ(Rect rect, View view, RecyclerView recyclerView, C21673919s1 c21673919s1) {
                    C426750GoL.LJIIIZ(view, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0))), null, null, null, false, 30);
                    int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
                    if (childAdapterPosition == 0) {
                        if (!C0H4W.LIZ()) {
                            rect.left = this.LLILLJJLI;
                            return;
                        } else {
                            rect.right = this.LLILLJJLI;
                            return;
                        }
                    }
                    if (c21673919s1.LIZIZ() - 1 == childAdapterPosition) {
                        if (!C0H4W.LIZ()) {
                            rect.right = this.LLILLJJLI;
                            return;
                        } else {
                            rect.left = this.LLILLJJLI;
                            return;
                        }
                    }
                    if (!C0H4W.LIZ()) {
                        rect.left = this.LL;
                    } else {
                        rect.right = this.LL;
                    }
                }
            });
        }
    }

    public final Context getCtx() {
        return this.LL;
    }

    @Override // X.InterfaceC1370520lli
    public EnumC1369700lkO getLayoutPriority() {
        return EnumC1369700lkO.FLOATING_BOTTOM;
    }

    @Override // X.InterfaceC1370520lli
    public EnumC1369720lkQ getShowStyle() {
        return EnumC1369720lkQ.CONCAT_HORIZONTAL;
    }

    public EnumC992950bwj getWidgetType() {
        return EnumC992950bwj.CONCAT;
    }

    @Override // X.InterfaceC1370520lli
    public final void LJFF(C1371590lnR c1371590lnR) {
        this.LLILZIL = c1371590lnR;
    }

    public final void setRvConcatBarFromXml(RecyclerView recyclerView) {
        this.LLILLJJLI = recyclerView;
    }

    public C1367850lhP(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LL = context;
        this.LLILLL = C13BV.INSTANCE;
        this.LLIZLLLIL = new InterfaceC1368050lhj() { // from class: X.0lhQ
            @Override // X.InterfaceC1368050lhj
            public final void LJIIIIZZ(InterfaceC1369790lkX interfaceC1369790lkX, View view) {
            }
        };
        this.LLJ = new InterfaceC1369750lkT() { // from class: X.0lhR
            @Override // X.InterfaceC1369750lkT, X.InterfaceC1373860lr6
            public final void LIZIZ(InterfaceC1370310llN interfaceC1370310llN, int i) {
            }

            @Override // X.InterfaceC1369750lkT
            public final void LJIIIIZZ() {
            }
        };
    }
}
