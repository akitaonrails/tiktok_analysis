package X;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.tux.navigation.TuxNavBar;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS548S0100000_4;

/* JADX INFO: renamed from: X.0DaG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C341580DaG extends FrameLayout {
    public View LL;
    public TuxNavBar LLILLJJLI;
    public Function0<Unit> LLILLL;

    public final Function0<Unit> getLeftIconClickListener() {
        return this.LLILLL;
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
    public C341580DaG(Context context) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        super(context, null, 0);
        C786410Ut5.Td(C786410Ut5.ne(context), R.layout.q2, this, true);
        this.LL = findViewById(R.id.bxl);
        this.LLILLJJLI = (TuxNavBar) findViewById(R.id.qo9);
        TuxNavBar tuxNavBar = this.LLILLJJLI;
        if (tuxNavBar != null) {
            C0OM1 c0om1 = new C0OM1();
            C1251150ifB c1251150ifB = new C1251150ifB();
            C419910GdJ c419910GdJ = new C419910GdJ();
            c419910GdJ.LIZ = R.raw.icon_chevron_left_offset_ltr;
            c419910GdJ.LIZLLL = C1308910kAL.LIZJ(R.attr.ee, getContext());
            c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
            c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
            c1251150ifB.LIZLLL();
            c1251150ifB.LJ = c419910GdJ;
            c1251150ifB.LIZJ(new AwS548S0100000_4(this, 468));
            c0om1.LJ(c1251150ifB);
            tuxNavBar.setNavActions(c0om1);
        }
        TuxNavBar tuxNavBar2 = this.LLILLJJLI;
        if (tuxNavBar2 != null) {
            tuxNavBar2.setNavBackground(0);
        }
        TuxNavBar tuxNavBar3 = this.LLILLJJLI;
        ViewGroup.LayoutParams layoutParams = tuxNavBar3 != null ? tuxNavBar3.getLayoutParams() : null;
        if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
            marginLayoutParams.topMargin = C497820Jfg.LIZJ(getContext());
            TuxNavBar tuxNavBar4 = this.LLILLJJLI;
            if (tuxNavBar4 != null) {
                C786410Ut5.S6(tuxNavBar4, marginLayoutParams);
            }
        }
        View view = this.LL;
        if (view != null) {
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setColors(new int[]{1023410176, 0});
            gradientDrawable.setShape(0);
            gradientDrawable.setGradientType(0);
            gradientDrawable.setOrientation(GradientDrawable.Orientation.TOP_BOTTOM);
            view.setBackground(gradientDrawable);
        }
    }

    public final void setLeftIconClickListener(Function0<Unit> function0) {
        this.LLILLL = function0;
    }
}
