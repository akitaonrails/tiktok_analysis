package X;

import com.bytedance.pipo.stellar.base.page.StellarPageViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0ur5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.bytedance.pipo.stellar.base.page.StellarPageViewModel$startPollingIfNeeded$1", f = "StellarPageViewModel.kt", l = {240, 245}, m = "invokeSuspend")
public final class C1719810ur5 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C07ZN LLILLL;
    public final /* synthetic */ StellarPageViewModel LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ String LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1719810ur5(C07ZN c07zn, StellarPageViewModel stellarPageViewModel, String str, String str2, InterfaceC1364105Vn<? super C1719810ur5> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c07zn;
        this.LLILZ = stellarPageViewModel;
        this.LLILZIL = str;
        this.LLILZLL = str2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1719810ur5 c1719810ur5 = new C1719810ur5(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
        c1719810ur5.LLILLJJLI = obj;
        return c1719810ur5;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:6|(2:73|7)|69|48|13|(1:15)|16|(1:20)|(1:24)|25|26|(2:61|62)(26:32|(2:34|35)|37|(1:39)(1:41)|40|67|42|65|43|63|44|71|45|(3:47|59|60)|69|48|13|(0)|16|(2:18|20)|(2:22|24)|25|26|(2:28|30)|61|62)) */
    /* JADX WARN: Can't wrap try/catch for region: R(26:32|(2:34|35)|37|(1:39)(1:41)|40|67|42|65|43|63|44|71|45|(3:47|59|60)|69|48|13|(0)|16|(2:18|20)|(2:22|24)|25|26|(2:28|30)|61|62) */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00cc, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00cf, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00d2, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00d5, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00d8, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00c4  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0030 -> B:13:0x003b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:46:0x00c2 -> B:69:0x00c5). Please report as a decompilation issue!!! */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r16) {
        /*
            Method dump skipped, instruction units count: 229
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1719810ur5.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
