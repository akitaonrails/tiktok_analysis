package X;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.fragment.app.Fragment;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0H27, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0H27 extends C214906198m implements ViewTreeObserver.OnGlobalLayoutListener {
    public final View LL;
    public final Context LLILLJJLI;
    public final int LLILLL;
    public Boolean LLILZIL;
    public Fragment LLIZ;
    public final Rect LLILZ = new Rect();
    public boolean LLILZLL = true;

    /* JADX WARN: Type inference failed for: r0v21, types: [X.0H28, androidx.fragment.app.Fragment] */
    /* JADX WARN: Type inference failed for: r0v22, types: [X.0H28, androidx.fragment.app.Fragment] */
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
    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        if (this.LLILZLL) {
            this.LLILZLL = false;
            return;
        }
        this.LLILZ.setEmpty();
        getContentView().getWindowVisibleDisplayFrame(this.LLILZ);
        int iLIZ = C497820Jfg.LIZ(this.LLILLJJLI) - this.LLILZ.bottom;
        boolean z = iLIZ > this.LLILLL;
        int height = this.LL.getHeight();
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("sch: ");
        sbLIZ.append(C497820Jfg.LIZ(this.LLILLJJLI));
        sbLIZ.append(", rb: ");
        sbLIZ.append(this.LLILZ.bottom);
        sbLIZ.append(", keyboardheight: ");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", opened: ");
        sbLIZ.append(z);
        C2188811AlT.LIZIZ(sbLIZ);
        if (Intrinsics.LJFF(Boolean.valueOf(z), this.LLILZIL)) {
            return;
        }
        this.LLILZIL = Boolean.valueOf(z);
        if (z) {
            ?? r0 = this.LLIZ;
            if (r0 != 0) {
                r0.uj(height, iLIZ);
                return;
            }
            return;
        }
        ?? r02 = this.LLIZ;
        if (r02 != 0) {
            r02.LLIIIZ();
        }
    }

    public C0H27(Context context, View view) {
        this.LL = view;
        this.LLILLJJLI = context;
        this.LLILLL = C497820Jfg.LIZ(context) / 4;
        setContentView(new View(context));
        setWidth(0);
        setHeight(-1);
        setBackgroundDrawable(new ColorDrawable(0));
        setSoftInputMode(16);
        setInputMethodMode(1);
    }
}
