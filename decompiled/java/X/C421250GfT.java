package X;

import Y.ACListenerS110S0200000_6;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import avg.f;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import mf.a;

/* JADX INFO: renamed from: X.0GfT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C421250GfT extends FrameLayout {
    public final View LL;
    public final LinearLayout LLILLJJLI;
    public Function1<? super View, Unit> LLILLL;

    public final Function1<View, Unit> getItemClick() {
        return this.LLILLL;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C421250GfT(Context context) {
        ViewGroup viewGroup;
        super(context, null, 0);
        LinearLayout linearLayout = null;
        View viewSd = C786410Ut5.Sd(R.layout.fq8, C786410Ut5.ne(context), this);
        this.LL = viewSd;
        if (viewSd != null) {
            View viewFindViewById = viewSd.findViewById(R.id.xcv);
            if (viewFindViewById != null) {
                C19659111vp c19659111vp = new C19659111vp();
                c19659111vp.LIZ = C418440Gaw.LIZIZ(9);
                c19659111vp.LIZJ = C418440Gaw.LIZIZ(4);
                c19659111vp.LIZLLL = C418440Gaw.LIZIZ(18);
                c19659111vp.LJ = Integer.valueOf(R.attr.oz);
                viewFindViewById.setBackground(c19659111vp.LIZ(context));
                ViewParent parent = viewFindViewById.getParent();
                if ((parent instanceof ViewGroup) && (viewGroup = (ViewGroup) parent) != null) {
                    viewGroup.setClipChildren(false);
                }
            }
            linearLayout = (LinearLayout) viewSd.findViewById(R.id.xct);
        }
        this.LLILLJJLI = linearLayout;
    }

    public final void setItemClick(Function1<? super View, Unit> function1) {
        this.LLILLL = function1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [X.0GdP, android.view.View] */
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
    public final void setSubMenuActionConfig(List<C19723912Ez> list) {
        boolean z;
        LinearLayout linearLayout = this.LLILLJJLI;
        if (linearLayout != null) {
            C786410Ut5.LJJJJJL(linearLayout);
        }
        if (list != null) {
            int i = 0;
            for (C19723912Ez c19723912Ez : list) {
                int i2 = i + 1;
                if (i >= 0) {
                    C19723912Ez c19723912Ez2 = c19723912Ez;
                    final Context context = getContext();
                    ?? r3 = new LinearLayout(context) { // from class: X.0GdP
                        public final View LL;
                        public Integer LLILLJJLI;

                        public final Integer getTextRes() {
                            return this.LLILLJJLI;
                        }

                        {
                            super(context, null, 0);
                            this.LL = C786410Ut5.Sd(R.layout.fq9, C786410Ut5.ne(context), this);
                        }

                        public final void setDividerEndVisible(boolean z2) {
                            View viewFindViewById;
                            int i3;
                            View view = this.LL;
                            if (view != null && (viewFindViewById = view.findViewById(R.id.xcq)) != null) {
                                if (z2) {
                                    i3 = 0;
                                } else {
                                    i3 = 8;
                                }
                                C786410Ut5.LJLLLLLL(i3, viewFindViewById);
                            }
                        }

                        public final void setDividerStartVisible(boolean z2) {
                            View viewFindViewById;
                            int i3;
                            View view = this.LL;
                            if (view != null && (viewFindViewById = view.findViewById(R.id.xcr)) != null) {
                                if (z2) {
                                    i3 = 0;
                                } else {
                                    i3 = 8;
                                }
                                C786410Ut5.LJLLLLLL(i3, viewFindViewById);
                            }
                        }

                        public final void setTextRes(Integer num) {
                            TextView textView;
                            if (num != null) {
                                int iIntValue = num.intValue();
                                View view = this.LL;
                                if (view != null && (textView = (TextView) view.findViewById(R.id.xcs)) != null) {
                                    textView.setText(getContext().getString(iIntValue));
                                }
                            }
                            this.LLILLJJLI = num;
                        }
                    };
                    r3.setTextRes(c19723912Ez2.LIZJ);
                    boolean z2 = true;
                    if (i != list.size() - 1) {
                        z = true;
                    } else {
                        z = false;
                    }
                    r3.setDividerEndVisible(z);
                    if (i == 0) {
                        z2 = false;
                    }
                    r3.setDividerStartVisible(z2);
                    View.OnClickListener aCListenerS110S0200000_6 = new ACListenerS110S0200000_6(c19723912Ez2, this, 42);
                    if (C1848410yCV.LIZ) {
                        aCListenerS110S0200000_6 = new f(aCListenerS110S0200000_6);
                    }
                    a aVar = new a(aCListenerS110S0200000_6);
                    if (C2213981Bky.LIZIZ.isOffline()) {
                        C2211941Bhg.LIZ.injectViewListener(r3);
                    }
                    r3.setOnClickListener(aVar);
                    LinearLayout linearLayout2 = this.LLILLJJLI;
                    if (linearLayout2 != 0) {
                        linearLayout2.addView(r3);
                    }
                    i = i2;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
        }
    }
}
