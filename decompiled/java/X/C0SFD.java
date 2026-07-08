package X;

import android.text.Layout;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.Pair;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0SFD, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0SFD extends C09AY implements Function2<C0SJF, Boolean, Layout> {
    public final /* synthetic */ C718770SHj LL;
    public final /* synthetic */ Aweme LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ C259800zU<C718800SHm> LLILZ;
    public final /* synthetic */ C259800zU<Pair<Layout, Layout>> LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0SFD(C718770SHj c718770SHj, Aweme aweme, boolean z, C259800zU<C718800SHm> c259800zU, C259800zU<Pair<Layout, Layout>> c259800zU2) {
        super(2);
        this.LL = c718770SHj;
        this.LLILLJJLI = aweme;
        this.LLILLL = z;
        this.LLILZ = c259800zU;
        this.LLILZIL = c259800zU2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [android.text.Layout, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v6, types: [android.text.Layout, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v2, types: [T, kotlin.Pair] */
    /* JADX WARN: Type inference failed for: r2v1, types: [T, X.0SHm] */
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
        C0S64 c0s64;
        C0SJF c0sjf2 = c0sjf;
        boolean zBooleanValue = bool.booleanValue();
        C718770SHj c718770SHj = this.LL;
        Aweme aweme = this.LLILLJJLI;
        if (this.LLILLL) {
            c0s64 = c718770SHj.LLLLIIIILLL;
        } else {
            c0s64 = null;
        }
        ?? LJIILIIL = c718770SHj.LJIILIIL(c0sjf2, aweme, c0s64);
        C718770SHj c718770SHj2 = this.LL;
        ?? LJLL = c718770SHj2.LJLL(LJIILIIL, c718770SHj2.LLLFFI, this.LLILLL, this.LLILLJJLI, false, zBooleanValue);
        this.LLILZ.element = LJIILIIL;
        this.LLILZIL.element = LJLL;
        ?? second = LJLL.getSecond();
        if (second == 0) {
            return LJLL.getFirst();
        }
        return second;
    }
}
