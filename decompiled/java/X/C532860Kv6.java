package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.effectmanager.EffectManager;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Kv6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.cktemplate.resource.handlers.AssetHandler$downloadResource$1", f = "AssetHandler.kt", l = {139}, m = "invokeSuspend")
public final class C532860Kv6 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C532980KvI LL;
    public Object LLILLJJLI;
    public InterfaceC531800KtO LLILLL;
    public int LLILZ;
    public final /* synthetic */ C532980KvI LLILZIL;
    public final /* synthetic */ EffectManager LLILZLL;
    public final /* synthetic */ String LLIZ;
    public final /* synthetic */ C533030KvN LLIZLLLIL;
    public final /* synthetic */ InterfaceC531800KtO LLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C532860Kv6(C532980KvI c532980KvI, EffectManager effectManager, String str, C533030KvN c533030KvN, InterfaceC531800KtO interfaceC531800KtO, InterfaceC1364105Vn<? super C532860Kv6> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZIL = c532980KvI;
        this.LLILZLL = effectManager;
        this.LLIZ = str;
        this.LLIZLLLIL = c533030KvN;
        this.LLJ = interfaceC531800KtO;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C532860Kv6(this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object c098200Yq;
        C532980KvI c532980KvI;
        String str;
        InterfaceC531800KtO interfaceC531800KtO;
        String str2;
        C1C7U.LIZ("AssetHandler@472b.downloadResource$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILZ;
        boolean z = true;
        try {
            if (i != 0) {
                if (i == 1) {
                    interfaceC531800KtO = this.LLILLL;
                    str = (String) this.LLILLJJLI;
                    c532980KvI = this.LL;
                    C155000ia.LIZIZ(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                C155000ia.LIZIZ(obj);
                c532980KvI = this.LLILZIL;
                EffectManager effectManager = this.LLILZLL;
                str = this.LLIZ;
                C533030KvN c533030KvN = this.LLIZLLLIL;
                interfaceC531800KtO = this.LLJ;
                C2501209r8 c2501209r8LJIJJLI = C09IC.LJIJJLI(new C532870Kv7(c532980KvI, effectManager, null), c532980KvI.LJIIJ(effectManager, str, c533030KvN));
                this.LL = c532980KvI;
                this.LLILLJJLI = str;
                this.LLILLL = interfaceC531800KtO;
                this.LLILZ = 1;
                obj = C09IC.LJIIZILJ(c2501209r8LJIJJLI, this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("AssetHandler@472b.downloadResource$1");
                    return objLJFF;
                }
            }
            str2 = (String) obj;
            if (str2.length() != 0) {
                z = false;
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (!z && new C0VSJ(str2).exists()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("asset download success: ");
            sbLIZ.append(str);
            sbLIZ.append(" -> ");
            sbLIZ.append(str2);
            c532980KvI.LJFF(C2188811AlT.LIZIZ(sbLIZ));
            c532980KvI.LIZLLL(str, str2);
            interfaceC531800KtO.LJJI(str, str2);
            c098200Yq = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq);
            C532980KvI c532980KvI2 = this.LLILZIL;
            String str3 = this.LLIZ;
            InterfaceC531800KtO interfaceC531800KtO2 = this.LLJ;
            Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
            if (thM5exceptionOrNullimpl != null) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("downloadResource failed: ");
                sbLIZ2.append(str3);
                sbLIZ2.append(' ');
                sbLIZ2.append(thM5exceptionOrNullimpl.getMessage());
                c532980KvI2.LJI(C2188811AlT.LIZIZ(sbLIZ2));
                String message = thM5exceptionOrNullimpl.getMessage();
                if (message == null) {
                    message = thM5exceptionOrNullimpl.toString();
                }
                interfaceC531800KtO2.onError(str3, -5003, message);
            }
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("AssetHandler@472b.downloadResource$1");
            return unit;
        }
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("asset download returned invalid path: ");
        sbLIZ3.append(str);
        sbLIZ3.append(" -> '");
        sbLIZ3.append(str2);
        sbLIZ3.append('\'');
        c532980KvI.LJI(C2188811AlT.LIZIZ(sbLIZ3));
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append("asset download returned invalid path: ");
        sbLIZ4.append(str2);
        interfaceC531800KtO.onError(str, -5003, C2188811AlT.LIZIZ(sbLIZ4));
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("AssetHandler@472b.downloadResource$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
