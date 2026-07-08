package X;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import wh6.AbS687S0100000_4;

/* JADX INFO: renamed from: X.0Dgt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C345690Dgt implements C0SH7 {
    public C345700Dgu LIZ;

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
    @Override // X.C0SH7
    public final View LIZ(Context context) {
        boolean z;
        C0GUJ c0guj = new C0GUJ(context);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c0guj);
        c0guj.setLayoutParams(marginLayoutParams);
        c0guj.setOrientation(0);
        c0guj.setGravity(17);
        C345700Dgu c345700Dgu = this.LIZ;
        if (c345700Dgu != null) {
            Function1<View, Unit> function1 = c345700Dgu.LIZIZ;
            if (function1 != null) {
                function1.invoke(c0guj);
            }
            if (c345700Dgu.LIZ.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                TuxTextView tuxTextView = new TuxTextView(context, null, 6, 0);
                C786410Ut5.R6(tuxTextView, new LinearLayout.LayoutParams(-2, -2));
                tuxTextView.setTuxFont(62);
                tuxTextView.setTextColorRes(R.attr.ee);
                tuxTextView.setMaxLines(1);
                tuxTextView.setEllipsize(TextUtils.TruncateAt.END);
                tuxTextView.setGravity(17);
                tuxTextView.setText(c345700Dgu.LIZ);
                C786410Ut5.I7(new AbS687S0100000_4(c345700Dgu, 4), tuxTextView);
                c0guj.addView(tuxTextView);
            }
            TuxIconView tuxIconView = new TuxIconView(context, null, 0, 6, null);
            C786410Ut5.M6(tuxIconView, new LinearLayout.LayoutParams(-2, -2));
            C419910GdJ c419910GdJ = new C419910GdJ();
            c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
            c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
            c419910GdJ.LIZ = R.raw.icon_chevron_right_offset_ltr;
            Integer numValueOf = Integer.valueOf(R.attr.ee);
            c419910GdJ.LIZLLL = numValueOf;
            c419910GdJ.LJ = numValueOf;
            tuxIconView.setTuxIcon(c419910GdJ);
            c0guj.addView(tuxIconView);
        }
        return c0guj;
    }
}
