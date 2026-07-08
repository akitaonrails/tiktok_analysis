package X;

import com.bytedance.lynx.hybrid.ssp.base.SSPResponse;
import com.ss.android.ugc.aweme.pipo.hybrid.settings.PipoContainerSspConfig;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0pvv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
@C09DV(c = "com.ss.android.ugc.aweme.pipo.hybrid.ssp.PipoSspLightPrewarmExecutor$handleSspCallback$1", f = "PipoSspLightPrewarmExecutor.kt", l = {}, m = "invokeSuspend")
public final class C1530610pvv extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ List<SSPResponse.PreConnect> LLILLJJLI;
    public final /* synthetic */ C1530640pvy LLILLL;
    public final /* synthetic */ PipoContainerSspConfig LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ int LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1530610pvv(List<SSPResponse.PreConnect> list, C1530640pvy c1530640pvy, PipoContainerSspConfig pipoContainerSspConfig, String str, int i, InterfaceC1364105Vn<? super C1530610pvv> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = list;
        this.LLILLL = c1530640pvy;
        this.LLILZ = pipoContainerSspConfig;
        this.LLILZIL = str;
        this.LLILZLL = i;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1530610pvv c1530610pvv = new C1530610pvv(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
        c1530610pvv.LL = obj;
        return c1530610pvv;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x008d A[PHI: r2
      0x008d: PHI (r2v3 java.lang.String) = (r2v2 java.lang.String), (r2v2 java.lang.String), (r2v4 java.lang.String), (r2v2 java.lang.String) binds: [B:12:0x004a, B:14:0x0052, B:25:0x008b, B:23:0x0076] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 284
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1530610pvv.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
