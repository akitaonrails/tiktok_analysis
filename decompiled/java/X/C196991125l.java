package X;

import Y.AkS107S1100000_29;
import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.ss.android.ugc.aweme.live.livehostimpl.edit.text.font.TextFontStyleData;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS395S0200000_29;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.125l, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C196991125l implements InterfaceC971680bOQ {
    public final C196986125g LIZ = C196986125g.LJFF();
    public final int LIZIZ = 2;

    @Override // X.InterfaceC971680bOQ
    public final Pair<C1817980xPQ, Typeface> LIZ() {
        TextFontStyleData textFontStyleDataLIZJ;
        C196986125g c196986125g = this.LIZ;
        C1817980xPQ c1817980xPQLJIIIZ = (c196986125g == null || (textFontStyleDataLIZJ = c196986125g.LIZJ(this.LIZIZ)) == null) ? null : LJIIIZ(textFontStyleDataLIZJ);
        C196986125g c196986125g2 = this.LIZ;
        return new Pair<>(c1817980xPQLJIIIZ, c196986125g2 != null ? c196986125g2.LIZIZ(this.LIZIZ) : null);
    }

    @Override // X.InterfaceC971680bOQ
    public final void LJFF() {
        C196986125g c196986125g = this.LIZ;
        if (c196986125g != null) {
            c196986125g.LJIIIZ(this.LIZIZ);
        }
    }

    public static C1817980xPQ LJIIIZ(TextFontStyleData textFontStyleData) {
        String str = textFontStyleData.LIZ;
        if (str == null) {
            str = "";
        }
        String str2 = textFontStyleData.fileName;
        textFontStyleData.LIZJ.getResource_id();
        return new C1817980xPQ(str, str2);
    }

    @Override // X.InterfaceC971680bOQ
    public final C19480011Je LIZIZ(String str) {
        C196986125g c196986125g = this.LIZ;
        c196986125g.getClass();
        return AbstractC19484711Kz.LJII(new C19774112Yh(c196986125g, 1)).LJIIZILJ(new AkS107S1100000_29(str, this, 1));
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0037  */
    @Override // X.InterfaceC971680bOQ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final kotlin.Pair<java.lang.String, java.lang.String> LJI(java.lang.String r4) {
        /*
            r3 = this;
            X.125g r0 = r3.LIZ
            if (r0 == 0) goto L37
            java.util.List r0 = r0.LJ()
            java.util.Iterator r2 = r0.iterator()
        Lc:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L35
            java.lang.Object r1 = r2.next()
            r0 = r1
            com.ss.android.ugc.aweme.live.livehostimpl.edit.text.font.TextFontStyleData r0 = (com.ss.android.ugc.aweme.live.livehostimpl.edit.text.font.TextFontStyleData) r0
            java.lang.String r0 = r0.LIZ
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r0, r4)
            if (r0 == 0) goto Lc
        L21:
            com.ss.android.ugc.aweme.live.livehostimpl.edit.text.font.TextFontStyleData r1 = (com.ss.android.ugc.aweme.live.livehostimpl.edit.text.font.TextFontStyleData) r1
            if (r1 == 0) goto L37
            com.ss.android.ugc.effectmanager.effect.model.Effect r0 = r1.LIZJ
            if (r0 == 0) goto L37
            java.lang.String r1 = r0.getResource_id()
            if (r1 == 0) goto L37
        L2f:
            kotlin.Pair r0 = new kotlin.Pair
            r0.<init>(r1, r4)
            return r0
        L35:
            r1 = 0
            goto L21
        L37:
            java.lang.String r1 = ""
            goto L2f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C196991125l.LJI(java.lang.String):kotlin.Pair");
    }

    @Override // X.InterfaceC971680bOQ
    public final void LJ(View view, String str) {
        String str2;
        if (view instanceof C196990125k) {
            C196990125k c196990125k = (C196990125k) view;
            ViewGroup contentLayout = c196990125k.getContentLayout();
            int childCount = contentLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                contentLayout.getChildAt(i);
                C196986125g c196986125g = this.LIZ;
                TextFontStyleData textFontStyleData = null;
                if (c196986125g != null) {
                    Iterator<TextFontStyleData> it2 = c196986125g.LJ().iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        TextFontStyleData next = it2.next();
                        if (Intrinsics.LJFF(next.LIZ, str)) {
                            textFontStyleData = next;
                            break;
                        }
                    }
                    TextFontStyleData textFontStyleData2 = textFontStyleData;
                    if (textFontStyleData2 != null && (str2 = textFontStyleData2.fileName) != null && str2.length() > 0) {
                        C196986125g c196986125g2 = this.LIZ;
                        if (c196986125g2 != null) {
                            c196986125g2.LIZJ = textFontStyleData2.fileName;
                        }
                        c196990125k.LIZJ();
                        return;
                    }
                }
            }
            C196986125g c196986125g3 = this.LIZ;
            if (c196986125g3 != null) {
                c196986125g3.LIZJ = "Proxima-Nova-Semibold.otf";
            }
            c196990125k.LIZJ();
        }
    }

    public static Drawable LJIIIIZZ(C196991125l c196991125l, int i, float f) {
        c196991125l.getClass();
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setStroke((int) f, i);
        C1546210qL5.LIZ.getClass();
        gradientDrawable.setCornerRadius(C1546210qL5.LIZ(6));
        return gradientDrawable;
    }

    @Override // X.InterfaceC971680bOQ
    public final void LIZJ(View view, String str, Function2<? super C1817980xPQ, ? super Typeface, Unit> function2) {
        Typeface typefaceLIZIZ;
        TextFontStyleData textFontStyleDataLIZJ;
        Object next;
        String str2;
        if (view instanceof C196990125k) {
            C196990125k c196990125k = (C196990125k) view;
            ViewGroup contentLayout = c196990125k.getContentLayout();
            int childCount = contentLayout.getChildCount();
            int i = 0;
            while (true) {
                typefaceLIZIZ = null;
                if (i < childCount) {
                    contentLayout.getChildAt(i);
                    C196986125g c196986125g = this.LIZ;
                    if (c196986125g != null) {
                        Iterator it2 = ((ArrayList) c196986125g.LJ()).iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                next = it2.next();
                                if (Intrinsics.LJFF(((TextFontStyleData) next).fileName, str)) {
                                    break;
                                }
                            } else {
                                next = null;
                                break;
                            }
                        }
                        TextFontStyleData textFontStyleData = (TextFontStyleData) next;
                        if (textFontStyleData != null && (str2 = textFontStyleData.fileName) != null && str2.length() > 0) {
                            C196986125g c196986125g2 = this.LIZ;
                            if (c196986125g2 != null) {
                                c196986125g2.LIZJ = textFontStyleData.fileName;
                            }
                            c196990125k.LIZJ();
                        }
                    }
                    i++;
                } else {
                    LJFF();
                    c196990125k.LIZJ();
                    break;
                }
            }
            C196986125g c196986125g3 = this.LIZ;
            if (c196986125g3 != null && (textFontStyleDataLIZJ = c196986125g3.LIZJ(this.LIZIZ)) != null) {
                C1817980xPQ c1817980xPQLJIIIZ = LJIIIZ(textFontStyleDataLIZJ);
                C196986125g c196986125g4 = this.LIZ;
                if (c196986125g4 != null) {
                    typefaceLIZIZ = c196986125g4.LIZIZ(this.LIZIZ);
                }
                function2.invoke(c1817980xPQLJIIIZ, typefaceLIZIZ);
            }
        }
    }

    @Override // X.InterfaceC971680bOQ
    public final C196990125k LJII(Context context, Function1 function1, Function1 function12) {
        return LIZLLL(context, function1, EnumC2011407uK.DEFAULT, function12);
    }

    @Override // X.InterfaceC971680bOQ
    public final C196990125k LIZLLL(Context context, Function1 function1, EnumC2011407uK enumC2011407uK, final Function1 function12) {
        List<TextFontStyleData> listLJ;
        final C196990125k c196990125k = new C196990125k(context, this.LIZIZ);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c196990125k);
        c196990125k.setLayoutParams(layoutParams);
        if (enumC2011407uK == EnumC2011407uK.NOTICE_BOARD && C1834150xpV.LJFF(context)) {
            int iLIZIZ = C20736316Cj.LIZIZ(R.attr.ey9, context);
            C1546210qL5.LIZ.getClass();
            Drawable drawableLJIIIIZZ = LJIIIIZZ(this, iLIZIZ, C1546210qL5.LIZ(1));
            Drawable drawableLJIIIIZZ2 = LJIIIIZZ(this, C20736316Cj.LIZIZ(R.attr.ezq, context), C1546210qL5.LIZ(2));
            Integer numValueOf = Integer.valueOf(C20736316Cj.LIZIZ(R.attr.ezq, context));
            c196990125k.LLIZ = drawableLJIIIIZZ;
            c196990125k.LLIZLLLIL = drawableLJIIIIZZ2;
            c196990125k.LLJ = numValueOf;
            Iterator it2 = ((ArrayList) c196990125k.LLILLL).iterator();
            while (it2.hasNext()) {
                c196990125k.LIZ((C196989125j) it2.next());
            }
            c196990125k.LIZJ();
        }
        if (this.LIZ != null && (!((ArrayList) r0.LJ()).isEmpty())) {
            C196986125g c196986125g = this.LIZ;
            if (c196986125g != null) {
                listLJ = c196986125g.LJ();
            } else {
                listLJ = null;
            }
            c196990125k.LIZIZ(listLJ);
            function1.invoke(c196990125k);
        } else {
            C196986125g c196986125g2 = this.LIZ;
            if (c196986125g2 != null) {
                AwS395S0200000_29 awS395S0200000_29 = new AwS395S0200000_29(c196990125k, (C196990125k) function1, (Function1<? super View, Unit>) 110);
                if (context != null) {
                    c196986125g2.LJ.LJJJJI("textfont", false, false, new C196988125i(c196986125g2, awS395S0200000_29));
                }
            }
        }
        c196990125k.setClickFontStyleListener(new InterfaceC196995125p() { // from class: X.125n
            @Override // X.InterfaceC196995125p
            public final void LIZ(TextFontStyleData textFontStyleData) {
                C196986125g c196986125g3 = this.LIZ.LIZ;
                if (c196986125g3 != null) {
                    c196986125g3.LIZJ = textFontStyleData.fileName;
                }
                c196990125k.LIZJ();
                Function1<C1817980xPQ, Unit> function13 = function12;
                this.LIZ.getClass();
                function13.invoke(C196991125l.LJIIIZ(textFontStyleData));
            }
        });
        return c196990125k;
    }
}
