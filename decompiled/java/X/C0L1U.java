package X;

import android.content.Intent;
import com.ss.android.ugc.aweme.api.pipeline.TemplateConsumeCoreParam;
import com.ss.android.ugc.aweme.creative.model.album.ImportVideoInfo;
import com.ss.android.ugc.aweme.edit.Cut2EditTransferModel;
import com.ss.android.ugc.aweme.services.external.ui.MediaChooseResultListener;
import com.ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0L1U, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.editcut.TemplateMediaChosenHandler$resolveMedia$2$5", f = "TemplateMediaChosenHandler.kt", l = {294, 305}, m = "invokeSuspend")
public final class C0L1U extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ List<ImportVideoInfo> LLILLL;
    public final /* synthetic */ C536210L1f LLILZ;
    public final /* synthetic */ Intent LLILZIL;
    public final /* synthetic */ Intent LLILZLL;
    public final /* synthetic */ C0L1W LLIZ;
    public final /* synthetic */ ArrayList<VideoSegment> LLIZLLLIL;
    public final /* synthetic */ Cut2EditTransferModel LLJ;
    public final /* synthetic */ long LLJI;
    public final /* synthetic */ String LLJIJIL;
    public final /* synthetic */ MediaChooseResultListener LLJILJIL;
    public final /* synthetic */ C532520KuY LLJILJILJ;
    public final /* synthetic */ long LLJILLL;
    public final /* synthetic */ TemplateConsumeCoreParam LLJJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0L1U(List<ImportVideoInfo> list, C536210L1f c536210L1f, Intent intent, Intent intent2, C0L1W c0l1w, ArrayList<VideoSegment> arrayList, Cut2EditTransferModel cut2EditTransferModel, long j, String str, MediaChooseResultListener mediaChooseResultListener, C532520KuY c532520KuY, long j2, TemplateConsumeCoreParam templateConsumeCoreParam, InterfaceC1364105Vn<? super C0L1U> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = list;
        this.LLILZ = c536210L1f;
        this.LLILZIL = intent;
        this.LLILZLL = intent2;
        this.LLIZ = c0l1w;
        this.LLIZLLLIL = arrayList;
        this.LLJ = cut2EditTransferModel;
        this.LLJI = j;
        this.LLJIJIL = str;
        this.LLJILJIL = mediaChooseResultListener;
        this.LLJILJILJ = c532520KuY;
        this.LLJILLL = j2;
        this.LLJJ = templateConsumeCoreParam;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C0L1U c0l1u = new C0L1U(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI, this.LLJIJIL, this.LLJILJIL, this.LLJILJILJ, this.LLJILLL, this.LLJJ, interfaceC1364105Vn);
        c0l1u.LLILLJJLI = obj;
        return c0l1u;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0040 A[PHI: r5
      0x0040: PHI (r5v3 ??) = (r5v4 ??), (r5v5 ??) binds: [B:9:0x0025, B:8:0x0023] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025 A[PHI: r1 r5
      0x0025: PHI (r1v26 boolean) = (r1v17 boolean), (r1v29 boolean) binds: [B:41:0x00e1, B:8:0x0023] A[DONT_GENERATE, DONT_INLINE]
      0x0025: PHI (r5v4 ??) = (r5v8 ??), (r5v9 ??) binds: [B:41:0x00e1, B:8:0x0023] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r2v5, types: [X.0L1f] */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r5v3, types: [int] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Boolean, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7, types: [java.lang.Object] */
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
    public final java.lang.Object invokeSuspend(java.lang.Object r23) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 328
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0L1U.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
