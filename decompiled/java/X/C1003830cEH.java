package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.commercialize.model.AnoleComponentModel;
import com.ss.android.ugc.aweme.component.playableconvertcomponent.AnolePlayableCovertData;
import com.ss.android.ugc.aweme.component.playableconvertcomponent.SponsoredLabel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS417S0200000_16;
import kotlin.jvm.internal.AwS560S0100000_16;
import kotlin.jvm.internal.AwS595S0100000_16;

/* JADX INFO: renamed from: X.0cEH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1003830cEH extends AbstractC1014240cV4 {
    public final C01GW LLJLIL;
    public final C01GW LLJLILLLLZIIL;
    public View LLJLL;
    public TuxTextView LLJLLIL;
    public View LLJLLL;
    public SmartImageView LLJZ;
    public TuxTextView LLJZIJLIL;
    public TuxTextView LLL;
    public C197039127h LLLF;
    public C197039127h LLLFF;

    @Override // X.AbstractC1014240cV4
    public final boolean LJIILIIL() {
        return false;
    }

    public final AnolePlayableCovertData LJJ() {
        return (AnolePlayableCovertData) this.LLJLIL.getValue();
    }

    @Override // X.AbstractC1014240cV4, X.InterfaceC1007930cKt
    public final C1014500cVU isReady() {
        return new C1014500cVU(true, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC1014240cV4, X.InterfaceC1007930cKt
    public final void Mk(AbstractC1003980cEW abstractC1003980cEW) {
        C1003870cEL c1003870cEL;
        View viewFindViewById;
        View viewFindViewById2;
        int i;
        if (abstractC1003980cEW instanceof C991250btz) {
            T t = ((C991250btz) abstractC1003980cEW).LIZ;
            if ((t instanceof C1003870cEL) && this.LLILZIL && (c1003870cEL = (C1003870cEL) t) != null) {
                boolean z = c1003870cEL.LIZ;
                View view = this.LLJJIJIL;
                int i2 = 8;
                if (view != null && (viewFindViewById2 = view.findViewById(R.id.qo8)) != null) {
                    if (z) {
                        i = 8;
                    } else {
                        i = 0;
                    }
                    C786410Ut5.LJLLLLLL(i, viewFindViewById2);
                }
                View view2 = this.LLJJIJIL;
                if (view2 != null && (viewFindViewById = view2.findViewById(R.id.qo3)) != null) {
                    if (z) {
                        i2 = 0;
                    }
                    C786410Ut5.LJLLLLLL(i2, viewFindViewById);
                }
            }
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // X.AbstractC1014240cV4, X.InterfaceC1007930cKt
    public final void Fk(ViewGroup viewGroup, InterfaceC1014340cVE interfaceC1014340cVE) {
        View viewFindViewById;
        TuxTextView tuxTextView;
        View viewFindViewById2;
        SmartImageView smartImageView;
        TuxTextView tuxTextView2;
        TuxTextView tuxTextView3;
        C197039127h c197039127h;
        C197039127h c197039127h2;
        String str;
        String str2;
        String str3;
        TextView textView;
        SponsoredLabel sponsoredLabel;
        String str4;
        Integer numLIZ;
        SponsoredLabel sponsoredLabel2;
        String str5;
        Integer numLIZ2;
        SponsoredLabel sponsoredLabel3;
        View viewFindViewById3;
        String str6;
        String str7;
        SmartImageView smartImageView2;
        String str8;
        int iIntValue;
        Context context;
        Integer numLIZJ;
        String str9;
        SponsoredLabel sponsoredLabel4;
        String str10;
        Integer numLIZ3;
        SponsoredLabel sponsoredLabel5;
        String str11;
        Integer numLIZ4;
        SponsoredLabel sponsoredLabel6;
        super.Fk(viewGroup, interfaceC1014340cVE);
        if (LJJ() != null) {
            View viewTd = C786410Ut5.Td(C786410Ut5.ne(this.LLILZ), R.layout.py, viewGroup, false);
            this.LLJJIJIL = viewTd;
            String str12 = null;
            if (viewTd != null) {
                viewFindViewById = viewTd.findViewById(R.id.bxi);
            } else {
                viewFindViewById = null;
            }
            this.LLJLL = viewFindViewById;
            View view = this.LLJJIJIL;
            if (view != null) {
                tuxTextView = (TuxTextView) view.findViewById(R.id.tv_playable_sponsored);
            } else {
                tuxTextView = null;
            }
            this.LLJLLIL = tuxTextView;
            View view2 = this.LLJJIJIL;
            if (view2 != null) {
                viewFindViewById2 = view2.findViewById(R.id.qo0);
            } else {
                viewFindViewById2 = null;
            }
            this.LLJLLL = viewFindViewById2;
            View view3 = this.LLJJIJIL;
            if (view3 != null) {
                smartImageView = (SmartImageView) view3.findViewById(R.id.lr9);
            } else {
                smartImageView = null;
            }
            this.LLJZ = smartImageView;
            View view4 = this.LLJJIJIL;
            if (view4 != null) {
                tuxTextView2 = (TuxTextView) view4.findViewById(R.id.f789qo2);
            } else {
                tuxTextView2 = null;
            }
            this.LLJZIJLIL = tuxTextView2;
            View view5 = this.LLJJIJIL;
            if (view5 != null) {
                tuxTextView3 = (TuxTextView) view5.findViewById(R.id.qo1);
            } else {
                tuxTextView3 = null;
            }
            this.LLL = tuxTextView3;
            View view6 = this.LLJJIJIL;
            if (view6 != null) {
                c197039127h = (C197039127h) view6.findViewById(R.id.ctd);
            } else {
                c197039127h = null;
            }
            this.LLLF = c197039127h;
            View view7 = this.LLJJIJIL;
            if (view7 != null) {
                c197039127h2 = (C197039127h) view7.findViewById(R.id.ctb);
            } else {
                c197039127h2 = null;
            }
            this.LLLFF = c197039127h2;
            View view8 = this.LLJLL;
            if (view8 != null) {
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setColors(new int[]{0, -16777216});
                gradientDrawable.setShape(0);
                gradientDrawable.setGradientType(0);
                gradientDrawable.setOrientation(GradientDrawable.Orientation.TOP_BOTTOM);
                view8.setBackground(gradientDrawable);
            }
            TuxTextView tuxTextView4 = this.LLJLLIL;
            if (tuxTextView4 != null) {
                AnolePlayableCovertData anolePlayableCovertDataLJJ = LJJ();
                if (anolePlayableCovertDataLJJ != null && (sponsoredLabel6 = anolePlayableCovertDataLJJ.label) != null) {
                    str9 = sponsoredLabel6.text;
                } else {
                    str9 = null;
                }
                tuxTextView4.setText(str9);
                AnolePlayableCovertData anolePlayableCovertDataLJJ2 = LJJ();
                if (anolePlayableCovertDataLJJ2 != null && (sponsoredLabel5 = anolePlayableCovertDataLJJ2.label) != null && (str11 = sponsoredLabel5.colorText) != null && (numLIZ4 = C998460c5c.LIZ(str11)) != null) {
                    tuxTextView4.setTextColor(numLIZ4.intValue());
                }
                AnolePlayableCovertData anolePlayableCovertDataLJJ3 = LJJ();
                if (anolePlayableCovertDataLJJ3 != null && (sponsoredLabel4 = anolePlayableCovertDataLJJ3.label) != null && (str10 = sponsoredLabel4.color) != null && (numLIZ3 = C998460c5c.LIZ(str10)) != null) {
                    int iIntValue2 = numLIZ3.intValue();
                    GradientDrawable gradientDrawable2 = new GradientDrawable();
                    gradientDrawable2.setColor(ColorStateList.valueOf(iIntValue2));
                    gradientDrawable2.setCornerRadius(C418440Gaw.LIZIZ(4));
                    tuxTextView4.setBackground(gradientDrawable2);
                }
            }
            View view9 = this.LLJLLL;
            if (view9 != null) {
                GradientDrawable gradientDrawable3 = new GradientDrawable();
                View view10 = this.LLJJIJIL;
                if (view10 != null && (context = view10.getContext()) != null && (numLIZJ = C1308910kAL.LIZJ(R.attr.a03, context)) != null) {
                    iIntValue = numLIZJ.intValue();
                } else {
                    iIntValue = 0;
                }
                gradientDrawable3.setColor(iIntValue);
                gradientDrawable3.setCornerRadius(C418440Gaw.LIZIZ(10));
                view9.setBackground(gradientDrawable3);
            }
            AnolePlayableCovertData anolePlayableCovertDataLJJ4 = LJJ();
            if (anolePlayableCovertDataLJJ4 != null) {
                str = anolePlayableCovertDataLJJ4.thumb;
            } else {
                str = null;
            }
            if (!TextUtils.isEmpty(str) && (smartImageView2 = this.LLJZ) != null) {
                AnolePlayableCovertData anolePlayableCovertDataLJJ5 = LJJ();
                if (anolePlayableCovertDataLJJ5 != null) {
                    str8 = anolePlayableCovertDataLJJ5.thumb;
                } else {
                    str8 = null;
                }
                C1331670kl3 c1331670kl3LJIIIIZZ = C1331660kl2.LJIIIIZZ(C438710HIf.LIZJ(str8));
                c1331670kl3LJIIIIZZ.LJJ(smartImageView2);
                c1331670kl3LJIIIIZZ.LJIIJJI();
            }
            AnolePlayableCovertData anolePlayableCovertDataLJJ6 = LJJ();
            if (anolePlayableCovertDataLJJ6 != null) {
                str2 = anolePlayableCovertDataLJJ6.title;
            } else {
                str2 = null;
            }
            if (C1533950q1J.LJ(str2)) {
                TuxTextView tuxTextView5 = this.LLJZIJLIL;
                if (tuxTextView5 != null) {
                    AnolePlayableCovertData anolePlayableCovertDataLJJ7 = LJJ();
                    if (anolePlayableCovertDataLJJ7 != null) {
                        str7 = anolePlayableCovertDataLJJ7.title;
                    } else {
                        str7 = null;
                    }
                    tuxTextView5.setText(str7);
                }
                TuxTextView tuxTextView6 = this.LLJZIJLIL;
                if (tuxTextView6 != null) {
                    C786410Ut5.LLLLZLL(tuxTextView6, 0);
                }
            } else {
                TuxTextView tuxTextView7 = this.LLJZIJLIL;
                if (tuxTextView7 != null) {
                    C786410Ut5.LLLLZLL(tuxTextView7, 8);
                }
            }
            AnolePlayableCovertData anolePlayableCovertDataLJJ8 = LJJ();
            if (anolePlayableCovertDataLJJ8 != null) {
                str3 = anolePlayableCovertDataLJJ8.desc;
            } else {
                str3 = null;
            }
            if (C1533950q1J.LJ(str3)) {
                TuxTextView tuxTextView8 = this.LLL;
                if (tuxTextView8 != null) {
                    AnolePlayableCovertData anolePlayableCovertDataLJJ9 = LJJ();
                    if (anolePlayableCovertDataLJJ9 != null) {
                        str6 = anolePlayableCovertDataLJJ9.desc;
                    } else {
                        str6 = null;
                    }
                    tuxTextView8.setText(str6);
                }
                TuxTextView tuxTextView9 = this.LLL;
                if (tuxTextView9 != null) {
                    C786410Ut5.LLLLZLL(tuxTextView9, 0);
                }
            } else {
                TuxTextView tuxTextView10 = this.LLL;
                if (tuxTextView10 != null) {
                    C786410Ut5.LLLLZLL(tuxTextView10, 8);
                }
            }
            C197039127h c197039127h3 = this.LLLF;
            if (c197039127h3 != null) {
                c197039127h3.LJJJJL(new AwS595S0100000_16(this, 276));
            }
            C197039127h c197039127h4 = this.LLLFF;
            if (c197039127h4 != null) {
                c197039127h4.LJJJJL(new AwS595S0100000_16(this, 277));
            }
            View view11 = this.LLJJIJIL;
            if (view11 != null && (viewFindViewById3 = view11.findViewById(R.id.qo3)) != null) {
                GradientDrawable gradientDrawable4 = new GradientDrawable();
                gradientDrawable4.setColors(new int[]{0, 1291845632});
                gradientDrawable4.setShape(0);
                gradientDrawable4.setGradientType(0);
                gradientDrawable4.setOrientation(GradientDrawable.Orientation.TOP_BOTTOM);
                viewFindViewById3.setBackground(gradientDrawable4);
            }
            View view12 = this.LLJJIJIL;
            if (view12 != null && (textView = (TextView) view12.findViewById(R.id.zdu)) != null) {
                AnolePlayableCovertData anolePlayableCovertDataLJJ10 = LJJ();
                if (anolePlayableCovertDataLJJ10 != null && (sponsoredLabel3 = anolePlayableCovertDataLJJ10.label) != null) {
                    str12 = sponsoredLabel3.text;
                }
                textView.setText(str12);
                AnolePlayableCovertData anolePlayableCovertDataLJJ11 = LJJ();
                if (anolePlayableCovertDataLJJ11 != null && (sponsoredLabel2 = anolePlayableCovertDataLJJ11.label) != null && (str5 = sponsoredLabel2.colorText) != null && (numLIZ2 = C998460c5c.LIZ(str5)) != null) {
                    textView.setTextColor(numLIZ2.intValue());
                }
                AnolePlayableCovertData anolePlayableCovertDataLJJ12 = LJJ();
                if (anolePlayableCovertDataLJJ12 != null && (sponsoredLabel = anolePlayableCovertDataLJJ12.label) != null && (str4 = sponsoredLabel.color) != null && (numLIZ = C998460c5c.LIZ(str4)) != null) {
                    int iIntValue3 = numLIZ.intValue();
                    GradientDrawable gradientDrawable5 = new GradientDrawable();
                    gradientDrawable5.setColor(ColorStateList.valueOf(iIntValue3));
                    gradientDrawable5.setCornerRadius(C418440Gaw.LIZIZ(4));
                    textView.setBackground(gradientDrawable5);
                }
            }
            C197039127h c197039127h5 = this.LLLF;
            if (c197039127h5 != null) {
                C1003890cEN c1003890cEN = AbstractViewOnClickListenerC1003880cEM.LLILLL;
                AwS595S0100000_16 awS595S0100000_16 = new AwS595S0100000_16(this, 274);
                c1003890cEN.getClass();
                C786410Ut5.U8(c197039127h5, new C1003560cDq(awS595S0100000_16));
            }
            C1003890cEN c1003890cEN2 = AbstractViewOnClickListenerC1003880cEM.LLILLL;
            AwS595S0100000_16 awS595S0100000_162 = new AwS595S0100000_16(this, 275);
            c1003890cEN2.getClass();
            C1003560cDq c1003560cDq = new C1003560cDq(awS595S0100000_162);
            TuxTextView tuxTextView11 = this.LLJLLIL;
            if (tuxTextView11 != null) {
                C786410Ut5.h9(tuxTextView11, c1003560cDq);
            }
            View view13 = this.LLJLLL;
            if (view13 != null) {
                C786410Ut5.I7(c1003560cDq, view13);
            }
            SmartImageView smartImageView3 = this.LLJZ;
            if (smartImageView3 != null) {
                C786410Ut5.Q8(smartImageView3, c1003560cDq);
            }
            TuxTextView tuxTextView12 = this.LLJZIJLIL;
            if (tuxTextView12 != null) {
                C786410Ut5.h9(tuxTextView12, c1003560cDq);
            }
            TuxTextView tuxTextView13 = this.LLL;
            if (tuxTextView13 != null) {
                C786410Ut5.h9(tuxTextView13, c1003560cDq);
            }
            C197039127h c197039127h6 = this.LLLFF;
            if (c197039127h6 != null) {
                C786410Ut5.U8(c197039127h6, c1003560cDq);
            }
            View view14 = this.LLJLL;
            if (view14 != null) {
                C786410Ut5.I7(new View.OnClickListener() { // from class: X.0cEK
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view15) {
                    }
                }, view14);
            }
            C2271391DvN.LIZ(this.LLJLL, (C1A5L) C2271381DvM.y.getValue());
            C2271391DvN.LIZ(this.LLJLLIL, (C1A5L) C2271381DvM.z.getValue());
            C2271391DvN.LIZ(this.LLJLLL, (C1A5L) C2271381DvM.A.getValue());
            C2271391DvN.LIZ(this.LLJZ, (C1A5L) C2271381DvM.B.getValue());
            C2271391DvN.LIZ(this.LLJZIJLIL, (C1A5L) C2271381DvM.C.getValue());
            C2271391DvN.LIZ(this.LLL, (C1A5L) C2271381DvM.D.getValue());
            C2271391DvN.LIZ(this.LLLF, (C1A5L) C2271381DvM.E.getValue());
            C2271391DvN.LIZ(this.LLLFF, (C1A5L) C2271381DvM.F.getValue());
        }
    }

    public C1003830cEH(AnoleComponentModel anoleComponentModel, C1009340cNA c1009340cNA, InterfaceC1014270cV7 interfaceC1014270cV7, Context context) {
        super(anoleComponentModel, c1009340cNA, interfaceC1014270cV7, context);
        this.LLJLIL = C452501pT.LIZIZ(new AwS560S0100000_16(this, 757));
        this.LLJLILLLLZIIL = C452501pT.LIZIZ(new AwS417S0200000_16(c1009340cNA, anoleComponentModel, 71));
    }
}
