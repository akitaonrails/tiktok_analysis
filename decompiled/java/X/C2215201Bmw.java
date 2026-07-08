package X;

import android.app.Activity;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.aigc.AIGCPictureUploadHandler;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.1Bmw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.mvtemplate.aigc.AIGCPictureUploadHandler$continueRun$1", f = "AIGCPictureUploadHandler.kt", l = {285, 311}, m = "invokeSuspend")
public final class C2215201Bmw extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public DialogC1390150mHN LL;
    public Object LLILLJJLI;
    public float LLILLL;
    public long LLILZ;
    public int LLILZIL;
    public /* synthetic */ Object LLILZLL;
    public final /* synthetic */ AIGCPictureUploadHandler LLIZ;
    public final /* synthetic */ Activity LLIZLLLIL;
    public final /* synthetic */ long LLJ;
    public final /* synthetic */ List<String> LLJI;
    public final /* synthetic */ Function1<List<String>, Unit> LLJIJIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C2215201Bmw(AIGCPictureUploadHandler aIGCPictureUploadHandler, Activity activity, long j, List<String> list, Function1<? super List<String>, Unit> function1, InterfaceC1364105Vn<? super C2215201Bmw> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLIZ = aIGCPictureUploadHandler;
        this.LLIZLLLIL = activity;
        this.LLJ = j;
        this.LLJI = list;
        this.LLJIJIL = function1;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C2215201Bmw c2215201Bmw = new C2215201Bmw(this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI, this.LLJIJIL, interfaceC1364105Vn);
        c2215201Bmw.LLILZLL = obj;
        return c2215201Bmw;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x0171 A[Catch: CancellationException -> 0x025f, TryCatch #0 {CancellationException -> 0x025f, blocks: (B:45:0x0162, B:46:0x0165, B:48:0x0171, B:49:0x0173, B:52:0x0193, B:53:0x01a1, B:55:0x01a7, B:58:0x01af, B:60:0x01bd, B:62:0x01f4, B:66:0x0202, B:50:0x018e, B:10:0x0037, B:17:0x0096, B:19:0x009e, B:21:0x00a4, B:22:0x00d2, B:24:0x00d8, B:29:0x00eb, B:30:0x00ef, B:31:0x0100, B:33:0x0106, B:35:0x0116, B:38:0x011c, B:39:0x0120, B:40:0x012a, B:41:0x012b, B:12:0x0064), top: B:71:0x0013 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x018e A[Catch: CancellationException -> 0x025f, TryCatch #0 {CancellationException -> 0x025f, blocks: (B:45:0x0162, B:46:0x0165, B:48:0x0171, B:49:0x0173, B:52:0x0193, B:53:0x01a1, B:55:0x01a7, B:58:0x01af, B:60:0x01bd, B:62:0x01f4, B:66:0x0202, B:50:0x018e, B:10:0x0037, B:17:0x0096, B:19:0x009e, B:21:0x00a4, B:22:0x00d2, B:24:0x00d8, B:29:0x00eb, B:30:0x00ef, B:31:0x0100, B:33:0x0106, B:35:0x0116, B:38:0x011c, B:39:0x0120, B:40:0x012a, B:41:0x012b, B:12:0x0064), top: B:71:0x0013 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0193 A[Catch: CancellationException -> 0x025f, TryCatch #0 {CancellationException -> 0x025f, blocks: (B:45:0x0162, B:46:0x0165, B:48:0x0171, B:49:0x0173, B:52:0x0193, B:53:0x01a1, B:55:0x01a7, B:58:0x01af, B:60:0x01bd, B:62:0x01f4, B:66:0x0202, B:50:0x018e, B:10:0x0037, B:17:0x0096, B:19:0x009e, B:21:0x00a4, B:22:0x00d2, B:24:0x00d8, B:29:0x00eb, B:30:0x00ef, B:31:0x0100, B:33:0x0106, B:35:0x0116, B:38:0x011c, B:39:0x0120, B:40:0x012a, B:41:0x012b, B:12:0x0064), top: B:71:0x0013 }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01a7 A[Catch: CancellationException -> 0x025f, TryCatch #0 {CancellationException -> 0x025f, blocks: (B:45:0x0162, B:46:0x0165, B:48:0x0171, B:49:0x0173, B:52:0x0193, B:53:0x01a1, B:55:0x01a7, B:58:0x01af, B:60:0x01bd, B:62:0x01f4, B:66:0x0202, B:50:0x018e, B:10:0x0037, B:17:0x0096, B:19:0x009e, B:21:0x00a4, B:22:0x00d2, B:24:0x00d8, B:29:0x00eb, B:30:0x00ef, B:31:0x0100, B:33:0x0106, B:35:0x0116, B:38:0x011c, B:39:0x0120, B:40:0x012a, B:41:0x012b, B:12:0x0064), top: B:71:0x0013 }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01ad  */
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
    public final java.lang.Object invokeSuspend(java.lang.Object r25) {
        /*
            Method dump skipped, instruction units count: 624
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2215201Bmw.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
