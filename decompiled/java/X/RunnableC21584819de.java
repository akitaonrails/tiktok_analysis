package X;

import android.view.View;
import com.bytedance.tux.behavior.TopSheetBehavior;

/* JADX INFO: renamed from: X.19de, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class RunnableC21584819de implements Runnable {
    public final View LL;
    public int LLILLJJLI;
    public boolean LLILLL;
    public final /* synthetic */ TopSheetBehavior<V> LLILZ;

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
        C1C7U.LIZ("TopSheetBehavior$SettleRunnable@bed6.run");
        try {
            C21586019dq c21586019dq = this.LLILZ.LJIILL;
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
        C1C7U.LIZIZ("TopSheetBehavior$SettleRunnable@bed6.run");
    }

    public RunnableC21584819de(TopSheetBehavior topSheetBehavior, View view, int i) {
        this.LLILZ = topSheetBehavior;
        this.LL = view;
        this.LLILLJJLI = i;
    }
}
