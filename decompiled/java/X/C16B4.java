package X;

import android.view.View;
import com.bytedance.tux.sheet.sheet.TuxSheetBehavior;

/* JADX INFO: renamed from: X.16B4, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C16B4 implements Runnable {
    public final View LL;
    public int LLILLJJLI;
    public boolean LLILLL;
    public final /* synthetic */ TuxSheetBehavior<V> LLILZ;

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
    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("TuxSheetBehavior$SettleRunnable@cf99.run");
        try {
            C21586019dq c21586019dq = this.LLILZ.LJIJJLI;
            if (c21586019dq == null || !c21586019dq.LJIIIIZZ()) {
                this.LLILZ.setStateInternal(this.LLILLJJLI);
            } else {
                this.LL.postOnAnimation(this);
            }
            this.LLILLL = false;
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("TuxSheetBehavior$SettleRunnable@cf99.run");
    }

    public C16B4(TuxSheetBehavior tuxSheetBehavior, View view, int i) {
        this.LLILZ = tuxSheetBehavior;
        this.LL = view;
        this.LLILLJJLI = i;
    }
}
