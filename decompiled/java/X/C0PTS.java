package X;

import Y.ARunnableS79S0200000_10;
import android.os.Handler;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.reflect.Field;
import java.util.Set;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0PTS, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0PTS extends C09AY implements Function0<RecyclerView.ViewHolder> {
    public final /* synthetic */ C0PTR<T> LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ C0PTW<T> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0PTS(C0PTR<T> c0ptr, int i, int i2, C0PTW<T> c0ptw) {
        super(0);
        this.LL = c0ptr;
        this.LLILLJJLI = i;
        this.LLILLL = i2;
        this.LLILZ = c0ptw;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [T, androidx.recyclerview.widget.RecyclerView$ViewHolder] */
    /* JADX WARN: Type inference failed for: r4v1, types: [T, androidx.recyclerview.widget.RecyclerView$ViewHolder] */
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
    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ RecyclerView.ViewHolder invoke() throws IllegalAccessException {
        C259800zU c259800zU = new C259800zU();
        ?? recycledView = this.LL.LIZIZ.getRecycledViewPool().getRecycledView(this.LLILLJJLI);
        c259800zU.element = recycledView;
        if (recycledView == 0) {
            AbstractC21673619ry adapter = this.LL.LIZIZ.getAdapter();
            c259800zU.element = adapter != null ? adapter.createViewHolder(this.LL.LIZIZ, this.LLILLJJLI) : 0;
        }
        if (c259800zU.element != 0) {
            if (!C786410Ut5.u3().isInterrupted()) {
                if (!(((RecyclerView.ViewHolder) c259800zU.element).itemView.getLayoutParams() instanceof RecyclerView.LayoutParams)) {
                    View view = ((RecyclerView.ViewHolder) c259800zU.element).itemView;
                    RecyclerView.LayoutManager layoutManager = this.LL.LIZIZ.getLayoutManager();
                    C786410Ut5.W5(view, layoutManager != null ? layoutManager.generateDefaultLayoutParams() : null);
                }
                C0PTR<T> c0ptr = this.LL;
                if (c0ptr.LJIIIIZZ == null) {
                    c0ptr.LJIIIIZZ = C1970407ni.LIZ(((RecyclerView.ViewHolder) c259800zU.element).itemView.getLayoutParams(), "mViewHolder");
                }
                Field field = this.LL.LJIIIIZZ;
                if (field != null) {
                    field.set(((RecyclerView.ViewHolder) c259800zU.element).itemView.getLayoutParams(), c259800zU.element);
                }
                C0PTR<T> c0ptr2 = this.LL;
                if (c0ptr2.LJIIIZ == null) {
                    c0ptr2.LJIIIZ = C1970407ni.LIZ(c259800zU.element, "mPosition");
                }
                Field field2 = this.LL.LJIIIZ;
                if (field2 != null) {
                    field2.set(c259800zU.element, Integer.valueOf(this.LLILLL));
                }
                Set<Integer> set = C0PT7.LIZ;
                C0PT7.LIZ.add(Integer.valueOf(((RecyclerView.ViewHolder) c259800zU.element).itemView.hashCode()));
                this.LL.LIZLLL.invoke(c259800zU.element, Integer.valueOf(this.LLILLL));
                this.LLILZ.LIZJ = (RecyclerView.ViewHolder) c259800zU.element;
                if (!C786410Ut5.u3().isInterrupted()) {
                    return c259800zU.element;
                }
                C786410Ut5.LJJZZIII((Handler) this.LL.LIZ.getValue(), new ARunnableS79S0200000_10(this.LL, c259800zU, 83));
                return null;
            }
            C786410Ut5.LJJZZIII((Handler) this.LL.LIZ.getValue(), new ARunnableS79S0200000_10(this.LL, c259800zU, 82));
        }
        return null;
    }
}
