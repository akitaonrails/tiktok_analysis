package X;

import Y.AUListenerS234S0200000_32;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommercebase.promotion.data.style.DiscountTag;
import java.util.List;

/* JADX INFO: renamed from: X.1862, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class AnonymousClass1862<T extends ViewGroup> extends AbstractC212320187a<T, C185I, C186V, AnonymousClass1865> {
    public static final /* synthetic */ int LJIILJJIL = 0;
    public final AnonymousClass1867<T> LJI;
    public TuxTextView LJII;
    public TuxTextView LJIIIIZZ;
    public TuxTextView LJIIIZ;
    public TuxTextView LJIIJ;
    public C185I LJIIJJI;
    public AnonymousClass1868 LJIIL;
    public final C19LU LJIILIIL;

    @Override // X.AbstractC212320187a
    public final InterfaceC212321187b LJIIJ() {
        return new AnonymousClass1865() { // from class: X.1866
            @Override // X.AnonymousClass1865
            public final boolean LJI(TuxTextView tuxTextView, TuxTextView tuxTextView2, Integer num, Integer num2) {
                return false;
            }

            @Override // X.AnonymousClass1865
            public final boolean LJIIIZ(TuxTextView tuxTextView, TuxTextView tuxTextView2, boolean z) {
                return false;
            }

            @Override // X.AnonymousClass1865
            public final void LJIIJJI(TuxTextView tuxTextView, C186X c186x, String str, DiscountTag discountTag) {
            }

            @Override // X.AnonymousClass1865
            public final void LJIILIIL(AnonymousClass1868 anonymousClass1868) {
            }

            @Override // X.AnonymousClass1865
            public final void LJIIJ(TuxTextView tuxTextView, String str, DiscountTag discountTag) {
                tuxTextView.setText(str);
            }

            @Override // X.AnonymousClass1865
            public final void LJIIL(TuxTextView tuxTextView, String str, String str2, AnonymousClass1844 anonymousClass1844, Context context) {
                tuxTextView.setText(str2);
            }
        };
    }

    public final void LJIILJJIL() {
        TuxTextView tuxTextView;
        TuxTextView tuxTextView2 = this.LJIIIZ;
        if ((tuxTextView2 == null || tuxTextView2.getVisibility() != 0) && ((tuxTextView = this.LJIIJ) == null || tuxTextView.getVisibility() != 0)) {
            C2341109Fh.LIZ.getClass();
            C2341109Fh.LJII("origin price and discount not show");
        } else {
            this.LIZ.removeOnLayoutChangeListener(this.LJIILIIL);
            this.LIZ.addOnLayoutChangeListener(this.LJIILIIL);
        }
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
    public final TuxTextView LJIIZILJ() {
        TuxTextView tuxTextView = this.LJIIIZ;
        if (tuxTextView != null) {
            return tuxTextView;
        }
        TuxTextView tuxTextViewLIZ = this.LJI.LIZ(this.LIZ);
        if (tuxTextViewLIZ == null) {
            return null;
        }
        this.LJIIIZ = tuxTextViewLIZ;
        return tuxTextViewLIZ;
    }

    public final boolean LJIJI() {
        TuxTextView tuxTextView = this.LJII;
        return tuxTextView != null && tuxTextView.getVisibility() == 0;
    }

    public final void LJIJJ() {
        TuxTextView tuxTextView = this.LJIIJ;
        if (tuxTextView != null) {
            C786410Ut5.B5(tuxTextView, 1.0f);
        }
        TuxTextView tuxTextView2 = this.LJIIIZ;
        if (tuxTextView2 != null) {
            C786410Ut5.B5(tuxTextView2, 1.0f);
        }
    }

    @Override // X.AbstractC212320187a
    public final InterfaceC212321187b LJIIJJI(C186V c186v) {
        return new C186O(c186v);
    }

    public final Animator LJIJ(List<String> list) {
        if (list.isEmpty()) {
            return null;
        }
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, list.size() - 1);
        valueAnimatorOfInt.setDuration(500L);
        valueAnimatorOfInt.setInterpolator(new DecelerateInterpolator());
        valueAnimatorOfInt.addUpdateListener(new AUListenerS234S0200000_32(this, list, 10));
        return valueAnimatorOfInt;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00e9 A[PHI: r1
      0x00e9: PHI (r1v7 com.bytedance.tux.input.TuxTextView) = (r1v6 com.bytedance.tux.input.TuxTextView), (r1v9 com.bytedance.tux.input.TuxTextView) binds: [B:45:0x00db, B:47:0x00e7] A[DONT_GENERATE, DONT_INLINE]] */
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
    public final void LJIJJLI(X.C185I r9) {
        /*
            Method dump skipped, instruction units count: 272
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1862.LJIJJLI(X.185I):void");
    }

    public final void LJIL(AnonymousClass1868 anonymousClass1868) {
        this.LJIIL = anonymousClass1868;
        LJIIL().LJIILIIL(anonymousClass1868);
    }

    public final void LJJI(String str) {
        if (C703302op.LIZ(str) && !LJIJI()) {
            TuxTextView tuxTextViewLJIIZILJ = LJIIZILJ();
            if (tuxTextViewLJIIZILJ != null) {
                tuxTextViewLJIIZILJ.setText(str);
                C786410Ut5.LLLLZLL(tuxTextViewLJIIZILJ, 0);
                return;
            }
            return;
        }
        TuxTextView tuxTextView = this.LJIIIZ;
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
        C185I c185i = this.LJIIJJI;
        if (c185i != null && C703302op.LIZ(str)) {
            TuxTextView tuxTextViewLIZIZ = this.LJIIIIZZ;
            if (tuxTextViewLIZIZ == null) {
                tuxTextViewLIZIZ = this.LJI.LIZIZ(this.LIZ);
                this.LJIIIIZZ = tuxTextViewLIZIZ;
                if (tuxTextViewLIZIZ == null) {
                    return;
                }
            }
            LJIIL().LJIIL(tuxTextViewLIZIZ, c185i.LIZLLL, str, null, tuxTextViewLIZIZ.getContext());
            C786410Ut5.LLLLZLL(tuxTextViewLIZIZ, 0);
        }
    }

    public AnonymousClass1862(T t, AnonymousClass1867<T> anonymousClass1867) {
        super(t);
        this.LJI = anonymousClass1867;
        this.LJIILIIL = new C19LU(this, t, 1);
    }

    public final void LJIILL(C186X c186x, DiscountTag discountTag) {
        String str;
        AnonymousClass1865 anonymousClass1865LJIIL = LJIIL();
        TuxTextView tuxTextView = this.LJIIJ;
        C185I c185i = this.LJIIJJI;
        if (c185i != null) {
            str = c185i.LJ;
        } else {
            str = null;
        }
        anonymousClass1865LJIIL.LJIIJJI(tuxTextView, c186x, str, discountTag);
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
    public final void LJJ(String str, DiscountTag discountTag) {
        if (C703302op.LIZ(str) && !LJIJI()) {
            TuxTextView tuxTextViewLIZJ = this.LJIIJ;
            if (tuxTextViewLIZJ == null) {
                tuxTextViewLIZJ = this.LJI.LIZJ(this.LIZ);
                this.LJIIJ = tuxTextViewLIZJ;
                if (tuxTextViewLIZJ == null) {
                    return;
                }
            }
            C786410Ut5.LLLLZLL(tuxTextViewLIZJ, 0);
            LJIIL().LJIIJ(tuxTextViewLIZJ, str, discountTag);
            return;
        }
        TuxTextView tuxTextView = this.LJIIJ;
        if (tuxTextView == null) {
            return;
        }
        C786410Ut5.LLLLZLL(tuxTextView, 8);
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:77:? A[RETURN, SYNTHETIC] */
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
    public final void LJIILLIIL(java.util.List r22, long r23, long r25, java.lang.String r27, java.lang.String r28, X.C19345210mI r29, com.ss.android.ugc.aweme.ecommercebase.promotion.data.style.DiscountTag r30) {
        /*
            Method dump skipped, instruction units count: 347
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1862.LJIILLIIL(java.util.List, long, long, java.lang.String, java.lang.String, X.10mI, com.ss.android.ugc.aweme.ecommercebase.promotion.data.style.DiscountTag):void");
    }
}
