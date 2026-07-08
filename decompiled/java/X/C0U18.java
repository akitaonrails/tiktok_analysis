package X;

import com.bytedance.android.live.effect.karaoke.viewmodels.KaraokeViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0U18, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.bytedance.android.live.effect.karaoke.viewmodels.KaraokeViewModel$handleSongUserAction$2", f = "KaraokeViewModel.kt", l = {1103, 1120, 1138, 1166, 1188, 1216, 1234, 1236, 1239, 1249, 1272, 1286, 1293, 1299}, m = "invokeSuspend")
public final class C0U18 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C765450U0x LLILLL;
    public final /* synthetic */ KaraokeViewModel LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0U18(KaraokeViewModel karaokeViewModel, C765450U0x c765450U0x, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c765450U0x;
        this.LLILZ = karaokeViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C0U18 c0u18 = new C0U18(this.LLILZ, this.LLILLL, interfaceC1364105Vn);
        c0u18.LLILLJJLI = obj;
        return c0u18;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:116:0x040b  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0498  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x049c  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x04ae  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0121 A[Catch: all -> 0x04d7, TryCatch #4 {all -> 0x04d7, blocks: (B:6:0x0021, B:132:0x0486, B:136:0x049f, B:7:0x0026, B:8:0x002b, B:10:0x0037, B:11:0x0043, B:13:0x0049, B:19:0x006a, B:23:0x00aa, B:28:0x00b9, B:29:0x00c1, B:34:0x0114, B:36:0x0121, B:37:0x012d, B:38:0x0135, B:91:0x02f5, B:103:0x0344, B:109:0x03a7, B:110:0x03c7, B:106:0x0381, B:42:0x0180, B:113:0x03cf, B:125:0x041f, B:142:0x04b6, B:143:0x04d6, B:128:0x045b, B:46:0x01de, B:48:0x01ec, B:49:0x01f2, B:50:0x01ff, B:55:0x0219, B:57:0x0221, B:62:0x0234, B:63:0x0244, B:70:0x025d, B:72:0x026b, B:73:0x0271, B:78:0x0297, B:80:0x02a2, B:81:0x02af, B:82:0x02b7, B:84:0x02c5, B:85:0x02cb, B:131:0x0480, B:27:0x00b6, B:33:0x0111, B:54:0x0216, B:61:0x0231, B:77:0x0294, B:90:0x02f2, B:112:0x03cc, B:130:0x047d, B:68:0x0257, B:18:0x0065), top: B:154:0x0016, inners: #7, #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0221 A[Catch: Exception -> 0x0256, all -> 0x04d7, TryCatch #7 {Exception -> 0x0256, blocks: (B:6:0x0021, B:50:0x01ff, B:55:0x0219, B:57:0x0221, B:62:0x0234, B:63:0x0244, B:54:0x0216, B:61:0x0231), top: B:154:0x0016, outer: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0244 A[Catch: Exception -> 0x0256, all -> 0x04d7, TryCatch #7 {Exception -> 0x0256, blocks: (B:6:0x0021, B:50:0x01ff, B:55:0x0219, B:57:0x0221, B:62:0x0234, B:63:0x0244, B:54:0x0216, B:61:0x0231), top: B:154:0x0016, outer: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x02a2 A[Catch: all -> 0x04d7, TryCatch #4 {all -> 0x04d7, blocks: (B:6:0x0021, B:132:0x0486, B:136:0x049f, B:7:0x0026, B:8:0x002b, B:10:0x0037, B:11:0x0043, B:13:0x0049, B:19:0x006a, B:23:0x00aa, B:28:0x00b9, B:29:0x00c1, B:34:0x0114, B:36:0x0121, B:37:0x012d, B:38:0x0135, B:91:0x02f5, B:103:0x0344, B:109:0x03a7, B:110:0x03c7, B:106:0x0381, B:42:0x0180, B:113:0x03cf, B:125:0x041f, B:142:0x04b6, B:143:0x04d6, B:128:0x045b, B:46:0x01de, B:48:0x01ec, B:49:0x01f2, B:50:0x01ff, B:55:0x0219, B:57:0x0221, B:62:0x0234, B:63:0x0244, B:70:0x025d, B:72:0x026b, B:73:0x0271, B:78:0x0297, B:80:0x02a2, B:81:0x02af, B:82:0x02b7, B:84:0x02c5, B:85:0x02cb, B:131:0x0480, B:27:0x00b6, B:33:0x0111, B:54:0x0216, B:61:0x0231, B:77:0x0294, B:90:0x02f2, B:112:0x03cc, B:130:0x047d, B:68:0x0257, B:18:0x0065), top: B:154:0x0016, inners: #7, #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0331  */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v14, types: [X.099G, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v26 */
    /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v30 */
    /* JADX WARN: Type inference failed for: r9v31 */
    /* JADX WARN: Type inference failed for: r9v32 */
    /* JADX WARN: Type inference failed for: r9v33 */
    /* JADX WARN: Type inference failed for: r9v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v9, types: [X.099G, java.lang.Object] */
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
    public final java.lang.Object invokeSuspend(java.lang.Object r23) {
        /*
            Method dump skipped, instruction units count: 1336
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0U18.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
