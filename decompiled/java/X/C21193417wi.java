package X;

import com.ss.android.ugc.aweme.ecommercelive.common.infra.popcard.vo.PopupCardVO;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;
import org.json.JSONObject;
import webcast.data.oec_msg.ReqItem;

/* JADX INFO: renamed from: X.17wi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommercelive.common.infra.refresh.PopCardRefreshManager$startRefreshNew$1", f = "PopCardRefreshManager.kt", l = {266, 274, 280}, m = "invokeSuspend")
public final class C21193417wi extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public long LL;
    public C598800NeA LLILLJJLI;
    public Object LLILLL;
    public PopupCardVO LLILZ;
    public Object LLILZIL;
    public Object LLILZLL;
    public Function1 LLIZ;
    public C259800zU LLIZLLLIL;
    public int LLJ;
    public final /* synthetic */ AbstractC21198617xY<?> LLJI;
    public final /* synthetic */ ReqItem LLJIJIL;
    public final /* synthetic */ C598800NeA LLJILJIL;
    public final /* synthetic */ String LLJILJILJ;
    public final /* synthetic */ String LLJILLL;
    public final /* synthetic */ boolean LLJJ;
    public final /* synthetic */ PopupCardVO LLJJI;
    public final /* synthetic */ String LLJJIII;
    public final /* synthetic */ int LLJJIJI;
    public final /* synthetic */ JSONObject LLJJIJIIJIL;
    public final /* synthetic */ String LLJJIJIL;
    public final /* synthetic */ Function1<PopupCardVO, Unit> LLJJJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C21193417wi(AbstractC21198617xY<?> abstractC21198617xY, ReqItem reqItem, C598800NeA c598800NeA, String str, String str2, boolean z, PopupCardVO popupCardVO, String str3, int i, JSONObject jSONObject, String str4, Function1<? super PopupCardVO, Unit> function1, InterfaceC1364105Vn<? super C21193417wi> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLJI = abstractC21198617xY;
        this.LLJIJIL = reqItem;
        this.LLJILJIL = c598800NeA;
        this.LLJILJILJ = str;
        this.LLJILLL = str2;
        this.LLJJ = z;
        this.LLJJI = popupCardVO;
        this.LLJJIII = str3;
        this.LLJJIJI = i;
        this.LLJJIJIIJIL = jSONObject;
        this.LLJJIJIL = str4;
        this.LLJJJ = function1;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C21193417wi(this.LLJI, this.LLJIJIL, this.LLJILJIL, this.LLJILJILJ, this.LLJILLL, this.LLJJ, this.LLJJI, this.LLJJIII, this.LLJJIJI, this.LLJJIJIIJIL, this.LLJJIJIL, this.LLJJJ, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009f  */
    /* JADX WARN: Type inference failed for: r5v15, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v7, types: [T, java.lang.Object] */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r105) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 886
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21193417wi.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
