package X;

import com.ss.android.ugc.aweme.ecommerce.model.EnterContext;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.18Mt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.comment.EcSvProductCommentTopBarManager$fetchPanelProductInfo$3", f = "EcSvProductCommentTopBarManager.kt", l = {400, 466}, m = "invokeSuspend")
public final class C21272918Mt extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public Object LL;
    public int LLILLJJLI;
    public final /* synthetic */ List<String> LLILLL;
    public final /* synthetic */ C21272818Ms LLILZ;
    public final /* synthetic */ Map<String, EnterContext> LLILZIL;
    public final /* synthetic */ String LLILZLL;
    public final /* synthetic */ int LLIZ;
    public final /* synthetic */ long LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21272918Mt(List<String> list, C21272818Ms c21272818Ms, Map<String, EnterContext> map, String str, int i, long j, InterfaceC1364105Vn<? super C21272918Mt> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = list;
        this.LLILZ = c21272818Ms;
        this.LLILZIL = map;
        this.LLILZLL = str;
        this.LLIZ = i;
        this.LLIZLLLIL = j;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C21272918Mt(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    /* JADX WARN: Removed duplicated region for block: B:74:0x0170 A[PHI: r6
      0x0170: PHI (r6v11 java.lang.String) = (r6v5 java.lang.String), (r6v12 java.lang.String) binds: [B:73:0x016e, B:71:0x016b] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r29) {
        /*
            Method dump skipped, instruction units count: 684
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21272918Mt.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
