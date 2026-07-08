package X;

import android.view.View;
import com.ss.android.ugc.aweme.ecommerce.search.result.vertical.viewmodel.LiveVerticalViewModel;
import com.ss.android.ugc.aweme.search.model.SearchResultParam;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0QeX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.search.result.vertical.viewmodel.LiveVerticalViewModel$fetchData$1", f = "LiveVerticalViewModel.kt", l = {230}, m = "invokeSuspend")
public final class C675470QeX extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ JSONObject LLILLL;
    public final /* synthetic */ LiveVerticalViewModel LLILZ;
    public final /* synthetic */ SearchResultParam LLILZIL;
    public final /* synthetic */ String LLILZLL;
    public final /* synthetic */ View LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C675470QeX(JSONObject jSONObject, LiveVerticalViewModel liveVerticalViewModel, SearchResultParam searchResultParam, String str, View view, InterfaceC1364105Vn<? super C675470QeX> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = jSONObject;
        this.LLILZ = liveVerticalViewModel;
        this.LLILZIL = searchResultParam;
        this.LLILZLL = str;
        this.LLIZ = view;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C675470QeX c675470QeX = new C675470QeX(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, interfaceC1364105Vn);
        c675470QeX.LLILLJJLI = obj;
        return c675470QeX;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:121:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x02d6  */
    /* JADX WARN: Type inference failed for: r10v0, types: [X.0QER] */
    /* JADX WARN: Type inference failed for: r13v11 */
    /* JADX WARN: Type inference failed for: r13v12 */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v57 */
    /* JADX WARN: Type inference failed for: r1v58 */
    /* JADX WARN: Type inference failed for: r4v2, types: [X.0Qea] */
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
    public final java.lang.Object invokeSuspend(java.lang.Object r47) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 737
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C675470QeX.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
