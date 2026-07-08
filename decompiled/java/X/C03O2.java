package X;

import android.content.Context;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoData;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.CreateOrderRequest;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.Summary;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitAssemViewModel;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.03O2, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitAssemViewModel$createOrder$1$6", f = "OrderSubmitAssemViewModel.kt", l = {7164, 7153}, m = "invokeSuspend")
public final class C03O2 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public BillInfoData LL;
    public Object LLILLJJLI;
    public CreateOrderRequest LLILLL;
    public C03WX LLILZ;
    public CreateOrderRequest LLILZIL;
    public long LLILZLL;
    public int LLIZ;
    public /* synthetic */ Object LLIZLLLIL;
    public final /* synthetic */ OrderSubmitAssemViewModel LLJ;
    public final /* synthetic */ C03JV LLJI;
    public final /* synthetic */ Boolean LLJIJIL;
    public final /* synthetic */ Integer LLJILJIL;
    public final /* synthetic */ String LLJILJILJ;
    public final /* synthetic */ Context LLJILLL;
    public final /* synthetic */ boolean LLJJ;
    public final /* synthetic */ String LLJJI;
    public final /* synthetic */ String LLJJIII;
    public final /* synthetic */ Pair<Boolean, Boolean> LLJJIJI;
    public final /* synthetic */ String LLJJIJIIJIL;
    public final /* synthetic */ String LLJJIJIL;
    public final /* synthetic */ Summary LLJJJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C03O2(OrderSubmitAssemViewModel orderSubmitAssemViewModel, C03JV c03jv, Boolean bool, Integer num, String str, Context context, boolean z, String str2, String str3, Pair<Boolean, Boolean> pair, String str4, String str5, Summary summary, InterfaceC1364105Vn<? super C03O2> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLJ = orderSubmitAssemViewModel;
        this.LLJI = c03jv;
        this.LLJIJIL = bool;
        this.LLJILJIL = num;
        this.LLJILJILJ = str;
        this.LLJILLL = context;
        this.LLJJ = z;
        this.LLJJI = str2;
        this.LLJJIII = str3;
        this.LLJJIJI = pair;
        this.LLJJIJIIJIL = str4;
        this.LLJJIJIL = str5;
        this.LLJJJ = summary;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C03O2 c03o2 = new C03O2(this.LLJ, this.LLJI, this.LLJIJIL, this.LLJILJIL, this.LLJILJILJ, this.LLJILLL, this.LLJJ, this.LLJJI, this.LLJJIII, this.LLJJIJI, this.LLJJIJIIJIL, this.LLJJIJIL, this.LLJJJ, interfaceC1364105Vn);
        c03o2.LLIZLLLIL = obj;
        return c03o2;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(18:0|2|(1:302)|(1:(1:(28:6|7|33|298|37|303|38|(1:40)(1:52)|41|(1:51)(1:45)|46|(2:48|(1:50)(1:53))|(1:58)(1:57)|(1:67)(1:66)|(1:70)(1:75)|76|79|(1:81)|82|83|(5:86|(1:88)|89|(1:93)|94)|95|(1:97)|294|98|(57:100|(1:105)(1:104)|(1:109)|110|(1:112)|113|(1:160)(1:117)|118|(1:159)(1:122)|123|(1:125)(1:158)|126|(1:157)(1:130)|131|(1:135)|136|(1:156)(1:144)|145|(1:155)(1:153)|154|307|161|300|162|(1:180)(1:166)|167|(1:179)(1:173)|174|(1:181)(1:178)|(1:184)(1:187)|188|(1:190)(1:204)|191|(1:203)(1:197)|198|(1:205)(1:202)|(1:214)(1:213)|(1:217)(1:222)|223|(1:275)(1:227)|228|(1:274)(1:232)|233|(1:273)(1:237)|238|(1:272)(1:242)|243|(1:271)(1:247)|248|(1:270)(1:252)|253|(2:255|(1:257)(1:269))|258|(1:260)(1:268)|261|(1:267)(1:265)|266)|292|293)(2:8|9))(3:10|305|11))(3:12|13|(8:15|(1:17)|18|(1:20)|21|(1:23)(1:25)|24|(2:27|28))(10:36|298|37|303|38|(0)(0)|41|(5:43|51|46|(0)|(3:55|58|(3:60|67|(14:69|71|70|76|79|(0)|82|83|(4:86|(0)|89|(3:91|93|94)(0))|95|(0)|294|98|(0))(0))(0))(0))(0)|292|293))|309|29|(2:31|32)|33|298|37|303|38|(0)(0)|41|(0)(0)|292|293|(2:(0)|(1:297))) */
    /* JADX WARN: Can't wrap try/catch for region: R(18:0|2|302|(1:(1:(28:6|7|33|298|37|303|38|(1:40)(1:52)|41|(1:51)(1:45)|46|(2:48|(1:50)(1:53))|(1:58)(1:57)|(1:67)(1:66)|(1:70)(1:75)|76|79|(1:81)|82|83|(5:86|(1:88)|89|(1:93)|94)|95|(1:97)|294|98|(57:100|(1:105)(1:104)|(1:109)|110|(1:112)|113|(1:160)(1:117)|118|(1:159)(1:122)|123|(1:125)(1:158)|126|(1:157)(1:130)|131|(1:135)|136|(1:156)(1:144)|145|(1:155)(1:153)|154|307|161|300|162|(1:180)(1:166)|167|(1:179)(1:173)|174|(1:181)(1:178)|(1:184)(1:187)|188|(1:190)(1:204)|191|(1:203)(1:197)|198|(1:205)(1:202)|(1:214)(1:213)|(1:217)(1:222)|223|(1:275)(1:227)|228|(1:274)(1:232)|233|(1:273)(1:237)|238|(1:272)(1:242)|243|(1:271)(1:247)|248|(1:270)(1:252)|253|(2:255|(1:257)(1:269))|258|(1:260)(1:268)|261|(1:267)(1:265)|266)|292|293)(2:8|9))(3:10|305|11))(3:12|13|(8:15|(1:17)|18|(1:20)|21|(1:23)(1:25)|24|(2:27|28))(10:36|298|37|303|38|(0)(0)|41|(5:43|51|46|(0)|(3:55|58|(3:60|67|(14:69|71|70|76|79|(0)|82|83|(4:86|(0)|89|(3:91|93|94)(0))|95|(0)|294|98|(0))(0))(0))(0))(0)|292|293))|309|29|(2:31|32)|33|298|37|303|38|(0)(0)|41|(0)(0)|292|293|(2:(0)|(1:297))) */
    /* JADX WARN: Code restructure failed: missing block: B:284:0x04da, code lost:
    
        r8 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00df, code lost:
    
        r8 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x016d, code lost:
    
        r10 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x016e, code lost:
    
        com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r10);
        X.C189200o6.m2constructorimpl(new X.C098200Yq(r10));
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0208 A[Catch: all -> 0x04d0, TryCatch #0 {all -> 0x04d0, blocks: (B:98:0x0202, B:100:0x0208, B:102:0x0210, B:104:0x0214, B:107:0x021d, B:109:0x0221, B:110:0x0225, B:113:0x023c, B:115:0x0264, B:117:0x0268, B:118:0x026c, B:120:0x0276, B:122:0x027a, B:123:0x027e, B:125:0x028d, B:126:0x0291, B:128:0x029b, B:130:0x029f, B:131:0x02a3, B:133:0x02a9, B:135:0x02ad, B:136:0x02b1, B:138:0x02cb, B:140:0x02cf, B:142:0x02d3, B:144:0x02d7, B:145:0x02db, B:147:0x02e1, B:149:0x02e5, B:151:0x02e9, B:153:0x02ed, B:154:0x02f1), top: B:294:0x0202 }] */
    /* JADX WARN: Removed duplicated region for block: B:291:0x04f0  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00f8 A[Catch: all -> 0x016d, TryCatch #5 {all -> 0x016d, blocks: (B:38:0x00e9, B:40:0x00f8, B:41:0x00fe, B:43:0x0106, B:45:0x010a, B:46:0x010c, B:48:0x0110, B:50:0x0114, B:55:0x011e, B:57:0x0124, B:60:0x012a, B:62:0x0130, B:64:0x0134, B:66:0x0138, B:71:0x0144, B:73:0x014a, B:75:0x014e, B:76:0x0150), top: B:303:0x00e9, outer: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0106 A[Catch: all -> 0x016d, TryCatch #5 {all -> 0x016d, blocks: (B:38:0x00e9, B:40:0x00f8, B:41:0x00fe, B:43:0x0106, B:45:0x010a, B:46:0x010c, B:48:0x0110, B:50:0x0114, B:55:0x011e, B:57:0x0124, B:60:0x012a, B:62:0x0130, B:64:0x0134, B:66:0x0138, B:71:0x0144, B:73:0x014a, B:75:0x014e, B:76:0x0150), top: B:303:0x00e9, outer: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0110 A[Catch: all -> 0x016d, TryCatch #5 {all -> 0x016d, blocks: (B:38:0x00e9, B:40:0x00f8, B:41:0x00fe, B:43:0x0106, B:45:0x010a, B:46:0x010c, B:48:0x0110, B:50:0x0114, B:55:0x011e, B:57:0x0124, B:60:0x012a, B:62:0x0130, B:64:0x0134, B:66:0x0138, B:71:0x0144, B:73:0x014a, B:75:0x014e, B:76:0x0150), top: B:303:0x00e9, outer: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x018a A[Catch: all -> 0x04da, TryCatch #2 {all -> 0x04da, blocks: (B:37:0x00e3, B:79:0x0179, B:81:0x018a, B:82:0x019f, B:86:0x01b2, B:89:0x01bc, B:91:0x01c0, B:94:0x01ce, B:95:0x01d4, B:97:0x01da, B:78:0x016e, B:38:0x00e9, B:40:0x00f8, B:41:0x00fe, B:43:0x0106, B:45:0x010a, B:46:0x010c, B:48:0x0110, B:50:0x0114, B:55:0x011e, B:57:0x0124, B:60:0x012a, B:62:0x0130, B:64:0x0134, B:66:0x0138, B:71:0x0144, B:73:0x014a, B:75:0x014e, B:76:0x0150), top: B:298:0x00e3, inners: #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01da A[Catch: all -> 0x04da, TRY_LEAVE, TryCatch #2 {all -> 0x04da, blocks: (B:37:0x00e3, B:79:0x0179, B:81:0x018a, B:82:0x019f, B:86:0x01b2, B:89:0x01bc, B:91:0x01c0, B:94:0x01ce, B:95:0x01d4, B:97:0x01da, B:78:0x016e, B:38:0x00e9, B:40:0x00f8, B:41:0x00fe, B:43:0x0106, B:45:0x010a, B:46:0x010c, B:48:0x0110, B:50:0x0114, B:55:0x011e, B:57:0x0124, B:60:0x012a, B:62:0x0130, B:64:0x0134, B:66:0x0138, B:71:0x0144, B:73:0x014a, B:75:0x014e, B:76:0x0150), top: B:298:0x00e3, inners: #5 }] */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r69) {
        /*
            Method dump skipped, instruction units count: 1280
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C03O2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
