package X;

import Y.ARunnableS132S0100000_32;
import android.view.ViewGroup;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommercebase.promotion.data.style.DiscountTag;
import com.ss.android.ugc.aweme.ecommercebase.promotion.data.style.LabelColor;
import com.ss.android.ugc.aweme.ecommercebase.promotion.data.style.PriceTextConfig;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.DepositPrice;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.PriceHideInfo;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.186Z, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C186Z<T extends ViewGroup> extends AbstractC212220183e<T, C212294186a> {
    public final InterfaceC212297186d<T> LJ;
    public final int LJFF;
    public final int LJI;
    public C212332187m LJII;
    public TuxTextView LJIIIIZZ;
    public TuxTextView LJIIIZ;
    public TuxTextView LJIIJ;
    public TuxTextView LJIIJJI;
    public TuxTextView LJIIL;
    public C184U LJIILIIL;

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void LJIIJJI(C212294186a c212294186a) {
        PriceTextConfig priceTextConfig;
        LabelColor labelColor;
        Integer numLIZ;
        PriceTextConfig priceTextConfig2;
        String str;
        DiscountTag discountTag;
        PriceTextConfig priceTextConfig3;
        LabelColor labelColor2;
        Integer numLIZ2;
        StringBuilder sbLIZ;
        String strLIZIZ;
        PriceTextConfig priceTextConfig4;
        LabelColor labelColor3;
        Integer numLIZ3;
        PriceTextConfig priceTextConfig5;
        LabelColor labelColor4;
        Integer numLIZIZ;
        int i = this.LJFF;
        Integer num = c212294186a.LJFF;
        if (num != null && num.intValue() == 1) {
            PriceHideInfo priceHideInfo = c212294186a.LJI;
            if (priceHideInfo != null && C123100dR.LIZ(priceHideInfo.displayText)) {
                TuxTextView tuxTextViewLIZJ = this.LJIIJ;
                if (tuxTextViewLIZJ == null) {
                    tuxTextViewLIZJ = this.LJ.LIZJ(this.LIZ);
                    this.LJIIJ = tuxTextViewLIZJ;
                }
                tuxTextViewLIZJ.setText(priceHideInfo.displayText);
                C786410Ut5.LLLLZLL(tuxTextViewLIZJ, 0);
                return;
            }
            TuxTextView tuxTextView = this.LJIIJ;
            if (tuxTextView == null) {
                return;
            }
            C786410Ut5.LLLLZLL(tuxTextView, 8);
            return;
        }
        String str2 = c212294186a.LIZIZ;
        if (C703302op.LIZ(str2)) {
            StringBuilder sb = new StringBuilder();
            int length = str2.length();
            for (int i2 = 0; i2 < length; i2++) {
                char cCharAt = str2.charAt(i2);
                if (',' != cCharAt && '.' != cCharAt && '\'' != cCharAt) {
                    sb.append(cCharAt);
                }
            }
            if (sb.toString().length() > 7) {
                i = this.LJI;
            }
            boolean z = c212294186a.LIZLLL;
            C212332187m c212332187mLIZIZ = this.LJII;
            if (c212332187mLIZIZ == null) {
                c212332187mLIZIZ = this.LJ.LIZIZ(this.LIZ, z);
                this.LJII = c212332187mLIZIZ;
            }
            String str3 = c212294186a.LIZJ;
            if (str3 != null) {
                c212332187mLIZIZ.setCurrencyText(str3);
            }
            String str4 = c212294186a.LJ;
            if (str4 != null) {
                c212332187mLIZIZ.setPricePrefix(str4);
            }
            c212332187mLIZIZ.setPriceNumText(str2);
            c212332187mLIZIZ.setPriceSize(i);
            C184U c184u = this.LJIILIIL;
            if (c184u != null && (priceTextConfig5 = c184u.LJ) != null && (labelColor4 = priceTextConfig5.color) != null && (numLIZIZ = labelColor4.LIZIZ(c212332187mLIZIZ.getContext(), true)) != null) {
                int iIntValue = numLIZIZ.intValue();
                C212332187m c212332187m = this.LJII;
                if (c212332187m != null) {
                    c212332187m.setColor(iIntValue);
                }
            }
            C786410Ut5.P(c212332187mLIZIZ, 0);
        } else {
            C212332187m c212332187m2 = this.LJII;
            if (c212332187m2 != null) {
                C786410Ut5.P(c212332187m2, 8);
            }
        }
        String str5 = c212294186a.LIZ;
        if (C703302op.LIZ(str5)) {
            TuxTextView tuxTextViewLIZ = this.LJIIIIZZ;
            if (tuxTextViewLIZ == null) {
                tuxTextViewLIZ = this.LJ.LIZ(this.LIZ);
                this.LJIIIIZZ = tuxTextViewLIZ;
            }
            String str6 = "";
            if (c212294186a.LIZLLL) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                String str7 = c212294186a.LIZJ;
                if (str7 != null) {
                    str6 = str7;
                }
                sbLIZ2.append(str6);
                sbLIZ2.append(str5);
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
            } else {
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append(str5);
                String str8 = c212294186a.LIZJ;
                if (str8 != null) {
                    str6 = str8;
                }
                sbLIZ3.append(str6);
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ3);
            }
            tuxTextViewLIZ.setText(strLIZIZ);
            C184U c184u2 = this.LJIILIIL;
            if (c184u2 != null && (priceTextConfig4 = c184u2.LIZLLL) != null && (labelColor3 = priceTextConfig4.color) != null && (numLIZ3 = labelColor3.LIZ()) != null) {
                tuxTextViewLIZ.setTextColor(numLIZ3.intValue());
            }
            C786410Ut5.LLLLZLL(tuxTextViewLIZ, 0);
        } else {
            TuxTextView tuxTextView2 = this.LJIIIIZZ;
            if (tuxTextView2 != null) {
                C786410Ut5.LLLLZLL(tuxTextView2, 8);
            }
        }
        String strLIZIZ2 = c212294186a.LJIIIIZZ;
        DiscountTag discountTag2 = null;
        if (C703302op.LIZ(strLIZIZ2)) {
            TuxTextView tuxTextViewLJFF = this.LJIIIZ;
            if (tuxTextViewLJFF == null) {
                tuxTextViewLJFF = this.LJ.LJFF(this.LIZ);
                this.LJIIIZ = tuxTextViewLJFF;
            }
            C184U c184u3 = this.LJIILIIL;
            if (c184u3 != null) {
                discountTag2 = c184u3.LJFF;
            }
            if (discountTag2 != null) {
                Boolean bool = discountTag2.useBrackets;
                Boolean bool2 = Boolean.TRUE;
                if (Intrinsics.LJFF(bool, bool2)) {
                    if (Intrinsics.LJFF(discountTag2.useMinusPrefix, bool2)) {
                        sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("(-");
                    } else {
                        sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append('(');
                    }
                    sbLIZ.append(strLIZIZ2);
                    sbLIZ.append(')');
                    strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ);
                } else if (Intrinsics.LJFF(discountTag2.useMinusPrefix, bool2)) {
                    StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                    sbLIZ4.append('-');
                    sbLIZ4.append(strLIZIZ2);
                    strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ4);
                }
                tuxTextViewLJFF.setText(strLIZIZ2);
            } else {
                StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                sbLIZ5.append('(');
                sbLIZ5.append(strLIZIZ2);
                sbLIZ5.append(')');
                tuxTextViewLJFF.setText(C2188811AlT.LIZIZ(sbLIZ5));
            }
            C184U c184u4 = this.LJIILIIL;
            if (c184u4 != null && (discountTag = c184u4.LJFF) != null && (priceTextConfig3 = discountTag.text) != null && (labelColor2 = priceTextConfig3.color) != null && (numLIZ2 = labelColor2.LIZ()) != null) {
                tuxTextViewLJFF.setTextColor(numLIZ2.intValue());
            }
            C786410Ut5.LLLLZLL(tuxTextViewLJFF, 0);
        } else {
            TuxTextView tuxTextView3 = this.LJIIIZ;
            if (tuxTextView3 != null) {
                C786410Ut5.LLLLZLL(tuxTextView3, 8);
            }
        }
        DepositPrice depositPrice = c212294186a.LJII;
        if (depositPrice != null && (str = depositPrice.minDeposit) != null) {
            if (C703302op.LIZ(str)) {
                TuxTextView tuxTextViewLIZLLL = this.LJIIJJI;
                if (tuxTextViewLIZLLL == null) {
                    tuxTextViewLIZLLL = this.LJ.LIZLLL(this.LIZ);
                    this.LJIIJJI = tuxTextViewLIZLLL;
                }
                tuxTextViewLIZLLL.setText(str);
                C786410Ut5.LLLLZLL(tuxTextViewLIZLLL, 0);
            } else {
                TuxTextView tuxTextView4 = this.LJIIJJI;
                if (tuxTextView4 != null) {
                    C786410Ut5.LLLLZLL(tuxTextView4, 8);
                }
            }
        }
        TuxTextView tuxTextView5 = this.LJIIJJI;
        if (tuxTextView5 != null) {
            HandlerHook.viewPost(tuxTextView5, new ARunnableS132S0100000_32(this, 69));
        }
        String str9 = c212294186a.LJIIIZ;
        if (str9 == null) {
            return;
        }
        if (C703302op.LIZ(str9)) {
            TuxTextView tuxTextViewLJ = this.LJIIL;
            if (tuxTextViewLJ == null) {
                tuxTextViewLJ = this.LJ.LJ(this.LIZ);
                if (tuxTextViewLJ == null) {
                    return;
                }
                this.LJIIL = tuxTextViewLJ;
                if (tuxTextViewLJ == null) {
                    return;
                }
            }
            tuxTextViewLJ.setText(str9);
            C184U c184u5 = this.LJIILIIL;
            if (c184u5 != null && (priceTextConfig2 = c184u5.LJIIJ) != null) {
                int i3 = priceTextConfig2.font;
                InterfaceC1003930cER.LJIILIIL.getClass();
                tuxTextViewLJ.setTuxFont(C1003920cEQ.LIZ(i3));
            }
            C184U c184u6 = this.LJIILIIL;
            if (c184u6 != null && (priceTextConfig = c184u6.LJIIJ) != null && (labelColor = priceTextConfig.color) != null && (numLIZ = labelColor.LIZ()) != null) {
                tuxTextViewLJ.setTextColor(numLIZ.intValue());
            }
            C786410Ut5.LLLLZLL(tuxTextViewLJ, 0);
            return;
        }
        TuxTextView tuxTextView6 = this.LJIIL;
        if (tuxTextView6 == null) {
            return;
        }
        C786410Ut5.LLLLZLL(tuxTextView6, 8);
    }

    public C186Z(ViewGroup viewGroup, C212296186c c212296186c, int i) {
        super(viewGroup, "price_layout");
        this.LJ = c212296186c;
        this.LJFF = i;
        this.LJI = 2;
    }
}
