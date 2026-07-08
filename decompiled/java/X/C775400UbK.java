package X;

import android.content.Context;
import android.os.Bundle;
import android.view.SurfaceView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0UbK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.ss.android.ugc.aweme.live.smoothhost.LivePreviewTabScene$initLivePreview$1$1", f = "LivePreviewTabScene.kt", l = {500}, m = "invokeSuspend")
public final class C775400UbK extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C782920UnS LL;
    public int LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ C782920UnS LLILZ;
    public final /* synthetic */ Context LLILZIL;
    public final /* synthetic */ SurfaceView LLILZLL;
    public final /* synthetic */ C19EG LLIZ;
    public final /* synthetic */ InterfaceC782930UnT LLIZLLLIL;
    public final /* synthetic */ Bundle LLJ;
    public final /* synthetic */ Function0<Unit> LLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C775400UbK(String str, C782920UnS c782920UnS, Context context, SurfaceView surfaceView, C19EG c19eg, InterfaceC782930UnT interfaceC782930UnT, Bundle bundle, Function0<Unit> function0, InterfaceC1364105Vn<? super C775400UbK> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = str;
        this.LLILZ = c782920UnS;
        this.LLILZIL = context;
        this.LLILZLL = surfaceView;
        this.LLIZ = c19eg;
        this.LLIZLLLIL = interfaceC782930UnT;
        this.LLJ = bundle;
        this.LLJI = function0;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C775400UbK(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
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
    public final java.lang.Object invokeSuspend(java.lang.Object r28) {
        /*
            Method dump skipped, instruction units count: 518
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C775400UbK.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
