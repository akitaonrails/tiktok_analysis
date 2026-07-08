package X;

import Y.ARunnableS113S0100000_13;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.app.R$styleable;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0lkS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1369740lkS extends FrameLayout implements InterfaceC1369750lkT, InterfaceC1370520lli {
    public final String LL;
    public final int LLILLJJLI;
    public final int LLILLL;
    public List<? extends InterfaceC1370310llN> LLILZ;
    public List<Integer> LLILZIL;
    public InterfaceC1369750lkT LLILZLL;
    public AbstractC1370150ll7 LLIZ;
    public boolean LLIZLLLIL;
    public RecyclerView LLJ;
    public LinearLayoutManager LLJI;
    public final Set<String> LLJIJIL;
    public C1371590lnR LLJILJIL;
    public View LLJILJILJ;
    public boolean LLJILLL;
    public boolean LLJJ;

    public C1369740lkS(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, null, 4);
    }

    @Override // X.InterfaceC1370520lli
    public final void LIZLLL() {
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
        List<InterfaceC1370310llN> list;
        C1371590lnR c1371590lnR = this.LLJILJIL;
        return c1371590lnR == null || !((list = c1371590lnR.LJFF) == null || list.isEmpty() || c1371590lnR.LJJIIZI);
    }

    @Override // X.InterfaceC1370520lli
    public final void LIZJ() {
        RecyclerView recyclerView;
        if (!(!this.LLILZ.isEmpty()) || (recyclerView = this.LLJ) == null) {
            return;
        }
        recyclerView.scrollToPosition(0);
    }

    @Override // X.InterfaceC1369750lkT
    public final void LJIIIIZZ() {
        InterfaceC1369750lkT interfaceC1369750lkT = this.LLILZLL;
        if (interfaceC1369750lkT != null) {
            interfaceC1369750lkT.LJIIIIZZ();
        }
    }

    public final void LJIIJ() {
        List<? extends InterfaceC1370310llN> list = this.LLILZ;
        if (list == null || list.isEmpty()) {
            return;
        }
        LinearLayoutManager linearLayoutManager = this.LLJI;
        int iFindLastVisibleItemPosition = linearLayoutManager != null ? linearLayoutManager.findLastVisibleItemPosition() : -1;
        LinearLayoutManager linearLayoutManager2 = this.LLJI;
        int iFindFirstVisibleItemPosition = linearLayoutManager2 != null ? linearLayoutManager2.findFirstVisibleItemPosition() : -1;
        if (iFindLastVisibleItemPosition < 0 || iFindFirstVisibleItemPosition < 0 || iFindFirstVisibleItemPosition > iFindLastVisibleItemPosition) {
            return;
        }
        while (true) {
            InterfaceC1370310llN interfaceC1370310llN = (InterfaceC1370310llN) ListProtector.get(this.LLILZ, iFindFirstVisibleItemPosition);
            if (!this.LLJIJIL.contains(interfaceC1370310llN.key())) {
                this.LLJIJIL.add(interfaceC1370310llN.key());
                Context context = getContext();
                C1371590lnR c1371590lnR = this.LLJILJIL;
                interfaceC1370310llN.LJJJI(context, c1371590lnR != null ? c1371590lnR.LJIJJ : null);
            }
            if (iFindFirstVisibleItemPosition == iFindLastVisibleItemPosition) {
                return;
            } else {
                iFindFirstVisibleItemPosition++;
            }
        }
    }

    @Override // X.InterfaceC1370520lli
    public EnumC1369700lkO getLayoutPriority() {
        EnumC1369700lkO enumC1369700lkO;
        EnumC1369700lkO enumC1369700lkO2;
        InterfaceC1370110ll3 interfaceC1370110ll3 = C1370370llT.LIZ;
        if (interfaceC1370110ll3 != null) {
            C1371590lnR c1371590lnR = this.LLJILJIL;
            if (interfaceC1370110ll3.LIZLLL(c1371590lnR != null ? c1371590lnR.LJIJJ : null)) {
                if (Intrinsics.LJFF(this.LL, "long_press")) {
                    C1371590lnR c1371590lnR2 = this.LLJILJIL;
                    return (c1371590lnR2 == null || (enumC1369700lkO2 = c1371590lnR2.LJIIIIZZ) == null) ? EnumC1369700lkO.TOP : enumC1369700lkO2;
                }
                C1371590lnR c1371590lnR3 = this.LLJILJIL;
                return (c1371590lnR3 == null || (enumC1369700lkO = c1371590lnR3.LJIIIZ) == null) ? EnumC1369700lkO.BOTTOM : enumC1369700lkO;
            }
        }
        return EnumC1369700lkO.BOTTOM;
    }

    public final Integer getShareChannelOffset() {
        RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition;
        View view;
        AbstractC1370150ll7 abstractC1370150ll7 = this.LLIZ;
        if (abstractC1370150ll7 == null || !(abstractC1370150ll7 instanceof C1370220llE)) {
            return null;
        }
        int i = ((C1370220llE) abstractC1370150ll7).LLJI;
        RecyclerView recyclerView = this.LLJ;
        if (recyclerView == null || (viewHolderFindViewHolderForAdapterPosition = recyclerView.findViewHolderForAdapterPosition(i)) == null || (view = viewHolderFindViewHolderForAdapterPosition.itemView) == null) {
            return null;
        }
        return Integer.valueOf(view.getBottom());
    }

    @Override // X.InterfaceC1370520lli
    public EnumC1369720lkQ getShowStyle() {
        EnumC1369720lkQ enumC1369720lkQ;
        InterfaceC1370110ll3 interfaceC1370110ll3 = C1370370llT.LIZ;
        if (interfaceC1370110ll3 != null) {
            C1371590lnR c1371590lnR = this.LLJILJIL;
            if (interfaceC1370110ll3.LIZLLL(c1371590lnR != null ? c1371590lnR.LJIJJ : null)) {
                C1371590lnR c1371590lnR2 = this.LLJILJIL;
                if (c1371590lnR2 != null && (enumC1369720lkQ = c1371590lnR2.LJII) != null) {
                    int i = C1369730lkR.LIZ[enumC1369720lkQ.ordinal()];
                    if (i == 1) {
                        return EnumC1369720lkQ.HORIZONTAL_WITH_FILLMODE;
                    }
                    if (i == 2) {
                        return EnumC1369720lkQ.VERTICAL;
                    }
                }
                return EnumC1369720lkQ.HORIZONTAL;
            }
        }
        return EnumC1369720lkQ.HORIZONTAL;
    }

    /* JADX WARN: Removed duplicated region for block: B:115:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01b3  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onAttachedToWindow() {
        /*
            Method dump skipped, instruction units count: 565
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1369740lkS.onAttachedToWindow():void");
    }

    public EnumC992950bwj getWidgetType() {
        return EnumC992950bwj.ACTION_BAR;
    }

    public static void LJIILL(RecyclerView recyclerView) {
        FrameLayout.LayoutParams layoutParams;
        ViewGroup.LayoutParams layoutParams2 = null;
        if (recyclerView != null) {
            layoutParams2 = recyclerView.getLayoutParams();
        }
        if ((layoutParams2 instanceof FrameLayout.LayoutParams) && (layoutParams = (FrameLayout.LayoutParams) layoutParams2) != null) {
            layoutParams.topMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0));
            C786410Ut5.W5(recyclerView, layoutParams);
        }
    }

    @Override // X.InterfaceC1370520lli
    public final void LJ(boolean z) {
        this.LLJILLL = z;
    }

    @Override // X.InterfaceC1370520lli
    public final void LJFF(C1371590lnR c1371590lnR) {
        this.LLJILJIL = c1371590lnR;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003b A[Catch: Exception -> 0x008c, TryCatch #1 {Exception -> 0x008c, blocks: (B:4:0x000c, B:6:0x0012, B:8:0x0016, B:10:0x001f, B:11:0x003b, B:13:0x0047, B:14:0x0049, B:16:0x004d, B:21:0x0058, B:23:0x005e, B:26:0x0074, B:28:0x007c, B:25:0x0068, B:18:0x0051), top: B:72:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x007c A[Catch: Exception -> 0x008c, TryCatch #1 {Exception -> 0x008c, blocks: (B:4:0x000c, B:6:0x0012, B:8:0x0016, B:10:0x001f, B:11:0x003b, B:13:0x0047, B:14:0x0049, B:16:0x004d, B:21:0x0058, B:23:0x005e, B:26:0x0074, B:28:0x007c, B:25:0x0068, B:18:0x0051), top: B:72:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00ec  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.AbstractC1370150ll7 LJIILJJIL(X.InterfaceC1362720lZ8 r24) {
        /*
            Method dump skipped, instruction units count: 278
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1369740lkS.LJIILJJIL(X.0lZ8):X.0ll7");
    }

    public final void setActionAdapter(AbstractC1370150ll7 abstractC1370150ll7) {
        this.LLIZ = abstractC1370150ll7;
    }

    @Override // X.InterfaceC1369750lkT, X.InterfaceC1373860lr6
    public final void LIZIZ(InterfaceC1370310llN interfaceC1370310llN, int i) {
        InterfaceC1369750lkT interfaceC1369750lkT = this.LLILZLL;
        if (interfaceC1369750lkT != null) {
            interfaceC1369750lkT.LIZIZ(interfaceC1370310llN, i);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C1369740lkS(Context context, AttributeSet attributeSet, String str, int i) {
        attributeSet = (i & 2) != 0 ? null : attributeSet;
        str = (i & 4) != 0 ? "share_panel" : str;
        super(context, attributeSet);
        this.LL = str;
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R$styleable.ShareActionBar);
        this.LLILLJJLI = typedArrayObtainStyledAttributes.getColor(R$styleable.ShareActionBar_actionColor, 0);
        this.LLILLL = typedArrayObtainStyledAttributes.getColor(R$styleable.ShareActionBar_iconColor, 0);
        typedArrayObtainStyledAttributes.recycle();
        C13BV c13bv = C13BV.INSTANCE;
        this.LLILZ = c13bv;
        this.LLILZIL = c13bv;
        this.LLJIJIL = new LinkedHashSet();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        HandlerHook.viewPostDelay(this, new ARunnableS113S0100000_13(this, 117), 300L);
    }
}
