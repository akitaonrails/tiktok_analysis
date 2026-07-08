package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.feed.platform.container.info.ConstraintSizeVM;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0RjN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C703950RjN extends C21532619Oq implements InterfaceC703980RjQ {
    public static final /* synthetic */ int LLJJJJ = 0;
    public final boolean LLJJIJI;
    public InterfaceC703970RjP LLJJIJIIJIL;
    public final List<View> LLJJIJIL;
    public final Map<Integer, Pair<View, View>> LLJJJ;
    public final C01GW LLJJJIL;

    private final int getSeparatorWidth() {
        return ((Number) this.LLJJJIL.getValue()).intValue();
    }

    public C703950RjN(Context context) {
        super(context, null);
        this.LLJJIJI = ((Boolean) C0B8Q.LIZ.getValue()).booleanValue();
        this.LLJJIJIL = new ArrayList();
        this.LLJJJ = new LinkedHashMap();
        this.LLJJJIL = C452501pT.LIZIZ(new C703960RjO(context));
    }

    @Override // X.InterfaceC703980RjQ
    public final void LJ(C709410RsB c709410RsB) {
        if (((Number) C289670BWz.LIZ.getValue()).intValue() == 1) {
            this.LLJJIJIIJIL = c709410RsB;
        }
    }

    @Override // android.view.View
    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        InterfaceC703970RjP interfaceC703970RjP;
        super.setLayoutParams(layoutParams);
        if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (interfaceC703970RjP = this.LLJJIJIIJIL) != null) {
            interfaceC703970RjP.LIZIZ(this);
        }
    }

    @Override // X.InterfaceC703980RjQ
    public final Object LIZIZ(int i, View view) {
        return C700560Rdu.LIZJ(view, i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.C21532619Oq, android.view.View
    public final void onMeasure(int i, int i2) {
        View view;
        int marginStart;
        int marginEnd;
        int marginStart2;
        int marginEnd2;
        int separatorWidth;
        View view2;
        super.onMeasure(i, i2);
        if (!this.LLJJIJI) {
            return;
        }
        List<C21532719Or> flexLinesInternal = getFlexLinesInternal();
        if (!flexLinesInternal.isEmpty()) {
            ListIterator<C21532719Or> listIterator = flexLinesInternal.listIterator(flexLinesInternal.size());
            int i3 = 0;
            while (listIterator.hasPrevious()) {
                C21532719Or c21532719OrPrevious = listIterator.previous();
                i3 += c21532719OrPrevious.LJII - c21532719OrPrevious.LJIIIIZZ;
            }
            if (i3 > 1) {
                for (C21532719Or c21532719Or : getFlexLinesInternal()) {
                    C21532719Or c21532719Or2 = c21532719Or;
                    if (c21532719Or2.LJII - c21532719Or2.LJIIIIZZ > 1) {
                        if (c21532719Or != null) {
                            ArrayList<List> arrayList = new ArrayList();
                            List arrayList2 = new ArrayList();
                            arrayList.add(arrayList2);
                            int measuredWidth = (getMeasuredWidth() - getPaddingStart()) - getPaddingEnd();
                            ArrayList arrayList3 = new ArrayList();
                            Iterator<View> it2 = new C09RD(this).iterator();
                            while (true) {
                                C09RE c09re = (C09RE) it2;
                                if (!c09re.hasNext()) {
                                    break;
                                }
                                View view3 = (View) c09re.next();
                                if (view3.getId() != R.id.eks) {
                                    if (view3.getVisibility() == 0 && view3.getMeasuredWidth() > 0 && view3.getMeasuredHeight() > 0) {
                                        arrayList3.add(view3);
                                    } else {
                                        Pair pair = (Pair) ((LinkedHashMap) this.LLJJJ).get(Integer.valueOf(view3.hashCode()));
                                        if (pair != null && (view2 = (View) pair.getSecond()) != null) {
                                            C786410Ut5.LJLLLLLL(8, view2);
                                        }
                                    }
                                }
                            }
                            for (Object obj : arrayList3) {
                                arrayList2.add(obj);
                                int size = arrayList2.size() - 1;
                                int i4 = 0;
                                for (int i5 = 0; i5 < size; i5++) {
                                    View view4 = (View) ListProtector.get(arrayList2, i5);
                                    int measuredWidth2 = view4.getMeasuredWidth();
                                    ViewGroup.LayoutParams layoutParams = view4.getLayoutParams();
                                    if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                                        marginStart2 = ((ViewGroup.MarginLayoutParams) layoutParams).getMarginStart();
                                    } else {
                                        marginStart2 = 0;
                                    }
                                    int i6 = measuredWidth2 + marginStart2;
                                    ViewGroup.LayoutParams layoutParams2 = view4.getLayoutParams();
                                    if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
                                        marginEnd2 = ((ViewGroup.MarginLayoutParams) layoutParams2).getMarginEnd();
                                    } else {
                                        marginEnd2 = 0;
                                    }
                                    int i7 = i4 + i6 + marginEnd2;
                                    if (!Intrinsics.LJFF(C700560Rdu.LIZJ(view4, R.id.ekr), Boolean.TRUE)) {
                                        separatorWidth = getSeparatorWidth();
                                    } else {
                                        separatorWidth = ConstraintSizeVM.LLIZ;
                                    }
                                    i4 = i7 + separatorWidth;
                                }
                                View view5 = (View) C13LP.LJJLIIIJJI(arrayList2);
                                int measuredWidth3 = view5.getMeasuredWidth();
                                ViewGroup.LayoutParams layoutParams3 = view5.getLayoutParams();
                                if (layoutParams3 instanceof ViewGroup.MarginLayoutParams) {
                                    marginStart = ((ViewGroup.MarginLayoutParams) layoutParams3).getMarginStart();
                                } else {
                                    marginStart = 0;
                                }
                                int i8 = measuredWidth3 + marginStart;
                                ViewGroup.LayoutParams layoutParams4 = view5.getLayoutParams();
                                if (layoutParams4 instanceof ViewGroup.MarginLayoutParams) {
                                    marginEnd = ((ViewGroup.MarginLayoutParams) layoutParams4).getMarginEnd();
                                } else {
                                    marginEnd = 0;
                                }
                                if (i4 + i8 + marginEnd > measuredWidth) {
                                    arrayList2.remove(obj);
                                    arrayList2 = C1697810uHb.LJIILJJIL(obj);
                                    arrayList.add(arrayList2);
                                }
                            }
                            for (List<View> list : arrayList) {
                                int i9 = 0;
                                for (View view6 : list) {
                                    int i10 = i9 + 1;
                                    Pair pair2 = (Pair) ((LinkedHashMap) this.LLJJJ).get(Integer.valueOf(view6.hashCode()));
                                    if (pair2 != null) {
                                        view = (View) pair2.getSecond();
                                    } else {
                                        view = null;
                                    }
                                    if (view6.getVisibility() == 0 && view6.getMeasuredWidth() > 0 && view6.getMeasuredHeight() > 0 && i9 < list.size() - 1) {
                                        if (view != null) {
                                            C786410Ut5.LJLLLLLL(0, view);
                                        }
                                    } else if (view != null) {
                                        C786410Ut5.LJLLLLLL(8, view);
                                    }
                                    i9 = i10;
                                }
                            }
                            return;
                        }
                        return;
                    }
                }
            }
        }
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        InterfaceC703970RjP interfaceC703970RjP = this.LLJJIJIIJIL;
        if (interfaceC703970RjP != null) {
            interfaceC703970RjP.LIZJ(this);
        }
    }

    @Override // X.C21532619Oq, android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        int childCount;
        Object second;
        if (view == null) {
            return;
        }
        if (view.getId() == R.id.eks) {
            super.addView(view, i, layoutParams);
            return;
        }
        if (this.LLJJIJI) {
            if (i >= 0 && i < ((ArrayList) this.LLJJIJIL).size()) {
                if (i == 0) {
                    childCount = 0;
                } else {
                    Object obj = ListProtector.get(this.LLJJIJIL, i - 1);
                    int iLJIILL = C09RB.LJIILL(new C09RD(this), obj);
                    Pair pair = (Pair) ((LinkedHashMap) this.LLJJJ).get(Integer.valueOf(obj.hashCode()));
                    if (pair != null && (second = pair.getSecond()) != null) {
                        iLJIILL = C09RB.LJIILL(new C09RD(this), second);
                    }
                    childCount = iLJIILL + 1;
                }
            } else {
                childCount = getChildCount();
            }
        } else {
            childCount = i;
        }
        super.addView(view, childCount, layoutParams);
        if (i < 0 || i >= ((ArrayList) this.LLJJIJIL).size()) {
            i = ((ArrayList) this.LLJJIJIL).size();
        }
        ListProtector.add(this.LLJJIJIL, i, view);
        if (this.LLJJIJI && view.getId() != R.id.eks) {
            View viewLIZ = C703990RjR.LIZ(getContext(), Intrinsics.LJFF(C700560Rdu.LIZJ(view, R.id.ekr), Boolean.TRUE));
            viewLIZ.setTag(Integer.valueOf(view.hashCode()));
            this.LLJJJ.put(Integer.valueOf(view.hashCode()), new Pair<>(view, viewLIZ));
            super.addView(viewLIZ, childCount + 1, viewLIZ.getLayoutParams());
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        InterfaceC703970RjP interfaceC703970RjP;
        super.onSizeChanged(i, i2, i3, i4);
        if ((i != i3 || i2 != i4) && (interfaceC703970RjP = this.LLJJIJIIJIL) != null) {
            interfaceC703970RjP.LIZ(this);
        }
    }
}
