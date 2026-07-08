package X;

import android.content.Context;
import android.view.ViewGroup;
import com.bytedance.tux.navigation.TuxNavBar;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS570S0100000_26;

/* JADX INFO: renamed from: X.0vVA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1744660vVA {
    public Context LIZ;
    public C1744670vVB LIZIZ = new C1744670vVB();
    public TuxNavBar LIZJ;

    public final void LIZ(ViewGroup viewGroup) {
        TuxNavBar tuxNavBar = (TuxNavBar) viewGroup.findViewWithTag("unposted_header_navbar");
        if (tuxNavBar == null) {
            tuxNavBar = new TuxNavBar(viewGroup.getContext(), null, 6);
            tuxNavBar.setTag("unposted_header_navbar");
            C786410Ut5.S6(tuxNavBar, new ViewGroup.LayoutParams(-1, -2));
            viewGroup.addView(tuxNavBar);
            C0OM1 navActions = this.LIZIZ.getNavActions();
            if (navActions != null) {
                tuxNavBar.setNavActions(navActions);
            }
        }
        this.LIZJ = tuxNavBar;
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
    public final void LIZIZ(Function0<Unit> function0) {
        int iIntValue;
        String string;
        TuxNavBar tuxNavBar = this.LIZJ;
        if (tuxNavBar != null) {
            C0OM1 c0om1 = new C0OM1();
            AbstractC1250290idn[] abstractC1250290idnArr = new AbstractC1250290idn[1];
            C1251150ifB c1251150ifB = new C1251150ifB();
            Integer backIconRes = this.LIZIZ.getBackIconRes();
            if (backIconRes != null) {
                iIntValue = backIconRes.intValue();
            } else {
                iIntValue = R.raw.icon_chevron_left_ltr;
            }
            c1251150ifB.LIZLLL();
            c1251150ifB.LIZJ = iIntValue;
            Context context = this.LIZ;
            if (context != null) {
                string = context.getString(2131823332);
            } else {
                string = null;
            }
            c1251150ifB.LJIIIIZZ = string;
            c1251150ifB.LIZLLL = true;
            c1251150ifB.LIZJ(new AwS570S0100000_26(function0, 1591));
            abstractC1250290idnArr[0] = c1251150ifB;
            c0om1.LJ(abstractC1250290idnArr);
            c0om1.LIZLLL = false;
            tuxNavBar.setNavActions(c0om1);
        }
    }
}
