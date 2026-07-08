package X;

import java.nio.ByteBuffer;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.151L, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
@C09DV(c = "com.bytedance.android.livesdk.game.broadcast.bgbroadcast.clientai.GameKeyTimeInferModule$startInference$1", f = "GameKeyTimeInferModule.kt", l = {200}, m = "invokeSuspend")
public final class C151L extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C151N LLILLJJLI;
    public final /* synthetic */ ByteBuffer LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ boolean LLILZIL;
    public final /* synthetic */ long LLILZLL;
    public final /* synthetic */ long LLIZ;
    public final /* synthetic */ ByteBuffer LLIZLLLIL;
    public final /* synthetic */ int LLJ;
    public final /* synthetic */ int LLJI;
    public final /* synthetic */ int LLJIJIL;
    public final /* synthetic */ AbstractC1273900jFs LLJILJIL;
    public final /* synthetic */ InterfaceC204502150i LLJILJILJ;
    public final /* synthetic */ AnonymousClass1517 LLJILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C151L(C151N c151n, ByteBuffer byteBuffer, String str, boolean z, long j, long j2, ByteBuffer byteBuffer2, int i, int i2, int i3, AbstractC1273900jFs abstractC1273900jFs, InterfaceC204502150i interfaceC204502150i, AnonymousClass1517 anonymousClass1517, InterfaceC1364105Vn<? super C151L> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c151n;
        this.LLILLL = byteBuffer;
        this.LLILZ = str;
        this.LLILZIL = z;
        this.LLILZLL = j;
        this.LLIZ = j2;
        this.LLIZLLLIL = byteBuffer2;
        this.LLJ = i;
        this.LLJI = i2;
        this.LLJIJIL = i3;
        this.LLJILJIL = abstractC1273900jFs;
        this.LLJILJILJ = interfaceC204502150i;
        this.LLJILLL = anonymousClass1517;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C151L(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI, this.LLJIJIL, this.LLJILJIL, this.LLJILJILJ, this.LLJILLL, interfaceC1364105Vn);
    }

    /* JADX WARN: Code restructure failed: missing block: B:279:0x040d, code lost:
    
        r1 = -1;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0311  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0320 A[Catch: all -> 0x0357, TryCatch #3 {all -> 0x0357, blocks: (B:148:0x02fc, B:151:0x0313, B:153:0x0320, B:155:0x0324, B:160:0x0330), top: B:275:0x02fc }] */
    /* JADX WARN: Removed duplicated region for block: B:158:0x032b  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x032e  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x033c  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01eb  */
    /* JADX WARN: Type inference failed for: r1v232, types: [float] */
    /* JADX WARN: Type inference failed for: r1v234, types: [float] */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16, types: [int] */
    /* JADX WARN: Type inference failed for: r2v19, types: [java.util.ArrayList, java.util.List<java.lang.Float>] */
    /* JADX WARN: Type inference failed for: r2v28 */
    /* JADX WARN: Type inference failed for: r2v29 */
    /* JADX WARN: Type inference failed for: r2v30 */
    /* JADX WARN: Type inference failed for: r2v31 */
    /* JADX WARN: Type inference failed for: r3v1, types: [float[]] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5, types: [float[]] */
    /* JADX WARN: Type inference failed for: r3v6, types: [com.bytedance.android.livesdk.livesetting.game.GameKeytimeRecognitionLiveSetting] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12, types: [int] */
    /* JADX WARN: Type inference failed for: r4v13, types: [com.bytedance.android.livesdk.game.broadcast.bgbroadcast.clientai.model.GameMomentResults, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v15, types: [float] */
    /* JADX WARN: Type inference failed for: r4v22 */
    /* JADX WARN: Type inference failed for: r4v23 */
    /* JADX WARN: Type inference failed for: r4v24 */
    /* JADX WARN: Type inference failed for: r4v25 */
    /* JADX WARN: Type inference failed for: r6v10, types: [float] */
    /* JADX WARN: Type inference failed for: r6v11, types: [float] */
    /* JADX WARN: Type inference failed for: r6v12, types: [float] */
    /* JADX WARN: Type inference failed for: r6v13, types: [float] */
    /* JADX WARN: Type inference failed for: r6v14, types: [float] */
    /* JADX WARN: Type inference failed for: r6v15, types: [float] */
    /* JADX WARN: Type inference failed for: r6v16, types: [float] */
    /* JADX WARN: Type inference failed for: r6v17, types: [float] */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v19 */
    /* JADX WARN: Type inference failed for: r6v2, types: [float] */
    /* JADX WARN: Type inference failed for: r6v20 */
    /* JADX WARN: Type inference failed for: r6v21 */
    /* JADX WARN: Type inference failed for: r6v22 */
    /* JADX WARN: Type inference failed for: r6v23 */
    /* JADX WARN: Type inference failed for: r6v24 */
    /* JADX WARN: Type inference failed for: r6v25 */
    /* JADX WARN: Type inference failed for: r6v3, types: [float] */
    /* JADX WARN: Type inference failed for: r6v4, types: [float] */
    /* JADX WARN: Type inference failed for: r6v46, types: [float] */
    /* JADX WARN: Type inference failed for: r6v47, types: [float] */
    /* JADX WARN: Type inference failed for: r6v48, types: [float] */
    /* JADX WARN: Type inference failed for: r6v49, types: [float] */
    /* JADX WARN: Type inference failed for: r6v5, types: [float] */
    /* JADX WARN: Type inference failed for: r6v50, types: [float] */
    /* JADX WARN: Type inference failed for: r6v51, types: [float] */
    /* JADX WARN: Type inference failed for: r6v52 */
    /* JADX WARN: Type inference failed for: r6v53 */
    /* JADX WARN: Type inference failed for: r6v54 */
    /* JADX WARN: Type inference failed for: r6v56 */
    /* JADX WARN: Type inference failed for: r6v57 */
    /* JADX WARN: Type inference failed for: r6v58 */
    /* JADX WARN: Type inference failed for: r6v59 */
    /* JADX WARN: Type inference failed for: r6v6, types: [float] */
    /* JADX WARN: Type inference failed for: r6v60 */
    /* JADX WARN: Type inference failed for: r6v61 */
    /* JADX WARN: Type inference failed for: r6v62 */
    /* JADX WARN: Type inference failed for: r6v63 */
    /* JADX WARN: Type inference failed for: r6v64 */
    /* JADX WARN: Type inference failed for: r6v65 */
    /* JADX WARN: Type inference failed for: r6v66 */
    /* JADX WARN: Type inference failed for: r6v7, types: [float] */
    /* JADX WARN: Type inference failed for: r6v8, types: [float] */
    /* JADX WARN: Type inference failed for: r6v9, types: [float] */
    /* JADX WARN: Type inference failed for: r7v16, types: [float] */
    /* JADX WARN: Type inference failed for: r7v17, types: [float] */
    /* JADX WARN: Type inference failed for: r7v19, types: [float] */
    /* JADX WARN: Type inference failed for: r7v20, types: [float] */
    /* JADX WARN: Type inference failed for: r7v21, types: [float] */
    /* JADX WARN: Type inference failed for: r7v22, types: [float] */
    /* JADX WARN: Type inference failed for: r7v27 */
    /* JADX WARN: Type inference failed for: r7v28 */
    /* JADX WARN: Type inference failed for: r7v29 */
    /* JADX WARN: Type inference failed for: r7v30 */
    /* JADX WARN: Type inference failed for: r7v31 */
    /* JADX WARN: Type inference failed for: r7v32 */
    /* JADX WARN: Type inference failed for: r8v2, types: [X.151N, java.lang.Object] */
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
    public final java.lang.Object invokeSuspend(java.lang.Object r32) {
        /*
            Method dump skipped, instruction units count: 1589
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C151L.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
