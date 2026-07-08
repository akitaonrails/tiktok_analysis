package X;

import com.ss.android.ugc.aweme.commercialize.ucp.impl.data.recommend.model.UcpRecommendationItem;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Czj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.commercialize.ucp.impl.ui.components.waterfall.WaterfallProgressiveSlotResolver$resolve$2", f = "WaterfallProgressiveSlotResolver.kt", l = {93, 102, 115, 120, 131}, m = "invokeSuspend")
public final class C331890Czj extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C331880Czi>, Object> {
    public C13E8 LL;
    public Object LLILLJJLI;
    public C118300cf LLILLL;
    public C013C LLILZ;
    public int LLILZIL;
    public /* synthetic */ Object LLILZLL;
    public final /* synthetic */ List<UcpRecommendationItem> LLIZ;
    public final /* synthetic */ Function2<UcpRecommendationItem, InterfaceC1364105Vn<? super C189200o6<UcpRecommendationItem>>, Object> LLIZLLLIL;
    public final /* synthetic */ Function2<List<? extends AbstractC331870Czh>, InterfaceC1364105Vn<? super Unit>, Object> LLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C331890Czj(List<UcpRecommendationItem> list, Function2<? super UcpRecommendationItem, ? super InterfaceC1364105Vn<? super C189200o6<UcpRecommendationItem>>, ? extends Object> function2, Function2<? super List<? extends AbstractC331870Czh>, ? super InterfaceC1364105Vn<? super Unit>, ? extends Object> function22, InterfaceC1364105Vn<? super C331890Czj> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLIZ = list;
        this.LLIZLLLIL = function2;
        this.LLJ = function22;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C331890Czj c331890Czj = new C331890Czj(this.LLIZ, this.LLIZLLLIL, this.LLJ, interfaceC1364105Vn);
        c331890Czj.LLILZLL = obj;
        return c331890Czj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:113:0x014a A[EDGE_INSN: B:113:0x014a->B:57:0x014a BREAK  A[LOOP:1: B:55:0x013e->B:114:0x013e], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00cf A[LOOP:0: B:36:0x00cf->B:49:0x010a, LOOP_START, PHI: r4
      0x00cf: PHI (r4v8 int) = (r4v7 int), (r4v12 int) binds: [B:29:0x00a4, B:49:0x010a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01df  */
    /* JADX WARN: Type inference failed for: r11v1, types: [int] */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v22 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x00ac -> B:11:0x0035). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x00c9 -> B:11:0x0035). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x00e3 -> B:11:0x0035). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:43:0x00f8 -> B:11:0x0035). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:86:0x01dd -> B:10:0x0032). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r26) {
        /*
            Method dump skipped, instruction units count: 629
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C331890Czj.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C331880Czi> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object LIZ(kotlin.jvm.functions.Function2 r3, java.util.List r4, X.C118300cf r5, X.C013C r6, X.C331890Czj r7) {
        /*
            int r2 = r5.element
            boolean r0 = r6.element
            if (r0 == 0) goto L1c
            int r1 = r4.size()
            r0 = 1
            if (r1 != r0) goto L1c
        Ld:
            java.util.List r0 = X.C331860Czg.LIZ(r2, r0, r4)
            java.lang.Object r1 = r3.invoke(r0, r7)
            java.lang.Object r0 = X.C099R.LJFF()
            if (r1 != r0) goto L1e
            return r1
        L1c:
            r0 = 0
            goto Ld
        L1e:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C331890Czj.LIZ(kotlin.jvm.functions.Function2, java.util.List, X.00cf, X.013C, X.0Czj):java.lang.Object");
    }
}
