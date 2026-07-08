package X;

import android.view.View;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS570S0100000_26;

/* JADX INFO: renamed from: X.0uaK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1709420uaK extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C1710280ubi LL;
    public final /* synthetic */ C1165604hC LLILLJJLI;
    public final /* synthetic */ C1709140uZs LLILLL;
    public final /* synthetic */ int LLILZ;
    public final /* synthetic */ C995290c0V LLILZIL;
    public final /* synthetic */ C1709570uaZ LLILZLL;
    public final /* synthetic */ Function0<Unit> LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1709420uaK(C1710280ubi c1710280ubi, C1165604hC c1165604hC, C1709140uZs c1709140uZs, int i, C995290c0V c995290c0V, C1709570uaZ c1709570uaZ, AwS570S0100000_26 awS570S0100000_26) {
        super(0);
        this.LL = c1710280ubi;
        this.LLILLJJLI = c1165604hC;
        this.LLILLL = c1709140uZs;
        this.LLILZ = i;
        this.LLILZIL = c995290c0V;
        this.LLILZLL = c1709570uaZ;
        this.LLIZ = awS570S0100000_26;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [X.0uZu] */
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
    public final Unit invoke() {
        C1710280ubi c1710280ubi = this.LL;
        String str = this.LLILLJJLI.LIZ;
        if (str == null) {
            str = "";
        }
        final C1709140uZs c1709140uZs = this.LLILLL;
        final int i = this.LLILZ;
        final C995290c0V c995290c0V = this.LLILZIL;
        final C1709570uaZ c1709570uaZ = this.LLILZLL;
        final Function0<Unit> function0 = this.LLIZ;
        c1710280ubi.LIZ(str, new View.OnClickListener() { // from class: X.0uZu
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C1710110ubR.LIZ.LIZIZ("select_payment_method", c1709140uZs.LIZ, C2097908Jt.LIZJ(new Pair("index", Integer.valueOf(i))));
                c1709140uZs.LIZIZ(c995290c0V, c1709570uaZ, function0);
                C1708610uZ1.LIZIZ(c1709140uZs.LIZ.toString()).LJIIL("order_submit", "select_payment_method", Boolean.TRUE, C2097608Jq.LJ());
            }
        });
        return Unit.LIZ;
    }
}
