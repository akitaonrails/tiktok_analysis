package X;

import com.ss.android.ugc.aweme.ecommercelive.common.infra.popcard.vo.PopupCardVO;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.17wm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommercelive.common.infra.refresh.PopCardRefreshManager$startRefresh$1", f = "PopCardRefreshManager.kt", l = {99, 109, 227}, m = "invokeSuspend")
public final class C21193817wm extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C259800zU LL;
    public C598800NeA LLILLJJLI;
    public Object LLILLL;
    public C259800zU LLILZ;
    public AbstractC21198617xY LLILZIL;
    public int LLILZLL;
    public /* synthetic */ Object LLIZ;
    public final /* synthetic */ long LLIZLLLIL;
    public final /* synthetic */ String LLJ;
    public final /* synthetic */ C598800NeA LLJI;
    public final /* synthetic */ long LLJIJIL;
    public final /* synthetic */ AbstractC21198617xY<?> LLJILJIL;
    public final /* synthetic */ boolean LLJILJILJ;
    public final /* synthetic */ String LLJILLL;
    public final /* synthetic */ C259800zU<PopupCardVO> LLJJ;
    public final /* synthetic */ String LLJJI;
    public final /* synthetic */ int LLJJIII;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21193817wm(long j, String str, C598800NeA c598800NeA, long j2, AbstractC21198617xY<?> abstractC21198617xY, boolean z, String str2, C259800zU<PopupCardVO> c259800zU, String str3, int i, InterfaceC1364105Vn<? super C21193817wm> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLIZLLLIL = j;
        this.LLJ = str;
        this.LLJI = c598800NeA;
        this.LLJIJIL = j2;
        this.LLJILJIL = abstractC21198617xY;
        this.LLJILJILJ = z;
        this.LLJILLL = str2;
        this.LLJJ = c259800zU;
        this.LLJJI = str3;
        this.LLJJIII = i;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C21193817wm c21193817wm = new C21193817wm(this.LLIZLLLIL, this.LLJ, this.LLJI, this.LLJIJIL, this.LLJILJIL, this.LLJILJILJ, this.LLJILLL, this.LLJJ, this.LLJJI, this.LLJJIII, interfaceC1364105Vn);
        c21193817wm.LLIZ = obj;
        return c21193817wm;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:15|(1:222)|16|224|17|226|18|(3:20|212|213)|220|28|(9:36|(1:38)(1:203)|(1:202)(1:42)|43|(1:201)(1:47)|(5:(1:200)(1:54)|(7:(1:57)(1:198)|58|(1:60)(1:197)|61|(0)|(1:65)(1:196)|(4:68|(1:70)(1:195)|71|(8:73|(1:75)|76|(1:78)(1:194)|79|(1:83)|84|(2:86|(1:88))(4:107|(9:109|(1:111)(1:134)|(1:113)(1:133)|(1:115)(1:132)|(1:117)(1:131)|118|(5:(3:121|(3:(1:130)(1:126)|127|(1:129)(1:228))|229)|(1:177)(1:141)|(1:176)(1:147)|148|(9:150|(1:152)(1:175)|(1:154)(1:174)|(1:156)(1:173)|(1:158)(1:172)|159|(4:(3:162|(3:(1:171)(1:167)|168|(1:170)(1:231))|230)|180|(0)(1:186)|(2:188|(1:190))(2:191|(1:193)))(0)|178|(1:182)))(0)|135|(0))|179|(0)(0)))))|199|(0)(0)|(4:68|(0)(0)|71|(0)))|63|(0)(0)|(0))) */
    /* JADX WARN: Can't wrap try/catch for region: R(11:15|222|16|224|17|226|18|(3:20|212|213)|220|28|(9:36|(1:38)(1:203)|(1:202)(1:42)|43|(1:201)(1:47)|(5:(1:200)(1:54)|(7:(1:57)(1:198)|58|(1:60)(1:197)|61|(0)|(1:65)(1:196)|(4:68|(1:70)(1:195)|71|(8:73|(1:75)|76|(1:78)(1:194)|79|(1:83)|84|(2:86|(1:88))(4:107|(9:109|(1:111)(1:134)|(1:113)(1:133)|(1:115)(1:132)|(1:117)(1:131)|118|(5:(3:121|(3:(1:130)(1:126)|127|(1:129)(1:228))|229)|(1:177)(1:141)|(1:176)(1:147)|148|(9:150|(1:152)(1:175)|(1:154)(1:174)|(1:156)(1:173)|(1:158)(1:172)|159|(4:(3:162|(3:(1:171)(1:167)|168|(1:170)(1:231))|230)|180|(0)(1:186)|(2:188|(1:190))(2:191|(1:193)))(0)|178|(1:182)))(0)|135|(0))|179|(0)(0)))))|199|(0)(0)|(4:68|(0)(0)|71|(0)))|63|(0)(0)|(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0098, code lost:
    
        r1 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00be, code lost:
    
        r1 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00c2, code lost:
    
        r1 = e;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Path cross not found for [B:109:0x02c8, B:179:0x039a], limit reached: 228 */
    /* JADX WARN: Path cross not found for [B:135:0x031e, B:120:0x02ee], limit reached: 228 */
    /* JADX WARN: Path cross not found for [B:150:0x033e, B:179:0x039a], limit reached: 228 */
    /* JADX WARN: Path cross not found for [B:178:0x0398, B:161:0x0364], limit reached: 228 */
    /* JADX WARN: Path cross not found for [B:179:0x039a, B:150:0x033e], limit reached: 228 */
    /* JADX WARN: Path cross not found for [B:182:0x039f, B:179:0x039a], limit reached: 228 */
    /* JADX WARN: Path cross not found for [B:51:0x00f0, B:63:0x0112], limit reached: 228 */
    /* JADX WARN: Removed duplicated region for block: B:102:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x033e  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x03ae  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x03c6  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x03e1  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x03e5  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x011b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x028a  */
    /* JADX WARN: Type inference failed for: r0v3, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r13v0, types: [T, com.ss.android.ugc.aweme.ecommercelive.common.infra.popcard.vo.PopupCardVO] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:98:0x02a0 -> B:8:0x0023). Please report as a decompilation issue!!! */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r104) {
        /*
            Method dump skipped, instruction units count: 1086
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21193817wm.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
