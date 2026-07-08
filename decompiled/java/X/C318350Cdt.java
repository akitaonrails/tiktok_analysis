package X;

import com.ss.android.ugc.gamora.recorder.sticker.templateeffect.effectpanel.MyEffectsViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Cdt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.gamora.recorder.sticker.templateeffect.effectpanel.MyEffectsViewModel$fetchNetworkData$2", f = "MyEffectsViewModel.kt", l = {132, 133, 152, 153, 160, 162}, m = "invokeSuspend")
public final class C318350Cdt extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public Object LL;
    public Object LLILLJJLI;
    public Object LLILLL;
    public int LLILZ;
    public /* synthetic */ Object LLILZIL;
    public final /* synthetic */ MyEffectsViewModel LLILZLL;
    public final /* synthetic */ String LLIZ;
    public final /* synthetic */ String LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C318350Cdt(MyEffectsViewModel myEffectsViewModel, String str, String str2, InterfaceC1364105Vn<? super C318350Cdt> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZLL = myEffectsViewModel;
        this.LLIZ = str;
        this.LLIZLLLIL = str2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C318350Cdt c318350Cdt = new C318350Cdt(this.LLILZLL, this.LLIZ, this.LLIZLLLIL, interfaceC1364105Vn);
        c318350Cdt.LLILZIL = obj;
        return c318350Cdt;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0138 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0202 A[Catch: Exception -> 0x02a4, TryCatch #2 {Exception -> 0x02a4, blocks: (B:97:0x0263, B:98:0x0266, B:91:0x0244, B:92:0x0247, B:82:0x01f3, B:83:0x01f6, B:85:0x0202, B:86:0x0224, B:76:0x01dc, B:77:0x01df, B:72:0x01b7), top: B:107:0x0013 }] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0260  */
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
    public final java.lang.Object invokeSuspend(java.lang.Object r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 722
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C318350Cdt.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
