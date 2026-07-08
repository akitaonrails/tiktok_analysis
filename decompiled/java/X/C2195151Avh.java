package X;

import android.app.Activity;
import android.app.Application;
import android.net.Uri;
import com.ss.android.ugc.aweme.minis.common.SchemaParserData;
import com.ss.android.ugc.aweme.minis.model.MinisMetaResp;
import com.ss.android.ugc.aweme.minis.service.MiniGameRenderServiceImpl;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.1Avh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
@C09DV(c = "com.ss.android.ugc.aweme.minis.service.MiniGameRenderServiceImpl$startRender$2", f = "MiniGameRenderServiceImpl.kt", l = {270, 525}, m = "invokeSuspend")
public final class C2195151Avh extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public long LL;
    public SchemaParserData LLILLJJLI;
    public Object LLILLL;
    public MinisMetaResp LLILZ;
    public int LLILZIL;
    public final /* synthetic */ C2195011AvT LLILZLL;
    public final /* synthetic */ MiniGameRenderServiceImpl LLIZ;
    public final /* synthetic */ Application LLIZLLLIL;
    public final /* synthetic */ String LLJ;
    public final /* synthetic */ Uri LLJI;
    public final /* synthetic */ boolean LLJIJIL;
    public final /* synthetic */ boolean LLJILJIL;
    public final /* synthetic */ C2196371Axf LLJILJILJ;
    public final /* synthetic */ long LLJILLL;
    public final /* synthetic */ Activity LLJJ;
    public final /* synthetic */ String LLJJI;
    public final /* synthetic */ C1304490k3D LLJJIII;
    public final /* synthetic */ AtomicBoolean LLJJIJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2195151Avh(C2195011AvT c2195011AvT, MiniGameRenderServiceImpl miniGameRenderServiceImpl, Application application, String str, Uri uri, boolean z, boolean z2, C2196371Axf c2196371Axf, long j, Activity activity, String str2, C1304490k3D c1304490k3D, AtomicBoolean atomicBoolean, InterfaceC1364105Vn<? super C2195151Avh> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZLL = c2195011AvT;
        this.LLIZ = miniGameRenderServiceImpl;
        this.LLIZLLLIL = application;
        this.LLJ = str;
        this.LLJI = uri;
        this.LLJIJIL = z;
        this.LLJILJIL = z2;
        this.LLJILJILJ = c2196371Axf;
        this.LLJILLL = j;
        this.LLJJ = activity;
        this.LLJJI = str2;
        this.LLJJIII = c1304490k3D;
        this.LLJJIJI = atomicBoolean;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2195151Avh(this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI, this.LLJIJIL, this.LLJILJIL, this.LLJILJILJ, this.LLJILLL, this.LLJJ, this.LLJJI, this.LLJJIII, this.LLJJIJI, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:123:0x032d  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0339  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0348  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x036b  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0473  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x047b  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x047e  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x04b2  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x04c9  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x04cb  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0031  */
    /* JADX WARN: Type inference failed for: r11v7, types: [com.ss.android.ugc.aweme.minis.common.SchemaParserData] */
    /* JADX WARN: Type inference failed for: r12v5, types: [com.ss.android.ugc.aweme.minis.common.SchemaParserData] */
    /* JADX WARN: Type inference failed for: r13v1, types: [com.ss.android.ugc.aweme.minis.common.SchemaParserData] */
    /* JADX WARN: Type inference failed for: r1v116 */
    /* JADX WARN: Type inference failed for: r1v27 */
    /* JADX WARN: Type inference failed for: r1v28, types: [com.ss.android.ugc.aweme.minis.model.MinisPkgConfig] */
    /* JADX WARN: Type inference failed for: r23v4, types: [com.ss.android.ugc.aweme.minis.common.SchemaParserData] */
    /* JADX WARN: Type inference failed for: r24v2, types: [com.ss.android.ugc.aweme.minis.model.DebugResult] */
    /* JADX WARN: Type inference failed for: r26v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r27v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v10, types: [com.ss.android.ugc.aweme.minis.common.SchemaParserData] */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3, types: [com.ss.android.ugc.aweme.minis.common.SchemaParserData, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v17, types: [X.144b] */
    /* JADX WARN: Type inference failed for: r7v34 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8, types: [java.lang.String] */
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
    public final java.lang.Object invokeSuspend(java.lang.Object r35) {
        /*
            Method dump skipped, instruction units count: 1233
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2195151Avh.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
