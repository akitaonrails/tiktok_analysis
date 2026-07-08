package X;

import androidx.lifecycle.LifecycleOwner;
import com.bytedance.forest.Forest;
import com.bytedance.forest.model.RequestParams;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.text.a0;
import njp.a;

/* JADX INFO: renamed from: X.0XRF, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommercelive.audience.common.business.hybrid.jsb.impl.EcPlayAudioMethod$loadGeckoAudio$1", f = "EcPlayAudioMethod.kt", l = {}, m = "invokeSuspend")
public final class C0XRF extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ CompletionBlock<C0XRH> LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ LifecycleOwner LLILZLL;
    public final /* synthetic */ boolean LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0XRF(String str, String str2, CompletionBlock<C0XRH> completionBlock, String str3, LifecycleOwner lifecycleOwner, boolean z, InterfaceC1364105Vn<? super C0XRF> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = str;
        this.LLILLL = str2;
        this.LLILZ = completionBlock;
        this.LLILZIL = str3;
        this.LLILZLL = lifecycleOwner;
        this.LLIZ = z;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C0XRF c0xrf = new C0XRF(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, interfaceC1364105Vn);
        c0xrf.LL = obj;
        return c0xrf;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String strLIZLLL;
        C1C7U.LIZ("EcPlayAudioMethod@30c1.loadGeckoAudio$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        InterfaceC497601wk interfaceC497601wk = (InterfaceC497601wk) this.LL;
        Forest forestLIZ = C0T1N.LIZ();
        String str = this.LLILLJJLI;
        String strSubstring = str.substring(a0.LJJJ(str, this.LLILLL, 0, false, 6));
        RequestParams requestParams = new RequestParams(null, 1, null);
        String str2 = this.LLILZIL;
        requestParams.accessKey = C1553670qX7.LIZ();
        requestParams.channel = str2;
        requestParams.waitGeckoUpdate = true;
        requestParams.bundle = strSubstring;
        try {
            C1533910q1F c1533910q1FCreateSyncRequest = forestLIZ.createSyncRequest("", requestParams);
            if (c1533910q1FCreateSyncRequest != null) {
                C1533790q13 c1533790q13LIZIZ = c1533910q1FCreateSyncRequest.LIZIZ();
                if (c1533790q13LIZIZ != null && (strLIZLLL = c1533790q13LIZIZ.LIZLLL()) != null && strLIZLLL.length() != 0 && new C0VSJ(strLIZLLL).exists()) {
                    C1DFH c1dfh = C0PEM.LIZ;
                    C23250099c.LIZLLL(interfaceC497601wk, C2107308Nj.LIZ, null, new C0XRE(this.LLILZLL, this.LLILLJJLI, strLIZLLL, this.LLIZ, this.LLILZ, null), 2);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("EcPlayAudioMethod@30c1.loadGeckoAudio$1");
                    return unit;
                }
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        CompletionBlock<C0XRH> completionBlock = this.LLILZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("cannot find gecko audio file for ");
        sbLIZ.append(this.LLILLJJLI);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        int i = C0XRI.LLILLL;
        completionBlock.onFailure(0, strLIZIZ, C0XRG.LIZ(-22, this.LLILLJJLI));
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("EcPlayAudioMethod@30c1.loadGeckoAudio$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
