package X;

import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS248S0000000_14;
import kotlin.jvm.internal.AwS380S0200000_14;
import njp.a;

/* JADX INFO: renamed from: X.0YP0, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.bytedance.im.core.internal.link.usecase.sendmsg.PrepareLocalMessageForSendKt$pullGroupConv$conv$1", f = "PrepareLocalMessageForSend.kt", l = {519}, m = "invokeSuspend")
public final class C0YP0 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C0Y8T>, Object> {
    public InterfaceC866720XzK LL;
    public int LLILLJJLI;
    public final /* synthetic */ C0YEM LLILLL;
    public final /* synthetic */ InterfaceC866720XzK LLILZ;
    public final /* synthetic */ long LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0YP0(C0YEM c0yem, InterfaceC866720XzK interfaceC866720XzK, long j, InterfaceC1364105Vn<? super C0YP0> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c0yem;
        this.LLILZ = interfaceC866720XzK;
        this.LLILZIL = j;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0YP0(this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [X.0Y0o, X.0YLm] */
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
        C1C7U.LIZ("PrepareLocalMessageForSendKt@1a7d.pullGroupConv$conv$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLJJLI;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            final C0YEM c0yem = this.LLILLL;
            InterfaceC866720XzK interfaceC866720XzK = this.LLILZ;
            long j = this.LLILZIL;
            this.LL = interfaceC866720XzK;
            this.LLILLJJLI = 1;
            final C2252611DEt c2252611DEt = new C2252611DEt(1, C099M.LIZLLL(this));
            c2252611DEt.LJIJJ();
            ?? r4 = new InterfaceC867280Y0o(c0yem, c2252611DEt) { // from class: X.0YLm
                public final C0YEM LL;
                public final InterfaceC20236714Gf<C0Y8T> LLILLJJLI;
                public final AtomicBoolean LLILLL = new AtomicBoolean(false);

                @Override // X.InterfaceC868050Y3n
                public final void LJJJJJL(C0Y8T c0y8t) {
                }

                @Override // X.InterfaceC868050Y3n
                public final void LJJLIIIJ(C0Y8T c0y8t) {
                }

                @Override // X.InterfaceC868050Y3n
                public final void LJJLJLI(List<C0YAE> list) {
                }

                @Override // X.InterfaceC868050Y3n
                public final void LJJLL(List<C0YAE> list) {
                }

                @Override // X.InterfaceC868050Y3n
                public final void LJJZZI(List<C0YAE> list) {
                }

                @Override // X.InterfaceC868050Y3n
                public final void LJLI(String str, List<C0YAE> list) {
                }

                @Override // X.InterfaceC868050Y3n
                public final void LJLILLLLZI(C0Y8T c0y8t) {
                }

                @Override // X.InterfaceC868050Y3n
                public final void LJLJI(int i2, C0Y8T c0y8t) {
                }

                @Override // X.InterfaceC868050Y3n
                public final void LJZI(C0Y8T c0y8t) {
                }

                @Override // X.InterfaceC868050Y3n
                public final void LLIIII(int i2, String str) {
                }

                @Override // X.InterfaceC868050Y3n
                public final void LLIILZL(int i2, String str, List list) {
                }

                @Override // X.InterfaceC868050Y3n
                public final int LLLIIII() {
                    return 0;
                }

                @Override // X.InterfaceC867280Y0o
                public final void LLLIZZ(Map<String, C0Y8T> map) {
                }

                @Override // X.InterfaceC868050Y3n
                public final void LJLL(C1711306n1 c1711306n1) {
                    if (!this.LLILLL.compareAndSet(false, true)) {
                        return;
                    }
                    this.LL.LJIIZILJ().LIZLLL().LIZ().LJJII(this);
                    if (!this.LLILLJJLI.isActive()) {
                        return;
                    }
                    if (c1711306n1 != null && c1711306n1.LIZIZ != null) {
                        this.LLILLJJLI.LJJIFFI(AFwS248S0000000_14.get$arr$(568), c1711306n1.LIZIZ);
                        return;
                    }
                    this.LL.LIZLLL().LJIIIIZZ("PrepareLocalMessageForSend", "onSyncConversation, conversation is null", null);
                    InterfaceC20236714Gf<C0Y8T> interfaceC20236714Gf = this.LLILLJJLI;
                    C0YMW c0ymw = C0YMW.newBuilder().LIZ;
                    c0ymw.code = -1017;
                    C098200Yq c098200Yq = new C098200Yq(new C872730YLn(c0ymw));
                    C189200o6.m2constructorimpl(c098200Yq);
                    interfaceC20236714Gf.resumeWith(c098200Yq);
                }

                {
                    this.LL = c0yem;
                    this.LLILLJJLI = c2252611DEt;
                }
            };
            interfaceC866720XzK.LJJLIIIJILLIZJL(r4);
            c2252611DEt.LJJII(new AwS380S0200000_14(interfaceC866720XzK, (C872720YLm) r4, 133));
            interfaceC866720XzK.LJ(j, "send_msg");
            obj = c2252611DEt.LJIJ();
            if (obj == C099R.LJFF()) {
                C099Q.LIZJ(this);
            }
            if (obj == objLJFF) {
                C1C7U.LIZIZ("PrepareLocalMessageForSendKt@1a7d.pullGroupConv$conv$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("PrepareLocalMessageForSendKt@1a7d.pullGroupConv$conv$1");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C0Y8T> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
