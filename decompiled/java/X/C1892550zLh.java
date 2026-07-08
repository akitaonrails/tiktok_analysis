package X;

import com.ss.android.ugc.aweme.localservice.live.common.api.model.PinedProductsResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0zLh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
@C09DV(c = "com.ss.android.ugc.aweme.localservice.live.widget.LSLiveProductCardWidget$updatePinedProduct$2", f = "LSLiveProductCardWidget.kt", l = {143, 145, 169}, m = "invokeSuspend")
public final class C1892550zLh extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public PinedProductsResponse LL;
    public int LLILLJJLI;
    public final /* synthetic */ C1892560zLi LLILLL;
    public final /* synthetic */ long LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ String LLILZLL;
    public final /* synthetic */ String LLIZ;
    public final /* synthetic */ long LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1892550zLh(C1892560zLi c1892560zLi, long j, String str, String str2, String str3, long j2, InterfaceC1364105Vn<? super C1892550zLh> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c1892560zLi;
        this.LLILZ = j;
        this.LLILZIL = str;
        this.LLILZLL = str2;
        this.LLIZ = str3;
        this.LLIZLLLIL = j2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1892550zLh(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, interfaceC1364105Vn);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(39:0|2|(1:116)|(1:(2:5|(2:7|(31:9|10|49|50|(1:54)|55|139|56|125|57|127|58|(1:60)|121|61|(1:65)|129|66|131|67|(1:69)(1:70)|117|71|119|72|(1:74)|75|114|76|112|113)(2:11|12))(29:13|37|(6:39|(1:41)|42|(2:44|(2:46|47)(2:48|49))|50|(2:52|54))|55|139|56|125|57|127|58|(0)|121|61|(0)|129|66|131|67|(0)(0)|117|71|119|72|(0)|75|114|76|112|113))(1:14))(5:15|16|(5:20|123|21|133|24)|25|(2:27|(2:29|30)))|31|135|32|137|33|(2:35|36)|37|(0)|55|139|56|125|57|127|58|(0)|121|61|(0)|129|66|131|67|(0)(0)|117|71|119|72|(0)|75|114|76|112|113|(1:(0))) */
    /* JADX WARN: Can't wrap try/catch for region: R(39:0|2|116|(1:(2:5|(2:7|(31:9|10|49|50|(1:54)|55|139|56|125|57|127|58|(1:60)|121|61|(1:65)|129|66|131|67|(1:69)(1:70)|117|71|119|72|(1:74)|75|114|76|112|113)(2:11|12))(29:13|37|(6:39|(1:41)|42|(2:44|(2:46|47)(2:48|49))|50|(2:52|54))|55|139|56|125|57|127|58|(0)|121|61|(0)|129|66|131|67|(0)(0)|117|71|119|72|(0)|75|114|76|112|113))(1:14))(5:15|16|(5:20|123|21|133|24)|25|(2:27|(2:29|30)))|31|135|32|137|33|(2:35|36)|37|(0)|55|139|56|125|57|127|58|(0)|121|61|(0)|129|66|131|67|(0)(0)|117|71|119|72|(0)|75|114|76|112|113|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x01bd, code lost:
    
        r13 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x01c6, code lost:
    
        r12 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0111, code lost:
    
        r11 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0156, code lost:
    
        r11 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0158, code lost:
    
        r11 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x015a, code lost:
    
        r11 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x015c, code lost:
    
        r11 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x015e, code lost:
    
        r11 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0160, code lost:
    
        r11 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0162, code lost:
    
        r11 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0164, code lost:
    
        r11 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0166, code lost:
    
        r11 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x016c, code lost:
    
        r11 = e;
     */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00a4 A[Catch: Exception -> 0x0164, TryCatch #12 {Exception -> 0x0164, blocks: (B:50:0x00c5, B:52:0x00cb, B:54:0x00cf, B:55:0x00e1, B:37:0x009e, B:39:0x00a4, B:41:0x00aa, B:42:0x00b0, B:44:0x00b4, B:33:0x008e), top: B:137:0x008e }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0148  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r28) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 499
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1892550zLh.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
