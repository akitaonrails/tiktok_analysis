package X;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;
import x5h.d;

/* JADX INFO: renamed from: X.0Mmk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.photo.processor.OptimizeTakePhotoProcessor$onProcess$2", f = "OptimizeTakePhotoProcessor.kt", l = {245, 282, 295, 296, 305, 311, 385, 405}, m = "invokeSuspend")
public final class C578640Mmk extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public Object LL;
    public Object LLILLJJLI;
    public Object LLILLL;
    public Object LLILZ;
    public Object LLILZIL;
    public Object LLILZLL;
    public Object LLIZ;
    public C099G LLIZLLLIL;
    public C259800zU LLJ;
    public long LLJI;
    public boolean LLJIJIL;
    public int LLJILJIL;
    public /* synthetic */ Object LLJILJILJ;
    public final /* synthetic */ d LLJILLL;
    public final /* synthetic */ C578760Mmw LLJJ;
    public final /* synthetic */ List<String> LLJJI;
    public final /* synthetic */ Function1<Boolean, Unit> LLJJIII;
    public final /* synthetic */ Function0<Unit> LLJJIJI;
    public final /* synthetic */ long LLJJIJIIJIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C578640Mmk(d dVar, C578760Mmw c578760Mmw, List<String> list, Function1<? super Boolean, Unit> function1, Function0<Unit> function0, long j, InterfaceC1364105Vn<? super C578640Mmk> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLJILLL = dVar;
        this.LLJJ = c578760Mmw;
        this.LLJJI = list;
        this.LLJJIII = function1;
        this.LLJJIJI = function0;
        this.LLJJIJIIJIL = j;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C578640Mmk c578640Mmk = new C578640Mmk(this.LLJILLL, this.LLJJ, this.LLJJI, this.LLJJIII, this.LLJJIJI, this.LLJJIJIIJIL, interfaceC1364105Vn);
        c578640Mmk.LLJILJILJ = obj;
        return c578640Mmk;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x02b8  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x02f9  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x031b  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x031f  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0321  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0323  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x037e  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x039f  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x03af  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x03b2  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x03b8  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x03bb  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x03be  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x03cb  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x03d1  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x04e9  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x04fd  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x074a  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x0757  */
    /* JADX WARN: Removed duplicated region for block: B:323:0x079e  */
    /* JADX WARN: Removed duplicated region for block: B:325:0x07a2  */
    /* JADX WARN: Removed duplicated region for block: B:331:0x07f5  */
    /* JADX WARN: Removed duplicated region for block: B:338:0x0842  */
    /* JADX WARN: Removed duplicated region for block: B:345:0x0885  */
    /* JADX WARN: Removed duplicated region for block: B:347:0x088b  */
    /* JADX WARN: Removed duplicated region for block: B:348:0x088e  */
    /* JADX WARN: Removed duplicated region for block: B:352:0x08d9  */
    /* JADX WARN: Removed duplicated region for block: B:354:0x08e5  */
    /* JADX WARN: Removed duplicated region for block: B:361:0x0917  */
    /* JADX WARN: Removed duplicated region for block: B:365:0x092b  */
    /* JADX WARN: Removed duplicated region for block: B:419:0x0a66  */
    /* JADX WARN: Removed duplicated region for block: B:422:0x0a73  */
    /* JADX WARN: Removed duplicated region for block: B:424:0x0a7f  */
    /* JADX WARN: Removed duplicated region for block: B:429:0x0abc  */
    /* JADX WARN: Removed duplicated region for block: B:439:0x0add  */
    /* JADX WARN: Removed duplicated region for block: B:441:0x0ae2  */
    /* JADX WARN: Removed duplicated region for block: B:444:0x0afb  */
    /* JADX WARN: Removed duplicated region for block: B:447:0x0b3b  */
    /* JADX WARN: Removed duplicated region for block: B:450:0x0b8a  */
    /* JADX WARN: Removed duplicated region for block: B:452:0x0b8e  */
    /* JADX WARN: Removed duplicated region for block: B:453:0x0b91  */
    /* JADX WARN: Removed duplicated region for block: B:454:0x0b95  */
    /* JADX WARN: Removed duplicated region for block: B:455:0x0b98  */
    /* JADX WARN: Removed duplicated region for block: B:457:0x0b9e  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01d9  */
    /* JADX WARN: Type inference failed for: r5v25, types: [T, kotlin.Pair<java.lang.Integer, java.lang.Integer>] */
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
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r38) {
        /*
            Method dump skipped, instruction units count: 3018
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C578640Mmk.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public static final Object invokeSuspend$lambda$7$photoIntercept(Function0<Unit> function0, C578760Mmw c578760Mmw, String str, d dVar, Function1<? super Boolean, Unit> function1, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        return C23250099c.LJI(interfaceC1364105Vn, C2107708Nn.LIZ, new C578470MmT(function0, c578760Mmw, str, dVar, function1, null));
    }
}
