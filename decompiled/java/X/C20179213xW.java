package X;

import android.graphics.Bitmap;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.13xW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.edit.cover.manager.strategy.SmartCoverStrategy$extract$2", f = "SmartCoverStrategy.kt", l = {BaseNotice.RECOMMEND_LIVE, 123, 131, 148, 154}, m = "invokeSuspend")
public final class C20179213xW extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Bitmap>, Object> {
    public Object LL;
    public Object LLILLJJLI;
    public Object LLILLL;
    public Object LLILZ;
    public Object LLILZIL;
    public C099F LLILZLL;
    public C1DEV LLIZ;
    public long LLIZLLLIL;
    public long LLJ;
    public int LLJI;
    public int LLJIJIL;
    public /* synthetic */ Object LLJILJIL;
    public final /* synthetic */ C20179313xX LLJILJILJ;
    public final /* synthetic */ C1457070o1J LLJILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20179213xW(C20179313xX c20179313xX, C1457070o1J c1457070o1J, InterfaceC1364105Vn<? super C20179213xW> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLJILJILJ = c20179313xX;
        this.LLJILLL = c1457070o1J;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C20179213xW c20179213xW = new C20179213xW(this.LLJILJILJ, this.LLJILLL, interfaceC1364105Vn);
        c20179213xW.LLJILJIL = obj;
        return c20179213xW;
    }

    /* JADX WARN: Removed duplicated region for block: B:117:0x02e8  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01c2 A[Catch: Exception -> 0x027f, LOOP:1: B:51:0x01bc->B:53:0x01c2, LOOP_END, TryCatch #7 {Exception -> 0x027f, blocks: (B:50:0x01b8, B:51:0x01bc, B:53:0x01c2, B:54:0x01cd), top: B:139:0x01b8 }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01fe A[Catch: Exception -> 0x027d, TryCatch #8 {Exception -> 0x027d, blocks: (B:57:0x01e5, B:68:0x0226, B:70:0x022a, B:71:0x022c, B:60:0x01fe, B:62:0x0208, B:63:0x020d, B:66:0x0220), top: B:141:0x01e5 }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x022a A[Catch: Exception -> 0x027d, TryCatch #8 {Exception -> 0x027d, blocks: (B:57:0x01e5, B:68:0x0226, B:70:0x022a, B:71:0x022c, B:60:0x01fe, B:62:0x0208, B:63:0x020d, B:66:0x0220), top: B:141:0x01e5 }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0294 A[Catch: Exception -> 0x02a0, LOOP:3: B:87:0x028e->B:89:0x0294, LOOP_END, TryCatch #5 {Exception -> 0x02a0, blocks: (B:86:0x028a, B:87:0x028e, B:89:0x0294, B:90:0x029f), top: B:135:0x028a }] */
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
    public final java.lang.Object invokeSuspend(java.lang.Object r33) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 770
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20179213xW.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Bitmap> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
