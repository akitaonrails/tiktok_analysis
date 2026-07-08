package X;

import android.view.ViewGroup;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.PriceHideInfo;

/* JADX INFO: renamed from: X.186b, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C212295186b<T extends ViewGroup> extends AbstractC212220183e<T, C212294186a> {
    public final InterfaceC212298186e<T> LJ;
    public int LJFF;
    public int LJI;
    public C212332187m LJII;
    public TuxTextView LJIIIIZZ;
    public TuxTextView LJIIIZ;

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
        String strLIZIZ;
        int i = this.LJFF;
        Integer num = c212294186a.LJFF;
        if (num != null && num.intValue() == 1) {
            PriceHideInfo priceHideInfo = c212294186a.LJI;
            if (priceHideInfo != null && C123100dR.LIZ(priceHideInfo.displayText)) {
                TuxTextView tuxTextViewLIZJ = this.LJIIIZ;
                if (tuxTextViewLIZJ == null) {
                    tuxTextViewLIZJ = this.LJ.LIZJ(this.LIZ);
                    this.LJIIIZ = tuxTextViewLIZJ;
                }
                tuxTextViewLIZJ.setText(priceHideInfo.displayText);
                C786410Ut5.LLLLZLL(tuxTextViewLIZJ, 0);
                return;
            }
            TuxTextView tuxTextView = this.LJIIIZ;
            if (tuxTextView == null) {
                return;
            }
            C786410Ut5.LLLLZLL(tuxTextView, 8);
            return;
        }
        String str = c212294186a.LIZIZ;
        if (C703302op.LIZ(str)) {
            StringBuilder sb = new StringBuilder();
            int length = str.length();
            for (int i2 = 0; i2 < length; i2++) {
                char cCharAt = str.charAt(i2);
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
            String str2 = c212294186a.LIZJ;
            if (str2 != null) {
                c212332187mLIZIZ.setCurrencyText(str2);
            }
            String str3 = c212294186a.LJ;
            if (str3 != null) {
                c212332187mLIZIZ.setPricePrefix(str3);
            }
            c212332187mLIZIZ.setPriceNumText(str);
            c212332187mLIZIZ.setPriceSize(i);
            C786410Ut5.P(c212332187mLIZIZ, 0);
        } else {
            C212332187m c212332187m = this.LJII;
            if (c212332187m != null) {
                C786410Ut5.P(c212332187m, 8);
            }
        }
        String str4 = c212294186a.LIZ;
        if (C703302op.LIZ(str4)) {
            TuxTextView tuxTextViewLIZ = this.LJIIIIZZ;
            if (tuxTextViewLIZ == null) {
                tuxTextViewLIZ = this.LJ.LIZ(this.LIZ);
                this.LJIIIIZZ = tuxTextViewLIZ;
            }
            String str5 = "";
            if (c212294186a.LIZLLL) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                String str6 = c212294186a.LIZJ;
                if (str6 != null) {
                    str5 = str6;
                }
                sbLIZ.append(str5);
                sbLIZ.append(str4);
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            } else {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append(str4);
                String str7 = c212294186a.LIZJ;
                if (str7 != null) {
                    str5 = str7;
                }
                sbLIZ2.append(str5);
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
            }
            tuxTextViewLIZ.setText(strLIZIZ);
            C1003950cET.LIZ(tuxTextViewLIZ, i);
            C786410Ut5.LLLLZLL(tuxTextViewLIZ, 0);
            return;
        }
        TuxTextView tuxTextView2 = this.LJIIIIZZ;
        if (tuxTextView2 == null) {
            return;
        }
        C786410Ut5.LLLLZLL(tuxTextView2, 8);
    }

    public C212295186b(ViewGroup viewGroup, C212299186f c212299186f, int i, int i2) {
        super(viewGroup, "price_layout");
        this.LJ = c212299186f;
        this.LJFF = i;
        this.LJI = i2;
    }
}
