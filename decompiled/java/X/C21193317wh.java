package X;

import com.ss.android.ugc.aweme.ecommercelive.common.biz.us.popcard.vo.UsPopupCardVO;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;
import org.json.JSONObject;
import webcast.data.oec_msg.CommerceInfo;
import webcast.data.oec_msg.ReqItem;

/* JADX INFO: renamed from: X.17wh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommercelive.common.biz.us.popcard.request.UsPopCardRefreshManager$startRefreshNew$1", f = "UsPopCardRefreshManager.kt", l = {297, 310, 321}, m = "invokeSuspend")
public final class C21193317wh extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C1563990qnl LL;
    public C598730Ne3 LLILLJJLI;
    public Object LLILLL;
    public UsPopupCardVO LLILZ;
    public Object LLILZIL;
    public Object LLILZLL;
    public Object LLIZ;
    public Function1 LLIZLLLIL;
    public UsPopupCardVO LLJ;
    public C259800zU LLJI;
    public long LLJIJIL;
    public boolean LLJILJIL;
    public int LLJILJILJ;
    public /* synthetic */ Object LLJILLL;
    public final /* synthetic */ String LLJJ;
    public final /* synthetic */ UsPopupCardVO LLJJI;
    public final /* synthetic */ Boolean LLJJIII;
    public final /* synthetic */ C1563990qnl LLJJIJI;
    public final /* synthetic */ AbstractC21198517xX<?> LLJJIJIIJIL;
    public final /* synthetic */ ReqItem LLJJIJIL;
    public final /* synthetic */ String LLJJJ;
    public final /* synthetic */ C598730Ne3 LLJJJIL;
    public final /* synthetic */ String LLJJJJ;
    public final /* synthetic */ boolean LLJJJJJIL;
    public final /* synthetic */ CommerceInfo LLJJJJLIIL;
    public final /* synthetic */ String LLJJL;
    public final /* synthetic */ int LLJJLIIIJLLLLLLLZ;
    public final /* synthetic */ String LLJL;
    public final /* synthetic */ JSONObject LLJLIL;
    public final /* synthetic */ String LLJLILLLLZIIL;
    public final /* synthetic */ Map<String, Object> LLJLL;
    public final /* synthetic */ Function1<UsPopupCardVO, Unit> LLJLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C21193317wh(String str, UsPopupCardVO usPopupCardVO, Boolean bool, C1563990qnl c1563990qnl, AbstractC21198517xX<?> abstractC21198517xX, ReqItem reqItem, String str2, C598730Ne3 c598730Ne3, String str3, boolean z, CommerceInfo commerceInfo, String str4, int i, String str5, JSONObject jSONObject, String str6, Map<String, Object> map, Function1<? super UsPopupCardVO, Unit> function1, InterfaceC1364105Vn<? super C21193317wh> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLJJ = str;
        this.LLJJI = usPopupCardVO;
        this.LLJJIII = bool;
        this.LLJJIJI = c1563990qnl;
        this.LLJJIJIIJIL = abstractC21198517xX;
        this.LLJJIJIL = reqItem;
        this.LLJJJ = str2;
        this.LLJJJIL = c598730Ne3;
        this.LLJJJJ = str3;
        this.LLJJJJJIL = z;
        this.LLJJJJLIIL = commerceInfo;
        this.LLJJL = str4;
        this.LLJJLIIIJLLLLLLLZ = i;
        this.LLJL = str5;
        this.LLJLIL = jSONObject;
        this.LLJLILLLLZIIL = str6;
        this.LLJLL = map;
        this.LLJLLIL = function1;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C21193317wh c21193317wh = new C21193317wh(this.LLJJ, this.LLJJI, this.LLJJIII, this.LLJJIJI, this.LLJJIJIIJIL, this.LLJJIJIL, this.LLJJJ, this.LLJJJIL, this.LLJJJJ, this.LLJJJJJIL, this.LLJJJJLIIL, this.LLJJL, this.LLJJLIIIJLLLLLLLZ, this.LLJL, this.LLJLIL, this.LLJLILLLLZIIL, this.LLJLL, this.LLJLLIL, interfaceC1364105Vn);
        c21193317wh.LLJILLL = obj;
        return c21193317wh;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:113:0x03d5 A[PHI: r0 r9 r12 r13
      0x03d5: PHI (r0v26 com.ss.android.ugc.aweme.ecommercelive.common.biz.us.popcard.vo.UsPopupCardVO) = 
      (r0v18 com.ss.android.ugc.aweme.ecommercelive.common.biz.us.popcard.vo.UsPopupCardVO)
      (r0v34 com.ss.android.ugc.aweme.ecommercelive.common.biz.us.popcard.vo.UsPopupCardVO)
     binds: [B:112:0x03d2, B:9:0x0053] A[DONT_GENERATE, DONT_INLINE]
      0x03d5: PHI (r9v3 X.00zU) = (r9v0 X.00zU), (r9v5 X.00zU) binds: [B:112:0x03d2, B:9:0x0053] A[DONT_GENERATE, DONT_INLINE]
      0x03d5: PHI (r12v3 X.0qnl) = (r12v0 X.0qnl), (r12v4 X.0qnl) binds: [B:112:0x03d2, B:9:0x0053] A[DONT_GENERATE, DONT_INLINE]
      0x03d5: PHI (r13v3 java.lang.String) = (r13v0 java.lang.String), (r13v4 java.lang.String) binds: [B:112:0x03d2, B:9:0x0053] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x02d8  */
    /* JADX WARN: Type inference failed for: r2v1, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v11, types: [T, java.lang.Object] */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r82) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 1470
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21193317wh.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
