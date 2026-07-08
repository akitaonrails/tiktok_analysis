package X;

import Y.ACListenerS165S0100000_31;
import Y.ARunnableS28S0210000_31;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoLinkItem;
import com.zhiliaoapp.musically.R;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS276S0000000_31;
import kotlin.jvm.internal.AwS112S0201000_31;
import kotlin.jvm.internal.AwS397S0200000_31;
import kotlin.jvm.internal.AwS575S0100000_31;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.15X3, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C15X3 extends LinearLayout {
    public static final /* synthetic */ int LLILZIL = 0;
    public C15X5 LL;
    public final C426160GnO LLILLJJLI;
    public List<TakoLinkItem> LLILLL;
    public final C01GW LLILZ;

    private final int getMaxMoreLinkWidth() {
        return ((Number) this.LLILZ.getValue()).intValue();
    }

    public final int getMaxMoreLinkItemWidth() {
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
        c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
        c419910GdJ.LIZ = R.raw.icon_chevron_down_small_fill;
        c419910GdJ.LJ = Integer.valueOf(R.attr.a1k);
        C15X4 c15x4LIZLLL = LIZLLL(C15QB.LLILLJJLI, LIZJ(C786410Ut5.j4(getContext().getString(2131849877), Arrays.copyOf(new Object[]{100}, 1)), c419910GdJ.LIZIZ(2, getContext())), AFwS276S0000000_31.get$arr$(229));
        return c15x4LIZLLL != null ? c15x4LIZLLL.LIZIZ : C814420VxA.LIZIZ(C418440Gaw.LIZIZ(70));
    }

    public final C15X5 getItemAction() {
        return this.LL;
    }

    public final View LJI(int i) {
        C426160GnO c426160GnO = this.LLILLJJLI;
        if (c426160GnO != null) {
            Iterator it2 = new C1077420e8y(c426160GnO, 13).iterator();
            int i2 = 0;
            while (true) {
                C1077410e8x c1077410e8x = (C1077410e8x) it2;
                if (!c1077410e8x.hasNext()) {
                    break;
                }
                Object next = c1077410e8x.next();
                int i3 = i2 + 1;
                if (i2 >= 0) {
                    View view = (View) next;
                    if (i2 == i && Intrinsics.LJFF(view.getTag(), "NORMAL")) {
                        return view;
                    }
                    i2 = i3;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
        }
        return null;
    }

    public final void setItemAction(C15X5 c15x5) {
        this.LL = c15x5;
    }

    public C15X3(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LLILZ = C452501pT.LIZIZ(new AwS575S0100000_31(this, 1509));
        setOrientation(1);
        C426160GnO c426160GnO = new C426160GnO(context, null, 6);
        C786410Ut5.a7(c426160GnO, new LinearLayout.LayoutParams(-1, -2));
        c426160GnO.setGravity(-1);
        this.LLILLJJLI = c426160GnO;
        addView(c426160GnO);
    }

    public static CharSequence LIZJ(String str, C419890GdH c419890GdH) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) str);
        spannableStringBuilder.append((CharSequence) "x");
        C786410Ut5.q2(spannableStringBuilder, c419890GdH, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 17);
        return spannableStringBuilder;
    }

    public final void LIZ(List<TakoLinkItem> list, boolean z) {
        this.LLILLL = list;
        C426160GnO c426160GnO = this.LLILLJJLI;
        if (c426160GnO != null) {
            int i = 0;
            if (list == null || list.isEmpty()) {
                i = 8;
            }
            C786410Ut5.LJLLLLLL(i, c426160GnO);
        }
        C426160GnO c426160GnO2 = this.LLILLJJLI;
        if (c426160GnO2 != null) {
            HandlerHook.viewPost(c426160GnO2, new ARunnableS28S0210000_31(this, z, list, 0));
        }
    }

    public final void LIZIZ(int i, List list) {
        C15X5 c15x5;
        C15X5 c15x52;
        if (list != null && !list.isEmpty() && (!false) && list != null) {
            int i2 = i;
            int i3 = 0;
            for (Object obj : list) {
                int i4 = i3 + 1;
                if (i3 >= 0) {
                    TakoLinkItem takoLinkItem = (TakoLinkItem) obj;
                    C15X4 c15x4LJFF = LJFF(i3, takoLinkItem);
                    if (c15x4LJFF != null) {
                        i2 -= c15x4LJFF.LIZIZ;
                        if (i3 == 0) {
                            C426160GnO c426160GnO = this.LLILLJJLI;
                            if (c426160GnO != null) {
                                c426160GnO.addView(c15x4LJFF.LIZ);
                            }
                            String str = takoLinkItem.link;
                            if (str.length() > 0 && (c15x52 = this.LL) != null) {
                                c15x52.g9(0, takoLinkItem.name, str, CardStruct.IStatusCode.DEFAULT);
                            }
                            if (list.size() > 1 && i2 <= getMaxMoreLinkWidth()) {
                                c15x4LJFF.LIZ.setWidth(i - getMaxMoreLinkWidth());
                                C15X4 c15x4LJ = LJ(list.size() - 1, list);
                                if (c15x4LJ != null) {
                                    C426160GnO c426160GnO2 = this.LLILLJJLI;
                                    if (c426160GnO2 != null) {
                                        c426160GnO2.addView(c15x4LJ.LIZ);
                                        return;
                                    }
                                    return;
                                }
                            }
                        } else if ((i3 != list.size() - 1 || i2 <= 0) && i2 <= getMaxMoreLinkWidth()) {
                            C15X4 c15x4LJ2 = LJ(list.size() - i3, list);
                            if (c15x4LJ2 != null) {
                                C426160GnO c426160GnO3 = this.LLILLJJLI;
                                if (c426160GnO3 == null) {
                                    return;
                                }
                                c426160GnO3.addView(c15x4LJ2.LIZ);
                                return;
                            }
                        } else {
                            C426160GnO c426160GnO4 = this.LLILLJJLI;
                            if (c426160GnO4 != null) {
                                c426160GnO4.addView(c15x4LJFF.LIZ);
                            }
                            String str2 = takoLinkItem.link;
                            if (str2.length() > 0 && (c15x5 = this.LL) != null) {
                                c15x5.g9(i3, takoLinkItem.name, str2, CardStruct.IStatusCode.DEFAULT);
                            }
                        }
                    }
                    i3 = i4;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
        }
    }

    public final C15X4 LJ(int i, List list) {
        C15X5 c15x5;
        if (list != null) {
            Integer numValueOf = Integer.valueOf(list.size());
            if (numValueOf.intValue() >= i) {
                int iIntValue = numValueOf.intValue();
                C419910GdJ c419910GdJ = new C419910GdJ();
                c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
                c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
                c419910GdJ.LIZ = R.raw.icon_chevron_down_small_fill;
                c419910GdJ.LJ = Integer.valueOf(R.attr.a1k);
                C419890GdH c419890GdHLIZIZ = c419910GdJ.LIZIZ(2, getContext());
                for (int i2 = iIntValue - i; i2 < iIntValue; i2++) {
                    TakoLinkItem takoLinkItem = (TakoLinkItem) ListProtector.get(list, i2);
                    String str = takoLinkItem.link;
                    if (str.length() > 0 && (c15x5 = this.LL) != null) {
                        c15x5.g9(i2, takoLinkItem.name, str, "1");
                    }
                }
                return LIZLLL(C15QB.LLILLJJLI, LIZJ(C786410Ut5.j4(getContext().getString(2131849877), Arrays.copyOf(new Object[]{Integer.valueOf(i)}, 1)), c419890GdHLIZIZ), new AwS397S0200000_31(this, (C15X3) list, (List<TakoLinkItem>) 114));
            }
        }
        return null;
    }

    public final C15X4 LJFF(int i, TakoLinkItem takoLinkItem) {
        SpannableStringBuilder spannableStringBuilder;
        C15QB c15qb = C15QB.LL;
        String str = takoLinkItem.name;
        if (getLayoutDirection() == 1) {
            spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) str);
            spannableStringBuilder.append((CharSequence) " .");
            spannableStringBuilder.append((CharSequence) String.valueOf(i + 1));
        } else {
            spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) String.valueOf(i + 1));
            spannableStringBuilder.append((CharSequence) ". ");
            spannableStringBuilder.append((CharSequence) str);
        }
        return LIZLLL(c15qb, spannableStringBuilder, new AwS112S0201000_31(takoLinkItem, this, i, 14));
    }

    public final C15X4 LIZLLL(C15QB c15qb, CharSequence charSequence, Function1<? super View, Unit> function1) {
        int iIntValue;
        int marginStart;
        Context context = getContext();
        if (context == null) {
            return null;
        }
        int marginEnd = 0;
        TuxTextView tuxTextView = new TuxTextView(context, null, 6, 0);
        tuxTextView.setTag(c15qb.name());
        C786410Ut5.R6(tuxTextView, new LinearLayout.LayoutParams(-2, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(26))));
        tuxTextView.setTextColorRes(R.attr.a1k);
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.c7, context);
        if (numLIZJ != null) {
            iIntValue = numLIZJ.intValue();
        } else {
            iIntValue = 0;
        }
        tuxTextView.setBackgroundColor(iIntValue);
        tuxTextView.setGravity(17);
        tuxTextView.setMaxLines(1);
        tuxTextView.setEllipsize(TextUtils.TruncateAt.END);
        int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6));
        tuxTextView.setPadding(iLIZIZ, tuxTextView.getPaddingTop(), iLIZIZ, tuxTextView.getPaddingBottom());
        C426750GoL.LJIIIZ(tuxTextView, null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6))), null, false, 25);
        C1857690yRT.LJIILJJIL(tuxTextView, Float.valueOf(C418440Gaw.LIZIZ(5)));
        C427690Gpr.LJ(tuxTextView, 0.0f);
        tuxTextView.setTuxFont(62);
        tuxTextView.setText(charSequence);
        C786410Ut5.h9(tuxTextView, new ACListenerS165S0100000_31((Function1) function1, 90));
        float fMeasureText = tuxTextView.getPaint().measureText(charSequence.toString()) + tuxTextView.getPaddingLeft() + tuxTextView.getPaddingRight();
        ViewGroup.LayoutParams layoutParams = tuxTextView.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            marginStart = ((ViewGroup.MarginLayoutParams) layoutParams).getMarginStart();
        } else {
            marginStart = 0;
        }
        float f = fMeasureText + marginStart;
        ViewGroup.LayoutParams layoutParams2 = tuxTextView.getLayoutParams();
        if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
            marginEnd = ((ViewGroup.MarginLayoutParams) layoutParams2).getMarginEnd();
        }
        return new C15X4(tuxTextView, (int) (f + marginEnd + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4))));
    }
}
