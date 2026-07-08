package X;

import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS576S0100000_32;

/* JADX INFO: renamed from: X.0HGG, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0HGG extends AbstractC435550H6b {
    public final Context LJIILIIL;
    public final FragmentManager LJIILJJIL;
    public final EnumC441640HTm LJIILL;
    public final Function0<Boolean> LJIILLIIL;
    public final String LJIIZILJ;
    public final C0H7H LJIJ;
    public final Integer LJIJI;
    public final int LJIJJ;
    public final int LJIJJLI;
    public final C0HGY LJIL;
    public final C0H7H LJJ;
    public final boolean LJJI;
    public C21369118jx LJJIFFI;

    @Override // X.C0H6M
    public final /* bridge */ /* synthetic */ String LIZIZ() {
        return null;
    }

    @Override // X.C0H6M
    public final boolean LIZ() {
        return this.LJJI;
    }

    @Override // X.C0H6M
    public final Integer LIZJ() {
        return this.LJIJI;
    }

    @Override // X.C0H6M
    public final C0H7H LIZLLL() {
        return this.LJJ;
    }

    @Override // X.C0H6M
    public final C0HGY LJ() {
        return this.LJIL;
    }

    @Override // X.AbstractC435550H6b
    public final int LJIIJJI() {
        return this.LJIJJLI;
    }

    @Override // X.AbstractC435550H6b, X.C0H6M
    public final void LJII(Canvas canvas) {
        if (C440480HPa.LIZJ()) {
            int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.LIZ - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24)), 1073741824);
            int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(this.LIZIZ - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24)), 1073741824);
            C21369118jx c21369118jx = this.LJJIFFI;
            if (c21369118jx != null) {
                c21369118jx.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                c21369118jx.layout(0, 0, c21369118jx.getMeasuredWidth(), c21369118jx.getMeasuredHeight());
                int iSave = canvas.save();
                try {
                    canvas.translate(C418440Gaw.LIZIZ(12), C418440Gaw.LIZIZ(12));
                    c21369118jx.draw(canvas);
                    canvas.restoreToCount(iSave);
                    return;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    canvas.restoreToCount(iSave);
                    throw th;
                }
            }
            return;
        }
        super.LJII(canvas);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x007d  */
    @Override // X.C0H6M
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIIJ(X.InterfaceC1364105Vn<? super kotlin.Pair<X.C0HOC, ? extends X.EnumC440340HOm>> r13) {
        /*
            r12 = this;
            boolean r0 = r13 instanceof X.C0HGH
            if (r0 == 0) goto L7d
            r10 = r13
            X.0HGH r10 = (X.C0HGH) r10
            int r2 = r10.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L7d
            int r2 = r2 - r1
            r10.LLILLL = r2
        L12:
            java.lang.Object r3 = r10.LL
            java.lang.Object r2 = X.C099R.LJFF()
            int r0 = r10.LLILLL
            r1 = 1
            if (r0 == 0) goto L58
            if (r0 != r1) goto L89
            X.C155000ia.LIZIZ(r3)
        L22:
            X.0HZe r3 = (X.C443120HZe) r3
            r6 = 0
            if (r3 == 0) goto L83
            java.lang.Object r1 = r3.getFirst()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r5 = r3.getSecond()
            X.0H7H r5 = (X.C0H7H) r5
            java.lang.Object r0 = r3.getThird()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r4 = r0.booleanValue()
            X.0HOC r3 = new X.0HOC
            X.0HGK r2 = new X.0HGK
            r2.<init>(r1)
            if (r5 != 0) goto L48
            X.0H7H r5 = X.C0H7H.TEXT_PROMPT
        L48:
            java.lang.Integer r1 = r12.LJIJI
            r0 = 0
            r3.<init>(r2, r5, r1, r0)
            if (r4 == 0) goto L52
            X.0HOm r6 = X.EnumC440340HOm.TEXT_INPUT
        L52:
            kotlin.Pair r0 = new kotlin.Pair
            r0.<init>(r3, r6)
            return r0
        L58:
            X.C155000ia.LIZIZ(r3)
            androidx.fragment.app.FragmentManager r3 = r12.LJIILJJIL
            X.0HTm r4 = r12.LJIILL
            kotlin.jvm.functions.Function0<java.lang.Boolean> r0 = r12.LJIILLIIL
            java.lang.Object r0 = r0.invoke()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r5 = r0.booleanValue()
            java.lang.String r6 = r12.LJIIZILJ
            X.0H7H r7 = r12.LJIJ
            r8 = 0
            int r9 = r12.LJIJJ
            r11 = 32
            r10.LLILLL = r1
            java.lang.Object r3 = X.C0HI6.LIZ(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            if (r3 != r2) goto L22
            return r2
        L7d:
            X.0HGH r10 = new X.0HGH
            r10.<init>(r12, r13)
            goto L12
        L83:
            kotlin.Pair r0 = new kotlin.Pair
            r0.<init>(r6, r6)
            return r0
        L89:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0HGG.LJIIJ(X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [X.18jx, android.widget.TextView, com.bytedance.tux.input.TuxTextView] */
    @Override // X.AbstractC435550H6b, X.C0H6M
    public final void LJIIIIZZ(int i, int i2) {
        super.LJIIIIZZ(i, i2);
        if (C440480HPa.LIZJ()) {
            final Context context = this.LJIILIIL;
            ?? r2 = new TuxTextView(context) { // from class: X.18jx
                public final C01GW LLJJJJ = C452501pT.LIZIZ(new AwS576S0100000_32(this, 507));

                private final C21369818k4 getActualAutoSizeHelper() {
                    return (C21369818k4) this.LLJJJJ.getValue();
                }

                public final void LJJJJJ(int i3, int i4) {
                    C21369818k4 actualAutoSizeHelper = getActualAutoSizeHelper();
                    actualAutoSizeHelper.getClass();
                    if (i3 > 0) {
                        if (i4 > i3) {
                            actualAutoSizeHelper.LIZJ = i3;
                            actualAutoSizeHelper.LIZLLL = i4;
                            int i5 = 1;
                            while (true) {
                                i3++;
                                if (i3 > actualAutoSizeHelper.LIZLLL) {
                                    break;
                                } else {
                                    i5++;
                                }
                            }
                            int[] iArr = new int[i5];
                            int i6 = actualAutoSizeHelper.LIZJ;
                            for (int i7 = 0; i7 < i5; i7++) {
                                iArr[i7] = i6;
                                i6++;
                            }
                            actualAutoSizeHelper.LJFF = iArr;
                            actualAutoSizeHelper.LIZIZ = true;
                            actualAutoSizeHelper.LIZ(1);
                            return;
                        }
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("Maximum auto-size text size ( ");
                        sbLIZ.append(i4);
                        sbLIZ.append(" px) is less or equal to minimum auto-size text size ( ");
                        sbLIZ.append(i3);
                        sbLIZ.append(" px)");
                        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                        strLIZIZ.toString();
                        throw new IllegalArgumentException(strLIZIZ);
                    }
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("Minimum auto-size text size ( ");
                    sbLIZ2.append(i3);
                    sbLIZ2.append(" px) is less or equal to (0px)");
                    String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
                    strLIZIZ2.toString();
                    throw new IllegalArgumentException(strLIZIZ2);
                }

                @Override // com.bytedance.tux.input.TuxTextView, androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
                public final void onLayout(boolean z, int i3, int i4, int i5, int i6) {
                    super.onLayout(z, i3, i4, i5, i6);
                    getActualAutoSizeHelper().LIZ(3);
                }
            };
            r2.setText(this.LJIIZILJ);
            r2.setTuxFont(23);
            r2.setTextColorRes(R.attr.a1h);
            r2.LJJJJJ(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20)));
            r2.setMaxLines(4);
            r2.setEllipsize(TextUtils.TruncateAt.END);
            r2.setGravity(17);
            this.LJJIFFI = r2;
        }
    }

    public C0HGG(Context context, FragmentManager fragmentManager, EnumC441640HTm enumC441640HTm, Function0<Boolean> function0, String str, C0H7H c0h7h, Integer num, int i, C435590H6f c435590H6f) {
        super(context);
        this.LJIILIIL = context;
        this.LJIILJJIL = fragmentManager;
        this.LJIILL = enumC441640HTm;
        this.LJIILLIIL = function0;
        this.LJIIZILJ = str;
        this.LJIJ = c0h7h;
        this.LJIJI = num;
        this.LJIJJ = i;
        this.LJIJJLI = R.raw.icon_pen_star_fill;
        this.LJIL = C0HGY.TEXT;
        this.LJJ = c0h7h == null ? C0H7H.TEXT_PROMPT : c0h7h;
        this.LJJI = c435590H6f.LIZ;
    }
}
