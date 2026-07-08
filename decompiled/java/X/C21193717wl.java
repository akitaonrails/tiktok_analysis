package X;

import com.ss.android.ugc.aweme.ecommercelive.common.biz.us.popcard.vo.UsPopupCardVO;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.17wl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommercelive.common.biz.us.popcard.request.UsPopCardRefreshManager$startRefresh$1", f = "UsPopCardRefreshManager.kt", l = {106, 116, 237}, m = "invokeSuspend")
public final class C21193717wl extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C259800zU LL;
    public C598730Ne3 LLILLJJLI;
    public Object LLILLL;
    public C259800zU LLILZ;
    public AbstractC21198517xX LLILZIL;
    public UsPopupCardVO LLILZLL;
    public int LLIZ;
    public /* synthetic */ Object LLIZLLLIL;
    public final /* synthetic */ long LLJ;
    public final /* synthetic */ String LLJI;
    public final /* synthetic */ C598730Ne3 LLJIJIL;
    public final /* synthetic */ long LLJILJIL;
    public final /* synthetic */ AbstractC21198517xX<?> LLJILJILJ;
    public final /* synthetic */ boolean LLJILLL;
    public final /* synthetic */ String LLJJ;
    public final /* synthetic */ C259800zU<UsPopupCardVO> LLJJI;
    public final /* synthetic */ String LLJJIII;
    public final /* synthetic */ int LLJJIJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21193717wl(long j, String str, C598730Ne3 c598730Ne3, long j2, AbstractC21198517xX<?> abstractC21198517xX, boolean z, String str2, C259800zU<UsPopupCardVO> c259800zU, String str3, int i, InterfaceC1364105Vn<? super C21193717wl> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLJ = j;
        this.LLJI = str;
        this.LLJIJIL = c598730Ne3;
        this.LLJILJIL = j2;
        this.LLJILJILJ = abstractC21198517xX;
        this.LLJILLL = z;
        this.LLJJ = str2;
        this.LLJJI = c259800zU;
        this.LLJJIII = str3;
        this.LLJJIJI = i;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C21193717wl c21193717wl = new C21193717wl(this.LLJ, this.LLJI, this.LLJIJIL, this.LLJILJIL, this.LLJILJILJ, this.LLJILLL, this.LLJJ, this.LLJJI, this.LLJJIII, this.LLJJIJI, interfaceC1364105Vn);
        c21193717wl.LLIZLLLIL = obj;
        return c21193717wl;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:15|(1:228)|16|226|17|224|18|(3:20|216|217)|26|(9:34|(1:36)(1:207)|(1:206)(1:40)|41|(1:43)(1:205)|44|(5:46|(1:48)(1:203)|(1:50)(1:202)|51|(6:53|(1:55)(1:201)|(1:57)(1:200)|58|(1:60)|(2:62|(4:64|(1:66)|67|(8:69|(1:71)|72|(1:74)(1:190)|75|(1:79)|80|(2:82|(1:84))(4:103|(9:105|(1:107)(1:130)|(1:109)(1:129)|(1:111)(1:128)|(1:113)(1:127)|114|(5:(3:117|(3:(1:126)(1:122)|123|(1:125)(1:231))|230)|(1:173)(1:137)|(1:172)(1:143)|144|(9:146|(1:148)(1:171)|(1:150)(1:170)|(1:152)(1:169)|(1:154)(1:168)|155|(4:(3:158|(3:(1:167)(1:163)|164|(1:166)(1:232))|233)|176|(0)(1:182)|(2:184|(1:186))(2:187|(1:189)))(0)|174|(1:178)))(0)|131|(0))|175|(0)(0)))))(5:191|(1:193)(1:199)|194|(1:196)(1:198)|197)))|204|(0)(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0097, code lost:
    
        r8 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00bd, code lost:
    
        r8 = e;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Path cross not found for [B:105:0x02dc, B:175:0x03ae], limit reached: 231 */
    /* JADX WARN: Path cross not found for [B:131:0x0332, B:116:0x0302], limit reached: 231 */
    /* JADX WARN: Path cross not found for [B:146:0x0352, B:175:0x03ae], limit reached: 231 */
    /* JADX WARN: Path cross not found for [B:174:0x03ac, B:157:0x0378], limit reached: 231 */
    /* JADX WARN: Path cross not found for [B:175:0x03ae, B:146:0x0352], limit reached: 231 */
    /* JADX WARN: Path cross not found for [B:178:0x03b3, B:175:0x03ae], limit reached: 231 */
    /* JADX WARN: Path cross not found for [B:204:0x0467, B:46:0x00ea], limit reached: 231 */
    /* JADX WARN: Path cross not found for [B:204:0x0467, B:53:0x0104], limit reached: 231 */
    /* JADX WARN: Removed duplicated region for block: B:11:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0352  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x03c2  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x03e3  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0407  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x029c  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x02bc  */
    /* JADX WARN: Type inference failed for: r4v1, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v21, types: [T, com.ss.android.ugc.aweme.ecommercelive.common.biz.us.popcard.vo.UsPopupCardVO] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:94:0x02b4 -> B:8:0x0023). Please report as a decompilation issue!!! */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r76) {
        /*
            Method dump skipped, instruction units count: 1204
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21193717wl.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
