package X;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.tux.navigation.TuxNavBar;
import com.ss.android.ugc.aweme.commercialize.model.AnoleComponentModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS417S0200000_16;
import kotlin.jvm.internal.AwS560S0100000_16;

/* JADX INFO: renamed from: X.0cJW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1007080cJW extends AbstractC1014240cV4 {
    public final InterfaceC1014090cUp LLJLIL;
    public final C01GW LLJLILLLLZIIL;

    @Override // X.AbstractC1014240cV4
    public final boolean LJIILIIL() {
        return false;
    }

    @Override // X.AbstractC1014240cV4, X.InterfaceC1007930cKt
    public final C1014500cVU isReady() {
        return new C1014500cVU(true, null);
    }

    @Override // X.AbstractC1014240cV4, X.InterfaceC1007930cKt
    public final void Fk(ViewGroup viewGroup, InterfaceC1014340cVE interfaceC1014340cVE) {
        View viewFindViewById;
        TuxNavBar tuxNavBar;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        super.Fk(viewGroup, interfaceC1014340cVE);
        this.LLJJI = new C1009390cNF(-1.0d, -2.0d);
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(this.LLILZ), R.layout.pl, this.LLJJIII, false);
        this.LLJJIJIL = viewTd;
        if (viewTd != null && (tuxNavBar = (TuxNavBar) viewTd.findViewById(R.id.ju_)) != null) {
            C0OM1 c0om1 = new C0OM1();
            C1251150ifB c1251150ifB = new C1251150ifB();
            C419910GdJ c419910GdJ = new C419910GdJ();
            c419910GdJ.LIZ = R.raw.icon_chevron_left_offset_ltr;
            c419910GdJ.LIZLLL = C1308910kAL.LIZJ(R.attr.ee, this.LLILZ);
            c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
            c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
            c1251150ifB.LIZLLL();
            c1251150ifB.LJ = c419910GdJ;
            c1251150ifB.LIZJ(new AwS560S0100000_16(this, 857));
            c0om1.LJ(c1251150ifB);
            tuxNavBar.setNavActions(c0om1);
            tuxNavBar.setNavBackground(0);
            ViewGroup.LayoutParams layoutParams = tuxNavBar.getLayoutParams();
            if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
                marginLayoutParams.topMargin = C497820Jfg.LIZJ(this.LLILZ);
                C786410Ut5.S6(tuxNavBar, marginLayoutParams);
            }
        }
        View view = this.LLJJIJIL;
        if (view != null && (viewFindViewById = view.findViewById(R.id.bx9)) != null) {
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setColors(new int[]{1023410176, 0});
            gradientDrawable.setShape(0);
            gradientDrawable.setGradientType(0);
            gradientDrawable.setOrientation(GradientDrawable.Orientation.TOP_BOTTOM);
            viewFindViewById.setBackground(gradientDrawable);
        }
    }

    public C1007080cJW(AnoleComponentModel anoleComponentModel, C1009340cNA c1009340cNA, InterfaceC1014270cV7 interfaceC1014270cV7, Context context, InterfaceC1014090cUp interfaceC1014090cUp) {
        super(anoleComponentModel, c1009340cNA, interfaceC1014270cV7, context);
        this.LLJLIL = interfaceC1014090cUp;
        this.LLJLILLLLZIIL = C452501pT.LIZIZ(new AwS417S0200000_16(c1009340cNA, anoleComponentModel, 91));
    }
}
