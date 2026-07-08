package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommercebase.promotion.data.style.DiscountTag;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.184R, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C184R<T extends ViewGroup> extends C187Z<T, C184S, C186W, C184Q> {
    public static final /* synthetic */ int LJIJI = 0;
    public final TuxTextView LJII;
    public final TuxTextView LJIIIIZZ;
    public final C184T<T> LJIIIZ;
    public TuxTextView LJIIJ;
    public TuxTextView LJIIJJI;
    public TuxTextView LJIIL;
    public TuxTextView LJIILIIL;
    public C184S LJIILJJIL;
    public C184U LJIILL;
    public boolean LJIILLIIL;
    public final C19LU LJIIZILJ;
    public final C19LV LJIJ;

    @Override // X.C187Z
    public final InterfaceC212322187c LJIIJJI() {
        return new C184Q() { // from class: X.184P
            @Override // X.C184Q
            public final boolean LJI(TuxTextView tuxTextView, TuxTextView tuxTextView2, Integer num, Integer num2) {
                return false;
            }

            @Override // X.C184Q
            public final boolean LJIIIZ(TuxTextView tuxTextView, TuxTextView tuxTextView2, boolean z) {
                return false;
            }

            @Override // X.C184Q
            public final void LJIILIIL(C184U c184u) {
            }

            @Override // X.C184Q
            public final void LJIILJJIL(TuxTextView tuxTextView, C186Y c186y, String str, DiscountTag discountTag) {
            }

            @Override // X.C184Q
            public final void LJIIJ(TuxTextView tuxTextView, String str, DiscountTag discountTag) {
                tuxTextView.setText(str);
            }

            @Override // X.C184Q
            public final void LJIIJJI(TuxTextView tuxTextView, String str, String str2, C212225183j c212225183j, Context context) {
                tuxTextView.setText(str2);
            }
        };
    }

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
    public final TuxTextView LJIILL() {
        TuxTextView tuxTextView = this.LJIIL;
        if (tuxTextView != null) {
            return tuxTextView;
        }
        TuxTextView tuxTextViewLIZ = this.LJIIIZ.LIZ(this.LIZ);
        if (tuxTextViewLIZ == null) {
            return null;
        }
        this.LJIIL = tuxTextViewLIZ;
        return tuxTextViewLIZ;
    }

    public final boolean LJIIZILJ() {
        TuxTextView tuxTextView = this.LJIIJ;
        return tuxTextView != null && tuxTextView.getVisibility() == 0;
    }

    public static final InterfaceC212322187c LJIILLIIL(Object obj) {
        final C186W c186w = (C186W) obj;
        return new C184Q(c186w) { // from class: X.186P
            public final C186W LIZ;
            public boolean LIZIZ;
            public C184U LIZJ;

            {
                this.LIZ = c186w;
            }

            @Override // X.C184Q
            public final void LJIILIIL(C184U c184u) {
                this.LIZJ = c184u;
                List<String> list = c184u.LJIIIZ;
                if (list != null) {
                    this.LIZ.LIZJ(list);
                }
            }

            /* JADX WARN: Removed duplicated region for block: B:26:0x0039  */
            @Override // X.C184Q
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final boolean LJIIIZ(com.bytedance.tux.input.TuxTextView r4, com.bytedance.tux.input.TuxTextView r5, boolean r6) {
                /*
                    r3 = this;
                    X.184U r0 = r3.LIZJ
                    if (r0 == 0) goto L1b
                    com.ss.android.ugc.aweme.ecommercebase.promotion.data.style.PriceTextConfig r0 = r0.LIZLLL
                    if (r0 == 0) goto L1b
                    com.ss.android.ugc.aweme.ecommercebase.promotion.data.style.LabelColor r0 = r0.color
                    if (r0 == 0) goto L1b
                    java.lang.Integer r0 = r0.LIZ()
                    if (r0 == 0) goto L1b
                    int r0 = r0.intValue()
                    if (r4 == 0) goto L1b
                    r4.setTextColor(r0)
                L1b:
                    if (r6 == 0) goto L8f
                    X.184U r0 = r3.LIZJ
                    if (r0 == 0) goto L96
                    com.ss.android.ugc.aweme.ecommercebase.promotion.data.style.DiscountTag r2 = r0.LJI
                L23:
                    if (r2 == 0) goto L3c
                    com.ss.android.ugc.aweme.ecommercebase.promotion.data.style.PriceTextConfig r0 = r2.text
                    if (r0 == 0) goto L3c
                    com.ss.android.ugc.aweme.ecommercebase.promotion.data.style.LabelColor r0 = r0.color
                    if (r0 == 0) goto L3c
                    java.lang.Integer r0 = r0.LIZ()
                    if (r0 == 0) goto L3c
                    int r0 = r0.intValue()
                    if (r5 == 0) goto L3c
                    r5.setTextColor(r0)
                L3c:
                    boolean r1 = r3.LIZIZ
                    r0 = 0
                    if (r1 == 0) goto L98
                    r3.LIZIZ = r0
                    if (r4 == 0) goto L5b
                    X.184U r0 = r3.LIZJ
                    if (r0 == 0) goto L88
                    com.ss.android.ugc.aweme.ecommercebase.promotion.data.style.PriceTextConfig r0 = r0.LIZLLL
                    if (r0 == 0) goto L88
                    int r1 = r0.font
                    X.0cEQ r0 = X.InterfaceC1003930cER.LJIILIIL
                    r0.getClass()
                    int r0 = X.C1003920cEQ.LIZ(r1)
                L58:
                    r4.setTuxFont(r0)
                L5b:
                    if (r2 == 0) goto L7d
                    com.ss.android.ugc.aweme.ecommercebase.promotion.data.style.PriceTextConfig r0 = r2.text
                    if (r0 == 0) goto L7d
                    int r1 = r0.font
                    X.0cEQ r0 = X.InterfaceC1003930cER.LJIILIIL
                    r0.getClass()
                    int r0 = X.C1003920cEQ.LIZ(r1)
                    java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                L70:
                    if (r0 == 0) goto L7b
                    int r0 = r0.intValue()
                    if (r5 == 0) goto L7b
                    r5.setTuxFont(r0)
                L7b:
                    r0 = 1
                    return r0
                L7d:
                    X.186W r0 = r3.LIZ
                    X.186Y r0 = r0.LJIILL()
                    java.lang.Integer r0 = r0.LJI()
                    goto L70
                L88:
                    X.186W r0 = r3.LIZ
                    int r0 = r0.LJII()
                    goto L58
                L8f:
                    X.184U r0 = r3.LIZJ
                    if (r0 == 0) goto L96
                    com.ss.android.ugc.aweme.ecommercebase.promotion.data.style.DiscountTag r2 = r0.LJFF
                    goto L23
                L96:
                    r2 = 0
                    goto L3c
                L98:
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C186P.LJIIIZ(com.bytedance.tux.input.TuxTextView, com.bytedance.tux.input.TuxTextView, boolean):boolean");
            }

            @Override // X.C184Q
            public final void LJIIJ(TuxTextView tuxTextView, String str, DiscountTag discountTag) {
                LJIILL(this.LIZ.LJIILL().LJ(), tuxTextView, str, discountTag);
            }

            public static void LJIILL(EnumC19354910nr enumC19354910nr, TuxTextView tuxTextView, String str, DiscountTag discountTag) {
                StringBuilder sbLIZ;
                if (enumC19354910nr != EnumC19354910nr.NONE) {
                    if (discountTag != null) {
                        Boolean bool = discountTag.useBrackets;
                        Boolean bool2 = Boolean.TRUE;
                        if (Intrinsics.LJFF(bool, bool2)) {
                            if (Intrinsics.LJFF(discountTag.useMinusPrefix, bool2)) {
                                sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append("(-");
                            } else {
                                sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append('(');
                            }
                            sbLIZ.append(str);
                            sbLIZ.append(')');
                            str = C2188811AlT.LIZIZ(sbLIZ);
                        } else if (Intrinsics.LJFF(discountTag.useMinusPrefix, bool2)) {
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append('-');
                            sbLIZ2.append(str);
                            str = C2188811AlT.LIZIZ(sbLIZ2);
                        }
                        tuxTextView.setText(str);
                        return;
                    }
                    if (enumC19354910nr != EnumC19354910nr.COLOR_BG_WITHOUT_BRACKETS) {
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append('(');
                        sbLIZ3.append(str);
                        sbLIZ3.append(')');
                        str = C2188811AlT.LIZIZ(sbLIZ3);
                    }
                    tuxTextView.setText(str);
                    return;
                }
                C786410Ut5.LLLLZLL(tuxTextView, 8);
            }

            @Override // X.C184Q
            public final boolean LJI(TuxTextView tuxTextView, TuxTextView tuxTextView2, Integer num, Integer num2) {
                if ((this.LIZ.LIZIZ() != EnumC1990507qx.V2 && this.LIZ.LIZIZ() != EnumC1990507qx.V3 && this.LIZ.LIZIZ() != EnumC1990507qx.V5) || (((tuxTextView == null || tuxTextView.getVisibility() != 0 || tuxTextView.getWidth() > 0) && (tuxTextView2 == null || tuxTextView2.getVisibility() != 0 || tuxTextView2.getWidth() > 0)) || this.LIZIZ)) {
                    return false;
                }
                this.LIZIZ = true;
                if (num != null) {
                    if (tuxTextView != null) {
                        tuxTextView.setTuxFont(num.intValue());
                    }
                } else if (tuxTextView != null) {
                    tuxTextView.LJJJJI(10.0f);
                }
                if (num2 != null) {
                    if (tuxTextView2 != null) {
                        tuxTextView2.setTuxFont(num2.intValue());
                    }
                } else if (tuxTextView2 != null) {
                    tuxTextView2.LJJJJI(10.0f);
                    return true;
                }
                return true;
            }

            /* JADX WARN: Removed duplicated region for block: B:26:0x0091  */
            /* JADX WARN: Removed duplicated region for block: B:37:0x00b5  */
            /* JADX WARN: Removed duplicated region for block: B:39:0x00bd  */
            /* JADX WARN: Removed duplicated region for block: B:41:0x00c3  */
            /* JADX WARN: Removed duplicated region for block: B:54:? A[RETURN, SYNTHETIC] */
            @Override // X.C184Q
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void LJIILJJIL(com.bytedance.tux.input.TuxTextView r12, X.C186Y r13, java.lang.String r14, com.ss.android.ugc.aweme.ecommercebase.promotion.data.style.DiscountTag r15) {
                /*
                    Method dump skipped, instruction units count: 306
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C186P.LJIILJJIL(com.bytedance.tux.input.TuxTextView, X.186Y, java.lang.String, com.ss.android.ugc.aweme.ecommercebase.promotion.data.style.DiscountTag):void");
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:144:0x0226 A[PHI: r2 r16
              0x0226: PHI (r2v8 java.lang.Integer) = (r2v6 java.lang.Integer), (r2v11 java.lang.Integer) binds: [B:150:0x024d, B:143:0x0224] A[DONT_GENERATE, DONT_INLINE]
              0x0226: PHI (r16v3 int) = (r16v1 int), (r16v4 int) binds: [B:150:0x024d, B:143:0x0224] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Removed duplicated region for block: B:147:0x0236  */
            /* JADX WARN: Removed duplicated region for block: B:152:0x0252  */
            /* JADX WARN: Removed duplicated region for block: B:15:0x0044 A[PHI: r2 r10
              0x0044: PHI (r2v26 java.lang.Integer) = (r2v21 java.lang.Integer), (r2v29 java.lang.Integer) binds: [B:155:0x0265, B:14:0x0042] A[DONT_GENERATE, DONT_INLINE]
              0x0044: PHI (r10v23 int) = (r10v21 int), (r10v24 int) binds: [B:155:0x0265, B:14:0x0042] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Removed duplicated region for block: B:18:0x0055  */
            /* JADX WARN: Removed duplicated region for block: B:38:0x008e A[PHI: r6 r10
              0x008e: PHI (r6v49 java.lang.Integer) = (r6v47 java.lang.Integer), (r6v53 java.lang.Integer) binds: [B:137:0x020a, B:37:0x008c] A[DONT_GENERATE, DONT_INLINE]
              0x008e: PHI (r10v18 int) = (r10v16 int), (r10v19 int) binds: [B:137:0x020a, B:37:0x008c] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Removed duplicated region for block: B:41:0x009a  */
            /* JADX WARN: Removed duplicated region for block: B:56:0x00c8 A[PHI: r6 r10
              0x00c8: PHI (r6v37 java.lang.Integer) = (r6v35 java.lang.Integer), (r6v41 java.lang.Integer) binds: [B:133:0x01f5, B:55:0x00c6] A[DONT_GENERATE, DONT_INLINE]
              0x00c8: PHI (r10v13 int) = (r10v11 int), (r10v14 int) binds: [B:133:0x01f5, B:55:0x00c6] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Removed duplicated region for block: B:59:0x00d4  */
            /* JADX WARN: Removed duplicated region for block: B:74:0x0102 A[PHI: r6 r10
              0x0102: PHI (r6v25 java.lang.Integer) = (r6v23 java.lang.Integer), (r6v29 java.lang.Integer) binds: [B:129:0x01e0, B:73:0x0100] A[DONT_GENERATE, DONT_INLINE]
              0x0102: PHI (r10v8 int) = (r10v6 int), (r10v9 int) binds: [B:129:0x01e0, B:73:0x0100] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Removed duplicated region for block: B:77:0x010e  */
            @Override // X.C184Q
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void LJIIJJI(com.bytedance.tux.input.TuxTextView r22, java.lang.String r23, java.lang.String r24, X.C212225183j r25, android.content.Context r26) {
                /*
                    Method dump skipped, instruction units count: 666
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C186P.LJIIJJI(com.bytedance.tux.input.TuxTextView, java.lang.String, java.lang.String, X.183j, android.content.Context):void");
            }
        };
    }

    public final void LJIJ(boolean z) {
        TuxTextView tuxTextView;
        CharSequence text;
        C426160GnO c426160GnO;
        C426160GnO c426160GnO2;
        C426160GnO c426160GnO3;
        int i;
        int i2;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        ViewGroup.MarginLayoutParams marginLayoutParams2;
        if ((z || this.LJIILLIIL) && (tuxTextView = this.LJII) != null && tuxTextView.getVisibility() == 0 && (text = this.LJII.getText()) != null && text.length() != 0) {
            this.LJIILLIIL = false;
            float fMeasureText = this.LJII.getPaint().measureText(this.LJII.getText().toString()) - this.LJII.getMeasuredWidth();
            if (fMeasureText > 0.0f) {
                T t = this.LIZ;
                if ((t instanceof C426160GnO) && (c426160GnO3 = (C426160GnO) t) != null) {
                    int childCount = c426160GnO3.getChildCount();
                    int i3 = 0;
                    int i4 = 0;
                    int i5 = 0;
                    for (Object obj : C13LP.LJLJJLL(C09RB.LJJII(new C09RD(c426160GnO3)))) {
                        int i6 = i4 + 1;
                        if (i4 >= 0) {
                            View view = (View) obj;
                            if (i4 < childCount - 1) {
                                if (view.getMeasuredWidth() != 0 && view.getVisibility() != 8) {
                                    if (i5 < fMeasureText) {
                                        int measuredWidth = view.getMeasuredWidth();
                                        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                                        if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
                                            i = marginLayoutParams2.leftMargin;
                                        } else {
                                            i = 0;
                                        }
                                        int i7 = measuredWidth + i;
                                        ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
                                        if ((layoutParams2 instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2) != null) {
                                            i2 = marginLayoutParams.rightMargin;
                                        } else {
                                            i2 = 0;
                                        }
                                        i5 += i7 + i2;
                                        i3++;
                                    }
                                } else {
                                    i3++;
                                }
                            }
                            i4 = i6;
                        } else {
                            C1697810uHb.LJIJI();
                            throw null;
                        }
                    }
                    if (i3 > 0) {
                        c426160GnO3.setMaxTagCount(childCount - i3);
                        return;
                    } else {
                        c426160GnO3.setMaxTagCount(-1);
                        return;
                    }
                }
                return;
            }
            T t2 = this.LIZ;
            if ((t2 instanceof C426160GnO) && (c426160GnO = (C426160GnO) t2) != null && c426160GnO.getMaxTagCount() > 0) {
                this.LJIILLIIL = true;
                T t3 = this.LIZ;
                if ((t3 instanceof C426160GnO) && (c426160GnO2 = (C426160GnO) t3) != null) {
                    c426160GnO2.setMaxTagCount(-1);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x0186 A[PHI: r1
      0x0186: PHI (r1v7 com.bytedance.tux.input.TuxTextView) = (r1v6 com.bytedance.tux.input.TuxTextView), (r1v9 com.bytedance.tux.input.TuxTextView) binds: [B:102:0x0178, B:104:0x0184] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00d7  */
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
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIJI(X.C184S r10) {
        /*
            Method dump skipped, instruction units count: 455
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C184R.LJIJI(X.184S):void");
    }

    public final void LJIJJLI(String str) {
        if (C703302op.LIZ(str) && !LJIIZILJ()) {
            TuxTextView tuxTextView = this.LJIIIIZZ;
            if (tuxTextView != null) {
                C786410Ut5.LLLLZLL(tuxTextView, 0);
                tuxTextView.setText(str);
                return;
            }
            return;
        }
        TuxTextView tuxTextView2 = this.LJIIIIZZ;
        if (tuxTextView2 == null) {
            return;
        }
        C786410Ut5.LLLLZLL(tuxTextView2, 8);
    }

    public final void LJJ(String str) {
        if (C703302op.LIZ(str) && !LJIIZILJ()) {
            TuxTextView tuxTextView = this.LJII;
            if (tuxTextView != null) {
                C786410Ut5.LLLLZLL(tuxTextView, 0);
                tuxTextView.setText(str);
                return;
            }
            return;
        }
        TuxTextView tuxTextView2 = this.LJII;
        if (tuxTextView2 == null) {
            return;
        }
        C786410Ut5.LLLLZLL(tuxTextView2, 8);
    }

    public final void LJJI(String str) {
        if (C703302op.LIZ(str) && !LJIIZILJ()) {
            TuxTextView tuxTextViewLJIILL = LJIILL();
            if (tuxTextViewLJIILL != null) {
                tuxTextViewLJIILL.setText(str);
                C786410Ut5.LLLLZLL(tuxTextViewLJIILL, 0);
                return;
            }
            return;
        }
        TuxTextView tuxTextView = this.LJIIL;
        if (tuxTextView == null) {
            return;
        }
        C786410Ut5.LLLLZLL(tuxTextView, 8);
    }

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
    public final void LJJIFFI(String str) {
        C184S c184s = this.LJIILJJIL;
        if (c184s != null && C703302op.LIZ(str)) {
            TuxTextView tuxTextViewLIZIZ = this.LJIIJJI;
            if (tuxTextViewLIZIZ == null) {
                tuxTextViewLIZIZ = this.LJIIIZ.LIZIZ(this.LIZ);
                this.LJIIJJI = tuxTextViewLIZIZ;
                if (tuxTextViewLIZIZ == null) {
                    return;
                }
            }
            LJIIL().LJIIJJI(tuxTextViewLIZIZ, c184s.LIZJ, str, c184s.LJ, tuxTextViewLIZIZ.getContext());
            C786410Ut5.LLLLZLL(tuxTextViewLIZIZ, 0);
        }
    }

    public static void LJIJJ(TuxTextView tuxTextView, float f) {
        if (tuxTextView != null) {
            C786410Ut5.T4(tuxTextView, f);
        }
    }

    public final void LJIILIIL(C186Y c186y, DiscountTag discountTag) {
        String str;
        C184Q c184qLJIIL = LJIIL();
        TuxTextView tuxTextView = this.LJIILIIL;
        C184S c184s = this.LJIILJJIL;
        if (c184s != null) {
            str = c184s.LIZLLL;
        } else {
            str = null;
        }
        c184qLJIIL.LJIILJJIL(tuxTextView, c186y, str, discountTag);
    }

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
    public final void LJIL(String str, DiscountTag discountTag) {
        if (C703302op.LIZ(str) && !LJIIZILJ()) {
            TuxTextView tuxTextViewLIZJ = this.LJIILIIL;
            if (tuxTextViewLIZJ == null) {
                tuxTextViewLIZJ = this.LJIIIZ.LIZJ(this.LIZ);
                this.LJIILIIL = tuxTextViewLIZJ;
                if (tuxTextViewLIZJ == null) {
                    return;
                }
            }
            C786410Ut5.LLLLZLL(tuxTextViewLIZJ, 0);
            LJIIL().LJIIJ(tuxTextViewLIZJ, str, discountTag);
            return;
        }
        TuxTextView tuxTextView = this.LJIILIIL;
        if (tuxTextView == null) {
            return;
        }
        C786410Ut5.LLLLZLL(tuxTextView, 8);
    }

    public C184R(ViewGroup viewGroup, TuxTextView tuxTextView, TuxTextView tuxTextView2, C184T c184t) {
        super(viewGroup, "price_layout");
        this.LJII = tuxTextView;
        this.LJIIIIZZ = tuxTextView2;
        this.LJIIIZ = c184t;
        this.LJIILLIIL = true;
        this.LJIIZILJ = new C19LU(this, viewGroup, 2);
        this.LJIJ = new C19LV(this, 6);
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:139:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00de A[PHI: r9
      0x00de: PHI (r9v3 com.bytedance.tux.input.TuxTextView) = (r9v2 com.bytedance.tux.input.TuxTextView), (r9v4 com.bytedance.tux.input.TuxTextView) binds: [B:40:0x00d0, B:42:0x00dc] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01bd  */
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
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIILJJIL(java.util.List r17, long r18, long r20, java.lang.String r22, java.lang.String r23, java.lang.String r24, java.lang.String r25, X.C19346010mQ r26, com.ss.android.ugc.aweme.ecommercebase.promotion.data.style.DiscountTag r27) {
        /*
            Method dump skipped, instruction units count: 619
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C184R.LJIILJJIL(java.util.List, long, long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, X.10mQ, com.ss.android.ugc.aweme.ecommercebase.promotion.data.style.DiscountTag):void");
    }
}
