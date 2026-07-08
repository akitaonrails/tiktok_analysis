package X;

import com.ss.android.ugc.aweme.base.MainBusinessAbility;
import com.ss.android.ugc.aweme.ecommerce.mall.mixhome.diversion.assem.vm.EcMixMallDiversionViewModel;
import com.ss.android.ugc.aweme.ecommerce.ug.pitaya.service.IEcUgPitayaService;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0NcA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.mall.mixhome.diversion.assem.vm.EcMixMallDiversionViewModel$handleRealTimeVoucher$1", f = "EcMixMallDiversionViewModel.kt", l = {236, 236}, m = "invokeSuspend")
public final class C597560NcA extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public EcMixMallDiversionViewModel LL;
    public Object LLILLJJLI;
    public Object LLILLL;
    public IEcUgPitayaService LLILZ;
    public long LLILZIL;
    public int LLILZLL;
    public final /* synthetic */ JSONObject LLIZ;
    public final /* synthetic */ MainBusinessAbility LLIZLLLIL;
    public final /* synthetic */ EcMixMallDiversionViewModel LLJ;
    public final /* synthetic */ long LLJI;
    public final /* synthetic */ String LLJIJIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C597560NcA(JSONObject jSONObject, MainBusinessAbility mainBusinessAbility, EcMixMallDiversionViewModel ecMixMallDiversionViewModel, long j, String str, InterfaceC1364105Vn<? super C597560NcA> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLIZ = jSONObject;
        this.LLIZLLLIL = mainBusinessAbility;
        this.LLJ = ecMixMallDiversionViewModel;
        this.LLJI = j;
        this.LLJIJIL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C597560NcA(this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI, this.LLJIJIL, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x031e  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0320 A[Catch: all -> 0x035f, CancellationException -> 0x037a, TryCatch #3 {CancellationException -> 0x037a, blocks: (B:7:0x002d, B:82:0x02e1, B:84:0x02e5, B:87:0x02ed, B:93:0x02fa, B:95:0x02fe, B:97:0x0314, B:102:0x0326, B:103:0x0359, B:101:0x0320, B:78:0x02c6), top: B:119:0x001d }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x02e5 A[Catch: all -> 0x035f, CancellationException -> 0x037a, TryCatch #3 {CancellationException -> 0x037a, blocks: (B:7:0x002d, B:82:0x02e1, B:84:0x02e5, B:87:0x02ed, B:93:0x02fa, B:95:0x02fe, B:97:0x0314, B:102:0x0326, B:103:0x0359, B:101:0x0320, B:78:0x02c6), top: B:119:0x001d }] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x02ea  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x02f5  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r33) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 895
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C597560NcA.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
