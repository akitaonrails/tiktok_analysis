package X;

import Y.ARunnableS98S0200000_29;
import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import com.ss.android.ugc.aweme.ecommercebase.promotion.data.PromotionSticker;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.TopBrand;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.AwS398S0200000_32;
import kotlin.jvm.internal.AwS433S0200000_32;
import kotlin.jvm.internal.AwS576S0100000_32;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.186F, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C186F<T extends ViewGroup> extends C187Z<T, Object, InterfaceC428630GrN, C186E> implements C182C {
    public static int LJIILJJIL;
    public final C186H<T> LJII;
    public final C01GW LJIIIIZZ;
    public final C01GW LJIIIZ;
    public TuxTextView LJIIJ;
    public TuxTextView LJIIJJI;
    public final C01GW LJIIL;
    public final C01GW LJIILIIL;

    @Override // X.C187Z
    public final InterfaceC212322187c LJIIJJI() {
        return new C186E() { // from class: X.0GrJ
            public AnonymousClass0956 LIZ;

            @Override // X.C186E
            public final void LJ(TuxTextView tuxTextView, Context context, boolean z) {
            }

            @Override // X.C186E
            public final void LJII(ViewGroup viewGroup) {
            }

            @Override // X.C186E
            public final void LIZJ() {
                AnonymousClass0956 anonymousClass0956 = this.LIZ;
                if (anonymousClass0956 != null) {
                    anonymousClass0956.LIZIZ(null);
                }
            }

            @Override // X.C186E
            public final C1331670kl3 LJFF(Context context, String str) {
                C1326790kdB.LIZ.getClass();
                return C1326790kdB.LIZLLL(str);
            }

            @Override // X.C186E
            public final void LIZLLL(C0H0C c0h0c, List<PromotionSticker> list, Integer num) {
                this.LIZ = C428570GrH.LIZ(C2296808zG.LIZ(C2108208Ns.LIZ), c0h0c, list, 12, num, false, 64);
            }

            @Override // X.C186E
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

    @Override // X.C182C
    public final void destroy() {
        LJIIL().LIZJ();
    }

    public static final InterfaceC212322187c LJIILIIL(Object obj) {
        final InterfaceC428630GrN interfaceC428630GrN = (InterfaceC428630GrN) obj;
        return new C186E(interfaceC428630GrN) { // from class: X.0GrM
            public final InterfaceC428630GrN LIZ;

            @Override // X.C186E
            public final void LIZJ() {
            }

            {
                this.LIZ = interfaceC428630GrN;
            }

            @Override // X.C186E
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

            @Override // X.C186E
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

            @Override // X.C186E
            public final void LIZLLL(C0H0C c0h0c, List<PromotionSticker> list, Integer num) {
                C054G c054gLIZ = C2296808zG.LIZ(C2108208Ns.LIZ);
                this.LIZ.LIZ();
                C428570GrH.LIZ(c054gLIZ, c0h0c, list, 12, num, false, 64);
            }

            @Override // X.C186E
            public final void LJ(TuxTextView tuxTextView, Context context, boolean z) {
                float fLIZLLL;
                InterfaceC428630GrN interfaceC428630GrN2 = this.LIZ;
                if (z) {
                    fLIZLLL = 0.0f;
                } else {
                    fLIZLLL = interfaceC428630GrN2.LIZLLL();
                }
                C384050F3z c384050F3z = new C384050F3z();
                c384050F3z.LIZIZ = Integer.valueOf(this.LIZ.LJI());
                c384050F3z.LJIIJJI = Float.valueOf(fLIZLLL);
                c384050F3z.LJIIIIZZ = Float.valueOf(this.LIZ.LIZLLL());
                tuxTextView.setBackground(c384050F3z.LIZ(context));
            }

            @Override // X.C186E
            public final void LIZIZ(int i, Context context, TuxTextView tuxTextView, boolean z) {
                Integer numLJIIL;
                int iIntValue;
                tuxTextView.setTuxFont(this.LIZ.LJIILIIL());
                if (C428660GrQ.LIZ[this.LIZ.LJIIIZ().ordinal()] == 1) {
                    tuxTextView.setText(String.valueOf(i));
                    if (C288750BTl.LIZ()) {
                        numLJIIL = this.LIZ.LJIILJJIL();
                    } else if (i < 100) {
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

    public final void LJIIZILJ(boolean z) {
        int i;
        TuxTextView tuxTextView = this.LJIIJ;
        int i2 = 8;
        if (tuxTextView != null) {
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            C786410Ut5.LLLLZLL(tuxTextView, i);
        }
        TuxTextView tuxTextView2 = this.LJIIJJI;
        if (tuxTextView2 != null) {
            if (z && Intrinsics.LJFF(Boolean.TRUE, tuxTextView2.getTag())) {
                i2 = 0;
            }
            C786410Ut5.LLLLZLL(tuxTextView2, i2);
        }
    }

    public final void LJIJ(TopBrand topBrand) {
        List<String> urls;
        Integer numValueOf;
        Integer numValueOf2;
        if (this.LJIILIIL.getValue() == null) {
            return;
        }
        View view = (View) this.LJIIL.getValue();
        if (view != null) {
            C337180DJs.LIZ(view);
        }
        C186K c186k = (C186K) this.LJIILIIL.getValue();
        if (c186k != null) {
            C186I c186i = new C186I(C418440Gaw.LIZIZ(4), C418440Gaw.LIZIZ(4), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(15)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)));
            C19411510wz c19411510wz = C19411510wz.LIZ;
            Image image = topBrand.icon;
            ViewGroup.LayoutParams layoutParams = null;
            if (image != null) {
                urls = image.getUrls();
            } else {
                urls = null;
            }
            C03IT c03itLIZ = c19411510wz.LIZ(urls, EnumC1769850w9n.LIVE_POP_CARD_ICON_TOP_BRAND);
            if (c03itLIZ != null) {
                C427660Gpo.LJIIJJI(c186k.getBrandLogoFromXml(), c03itLIZ, false, null, null, false, false, null, new C463040IDu(null, new AwS576S0100000_32(c186k, 26), 1), false, null, 862);
                c186k.getBrandLogoFromXml().setForeground(null);
            } else {
                C0H1U.LIZIZ(c186k.getBrandLogoFromXml());
            }
            String str = topBrand.text;
            if (str != null && str.length() != 0) {
                c186k.getBrandNameFromXml().setText(str);
                try {
                    Integer numValueOf3 = Integer.valueOf(Color.parseColor(topBrand.textColor));
                    if (numValueOf3 != null) {
                        c186k.getBrandNameFromXml().setTextColor(numValueOf3.intValue());
                    }
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
            C12ES.LJIILL(0, c186k);
            String str2 = topBrand.backgroundColor;
            if (str2 != null) {
                C384050F3z c384050F3z = new C384050F3z();
                try {
                    numValueOf = Integer.valueOf(Color.parseColor(str2));
                } catch (Exception e2) {
                    TryCatchGuardChecker.doCheck(e2);
                    numValueOf = null;
                }
                c384050F3z.LIZ = numValueOf;
                c384050F3z.LJIIJ = Float.valueOf(c186i.LIZ);
                c384050F3z.LJIIJJI = Float.valueOf(c186i.LIZIZ);
                c186k.setBackground(c384050F3z.LIZ(c186k.getContext()));
                View brandBgCoverFromXml = c186k.getBrandBgCoverFromXml();
                C384050F3z c384050F3z2 = new C384050F3z();
                try {
                    numValueOf2 = Integer.valueOf(Color.parseColor("#D9F5F5F5"));
                } catch (Exception e3) {
                    TryCatchGuardChecker.doCheck(e3);
                    numValueOf2 = null;
                }
                c384050F3z2.LIZ = numValueOf2;
                c384050F3z2.LJIIJ = Float.valueOf(c186i.LIZ);
                c384050F3z2.LJIIJJI = Float.valueOf(c186i.LIZIZ);
                brandBgCoverFromXml.setBackground(c384050F3z2.LIZ(c186k.getContext()));
                C12ES.LJIILL(0, c186k.getBrandBgCoverFromXml());
            } else {
                C0H1U.LIZIZ(c186k.getBrandBgCoverFromXml());
            }
            if (c186i.LJ > 0 || c186i.LJFF > 0) {
                c186k.getContentContainerFromXml().setPadding(c186i.LJ, 0, c186i.LJFF, 0);
            }
            int i = c186i.LIZLLL;
            if (i > 0) {
                C1744700vVE.LJIIIIZZ(i, c186k);
            }
            if (c186i.LIZJ > 0) {
                c186k.getBrandNameFromXml().setTuxFont(c186i.LIZJ);
            }
            if (c186i.LJI > 0) {
                C427660Gpo brandLogoFromXml = c186k.getBrandLogoFromXml();
                ViewGroup.LayoutParams layoutParams2 = brandLogoFromXml.getLayoutParams();
                if (layoutParams2 instanceof LinearLayout.LayoutParams) {
                    layoutParams = layoutParams2;
                }
                LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) layoutParams;
                if (layoutParams3 != null) {
                    int i2 = c186i.LJI;
                    layoutParams3.width = i2;
                    layoutParams3.height = i2;
                    C786410Ut5.W5(brandLogoFromXml, layoutParams3);
                }
            }
        }
    }

    public C186F(ConstraintLayout constraintLayout, C428640GrO c428640GrO) {
        super(constraintLayout, "product_image");
        this.LJII = c428640GrO;
        this.LJIIIIZZ = C452501pT.LIZIZ(new AwS433S0200000_32(this, constraintLayout, 61));
        this.LJIIIZ = C452501pT.LIZIZ(new AwS433S0200000_32(this, constraintLayout, 62));
        this.LJIIL = C452501pT.LIZIZ(new AwS433S0200000_32(this, constraintLayout, 60));
        this.LJIILIIL = C452501pT.LIZIZ(new AwS433S0200000_32(this, constraintLayout, 63));
    }

    public final void LJIILJJIL(List<PromotionSticker> list, Map<String, String> map) {
        LJIIL().LIZJ();
        View view = (View) this.LJIIL.getValue();
        if (view != null) {
            C337180DJs.LIZJ(view);
        }
        AwS398S0200000_32 awS398S0200000_32 = new AwS398S0200000_32(this, list, (List<PromotionSticker>) 83);
        int i = LJIILJJIL;
        if (i > 0) {
            awS398S0200000_32.invoke(Integer.valueOf(i));
        } else {
            HandlerHook.viewPost((View) this.LJIIIIZZ.getValue(), new ARunnableS98S0200000_29(this, awS398S0200000_32, 68));
        }
        List<String> list2 = C19676111yZ.LIZ;
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
        SmartImageView smartImageView = (SmartImageView) this.LJIIIIZZ.getValue();
        C1331670kl3 c1331670kl3LJFF = LJIIL().LJFF(this.LIZLLL, str);
        c1331670kl3LJFF.LJJ(smartImageView);
        c1331670kl3LJFF.LJIIJ(new C19LI((C212226183k) abstractC1335900krs, 3));
        this.LJIIIIZZ.getValue();
        AppCompatImageView appCompatImageView = (AppCompatImageView) this.LJIIIZ.getValue();
        if (appCompatImageView != null) {
            C786410Ut5.LLILIL(appCompatImageView, 0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x004e A[PHI: r1
      0x004e: PHI (r1v4 com.bytedance.tux.input.TuxTextView) = (r1v3 com.bytedance.tux.input.TuxTextView), (r1v6 com.bytedance.tux.input.TuxTextView) binds: [B:21:0x0040, B:23:0x004c] A[DONT_GENERATE, DONT_INLINE]] */
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
    public static void LJIILLIIL(X.C186F r6, int r7, java.lang.String r8, java.lang.Integer r9) {
        /*
            r5 = 8
            if (r7 != 0) goto L13
            com.bytedance.tux.input.TuxTextView r0 = r6.LJIIJ
            if (r0 == 0) goto Lb
            X.C786410Ut5.LLLLZLL(r0, r5)
        Lb:
            com.bytedance.tux.input.TuxTextView r0 = r6.LJIIJJI
            if (r0 == 0) goto L12
            X.C786410Ut5.LLLLZLL(r0, r5)
        L12:
            return
        L13:
            com.bytedance.tux.input.TuxTextView r3 = r6.LJIIJ
            if (r3 != 0) goto L21
            X.186H<T extends android.view.ViewGroup> r1 = r6.LJII
            T extends android.view.View r0 = r6.LIZ
            com.bytedance.tux.input.TuxTextView r3 = r1.LIZIZ(r0)
            r6.LJIIJ = r3
        L21:
            r4 = 1
            r2 = 0
            if (r3 == 0) goto L35
            X.C786410Ut5.LLLLZLL(r3, r2)
            X.187c r1 = r6.LJIIL()
            X.186E r1 = (X.C186E) r1
            android.content.Context r0 = r3.getContext()
            r1.LIZIZ(r7, r0, r3, r4)
        L35:
            if (r9 == 0) goto L75
            r1 = 5
            int r0 = r9.intValue()
            if (r0 == r1) goto L75
            com.bytedance.tux.input.TuxTextView r1 = r6.LJIIJJI
            if (r1 != 0) goto L4e
            X.186H<T extends android.view.ViewGroup> r1 = r6.LJII
            T extends android.view.View r0 = r6.LIZ
            com.bytedance.tux.input.TuxTextView r1 = r1.LJFF(r0)
            r6.LJIIJJI = r1
            if (r1 == 0) goto L59
        L4e:
            X.C786410Ut5.LLLLZLL(r1, r2)
            r1.setText(r8)
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r1.setTag(r0)
        L59:
            com.bytedance.tux.input.TuxTextView r3 = r6.LJIIJ
            if (r3 == 0) goto L12
            X.187c r2 = r6.LJIIL()
            X.186E r2 = (X.C186E) r2
            android.content.Context r1 = r6.LIZLLL
            com.bytedance.tux.input.TuxTextView r0 = r6.LJIIJJI
            if (r0 == 0) goto L73
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L73
        L6f:
            r2.LJ(r3, r1, r4)
            return
        L73:
            r4 = 0
            goto L6f
        L75:
            com.bytedance.tux.input.TuxTextView r1 = r6.LJIIJJI
            if (r1 == 0) goto L59
            X.C786410Ut5.LLLLZLL(r1, r5)
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r1.setTag(r0)
            goto L59
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C186F.LJIILLIIL(X.186F, int, java.lang.String, java.lang.Integer):void");
    }
}
