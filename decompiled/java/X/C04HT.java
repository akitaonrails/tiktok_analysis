package X;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.FeedbackVoteData;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductBase;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct;
import com.ss.android.ugc.aweme.ecommerce.base.sku.SkuPanelStarter;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SalePropTag;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SeaSkuPanelData;
import com.ss.android.ugc.aweme.ecommerce.base.sku.sea.view.specs.bigimage.group.TwoRowHorizontalLayoutManager;
import com.ss.android.ugc.aweme.ecommerce.base.sku.sea.view.specs.bigimage.group.TwoRowVerticalLayoutManager;
import com.ss.android.ugc.aweme.ecommerce.base.sku.sea.vm.SeaSkuPanelViewModel;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.ECRichText;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.ECRichTextAttribute;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.Font;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.IconAttribute;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.Size;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.TextAttribute;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AwS402S0200000_1;
import kotlin.jvm.internal.AwS545S0100000_1;
import kotlin.jvm.internal.AwS580S0100000_1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlin.text.u;

/* JADX INFO: renamed from: X.04HT, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C04HT extends ConstraintLayout {
    public static final int LLJJJJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4));
    public static final int LLJJJJJIL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2));
    public static final int LLJJJJLIIL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
    public static final int LLJJL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4));
    public static final int LLJJLIIIJLLLLLLLZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
    public int LL;
    public List<C042Y> LLILLJJLI;
    public C04HY LLILLL;
    public boolean LLILZ;
    public int LLILZIL;
    public int LLILZLL;
    public boolean LLIZ;
    public int LLIZLLLIL;
    public int LLJ;
    public int LLJI;
    public int LLJIJIL;
    public int LLJILJIL;
    public int LLJILJILJ;
    public int LLJILLL;
    public int LLJJ;
    public int LLJJI;
    public View LLJJIII;
    public FrameLayout LLJJIJI;
    public int LLJJIJIIJIL;
    public int LLJJIJIL;
    public int LLJJJ;
    public C042Y LLJJJIL;

    private final int getItemWidth() {
        if (this.LLILZ) {
            int iLIZIZ = C1743690vTb.LIZIZ();
            int i = C1749350vcj.LLJI;
            return (int) (((double) (iLIZIZ - C1749350vcj.LLJILJIL)) * 0.277d);
        }
        int iLIZIZ2 = C1743690vTb.LIZIZ();
        int i2 = C1749350vcj.LLJI;
        return ((iLIZIZ2 - (C1749350vcj.LLJILJIL * 2)) - (C1749350vcj.LLJIJIL * 2)) / 3;
    }

    public final int e0() {
        Integer numValueOf;
        TwoRowVerticalLayoutManager twoRowVerticalLayoutManager;
        if (this.LLILZ) {
            C04HY c04hy = this.LLILLL;
            RecyclerView.LayoutManager layoutManager = c04hy != null ? c04hy.getLayoutManager() : null;
            if ((layoutManager instanceof TwoRowVerticalLayoutManager) && (twoRowVerticalLayoutManager = (TwoRowVerticalLayoutManager) layoutManager) != null) {
                int i = -1;
                if (twoRowVerticalLayoutManager.getChildCount() != 0) {
                    int width = (twoRowVerticalLayoutManager.LLILZIL + twoRowVerticalLayoutManager.getWidth()) - twoRowVerticalLayoutManager.getPaddingRight();
                    int childCount = twoRowVerticalLayoutManager.getChildCount();
                    int i2 = Integer.MIN_VALUE;
                    for (int i3 = 0; i3 < childCount; i3++) {
                        View childAt = twoRowVerticalLayoutManager.getChildAt(i3);
                        if (childAt != null) {
                            int position = twoRowVerticalLayoutManager.getPosition(childAt);
                            int decoratedLeft = twoRowVerticalLayoutManager.getDecoratedLeft(childAt) + twoRowVerticalLayoutManager.LLILZIL;
                            int decoratedRight = twoRowVerticalLayoutManager.getDecoratedRight(childAt);
                            int i4 = twoRowVerticalLayoutManager.LLILZIL;
                            if (decoratedRight + i4 > i4 + twoRowVerticalLayoutManager.getPaddingLeft() && decoratedLeft < width && position > i2) {
                                i2 = position;
                            }
                        }
                    }
                    if (i2 != Integer.MIN_VALUE) {
                        i = i2;
                    }
                }
                numValueOf = Integer.valueOf(i);
            }
            return 0;
        }
        numValueOf = Integer.valueOf((this.LLILLJJLI != null ? r0.size() : 0) - 1);
        if (numValueOf != null) {
            return Math.max(0, numValueOf.intValue());
        }
        return 0;
    }

    public C04HT(Context context) {
        super(context);
        this.LL = -1;
        this.LLILZ = true;
        this.LLIZLLLIL = -1;
        this.LLJ = -1;
        this.LLJI = -1;
        setClipChildren(false);
        setClipToPadding(false);
    }

    public final void setCheckedViewInfo(C042Y c042y) {
        this.LLJJJIL = c042y;
    }

    /* JADX WARN: Type inference failed for: r19v0, types: [X.04EQ] */
    public final void h0(String str, final int i, String str2, final SeaSkuPanelViewModel seaSkuPanelViewModel, boolean z, InterfaceC1631620sYq interfaceC1631620sYq, List list, final C04EO c04eo) {
        boolean z2;
        EnumC1749360vck enumC1749360vck;
        int itemWidth;
        int iLIZIZ;
        String str3;
        int iIntValue;
        String str4;
        Integer num;
        ProductBase productBase;
        SeaSkuPanelData seaSkuPanelData;
        FeedbackVoteData feedbackVoteData;
        String str5;
        int id;
        Integer numLIZ;
        int iIntValue2;
        int iLIZIZ2;
        ECRichText eCRichText;
        float fMeasureText;
        int i2;
        Set<String> setKeySet;
        String str6;
        String strLJJIFFI;
        ECRichTextAttribute eCRichTextAttribute;
        IconAttribute iconAttribute;
        Size size;
        Integer num2;
        ECRichText eCRichText2;
        TextAttribute textAttribute;
        Font font;
        this.LL = i;
        this.LLILLJJLI = list;
        ArrayList arrayList = (ArrayList) list;
        if (arrayList.size() > 6) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.LLILZ = z2;
        ConstraintLayout constraintLayout = new ConstraintLayout(getContext());
        constraintLayout.setId(R.id.ej_);
        C19ME c19me = new C19ME(-1, -2);
        c19me.topToTop = 0;
        c19me.startToStart = 0;
        C786410Ut5.m6(constraintLayout, c19me);
        interfaceC1631620sYq.invoke(Integer.valueOf(i), constraintLayout, str);
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
        C19ME c19me2 = new C19ME(-2, -2);
        c19me2.topToTop = 0;
        c19me2.startToStart = 0;
        C786410Ut5.R6(tuxTextView, c19me2);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str2);
        sbLIZ.append(" (");
        sbLIZ.append(arrayList.size());
        sbLIZ.append(')');
        tuxTextView.setText(C2188811AlT.LIZIZ(sbLIZ));
        constraintLayout.addView(tuxTextView);
        C426750GoL.LJIIL(constraintLayout, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16))), null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16))), null, 26);
        addView(constraintLayout);
        if (z && arrayList.size() == 1) {
            C042Y c042y = (C042Y) C13LP.LJJJLL(list);
            if (c042y != null) {
                c042y.LLJI = true;
                this.LLJJJIL = c042y;
            }
            c04eo.LIZ(i, (C042Y) C13LP.LJJJLL(list));
        }
        seaSkuPanelViewModel.LLLFFI = arrayList.size();
        if (this.LLILZ) {
            enumC1749360vck = EnumC1749360vck.PERCENT;
        } else {
            enumC1749360vck = EnumC1749360vck.SPLITTHREE;
        }
        int value = enumC1749360vck.getValue();
        int itemWidth2 = getItemWidth() - (LLJJJJ * 2);
        Iterator it2 = arrayList.iterator();
        int i3 = 0;
        while (true) {
            if (it2.hasNext()) {
                SalePropTag salePropTag = ((C042Y) it2.next()).LLILZLL;
                if (salePropTag != null && salePropTag.description != null) {
                    break;
                } else {
                    i3++;
                }
            } else {
                i3 = -1;
                break;
            }
        }
        C042Y c042y2 = (C042Y) C13LP.LJJJLZIJ(i3, list);
        if (c042y2 != null) {
            SalePropTag salePropTag2 = c042y2.LLILZLL;
            if (salePropTag2 != null && (eCRichText2 = salePropTag2.description) != null && (textAttribute = eCRichText2.textAttribute) != null && (font = textAttribute.font) != null) {
                numLIZ = font.LIZ();
            } else {
                numLIZ = null;
            }
            C444890HcV c444890HcV = new C444890HcV();
            if (numLIZ != null) {
                iIntValue2 = numLIZ.intValue();
            } else {
                iIntValue2 = 71;
            }
            c444890HcV.LIZ(iIntValue2);
            this.LLIZLLLIL = i3;
            this.LLIZ = C04HU.LIZ(i3, this.LLILZ);
            SalePropTag salePropTag3 = c042y2.LLILZLL;
            if (salePropTag3 != null && (eCRichText = salePropTag3.description) != null) {
                Map<String, ECRichTextAttribute> map = eCRichText.arguments;
                if (map != null && (setKeySet = map.keySet()) != null && (str6 = (String) C13LP.LJJJJZ(setKeySet)) != null && !a0.LJJJIL(str6)) {
                    Map<String, ECRichTextAttribute> map2 = eCRichText.arguments;
                    if (map2 != null && (eCRichTextAttribute = map2.get(str6)) != null && (iconAttribute = eCRichTextAttribute.iconAttribute) != null && (size = iconAttribute.size) != null && (num2 = size.width) != null) {
                        iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(num2));
                    } else {
                        iLIZIZ2 = 0;
                    }
                    String str7 = eCRichText.template;
                    if (str7 != null) {
                        strLJJIFFI = u.LJJIFFI(str7, str6, "", false);
                    } else {
                        strLJJIFFI = null;
                    }
                    fMeasureText = c444890HcV.measureText(strLJJIFFI) + iLIZIZ2;
                } else {
                    fMeasureText = c444890HcV.measureText(eCRichText.template);
                    iLIZIZ2 = 0;
                }
                if (fMeasureText > itemWidth2) {
                    i2 = 2;
                } else {
                    i2 = 1;
                }
                this.LLJI = i2;
            } else {
                iLIZIZ2 = 0;
            }
            int iMax = Math.max(iLIZIZ2, ((int) (c444890HcV.getFontMetrics().descent - c444890HcV.getFontMetrics().ascent)) + 1);
            c444890HcV.LIZ(61);
            if (c444890HcV.measureText(c042y2.LLILLJJLI) > itemWidth2 && this.LLJI == 1) {
                this.LLJ = 2;
            } else {
                this.LLJ = 1;
            }
            int i4 = ((int) (c444890HcV.getFontMetrics().descent - c444890HcV.getFontMetrics().ascent)) + 1;
            int i5 = this.LLJ;
            int i6 = i4 * i5;
            this.LLJIJIL = i6;
            int i7 = this.LLJI;
            int i8 = iMax * i7;
            this.LLJILJIL = i8;
            this.LLJILJILJ = i6 + i8 + LLJJJJJIL;
            this.LLJILLL = i5 + i7;
        }
        C444890HcV c444890HcV2 = new C444890HcV();
        c444890HcV2.LIZ(61);
        ArrayList arrayList2 = new ArrayList();
        int i9 = 0;
        for (Object obj : arrayList) {
            int i10 = i9 + 1;
            if (i9 >= 0) {
                if (C04HU.LIZ(i9, this.LLILZ)) {
                    arrayList2.add(obj);
                }
                i9 = i10;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
        ArrayList arrayList3 = new ArrayList();
        int i11 = 0;
        for (Object obj2 : arrayList) {
            int i12 = i11 + 1;
            if (i11 >= 0) {
                if (!C04HU.LIZ(i11, this.LLILZ)) {
                    arrayList3.add(obj2);
                }
                i11 = i12;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
        Iterator it3 = arrayList2.iterator();
        int i13 = 1;
        while (it3.hasNext()) {
            if (c444890HcV2.measureText(((C042Y) it3.next()).LLILLJJLI) > itemWidth2) {
                i13 = 2;
            }
        }
        Iterator it4 = arrayList3.iterator();
        int i14 = 1;
        while (it4.hasNext()) {
            if (c444890HcV2.measureText(((C042Y) it4.next()).LLILLJJLI) > itemWidth2) {
                i14 = 2;
            }
        }
        this.LLJJ = i13;
        this.LLJJI = i14;
        int i15 = ((int) (c444890HcV2.getFontMetrics().descent - c444890HcV2.getFontMetrics().ascent)) + 1;
        int iMax2 = Math.max(this.LLJILJILJ, this.LLJILLL * i15);
        if (this.LLIZLLLIL != -1) {
            if (this.LLIZ) {
                this.LLJJ = Math.max(i13, this.LLJILLL);
                this.LLILZLL = iMax2;
                this.LLILZIL = i15 * i14;
            } else {
                this.LLJJI = Math.max(i14, this.LLJILLL);
                this.LLILZIL = iMax2;
                this.LLILZLL = i15 * i13;
            }
        } else {
            this.LLILZIL = i14 * i15;
            this.LLILZLL = i15 * i13;
        }
        if (arrayList.size() <= 3) {
            itemWidth = Math.max(this.LLILZLL, this.LLILZIL) + getItemWidth() + C1749350vcj.LLJILJILJ;
            iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2));
        } else {
            itemWidth = this.LLILZLL + this.LLILZIL + ((getItemWidth() + C1749350vcj.LLJILJILJ) * 2) + C1749350vcj.LLJIJIL;
            iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2));
        }
        int i16 = itemWidth + iLIZIZ;
        final C04HY c04hy = new C04HY(getContext(), null, 0);
        c04hy.setId(R.id.ej7);
        C19ME c19me3 = new C19ME(-1, i16);
        c19me3.topToBottom = constraintLayout.getId();
        c19me3.startToStart = 0;
        ((ViewGroup.MarginLayoutParams) c19me3).topMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
        c19me3.matchConstraintMaxHeight = i16;
        if (this.LLILZ) {
            C426750GoL.LJIIL(c04hy, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16))), null, null, null, 30);
        } else {
            C426750GoL.LJIIL(c04hy, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16))), null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16))), null, 26);
        }
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c04hy);
        c04hy.setLayoutParams(c19me3);
        c04hy.setOverScrollMode(0);
        this.LLILLL = c04hy;
        final boolean z3 = this.LLILZ;
        int itemWidth3 = this.LLILZLL + getItemWidth();
        int i17 = C1749350vcj.LLJILJILJ;
        int i18 = itemWidth3 + i17;
        int itemWidth4 = this.LLILZIL + getItemWidth() + i17;
        if (z3) {
            int i19 = C04HY.LLILLJJLI;
            c04hy.setLayoutManager(new TwoRowVerticalLayoutManager(i18, itemWidth4, i19, i19));
        } else {
            int i20 = C04HY.LLILLJJLI;
            c04hy.setLayoutManager(new TwoRowHorizontalLayoutManager(i18, itemWidth4, i20, i20));
        }
        c04hy.addItemDecoration(new C0DXR() { // from class: X.04Hb
            @Override // X.C0DXR
            public final void LIZIZ(Rect rect, View view, RecyclerView recyclerView, C21673919s1 c21673919s1) {
                super.LIZIZ(rect, view, recyclerView, c21673919s1);
                int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
                if (!z3) {
                    if (childAdapterPosition <= 2) {
                        rect.bottom = C04HY.LLILLJJLI / 2;
                    } else {
                        rect.top = C04HY.LLILLJJLI / 2;
                    }
                    if ((childAdapterPosition + 1) % 3 != 0) {
                        rect.right = C04HY.LLILLJJLI;
                    }
                }
            }
        });
        C04HW c04hw = new C04HW(this.LLILZIL, this.LLILZLL, new InterfaceC1749380vcm() { // from class: X.04EQ
            @Override // X.InterfaceC1749380vcm
            public final void LIZ(int i21) {
                C042Y c042y3;
                C04HW c04hw2;
                C04HT c04ht = this.LIZ;
                List<C042Y> list2 = c04ht.LLILLJJLI;
                if (list2 != null) {
                    C04ES c04es = c04eo;
                    int i22 = i;
                    C042Y c042y4 = (C042Y) C13LP.LJJJLZIJ(i21, list2);
                    if (c042y4 != null) {
                        if (Intrinsics.LJFF(c04ht.LLJJJIL, c042y4)) {
                            c042y3 = null;
                        } else {
                            c042y3 = c042y4;
                        }
                        c04ht.LLJJJIL = c042y3;
                        ArrayList arrayList4 = new ArrayList(list2);
                        boolean z4 = false;
                        int i23 = 0;
                        for (Object obj3 : arrayList4) {
                            int i24 = i23 + 1;
                            if (i23 >= 0) {
                                C042Y c042y5 = (C042Y) obj3;
                                boolean zLJFF = Intrinsics.LJFF(c04ht.LLJJJIL, c042y5);
                                if (c042y5.LLJI != zLJFF) {
                                    C042Y c042yLIZ = C042X.LIZ(c042y5);
                                    c042yLIZ.LLJI = zLJFF;
                                    ListProtector.set(arrayList4, i23, c042yLIZ);
                                }
                                i23 = i24;
                            } else {
                                C1697810uHb.LJIJI();
                                throw null;
                            }
                        }
                        c04ht.LLILLJJLI = arrayList4;
                        C04HY c04hy2 = c04ht.LLILLL;
                        if (c04hy2 != null && (c04hw2 = c04hy2.LL) != null) {
                            c04hw2.LLLI(arrayList4);
                        }
                        c04es.LIZ(i22, c04ht.LLJJJIL);
                        if (c04ht.LLJJJIL != null) {
                            z4 = true;
                        }
                        c04es.LIZIZ(i22, i21, c042y4, z4);
                    }
                }
            }

            @Override // X.InterfaceC1749380vcm
            public final void LIZIZ(int i21, TuxIconView tuxIconView) {
                seaSkuPanelViewModel.oR2(i21, c04hy.getContext(), "sku_attr_pic", null);
                C1748720vbi.LIZLLL(tuxIconView, new C049Y(), new AwS580S0100000_1(seaSkuPanelViewModel, 794));
            }
        }, value, this.LLILZ, this.LLIZLLLIL, this.LLJ, this.LLJIJIL, this.LLJILJIL, itemWidth2, this.LLJJ, this.LLJJI);
        final PageFinder pageFinderVia = PageFinder.via((View) this.LLILLL);
        c04hw.LLJILLL = new InterfaceC1072404Hi() { // from class: X.04HX
            @Override // X.InterfaceC1072404Hi
            public final void LIZ(View view, int i21, C042Y c042y3) {
                String str8;
                String str9;
                C1749350vcj c1749350vcj;
                View galleryView;
                ProductBase productBase2;
                C044V c044v = C044V.LIZ;
                int i22 = i;
                boolean zLJFF = Intrinsics.LJFF(seaSkuPanelViewModel.LLJJI, Boolean.TRUE);
                SeaSkuPanelViewModel seaSkuPanelViewModel2 = seaSkuPanelViewModel;
                Map<String, Integer> map3 = seaSkuPanelViewModel2.LLJZIJLIL;
                Map<String, String> map4 = seaSkuPanelViewModel2.LLL;
                String str10 = null;
                if (map4 != null) {
                    String str11 = c042y3.LL;
                    if (str11 == null) {
                        str11 = "";
                    }
                    str8 = (String) ((LinkedHashMap) map4).get(str11);
                } else {
                    str8 = null;
                }
                SeaSkuPanelViewModel seaSkuPanelViewModel3 = seaSkuPanelViewModel;
                ProductPackStruct productPackStruct = seaSkuPanelViewModel3.LLJILJILJ;
                if (productPackStruct != null && (productBase2 = productPackStruct.baseInfo) != null) {
                    str9 = productBase2.categoryId;
                } else {
                    str9 = null;
                }
                SkuPanelStarter.SkuEnterParams skuEnterParams = seaSkuPanelViewModel3.LLJILJIL;
                if (skuEnterParams != null && skuEnterParams.clickFrom == 17) {
                    str10 = "cut_price";
                }
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("c55267.d50322_i");
                sbLIZ2.append(i);
                sbLIZ2.append("_w10571_i");
                sbLIZ2.append(i21);
                C044V.LJI(c044v, view, i22, i21, c042y3, zLJFF ? 1 : 0, map3, str8, str9, str10, productPackStruct, C2188811AlT.LIZIZ(sbLIZ2), pageFinderVia);
                if ((view instanceof C1749350vcj) && (c1749350vcj = (C1749350vcj) view) != null && (galleryView = c1749350vcj.getGalleryView()) != null) {
                    C1748720vbi.LJFF(galleryView, new C049X(), new AwS545S0100000_1(c042y3, 1670), new AwS580S0100000_1(seaSkuPanelViewModel, 793));
                }
            }
        };
        c04hy.setAdapter(c04hw);
        addView(c04hy);
        C04HW c04hw2 = c04hy.LL;
        if (c04hw2 != null) {
            c04hw2.LLLI(list);
        }
        C430110Gtl.LIZ(c04hy, new AwS402S0200000_1(this, seaSkuPanelViewModel, 78));
        if (this.LLILZ) {
            FrameLayout frameLayout = new FrameLayout(getContext());
            frameLayout.setId(ViewGroup.generateViewId());
            C19ME c19me4 = new C19ME(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(48)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2)));
            c19me4.topToBottom = c04hy.getId();
            c19me4.startToStart = 0;
            c19me4.endToEnd = 0;
            ((ViewGroup.MarginLayoutParams) c19me4).topMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
            C786410Ut5.a6(frameLayout, c19me4);
            GradientDrawable gradientDrawable = new GradientDrawable();
            float f = 10;
            gradientDrawable.setCornerRadius(f);
            Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a02, getContext());
            if (numLIZJ != null) {
                gradientDrawable.setColor(numLIZJ.intValue());
            }
            frameLayout.setBackground(gradientDrawable);
            View view = new View(getContext());
            C786410Ut5.W5(view, new C19ME(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2))));
            GradientDrawable gradientDrawable2 = new GradientDrawable();
            gradientDrawable2.setCornerRadius(f);
            Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.a00, getContext());
            if (numLIZJ2 != null) {
                gradientDrawable2.setColor(numLIZJ2.intValue());
            }
            view.setBackground(gradientDrawable2);
            this.LLJJIII = view;
            this.LLJJIJI = frameLayout;
            frameLayout.addView(view);
            addView(frameLayout);
        }
        int size2 = arrayList.size();
        int i21 = (size2 / 2) + (size2 % 2);
        final float itemWidth5 = (getItemWidth() * i21) + ((i21 - 1) * C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)));
        c04hy.addOnScrollListener(new AbstractC1585810rMx() { // from class: X.04GJ
            /* JADX WARN: Removed duplicated region for block: B:58:0x00e2  */
            @Override // X.AbstractC1585810rMx
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void LJJIIJ(androidx.recyclerview.widget.RecyclerView r12, int r13) {
                /*
                    Method dump skipped, instruction units count: 276
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C04GJ.LJJIIJ(androidx.recyclerview.widget.RecyclerView, int):void");
            }

            @Override // X.AbstractC1585810rMx
            public final void LJJIIZI(RecyclerView recyclerView, int i22, int i23) {
                float f2;
                C04HT c04ht = this.LL;
                View view2 = c04ht.LLJJIII;
                if (view2 != null) {
                    float f3 = itemWidth5;
                    c04ht.LLJJIJIIJIL += i22;
                    float width = f3 - recyclerView.getWidth();
                    if (width > 0.0f) {
                        f2 = c04ht.LLJJIJIIJIL / width;
                    } else {
                        f2 = 0.0f;
                    }
                    C786410Ut5.Jc(view2, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24)) * C13LZ.LIZLLL(f2, 0.0f, 1.0f));
                }
            }
        });
        ProductPackStruct productPackStruct = seaSkuPanelViewModel.LLJILJILJ;
        if (productPackStruct != null && (seaSkuPanelData = productPackStruct.skuPanelData) != null && (feedbackVoteData = seaSkuPanelData.feedbackVoteData) != null && (str5 = feedbackVoteData.text) != null && !a0.LJJJIL(str5) && Intrinsics.LJFF(str, feedbackVoteData.showSalePropId)) {
            str3 = null;
            ConstraintLayout constraintLayoutLIZIZ = C04HU.LIZIZ(getContext(), this, feedbackVoteData, null);
            FrameLayout frameLayout2 = new FrameLayout(getContext());
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
            layoutParams.gravity = 8388611;
            frameLayout2.addView(constraintLayoutLIZIZ, layoutParams);
            C19ME c19me5 = new C19ME(0, -2);
            ((ViewGroup.MarginLayoutParams) c19me5).topMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4));
            c19me5.setMarginStart(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)));
            c19me5.setMarginEnd(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)));
            FrameLayout frameLayout3 = this.LLJJIJI;
            if (this.LLILZ && frameLayout3 != null) {
                id = frameLayout3.getId();
            } else {
                id = c04hy.getId();
            }
            c19me5.topToBottom = id;
            iIntValue = 0;
            c19me5.startToStart = 0;
            c19me5.endToEnd = 0;
            c19me5.horizontalBias = 0.0f;
            addView(frameLayout2, c19me5);
        } else {
            str3 = null;
            iIntValue = 0;
        }
        C044V c044v = C044V.LIZ;
        ProductPackStruct productPackStruct2 = seaSkuPanelViewModel.LLJILJILJ;
        if (productPackStruct2 != null && (productBase = productPackStruct2.baseInfo) != null) {
            str4 = productBase.categoryId;
        } else {
            str4 = str3;
        }
        String[] strArr = seaSkuPanelViewModel.LLJZ;
        C042Y c042y3 = (C042Y) C13LP.LJJJLL(list);
        if (c042y3 != null && (num = c042y3.LLJJIII) != null) {
            iIntValue = num.intValue();
        }
        Map<String, Integer> map3 = seaSkuPanelViewModel.LLJZIJLIL;
        C042Y c042y4 = (C042Y) C13LP.LJJJLL(list);
        if (c042y4 != null) {
            str3 = c042y4.LLJJIJI;
        }
        Boolean bool = Boolean.TRUE;
        c044v.getClass();
        C044V.LJII(i, str4, productPackStruct2, strArr, iIntValue, map3, str3, bool);
    }
}
