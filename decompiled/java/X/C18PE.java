package X;

import com.ss.android.ugc.aweme.ecommerce.ug.vsa.repository.bean.VSACardsRequest;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.18PE, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.ug.vsa.manager.EcUgVSAManager$preloadProductData$1$1", f = "EcUgVSAManager.kt", l = {243}, m = "invokeSuspend")
public final class C18PE extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ List<VSACardsRequest.VSAInfoInfo> LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ List<Aweme> LLILZIL;
    public final /* synthetic */ String LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18PE(String str, String str2, List list, List list2, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = list;
        this.LLILZ = str;
        this.LLILZIL = list2;
        this.LLILZLL = str2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        List<VSACardsRequest.VSAInfoInfo> list = this.LLILLL;
        C18PE c18pe = new C18PE(this.LLILZ, this.LLILZLL, list, this.LLILZIL, interfaceC1364105Vn);
        c18pe.LLILLJJLI = obj;
        return c18pe;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x029c  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0142  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r25) {
        /*
            Method dump skipped, instruction units count: 767
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C18PE.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
