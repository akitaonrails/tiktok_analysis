package X;

import com.ss.android.ugc.aweme.vibefeed.feed.viewmodel.VibeFeedEntranceViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0r5i, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
@C09DV(c = "com.ss.android.ugc.aweme.vibefeed.feed.viewmodel.VibeFeedEntranceViewModel$fetchVibeFeedConfig$1", f = "VibeFeedEntranceViewModel.kt", l = {184}, m = "invokeSuspend")
public final class C1575120r5i extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ VibeFeedEntranceViewModel LLILZIL;
    public final /* synthetic */ String LLILZLL;
    public final /* synthetic */ EnumC912680ZrG LLIZ;
    public final /* synthetic */ Function1<EnumC1575230r5t, Unit> LLIZLLLIL;
    public final /* synthetic */ boolean LLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1575120r5i(String str, String str2, VibeFeedEntranceViewModel vibeFeedEntranceViewModel, String str3, EnumC912680ZrG enumC912680ZrG, Function1<? super EnumC1575230r5t, Unit> function1, boolean z, InterfaceC1364105Vn<? super C1575120r5i> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = str;
        this.LLILZ = str2;
        this.LLILZIL = vibeFeedEntranceViewModel;
        this.LLILZLL = str3;
        this.LLIZ = enumC912680ZrG;
        this.LLIZLLLIL = function1;
        this.LLJ = z;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1575120r5i c1575120r5i = new C1575120r5i(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, interfaceC1364105Vn);
        c1575120r5i.LLILLJJLI = obj;
        return c1575120r5i;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:41|(1:43)(1:110)|44|(2:46|(3:102|(1:104)(2:105|(1:50)(1:108))|(1:52)(13:58|(2:89|(2:95|(1:101)(1:100))(1:94))(1:62)|63|(6:65|(1:67)(3:85|(1:87)|88)|68|(1:70)(3:81|(1:83)|84)|71|(1:73)(2:75|(1:80)(1:79)))|74|54|(1:56)|57|173|112|(6:114|(1:116)(1:117)|118|119|(3:121|(1:123)|124)(3:125|(1:127)|128)|(1:130)(2:131|(2:133|(4:142|143|146|(1:148))(6:136|(1:138)(1:139)|(1:141)(0)|143|146|(0)))))|(1:150)|(3:152|(1:154)|155)(0)))(0))(1:109)|53|54|(0)|57|173|112|(0)|(0)|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x033f, code lost:
    
        r1 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x0340, code lost:
    
        com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1);
        r0 = new X.C098200Yq(r1);
        X.C189200o6.m2constructorimpl(r0);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:114:0x029c A[Catch: all -> 0x033f, TryCatch #2 {all -> 0x033f, blocks: (B:112:0x0290, B:114:0x029c, B:118:0x02a3, B:121:0x02a9, B:124:0x02be, B:130:0x02da, B:131:0x02ea, B:133:0x02f4, B:136:0x02fc, B:143:0x030a, B:125:0x02c1, B:128:0x02d6), top: B:173:0x0290 }] */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0309  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0351  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x035a  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x035f  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x037b  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0131  */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v2, types: [X.05Vn, X.099V, java.util.concurrent.CancellationException, kotlin.coroutines.CoroutineContext] */
    /* JADX WARN: Type inference failed for: r12v4 */
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
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r28) {
        /*
            Method dump skipped, instruction units count: 951
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1575120r5i.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
