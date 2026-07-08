package X;

import com.bytedance.android.live.effect.countdown.CountDownEffectViewModel;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0U4F, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.bytedance.android.live.effect.countdown.CountDownEffectViewModel$fetchEffectList$1", f = "CountDownEffectViewModel.kt", l = {LiveToolbarIconStyleSetting.COLORFUL_WITHOUT_TEXT, 37, 40, 41}, m = "invokeSuspend")
public final class C0U4F extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public Object LL;
    public Object LLILLJJLI;
    public Object LLILLL;
    public int LLILZ;
    public final /* synthetic */ CountDownEffectViewModel LLILZIL;
    public final /* synthetic */ C0U4I<LiveEffect> LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0U4F(CountDownEffectViewModel countDownEffectViewModel, C0U4I<LiveEffect> c0u4i, InterfaceC1364105Vn<? super C0U4F> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZIL = countDownEffectViewModel;
        this.LLILZLL = c0u4i;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0U4F(this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00a6 A[Catch: Exception -> 0x0156, TryCatch #0 {Exception -> 0x0156, blocks: (B:44:0x010a, B:45:0x010d, B:48:0x011f, B:50:0x0128, B:51:0x0137, B:53:0x013f, B:54:0x014e, B:36:0x00de, B:37:0x00e1, B:39:0x00e9, B:46:0x0115, B:47:0x0118, B:23:0x0096, B:24:0x0099, B:25:0x00a0, B:27:0x00a6, B:32:0x00c7, B:15:0x005d, B:17:0x007a), top: B:62:0x0015 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00c7 A[Catch: Exception -> 0x0156, TRY_ENTER, TryCatch #0 {Exception -> 0x0156, blocks: (B:44:0x010a, B:45:0x010d, B:48:0x011f, B:50:0x0128, B:51:0x0137, B:53:0x013f, B:54:0x014e, B:36:0x00de, B:37:0x00e1, B:39:0x00e9, B:46:0x0115, B:47:0x0118, B:23:0x0096, B:24:0x0099, B:25:0x00a0, B:27:0x00a6, B:32:0x00c7, B:15:0x005d, B:17:0x007a), top: B:62:0x0015 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00e9 A[Catch: Exception -> 0x0156, TryCatch #0 {Exception -> 0x0156, blocks: (B:44:0x010a, B:45:0x010d, B:48:0x011f, B:50:0x0128, B:51:0x0137, B:53:0x013f, B:54:0x014e, B:36:0x00de, B:37:0x00e1, B:39:0x00e9, B:46:0x0115, B:47:0x0118, B:23:0x0096, B:24:0x0099, B:25:0x00a0, B:27:0x00a6, B:32:0x00c7, B:15:0x005d, B:17:0x007a), top: B:62:0x0015 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0128 A[Catch: Exception -> 0x0156, TryCatch #0 {Exception -> 0x0156, blocks: (B:44:0x010a, B:45:0x010d, B:48:0x011f, B:50:0x0128, B:51:0x0137, B:53:0x013f, B:54:0x014e, B:36:0x00de, B:37:0x00e1, B:39:0x00e9, B:46:0x0115, B:47:0x0118, B:23:0x0096, B:24:0x0099, B:25:0x00a0, B:27:0x00a6, B:32:0x00c7, B:15:0x005d, B:17:0x007a), top: B:62:0x0015 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0137 A[Catch: Exception -> 0x0156, TryCatch #0 {Exception -> 0x0156, blocks: (B:44:0x010a, B:45:0x010d, B:48:0x011f, B:50:0x0128, B:51:0x0137, B:53:0x013f, B:54:0x014e, B:36:0x00de, B:37:0x00e1, B:39:0x00e9, B:46:0x0115, B:47:0x0118, B:23:0x0096, B:24:0x0099, B:25:0x00a0, B:27:0x00a6, B:32:0x00c7, B:15:0x005d, B:17:0x007a), top: B:62:0x0015 }] */
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
    public final java.lang.Object invokeSuspend(java.lang.Object r19) {
        /*
            Method dump skipped, instruction units count: 365
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0U4F.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
