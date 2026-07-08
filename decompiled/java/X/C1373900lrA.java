package X;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0lrA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1373900lrA extends RelativeLayout {
    public static final /* synthetic */ int LLILZ = 0;
    public final TuxTextView LL;
    public final TuxIconView LLILLJJLI;
    public final TuxIconView LLILLL;

    public C1373900lrA(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C786410Ut5.LJLLJ(getContext(), R.layout.b7y, this);
        int iLIZJ = (int) C12ES.LIZJ(16.0f, getContext());
        int iLIZJ2 = (int) C12ES.LIZJ(14.0f, getContext());
        setPadding(iLIZJ, iLIZJ2, iLIZJ, iLIZJ2);
        setGravity(16);
        this.LL = (TuxTextView) findViewById(R.id.desc);
        this.LLILLL = (TuxIconView) findViewById(R.id.l8u);
        this.LLILLJJLI = (TuxIconView) findViewById(R.id.jxe);
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
    public final void LIZ(C1374250lrj c1374250lrj, boolean z) {
        TuxIconView tuxIconView = this.LLILLJJLI;
        if (tuxIconView != null) {
            tuxIconView.setIconRes(c1374250lrj.LIZ);
        }
        TuxTextView tuxTextView = this.LL;
        if (tuxTextView != null) {
            String str = c1374250lrj.LIZLLL;
            int length = str.length();
            CharSequence text = str;
            if (length == 0) {
                text = getContext().getResources().getText(c1374250lrj.LIZIZ);
            }
            tuxTextView.setText(text);
        }
        if (z) {
            TuxIconView tuxIconView2 = this.LLILLJJLI;
            if (tuxIconView2 != null) {
                tuxIconView2.setTintColorRes(R.attr.a1h);
            }
            TuxTextView tuxTextView2 = this.LL;
            if (tuxTextView2 != null) {
                tuxTextView2.setTextColorRes(R.attr.a1h);
            }
            TuxIconView tuxIconView3 = this.LLILLL;
            if (tuxIconView3 != null) {
                tuxIconView3.setTintColorRes(R.attr.a1h);
                return;
            }
            return;
        }
        TuxIconView tuxIconView4 = this.LLILLJJLI;
        if (tuxIconView4 != null) {
            tuxIconView4.setTintColorRes(R.attr.a1p);
        }
        TuxTextView tuxTextView3 = this.LL;
        if (tuxTextView3 != null) {
            tuxTextView3.setTextColorRes(R.attr.a1p);
        }
        TuxIconView tuxIconView5 = this.LLILLL;
        if (tuxIconView5 == null) {
            return;
        }
        tuxIconView5.setTintColorRes(R.attr.a1p);
    }
}
