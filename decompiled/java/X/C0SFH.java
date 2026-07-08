package X;

import android.text.Layout;
import android.view.ViewGroup;
import kotlin.Pair;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0SFH, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0SFH extends C09AY implements Function2<C0SJF, Boolean, Layout> {
    public final /* synthetic */ C718780SHk LL;
    public final /* synthetic */ ViewGroup LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ Layout LLILZ;
    public final /* synthetic */ C259800zU<C718800SHm> LLILZIL;
    public final /* synthetic */ C259800zU<Pair<Layout, Layout>> LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0SFH(C718780SHk c718780SHk, ViewGroup viewGroup, String str, Layout layout, C259800zU<C718800SHm> c259800zU, C259800zU<Pair<Layout, Layout>> c259800zU2) {
        super(2);
        this.LL = c718780SHk;
        this.LLILLJJLI = viewGroup;
        this.LLILLL = str;
        this.LLILZ = layout;
        this.LLILZIL = c259800zU;
        this.LLILZLL = c259800zU2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [android.text.Layout, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v5, types: [android.text.Layout, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v1, types: [T, kotlin.Pair] */
    /* JADX WARN: Type inference failed for: r4v0, types: [T, X.0SHm] */
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
    @Override // kotlin.jvm.functions.Function2
    public final Layout invoke(C0SJF c0sjf, Boolean bool) {
        boolean zBooleanValue = bool.booleanValue();
        ?? LIZIZ = this.LL.LIZIZ(c0sjf);
        ?? LJI = this.LL.LJI(this.LLILLJJLI, this.LLILLL, this.LLILZ, LIZIZ, zBooleanValue);
        this.LLILZIL.element = LIZIZ;
        this.LLILZLL.element = LJI;
        ?? second = LJI.getSecond();
        if (second == 0) {
            return LJI.getFirst();
        }
        return second;
    }
}
