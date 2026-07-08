package X;

import Y.ACListenerS39S0201000_1;
import Y.ARunnableS101S0100000_1;
import android.content.Context;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.FeedbackVoteData;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductBase;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct;
import com.ss.android.ugc.aweme.ecommerce.base.sku.SkuPanelStarter;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SalePropValue;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SeaSkuPanelData;
import com.ss.android.ugc.aweme.ecommerce.base.sku.sea.strategy.SeaSkuPanelFragment;
import com.ss.android.ugc.aweme.ecommerce.base.sku.sea.vm.SeaSkuPanelViewModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.04HS, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C04HS extends FrameLayout {
    public static final int LLJJIII = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
    public static final int LLJJIJI = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
    public static final int LLJJIJIIJIL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
    public static final int LLJJIJIL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4));
    public static final int LLJJJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(14));
    public static final int LLJJJIL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(5));
    public static final int LLJJJJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
    public static final int LLJJJJJIL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6));
    public static final int LLJJJJLIIL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
    public static final int LLJJL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
    public static final int LLJJLIIIJLLLLLLLZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4));
    public static final int LLJL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0));
    public static final int LLJLIL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4));
    public List<C042Y> LL;
    public C042Y LLILLJJLI;
    public final int LLILLL;
    public int LLILZ;
    public InterfaceC1072204Hg LLILZIL;
    public final SparseArray<List<View>> LLILZLL;
    public final ArrayList<Integer> LLIZ;
    public TuxTextView LLIZLLLIL;
    public final List<View> LLJ;
    public View LLJI;
    public SeaSkuPanelViewModel LLJIJIL;
    public List<SalePropValue> LLJILJIL;
    public String LLJILJILJ;
    public SeaSkuPanelFragment LLJILLL;
    public boolean LLJJ;
    public final C04JJ LLJJI;

    public final void LIZIZ() {
        int i = 0;
        for (Object obj : (ArrayList) this.LLJ) {
            int i2 = i + 1;
            if (i < 0) {
                C1697810uHb.LJIJI();
                throw null;
            }
            View view = (View) obj;
            List<C042Y> list = this.LL;
            if (list == null) {
                list = null;
            }
            if (i < list.size()) {
                List<C042Y> list2 = this.LL;
                LIZJ(view, (C042Y) ListProtector.get(list2 != null ? list2 : null, i));
            }
            i = i2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01ff A[PHI: r5
      0x01ff: PHI (r5v7 java.lang.String) = (r5v6 java.lang.String), (r5v9 java.lang.String), (r5v9 java.lang.String) binds: [B:70:0x01fc, B:60:0x01d7, B:62:0x01db] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZLLL() {
        /*
            Method dump skipped, instruction units count: 531
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C04HS.LIZLLL():void");
    }

    public C04HS(Context context) {
        super(context);
        this.LLILLL = 1;
        this.LLILZ = -1;
        this.LLILZLL = new SparseArray<>();
        this.LLIZ = new ArrayList<>();
        this.LLJ = new ArrayList();
        this.LLJJ = true;
        C04JJ c04jj = new C04JJ(this, 3);
        this.LLJJI = c04jj;
        setClipChildren(false);
        addOnLayoutChangeListener(c04jj);
    }

    public final void setCheckedViewInfo(C042Y c042y) {
        this.LLILLJJLI = c042y;
    }

    public final void setOnItemCheckedListener(InterfaceC1072204Hg interfaceC1072204Hg) {
        this.LLILZIL = interfaceC1072204Hg;
    }

    public final void LIZJ(View view, C042Y c042y) {
        AbstractC1729606py abstractC1729606py;
        String string;
        C04HV c04hv;
        boolean z;
        if (c042y.LLILZIL) {
            if ((view instanceof C04HV) && (c04hv = (C04HV) view) != null) {
                boolean z2 = c042y.LLIZLLLIL;
                boolean zLJFF = Intrinsics.LJFF(c042y, this.LLILLJJLI);
                if (c042y.LLILZLL != null) {
                    z = true;
                } else {
                    z = false;
                }
                c04hv.LIZIZ(z2, zLJFF, z);
            }
        } else if ((view instanceof AbstractC1729606py) && (abstractC1729606py = (AbstractC1729606py) view) != null) {
            abstractC1729606py.i0(c042y.LLIZLLLIL, Intrinsics.LJFF(c042y, this.LLILLJJLI));
        }
        TuxTextView tuxTextView = this.LLIZLLLIL;
        if (tuxTextView != null) {
            C042Y c042y2 = this.LLILLJJLI;
            if (c042y2 == null || (string = c042y2.LLILLJJLI) == null) {
                string = tuxTextView.getContext().getString(2131850918);
            }
            tuxTextView.setText(string);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0069  */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onMeasure(int r15, int r16) {
        /*
            Method dump skipped, instruction units count: 372
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C04HS.onMeasure(int, int):void");
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int iIntValue;
        int i5;
        super.onLayout(z, i, i2, i3, i4);
        if (getChildCount() == 0) {
            return;
        }
        View childAt = getChildAt(0);
        int measuredWidth = childAt.getMeasuredWidth();
        int measuredHeight = childAt.getMeasuredHeight();
        childAt.layout(0, 0, measuredWidth, measuredHeight);
        int size = this.LLILZLL.size();
        int i6 = 0;
        for (int i7 = 0; i7 < size; i7++) {
            List<View> list = this.LLILZLL.get(i7);
            int size2 = list.size();
            if (i7 == 0) {
                iIntValue = LLJJIJIIJIL + measuredHeight;
            } else {
                iIntValue = ((Number) ListProtector.get(this.LLIZ, i7 - 1)).intValue() + LLJJIII;
            }
            i6 += iIntValue;
            int i8 = 0;
            for (int i9 = 0; i9 < size2; i9++) {
                View view = (View) ListProtector.get(list, i9);
                int measuredWidth2 = view.getMeasuredWidth();
                int measuredHeight2 = view.getMeasuredHeight();
                if (i9 > 0) {
                    i5 = (LLJJIJI * i9) + i8;
                } else {
                    i5 = 0;
                }
                view.layout(i5, i6, measuredWidth2 + i5, measuredHeight2 + i6);
                i8 += measuredWidth2;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v105 */
    /* JADX WARN: Type inference failed for: r0v52, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v70 */
    /* JADX WARN: Type inference failed for: r29v0, types: [X.04HS, android.view.View, android.view.ViewGroup, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v0, types: [android.view.View, android.view.ViewGroup, androidx.constraintlayout.widget.ConstraintLayout, java.lang.Object] */
    public final void LIZ(String str, boolean z, boolean z2, String str2, List<C042Y> list, int i, SeaSkuPanelViewModel seaSkuPanelViewModel, List<SalePropValue> list2, String str3, SeaSkuPanelFragment seaSkuPanelFragment, InterfaceC1631620sYq<? super Integer, ? super ViewGroup, ? super String, Integer> interfaceC1631620sYq) {
        String str4;
        int iIntValue;
        boolean z3;
        Integer num;
        ProductBase productBase;
        SeaSkuPanelData seaSkuPanelData;
        FeedbackVoteData feedbackVoteData;
        String str5;
        ViewGroup viewGroup;
        String str6;
        String str7;
        String str8;
        ProductBase productBase2;
        C19ME c19me;
        String strConcat;
        Integer num2;
        if (getContext() != null && !((ArrayList) list).isEmpty() && str2 != null) {
            this.LLJJ = z;
            this.LL = list;
            this.LLILZ = i;
            this.LLJIJIL = seaSkuPanelViewModel;
            this.LLJILJIL = list2;
            this.LLJILJILJ = str3;
            this.LLJILLL = seaSkuPanelFragment;
            ((ArrayList) this.LLJ).clear();
            ?? constraintLayout = new ConstraintLayout(getContext());
            String str9 = null;
            C426160GnO c426160GnO = new C426160GnO(getContext(), null, 6);
            C19ME c19me2 = new C19ME(0, -2);
            c19me2.topToTop = 0;
            c19me2.startToStart = 0;
            constraintLayout.addView(c426160GnO, c19me2);
            c426160GnO.setGravity(-1);
            TuxTextView tuxTextView = new TuxTextView(getContext(), null, 6, 0);
            tuxTextView.setId(R.id.ej9);
            tuxTextView.setTextColorRes(R.attr.a1h);
            tuxTextView.setTuxFont(62);
            tuxTextView.setEllipsize(TextUtils.TruncateAt.END);
            tuxTextView.setMaxLines(1);
            int iLIZLLL = (int) (((double) C958103op.LIZLLL()) * 0.5d);
            if (iLIZLLL > 0) {
                tuxTextView.setMaxWidth(iLIZLLL);
            }
            tuxTextView.setText(str2);
            C042Y c042y = (C042Y) C13LP.LJJJLL(list);
            if (c042y != null && (num2 = c042y.LLJJIII) != null && num2.intValue() > 0) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(str2);
                sbLIZ.append(" (");
                sbLIZ.append(((ArrayList) list).size());
                sbLIZ.append(')');
                tuxTextView.setText(C2188811AlT.LIZIZ(sbLIZ));
            }
            C786410Ut5.R6(tuxTextView, new FrameLayout.LayoutParams(-2, -2));
            c426160GnO.addView(tuxTextView);
            if (z2) {
                this.LLIZLLLIL = new TuxTextView(getContext(), null, 6, 0);
                TuxTextView tuxTextView2 = this.LLIZLLLIL;
                if (tuxTextView2 != null) {
                    tuxTextView2.setTextColorRes(R.attr.a1k);
                    tuxTextView2.setTuxFont(61);
                    tuxTextView2.setText(tuxTextView2.getContext().getString(2131850918));
                    C786410Ut5.R6(tuxTextView2, new FrameLayout.LayoutParams(-2, -2));
                    c426160GnO.addView(tuxTextView2);
                }
                if (C426750GoL.LIZLLL(getContext())) {
                    strConcat = " :".concat(str2);
                } else {
                    strConcat = str2.concat(": ");
                }
                tuxTextView.setText(strConcat);
            }
            ViewGroup.LayoutParams layoutParams = c426160GnO.getLayoutParams();
            if ((layoutParams instanceof C19ME) && (c19me = (C19ME) layoutParams) != null) {
                Integer numInvoke = interfaceC1631620sYq.invoke(Integer.valueOf(i), constraintLayout, str);
                if (numInvoke != null) {
                    c19me.endToStart = numInvoke.intValue();
                    c19me.setMarginEnd(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)));
                } else {
                    c19me.endToStart = -1;
                    c19me.setMarginEnd(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0)));
                }
            }
            addView(constraintLayout, new FrameLayout.LayoutParams(-1, -2));
            PageFinder pageFinderVia = PageFinder.via((View) this);
            List<C042Y> list3 = this.LL;
            if (list3 == null) {
                list3 = null;
            }
            int size = list3.size();
            int i2 = 0;
            while (i2 < size) {
                List<C042Y> list4 = this.LL;
                ?? r0 = list4;
                if (list4 == null) {
                    r0 = str9;
                }
                C042Y c042y2 = (C042Y) ListProtector.get(r0, i2);
                if (c042y2.LLILZIL) {
                    C04HV c04hv = new C04HV(getContext());
                    c04hv.LIZ(c042y2.LLILZ, c042y2.LLIZLLLIL, c042y2.LLJI, c042y2.LLILZLL);
                    viewGroup = c04hv;
                } else {
                    C1749330vch c1749330vch = new C1749330vch(getContext());
                    c1749330vch.j0(c042y2.LLILLJJLI, c042y2.LLILZLL, c042y2.LLIZLLLIL, c042y2.LLJI);
                    viewGroup = c1749330vch;
                }
                ((ArrayList) this.LLJ).add(viewGroup);
                addView(viewGroup);
                C044V c044v = C044V.LIZ;
                int i3 = this.LLILZ;
                boolean zLJFF = Intrinsics.LJFF(seaSkuPanelViewModel.LLJJI, Boolean.TRUE);
                Map<String, Integer> map = seaSkuPanelViewModel.LLJZIJLIL;
                Map<String, String> map2 = seaSkuPanelViewModel.LLL;
                if (map2 != null) {
                    str6 = (String) ((LinkedHashMap) map2).get(c042y2.LL);
                } else {
                    str6 = null;
                }
                ProductPackStruct productPackStruct = seaSkuPanelViewModel.LLJILJILJ;
                if (productPackStruct != null && (productBase2 = productPackStruct.baseInfo) != null) {
                    str7 = productBase2.categoryId;
                } else {
                    str7 = null;
                }
                SkuPanelStarter.SkuEnterParams skuEnterParams = seaSkuPanelViewModel.LLJILJIL;
                if (skuEnterParams != null && skuEnterParams.clickFrom == 17) {
                    str8 = "cut_price";
                } else {
                    str8 = null;
                }
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("c55267.d50322_i");
                sbLIZ2.append(this.LLILZ);
                sbLIZ2.append("_w10571_i");
                sbLIZ2.append(i2);
                C044V.LJI(c044v, viewGroup, i3, i2, c042y2, zLJFF ? 1 : 0, map, str6, str7, str8, productPackStruct, C2188811AlT.LIZIZ(sbLIZ2), pageFinderVia);
                LIZJ(viewGroup, c042y2);
                C786410Ut5.K7(viewGroup, new ACListenerS39S0201000_1(c042y2, this, i2, 2));
                i2++;
                str9 = null;
            }
            ProductPackStruct productPackStruct2 = seaSkuPanelViewModel.LLJILJILJ;
            if (productPackStruct2 != null && (seaSkuPanelData = productPackStruct2.skuPanelData) != null && (feedbackVoteData = seaSkuPanelData.feedbackVoteData) != null && (str5 = feedbackVoteData.text) != null && !a0.LJJJIL(str5) && Intrinsics.LJFF(str, feedbackVoteData.showSalePropId)) {
                int i4 = C04HT.LLJJJJ;
                ConstraintLayout constraintLayoutLIZIZ = C04HU.LIZIZ(getContext(), this, feedbackVoteData, Integer.valueOf(LLJJIJIL));
                FrameLayout frameLayout = new FrameLayout(getContext());
                FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
                layoutParams2.gravity = 8388611;
                frameLayout.addView(constraintLayoutLIZIZ, layoutParams2);
                addView(frameLayout, new FrameLayout.LayoutParams(-1, -2));
            }
            C044V c044v2 = C044V.LIZ;
            int i5 = this.LLILZ;
            ProductPackStruct productPackStruct3 = seaSkuPanelViewModel.LLJILJILJ;
            if (productPackStruct3 != null && (productBase = productPackStruct3.baseInfo) != null) {
                str4 = productBase.categoryId;
            } else {
                str4 = null;
            }
            String[] strArr = seaSkuPanelViewModel.LLJZ;
            C042Y c042y3 = (C042Y) C13LP.LJJJLL(list);
            if (c042y3 != null && (num = c042y3.LLJJIII) != null) {
                iIntValue = num.intValue();
            } else {
                iIntValue = 0;
            }
            Map<String, Integer> map3 = seaSkuPanelViewModel.LLJZIJLIL;
            C042Y c042y4 = (C042Y) C13LP.LJJJLL(list);
            if (c042y4 != null) {
                str9 = c042y4.LLJJIJI;
            }
            if (((ArrayList) list).size() <= 6) {
                z3 = true;
            } else {
                z3 = false;
            }
            Boolean boolValueOf = Boolean.valueOf(z3);
            c044v2.getClass();
            C044V.LJII(i5, str4, productPackStruct3, strArr, iIntValue, map3, str9, boolValueOf);
            HandlerHook.viewPost(this, new ARunnableS101S0100000_1((Object) this, 74));
        }
    }
}
