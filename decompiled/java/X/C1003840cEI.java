package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.commercialize.model.AnoleComponentModel;
import com.ss.android.ugc.aweme.component.playableiabconvertcomponent.AnolePlayableIABCovertData;
import com.ss.android.ugc.aweme.component.playableiabconvertcomponent.SponsoredLabel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS560S0100000_16;
import kotlin.jvm.internal.AwS595S0100000_16;

/* JADX INFO: renamed from: X.0cEI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1003840cEI extends AbstractC1014240cV4 {
    public final C01GW LLJLIL;
    public View LLJLILLLLZIIL;
    public View LLJLL;
    public TuxTextView LLJLLIL;
    public SmartImageView LLJLLL;
    public TuxTextView LLJZ;
    public TuxTextView LLJZIJLIL;
    public C197039127h LLL;

    public final AnolePlayableIABCovertData LJJ() {
        return (AnolePlayableIABCovertData) this.LLJLIL.getValue();
    }

    @Override // X.AbstractC1014240cV4, X.InterfaceC1007930cKt
    public final C1014500cVU isReady() {
        return new C1014500cVU(true, null);
    }

    @Override // X.AbstractC1014240cV4
    public final void LJIIIIZZ(String str) {
        super.LJIIIIZZ(str);
        if (str == null) {
            str = "";
        }
        C1014650cVj.LIZ(this, str, null);
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
        View viewFindViewById2;
        TuxTextView tuxTextView;
        SmartImageView smartImageView;
        TuxTextView tuxTextView2;
        TuxTextView tuxTextView3;
        C197039127h c197039127h;
        String str;
        String str2;
        String str3;
        Integer num;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        String str4;
        String str5;
        SmartImageView smartImageView2;
        String str6;
        String str7;
        SponsoredLabel sponsoredLabel;
        String str8;
        Integer numLIZ;
        SponsoredLabel sponsoredLabel2;
        String str9;
        Integer numLIZ2;
        SponsoredLabel sponsoredLabel3;
        super.Fk(viewGroup, interfaceC1014340cVE);
        if (LJJ() != null) {
            View viewTd = C786410Ut5.Td(C786410Ut5.ne(this.LLILZ), R.layout.pz, viewGroup, false);
            this.LLJJIJIL = viewTd;
            ViewGroup.LayoutParams layoutParams = null;
            if (viewTd != null) {
                viewFindViewById = viewTd.findViewById(R.id.bxj);
            } else {
                viewFindViewById = null;
            }
            this.LLJLILLLLZIIL = viewFindViewById;
            View view = this.LLJJIJIL;
            if (view != null) {
                viewFindViewById2 = view.findViewById(R.id.qo7);
            } else {
                viewFindViewById2 = null;
            }
            this.LLJLL = viewFindViewById2;
            View view2 = this.LLJJIJIL;
            if (view2 != null) {
                tuxTextView = (TuxTextView) view2.findViewById(R.id.tv_playable_iab_sponsored);
            } else {
                tuxTextView = null;
            }
            this.LLJLLIL = tuxTextView;
            View view3 = this.LLJJIJIL;
            if (view3 != null) {
                smartImageView = (SmartImageView) view3.findViewById(R.id.lra);
            } else {
                smartImageView = null;
            }
            this.LLJLLL = smartImageView;
            View view4 = this.LLJJIJIL;
            if (view4 != null) {
                tuxTextView2 = (TuxTextView) view4.findViewById(R.id.qo6);
            } else {
                tuxTextView2 = null;
            }
            this.LLJZ = tuxTextView2;
            View view5 = this.LLJJIJIL;
            if (view5 != null) {
                tuxTextView3 = (TuxTextView) view5.findViewById(R.id.qo5);
            } else {
                tuxTextView3 = null;
            }
            this.LLJZIJLIL = tuxTextView3;
            View view6 = this.LLJJIJIL;
            if (view6 != null) {
                c197039127h = (C197039127h) view6.findViewById(R.id.ctc);
            } else {
                c197039127h = null;
            }
            this.LLL = c197039127h;
            View view7 = this.LLJLILLLLZIIL;
            if (view7 != null) {
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setColors(new int[]{0, 1291845632});
                gradientDrawable.setShape(0);
                gradientDrawable.setGradientType(0);
                gradientDrawable.setOrientation(GradientDrawable.Orientation.TOP_BOTTOM);
                view7.setBackground(gradientDrawable);
            }
            TuxTextView tuxTextView4 = this.LLJLLIL;
            if (tuxTextView4 != null) {
                AnolePlayableIABCovertData anolePlayableIABCovertDataLJJ = LJJ();
                if (anolePlayableIABCovertDataLJJ != null && (sponsoredLabel3 = anolePlayableIABCovertDataLJJ.label) != null) {
                    str7 = sponsoredLabel3.text;
                } else {
                    str7 = null;
                }
                tuxTextView4.setText(str7);
                AnolePlayableIABCovertData anolePlayableIABCovertDataLJJ2 = LJJ();
                if (anolePlayableIABCovertDataLJJ2 != null && (sponsoredLabel2 = anolePlayableIABCovertDataLJJ2.label) != null && (str9 = sponsoredLabel2.colorText) != null && (numLIZ2 = C998460c5c.LIZ(str9)) != null) {
                    tuxTextView4.setTextColor(numLIZ2.intValue());
                }
                AnolePlayableIABCovertData anolePlayableIABCovertDataLJJ3 = LJJ();
                if (anolePlayableIABCovertDataLJJ3 != null && (sponsoredLabel = anolePlayableIABCovertDataLJJ3.label) != null && (str8 = sponsoredLabel.color) != null && (numLIZ = C998460c5c.LIZ(str8)) != null) {
                    int iIntValue = numLIZ.intValue();
                    GradientDrawable gradientDrawable2 = new GradientDrawable();
                    gradientDrawable2.setColor(ColorStateList.valueOf(iIntValue));
                    gradientDrawable2.setCornerRadius(C418440Gaw.LIZIZ(4));
                    tuxTextView4.setBackground(gradientDrawable2);
                }
            }
            AnolePlayableIABCovertData anolePlayableIABCovertDataLJJ4 = LJJ();
            if (anolePlayableIABCovertDataLJJ4 != null) {
                str = anolePlayableIABCovertDataLJJ4.thumb;
            } else {
                str = null;
            }
            if (!TextUtils.isEmpty(str) && (smartImageView2 = this.LLJLLL) != null) {
                AnolePlayableIABCovertData anolePlayableIABCovertDataLJJ5 = LJJ();
                if (anolePlayableIABCovertDataLJJ5 != null) {
                    str6 = anolePlayableIABCovertDataLJJ5.thumb;
                } else {
                    str6 = null;
                }
                C1331670kl3 c1331670kl3LJIIIIZZ = C1331660kl2.LJIIIIZZ(C438710HIf.LIZJ(str6));
                c1331670kl3LJIIIIZZ.LJJ(smartImageView2);
                c1331670kl3LJIIIIZZ.LJIIJJI();
            }
            AnolePlayableIABCovertData anolePlayableIABCovertDataLJJ6 = LJJ();
            if (anolePlayableIABCovertDataLJJ6 != null) {
                str2 = anolePlayableIABCovertDataLJJ6.title;
            } else {
                str2 = null;
            }
            if (C1533950q1J.LJ(str2)) {
                TuxTextView tuxTextView5 = this.LLJZ;
                if (tuxTextView5 != null) {
                    AnolePlayableIABCovertData anolePlayableIABCovertDataLJJ7 = LJJ();
                    if (anolePlayableIABCovertDataLJJ7 != null) {
                        str5 = anolePlayableIABCovertDataLJJ7.title;
                    } else {
                        str5 = null;
                    }
                    tuxTextView5.setText(str5);
                }
                TuxTextView tuxTextView6 = this.LLJZ;
                if (tuxTextView6 != null) {
                    C786410Ut5.LLLLZLL(tuxTextView6, 0);
                }
            } else {
                TuxTextView tuxTextView7 = this.LLJZ;
                if (tuxTextView7 != null) {
                    C786410Ut5.LLLLZLL(tuxTextView7, 8);
                }
            }
            AnolePlayableIABCovertData anolePlayableIABCovertDataLJJ8 = LJJ();
            if (anolePlayableIABCovertDataLJJ8 != null) {
                str3 = anolePlayableIABCovertDataLJJ8.desc;
            } else {
                str3 = null;
            }
            if (C1533950q1J.LJ(str3)) {
                TuxTextView tuxTextView8 = this.LLJZIJLIL;
                if (tuxTextView8 != null) {
                    AnolePlayableIABCovertData anolePlayableIABCovertDataLJJ9 = LJJ();
                    if (anolePlayableIABCovertDataLJJ9 != null) {
                        str4 = anolePlayableIABCovertDataLJJ9.desc;
                    } else {
                        str4 = null;
                    }
                    tuxTextView8.setText(str4);
                }
                TuxTextView tuxTextView9 = this.LLJZIJLIL;
                if (tuxTextView9 != null) {
                    C786410Ut5.LLLLZLL(tuxTextView9, 0);
                }
            } else {
                TuxTextView tuxTextView10 = this.LLJZIJLIL;
                if (tuxTextView10 != null) {
                    C786410Ut5.LLLLZLL(tuxTextView10, 8);
                }
            }
            C197039127h c197039127h2 = this.LLL;
            if (c197039127h2 != null) {
                c197039127h2.LJJJJL(new AwS595S0100000_16(this, 290));
            }
            AnolePlayableIABCovertData anolePlayableIABCovertDataLJJ10 = LJJ();
            if (anolePlayableIABCovertDataLJJ10 != null && (num = anolePlayableIABCovertDataLJJ10.scene) != null && num.intValue() == 1) {
                View view8 = this.LLJLILLLLZIIL;
                if (view8 != null) {
                    C786410Ut5.LJLLLLLL(8, view8);
                }
                TuxTextView tuxTextView11 = this.LLJLLIL;
                if (tuxTextView11 != null) {
                    C786410Ut5.LLLLZLL(tuxTextView11, 8);
                }
                SmartImageView smartImageView3 = this.LLJLLL;
                if (smartImageView3 != null) {
                    layoutParams = smartImageView3.getLayoutParams();
                }
                if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
                    marginLayoutParams.bottomMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(5));
                    SmartImageView smartImageView4 = this.LLJLLL;
                    if (smartImageView4 != null) {
                        C786410Ut5.G6(smartImageView4, marginLayoutParams);
                    }
                }
            }
            C1003890cEN c1003890cEN = AbstractViewOnClickListenerC1003880cEM.LLILLL;
            AwS595S0100000_16 awS595S0100000_16 = new AwS595S0100000_16(this, 289);
            c1003890cEN.getClass();
            C1003560cDq c1003560cDq = new C1003560cDq(awS595S0100000_16);
            View view9 = this.LLJLL;
            if (view9 != null) {
                C786410Ut5.I7(c1003560cDq, view9);
            }
            SmartImageView smartImageView5 = this.LLJLLL;
            if (smartImageView5 != null) {
                C786410Ut5.Q8(smartImageView5, c1003560cDq);
            }
            TuxTextView tuxTextView12 = this.LLJZ;
            if (tuxTextView12 != null) {
                C786410Ut5.h9(tuxTextView12, c1003560cDq);
            }
            TuxTextView tuxTextView13 = this.LLJZIJLIL;
            if (tuxTextView13 != null) {
                C786410Ut5.h9(tuxTextView13, c1003560cDq);
            }
            C197039127h c197039127h3 = this.LLL;
            if (c197039127h3 != null) {
                C786410Ut5.U8(c197039127h3, c1003560cDq);
            }
            C2271391DvN.LIZ(this.LLJLL, (C1A5L) C2271381DvM.A.getValue());
            C2271391DvN.LIZ(this.LLJLLL, (C1A5L) C2271381DvM.B.getValue());
            C2271391DvN.LIZ(this.LLJZ, (C1A5L) C2271381DvM.C.getValue());
            C2271391DvN.LIZ(this.LLJZIJLIL, (C1A5L) C2271381DvM.D.getValue());
            C2271391DvN.LIZ(this.LLL, (C1A5L) C2271381DvM.F.getValue());
        }
    }

    public C1003840cEI(AnoleComponentModel anoleComponentModel, C1009340cNA c1009340cNA, InterfaceC1014270cV7 interfaceC1014270cV7, Context context) {
        super(anoleComponentModel, c1009340cNA, interfaceC1014270cV7, context);
        this.LLJLIL = C452501pT.LIZIZ(new AwS560S0100000_16(this, 785));
    }
}
