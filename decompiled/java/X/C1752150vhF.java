package X;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import c1b.m;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.LogisticLinkRichText;
import com.ss.android.ugc.aweme.ecommerce.core.utils.RichTextUtil;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS215S0000000_26;
import kotlin.jvm.internal.AFwS268S0000000_26;
import kotlin.jvm.internal.AwS570S0100000_26;
import kotlin.jvm.internal.AwS605S0100000_26;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0vhF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1752150vhF extends ConstraintLayout {
    public C1752150vhF LL;

    public C1752150vhF(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public final void h0(m mVar, Object obj) {
        int iLJLZ = (int) mVar.LJLZ();
        if (obj instanceof C1406720mi6) {
            if (Intrinsics.LJFF(((C1406720mi6) obj).LLILLJJLI, "text")) {
                iLJLZ = (int) mVar.LJLZ();
            }
            C1406720mi6 c1406720mi6 = (C1406720mi6) obj;
            if (Intrinsics.LJFF(c1406720mi6.LLILLJJLI, "ul") || Intrinsics.LJFF(c1406720mi6.LLILLJJLI, "ol")) {
                iLJLZ = (int) mVar.LJJLIIIIJ();
            }
        }
        if (obj instanceof C1406700mi4) {
            obj.getClass();
            if (Intrinsics.LJFF("image", "image")) {
                iLJLZ = (int) mVar.LJLZ();
            }
        }
        C426750GoL.LJIIIZ(this.LL, null, null, null, Integer.valueOf(iLJLZ), false, 23);
        C1752150vhF c1752150vhF = this.LL;
        c1752150vhF.setPadding(c1752150vhF.getPaddingLeft(), 0, this.LL.getPaddingRight(), 0);
    }

    public C1752150vhF(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.LL = this;
        C786410Ut5.Td(C786410Ut5.ne(context), R.layout.asi, this, true);
        this.LL = this;
    }

    public final void e0(C1406720mi6 c1406720mi6, int i, m mVar, InterfaceC1752190vhJ interfaceC1752190vhJ, Function1<? super Integer, ? extends Object> function1) {
        int i2;
        int i3;
        C1752150vhF c1752150vhF = this.LL;
        c1406720mi6.getClass();
        C03J8.LIZ(c1752150vhF, false);
        C1744700vVE.LJ(this.LL.getContext(), null);
        this.LL.findViewById(R.id.tv_root).setPadding(0, 0, 0, 0);
        TuxTextView tuxTextView = (TuxTextView) this.LL.findViewById(R.id.text);
        this.LL.findViewById(R.id.text).setTextAlignment(5);
        String str = c1406720mi6.LLILLJJLI;
        int iHashCode = str.hashCode();
        if (iHashCode != -42298471) {
            if (iHashCode != 3549) {
                if (iHashCode != 3735) {
                    if (iHashCode != 3556653) {
                        if (iHashCode == 110371416 && str.equals("title")) {
                            tuxTextView.setTuxFont(mVar.LIZ());
                            Object objInvoke = function1.invoke(Integer.valueOf(i + 1));
                            if ((objInvoke instanceof C1406720mi6) && Intrinsics.LJFF(((C1406720mi6) objInvoke).LLILLJJLI, "text")) {
                                C1752150vhF c1752150vhF2 = this.LL;
                                c1752150vhF2.setPadding(c1752150vhF2.getPaddingLeft(), (int) mVar.LLFZ(), this.LL.getPaddingRight(), (int) mVar.LJJJLZIJ());
                            } else {
                                C1752150vhF c1752150vhF3 = this.LL;
                                c1752150vhF3.setPadding(c1752150vhF3.getPaddingLeft(), (int) mVar.LLFZ(), this.LL.getPaddingRight(), (int) mVar.LLILZ());
                            }
                            C1748720vbi.LJFF(this.LL, new C10515049h(), new AwS570S0100000_26(c1406720mi6, 451), new AwS605S0100000_26(c1406720mi6, 232));
                            C786410Ut5.LJZ(8, (FrameLayout) this.LL.findViewById(R.id.g39));
                            mVar.LJJJI();
                            tuxTextView.setTextColorRes(R.attr.a1h);
                            C426750GoL.LJIIIZ(this.LL, null, null, null, 0, false, 23);
                        }
                    } else if (str.equals("text")) {
                        tuxTextView.setTuxFont(mVar.LIZIZ());
                        mVar.LLJJIJIL();
                        tuxTextView.setTextColorRes(R.attr.a1h);
                        Object objInvoke2 = function1.invoke(Integer.valueOf(i + 1));
                        Object objInvoke3 = function1.invoke(Integer.valueOf(i - 1));
                        int iLJJJJLL = (int) mVar.LJJJJLL();
                        int iLJJJJLL2 = (int) mVar.LJJJJLL();
                        if (c1406720mi6.LLIZLLLIL != null) {
                            if ((objInvoke2 instanceof C1406720mi6) && Intrinsics.LJFF(((C1406720mi6) objInvoke2).LLILLJJLI, "title")) {
                                iLJJJJLL2 = 0;
                            }
                        } else {
                            if (objInvoke2 instanceof C1406720mi6) {
                                C1406720mi6 c1406720mi62 = (C1406720mi6) objInvoke2;
                                if (Intrinsics.LJFF(c1406720mi62.LLILLJJLI, "text") || Intrinsics.LJFF(c1406720mi62.LLILLJJLI, "title")) {
                                    iLJJJJLL2 = 0;
                                }
                            }
                            if (objInvoke3 instanceof C1406720mi6) {
                                C1406720mi6 c1406720mi63 = (C1406720mi6) objInvoke3;
                                if (Intrinsics.LJFF(c1406720mi63.LLILLJJLI, "text") || Intrinsics.LJFF(c1406720mi63.LLILLJJLI, "sub_title")) {
                                    iLJJJJLL = 0;
                                }
                            }
                        }
                        if ((objInvoke3 instanceof C1406700mi4) || (objInvoke3 instanceof C1406570mhr)) {
                            iLJJJJLL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
                        }
                        if ((objInvoke2 instanceof C1406700mi4) || (objInvoke2 instanceof C1406570mhr) || objInvoke2 == null) {
                            iLJJJJLL2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
                        }
                        C1752150vhF c1752150vhF4 = this.LL;
                        c1752150vhF4.setPadding(c1752150vhF4.getPaddingLeft(), iLJJJJLL, this.LL.getPaddingRight(), iLJJJJLL2);
                        C786410Ut5.LJLLLLLL(8, this.LL.findViewById(R.id.g39));
                        h0(mVar, objInvoke2);
                    }
                } else if (str.equals("ul")) {
                    tuxTextView.setTuxFont(mVar.LIZIZ());
                    Context context = tuxTextView.getContext();
                    mVar.LLJJIJIL();
                    tuxTextView.setTextColor(C960203pA.LIZ(R.attr.a1h, context));
                    C786410Ut5.LJZ(0, (FrameLayout) this.LL.findViewById(R.id.g39));
                    C786410Ut5.LJLLLLLL(0, this.LL.findViewById(R.id.ulTag));
                    C786410Ut5.LLLLZLL((TuxTextView) this.LL.findViewById(R.id.pk_), 8);
                    int iLJJJJLL3 = (int) mVar.LJJJJLL();
                    int iLJJJJLL4 = (int) mVar.LJJJJLL();
                    Object objInvoke4 = function1.invoke(Integer.valueOf(i - 1));
                    Object objInvoke5 = function1.invoke(Integer.valueOf(i + 1));
                    if ((objInvoke4 instanceof C1406700mi4) || (objInvoke4 instanceof C1406570mhr)) {
                        iLJJJJLL3 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
                    }
                    if ((objInvoke5 instanceof C1406700mi4) || (objInvoke5 instanceof C1406570mhr) || objInvoke5 == null) {
                        iLJJJJLL4 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
                    }
                    Float fLLJIJIL = mVar.LLJIJIL();
                    if (fLLJIJIL != null) {
                        float fFloatValue = fLLJIJIL.floatValue();
                        C1752150vhF c1752150vhF5 = this.LL;
                        i3 = R.id.g39;
                        C1744700vVE.LJIIL(c1752150vhF5.findViewById(R.id.g39), (int) fFloatValue);
                    } else {
                        i3 = R.id.g39;
                    }
                    Float fLLF = mVar.LLF();
                    if (fLLF != null) {
                        C1744700vVE.LJIIIIZZ((int) fLLF.floatValue(), this.LL.findViewById(i3));
                    }
                    C1752150vhF c1752150vhF6 = this.LL;
                    c1752150vhF6.setPadding(c1752150vhF6.getPaddingLeft(), iLJJJJLL3, this.LL.getPaddingRight(), iLJJJJLL4);
                    h0(mVar, objInvoke5);
                }
            } else if (str.equals("ol")) {
                tuxTextView.setTuxFont(mVar.LIZIZ());
                Context context2 = tuxTextView.getContext();
                mVar.LLJJIJIL();
                tuxTextView.setTextColor(C960203pA.LIZ(R.attr.a1h, context2));
                C786410Ut5.LJZ(0, (FrameLayout) this.LL.findViewById(R.id.g39));
                C786410Ut5.LJLLLLLL(8, this.LL.findViewById(R.id.ulTag));
                C786410Ut5.LLLLZLL((TuxTextView) this.LL.findViewById(R.id.pk_), 0);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(c1406720mi6.LLILZ);
                sbLIZ.append('.');
                ((TextView) this.LL.findViewById(R.id.pk_)).setText(C2188811AlT.LIZIZ(sbLIZ));
                int iLJJJJLL5 = (int) mVar.LJJJJLL();
                int iLJJJJLL6 = (int) mVar.LJJJJLL();
                Object objInvoke6 = function1.invoke(Integer.valueOf(i - 1));
                Object objInvoke7 = function1.invoke(Integer.valueOf(i + 1));
                if ((objInvoke6 instanceof C1406700mi4) || (objInvoke6 instanceof C1406570mhr)) {
                    iLJJJJLL5 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
                }
                if ((objInvoke7 instanceof C1406700mi4) || (objInvoke7 instanceof C1406570mhr) || objInvoke7 == null) {
                    iLJJJJLL6 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
                }
                Float fLLJIJIL2 = mVar.LLJIJIL();
                if (fLLJIJIL2 != null) {
                    float fFloatValue2 = fLLJIJIL2.floatValue();
                    C1752150vhF c1752150vhF7 = this.LL;
                    i2 = R.id.g39;
                    C1744700vVE.LJIIL(c1752150vhF7.findViewById(R.id.g39), (int) fFloatValue2);
                } else {
                    i2 = R.id.g39;
                }
                Float fLLF2 = mVar.LLF();
                if (fLLF2 != null) {
                    C1744700vVE.LJIIIIZZ((int) fLLF2.floatValue(), this.LL.findViewById(i2));
                }
                C1752150vhF c1752150vhF8 = this.LL;
                c1752150vhF8.setPadding(c1752150vhF8.getPaddingLeft(), iLJJJJLL5, this.LL.getPaddingRight(), iLJJJJLL6);
                h0(mVar, objInvoke7);
            }
        } else if (str.equals("sub_title")) {
            tuxTextView.setTuxFont(mVar.LJJZ());
            tuxTextView.setTextColorRes(mVar.LJJIJIIJI());
            C786410Ut5.LJZ(8, (FrameLayout) this.LL.findViewById(R.id.g39));
            if (c1406720mi6.LLJ) {
                C1748720vbi.LJFF(this.LL, new C10515049h(), AFwS215S0000000_26.get$arr$(135), AFwS268S0000000_26.get$arr$(238));
            }
            C426750GoL.LJIIIZ(this.LL, null, null, null, Integer.valueOf((int) mVar.LL()), false, 23);
            C1752150vhF c1752150vhF9 = this.LL;
            c1752150vhF9.setPadding(c1752150vhF9.getPaddingLeft(), 0, this.LL.getPaddingRight(), 0);
        }
        if (c1406720mi6.LLIZLLLIL != null) {
            TextView textView = (TextView) this.LL.findViewById(R.id.text);
            C03B0 c03b0 = new C03B0((TextView) this.LL.findViewById(R.id.text), "description");
            C03B0.LIZ(c03b0, c1406720mi6.LLIZLLLIL, null, null, false, null, null, 126);
            textView.setText(c03b0.LIZJ);
        } else if (c1406720mi6.LLIZ != null) {
            TextView textView2 = (TextView) this.LL.findViewById(R.id.text);
            RichTextUtil richTextUtil = RichTextUtil.LIZ;
            LogisticLinkRichText logisticLinkRichText = c1406720mi6.LLIZ;
            Context context3 = this.LL.getContext();
            richTextUtil.getClass();
            textView2.setText(RichTextUtil.LIZIZ(logisticLinkRichText, context3));
        } else {
            TextView textView3 = (TextView) this.LL.findViewById(R.id.text);
            CharSequence string = c1406720mi6.LL;
            if (string == null) {
                Integer num = c1406720mi6.LLILLL;
                if (num != null) {
                    string = tuxTextView.getContext().getString(num.intValue());
                } else {
                    string = null;
                }
            }
            textView3.setText(string);
        }
        if (!Intrinsics.LJFF(c1406720mi6.LLILLJJLI, "text") && !Intrinsics.LJFF(c1406720mi6.LLILLJJLI, "ul") && !Intrinsics.LJFF(c1406720mi6.LLILLJJLI, "ol")) {
            ((TextView) this.LL.findViewById(R.id.text)).setLineSpacing(0.0f, 1.0f);
        } else {
            Float fLJLLLLLL = mVar.LJLLLLLL();
            if (fLJLLLLLL != null) {
                ((TextView) this.LL.findViewById(R.id.text)).setLineSpacing(0.0f, fLJLLLLLL.floatValue());
            }
        }
        Object objInvoke8 = function1.invoke(Integer.valueOf(i + 1));
        if (objInvoke8 == null || !(objInvoke8 instanceof InterfaceC1059904Cn)) {
            C426750GoL.LJIIL(this.LL, null, null, null, 0, 23);
            C426750GoL.LJIIIZ(this.LL, null, null, null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16))), false, 23);
        }
        if (c1406720mi6.LLILZIL) {
            C03DZ.LIZJ(this.LL.findViewById(R.id.view_more));
            ((TextView) this.LL.findViewById(R.id.view_more_text)).setText(this.LL.getContext().getString(mVar.LJJLIIIJ()));
            ((TuxTextView) this.LL.findViewById(R.id.view_more_text)).setTextColorRes(mVar.LJJJJLI());
            ((TuxIconView) this.LL.findViewById(R.id.view_more_icon)).setTintColorRes(mVar.LJJJJJL());
            C1748720vbi.LJFF(this.LL.findViewById(R.id.view_more), new C10515049h(), AFwS215S0000000_26.get$arr$(136), AFwS268S0000000_26.get$arr$(239));
            C948503nH.LJIILIIL(this.LL.findViewById(R.id.view_more), null, new C1752160vhG(interfaceC1752190vhJ, this, null), 3);
            return;
        }
        C03DZ.LIZ(this.LL.findViewById(R.id.view_more));
    }
}
