package X;

import com.bytedance.android.livesdk.guide.model.TaskInfoResponse;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.01Mv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.bytedance.android.livesdk.impl.revenue.strategy.util.TaskApiUtilsKt$requestTaskInfoInternal$finalResolve$1", f = "TaskApiUtils.kt", l = {}, m = "invokeSuspend")
public final class C322301Mv extends C09AX implements InterfaceC1631620sYq<Integer, C470590Icr<TaskInfoResponse.Data>, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ int LL;
    public /* synthetic */ C470590Icr LLILLJJLI;
    public final /* synthetic */ InterfaceC1631620sYq<Integer, String, TaskInfoResponse.Data, Unit> LLILLL;
    public final /* synthetic */ Function2<Integer, Throwable, Unit> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C322301Mv(InterfaceC1631620sYq<? super Integer, ? super String, ? super TaskInfoResponse.Data, Unit> interfaceC1631620sYq, Function2<? super Integer, ? super Throwable, Unit> function2, InterfaceC1364105Vn<? super C322301Mv> interfaceC1364105Vn) {
        super(3, interfaceC1364105Vn);
        this.LLILLL = interfaceC1631620sYq;
        this.LLILZ = function2;
    }

    /* JADX WARN: Multi-variable type inference failed */
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
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        String str;
        C1C7U.LIZ("TaskApiUtilsKt@ac6a.requestTaskInfoInternal$finalResolve$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        int i = this.LL;
        C470590Icr c470590Icr = this.LLILLJJLI;
        if (c470590Icr != null) {
            obj2 = c470590Icr.data;
        } else {
            obj2 = null;
        }
        String str2 = CardStruct.IStatusCode.DEFAULT;
        if (obj2 != null) {
            InterfaceC1631620sYq<Integer, String, TaskInfoResponse.Data, Unit> interfaceC1631620sYq = this.LLILLL;
            Integer numLJ = C2286608xc.LJ(i);
            String str3 = c470590Icr.LIZIZ;
            if (str3 != null) {
                str2 = str3;
            }
            interfaceC1631620sYq.invoke(numLJ, str2, c470590Icr.data);
        } else {
            Function2<Integer, Throwable, Unit> function2 = this.LLILZ;
            Integer numLJ2 = C2286608xc.LJ(i);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("The response of task info request is empty, log_id: ");
            if (c470590Icr != null && (str = c470590Icr.LIZIZ) != null) {
                str2 = str;
            }
            sbLIZ.append(str2);
            function2.invoke(numLJ2, new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ)));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("TaskApiUtilsKt@ac6a.requestTaskInfoInternal$finalResolve$1");
        return unit;
    }

    @Override // X.InterfaceC1631620sYq
    public final Object invoke(Integer num, C470590Icr<TaskInfoResponse.Data> c470590Icr, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        int iIntValue = num.intValue();
        C322301Mv c322301Mv = new C322301Mv(this.LLILLL, this.LLILZ, interfaceC1364105Vn);
        c322301Mv.LL = iIntValue;
        c322301Mv.LLILLJJLI = c470590Icr;
        return c322301Mv.invokeSuspend(Unit.LIZ);
    }
}
