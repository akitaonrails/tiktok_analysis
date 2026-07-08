package X;

import com.bytedance.sdk.account.api.GetRegionResponse;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0XOc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
@C09DV(c = "com.bytedance.sdk.account.region.TTPManager$getRegionFromOneDomain$1", f = "TTPManager.kt", l = {489}, m = "invokeSuspend")
public final class C847920XOc extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ boolean LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ int LLILZLL;
    public final /* synthetic */ String LLIZ;
    public final /* synthetic */ CountDownLatch LLIZLLLIL;
    public final /* synthetic */ List<GetRegionResponse.Data> LLJ;
    public final /* synthetic */ int LLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C847920XOc(String str, boolean z, String str2, int i, String str3, CountDownLatch countDownLatch, List<GetRegionResponse.Data> list, int i2, InterfaceC1364105Vn<? super C847920XOc> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = str;
        this.LLILZ = z;
        this.LLILZIL = str2;
        this.LLILZLL = i;
        this.LLIZ = str3;
        this.LLIZLLLIL = countDownLatch;
        this.LLJ = list;
        this.LLJI = i2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C847920XOc c847920XOc = new C847920XOc(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI, interfaceC1364105Vn);
        c847920XOc.LLILLJJLI = obj;
        return c847920XOc;
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x0119  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            Method dump skipped, instruction units count: 305
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C847920XOc.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
