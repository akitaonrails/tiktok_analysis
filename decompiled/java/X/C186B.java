package X;

import Y.ARunnableS95S0200000_26;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommercebase.promotion.data.PromotionSticker;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.AwS398S0200000_32;
import kotlin.jvm.internal.AwS433S0200000_32;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.186B, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C186B<T extends ViewGroup> extends AbstractC212320187a<T, Object, InterfaceC428490Gr9, C186C> implements InterfaceC212261184t {
    public static int LJIILIIL;
    public final C186D<T> LJI;
    public final C01GW LJII;
    public final C01GW LJIIIIZZ;
    public TuxTextView LJIIIZ;
    public TuxTextView LJIIJ;
    public final C01GW LJIIJJI;
    public final C01GW LJIIL;

    @Override // X.AbstractC212320187a
    public final InterfaceC212321187b LJIIJ() {
        return new C186C() { // from class: X.0GrI
            public AnonymousClass0956 LIZ;

            @Override // X.C186C
            public final void LJ(TuxTextView tuxTextView, Context context, boolean z) {
            }

            @Override // X.C186C
            public final void LJII(ViewGroup viewGroup) {
            }

            @Override // X.C186C
            public final void LIZJ() {
                AnonymousClass0956 anonymousClass0956 = this.LIZ;
                if (anonymousClass0956 != null) {
                    anonymousClass0956.LIZIZ(null);
                }
            }

            @Override // X.C186C
            public final C1331670kl3 LJFF(Context context, String str) {
                C1326790kdB.LIZ.getClass();
                return C1326790kdB.LIZLLL(str);
            }

            @Override // X.C186C
            public final void LIZLLL(C0H0C c0h0c, List<PromotionSticker> list, Integer num) {
                this.LIZ = C428570GrH.LIZ(C2296808zG.LIZ(C2108208Ns.LIZ), c0h0c, list, 12, num, false, 64);
            }

            @Override // X.C186C
            public final void LIZIZ(int i, Context context, TuxTextView tuxTextView, boolean z) {
                String strValueOf;
                if (z) {
                    strValueOf = C786410Ut5.k4(Locale.US, "%02d", Arrays.copyOf(new Object[]{Integer.valueOf(i)}, 1));
                } else {
                    strValueOf = String.valueOf(i);
                }
                tuxTextView.setText(strValueOf);
                tuxTextView.setPadding(tuxTextView.getResources().getDimensionPixelSize(R.dimen.ug), tuxTextView.getResources().getDimensionPixelSize(R.dimen.tw), tuxTextView.getResources().getDimensionPixelSize(R.dimen.ug), tuxTextView.getResources().getDimensionPixelSize(R.dimen.tw));
            }
        };
    }

    @Override // X.InterfaceC212261184t
    public final void destroy() {
        LJIIL().LIZJ();
    }

    @Override // X.AbstractC212320187a
    public final InterfaceC212321187b LJIIJJI(InterfaceC428490Gr9 interfaceC428490Gr9) {
        final InterfaceC428490Gr9 interfaceC428490Gr92 = interfaceC428490Gr9;
        return new C186C(interfaceC428490Gr92) { // from class: X.0GrB
            public final InterfaceC428490Gr9 LIZ;

            @Override // X.C186C
            public final void LIZJ() {
            }

            {
                this.LIZ = interfaceC428490Gr92;
            }

            @Override // X.C186C
            public final void LJII(ViewGroup viewGroup) {
                int iIntValue;
                ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
                layoutParams.width = this.LIZ.LJIIIIZZ();
                layoutParams.height = this.LIZ.LJIIIIZZ();
                C786410Ut5.X5(layoutParams, viewGroup);
                Integer numLIZIZ = this.LIZ.LIZIZ();
                int iIntValue2 = 0;
                if (numLIZIZ != null) {
                    iIntValue = numLIZIZ.intValue();
                } else {
                    iIntValue = 0;
                }
                C0H9H.LJFF(iIntValue, viewGroup);
                Integer marginTop = this.LIZ.getMarginTop();
                if (marginTop != null) {
                    iIntValue2 = marginTop.intValue();
                }
                C0H9H.LJI(iIntValue2, viewGroup);
            }

            @Override // X.C186C
            public final C1331670kl3 LJFF(Context context, String str) {
                C1331730kl9 c1331730kl9;
                C1326790kdB.LIZ.getClass();
                C1331670kl3 c1331670kl3LIZLLL = C1326790kdB.LIZLLL(str);
                Integer numLIZJ = C1308910kAL.LIZJ(this.LIZ.LJIIJJI(), context);
                if (numLIZJ != null) {
                    int iIntValue = numLIZJ.intValue();
                    C1331750klB c1331750klB = new C1331750klB();
                    c1331750klB.LJ = this.LIZ.LIZ();
                    float fLJFF = this.LIZ.LJFF();
                    c1331750klB.LIZJ = iIntValue;
                    c1331750klB.LIZIZ = fLJFF;
                    c1331750klB.LJFF = this.LIZ.LJFF();
                    c1331730kl9 = new C1331730kl9(c1331750klB);
                } else {
                    c1331730kl9 = null;
                }
                c1331670kl3LIZLLL.LJJI = c1331730kl9;
                return c1331670kl3LIZLLL;
            }

            @Override // X.C186C
            public final void LIZLLL(C0H0C c0h0c, List<PromotionSticker> list, Integer num) {
                C054G c054gLIZ = C2296808zG.LIZ(C2108208Ns.LIZ);
                this.LIZ.LIZ();
                C428570GrH.LIZ(c054gLIZ, c0h0c, list, 12, num, false, 64);
            }

            @Override // X.C186C
            public final void LJ(TuxTextView tuxTextView, Context context, boolean z) {
                float fLIZLLL;
                InterfaceC428490Gr9 interfaceC428490Gr93 = this.LIZ;
                if (z) {
                    fLIZLLL = 0.0f;
                } else {
                    fLIZLLL = interfaceC428490Gr93.LIZLLL();
                }
                C384050F3z c384050F3z = new C384050F3z();
                c384050F3z.LIZIZ = Integer.valueOf(this.LIZ.LJI());
                c384050F3z.LJIIJJI = Float.valueOf(fLIZLLL);
                c384050F3z.LJIIIIZZ = Float.valueOf(this.LIZ.LIZLLL());
                tuxTextView.setBackground(c384050F3z.LIZ(context));
            }

            @Override // X.C186C
            public final void LIZIZ(int i, Context context, TuxTextView tuxTextView, boolean z) {
                Integer numLJIIL;
                int iIntValue;
                if (C428520GrC.LIZ[this.LIZ.LJIIIZ().ordinal()] == 1) {
                    tuxTextView.setText(String.valueOf(i));
                    if (i < 100) {
                        numLJIIL = this.LIZ.LJIIJ();
                    } else {
                        C0H9H.LJ(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(3)), tuxTextView);
                        numLJIIL = this.LIZ.LJIIL();
                    }
                    ViewGroup.LayoutParams layoutParams = tuxTextView.getLayoutParams();
                    if (numLJIIL != null) {
                        iIntValue = numLJIIL.intValue();
                    } else {
                        iIntValue = -2;
                    }
                    layoutParams.width = iIntValue;
                    C786410Ut5.R6(tuxTextView, layoutParams);
                    return;
                }
                tuxTextView.setText(C786410Ut5.k4(Locale.US, "%02d", Arrays.copyOf(new Object[]{Integer.valueOf(i)}, 1)));
                tuxTextView.setPadding(context.getResources().getDimensionPixelSize(R.dimen.ug), context.getResources().getDimensionPixelSize(R.dimen.tw), context.getResources().getDimensionPixelSize(R.dimen.ug), context.getResources().getDimensionPixelSize(R.dimen.tw));
            }
        };
    }

    public final void LJIILLIIL(boolean z) {
        int i;
        this.LJII.getValue();
        AppCompatImageView appCompatImageView = (AppCompatImageView) this.LJIIIIZZ.getValue();
        if (appCompatImageView != null) {
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            C786410Ut5.LLILIL(appCompatImageView, i);
        }
    }

    public final void LJIJ(boolean z) {
        int i;
        TuxTextView tuxTextView = this.LJIIIZ;
        int i2 = 8;
        if (tuxTextView != null) {
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            C786410Ut5.LLLLZLL(tuxTextView, i);
        }
        TuxTextView tuxTextView2 = this.LJIIJ;
        if (tuxTextView2 != null) {
            if (z && Intrinsics.LJFF(Boolean.TRUE, tuxTextView2.getTag())) {
                i2 = 0;
            }
            C786410Ut5.LLLLZLL(tuxTextView2, i2);
        }
    }

    public final void LJIJI(C428500GrA c428500GrA) {
        LJIILIIL(c428500GrA);
        this.LJI.LJI(c428500GrA);
        LJIIL().LJII((ViewGroup) this.LIZ);
    }

    public C186B(T t, C186D<T> c186d) {
        super(t);
        this.LJI = c186d;
        this.LJII = C452501pT.LIZIZ(new AwS433S0200000_32(this, (C186B<int>) t, 53));
        this.LJIIIIZZ = C452501pT.LIZIZ(new AwS433S0200000_32(this, (C186B<int>) t, 54));
        this.LJIIJJI = C452501pT.LIZIZ(new AwS433S0200000_32(this, (C186B<int>) t, 52));
        this.LJIIL = C452501pT.LIZIZ(new AwS433S0200000_32(this, (C186B<int>) t, 55));
    }

    public final void LJIILJJIL(List<PromotionSticker> list, Map<String, String> map) {
        LJIIL().LIZJ();
        View view = (View) this.LJIIJJI.getValue();
        if (view != null) {
            C337180DJs.LIZJ(view);
        }
        AwS398S0200000_32 awS398S0200000_32 = new AwS398S0200000_32(this, list, (List<PromotionSticker>) 76);
        int i = LJIILIIL;
        if (i > 0) {
            awS398S0200000_32.invoke(Integer.valueOf(i));
        } else {
            HandlerHook.viewPost((View) this.LJII.getValue(), new ARunnableS95S0200000_26(this, awS398S0200000_32, 26));
        }
        if (!list.isEmpty()) {
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
            Iterator<PromotionSticker> it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList.add(it2.next().daInfo);
            }
            C115500cD.LIZ(arrayList, map);
        }
    }

    public final void LJIILL(String str, AbstractC1335900krs abstractC1335900krs) {
        SmartImageView smartImageView = (SmartImageView) this.LJII.getValue();
        C1331670kl3 c1331670kl3LJFF = LJIIL().LJFF(this.LIZJ, str);
        c1331670kl3LJFF.LJJ(smartImageView);
        c1331670kl3LJFF.LJIIJ(new C19LI((C184K) abstractC1335900krs, 2));
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x004d A[PHI: r1
      0x004d: PHI (r1v4 com.bytedance.tux.input.TuxTextView) = (r1v3 com.bytedance.tux.input.TuxTextView), (r1v6 com.bytedance.tux.input.TuxTextView) binds: [B:21:0x003f, B:23:0x004b] A[DONT_GENERATE, DONT_INLINE]] */
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
    public final void LJIIZILJ(java.lang.Integer r6, java.lang.String r7, int r8, boolean r9) {
        /*
            r5 = this;
            r3 = 8
            if (r8 != 0) goto L13
            com.bytedance.tux.input.TuxTextView r0 = r5.LJIIIZ
            if (r0 == 0) goto Lb
            X.C786410Ut5.LLLLZLL(r0, r3)
        Lb:
            com.bytedance.tux.input.TuxTextView r0 = r5.LJIIJ
            if (r0 == 0) goto L12
            X.C786410Ut5.LLLLZLL(r0, r3)
        L12:
            return
        L13:
            com.bytedance.tux.input.TuxTextView r2 = r5.LJIIIZ
            if (r2 != 0) goto L21
            X.186D<T extends android.view.ViewGroup> r1 = r5.LJI
            T extends android.view.View r0 = r5.LIZ
            com.bytedance.tux.input.TuxTextView r2 = r1.LIZIZ(r0)
            r5.LJIIIZ = r2
        L21:
            r4 = 0
            if (r2 == 0) goto L34
            X.C786410Ut5.LLLLZLL(r2, r4)
            X.187b r1 = r5.LJIIL()
            X.186C r1 = (X.C186C) r1
            android.content.Context r0 = r2.getContext()
            r1.LIZIZ(r8, r0, r2, r9)
        L34:
            if (r6 == 0) goto L73
            r1 = 5
            int r0 = r6.intValue()
            if (r0 == r1) goto L73
            com.bytedance.tux.input.TuxTextView r1 = r5.LJIIJ
            if (r1 != 0) goto L4d
            X.186D<T extends android.view.ViewGroup> r1 = r5.LJI
            T extends android.view.View r0 = r5.LIZ
            com.bytedance.tux.input.TuxTextView r1 = r1.LJFF(r0)
            r5.LJIIJ = r1
            if (r1 == 0) goto L58
        L4d:
            X.C786410Ut5.LLLLZLL(r1, r4)
            r1.setText(r7)
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r1.setTag(r0)
        L58:
            com.bytedance.tux.input.TuxTextView r3 = r5.LJIIIZ
            if (r3 == 0) goto L12
            X.187b r2 = r5.LJIIL()
            X.186C r2 = (X.C186C) r2
            android.content.Context r1 = r5.LIZJ
            com.bytedance.tux.input.TuxTextView r0 = r5.LJIIJ
            if (r0 == 0) goto L6f
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L6f
            r4 = 1
        L6f:
            r2.LJ(r3, r1, r4)
            return
        L73:
            com.bytedance.tux.input.TuxTextView r1 = r5.LJIIJ
            if (r1 == 0) goto L58
            X.C786410Ut5.LLLLZLL(r1, r3)
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r1.setTag(r0)
            goto L58
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C186B.LJIIZILJ(java.lang.Integer, java.lang.String, int, boolean):void");
    }
}
